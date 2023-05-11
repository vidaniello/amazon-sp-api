/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.easyship;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of the package.
 */
@JsonAdapter(PackageStatus.Adapter.class)
public enum PackageStatus {
  
  READYFORPICKUP("ReadyForPickup"),
  
  PICKEDUP("PickedUp"),
  
  ATORIGINFC("AtOriginFC"),
  
  ATDESTINATIONFC("AtDestinationFC"),
  
  DELIVERED("Delivered"),
  
  REJECTED("Rejected"),
  
  UNDELIVERABLE("Undeliverable"),
  
  RETURNEDTOSELLER("ReturnedToSeller"),
  
  LOSTINTRANSIT("LostInTransit"),
  
  LABELCANCELED("LabelCanceled"),
  
  DAMAGEDINTRANSIT("DamagedInTransit"),
  
  OUTFORDELIVERY("OutForDelivery");

  private String value;

  PackageStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PackageStatus fromValue(String text) {
    for (PackageStatus b : PackageStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PackageStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PackageStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PackageStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PackageStatus.fromValue(String.valueOf(value));
    }
  }
}

