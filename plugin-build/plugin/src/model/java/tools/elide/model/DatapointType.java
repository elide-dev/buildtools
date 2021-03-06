// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elide/model/model.proto

package tools.elide.model;

/**
 * <pre>
 * Specifies the types an object may use when defining special objects. These types govern how an object is treated,
 * listed, and adapted throughout its lifecycle.
 * </pre>
 *
 * Protobuf enum {@code model.DatapointType}
 */
public enum DatapointType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The datamodel represents an object record.
   * </pre>
   *
   * <code>OBJECT = 0;</code>
   */
  OBJECT(0),
  /**
   * <pre>
   * Specifies that this datapoint type is a record key.
   * </pre>
   *
   * <code>OBJECT_KEY = 1;</code>
   */
  OBJECT_KEY(1),
  /**
   * <pre>
   * The datamodel represents an event type.
   * </pre>
   *
   * <code>EVENT = 2;</code>
   */
  EVENT(2),
  /**
   * <pre>
   * The datamodel represents a table.
   * </pre>
   *
   * <code>TABLE = 3;</code>
   */
  TABLE(3),
  /**
   * <pre>
   * The datamodel represents a wire object.
   * </pre>
   *
   * <code>WIRE = 4;</code>
   */
  WIRE(4),
  /**
   * <pre>
   * The datamodel represents a hash pre-image.
   * </pre>
   *
   * <code>HASH = 5;</code>
   */
  HASH(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The datamodel represents an object record.
   * </pre>
   *
   * <code>OBJECT = 0;</code>
   */
  public static final int OBJECT_VALUE = 0;
  /**
   * <pre>
   * Specifies that this datapoint type is a record key.
   * </pre>
   *
   * <code>OBJECT_KEY = 1;</code>
   */
  public static final int OBJECT_KEY_VALUE = 1;
  /**
   * <pre>
   * The datamodel represents an event type.
   * </pre>
   *
   * <code>EVENT = 2;</code>
   */
  public static final int EVENT_VALUE = 2;
  /**
   * <pre>
   * The datamodel represents a table.
   * </pre>
   *
   * <code>TABLE = 3;</code>
   */
  public static final int TABLE_VALUE = 3;
  /**
   * <pre>
   * The datamodel represents a wire object.
   * </pre>
   *
   * <code>WIRE = 4;</code>
   */
  public static final int WIRE_VALUE = 4;
  /**
   * <pre>
   * The datamodel represents a hash pre-image.
   * </pre>
   *
   * <code>HASH = 5;</code>
   */
  public static final int HASH_VALUE = 5;


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
  public static DatapointType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DatapointType forNumber(int value) {
    switch (value) {
      case 0: return OBJECT;
      case 1: return OBJECT_KEY;
      case 2: return EVENT;
      case 3: return TABLE;
      case 4: return WIRE;
      case 5: return HASH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DatapointType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DatapointType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DatapointType>() {
          public DatapointType findValueByNumber(int number) {
            return DatapointType.forNumber(number);
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
    return tools.elide.model.Datamodel.getDescriptor().getEnumTypes().get(3);
  }

  private static final DatapointType[] VALUES = values();

  public static DatapointType valueOf(
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

  private DatapointType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:model.DatapointType)
}

