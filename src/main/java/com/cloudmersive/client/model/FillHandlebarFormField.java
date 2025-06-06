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
 * Handlebar style form fields to fill in; form field that is handlebar style, such as \&quot;{{FieldName}}\&quot;
 */
@ApiModel(description = "Handlebar style form fields to fill in; form field that is handlebar style, such as \"{{FieldName}}\"")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class FillHandlebarFormField {
  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("ValueToFill")
  private String valueToFill = null;

  public FillHandlebarFormField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Name of the field without the curly braces, e.g. \&quot;FieldName\&quot; for a field that is included in the text of the DOCX as \&quot;{{FieldName}}\&quot;
   * @return fieldName
  **/
  @ApiModelProperty(value = "Name of the field without the curly braces, e.g. \"FieldName\" for a field that is included in the text of the DOCX as \"{{FieldName}}\"")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public FillHandlebarFormField valueToFill(String valueToFill) {
    this.valueToFill = valueToFill;
    return this;
  }

   /**
   * Text value to fill in for the field in the resulting document
   * @return valueToFill
  **/
  @ApiModelProperty(value = "Text value to fill in for the field in the resulting document")
  public String getValueToFill() {
    return valueToFill;
  }

  public void setValueToFill(String valueToFill) {
    this.valueToFill = valueToFill;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FillHandlebarFormField fillHandlebarFormField = (FillHandlebarFormField) o;
    return Objects.equals(this.fieldName, fillHandlebarFormField.fieldName) &&
        Objects.equals(this.valueToFill, fillHandlebarFormField.valueToFill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, valueToFill);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FillHandlebarFormField {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    valueToFill: ").append(toIndentedString(valueToFill)).append("\n");
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

