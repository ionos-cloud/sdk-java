/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionossdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionossdk.model.Loadbalancer;
import com.ionossdk.model.PaginationLinks;
import com.ionossdk.model.Type;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Loadbalancers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-03T11:13:53.239943+02:00[Europe/Bucharest]")
public class Loadbalancers {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Type type;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Loadbalancer> items = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private BigDecimal offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BigDecimal limit;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationLinks links;


   /**
   * The resource&#39;s unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15f67991-0f51-4efc-a8ad-ef1fb31a480c", value = "The resource's unique identifier")

  public String getId() {
    return id;
  }




  public Loadbalancers type(Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of object that has been created
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"collection\"", value = "The type of object that has been created")

  public Type getType() {
    return type;
  }


  public void setType(Type type) {
    this.type = type;
  }


   /**
   * URL to the object representation (absolute path)
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<RESOURCE-URI>", value = "URL to the object representation (absolute path)")

  public URI getHref() {
    return href;
  }




   /**
   * Array of items in that collection
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of items in that collection")

  public List<Loadbalancer> getItems() {
    return items;
  }




  public Loadbalancers offset(BigDecimal offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * the offset (if specified in the request)
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "the offset (if specified in the request)")

  public BigDecimal getOffset() {
    return offset;
  }


  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }


  public Loadbalancers limit(BigDecimal limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * the limit (if specified in the request)
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "the limit (if specified in the request)")

  public BigDecimal getLimit() {
    return limit;
  }


  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  public Loadbalancers links(PaginationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationLinks getLinks() {
    return links;
  }


  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loadbalancers loadbalancers = (Loadbalancers) o;
    return Objects.equals(this.id, loadbalancers.id) &&
        Objects.equals(this.type, loadbalancers.type) &&
        Objects.equals(this.href, loadbalancers.href) &&
        Objects.equals(this.items, loadbalancers.items) &&
        Objects.equals(this.offset, loadbalancers.offset) &&
        Objects.equals(this.limit, loadbalancers.limit) &&
        Objects.equals(this.links, loadbalancers.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, href, items, offset, limit, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loadbalancers {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

