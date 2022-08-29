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
 * ResourceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:52:45.187Z[Etc/UTC]")

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
   * The name of the resource.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the resource.")

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
   * Boolean value representing if the resource is multi factor protected or not e.g. using two factor protection. Currently only data centers and snapshots are allowed to be multi factor protected, The value of attribute if null is intentional and it means that the resource doesn&#39;t support multi factor protection at all.
   * @return secAuthProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Boolean value representing if the resource is multi factor protected or not e.g. using two factor protection. Currently only data centers and snapshots are allowed to be multi factor protected, The value of attribute if null is intentional and it means that the resource doesn't support multi factor protection at all.")

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

