/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2023-2024
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
// source: GrpcEntity.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcSealedEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcSealedEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of entity.
   * Entity type is main sharding key - all data of entities with same type are stored in separated collections. Within the
   * entity type entity is uniquely represented by primary key.
   * </pre>
   *
   * <code>string entityType = 1;</code>
   * @return The entityType.
   */
  java.lang.String getEntityType();
  /**
   * <pre>
   * Type of entity.
   * Entity type is main sharding key - all data of entities with same type are stored in separated collections. Within the
   * entity type entity is uniquely represented by primary key.
   * </pre>
   *
   * <code>string entityType = 1;</code>
   * @return The bytes for entityType.
   */
  com.google.protobuf.ByteString
      getEntityTypeBytes();

  /**
   * <pre>
   * Unique Integer positive number representing the entity. Can be used for fast lookup for
   * entity (entities). Primary key must be unique within the same entity type.
   * </pre>
   *
   * <code>int32 primaryKey = 2;</code>
   * @return The primaryKey.
   */
  int getPrimaryKey();

  /**
   * <pre>
   * Contains version of this entity and gets increased with any entity type update. Allows to execute
   * optimistic locking i.e. avoiding parallel modifications.
   * </pre>
   *
   * <code>int32 version = 3;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <pre>
   * Contains version of this entity schema and gets increased with any entity type update. Allows to execute
   * optimistic locking i.e. avoiding parallel modifications.
   * </pre>
   *
   * <code>int32 schemaVersion = 4;</code>
   * @return The schemaVersion.
   */
  int getSchemaVersion();

  /**
   * <pre>
   * Primary key of parent entity.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value parent = 5;</code>
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   * <pre>
   * Primary key of parent entity.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value parent = 5;</code>
   * @return The parent.
   */
  com.google.protobuf.Int32Value getParent();
  /**
   * <pre>
   * Primary key of parent entity.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value parent = 5;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getParentOrBuilder();

  /**
   * <pre>
   * A parent entity reference with its parent hierarchy chain.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntityReferenceWithParent parentReference = 6;</code>
   * @return Whether the parentReference field is set.
   */
  boolean hasParentReference();
  /**
   * <pre>
   * A parent entity reference with its parent hierarchy chain.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntityReferenceWithParent parentReference = 6;</code>
   * @return The parentReference.
   */
  io.evitadb.externalApi.grpc.generated.GrpcEntityReferenceWithParent getParentReference();
  /**
   * <pre>
   * A parent entity reference with its parent hierarchy chain.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntityReferenceWithParent parentReference = 6;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcEntityReferenceWithParentOrBuilder getParentReferenceOrBuilder();

  /**
   * <pre>
   * A parent entity with its parent hierarchy chain.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcSealedEntity parentEntity = 7;</code>
   * @return Whether the parentEntity field is set.
   */
  boolean hasParentEntity();
  /**
   * <pre>
   * A parent entity with its parent hierarchy chain.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcSealedEntity parentEntity = 7;</code>
   * @return The parentEntity.
   */
  io.evitadb.externalApi.grpc.generated.GrpcSealedEntity getParentEntity();
  /**
   * <pre>
   * A parent entity with its parent hierarchy chain.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcSealedEntity parentEntity = 7;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcSealedEntityOrBuilder getParentEntityOrBuilder();

  /**
   * <pre>
   * Contains global attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaValue&gt; globalAttributes = 8;</code>
   */
  int getGlobalAttributesCount();
  /**
   * <pre>
   * Contains global attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaValue&gt; globalAttributes = 8;</code>
   */
  boolean containsGlobalAttributes(
      java.lang.String key);
  /**
   * Use {@link #getGlobalAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcEvitaValue>
  getGlobalAttributes();
  /**
   * <pre>
   * Contains global attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaValue&gt; globalAttributes = 8;</code>
   */
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcEvitaValue>
  getGlobalAttributesMap();
  /**
   * <pre>
   * Contains global attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaValue&gt; globalAttributes = 8;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcEvitaValue getGlobalAttributesOrDefault(
      java.lang.String key,
      io.evitadb.externalApi.grpc.generated.GrpcEvitaValue defaultValue);
  /**
   * <pre>
   * Contains global attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaValue&gt; globalAttributes = 8;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcEvitaValue getGlobalAttributesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Contains localized attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute&gt; localizedAttributes = 9;</code>
   */
  int getLocalizedAttributesCount();
  /**
   * <pre>
   * Contains localized attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute&gt; localizedAttributes = 9;</code>
   */
  boolean containsLocalizedAttributes(
      java.lang.String key);
  /**
   * Use {@link #getLocalizedAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute>
  getLocalizedAttributes();
  /**
   * <pre>
   * Contains localized attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute&gt; localizedAttributes = 9;</code>
   */
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute>
  getLocalizedAttributesMap();
  /**
   * <pre>
   * Contains localized attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute&gt; localizedAttributes = 9;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute getLocalizedAttributesOrDefault(
      java.lang.String key,
      io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute defaultValue);
  /**
   * <pre>
   * Contains localized attributes.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute&gt; localizedAttributes = 9;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcLocalizedAttribute getLocalizedAttributesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Prices allows defining set of prices of entity for complex filtering and ordering.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcPrice prices = 10;</code>
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcPrice>
      getPricesList();
  /**
   * <pre>
   * Prices allows defining set of prices of entity for complex filtering and ordering.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcPrice prices = 10;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcPrice getPrices(int index);
  /**
   * <pre>
   * Prices allows defining set of prices of entity for complex filtering and ordering.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcPrice prices = 10;</code>
   */
  int getPricesCount();
  /**
   * <pre>
   * Prices allows defining set of prices of entity for complex filtering and ordering.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcPrice prices = 10;</code>
   */
  java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcPriceOrBuilder>
      getPricesOrBuilderList();
  /**
   * <pre>
   * Prices allows defining set of prices of entity for complex filtering and ordering.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcPrice prices = 10;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcPriceOrBuilder getPricesOrBuilder(
      int index);

  /**
   * <pre>
   * Price for which the entity should be sold. This method can be used only when appropriate
   * price related constraints are present so that `currency` and `priceList` priority can be extracted from the query.
   * The moment is either extracted from the query as well (if present) or current date and time is used.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcPrice priceForSale = 11;</code>
   * @return Whether the priceForSale field is set.
   */
  boolean hasPriceForSale();
  /**
   * <pre>
   * Price for which the entity should be sold. This method can be used only when appropriate
   * price related constraints are present so that `currency` and `priceList` priority can be extracted from the query.
   * The moment is either extracted from the query as well (if present) or current date and time is used.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcPrice priceForSale = 11;</code>
   * @return The priceForSale.
   */
  io.evitadb.externalApi.grpc.generated.GrpcPrice getPriceForSale();
  /**
   * <pre>
   * Price for which the entity should be sold. This method can be used only when appropriate
   * price related constraints are present so that `currency` and `priceList` priority can be extracted from the query.
   * The moment is either extracted from the query as well (if present) or current date and time is used.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcPrice priceForSale = 11;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcPriceOrBuilder getPriceForSaleOrBuilder();

  /**
   * <pre>
   * Price inner record handling controls how prices that share same `inner entity id` will behave during filtering and sorting.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcPriceInnerRecordHandling priceInnerRecordHandling = 12;</code>
   * @return The enum numeric value on the wire for priceInnerRecordHandling.
   */
  int getPriceInnerRecordHandlingValue();
  /**
   * <pre>
   * Price inner record handling controls how prices that share same `inner entity id` will behave during filtering and sorting.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcPriceInnerRecordHandling priceInnerRecordHandling = 12;</code>
   * @return The priceInnerRecordHandling.
   */
  io.evitadb.externalApi.grpc.generated.GrpcPriceInnerRecordHandling getPriceInnerRecordHandling();

  /**
   * <pre>
   * Returns a collection of References of this entity. The references represent relations to other evitaDB
   * entities or external entities in different systems.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcReference references = 13;</code>
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcReference>
      getReferencesList();
  /**
   * <pre>
   * Returns a collection of References of this entity. The references represent relations to other evitaDB
   * entities or external entities in different systems.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcReference references = 13;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcReference getReferences(int index);
  /**
   * <pre>
   * Returns a collection of References of this entity. The references represent relations to other evitaDB
   * entities or external entities in different systems.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcReference references = 13;</code>
   */
  int getReferencesCount();
  /**
   * <pre>
   * Returns a collection of References of this entity. The references represent relations to other evitaDB
   * entities or external entities in different systems.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcReference references = 13;</code>
   */
  java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcReferenceOrBuilder>
      getReferencesOrBuilderList();
  /**
   * <pre>
   * Returns a collection of References of this entity. The references represent relations to other evitaDB
   * entities or external entities in different systems.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcReference references = 13;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcReferenceOrBuilder getReferencesOrBuilder(
      int index);

  /**
   * <pre>
   * Contains global associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue&gt; globalAssociatedData = 14;</code>
   */
  int getGlobalAssociatedDataCount();
  /**
   * <pre>
   * Contains global associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue&gt; globalAssociatedData = 14;</code>
   */
  boolean containsGlobalAssociatedData(
      java.lang.String key);
  /**
   * Use {@link #getGlobalAssociatedDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue>
  getGlobalAssociatedData();
  /**
   * <pre>
   * Contains global associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue&gt; globalAssociatedData = 14;</code>
   */
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue>
  getGlobalAssociatedDataMap();
  /**
   * <pre>
   * Contains global associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue&gt; globalAssociatedData = 14;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue getGlobalAssociatedDataOrDefault(
      java.lang.String key,
      io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue defaultValue);
  /**
   * <pre>
   * Contains global associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue&gt; globalAssociatedData = 14;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcEvitaAssociatedDataValue getGlobalAssociatedDataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Contains localized associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData&gt; localizedAssociatedData = 15;</code>
   */
  int getLocalizedAssociatedDataCount();
  /**
   * <pre>
   * Contains localized associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData&gt; localizedAssociatedData = 15;</code>
   */
  boolean containsLocalizedAssociatedData(
      java.lang.String key);
  /**
   * Use {@link #getLocalizedAssociatedDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData>
  getLocalizedAssociatedData();
  /**
   * <pre>
   * Contains localized associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData&gt; localizedAssociatedData = 15;</code>
   */
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData>
  getLocalizedAssociatedDataMap();
  /**
   * <pre>
   * Contains localized associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData&gt; localizedAssociatedData = 15;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData getLocalizedAssociatedDataOrDefault(
      java.lang.String key,
      io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData defaultValue);
  /**
   * <pre>
   * Contains localized associated data.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData&gt; localizedAssociatedData = 15;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcLocalizedAssociatedData getLocalizedAssociatedDataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Contains set of all locales that were used for localized attributes or associated data of
   * this particular entity.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 16;</code>
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcLocale>
      getLocalesList();
  /**
   * <pre>
   * Contains set of all locales that were used for localized attributes or associated data of
   * this particular entity.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 16;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcLocale getLocales(int index);
  /**
   * <pre>
   * Contains set of all locales that were used for localized attributes or associated data of
   * this particular entity.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 16;</code>
   */
  int getLocalesCount();
  /**
   * <pre>
   * Contains set of all locales that were used for localized attributes or associated data of
   * this particular entity.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 16;</code>
   */
  java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder>
      getLocalesOrBuilderList();
  /**
   * <pre>
   * Contains set of all locales that were used for localized attributes or associated data of
   * this particular entity.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 16;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder getLocalesOrBuilder(
      int index);
}
