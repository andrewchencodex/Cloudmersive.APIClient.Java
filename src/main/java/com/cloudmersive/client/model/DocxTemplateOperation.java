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
 * DocxTemplateOperation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class DocxTemplateOperation {
  /**
   * Operation action to take; possible values are \&quot;Replace\&quot;
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    NUMBER_1(1);

    private Integer value;

    ActionEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        int value = jsonReader.nextInt();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Action")
  private ActionEnum action = null;

  @SerializedName("MatchAgainst")
  private String matchAgainst = null;

  @SerializedName("ReplaceWith")
  private String replaceWith = null;

  public DocxTemplateOperation action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Operation action to take; possible values are \&quot;Replace\&quot;
   * @return action
  **/
  @ApiModelProperty(value = "Operation action to take; possible values are \"Replace\"")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public DocxTemplateOperation matchAgainst(String matchAgainst) {
    this.matchAgainst = matchAgainst;
    return this;
  }

   /**
   * For Replace operations, the string to match against (to be replaced with ReplaceWith string)
   * @return matchAgainst
  **/
  @ApiModelProperty(value = "For Replace operations, the string to match against (to be replaced with ReplaceWith string)")
  public String getMatchAgainst() {
    return matchAgainst;
  }

  public void setMatchAgainst(String matchAgainst) {
    this.matchAgainst = matchAgainst;
  }

  public DocxTemplateOperation replaceWith(String replaceWith) {
    this.replaceWith = replaceWith;
    return this;
  }

   /**
   * For Replace operations, the string to Replace the original string with
   * @return replaceWith
  **/
  @ApiModelProperty(value = "For Replace operations, the string to Replace the original string with")
  public String getReplaceWith() {
    return replaceWith;
  }

  public void setReplaceWith(String replaceWith) {
    this.replaceWith = replaceWith;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTemplateOperation docxTemplateOperation = (DocxTemplateOperation) o;
    return Objects.equals(this.action, docxTemplateOperation.action) &&
        Objects.equals(this.matchAgainst, docxTemplateOperation.matchAgainst) &&
        Objects.equals(this.replaceWith, docxTemplateOperation.replaceWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, matchAgainst, replaceWith);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTemplateOperation {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    matchAgainst: ").append(toIndentedString(matchAgainst)).append("\n");
    sb.append("    replaceWith: ").append(toIndentedString(replaceWith)).append("\n");
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

