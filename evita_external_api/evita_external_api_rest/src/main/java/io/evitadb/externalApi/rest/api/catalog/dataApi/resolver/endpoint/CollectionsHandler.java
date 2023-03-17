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

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.evitadb.externalApi.rest.api.catalog.dataApi.model.CollectionDescriptor;
import io.evitadb.externalApi.rest.api.catalog.dataApi.model.header.CollectionsEndpointHeaderDescriptor;
import io.evitadb.externalApi.rest.api.catalog.resolver.endpoint.CatalogRestHandlingContext;
import io.evitadb.externalApi.rest.api.resolver.serializer.ObjectJsonSerializer;
import io.evitadb.externalApi.rest.io.RestHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.Optional;

/**
 * This handler is used to get list of names (and counts) of existing collections withing one catalog.
 *
 * @author Martin Veska (veska@fg.cz), FG Forrest a.s. (c) 2022
 */
public class CollectionsHandler extends RestHandler<CatalogRestHandlingContext> {

	@Nonnull
	private final ObjectJsonSerializer objectJsonSerializer;

	public CollectionsHandler(@Nonnull CatalogRestHandlingContext restHandlingContext) {
		super(restHandlingContext);
		objectJsonSerializer = new ObjectJsonSerializer(restApiHandlingContext.getObjectMapper());
	}

	@Nonnull
	@Override
	public String getSupportedHttpMethod() {
		return Methods.PUT_STRING;
	}

	@Override
	public boolean returnsResponseBodies() {
		return true;
	}

	@Override
	@Nonnull
	public Optional<Object> doHandleRequest(@Nonnull HttpServerExchange exchange) {
		final Map<String, Object> parametersFromRequest = getParametersFromRequest(exchange);
		final Boolean withCounts = (Boolean) parametersFromRequest.get(CollectionsEndpointHeaderDescriptor.ENTITY_COUNT.name());

		final ArrayNode collections = restApiHandlingContext.queryCatalog(session -> {
			final ArrayNode collectionArray = objectJsonSerializer.arrayNode();
			for (String entityType : session.getAllEntityTypes()) {
				final ObjectNode collectionNode = objectJsonSerializer.objectNode();
				collectionNode.putIfAbsent(CollectionDescriptor.ENTITY_TYPE.name(), objectJsonSerializer.serializeObject(entityType));
				collectionArray.add(collectionNode);
				if (withCounts != null && withCounts) {
					collectionNode.putIfAbsent(CollectionDescriptor.COUNT.name(), objectJsonSerializer.serializeObject(session.getEntityCollectionSize(entityType)));
				}
			}
			return collectionArray;
		});

		return Optional.of(collections);
	}
}