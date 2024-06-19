/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2024
 *
 *   Licensed under the Business Source License, Version 1.1 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   https://github.com/FgForrest/evitaDB/blob/master/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.core.transaction.stage;

import io.evitadb.api.exception.TransactionException;
import io.evitadb.core.Catalog;
import io.evitadb.utils.Assert;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiPredicate;

/**
 * Abstract class representing a transaction stage in a catalog processing pipeline.
 * It is a {@link Flow} processor that receives a specific type of transaction task, processes it, and produces
 * a different type of transaction task.
 *
 * @param <T> The type of the input transaction task.
 * @param <F> The type of the output transaction task.
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2024
 */
@Slf4j
public sealed abstract class AbstractTransactionStage<T extends TransactionTask, F extends TransactionTask>
	extends SubmissionPublisher<F>
	implements Flow.Processor<T, F>
	permits ConflictResolutionTransactionStage, WalAppendingTransactionStage, TrunkIncorporationTransactionStage {

	/**
	 * Represents reference to the currently active catalog version in the "live view" of the evitaDB engine.
	 */
	protected final AtomicReference<Catalog> liveCatalog;
	/**
	 * The subscription variable represents a subscription to a reactive stream.
	 * It is used to manage the flow of data from the publisher to the subscriber.
	 *
	 * @see Flow.Subscription
	 */
	private Flow.Subscription subscription;
	/**
	 * Represents the "lag" of the next stage observed during {@link SubmissionPublisher#offer(Object, BiPredicate)}.
	 *
	 * @see SubmissionPublisher#offer(Object, BiPredicate)
	 */
	@Getter private volatile int stageHandoff = 0;
	/**
	 * Contains TRUE if the processor has been completed and does not accept any more data.
	 */
	@Getter private boolean completed;
	/**
	 * Handler that is called on any exception.
	 */
	@Nonnull private final Runnable onException;

	protected AbstractTransactionStage(@Nonnull Executor executor, int maxBufferCapacity, @Nonnull Catalog catalog, @Nonnull Runnable onException) {
		super(executor, maxBufferCapacity);
		this.liveCatalog = new AtomicReference<>(catalog);
		this.onException = onException;
	}

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public final void onNext(T task) {
		try {
			Assert.isPremiseValid(
				Objects.equals(this.liveCatalog.get().getName(), task.catalogName()),
				"Catalog name mismatch!"
			);
			// delegate handling logic to the concrete implementation
			handleNext(task);
		} catch (Throwable ex) {
			handleException(task, ex);
		}
		this.subscription.request(1);
	}

	/**
	 * Handles the exception thrown during the processing of the transaction task.
	 * @param task The task that caused the exception.
	 * @param ex The exception that was thrown.
	 */
	protected void handleException(@Nonnull T task, @Nonnull Throwable ex) {
		log.error("Error while processing " + getName() + " task for catalog `" + task.catalogName() + "`!", ex);
		final CompletableFuture<Long> future = task.future();
		if (future != null) {
			future.completeExceptionally(ex);
		}
		onException.run();
	}

	@Override
	public final void onError(Throwable throwable) {
		log.error(
			"Fatal error! Error propagated outside catalog `" + this.liveCatalog.get().getName() + "` transaction stage! " +
				"This is unexpected and effectively stops transaction processing!",
			throwable
		);
	}

	@Override
	public final void onComplete() {
		log.debug("Transaction stage completed for catalog `" + this.liveCatalog.get().getName() + "`!");
		this.completed = true;
	}

	/**
	 * Informs transactional pipeline jobs that the catalog version has advanced due to external reasons (such as
	 * catalog renaming).
	 */
	public void advanceVersion(long catalogVersion) {
		// do nothing
	}

	/**
	 * Method is called when new catalog version is propagated to the "live view" in evitaDB engine.
	 *
	 * @param catalog The new catalog version.
	 */
	public void updateCatalogReference(@Nonnull Catalog catalog) {
		this.liveCatalog.set(catalog);
	}

	/**
	 * Retrieves the name of the transaction stage. The name is used in logs and exceptions.
	 *
	 * @return The name of the transaction stage as a String.
	 */
	protected abstract String getName();

	/**
	 * Handles the next transaction task. It converts the source task to the target task and pushes it to the next
	 * transaction stage. During the transformation all necessary actions are performed.
	 *
	 * @param task The task to be handled.
	 */
	protected abstract void handleNext(@Nonnull T task);

	/**
	 * Pushes a target task to the next transaction stage.
	 * If the target task's future is null, it completes the future with a new catalog version.
	 *
	 * @param sourceTask The source task to be pushed.
	 * @param targetTask The target task to be created.
	 */
	protected void push(@Nonnull T sourceTask, @Nonnull F targetTask) {
		this.stageHandoff = offer(
			targetTask,
			(subscriber, theTask) -> {
				final TransactionException exception = new TransactionException(
					"Transaction task future is null! " +
						"Cannot complete the task " + getName() + " - some committed data will be lost, " +
						"and no one will be informed about it!"
				);
				handleException(sourceTask, exception);
				return false;
			}
		);

		if (sourceTask.future() != null && targetTask.future() == null) {
			sourceTask.future().complete(targetTask.catalogVersion());
		}
	}

	/**
	 * Terminates the task and avoid propagation to next stage.
	 *
	 * @param sourceTask The source task to be pushed.
	 * @param targetTask The target task to be created.
	 */
	protected void terminate(@Nonnull T sourceTask, @Nonnull F targetTask) {
		if (sourceTask.future() != null && targetTask.future() == null) {
			sourceTask.future().complete(targetTask.catalogVersion());
		}
	}

}
