/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2023-2024
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

package io.evitadb.store.offsetIndex.io;

import io.evitadb.api.configuration.StorageOptions;
import io.evitadb.store.exception.InvalidStoragePathException;
import io.evitadb.store.exception.StorageException;
import io.evitadb.store.kryo.ObservableOutput;
import io.evitadb.store.kryo.ObservableOutputKeeper;
import io.evitadb.store.offsetIndex.exception.SyncFailedException;
import io.evitadb.utils.Assert;
import lombok.Getter;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import static io.evitadb.utils.Assert.isPremiseValid;
import static io.evitadb.utils.Assert.isTrue;

/**
 * Write handle protects access to the {@link ObservableOutput} by {@link ReentrantLock} allowing only single
 * client to use the resource in parallel. Waiting may time out after {@link #lockTimeoutSeconds}. Some methods allow
 * to execute premise check to verify whether the parent is still in operating mode, others ensure that the changes
 * are safely persisted on disk when the method finishes.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2021
 */
public class WriteOnlyFileHandle implements WriteOnlyHandle {

	/**
	 * A factory function that creates an observable output stream for a file using the provided path and storage options.
	 */
	static final BiFunction<Path, StorageOptions, ObservableOutput<FileOutputStream>> OUTPUT_FACTORY = (theFilePath, options) -> {
		try {
			final File theFile = theFilePath.toFile();
			final FileOutputStream targetOs = new FileOutputStream(theFile, true);
			final ObservableOutput<FileOutputStream> output = new ObservableOutput<>(
				targetOs,
				options.outputBufferSize(),
				theFile.length()
			);
			if (options.computeCRC32C()) {
				output.computeCRC32();
			}
			return output;
		} catch (FileNotFoundException ex) {
			throw new StorageException("Target file " + theFilePath + " cannot be opened!", ex);
		}
	};

	/**
	 * The maximum time (in seconds) that a thread may wait to acquire the lock on the file handle.
	 * If a thread cannot acquire the lock within this time, a StorageException is thrown.
	 */
	private final long lockTimeoutSeconds;
	/**
	 * The path to the target file that this handle is associated with.
	 * This handle provides write-only access to the file at this path.
	 */
	@Getter private final Path targetFile;
	/**
	 * The variable `observableOutputKeeper` is an instance of the class `ObservableOutputKeeper`. It is used to keep
	 * references to `ObservableOutput` instances that internally maintain large buffers for serialization. The need for
	 * these buffers is determined by the number of open read-write sessions to a catalog. If there is at least one open
	 * read-write session, the `ObservableOutput` instances need to be kept. Otherwise, if there are only read sessions,
	 * the `ObservableOutput` instances can be disposed of.
	 *
	 * The `ObservableOutputKeeper` class provides methods to get or create an `ObservableOutput` for a specific target
	 * file, free an `ObservableOutput` for a target file, prepare the holder for `ObservableOutput`, check if
	 * the cached outputs are prepared, and free all cached `ObservableOutput` instances.
	 */
	private final ObservableOutputKeeper observableOutputKeeper;
	/**
	 * This variable represents a lock used for protecting access to a handle in the {@link WriteOnlyFileHandle} class.
	 * It is an instance of the {@link ReentrantLock} class, which is a reentrant mutual exclusion lock.
	 *
	 * The handleLock is used to synchronize access to the {@link ObservableOutput} object in the WriteOnlyHandle interface.
	 * The methods in the WriteOnlyHandle interface that require access to the {@link ObservableOutput} object are wrapped
	 * in a synchronized block with the handleLock as the monitor object. This ensures that only one thread can access
	 * the {@link ObservableOutput} object at a time, preventing concurrent modification and ensuring thread safety.
	 *
	 * @see WriteOnlyHandle
	 * @see StorageOptions
	 */
	private final ReentrantLock handleLock = new ReentrantLock();

