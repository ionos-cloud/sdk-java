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


package com.ionoscloud.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionoscloud.model.Type;
import com.ionoscloud.model.UserMetadata;
import com.ionoscloud.model.UserProperties;
import com.ionoscloud.model.UsersEntities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-04T10:04:07.407Z[Etc/UTC]")

public class User {
  
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Type type;


  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;


  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private UserMetadata metadata;


  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private UserProperties properties;


  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private UsersEntities entities;

  

   /**
   * The resource&#39;s unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15f67991-0f51-4efc-a8ad-ef1fb31a480c", value = "The resource's unique identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  public User type(Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of object that has been created
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"user\"", value = "The type of object that has been created")

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


  public void setHref(URI href) {
    this.href = href;
  }



  public User metadata(UserMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(UserMetadata metadata) {
    this.metadata = metadata;
  }



  public User properties(UserProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "")

  public UserProperties getProperties() {
    return properties;
  }


  public void setProperties(UserProperties properties) {
    this.properties = properties;
  }



  public User entities(UsersEntities entities) {
    
    this.entities = entities;
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsersEntities getEntities() {
    return entities;
  }


  public void setEntities(UsersEntities entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) && Objects.equals(this.type, user.type) && Objects.equals(this.href, user.href) && Objects.equals(this.metadata, user.metadata) && Objects.equals(this.properties, user.properties) && Objects.equals(this.entities, user.entities);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    href: ").append(toIndentedString(href)).append("\n");

    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");

    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");

    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

