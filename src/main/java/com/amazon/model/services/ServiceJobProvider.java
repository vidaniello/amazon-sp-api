/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.services;

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
 * Information about the service job provider.
 */
@ApiModel(description = "Information about the service job provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:40.080+02:00")
public class ServiceJobProvider {
  @SerializedName("serviceJobProviderId")
  private String serviceJobProviderId = null;

  public ServiceJobProvider serviceJobProviderId(String serviceJobProviderId) {
    this.serviceJobProviderId = serviceJobProviderId;
    return this;
  }

   /**
   * The identifier of the service job provider.
   * @return serviceJobProviderId
  **/
  @ApiModelProperty(value = "The identifier of the service job provider.")
  public String getServiceJobProviderId() {
    return serviceJobProviderId;
  }

  public void setServiceJobProviderId(String serviceJobProviderId) {
    this.serviceJobProviderId = serviceJobProviderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceJobProvider serviceJobProvider = (ServiceJobProvider) o;
    return Objects.equals(this.serviceJobProviderId, serviceJobProvider.serviceJobProviderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceJobProviderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceJobProvider {\n");
    
    sb.append("    serviceJobProviderId: ").append(toIndentedString(serviceJobProviderId)).append("\n");
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

