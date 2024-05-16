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
// source: GrpcExtraResults.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcExtraResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcExtraResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returns computed histograms for specific attributes based on filter constraints.
   * A histogram is an approximate representation of the distribution of numerical data. For detailed description please
   * see [WikiPedia](https://en.wikipedia.org/wiki/Histogram).
   * Histogram can be computed only for numeric based properties. It visualises which property values are more common
   * in the returned data set and which are rare. Bucket count will never exceed requested bucket count specified in
   * `requestedCount` but there
   * may be less of them if there is no enough data for computation. Bucket thresholds are specified heuristically so that
   * there are as few "empty buckets" as possible.
   * - buckets are defined by their lower bounds (inclusive)
   * - the upper bound is the lower bound of the next bucket
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHistogram&gt; attributeHistogram = 1;</code>
   */
  int getAttributeHistogramCount();
  /**
   * <pre>
   * Returns computed histograms for specific attributes based on filter constraints.
   * A histogram is an approximate representation of the distribution of numerical data. For detailed description please
   * see [WikiPedia](https://en.wikipedia.org/wiki/Histogram).
   * Histogram can be computed only for numeric based properties. It visualises which property values are more common
   * in the returned data set and which are rare. Bucket count will never exceed requested bucket count specified in
   * `requestedCount` but there
   * may be less of them if there is no enough data for computation. Bucket thresholds are specified heuristically so that
   * there are as few "empty buckets" as possible.
   * - buckets are defined by their lower bounds (inclusive)
   * - the upper bound is the lower bound of the next bucket
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHistogram&gt; attributeHistogram = 1;</code>
   */
  boolean containsAttributeHistogram(
      java.lang.String key);
  /**
   * Use {@link #getAttributeHistogramMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcHistogram>
  getAttributeHistogram();
  /**
   * <pre>
   * Returns computed histograms for specific attributes based on filter constraints.
   * A histogram is an approximate representation of the distribution of numerical data. For detailed description please
   * see [WikiPedia](https://en.wikipedia.org/wiki/Histogram).
   * Histogram can be computed only for numeric based properties. It visualises which property values are more common
   * in the returned data set and which are rare. Bucket count will never exceed requested bucket count specified in
   * `requestedCount` but there
   * may be less of them if there is no enough data for computation. Bucket thresholds are specified heuristically so that
   * there are as few "empty buckets" as possible.
   * - buckets are defined by their lower bounds (inclusive)
   * - the upper bound is the lower bound of the next bucket
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHistogram&gt; attributeHistogram = 1;</code>
   */
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcHistogram>
  getAttributeHistogramMap();
  /**
   * <pre>
   * Returns computed histograms for specific attributes based on filter constraints.
   * A histogram is an approximate representation of the distribution of numerical data. For detailed description please
   * see [WikiPedia](https://en.wikipedia.org/wiki/Histogram).
   * Histogram can be computed only for numeric based properties. It visualises which property values are more common
   * in the returned data set and which are rare. Bucket count will never exceed requested bucket count specified in
   * `requestedCount` but there
   * may be less of them if there is no enough data for computation. Bucket thresholds are specified heuristically so that
   * there are as few "empty buckets" as possible.
   * - buckets are defined by their lower bounds (inclusive)
   * - the upper bound is the lower bound of the next bucket
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHistogram&gt; attributeHistogram = 1;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcHistogram getAttributeHistogramOrDefault(
      java.lang.String key,
      io.evitadb.externalApi.grpc.generated.GrpcHistogram defaultValue);
  /**
   * <pre>
   * Returns computed histograms for specific attributes based on filter constraints.
   * A histogram is an approximate representation of the distribution of numerical data. For detailed description please
   * see [WikiPedia](https://en.wikipedia.org/wiki/Histogram).
   * Histogram can be computed only for numeric based properties. It visualises which property values are more common
   * in the returned data set and which are rare. Bucket count will never exceed requested bucket count specified in
   * `requestedCount` but there
   * may be less of them if there is no enough data for computation. Bucket thresholds are specified heuristically so that
   * there are as few "empty buckets" as possible.
   * - buckets are defined by their lower bounds (inclusive)
   * - the upper bound is the lower bound of the next bucket
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHistogram&gt; attributeHistogram = 1;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcHistogram getAttributeHistogramOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Returns computed histogram for prices satisfactory to filter constraints.
   * A histogram is an approximate representation of the distribution of numerical data. For detailed description please
   * see [WikiPedia](https://en.wikipedia.org/wiki/Histogram).
   * Histogram can be computed only for numeric based properties. It visualises which property values are more common
   * in the returned data set and which are rare. Bucket count will never exceed requested bucket count specified in
   * `requestedCount` but there
   * may be less of them if there is no enough data for computation. Bucket thresholds are specified heuristically so that
   * there are as few "empty buckets" as possible.
   * - buckets are defined by their lower bounds (inclusive)
   * - the upper bound is the lower bound of the next bucket
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcHistogram priceHistogram = 2;</code>
   * @return Whether the priceHistogram field is set.
   */
  boolean hasPriceHistogram();
  /**
   * <pre>
   * Returns computed histogram for prices satisfactory to filter constraints.
   * A histogram is an approximate representation of the distribution of numerical data. For detailed description please
   * see [WikiPedia](https://en.wikipedia.org/wiki/Histogram).
   * Histogram can be computed only for numeric based properties. It visualises which property values are more common
   * in the returned data set and which are rare. Bucket count will never exceed requested bucket count specified in
   * `requestedCount` but there
   * may be less of them if there is no enough data for computation. Bucket thresholds are specified heuristically so that
   * there are as few "empty buckets" as possible.
   * - buckets are defined by their lower bounds (inclusive)
   * - the upper bound is the lower bound of the next bucket
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcHistogram priceHistogram = 2;</code>
   * @return The priceHistogram.
   */
  io.evitadb.externalApi.grpc.generated.GrpcHistogram getPriceHistogram();
  /**
   * <pre>
   * Returns computed histogram for prices satisfactory to filter constraints.
   * A histogram is an approximate representation of the distribution of numerical data. For detailed description please
   * see [WikiPedia](https://en.wikipedia.org/wiki/Histogram).
   * Histogram can be computed only for numeric based properties. It visualises which property values are more common
   * in the returned data set and which are rare. Bucket count will never exceed requested bucket count specified in
   * `requestedCount` but there
   * may be less of them if there is no enough data for computation. Bucket thresholds are specified heuristically so that
   * there are as few "empty buckets" as possible.
   * - buckets are defined by their lower bounds (inclusive)
   * - the upper bound is the lower bound of the next bucket
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcHistogram priceHistogram = 2;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcHistogramOrBuilder getPriceHistogramOrBuilder();

  /**
   * <pre>
   * Contains a collection of FacetGroupStatistics DTOs where each of them contains information about single facet group
   * (if they belong in one) and statistics of the facets that relates to it.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics facetGroupStatistics = 3;</code>
   */
  java.util.List<io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics>
      getFacetGroupStatisticsList();
  /**
   * <pre>
   * Contains a collection of FacetGroupStatistics DTOs where each of them contains information about single facet group
   * (if they belong in one) and statistics of the facets that relates to it.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics facetGroupStatistics = 3;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics getFacetGroupStatistics(int index);
  /**
   * <pre>
   * Contains a collection of FacetGroupStatistics DTOs where each of them contains information about single facet group
   * (if they belong in one) and statistics of the facets that relates to it.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics facetGroupStatistics = 3;</code>
   */
  int getFacetGroupStatisticsCount();
  /**
   * <pre>
   * Contains a collection of FacetGroupStatistics DTOs where each of them contains information about single facet group
   * (if they belong in one) and statistics of the facets that relates to it.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics facetGroupStatistics = 3;</code>
   */
  java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsOrBuilder>
      getFacetGroupStatisticsOrBuilderList();
  /**
   * <pre>
   * Contains a collection of FacetGroupStatistics DTOs where each of them contains information about single facet group
   * (if they belong in one) and statistics of the facets that relates to it.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics facetGroupStatistics = 3;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsOrBuilder getFacetGroupStatisticsOrBuilder(
      int index);

  /**
   * <pre>
   * Contains list of statistics for the single level (probably root or whatever is filtered by the query) of
   * the queried hierarchy entity.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcHierarchy selfHierarchy = 4;</code>
   * @return Whether the selfHierarchy field is set.
   */
  boolean hasSelfHierarchy();
  /**
   * <pre>
   * Contains list of statistics for the single level (probably root or whatever is filtered by the query) of
   * the queried hierarchy entity.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcHierarchy selfHierarchy = 4;</code>
   * @return The selfHierarchy.
   */
  io.evitadb.externalApi.grpc.generated.GrpcHierarchy getSelfHierarchy();
  /**
   * <pre>
   * Contains list of statistics for the single level (probably root or whatever is filtered by the query) of
   * the queried hierarchy entity.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcHierarchy selfHierarchy = 4;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcHierarchyOrBuilder getSelfHierarchyOrBuilder();

  /**
   * <pre>
   * Index holds the statistics for particular references that target hierarchy entity types.
   * Key is the identification of the reference name, value contains list of statistics for the single level (probably
   * root or whatever is filtered by the query) of the hierarchy entity.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHierarchy&gt; hierarchy = 5;</code>
   */
  int getHierarchyCount();
  /**
   * <pre>
   * Index holds the statistics for particular references that target hierarchy entity types.
   * Key is the identification of the reference name, value contains list of statistics for the single level (probably
   * root or whatever is filtered by the query) of the hierarchy entity.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHierarchy&gt; hierarchy = 5;</code>
   */
  boolean containsHierarchy(
      java.lang.String key);
  /**
   * Use {@link #getHierarchyMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcHierarchy>
  getHierarchy();
  /**
   * <pre>
   * Index holds the statistics for particular references that target hierarchy entity types.
   * Key is the identification of the reference name, value contains list of statistics for the single level (probably
   * root or whatever is filtered by the query) of the hierarchy entity.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHierarchy&gt; hierarchy = 5;</code>
   */
  java.util.Map<java.lang.String, io.evitadb.externalApi.grpc.generated.GrpcHierarchy>
  getHierarchyMap();
  /**
   * <pre>
   * Index holds the statistics for particular references that target hierarchy entity types.
   * Key is the identification of the reference name, value contains list of statistics for the single level (probably
   * root or whatever is filtered by the query) of the hierarchy entity.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHierarchy&gt; hierarchy = 5;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcHierarchy getHierarchyOrDefault(
      java.lang.String key,
      io.evitadb.externalApi.grpc.generated.GrpcHierarchy defaultValue);
  /**
   * <pre>
   * Index holds the statistics for particular references that target hierarchy entity types.
   * Key is the identification of the reference name, value contains list of statistics for the single level (probably
   * root or whatever is filtered by the query) of the hierarchy entity.
   * </pre>
   *
   * <code>map&lt;string, .io.evitadb.externalApi.grpc.generated.GrpcHierarchy&gt; hierarchy = 5;</code>
   */

  io.evitadb.externalApi.grpc.generated.GrpcHierarchy getHierarchyOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * This DTO contains detailed information about query processing time and its decomposition to single operations.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcQueryTelemetry queryTelemetry = 6;</code>
   * @return Whether the queryTelemetry field is set.
   */
  boolean hasQueryTelemetry();
  /**
   * <pre>
   * This DTO contains detailed information about query processing time and its decomposition to single operations.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcQueryTelemetry queryTelemetry = 6;</code>
   * @return The queryTelemetry.
   */
  io.evitadb.externalApi.grpc.generated.GrpcQueryTelemetry getQueryTelemetry();
  /**
   * <pre>
   * This DTO contains detailed information about query processing time and its decomposition to single operations.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcQueryTelemetry queryTelemetry = 6;</code>
   */
  io.evitadb.externalApi.grpc.generated.GrpcQueryTelemetryOrBuilder getQueryTelemetryOrBuilder();
}
