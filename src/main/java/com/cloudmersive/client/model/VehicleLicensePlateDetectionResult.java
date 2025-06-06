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
import com.cloudmersive.client.model.DetectedLicensePlate;
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
 * Result of detecting vehicle license plates in an image
 */
@ApiModel(description = "Result of detecting vehicle license plates in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:44.792Z")
public class VehicleLicensePlateDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("DetectedLicensePlates")
  private List<DetectedLicensePlate> detectedLicensePlates = null;

  @SerializedName("DetectedLicensePlateCount")
  private Integer detectedLicensePlateCount = null;

  public VehicleLicensePlateDetectionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Was the image processed successfully?
   * @return successful
  **/
  @ApiModelProperty(value = "Was the image processed successfully?")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public VehicleLicensePlateDetectionResult detectedLicensePlates(List<DetectedLicensePlate> detectedLicensePlates) {
    this.detectedLicensePlates = detectedLicensePlates;
    return this;
  }

  public VehicleLicensePlateDetectionResult addDetectedLicensePlatesItem(DetectedLicensePlate detectedLicensePlatesItem) {
    if (this.detectedLicensePlates == null) {
      this.detectedLicensePlates = new ArrayList<DetectedLicensePlate>();
    }
    this.detectedLicensePlates.add(detectedLicensePlatesItem);
    return this;
  }

   /**
   * License plates found in the image
   * @return detectedLicensePlates
  **/
  @ApiModelProperty(value = "License plates found in the image")
  public List<DetectedLicensePlate> getDetectedLicensePlates() {
    return detectedLicensePlates;
  }

  public void setDetectedLicensePlates(List<DetectedLicensePlate> detectedLicensePlates) {
    this.detectedLicensePlates = detectedLicensePlates;
  }

  public VehicleLicensePlateDetectionResult detectedLicensePlateCount(Integer detectedLicensePlateCount) {
    this.detectedLicensePlateCount = detectedLicensePlateCount;
    return this;
  }

   /**
   * The number of license plates detected in the image
   * @return detectedLicensePlateCount
  **/
  @ApiModelProperty(value = "The number of license plates detected in the image")
  public Integer getDetectedLicensePlateCount() {
    return detectedLicensePlateCount;
  }

  public void setDetectedLicensePlateCount(Integer detectedLicensePlateCount) {
    this.detectedLicensePlateCount = detectedLicensePlateCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleLicensePlateDetectionResult vehicleLicensePlateDetectionResult = (VehicleLicensePlateDetectionResult) o;
    return Objects.equals(this.successful, vehicleLicensePlateDetectionResult.successful) &&
        Objects.equals(this.detectedLicensePlates, vehicleLicensePlateDetectionResult.detectedLicensePlates) &&
        Objects.equals(this.detectedLicensePlateCount, vehicleLicensePlateDetectionResult.detectedLicensePlateCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, detectedLicensePlates, detectedLicensePlateCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleLicensePlateDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    detectedLicensePlates: ").append(toIndentedString(detectedLicensePlates)).append("\n");
    sb.append("    detectedLicensePlateCount: ").append(toIndentedString(detectedLicensePlateCount)).append("\n");
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

