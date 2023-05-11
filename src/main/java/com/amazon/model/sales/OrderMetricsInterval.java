/*
 * Selling Partner API for Sales
 * The Selling Partner API for Sales provides APIs related to sales performance.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.sales;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.sales.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains order metrics.
 */
@ApiModel(description = "Contains order metrics.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:30.613+02:00")
public class OrderMetricsInterval {
  @SerializedName("interval")
  private String interval = null;

  @SerializedName("unitCount")
  private Integer unitCount = null;

  @SerializedName("orderItemCount")
  private Integer orderItemCount = null;

  @SerializedName("orderCount")
  private Integer orderCount = null;

  @SerializedName("averageUnitPrice")
  private Money averageUnitPrice = null;

  @SerializedName("totalSales")
  private Money totalSales = null;

  public OrderMetricsInterval interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The interval of time based on requested granularity (ex. Hour, Day, etc.) If this is the first or the last interval from the list, it might contain incomplete data if the requested interval doesn&#39;t align with the requested granularity (ex. request interval 2018-09-01T02:00:00Z--2018-09-04T19:00:00Z and granularity day will result in Sept 1st UTC day and Sept 4th UTC days having partial data).
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "The interval of time based on requested granularity (ex. Hour, Day, etc.) If this is the first or the last interval from the list, it might contain incomplete data if the requested interval doesn't align with the requested granularity (ex. request interval 2018-09-01T02:00:00Z--2018-09-04T19:00:00Z and granularity day will result in Sept 1st UTC day and Sept 4th UTC days having partial data).")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public OrderMetricsInterval unitCount(Integer unitCount) {
    this.unitCount = unitCount;
    return this;
  }

   /**
   * The number of units in orders based on the specified filters.
   * @return unitCount
  **/
  @ApiModelProperty(required = true, value = "The number of units in orders based on the specified filters.")
  public Integer getUnitCount() {
    return unitCount;
  }

  public void setUnitCount(Integer unitCount) {
    this.unitCount = unitCount;
  }

  public OrderMetricsInterval orderItemCount(Integer orderItemCount) {
    this.orderItemCount = orderItemCount;
    return this;
  }

   /**
   * The number of order items based on the specified filters.
   * @return orderItemCount
  **/
  @ApiModelProperty(required = true, value = "The number of order items based on the specified filters.")
  public Integer getOrderItemCount() {
    return orderItemCount;
  }

  public void setOrderItemCount(Integer orderItemCount) {
    this.orderItemCount = orderItemCount;
  }

  public OrderMetricsInterval orderCount(Integer orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * The number of orders based on the specified filters.
   * @return orderCount
  **/
  @ApiModelProperty(required = true, value = "The number of orders based on the specified filters.")
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public OrderMetricsInterval averageUnitPrice(Money averageUnitPrice) {
    this.averageUnitPrice = averageUnitPrice;
    return this;
  }

   /**
   * The average price for an item based on the specified filters. Formula is totalSales/unitCount.
   * @return averageUnitPrice
  **/
  @ApiModelProperty(required = true, value = "The average price for an item based on the specified filters. Formula is totalSales/unitCount.")
  public Money getAverageUnitPrice() {
    return averageUnitPrice;
  }

  public void setAverageUnitPrice(Money averageUnitPrice) {
    this.averageUnitPrice = averageUnitPrice;
  }

  public OrderMetricsInterval totalSales(Money totalSales) {
    this.totalSales = totalSales;
    return this;
  }

   /**
   * The total ordered product sales for all orders based on the specified filters.
   * @return totalSales
  **/
  @ApiModelProperty(required = true, value = "The total ordered product sales for all orders based on the specified filters.")
  public Money getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(Money totalSales) {
    this.totalSales = totalSales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMetricsInterval orderMetricsInterval = (OrderMetricsInterval) o;
    return Objects.equals(this.interval, orderMetricsInterval.interval) &&
        Objects.equals(this.unitCount, orderMetricsInterval.unitCount) &&
        Objects.equals(this.orderItemCount, orderMetricsInterval.orderItemCount) &&
        Objects.equals(this.orderCount, orderMetricsInterval.orderCount) &&
        Objects.equals(this.averageUnitPrice, orderMetricsInterval.averageUnitPrice) &&
        Objects.equals(this.totalSales, orderMetricsInterval.totalSales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, unitCount, orderItemCount, orderCount, averageUnitPrice, totalSales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMetricsInterval {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
    sb.append("    orderItemCount: ").append(toIndentedString(orderItemCount)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    averageUnitPrice: ").append(toIndentedString(averageUnitPrice)).append("\n");
    sb.append("    totalSales: ").append(toIndentedString(totalSales)).append("\n");
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

