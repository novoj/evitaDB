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

package io.evitadb.externalApi.graphql.api.catalog.dataApi.model.extraResult;

import io.evitadb.api.query.require.HierarchyRequireConstraint;
import io.evitadb.externalApi.api.model.PropertyDescriptor;

/**
 * Descriptor of header arguments common for all {@link HierarchyRequireConstraint}s.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
public interface HierarchyRequireHeaderDescriptor {

	PropertyDescriptor STOP_AT = PropertyDescriptor.builder()
		// todo lho change to "stopAt" after we support it
		.name("hierarchyStopAt")
		// TOBEDONE JNO: stopAt constraint docs
		.description("""
			Defines node at which the hierarchy will stop expanding.
			""")
		// type is expected to be a `stopAt` constraint
		.build();
	PropertyDescriptor STATISTICS = PropertyDescriptor.builder()
		// todo lho change to "statistics" after we support it
		.name("hierarchyStatistics")
		// TOBEDONE JNO: statistics constraint docs
		.description("""
			Triggers computing the count of children for each returned hierarchy node.
			""")
		// type is expected to be a `statistics` constraint
		.build();
}
