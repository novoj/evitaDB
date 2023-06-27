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

package io.evitadb.comparator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The test verifies behaviour of {@link NullsFirstComparatorWrapper}.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2023
 */
class NullsFirstComparatorWrapperTest {

	@Test
	void shouldSortNullsAtTheBeginning() {
		final String[] arrayToSort = {"D", "B", null, "Z", "A"};
		Arrays.sort(arrayToSort, new NullsFirstComparatorWrapper<String>(Comparator.naturalOrder()));
		assertArrayEquals(new String[] {null, "A", "B", "D", "Z"}, arrayToSort);
	}

	@Test
	void shouldMarkBothNullElementsAsEqual() {
		assertEquals(0, new NullsFirstComparatorWrapper<String>(Comparator.naturalOrder()).compare(null, null));
	}

}