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
import com.ionoscloud.model.Nic;
import com.ionoscloud.model.PaginationLinks;
import com.ionoscloud.model.Type;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * LanNics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class LanNics {
  
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationLinks links;


  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Nic> items = null;


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BigDecimal limit;


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private BigDecimal offset;


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Type type;

  

  public LanNics links(PaginationLinks links) {
    
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



   /**
   * URL to the object representation (absolute path).
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<RESOURCE-URI>", value = "URL to the object representation (absolute path).")

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }



   /**
   * The resource&#39;s unique identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15f67991-0f51-4efc-a8ad-ef1fb31a480c", value = "The resource's unique identifier.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



   /**
   * Array of items in the collection.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of items in the collection.")

  public List<Nic> getItems() {
    return items;
  }


  public void setItems(List<Nic> items) {
    this.items = items;
  }



  public LanNics limit(BigDecimal limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit (if specified in the request).
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The limit (if specified in the request).")

  public BigDecimal getLimit() {
    return limit;
  }


  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }



  public LanNics offset(BigDecimal offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The offset (if specified in the request).
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The offset (if specified in the request).")

  public BigDecimal getOffset() {
    return offset;
  }


  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }



  public LanNics type(Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of object that has been created.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"collection\"", value = "The type of object that has been created.")

  public Type getType() {
    return type;
  }


  public void setType(Type type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanNics lanNics = (LanNics) o;
    return Objects.equals(this.links, lanNics.links) && Objects.equals(this.href, lanNics.href) && Objects.equals(this.id, lanNics.id) && Objects.equals(this.items, lanNics.items) && Objects.equals(this.limit, lanNics.limit) && Objects.equals(this.offset, lanNics.offset) && Objects.equals(this.type, lanNics.type);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanNics {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");

    sb.append("    href: ").append(toIndentedString(href)).append("\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");

    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");

    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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



// LanNics instantiates a new LanNics object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public LanNics() {

}


}
