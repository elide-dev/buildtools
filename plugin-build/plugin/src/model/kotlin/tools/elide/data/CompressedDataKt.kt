//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: elide/data/data.proto

package tools.elide.data;

@kotlin.jvm.JvmName("-initializecompressedData")
public inline fun compressedData(block: tools.elide.data.CompressedDataKt.Dsl.() -> kotlin.Unit): tools.elide.data.CompressedData =
  tools.elide.data.CompressedDataKt.Dsl._create(tools.elide.data.CompressedData.newBuilder()).apply { block() }._build()
public object CompressedDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tools.elide.data.CompressedData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tools.elide.data.CompressedData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tools.elide.data.CompressedData = _builder.build()

    /**
     * <pre>
     * Compression mode applied to this data. If no compression is active, `IDENTITY` may be specified as a default.
     * </pre>
     *
     * <code>.data.CompressionMode compression = 1;</code>
     */
    public var compression: tools.elide.data.CompressionMode
      @JvmName("getCompression")
      get() = _builder.getCompression()
      @JvmName("setCompression")
      set(value) {
        _builder.setCompression(value)
      }
    /**
     * <pre>
     * Compression mode applied to this data. If no compression is active, `IDENTITY` may be specified as a default.
     * </pre>
     *
     * <code>.data.CompressionMode compression = 1;</code>
     */
    public fun clearCompression() {
      _builder.clearCompression()
    }

    /**
     * <pre>
     * Container holding the raw compressed data, and a fingerprint of the data in compressed form. This is unmodified raw
     * bytes, aside from being compressed by the algorithm specified by `compression`.
     * </pre>
     *
     * <code>.data.DataContainer data = 2;</code>
     */
    public var data: tools.elide.data.DataContainer
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * Container holding the raw compressed data, and a fingerprint of the data in compressed form. This is unmodified raw
     * bytes, aside from being compressed by the algorithm specified by `compression`.
     * </pre>
     *
     * <code>.data.DataContainer data = 2;</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
    /**
     * <pre>
     * Container holding the raw compressed data, and a fingerprint of the data in compressed form. This is unmodified raw
     * bytes, aside from being compressed by the algorithm specified by `compression`.
     * </pre>
     *
     * <code>.data.DataContainer data = 2;</code>
     * @return Whether the data field is set.
     */
    public fun hasData(): kotlin.Boolean {
      return _builder.hasData()
    }

    /**
     * <pre>
     * Size of the asset data before compression. To obtain the size of the data in compressed form, simply take the
     * length of the data field itself. This value is expressed in bytes.
     * </pre>
     *
     * <code>uint64 size = 3;</code>
     */
    public var size: kotlin.Long
      @JvmName("getSize")
      get() = _builder.getSize()
      @JvmName("setSize")
      set(value) {
        _builder.setSize(value)
      }
    /**
     * <pre>
     * Size of the asset data before compression. To obtain the size of the data in compressed form, simply take the
     * length of the data field itself. This value is expressed in bytes.
     * </pre>
     *
     * <code>uint64 size = 3;</code>
     */
    public fun clearSize() {
      _builder.clearSize()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class IntegrityProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Holds an (optional) integrity fingerprint, calculated from the held data *before* compression, which maybe used to
     * verify the consistency of the data held by this container after de-compression.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 4;</code>
     */
     public val integrity: com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getIntegrityList()
      )
    /**
     * <pre>
     * Holds an (optional) integrity fingerprint, calculated from the held data *before* compression, which maybe used to
     * verify the consistency of the data held by this container after de-compression.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 4;</code>
     * @param value The integrity to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIntegrity")
    public fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.add(value: tools.elide.data.DataFingerprint) {
      _builder.addIntegrity(value)
    }
    /**
     * <pre>
     * Holds an (optional) integrity fingerprint, calculated from the held data *before* compression, which maybe used to
     * verify the consistency of the data held by this container after de-compression.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 4;</code>
     * @param value The integrity to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignIntegrity")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.plusAssign(value: tools.elide.data.DataFingerprint) {
      add(value)
    }
    /**
     * <pre>
     * Holds an (optional) integrity fingerprint, calculated from the held data *before* compression, which maybe used to
     * verify the consistency of the data held by this container after de-compression.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 4;</code>
     * @param values The integrity to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIntegrity")
    public fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.addAll(values: kotlin.collections.Iterable<tools.elide.data.DataFingerprint>) {
      _builder.addAllIntegrity(values)
    }
    /**
     * <pre>
     * Holds an (optional) integrity fingerprint, calculated from the held data *before* compression, which maybe used to
     * verify the consistency of the data held by this container after de-compression.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 4;</code>
     * @param values The integrity to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllIntegrity")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.plusAssign(values: kotlin.collections.Iterable<tools.elide.data.DataFingerprint>) {
      addAll(values)
    }
    /**
     * <pre>
     * Holds an (optional) integrity fingerprint, calculated from the held data *before* compression, which maybe used to
     * verify the consistency of the data held by this container after de-compression.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 4;</code>
     * @param index The index to set the value at.
     * @param value The integrity to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setIntegrity")
    public operator fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.set(index: kotlin.Int, value: tools.elide.data.DataFingerprint) {
      _builder.setIntegrity(index, value)
    }
    /**
     * <pre>
     * Holds an (optional) integrity fingerprint, calculated from the held data *before* compression, which maybe used to
     * verify the consistency of the data held by this container after de-compression.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIntegrity")
    public fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.clear() {
      _builder.clearIntegrity()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tools.elide.data.CompressedData.copy(block: tools.elide.data.CompressedDataKt.Dsl.() -> kotlin.Unit): tools.elide.data.CompressedData =
  tools.elide.data.CompressedDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val tools.elide.data.CompressedDataOrBuilder.dataOrNull: tools.elide.data.DataContainer?
  get() = if (hasData()) getData() else null

