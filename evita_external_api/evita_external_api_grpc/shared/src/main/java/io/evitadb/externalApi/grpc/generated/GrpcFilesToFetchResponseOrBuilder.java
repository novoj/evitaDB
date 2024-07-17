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
// source: GrpcEvitaManagementAPI.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcFilesToFetchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcFilesToFetchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The size of the page.
   * </pre>
   *
   * <code>int32 pageSize = 1;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The number of the page.
   * </pre>
   *
   * <code>int32 pageNumber = 2;</code>
   * @return The pageNumber.
   */
  int getPageNumber();

  /**
   * <pre>
   * Collection of files to fetch.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFile filesToFetch = 3;</code>
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcFile>
      getFilesToFetchList();
  /**
   * <pre>
   * Collection of files to fetch.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFile filesToFetch = 3;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcFile getFilesToFetch(int index);
  /**
   * <pre>
   * Collection of files to fetch.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFile filesToFetch = 3;</code>
   */
  int getFilesToFetchCount();
  /**
   * <pre>
   * Collection of files to fetch.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFile filesToFetch = 3;</code>
   */
  java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcFileOrBuilder>
      getFilesToFetchOrBuilderList();
  /**
   * <pre>
   * Collection of files to fetch.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFile filesToFetch = 3;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcFileOrBuilder getFilesToFetchOrBuilder(
      int index);

  /**
   * <pre>
   * Total number of files to fetch.
   * </pre>
   *
   * <code>int32 totalNumberOfRecords = 4;</code>
   * @return The totalNumberOfRecords.
   */
  int getTotalNumberOfRecords();
}
