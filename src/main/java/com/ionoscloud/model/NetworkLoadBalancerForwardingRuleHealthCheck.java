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
 * NetworkLoadBalancerForwardingRuleHealthCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T09:00:27.688Z[Etc/UTC]")

public class NetworkLoadBalancerForwardingRuleHealthCheck {
  public static final String SERIALIZED_NAME_CLIENT_TIMEOUT = "clientTimeout";
  @SerializedName(SERIALIZED_NAME_CLIENT_TIMEOUT)
  private Integer clientTimeout;

  public static final String SERIALIZED_NAME_CONNECT_TIMEOUT = "connectTimeout";
  @SerializedName(SERIALIZED_NAME_CONNECT_TIMEOUT)
  private Integer connectTimeout;

  public static final String SERIALIZED_NAME_TARGET_TIMEOUT = "targetTimeout";
  @SerializedName(SERIALIZED_NAME_TARGET_TIMEOUT)
  private Integer targetTimeout;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries;


  public NetworkLoadBalancerForwardingRuleHealthCheck clientTimeout(Integer clientTimeout) {
    
    this.clientTimeout = clientTimeout;
    return this;
  }

   /**
   * The maximum time in milliseconds to wait for the client to acknowledge or send data; default is 50,000 (50 seconds).
   * @return clientTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "The maximum time in milliseconds to wait for the client to acknowledge or send data; default is 50,000 (50 seconds).")

  public Integer getClientTimeout() {
    return clientTimeout;
  }


  public void setClientTimeout(Integer clientTimeout) {
    this.clientTimeout = clientTimeout;
  }


  public NetworkLoadBalancerForwardingRuleHealthCheck connectTimeout(Integer connectTimeout) {
    
    this.connectTimeout = connectTimeout;
    return this;
  }

   /**
   * The maximum time in milliseconds to wait for a connection attempt to a target to succeed; default is 5000 (five seconds).
   * @return connectTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "The maximum time in milliseconds to wait for a connection attempt to a target to succeed; default is 5000 (five seconds).")

  public Integer getConnectTimeout() {
    return connectTimeout;
  }


  public void setConnectTimeout(Integer connectTimeout) {
    this.connectTimeout = connectTimeout;
  }


  public NetworkLoadBalancerForwardingRuleHealthCheck targetTimeout(Integer targetTimeout) {
    
    this.targetTimeout = targetTimeout;
    return this;
  }

   /**
   * The maximum time in milliseconds that a target can remain inactive; default is 50,000 (50 seconds).
   * @return targetTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50000", value = "The maximum time in milliseconds that a target can remain inactive; default is 50,000 (50 seconds).")

  public Integer getTargetTimeout() {
    return targetTimeout;
  }


  public void setTargetTimeout(Integer targetTimeout) {
    this.targetTimeout = targetTimeout;
  }


  public NetworkLoadBalancerForwardingRuleHealthCheck retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * The maximum number of attempts to reconnect to a target after a connection failure. Valid range is 0 to 65535 and default is three reconnection attempts.
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The maximum number of attempts to reconnect to a target after a connection failure. Valid range is 0 to 65535 and default is three reconnection attempts.")

  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkLoadBalancerForwardingRuleHealthCheck networkLoadBalancerForwardingRuleHealthCheck = (NetworkLoadBalancerForwardingRuleHealthCheck) o;
    return Objects.equals(this.clientTimeout, networkLoadBalancerForwardingRuleHealthCheck.clientTimeout) && Objects.equals(this.connectTimeout, networkLoadBalancerForwardingRuleHealthCheck.connectTimeout) && Objects.equals(this.targetTimeout, networkLoadBalancerForwardingRuleHealthCheck.targetTimeout) && Objects.equals(this.retries, networkLoadBalancerForwardingRuleHealthCheck.retries);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkLoadBalancerForwardingRuleHealthCheck {\n");
    sb.append("    clientTimeout: ").append(toIndentedString(clientTimeout)).append("\n");
    sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
    sb.append("    targetTimeout: ").append(toIndentedString(targetTimeout)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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

