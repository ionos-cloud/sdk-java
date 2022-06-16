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
 * IPFailover
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T09:00:27.688Z[Etc/UTC]")

public class IPFailover {
  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_NIC_UUID = "nicUuid";
  @SerializedName(SERIALIZED_NAME_NIC_UUID)
  private String nicUuid;


  public IPFailover ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192.18.2.231", value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public IPFailover nicUuid(String nicUuid) {
    
    this.nicUuid = nicUuid;
    return this;
  }

   /**
   * Get nicUuid
   * @return nicUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3c11273c-b3e1-4ca3-8134-84fd2dd4ebec", value = "")

  public String getNicUuid() {
    return nicUuid;
  }


  public void setNicUuid(String nicUuid) {
    this.nicUuid = nicUuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPFailover ipFailover = (IPFailover) o;
    return Objects.equals(this.ip, ipFailover.ip) && Objects.equals(this.nicUuid, ipFailover.nicUuid);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPFailover {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    nicUuid: ").append(toIndentedString(nicUuid)).append("\n");
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

