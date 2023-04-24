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

package io.evitadb.api.query.descriptor;

import io.evitadb.api.query.Constraint;
import io.evitadb.api.query.descriptor.annotation.ConstraintDefinition;
import io.evitadb.api.query.descriptor.annotation.Creator;
import io.evitadb.utils.Assert;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Describes single variant of {@link Constraint} with all important info to be able to e.g. build another query system corresponding
 * to the main query system and reconstruct from it the original query. Each variant of query has its own unique
 * full name (name + creator suffix) and corresponding creator (each {@link Creator}
 * in {@link Constraint} create one descriptor).
 * <p>
 * Descriptor contains basic categorizing data such as {@link #type()} and {@link #propertyType()} as well as concrete
 * metadata like {@link #fullName()} or {@link #supportedValues()}.
 * Descriptor also contains the default creator constructor and its parameters to be able to reconstruct the original query.
 * <p>
 * It uses set of annotations for describing actual constraints with {@link ConstraintDefinition}
 * as the main one. Those annotations are then processed by {@link ConstraintDescriptorProvider} which generated these
 * descriptors.
 * <p>
 * Equality is determined only {@link #type()}, {@link #propertyType()} and {@link #fullName()} as these properties defines
 * uniqueness of each query. There cannot be multiple constraints with these properties because that would create
 * ambiguity in query search and reconstruction.
 *
 * @param constraintClass class of represented query
 * @param type specifies what is purpose of the query
 * @param propertyType specifies on which data the query will be operating
 * @param fullName base name of condition or operation this query represent, e.g. `equals` + creator suffix.
 *                 Its format must be in camelCase.
 * @param supportedValues description of target data this query can operate on. If null, query doesn't support any values
 * @param creator contains data for reconstructing original constraints
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2022
 */
public record ConstraintDescriptor(@Nonnull Class<?> constraintClass,
	                               @Nonnull ConstraintType type,
	                               @Nonnull ConstraintPropertyType propertyType,
	                               @Nonnull String fullName,
								   @Nonnull String shortDescription,
								   @Nonnull Set<ConstraintDomain> supportedIn,
	                               @Nullable SupportedValues supportedValues,
	                               @Nonnull ConstraintCreator creator) {

	private static final Pattern NAME_PATTERN = Pattern.compile("^[a-z][a-zA-Z]*$");

	public ConstraintDescriptor(@Nonnull Class<?> constraintClass,
	                            @Nonnull ConstraintType type,
	                            @Nonnull ConstraintPropertyType propertyType,
	                            @Nonnull String fullName,
								@Nonnull String shortDescription,
	                            @Nonnull Set<ConstraintDomain> supportedIn,
	                            @Nullable SupportedValues supportedValues,
	                            @Nonnull ConstraintCreator creator) {
		this.constraintClass = constraintClass;
		this.type = type;
		this.propertyType = propertyType;
		this.fullName = fullName;
		this.shortDescription = shortDescription;
		this.supportedIn = supportedIn;
		this.supportedValues = supportedValues;
		this.creator = creator;

		Assert.isPremiseValid(
			NAME_PATTERN.matcher(this.fullName).matches(),
			"Constraint name `" + fullName + "` has invalid format. Should conform to `[a-z][a-zA-Z]*`."
		);
		Assert.isPremiseValid(
			!this.shortDescription.isEmpty(),
			"Constraint `" + fullName + "` is missing short description."
		);

		if (propertyType == ConstraintPropertyType.GENERIC) {
			Assert.isPremiseValid(
				!creator.needsClassifier(),
				"Creator for query `" + this.constraintClass.getName() + "` cannot have classifier because it is generic query."
			);
		}
	}

	@Override
	public boolean equals(Object o) {
		// lombok cannot generate equals and hash code for records
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ConstraintDescriptor that = (ConstraintDescriptor) o;
		return type == that.type &&
			propertyType == that.propertyType &&
			fullName.equals(that.fullName) &&
			creator.hasClassifierParameter() == that.creator.hasClassifierParameter() &&
			creator.hasImplicitClassifier() == that.creator.hasImplicitClassifier();
	}

	@Override
	public int hashCode() {
		// lombok cannot generate equals and hash code for records
		return Objects.hash(type, propertyType, fullName, creator.hasClassifierParameter(), creator.hasImplicitClassifier());
	}


	/**
	 * Contains metadata about supported data types of target values this query can operate on.
	 *
	 * @param dataTypes set of value data types of target data this query can operate on
	 * @param supportsArrays if target data can be an array of supported data types
	 */
	public record SupportedValues(@Nonnull Set<Class<?>> dataTypes,
	                              boolean supportsArrays) {}

}
