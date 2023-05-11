/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.apluscontent;

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
 * The relative positioning of content.
 */
@JsonAdapter(PositionType.Adapter.class)
public enum PositionType {
  
  LEFT("LEFT"),
  
  RIGHT("RIGHT");

  private String value;

  PositionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PositionType fromValue(String text) {
    for (PositionType b : PositionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PositionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PositionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PositionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PositionType.fromValue(String.valueOf(value));
    }
  }
}

