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

package io.evitadb.externalApi.graphql.api.catalog.dataApi.model;

import io.evitadb.externalApi.api.catalog.dataApi.model.CatalogDataApiRootDescriptor;
import io.evitadb.externalApi.api.model.PropertyDescriptor;

/**
 * Descriptor for header arguments of {@link CatalogDataApiRootDescriptor#QUERY_ENTITY}
 * query.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2022
 */
public interface QueryEntitiesQueryHeaderDescriptor {

	PropertyDescriptor FILTER_BY = PropertyDescriptor.builder()
		.name("filterBy")
		.description("""
			Complex filter query to filter result entities by.
			""")
		// type is expected to be tree of filter constraints
		.build();
	PropertyDescriptor ORDER_BY = PropertyDescriptor.builder()
		.name("orderBy")
		.description("""
			Complex order query to order result entities by.
			""")
		// type is expected to be tree of order constraints
		.build();
	PropertyDescriptor REQUIRE = PropertyDescriptor.builder()
		.name("require")
		.description("""
			Complex require query to alter query behaviour.
			Because most of require constraints are resolved from client-defined output objects structure we need only
			few left constraints that cannot be resolved from output structure because they usually change whole evitaDB
			query behaviour.
			""")
		// type is expected to be tree of require constraints
		.build();
}
