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
import com.amazon.model.productpricing.Product;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Price
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:15.144+02:00")
public class Price {
  @SerializedName("status")
  private String status = null;

  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("Product")
  private Product product = null;

  public Price status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the operation.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the operation.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Price sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller stock keeping unit (SKU) of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(value = "The seller stock keeping unit (SKU) of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public Price ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public Price product(Product product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.status, price.status) &&
        Objects.equals(this.sellerSKU, price.sellerSKU) &&
        Objects.equals(this.ASIN, price.ASIN) &&
        Objects.equals(this.product, price.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, sellerSKU, ASIN, product);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
