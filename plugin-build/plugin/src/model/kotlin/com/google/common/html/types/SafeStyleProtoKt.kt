//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: webutil/html/types/html.proto

package com.google.common.html.types;

@kotlin.jvm.JvmName("-initializesafeStyleProto")
public inline fun safeStyleProto(block: com.google.common.html.types.SafeStyleProtoKt.Dsl.() -> kotlin.Unit): com.google.common.html.types.SafeStyleProto =
  com.google.common.html.types.SafeStyleProtoKt.Dsl._create(com.google.common.html.types.SafeStyleProto.newBuilder()).apply { block() }._build()
public object SafeStyleProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.common.html.types.SafeStyleProto.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.common.html.types.SafeStyleProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.common.html.types.SafeStyleProto = _builder.build()

    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     */
    public var privateDoNotAccessOrElseSafeStyleWrappedValue: kotlin.String
      @JvmName("getPrivateDoNotAccessOrElseSafeStyleWrappedValue")
      get() = _builder.getPrivateDoNotAccessOrElseSafeStyleWrappedValue()
      @JvmName("setPrivateDoNotAccessOrElseSafeStyleWrappedValue")
      set(value) {
        _builder.setPrivateDoNotAccessOrElseSafeStyleWrappedValue(value)
      }
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     */
    public fun clearPrivateDoNotAccessOrElseSafeStyleWrappedValue() {
      _builder.clearPrivateDoNotAccessOrElseSafeStyleWrappedValue()
    }
    /**
     * <pre>
     * IMPORTANT: Never set or read this field, even from tests, it is private.
     * See documentation at the top of .proto file for programming language
     * packages with which to create or read this message.
     * </pre>
     *
     * <code>optional string private_do_not_access_or_else_safe_style_wrapped_value = 5;</code>
     * @return Whether the privateDoNotAccessOrElseSafeStyleWrappedValue field is set.
     */
    public fun hasPrivateDoNotAccessOrElseSafeStyleWrappedValue(): kotlin.Boolean {
      return _builder.hasPrivateDoNotAccessOrElseSafeStyleWrappedValue()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.google.common.html.types.SafeStyleProto.copy(block: com.google.common.html.types.SafeStyleProtoKt.Dsl.() -> kotlin.Unit): com.google.common.html.types.SafeStyleProto =
  com.google.common.html.types.SafeStyleProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

