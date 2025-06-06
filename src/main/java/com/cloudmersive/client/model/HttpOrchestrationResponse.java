/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
 * Result of performing an HTTP orchestration
 */
@ApiModel(description = "Result of performing an HTTP orchestration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:20:11.347Z")
public class HttpOrchestrationResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("TasksCompleted")
  private Integer tasksCompleted = null;

  @SerializedName("Output_StringType")
  private String outputStringType = null;

  @SerializedName("Output_BinaryType")
  private byte[] outputBinaryType = null;

  public HttpOrchestrationResponse successful(Boolean successful) {
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

  public HttpOrchestrationResponse tasksCompleted(Integer tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
    return this;
  }

   /**
   * Count of the number of tasks that were completed
   * @return tasksCompleted
  **/
  @ApiModelProperty(value = "Count of the number of tasks that were completed")
  public Integer getTasksCompleted() {
    return tasksCompleted;
  }

  public void setTasksCompleted(Integer tasksCompleted) {
    this.tasksCompleted = tasksCompleted;
  }

  public HttpOrchestrationResponse outputStringType(String outputStringType) {
    this.outputStringType = outputStringType;
    return this;
  }

   /**
   * Result output in string format
   * @return outputStringType
  **/
  @ApiModelProperty(value = "Result output in string format")
  public String getOutputStringType() {
    return outputStringType;
  }

  public void setOutputStringType(String outputStringType) {
    this.outputStringType = outputStringType;
  }

  public HttpOrchestrationResponse outputBinaryType(byte[] outputBinaryType) {
    this.outputBinaryType = outputBinaryType;
    return this;
  }

   /**
   * Result output in binary format
   * @return outputBinaryType
  **/
  @ApiModelProperty(value = "Result output in binary format")
  public byte[] getOutputBinaryType() {
    return outputBinaryType;
  }

  public void setOutputBinaryType(byte[] outputBinaryType) {
    this.outputBinaryType = outputBinaryType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpOrchestrationResponse httpOrchestrationResponse = (HttpOrchestrationResponse) o;
    return Objects.equals(this.successful, httpOrchestrationResponse.successful) &&
        Objects.equals(this.tasksCompleted, httpOrchestrationResponse.tasksCompleted) &&
        Objects.equals(this.outputStringType, httpOrchestrationResponse.outputStringType) &&
        Arrays.equals(this.outputBinaryType, httpOrchestrationResponse.outputBinaryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, tasksCompleted, outputStringType, Arrays.hashCode(outputBinaryType));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpOrchestrationResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    tasksCompleted: ").append(toIndentedString(tasksCompleted)).append("\n");
    sb.append("    outputStringType: ").append(toIndentedString(outputStringType)).append("\n");
    sb.append("    outputBinaryType: ").append(toIndentedString(outputBinaryType)).append("\n");
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

