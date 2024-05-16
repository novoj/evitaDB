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

/**
 * <pre>
 * Request for updating the catalog schema and its afterwards fetching.
 * </pre>
 *
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse}
 */
public final class GrpcUpdateAndFetchCatalogSchemaResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse)
    GrpcUpdateAndFetchCatalogSchemaResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcUpdateAndFetchCatalogSchemaResponse.newBuilder() to construct.
  private GrpcUpdateAndFetchCatalogSchemaResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcUpdateAndFetchCatalogSchemaResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcUpdateAndFetchCatalogSchemaResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcUpdateAndFetchCatalogSchemaResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.Builder subBuilder = null;
            if (catalogSchema_ != null) {
              subBuilder = catalogSchema_.toBuilder();
            }
            catalogSchema_ = input.readMessage(io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(catalogSchema_);
              catalogSchema_ = subBuilder.buildPartial();
            }

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
    return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcUpdateAndFetchCatalogSchemaResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcUpdateAndFetchCatalogSchemaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse.class, io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse.Builder.class);
  }

  public static final int CATALOGSCHEMA_FIELD_NUMBER = 1;
  private io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema_;
  /**
   * <pre>
   * Modified catalog schema.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
   * @return Whether the catalogSchema field is set.
   */
  @java.lang.Override
  public boolean hasCatalogSchema() {
    return catalogSchema_ != null;
  }
  /**
   * <pre>
   * Modified catalog schema.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
   * @return The catalogSchema.
   */
  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema getCatalogSchema() {
    return catalogSchema_ == null ? io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.getDefaultInstance() : catalogSchema_;
  }
  /**
   * <pre>
   * Modified catalog schema.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
   */
  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcCatalogSchemaOrBuilder getCatalogSchemaOrBuilder() {
    return getCatalogSchema();
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
    if (catalogSchema_ != null) {
      output.writeMessage(1, getCatalogSchema());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (catalogSchema_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCatalogSchema());
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse other = (io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse) obj;

    if (hasCatalogSchema() != other.hasCatalogSchema()) return false;
    if (hasCatalogSchema()) {
      if (!getCatalogSchema()
          .equals(other.getCatalogSchema())) return false;
    }
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
    if (hasCatalogSchema()) {
      hash = (37 * hash) + CATALOGSCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getCatalogSchema().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse prototype) {
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
   * <pre>
   * Request for updating the catalog schema and its afterwards fetching.
   * </pre>
   *
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse)
      io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcUpdateAndFetchCatalogSchemaResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcUpdateAndFetchCatalogSchemaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse.class, io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse.newBuilder()
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
      if (catalogSchemaBuilder_ == null) {
        catalogSchema_ = null;
      } else {
        catalogSchema_ = null;
        catalogSchemaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcUpdateAndFetchCatalogSchemaResponse_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse build() {
      io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse result = new io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse(this);
      if (catalogSchemaBuilder_ == null) {
        result.catalogSchema_ = catalogSchema_;
      } else {
        result.catalogSchema_ = catalogSchemaBuilder_.build();
      }
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse.getDefaultInstance()) return this;
      if (other.hasCatalogSchema()) {
        mergeCatalogSchema(other.getCatalogSchema());
      }
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
      io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema, io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.Builder, io.evitadb.externalApi.grpc.generated.GrpcCatalogSchemaOrBuilder> catalogSchemaBuilder_;
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     * @return Whether the catalogSchema field is set.
     */
    public boolean hasCatalogSchema() {
      return catalogSchemaBuilder_ != null || catalogSchema_ != null;
    }
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     * @return The catalogSchema.
     */
    public io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema getCatalogSchema() {
      if (catalogSchemaBuilder_ == null) {
        return catalogSchema_ == null ? io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.getDefaultInstance() : catalogSchema_;
      } else {
        return catalogSchemaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     */
    public Builder setCatalogSchema(io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema value) {
      if (catalogSchemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        catalogSchema_ = value;
        onChanged();
      } else {
        catalogSchemaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     */
    public Builder setCatalogSchema(
        io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.Builder builderForValue) {
      if (catalogSchemaBuilder_ == null) {
        catalogSchema_ = builderForValue.build();
        onChanged();
      } else {
        catalogSchemaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     */
    public Builder mergeCatalogSchema(io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema value) {
      if (catalogSchemaBuilder_ == null) {
        if (catalogSchema_ != null) {
          catalogSchema_ =
            io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.newBuilder(catalogSchema_).mergeFrom(value).buildPartial();
        } else {
          catalogSchema_ = value;
        }
        onChanged();
      } else {
        catalogSchemaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     */
    public Builder clearCatalogSchema() {
      if (catalogSchemaBuilder_ == null) {
        catalogSchema_ = null;
        onChanged();
      } else {
        catalogSchema_ = null;
        catalogSchemaBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.Builder getCatalogSchemaBuilder() {

      onChanged();
      return getCatalogSchemaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcCatalogSchemaOrBuilder getCatalogSchemaOrBuilder() {
      if (catalogSchemaBuilder_ != null) {
        return catalogSchemaBuilder_.getMessageOrBuilder();
      } else {
        return catalogSchema_ == null ?
            io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.getDefaultInstance() : catalogSchema_;
      }
    }
    /**
     * <pre>
     * Modified catalog schema.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema catalogSchema = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema, io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.Builder, io.evitadb.externalApi.grpc.generated.GrpcCatalogSchemaOrBuilder>
        getCatalogSchemaFieldBuilder() {
      if (catalogSchemaBuilder_ == null) {
        catalogSchemaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema, io.evitadb.externalApi.grpc.generated.GrpcCatalogSchema.Builder, io.evitadb.externalApi.grpc.generated.GrpcCatalogSchemaOrBuilder>(
                getCatalogSchema(),
                getParentForChildren(),
                isClean());
        catalogSchema_ = null;
      }
      return catalogSchemaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse)
  private static final io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcUpdateAndFetchCatalogSchemaResponse>
      PARSER = new com.google.protobuf.AbstractParser<GrpcUpdateAndFetchCatalogSchemaResponse>() {
    @java.lang.Override
    public GrpcUpdateAndFetchCatalogSchemaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcUpdateAndFetchCatalogSchemaResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcUpdateAndFetchCatalogSchemaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcUpdateAndFetchCatalogSchemaResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcUpdateAndFetchCatalogSchemaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

