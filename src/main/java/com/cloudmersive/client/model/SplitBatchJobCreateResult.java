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
 * Result of performing a split document batch job
 */
@ApiModel(description = "Result of performing a split document batch job")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class SplitBatchJobCreateResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("AsyncJobID")
  private String asyncJobID = null;

  public SplitBatchJobCreateResult successful(Boolean successful) {
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

  public SplitBatchJobCreateResult asyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
    return this;
  }

   /**
   * When creating a job, an Async Job ID is returned.  Use the GetAsyncJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes
   * @return asyncJobID
  **/
  @ApiModelProperty(value = "When creating a job, an Async Job ID is returned.  Use the GetAsyncJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes")
  public String getAsyncJobID() {
    return asyncJobID;
  }

  public void setAsyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitBatchJobCreateResult splitBatchJobCreateResult = (SplitBatchJobCreateResult) o;
    return Objects.equals(this.successful, splitBatchJobCreateResult.successful) &&
        Objects.equals(this.asyncJobID, splitBatchJobCreateResult.asyncJobID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, asyncJobID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitBatchJobCreateResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    asyncJobID: ").append(toIndentedString(asyncJobID)).append("\n");
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

