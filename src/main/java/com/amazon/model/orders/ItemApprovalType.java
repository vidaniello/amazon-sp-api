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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Defines the approval process types available for order items.
 */
@JsonAdapter(ItemApprovalType.Adapter.class)
public enum ItemApprovalType {
  
  LEONARDI_APPROVAL("LEONARDI_APPROVAL");

  private String value;

  ItemApprovalType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ItemApprovalType fromValue(String text) {
    for (ItemApprovalType b : ItemApprovalType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ItemApprovalType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ItemApprovalType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ItemApprovalType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ItemApprovalType.fromValue(String.valueOf(value));
    }
  }
}

