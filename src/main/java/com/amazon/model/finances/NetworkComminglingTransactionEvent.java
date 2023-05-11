/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.finances;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.finances.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A network commingling transaction event.
 */
@ApiModel(description = "A network commingling transaction event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:52:20.330+02:00")
public class NetworkComminglingTransactionEvent {
  @SerializedName("TransactionType")
  private String transactionType = null;

  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("NetCoTransactionID")
  private String netCoTransactionID = null;

  @SerializedName("SwapReason")
  private String swapReason = null;

  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("TaxExclusiveAmount")
  private Currency taxExclusiveAmount = null;

  @SerializedName("TaxAmount")
  private Currency taxAmount = null;

  public NetworkComminglingTransactionEvent transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The type of network item swap.  Possible values:  * NetCo - A Fulfillment by Amazon inventory pooling transaction. Available only in the India marketplace.  * ComminglingVAT - A commingling VAT transaction. Available only in the UK, Spain, France, Germany, and Italy marketplaces.
   * @return transactionType
  **/
  @ApiModelProperty(value = "The type of network item swap.  Possible values:  * NetCo - A Fulfillment by Amazon inventory pooling transaction. Available only in the India marketplace.  * ComminglingVAT - A commingling VAT transaction. Available only in the UK, Spain, France, Germany, and Italy marketplaces.")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public NetworkComminglingTransactionEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public NetworkComminglingTransactionEvent netCoTransactionID(String netCoTransactionID) {
    this.netCoTransactionID = netCoTransactionID;
    return this;
  }

   /**
   * The identifier for the network item swap.
   * @return netCoTransactionID
  **/
  @ApiModelProperty(value = "The identifier for the network item swap.")
  public String getNetCoTransactionID() {
    return netCoTransactionID;
  }

  public void setNetCoTransactionID(String netCoTransactionID) {
    this.netCoTransactionID = netCoTransactionID;
  }

  public NetworkComminglingTransactionEvent swapReason(String swapReason) {
    this.swapReason = swapReason;
    return this;
  }

   /**
   * The reason for the network item swap.
   * @return swapReason
  **/
  @ApiModelProperty(value = "The reason for the network item swap.")
  public String getSwapReason() {
    return swapReason;
  }

  public void setSwapReason(String swapReason) {
    this.swapReason = swapReason;
  }

  public NetworkComminglingTransactionEvent ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the swapped item.
   * @return ASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the swapped item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public NetworkComminglingTransactionEvent marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace in which the event took place.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "The marketplace in which the event took place.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public NetworkComminglingTransactionEvent taxExclusiveAmount(Currency taxExclusiveAmount) {
    this.taxExclusiveAmount = taxExclusiveAmount;
    return this;
  }

   /**
   * The price of the swapped item minus TaxAmount.
   * @return taxExclusiveAmount
  **/
  @ApiModelProperty(value = "The price of the swapped item minus TaxAmount.")
  public Currency getTaxExclusiveAmount() {
    return taxExclusiveAmount;
  }

  public void setTaxExclusiveAmount(Currency taxExclusiveAmount) {
    this.taxExclusiveAmount = taxExclusiveAmount;
  }

  public NetworkComminglingTransactionEvent taxAmount(Currency taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The tax on the network item swap paid by the seller.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The tax on the network item swap paid by the seller.")
  public Currency getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Currency taxAmount) {
    this.taxAmount = taxAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkComminglingTransactionEvent networkComminglingTransactionEvent = (NetworkComminglingTransactionEvent) o;
    return Objects.equals(this.transactionType, networkComminglingTransactionEvent.transactionType) &&
        Objects.equals(this.postedDate, networkComminglingTransactionEvent.postedDate) &&
        Objects.equals(this.netCoTransactionID, networkComminglingTransactionEvent.netCoTransactionID) &&
        Objects.equals(this.swapReason, networkComminglingTransactionEvent.swapReason) &&
        Objects.equals(this.ASIN, networkComminglingTransactionEvent.ASIN) &&
        Objects.equals(this.marketplaceId, networkComminglingTransactionEvent.marketplaceId) &&
        Objects.equals(this.taxExclusiveAmount, networkComminglingTransactionEvent.taxExclusiveAmount) &&
        Objects.equals(this.taxAmount, networkComminglingTransactionEvent.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, postedDate, netCoTransactionID, swapReason, ASIN, marketplaceId, taxExclusiveAmount, taxAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkComminglingTransactionEvent {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    netCoTransactionID: ").append(toIndentedString(netCoTransactionID)).append("\n");
    sb.append("    swapReason: ").append(toIndentedString(swapReason)).append("\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    taxExclusiveAmount: ").append(toIndentedString(taxExclusiveAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

