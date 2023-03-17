/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2023
 *
 *   Licensed under the Business Source License, Version 1.1 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   https://github.com/FgForrest/evitaDB/blob/main/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.externalApi.rest.api.system.resolver.endpoint;

import io.evitadb.api.CatalogContract;
import io.evitadb.externalApi.rest.api.system.dto.CreateCatalogRequestDto;
import io.evitadb.externalApi.rest.api.system.resolver.serializer.CatalogJsonSerializer;
import io.evitadb.externalApi.rest.io.RestHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * Create and returns new evitaDB catalog.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
public class CreateCatalogHandler extends RestHandler<SystemRestHandlingContext> {

	@Nonnull
	private final CatalogJsonSerializer catalogJsonSerializer;

	public CreateCatalogHandler(@Nonnull SystemRestHandlingContext restApiHandlingContext) {
		super(restApiHandlingContext);
		this.catalogJsonSerializer = new CatalogJsonSerializer(restApiHandlingContext);
	}

	@Nonnull
	@Override
	public String getSupportedHttpMethod() {
		return Methods.POST_STRING;
	}

	@Override
	public boolean acceptsRequestBodies() {
		return true;
	}

	@Override
	public boolean returnsResponseBodies() {
		return true;
	}

	@Nonnull
	@Override
	protected Optional<Object> doHandleRequest(@Nonnull HttpServerExchange exchange) {
		final CreateCatalogRequestDto requestBody = parseRequestBody(exchange, CreateCatalogRequestDto.class);

		restApiHandlingContext.getEvita().defineCatalog(requestBody.name());
		final CatalogContract newCatalog = restApiHandlingContext.getEvita().getCatalogInstanceOrThrowException(requestBody.name());
		// we don't have a way to use benefits of warming up state in REST
		newCatalog.goLive();

		return Optional.of(newCatalog).map(catalogJsonSerializer::serialize);
	}
}