/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.fulfillmentinbound;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.fulfillmentinbound.NonPartneredSmallParcelPackageOutputList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information returned by Amazon about a Small Parcel shipment by a carrier that has not partnered with Amazon.
 */
@ApiModel(description = "Information returned by Amazon about a Small Parcel shipment by a carrier that has not partnered with Amazon.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:52:26.128+02:00")
public class NonPartneredSmallParcelDataOutput {
  @SerializedName("PackageList")
  private NonPartneredSmallParcelPackageOutputList packageList = null;

  public NonPartneredSmallParcelDataOutput packageList(NonPartneredSmallParcelPackageOutputList packageList) {
    this.packageList = packageList;
    return this;
  }

   /**
   * Get packageList
   * @return packageList
  **/
  @ApiModelProperty(required = true, value = "")
  public NonPartneredSmallParcelPackageOutputList getPackageList() {
    return packageList;
  }

  public void setPackageList(NonPartneredSmallParcelPackageOutputList packageList) {
    this.packageList = packageList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonPartneredSmallParcelDataOutput nonPartneredSmallParcelDataOutput = (NonPartneredSmallParcelDataOutput) o;
    return Objects.equals(this.packageList, nonPartneredSmallParcelDataOutput.packageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonPartneredSmallParcelDataOutput {\n");
    
    sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
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

