/*
 * currencyapi
 * The currency APIs help you retrieve exchange rates and convert prices between currencies easily.
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
import com.cloudmersive.client.model.AvailableCurrency;
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
 * Result of performing an enumerate currencies operation
 */
@ApiModel(description = "Result of performing an enumerate currencies operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-06-01T04:20:28.611Z")
public class AvailableCurrencyResponse {
  @SerializedName("Currencies")
  private List<AvailableCurrency> currencies = null;

  public AvailableCurrencyResponse currencies(List<AvailableCurrency> currencies) {
    this.currencies = currencies;
    return this;
  }

  public AvailableCurrencyResponse addCurrenciesItem(AvailableCurrency currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<AvailableCurrency>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * List of available currencies from the API
   * @return currencies
  **/
  @ApiModelProperty(value = "List of available currencies from the API")
  public List<AvailableCurrency> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<AvailableCurrency> currencies) {
    this.currencies = currencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableCurrencyResponse availableCurrencyResponse = (AvailableCurrencyResponse) o;
    return Objects.equals(this.currencies, availableCurrencyResponse.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableCurrencyResponse {\n");
    
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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

