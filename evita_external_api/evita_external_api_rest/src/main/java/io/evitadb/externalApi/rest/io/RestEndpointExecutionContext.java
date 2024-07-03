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

package io.evitadb.externalApi.rest.io;

import com.linecorp.armeria.common.HttpRequest;
import io.evitadb.api.EvitaSessionContract;
import io.evitadb.externalApi.http.EndpointExecutionContext;
import io.evitadb.externalApi.rest.exception.RestInternalError;
import io.evitadb.externalApi.rest.metric.event.request.ExecutedEvent;
import io.evitadb.externalApi.rest.metric.event.request.ExecutedEvent.ResponseStatus;
import io.evitadb.utils.Assert;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Implementation of {@link EndpointExecutionContext} for REST API.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
public class RestEndpointExecutionContext extends EndpointExecutionContext {

	@Nonnull private final ExecutedEvent requestExecutedEvent;

	@Nullable private EvitaSessionContract session;

	@Nullable private String requestBodyContentType;
	@Nullable private String preferredResponseContentType;

	public RestEndpointExecutionContext(@Nonnull HttpRequest httpRequest,
	                                    @Nonnull ExecutedEvent requestExecutedEvent) {
		super(httpRequest);
		this.requestExecutedEvent = requestExecutedEvent;
	}

	@Nonnull
	public ExecutedEvent requestExecutedEvent() {
		return requestExecutedEvent;
	}

	@Nonnull
	public EvitaSessionContract session() {
		Assert.isPremiseValid(
			session != null,
			() -> new RestInternalError("Session is not available for this exchange.")
		);
		Assert.isPremiseValid(
			this.session.isActive(),
			() -> new RestInternalError("Session has been already closed. No one should access the session!")
		);
		return session;
	}

	/**
	 * Sets a session for this exchange. Can be set only once to avoid overwriting errors.
	 */
	public void provideSession(@Nonnull EvitaSessionContract session) {
		Assert.isPremiseValid(
			this.session == null,
			() -> new RestInternalError("Session cannot overwritten when already set.")
		);
		this.session = session;
	}

	/**
	 * Closes the current session (and transaction) if it is open.
	 */
	public void closeSessionIfOpen() {
		if (session != null) {
			session.close();
		}
	}

	@Nullable
	@Override
	public String requestBodyContentType() {
		return requestBodyContentType;
	}

	@Override
	public void provideRequestBodyContentType(@Nonnull String contentType) {
		Assert.isPremiseValid(
			this.requestBodyContentType == null,
			() -> new RestInternalError("Request body content type already provided.")
		);
		requestBodyContentType = contentType;
	}

	@Override
	public void providePreferredResponseContentType(@Nonnull String contentType) {
		Assert.isPremiseValid(
			preferredResponseContentType == null,
			() -> new RestInternalError("Preferred response content type already provided.")
		);
		preferredResponseContentType = contentType;
	}

	@Nullable
	@Override
	public String preferredResponseContentType() {
		return preferredResponseContentType;
	}

	@Override
	public void notifyError(@Nonnull Exception e) {
		requestExecutedEvent.provideResponseStatus(ResponseStatus.ERROR);
	}

	@Override
	public void close() {
		// the session may not be properly closed in case of exception during request handling
		closeSessionIfOpen();

		requestExecutedEvent.finish().commit();
	}
}
