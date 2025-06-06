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
import com.cloudmersive.client.model.HttpFormDataParameter;
import com.cloudmersive.client.model.HttpGetParameter;
import com.cloudmersive.client.model.HttpOrchestrationHeader;
import com.cloudmersive.client.model.HttpRawBinaryParameter;
import com.cloudmersive.client.model.HttpRawTextParameter;
import com.cloudmersive.client.model.HttpWwwFormUrlEncodedParameter;
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
 * HttpOrchestrationTask
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:20:11.347Z")
public class HttpOrchestrationTask {
  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("HttpMethod")
  private String httpMethod = null;

  @SerializedName("URL")
  private String URL = null;

  @SerializedName("HttpHeaders")
  private List<HttpOrchestrationHeader> httpHeaders = null;

  @SerializedName("QueryParameters")
  private List<HttpGetParameter> queryParameters = null;

  @SerializedName("FormDataParameters")
  private List<HttpFormDataParameter> formDataParameters = null;

  @SerializedName("WwwFormUrlEncodedParameters")
  private List<HttpWwwFormUrlEncodedParameter> wwwFormUrlEncodedParameters = null;

  @SerializedName("RawTextBody")
  private HttpRawTextParameter rawTextBody = null;

  @SerializedName("RawBinaryBody")
  private HttpRawBinaryParameter rawBinaryBody = null;

  public HttpOrchestrationTask taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * An identifier for this task name, e.g. CreateCustomer or ScanForVirus; allows you to refer to this task from other tasks; if not supplied, it will default to a 0-based integer index of the task
   * @return taskName
  **/
  @ApiModelProperty(value = "An identifier for this task name, e.g. CreateCustomer or ScanForVirus; allows you to refer to this task from other tasks; if not supplied, it will default to a 0-based integer index of the task")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public HttpOrchestrationTask httpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

