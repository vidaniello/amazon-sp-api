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
import com.amazon.model.services.AvailabilityRecords;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request schema for the &#x60;updateSchedule&#x60; operation.
 */
@ApiModel(description = "Request schema for the `updateSchedule` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:53:40.080+02:00")
public class UpdateScheduleRequest {
  @SerializedName("schedules")
  private AvailabilityRecords schedules = null;

  public UpdateScheduleRequest schedules(AvailabilityRecords schedules) {
    this.schedules = schedules;
    return this;
  }

   /**
   * List of schedule objects to define the normal working hours of a resource.
   * @return schedules
  **/
  @ApiModelProperty(required = true, value = "List of schedule objects to define the normal working hours of a resource.")
  public AvailabilityRecords getSchedules() {
    return schedules;
  }

  public void setSchedules(AvailabilityRecords schedules) {
    this.schedules = schedules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateScheduleRequest updateScheduleRequest = (UpdateScheduleRequest) o;
    return Objects.equals(this.schedules, updateScheduleRequest.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScheduleRequest {\n");
    
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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

