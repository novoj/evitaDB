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
 * Mutation is responsible for setting a `EntitySchema.withGeneratedPrimaryKey` in `EntitySchema`.
 * </pre>
 *
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation}
 */
public final class GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation)
    GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation.newBuilder() to construct.
  private GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation(
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
          case 8: {

            withGeneratedPrimaryKey_ = input.readBool();
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
    return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation.class, io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation.Builder.class);
  }

  public static final int WITHGENERATEDPRIMARYKEY_FIELD_NUMBER = 1;
  private boolean withGeneratedPrimaryKey_;
  /**
   * <pre>
   * Whether primary keys of entities of this type will not be provided by the external systems and Evita
   * is responsible for generating unique primary keys for the entity on insertion.
   * Generated key is guaranteed to be unique, but may not represent continuous ascending series. Generated key
   * will be always greater than zero.
   * </pre>
   *
   * <code>bool withGeneratedPrimaryKey = 1;</code>
   * @return The withGeneratedPrimaryKey.
   */
  @java.lang.Override
  public boolean getWithGeneratedPrimaryKey() {
    return withGeneratedPrimaryKey_;
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
    if (withGeneratedPrimaryKey_ != false) {
      output.writeBool(1, withGeneratedPrimaryKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (withGeneratedPrimaryKey_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, withGeneratedPrimaryKey_);
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation other = (io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation) obj;

    if (getWithGeneratedPrimaryKey()
        != other.getWithGeneratedPrimaryKey()) return false;
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
    hash = (37 * hash) + WITHGENERATEDPRIMARYKEY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithGeneratedPrimaryKey());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation prototype) {
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
   * Mutation is responsible for setting a `EntitySchema.withGeneratedPrimaryKey` in `EntitySchema`.
   * </pre>
   *
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation)
      io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation.class, io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation.newBuilder()
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
      withGeneratedPrimaryKey_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation build() {
      io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation result = new io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation(this);
      result.withGeneratedPrimaryKey_ = withGeneratedPrimaryKey_;
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation.getDefaultInstance()) return this;
      if (other.getWithGeneratedPrimaryKey() != false) {
        setWithGeneratedPrimaryKey(other.getWithGeneratedPrimaryKey());
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
      io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean withGeneratedPrimaryKey_ ;
    /**
     * <pre>
     * Whether primary keys of entities of this type will not be provided by the external systems and Evita
     * is responsible for generating unique primary keys for the entity on insertion.
     * Generated key is guaranteed to be unique, but may not represent continuous ascending series. Generated key
     * will be always greater than zero.
     * </pre>
     *
     * <code>bool withGeneratedPrimaryKey = 1;</code>
     * @return The withGeneratedPrimaryKey.
     */
    @java.lang.Override
    public boolean getWithGeneratedPrimaryKey() {
      return withGeneratedPrimaryKey_;
    }
    /**
     * <pre>
     * Whether primary keys of entities of this type will not be provided by the external systems and Evita
     * is responsible for generating unique primary keys for the entity on insertion.
     * Generated key is guaranteed to be unique, but may not represent continuous ascending series. Generated key
     * will be always greater than zero.
     * </pre>
     *
     * <code>bool withGeneratedPrimaryKey = 1;</code>
     * @param value The withGeneratedPrimaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setWithGeneratedPrimaryKey(boolean value) {

      withGeneratedPrimaryKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether primary keys of entities of this type will not be provided by the external systems and Evita
     * is responsible for generating unique primary keys for the entity on insertion.
     * Generated key is guaranteed to be unique, but may not represent continuous ascending series. Generated key
     * will be always greater than zero.
     * </pre>
     *
     * <code>bool withGeneratedPrimaryKey = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWithGeneratedPrimaryKey() {

      withGeneratedPrimaryKey_ = false;
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation)
  private static final io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation>
      PARSER = new com.google.protobuf.AbstractParser<GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation>() {
    @java.lang.Override
    public GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithGeneratedPrimaryKeyMutation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

