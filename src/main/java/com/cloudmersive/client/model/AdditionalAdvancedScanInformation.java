/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
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
 * Additional non-threat content verification information
 */
@ApiModel(description = "Additional non-threat content verification information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:20:40.837Z")
public class AdditionalAdvancedScanInformation {
  @SerializedName("ContainsJSON")
  private Boolean containsJSON = null;

  @SerializedName("ContainsXML")
  private Boolean containsXML = null;

  @SerializedName("ContainsImage")
  private Boolean containsImage = null;

  @SerializedName("Hash_SHA1")
  private String hashSHA1 = null;

  @SerializedName("RelevantSubfileName")
  private String relevantSubfileName = null;

  @SerializedName("RelevantSubfileHash_SHA1")
  private String relevantSubfileHashSHA1 = null;

  @SerializedName("IsAuthenticodeSigned")
  private Boolean isAuthenticodeSigned = null;

  public AdditionalAdvancedScanInformation containsJSON(Boolean containsJSON) {
    this.containsJSON = containsJSON;
    return this;
  }

   /**
   * True if the input file contains JSON data, false otherwise; this is not a threat signal
   * @return containsJSON
  **/
  @ApiModelProperty(value = "True if the input file contains JSON data, false otherwise; this is not a threat signal")
  public Boolean isContainsJSON() {
    return containsJSON;
  }

  public void setContainsJSON(Boolean containsJSON) {
    this.containsJSON = containsJSON;
  }

  public AdditionalAdvancedScanInformation containsXML(Boolean containsXML) {
    this.containsXML = containsXML;
    return this;
  }

   /**
   * True if the input file contains XML data, false otherwise; this is not a threat signal
   * @return containsXML
  **/
  @ApiModelProperty(value = "True if the input file contains XML data, false otherwise; this is not a threat signal")
  public Boolean isContainsXML() {
    return containsXML;
  }

  public void setContainsXML(Boolean containsXML) {
    this.containsXML = containsXML;
  }

  public AdditionalAdvancedScanInformation containsImage(Boolean containsImage) {
    this.containsImage = containsImage;
    return this;
  }

   /**
   * True if the input file contains an image
   * @return containsImage
  **/
  @ApiModelProperty(value = "True if the input file contains an image")
  public Boolean isContainsImage() {
    return containsImage;
  }

  public void setContainsImage(Boolean containsImage) {
    this.containsImage = containsImage;
  }

  public AdditionalAdvancedScanInformation hashSHA1(String hashSHA1) {
    this.hashSHA1 = hashSHA1;
    return this;
  }

   /**
   * SHA1 hash of input file
   * @return hashSHA1
  **/
  @ApiModelProperty(value = "SHA1 hash of input file")
  public String getHashSHA1() {
    return hashSHA1;
  }

  public void setHashSHA1(String hashSHA1) {
    this.hashSHA1 = hashSHA1;
  }

  public AdditionalAdvancedScanInformation relevantSubfileName(String relevantSubfileName) {
    this.relevantSubfileName = relevantSubfileName;
    return this;
  }

   /**
   * Relevant subfile name in an archive format for identified threats, if any
   * @return relevantSubfileName
  **/
  @ApiModelProperty(value = "Relevant subfile name in an archive format for identified threats, if any")
  public String getRelevantSubfileName() {
    return relevantSubfileName;
  }

  public void setRelevantSubfileName(String relevantSubfileName) {
    this.relevantSubfileName = relevantSubfileName;
  }

  public AdditionalAdvancedScanInformation relevantSubfileHashSHA1(String relevantSubfileHashSHA1) {
    this.relevantSubfileHashSHA1 = relevantSubfileHashSHA1;
    return this;
  }

   /**
   * SHA1 hash of relevant subfile name in an archive format for identified threats, if any
   * @return relevantSubfileHashSHA1
  **/
  @ApiModelProperty(value = "SHA1 hash of relevant subfile name in an archive format for identified threats, if any")
  public String getRelevantSubfileHashSHA1() {
    return relevantSubfileHashSHA1;
  }

  public void setRelevantSubfileHashSHA1(String relevantSubfileHashSHA1) {
    this.relevantSubfileHashSHA1 = relevantSubfileHashSHA1;
  }

  public AdditionalAdvancedScanInformation isAuthenticodeSigned(Boolean isAuthenticodeSigned) {
    this.isAuthenticodeSigned = isAuthenticodeSigned;
    return this;
  }

   /**
   * True if there is a valid Authenticode signature, False otherwise
   * @return isAuthenticodeSigned
  **/
  @ApiModelProperty(value = "True if there is a valid Authenticode signature, False otherwise")
  public Boolean isIsAuthenticodeSigned() {
    return isAuthenticodeSigned;
  }

  public void setIsAuthenticodeSigned(Boolean isAuthenticodeSigned) {
    this.isAuthenticodeSigned = isAuthenticodeSigned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalAdvancedScanInformation additionalAdvancedScanInformation = (AdditionalAdvancedScanInformation) o;
    return Objects.equals(this.containsJSON, additionalAdvancedScanInformation.containsJSON) &&
        Objects.equals(this.containsXML, additionalAdvancedScanInformation.containsXML) &&
        Objects.equals(this.containsImage, additionalAdvancedScanInformation.containsImage) &&
        Objects.equals(this.hashSHA1, additionalAdvancedScanInformation.hashSHA1) &&
        Objects.equals(this.relevantSubfileName, additionalAdvancedScanInformation.relevantSubfileName) &&
        Objects.equals(this.relevantSubfileHashSHA1, additionalAdvancedScanInformation.relevantSubfileHashSHA1) &&
        Objects.equals(this.isAuthenticodeSigned, additionalAdvancedScanInformation.isAuthenticodeSigned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containsJSON, containsXML, containsImage, hashSHA1, relevantSubfileName, relevantSubfileHashSHA1, isAuthenticodeSigned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalAdvancedScanInformation {\n");
    
    sb.append("    containsJSON: ").append(toIndentedString(containsJSON)).append("\n");
    sb.append("    containsXML: ").append(toIndentedString(containsXML)).append("\n");
    sb.append("    containsImage: ").append(toIndentedString(containsImage)).append("\n");
    sb.append("    hashSHA1: ").append(toIndentedString(hashSHA1)).append("\n");
    sb.append("    relevantSubfileName: ").append(toIndentedString(relevantSubfileName)).append("\n");
    sb.append("    relevantSubfileHashSHA1: ").append(toIndentedString(relevantSubfileHashSHA1)).append("\n");
    sb.append("    isAuthenticodeSigned: ").append(toIndentedString(isAuthenticodeSigned)).append("\n");
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

