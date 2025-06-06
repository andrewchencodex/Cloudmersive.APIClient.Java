/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.model.OcrWordElement;
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
 * OCR results of a page, including words of text and their location
 */
@ApiModel(description = "OCR results of a page, including words of text and their location")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:20.241Z")
public class OcrPageResultWithWordsWithLocation {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Words")
  private List<OcrWordElement> words = null;

  public OcrPageResultWithWordsWithLocation pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public OcrPageResultWithWordsWithLocation successful(Boolean successful) {
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

  public OcrPageResultWithWordsWithLocation words(List<OcrWordElement> words) {
    this.words = words;
    return this;
  }

  public OcrPageResultWithWordsWithLocation addWordsItem(OcrWordElement wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<OcrWordElement>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Word elements in the image
   * @return words
  **/
  @ApiModelProperty(value = "Word elements in the image")
  public List<OcrWordElement> getWords() {
    return words;
  }

  public void setWords(List<OcrWordElement> words) {
    this.words = words;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrPageResultWithWordsWithLocation ocrPageResultWithWordsWithLocation = (OcrPageResultWithWordsWithLocation) o;
    return Objects.equals(this.pageNumber, ocrPageResultWithWordsWithLocation.pageNumber) &&
        Objects.equals(this.successful, ocrPageResultWithWordsWithLocation.successful) &&
        Objects.equals(this.words, ocrPageResultWithWordsWithLocation.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, successful, words);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPageResultWithWordsWithLocation {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

