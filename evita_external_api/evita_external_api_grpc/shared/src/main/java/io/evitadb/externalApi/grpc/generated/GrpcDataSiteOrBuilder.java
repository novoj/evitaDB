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
// source: GrpcChangeCapture.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcDataSiteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcDataSite)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the name of the intercepted entity type
   * </pre>
   *
   * <code>.google.protobuf.StringValue entityType = 1;</code>
   * @return Whether the entityType field is set.
   */
  boolean hasEntityType();
  /**
   * <pre>
   * the name of the intercepted entity type
   * </pre>
   *
   * <code>.google.protobuf.StringValue entityType = 1;</code>
   * @return The entityType.
   */
  com.google.protobuf.StringValue getEntityType();
  /**
   * <pre>
   * the name of the intercepted entity type
   * </pre>
   *
   * <code>.google.protobuf.StringValue entityType = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getEntityTypeOrBuilder();

  /**
   * <pre>
   * the primary key of the intercepted entity
   * </pre>
   *
   * <code>.google.protobuf.Int32Value entityPrimaryKey = 2;</code>
   * @return Whether the entityPrimaryKey field is set.
   */
  boolean hasEntityPrimaryKey();
  /**
   * <pre>
   * the primary key of the intercepted entity
   * </pre>
   *
   * <code>.google.protobuf.Int32Value entityPrimaryKey = 2;</code>
   * @return The entityPrimaryKey.
   */
  com.google.protobuf.Int32Value getEntityPrimaryKey();
  /**
   * <pre>
   * the primary key of the intercepted entity
   * </pre>
   *
   * <code>.google.protobuf.Int32Value entityPrimaryKey = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getEntityPrimaryKeyOrBuilder();

  /**
   * <pre>
   * the intercepted type of operation
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcOperation operation = 3;</code>
   * @return A list containing the operation.
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcOperation> getOperationList();
  /**
   * <pre>
   * the intercepted type of operation
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcOperation operation = 3;</code>
   * @return The count of operation.
   */
  int getOperationCount();
  /**
   * <pre>
   * the intercepted type of operation
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcOperation operation = 3;</code>
   * @param index The index of the element to return.
   * @return The operation at the given index.
   */
  io.evitadb.externalApi.grpc.generated.GrpcOperation getOperation(int index);
  /**
   * <pre>
   * the intercepted type of operation
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcOperation operation = 3;</code>
   * @return A list containing the enum numeric values on the wire for operation.
   */
  java.util.List<java.lang.Integer>
  getOperationValueList();
  /**
   * <pre>
   * the intercepted type of operation
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcOperation operation = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of operation at the given index.
   */
  int getOperationValue(int index);

  /**
   * <pre>
   * the name of the intercepted container type
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcContainerType containerType = 4;</code>
   * @return A list containing the containerType.
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcContainerType> getContainerTypeList();
  /**
   * <pre>
   * the name of the intercepted container type
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcContainerType containerType = 4;</code>
   * @return The count of containerType.
   */
  int getContainerTypeCount();
  /**
   * <pre>
   * the name of the intercepted container type
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcContainerType containerType = 4;</code>
   * @param index The index of the element to return.
   * @return The containerType at the given index.
   */
  io.evitadb.externalApi.grpc.generated.GrpcContainerType getContainerType(int index);
  /**
   * <pre>
   * the name of the intercepted container type
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcContainerType containerType = 4;</code>
   * @return A list containing the enum numeric values on the wire for containerType.
   */
  java.util.List<java.lang.Integer>
  getContainerTypeValueList();
  /**
   * <pre>
   * the name of the intercepted container type
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcContainerType containerType = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of containerType at the given index.
   */
  int getContainerTypeValue(int index);

  /**
   * <pre>
   * the name of the container (e.g. attribute name, associated data name, reference name)
   * </pre>
   *
   * <code>repeated string classifierName = 5;</code>
   * @return A list containing the classifierName.
   */
  java.util.List<java.lang.String>
      getClassifierNameList();
  /**
   * <pre>
   * the name of the container (e.g. attribute name, associated data name, reference name)
   * </pre>
   *
   * <code>repeated string classifierName = 5;</code>
   * @return The count of classifierName.
   */
  int getClassifierNameCount();
  /**
   * <pre>
   * the name of the container (e.g. attribute name, associated data name, reference name)
   * </pre>
   *
   * <code>repeated string classifierName = 5;</code>
   * @param index The index of the element to return.
   * @return The classifierName at the given index.
   */
  java.lang.String getClassifierName(int index);
  /**
   * <pre>
   * the name of the container (e.g. attribute name, associated data name, reference name)
   * </pre>
   *
   * <code>repeated string classifierName = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the classifierName at the given index.
   */
  com.google.protobuf.ByteString
      getClassifierNameBytes(int index);
}
