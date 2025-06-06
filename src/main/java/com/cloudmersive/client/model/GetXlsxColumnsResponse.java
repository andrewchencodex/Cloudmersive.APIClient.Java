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
import com.cloudmersive.client.model.XlsxSpreadsheetColumn;
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
 * Result of running a Get-Columns command
 */
@ApiModel(description = "Result of running a Get-Columns command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class GetXlsxColumnsResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Columns")
  private List<XlsxSpreadsheetColumn> columns = null;

  public GetXlsxColumnsResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public GetXlsxColumnsResponse columns(List<XlsxSpreadsheetColumn> columns) {
    this.columns = columns;
    return this;
  }

  public GetXlsxColumnsResponse addColumnsItem(XlsxSpreadsheetColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<XlsxSpreadsheetColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Spreadsheet Columns in the XLSX document
   * @return columns
  **/
  @ApiModelProperty(value = "Spreadsheet Columns in the XLSX document")
  public List<XlsxSpreadsheetColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<XlsxSpreadsheetColumn> columns) {
    this.columns = columns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxColumnsResponse getXlsxColumnsResponse = (GetXlsxColumnsResponse) o;
    return Objects.equals(this.successful, getXlsxColumnsResponse.successful) &&
        Objects.equals(this.columns, getXlsxColumnsResponse.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, columns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxColumnsResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

