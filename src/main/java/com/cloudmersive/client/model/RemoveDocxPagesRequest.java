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
 * Input to a Remove Word DOCX Document Pages request
 */
@ApiModel(description = "Input to a Remove Word DOCX Document Pages request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class RemoveDocxPagesRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("StartDeletePageNumber")
  private Integer startDeletePageNumber = null;

  @SerializedName("EndDeletePageNumber")
  private Integer endDeletePageNumber = null;

  public RemoveDocxPagesRequest inputFileBytes(byte[] inputFileBytes) {
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

  public RemoveDocxPagesRequest inputFileUrl(String inputFileUrl) {
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

  public RemoveDocxPagesRequest startDeletePageNumber(Integer startDeletePageNumber) {
    this.startDeletePageNumber = startDeletePageNumber;
    return this;
  }

   /**
   * Page number (1-based) to start deleting pages; inclusive
   * @return startDeletePageNumber
  **/
  @ApiModelProperty(value = "Page number (1-based) to start deleting pages; inclusive")
  public Integer getStartDeletePageNumber() {
    return startDeletePageNumber;
  }

  public void setStartDeletePageNumber(Integer startDeletePageNumber) {
    this.startDeletePageNumber = startDeletePageNumber;
  }

  public RemoveDocxPagesRequest endDeletePageNumber(Integer endDeletePageNumber) {
    this.endDeletePageNumber = endDeletePageNumber;
    return this;
  }

   /**
   * Page number (1-based) to stop deleting pages; inclusive
   * @return endDeletePageNumber
  **/
  @ApiModelProperty(value = "Page number (1-based) to stop deleting pages; inclusive")
  public Integer getEndDeletePageNumber() {
    return endDeletePageNumber;
  }

  public void setEndDeletePageNumber(Integer endDeletePageNumber) {
    this.endDeletePageNumber = endDeletePageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveDocxPagesRequest removeDocxPagesRequest = (RemoveDocxPagesRequest) o;
    return Arrays.equals(this.inputFileBytes, removeDocxPagesRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, removeDocxPagesRequest.inputFileUrl) &&
        Objects.equals(this.startDeletePageNumber, removeDocxPagesRequest.startDeletePageNumber) &&
        Objects.equals(this.endDeletePageNumber, removeDocxPagesRequest.endDeletePageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, startDeletePageNumber, endDeletePageNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveDocxPagesRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    startDeletePageNumber: ").append(toIndentedString(startDeletePageNumber)).append("\n");
    sb.append("    endDeletePageNumber: ").append(toIndentedString(endDeletePageNumber)).append("\n");
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

