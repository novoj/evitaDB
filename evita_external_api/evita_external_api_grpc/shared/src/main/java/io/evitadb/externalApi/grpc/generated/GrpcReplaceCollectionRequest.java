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
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest}
 */
public final class GrpcReplaceCollectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest)
    GrpcReplaceCollectionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcReplaceCollectionRequest.newBuilder() to construct.
  private GrpcReplaceCollectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcReplaceCollectionRequest() {
    entityTypeToBeReplaced_ = "";
    entityTypeToBeReplacedWith_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcReplaceCollectionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcReplaceCollectionRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            entityTypeToBeReplaced_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            entityTypeToBeReplacedWith_ = s;
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
    return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcReplaceCollectionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcReplaceCollectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest.class, io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest.Builder.class);
  }

  public static final int ENTITYTYPETOBEREPLACED_FIELD_NUMBER = 1;
  private volatile java.lang.Object entityTypeToBeReplaced_;
  /**
   * <pre>
   * Name of the entity collection that will be replaced and dropped (new name)
   * </pre>
   *
   * <code>string entityTypeToBeReplaced = 1;</code>
   * @return The entityTypeToBeReplaced.
   */
  @java.lang.Override
  public java.lang.String getEntityTypeToBeReplaced() {
    java.lang.Object ref = entityTypeToBeReplaced_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityTypeToBeReplaced_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the entity collection that will be replaced and dropped (new name)
   * </pre>
   *
   * <code>string entityTypeToBeReplaced = 1;</code>
   * @return The bytes for entityTypeToBeReplaced.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityTypeToBeReplacedBytes() {
    java.lang.Object ref = entityTypeToBeReplaced_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityTypeToBeReplaced_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITYTYPETOBEREPLACEDWITH_FIELD_NUMBER = 2;
  private volatile java.lang.Object entityTypeToBeReplacedWith_;
  /**
   * <pre>
   * Name of the entity collection that will become the successor of the original collection (old name)
   * </pre>
   *
   * <code>string entityTypeToBeReplacedWith = 2;</code>
   * @return The entityTypeToBeReplacedWith.
   */
  @java.lang.Override
  public java.lang.String getEntityTypeToBeReplacedWith() {
    java.lang.Object ref = entityTypeToBeReplacedWith_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityTypeToBeReplacedWith_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the entity collection that will become the successor of the original collection (old name)
   * </pre>
   *
   * <code>string entityTypeToBeReplacedWith = 2;</code>
   * @return The bytes for entityTypeToBeReplacedWith.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityTypeToBeReplacedWithBytes() {
    java.lang.Object ref = entityTypeToBeReplacedWith_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityTypeToBeReplacedWith_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityTypeToBeReplaced_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entityTypeToBeReplaced_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityTypeToBeReplacedWith_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityTypeToBeReplacedWith_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityTypeToBeReplaced_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entityTypeToBeReplaced_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityTypeToBeReplacedWith_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entityTypeToBeReplacedWith_);
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest other = (io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest) obj;

    if (!getEntityTypeToBeReplaced()
        .equals(other.getEntityTypeToBeReplaced())) return false;
    if (!getEntityTypeToBeReplacedWith()
        .equals(other.getEntityTypeToBeReplacedWith())) return false;
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
    hash = (37 * hash) + ENTITYTYPETOBEREPLACED_FIELD_NUMBER;
    hash = (53 * hash) + getEntityTypeToBeReplaced().hashCode();
    hash = (37 * hash) + ENTITYTYPETOBEREPLACEDWITH_FIELD_NUMBER;
    hash = (53 * hash) + getEntityTypeToBeReplacedWith().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest prototype) {
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
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest)
      io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcReplaceCollectionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcReplaceCollectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest.class, io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest.newBuilder()
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
      entityTypeToBeReplaced_ = "";

      entityTypeToBeReplacedWith_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaSessionAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcReplaceCollectionRequest_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest build() {
      io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest result = new io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest(this);
      result.entityTypeToBeReplaced_ = entityTypeToBeReplaced_;
      result.entityTypeToBeReplacedWith_ = entityTypeToBeReplacedWith_;
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest.getDefaultInstance()) return this;
      if (!other.getEntityTypeToBeReplaced().isEmpty()) {
        entityTypeToBeReplaced_ = other.entityTypeToBeReplaced_;
        onChanged();
      }
      if (!other.getEntityTypeToBeReplacedWith().isEmpty()) {
        entityTypeToBeReplacedWith_ = other.entityTypeToBeReplacedWith_;
        onChanged();
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
      io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object entityTypeToBeReplaced_ = "";
    /**
     * <pre>
     * Name of the entity collection that will be replaced and dropped (new name)
     * </pre>
     *
     * <code>string entityTypeToBeReplaced = 1;</code>
     * @return The entityTypeToBeReplaced.
     */
    public java.lang.String getEntityTypeToBeReplaced() {
      java.lang.Object ref = entityTypeToBeReplaced_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityTypeToBeReplaced_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the entity collection that will be replaced and dropped (new name)
     * </pre>
     *
     * <code>string entityTypeToBeReplaced = 1;</code>
     * @return The bytes for entityTypeToBeReplaced.
     */
    public com.google.protobuf.ByteString
        getEntityTypeToBeReplacedBytes() {
      java.lang.Object ref = entityTypeToBeReplaced_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityTypeToBeReplaced_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the entity collection that will be replaced and dropped (new name)
     * </pre>
     *
     * <code>string entityTypeToBeReplaced = 1;</code>
     * @param value The entityTypeToBeReplaced to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeToBeReplaced(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entityTypeToBeReplaced_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the entity collection that will be replaced and dropped (new name)
     * </pre>
     *
     * <code>string entityTypeToBeReplaced = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityTypeToBeReplaced() {
      
      entityTypeToBeReplaced_ = getDefaultInstance().getEntityTypeToBeReplaced();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the entity collection that will be replaced and dropped (new name)
     * </pre>
     *
     * <code>string entityTypeToBeReplaced = 1;</code>
     * @param value The bytes for entityTypeToBeReplaced to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeToBeReplacedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entityTypeToBeReplaced_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object entityTypeToBeReplacedWith_ = "";
    /**
     * <pre>
     * Name of the entity collection that will become the successor of the original collection (old name)
     * </pre>
     *
     * <code>string entityTypeToBeReplacedWith = 2;</code>
     * @return The entityTypeToBeReplacedWith.
     */
    public java.lang.String getEntityTypeToBeReplacedWith() {
      java.lang.Object ref = entityTypeToBeReplacedWith_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityTypeToBeReplacedWith_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the entity collection that will become the successor of the original collection (old name)
     * </pre>
     *
     * <code>string entityTypeToBeReplacedWith = 2;</code>
     * @return The bytes for entityTypeToBeReplacedWith.
     */
    public com.google.protobuf.ByteString
        getEntityTypeToBeReplacedWithBytes() {
      java.lang.Object ref = entityTypeToBeReplacedWith_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityTypeToBeReplacedWith_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the entity collection that will become the successor of the original collection (old name)
     * </pre>
     *
     * <code>string entityTypeToBeReplacedWith = 2;</code>
     * @param value The entityTypeToBeReplacedWith to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeToBeReplacedWith(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entityTypeToBeReplacedWith_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the entity collection that will become the successor of the original collection (old name)
     * </pre>
     *
     * <code>string entityTypeToBeReplacedWith = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityTypeToBeReplacedWith() {
      
      entityTypeToBeReplacedWith_ = getDefaultInstance().getEntityTypeToBeReplacedWith();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the entity collection that will become the successor of the original collection (old name)
     * </pre>
     *
     * <code>string entityTypeToBeReplacedWith = 2;</code>
     * @param value The bytes for entityTypeToBeReplacedWith to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeToBeReplacedWithBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entityTypeToBeReplacedWith_ = value;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest)
  private static final io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcReplaceCollectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<GrpcReplaceCollectionRequest>() {
    @java.lang.Override
    public GrpcReplaceCollectionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcReplaceCollectionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcReplaceCollectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcReplaceCollectionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcReplaceCollectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

