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
import com.cloudmersive.client.model.DocxPage;
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
 * Result of getting pages from a Word Document DOCX
 */
@ApiModel(description = "Result of getting pages from a Word Document DOCX")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class GetDocxPagesResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Pages")
  private List<DocxPage> pages = null;

  @SerializedName("PageCount")
  private Integer pageCount = null;

  public GetDocxPagesResponse successful(Boolean successful) {
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

  public GetDocxPagesResponse pages(List<DocxPage> pages) {
    this.pages = pages;
    return this;
  }

  public GetDocxPagesResponse addPagesItem(DocxPage pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<DocxPage>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Pages in the document
   * @return pages
  **/
  @ApiModelProperty(value = "Pages in the document")
  public List<DocxPage> getPages() {
    return pages;
  }

  public void setPages(List<DocxPage> pages) {
    this.pages = pages;
  }

  public GetDocxPagesResponse pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Count of pages
   * @return pageCount
  **/
  @ApiModelProperty(value = "Count of pages")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxPagesResponse getDocxPagesResponse = (GetDocxPagesResponse) o;
    return Objects.equals(this.successful, getDocxPagesResponse.successful) &&
        Objects.equals(this.pages, getDocxPagesResponse.pages) &&
        Objects.equals(this.pageCount, getDocxPagesResponse.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, pages, pageCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxPagesResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

