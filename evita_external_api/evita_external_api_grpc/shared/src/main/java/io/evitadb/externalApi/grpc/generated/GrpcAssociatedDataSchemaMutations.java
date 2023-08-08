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
// source: GrpcAssociatedDataSchemaMutations.proto

package io.evitadb.externalApi.grpc.generated;

public final class GrpcAssociatedDataSchemaMutations {
  private GrpcAssociatedDataSchemaMutations() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateAssociatedDataSchemaMutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateAssociatedDataSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDeprecationNoticeMutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDeprecationNoticeMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDescriptionMutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDescriptionMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaNameMutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaNameMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaTypeMutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaTypeMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveAssociatedDataSchemaMutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveAssociatedDataSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaLocalizedMutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaLocalizedMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaNullableMutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaNullableMutation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'GrpcAssociatedDataSchemaMutations.prot" +
      "o\022%io.evitadb.externalApi.grpc.generated" +
      "\032\017GrpcEnums.proto\032\036google/protobuf/wrapp" +
      "ers.proto\"\257\002\n&GrpcCreateAssociatedDataSc" +
      "hemaMutation\022\014\n\004name\030\001 \001(\t\0221\n\013descriptio" +
      "n\030\002 \001(\0132\034.google.protobuf.StringValue\0227\n" +
      "\021deprecationNotice\030\003 \001(\0132\034.google.protob" +
      "uf.StringValue\022f\n\004type\030\004 \001(\0162X.io.evitad" +
      "b.externalApi.grpc.generated.GrpcEvitaAs" +
      "sociatedDataDataType.GrpcEvitaDataType\022\021" +
      "\n\tlocalized\030\005 \001(\010\022\020\n\010nullable\030\006 \001(\010\"\200\001\n7" +
      "GrpcModifyAssociatedDataSchemaDeprecatio" +
      "nNoticeMutation\022\014\n\004name\030\001 \001(\t\0227\n\021depreca" +
      "tionNotice\030\002 \001(\0132\034.google.protobuf.Strin" +
      "gValue\"t\n1GrpcModifyAssociatedDataSchema" +
      "DescriptionMutation\022\014\n\004name\030\001 \001(\t\0221\n\013des" +
      "cription\030\002 \001(\0132\034.google.protobuf.StringV" +
      "alue\"K\n*GrpcModifyAssociatedDataSchemaNa" +
      "meMutation\022\014\n\004name\030\001 \001(\t\022\017\n\007newName\030\002 \001(" +
      "\t\"\242\001\n*GrpcModifyAssociatedDataSchemaType" +
      "Mutation\022\014\n\004name\030\001 \001(\t\022f\n\004type\030\002 \001(\0162X.i" +
      "o.evitadb.externalApi.grpc.generated.Grp" +
      "cEvitaAssociatedDataDataType.GrpcEvitaDa" +
      "taType\"6\n&GrpcRemoveAssociatedDataSchema" +
      "Mutation\022\014\n\004name\030\001 \001(\t\"O\n,GrpcSetAssocia" +
      "tedDataSchemaLocalizedMutation\022\014\n\004name\030\001" +
      " \001(\t\022\021\n\tlocalized\030\002 \001(\010\"M\n+GrpcSetAssoci" +
      "atedDataSchemaNullableMutation\022\014\n\004name\030\001" +
      " \001(\t\022\020\n\010nullable\030\002 \001(\010B\014P\001\252\002\007EvitaDBb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateAssociatedDataSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateAssociatedDataSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateAssociatedDataSchemaMutation_descriptor,
        new java.lang.String[] { "Name", "Description", "DeprecationNotice", "Type", "Localized", "Nullable", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDeprecationNoticeMutation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDeprecationNoticeMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDeprecationNoticeMutation_descriptor,
        new java.lang.String[] { "Name", "DeprecationNotice", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDescriptionMutation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDescriptionMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaDescriptionMutation_descriptor,
        new java.lang.String[] { "Name", "Description", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaNameMutation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaNameMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaNameMutation_descriptor,
        new java.lang.String[] { "Name", "NewName", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaTypeMutation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaTypeMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyAssociatedDataSchemaTypeMutation_descriptor,
        new java.lang.String[] { "Name", "Type", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveAssociatedDataSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveAssociatedDataSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveAssociatedDataSchemaMutation_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaLocalizedMutation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaLocalizedMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaLocalizedMutation_descriptor,
        new java.lang.String[] { "Name", "Localized", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaNullableMutation_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaNullableMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetAssociatedDataSchemaNullableMutation_descriptor,
        new java.lang.String[] { "Name", "Nullable", });
    io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
