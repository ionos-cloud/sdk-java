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
import com.ionoscloud.model.NetworkLoadBalancerForwardingRuleTargetHealthCheck;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NetworkLoadBalancerForwardingRuleTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T10:06:24.683Z[Etc/UTC]")

public class NetworkLoadBalancerForwardingRuleTarget {
  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public static final String SERIALIZED_NAME_HEALTH_CHECK = "healthCheck";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK)
  private NetworkLoadBalancerForwardingRuleTargetHealthCheck healthCheck;


  public NetworkLoadBalancerForwardingRuleTarget ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * The IP of the balanced target VM.
   * @return ip
  **/
  @ApiModelProperty(example = "22.231.2.2", required = true, value = "The IP of the balanced target VM.")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public NetworkLoadBalancerForwardingRuleTarget port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port of the balanced target service; valid range is 1 to 65535.
   * @return port
  **/
  @ApiModelProperty(example = "8080", required = true, value = "The port of the balanced target service; valid range is 1 to 65535.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public NetworkLoadBalancerForwardingRuleTarget weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Traffic is distributed in proportion to target weight, relative to the combined weight of all targets. A target with higher weight receives a greater share of traffic. Valid range is 0 to 256 and default is 1. Targets with weight of 0 do not participate in load balancing but still accept persistent connections. It is best to assign weights in the middle of the range to leave room for later adjustments.
   * @return weight
  **/
  @ApiModelProperty(example = "123", required = true, value = "Traffic is distributed in proportion to target weight, relative to the combined weight of all targets. A target with higher weight receives a greater share of traffic. Valid range is 0 to 256 and default is 1. Targets with weight of 0 do not participate in load balancing but still accept persistent connections. It is best to assign weights in the middle of the range to leave room for later adjustments.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  public NetworkLoadBalancerForwardingRuleTarget healthCheck(NetworkLoadBalancerForwardingRuleTargetHealthCheck healthCheck) {
    
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkLoadBalancerForwardingRuleTargetHealthCheck getHealthCheck() {
    return healthCheck;
  }


  public void setHealthCheck(NetworkLoadBalancerForwardingRuleTargetHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkLoadBalancerForwardingRuleTarget networkLoadBalancerForwardingRuleTarget = (NetworkLoadBalancerForwardingRuleTarget) o;
    return Objects.equals(this.ip, networkLoadBalancerForwardingRuleTarget.ip) && Objects.equals(this.port, networkLoadBalancerForwardingRuleTarget.port) && Objects.equals(this.weight, networkLoadBalancerForwardingRuleTarget.weight) && Objects.equals(this.healthCheck, networkLoadBalancerForwardingRuleTarget.healthCheck);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkLoadBalancerForwardingRuleTarget {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
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

