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
// source: GrpcEntity.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcBinaryEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcBinaryEntity)
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
   * Contains version of this entity schema and gets increased with any entity type update. Allows to execute
   * optimistic locking i.e. avoiding parallel modifications.
   * </pre>
   *
   * <code>int32 schemaVersion = 3;</code>
   * @return The schemaVersion.
   */
  int getSchemaVersion();

  /**
   * <pre>
   * Serialized representation of the entity body.
   * </pre>
   *
   * <code>bytes entityStoragePart = 4;</code>
   * @return The entityStoragePart.
   */
  com.google.protobuf.ByteString getEntityStoragePart();

  /**
   * <pre>
   * Serialized representation of entity attributes.
   * </pre>
   *
   * <code>repeated bytes attributeStorageParts = 5;</code>
   * @return A list containing the attributeStorageParts.
   */
  java.util.List<com.google.protobuf.ByteString> getAttributeStoragePartsList();
  /**
   * <pre>
   * Serialized representation of entity attributes.
   * </pre>
   *
   * <code>repeated bytes attributeStorageParts = 5;</code>
   * @return The count of attributeStorageParts.
   */
  int getAttributeStoragePartsCount();
  /**
   * <pre>
   * Serialized representation of entity attributes.
   * </pre>
   *
   * <code>repeated bytes attributeStorageParts = 5;</code>
   * @param index The index of the element to return.
   * @return The attributeStorageParts at the given index.
   */
  com.google.protobuf.ByteString getAttributeStorageParts(int index);

  /**
   * <pre>
   * Serialized representation of entity associated data.
   * </pre>
   *
   * <code>repeated bytes associatedDataStorageParts = 6;</code>
   * @return A list containing the associatedDataStorageParts.
   */
  java.util.List<com.google.protobuf.ByteString> getAssociatedDataStoragePartsList();
  /**
   * <pre>
   * Serialized representation of entity associated data.
   * </pre>
   *
   * <code>repeated bytes associatedDataStorageParts = 6;</code>
   * @return The count of associatedDataStorageParts.
   */
  int getAssociatedDataStoragePartsCount();
  /**
   * <pre>
   * Serialized representation of entity associated data.
   * </pre>
   *
   * <code>repeated bytes associatedDataStorageParts = 6;</code>
   * @param index The index of the element to return.
   * @return The associatedDataStorageParts at the given index.
   */
  com.google.protobuf.ByteString getAssociatedDataStorageParts(int index);

  /**
   * <pre>
   * Serialized representation of entity prices.
   * </pre>
   *
   * <code>bytes priceStoragePart = 7;</code>
   * @return The priceStoragePart.
   */
  com.google.protobuf.ByteString getPriceStoragePart();

  /**
   * <pre>
   * Serialized representation of entity references.
   * </pre>
   *
   * <code>bytes referenceStoragePart = 8;</code>
   * @return The referenceStoragePart.
   */
  com.google.protobuf.ByteString getReferenceStoragePart();
}
