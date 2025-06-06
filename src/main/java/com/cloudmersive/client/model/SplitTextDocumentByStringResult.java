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
import com.cloudmersive.client.model.TextDocumentElement;
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
 * The result of splitting a Text document into separate elements
 */
@ApiModel(description = "The result of splitting a Text document into separate elements")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class SplitTextDocumentByStringResult {
  @SerializedName("ResultElements")
  private List<TextDocumentElement> resultElements = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ElementCount")
  private Integer elementCount = null;

  public SplitTextDocumentByStringResult resultElements(List<TextDocumentElement> resultElements) {
    this.resultElements = resultElements;
    return this;
  }

  public SplitTextDocumentByStringResult addResultElementsItem(TextDocumentElement resultElementsItem) {
    if (this.resultElements == null) {
      this.resultElements = new ArrayList<TextDocumentElement>();
    }
    this.resultElements.add(resultElementsItem);
    return this;
  }

   /**
   * Get resultElements
   * @return resultElements
  **/
  @ApiModelProperty(value = "")
  public List<TextDocumentElement> getResultElements() {
    return resultElements;
  }

  public void setResultElements(List<TextDocumentElement> resultElements) {
    this.resultElements = resultElements;
  }

  public SplitTextDocumentByStringResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public SplitTextDocumentByStringResult elementCount(Integer elementCount) {
    this.elementCount = elementCount;
    return this;
  }

   /**
   * The count of elements in the text file
   * @return elementCount
  **/
  @ApiModelProperty(value = "The count of elements in the text file")
  public Integer getElementCount() {
    return elementCount;
  }

  public void setElementCount(Integer elementCount) {
    this.elementCount = elementCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTextDocumentByStringResult splitTextDocumentByStringResult = (SplitTextDocumentByStringResult) o;
    return Objects.equals(this.resultElements, splitTextDocumentByStringResult.resultElements) &&
        Objects.equals(this.successful, splitTextDocumentByStringResult.successful) &&
        Objects.equals(this.elementCount, splitTextDocumentByStringResult.elementCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultElements, successful, elementCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTextDocumentByStringResult {\n");
    
    sb.append("    resultElements: ").append(toIndentedString(resultElements)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    elementCount: ").append(toIndentedString(elementCount)).append("\n");
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

