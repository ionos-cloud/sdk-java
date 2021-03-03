/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
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
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkLoadBalancerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-03T14:20:00.275Z[Etc/UTC]")

public class NetworkLoadBalancerProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LISTENER_LAN = "listenerLan";
  @SerializedName(SERIALIZED_NAME_LISTENER_LAN)
  private Integer listenerLan;

  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = null;

  public static final String SERIALIZED_NAME_TARGET_LAN = "targetLan";
  @SerializedName(SERIALIZED_NAME_TARGET_LAN)
  private Integer targetLan;

  public static final String SERIALIZED_NAME_GATEWAY_IPS = "gatewayIps";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IPS)
  private List<String> gatewayIps = null;


  public NetworkLoadBalancerProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name of that Network Load Balancer
   * @return name
  **/
  @ApiModelProperty(example = "My Network Load Balancer", required = true, value = "A name of that Network Load Balancer")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NetworkLoadBalancerProperties listenerLan(Integer listenerLan) {
    
    this.listenerLan = listenerLan;
    return this;
  }

   /**
   * Id of the listening LAN. (inbound)
   * @return listenerLan
  **/
  @ApiModelProperty(example = "1", required = true, value = "Id of the listening LAN. (inbound)")

  public Integer getListenerLan() {
    return listenerLan;
  }


  public void setListenerLan(Integer listenerLan) {
    this.listenerLan = listenerLan;
  }


  public NetworkLoadBalancerProperties ips(List<String> ips) {
    
    this.ips = ips;
    return this;
  }

  public NetworkLoadBalancerProperties addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<String>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * Collection of IP addresses of the Network Load Balancer. (inbound and outbound) IP of the listenerLan must be a customer reserved IP for the public load balancer and private IP for the private load balancer.
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[81.173.1.2, 22.231.2.2, 22.231.2.3]", value = "Collection of IP addresses of the Network Load Balancer. (inbound and outbound) IP of the listenerLan must be a customer reserved IP for the public load balancer and private IP for the private load balancer.")

  public List<String> getIps() {
    return ips;
  }


  public void setIps(List<String> ips) {
    this.ips = ips;
  }


  public NetworkLoadBalancerProperties targetLan(Integer targetLan) {
    
    this.targetLan = targetLan;
    return this;
  }

   /**
   * Id of the balanced private target LAN. (outbound)
   * @return targetLan
  **/
  @ApiModelProperty(example = "2", required = true, value = "Id of the balanced private target LAN. (outbound)")

  public Integer getTargetLan() {
    return targetLan;
  }


  public void setTargetLan(Integer targetLan) {
    this.targetLan = targetLan;
  }


  public NetworkLoadBalancerProperties gatewayIps(List<String> gatewayIps) {
    
    this.gatewayIps = gatewayIps;
    return this;
  }

  public NetworkLoadBalancerProperties addGatewayIpsItem(String gatewayIpsItem) {
    if (this.gatewayIps == null) {
      this.gatewayIps = new ArrayList<String>();
    }
    this.gatewayIps.add(gatewayIpsItem);
    return this;
  }

   /**
   * Collection of gateway IP addresses with subnet mask of the Network Load Balancer. IPs must contains valid subnet mask. If user will not provide any IP then system will gerenrated one IP with /24 subnet.
   * @return gatewayIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[81.173.1.5/24, 22.231.2.5/24]", value = "Collection of gateway IP addresses with subnet mask of the Network Load Balancer. IPs must contains valid subnet mask. If user will not provide any IP then system will gerenrated one IP with /24 subnet.")

  public List<String> getGatewayIps() {
    return gatewayIps;
  }


  public void setGatewayIps(List<String> gatewayIps) {
    this.gatewayIps = gatewayIps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkLoadBalancerProperties networkLoadBalancerProperties = (NetworkLoadBalancerProperties) o;
    return Objects.equals(this.name, networkLoadBalancerProperties.name) && Objects.equals(this.listenerLan, networkLoadBalancerProperties.listenerLan) && Objects.equals(this.ips, networkLoadBalancerProperties.ips) && Objects.equals(this.targetLan, networkLoadBalancerProperties.targetLan) && Objects.equals(this.gatewayIps, networkLoadBalancerProperties.gatewayIps);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkLoadBalancerProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    listenerLan: ").append(toIndentedString(listenerLan)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    targetLan: ").append(toIndentedString(targetLan)).append("\n");
    sb.append("    gatewayIps: ").append(toIndentedString(gatewayIps)).append("\n");
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

