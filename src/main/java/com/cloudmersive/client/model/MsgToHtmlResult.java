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
import com.cloudmersive.client.model.MsgAttachment;
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
 * Result of converting an MSG file to HTML string
 */
@ApiModel(description = "Result of converting an MSG file to HTML string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class MsgToHtmlResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Content")
  private String content = null;

  @SerializedName("Body")
  private String body = null;

  @SerializedName("From")
  private String from = null;

  @SerializedName("To")
  private String to = null;

  @SerializedName("Cc")
  private String cc = null;

  @SerializedName("ReceivedTime")
  private String receivedTime = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("Attachments")
  private List<MsgAttachment> attachments = null;

  public MsgToHtmlResult successful(Boolean successful) {
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

  public MsgToHtmlResult content(String content) {
    this.content = content;
    return this;
  }

   /**
   * An HTML string version of the MSG file
   * @return content
  **/
  @ApiModelProperty(value = "An HTML string version of the MSG file")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MsgToHtmlResult body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The main body of the MSG file&#39;s email as an HTML string
   * @return body
  **/
  @ApiModelProperty(value = "The main body of the MSG file's email as an HTML string")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MsgToHtmlResult from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The From sender of the MSG file&#39;s email
   * @return from
  **/
  @ApiModelProperty(value = "The From sender of the MSG file's email")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MsgToHtmlResult to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The To recipients of the MSG file&#39;s email
   * @return to
  **/
  @ApiModelProperty(value = "The To recipients of the MSG file's email")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public MsgToHtmlResult cc(String cc) {
    this.cc = cc;
    return this;
  }

   /**
   * The CC recipients of the MSG file&#39;s email
   * @return cc
  **/
  @ApiModelProperty(value = "The CC recipients of the MSG file's email")
  public String getCc() {
    return cc;
  }

  public void setCc(String cc) {
    this.cc = cc;
  }

  public MsgToHtmlResult receivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
    return this;
  }

   /**
   * The time that the MSG file&#39;s email was received
   * @return receivedTime
  **/
  @ApiModelProperty(value = "The time that the MSG file's email was received")
  public String getReceivedTime() {
    return receivedTime;
  }

  public void setReceivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
  }

  public MsgToHtmlResult subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the MSG file&#39;s email
   * @return subject
  **/
  @ApiModelProperty(value = "The subject of the MSG file's email")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MsgToHtmlResult attachments(List<MsgAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public MsgToHtmlResult addAttachmentsItem(MsgAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<MsgAttachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of all attachments for the MSG file
   * @return attachments
  **/
  @ApiModelProperty(value = "List of all attachments for the MSG file")
  public List<MsgAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<MsgAttachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgToHtmlResult msgToHtmlResult = (MsgToHtmlResult) o;
    return Objects.equals(this.successful, msgToHtmlResult.successful) &&
        Objects.equals(this.content, msgToHtmlResult.content) &&
        Objects.equals(this.body, msgToHtmlResult.body) &&
        Objects.equals(this.from, msgToHtmlResult.from) &&
        Objects.equals(this.to, msgToHtmlResult.to) &&
        Objects.equals(this.cc, msgToHtmlResult.cc) &&
        Objects.equals(this.receivedTime, msgToHtmlResult.receivedTime) &&
        Objects.equals(this.subject, msgToHtmlResult.subject) &&
        Objects.equals(this.attachments, msgToHtmlResult.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, content, body, from, to, cc, receivedTime, subject, attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgToHtmlResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    receivedTime: ").append(toIndentedString(receivedTime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

