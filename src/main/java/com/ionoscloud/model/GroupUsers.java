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
import com.ionoscloud.model.Group;
import com.ionoscloud.model.Type;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of the groups the user is a member of.
 */
@ApiModel(description = "Collection of the groups the user is a member of.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class GroupUsers {
  
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Group> items = null;


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Type type;

  

   /**
   * URL to the object representation (absolute path).
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://<API_HOST>/cloudapi/v6/um/users/9b1b4c62-1466-11e7-87d3-d7bb7dac0087/groups", value = "URL to the object representation (absolute path).")

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

  public List<Group> getItems() {
    return items;
  }


  public void setItems(List<Group> items) {
    this.items = items;
  }



  public GroupUsers type(Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the resource.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"groups\"", value = "The type of the resource.")

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
    GroupUsers groupUsers = (GroupUsers) o;
    return Objects.equals(this.href, groupUsers.href) && Objects.equals(this.id, groupUsers.id) && Objects.equals(this.items, groupUsers.items) && Objects.equals(this.type, groupUsers.type);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUsers {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");

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



// GroupUsers instantiates a new GroupUsers object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public GroupUsers() {

}


}
