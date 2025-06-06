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
 * A single element of a Text document
 */
@ApiModel(description = "A single element of a Text document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class TextDocumentElement {
  @SerializedName("ElementNumber")
  private Integer elementNumber = null;

  @SerializedName("ElementContents")
  private String elementContents = null;

  public TextDocumentElement elementNumber(Integer elementNumber) {
    this.elementNumber = elementNumber;
    return this;
  }

   /**
   * The 1-based line index of the element
   * @return elementNumber
  **/
  @ApiModelProperty(value = "The 1-based line index of the element")
  public Integer getElementNumber() {
    return elementNumber;
  }

  public void setElementNumber(Integer elementNumber) {
    this.elementNumber = elementNumber;
  }

  public TextDocumentElement elementContents(String elementContents) {
    this.elementContents = elementContents;
    return this;
  }

   /**
   * The text contents of a single element of a text file
   * @return elementContents
  **/
  @ApiModelProperty(value = "The text contents of a single element of a text file")
  public String getElementContents() {
    return elementContents;
  }

  public void setElementContents(String elementContents) {
    this.elementContents = elementContents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDocumentElement textDocumentElement = (TextDocumentElement) o;
    return Objects.equals(this.elementNumber, textDocumentElement.elementNumber) &&
        Objects.equals(this.elementContents, textDocumentElement.elementContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementNumber, elementContents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDocumentElement {\n");
    
    sb.append("    elementNumber: ").append(toIndentedString(elementNumber)).append("\n");
    sb.append("    elementContents: ").append(toIndentedString(elementContents)).append("\n");
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

