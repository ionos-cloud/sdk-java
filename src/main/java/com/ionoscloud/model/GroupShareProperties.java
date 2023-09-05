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

/**
 * GroupShareProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class GroupShareProperties {
  
  public static final String SERIALIZED_NAME_EDIT_PRIVILEGE = "editPrivilege";
  @SerializedName(SERIALIZED_NAME_EDIT_PRIVILEGE)
  private Boolean editPrivilege;


  public static final String SERIALIZED_NAME_SHARE_PRIVILEGE = "sharePrivilege";
  @SerializedName(SERIALIZED_NAME_SHARE_PRIVILEGE)
  private Boolean sharePrivilege;

  

  public GroupShareProperties editPrivilege(Boolean editPrivilege) {
    
    this.editPrivilege = editPrivilege;
    return this;
  }

   /**
   * edit privilege on a resource
   * @return editPrivilege
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "edit privilege on a resource")

  public Boolean getEditPrivilege() {
    return editPrivilege;
  }


  public void setEditPrivilege(Boolean editPrivilege) {
    this.editPrivilege = editPrivilege;
  }



  public GroupShareProperties sharePrivilege(Boolean sharePrivilege) {
    
    this.sharePrivilege = sharePrivilege;
    return this;
  }

   /**
   * share privilege on a resource
   * @return sharePrivilege
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "share privilege on a resource")

  public Boolean getSharePrivilege() {
    return sharePrivilege;
  }


  public void setSharePrivilege(Boolean sharePrivilege) {
    this.sharePrivilege = sharePrivilege;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupShareProperties groupShareProperties = (GroupShareProperties) o;
    return Objects.equals(this.editPrivilege, groupShareProperties.editPrivilege) && Objects.equals(this.sharePrivilege, groupShareProperties.sharePrivilege);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupShareProperties {\n");
    
    sb.append("    editPrivilege: ").append(toIndentedString(editPrivilege)).append("\n");

    sb.append("    sharePrivilege: ").append(toIndentedString(sharePrivilege)).append("\n");
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



// GroupShareProperties instantiates a new GroupShareProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public GroupShareProperties() {

}


}
