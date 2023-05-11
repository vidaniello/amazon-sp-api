/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.model.merchantfulfillment;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.model.merchantfulfillment.FileType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The document data and checksum.
 */
@ApiModel(description = "The document data and checksum.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-11T14:52:48.182+02:00")
public class FileContents {
  @SerializedName("Contents")
  private String contents = null;

  @SerializedName("FileType")
  private FileType fileType = null;

  @SerializedName("Checksum")
  private String checksum = null;

  public FileContents contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Data for printing labels, in the form of a Base64-encoded, GZip-compressed string.
   * @return contents
  **/
  @ApiModelProperty(required = true, value = "Data for printing labels, in the form of a Base64-encoded, GZip-compressed string.")
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public FileContents fileType(FileType fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @ApiModelProperty(required = true, value = "")
  public FileType getFileType() {
    return fileType;
  }

  public void setFileType(FileType fileType) {
    this.fileType = fileType;
  }

  public FileContents checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * An MD5 hash to validate the PDF document data, in the form of a Base64-encoded string.
   * @return checksum
  **/
  @ApiModelProperty(required = true, value = "An MD5 hash to validate the PDF document data, in the form of a Base64-encoded string.")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileContents fileContents = (FileContents) o;
    return Objects.equals(this.contents, fileContents.contents) &&
        Objects.equals(this.fileType, fileContents.fileType) &&
        Objects.equals(this.checksum, fileContents.checksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, fileType, checksum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileContents {\n");
    
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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

