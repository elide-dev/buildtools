//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: elide/data/data.proto

package tools.elide.data;

@kotlin.jvm.JvmName("-initializedataContainer")
public inline fun dataContainer(block: tools.elide.data.DataContainerKt.Dsl.() -> kotlin.Unit): tools.elide.data.DataContainer =
  tools.elide.data.DataContainerKt.Dsl._create(tools.elide.data.DataContainer.newBuilder()).apply { block() }._build()
public object DataContainerKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tools.elide.data.DataContainer.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tools.elide.data.DataContainer.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tools.elide.data.DataContainer = _builder.build()

    /**
     * <pre>
     * Raw bytes for the data referenced by this container.
     * </pre>
     *
     * <code>bytes raw = 1;</code>
     */
    public var raw: com.google.protobuf.ByteString
      @JvmName("getRaw")
      get() = _builder.getRaw()
      @JvmName("setRaw")
      set(value) {
        _builder.setRaw(value)
      }
    /**
     * <pre>
     * Raw bytes for the data referenced by this container.
     * </pre>
     *
     * <code>bytes raw = 1;</code>
     */
    public fun clearRaw() {
      _builder.clearRaw()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class IntegrityProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Specifies an (optional) integrity fingerprint that may be used to verify the consistency of the underlying data
     * held by this data container.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 2;</code>
     */
     public val integrity: com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getIntegrityList()
      )
    /**
     * <pre>
     * Specifies an (optional) integrity fingerprint that may be used to verify the consistency of the underlying data
     * held by this data container.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 2;</code>
     * @param value The integrity to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addIntegrity")
    public fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.add(value: tools.elide.data.DataFingerprint) {
      _builder.addIntegrity(value)
    }
    /**
     * <pre>
     * Specifies an (optional) integrity fingerprint that may be used to verify the consistency of the underlying data
     * held by this data container.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 2;</code>
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
     * Specifies an (optional) integrity fingerprint that may be used to verify the consistency of the underlying data
     * held by this data container.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 2;</code>
     * @param values The integrity to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllIntegrity")
    public fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.addAll(values: kotlin.collections.Iterable<tools.elide.data.DataFingerprint>) {
      _builder.addAllIntegrity(values)
    }
    /**
     * <pre>
     * Specifies an (optional) integrity fingerprint that may be used to verify the consistency of the underlying data
     * held by this data container.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 2;</code>
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
     * Specifies an (optional) integrity fingerprint that may be used to verify the consistency of the underlying data
     * held by this data container.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 2;</code>
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
     * Specifies an (optional) integrity fingerprint that may be used to verify the consistency of the underlying data
     * held by this data container.
     * </pre>
     *
     * <code>repeated .data.DataFingerprint integrity = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearIntegrity")
    public fun com.google.protobuf.kotlin.DslList<tools.elide.data.DataFingerprint, IntegrityProxy>.clear() {
      _builder.clearIntegrity()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tools.elide.data.DataContainer.copy(block: tools.elide.data.DataContainerKt.Dsl.() -> kotlin.Unit): tools.elide.data.DataContainer =
  tools.elide.data.DataContainerKt.Dsl._create(this.toBuilder()).apply { block() }._build()

