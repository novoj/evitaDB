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
 *   https://github.com/FgForrest/evitaDB/blob/main/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.store.offsetIndex;

import io.evitadb.api.configuration.StorageOptions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This test verifies {@link OffsetIndexSerializationService} contract.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2021
 */
class OffsetIndexSerializationServiceTest {

	@Test
	void shouldComputeExpectedRecordCountProperly() {
		final StorageOptions testOptions = new StorageOptions(
			Path.of(""), 1, 0, 55, 1, false, 1.0, 0L
		);
		assertEquals(new OffsetIndexSerializationService.ExpectedCounts(0, 1), OffsetIndexSerializationService.computeExpectedRecordCount(testOptions, 0));
		assertEquals(new OffsetIndexSerializationService.ExpectedCounts(1, 1), OffsetIndexSerializationService.computeExpectedRecordCount(testOptions, 1));
		assertEquals(new OffsetIndexSerializationService.ExpectedCounts(2, 1), OffsetIndexSerializationService.computeExpectedRecordCount(testOptions, 2));
	}
}
