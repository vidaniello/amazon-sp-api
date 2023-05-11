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
import com.amazon.model.orders.OrderItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The order items list along with the order ID.
 */
@ApiModel(description = "The order items list along with the order ID.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:04.283+02:00")
public class OrderItemsList {
  @SerializedName("OrderItems")
  private OrderItemList orderItems = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  public OrderItemsList orderItems(OrderItemList orderItems) {
    this.orderItems = orderItems;
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @ApiModelProperty(required = true, value = "")
  public OrderItemList getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(OrderItemList orderItems) {
    this.orderItems = orderItems;
  }

  public OrderItemsList nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * When present and not empty, pass this string token in the next request to return the next response page.
   * @return nextToken
  **/
  @ApiModelProperty(value = "When present and not empty, pass this string token in the next request to return the next response page.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public OrderItemsList amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined order identifier, in 3-7-7 format.
   * @return amazonOrderId
  **/
  @ApiModelProperty(required = true, value = "An Amazon-defined order identifier, in 3-7-7 format.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemsList orderItemsList = (OrderItemsList) o;
    return Objects.equals(this.orderItems, orderItemsList.orderItems) &&
        Objects.equals(this.nextToken, orderItemsList.nextToken) &&
        Objects.equals(this.amazonOrderId, orderItemsList.amazonOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItems, nextToken, amazonOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsList {\n");
    
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
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

