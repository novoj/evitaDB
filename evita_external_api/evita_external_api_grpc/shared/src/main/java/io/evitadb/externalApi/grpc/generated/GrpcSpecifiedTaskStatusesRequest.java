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
// source: GrpcEvitaManagementAPI.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * <pre>
 * Request to get multiple task statuses.
 * </pre>
 *
 * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest}
 */
public final class GrpcSpecifiedTaskStatusesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest)
    GrpcSpecifiedTaskStatusesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrpcSpecifiedTaskStatusesRequest.newBuilder() to construct.
  private GrpcSpecifiedTaskStatusesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcSpecifiedTaskStatusesRequest() {
    taskIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrpcSpecifiedTaskStatusesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrpcSpecifiedTaskStatusesRequest(
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
              taskIds_ = new java.util.ArrayList<io.evitadb.externalApi.grpc.generated.GrpcUuid>();
              mutable_bitField0_ |= 0x00000001;
            }
            taskIds_.add(
                input.readMessage(io.evitadb.externalApi.grpc.generated.GrpcUuid.parser(), extensionRegistry));
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
        taskIds_ = java.util.Collections.unmodifiableList(taskIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.evitadb.externalApi.grpc.generated.GrpcEvitaManagementAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSpecifiedTaskStatusesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.evitadb.externalApi.grpc.generated.GrpcEvitaManagementAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSpecifiedTaskStatusesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest.class, io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest.Builder.class);
  }

  public static final int TASKIDS_FIELD_NUMBER = 1;
  private java.util.List<io.evitadb.externalApi.grpc.generated.GrpcUuid> taskIds_;
  /**
   * <pre>
   * set of task ids to be listed
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.evitadb.externalApi.grpc.generated.GrpcUuid> getTaskIdsList() {
    return taskIds_;
  }
  /**
   * <pre>
   * set of task ids to be listed
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcUuidOrBuilder>
      getTaskIdsOrBuilderList() {
    return taskIds_;
  }
  /**
   * <pre>
   * set of task ids to be listed
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
   */
  @java.lang.Override
  public int getTaskIdsCount() {
    return taskIds_.size();
  }
  /**
   * <pre>
   * set of task ids to be listed
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
   */
  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcUuid getTaskIds(int index) {
    return taskIds_.get(index);
  }
  /**
   * <pre>
   * set of task ids to be listed
   * </pre>
   *
   * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
   */
  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcUuidOrBuilder getTaskIdsOrBuilder(
      int index) {
    return taskIds_.get(index);
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
    for (int i = 0; i < taskIds_.size(); i++) {
      output.writeMessage(1, taskIds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < taskIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, taskIds_.get(i));
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
    if (!(obj instanceof io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest)) {
      return super.equals(obj);
    }
    io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest other = (io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest) obj;

    if (!getTaskIdsList()
        .equals(other.getTaskIdsList())) return false;
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
    if (getTaskIdsCount() > 0) {
      hash = (37 * hash) + TASKIDS_FIELD_NUMBER;
      hash = (53 * hash) + getTaskIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parseFrom(
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
  public static Builder newBuilder(io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest prototype) {
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
   * Request to get multiple task statuses.
   * </pre>
   *
   * Protobuf type {@code io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest)
      io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaManagementAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSpecifiedTaskStatusesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaManagementAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSpecifiedTaskStatusesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest.class, io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest.Builder.class);
    }

    // Construct using io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest.newBuilder()
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
        getTaskIdsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (taskIdsBuilder_ == null) {
        taskIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        taskIdsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcEvitaManagementAPI.internal_static_io_evitadb_externalApi_grpc_generated_GrpcSpecifiedTaskStatusesRequest_descriptor;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest getDefaultInstanceForType() {
      return io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest build() {
      io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest buildPartial() {
      io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest result = new io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest(this);
      int from_bitField0_ = bitField0_;
      if (taskIdsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          taskIds_ = java.util.Collections.unmodifiableList(taskIds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.taskIds_ = taskIds_;
      } else {
        result.taskIds_ = taskIdsBuilder_.build();
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
      if (other instanceof io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest) {
        return mergeFrom((io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest other) {
      if (other == io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest.getDefaultInstance()) return this;
      if (taskIdsBuilder_ == null) {
        if (!other.taskIds_.isEmpty()) {
          if (taskIds_.isEmpty()) {
            taskIds_ = other.taskIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTaskIdsIsMutable();
            taskIds_.addAll(other.taskIds_);
          }
          onChanged();
        }
      } else {
        if (!other.taskIds_.isEmpty()) {
          if (taskIdsBuilder_.isEmpty()) {
            taskIdsBuilder_.dispose();
            taskIdsBuilder_ = null;
            taskIds_ = other.taskIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            taskIdsBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTaskIdsFieldBuilder() : null;
          } else {
            taskIdsBuilder_.addAllMessages(other.taskIds_);
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
      io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.evitadb.externalApi.grpc.generated.GrpcUuid> taskIds_ =
      java.util.Collections.emptyList();
    private void ensureTaskIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        taskIds_ = new java.util.ArrayList<io.evitadb.externalApi.grpc.generated.GrpcUuid>(taskIds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.evitadb.externalApi.grpc.generated.GrpcUuid, io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder, io.evitadb.externalApi.grpc.generated.GrpcUuidOrBuilder> taskIdsBuilder_;

    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public java.util.List<io.evitadb.externalApi.grpc.generated.GrpcUuid> getTaskIdsList() {
      if (taskIdsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(taskIds_);
      } else {
        return taskIdsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public int getTaskIdsCount() {
      if (taskIdsBuilder_ == null) {
        return taskIds_.size();
      } else {
        return taskIdsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcUuid getTaskIds(int index) {
      if (taskIdsBuilder_ == null) {
        return taskIds_.get(index);
      } else {
        return taskIdsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder setTaskIds(
        int index, io.evitadb.externalApi.grpc.generated.GrpcUuid value) {
      if (taskIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaskIdsIsMutable();
        taskIds_.set(index, value);
        onChanged();
      } else {
        taskIdsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder setTaskIds(
        int index, io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder builderForValue) {
      if (taskIdsBuilder_ == null) {
        ensureTaskIdsIsMutable();
        taskIds_.set(index, builderForValue.build());
        onChanged();
      } else {
        taskIdsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder addTaskIds(io.evitadb.externalApi.grpc.generated.GrpcUuid value) {
      if (taskIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaskIdsIsMutable();
        taskIds_.add(value);
        onChanged();
      } else {
        taskIdsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder addTaskIds(
        int index, io.evitadb.externalApi.grpc.generated.GrpcUuid value) {
      if (taskIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTaskIdsIsMutable();
        taskIds_.add(index, value);
        onChanged();
      } else {
        taskIdsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder addTaskIds(
        io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder builderForValue) {
      if (taskIdsBuilder_ == null) {
        ensureTaskIdsIsMutable();
        taskIds_.add(builderForValue.build());
        onChanged();
      } else {
        taskIdsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder addTaskIds(
        int index, io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder builderForValue) {
      if (taskIdsBuilder_ == null) {
        ensureTaskIdsIsMutable();
        taskIds_.add(index, builderForValue.build());
        onChanged();
      } else {
        taskIdsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder addAllTaskIds(
        java.lang.Iterable<? extends io.evitadb.externalApi.grpc.generated.GrpcUuid> values) {
      if (taskIdsBuilder_ == null) {
        ensureTaskIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, taskIds_);
        onChanged();
      } else {
        taskIdsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder clearTaskIds() {
      if (taskIdsBuilder_ == null) {
        taskIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        taskIdsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public Builder removeTaskIds(int index) {
      if (taskIdsBuilder_ == null) {
        ensureTaskIdsIsMutable();
        taskIds_.remove(index);
        onChanged();
      } else {
        taskIdsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder getTaskIdsBuilder(
        int index) {
      return getTaskIdsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcUuidOrBuilder getTaskIdsOrBuilder(
        int index) {
      if (taskIdsBuilder_ == null) {
        return taskIds_.get(index);  } else {
        return taskIdsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public java.util.List<? extends io.evitadb.externalApi.grpc.generated.GrpcUuidOrBuilder>
         getTaskIdsOrBuilderList() {
      if (taskIdsBuilder_ != null) {
        return taskIdsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(taskIds_);
      }
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder addTaskIdsBuilder() {
      return getTaskIdsFieldBuilder().addBuilder(
          io.evitadb.externalApi.grpc.generated.GrpcUuid.getDefaultInstance());
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder addTaskIdsBuilder(
        int index) {
      return getTaskIdsFieldBuilder().addBuilder(
          index, io.evitadb.externalApi.grpc.generated.GrpcUuid.getDefaultInstance());
    }
    /**
     * <pre>
     * set of task ids to be listed
     * </pre>
     *
     * <code>repeated .io.evitadb.externalApi.grpc.generated.GrpcUuid taskIds = 1;</code>
     */
    public java.util.List<io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder>
         getTaskIdsBuilderList() {
      return getTaskIdsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.evitadb.externalApi.grpc.generated.GrpcUuid, io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder, io.evitadb.externalApi.grpc.generated.GrpcUuidOrBuilder>
        getTaskIdsFieldBuilder() {
      if (taskIdsBuilder_ == null) {
        taskIdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.evitadb.externalApi.grpc.generated.GrpcUuid, io.evitadb.externalApi.grpc.generated.GrpcUuid.Builder, io.evitadb.externalApi.grpc.generated.GrpcUuidOrBuilder>(
                taskIds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        taskIds_ = null;
      }
      return taskIdsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest)
  }

  // @@protoc_insertion_point(class_scope:io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest)
  private static final io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest();
  }

  public static io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcSpecifiedTaskStatusesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GrpcSpecifiedTaskStatusesRequest>() {
    @java.lang.Override
    public GrpcSpecifiedTaskStatusesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrpcSpecifiedTaskStatusesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcSpecifiedTaskStatusesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcSpecifiedTaskStatusesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.evitadb.externalApi.grpc.generated.GrpcSpecifiedTaskStatusesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

