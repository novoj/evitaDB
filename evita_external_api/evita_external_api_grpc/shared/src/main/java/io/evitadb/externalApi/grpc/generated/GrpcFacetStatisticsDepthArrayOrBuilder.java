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
// source: GrpcEvitaDataTypes.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcFacetStatisticsDepthArrayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcFacetStatisticsDepthArray)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Value that supports storing a FacetStatisticsDepth array.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetStatisticsDepth value = 1;</code>
   * @return A list containing the value.
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcFacetStatisticsDepth> getValueList();
  /**
   * <pre>
   * Value that supports storing a FacetStatisticsDepth array.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetStatisticsDepth value = 1;</code>
   * @return The count of value.
   */
  int getValueCount();
  /**
   * <pre>
   * Value that supports storing a FacetStatisticsDepth array.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetStatisticsDepth value = 1;</code>
   * @param index The index of the element to return.
   * @return The value at the given index.
   */
  io.evitadb.externalApi.grpc.generated.GrpcFacetStatisticsDepth getValue(int index);
  /**
   * <pre>
   * Value that supports storing a FacetStatisticsDepth array.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetStatisticsDepth value = 1;</code>
   * @return A list containing the enum numeric values on the wire for value.
   */
  java.util.List<java.lang.Integer>
  getValueValueList();
  /**
   * <pre>
   * Value that supports storing a FacetStatisticsDepth array.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetStatisticsDepth value = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of value at the given index.
   */
  int getValueValue(int index);
}
