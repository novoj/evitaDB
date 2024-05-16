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
// source: GrpcEntitySchemaMutations.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * <pre>
 * Mutation is responsible for removing one or more locales from a `EntitySchema.locales` in `EntitySchema`.
 * </pre>
 *
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation}
 */
public final class GrpcDisallowLocaleInEntitySchemaMutation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation)
    GrpcDisallowLocaleInEntitySchemaMutationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcDisallowLocaleInEntitySchemaMutation.newBuilder() to construct.
  private GrpcDisallowLocaleInEntitySchemaMutation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcDisallowLocaleInEntitySchemaMutation() {
    locales_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcDisallowLocaleInEntitySchemaMutation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcDisallowLocaleInEntitySchemaMutation(
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
              locales_ = new java.util.ArrayList<io.evitadb.externalApi.grpc.generated.GrpcLocale>();
              mutable_bitField0_ |= 0x00000001;
            }
            locales_.add(
                input.readMessage(io.evitadb.externalApi.grpc.generated.GrpcLocale.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        locales_ = java.util.Collections.unmodifiableList(locales_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowLocaleInEntitySchemaMutation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowLocaleInEntitySchemaMutation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation.class, io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation.Builder.class);
  }

  public static final int LOCALES_FIELD_NUMBER = 1;
  private java.util.List<io.evitadb.externalApi.grpc.generated.GrpcLocale> locales_;
  /**
   * <pre>
   * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.evitadb.externalApi.grpc.generated.GrpcLocale> getLocalesList() {
    return locales_;
  }
  /**
   * <pre>
   * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder>
      getLocalesOrBuilderList() {
    return locales_;
  }
  /**
   * <pre>
   * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
   */
  @java.lang.Override
  public int getLocalesCount() {
    return locales_.size();
  }
  /**
   * <pre>
   * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
   */
  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcLocale getLocales(int index) {
    return locales_.get(index);
  }
  /**
   * <pre>
   * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
   */
  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder getLocalesOrBuilder(
      int index) {
    return locales_.get(index);
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
    for (int i = 0; i < locales_.size(); i++) {
      output.writeMessage(1, locales_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < locales_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, locales_.get(i));
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation other = (io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation) obj;

    if (!getLocalesList()
        .equals(other.getLocalesList())) return false;
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
    if (getLocalesCount() > 0) {
      hash = (37 * hash) + LOCALES_FIELD_NUMBER;
      hash = (53 * hash) + getLocalesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation prototype) {
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
   * Mutation is responsible for removing one or more locales from a `EntitySchema.locales` in `EntitySchema`.
   * </pre>
   *
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation)
      io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowLocaleInEntitySchemaMutation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowLocaleInEntitySchemaMutation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation.class, io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation.newBuilder()
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
        getLocalesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (localesBuilder_ == null) {
        locales_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        localesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowLocaleInEntitySchemaMutation_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation build() {
      io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation result = new io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation(this);
      int from_bitField0_ = bitField0_;
      if (localesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          locales_ = java.util.Collections.unmodifiableList(locales_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.locales_ = locales_;
      } else {
        result.locales_ = localesBuilder_.build();
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation.getDefaultInstance()) return this;
      if (localesBuilder_ == null) {
        if (!other.locales_.isEmpty()) {
          if (locales_.isEmpty()) {
            locales_ = other.locales_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLocalesIsMutable();
            locales_.addAll(other.locales_);
          }
          onChanged();
        }
      } else {
        if (!other.locales_.isEmpty()) {
          if (localesBuilder_.isEmpty()) {
            localesBuilder_.dispose();
            localesBuilder_ = null;
            locales_ = other.locales_;
            bitField0_ = (bitField0_ & ~0x00000001);
            localesBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLocalesFieldBuilder() : null;
          } else {
            localesBuilder_.addAllMessages(other.locales_);
          }
        }
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
      io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.evitadb.externalApi.grpc.generated.GrpcLocale> locales_ =
      java.util.Collections.emptyList();
    private void ensureLocalesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        locales_ = new java.util.ArrayList<io.evitadb.externalApi.grpc.generated.GrpcLocale>(locales_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.evitadb.externalApi.grpc.generated.GrpcLocale, io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder, io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder> localesBuilder_;

    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public java.util.List<io.evitadb.externalApi.grpc.generated.GrpcLocale> getLocalesList() {
      if (localesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(locales_);
      } else {
        return localesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public int getLocalesCount() {
      if (localesBuilder_ == null) {
        return locales_.size();
      } else {
        return localesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcLocale getLocales(int index) {
      if (localesBuilder_ == null) {
        return locales_.get(index);
      } else {
        return localesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder setLocales(
        int index, io.evitadb.externalApi.grpc.generated.GrpcLocale value) {
      if (localesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocalesIsMutable();
        locales_.set(index, value);
        onChanged();
      } else {
        localesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder setLocales(
        int index, io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder builderForValue) {
      if (localesBuilder_ == null) {
        ensureLocalesIsMutable();
        locales_.set(index, builderForValue.build());
        onChanged();
      } else {
        localesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder addLocales(io.evitadb.externalApi.grpc.generated.GrpcLocale value) {
      if (localesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocalesIsMutable();
        locales_.add(value);
        onChanged();
      } else {
        localesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder addLocales(
        int index, io.evitadb.externalApi.grpc.generated.GrpcLocale value) {
      if (localesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocalesIsMutable();
        locales_.add(index, value);
        onChanged();
      } else {
        localesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder addLocales(
        io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder builderForValue) {
      if (localesBuilder_ == null) {
        ensureLocalesIsMutable();
        locales_.add(builderForValue.build());
        onChanged();
      } else {
        localesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder addLocales(
        int index, io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder builderForValue) {
      if (localesBuilder_ == null) {
        ensureLocalesIsMutable();
        locales_.add(index, builderForValue.build());
        onChanged();
      } else {
        localesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder addAllLocales(
        java.lang.Iterable<? extends io.evitadb.externalApi.grpc.generated.GrpcLocale> values) {
      if (localesBuilder_ == null) {
        ensureLocalesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, locales_);
        onChanged();
      } else {
        localesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder clearLocales() {
      if (localesBuilder_ == null) {
        locales_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        localesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public Builder removeLocales(int index) {
      if (localesBuilder_ == null) {
        ensureLocalesIsMutable();
        locales_.remove(index);
        onChanged();
      } else {
        localesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder getLocalesBuilder(
        int index) {
      return getLocalesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder getLocalesOrBuilder(
        int index) {
      if (localesBuilder_ == null) {
        return locales_.get(index);  } else {
        return localesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder>
         getLocalesOrBuilderList() {
      if (localesBuilder_ != null) {
        return localesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(locales_);
      }
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder addLocalesBuilder() {
      return getLocalesFieldBuilder().addBuilder(
          io.evitadb.externalApi.grpc.generated.GrpcLocale.getDefaultInstance());
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder addLocalesBuilder(
        int index) {
      return getLocalesFieldBuilder().addBuilder(
          index, io.evitadb.externalApi.grpc.generated.GrpcLocale.getDefaultInstance());
    }
    /**
     * <pre>
     * Set of all locales that can't be used for localized `AttributeSchema` or `AssociatedDataSchema`.
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcLocale locales = 1;</code>
     */
    public java.util.List<io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder>
         getLocalesBuilderList() {
      return getLocalesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.evitadb.externalApi.grpc.generated.GrpcLocale, io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder, io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder>
        getLocalesFieldBuilder() {
      if (localesBuilder_ == null) {
        localesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.evitadb.externalApi.grpc.generated.GrpcLocale, io.evitadb.externalApi.grpc.generated.GrpcLocale.Builder, io.evitadb.externalApi.grpc.generated.GrpcLocaleOrBuilder>(
                locales_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        locales_ = null;
      }
      return localesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation)
  private static final io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcDisallowLocaleInEntitySchemaMutation>
      PARSER = new com.google.protobuf.AbstractParser<GrpcDisallowLocaleInEntitySchemaMutation>() {
    @java.lang.Override
    public GrpcDisallowLocaleInEntitySchemaMutation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcDisallowLocaleInEntitySchemaMutation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcDisallowLocaleInEntitySchemaMutation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcDisallowLocaleInEntitySchemaMutation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcDisallowLocaleInEntitySchemaMutation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

