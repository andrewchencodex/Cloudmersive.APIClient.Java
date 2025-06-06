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
 * Result of creating a viewer
 */
@ApiModel(description = "Result of creating a viewer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class ViewerResponse {
  @SerializedName("HtmlEmbed")
  private String htmlEmbed = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  public ViewerResponse htmlEmbed(String htmlEmbed) {
    this.htmlEmbed = htmlEmbed;
    return this;
  }

   /**
   * Get htmlEmbed
   * @return htmlEmbed
  **/
  @ApiModelProperty(value = "")
  public String getHtmlEmbed() {
    return htmlEmbed;
  }

  public void setHtmlEmbed(String htmlEmbed) {
    this.htmlEmbed = htmlEmbed;
  }

  public ViewerResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewerResponse viewerResponse = (ViewerResponse) o;
    return Objects.equals(this.htmlEmbed, viewerResponse.htmlEmbed) &&
        Objects.equals(this.successful, viewerResponse.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlEmbed, successful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewerResponse {\n");
    
    sb.append("    htmlEmbed: ").append(toIndentedString(htmlEmbed)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

