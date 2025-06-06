/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.DocxRun;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A paragraph in a Word Document (DOCX) file; there is where text, content and formatting are stored - similar to the paragraph tag in HTML
 */
@ApiModel(description = "A paragraph in a Word Document (DOCX) file; there is where text, content and formatting are stored - similar to the paragraph tag in HTML")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class DocxParagraph {
  @SerializedName("ParagraphIndex")
  private Integer paragraphIndex = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("ContentRuns")
  private List<DocxRun> contentRuns = null;

  @SerializedName("StyleID")
  private String styleID = null;

  public DocxParagraph paragraphIndex(Integer paragraphIndex) {
    this.paragraphIndex = paragraphIndex;
    return this;
  }

   /**
   * The index of the paragraph; 0-based
   * @return paragraphIndex
  **/
  @ApiModelProperty(value = "The index of the paragraph; 0-based")
  public Integer getParagraphIndex() {
    return paragraphIndex;
  }

  public void setParagraphIndex(Integer paragraphIndex) {
    this.paragraphIndex = paragraphIndex;
  }

  public DocxParagraph path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this Paragraph object; leave blank during creation
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this Paragraph object; leave blank during creation")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxParagraph contentRuns(List<DocxRun> contentRuns) {
    this.contentRuns = contentRuns;
    return this;
  }

  public DocxParagraph addContentRunsItem(DocxRun contentRunsItem) {
    if (this.contentRuns == null) {
      this.contentRuns = new ArrayList<DocxRun>();
    }
    this.contentRuns.add(contentRunsItem);
    return this;
  }

   /**
   * The content runs in the paragraph - this is where text is stored; similar to a span in HTML
   * @return contentRuns
  **/
  @ApiModelProperty(value = "The content runs in the paragraph - this is where text is stored; similar to a span in HTML")
  public List<DocxRun> getContentRuns() {
    return contentRuns;
  }

  public void setContentRuns(List<DocxRun> contentRuns) {
    this.contentRuns = contentRuns;
  }

  public DocxParagraph styleID(String styleID) {
    this.styleID = styleID;
    return this;
  }

   /**
   * Style ID of the style applied to the paragraph; null if no style is applied
   * @return styleID
  **/
  @ApiModelProperty(value = "Style ID of the style applied to the paragraph; null if no style is applied")
  public String getStyleID() {
    return styleID;
  }

  public void setStyleID(String styleID) {
    this.styleID = styleID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxParagraph docxParagraph = (DocxParagraph) o;
    return Objects.equals(this.paragraphIndex, docxParagraph.paragraphIndex) &&
        Objects.equals(this.path, docxParagraph.path) &&
        Objects.equals(this.contentRuns, docxParagraph.contentRuns) &&
        Objects.equals(this.styleID, docxParagraph.styleID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paragraphIndex, path, contentRuns, styleID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxParagraph {\n");
    
    sb.append("    paragraphIndex: ").append(toIndentedString(paragraphIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    contentRuns: ").append(toIndentedString(contentRuns)).append("\n");
    sb.append("    styleID: ").append(toIndentedString(styleID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

