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
 *   https://github.com/FgForrest/evitaDB/blob/main/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcEnums.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * Protobuf enum {@code io.evitadb.externalApi.grpc.generated.GrpcCommitBehavior}
 */
public enum GrpcCommitBehavior
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Changes performed in the transaction are passed to evitaDB server, checked for conflicts and if no conflict
   * is found the transaction is marked as completed and commit is finished. This behaviour is fastest, but does
   * not guarantee that the changes are persisted on disk and durable. If the server crashes before the changes
   * are written to disk, the changes are lost.
   * </pre>
   *
   * <code>WAIT_FOR_CONFLICT_RESOLUTION = 0;</code>
   */
  WAIT_FOR_CONFLICT_RESOLUTION(0),
  /**
   * <pre>
   * Changes performed in the transaction are passed to evitaDB server, checked for conflicts and if no conflict
   * is found, they are written to Write Ahead Log (WAL) and transaction waits until the WAL is persisted on disk
   * (fsynced). After that the transaction is marked as completed and commit is finished. This behaviour is
   * slower than {&#64;link #NO_WAIT} but guarantees that the changes are persisted on disk and durable. The server
   * may decide to fsync changes from multiple transactions at once, so the transaction may wait longer than
   * necessary. This behaviour still does not guarantee that the changes will be visible immediately after
   * the commit - because they still need to be propagated to indexes in order new data can be found by queries.
   * This behaviour is default.
   * </pre>
   *
   * <code>WAIT_FOR_LOG_PERSISTENCE = 1;</code>
   */
  WAIT_FOR_LOG_PERSISTENCE(1),
  /**
   * <pre>
   * Changes performed in the transaction are passed to evitaDB server, checked for conflicts and if no conflict
   * is found, they are written to Write Ahead Log (WAL). Then the WAL is processed and all changes are propagated
   * to indexes. After that the transaction is marked as completed and commit is finished. This behaviour is
   * slowest but guarantees that the changes are persisted on disk and durable and that they are visible
   * immediately after the commit is marked as completed.
   * </pre>
   *
   * <code>WAIT_FOR_INDEX_PROPAGATION = 2;</code>
   */
  WAIT_FOR_INDEX_PROPAGATION(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Changes performed in the transaction are passed to evitaDB server, checked for conflicts and if no conflict
   * is found the transaction is marked as completed and commit is finished. This behaviour is fastest, but does
   * not guarantee that the changes are persisted on disk and durable. If the server crashes before the changes
   * are written to disk, the changes are lost.
   * </pre>
   *
   * <code>WAIT_FOR_CONFLICT_RESOLUTION = 0;</code>
   */
  public static final int WAIT_FOR_CONFLICT_RESOLUTION_VALUE = 0;
  /**
   * <pre>
   * Changes performed in the transaction are passed to evitaDB server, checked for conflicts and if no conflict
   * is found, they are written to Write Ahead Log (WAL) and transaction waits until the WAL is persisted on disk
   * (fsynced). After that the transaction is marked as completed and commit is finished. This behaviour is
   * slower than {&#64;link #NO_WAIT} but guarantees that the changes are persisted on disk and durable. The server
   * may decide to fsync changes from multiple transactions at once, so the transaction may wait longer than
   * necessary. This behaviour still does not guarantee that the changes will be visible immediately after
   * the commit - because they still need to be propagated to indexes in order new data can be found by queries.
   * This behaviour is default.
   * </pre>
   *
   * <code>WAIT_FOR_LOG_PERSISTENCE = 1;</code>
   */
  public static final int WAIT_FOR_LOG_PERSISTENCE_VALUE = 1;
  /**
   * <pre>
   * Changes performed in the transaction are passed to evitaDB server, checked for conflicts and if no conflict
   * is found, they are written to Write Ahead Log (WAL). Then the WAL is processed and all changes are propagated
   * to indexes. After that the transaction is marked as completed and commit is finished. This behaviour is
   * slowest but guarantees that the changes are persisted on disk and durable and that they are visible
   * immediately after the commit is marked as completed.
   * </pre>
   *
   * <code>WAIT_FOR_INDEX_PROPAGATION = 2;</code>
   */
  public static final int WAIT_FOR_INDEX_PROPAGATION_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GrpcCommitBehavior valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GrpcCommitBehavior forNumber(int value) {
    switch (value) {
      case 0: return WAIT_FOR_CONFLICT_RESOLUTION;
      case 1: return WAIT_FOR_LOG_PERSISTENCE;
      case 2: return WAIT_FOR_INDEX_PROPAGATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GrpcCommitBehavior>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GrpcCommitBehavior> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GrpcCommitBehavior>() {
          public GrpcCommitBehavior findValueByNumber(int number) {
            return GrpcCommitBehavior.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor().getEnumTypes().get(22);
  }

  private static final GrpcCommitBehavior[] VALUES = values();

  public static GrpcCommitBehavior valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GrpcCommitBehavior(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.evitadb.externalApi.grpc.generated.GrpcCommitBehavior)
}
