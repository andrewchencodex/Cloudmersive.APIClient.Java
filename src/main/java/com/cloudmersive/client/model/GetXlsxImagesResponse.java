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
import com.cloudmersive.client.model.XlsxImage;
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
 * Result of running a Get-Images command
 */
@ApiModel(description = "Result of running a Get-Images command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class GetXlsxImagesResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Images")
  private List<XlsxImage> images = null;

  public GetXlsxImagesResponse successful(Boolean successful) {
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

  public GetXlsxImagesResponse images(List<XlsxImage> images) {
    this.images = images;
    return this;
  }

  public GetXlsxImagesResponse addImagesItem(XlsxImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<XlsxImage>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Spreadsheet Images in the XLSX document
   * @return images
  **/
  @ApiModelProperty(value = "Spreadsheet Images in the XLSX document")
  public List<XlsxImage> getImages() {
    return images;
  }

  public void setImages(List<XlsxImage> images) {
    this.images = images;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxImagesResponse getXlsxImagesResponse = (GetXlsxImagesResponse) o;
    return Objects.equals(this.successful, getXlsxImagesResponse.successful) &&
        Objects.equals(this.images, getXlsxImagesResponse.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, images);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxImagesResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

