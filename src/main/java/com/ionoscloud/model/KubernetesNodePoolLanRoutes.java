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
 * KubernetesNodePoolLanRoutes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class KubernetesNodePoolLanRoutes {
  
  public static final String SERIALIZED_NAME_GATEWAY_IP = "gatewayIp";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
  private String gatewayIp;


  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  

  public KubernetesNodePoolLanRoutes gatewayIp(String gatewayIp) {
    
    this.gatewayIp = gatewayIp;
    return this;
  }

   /**
   * IPv4 or IPv6 Gateway IP for the route.
   * @return gatewayIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.1.5.16", value = "IPv4 or IPv6 Gateway IP for the route.")

  public String getGatewayIp() {
    return gatewayIp;
  }


  public void setGatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
  }



  public KubernetesNodePoolLanRoutes network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * IPv4 or IPv6 CIDR to be routed via the interface.
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.2.3.4/24", value = "IPv4 or IPv6 CIDR to be routed via the interface.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesNodePoolLanRoutes kubernetesNodePoolLanRoutes = (KubernetesNodePoolLanRoutes) o;
    return Objects.equals(this.gatewayIp, kubernetesNodePoolLanRoutes.gatewayIp) && Objects.equals(this.network, kubernetesNodePoolLanRoutes.network);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesNodePoolLanRoutes {\n");
    
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");

    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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



// KubernetesNodePoolLanRoutes instantiates a new KubernetesNodePoolLanRoutes object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public KubernetesNodePoolLanRoutes() {

}


}
