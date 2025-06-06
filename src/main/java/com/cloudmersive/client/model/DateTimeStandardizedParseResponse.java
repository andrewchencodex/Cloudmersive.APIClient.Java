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
import org.threeten.bp.OffsetDateTime;

/**
 * Result of performing a date time parsing
 */
@ApiModel(description = "Result of performing a date time parsing")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:19:01.118Z")
public class DateTimeStandardizedParseResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ParsedDateResult")
  private OffsetDateTime parsedDateResult = null;

  @SerializedName("Year")
  private Integer year = null;

  @SerializedName("Month")
  private Integer month = null;

  @SerializedName("Day")
  private Integer day = null;

  @SerializedName("Hour")
  private Integer hour = null;

  @SerializedName("Minute")
  private Integer minute = null;

  @SerializedName("Second")
  private Integer second = null;

  @SerializedName("DayOfWeek")
  private String dayOfWeek = null;

  public DateTimeStandardizedParseResponse successful(Boolean successful) {
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

  public DateTimeStandardizedParseResponse parsedDateResult(OffsetDateTime parsedDateResult) {
    this.parsedDateResult = parsedDateResult;
    return this;
  }

   /**
   * Result of performing a date time parsing
   * @return parsedDateResult
  **/
  @ApiModelProperty(value = "Result of performing a date time parsing")
  public OffsetDateTime getParsedDateResult() {
    return parsedDateResult;
  }

  public void setParsedDateResult(OffsetDateTime parsedDateResult) {
    this.parsedDateResult = parsedDateResult;
  }

  public DateTimeStandardizedParseResponse year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Year of the parsed date time result
   * @return year
  **/
  @ApiModelProperty(value = "Year of the parsed date time result")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public DateTimeStandardizedParseResponse month(Integer month) {
    this.month = month;
    return this;
  }

   /**
   * Month of the parsed date time result
   * @return month
  **/
  @ApiModelProperty(value = "Month of the parsed date time result")
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public DateTimeStandardizedParseResponse day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * Day of the parsed date time result
   * @return day
  **/
  @ApiModelProperty(value = "Day of the parsed date time result")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public DateTimeStandardizedParseResponse hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Hour of the parsed date time result (24-hour)
   * @return hour
  **/
  @ApiModelProperty(value = "Hour of the parsed date time result (24-hour)")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public DateTimeStandardizedParseResponse minute(Integer minute) {
    this.minute = minute;
    return this;
  }

   /**
   * Minute of the parsed date time result
   * @return minute
  **/
  @ApiModelProperty(value = "Minute of the parsed date time result")
  public Integer getMinute() {
    return minute;
  }

  public void setMinute(Integer minute) {
    this.minute = minute;
  }

  public DateTimeStandardizedParseResponse second(Integer second) {
    this.second = second;
    return this;
  }

   /**
   * Second of the parsed date time result
   * @return second
  **/
  @ApiModelProperty(value = "Second of the parsed date time result")
  public Integer getSecond() {
    return second;
  }

  public void setSecond(Integer second) {
    this.second = second;
  }

  public DateTimeStandardizedParseResponse dayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Day of week
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "Day of week")
  public String getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeStandardizedParseResponse dateTimeStandardizedParseResponse = (DateTimeStandardizedParseResponse) o;
    return Objects.equals(this.successful, dateTimeStandardizedParseResponse.successful) &&
        Objects.equals(this.parsedDateResult, dateTimeStandardizedParseResponse.parsedDateResult) &&
        Objects.equals(this.year, dateTimeStandardizedParseResponse.year) &&
        Objects.equals(this.month, dateTimeStandardizedParseResponse.month) &&
        Objects.equals(this.day, dateTimeStandardizedParseResponse.day) &&
        Objects.equals(this.hour, dateTimeStandardizedParseResponse.hour) &&
        Objects.equals(this.minute, dateTimeStandardizedParseResponse.minute) &&
        Objects.equals(this.second, dateTimeStandardizedParseResponse.second) &&
        Objects.equals(this.dayOfWeek, dateTimeStandardizedParseResponse.dayOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, parsedDateResult, year, month, day, hour, minute, second, dayOfWeek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeStandardizedParseResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    parsedDateResult: ").append(toIndentedString(parsedDateResult)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
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

