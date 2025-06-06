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
 * Request to split a PowerPoint presentation
 */
@ApiModel(description = "Request to split a PowerPoint presentation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class PptxSplitAdvancedRequest {
  @SerializedName("InputFile")
  private byte[] inputFile = null;

  @SerializedName("SlidesPerPresentation")
  private Integer slidesPerPresentation = null;

  public PptxSplitAdvancedRequest inputFile(byte[] inputFile) {
    this.inputFile = inputFile;
    return this;
  }

   /**
   * Input file
   * @return inputFile
  **/
  @ApiModelProperty(value = "Input file")
  public byte[] getInputFile() {
    return inputFile;
  }

  public void setInputFile(byte[] inputFile) {
    this.inputFile = inputFile;
  }

  public PptxSplitAdvancedRequest slidesPerPresentation(Integer slidesPerPresentation) {
    this.slidesPerPresentation = slidesPerPresentation;
    return this;
  }

   /**
   * Slides per presentation for result
   * @return slidesPerPresentation
  **/
  @ApiModelProperty(value = "Slides per presentation for result")
  public Integer getSlidesPerPresentation() {
    return slidesPerPresentation;
  }

  public void setSlidesPerPresentation(Integer slidesPerPresentation) {
    this.slidesPerPresentation = slidesPerPresentation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PptxSplitAdvancedRequest pptxSplitAdvancedRequest = (PptxSplitAdvancedRequest) o;
    return Arrays.equals(this.inputFile, pptxSplitAdvancedRequest.inputFile) &&
        Objects.equals(this.slidesPerPresentation, pptxSplitAdvancedRequest.slidesPerPresentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFile), slidesPerPresentation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PptxSplitAdvancedRequest {\n");
    
    sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
    sb.append("    slidesPerPresentation: ").append(toIndentedString(slidesPerPresentation)).append("\n");
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

