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

package io.evitadb.externalApi.rest.api.catalog.schemaApi.builder;

import io.evitadb.api.requestResponse.schema.AssociatedDataSchemaContract;
import io.evitadb.api.requestResponse.schema.AttributeSchemaContract;
import io.evitadb.api.requestResponse.schema.EntitySchemaContract;
import io.evitadb.api.requestResponse.schema.GlobalAttributeSchemaContract;
import io.evitadb.api.requestResponse.schema.ReferenceSchemaContract;
import io.evitadb.externalApi.api.catalog.schemaApi.model.AssociatedDataSchemaDescriptor;
import io.evitadb.externalApi.api.catalog.schemaApi.model.AssociatedDataSchemasDescriptor;
import io.evitadb.externalApi.api.catalog.schemaApi.model.AttributeSchemaDescriptor;
import io.evitadb.externalApi.api.catalog.schemaApi.model.AttributeSchemasDescriptor;
import io.evitadb.externalApi.api.catalog.schemaApi.model.EntitySchemaDescriptor;
import io.evitadb.externalApi.api.catalog.schemaApi.model.GlobalAttributeSchemaDescriptor;
import io.evitadb.externalApi.api.catalog.schemaApi.model.ReferenceSchemaDescriptor;
import io.evitadb.externalApi.api.catalog.schemaApi.model.ReferenceSchemasDescriptor;
import io.evitadb.externalApi.rest.api.catalog.builder.CatalogRestBuildingContext;
import io.evitadb.externalApi.rest.api.model.ObjectDescriptorToOpenApiObjectTransformer;
import io.evitadb.externalApi.rest.api.model.PropertyDescriptorToOpenApiPropertyTransformer;
import io.evitadb.externalApi.rest.api.openApi.OpenApiObject;
import io.evitadb.externalApi.rest.api.openApi.OpenApiProperty;
import io.evitadb.externalApi.rest.api.openApi.OpenApiSimpleType;
import io.evitadb.externalApi.rest.api.openApi.OpenApiTypeReference;
import lombok.RequiredArgsConstructor;

import javax.annotation.Nonnull;

import static io.evitadb.externalApi.api.ExternalApiNamingConventions.FIELD_NAME_NAMING_CONVENTION;
import static io.evitadb.externalApi.rest.api.openApi.OpenApiNonNull.nonNull;
import static io.evitadb.externalApi.rest.api.openApi.OpenApiProperty.newProperty;
import static io.evitadb.externalApi.rest.api.openApi.OpenApiTypeReference.typeRefTo;