   /**
   * HTTP Method, e.g. GET, PUT, POST, etc.
   * @return httpMethod
  **/
  @ApiModelProperty(value = "HTTP Method, e.g. GET, PUT, POST, etc.")
  public String getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }

  public HttpOrchestrationTask URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * HTTP URL to orchestrate
   * @return URL
  **/
  @ApiModelProperty(value = "HTTP URL to orchestrate")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public HttpOrchestrationTask httpHeaders(List<HttpOrchestrationHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  public HttpOrchestrationTask addHttpHeadersItem(HttpOrchestrationHeader httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new ArrayList<HttpOrchestrationHeader>();
    }
    this.httpHeaders.add(httpHeadersItem);
    return this;
  }

   /**
   * Optional; HTTP headers to apply to the request
   * @return httpHeaders
  **/
  @ApiModelProperty(value = "Optional; HTTP headers to apply to the request")
  public List<HttpOrchestrationHeader> getHttpHeaders() {
    return httpHeaders;
  }

  public void setHttpHeaders(List<HttpOrchestrationHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }

  public HttpOrchestrationTask queryParameters(List<HttpGetParameter> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  public HttpOrchestrationTask addQueryParametersItem(HttpGetParameter queryParametersItem) {
    if (this.queryParameters == null) {
      this.queryParameters = new ArrayList<HttpGetParameter>();
    }
    this.queryParameters.add(queryParametersItem);
    return this;
  }

   /**
   * Optional; query parameters, these query parameters will be incorporated into the URL
   * @return queryParameters
  **/
  @ApiModelProperty(value = "Optional; query parameters, these query parameters will be incorporated into the URL")
  public List<HttpGetParameter> getQueryParameters() {
    return queryParameters;
  }

  public void setQueryParameters(List<HttpGetParameter> queryParameters) {
    this.queryParameters = queryParameters;
  }

  public HttpOrchestrationTask formDataParameters(List<HttpFormDataParameter> formDataParameters) {
    this.formDataParameters = formDataParameters;
    return this;
  }

  public HttpOrchestrationTask addFormDataParametersItem(HttpFormDataParameter formDataParametersItem) {
    if (this.formDataParameters == null) {
      this.formDataParameters = new ArrayList<HttpFormDataParameter>();
    }
    this.formDataParameters.add(formDataParametersItem);
    return this;
  }

   /**
   * Optional; FormData parameters, these parameters will be stored in the body in a multi-part encoding
   * @return formDataParameters
  **/
  @ApiModelProperty(value = "Optional; FormData parameters, these parameters will be stored in the body in a multi-part encoding")
  public List<HttpFormDataParameter> getFormDataParameters() {
    return formDataParameters;
  }

  public void setFormDataParameters(List<HttpFormDataParameter> formDataParameters) {
    this.formDataParameters = formDataParameters;
  }

  public HttpOrchestrationTask wwwFormUrlEncodedParameters(List<HttpWwwFormUrlEncodedParameter> wwwFormUrlEncodedParameters) {
    this.wwwFormUrlEncodedParameters = wwwFormUrlEncodedParameters;
    return this;
  }

  public HttpOrchestrationTask addWwwFormUrlEncodedParametersItem(HttpWwwFormUrlEncodedParameter wwwFormUrlEncodedParametersItem) {
    if (this.wwwFormUrlEncodedParameters == null) {
      this.wwwFormUrlEncodedParameters = new ArrayList<HttpWwwFormUrlEncodedParameter>();
    }
    this.wwwFormUrlEncodedParameters.add(wwwFormUrlEncodedParametersItem);
    return this;
  }

   /**
   * Optional; x-www-form-urlencoded paramereters, these parameters will be stored in the body as an application/x-www-form-urlencoded encoding
   * @return wwwFormUrlEncodedParameters
  **/
  @ApiModelProperty(value = "Optional; x-www-form-urlencoded paramereters, these parameters will be stored in the body as an application/x-www-form-urlencoded encoding")
  public List<HttpWwwFormUrlEncodedParameter> getWwwFormUrlEncodedParameters() {
    return wwwFormUrlEncodedParameters;
  }

  public void setWwwFormUrlEncodedParameters(List<HttpWwwFormUrlEncodedParameter> wwwFormUrlEncodedParameters) {
    this.wwwFormUrlEncodedParameters = wwwFormUrlEncodedParameters;
  }

  public HttpOrchestrationTask rawTextBody(HttpRawTextParameter rawTextBody) {
    this.rawTextBody = rawTextBody;
    return this;
  }

   /**
   * Optional; sets the body of the request as raw text, cannot be used with other parameter types in the same request
   * @return rawTextBody
  **/
  @ApiModelProperty(value = "Optional; sets the body of the request as raw text, cannot be used with other parameter types in the same request")
  public HttpRawTextParameter getRawTextBody() {
    return rawTextBody;
  }

  public void setRawTextBody(HttpRawTextParameter rawTextBody) {
    this.rawTextBody = rawTextBody;
  }

  public HttpOrchestrationTask rawBinaryBody(HttpRawBinaryParameter rawBinaryBody) {
    this.rawBinaryBody = rawBinaryBody;
    return this;
  }

   /**
   * Optional; set the body of the request as binary, cannot be used with other parameter types in the same request
   * @return rawBinaryBody
  **/
  @ApiModelProperty(value = "Optional; set the body of the request as binary, cannot be used with other parameter types in the same request")
  public HttpRawBinaryParameter getRawBinaryBody() {
    return rawBinaryBody;
  }

  public void setRawBinaryBody(HttpRawBinaryParameter rawBinaryBody) {
    this.rawBinaryBody = rawBinaryBody;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpOrchestrationTask httpOrchestrationTask = (HttpOrchestrationTask) o;
    return Objects.equals(this.taskName, httpOrchestrationTask.taskName) &&
        Objects.equals(this.httpMethod, httpOrchestrationTask.httpMethod) &&
        Objects.equals(this.URL, httpOrchestrationTask.URL) &&
        Objects.equals(this.httpHeaders, httpOrchestrationTask.httpHeaders) &&
        Objects.equals(this.queryParameters, httpOrchestrationTask.queryParameters) &&
        Objects.equals(this.formDataParameters, httpOrchestrationTask.formDataParameters) &&
        Objects.equals(this.wwwFormUrlEncodedParameters, httpOrchestrationTask.wwwFormUrlEncodedParameters) &&
        Objects.equals(this.rawTextBody, httpOrchestrationTask.rawTextBody) &&
        Objects.equals(this.rawBinaryBody, httpOrchestrationTask.rawBinaryBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, httpMethod, URL, httpHeaders, queryParameters, formDataParameters, wwwFormUrlEncodedParameters, rawTextBody, rawBinaryBody);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpOrchestrationTask {\n");
    
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    formDataParameters: ").append(toIndentedString(formDataParameters)).append("\n");
    sb.append("    wwwFormUrlEncodedParameters: ").append(toIndentedString(wwwFormUrlEncodedParameters)).append("\n");
    sb.append("    rawTextBody: ").append(toIndentedString(rawTextBody)).append("\n");
    sb.append("    rawBinaryBody: ").append(toIndentedString(rawBinaryBody)).append("\n");
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

