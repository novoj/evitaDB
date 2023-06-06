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
// source: GrpcEnums.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * Protobuf enum {@code io.evitadb.externalApi.grpc.generated.GrpcStatisticsBase}
 */
public enum GrpcStatisticsBase
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMPLETE_FILTER = 0;</code>
   */
  COMPLETE_FILTER(0),
  /**
   * <code>WITHOUT_USER_FILTER = 1;</code>
   */
  WITHOUT_USER_FILTER(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMPLETE_FILTER = 0;</code>
   */
  public static final int COMPLETE_FILTER_VALUE = 0;
  /**
   * <code>WITHOUT_USER_FILTER = 1;</code>
   */
  public static final int WITHOUT_USER_FILTER_VALUE = 1;


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
  public static GrpcStatisticsBase valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GrpcStatisticsBase forNumber(int value) {
    switch (value) {
      case 0: return COMPLETE_FILTER;
      case 1: return WITHOUT_USER_FILTER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GrpcStatisticsBase>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GrpcStatisticsBase> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GrpcStatisticsBase>() {
          public GrpcStatisticsBase findValueByNumber(int number) {
            return GrpcStatisticsBase.forNumber(number);
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
    return io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor().getEnumTypes().get(7);
  }

  private static final GrpcStatisticsBase[] VALUES = values();

  public static GrpcStatisticsBase valueOf(
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

  private GrpcStatisticsBase(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.evitadb.externalApi.grpc.generated.GrpcStatisticsBase)
}
