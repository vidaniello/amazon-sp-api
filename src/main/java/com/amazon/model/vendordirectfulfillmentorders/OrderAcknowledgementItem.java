/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.vendordirectfulfillmentorders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.vendordirectfulfillmentorders.AcknowledgementStatus;
import com.amazon.model.vendordirectfulfillmentorders.OrderItemAcknowledgement;
import com.amazon.model.vendordirectfulfillmentorders.PartyIdentification;
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
import org.threeten.bp.OffsetDateTime;

/**
 * Details of an individual order being acknowledged.
 */
@ApiModel(description = "Details of an individual order being acknowledged.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:54:15.528+02:00")
public class OrderAcknowledgementItem {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("vendorOrderNumber")
  private String vendorOrderNumber = null;

  @SerializedName("acknowledgementDate")
  private OffsetDateTime acknowledgementDate = null;

  @SerializedName("acknowledgementStatus")
  private AcknowledgementStatus acknowledgementStatus = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipFromParty")
  private PartyIdentification shipFromParty = null;

  @SerializedName("itemAcknowledgements")
  private List<OrderItemAcknowledgement> itemAcknowledgements = new ArrayList<OrderItemAcknowledgement>();

  public OrderAcknowledgementItem purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The purchase order number for this order. Formatting Notes: alpha-numeric code.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(required = true, value = "The purchase order number for this order. Formatting Notes: alpha-numeric code.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public OrderAcknowledgementItem vendorOrderNumber(String vendorOrderNumber) {
    this.vendorOrderNumber = vendorOrderNumber;
    return this;
  }

   /**
   * The vendor&#39;s order number for this order.
   * @return vendorOrderNumber
  **/
  @ApiModelProperty(required = true, value = "The vendor's order number for this order.")
  public String getVendorOrderNumber() {
    return vendorOrderNumber;
  }

  public void setVendorOrderNumber(String vendorOrderNumber) {
    this.vendorOrderNumber = vendorOrderNumber;
  }

  public OrderAcknowledgementItem acknowledgementDate(OffsetDateTime acknowledgementDate) {
    this.acknowledgementDate = acknowledgementDate;
    return this;
  }

   /**
   * The date and time when the order is acknowledged, in ISO-8601 date/time format. For example: 2018-07-16T23:00:00Z / 2018-07-16T23:00:00-05:00 / 2018-07-16T23:00:00-08:00.
   * @return acknowledgementDate
  **/
  @ApiModelProperty(required = true, value = "The date and time when the order is acknowledged, in ISO-8601 date/time format. For example: 2018-07-16T23:00:00Z / 2018-07-16T23:00:00-05:00 / 2018-07-16T23:00:00-08:00.")
  public OffsetDateTime getAcknowledgementDate() {
    return acknowledgementDate;
  }

  public void setAcknowledgementDate(OffsetDateTime acknowledgementDate) {
    this.acknowledgementDate = acknowledgementDate;
  }

  public OrderAcknowledgementItem acknowledgementStatus(AcknowledgementStatus acknowledgementStatus) {
    this.acknowledgementStatus = acknowledgementStatus;
    return this;
  }

   /**
   * Status of acknowledgement.
   * @return acknowledgementStatus
  **/
  @ApiModelProperty(required = true, value = "Status of acknowledgement.")
  public AcknowledgementStatus getAcknowledgementStatus() {
    return acknowledgementStatus;
  }

  public void setAcknowledgementStatus(AcknowledgementStatus acknowledgementStatus) {
    this.acknowledgementStatus = acknowledgementStatus;
  }

  public OrderAcknowledgementItem sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * PartyID as vendor code.
   * @return sellingParty
  **/
  @ApiModelProperty(required = true, value = "PartyID as vendor code.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public OrderAcknowledgementItem shipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
    return this;
  }

   /**
   * PartyID as the vendor&#39;s warehouseId.
   * @return shipFromParty
  **/
  @ApiModelProperty(required = true, value = "PartyID as the vendor's warehouseId.")
  public PartyIdentification getShipFromParty() {
    return shipFromParty;
  }

  public void setShipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
  }

  public OrderAcknowledgementItem itemAcknowledgements(List<OrderItemAcknowledgement> itemAcknowledgements) {
    this.itemAcknowledgements = itemAcknowledgements;
    return this;
  }

  public OrderAcknowledgementItem addItemAcknowledgementsItem(OrderItemAcknowledgement itemAcknowledgementsItem) {
    this.itemAcknowledgements.add(itemAcknowledgementsItem);
    return this;
  }

   /**
   * Item details including acknowledged quantity.
   * @return itemAcknowledgements
  **/
  @ApiModelProperty(required = true, value = "Item details including acknowledged quantity.")
  public List<OrderItemAcknowledgement> getItemAcknowledgements() {
    return itemAcknowledgements;
  }

  public void setItemAcknowledgements(List<OrderItemAcknowledgement> itemAcknowledgements) {
    this.itemAcknowledgements = itemAcknowledgements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAcknowledgementItem orderAcknowledgementItem = (OrderAcknowledgementItem) o;
    return Objects.equals(this.purchaseOrderNumber, orderAcknowledgementItem.purchaseOrderNumber) &&
        Objects.equals(this.vendorOrderNumber, orderAcknowledgementItem.vendorOrderNumber) &&
        Objects.equals(this.acknowledgementDate, orderAcknowledgementItem.acknowledgementDate) &&
        Objects.equals(this.acknowledgementStatus, orderAcknowledgementItem.acknowledgementStatus) &&
        Objects.equals(this.sellingParty, orderAcknowledgementItem.sellingParty) &&
        Objects.equals(this.shipFromParty, orderAcknowledgementItem.shipFromParty) &&
        Objects.equals(this.itemAcknowledgements, orderAcknowledgementItem.itemAcknowledgements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, vendorOrderNumber, acknowledgementDate, acknowledgementStatus, sellingParty, shipFromParty, itemAcknowledgements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAcknowledgementItem {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    vendorOrderNumber: ").append(toIndentedString(vendorOrderNumber)).append("\n");
    sb.append("    acknowledgementDate: ").append(toIndentedString(acknowledgementDate)).append("\n");
    sb.append("    acknowledgementStatus: ").append(toIndentedString(acknowledgementStatus)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipFromParty: ").append(toIndentedString(shipFromParty)).append("\n");
    sb.append("    itemAcknowledgements: ").append(toIndentedString(itemAcknowledgements)).append("\n");
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

