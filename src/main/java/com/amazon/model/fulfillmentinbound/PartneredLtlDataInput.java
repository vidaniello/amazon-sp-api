/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.fulfillmentinbound;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.fulfillmentinbound.Amount;
import com.amazon.model.fulfillmentinbound.Contact;
import com.amazon.model.fulfillmentinbound.PalletList;
import com.amazon.model.fulfillmentinbound.SellerFreightClass;
import com.amazon.model.fulfillmentinbound.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information that is required by an Amazon-partnered carrier to ship a Less Than Truckload/Full Truckload (LTL/FTL) inbound shipment.
 */
@ApiModel(description = "Information that is required by an Amazon-partnered carrier to ship a Less Than Truckload/Full Truckload (LTL/FTL) inbound shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:52:26.128+02:00")
public class PartneredLtlDataInput {
  @SerializedName("Contact")
  private Contact contact = null;

  @SerializedName("BoxCount")
  private Integer boxCount = null;

  @SerializedName("SellerFreightClass")
  private SellerFreightClass sellerFreightClass = null;

  @SerializedName("FreightReadyDate")
  private String freightReadyDate = null;

  @SerializedName("PalletList")
  private PalletList palletList = null;

  @SerializedName("TotalWeight")
  private Weight totalWeight = null;

  @SerializedName("SellerDeclaredValue")
  private Amount sellerDeclaredValue = null;

  public PartneredLtlDataInput contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact information for the person in the seller&#39;s organization who is responsible for the shipment. Used by the carrier if they have questions about the shipment.
   * @return contact
  **/
  @ApiModelProperty(value = "Contact information for the person in the seller's organization who is responsible for the shipment. Used by the carrier if they have questions about the shipment.")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public PartneredLtlDataInput boxCount(Integer boxCount) {
    this.boxCount = boxCount;
    return this;
  }

   /**
   * The number of boxes in the shipment.
   * @return boxCount
  **/
  @ApiModelProperty(value = "The number of boxes in the shipment.")
  public Integer getBoxCount() {
    return boxCount;
  }

  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

  public PartneredLtlDataInput sellerFreightClass(SellerFreightClass sellerFreightClass) {
    this.sellerFreightClass = sellerFreightClass;
    return this;
  }

   /**
   * Get sellerFreightClass
   * @return sellerFreightClass
  **/
  @ApiModelProperty(value = "")
  public SellerFreightClass getSellerFreightClass() {
    return sellerFreightClass;
  }

  public void setSellerFreightClass(SellerFreightClass sellerFreightClass) {
    this.sellerFreightClass = sellerFreightClass;
  }

  public PartneredLtlDataInput freightReadyDate(String freightReadyDate) {
    this.freightReadyDate = freightReadyDate;
    return this;
  }

   /**
   * The date that the shipment will be ready to be picked up by the carrier.
   * @return freightReadyDate
  **/
  @ApiModelProperty(value = "The date that the shipment will be ready to be picked up by the carrier.")
  public String getFreightReadyDate() {
    return freightReadyDate;
  }

  public void setFreightReadyDate(String freightReadyDate) {
    this.freightReadyDate = freightReadyDate;
  }

  public PartneredLtlDataInput palletList(PalletList palletList) {
    this.palletList = palletList;
    return this;
  }

   /**
   * Get palletList
   * @return palletList
  **/
  @ApiModelProperty(value = "")
  public PalletList getPalletList() {
    return palletList;
  }

  public void setPalletList(PalletList palletList) {
    this.palletList = palletList;
  }

  public PartneredLtlDataInput totalWeight(Weight totalWeight) {
    this.totalWeight = totalWeight;
    return this;
  }

   /**
   * The total weight of the shipment.
   * @return totalWeight
  **/
  @ApiModelProperty(value = "The total weight of the shipment.")
  public Weight getTotalWeight() {
    return totalWeight;
  }

  public void setTotalWeight(Weight totalWeight) {
    this.totalWeight = totalWeight;
  }

  public PartneredLtlDataInput sellerDeclaredValue(Amount sellerDeclaredValue) {
    this.sellerDeclaredValue = sellerDeclaredValue;
    return this;
  }

   /**
   * The declaration of the total value of the inventory in the shipment.
   * @return sellerDeclaredValue
  **/
  @ApiModelProperty(value = "The declaration of the total value of the inventory in the shipment.")
  public Amount getSellerDeclaredValue() {
    return sellerDeclaredValue;
  }

  public void setSellerDeclaredValue(Amount sellerDeclaredValue) {
    this.sellerDeclaredValue = sellerDeclaredValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartneredLtlDataInput partneredLtlDataInput = (PartneredLtlDataInput) o;
    return Objects.equals(this.contact, partneredLtlDataInput.contact) &&
        Objects.equals(this.boxCount, partneredLtlDataInput.boxCount) &&
        Objects.equals(this.sellerFreightClass, partneredLtlDataInput.sellerFreightClass) &&
        Objects.equals(this.freightReadyDate, partneredLtlDataInput.freightReadyDate) &&
        Objects.equals(this.palletList, partneredLtlDataInput.palletList) &&
        Objects.equals(this.totalWeight, partneredLtlDataInput.totalWeight) &&
        Objects.equals(this.sellerDeclaredValue, partneredLtlDataInput.sellerDeclaredValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, boxCount, sellerFreightClass, freightReadyDate, palletList, totalWeight, sellerDeclaredValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartneredLtlDataInput {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    boxCount: ").append(toIndentedString(boxCount)).append("\n");
    sb.append("    sellerFreightClass: ").append(toIndentedString(sellerFreightClass)).append("\n");
    sb.append("    freightReadyDate: ").append(toIndentedString(freightReadyDate)).append("\n");
    sb.append("    palletList: ").append(toIndentedString(palletList)).append("\n");
    sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
    sb.append("    sellerDeclaredValue: ").append(toIndentedString(sellerDeclaredValue)).append("\n");
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

