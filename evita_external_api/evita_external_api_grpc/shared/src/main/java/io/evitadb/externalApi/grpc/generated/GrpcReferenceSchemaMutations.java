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
// source: GrpcReferenceSchemaMutations.proto

package io.evitadb.externalApi.grpc.generated;

public final class GrpcReferenceSchemaMutations {
  private GrpcReferenceSchemaMutations() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateReferenceSchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateReferenceSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceAttributeSchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceAttributeSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSortableAttributeCompoundSchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSortableAttributeCompoundSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaCardinalityMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaCardinalityMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDeprecationNoticeMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDeprecationNoticeMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDescriptionMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDescriptionMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaNameMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaNameMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityGroupMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityGroupMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveReferenceSchemaMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveReferenceSchemaMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFacetedMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFacetedMutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFilterableMutation_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFilterableMutation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GrpcReferenceSchemaMutations.proto\022%io" +
      ".evitadb.externalApi.grpc.generated\032\017Grp" +
      "cEnums.proto\032\"GrpcAttributeSchemaMutatio" +
      "ns.proto\0322GrpcSortableAttributeCompoundS" +
      "chemaMutations.proto\032\036google/protobuf/wr" +
      "appers.proto\"\261\003\n!GrpcCreateReferenceSche" +
      "maMutation\022\014\n\004name\030\001 \001(\t\0221\n\013description\030" +
      "\002 \001(\0132\034.google.protobuf.StringValue\0227\n\021d" +
      "eprecationNotice\030\003 \001(\0132\034.google.protobuf" +
      ".StringValue\022K\n\013cardinality\030\004 \001(\01626.io.e" +
      "vitadb.externalApi.grpc.generated.GrpcCa" +
      "rdinality\022\034\n\024referencedEntityType\030\005 \001(\t\022" +
      "#\n\033referencedEntityTypeManaged\030\006 \001(\010\0229\n\023" +
      "referencedGroupType\030\007 \001(\0132\034.google.proto" +
      "buf.StringValue\022\"\n\032referencedGroupTypeMa" +
      "naged\030\010 \001(\010\022\022\n\nfilterable\030\t \001(\010\022\017\n\007facet" +
      "ed\030\n \001(\010\"\237\001\n*GrpcModifyReferenceAttribut" +
      "eSchemaMutation\022\014\n\004name\030\001 \001(\t\022c\n\027attribu" +
      "teSchemaMutation\030\002 \001(\0132B.io.evitadb.exte" +
      "rnalApi.grpc.generated.GrpcAttributeSche" +
      "maMutation\"\320\001\n:GrpcModifyReferenceSortab" +
      "leAttributeCompoundSchemaMutation\022\014\n\004nam" +
      "e\030\001 \001(\t\022\203\001\n\'sortableAttributeCompoundSch" +
      "emaMutation\030\002 \001(\0132R.io.evitadb.externalA" +
      "pi.grpc.generated.GrpcSortableAttributeC" +
      "ompoundSchemaMutation\"\211\001\n,GrpcModifyRefe" +
      "renceSchemaCardinalityMutation\022\014\n\004name\030\001" +
      " \001(\t\022K\n\013cardinality\030\002 \001(\01626.io.evitadb.e" +
      "xternalApi.grpc.generated.GrpcCardinalit" +
      "y\"{\n2GrpcModifyReferenceSchemaDeprecatio" +
      "nNoticeMutation\022\014\n\004name\030\001 \001(\t\0227\n\021depreca" +
      "tionNotice\030\002 \001(\0132\034.google.protobuf.Strin" +
      "gValue\"o\n,GrpcModifyReferenceSchemaDescr" +
      "iptionMutation\022\014\n\004name\030\001 \001(\t\0221\n\013descript" +
      "ion\030\002 \001(\0132\034.google.protobuf.StringValue\"" +
      "F\n%GrpcModifyReferenceSchemaNameMutation" +
      "\022\014\n\004name\030\001 \001(\t\022\017\n\007newName\030\002 \001(\t\"\242\001\n3Grpc" +
      "ModifyReferenceSchemaRelatedEntityGroupM" +
      "utation\022\014\n\004name\030\001 \001(\t\0229\n\023referencedGroup" +
      "Type\030\002 \001(\0132\034.google.protobuf.StringValue" +
      "\022\"\n\032referencedGroupTypeManaged\030\003 \001(\010\"\201\001\n" +
      ".GrpcModifyReferenceSchemaRelatedEntityM" +
      "utation\022\014\n\004name\030\001 \001(\t\022\034\n\024referencedEntit" +
      "yType\030\002 \001(\t\022#\n\033referencedEntityTypeManag" +
      "ed\030\003 \001(\010\"1\n!GrpcRemoveReferenceSchemaMut" +
      "ation\022\014\n\004name\030\001 \001(\t\"F\n%GrpcSetReferenceS" +
      "chemaFacetedMutation\022\014\n\004name\030\001 \001(\t\022\017\n\007fa" +
      "ceted\030\002 \001(\010\"L\n(GrpcSetReferenceSchemaFil" +
      "terableMutation\022\014\n\004name\030\001 \001(\t\022\022\n\nfiltera" +
      "ble\030\002 \001(\010B\014P\001\252\002\007EvitaDBb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor(),
          io.evitadb.externalApi.grpc.generated.GrpcAttributeSchemaMutations.getDescriptor(),
          io.evitadb.externalApi.grpc.generated.GrpcSortableAttributeCompoundSchemaMutations.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateReferenceSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateReferenceSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcCreateReferenceSchemaMutation_descriptor,
        new java.lang.String[] { "Name", "Description", "DeprecationNotice", "Cardinality", "ReferencedEntityType", "ReferencedEntityTypeManaged", "ReferencedGroupType", "ReferencedGroupTypeManaged", "Filterable", "Faceted", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceAttributeSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceAttributeSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceAttributeSchemaMutation_descriptor,
        new java.lang.String[] { "Name", "AttributeSchemaMutation", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSortableAttributeCompoundSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSortableAttributeCompoundSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSortableAttributeCompoundSchemaMutation_descriptor,
        new java.lang.String[] { "Name", "SortableAttributeCompoundSchemaMutation", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaCardinalityMutation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaCardinalityMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaCardinalityMutation_descriptor,
        new java.lang.String[] { "Name", "Cardinality", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDeprecationNoticeMutation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDeprecationNoticeMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDeprecationNoticeMutation_descriptor,
        new java.lang.String[] { "Name", "DeprecationNotice", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDescriptionMutation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDescriptionMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaDescriptionMutation_descriptor,
        new java.lang.String[] { "Name", "Description", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaNameMutation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaNameMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaNameMutation_descriptor,
        new java.lang.String[] { "Name", "NewName", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityGroupMutation_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityGroupMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityGroupMutation_descriptor,
        new java.lang.String[] { "Name", "ReferencedGroupType", "ReferencedGroupTypeManaged", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityMutation_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcModifyReferenceSchemaRelatedEntityMutation_descriptor,
        new java.lang.String[] { "Name", "ReferencedEntityType", "ReferencedEntityTypeManaged", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveReferenceSchemaMutation_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveReferenceSchemaMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcRemoveReferenceSchemaMutation_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFacetedMutation_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFacetedMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFacetedMutation_descriptor,
        new java.lang.String[] { "Name", "Faceted", });
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFilterableMutation_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFilterableMutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_evitadb_externalApi_grpc_generated_GrpcSetReferenceSchemaFilterableMutation_descriptor,
        new java.lang.String[] { "Name", "Filterable", });
    io.evitadb.externalApi.grpc.generated.GrpcEnums.getDescriptor();
    io.evitadb.externalApi.grpc.generated.GrpcAttributeSchemaMutations.getDescriptor();
    io.evitadb.externalApi.grpc.generated.GrpcSortableAttributeCompoundSchemaMutations.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
