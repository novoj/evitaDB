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

package io.evitadb.externalApi.rest.api.system.resolver.endpoint;

import io.evitadb.externalApi.http.EndpointResponse;
import io.evitadb.externalApi.http.NotFoundEndpointResponse;
import io.evitadb.externalApi.http.SuccessEndpointResponse;
import io.evitadb.externalApi.rest.api.system.model.CatalogsHeaderDescriptor;
import io.evitadb.externalApi.rest.io.RestEndpointExecutionContext;
import io.undertow.util.Methods;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.Set;

/**
 * Returns single evitaDB catalog by its name.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
public class GetCatalogHandler extends CatalogHandler {

	public GetCatalogHandler(@Nonnull SystemRestHandlingContext restApiHandlingContext) {
		super(restApiHandlingContext);
	}

	@Nonnull
	@Override
	protected EndpointResponse doHandleRequest(@Nonnull RestEndpointExecutionContext executionContext) {
		final Map<String, Object> parameters = getParametersFromRequest(executionContext);
		final String catalogName = (String) parameters.get(CatalogsHeaderDescriptor.NAME.name());
		return restHandlingContext.getEvita().getCatalogInstance(catalogName)
			.map(it -> (EndpointResponse) new SuccessEndpointResponse(convertResultIntoSerializableObject(executionContext, it)))
			.orElse(new NotFoundEndpointResponse());
	}

	@Nonnull
	@Override
	public Set<String> getSupportedHttpMethods() {
		return Set.of(Methods.GET_STRING);
	}
}
