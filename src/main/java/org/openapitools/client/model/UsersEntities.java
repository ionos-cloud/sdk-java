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


package org.openapitools.client.model;

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
import org.openapitools.client.model.GroupUsers;
import org.openapitools.client.model.ResourcesUsers;

/**
 * UsersEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-19T16:41:06.426137+02:00[Europe/Bucharest]")
public class UsersEntities {
  public static final String SERIALIZED_NAME_OWNS = "owns";
  @SerializedName(SERIALIZED_NAME_OWNS)
  private ResourcesUsers owns;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private GroupUsers groups;


  public UsersEntities owns(ResourcesUsers owns) {
    
    this.owns = owns;
    return this;
  }

   /**
   * Get owns
   * @return owns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourcesUsers getOwns() {
    return owns;
  }


  public void setOwns(ResourcesUsers owns) {
    this.owns = owns;
  }


  public UsersEntities groups(GroupUsers groups) {
    
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupUsers getGroups() {
    return groups;
  }


  public void setGroups(GroupUsers groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersEntities usersEntities = (UsersEntities) o;
    return Objects.equals(this.owns, usersEntities.owns) &&
        Objects.equals(this.groups, usersEntities.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owns, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersEntities {\n");
    sb.append("    owns: ").append(toIndentedString(owns)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

