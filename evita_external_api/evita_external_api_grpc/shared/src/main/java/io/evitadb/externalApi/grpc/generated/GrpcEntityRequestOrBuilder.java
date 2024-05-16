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

public interface GrpcEntityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcEntityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The primary key of the entity.
   * </pre>
   *
   * <code>int32 primaryKey = 1;</code>
   * @return The primaryKey.
   */
  int getPrimaryKey();

  /**
   * <pre>
   * The entity type of the entity.
   * </pre>
   *
   * <code>string entityType = 2;</code>
   * @return The entityType.
   */
  java.lang.String getEntityType();
  /**
   * <pre>
   * The entity type of the entity.
   * </pre>
   *
   * <code>string entityType = 2;</code>
   * @return The bytes for entityType.
   */
  com.google.protobuf.ByteString
      getEntityTypeBytes();

  /**
   * <pre>
   * The string part of the parametrised query require part.
   * </pre>
   *
   * <code>string require = 3;</code>
   * @return The require.
   */
  java.lang.String getRequire();
  /**
   * <pre>
   * The string part of the parametrised query require part.
   * </pre>
   *
   * <code>string require = 3;</code>
   * @return The bytes for require.
   */
  com.google.protobuf.ByteString
      getRequireBytes();

  /**
   * <pre>
   * The positional query parameters.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcQueryParam positionalQueryParams = 4;</code>
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcQueryParam>
      getPositionalQueryParamsList();
  /**
   * <pre>
   * The positional query parameters.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcQueryParam positionalQueryParams = 4;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcQueryParam getPositionalQueryParams(int index);
  /**
   * <pre>
   * The positional query parameters.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcQueryParam positionalQueryParams = 4;</code>
   */
  int getPositionalQueryParamsCount();
  /**
   * <pre>
   * The positional query parameters.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcQueryParam positionalQueryParams = 4;</code>
   */
  java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcQueryParamOrBuilder>
      getPositionalQueryParamsOrBuilderList();
  /**
   * <pre>
   * The positional query parameters.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcQueryParam positionalQueryParams = 4;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcQueryParamOrBuilder getPositionalQueryParamsOrBuilder(
      int index);

  /**
   * <pre>
   * The named query parameters.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcQueryParam&gt; namedQueryParams = 5;</code>
   */
  int getNamedQueryParamsCount();
  /**
   * <pre>
   * The named query parameters.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcQueryParam&gt; namedQueryParams = 5;</code>
   */
  boolean containsNamedQueryParams(
      java.lang.String key);
  /**
   * Use {@link #getNamedQueryParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcQueryParam>
  getNamedQueryParams();
  /**
   * <pre>
   * The named query parameters.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcQueryParam&gt; namedQueryParams = 5;</code>
   */
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcQueryParam>
  getNamedQueryParamsMap();
  /**
   * <pre>
   * The named query parameters.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcQueryParam&gt; namedQueryParams = 5;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcQueryParam getNamedQueryParamsOrDefault(
      java.lang.String key,
      io.evitadb.externalApi.grpc.generated.GrpcQueryParam defaultValue);
  /**
   * <pre>
   * The named query parameters.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcQueryParam&gt; namedQueryParams = 5;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcQueryParam getNamedQueryParamsOrThrow(
      java.lang.String key);
}
