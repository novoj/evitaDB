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

package io.evitadb.externalApi.lab;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.evitadb.core.Evita;
import io.evitadb.externalApi.http.CorsFilter;
import io.evitadb.externalApi.http.PathNormalizingHandler;
import io.evitadb.externalApi.lab.api.LabApiBuilder;
import io.evitadb.externalApi.lab.configuration.LabConfig;
import io.evitadb.externalApi.lab.io.LabExceptionHandler;
import io.evitadb.externalApi.rest.api.Rest;
import io.evitadb.externalApi.rest.io.CorsEndpoint;
import io.evitadb.externalApi.rest.io.RestEndpointHandler;
import io.evitadb.externalApi.utils.UriPath;
import io.evitadb.utils.StringUtils;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.BlockingHandler;
import io.undertow.util.HttpString;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.Map;

import static io.evitadb.utils.CollectionUtils.createConcurrentHashMap;

/**
 * Manages lab API and GUI exposure.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
@Slf4j
public class LabManager {

	public static final String LAB_API_URL_PREFIX = "api";

	/**
	 * Common object mapper for endpoints
	 */
	@Nonnull private final ObjectMapper objectMapper = new ObjectMapper();

	@Nonnull private final Evita evita;
	@Nonnull private final LabConfig labConfig;

	/**
	 * evitaLab specific endpoint router.
	 */
	@Nonnull private final RoutingHandler labRouter = Handlers.routing();
	@Nonnull private final Map<UriPath, CorsEndpoint> corsEndpoints = createConcurrentHashMap(20);

	public LabManager(@Nonnull Evita evita, @Nonnull LabConfig labConfig) {
		this.evita = evita;
		this.labConfig = labConfig;

		final long buildingStartTime = System.currentTimeMillis();

		registerLabApi();

		log.info("Built Lab in " + StringUtils.formatPreciseNano(System.currentTimeMillis() - buildingStartTime));
	}

	/**
	 * Builds REST API for evitaLab and registers it into router.
	 */
	private void registerLabApi() {
		final LabApiBuilder labApiBuilder = new LabApiBuilder(labConfig, evita);
		final Rest builtLabApi = labApiBuilder.build();
		builtLabApi.endpoints().forEach(this::registerLabApiEndpoint);
	}

	@Nonnull
	public HttpHandler getLabRouter() {
		return new PathNormalizingHandler(labRouter);
	}

	/**
	 * Creates new lab API endpoint on specified path with specified {@link Rest} instance.
	 */
	private void registerLabApiEndpoint(@Nonnull Rest.Endpoint endpoint) {
		registerLabEndpoint(
			endpoint.method(),
			UriPath.of("/", LAB_API_URL_PREFIX, endpoint.path()),
			endpoint.handler()
		);
	}

	/**
	 * Registers endpoints into router. Also, CORS endpoint is created automatically for this endpoint.
	 */
	private void registerLabEndpoint(@Nonnull HttpString method, @Nonnull UriPath path, @Nonnull RestEndpointHandler<?, ?> handler) {
		final CorsEndpoint corsEndpoint = corsEndpoints.computeIfAbsent(path, p -> new CorsEndpoint(labConfig));
		corsEndpoint.addMetadataFromHandler(handler);

		labRouter.add(
			method,
			path.toString(),
			new BlockingHandler(
				new CorsFilter(
					new LabExceptionHandler(
						objectMapper,
						handler
					),
					labConfig.getAllowedOrigins()
				)
			)
		);
	}
}
