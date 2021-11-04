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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-04T10:08:17.736Z[Etc/UTC]")

public class ResourceProperties {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_SEC_AUTH_PROTECTION = "secAuthProtection";
  @SerializedName(SERIALIZED_NAME_SEC_AUTH_PROTECTION)
  private Boolean secAuthProtection;

  

  public ResourceProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the resource")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public ResourceProperties secAuthProtection(Boolean secAuthProtection) {
    
    this.secAuthProtection = secAuthProtection;
    return this;
  }

   /**
   * Boolean value representing if the resource is multi factor protected or not e.g. using two factor protection. Currently only Data Centers and Snapshots are allowed to be multi factor protected, The value of attribute if null is intentional and it means that the resource doesn&#39;t support multi factor protection at all.
   * @return secAuthProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Boolean value representing if the resource is multi factor protected or not e.g. using two factor protection. Currently only Data Centers and Snapshots are allowed to be multi factor protected, The value of attribute if null is intentional and it means that the resource doesn't support multi factor protection at all.")

  public Boolean getSecAuthProtection() {
    return secAuthProtection;
  }


  public void setSecAuthProtection(Boolean secAuthProtection) {
    this.secAuthProtection = secAuthProtection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceProperties resourceProperties = (ResourceProperties) o;
    return Objects.equals(this.name, resourceProperties.name) && Objects.equals(this.secAuthProtection, resourceProperties.secAuthProtection);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    secAuthProtection: ").append(toIndentedString(secAuthProtection)).append("\n");
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

