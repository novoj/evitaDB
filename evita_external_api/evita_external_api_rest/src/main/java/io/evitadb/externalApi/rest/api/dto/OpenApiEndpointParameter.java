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

package io.evitadb.externalApi.rest.api.dto;

import io.evitadb.externalApi.rest.exception.OpenApiBuildingError;
import io.evitadb.utils.Assert;
import io.swagger.v3.oas.models.parameters.Parameter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * TODO lho docs
 *
 * @author Lukáš Hornych, 2023
 */
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
public class OpenApiEndpointParameter {

	@Nonnull
	@Getter
	private final OpenApiOperationParameterLocation location;
	@Nonnull
	@Getter
	private final String name;
	@Nullable
	private final String description;
	@Nullable
	private final String deprecationNotice;
	@Nonnull
	private final OpenApiSimpleType type;

	@Nonnull
	public static OpenApiEndpointParameter.Builder newPathParameter() {
		return new Builder(OpenApiOperationParameterLocation.PATH);
	}

	@Nonnull
	public static OpenApiEndpointParameter.Builder newQueryParameter() {
		return new Builder(OpenApiOperationParameterLocation.QUERY);
	}

	@Nonnull
	public Parameter toParameter() {
		final Parameter parameter = new Parameter();
		parameter.in(this.location.getLocation());
		parameter.name(this.name);
		parameter.description(this.description);
		if (deprecationNotice != null) {
			parameter.deprecated(true); // openapi doesn't support false here
		}
		if (this.type instanceof OpenApiNonNull) {
			parameter.required(true); // openapi doesn't support false here
		}
		parameter.schema(this.type.toSchema());
		return parameter;
	}

	public static class Builder {

		@Nonnull
		private final OpenApiOperationParameterLocation location;
		@Nullable
		private String name;
		@Nullable
		private String description;
		@Nullable
		private String deprecationNotice;
		@Nullable
		private OpenApiSimpleType type;

		public Builder(@Nonnull OpenApiOperationParameterLocation location) {
			this.location = location;
		}

		@Nonnull
		public Builder name(@Nonnull String name) {
			this.name = name;
			return this;
		}

		@Nonnull
		public Builder description(@Nullable String description) {
			this.description = description;
			return this;
		}

		@Nonnull
		public Builder deprecationNotice(@Nonnull String deprecationNotice) {
			this.deprecationNotice = deprecationNotice;
			return this;
		}

		@Nonnull
		public Builder type(@Nonnull OpenApiSimpleType type) {
			this.type = type;
			return this;
		}

		@Nonnull
		public OpenApiEndpointParameter build() {
			Assert.isPremiseValid(
				name != null && !name.isEmpty(),
				() -> new OpenApiBuildingError("Missing parameter name.")
			);
			Assert.isPremiseValid(
				type != null,
				() -> new OpenApiBuildingError("Parameter `" + name + "` is missing type.")
			);
			return new OpenApiEndpointParameter(location, name, description, deprecationNotice, type);
		}
	}
}
