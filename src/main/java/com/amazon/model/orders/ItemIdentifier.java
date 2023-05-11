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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Item identifiers used in the context of approvals operations.
 */
@ApiModel(description = "Item identifiers used in the context of approvals operations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:04.283+02:00")
public class ItemIdentifier {
  /**
   * Defines the type of identifiers allowed to specify a substitution.
   */
  @JsonAdapter(IdentifierTypeEnum.Adapter.class)
  public enum IdentifierTypeEnum {
    ASIN("ASIN"),
    
    SELLER_SKU("SELLER_SKU"),
    
    EXTERNAL_ID("EXTERNAL_ID");

    private String value;

    IdentifierTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentifierTypeEnum fromValue(String text) {
      for (IdentifierTypeEnum b : IdentifierTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IdentifierTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdentifierTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdentifierTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IdentifierTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("IdentifierType")
  private IdentifierTypeEnum identifierType = null;

  @SerializedName("Identifier")
  private String identifier = null;

  public ItemIdentifier identifierType(IdentifierTypeEnum identifierType) {
    this.identifierType = identifierType;
    return this;
  }

   /**
   * Defines the type of identifiers allowed to specify a substitution.
   * @return identifierType
  **/
  @ApiModelProperty(required = true, value = "Defines the type of identifiers allowed to specify a substitution.")
  public IdentifierTypeEnum getIdentifierType() {
    return identifierType;
  }

  public void setIdentifierType(IdentifierTypeEnum identifierType) {
    this.identifierType = identifierType;
  }

  public ItemIdentifier identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemIdentifier itemIdentifier = (ItemIdentifier) o;
    return Objects.equals(this.identifierType, itemIdentifier.identifierType) &&
        Objects.equals(this.identifier, itemIdentifier.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifierType, identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemIdentifier {\n");
    
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

