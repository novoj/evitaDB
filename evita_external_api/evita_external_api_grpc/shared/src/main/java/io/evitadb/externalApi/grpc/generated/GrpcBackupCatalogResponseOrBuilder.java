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
// source: GrpcEvitaSessionAPI.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcBackupCatalogResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcBackupCatalogResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the task that is used to backup the catalog and getting its progress
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcTaskStatus taskStatus = 1;</code>
   * @return Whether the taskStatus field is set.
   */
  boolean hasTaskStatus();
  /**
   * <pre>
   * the task that is used to backup the catalog and getting its progress
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcTaskStatus taskStatus = 1;</code>
   * @return The taskStatus.
   */
  io.evitadb.externalApi.grpc.generated.GrpcTaskStatus getTaskStatus();
  /**
   * <pre>
   * the task that is used to backup the catalog and getting its progress
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcTaskStatus taskStatus = 1;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcTaskStatusOrBuilder getTaskStatusOrBuilder();
}