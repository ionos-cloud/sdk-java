/*
 * CLOUD API
 * IONOS Enterprise-grade Infrastructure as a Service (IaaS) solutions can be managed through the Cloud API, in addition or as an alternative to the \"Data Center Designer\" (DCD) browser-based tool.    Both methods employ consistent concepts and features, deliver similar power and flexibility, and can be used to perform a multitude of management tasks, including adding servers, volumes, configuring networks, and so on.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.model;

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
import java.net.URI;

/**
 * PaginationLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-14T13:53:14.995Z[Etc/UTC]")

public class PaginationLinks {
  
  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private URI prev;


  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;


  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private URI next;

  

   /**
   * URL (with offset and limit parameters) of the previous page; only present if offset is greater than 0.
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<PREVIOUS-PAGE-URI>", value = "URL (with offset and limit parameters) of the previous page; only present if offset is greater than 0.")

  public URI getPrev() {
    return prev;
  }


  public void setPrev(URI prev) {
    this.prev = prev;
  }



   /**
   * URL (with offset and limit parameters) of the current page.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<THIS-PAGE-URI>", value = "URL (with offset and limit parameters) of the current page.")

  public URI getSelf() {
    return self;
  }


  public void setSelf(URI self) {
    this.self = self;
  }



   /**
   * URL (with offset and limit parameters) of the next page; only present if offset + limit is less than the total number of elements.
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<NEXT-PAGE-URI>", value = "URL (with offset and limit parameters) of the next page; only present if offset + limit is less than the total number of elements.")

  public URI getNext() {
    return next;
  }


  public void setNext(URI next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationLinks paginationLinks = (PaginationLinks) o;
    return Objects.equals(this.prev, paginationLinks.prev) && Objects.equals(this.self, paginationLinks.self) && Objects.equals(this.next, paginationLinks.next);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationLinks {\n");
    
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");

    sb.append("    self: ").append(toIndentedString(self)).append("\n");

    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

