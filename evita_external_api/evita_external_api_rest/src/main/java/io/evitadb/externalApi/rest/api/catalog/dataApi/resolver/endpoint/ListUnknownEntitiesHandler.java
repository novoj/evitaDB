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

package io.evitadb.externalApi.rest.api.catalog.dataApi.resolver.endpoint;

import io.evitadb.api.query.Query;
import io.evitadb.api.requestResponse.data.EntityClassifier;
import io.evitadb.externalApi.rest.api.catalog.dataApi.resolver.constraint.FilterByConstraintFromRequestQueryBuilder;
import io.evitadb.externalApi.rest.api.catalog.dataApi.resolver.constraint.RequireConstraintFromRequestQueryBuilder;
import io.evitadb.externalApi.rest.api.catalog.dataApi.resolver.serializer.EntityJsonSerializer;
import io.evitadb.externalApi.rest.api.catalog.resolver.endpoint.CatalogRestHandlingContext;
import io.evitadb.externalApi.rest.io.RestHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Handles requests for multiple unknown entities identified by their URLs or codes.
 *
 * @author Martin Veska (veska@fg.cz), FG Forrest a.s. (c) 2022
 */
@Slf4j
public class ListUnknownEntitiesHandler extends RestHandler<CatalogRestHandlingContext> {

	@Nonnull
	private final EntityJsonSerializer entityJsonSerializer;

	public ListUnknownEntitiesHandler(@Nonnull CatalogRestHandlingContext restHandlingContext) {
		super(restHandlingContext);
		this.entityJsonSerializer = new EntityJsonSerializer(restApiHandlingContext);
	}

	@Nonnull
	@Override
	public String getSupportedHttpMethod() {
		return Methods.GET_STRING;
	}

	@Override
	public boolean returnsResponseBodies() {
		return true;
	}


	@Override
	@Nonnull
	public Optional<Object> doHandleRequest(@Nonnull HttpServerExchange exchange) {
		final Map<String, Object> parametersFromRequest = getParametersFromRequest(exchange);

		final Query query = Query.query(
			FilterByConstraintFromRequestQueryBuilder.buildFilterByForUnknownEntityList(parametersFromRequest, restApiHandlingContext.getCatalogSchema()),
			RequireConstraintFromRequestQueryBuilder.buildRequire(parametersFromRequest)
		);

		log.debug("Generated evitaDB query for unknown entity list fetch is `{}`.", query);

		final List<EntityClassifier> entities = restApiHandlingContext.queryCatalog(session ->
			session.queryList(query, EntityClassifier.class));

		return Optional.of(entityJsonSerializer.serialize(entities));
	}
}