/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.orders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.orders.ErrorList;
import com.amazon.model.orders.OrderApprovalsResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the getOrderApprovalsItems operation.
 */
@ApiModel(description = "The response schema for the getOrderApprovalsItems operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:04.283+02:00")
public class GetOrderApprovalsResponse {
  @SerializedName("payload")
  private OrderApprovalsResponse payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOrderApprovalsResponse payload(OrderApprovalsResponse payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getOrderItemsApprovals operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getOrderItemsApprovals operation.")
  public OrderApprovalsResponse getPayload() {
    return payload;
  }

  public void setPayload(OrderApprovalsResponse payload) {
    this.payload = payload;
  }

  public GetOrderApprovalsResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the getOrderItemsApprovals operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the getOrderItemsApprovals operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderApprovalsResponse getOrderApprovalsResponse = (GetOrderApprovalsResponse) o;
    return Objects.equals(this.payload, getOrderApprovalsResponse.payload) &&
        Objects.equals(this.errors, getOrderApprovalsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderApprovalsResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

