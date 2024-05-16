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
 * Response to GetEntitySchema request.
 * </pre>
 *
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse}
 */
public final class GrpcEntitySchemaResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse)
    GrpcEntitySchemaResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcEntitySchemaResponse.newBuilder() to construct.
  private GrpcEntitySchemaResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcEntitySchemaResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcEntitySchemaResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcEntitySchemaResponse(
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
            io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.Builder subBuilder = null;
            if (entitySchema_ != null) {
              subBuilder = entitySchema_.toBuilder();
            }
            entitySchema_ = input.readMessage(io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entitySchema_);
              entitySchema_ = subBuilder.buildPartial();
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
    return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntitySchemaResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntitySchemaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse.class, io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse.Builder.class);
  }

  public static final int ENTITYSCHEMA_FIELD_NUMBER = 1;
  private io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema_;
  /**
   * <pre>
   * The schema of the requested entity type.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
   * @return Whether the entitySchema field is set.
   */
  @java.lang.Override
  public boolean hasEntitySchema() {
    return entitySchema_ != null;
  }
  /**
   * <pre>
   * The schema of the requested entity type.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
   * @return The entitySchema.
   */
  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcEntitySchema getEntitySchema() {
    return entitySchema_ == null ? io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.getDefaultInstance() : entitySchema_;
  }
  /**
   * <pre>
   * The schema of the requested entity type.
   * </pre>
   *
   * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
   */
  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaOrBuilder getEntitySchemaOrBuilder() {
    return getEntitySchema();
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
    if (entitySchema_ != null) {
      output.writeMessage(1, getEntitySchema());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entitySchema_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntitySchema());
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse other = (io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse) obj;

    if (hasEntitySchema() != other.hasEntitySchema()) return false;
    if (hasEntitySchema()) {
      if (!getEntitySchema()
          .equals(other.getEntitySchema())) return false;
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
    if (hasEntitySchema()) {
      hash = (37 * hash) + ENTITYSCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getEntitySchema().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse prototype) {
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
   * Response to GetEntitySchema request.
   * </pre>
   *
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse)
      io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntitySchemaResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntitySchemaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse.class, io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse.newBuilder()
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
      if (entitySchemaBuilder_ == null) {
        entitySchema_ = null;
      } else {
        entitySchema_ = null;
        entitySchemaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntitySchemaResponse_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse build() {
      io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse result = new io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse(this);
      if (entitySchemaBuilder_ == null) {
        result.entitySchema_ = entitySchema_;
      } else {
        result.entitySchema_ = entitySchemaBuilder_.build();
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse.getDefaultInstance()) return this;
      if (other.hasEntitySchema()) {
        mergeEntitySchema(other.getEntitySchema());
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
      io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.evitadb.externalApi.grpc.generated.GrpcEntitySchema, io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.Builder, io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaOrBuilder> entitySchemaBuilder_;
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     * @return Whether the entitySchema field is set.
     */
    public boolean hasEntitySchema() {
      return entitySchemaBuilder_ != null || entitySchema_ != null;
    }
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     * @return The entitySchema.
     */
    public io.evitadb.externalApi.grpc.generated.GrpcEntitySchema getEntitySchema() {
      if (entitySchemaBuilder_ == null) {
        return entitySchema_ == null ? io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.getDefaultInstance() : entitySchema_;
      } else {
        return entitySchemaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     */
    public Builder setEntitySchema(io.evitadb.externalApi.grpc.generated.GrpcEntitySchema value) {
      if (entitySchemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entitySchema_ = value;
        onChanged();
      } else {
        entitySchemaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     */
    public Builder setEntitySchema(
        io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.Builder builderForValue) {
      if (entitySchemaBuilder_ == null) {
        entitySchema_ = builderForValue.build();
        onChanged();
      } else {
        entitySchemaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     */
    public Builder mergeEntitySchema(io.evitadb.externalApi.grpc.generated.GrpcEntitySchema value) {
      if (entitySchemaBuilder_ == null) {
        if (entitySchema_ != null) {
          entitySchema_ =
            io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.newBuilder(entitySchema_).mergeFrom(value).buildPartial();
        } else {
          entitySchema_ = value;
        }
        onChanged();
      } else {
        entitySchemaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     */
    public Builder clearEntitySchema() {
      if (entitySchemaBuilder_ == null) {
        entitySchema_ = null;
        onChanged();
      } else {
        entitySchema_ = null;
        entitySchemaBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.Builder getEntitySchemaBuilder() {

      onChanged();
      return getEntitySchemaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaOrBuilder getEntitySchemaOrBuilder() {
      if (entitySchemaBuilder_ != null) {
        return entitySchemaBuilder_.getMessageOrBuilder();
      } else {
        return entitySchema_ == null ?
            io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.getDefaultInstance() : entitySchema_;
      }
    }
    /**
     * <pre>
     * The schema of the requested entity type.
     * </pre>
     *
     * <code>.io.evitadb.externalApi.grpc.generated.GrpcEntitySchema entitySchema = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.evitadb.externalApi.grpc.generated.GrpcEntitySchema, io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.Builder, io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaOrBuilder>
        getEntitySchemaFieldBuilder() {
      if (entitySchemaBuilder_ == null) {
        entitySchemaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.evitadb.externalApi.grpc.generated.GrpcEntitySchema, io.evitadb.externalApi.grpc.generated.GrpcEntitySchema.Builder, io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaOrBuilder>(
                getEntitySchema(),
                getParentForChildren(),
                isClean());
        entitySchema_ = null;
      }
      return entitySchemaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse)
  private static final io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcEntitySchemaResponse>
      PARSER = new com.google.protobuf.AbstractParser<GrpcEntitySchemaResponse>() {
    @java.lang.Override
    public GrpcEntitySchemaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcEntitySchemaResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcEntitySchemaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcEntitySchemaResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

