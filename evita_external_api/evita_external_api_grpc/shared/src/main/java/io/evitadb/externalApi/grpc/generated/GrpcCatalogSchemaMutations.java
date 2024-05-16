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
// source: GrpcCatalogSchemaMutations.proto

package io.evitadb.externalApi.grpc.generated;

public final class GrpcCatalogSchemaMutations {
  private GrpcCatalogSchemaMutations() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateCatalogSchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateCatalogSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaDescriptionMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaDescriptionMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaNameMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaNameMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcAllowEvolutionModeInCatalogSchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcAllowEvolutionModeInCatalogSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowEvolutionModeInCatalogSchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowEvolutionModeInCatalogSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveCatalogSchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveCatalogSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateEntitySchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateEntitySchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaNameMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaNameMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveEntitySchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveEntitySchemaMutation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GrpcCatalogSchemaMutations.proto\022%io.e" +
      "vitadb.externalApi.grpc.generated\032\017GrpcE" +
      "nums.proto\032\036GrpcEntitySchemaMutation.pro" +
      "to\032\036google/protobuf/wrappers.proto\"6\n\037Gr" +
      "pcCreateCatalogSchemaMutation\022\023\n\013catalog" +
      "Name\030\001 \001(\t\"_\n*GrpcModifyCatalogSchemaDes" +
      "criptionMutation\0221\n\013description\030\001 \001(\0132\034." +
      "google.protobuf.StringValue\"k\n#GrpcModif" +
      "yCatalogSchemaNameMutation\022\023\n\013catalogNam" +
      "e\030\001 \001(\t\022\026\n\016newCatalogName\030\002 \001(\t\022\027\n\017overw" +
      "riteTarget\030\003 \001(\010\"\210\001\n-GrpcAllowEvolutionM" +
      "odeInCatalogSchemaMutation\022W\n\016evolutionM" +
      "odes\030\001 \003(\0162?.io.evitadb.externalApi.grpc" +
      ".generated.GrpcCatalogEvolutionMode\"\213\001\n0" +
      "GrpcDisallowEvolutionModeInCatalogSchema" +
      "Mutation\022W\n\016evolutionModes\030\001 \003(\0162?.io.ev" +
      "itadb.externalApi.grpc.generated.GrpcCat" +
      "alogEvolutionMode\"6\n\037GrpcRemoveCatalogSc" +
      "hemaMutation\022\023\n\013catalogName\030\001 \001(\t\"4\n\036Grp" +
      "cCreateEntitySchemaMutation\022\022\n\nentityTyp" +
      "e\030\001 \001(\t\"\224\001\n\036GrpcModifyEntitySchemaMutati" +
      "on\022\022\n\nentityType\030\001 \001(\t\022^\n\025entitySchemaMu" +
      "tations\030\002 \003(\0132?.io.evitadb.externalApi.g" +
      "rpc.generated.GrpcEntitySchemaMutation\"\\" +
      "\n\"GrpcModifyEntitySchemaNameMutation\022\014\n\004" +
      "name\030\001 \001(\t\022\017\n\007newName\030\002 \001(\t\022\027\n\017overwrite" +
      "Target\030\003 \001(\010\".\n\036GrpcRemoveEntitySchemaMu" +
      "tation\022\014\n\004name\030\001 \001(\tB\014P\001\252\002\007EvitaDBb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor(),
          io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutationOuterClass.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateCatalogSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateCatalogSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateCatalogSchemaMutation_descriptor,
        new java.lang.String[] { "CatalogName", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaDescriptionMutation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaDescriptionMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaDescriptionMutation_descriptor,
        new java.lang.String[] { "Description", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaNameMutation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaNameMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyCatalogSchemaNameMutation_descriptor,
        new java.lang.String[] { "CatalogName", "NewCatalogName", "OverwriteTarget", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcAllowEvolutionModeInCatalogSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcAllowEvolutionModeInCatalogSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcAllowEvolutionModeInCatalogSchemaMutation_descriptor,
        new java.lang.String[] { "EvolutionModes", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowEvolutionModeInCatalogSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowEvolutionModeInCatalogSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcDisallowEvolutionModeInCatalogSchemaMutation_descriptor,
        new java.lang.String[] { "EvolutionModes", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveCatalogSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveCatalogSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveCatalogSchemaMutation_descriptor,
        new java.lang.String[] { "CatalogName", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateEntitySchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateEntitySchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateEntitySchemaMutation_descriptor,
        new java.lang.String[] { "EntityType", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaMutation_descriptor,
        new java.lang.String[] { "EntityType", "EntitySchemaMutations", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaNameMutation_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaNameMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyEntitySchemaNameMutation_descriptor,
        new java.lang.String[] { "Name", "NewName", "OverwriteTarget", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveEntitySchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveEntitySchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveEntitySchemaMutation_descriptor,
        new java.lang.String[] { "Name", });
    io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor();
    io.evitadb.externalApi.grpc.generated.GrpcEntitySchemaMutationOuterClass.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
