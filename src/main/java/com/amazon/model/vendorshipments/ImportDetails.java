/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.vendorshipments;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.vendorshipments.Route;
import com.amazon.model.vendorshipments.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ImportDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:54:50.361+02:00")
public class ImportDetails {
  /**
   * This is used for import purchase orders only. If the recipient requests, this field will contain the shipment method of payment.
   */
  @JsonAdapter(MethodOfPaymentEnum.Adapter.class)
  public enum MethodOfPaymentEnum {
    PAIDBYBUYER("PaidByBuyer"),
    
    COLLECTONDELIVERY("CollectOnDelivery"),
    
    DEFINEDBYBUYERANDSELLER("DefinedByBuyerAndSeller"),
    
    FOBPORTOFCALL("FOBPortOfCall"),
    
    PREPAIDBYSELLER("PrepaidBySeller"),
    
    PAIDBYSELLER("PaidBySeller");

    private String value;

    MethodOfPaymentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodOfPaymentEnum fromValue(String text) {
      for (MethodOfPaymentEnum b : MethodOfPaymentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MethodOfPaymentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodOfPaymentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodOfPaymentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodOfPaymentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("methodOfPayment")
  private MethodOfPaymentEnum methodOfPayment = null;

  @SerializedName("sealNumber")
  private String sealNumber = null;

  @SerializedName("route")
  private Route route = null;

  @SerializedName("importContainers")
  private String importContainers = null;

  @SerializedName("billableWeight")
  private Weight billableWeight = null;

  @SerializedName("estimatedShipByDate")
  private OffsetDateTime estimatedShipByDate = null;

  /**
   * Identification of the instructions on how specified item/carton/pallet should be handled.
   */
  @JsonAdapter(HandlingInstructionsEnum.Adapter.class)
  public enum HandlingInstructionsEnum {
    OVERSIZED("Oversized"),
    
    FRAGILE("Fragile"),
    
    FOOD("Food"),
    
    HANDLEWITHCARE("HandleWithCare");

    private String value;

    HandlingInstructionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HandlingInstructionsEnum fromValue(String text) {
      for (HandlingInstructionsEnum b : HandlingInstructionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HandlingInstructionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HandlingInstructionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HandlingInstructionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HandlingInstructionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("handlingInstructions")
  private HandlingInstructionsEnum handlingInstructions = null;

  public ImportDetails methodOfPayment(MethodOfPaymentEnum methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
    return this;
  }

   /**
   * This is used for import purchase orders only. If the recipient requests, this field will contain the shipment method of payment.
   * @return methodOfPayment
  **/
  @ApiModelProperty(value = "This is used for import purchase orders only. If the recipient requests, this field will contain the shipment method of payment.")
  public MethodOfPaymentEnum getMethodOfPayment() {
    return methodOfPayment;
  }

  public void setMethodOfPayment(MethodOfPaymentEnum methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
  }

  public ImportDetails sealNumber(String sealNumber) {
    this.sealNumber = sealNumber;
    return this;
  }

   /**
   * The container&#39;s seal number.
   * @return sealNumber
  **/
  @ApiModelProperty(value = "The container's seal number.")
  public String getSealNumber() {
    return sealNumber;
  }

  public void setSealNumber(String sealNumber) {
    this.sealNumber = sealNumber;
  }

  public ImportDetails route(Route route) {
    this.route = route;
    return this;
  }

   /**
   * The route and stop details for this shipment.
   * @return route
  **/
  @ApiModelProperty(value = "The route and stop details for this shipment.")
  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public ImportDetails importContainers(String importContainers) {
    this.importContainers = importContainers;
    return this;
  }

   /**
   * Types and numbers of container(s) for import purchase orders. Can be a comma-separated list if shipment has multiple containers.
   * @return importContainers
  **/
  @ApiModelProperty(value = "Types and numbers of container(s) for import purchase orders. Can be a comma-separated list if shipment has multiple containers.")
  public String getImportContainers() {
    return importContainers;
  }

  public void setImportContainers(String importContainers) {
    this.importContainers = importContainers;
  }

  public ImportDetails billableWeight(Weight billableWeight) {
    this.billableWeight = billableWeight;
    return this;
  }

   /**
   * Billable weight of the direct imports shipment.
   * @return billableWeight
  **/
  @ApiModelProperty(value = "Billable weight of the direct imports shipment.")
  public Weight getBillableWeight() {
    return billableWeight;
  }

  public void setBillableWeight(Weight billableWeight) {
    this.billableWeight = billableWeight;
  }

  public ImportDetails estimatedShipByDate(OffsetDateTime estimatedShipByDate) {
    this.estimatedShipByDate = estimatedShipByDate;
    return this;
  }

   /**
   * Date on which the shipment is expected to be shipped. This value should not be in the past and not more than 60 days out in the future.
   * @return estimatedShipByDate
  **/
  @ApiModelProperty(value = "Date on which the shipment is expected to be shipped. This value should not be in the past and not more than 60 days out in the future.")
  public OffsetDateTime getEstimatedShipByDate() {
    return estimatedShipByDate;
  }

  public void setEstimatedShipByDate(OffsetDateTime estimatedShipByDate) {
    this.estimatedShipByDate = estimatedShipByDate;
  }

  public ImportDetails handlingInstructions(HandlingInstructionsEnum handlingInstructions) {
    this.handlingInstructions = handlingInstructions;
    return this;
  }

   /**
   * Identification of the instructions on how specified item/carton/pallet should be handled.
   * @return handlingInstructions
  **/
  @ApiModelProperty(value = "Identification of the instructions on how specified item/carton/pallet should be handled.")
  public HandlingInstructionsEnum getHandlingInstructions() {
    return handlingInstructions;
  }

  public void setHandlingInstructions(HandlingInstructionsEnum handlingInstructions) {
    this.handlingInstructions = handlingInstructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportDetails importDetails = (ImportDetails) o;
    return Objects.equals(this.methodOfPayment, importDetails.methodOfPayment) &&
        Objects.equals(this.sealNumber, importDetails.sealNumber) &&
        Objects.equals(this.route, importDetails.route) &&
        Objects.equals(this.importContainers, importDetails.importContainers) &&
        Objects.equals(this.billableWeight, importDetails.billableWeight) &&
        Objects.equals(this.estimatedShipByDate, importDetails.estimatedShipByDate) &&
        Objects.equals(this.handlingInstructions, importDetails.handlingInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodOfPayment, sealNumber, route, importContainers, billableWeight, estimatedShipByDate, handlingInstructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportDetails {\n");
    
    sb.append("    methodOfPayment: ").append(toIndentedString(methodOfPayment)).append("\n");
    sb.append("    sealNumber: ").append(toIndentedString(sealNumber)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    importContainers: ").append(toIndentedString(importContainers)).append("\n");
    sb.append("    billableWeight: ").append(toIndentedString(billableWeight)).append("\n");
    sb.append("    estimatedShipByDate: ").append(toIndentedString(estimatedShipByDate)).append("\n");
    sb.append("    handlingInstructions: ").append(toIndentedString(handlingInstructions)).append("\n");
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

