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

public final class GrpcEnums {
  private GrpcEnums() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcEvitaAssociatedDataDataType_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcEvitaAssociatedDataDataType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017GrpcEnums.proto\022%io.evitadb.externalAp" +
      "i.grpc.generated\"\326\006\n\037GrpcEvitaAssociated" +
      "DataDataType\"\262\006\n\021GrpcEvitaDataType\022\n\n\006ST" +
      "RING\020\000\022\010\n\004BYTE\020\001\022\t\n\005SHORT\020\002\022\013\n\007INTEGER\020\003" +
      "\022\010\n\004LONG\020\004\022\013\n\007BOOLEAN\020\005\022\r\n\tCHARACTER\020\006\022\017" +
      "\n\013BIG_DECIMAL\020\007\022\024\n\020OFFSET_DATE_TIME\020\010\022\023\n" +
      "\017LOCAL_DATE_TIME\020\t\022\016\n\nLOCAL_DATE\020\n\022\016\n\nLO" +
      "CAL_TIME\020\013\022\023\n\017DATE_TIME_RANGE\020\014\022\025\n\021BIG_D" +
      "ECIMAL_RANGE\020\r\022\016\n\nLONG_RANGE\020\016\022\021\n\rINTEGE" +
      "R_RANGE\020\017\022\017\n\013SHORT_RANGE\020\020\022\016\n\nBYTE_RANGE" +
      "\020\021\022\n\n\006LOCALE\020\022\022\014\n\010CURRENCY\020\023\022\010\n\004UUID\020\024\022\027" +
      "\n\023COMPLEX_DATA_OBJECT\020\025\022\020\n\014STRING_ARRAY\020" +
      "2\022\016\n\nBYTE_ARRAY\0203\022\017\n\013SHORT_ARRAY\0204\022\021\n\rIN" +
      "TEGER_ARRAY\0205\022\016\n\nLONG_ARRAY\0206\022\021\n\rBOOLEAN" +
      "_ARRAY\0207\022\023\n\017CHARACTER_ARRAY\0208\022\025\n\021BIG_DEC" +
      "IMAL_ARRAY\0209\022\032\n\026OFFSET_DATE_TIME_ARRAY\020:" +
      "\022\031\n\025LOCAL_DATE_TIME_ARRAY\020;\022\024\n\020LOCAL_DAT" +
      "E_ARRAY\020<\022\024\n\020LOCAL_TIME_ARRAY\020=\022\031\n\025DATE_" +
      "TIME_RANGE_ARRAY\020>\022\033\n\027BIG_DECIMAL_RANGE_" +
      "ARRAY\020?\022\024\n\020LONG_RANGE_ARRAY\020@\022\027\n\023INTEGER" +
      "_RANGE_ARRAY\020A\022\025\n\021SHORT_RANGE_ARRAY\020B\022\024\n" +
      "\020BYTE_RANGE_ARRAY\020C\022\020\n\014LOCALE_ARRAY\020D\022\022\n" +
      "\016CURRENCY_ARRAY\020E\022\016\n\nUUID_ARRAY\020F*-\n\020Grp" +
      "cCatalogState\022\016\n\nWARMING_UP\020\000\022\t\n\005ALIVE\020\001" +
      "*p\n\033GrpcAttributeUniquenessType\022\016\n\nNOT_U" +
      "NIQUE\020\000\022\034\n\030UNIQUE_WITHIN_COLLECTION\020\001\022#\n" +
      "\037UNIQUE_WITHIN_COLLECTION_LOCALE\020\002*y\n!Gr" +
      "pcGlobalAttributeUniquenessType\022\027\n\023NOT_G" +
      "LOBALLY_UNIQUE\020\000\022\031\n\025UNIQUE_WITHIN_CATALO" +
      "G\020\001\022 \n\034UNIQUE_WITHIN_CATALOG_LOCALE\020\002*3\n" +
      "\022GrpcQueryPriceMode\022\014\n\010WITH_TAX\020\000\022\017\n\013WIT" +
      "HOUT_TAX\020\001*F\n\024GrpcPriceContentMode\022\016\n\nFE" +
      "TCH_NONE\020\000\022\025\n\021RESPECTING_FILTER\020\001\022\007\n\003ALL" +
      "\020\002*\'\n\022GrpcOrderDirection\022\007\n\003ASC\020\000\022\010\n\004DES" +
      "C\020\001*5\n\022GrpcOrderBehaviour\022\017\n\013NULLS_FIRST" +
      "\020\000\022\016\n\nNULLS_LAST\020\001*3\n\031GrpcAttributeSpeci" +
      "alValue\022\010\n\004NULL\020\000\022\014\n\010NOT_NULL\020\001*2\n\030GrpcF" +
      "acetStatisticsDepth\022\n\n\006COUNTS\020\000\022\n\n\006IMPAC" +
      "T\020\001*I\n$GrpcEmptyHierarchicalEntityBehavi" +
      "our\022\017\n\013LEAVE_EMPTY\020\000\022\020\n\014REMOVE_EMPTY\020\001*B" +
      "\n\022GrpcStatisticsBase\022\023\n\017COMPLETE_FILTER\020" +
      "\000\022\027\n\023WITHOUT_USER_FILTER\020\001*B\n\022GrpcStatis" +
      "ticsType\022\022\n\016CHILDREN_COUNT\020\000\022\030\n\024QUERIED_" +
      "ENTITY_COUNT\020\001*4\n\025GrpcHistogramBehavior\022" +
      "\014\n\010STANDARD\020\000\022\r\n\tOPTIMIZED\020\001*7\n\036GrpcMana" +
      "gedReferencesBehaviour\022\007\n\003ANY\020\000\022\014\n\010EXIST" +
      "ING\020\001*P\n\034GrpcPriceInnerRecordHandling\022\010\n" +
      "\004NONE\020\000\022\020\n\014LOWEST_PRICE\020\001\022\007\n\003SUM\020\002\022\013\n\007UN" +
      "KNOWN\020\003*]\n\017GrpcSessionType\022\r\n\tREAD_ONLY\020" +
      "\000\022\016\n\nREAD_WRITE\020\001\022\024\n\020BINARY_READ_ONLY\020\002\022" +
      "\025\n\021BINARY_READ_WRITE\020\003*i\n\017GrpcCardinalit" +
      "y\022\021\n\rNOT_SPECIFIED\020\000\022\017\n\013ZERO_OR_ONE\020\001\022\017\n" +
      "\013EXACTLY_ONE\020\002\022\020\n\014ZERO_OR_MORE\020\003\022\017\n\013ONE_" +
      "OR_MORE\020\004*\323\001\n\021GrpcEvolutionMode\022 \n\034ADAPT" +
      "_PRIMARY_KEY_GENERATION\020\000\022\025\n\021ADDING_ATTR" +
      "IBUTES\020\001\022\032\n\026ADDING_ASSOCIATED_DATA\020\002\022\025\n\021" +
      "ADDING_REFERENCES\020\003\022\021\n\rADDING_PRICES\020\004\022\022" +
      "\n\016ADDING_LOCALES\020\005\022\025\n\021ADDING_CURRENCIES\020" +
      "\006\022\024\n\020ADDING_HIERARCHY\020\007*3\n\030GrpcCatalogEv" +
      "olutionMode\022\027\n\023ADDING_ENTITY_TYPES\020\000*@\n\027" +
      "GrpcAttributeSchemaType\022\n\n\006GLOBAL\020\000\022\n\n\006E" +
      "NTITY\020\001\022\r\n\tREFERENCE\020\002*\360\006\n\021GrpcEvitaData" +
      "Type\022\n\n\006STRING\020\000\022\010\n\004BYTE\020\001\022\t\n\005SHORT\020\002\022\013\n" +
      "\007INTEGER\020\003\022\010\n\004LONG\020\004\022\013\n\007BOOLEAN\020\005\022\r\n\tCHA" +
      "RACTER\020\006\022\017\n\013BIG_DECIMAL\020\007\022\024\n\020OFFSET_DATE" +
      "_TIME\020\010\022\023\n\017LOCAL_DATE_TIME\020\t\022\016\n\nLOCAL_DA" +
      "TE\020\n\022\016\n\nLOCAL_TIME\020\013\022\023\n\017DATE_TIME_RANGE\020" +
      "\014\022\034\n\030BIG_DECIMAL_NUMBER_RANGE\020\r\022\025\n\021LONG_" +
      "NUMBER_RANGE\020\016\022\030\n\024INTEGER_NUMBER_RANGE\020\017" +
      "\022\026\n\022SHORT_NUMBER_RANGE\020\020\022\025\n\021BYTE_NUMBER_" +
      "RANGE\020\021\022\n\n\006LOCALE\020\022\022\014\n\010CURRENCY\020\023\022\010\n\004UUI" +
      "D\020\024\022\017\n\013PREDECESSOR\020\025\022\020\n\014STRING_ARRAY\0202\022\016" +
      "\n\nBYTE_ARRAY\0203\022\017\n\013SHORT_ARRAY\0204\022\021\n\rINTEG" +
      "ER_ARRAY\0205\022\016\n\nLONG_ARRAY\0206\022\021\n\rBOOLEAN_AR" +
      "RAY\0207\022\023\n\017CHARACTER_ARRAY\0208\022\025\n\021BIG_DECIMA" +
      "L_ARRAY\0209\022\032\n\026OFFSET_DATE_TIME_ARRAY\020:\022\031\n" +
      "\025LOCAL_DATE_TIME_ARRAY\020;\022\024\n\020LOCAL_DATE_A" +
      "RRAY\020<\022\024\n\020LOCAL_TIME_ARRAY\020=\022\031\n\025DATE_TIM" +
      "E_RANGE_ARRAY\020>\022\"\n\036BIG_DECIMAL_NUMBER_RA" +
      "NGE_ARRAY\020?\022\033\n\027LONG_NUMBER_RANGE_ARRAY\020@" +
      "\022\036\n\032INTEGER_NUMBER_RANGE_ARRAY\020A\022\034\n\030SHOR" +
      "T_NUMBER_RANGE_ARRAY\020B\022\033\n\027BYTE_NUMBER_RA" +
      "NGE_ARRAY\020C\022\020\n\014LOCALE_ARRAY\020D\022\022\n\016CURRENC" +
      "Y_ARRAY\020E\022\016\n\nUUID_ARRAY\020F*\301\004\n\016GrpcQueryP" +
      "hase\022\013\n\007OVERALL\020\000\022\014\n\010PLANNING\020\001\022\031\n\025PLANN" +
      "ING_NESTED_QUERY\020\002\022\030\n\024PLANNING_INDEX_USA" +
      "GE\020\003\022\023\n\017PLANNING_FILTER\020\004\022 \n\034PLANNING_FI" +
      "LTER_NESTED_QUERY\020\005\022\037\n\033PLANNING_FILTER_A" +
      "LTERNATIVE\020\006\022\021\n\rPLANNING_SORT\020\007\022\035\n\031PLANN" +
      "ING_SORT_ALTERNATIVE\020\010\022%\n!PLANNING_EXTRA" +
      "_RESULT_FABRICATION\020\t\0221\n-PLANNING_EXTRA_" +
      "RESULT_FABRICATION_ALTERNATIVE\020\n\022\r\n\tEXEC" +
      "UTION\020\013\022\026\n\022EXECUTION_PREFETCH\020\014\022\024\n\020EXECU" +
      "TION_FILTER\020\r\022!\n\035EXECUTION_FILTER_NESTED" +
      "_QUERY\020\016\022\034\n\030EXECUTION_SORT_AND_SLICE\020\017\022\035" +
      "\n\031EXTRA_RESULTS_FABRICATION\020\020\022!\n\035EXTRA_R" +
      "ESULT_ITEM_FABRICATION\020\021\022\014\n\010FETCHING\020\022\022\027" +
      "\n\023FETCHING_REFERENCES\020\023\022\024\n\020FETCHING_PARE" +
      "NTS\020\024*H\n\023GrpcEntityExistence\022\r\n\tMAY_EXIS" +
      "T\020\000\022\022\n\016MUST_NOT_EXIST\020\001\022\016\n\nMUST_EXIST\020\002*" +
      "t\n\022GrpcCommitBehavior\022 \n\034WAIT_FOR_CONFLI" +
      "CT_RESOLUTION\020\000\022\034\n\030WAIT_FOR_LOG_PERSISTE" +
      "NCE\020\001\022\036\n\032WAIT_FOR_INDEX_PROPAGATION\020\002B\014P" +
      "\001\252\002\007EvitaDBb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcEvitaAssociatedDataDataType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcEvitaAssociatedDataDataType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcEvitaAssociatedDataDataType_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
