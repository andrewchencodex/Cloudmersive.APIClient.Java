/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Result of checking a URL for SSRF threats
 */
@ApiModel(description = "Result of checking a URL for SSRF threats")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:01.118Z")
public class UrlSsrfResponseFull {
  @SerializedName("CleanURL")
  private Boolean cleanURL = null;

  @SerializedName("ThreatLevel")
  private String threatLevel = null;

  public UrlSsrfResponseFull cleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
    return this;
  }

   /**
   * True if the URL is clean, false if it is at risk of containing an SSRF threat or attack
   * @return cleanURL
  **/
  @ApiModelProperty(value = "True if the URL is clean, false if it is at risk of containing an SSRF threat or attack")
  public Boolean isCleanURL() {
    return cleanURL;
  }

  public void setCleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
  }

  public UrlSsrfResponseFull threatLevel(String threatLevel) {
    this.threatLevel = threatLevel;
    return this;
  }

   /**
   * Threat level of the URL; possible values are High, Medium, Low and None
   * @return threatLevel
  **/
  @ApiModelProperty(value = "Threat level of the URL; possible values are High, Medium, Low and None")
  public String getThreatLevel() {
    return threatLevel;
  }

  public void setThreatLevel(String threatLevel) {
    this.threatLevel = threatLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSsrfResponseFull urlSsrfResponseFull = (UrlSsrfResponseFull) o;
    return Objects.equals(this.cleanURL, urlSsrfResponseFull.cleanURL) &&
        Objects.equals(this.threatLevel, urlSsrfResponseFull.threatLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanURL, threatLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSsrfResponseFull {\n");
    
    sb.append("    cleanURL: ").append(toIndentedString(cleanURL)).append("\n");
    sb.append("    threatLevel: ").append(toIndentedString(threatLevel)).append("\n");
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

