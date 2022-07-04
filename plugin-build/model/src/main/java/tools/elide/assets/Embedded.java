// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elide/assets/embedded.proto

package tools.elide.assets;

public final class Embedded {
  private Embedded() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assets_EmbeddedScriptMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_EmbeddedScriptMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assets_EmbeddedScriptMetadata_JsScriptMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_EmbeddedScriptMetadata_JsScriptMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assets_DataContainerRef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_DataContainerRef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assets_DataContainerRef_FingerprintPathPair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_DataContainerRef_FingerprintPathPair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assets_EmbeddedScript_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_EmbeddedScript_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033elide/assets/embedded.proto\022\006assets\032\037g" +
      "oogle/protobuf/timestamp.proto\032\031elide/cr" +
      "ypto/crypto.proto\032\025elide/data/data.proto" +
      "\"\304\002\n\026EmbeddedScriptMetadata\022E\n\njavascrip" +
      "t\030\001 \001(\0132/.assets.EmbeddedScriptMetadata." +
      "JsScriptMetadataH\000\032\326\001\n\020JsScriptMetadata\022" +
      "N\n\005level\030\001 \001(\0162?.assets.EmbeddedScriptMe" +
      "tadata.JsScriptMetadata.JsLanguageLevel\"" +
      "r\n\017JsLanguageLevel\022\035\n\031JS_LANGUAGE_LEVEL_" +
      "DEFAULT\020\000\022\007\n\003ES5\020\001\022\007\n\003ES6\020\002\022\n\n\006ES2017\020\003\022" +
      "\n\n\006ES2018\020\004\022\n\n\006ES2019\020\005\022\n\n\006ES2020\020\006B\n\n\010m" +
      "etadata\"\233\002\n\020DataContainerRef\022#\n\004data\030\001 \001" +
      "(\0132\023.data.DataContainerH\000\022@\n\010resource\030\002 " +
      "\001(\0132,.assets.DataContainerRef.Fingerprin" +
      "tPathPairH\000\022B\n\nfilesystem\030\003 \001(\0132,.assets" +
      ".DataContainerRef.FingerprintPathPairH\000\032" +
      "O\n\023FingerprintPathPair\022*\n\013fingerprint\030\001 " +
      "\001(\0132\025.data.DataFingerprint\022\014\n\004path\030\002 \001(\t" +
      "B\013\n\treference\"\332\002\n\016EmbeddedScript\022\016\n\006modu" +
      "le\030\001 \001(\t\022\020\n\010filename\030\002 \001(\t\0220\n\010language\030\003" +
      " \001(\0162\036.assets.EmbeddedScriptLanguage\0220\n\010" +
      "metadata\030\004 \001(\0132\036.assets.EmbeddedScriptMe" +
      "tadata\0221\n\rlast_modified\030\005 \001(\0132\032.google.p" +
      "rotobuf.Timestamp\022(\n\006script\030\006 \001(\0132\030.asse" +
      "ts.DataContainerRef\022+\n\tsourcemap\030\007 \001(\0132\030" +
      ".assets.DataContainerRef\022\031\n\021direct_depen" +
      "dency\030\010 \003(\t\022\035\n\025transitive_dependency\030\t \003" +
      "(\t*:\n\026EmbeddedScriptLanguage\022\030\n\024LANGUAGE" +
      "_UNSPECIFIED\020\000\022\006\n\002JS\020\001B\227\001\n\022tools.elide.a" +
      "ssetsH\001P\001Z5github.com/elide-tools/elide/" +
      "assets/embedded;embedded\330\001\001\370\001\001\242\002\003ELD\252\002\014E" +
      "lide.Assets\272\002\005Elide\302\002\003ELD\312\002\014Elide\\Assets" +
      "\352\002\rElide::Assetsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          tools.elide.crypto.Crypto.getDescriptor(),
          tools.elide.data.Data.getDescriptor(),
        });
    internal_static_assets_EmbeddedScriptMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assets_EmbeddedScriptMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_EmbeddedScriptMetadata_descriptor,
        new java.lang.String[] { "Javascript", "Metadata", });
    internal_static_assets_EmbeddedScriptMetadata_JsScriptMetadata_descriptor =
      internal_static_assets_EmbeddedScriptMetadata_descriptor.getNestedTypes().get(0);
    internal_static_assets_EmbeddedScriptMetadata_JsScriptMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_EmbeddedScriptMetadata_JsScriptMetadata_descriptor,
        new java.lang.String[] { "Level", });
    internal_static_assets_DataContainerRef_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_assets_DataContainerRef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_DataContainerRef_descriptor,
        new java.lang.String[] { "Data", "Resource", "Filesystem", "Reference", });
    internal_static_assets_DataContainerRef_FingerprintPathPair_descriptor =
      internal_static_assets_DataContainerRef_descriptor.getNestedTypes().get(0);
    internal_static_assets_DataContainerRef_FingerprintPathPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_DataContainerRef_FingerprintPathPair_descriptor,
        new java.lang.String[] { "Fingerprint", "Path", });
    internal_static_assets_EmbeddedScript_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_assets_EmbeddedScript_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_EmbeddedScript_descriptor,
        new java.lang.String[] { "Module", "Filename", "Language", "Metadata", "LastModified", "Script", "Sourcemap", "DirectDependency", "TransitiveDependency", });
    com.google.protobuf.TimestampProto.getDescriptor();
    tools.elide.crypto.Crypto.getDescriptor();
    tools.elide.data.Data.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
