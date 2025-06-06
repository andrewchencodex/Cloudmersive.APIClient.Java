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
 * Result of running the HTML to Text operation
 */
@ApiModel(description = "Result of running the HTML to Text operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class HtmlToTextResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("TextContentResult")
  private String textContentResult = null;

  public HtmlToTextResponse successful(Boolean successful) {
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

  public HtmlToTextResponse textContentResult(String textContentResult) {
    this.textContentResult = textContentResult;
    return this;
  }

   /**
   * Text content result from the HTML input
   * @return textContentResult
  **/
  @ApiModelProperty(value = "Text content result from the HTML input")
  public String getTextContentResult() {
    return textContentResult;
  }

  public void setTextContentResult(String textContentResult) {
    this.textContentResult = textContentResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlToTextResponse htmlToTextResponse = (HtmlToTextResponse) o;
    return Objects.equals(this.successful, htmlToTextResponse.successful) &&
        Objects.equals(this.textContentResult, htmlToTextResponse.textContentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textContentResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlToTextResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textContentResult: ").append(toIndentedString(textContentResult)).append("\n");
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

