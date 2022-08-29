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
import com.ionoscloud.model.FlowLogs;
import com.ionoscloud.model.NetworkLoadBalancerForwardingRules;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NetworkLoadBalancerEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:52:45.187Z[Etc/UTC]")

public class NetworkLoadBalancerEntities {
  
  public static final String SERIALIZED_NAME_FLOWLOGS = "flowlogs";
  @SerializedName(SERIALIZED_NAME_FLOWLOGS)
  private FlowLogs flowlogs;


  public static final String SERIALIZED_NAME_FORWARDINGRULES = "forwardingrules";
  @SerializedName(SERIALIZED_NAME_FORWARDINGRULES)
  private NetworkLoadBalancerForwardingRules forwardingrules;

  

  public NetworkLoadBalancerEntities flowlogs(FlowLogs flowlogs) {
    
    this.flowlogs = flowlogs;
    return this;
  }

   /**
   * Get flowlogs
   * @return flowlogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FlowLogs getFlowlogs() {
    return flowlogs;
  }


  public void setFlowlogs(FlowLogs flowlogs) {
    this.flowlogs = flowlogs;
  }



  public NetworkLoadBalancerEntities forwardingrules(NetworkLoadBalancerForwardingRules forwardingrules) {
    
    this.forwardingrules = forwardingrules;
    return this;
  }

   /**
   * Get forwardingrules
   * @return forwardingrules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkLoadBalancerForwardingRules getForwardingrules() {
    return forwardingrules;
  }


  public void setForwardingrules(NetworkLoadBalancerForwardingRules forwardingrules) {
    this.forwardingrules = forwardingrules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkLoadBalancerEntities networkLoadBalancerEntities = (NetworkLoadBalancerEntities) o;
    return Objects.equals(this.flowlogs, networkLoadBalancerEntities.flowlogs) && Objects.equals(this.forwardingrules, networkLoadBalancerEntities.forwardingrules);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkLoadBalancerEntities {\n");
    
    sb.append("    flowlogs: ").append(toIndentedString(flowlogs)).append("\n");

    sb.append("    forwardingrules: ").append(toIndentedString(forwardingrules)).append("\n");
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

