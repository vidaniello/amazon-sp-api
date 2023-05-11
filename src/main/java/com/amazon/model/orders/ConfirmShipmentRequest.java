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
import com.amazon.model.orders.PackageDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request schema for an shipment confirmation.
 */
@ApiModel(description = "The request schema for an shipment confirmation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:04.283+02:00")
public class ConfirmShipmentRequest {
  @SerializedName("packageDetail")
  private PackageDetail packageDetail = null;

  /**
   * The cod collection method, support in JP only. 
   */
  @JsonAdapter(CodCollectionMethodEnum.Adapter.class)
  public enum CodCollectionMethodEnum {
    DIRECTPAYMENT("DirectPayment");

    private String value;

    CodCollectionMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodCollectionMethodEnum fromValue(String text) {
      for (CodCollectionMethodEnum b : CodCollectionMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodCollectionMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodCollectionMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodCollectionMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodCollectionMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("codCollectionMethod")
  private CodCollectionMethodEnum codCollectionMethod = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  public ConfirmShipmentRequest packageDetail(PackageDetail packageDetail) {
    this.packageDetail = packageDetail;
    return this;
  }

   /**
   * Get packageDetail
   * @return packageDetail
  **/
  @ApiModelProperty(required = true, value = "")
  public PackageDetail getPackageDetail() {
    return packageDetail;
  }

  public void setPackageDetail(PackageDetail packageDetail) {
    this.packageDetail = packageDetail;
  }

  public ConfirmShipmentRequest codCollectionMethod(CodCollectionMethodEnum codCollectionMethod) {
    this.codCollectionMethod = codCollectionMethod;
    return this;
  }

   /**
   * The cod collection method, support in JP only. 
   * @return codCollectionMethod
  **/
  @ApiModelProperty(value = "The cod collection method, support in JP only. ")
  public CodCollectionMethodEnum getCodCollectionMethod() {
    return codCollectionMethod;
  }

  public void setCodCollectionMethod(CodCollectionMethodEnum codCollectionMethod) {
    this.codCollectionMethod = codCollectionMethod;
  }

  public ConfirmShipmentRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmShipmentRequest confirmShipmentRequest = (ConfirmShipmentRequest) o;
    return Objects.equals(this.packageDetail, confirmShipmentRequest.packageDetail) &&
        Objects.equals(this.codCollectionMethod, confirmShipmentRequest.codCollectionMethod) &&
        Objects.equals(this.marketplaceId, confirmShipmentRequest.marketplaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageDetail, codCollectionMethod, marketplaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmShipmentRequest {\n");
    
    sb.append("    packageDetail: ").append(toIndentedString(packageDetail)).append("\n");
    sb.append("    codCollectionMethod: ").append(toIndentedString(codCollectionMethod)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
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

