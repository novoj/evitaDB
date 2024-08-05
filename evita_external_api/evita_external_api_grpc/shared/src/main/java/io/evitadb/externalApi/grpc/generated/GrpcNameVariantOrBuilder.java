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
// source: GrpcEvitaDataTypes.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcNameVariantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcNameVariant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * naming convention the name is in
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcNamingConvention namingConvention = 1;</code>
   * @return The enum numeric value on the wire for namingConvention.
   */
  int getNamingConventionValue();
  /**
   * <pre>
   * naming convention the name is in
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcNamingConvention namingConvention = 1;</code>
   * @return The namingConvention.
   */
  io.evitadb.externalApi.grpc.generated.GrpcNamingConvention getNamingConvention();

  /**
   * <pre>
   * the name in the particular naming convention
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * the name in the particular naming convention
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}