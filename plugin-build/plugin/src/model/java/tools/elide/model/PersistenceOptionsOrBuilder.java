// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elide/model/model.proto

package tools.elide.model;

public interface PersistenceOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.PersistenceOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the storage mode for this entity.
   * </pre>
   *
   * <code>.model.CollectionMode mode = 1;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <pre>
   * Specifies the storage mode for this entity.
   * </pre>
   *
   * <code>.model.CollectionMode mode = 1;</code>
   * @return The mode.
   */
  tools.elide.model.CollectionMode getMode();

  /**
   * <pre>
   * Data path for a given message, with items in the URL corresponding to parameters in the item's key path.
   * </pre>
   *
   * <code>string path = 2;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Data path for a given message, with items in the URL corresponding to parameters in the item's key path.
   * </pre>
   *
   * <code>string path = 2;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Name of this item's parent collection, if applicable.
   * </pre>
   *
   * <code>string parent = 3;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Name of this item's parent collection, if applicable.
   * </pre>
   *
   * <code>string parent = 3;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
