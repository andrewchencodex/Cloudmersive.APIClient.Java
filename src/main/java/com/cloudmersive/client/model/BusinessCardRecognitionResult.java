/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import org.threeten.bp.OffsetDateTime;

/**
 * Result of recognizing a business card, to extract the key information from the business card
 */
@ApiModel(description = "Result of recognizing a business card, to extract the key information from the business card")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:20.241Z")
public class BusinessCardRecognitionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("PersonName")
  private String personName = null;

  @SerializedName("PersonTitle")
  private String personTitle = null;

  @SerializedName("BusinessName")
  private String businessName = null;

  @SerializedName("AddressString")
  private String addressString = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("Timestamp")
  private OffsetDateTime timestamp = null;

  public BusinessCardRecognitionResult successful(Boolean successful) {
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

  public BusinessCardRecognitionResult personName(String personName) {
    this.personName = personName;
    return this;
  }

   /**
   * The name of the person printed on the business card (if included on the business card)
   * @return personName
  **/
  @ApiModelProperty(value = "The name of the person printed on the business card (if included on the business card)")
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public BusinessCardRecognitionResult personTitle(String personTitle) {
    this.personTitle = personTitle;
    return this;
  }

   /**
   * The title of the person printed on the business card (if included on the business card)
   * @return personTitle
  **/
  @ApiModelProperty(value = "The title of the person printed on the business card (if included on the business card)")
  public String getPersonTitle() {
    return personTitle;
  }

  public void setPersonTitle(String personTitle) {
    this.personTitle = personTitle;
  }

  public BusinessCardRecognitionResult businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * The name of the business printed on the business card (if included on the business card)
   * @return businessName
  **/
  @ApiModelProperty(value = "The name of the business printed on the business card (if included on the business card)")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public BusinessCardRecognitionResult addressString(String addressString) {
    this.addressString = addressString;
    return this;
  }

   /**
   * The address printed on the business card (if included on the business card)
   * @return addressString
  **/
  @ApiModelProperty(value = "The address printed on the business card (if included on the business card)")
  public String getAddressString() {
    return addressString;
  }

  public void setAddressString(String addressString) {
    this.addressString = addressString;
  }

  public BusinessCardRecognitionResult phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number printed on the business card (if included on the business card)
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number printed on the business card (if included on the business card)")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public BusinessCardRecognitionResult emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address printed on the business card (if included on the business card)
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address printed on the business card (if included on the business card)")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public BusinessCardRecognitionResult timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The date and time printed on the business card (if included on the business card)
   * @return timestamp
  **/
  @ApiModelProperty(value = "The date and time printed on the business card (if included on the business card)")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessCardRecognitionResult businessCardRecognitionResult = (BusinessCardRecognitionResult) o;
    return Objects.equals(this.successful, businessCardRecognitionResult.successful) &&
        Objects.equals(this.personName, businessCardRecognitionResult.personName) &&
        Objects.equals(this.personTitle, businessCardRecognitionResult.personTitle) &&
        Objects.equals(this.businessName, businessCardRecognitionResult.businessName) &&
        Objects.equals(this.addressString, businessCardRecognitionResult.addressString) &&
        Objects.equals(this.phoneNumber, businessCardRecognitionResult.phoneNumber) &&
        Objects.equals(this.emailAddress, businessCardRecognitionResult.emailAddress) &&
        Objects.equals(this.timestamp, businessCardRecognitionResult.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, personName, personTitle, businessName, addressString, phoneNumber, emailAddress, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessCardRecognitionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    personTitle: ").append(toIndentedString(personTitle)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    addressString: ").append(toIndentedString(addressString)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

