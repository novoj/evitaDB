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
 * Protobuf enum {@code io.evitadb.externalApi.grpc.generated.GrpcQueryPhase}
 */
public enum GrpcQueryPhase
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OVERALL = 0;</code>
   */
  OVERALL(0),
  /**
   * <code>PLANNING = 1;</code>
   */
  PLANNING(1),
  /**
   * <code>PLANNING_NESTED_QUERY = 2;</code>
   */
  PLANNING_NESTED_QUERY(2),
  /**
   * <code>PLANNING_INDEX_USAGE = 3;</code>
   */
  PLANNING_INDEX_USAGE(3),
  /**
   * <code>PLANNING_FILTER = 4;</code>
   */
  PLANNING_FILTER(4),
  /**
   * <code>PLANNING_FILTER_NESTED_QUERY = 5;</code>
   */
  PLANNING_FILTER_NESTED_QUERY(5),
  /**
   * <code>PLANNING_FILTER_ALTERNATIVE = 6;</code>
   */
  PLANNING_FILTER_ALTERNATIVE(6),
  /**
   * <code>PLANNING_SORT = 7;</code>
   */
  PLANNING_SORT(7),
  /**
   * <code>PLANNING_SORT_ALTERNATIVE = 8;</code>
   */
  PLANNING_SORT_ALTERNATIVE(8),
  /**
   * <code>PLANNING_EXTRA_RESULT_FABRICATION = 9;</code>
   */
  PLANNING_EXTRA_RESULT_FABRICATION(9),
  /**
   * <code>PLANNING_EXTRA_RESULT_FABRICATION_ALTERNATIVE = 10;</code>
   */
  PLANNING_EXTRA_RESULT_FABRICATION_ALTERNATIVE(10),
  /**
   * <code>EXECUTION = 11;</code>
   */
  EXECUTION(11),
  /**
   * <code>EXECUTION_PREFETCH = 12;</code>
   */
  EXECUTION_PREFETCH(12),
  /**
   * <code>EXECUTION_FILTER = 13;</code>
   */
  EXECUTION_FILTER(13),
  /**
   * <code>EXECUTION_FILTER_NESTED_QUERY = 14;</code>
   */
  EXECUTION_FILTER_NESTED_QUERY(14),
  /**
   * <code>EXECUTION_SORT_AND_SLICE = 15;</code>
   */
  EXECUTION_SORT_AND_SLICE(15),
  /**
   * <code>EXTRA_RESULTS_FABRICATION = 16;</code>
   */
  EXTRA_RESULTS_FABRICATION(16),
  /**
   * <code>EXTRA_RESULT_ITEM_FABRICATION = 17;</code>
   */
  EXTRA_RESULT_ITEM_FABRICATION(17),
  /**
   * <code>FETCHING = 18;</code>
   */
  FETCHING(18),
  /**
   * <code>FETCHING_REFERENCES = 19;</code>
   */
  FETCHING_REFERENCES(19),
  /**
   * <code>FETCHING_PARENTS = 20;</code>
   */
  FETCHING_PARENTS(20),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OVERALL = 0;</code>
   */
  public static final int OVERALL_VALUE = 0;
  /**
   * <code>PLANNING = 1;</code>
   */
  public static final int PLANNING_VALUE = 1;
  /**
   * <code>PLANNING_NESTED_QUERY = 2;</code>
   */
  public static final int PLANNING_NESTED_QUERY_VALUE = 2;
  /**
   * <code>PLANNING_INDEX_USAGE = 3;</code>
   */
  public static final int PLANNING_INDEX_USAGE_VALUE = 3;
  /**
   * <code>PLANNING_FILTER = 4;</code>
   */
  public static final int PLANNING_FILTER_VALUE = 4;
  /**
   * <code>PLANNING_FILTER_NESTED_QUERY = 5;</code>
   */
  public static final int PLANNING_FILTER_NESTED_QUERY_VALUE = 5;
  /**
   * <code>PLANNING_FILTER_ALTERNATIVE = 6;</code>
   */
  public static final int PLANNING_FILTER_ALTERNATIVE_VALUE = 6;
  /**
   * <code>PLANNING_SORT = 7;</code>
   */
  public static final int PLANNING_SORT_VALUE = 7;
  /**
   * <code>PLANNING_SORT_ALTERNATIVE = 8;</code>
   */
  public static final int PLANNING_SORT_ALTERNATIVE_VALUE = 8;
  /**
   * <code>PLANNING_EXTRA_RESULT_FABRICATION = 9;</code>
   */
  public static final int PLANNING_EXTRA_RESULT_FABRICATION_VALUE = 9;
  /**
   * <code>PLANNING_EXTRA_RESULT_FABRICATION_ALTERNATIVE = 10;</code>
   */
  public static final int PLANNING_EXTRA_RESULT_FABRICATION_ALTERNATIVE_VALUE = 10;
  /**
   * <code>EXECUTION = 11;</code>
   */
  public static final int EXECUTION_VALUE = 11;
  /**
   * <code>EXECUTION_PREFETCH = 12;</code>
   */
  public static final int EXECUTION_PREFETCH_VALUE = 12;
  /**
   * <code>EXECUTION_FILTER = 13;</code>
   */
  public static final int EXECUTION_FILTER_VALUE = 13;
  /**
   * <code>EXECUTION_FILTER_NESTED_QUERY = 14;</code>
   */
  public static final int EXECUTION_FILTER_NESTED_QUERY_VALUE = 14;
  /**
   * <code>EXECUTION_SORT_AND_SLICE = 15;</code>
   */
  public static final int EXECUTION_SORT_AND_SLICE_VALUE = 15;
  /**
   * <code>EXTRA_RESULTS_FABRICATION = 16;</code>
   */
  public static final int EXTRA_RESULTS_FABRICATION_VALUE = 16;
  /**
   * <code>EXTRA_RESULT_ITEM_FABRICATION = 17;</code>
   */
  public static final int EXTRA_RESULT_ITEM_FABRICATION_VALUE = 17;
  /**
   * <code>FETCHING = 18;</code>
   */
  public static final int FETCHING_VALUE = 18;
  /**
   * <code>FETCHING_REFERENCES = 19;</code>
   */
  public static final int FETCHING_REFERENCES_VALUE = 19;
  /**
   * <code>FETCHING_PARENTS = 20;</code>
   */
  public static final int FETCHING_PARENTS_VALUE = 20;


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
  public static GrpcQueryPhase valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GrpcQueryPhase forNumber(int value) {
    switch (value) {
      case 0: return OVERALL;
      case 1: return PLANNING;
      case 2: return PLANNING_NESTED_QUERY;
      case 3: return PLANNING_INDEX_USAGE;
      case 4: return PLANNING_FILTER;
      case 5: return PLANNING_FILTER_NESTED_QUERY;
      case 6: return PLANNING_FILTER_ALTERNATIVE;
      case 7: return PLANNING_SORT;
      case 8: return PLANNING_SORT_ALTERNATIVE;
      case 9: return PLANNING_EXTRA_RESULT_FABRICATION;
      case 10: return PLANNING_EXTRA_RESULT_FABRICATION_ALTERNATIVE;
      case 11: return EXECUTION;
      case 12: return EXECUTION_PREFETCH;
      case 13: return EXECUTION_FILTER;
      case 14: return EXECUTION_FILTER_NESTED_QUERY;
      case 15: return EXECUTION_SORT_AND_SLICE;
      case 16: return EXTRA_RESULTS_FABRICATION;
      case 17: return EXTRA_RESULT_ITEM_FABRICATION;
      case 18: return FETCHING;
      case 19: return FETCHING_REFERENCES;
      case 20: return FETCHING_PARENTS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GrpcQueryPhase>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GrpcQueryPhase> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GrpcQueryPhase>() {
          public GrpcQueryPhase findValueByNumber(int number) {
            return GrpcQueryPhase.forNumber(number);
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
    return io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor().getEnumTypes().get(16);
  }

  private static final GrpcQueryPhase[] VALUES = values();

  public static GrpcQueryPhase valueOf(
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

  private GrpcQueryPhase(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.evitadb.externalApi.grpc.generated.GrpcQueryPhase)
}

