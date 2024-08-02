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

package io.evitadb.api;

import io.evitadb.api.configuration.EvitaConfiguration;
import io.evitadb.api.configuration.ServerOptions;
import io.evitadb.api.configuration.StorageOptions;
import io.evitadb.api.configuration.ThreadPoolOptions;
import io.evitadb.api.requestResponse.cdc.CaptureArea;
import io.evitadb.api.requestResponse.cdc.CaptureContent;
import io.evitadb.api.requestResponse.cdc.ChangeCatalogCapture;
import io.evitadb.api.requestResponse.cdc.ChangeCatalogCaptureRequest;
import io.evitadb.api.requestResponse.schema.Cardinality;
import io.evitadb.core.Evita;
import io.evitadb.test.Entities;
import io.evitadb.test.EvitaTestSupport;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.Nonnull;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This test contains various integration tests for {@link Evita}.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2021
 */
@Slf4j
class EvitaChangeCaptureTest implements EvitaTestSupport {
	public static final String ATTRIBUTE_NAME = "name";
	public static final String ATTRIBUTE_URL = "url";
	public static final String DIR_EVITA_TEST = "evitaCdcTest";
	private Evita evita;

	private static void createSchema(@Nonnull EvitaSessionContract session) {
		session.defineEntitySchema(Entities.BRAND)
			.withGeneratedPrimaryKey()
			.withAttribute(ATTRIBUTE_NAME, String.class)
			.updateVia(session);

		session.defineEntitySchema(Entities.PRODUCT)
			.withoutGeneratedPrimaryKey()
			.withAttribute(ATTRIBUTE_NAME, String.class)
			.withAttribute(ATTRIBUTE_URL, String.class)
			.withReferenceToEntity(Entities.BRAND, Entities.BRAND, Cardinality.ZERO_OR_ONE)
			.updateVia(session);
	}

	private static void createDataInSchema(@Nonnull EvitaSessionContract session) {
		session.createNewEntity(Entities.BRAND, 1)
			.setAttribute(ATTRIBUTE_NAME, "Brand 1")
			.upsertVia(session);
		session.createNewEntity(Entities.PRODUCT, 1)
			.setAttribute(ATTRIBUTE_NAME, "Product 1")
			.setAttribute(ATTRIBUTE_URL, "http://product1.com")
			.setReference(Entities.BRAND, 1)
			.upsertVia(session);
	}

	@BeforeEach
	void setUp() {
		cleanTestSubDirectoryWithRethrow(DIR_EVITA_TEST);
		evita = new Evita(
			getEvitaConfiguration()
		);
		evita.defineCatalog(TEST_CATALOG);
	}

	@AfterEach
	void tearDown() {
		evita.close();
		cleanTestSubDirectoryWithRethrow(DIR_EVITA_TEST);
	}

	@Test
	void shouldProvideNoCaptureInWarmUpStage() {
		try (final EvitaSessionContract session = evita.createReadWriteSession(TEST_CATALOG)) {
			createSchema(session);
			createDataInSchema(session);
		}

		try (final EvitaSessionContract session = evita.createReadOnlySession(TEST_CATALOG)) {
			assertTrue(
				session.getMutationsHistory(
						ChangeCatalogCaptureRequest.builder()
							.build()
					)
					.findFirst()
					.isEmpty()
			);
		}
	}

	@Test
	void shouldCaptureSchemaMutationsInAliveStage() {
		try (final EvitaSessionContract session = evita.createReadWriteSession(TEST_CATALOG)) {
			session.goLiveAndClose();
		}

		try (final EvitaSessionContract session = evita.createReadWriteSession(TEST_CATALOG)) {
			createSchema(session);
			createDataInSchema(session);
		}

		try (final EvitaSessionContract session = evita.createReadOnlySession(TEST_CATALOG)) {
			final List<ChangeCatalogCapture> reverseCaptures = session.getMutationsHistory(
				ChangeCatalogCaptureRequest.builder()
					.area(CaptureArea.SCHEMA)
					.content(CaptureContent.BODY)
					.build()
			).toList();
			assertEquals(10, reverseCaptures.size());

			int index = Integer.MAX_VALUE;
			for (ChangeCatalogCapture reverseCapture : reverseCaptures) {
				assertTrue(
					reverseCapture.index() <= index,
					"Index " + reverseCapture.index() + " is not greater than " + index + " for " + reverseCapture
				);
				index = reverseCapture.index();
			}
		}
	}

	@Test
	void shouldCaptureDataMutationsInAliveStage() {

	}

	@Test
	void shouldCombineBothDataAndSchemaMutations() {

	}

	@Test
	void shouldFocusOnReplicableMutations() {

	}

	@Test
	void shouldFocusOnLocalMutationsOfExactAttribute() {

	}

	@Test
	void shouldFocusOnLocalMutationsOfPrices() {

	}

	@Test
	void shouldFocusOnAllMutationsOfSingleEntity() {

	}

	@Test
	void shouldFocusOnSchemaChangesOfSingleEntityType() {

	}

	@Test
	void shouldCorrectlyHandleEntitySchemaRenaming() {

	}

	@Nonnull
	private EvitaConfiguration getEvitaConfiguration() {
		return getEvitaConfiguration(-1);
	}

	@Nonnull
	private EvitaConfiguration getEvitaConfiguration(int inactivityTimeoutInSeconds) {
		return EvitaConfiguration.builder()
			.server(
				ServerOptions.builder()
					.serviceThreadPool(
						ThreadPoolOptions.serviceThreadPoolBuilder()
							.minThreadCount(1)
							.maxThreadCount(1)
							.queueSize(10_000)
							.build()
					)
					.closeSessionsAfterSecondsOfInactivity(inactivityTimeoutInSeconds)
					.build()
			)
			.storage(
				StorageOptions.builder()
					.storageDirectory(getEvitaTestDirectory())
					.exportDirectory(getEvitaTestDirectory())
					.timeTravelEnabled(false)
					.build()
			)
			.build();
	}

	@Nonnull
	private Path getEvitaTestDirectory() {
		return getTestDirectory().resolve(DIR_EVITA_TEST);
	}

}
