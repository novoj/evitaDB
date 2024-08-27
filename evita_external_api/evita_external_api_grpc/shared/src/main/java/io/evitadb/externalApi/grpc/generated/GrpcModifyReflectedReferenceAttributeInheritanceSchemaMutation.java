/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2023-2024
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
// source: GrpcReferenceSchemaMutations.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * <pre>
 * Mutation is responsible for setting value to a `ReflectedReferenceSchema.attributesInherited` and
 * `ReflectedReferenceSchema.attributesExcludedFromInheritance` in `ReferenceSchema`.
 * Mutation can be used for altering also the existing `ReferenceSchemaContract` alone.
 * </pre>
 *
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation}
 */
public final class GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation)
    GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation.newBuilder() to construct.
  private GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation() {
    name_ = "";
    attributesExcludedFromInheritance_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            attributesInherited_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attributesExcludedFromInheritance_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            attributesExcludedFromInheritance_.add(s);
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
        attributesExcludedFromInheritance_ = attributesExcludedFromInheritance_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.evitadb.externalApi.grpc.generated.GrpcReferenceSchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcReferenceSchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation.class, io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name of the reference the mutation is targeting.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the reference the mutation is targeting.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBUTESINHERITED_FIELD_NUMBER = 2;
  private boolean attributesInherited_;
  /**
   * <pre>
   * Contains true if the attributes of the reflected reference are inherited from the target reference.
   * </pre>
   *
   * <code>bool attributesInherited = 2;</code>
   * @return The attributesInherited.
   */
  @java.lang.Override
  public boolean getAttributesInherited() {
    return attributesInherited_;
  }

  public static final int ATTRIBUTESEXCLUDEDFROMINHERITANCE_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList attributesExcludedFromInheritance_;
  /**
   * <pre>
   * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
   * this list is ignored.
   * </pre>
   *
   * <code>repeated string attributesExcludedFromInheritance = 3;</code>
   * @return A list containing the attributesExcludedFromInheritance.
   */
  public com.google.protobuf.ProtocolStringList
      getAttributesExcludedFromInheritanceList() {
    return attributesExcludedFromInheritance_;
  }
  /**
   * <pre>
   * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
   * this list is ignored.
   * </pre>
   *
   * <code>repeated string attributesExcludedFromInheritance = 3;</code>
   * @return The count of attributesExcludedFromInheritance.
   */
  public int getAttributesExcludedFromInheritanceCount() {
    return attributesExcludedFromInheritance_.size();
  }
  /**
   * <pre>
   * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
   * this list is ignored.
   * </pre>
   *
   * <code>repeated string attributesExcludedFromInheritance = 3;</code>
   * @param index The index of the element to return.
   * @return The attributesExcludedFromInheritance at the given index.
   */
  public java.lang.String getAttributesExcludedFromInheritance(int index) {
    return attributesExcludedFromInheritance_.get(index);
  }
  /**
   * <pre>
   * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
   * this list is ignored.
   * </pre>
   *
   * <code>repeated string attributesExcludedFromInheritance = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the attributesExcludedFromInheritance at the given index.
   */
  public com.google.protobuf.ByteString
      getAttributesExcludedFromInheritanceBytes(int index) {
    return attributesExcludedFromInheritance_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (attributesInherited_ != false) {
      output.writeBool(2, attributesInherited_);
    }
    for (int i = 0; i < attributesExcludedFromInheritance_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, attributesExcludedFromInheritance_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (attributesInherited_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, attributesInherited_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < attributesExcludedFromInheritance_.size(); i++) {
        dataSize += computeStringSizeNoTag(attributesExcludedFromInheritance_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAttributesExcludedFromInheritanceList().size();
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation other = (io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getAttributesInherited()
        != other.getAttributesInherited()) return false;
    if (!getAttributesExcludedFromInheritanceList()
        .equals(other.getAttributesExcludedFromInheritanceList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ATTRIBUTESINHERITED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAttributesInherited());
    if (getAttributesExcludedFromInheritanceCount() > 0) {
      hash = (37 * hash) + ATTRIBUTESEXCLUDEDFROMINHERITANCE_FIELD_NUMBER;
      hash = (53 * hash) + getAttributesExcludedFromInheritanceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation prototype) {
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
   * Mutation is responsible for setting value to a `ReflectedReferenceSchema.attributesInherited` and
   * `ReflectedReferenceSchema.attributesExcludedFromInheritance` in `ReferenceSchema`.
   * Mutation can be used for altering also the existing `ReferenceSchemaContract` alone.
   * </pre>
   *
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation)
      io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcReferenceSchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcReferenceSchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation.class, io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation.newBuilder()
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
      name_ = "";

      attributesInherited_ = false;

      attributesExcludedFromInheritance_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcReferenceSchemaMutations.internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation build() {
      io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation result = new io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.attributesInherited_ = attributesInherited_;
      if (((bitField0_ & 0x00000001) != 0)) {
        attributesExcludedFromInheritance_ = attributesExcludedFromInheritance_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.attributesExcludedFromInheritance_ = attributesExcludedFromInheritance_;
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAttributesInherited() != false) {
        setAttributesInherited(other.getAttributesInherited());
      }
      if (!other.attributesExcludedFromInheritance_.isEmpty()) {
        if (attributesExcludedFromInheritance_.isEmpty()) {
          attributesExcludedFromInheritance_ = other.attributesExcludedFromInheritance_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAttributesExcludedFromInheritanceIsMutable();
          attributesExcludedFromInheritance_.addAll(other.attributesExcludedFromInheritance_);
        }
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
      io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the reference the mutation is targeting.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the reference the mutation is targeting.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the reference the mutation is targeting.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the reference the mutation is targeting.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the reference the mutation is targeting.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private boolean attributesInherited_ ;
    /**
     * <pre>
     * Contains true if the attributes of the reflected reference are inherited from the target reference.
     * </pre>
     *
     * <code>bool attributesInherited = 2;</code>
     * @return The attributesInherited.
     */
    @java.lang.Override
    public boolean getAttributesInherited() {
      return attributesInherited_;
    }
    /**
     * <pre>
     * Contains true if the attributes of the reflected reference are inherited from the target reference.
     * </pre>
     *
     * <code>bool attributesInherited = 2;</code>
     * @param value The attributesInherited to set.
     * @return This builder for chaining.
     */
    public Builder setAttributesInherited(boolean value) {

      attributesInherited_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains true if the attributes of the reflected reference are inherited from the target reference.
     * </pre>
     *
     * <code>bool attributesInherited = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributesInherited() {

      attributesInherited_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList attributesExcludedFromInheritance_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAttributesExcludedFromInheritanceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attributesExcludedFromInheritance_ = new com.google.protobuf.LazyStringArrayList(attributesExcludedFromInheritance_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @return A list containing the attributesExcludedFromInheritance.
     */
    public com.google.protobuf.ProtocolStringList
        getAttributesExcludedFromInheritanceList() {
      return attributesExcludedFromInheritance_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @return The count of attributesExcludedFromInheritance.
     */
    public int getAttributesExcludedFromInheritanceCount() {
      return attributesExcludedFromInheritance_.size();
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @param index The index of the element to return.
     * @return The attributesExcludedFromInheritance at the given index.
     */
    public java.lang.String getAttributesExcludedFromInheritance(int index) {
      return attributesExcludedFromInheritance_.get(index);
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the attributesExcludedFromInheritance at the given index.
     */
    public com.google.protobuf.ByteString
        getAttributesExcludedFromInheritanceBytes(int index) {
      return attributesExcludedFromInheritance_.getByteString(index);
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @param index The index to set the value at.
     * @param value The attributesExcludedFromInheritance to set.
     * @return This builder for chaining.
     */
    public Builder setAttributesExcludedFromInheritance(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAttributesExcludedFromInheritanceIsMutable();
      attributesExcludedFromInheritance_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @param value The attributesExcludedFromInheritance to add.
     * @return This builder for chaining.
     */
    public Builder addAttributesExcludedFromInheritance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAttributesExcludedFromInheritanceIsMutable();
      attributesExcludedFromInheritance_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @param values The attributesExcludedFromInheritance to add.
     * @return This builder for chaining.
     */
    public Builder addAllAttributesExcludedFromInheritance(
        java.lang.Iterable<java.lang.String> values) {
      ensureAttributesExcludedFromInheritanceIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, attributesExcludedFromInheritance_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttributesExcludedFromInheritance() {
      attributesExcludedFromInheritance_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The array of attribute names that are excluded from inheritance. If the attributesInherited is set to false,
     * this list is ignored.
     * </pre>
     *
     * <code>repeated string attributesExcludedFromInheritance = 3;</code>
     * @param value The bytes of the attributesExcludedFromInheritance to add.
     * @return This builder for chaining.
     */
    public Builder addAttributesExcludedFromInheritanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAttributesExcludedFromInheritanceIsMutable();
      attributesExcludedFromInheritance_.add(value);
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation)
  private static final io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation>
      PARSER = new com.google.protobuf.AbstractParser<GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation>() {
    @java.lang.Override
    public GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcModifyReflectedReferenceAttributeInheritanceSchemaMutation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

