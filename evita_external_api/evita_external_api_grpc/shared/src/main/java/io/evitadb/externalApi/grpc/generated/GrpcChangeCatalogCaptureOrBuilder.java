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

public interface GrpcChangeCatalogCaptureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcChangeCatalogCapture)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the version of the catalog where the operation was performed
   * </pre>
   *
   * <code>int64 version = 1;</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <pre>
   * the index of the event within the enclosed transaction, index 0 is the transaction lead event
   * </pre>
   *
   * <code>int32 index = 2;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <pre>
   * the area of the operation
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcCaptureArea area = 3;</code>
   * @return The enum numeric value on the wire for area.
   */
  int getAreaValue();
  /**
   * <pre>
   * the area of the operation
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcCaptureArea area = 3;</code>
   * @return The area.
   */
  io.evitadb.externalApi.grpc.generated.GrpcCaptureArea getArea();

  /**
   * <pre>
   * the name of the entity type or its schema that was affected by the operation
   * (if the operation is executed on catalog schema this field is null)
   * </pre>
   *
   * <code>.google.protobuf.StringValue entityType = 4;</code>
   * @return Whether the entityType field is set.
   */
  boolean hasEntityType();
  /**
   * <pre>
   * the name of the entity type or its schema that was affected by the operation
   * (if the operation is executed on catalog schema this field is null)
   * </pre>
   *
   * <code>.google.protobuf.StringValue entityType = 4;</code>
   * @return The entityType.
   */
  com.google.protobuf.StringValue getEntityType();
  /**
   * <pre>
   * the name of the entity type or its schema that was affected by the operation
   * (if the operation is executed on catalog schema this field is null)
   * </pre>
   *
   * <code>.google.protobuf.StringValue entityType = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getEntityTypeOrBuilder();

  /**
   * <pre>
   * the operation that was performed
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcCaptureOperation operation = 5;</code>
   * @return The enum numeric value on the wire for operation.
   */
  int getOperationValue();
  /**
   * <pre>
   * the operation that was performed
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcCaptureOperation operation = 5;</code>
   * @return The operation.
   */
  io.evitadb.externalApi.grpc.generated.GrpcCaptureOperation getOperation();

  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutation schemaMutation = 6;</code>
   * @return Whether the schemaMutation field is set.
   */
  boolean hasSchemaMutation();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutation schemaMutation = 6;</code>
   * @return The schemaMutation.
   */
  io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutation getSchemaMutation();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutation schemaMutation = 6;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutationOrBuilder getSchemaMutationOrBuilder();

  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntityMutation entityMutation = 7;</code>
   * @return Whether the entityMutation field is set.
   */
  boolean hasEntityMutation();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntityMutation entityMutation = 7;</code>
   * @return The entityMutation.
   */
  io.evitadb.externalApi.grpc.generated.GrpcEntityMutation getEntityMutation();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntityMutation entityMutation = 7;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcEntityMutationOrBuilder getEntityMutationOrBuilder();

  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcLocalMutation localMutation = 8;</code>
   * @return Whether the localMutation field is set.
   */
  boolean hasLocalMutation();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcLocalMutation localMutation = 8;</code>
   * @return The localMutation.
   */
  io.evitadb.externalApi.grpc.generated.GrpcLocalMutation getLocalMutation();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcLocalMutation localMutation = 8;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcLocalMutationOrBuilder getLocalMutationOrBuilder();

  public io.evitadb.externalApi.grpc.generated.GrpcChangeCatalogCapture.BodyCase getBodyCase();
}