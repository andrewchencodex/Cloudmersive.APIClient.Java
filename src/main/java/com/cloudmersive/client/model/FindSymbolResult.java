/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
 * Result of a find symbol operation on an input image
 */
@ApiModel(description = "Result of a find symbol operation on an input image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:44.792Z")
public class FindSymbolResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("MatchScore")
  private Double matchScore = null;

  @SerializedName("XLeft")
  private Integer xleft = null;

  @SerializedName("YTop")
  private Integer ytop = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  public FindSymbolResult successful(Boolean successful) {
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

  public FindSymbolResult matchScore(Double matchScore) {
    this.matchScore = matchScore;
    return this;
  }

   /**
   * Score between 0.0 and 1.0 that measures how closely the symbol matched; scores above 0.2 are good
   * @return matchScore
  **/
  @ApiModelProperty(value = "Score between 0.0 and 1.0 that measures how closely the symbol matched; scores above 0.2 are good")
  public Double getMatchScore() {
    return matchScore;
  }

  public void setMatchScore(Double matchScore) {
    this.matchScore = matchScore;
  }

  public FindSymbolResult xleft(Integer xleft) {
    this.xleft = xleft;
    return this;
  }

   /**
   * X location of the left edge of the found location in pixels
   * @return xleft
  **/
  @ApiModelProperty(value = "X location of the left edge of the found location in pixels")
  public Integer getXleft() {
    return xleft;
  }

  public void setXleft(Integer xleft) {
    this.xleft = xleft;
  }

  public FindSymbolResult ytop(Integer ytop) {
    this.ytop = ytop;
    return this;
  }

   /**
   * Y location of the top edge of the found location in pixels
   * @return ytop
  **/
  @ApiModelProperty(value = "Y location of the top edge of the found location in pixels")
  public Integer getYtop() {
    return ytop;
  }

  public void setYtop(Integer ytop) {
    this.ytop = ytop;
  }

  public FindSymbolResult width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the found location in pixels
   * @return width
  **/
  @ApiModelProperty(value = "Width of the found location in pixels")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public FindSymbolResult height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the found location in pixels
   * @return height
  **/
  @ApiModelProperty(value = "Height of the found location in pixels")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindSymbolResult findSymbolResult = (FindSymbolResult) o;
    return Objects.equals(this.successful, findSymbolResult.successful) &&
        Objects.equals(this.matchScore, findSymbolResult.matchScore) &&
        Objects.equals(this.xleft, findSymbolResult.xleft) &&
        Objects.equals(this.ytop, findSymbolResult.ytop) &&
        Objects.equals(this.width, findSymbolResult.width) &&
        Objects.equals(this.height, findSymbolResult.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matchScore, xleft, ytop, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindSymbolResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matchScore: ").append(toIndentedString(matchScore)).append("\n");
    sb.append("    xleft: ").append(toIndentedString(xleft)).append("\n");
    sb.append("    ytop: ").append(toIndentedString(ytop)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

