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

/**
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType}
 */
public final class GrpcFacetGroupStatisticsType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType)
    GrpcFacetGroupStatisticsTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcFacetGroupStatisticsType.newBuilder() to construct.
  private GrpcFacetGroupStatisticsType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcFacetGroupStatisticsType() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcFacetGroupStatisticsType();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcFacetGroupStatisticsType(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              facetGroupStatistics_ = com.google.protobuf.MapField.newMapField(
                  FacetGroupStatisticsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics>
            facetGroupStatistics__ = input.readMessage(
                FacetGroupStatisticsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            facetGroupStatistics_.getMutableMap().put(
                facetGroupStatistics__.getKey(), facetGroupStatistics__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.evitadb.externalApi.grpc.generated.GrpcExtraResultsOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcFacetGroupStatisticsType_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetFacetGroupStatistics();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcExtraResultsOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcFacetGroupStatisticsType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType.class, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType.Builder.class);
  }

  public static final int FACETGROUPSTATISTICS_FIELD_NUMBER = 1;
  private static final class FacetGroupStatisticsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics>newDefaultInstance(
                io.evitadb.externalApi.grpc.generated.GrpcExtraResultsOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcFacetGroupStatisticsType_FacetGroupStatisticsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> facetGroupStatistics_;
  private com.google.protobuf.MapField<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics>
  internalGetFacetGroupStatistics() {
    if (facetGroupStatistics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FacetGroupStatisticsDefaultEntryHolder.defaultEntry);
    }
    return facetGroupStatistics_;
  }

  public int getFacetGroupStatisticsCount() {
    return internalGetFacetGroupStatistics().getMap().size();
  }
  /**
   * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
   */

  @java.lang.Override
  public boolean containsFacetGroupStatistics(
      int key) {
    
    return internalGetFacetGroupStatistics().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFacetGroupStatisticsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> getFacetGroupStatistics() {
    return getFacetGroupStatisticsMap();
  }
  /**
   * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> getFacetGroupStatisticsMap() {
    return internalGetFacetGroupStatistics().getMap();
  }
  /**
   * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
   */
  @java.lang.Override

  public io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics getFacetGroupStatisticsOrDefault(
      int key,
      io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics defaultValue) {
    
    java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> map =
        internalGetFacetGroupStatistics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
   */
  @java.lang.Override

  public io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics getFacetGroupStatisticsOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> map =
        internalGetFacetGroupStatistics().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetFacetGroupStatistics(),
        FacetGroupStatisticsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> entry
         : internalGetFacetGroupStatistics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics>
      facetGroupStatistics__ = FacetGroupStatisticsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, facetGroupStatistics__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType other = (io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType) obj;

    if (!internalGetFacetGroupStatistics().equals(
        other.internalGetFacetGroupStatistics())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetFacetGroupStatistics().getMap().isEmpty()) {
      hash = (37 * hash) + FACETGROUPSTATISTICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFacetGroupStatistics().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType)
      io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcExtraResultsOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcFacetGroupStatisticsType_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetFacetGroupStatistics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableFacetGroupStatistics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcExtraResultsOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcFacetGroupStatisticsType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType.class, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableFacetGroupStatistics().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcExtraResultsOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcFacetGroupStatisticsType_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType build() {
      io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType result = new io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType(this);
      int from_bitField0_ = bitField0_;
      result.facetGroupStatistics_ = internalGetFacetGroupStatistics();
      result.facetGroupStatistics_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType.getDefaultInstance()) return this;
      internalGetMutableFacetGroupStatistics().mergeFrom(
          other.internalGetFacetGroupStatistics());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> facetGroupStatistics_;
    private com.google.protobuf.MapField<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics>
    internalGetFacetGroupStatistics() {
      if (facetGroupStatistics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FacetGroupStatisticsDefaultEntryHolder.defaultEntry);
      }
      return facetGroupStatistics_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics>
    internalGetMutableFacetGroupStatistics() {
      onChanged();;
      if (facetGroupStatistics_ == null) {
        facetGroupStatistics_ = com.google.protobuf.MapField.newMapField(
            FacetGroupStatisticsDefaultEntryHolder.defaultEntry);
      }
      if (!facetGroupStatistics_.isMutable()) {
        facetGroupStatistics_ = facetGroupStatistics_.copy();
      }
      return facetGroupStatistics_;
    }

    public int getFacetGroupStatisticsCount() {
      return internalGetFacetGroupStatistics().getMap().size();
    }
    /**
     * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
     */

    @java.lang.Override
    public boolean containsFacetGroupStatistics(
        int key) {
      
      return internalGetFacetGroupStatistics().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFacetGroupStatisticsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> getFacetGroupStatistics() {
      return getFacetGroupStatisticsMap();
    }
    /**
     * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> getFacetGroupStatisticsMap() {
      return internalGetFacetGroupStatistics().getMap();
    }
    /**
     * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
     */
    @java.lang.Override

    public io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics getFacetGroupStatisticsOrDefault(
        int key,
        io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics defaultValue) {
      
      java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> map =
          internalGetFacetGroupStatistics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
     */
    @java.lang.Override

    public io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics getFacetGroupStatisticsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> map =
          internalGetFacetGroupStatistics().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFacetGroupStatistics() {
      internalGetMutableFacetGroupStatistics().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
     */

    public Builder removeFacetGroupStatistics(
        int key) {
      
      internalGetMutableFacetGroupStatistics().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics>
    getMutableFacetGroupStatistics() {
      return internalGetMutableFacetGroupStatistics().getMutableMap();
    }
    /**
     * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
     */
    public Builder putFacetGroupStatistics(
        int key,
        io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics value) {
      
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableFacetGroupStatistics().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int32, .io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics&gt; facetGroupStatistics = 1;</code>
     */

    public Builder putAllFacetGroupStatistics(
        java.util.Map<java.lang.Integer, io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatistics> values) {
      internalGetMutableFacetGroupStatistics().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType)
  private static final io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcFacetGroupStatisticsType>
      PARSER = new com.google.protobuf.AbstractParser<GrpcFacetGroupStatisticsType>() {
    @java.lang.Override
    public GrpcFacetGroupStatisticsType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcFacetGroupStatisticsType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcFacetGroupStatisticsType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcFacetGroupStatisticsType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcFacetGroupStatisticsType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

