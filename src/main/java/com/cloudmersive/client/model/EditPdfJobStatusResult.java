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
 * Result of performing a batch job operation
 */
@ApiModel(description = "Result of performing a batch job operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:55.394Z")
public class EditPdfJobStatusResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("AsyncJobStatus")
  private String asyncJobStatus = null;

  @SerializedName("AsyncJobID")
  private String asyncJobID = null;

  @SerializedName("OutputFileResult")
  private byte[] outputFileResult = null;

  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  public EditPdfJobStatusResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Tru eif the operation to check the status of the job was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "Tru eif the operation to check the status of the job was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public EditPdfJobStatusResult asyncJobStatus(String asyncJobStatus) {
    this.asyncJobStatus = asyncJobStatus;
    return this;
  }

   /**
   * Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED
   * @return asyncJobStatus
  **/
  @ApiModelProperty(value = "Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED")
  public String getAsyncJobStatus() {
    return asyncJobStatus;
  }

  public void setAsyncJobStatus(String asyncJobStatus) {
    this.asyncJobStatus = asyncJobStatus;
  }

  public EditPdfJobStatusResult asyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
    return this;
  }

   /**
   * When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes
   * @return asyncJobID
  **/
  @ApiModelProperty(value = "When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes")
  public String getAsyncJobID() {
    return asyncJobID;
  }

  public void setAsyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
  }

  public EditPdfJobStatusResult outputFileResult(byte[] outputFileResult) {
    this.outputFileResult = outputFileResult;
    return this;
  }

   /**
   * Output file result (if applicable)
   * @return outputFileResult
  **/
  @ApiModelProperty(value = "Output file result (if applicable)")
  public byte[] getOutputFileResult() {
    return outputFileResult;
  }

  public void setOutputFileResult(byte[] outputFileResult) {
    this.outputFileResult = outputFileResult;
  }

  public EditPdfJobStatusResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message (if any)
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error message (if any)")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditPdfJobStatusResult editPdfJobStatusResult = (EditPdfJobStatusResult) o;
    return Objects.equals(this.successful, editPdfJobStatusResult.successful) &&
        Objects.equals(this.asyncJobStatus, editPdfJobStatusResult.asyncJobStatus) &&
        Objects.equals(this.asyncJobID, editPdfJobStatusResult.asyncJobID) &&
        Arrays.equals(this.outputFileResult, editPdfJobStatusResult.outputFileResult) &&
        Objects.equals(this.errorMessage, editPdfJobStatusResult.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, asyncJobStatus, asyncJobID, Arrays.hashCode(outputFileResult), errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditPdfJobStatusResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    asyncJobStatus: ").append(toIndentedString(asyncJobStatus)).append("\n");
    sb.append("    asyncJobID: ").append(toIndentedString(asyncJobID)).append("\n");
    sb.append("    outputFileResult: ").append(toIndentedString(outputFileResult)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

