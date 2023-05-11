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
import com.amazon.model.easyship.UnitOfLength;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The dimensions of the scheduled package.
 */
@ApiModel(description = "The dimensions of the scheduled package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:51:55.652+02:00")
public class Dimensions {
  @SerializedName("length")
  private BigDecimal length = null;

  @SerializedName("width")
  private BigDecimal width = null;

  @SerializedName("height")
  private BigDecimal height = null;

  @SerializedName("unit")
  private UnitOfLength unit = null;

  @SerializedName("identifier")
  private String identifier = null;

  public Dimensions length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * The length dimension.
   * @return length
  **/
  @ApiModelProperty(value = "The length dimension.")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public Dimensions width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * The width dimension.
   * @return width
  **/
  @ApiModelProperty(value = "The width dimension.")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public Dimensions height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * The height dimension.
   * @return height
  **/
  @ApiModelProperty(value = "The height dimension.")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public Dimensions unit(UnitOfLength unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")
  public UnitOfLength getUnit() {
    return unit;
  }

  public void setUnit(UnitOfLength unit) {
    this.unit = unit;
  }

  public Dimensions identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Identifier for custom package dimensions.
   * @return identifier
  **/
  @ApiModelProperty(value = "Identifier for custom package dimensions.")
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
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.length, dimensions.length) &&
        Objects.equals(this.width, dimensions.width) &&
        Objects.equals(this.height, dimensions.height) &&
        Objects.equals(this.unit, dimensions.unit) &&
        Objects.equals(this.identifier, dimensions.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, unit, identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

