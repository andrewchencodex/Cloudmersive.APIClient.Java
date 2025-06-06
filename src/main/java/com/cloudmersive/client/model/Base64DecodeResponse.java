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
 * Result of base 64 decoding
 */
@ApiModel(description = "Result of base 64 decoding")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class Base64DecodeResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContentResult")
  private byte[] contentResult = null;

  public Base64DecodeResponse successful(Boolean successful) {
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

  public Base64DecodeResponse contentResult(byte[] contentResult) {
    this.contentResult = contentResult;
    return this;
  }

   /**
   * Result of performing a base 64 decode operation, binary file content
   * @return contentResult
  **/
  @ApiModelProperty(value = "Result of performing a base 64 decode operation, binary file content")
  public byte[] getContentResult() {
    return contentResult;
  }

  public void setContentResult(byte[] contentResult) {
    this.contentResult = contentResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64DecodeResponse base64DecodeResponse = (Base64DecodeResponse) o;
    return Objects.equals(this.successful, base64DecodeResponse.successful) &&
        Arrays.equals(this.contentResult, base64DecodeResponse.contentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, Arrays.hashCode(contentResult));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64DecodeResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    contentResult: ").append(toIndentedString(contentResult)).append("\n");
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

