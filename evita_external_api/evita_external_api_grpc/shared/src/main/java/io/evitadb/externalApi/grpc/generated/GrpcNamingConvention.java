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
// source: GrpcEnums.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * <pre>
 * Contains set of all supported/used naming conventions in evitaDB APIs.
 * </pre>
 *
 * Protobuf enum {@code io.evitadb.externalApi.grpc.generated.GrpcNamingConvention}
 */
public enum GrpcNamingConvention
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Camel case: https://en.wikipedia.org/wiki/Camel_case
   * </pre>
   *
   * <code>CAMEL_CASE = 0;</code>
   */
  CAMEL_CASE(0),
  /**
   * <pre>
   * Pascal case: https://www.theserverside.com/definition/Pascal-case
   * </pre>
   *
   * <code>PASCAL_CASE = 1;</code>
   */
  PASCAL_CASE(1),
  /**
   * <pre>
   * Snake case: https://en.wikipedia.org/wiki/Snake_case
   * </pre>
   *
   * <code>SNAKE_CASE = 2;</code>
   */
  SNAKE_CASE(2),
  /**
   * <pre>
   * Capitalized snake case: https://en.wikipedia.org/wiki/Snake_case
   * </pre>
   *
   * <code>UPPER_SNAKE_CASE = 3;</code>
   */
  UPPER_SNAKE_CASE(3),
  /**
   * <pre>
   * Kebab case: https://en.wikipedia.org/wiki/Letter_case#Kebab_case
   * </pre>
   *
   * <code>KEBAB_CASE = 4;</code>
   */
  KEBAB_CASE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Camel case: https://en.wikipedia.org/wiki/Camel_case
   * </pre>
   *
   * <code>CAMEL_CASE = 0;</code>
   */
  public static final int CAMEL_CASE_VALUE = 0;
  /**
   * <pre>
   * Pascal case: https://www.theserverside.com/definition/Pascal-case
   * </pre>
   *
   * <code>PASCAL_CASE = 1;</code>
   */
  public static final int PASCAL_CASE_VALUE = 1;
  /**
   * <pre>
   * Snake case: https://en.wikipedia.org/wiki/Snake_case
   * </pre>
   *
   * <code>SNAKE_CASE = 2;</code>
   */
  public static final int SNAKE_CASE_VALUE = 2;
  /**
   * <pre>
   * Capitalized snake case: https://en.wikipedia.org/wiki/Snake_case
   * </pre>
   *
   * <code>UPPER_SNAKE_CASE = 3;</code>
   */
  public static final int UPPER_SNAKE_CASE_VALUE = 3;
  /**
   * <pre>
   * Kebab case: https://en.wikipedia.org/wiki/Letter_case#Kebab_case
   * </pre>
   *
   * <code>KEBAB_CASE = 4;</code>
   */
  public static final int KEBAB_CASE_VALUE = 4;


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
  public static GrpcNamingConvention valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GrpcNamingConvention forNumber(int value) {
    switch (value) {
      case 0: return CAMEL_CASE;
      case 1: return PASCAL_CASE;
      case 2: return SNAKE_CASE;
      case 3: return UPPER_SNAKE_CASE;
      case 4: return KEBAB_CASE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GrpcNamingConvention>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GrpcNamingConvention> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GrpcNamingConvention>() {
          public GrpcNamingConvention findValueByNumber(int number) {
            return GrpcNamingConvention.forNumber(number);
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
    return io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor().getEnumTypes().get(24);
  }

  private static final GrpcNamingConvention[] VALUES = values();

  public static GrpcNamingConvention valueOf(
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

  private GrpcNamingConvention(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.evitadb.externalApi.grpc.generated.GrpcNamingConvention)
}
