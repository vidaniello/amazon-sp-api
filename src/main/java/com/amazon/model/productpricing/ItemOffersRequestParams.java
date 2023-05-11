/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.productpricing;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.productpricing.BatchOffersRequestParams;
import com.amazon.model.productpricing.CustomerType;
import com.amazon.model.productpricing.ItemCondition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ItemOffersRequestParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:15.144+02:00")
public class ItemOffersRequestParams extends BatchOffersRequestParams {
  @SerializedName("Asin")
  private String asin = null;

  public ItemOffersRequestParams asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item. This is the same Asin passed as a request parameter.
   * @return asin
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item. This is the same Asin passed as a request parameter.")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemOffersRequestParams itemOffersRequestParams = (ItemOffersRequestParams) o;
    return Objects.equals(this.asin, itemOffersRequestParams.asin) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemOffersRequestParams {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
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

