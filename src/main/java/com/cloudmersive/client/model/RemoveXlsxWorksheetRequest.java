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
import com.cloudmersive.client.model.XlsxWorksheet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Remove Excel XLSX Spreadsheet worksheet request
 */
@ApiModel(description = "Input to a Remove Excel XLSX Spreadsheet worksheet request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class RemoveXlsxWorksheetRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("WorksheetToRemove")
  private XlsxWorksheet worksheetToRemove = null;

  public RemoveXlsxWorksheetRequest inputFileBytes(byte[] inputFileBytes) {
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

  public RemoveXlsxWorksheetRequest inputFileUrl(String inputFileUrl) {
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

  public RemoveXlsxWorksheetRequest worksheetToRemove(XlsxWorksheet worksheetToRemove) {
    this.worksheetToRemove = worksheetToRemove;
    return this;
  }

   /**
   * Required; Worksheet (tab) within the spreadsheet to delete; leave blank to default to the first worksheet.  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
   * @return worksheetToRemove
  **/
  @ApiModelProperty(value = "Required; Worksheet (tab) within the spreadsheet to delete; leave blank to default to the first worksheet.  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.")
  public XlsxWorksheet getWorksheetToRemove() {
    return worksheetToRemove;
  }

  public void setWorksheetToRemove(XlsxWorksheet worksheetToRemove) {
    this.worksheetToRemove = worksheetToRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveXlsxWorksheetRequest removeXlsxWorksheetRequest = (RemoveXlsxWorksheetRequest) o;
    return Arrays.equals(this.inputFileBytes, removeXlsxWorksheetRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, removeXlsxWorksheetRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToRemove, removeXlsxWorksheetRequest.worksheetToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToRemove);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveXlsxWorksheetRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToRemove: ").append(toIndentedString(worksheetToRemove)).append("\n");
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

