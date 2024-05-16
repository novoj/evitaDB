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
// source: GrpcReferenceMutations.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * <pre>
 * This mutation allows to create / update group of the reference.
 * </pre>
 *
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation}
 */
public final class GrpcSetReferenceGroupMutation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation)
    GrpcSetReferenceGroupMutationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcSetReferenceGroupMutation.newBuilder() to construct.
  private GrpcSetReferenceGroupMutation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcSetReferenceGroupMutation() {
    referenceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcSetReferenceGroupMutation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcSetReferenceGroupMutation(
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

            referenceName_ = s;
            break;
          }
          case 16: {

            referencePrimaryKey_ = input.readInt32();
            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (groupType_ != null) {
              subBuilder = groupType_.toBuilder();
            }
            groupType_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(groupType_);
              groupType_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            groupPrimaryKey_ = input.readInt32();
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
    return io.evitadb.externalApi.grpc.generated.GrpcReferenceMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceGroupMutation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcReferenceMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceGroupMutation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation.class, io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation.Builder.class);
  }

  public static final int REFERENCENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object referenceName_;
  /**
   * <pre>
   * Unique identifier of the reference.
   * </pre>
   *
   * <code>string referenceName = 1;</code>
   * @return The referenceName.
   */
  @java.lang.Override
  public java.lang.String getReferenceName() {
    java.lang.Object ref = referenceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique identifier of the reference.
   * </pre>
   *
   * <code>string referenceName = 1;</code>
   * @return The bytes for referenceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferenceNameBytes() {
    java.lang.Object ref = referenceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCEPRIMARYKEY_FIELD_NUMBER = 2;
  private int referencePrimaryKey_;
  /**
   * <pre>
   * Primary key of the referenced entity. Might be also any integer that uniquely identifies some external
   * resource not maintained by Evita.
   * </pre>
   *
   * <code>int32 referencePrimaryKey = 2;</code>
   * @return The referencePrimaryKey.
   */
  @java.lang.Override
  public int getReferencePrimaryKey() {
    return referencePrimaryKey_;
  }

  public static final int GROUPTYPE_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue groupType_;
  /**
   * <pre>
   * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
   * resource not maintained by Evita.
   * </pre>
   *
   * <code>.google.protobuf.StringValue groupType = 3;</code>
   * @return Whether the groupType field is set.
   */
  @java.lang.Override
  public boolean hasGroupType() {
    return groupType_ != null;
  }
  /**
   * <pre>
   * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
   * resource not maintained by Evita.
   * </pre>
   *
   * <code>.google.protobuf.StringValue groupType = 3;</code>
   * @return The groupType.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getGroupType() {
    return groupType_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : groupType_;
  }
  /**
   * <pre>
   * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
   * resource not maintained by Evita.
   * </pre>
   *
   * <code>.google.protobuf.StringValue groupType = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getGroupTypeOrBuilder() {
    return getGroupType();
  }

  public static final int GROUPPRIMARYKEY_FIELD_NUMBER = 4;
  private int groupPrimaryKey_;
  /**
   * <pre>
   * Primary key of the referenced entity representing group. Might be also any integer that uniquely identifies
   * some external resource not maintained by Evita.
   * </pre>
   *
   * <code>int32 groupPrimaryKey = 4;</code>
   * @return The groupPrimaryKey.
   */
  @java.lang.Override
  public int getGroupPrimaryKey() {
    return groupPrimaryKey_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, referenceName_);
    }
    if (referencePrimaryKey_ != 0) {
      output.writeInt32(2, referencePrimaryKey_);
    }
    if (groupType_ != null) {
      output.writeMessage(3, getGroupType());
    }
    if (groupPrimaryKey_ != 0) {
      output.writeInt32(4, groupPrimaryKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, referenceName_);
    }
    if (referencePrimaryKey_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, referencePrimaryKey_);
    }
    if (groupType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGroupType());
    }
    if (groupPrimaryKey_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, groupPrimaryKey_);
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation other = (io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation) obj;

    if (!getReferenceName()
        .equals(other.getReferenceName())) return false;
    if (getReferencePrimaryKey()
        != other.getReferencePrimaryKey()) return false;
    if (hasGroupType() != other.hasGroupType()) return false;
    if (hasGroupType()) {
      if (!getGroupType()
          .equals(other.getGroupType())) return false;
    }
    if (getGroupPrimaryKey()
        != other.getGroupPrimaryKey()) return false;
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
    hash = (37 * hash) + REFERENCENAME_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceName().hashCode();
    hash = (37 * hash) + REFERENCEPRIMARYKEY_FIELD_NUMBER;
    hash = (53 * hash) + getReferencePrimaryKey();
    if (hasGroupType()) {
      hash = (37 * hash) + GROUPTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getGroupType().hashCode();
    }
    hash = (37 * hash) + GROUPPRIMARYKEY_FIELD_NUMBER;
    hash = (53 * hash) + getGroupPrimaryKey();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation prototype) {
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
   * This mutation allows to create / update group of the reference.
   * </pre>
   *
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation)
      io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcReferenceMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceGroupMutation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcReferenceMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceGroupMutation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation.class, io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation.newBuilder()
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
      referenceName_ = "";

      referencePrimaryKey_ = 0;

      if (groupTypeBuilder_ == null) {
        groupType_ = null;
      } else {
        groupType_ = null;
        groupTypeBuilder_ = null;
      }
      groupPrimaryKey_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcReferenceMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceGroupMutation_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation build() {
      io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation result = new io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation(this);
      result.referenceName_ = referenceName_;
      result.referencePrimaryKey_ = referencePrimaryKey_;
      if (groupTypeBuilder_ == null) {
        result.groupType_ = groupType_;
      } else {
        result.groupType_ = groupTypeBuilder_.build();
      }
      result.groupPrimaryKey_ = groupPrimaryKey_;
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation.getDefaultInstance()) return this;
      if (!other.getReferenceName().isEmpty()) {
        referenceName_ = other.referenceName_;
        onChanged();
      }
      if (other.getReferencePrimaryKey() != 0) {
        setReferencePrimaryKey(other.getReferencePrimaryKey());
      }
      if (other.hasGroupType()) {
        mergeGroupType(other.getGroupType());
      }
      if (other.getGroupPrimaryKey() != 0) {
        setGroupPrimaryKey(other.getGroupPrimaryKey());
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
      io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object referenceName_ = "";
    /**
     * <pre>
     * Unique identifier of the reference.
     * </pre>
     *
     * <code>string referenceName = 1;</code>
     * @return The referenceName.
     */
    public java.lang.String getReferenceName() {
      java.lang.Object ref = referenceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique identifier of the reference.
     * </pre>
     *
     * <code>string referenceName = 1;</code>
     * @return The bytes for referenceName.
     */
    public com.google.protobuf.ByteString
        getReferenceNameBytes() {
      java.lang.Object ref = referenceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique identifier of the reference.
     * </pre>
     *
     * <code>string referenceName = 1;</code>
     * @param value The referenceName to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      referenceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier of the reference.
     * </pre>
     *
     * <code>string referenceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReferenceName() {

      referenceName_ = getDefaultInstance().getReferenceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier of the reference.
     * </pre>
     *
     * <code>string referenceName = 1;</code>
     * @param value The bytes for referenceName to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      referenceName_ = value;
      onChanged();
      return this;
    }

    private int referencePrimaryKey_ ;
    /**
     * <pre>
     * Primary key of the referenced entity. Might be also any integer that uniquely identifies some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>int32 referencePrimaryKey = 2;</code>
     * @return The referencePrimaryKey.
     */
    @java.lang.Override
    public int getReferencePrimaryKey() {
      return referencePrimaryKey_;
    }
    /**
     * <pre>
     * Primary key of the referenced entity. Might be also any integer that uniquely identifies some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>int32 referencePrimaryKey = 2;</code>
     * @param value The referencePrimaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setReferencePrimaryKey(int value) {

      referencePrimaryKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Primary key of the referenced entity. Might be also any integer that uniquely identifies some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>int32 referencePrimaryKey = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReferencePrimaryKey() {

      referencePrimaryKey_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue groupType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> groupTypeBuilder_;
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     * @return Whether the groupType field is set.
     */
    public boolean hasGroupType() {
      return groupTypeBuilder_ != null || groupType_ != null;
    }
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     * @return The groupType.
     */
    public com.google.protobuf.StringValue getGroupType() {
      if (groupTypeBuilder_ == null) {
        return groupType_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : groupType_;
      } else {
        return groupTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     */
    public Builder setGroupType(com.google.protobuf.StringValue value) {
      if (groupTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupType_ = value;
        onChanged();
      } else {
        groupTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     */
    public Builder setGroupType(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (groupTypeBuilder_ == null) {
        groupType_ = builderForValue.build();
        onChanged();
      } else {
        groupTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     */
    public Builder mergeGroupType(com.google.protobuf.StringValue value) {
      if (groupTypeBuilder_ == null) {
        if (groupType_ != null) {
          groupType_ =
            com.google.protobuf.StringValue.newBuilder(groupType_).mergeFrom(value).buildPartial();
        } else {
          groupType_ = value;
        }
        onChanged();
      } else {
        groupTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     */
    public Builder clearGroupType() {
      if (groupTypeBuilder_ == null) {
        groupType_ = null;
        onChanged();
      } else {
        groupType_ = null;
        groupTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getGroupTypeBuilder() {

      onChanged();
      return getGroupTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getGroupTypeOrBuilder() {
      if (groupTypeBuilder_ != null) {
        return groupTypeBuilder_.getMessageOrBuilder();
      } else {
        return groupType_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : groupType_;
      }
    }
    /**
     * <pre>
     * Type of the referenced entity representing group. Might be also any `String` that identifies type in some external
     * resource not maintained by Evita.
     * </pre>
     *
     * <code>.google.protobuf.StringValue groupType = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>
        getGroupTypeFieldBuilder() {
      if (groupTypeBuilder_ == null) {
        groupTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getGroupType(),
                getParentForChildren(),
                isClean());
        groupType_ = null;
      }
      return groupTypeBuilder_;
    }

    private int groupPrimaryKey_ ;
    /**
     * <pre>
     * Primary key of the referenced entity representing group. Might be also any integer that uniquely identifies
     * some external resource not maintained by Evita.
     * </pre>
     *
     * <code>int32 groupPrimaryKey = 4;</code>
     * @return The groupPrimaryKey.
     */
    @java.lang.Override
    public int getGroupPrimaryKey() {
      return groupPrimaryKey_;
    }
    /**
     * <pre>
     * Primary key of the referenced entity representing group. Might be also any integer that uniquely identifies
     * some external resource not maintained by Evita.
     * </pre>
     *
     * <code>int32 groupPrimaryKey = 4;</code>
     * @param value The groupPrimaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setGroupPrimaryKey(int value) {

      groupPrimaryKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Primary key of the referenced entity representing group. Might be also any integer that uniquely identifies
     * some external resource not maintained by Evita.
     * </pre>
     *
     * <code>int32 groupPrimaryKey = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupPrimaryKey() {

      groupPrimaryKey_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation)
  private static final io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcSetReferenceGroupMutation>
      PARSER = new com.google.protobuf.AbstractParser<GrpcSetReferenceGroupMutation>() {
    @java.lang.Override
    public GrpcSetReferenceGroupMutation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcSetReferenceGroupMutation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcSetReferenceGroupMutation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcSetReferenceGroupMutation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcSetReferenceGroupMutation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

