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
// source: GrpcEvitaSessionAPI.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcTransactionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcTransactionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The current version of the catalog the transaction is bound to.
   * </pre>
   *
   * <code>int64 catalogVersion = 1;</code>
   * @return The catalogVersion.
   */
  long getCatalogVersion();

  /**
   * <pre>
   * The id of the opened transaction.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcUuid transactionId = 2;</code>
   * @return Whether the transactionId field is set.
   */
  boolean hasTransactionId();
  /**
   * <pre>
   * The id of the opened transaction.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcUuid transactionId = 2;</code>
   * @return The transactionId.
   */
  io.evitadb.externalApi.grpc.generated.GrpcUuid getTransactionId();
  /**
   * <pre>
   * The id of the opened transaction.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcUuid transactionId = 2;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcUuidOrBuilder getTransactionIdOrBuilder();
}
