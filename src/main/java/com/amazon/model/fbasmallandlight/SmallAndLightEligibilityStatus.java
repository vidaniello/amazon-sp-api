/*
 * Selling Partner API for FBA Small And Light
 * The Selling Partner API for FBA Small and Light lets you help sellers manage their listings in the Small and Light program. The program reduces the cost of fulfilling orders for small and lightweight FBA inventory. You can enroll or remove items from the program and check item eligibility and enrollment status. You can also preview the estimated program fees charged to a seller for items sold while enrolled in the program.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.fbasmallandlight;

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
 * The Small and Light eligibility status of the item.
 */
@JsonAdapter(SmallAndLightEligibilityStatus.Adapter.class)
public enum SmallAndLightEligibilityStatus {
  
  ELIGIBLE("ELIGIBLE"),
  
  NOT_ELIGIBLE("NOT_ELIGIBLE");

  private String value;

  SmallAndLightEligibilityStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SmallAndLightEligibilityStatus fromValue(String text) {
    for (SmallAndLightEligibilityStatus b : SmallAndLightEligibilityStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SmallAndLightEligibilityStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SmallAndLightEligibilityStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SmallAndLightEligibilityStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SmallAndLightEligibilityStatus.fromValue(String.valueOf(value));
    }
  }
}

