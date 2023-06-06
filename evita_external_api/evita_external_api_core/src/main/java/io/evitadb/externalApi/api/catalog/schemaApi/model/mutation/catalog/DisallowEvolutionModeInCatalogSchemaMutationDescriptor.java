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

package io.evitadb.externalApi.api.catalog.schemaApi.model.mutation.catalog;

import io.evitadb.api.requestResponse.schema.CatalogEvolutionMode;
import io.evitadb.externalApi.api.model.ObjectDescriptor;
import io.evitadb.externalApi.api.model.PropertyDescriptor;

import java.util.List;

import static io.evitadb.externalApi.api.model.PrimitivePropertyDataTypeDescriptor.nonNull;

/**
 * Descriptor representing {@link io.evitadb.api.requestResponse.schema.mutation.catalog.DisallowEvolutionModeInCatalogSchemaMutation}.
 *
 * Note: this descriptor has static structure.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
public interface DisallowEvolutionModeInCatalogSchemaMutationDescriptor {

	PropertyDescriptor EVOLUTION_MODES = PropertyDescriptor.builder()
		.name("catalogEvolutionModes")
		.description("""
			Set of forbidden evolution modes. These allow to specify how strict is evitaDB when unknown information is
			presented to her for the first time. When no evolution mode is set, each violation of the `CatalogSchema` is
			reported by an error. This behaviour can be changed by this evolution mode, however.
			""")
		.type(nonNull(CatalogEvolutionMode[].class))
		.build();

	ObjectDescriptor THIS = ObjectDescriptor.builder()
		.name("DisallowEvolutionModeInCatalogSchemaMutation")
		.description("""
			Mutation is responsible for adding one or more modes to a `CatalogSchema.evolutionMode`
			in `CatalogSchema`.
			""")
		.staticFields(List.of(EVOLUTION_MODES))
		.build();
}