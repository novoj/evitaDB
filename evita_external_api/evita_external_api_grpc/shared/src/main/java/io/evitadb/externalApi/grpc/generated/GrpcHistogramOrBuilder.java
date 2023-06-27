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
 *   https://github.com/FgForrest/evitaDB/blob/main/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcExtraResults.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcHistogramOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcHistogram)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcBigDecimal min = 1;</code>
   * @return Whether the min field is set.
   */
  boolean hasMin();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcBigDecimal min = 1;</code>
   * @return The min.
   */
  io.evitadb.externalApi.grpc.generated.GrpcBigDecimal getMin();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcBigDecimal min = 1;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcBigDecimalOrBuilder getMinOrBuilder();

  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcBigDecimal max = 2;</code>
   * @return Whether the max field is set.
   */
  boolean hasMax();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcBigDecimal max = 2;</code>
   * @return The max.
   */
  io.evitadb.externalApi.grpc.generated.GrpcBigDecimal getMax();
  /**
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcBigDecimal max = 2;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcBigDecimalOrBuilder getMaxOrBuilder();

  /**
   * <code>int32 overallCount = 3;</code>
   * @return The overallCount.
   */
  int getOverallCount();

  /**
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucket buckets = 4;</code>
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucket> 
      getBucketsList();
  /**
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucket buckets = 4;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucket getBuckets(int index);
  /**
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucket buckets = 4;</code>
   */
  int getBucketsCount();
  /**
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucket buckets = 4;</code>
   */
  java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucketOrBuilder> 
      getBucketsOrBuilderList();
  /**
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucket buckets = 4;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcHistogram.GrpcBucketOrBuilder getBucketsOrBuilder(
      int index);
}
