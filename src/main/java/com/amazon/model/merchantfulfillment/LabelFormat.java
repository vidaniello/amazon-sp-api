/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.merchantfulfillment;

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
 * The label format.
 */
@JsonAdapter(LabelFormat.Adapter.class)
public enum LabelFormat {
  
  PDF("PDF"),
  
  PNG("PNG"),
  
  ZPL203("ZPL203"),
  
  ZPL300("ZPL300"),
  
  SHIPPINGSERVICEDEFAULT("ShippingServiceDefault");

  private String value;

  LabelFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LabelFormat fromValue(String text) {
    for (LabelFormat b : LabelFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LabelFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final LabelFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LabelFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LabelFormat.fromValue(String.valueOf(value));
    }
  }
}