/**
 * Builds OpenAPI entity schema object (schema) based on information provided in building context
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
@RequiredArgsConstructor
public class EntitySchemaObjectBuilder {

	@Nonnull private final CatalogRestBuildingContext buildingContext;
	@Nonnull private final ObjectDescriptorToOpenApiObjectTransformer objectBuilderTransformer;
	@Nonnull private final PropertyDescriptorToOpenApiPropertyTransformer propertyBuilderTransformer;

	public void buildCommonTypes() {
		buildingContext.registerType(AttributeSchemaDescriptor.THIS.to(objectBuilderTransformer).build());
		buildingContext.registerType(GlobalAttributeSchemaDescriptor.THIS.to(objectBuilderTransformer).build());
		buildingContext.registerType(AssociatedDataSchemaDescriptor.THIS.to(objectBuilderTransformer).build());
	}

	/**
	 * Builds entity schema object.
	 *
	 * @return schema for entity schema object
	 */
	@Nonnull
	public OpenApiTypeReference build(@Nonnull EntitySchemaContract entitySchema) {
		// build specific entity schema object
		final OpenApiObject.Builder entitySchemaObjectBuilder = EntitySchemaDescriptor.THIS_SPECIFIC
			.to(objectBuilderTransformer)
			.name(EntitySchemaDescriptor.THIS_SPECIFIC.name(entitySchema));

		entitySchemaObjectBuilder.property(buildAttributeSchemasProperty(entitySchema));
		entitySchemaObjectBuilder.property(buildAssociatedDataSchemasProperty(entitySchema));
		entitySchemaObjectBuilder.property(buildReferenceSchemasProperty(entitySchema));

		return buildingContext.registerType(entitySchemaObjectBuilder.build());
	}

	@Nonnull
	private OpenApiProperty buildAttributeSchemasProperty(@Nonnull EntitySchemaContract entitySchema) {
		return EntitySchemaDescriptor.ATTRIBUTES
			.to(propertyBuilderTransformer)
			.type(nonNull(buildAttributeSchemasObject(entitySchema)))
			.build();
	}

	@Nonnull
	private OpenApiTypeReference buildAttributeSchemasObject(@Nonnull EntitySchemaContract entitySchema) {
		final OpenApiObject.Builder attributeSchemasObjectBuilder = AttributeSchemasDescriptor.THIS
			.to(objectBuilderTransformer)
			.name(AttributeSchemasDescriptor.THIS.name(entitySchema));

		entitySchema.getAttributes().values().forEach(attributeSchema ->
			attributeSchemasObjectBuilder.property(buildAttributeSchemaProperty(attributeSchema)));

		return buildingContext.registerType(attributeSchemasObjectBuilder.build());
	}

	@Nonnull
	private static OpenApiProperty buildAttributeSchemaProperty(@Nonnull AttributeSchemaContract attributeSchema) {
		final OpenApiSimpleType attributeSchemaType;
		if (attributeSchema instanceof GlobalAttributeSchemaContract) {
			attributeSchemaType = nonNull(typeRefTo(GlobalAttributeSchemaDescriptor.THIS.name()));
		} else {
			attributeSchemaType = nonNull(typeRefTo(AttributeSchemaDescriptor.THIS.name()));
		}

		return newProperty()
			.name(attributeSchema.getNameVariant(FIELD_NAME_NAMING_CONVENTION))
			.description(attributeSchema.getDescription())
			.deprecationNotice(attributeSchema.getDeprecationNotice())
			.type(attributeSchemaType)
			.build();
	}

	@Nonnull
	private OpenApiProperty buildAssociatedDataSchemasProperty(@Nonnull EntitySchemaContract entitySchema) {
		return EntitySchemaDescriptor.ASSOCIATED_DATA
			.to(propertyBuilderTransformer)
			.type(nonNull(buildAssociatedDataSchemasObject(entitySchema)))
			.build();
	}

	@Nonnull
	private OpenApiTypeReference buildAssociatedDataSchemasObject(@Nonnull EntitySchemaContract entitySchema) {
		final OpenApiObject.Builder associatedDataSchemasObjectBuilder = AssociatedDataSchemasDescriptor.THIS
			.to(objectBuilderTransformer)
			.name(AssociatedDataSchemasDescriptor.THIS.name(entitySchema));

		entitySchema.getAssociatedData().values().forEach(associatedDataSchema ->
			associatedDataSchemasObjectBuilder.property(buildAssociatedDataSchemaProperty(associatedDataSchema)));

		return buildingContext.registerType(associatedDataSchemasObjectBuilder.build());
	}

	@Nonnull
	private static OpenApiProperty buildAssociatedDataSchemaProperty(@Nonnull AssociatedDataSchemaContract associatedDataSchema) {
		return newProperty()
			.name(associatedDataSchema.getNameVariant(FIELD_NAME_NAMING_CONVENTION))
			.description(associatedDataSchema.getDescription())
			.deprecationNotice(associatedDataSchema.getDeprecationNotice())
			.type(nonNull(typeRefTo(AssociatedDataSchemaDescriptor.THIS.name())))
			.build();

	}

	@Nonnull
	private OpenApiProperty buildReferenceSchemasProperty(@Nonnull EntitySchemaContract entitySchema) {
		return EntitySchemaDescriptor.REFERENCES
			.to(propertyBuilderTransformer)
			.type(nonNull(buildReferenceSchemasObject(entitySchema)))
			.build();
	}

	@Nonnull
	private OpenApiTypeReference buildReferenceSchemasObject(@Nonnull EntitySchemaContract entitySchema) {
		final OpenApiObject.Builder referenceSchemasObjectBuilder = ReferenceSchemasDescriptor.THIS
			.to(objectBuilderTransformer)
			.name(ReferenceSchemasDescriptor.THIS.name(entitySchema));

		entitySchema.getReferences().values().forEach(referenceSchema ->
			referenceSchemasObjectBuilder.property(buildReferenceSchemaProperty(entitySchema, referenceSchema)));

		return buildingContext.registerType(referenceSchemasObjectBuilder.build());
	}

	@Nonnull
	private OpenApiProperty buildReferenceSchemaProperty(@Nonnull EntitySchemaContract entitySchema,
	                                                     @Nonnull ReferenceSchemaContract referenceSchema) {
		return newProperty()
			.name(referenceSchema.getNameVariant(FIELD_NAME_NAMING_CONVENTION))
			.description(referenceSchema.getDescription())
			.deprecationNotice(referenceSchema.getDeprecationNotice())
			.type(nonNull(buildReferenceSchemaObject(entitySchema, referenceSchema)))
			.build();
	}

	@Nonnull
	private OpenApiTypeReference buildReferenceSchemaObject(@Nonnull EntitySchemaContract entitySchema,
	                                                        @Nonnull ReferenceSchemaContract referenceSchema) {
		final OpenApiObject referenceSchemaObject = ReferenceSchemaDescriptor.THIS_SPECIFIC
			.to(objectBuilderTransformer)
			.name(ReferenceSchemaDescriptor.THIS_SPECIFIC.name(referenceSchema))
			.property(buildReferencedAttributeSchemasProperty(entitySchema, referenceSchema))
			.build();

		return buildingContext.registerType(referenceSchemaObject);
	}

	@Nonnull
	private OpenApiProperty buildReferencedAttributeSchemasProperty(@Nonnull EntitySchemaContract entitySchema,
	                                                                @Nonnull ReferenceSchemaContract referenceSchema) {
		return ReferenceSchemaDescriptor.ATTRIBUTES
			.to(propertyBuilderTransformer)
			.type(nonNull(buildReferencedAttributeSchemasObject(entitySchema, referenceSchema)))
			.build();
	}

	@Nonnull
	private OpenApiTypeReference buildReferencedAttributeSchemasObject(@Nonnull EntitySchemaContract entitySchema,
	                                                                   @Nonnull ReferenceSchemaContract referenceSchema) {
		final OpenApiObject.Builder attributeSchemasObjectBuilder = AttributeSchemasDescriptor.THIS
			.to(objectBuilderTransformer)
			.name(AttributeSchemasDescriptor.THIS.name(entitySchema, referenceSchema));

		entitySchema.getAttributes().values().forEach(attributeSchema ->
			attributeSchemasObjectBuilder.property(buildAttributeSchemaProperty(attributeSchema)));

		return buildingContext.registerType(attributeSchemasObjectBuilder.build());
	}
}
