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
import com.cloudmersive.client.model.DocxParagraph;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Insert Paragraph request
 */
@ApiModel(description = "Input to a Insert Paragraph request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class InsertDocxInsertParagraphRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("ParagraphToInsert")
  private DocxParagraph paragraphToInsert = null;

  @SerializedName("InsertPlacement")
  private String insertPlacement = null;

  @SerializedName("InsertPath")
  private String insertPath = null;

  public InsertDocxInsertParagraphRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public InsertDocxInsertParagraphRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public InsertDocxInsertParagraphRequest paragraphToInsert(DocxParagraph paragraphToInsert) {
    this.paragraphToInsert = paragraphToInsert;
    return this;
  }

   /**
   * Table you would like to insert
   * @return paragraphToInsert
  **/
  @ApiModelProperty(value = "Table you would like to insert")
  public DocxParagraph getParagraphToInsert() {
    return paragraphToInsert;
  }

  public void setParagraphToInsert(DocxParagraph paragraphToInsert) {
    this.paragraphToInsert = paragraphToInsert;
  }

  public InsertDocxInsertParagraphRequest insertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
    return this;
  }

   /**
   * Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)
   * @return insertPlacement
  **/
  @ApiModelProperty(value = "Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)")
  public String getInsertPlacement() {
    return insertPlacement;
  }

  public void setInsertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
  }

  public InsertDocxInsertParagraphRequest insertPath(String insertPath) {
    this.insertPath = insertPath;
    return this;
  }

   /**
   * Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject
   * @return insertPath
  **/
  @ApiModelProperty(value = "Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject")
  public String getInsertPath() {
    return insertPath;
  }

  public void setInsertPath(String insertPath) {
    this.insertPath = insertPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertDocxInsertParagraphRequest insertDocxInsertParagraphRequest = (InsertDocxInsertParagraphRequest) o;
    return Arrays.equals(this.inputFileBytes, insertDocxInsertParagraphRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, insertDocxInsertParagraphRequest.inputFileUrl) &&
        Objects.equals(this.paragraphToInsert, insertDocxInsertParagraphRequest.paragraphToInsert) &&
        Objects.equals(this.insertPlacement, insertDocxInsertParagraphRequest.insertPlacement) &&
        Objects.equals(this.insertPath, insertDocxInsertParagraphRequest.insertPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, paragraphToInsert, insertPlacement, insertPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertDocxInsertParagraphRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    paragraphToInsert: ").append(toIndentedString(paragraphToInsert)).append("\n");
    sb.append("    insertPlacement: ").append(toIndentedString(insertPlacement)).append("\n");
    sb.append("    insertPath: ").append(toIndentedString(insertPath)).append("\n");
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

