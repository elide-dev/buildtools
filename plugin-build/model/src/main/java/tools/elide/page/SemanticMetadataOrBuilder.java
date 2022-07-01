// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elide/page/semantic.proto

package tools.elide.page;

public interface SemanticMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:page.SemanticMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Defines the "kind" of content contained on a given page.
   * </pre>
   *
   * <code>.page.Kind kind = 1;</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <pre>
   * Defines the "kind" of content contained on a given page.
   * </pre>
   *
   * <code>.page.Kind kind = 1;</code>
   * @return The kind.
   */
  tools.elide.page.Kind getKind();

  /**
   * <pre>
   * Formats to render semantic metadata in.
   * </pre>
   *
   * <code>repeated .page.Format format = 2;</code>
   * @return A list containing the format.
   */
  java.util.List<tools.elide.page.Format> getFormatList();
  /**
   * <pre>
   * Formats to render semantic metadata in.
   * </pre>
   *
   * <code>repeated .page.Format format = 2;</code>
   * @return The count of format.
   */
  int getFormatCount();
  /**
   * <pre>
   * Formats to render semantic metadata in.
   * </pre>
   *
   * <code>repeated .page.Format format = 2;</code>
   * @param index The index of the element to return.
   * @return The format at the given index.
   */
  tools.elide.page.Format getFormat(int index);
  /**
   * <pre>
   * Formats to render semantic metadata in.
   * </pre>
   *
   * <code>repeated .page.Format format = 2;</code>
   * @return A list containing the enum numeric values on the wire for format.
   */
  java.util.List<java.lang.Integer>
  getFormatValueList();
  /**
   * <pre>
   * Formats to render semantic metadata in.
   * </pre>
   *
   * <code>repeated .page.Format format = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of format at the given index.
   */
  int getFormatValue(int index);

  /**
   * <pre>
   * Describes page-level semantic media.
   * </pre>
   *
   * <code>repeated .page.MediaAsset media = 3;</code>
   */
  java.util.List<tools.elide.page.MediaAsset> 
      getMediaList();
  /**
   * <pre>
   * Describes page-level semantic media.
   * </pre>
   *
   * <code>repeated .page.MediaAsset media = 3;</code>
   */
  tools.elide.page.MediaAsset getMedia(int index);
  /**
   * <pre>
   * Describes page-level semantic media.
   * </pre>
   *
   * <code>repeated .page.MediaAsset media = 3;</code>
   */
  int getMediaCount();
  /**
   * <pre>
   * Describes page-level semantic media.
   * </pre>
   *
   * <code>repeated .page.MediaAsset media = 3;</code>
   */
  java.util.List<? extends tools.elide.page.MediaAssetOrBuilder> 
      getMediaOrBuilderList();
  /**
   * <pre>
   * Describes page-level semantic media.
   * </pre>
   *
   * <code>repeated .page.MediaAsset media = 3;</code>
   */
  tools.elide.page.MediaAssetOrBuilder getMediaOrBuilder(
      int index);

  /**
   * <pre>
   * Semantic metadata content.
   * </pre>
   *
   * <code>string content = 4;</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <pre>
   * Semantic metadata content.
   * </pre>
   *
   * <code>string content = 4;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * Semantic metadata content.
   * </pre>
   *
   * <code>string content = 4;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  public tools.elide.page.SemanticMetadata.PayloadCase getPayloadCase();
}
