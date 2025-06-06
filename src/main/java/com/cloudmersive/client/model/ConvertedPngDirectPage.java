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
 * A single converted page
 */
@ApiModel(description = "A single converted page")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class ConvertedPngDirectPage {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("ImageData")
  private byte[] imageData = null;

  public ConvertedPngDirectPage pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the converted page, starting with 1
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number of the converted page, starting with 1")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public ConvertedPngDirectPage imageData(byte[] imageData) {
    this.imageData = imageData;
    return this;
  }

   /**
   * PNG binary image file data in bytes
   * @return imageData
  **/
  @ApiModelProperty(value = "PNG binary image file data in bytes")
  public byte[] getImageData() {
    return imageData;
  }

  public void setImageData(byte[] imageData) {
    this.imageData = imageData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedPngDirectPage convertedPngDirectPage = (ConvertedPngDirectPage) o;
    return Objects.equals(this.pageNumber, convertedPngDirectPage.pageNumber) &&
        Arrays.equals(this.imageData, convertedPngDirectPage.imageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, Arrays.hashCode(imageData));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedPngDirectPage {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
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

