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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcCatalogSchema.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcGlobalAttributeSchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcGlobalAttributeSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.StringValue description = 2;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>.google.protobuf.StringValue description = 2;</code>
   * @return The description.
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <code>.google.protobuf.StringValue description = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <code>.google.protobuf.StringValue deprecationNotice = 3;</code>
   * @return Whether the deprecationNotice field is set.
   */
  boolean hasDeprecationNotice();
  /**
   * <code>.google.protobuf.StringValue deprecationNotice = 3;</code>
   * @return The deprecationNotice.
   */
  com.google.protobuf.StringValue getDeprecationNotice();
  /**
   * <code>.google.protobuf.StringValue deprecationNotice = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDeprecationNoticeOrBuilder();

  /**
   * <pre>
   * When attribute is unique it is automatically filterable, and it is ensured there is exactly one single entity
   * having certain value of this attribute among other entities in the same collection.
   * As an example of unique attribute can be EAN - there is no sense in having two entities with same EAN, and it's
   * better to have this ensured by the database engine.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcAttributeUniquenessType unique = 4;</code>
   * @return The enum numeric value on the wire for unique.
   */
  int getUniqueValue();
  /**
   * <pre>
   * When attribute is unique it is automatically filterable, and it is ensured there is exactly one single entity
   * having certain value of this attribute among other entities in the same collection.
   * As an example of unique attribute can be EAN - there is no sense in having two entities with same EAN, and it's
   * better to have this ensured by the database engine.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcAttributeUniquenessType unique = 4;</code>
   * @return The unique.
   */
  io.evitadb.externalApi.grpc.generated.GrpcAttributeUniquenessType getUnique();

  /**
   * <pre>
   * When attribute is filterable, it is possible to filter entities by this attribute. Do not mark attribute
   * as filterable unless you know that you'll search entities by this attribute. Each filterable attribute occupies
   * (memory/disk) space in the form of index.
   * When attribute is filterable, extra result `attributeHistogram`
   * can be requested for this attribute.
   * </pre>
   *
   * <code>bool filterable = 5;</code>
   * @return The filterable.
   */
  boolean getFilterable();

  /**
   * <pre>
   * When attribute is sortable, it is possible to sort entities by this attribute. Do not mark attribute
   * as sortable unless you know that you'll sort entities along this attribute. Each sortable attribute occupies
   * (memory/disk) space in the form of index..
   * </pre>
   *
   * <code>bool sortable = 6;</code>
   * @return The sortable.
   */
  boolean getSortable();

  /**
   * <pre>
   * When attribute is localized, it has to be ALWAYS used in connection with specific `Locale`.
   * </pre>
   *
   * <code>bool localized = 7;</code>
   * @return The localized.
   */
  boolean getLocalized();

  /**
   * <pre>
   * When attribute is nullable, its values may be missing in the entities. Otherwise, the system will enforce
   * non-null checks upon upserting of the entity.
   * </pre>
   *
   * <code>bool nullable = 8;</code>
   * @return The nullable.
   */
  boolean getNullable();

  /**
   * <pre>
   * If an attribute is flagged as representative, it should be used in developer tools along with the entity's
   * primary key to describe the entity or reference to that entity. The flag is completely optional and doesn't
   * affect the core functionality of the database in any way. However, if it's used correctly, it can be very
   * helpful to developers in quickly finding their way around the data. There should be very few representative
   * attributes in the entity type, and the unique ones are usually the best to choose.
   * </pre>
   *
   * <code>bool representative = 9;</code>
   * @return The representative.
   */
  boolean getRepresentative();

  /**
   * <pre>
   * Data type of the attribute. Must be one of Evita-supported values.
   * Internally the scalar is converted into Java-corresponding data type.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEvitaDataType type = 10;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Data type of the attribute. Must be one of Evita-supported values.
   * Internally the scalar is converted into Java-corresponding data type.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEvitaDataType type = 10;</code>
   * @return The type.
   */
  io.evitadb.externalApi.grpc.generated.GrpcEvitaDataType getType();

  /**
   * <pre>
   * Default value is used when the entity is created without this attribute specified. Default values allow to pass
   * non-null checks even if no attributes of such name are specified.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEvitaValue defaultValue = 11;</code>
   * @return Whether the defaultValue field is set.
   */
  boolean hasDefaultValue();
  /**
   * <pre>
   * Default value is used when the entity is created without this attribute specified. Default values allow to pass
   * non-null checks even if no attributes of such name are specified.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEvitaValue defaultValue = 11;</code>
   * @return The defaultValue.
   */
  io.evitadb.externalApi.grpc.generated.GrpcEvitaValue getDefaultValue();
  /**
   * <pre>
   * Default value is used when the entity is created without this attribute specified. Default values allow to pass
   * non-null checks even if no attributes of such name are specified.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEvitaValue defaultValue = 11;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcEvitaValueOrBuilder getDefaultValueOrBuilder();

  /**
   * <pre>
   * Determines how many fractional places are important when entities are compared during filtering or sorting. It is
   * significant to know that all values of this attribute will be converted to {&#64;link java.lang.Integer}, so the attribute
   * number must not ever exceed maximum limits of {&#64;link java.lang.Integer} type when scaling the number by the power
   * of ten using `indexedDecimalPlaces` as exponent.
   * </pre>
   *
   * <code>int32 indexedDecimalPlaces = 12;</code>
   * @return The indexedDecimalPlaces.
   */
  int getIndexedDecimalPlaces();

  /**
   * <pre>
   * When attribute is unique globally it is automatically filterable, and it is ensured there is exactly one single
   * entity having certain value of this attribute in entire catalog.
   * As an example of unique attribute can be URL - there is no sense in having two entities with same URL, and it's
   * better to have this ensured by the database engine.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcGlobalAttributeUniquenessType uniqueGlobally = 13;</code>
   * @return The enum numeric value on the wire for uniqueGlobally.
   */
  int getUniqueGloballyValue();
  /**
   * <pre>
   * When attribute is unique globally it is automatically filterable, and it is ensured there is exactly one single
   * entity having certain value of this attribute in entire catalog.
   * As an example of unique attribute can be URL - there is no sense in having two entities with same URL, and it's
   * better to have this ensured by the database engine.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcGlobalAttributeUniquenessType uniqueGlobally = 13;</code>
   * @return The uniqueGlobally.
   */
  io.evitadb.externalApi.grpc.generated.GrpcGlobalAttributeUniquenessType getUniqueGlobally();
}
