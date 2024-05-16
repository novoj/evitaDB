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
 *   https://github.com/FgForrest/evitaDB/blob/master/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.externalApi.api.catalog.schemaApi.model;

import io.evitadb.api.requestResponse.schema.NamedSchemaWithDeprecationContract;
import io.evitadb.externalApi.api.model.PropertyDescriptor;

import static io.evitadb.externalApi.api.model.PrimitivePropertyDataTypeDescriptor.nullable;

/**
 * Descriptor of {@link NamedSchemaWithDeprecationContract} for schema-based external APIs. It describes what properties of named schema are
 * supported in API for better field names and docs maintainability.
 *
 * Note: this descriptor is meant to only ancestor for other specific schema descriptors.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2022
 */
public interface NamedSchemaWithDeprecationDescriptor extends NamedSchemaDescriptor {

	PropertyDescriptor DEPRECATION_NOTICE = PropertyDescriptor.builder()
		.name("deprecationNotice")
		.description("""
			Deprecation notice contains information about planned removal of this entity from the model / client API.
			This allows to plan and evolve the schema allowing clients to adapt early to planned breaking changes.
			
			If notice is `null`, this schema is considered not deprecated.
			""")
		.type(nullable(String.class))
		.build();
}
