/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * WordPosition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:10.724Z")
public class WordPosition {
  @SerializedName("Word")
  private String word = null;

  @SerializedName("WordIndex")
  private Integer wordIndex = null;

  @SerializedName("StartPosition")
  private Integer startPosition = null;

  @SerializedName("EndPosition")
  private Integer endPosition = null;

  public WordPosition word(String word) {
    this.word = word;
    return this;
  }

   /**
   * Word as a string
   * @return word
  **/
  @ApiModelProperty(value = "Word as a string")
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public WordPosition wordIndex(Integer wordIndex) {
    this.wordIndex = wordIndex;
    return this;
  }

   /**
   * Zero-based index of the word; first word has index 0, second word has index 1 and so on
   * @return wordIndex
  **/
  @ApiModelProperty(value = "Zero-based index of the word; first word has index 0, second word has index 1 and so on")
  public Integer getWordIndex() {
    return wordIndex;
  }

  public void setWordIndex(Integer wordIndex) {
    this.wordIndex = wordIndex;
  }

  public WordPosition startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Zero-based character offset at which the word begins in the input string
   * @return startPosition
  **/
  @ApiModelProperty(value = "Zero-based character offset at which the word begins in the input string")
  public Integer getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  public WordPosition endPosition(Integer endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * Zero-based character offset at which the word ends in the input string
   * @return endPosition
  **/
  @ApiModelProperty(value = "Zero-based character offset at which the word ends in the input string")
  public Integer getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(Integer endPosition) {
    this.endPosition = endPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordPosition wordPosition = (WordPosition) o;
    return Objects.equals(this.word, wordPosition.word) &&
        Objects.equals(this.wordIndex, wordPosition.wordIndex) &&
        Objects.equals(this.startPosition, wordPosition.startPosition) &&
        Objects.equals(this.endPosition, wordPosition.endPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, wordIndex, startPosition, endPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordPosition {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    wordIndex: ").append(toIndentedString(wordIndex)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
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

