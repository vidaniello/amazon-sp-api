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
import com.amazon.model.services.ErrorList;
import com.amazon.model.services.ServiceDocumentUploadDestination;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the &#x60;createServiceDocumentUploadDestination&#x60; operation.
 */
@ApiModel(description = "The response schema for the `createServiceDocumentUploadDestination` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:40.080+02:00")
public class CreateServiceDocumentUploadDestination {
  @SerializedName("payload")
  private ServiceDocumentUploadDestination payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public CreateServiceDocumentUploadDestination payload(ServiceDocumentUploadDestination payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public ServiceDocumentUploadDestination getPayload() {
    return payload;
  }

  public void setPayload(ServiceDocumentUploadDestination payload) {
    this.payload = payload;
  }

  public CreateServiceDocumentUploadDestination errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceDocumentUploadDestination createServiceDocumentUploadDestination = (CreateServiceDocumentUploadDestination) o;
    return Objects.equals(this.payload, createServiceDocumentUploadDestination.payload) &&
        Objects.equals(this.errors, createServiceDocumentUploadDestination.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceDocumentUploadDestination {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

