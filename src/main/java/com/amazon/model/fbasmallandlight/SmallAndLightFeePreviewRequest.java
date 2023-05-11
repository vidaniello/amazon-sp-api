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
import com.amazon.model.fbasmallandlight.Item;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request schema for submitting items for which to retrieve fee estimates.
 */
@ApiModel(description = "Request schema for submitting items for which to retrieve fee estimates.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:52:10.507+02:00")
public class SmallAndLightFeePreviewRequest {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("items")
  private List<Item> items = new ArrayList<Item>();

  public SmallAndLightFeePreviewRequest marketplaceId(String marketplaceId) {
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

  public SmallAndLightFeePreviewRequest items(List<Item> items) {
    this.items = items;
    return this;
  }

  public SmallAndLightFeePreviewRequest addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of items for which to retrieve fee estimates (limit: 25).
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of items for which to retrieve fee estimates (limit: 25).")
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmallAndLightFeePreviewRequest smallAndLightFeePreviewRequest = (SmallAndLightFeePreviewRequest) o;
    return Objects.equals(this.marketplaceId, smallAndLightFeePreviewRequest.marketplaceId) &&
        Objects.equals(this.items, smallAndLightFeePreviewRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmallAndLightFeePreviewRequest {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

