/*
 * Selling Partner API for Retail Procurement Payments
 * The Selling Partner API for Retail Procurement Payments provides programmatic access to vendors payments data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.vendorinvoices;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.vendorinvoices.AllowanceDetails;
import com.amazon.model.vendorinvoices.ChargeDetails;
import com.amazon.model.vendorinvoices.CreditNoteDetails;
import com.amazon.model.vendorinvoices.ItemQuantity;
import com.amazon.model.vendorinvoices.Money;
import com.amazon.model.vendorinvoices.TaxDetails;
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
 * Details of the item being invoiced.
 */
@ApiModel(description = "Details of the item being invoiced.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:54:40.298+02:00")
public class InvoiceItem {
  @SerializedName("itemSequenceNumber")
  private Integer itemSequenceNumber = null;

  @SerializedName("amazonProductIdentifier")
  private String amazonProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("invoicedQuantity")
  private ItemQuantity invoicedQuantity = null;

  @SerializedName("netCost")
  private Money netCost = null;

  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("hsnCode")
  private String hsnCode = null;

  @SerializedName("creditNoteDetails")
  private CreditNoteDetails creditNoteDetails = null;

  @SerializedName("taxDetails")
  private List<TaxDetails> taxDetails = null;

  @SerializedName("chargeDetails")
  private List<ChargeDetails> chargeDetails = null;

  @SerializedName("allowanceDetails")
  private List<AllowanceDetails> allowanceDetails = null;

  public InvoiceItem itemSequenceNumber(Integer itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
    return this;
  }

   /**
   * Unique number related to this line item.
   * @return itemSequenceNumber
  **/
  @ApiModelProperty(required = true, value = "Unique number related to this line item.")
  public Integer getItemSequenceNumber() {
    return itemSequenceNumber;
  }

  public void setItemSequenceNumber(Integer itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
  }

  public InvoiceItem amazonProductIdentifier(String amazonProductIdentifier) {
    this.amazonProductIdentifier = amazonProductIdentifier;
    return this;
  }

   /**
   * Amazon Standard Identification Number (ASIN) of an item.
   * @return amazonProductIdentifier
  **/
  @ApiModelProperty(value = "Amazon Standard Identification Number (ASIN) of an item.")
  public String getAmazonProductIdentifier() {
    return amazonProductIdentifier;
  }

  public void setAmazonProductIdentifier(String amazonProductIdentifier) {
    this.amazonProductIdentifier = amazonProductIdentifier;
  }

