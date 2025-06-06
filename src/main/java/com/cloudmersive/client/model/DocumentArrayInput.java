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
import com.cloudmersive.client.model.DocumentItem;
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
 * Input array of documents to be processed for a merge operation
 */
@ApiModel(description = "Input array of documents to be processed for a merge operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class DocumentArrayInput {
  @SerializedName("Documents")
  private List<DocumentItem> documents = null;

  public DocumentArrayInput documents(List<DocumentItem> documents) {
    this.documents = documents;
    return this;
  }

  public DocumentArrayInput addDocumentsItem(DocumentItem documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<DocumentItem>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Array of document objects
   * @return documents
  **/
  @ApiModelProperty(value = "Array of document objects")
  public List<DocumentItem> getDocuments() {
    return documents;
  }

  public void setDocuments(List<DocumentItem> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentArrayInput documentArrayInput = (DocumentArrayInput) o;
    return Objects.equals(this.documents, documentArrayInput.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentArrayInput {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

