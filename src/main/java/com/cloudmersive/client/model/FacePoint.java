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
 * Point location within a face
 */
@ApiModel(description = "Point location within a face")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:44.792Z")
public class FacePoint {
  @SerializedName("X")
  private Integer X = null;

  @SerializedName("Y")
  private Integer Y = null;

  public FacePoint X(Integer X) {
    this.X = X;
    return this;
  }

   /**
   * X location, where 0 is the left-most pixel
   * @return X
  **/
  @ApiModelProperty(value = "X location, where 0 is the left-most pixel")
  public Integer getX() {
    return X;
  }

  public void setX(Integer X) {
    this.X = X;
  }

  public FacePoint Y(Integer Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Y location, where 0 is the top-most pixel
   * @return Y
  **/
  @ApiModelProperty(value = "Y location, where 0 is the top-most pixel")
  public Integer getY() {
    return Y;
  }

  public void setY(Integer Y) {
    this.Y = Y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacePoint facePoint = (FacePoint) o;
    return Objects.equals(this.X, facePoint.X) &&
        Objects.equals(this.Y, facePoint.Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacePoint {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
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

