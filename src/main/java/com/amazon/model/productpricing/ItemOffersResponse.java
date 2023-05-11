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
import com.amazon.model.productpricing.BatchOffersResponse;
import com.amazon.model.productpricing.GetOffersHttpStatusLine;
import com.amazon.model.productpricing.GetOffersResponse;
import com.amazon.model.productpricing.HttpResponseHeaders;
import com.amazon.model.productpricing.ItemOffersRequestParams;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ItemOffersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:15.144+02:00")
public class ItemOffersResponse extends BatchOffersResponse {
  @SerializedName("request")
  private ItemOffersRequestParams request = null;

  public ItemOffersResponse request(ItemOffersRequestParams request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(required = true, value = "")
  public ItemOffersRequestParams getRequest() {
    return request;
  }

  public void setRequest(ItemOffersRequestParams request) {
    this.request = request;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemOffersResponse itemOffersResponse = (ItemOffersResponse) o;
    return Objects.equals(this.request, itemOffersResponse.request) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemOffersResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

