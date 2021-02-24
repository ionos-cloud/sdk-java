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
import com.ionoscloud.model.IpConsumer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IpBlockProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-24T09:29:24.721Z[Etc/UTC]")

public class IpBlockProperties {
  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IP_CONSUMERS = "ipConsumers";
  @SerializedName(SERIALIZED_NAME_IP_CONSUMERS)
  private List<IpConsumer> ipConsumers = null;


   /**
   * A collection of IPs associated with the IP Block
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"22.231.113.64\", \"22.231.113.65\", \"22.231.113.66\"]", value = "A collection of IPs associated with the IP Block")

  public List<String> getIps() {
    return ips;
  }




  public IpBlockProperties location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Location of that IP Block. Property cannot be modified after creation (disallowed in update requests)
   * @return location
  **/
  @ApiModelProperty(example = "us/las", required = true, value = "Location of that IP Block. Property cannot be modified after creation (disallowed in update requests)")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public IpBlockProperties size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of the IP block
   * @return size
  **/
  @ApiModelProperty(example = "5", required = true, value = "The size of the IP block")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public IpBlockProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name of that resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "A name of that resource")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * Read-Only attribute. Lists consumption detail of an individual ip
   * @return ipConsumers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{ \"ipConsumers\": [ { \"ip\" : \"192.18.2.11\", \"mac\" : \"02:01:3f:52:6e:57\", \"nicId\" : \"0e8ee463-1174-46f2-87ba-a5c79c14d8e5\", \"serverId\" : \"e6a3466f-8d6e-4cb6-8001-f4e245f222b7\", \"serverName\" : \"Unnamed Server\", \"datacenterId\" : \"6e54a9ec-aace-4176-8ee4-1c3a704fccfc\", \"datacenterName\" : \"IpConsumerDC\"} ] }", value = "Read-Only attribute. Lists consumption detail of an individual ip")

  public List<IpConsumer> getIpConsumers() {
    return ipConsumers;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpBlockProperties ipBlockProperties = (IpBlockProperties) o;
    return Objects.equals(this.ips, ipBlockProperties.ips) && Objects.equals(this.location, ipBlockProperties.location) && Objects.equals(this.size, ipBlockProperties.size) && Objects.equals(this.name, ipBlockProperties.name) && Objects.equals(this.ipConsumers, ipBlockProperties.ipConsumers);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpBlockProperties {\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ipConsumers: ").append(toIndentedString(ipConsumers)).append("\n");
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

