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

package io.evitadb.externalApi.rest.api.testSuite;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.evitadb.api.requestResponse.data.SealedEntity;
import io.evitadb.api.requestResponse.schema.dto.EntitySchema;
import io.evitadb.core.Evita;
import io.evitadb.dataType.Range;
import io.evitadb.externalApi.configuration.ApiOptions;
import io.evitadb.externalApi.configuration.CertificateSettings;
import io.evitadb.externalApi.http.ExternalApiServer;
import io.evitadb.externalApi.rest.RestProvider;
import io.evitadb.externalApi.rest.RestProviderRegistrar;
import io.evitadb.externalApi.rest.api.resolver.serializer.ObjectJsonSerializer;
import io.evitadb.externalApi.rest.api.testSuite.RestTester.Request;
import io.evitadb.externalApi.rest.configuration.RestConfig;
import io.evitadb.test.annotation.DataSet;
import io.evitadb.test.extension.DbInstanceParameterResolver;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static io.evitadb.test.TestConstants.FUNCTIONAL_TEST;

/**
 * Common ancestor for functional testing of REST API server. It sets up Evita instance, REST API server and
 * API tester.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2022
 * @author Martin Veska, FG Forrest a.s. (c) 2022
 */
@Tag(FUNCTIONAL_TEST)
@ExtendWith(DbInstanceParameterResolver.class)
@Slf4j
public abstract class RestEndpointFunctionalTest {

	protected static final ObjectJsonSerializer jsonSerializer = new ObjectJsonSerializer(new ObjectMapper());

	public static final String TYPENAME_FIELD = "__typename";

	private static ExternalApiServer server;
	private static RestTester tester;


	@SneakyThrows
	@BeforeEach
	void setUp() {
		 tester = new RestTester("https://" + InetAddress.getByName("localhost").getHostAddress() + ":5555/rest" + getEndpointPath());
	}

	@Nonnull
	protected abstract String getEndpointPath();

	@DataSet(TestDataGenerator.REST_THOUSAND_PRODUCTS)
	List<SealedEntity> setUp(Evita evita) {
		TestDataGenerator.generateMockCatalogs(evita);
		final List<SealedEntity> entities = TestDataGenerator.generateMainCatalogEntities(evita);

		server = new ExternalApiServer(
			evita,
			new ApiOptions(null, new CertificateSettings.Builder().build(), Map.of(RestProvider.CODE, new RestConfig())),
			Collections.singleton(new RestProviderRegistrar())
		);
		server.start();

		return entities;
	}

	@AfterAll
	static void tearDown() {
		if (server != null) {
			server.close();
			server = null;
		}
	}

	/**
	 * Test single request to REST API.
	 */
	protected Request testRestCall() {
		return tester.test();
	}

	@Nonnull
	protected static EntitySchema createEmptyEntitySchema(@Nonnull String entityType) {
		return EntitySchema._internalBuild(entityType);
	}

	@Nullable
	protected Object serializeToJsonValue(@Nullable Object value) {
		if (value == null) {
			return null;
		}
		if (value instanceof Object[] array) {
			final ArrayList<Object> objects = new ArrayList<>(array.length);
			for (Object item : array) {
				objects.add(serializeToJsonValue(item));
			}
			return objects;
		}
		if (value instanceof Boolean bool) {
			return bool;
		}
		if (value instanceof Integer integer) {
			return integer;
		}
		if (value instanceof Range<?> range) {
			final List<Object> serializedRange = new ArrayList<>(2);
			if (range.getPreciseFrom() != null) {
				serializedRange.add(serializeToJsonValue(range.getPreciseFrom()));
			} else {
				serializedRange.add(null);
			}
			if (range.getPreciseTo() != null) {
				serializedRange.add(serializeToJsonValue(range.getPreciseTo()));
			} else {
				serializedRange.add(null);
			}
			return serializedRange;
		}
		return jsonSerializer.serializeObject(value).asText();
	}
}