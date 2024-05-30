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

package io.evitadb.externalApi.api.model;

import io.evitadb.externalApi.exception.ExternalApiInternalError;
import io.evitadb.utils.Assert;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

/**
 * API-independent data type descriptor for {@link PropertyDescriptor} for referencing other object used as type.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
public class ObjectPropertyDataTypeDescriptor implements PropertyDataTypeDescriptor {

	@Nonnull
	private final Object objectReference;
	private final boolean nonNull;
	private final boolean list;

	protected ObjectPropertyDataTypeDescriptor(@Nonnull Object objectReference, boolean nonNull, boolean list) {
		Assert.isPremiseValid(
			objectReference instanceof ObjectDescriptor || objectReference instanceof Supplier<?>,
			() -> new ExternalApiInternalError("Unsupported type of object reference.")
		);
		this.objectReference = objectReference;
		this.nonNull = nonNull;
		this.list = list;
	}

	@Nonnull
	public ObjectDescriptor objectReference() {
		if (objectReference instanceof ObjectDescriptor descriptor) {
			return descriptor;
		} else if (objectReference instanceof Supplier<?> supplier) {
			final Object descriptor = supplier.get();
			Assert.isPremiseValid(
				descriptor instanceof ObjectDescriptor,
				() -> new ExternalApiInternalError("Supplier returned unsupported object.")
			);
			return (ObjectDescriptor) descriptor;
		} else {
			throw new ExternalApiInternalError("Unsupported type of object reference.");
		}
	}

	@Override
	public boolean nonNull() {
		return nonNull;
	}

	public boolean list() {
		return list;
	}

	@Nonnull
	public static ObjectPropertyDataTypeDescriptor nullableRef(@Nonnull ObjectDescriptor objectReference) {
		return new ObjectPropertyDataTypeDescriptor(objectReference, false, false);
	}

	@Nonnull
	public static ObjectPropertyDataTypeDescriptor nonNullRef(@Nonnull ObjectDescriptor objectReference) {
		return new ObjectPropertyDataTypeDescriptor(objectReference, true, false);
	}

	@Nonnull
	public static ObjectPropertyDataTypeDescriptor nullableListRef(@Nonnull ObjectDescriptor objectReference) {
		return new ObjectPropertyDataTypeDescriptor(objectReference, false, true);
	}

	@Nonnull
	public static ObjectPropertyDataTypeDescriptor nonNullListRef(@Nonnull ObjectDescriptor objectReference) {
		return new ObjectPropertyDataTypeDescriptor(objectReference, true, true);
	}

	@Nonnull
	public static ObjectPropertyDataTypeDescriptor nullableRef(@Nonnull Supplier<ObjectDescriptor> objectReferenceSupplier) {
		return new ObjectPropertyDataTypeDescriptor(objectReferenceSupplier, false, false);
	}

	@Nonnull
	public static ObjectPropertyDataTypeDescriptor nonNullRef(@Nonnull Supplier<ObjectDescriptor> objectReferenceSupplier) {
		return new ObjectPropertyDataTypeDescriptor(objectReferenceSupplier, true, false);
	}

	@Nonnull
	public static ObjectPropertyDataTypeDescriptor nullableListRef(@Nonnull Supplier<ObjectDescriptor> objectReferenceSupplier) {
		return new ObjectPropertyDataTypeDescriptor(objectReferenceSupplier, false, true);
	}

	@Nonnull
	public static ObjectPropertyDataTypeDescriptor nonNullListRef(@Nonnull Supplier<ObjectDescriptor> objectReferenceSupplier) {
		return new ObjectPropertyDataTypeDescriptor(objectReferenceSupplier, true, true);
	}
}
