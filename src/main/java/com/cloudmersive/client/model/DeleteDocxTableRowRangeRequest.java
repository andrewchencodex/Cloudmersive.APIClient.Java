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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a delete DOCX table row range request
 */
@ApiModel(description = "Input to a delete DOCX table row range request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class DeleteDocxTableRowRangeRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("TablePath")
  private String tablePath = null;

  @SerializedName("TableRowRowIndexStart")
  private Integer tableRowRowIndexStart = null;

  @SerializedName("TableRowRowIndexEnd")
  private Integer tableRowRowIndexEnd = null;

  public DeleteDocxTableRowRangeRequest inputFileBytes(byte[] inputFileBytes) {
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

  public DeleteDocxTableRowRangeRequest inputFileUrl(String inputFileUrl) {
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

  public DeleteDocxTableRowRangeRequest tablePath(String tablePath) {
    this.tablePath = tablePath;
    return this;
  }

   /**
   * Path to the table to delete the row from
   * @return tablePath
  **/
  @ApiModelProperty(value = "Path to the table to delete the row from")
  public String getTablePath() {
    return tablePath;
  }

  public void setTablePath(String tablePath) {
    this.tablePath = tablePath;
  }

  public DeleteDocxTableRowRangeRequest tableRowRowIndexStart(Integer tableRowRowIndexStart) {
    this.tableRowRowIndexStart = tableRowRowIndexStart;
    return this;
  }

   /**
   * 0-based index of the row to begin deleting rows (e.g. 0, 1, 2, ...) in the table
   * @return tableRowRowIndexStart
  **/
  @ApiModelProperty(value = "0-based index of the row to begin deleting rows (e.g. 0, 1, 2, ...) in the table")
  public Integer getTableRowRowIndexStart() {
    return tableRowRowIndexStart;
  }

  public void setTableRowRowIndexStart(Integer tableRowRowIndexStart) {
    this.tableRowRowIndexStart = tableRowRowIndexStart;
  }

  public DeleteDocxTableRowRangeRequest tableRowRowIndexEnd(Integer tableRowRowIndexEnd) {
    this.tableRowRowIndexEnd = tableRowRowIndexEnd;
    return this;
  }

   /**
   * 0-based index of the row to stop deleting rows (e.g. 0, 1, 2, ...) in the table
   * @return tableRowRowIndexEnd
  **/
  @ApiModelProperty(value = "0-based index of the row to stop deleting rows (e.g. 0, 1, 2, ...) in the table")
  public Integer getTableRowRowIndexEnd() {
    return tableRowRowIndexEnd;
  }

  public void setTableRowRowIndexEnd(Integer tableRowRowIndexEnd) {
    this.tableRowRowIndexEnd = tableRowRowIndexEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDocxTableRowRangeRequest deleteDocxTableRowRangeRequest = (DeleteDocxTableRowRangeRequest) o;
    return Arrays.equals(this.inputFileBytes, deleteDocxTableRowRangeRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, deleteDocxTableRowRangeRequest.inputFileUrl) &&
        Objects.equals(this.tablePath, deleteDocxTableRowRangeRequest.tablePath) &&
        Objects.equals(this.tableRowRowIndexStart, deleteDocxTableRowRangeRequest.tableRowRowIndexStart) &&
        Objects.equals(this.tableRowRowIndexEnd, deleteDocxTableRowRangeRequest.tableRowRowIndexEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, tablePath, tableRowRowIndexStart, tableRowRowIndexEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDocxTableRowRangeRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    tablePath: ").append(toIndentedString(tablePath)).append("\n");
    sb.append("    tableRowRowIndexStart: ").append(toIndentedString(tableRowRowIndexStart)).append("\n");
    sb.append("    tableRowRowIndexEnd: ").append(toIndentedString(tableRowRowIndexEnd)).append("\n");
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

