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

package io.evitadb.externalApi.rest.io.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.evitadb.api.query.RequireConstraint;
import io.evitadb.api.query.require.EntityContentRequire;
import io.evitadb.api.query.require.EntityFetch;
import io.evitadb.api.query.require.Require;
import io.evitadb.api.requestResponse.data.SealedEntity;
import io.evitadb.api.requestResponse.data.mutation.EntityMutation;
import io.evitadb.externalApi.api.catalog.dataApi.model.UpsertEntityMutationHeaderDescriptor;
import io.evitadb.externalApi.rest.api.catalog.model.QueryRequestBodyDescriptor;
import io.evitadb.externalApi.rest.api.catalog.resolver.data.mutation.RestEntityUpsertMutationConverter;
import io.evitadb.externalApi.rest.api.catalog.resolver.mutation.RESTMutationObjectParser;
import io.evitadb.externalApi.rest.exception.RestInternalError;
import io.evitadb.externalApi.rest.exception.RestInvalidArgumentException;
import io.evitadb.externalApi.rest.io.handler.constraint.RequireConstraintResolver;
import io.evitadb.externalApi.rest.io.model.EntityUpsertRequestData;
import io.evitadb.externalApi.rest.io.serializer.EntityJsonSerializer;
import io.evitadb.utils.Assert;
import io.undertow.server.HttpServerExchange;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

/**
 * Handles upsert request for entity.
 *
 * @author Martin Veska (veska@fg.cz), FG Forrest a.s. (c) 2022
 */
@Slf4j
public class UpsertEntityHandler extends RestHandler<CollectionRestHandlingContext> {

	@Nonnull private final RestEntityUpsertMutationConverter mutationResolver;
	@Nonnull private final RequireConstraintResolver requireConstraintResolver;
	@Nonnull private final EntityJsonSerializer entityJsonSerializer;

	private final boolean withPrimaryKeyInUrl;

	public UpsertEntityHandler(@Nonnull CollectionRestHandlingContext restApiHandlingContext, boolean withPrimaryKeyInUrl) {
		super(restApiHandlingContext);
		this.mutationResolver = new RestEntityUpsertMutationConverter(
			restApiHandlingContext,
			new RESTMutationObjectParser(restApiHandlingContext.getObjectMapper())
		);
		this.requireConstraintResolver = new RequireConstraintResolver(restApiHandlingContext, restApiHandlingContext.getEndpointOperation());
		this.entityJsonSerializer = new EntityJsonSerializer(restApiHandlingContext);
		this.withPrimaryKeyInUrl = withPrimaryKeyInUrl;
	}

	@Override
	@Nonnull
	public Optional<Object> doHandleRequest(@Nonnull HttpServerExchange exchange) {
		final EntityUpsertRequestData requestData = getRequestData(exchange);

		if (withPrimaryKeyInUrl) {
			final Map<String, Object> parametersFromRequest = getParametersFromRequest(exchange, restApiHandlingContext.getEndpointOperation());
			Assert.isTrue(
				parametersFromRequest.containsKey(UpsertEntityMutationHeaderDescriptor.PRIMARY_KEY.name()),
				() -> new RestInvalidArgumentException("Primary key is not present in request's URL path.")
			);
			requestData.setPrimaryKey((Integer) parametersFromRequest.get(UpsertEntityMutationHeaderDescriptor.PRIMARY_KEY.name()));
		}

		final EntityMutation entityMutation = mutationResolver.resolve(
			requestData.getPrimaryKey()
				.orElse(null),
			requestData.getEntityExistence()
				.orElseThrow(() -> new RestInvalidArgumentException("EntityExistence is not set in request data.")),
			requestData.getMutations()
				.orElseThrow(() -> new RestInvalidArgumentException("Mutations are not set in request data."))
		);

		final EntityContentRequire[] requires = getEntityContentRequires(requestData).orElse(null);

		final SealedEntity upsertedEntity = restApiHandlingContext.updateCatalog(session ->
			session.upsertAndFetchEntity(entityMutation, requires));

		return Optional.of(entityJsonSerializer.serialize(upsertedEntity));
	}

	@Nonnull
	private Optional<EntityContentRequire[]> getEntityContentRequires(@Nonnull EntityUpsertRequestData requestData) {
		return requestData.getRequire()
			.map(it -> (Require) requireConstraintResolver.resolve(QueryRequestBodyDescriptor.REQUIRE.name(), it))
			.flatMap(require -> Arrays.stream(require.getChildren())
				.filter(EntityFetch.class::isInstance)
				.findFirst()
				.map(entityFetch -> {
					final RequireConstraint[] children = ((EntityFetch) entityFetch).getChildren();
					final EntityContentRequire[] requires = new EntityContentRequire[children.length];
					for (int i = 0; i < children.length; i++) {
						requires[i] = (EntityContentRequire) children[i];
					}
					return requires;
				})
			);
	}

	@Nonnull
	protected EntityUpsertRequestData getRequestData(@Nonnull HttpServerExchange exchange) {
		final String content = readRequestBody(exchange);
		Assert.isTrue(
			content.trim().length() > 0,
			() -> new RestInvalidArgumentException("Request's body contains no data.")
		);

		try {
			return restApiHandlingContext.getObjectMapper().readValue(content, EntityUpsertRequestData.class);
		} catch (JsonProcessingException e) {
			throw new RestInternalError("Could not parse request body: ", e);
		}
	}
}