	/**
	 * Retrieves the target file where data will be written.
	 *
	 * @param filePath The path to the target file.
	 * @return The target file object.
	 * @throws InvalidStoragePathException if the storage path parent doesn't represent a directory.
	 * @throws StorageException            if there is an error creating the file or if it cannot be accessed.
	 */
	@Nonnull
	static File getTargetFile(@Nonnull Path filePath) {
		final File targetFileRef = filePath.toFile();
		if (!targetFileRef.exists()) {
			final File directory = targetFileRef.getParentFile();
			// ensure directory exits
			if (!directory.exists()) {
				//noinspection ResultOfMethodCallIgnored
				directory.mkdirs();
			}
			isTrue(
				directory.isDirectory(),
				() -> new InvalidStoragePathException("Storage path doesn't represent a directory: " + directory)
			);

			// create empty file if no file exists
			if (!targetFileRef.exists()) {
				final boolean fileCreated;
				try {
					fileCreated = targetFileRef.createNewFile();
				} catch (IOException e) {
					throw new StorageException("Cannot create file " + targetFileRef + "!", e);
				}
				isPremiseValid(
					fileCreated,
					() -> new StorageException("File `" + filePath + "` doesn't exist and was not created!")
				);
			}
			return targetFileRef;
		} else {
			return targetFileRef;
		}
	}

	/**
	 * Synchronizes the data stored in the provided observable output stream to the disk.
	 *
	 * @param os The observable output stream to synchronize.
	 * @throws SyncFailedException if the synchronization operation failed.
	 */
	private static void doSync(@Nonnull ObservableOutput<FileOutputStream> os) {
		// execute fsync so that data are really stored to the disk
		try {
			os.flush();
			os.getOutputStream().getFD().sync();
		} catch (IOException e) {
			throw new SyncFailedException(e);
		}
	}

	public WriteOnlyFileHandle(@Nonnull Path targetFile, @Nonnull ObservableOutputKeeper observableOutputKeeper) {
		this.lockTimeoutSeconds = observableOutputKeeper.getLockTimeoutSeconds();
		this.targetFile = targetFile;
		Assert.isPremiseValid(getTargetFile(targetFile) != null, "Target file should be created or exception thrown!");
		this.observableOutputKeeper = observableOutputKeeper;
	}

	@Override
	public <T> T checkAndExecute(@Nonnull String operation, @Nonnull Runnable premise, @Nonnull Function<ObservableOutput<?>, T> logic) {
		try {
			if (handleLock.tryLock(lockTimeoutSeconds, TimeUnit.SECONDS)) {
				try {
					premise.run();
					return observableOutputKeeper.executeWithOutput(
						targetFile,
						OUTPUT_FACTORY,
						logic::apply
					);
				} finally {
					handleLock.unlock();
				}
			}
			throw new StorageException(operation + " within timeout!");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new StorageException(operation + " due to interrupt!");
		}
	}

	@Override
	public void checkAndExecuteAndSync(@Nonnull String operation, @Nonnull Runnable premise, @Nonnull Consumer<ObservableOutput<?>> logic) {
		try {
			if (handleLock.tryLock(lockTimeoutSeconds, TimeUnit.SECONDS)) {
				try {
					premise.run();
					observableOutputKeeper.executeWithOutput(
						targetFile,
						OUTPUT_FACTORY,
						observableOutput -> {
							logic.accept(observableOutput);
							doSync(observableOutput);
						}
					);
					return;
				} finally {
					handleLock.unlock();
				}
			}
			throw new StorageException(operation + " within timeout!");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new StorageException(operation + " due to interrupt!");
		}
	}

	@Override
	public <S, T> T checkAndExecuteAndSync(@Nonnull String operation, @Nonnull Runnable premise, @Nonnull Function<ObservableOutput<?>, S> logic, @Nonnull BiFunction<ObservableOutput<?>, S, T> postExecutionLogic) {
		try {
			if (handleLock.tryLock(lockTimeoutSeconds, TimeUnit.SECONDS)) {
				try {
					premise.run();
					return observableOutputKeeper.executeWithOutput(
						targetFile,
						OUTPUT_FACTORY,
						observableOutput -> {
							final S result = logic.apply(observableOutput);
							doSync(observableOutput);
							return postExecutionLogic.apply(observableOutput, result);
						}
					);
				} finally {
					handleLock.unlock();
				}
			}
			throw new StorageException(operation + " within timeout!");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new StorageException(operation + " due to interrupt!");
		}
	}

	@Override
	public long getLastWrittenPosition() {
		return targetFile.toFile().length();
	}

	@Nonnull
	@Override
	public ReadOnlyHandle toReadOnlyHandle() {
		return new ReadOnlyFileHandle(targetFile, observableOutputKeeper.getOptions().computeCRC32C());
	}

	@Override
	public void close() {
		this.observableOutputKeeper.close(this.targetFile);
	}

	@Override
	public String toString() {
		return "write handle: " + targetFile;
	}

}
