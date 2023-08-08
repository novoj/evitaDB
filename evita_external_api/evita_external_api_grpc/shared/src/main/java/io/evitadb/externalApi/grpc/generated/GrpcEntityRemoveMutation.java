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
// source: GrpcEntityMutation.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * <pre>
 * Represents a terminal mutation when existing entity is removed in the evitaDB. The entity is
 * and all its internal data are deleted.
 * </pre>
 *
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation}
 */
public final class GrpcEntityRemoveMutation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation)
    GrpcEntityRemoveMutationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcEntityRemoveMutation.newBuilder() to construct.
  private GrpcEntityRemoveMutation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcEntityRemoveMutation() {
    entityType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcEntityRemoveMutation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcEntityRemoveMutation(
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

            entityType_ = s;
            break;
          }
          case 16: {

            entityPrimaryKey_ = input.readInt32();
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
    return io.evitadb.externalApi.grpc.generated.GrpcEntityMutationOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntityRemoveMutation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcEntityMutationOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntityRemoveMutation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation.class, io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation.Builder.class);
  }

  public static final int ENTITYTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object entityType_;
  /**
   * <pre>
   * The type of the entity to be removed.
   * </pre>
   *
   * <code>string entityType = 1;</code>
   * @return The entityType.
   */
  @java.lang.Override
  public java.lang.String getEntityType() {
    java.lang.Object ref = entityType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The type of the entity to be removed.
   * </pre>
   *
   * <code>string entityType = 1;</code>
   * @return The bytes for entityType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityTypeBytes() {
    java.lang.Object ref = entityType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITYPRIMARYKEY_FIELD_NUMBER = 2;
  private int entityPrimaryKey_;
  /**
   * <pre>
   * The primary key of the entity to be removed.
   * </pre>
   *
   * <code>int32 entityPrimaryKey = 2;</code>
   * @return The entityPrimaryKey.
   */
  @java.lang.Override
  public int getEntityPrimaryKey() {
    return entityPrimaryKey_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entityType_);
    }
    if (entityPrimaryKey_ != 0) {
      output.writeInt32(2, entityPrimaryKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entityType_);
    }
    if (entityPrimaryKey_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, entityPrimaryKey_);
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation other = (io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation) obj;

    if (!getEntityType()
        .equals(other.getEntityType())) return false;
    if (getEntityPrimaryKey()
        != other.getEntityPrimaryKey()) return false;
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
    hash = (37 * hash) + ENTITYTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEntityType().hashCode();
    hash = (37 * hash) + ENTITYPRIMARYKEY_FIELD_NUMBER;
    hash = (53 * hash) + getEntityPrimaryKey();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation prototype) {
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
   * Represents a terminal mutation when existing entity is removed in the evitaDB. The entity is
   * and all its internal data are deleted.
   * </pre>
   *
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation)
      io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntityMutationOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntityRemoveMutation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntityMutationOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntityRemoveMutation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation.class, io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation.newBuilder()
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
      entityType_ = "";

      entityPrimaryKey_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntityMutationOuterClass.internal_static_io_evitadb_externalApi_grpc_generated_GrpcEntityRemoveMutation_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation build() {
      io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation result = new io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation(this);
      result.entityType_ = entityType_;
      result.entityPrimaryKey_ = entityPrimaryKey_;
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation.getDefaultInstance()) return this;
      if (!other.getEntityType().isEmpty()) {
        entityType_ = other.entityType_;
        onChanged();
      }
      if (other.getEntityPrimaryKey() != 0) {
        setEntityPrimaryKey(other.getEntityPrimaryKey());
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
      io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object entityType_ = "";
    /**
     * <pre>
     * The type of the entity to be removed.
     * </pre>
     *
     * <code>string entityType = 1;</code>
     * @return The entityType.
     */
    public java.lang.String getEntityType() {
      java.lang.Object ref = entityType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The type of the entity to be removed.
     * </pre>
     *
     * <code>string entityType = 1;</code>
     * @return The bytes for entityType.
     */
    public com.google.protobuf.ByteString
        getEntityTypeBytes() {
      java.lang.Object ref = entityType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The type of the entity to be removed.
     * </pre>
     *
     * <code>string entityType = 1;</code>
     * @param value The entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entityType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the entity to be removed.
     * </pre>
     *
     * <code>string entityType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityType() {
      
      entityType_ = getDefaultInstance().getEntityType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the entity to be removed.
     * </pre>
     *
     * <code>string entityType = 1;</code>
     * @param value The bytes for entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entityType_ = value;
      onChanged();
      return this;
    }

    private int entityPrimaryKey_ ;
    /**
     * <pre>
     * The primary key of the entity to be removed.
     * </pre>
     *
     * <code>int32 entityPrimaryKey = 2;</code>
     * @return The entityPrimaryKey.
     */
    @java.lang.Override
    public int getEntityPrimaryKey() {
      return entityPrimaryKey_;
    }
    /**
     * <pre>
     * The primary key of the entity to be removed.
     * </pre>
     *
     * <code>int32 entityPrimaryKey = 2;</code>
     * @param value The entityPrimaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setEntityPrimaryKey(int value) {
      
      entityPrimaryKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The primary key of the entity to be removed.
     * </pre>
     *
     * <code>int32 entityPrimaryKey = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityPrimaryKey() {
      
      entityPrimaryKey_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation)
  private static final io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcEntityRemoveMutation>
      PARSER = new com.google.protobuf.AbstractParser<GrpcEntityRemoveMutation>() {
    @java.lang.Override
    public GrpcEntityRemoveMutation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcEntityRemoveMutation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcEntityRemoveMutation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcEntityRemoveMutation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcEntityRemoveMutation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