  public InvoiceItem vendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
    return this;
  }

   /**
   * The vendor selected product identifier of the item. Should be the same as was provided in the purchase order.
   * @return vendorProductIdentifier
  **/
  @ApiModelProperty(value = "The vendor selected product identifier of the item. Should be the same as was provided in the purchase order.")
  public String getVendorProductIdentifier() {
    return vendorProductIdentifier;
  }

  public void setVendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
  }

  public InvoiceItem invoicedQuantity(ItemQuantity invoicedQuantity) {
    this.invoicedQuantity = invoicedQuantity;
    return this;
  }

   /**
   * Invoiced quantity of this item. Quantity must be greater than zero.
   * @return invoicedQuantity
  **/
  @ApiModelProperty(required = true, value = "Invoiced quantity of this item. Quantity must be greater than zero.")
  public ItemQuantity getInvoicedQuantity() {
    return invoicedQuantity;
  }

  public void setInvoicedQuantity(ItemQuantity invoicedQuantity) {
    this.invoicedQuantity = invoicedQuantity;
  }

  public InvoiceItem netCost(Money netCost) {
    this.netCost = netCost;
    return this;
  }

   /**
   * The item cost to Amazon, which should match the cost on the order. Price information should not be zero or negative. It indicates net unit price. Net cost means VAT is not included in cost.
   * @return netCost
  **/
  @ApiModelProperty(required = true, value = "The item cost to Amazon, which should match the cost on the order. Price information should not be zero or negative. It indicates net unit price. Net cost means VAT is not included in cost.")
  public Money getNetCost() {
    return netCost;
  }

  public void setNetCost(Money netCost) {
    this.netCost = netCost;
  }

  public InvoiceItem purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The Amazon purchase order number for this invoiced line item. Formatting Notes: 8-character alpha-numeric code. This value is mandatory only when invoiceType is Invoice, and is not required when invoiceType is CreditNote.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(value = "The Amazon purchase order number for this invoiced line item. Formatting Notes: 8-character alpha-numeric code. This value is mandatory only when invoiceType is Invoice, and is not required when invoiceType is CreditNote.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public InvoiceItem hsnCode(String hsnCode) {
    this.hsnCode = hsnCode;
    return this;
  }

   /**
   * HSN Tax code. The HSN number cannot contain alphabets.
   * @return hsnCode
  **/
  @ApiModelProperty(value = "HSN Tax code. The HSN number cannot contain alphabets.")
  public String getHsnCode() {
    return hsnCode;
  }

  public void setHsnCode(String hsnCode) {
    this.hsnCode = hsnCode;
  }

  public InvoiceItem creditNoteDetails(CreditNoteDetails creditNoteDetails) {
    this.creditNoteDetails = creditNoteDetails;
    return this;
  }

   /**
   * Details required in order to process a credit note. This information is required only if invoiceType is CreditNote.
   * @return creditNoteDetails
  **/
  @ApiModelProperty(value = "Details required in order to process a credit note. This information is required only if invoiceType is CreditNote.")
  public CreditNoteDetails getCreditNoteDetails() {
    return creditNoteDetails;
  }

  public void setCreditNoteDetails(CreditNoteDetails creditNoteDetails) {
    this.creditNoteDetails = creditNoteDetails;
  }

  public InvoiceItem taxDetails(List<TaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public InvoiceItem addTaxDetailsItem(TaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<TaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Individual tax details per line item.
   * @return taxDetails
  **/
  @ApiModelProperty(value = "Individual tax details per line item.")
  public List<TaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<TaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }

  public InvoiceItem chargeDetails(List<ChargeDetails> chargeDetails) {
    this.chargeDetails = chargeDetails;
    return this;
  }

  public InvoiceItem addChargeDetailsItem(ChargeDetails chargeDetailsItem) {
    if (this.chargeDetails == null) {
      this.chargeDetails = new ArrayList<ChargeDetails>();
    }
    this.chargeDetails.add(chargeDetailsItem);
    return this;
  }

   /**
   * Individual charge details per line item.
   * @return chargeDetails
  **/
  @ApiModelProperty(value = "Individual charge details per line item.")
  public List<ChargeDetails> getChargeDetails() {
    return chargeDetails;
  }

  public void setChargeDetails(List<ChargeDetails> chargeDetails) {
    this.chargeDetails = chargeDetails;
  }

  public InvoiceItem allowanceDetails(List<AllowanceDetails> allowanceDetails) {
    this.allowanceDetails = allowanceDetails;
    return this;
  }

  public InvoiceItem addAllowanceDetailsItem(AllowanceDetails allowanceDetailsItem) {
    if (this.allowanceDetails == null) {
      this.allowanceDetails = new ArrayList<AllowanceDetails>();
    }
    this.allowanceDetails.add(allowanceDetailsItem);
    return this;
  }

   /**
   * Individual allowance details per line item.
   * @return allowanceDetails
  **/
  @ApiModelProperty(value = "Individual allowance details per line item.")
  public List<AllowanceDetails> getAllowanceDetails() {
    return allowanceDetails;
  }

  public void setAllowanceDetails(List<AllowanceDetails> allowanceDetails) {
    this.allowanceDetails = allowanceDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItem invoiceItem = (InvoiceItem) o;
    return Objects.equals(this.itemSequenceNumber, invoiceItem.itemSequenceNumber) &&
        Objects.equals(this.amazonProductIdentifier, invoiceItem.amazonProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, invoiceItem.vendorProductIdentifier) &&
        Objects.equals(this.invoicedQuantity, invoiceItem.invoicedQuantity) &&
        Objects.equals(this.netCost, invoiceItem.netCost) &&
        Objects.equals(this.purchaseOrderNumber, invoiceItem.purchaseOrderNumber) &&
        Objects.equals(this.hsnCode, invoiceItem.hsnCode) &&
        Objects.equals(this.creditNoteDetails, invoiceItem.creditNoteDetails) &&
        Objects.equals(this.taxDetails, invoiceItem.taxDetails) &&
        Objects.equals(this.chargeDetails, invoiceItem.chargeDetails) &&
        Objects.equals(this.allowanceDetails, invoiceItem.allowanceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, amazonProductIdentifier, vendorProductIdentifier, invoicedQuantity, netCost, purchaseOrderNumber, hsnCode, creditNoteDetails, taxDetails, chargeDetails, allowanceDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItem {\n");
    
    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    amazonProductIdentifier: ").append(toIndentedString(amazonProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    invoicedQuantity: ").append(toIndentedString(invoicedQuantity)).append("\n");
    sb.append("    netCost: ").append(toIndentedString(netCost)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    hsnCode: ").append(toIndentedString(hsnCode)).append("\n");
    sb.append("    creditNoteDetails: ").append(toIndentedString(creditNoteDetails)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    chargeDetails: ").append(toIndentedString(chargeDetails)).append("\n");
    sb.append("    allowanceDetails: ").append(toIndentedString(allowanceDetails)).append("\n");
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

