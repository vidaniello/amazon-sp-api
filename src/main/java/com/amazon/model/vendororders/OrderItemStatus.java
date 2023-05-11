/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.vendororders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.vendororders.Money;
import com.amazon.model.vendororders.OrderItemStatusAcknowledgementStatus;
import com.amazon.model.vendororders.OrderItemStatusOrderedQuantity;
import com.amazon.model.vendororders.OrderItemStatusReceivingStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrderItemStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:54:45.382+02:00")
public class OrderItemStatus {
  @SerializedName("itemSequenceNumber")
  private String itemSequenceNumber = null;

  @SerializedName("buyerProductIdentifier")
  private String buyerProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("netCost")
  private Money netCost = null;

  @SerializedName("listPrice")
  private Money listPrice = null;

  @SerializedName("orderedQuantity")
  private OrderItemStatusOrderedQuantity orderedQuantity = null;

  @SerializedName("acknowledgementStatus")
  private OrderItemStatusAcknowledgementStatus acknowledgementStatus = null;

  @SerializedName("receivingStatus")
  private OrderItemStatusReceivingStatus receivingStatus = null;

  public OrderItemStatus itemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
    return this;
  }

   /**
   * Numbering of the item on the purchase order. The first item will be 1, the second 2, and so on.
   * @return itemSequenceNumber
  **/
  @ApiModelProperty(required = true, value = "Numbering of the item on the purchase order. The first item will be 1, the second 2, and so on.")
  public String getItemSequenceNumber() {
    return itemSequenceNumber;
  }

  public void setItemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
  }

  public OrderItemStatus buyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
    return this;
  }

   /**
   * Buyer&#39;s Standard Identification Number (ASIN) of an item.
   * @return buyerProductIdentifier
  **/
  @ApiModelProperty(value = "Buyer's Standard Identification Number (ASIN) of an item.")
  public String getBuyerProductIdentifier() {
    return buyerProductIdentifier;
  }

  public void setBuyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
  }

  public OrderItemStatus vendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
    return this;
  }

   /**
   * The vendor selected product identification of the item.
   * @return vendorProductIdentifier
  **/
  @ApiModelProperty(value = "The vendor selected product identification of the item.")
  public String getVendorProductIdentifier() {
    return vendorProductIdentifier;
  }

  public void setVendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
  }

  public OrderItemStatus netCost(Money netCost) {
    this.netCost = netCost;
    return this;
  }

   /**
   * The net cost to Amazon each (cost).
   * @return netCost
  **/
  @ApiModelProperty(value = "The net cost to Amazon each (cost).")
  public Money getNetCost() {
    return netCost;
  }

  public void setNetCost(Money netCost) {
    this.netCost = netCost;
  }

  public OrderItemStatus listPrice(Money listPrice) {
    this.listPrice = listPrice;
    return this;
  }

   /**
   * The list Price to Amazon each (list).
   * @return listPrice
  **/
  @ApiModelProperty(value = "The list Price to Amazon each (list).")
  public Money getListPrice() {
    return listPrice;
  }

  public void setListPrice(Money listPrice) {
    this.listPrice = listPrice;
  }

  public OrderItemStatus orderedQuantity(OrderItemStatusOrderedQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
    return this;
  }

   /**
   * Get orderedQuantity
   * @return orderedQuantity
  **/
  @ApiModelProperty(value = "")
  public OrderItemStatusOrderedQuantity getOrderedQuantity() {
    return orderedQuantity;
  }

  public void setOrderedQuantity(OrderItemStatusOrderedQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
  }

  public OrderItemStatus acknowledgementStatus(OrderItemStatusAcknowledgementStatus acknowledgementStatus) {
    this.acknowledgementStatus = acknowledgementStatus;
    return this;
  }

   /**
   * Get acknowledgementStatus
   * @return acknowledgementStatus
  **/
  @ApiModelProperty(value = "")
  public OrderItemStatusAcknowledgementStatus getAcknowledgementStatus() {
    return acknowledgementStatus;
  }

  public void setAcknowledgementStatus(OrderItemStatusAcknowledgementStatus acknowledgementStatus) {
    this.acknowledgementStatus = acknowledgementStatus;
  }

  public OrderItemStatus receivingStatus(OrderItemStatusReceivingStatus receivingStatus) {
    this.receivingStatus = receivingStatus;
    return this;
  }

   /**
   * Get receivingStatus
   * @return receivingStatus
  **/
  @ApiModelProperty(value = "")
  public OrderItemStatusReceivingStatus getReceivingStatus() {
    return receivingStatus;
  }

  public void setReceivingStatus(OrderItemStatusReceivingStatus receivingStatus) {
    this.receivingStatus = receivingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemStatus orderItemStatus = (OrderItemStatus) o;
    return Objects.equals(this.itemSequenceNumber, orderItemStatus.itemSequenceNumber) &&
        Objects.equals(this.buyerProductIdentifier, orderItemStatus.buyerProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, orderItemStatus.vendorProductIdentifier) &&
        Objects.equals(this.netCost, orderItemStatus.netCost) &&
        Objects.equals(this.listPrice, orderItemStatus.listPrice) &&
        Objects.equals(this.orderedQuantity, orderItemStatus.orderedQuantity) &&
        Objects.equals(this.acknowledgementStatus, orderItemStatus.acknowledgementStatus) &&
        Objects.equals(this.receivingStatus, orderItemStatus.receivingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, buyerProductIdentifier, vendorProductIdentifier, netCost, listPrice, orderedQuantity, acknowledgementStatus, receivingStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemStatus {\n");
    
    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    buyerProductIdentifier: ").append(toIndentedString(buyerProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    netCost: ").append(toIndentedString(netCost)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    acknowledgementStatus: ").append(toIndentedString(acknowledgementStatus)).append("\n");
    sb.append("    receivingStatus: ").append(toIndentedString(receivingStatus)).append("\n");
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

