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
 * User-Agent parse and validation request
 */
@ApiModel(description = "User-Agent parse and validation request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:01.118Z")
public class UserAgentValidateRequest {
  @SerializedName("UserAgentString")
  private String userAgentString = null;

  public UserAgentValidateRequest userAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
    return this;
  }

   /**
   * The user agent string you wish to parse and validate
   * @return userAgentString
  **/
  @ApiModelProperty(value = "The user agent string you wish to parse and validate")
  public String getUserAgentString() {
    return userAgentString;
  }

  public void setUserAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAgentValidateRequest userAgentValidateRequest = (UserAgentValidateRequest) o;
    return Objects.equals(this.userAgentString, userAgentValidateRequest.userAgentString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgentString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgentValidateRequest {\n");
    
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
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

