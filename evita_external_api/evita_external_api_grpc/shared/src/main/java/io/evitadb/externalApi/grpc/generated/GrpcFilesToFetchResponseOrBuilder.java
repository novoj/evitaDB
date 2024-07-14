// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcEvitaAPI.proto

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