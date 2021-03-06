//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: elide/model/model.proto

package tools.elide.model;

@kotlin.jvm.JvmName("-initializespannerFieldOptions")
public inline fun spannerFieldOptions(block: tools.elide.model.SpannerFieldOptionsKt.Dsl.() -> kotlin.Unit): tools.elide.model.SpannerFieldOptions =
  tools.elide.model.SpannerFieldOptionsKt.Dsl._create(tools.elide.model.SpannerFieldOptions.newBuilder()).apply { block() }._build()
public object SpannerFieldOptionsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tools.elide.model.SpannerFieldOptions.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tools.elide.model.SpannerFieldOptions.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tools.elide.model.SpannerFieldOptions = _builder.build()

    /**
     * <pre>
     * Override column name in Spanner only.
     * </pre>
     *
     * <code>string column = 1;</code>
     */
    public var column: kotlin.String
      @JvmName("getColumn")
      get() = _builder.getColumn()
      @JvmName("setColumn")
      set(value) {
        _builder.setColumn(value)
      }
    /**
     * <pre>
     * Override column name in Spanner only.
     * </pre>
     *
     * <code>string column = 1;</code>
     */
    public fun clearColumn() {
      _builder.clearColumn()
    }

    /**
     * <pre>
     * Whether to ignore this column in Spanner specifically.
     * </pre>
     *
     * <code>bool ignore = 2;</code>
     */
    public var ignore: kotlin.Boolean
      @JvmName("getIgnore")
      get() = _builder.getIgnore()
      @JvmName("setIgnore")
      set(value) {
        _builder.setIgnore(value)
      }
    /**
     * <pre>
     * Whether to ignore this column in Spanner specifically.
     * </pre>
     *
     * <code>bool ignore = 2;</code>
     */
    public fun clearIgnore() {
      _builder.clearIgnore()
    }

    /**
     * <pre>
     * Override the field type in Spanner only.
     * </pre>
     *
     * <code>.model.SpannerOptions.SpannerType type = 3;</code>
     */
    public var type: tools.elide.model.SpannerOptions.SpannerType
      @JvmName("getType")
      get() = _builder.getType()
      @JvmName("setType")
      set(value) {
        _builder.setType(value)
      }
    /**
     * <pre>
     * Override the field type in Spanner only.
     * </pre>
     *
     * <code>.model.SpannerOptions.SpannerType type = 3;</code>
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
     * <pre>
     * Override the field to store STRUCT objects as JSON.
     * </pre>
     *
     * <code>bool json = 4;</code>
     */
    public var json: kotlin.Boolean
      @JvmName("getJson")
      get() = _builder.getJson()
      @JvmName("setJson")
      set(value) {
        _builder.setJson(value)
      }
    /**
     * <pre>
     * Override the field to store STRUCT objects as JSON.
     * </pre>
     *
     * <code>bool json = 4;</code>
     */
    public fun clearJson() {
      _builder.clearJson()
    }

    /**
     * <pre>
     * Length of this field in the database, when expressed as a string.
     * </pre>
     *
     * <code>uint32 size = 5;</code>
     */
    public var size: kotlin.Int
      @JvmName("getSize")
      get() = _builder.getSize()
      @JvmName("setSize")
      set(value) {
        _builder.setSize(value)
      }
    /**
     * <pre>
     * Length of this field in the database, when expressed as a string.
     * </pre>
     *
     * <code>uint32 size = 5;</code>
     */
    public fun clearSize() {
      _builder.clearSize()
    }

    /**
     * <pre>
     * Specifies this column as `NONNULL`, in which case you cannot store `NULL` values in this field.
     * </pre>
     *
     * <code>bool nonnull = 6;</code>
     */
    public var nonnull: kotlin.Boolean
      @JvmName("getNonnull")
      get() = _builder.getNonnull()
      @JvmName("setNonnull")
      set(value) {
        _builder.setNonnull(value)
      }
    /**
     * <pre>
     * Specifies this column as `NONNULL`, in which case you cannot store `NULL` values in this field.
     * </pre>
     *
     * <code>bool nonnull = 6;</code>
     */
    public fun clearNonnull() {
      _builder.clearNonnull()
    }

    /**
     * <pre>
     * Expression value for this field. Converts this field into a calculated value.
     * </pre>
     *
     * <code>string expression = 7;</code>
     */
    public var expression: kotlin.String
      @JvmName("getExpression")
      get() = _builder.getExpression()
      @JvmName("setExpression")
      set(value) {
        _builder.setExpression(value)
      }
    /**
     * <pre>
     * Expression value for this field. Converts this field into a calculated value.
     * </pre>
     *
     * <code>string expression = 7;</code>
     */
    public fun clearExpression() {
      _builder.clearExpression()
    }

    /**
     * <pre>
     * Specifies the `STORED` option for this field. Only applicable if an `expression` is present.
     * </pre>
     *
     * <code>bool stored = 8;</code>
     */
    public var stored: kotlin.Boolean
      @JvmName("getStored")
      get() = _builder.getStored()
      @JvmName("setStored")
      set(value) {
        _builder.setStored(value)
      }
    /**
     * <pre>
     * Specifies the `STORED` option for this field. Only applicable if an `expression` is present.
     * </pre>
     *
     * <code>bool stored = 8;</code>
     */
    public fun clearStored() {
      _builder.clearStored()
    }

    /**
     * <pre>
     * Marks a field as a member of a Spanner row's primary key.
     * </pre>
     *
     * <code>bool primary_key = 9;</code>
     */
    public var primaryKey: kotlin.Boolean
      @JvmName("getPrimaryKey")
      get() = _builder.getPrimaryKey()
      @JvmName("setPrimaryKey")
      set(value) {
        _builder.setPrimaryKey(value)
      }
    /**
     * <pre>
     * Marks a field as a member of a Spanner row's primary key.
     * </pre>
     *
     * <code>bool primary_key = 9;</code>
     */
    public fun clearPrimaryKey() {
      _builder.clearPrimaryKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tools.elide.model.SpannerFieldOptions.copy(block: tools.elide.model.SpannerFieldOptionsKt.Dsl.() -> kotlin.Unit): tools.elide.model.SpannerFieldOptions =
  tools.elide.model.SpannerFieldOptionsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

