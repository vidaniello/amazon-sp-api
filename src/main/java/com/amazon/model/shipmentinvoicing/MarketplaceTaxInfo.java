/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.shipmentinvoicing;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.shipmentinvoicing.TaxClassificationList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tax information about the marketplace.
 */
@ApiModel(description = "Tax information about the marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:45.721+02:00")
public class MarketplaceTaxInfo {
  @SerializedName("CompanyLegalName")
  private String companyLegalName = null;

  @SerializedName("TaxingRegion")
  private String taxingRegion = null;

  @SerializedName("TaxClassifications")
  private TaxClassificationList taxClassifications = null;

  public MarketplaceTaxInfo companyLegalName(String companyLegalName) {
    this.companyLegalName = companyLegalName;
    return this;
  }

   /**
   * The legal name of the company.
   * @return companyLegalName
  **/
  @ApiModelProperty(value = "The legal name of the company.")
  public String getCompanyLegalName() {
    return companyLegalName;
  }

  public void setCompanyLegalName(String companyLegalName) {
    this.companyLegalName = companyLegalName;
  }

  public MarketplaceTaxInfo taxingRegion(String taxingRegion) {
    this.taxingRegion = taxingRegion;
    return this;
  }

   /**
   * The country or region imposing the tax.
   * @return taxingRegion
  **/
  @ApiModelProperty(value = "The country or region imposing the tax.")
  public String getTaxingRegion() {
    return taxingRegion;
  }

  public void setTaxingRegion(String taxingRegion) {
    this.taxingRegion = taxingRegion;
  }

  public MarketplaceTaxInfo taxClassifications(TaxClassificationList taxClassifications) {
    this.taxClassifications = taxClassifications;
    return this;
  }

   /**
   * Get taxClassifications
   * @return taxClassifications
  **/
  @ApiModelProperty(value = "")
  public TaxClassificationList getTaxClassifications() {
    return taxClassifications;
  }

  public void setTaxClassifications(TaxClassificationList taxClassifications) {
    this.taxClassifications = taxClassifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceTaxInfo marketplaceTaxInfo = (MarketplaceTaxInfo) o;
    return Objects.equals(this.companyLegalName, marketplaceTaxInfo.companyLegalName) &&
        Objects.equals(this.taxingRegion, marketplaceTaxInfo.taxingRegion) &&
        Objects.equals(this.taxClassifications, marketplaceTaxInfo.taxClassifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLegalName, taxingRegion, taxClassifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceTaxInfo {\n");
    
    sb.append("    companyLegalName: ").append(toIndentedString(companyLegalName)).append("\n");
    sb.append("    taxingRegion: ").append(toIndentedString(taxingRegion)).append("\n");
    sb.append("    taxClassifications: ").append(toIndentedString(taxClassifications)).append("\n");
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

