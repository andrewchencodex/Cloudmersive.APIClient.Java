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
 * A single Excel XLSX file corresponding to one worksheet (tab) in the original spreadsheet
 */
@ApiModel(description = "A single Excel XLSX file corresponding to one worksheet (tab) in the original spreadsheet")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class WorksheetResult {
  @SerializedName("WorksheetNumber")
  private Integer worksheetNumber = null;

  @SerializedName("WorksheetName")
  private String worksheetName = null;

  @SerializedName("URL")
  private String URL = null;

  @SerializedName("WorksheetContents")
  private byte[] worksheetContents = null;

  public WorksheetResult worksheetNumber(Integer worksheetNumber) {
    this.worksheetNumber = worksheetNumber;
    return this;
  }

   /**
   * Worksheet number of the converted page, starting with 1 for the left-most worksheet
   * @return worksheetNumber
  **/
  @ApiModelProperty(value = "Worksheet number of the converted page, starting with 1 for the left-most worksheet")
  public Integer getWorksheetNumber() {
    return worksheetNumber;
  }

  public void setWorksheetNumber(Integer worksheetNumber) {
    this.worksheetNumber = worksheetNumber;
  }

  public WorksheetResult worksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
    return this;
  }

   /**
   * The name of the worksheet
   * @return worksheetName
  **/
  @ApiModelProperty(value = "The name of the worksheet")
  public String getWorksheetName() {
    return worksheetName;
  }

  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }

  public WorksheetResult URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * URL to the XLSX file of this worksheet; file is stored in an in-memory cache and will be deleted
   * @return URL
  **/
  @ApiModelProperty(value = "URL to the XLSX file of this worksheet; file is stored in an in-memory cache and will be deleted")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public WorksheetResult worksheetContents(byte[] worksheetContents) {
    this.worksheetContents = worksheetContents;
    return this;
  }

   /**
   * Contents of the worksheet in bytes
   * @return worksheetContents
  **/
  @ApiModelProperty(value = "Contents of the worksheet in bytes")
  public byte[] getWorksheetContents() {
    return worksheetContents;
  }

  public void setWorksheetContents(byte[] worksheetContents) {
    this.worksheetContents = worksheetContents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorksheetResult worksheetResult = (WorksheetResult) o;
    return Objects.equals(this.worksheetNumber, worksheetResult.worksheetNumber) &&
        Objects.equals(this.worksheetName, worksheetResult.worksheetName) &&
        Objects.equals(this.URL, worksheetResult.URL) &&
        Arrays.equals(this.worksheetContents, worksheetResult.worksheetContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worksheetNumber, worksheetName, URL, Arrays.hashCode(worksheetContents));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorksheetResult {\n");
    
    sb.append("    worksheetNumber: ").append(toIndentedString(worksheetNumber)).append("\n");
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    worksheetContents: ").append(toIndentedString(worksheetContents)).append("\n");
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

