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
 * Result from validating a phone number
 */
@ApiModel(description = "Result from validating a phone number")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:01.118Z")
public class PhoneNumberValidationResponse {
  @SerializedName("IsValid")
  private Boolean isValid = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("PhoneNumberType")
  private String phoneNumberType = null;

  @SerializedName("E164Format")
  private String e164Format = null;

  @SerializedName("InternationalFormat")
  private String internationalFormat = null;

  @SerializedName("NationalFormat")
  private String nationalFormat = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("CountryName")
  private String countryName = null;

  public PhoneNumberValidationResponse isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * True if the phone number is valid, false otherwise
   * @return isValid
  **/
  @ApiModelProperty(value = "True if the phone number is valid, false otherwise")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public PhoneNumberValidationResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false if there was an error during validation.  See IsValid for validation result.
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false if there was an error during validation.  See IsValid for validation result.")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public PhoneNumberValidationResponse phoneNumberType(String phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
    return this;
  }

   /**
   * Type of phone number; possible values are: FixedLine, Mobile, FixedLineOrMobile, TollFree, PremiumRate,   SharedCost, Voip, PersonalNumber, Pager, Uan, Voicemail, Unknown
   * @return phoneNumberType
  **/
  @ApiModelProperty(value = "Type of phone number; possible values are: FixedLine, Mobile, FixedLineOrMobile, TollFree, PremiumRate,   SharedCost, Voip, PersonalNumber, Pager, Uan, Voicemail, Unknown")
  public String getPhoneNumberType() {
    return phoneNumberType;
  }

  public void setPhoneNumberType(String phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }

  public PhoneNumberValidationResponse e164Format(String e164Format) {
    this.e164Format = e164Format;
    return this;
  }

   /**
   * E.164 format of the phone number
   * @return e164Format
  **/
  @ApiModelProperty(value = "E.164 format of the phone number")
  public String getE164Format() {
    return e164Format;
  }

  public void setE164Format(String e164Format) {
    this.e164Format = e164Format;
  }

  public PhoneNumberValidationResponse internationalFormat(String internationalFormat) {
    this.internationalFormat = internationalFormat;
    return this;
  }

   /**
   * Internaltional format of the phone number
   * @return internationalFormat
  **/
  @ApiModelProperty(value = "Internaltional format of the phone number")
  public String getInternationalFormat() {
    return internationalFormat;
  }

  public void setInternationalFormat(String internationalFormat) {
    this.internationalFormat = internationalFormat;
  }

  public PhoneNumberValidationResponse nationalFormat(String nationalFormat) {
    this.nationalFormat = nationalFormat;
    return this;
  }

   /**
   * National format of the phone number
   * @return nationalFormat
  **/
  @ApiModelProperty(value = "National format of the phone number")
  public String getNationalFormat() {
    return nationalFormat;
  }

  public void setNationalFormat(String nationalFormat) {
    this.nationalFormat = nationalFormat;
  }

  public PhoneNumberValidationResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Two digit country code of the phone number
   * @return countryCode
  **/
  @ApiModelProperty(value = "Two digit country code of the phone number")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PhoneNumberValidationResponse countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * User-friendly long name of the country for the phone number
   * @return countryName
  **/
  @ApiModelProperty(value = "User-friendly long name of the country for the phone number")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberValidationResponse phoneNumberValidationResponse = (PhoneNumberValidationResponse) o;
    return Objects.equals(this.isValid, phoneNumberValidationResponse.isValid) &&
        Objects.equals(this.successful, phoneNumberValidationResponse.successful) &&
        Objects.equals(this.phoneNumberType, phoneNumberValidationResponse.phoneNumberType) &&
        Objects.equals(this.e164Format, phoneNumberValidationResponse.e164Format) &&
        Objects.equals(this.internationalFormat, phoneNumberValidationResponse.internationalFormat) &&
        Objects.equals(this.nationalFormat, phoneNumberValidationResponse.nationalFormat) &&
        Objects.equals(this.countryCode, phoneNumberValidationResponse.countryCode) &&
        Objects.equals(this.countryName, phoneNumberValidationResponse.countryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, successful, phoneNumberType, e164Format, internationalFormat, nationalFormat, countryCode, countryName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberValidationResponse {\n");
    
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    e164Format: ").append(toIndentedString(e164Format)).append("\n");
    sb.append("    internationalFormat: ").append(toIndentedString(internationalFormat)).append("\n");
    sb.append("    nationalFormat: ").append(toIndentedString(nationalFormat)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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

