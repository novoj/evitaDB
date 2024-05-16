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
// source: GrpcEnums.proto

package io.evitadb.externalApi.grpc.generated;

/**
 * <pre>
 * This enum represents the uniqueness type of an {&#64;link AttributeSchema}. It is used to determine whether the attribute
 * value must be unique among all the entity attributes of this type or whether it must be unique only among attributes
 * of the same locale.
 * </pre>
 *
 * Protobuf enum {@code io.evitadb.externalApi.grpc.generated.GrpcAttributeUniquenessType}
 */
public enum GrpcAttributeUniquenessType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The attribute is not unique (default).
   * </pre>
   *
   * <code>NOT_UNIQUE = 0;</code>
   */
  NOT_UNIQUE(0),
  /**
   * <pre>
   * The attribute value must be unique among all the entities of the same collection.
   * </pre>
   *
   * <code>UNIQUE_WITHIN_COLLECTION = 1;</code>
   */
  UNIQUE_WITHIN_COLLECTION(1),
  /**
   * <pre>
   * The localized attribute value must be unique among all values of the same {&#64;link Locale} among all the entities
   * using of the same collection.
   * </pre>
   *
   * <code>UNIQUE_WITHIN_COLLECTION_LOCALE = 2;</code>
   */
  UNIQUE_WITHIN_COLLECTION_LOCALE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The attribute is not unique (default).
   * </pre>
   *
   * <code>NOT_UNIQUE = 0;</code>
   */
  public static final int NOT_UNIQUE_VALUE = 0;
  /**
   * <pre>
   * The attribute value must be unique among all the entities of the same collection.
   * </pre>
   *
   * <code>UNIQUE_WITHIN_COLLECTION = 1;</code>
   */
  public static final int UNIQUE_WITHIN_COLLECTION_VALUE = 1;
  /**
   * <pre>
   * The localized attribute value must be unique among all values of the same {&#64;link Locale} among all the entities
   * using of the same collection.
   * </pre>
   *
   * <code>UNIQUE_WITHIN_COLLECTION_LOCALE = 2;</code>
   */
  public static final int UNIQUE_WITHIN_COLLECTION_LOCALE_VALUE = 2;


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
  public static GrpcAttributeUniquenessType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GrpcAttributeUniquenessType forNumber(int value) {
    switch (value) {
      case 0: return NOT_UNIQUE;
      case 1: return UNIQUE_WITHIN_COLLECTION;
      case 2: return UNIQUE_WITHIN_COLLECTION_LOCALE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GrpcAttributeUniquenessType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GrpcAttributeUniquenessType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GrpcAttributeUniquenessType>() {
          public GrpcAttributeUniquenessType findValueByNumber(int number) {
            return GrpcAttributeUniquenessType.forNumber(number);
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
    return io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor().getEnumTypes().get(1);
  }

  private static final GrpcAttributeUniquenessType[] VALUES = values();

  public static GrpcAttributeUniquenessType valueOf(
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

  private GrpcAttributeUniquenessType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.evitadb.externalApi.grpc.generated.GrpcAttributeUniquenessType)
}

