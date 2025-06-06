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
 * Converted page as an image
 */
@ApiModel(description = "Converted page as an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class PageConversionResult {
  @SerializedName("Filename")
  private String filename = null;

  @SerializedName("FileBytes")
  private byte[] fileBytes = null;

  public PageConversionResult filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * File name of the image in the converted file format
   * @return filename
  **/
  @ApiModelProperty(value = "File name of the image in the converted file format")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public PageConversionResult fileBytes(byte[] fileBytes) {
    this.fileBytes = fileBytes;
    return this;
  }

   /**
   * File bytes (contents) of the image in converted file format
   * @return fileBytes
  **/
  @ApiModelProperty(value = "File bytes (contents) of the image in converted file format")
  public byte[] getFileBytes() {
    return fileBytes;
  }

  public void setFileBytes(byte[] fileBytes) {
    this.fileBytes = fileBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageConversionResult pageConversionResult = (PageConversionResult) o;
    return Objects.equals(this.filename, pageConversionResult.filename) &&
        Arrays.equals(this.fileBytes, pageConversionResult.fileBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, Arrays.hashCode(fileBytes));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageConversionResult {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileBytes: ").append(toIndentedString(fileBytes)).append("\n");
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

