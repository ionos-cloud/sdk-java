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
 * IpConsumer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class IpConsumer {
  
  public static final String SERIALIZED_NAME_DATACENTER_ID = "datacenterId";
  @SerializedName(SERIALIZED_NAME_DATACENTER_ID)
  private String datacenterId;


  public static final String SERIALIZED_NAME_DATACENTER_NAME = "datacenterName";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NAME)
  private String datacenterName;


  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;


  public static final String SERIALIZED_NAME_K8S_CLUSTER_UUID = "k8sClusterUuid";
  @SerializedName(SERIALIZED_NAME_K8S_CLUSTER_UUID)
  private String k8sClusterUuid;


  public static final String SERIALIZED_NAME_K8S_NODE_POOL_UUID = "k8sNodePoolUuid";
  @SerializedName(SERIALIZED_NAME_K8S_NODE_POOL_UUID)
  private String k8sNodePoolUuid;


  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;


  public static final String SERIALIZED_NAME_NIC_ID = "nicId";
  @SerializedName(SERIALIZED_NAME_NIC_ID)
  private String nicId;


  public static final String SERIALIZED_NAME_SERVER_ID = "serverId";
  @SerializedName(SERIALIZED_NAME_SERVER_ID)
  private String serverId;


  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  

  public IpConsumer datacenterId(String datacenterId) {
    
    this.datacenterId = datacenterId;
    return this;
  }

   /**
   * Get datacenterId
   * @return datacenterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenterId() {
    return datacenterId;
  }


  public void setDatacenterId(String datacenterId) {
    this.datacenterId = datacenterId;
  }



  public IpConsumer datacenterName(String datacenterName) {
    
    this.datacenterName = datacenterName;
    return this;
  }

   /**
   * Get datacenterName
   * @return datacenterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenterName() {
    return datacenterName;
  }


  public void setDatacenterName(String datacenterName) {
    this.datacenterName = datacenterName;
  }



  public IpConsumer ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }



  public IpConsumer k8sClusterUuid(String k8sClusterUuid) {
    
    this.k8sClusterUuid = k8sClusterUuid;
    return this;
  }

   /**
   * Get k8sClusterUuid
   * @return k8sClusterUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getK8sClusterUuid() {
    return k8sClusterUuid;
  }


  public void setK8sClusterUuid(String k8sClusterUuid) {
    this.k8sClusterUuid = k8sClusterUuid;
  }



  public IpConsumer k8sNodePoolUuid(String k8sNodePoolUuid) {
    
    this.k8sNodePoolUuid = k8sNodePoolUuid;
    return this;
  }

   /**
   * Get k8sNodePoolUuid
   * @return k8sNodePoolUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getK8sNodePoolUuid() {
    return k8sNodePoolUuid;
  }


  public void setK8sNodePoolUuid(String k8sNodePoolUuid) {
    this.k8sNodePoolUuid = k8sNodePoolUuid;
  }



  public IpConsumer mac(String mac) {
    
    this.mac = mac;
    return this;
  }

   /**
   * Get mac
   * @return mac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMac() {
    return mac;
  }


  public void setMac(String mac) {
    this.mac = mac;
  }



  public IpConsumer nicId(String nicId) {
    
    this.nicId = nicId;
    return this;
  }

   /**
   * Get nicId
   * @return nicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicId() {
    return nicId;
  }


  public void setNicId(String nicId) {
    this.nicId = nicId;
  }



  public IpConsumer serverId(String serverId) {
    
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServerId() {
    return serverId;
  }


  public void setServerId(String serverId) {
    this.serverId = serverId;
  }



  public IpConsumer serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpConsumer ipConsumer = (IpConsumer) o;
    return Objects.equals(this.datacenterId, ipConsumer.datacenterId) && Objects.equals(this.datacenterName, ipConsumer.datacenterName) && Objects.equals(this.ip, ipConsumer.ip) && Objects.equals(this.k8sClusterUuid, ipConsumer.k8sClusterUuid) && Objects.equals(this.k8sNodePoolUuid, ipConsumer.k8sNodePoolUuid) && Objects.equals(this.mac, ipConsumer.mac) && Objects.equals(this.nicId, ipConsumer.nicId) && Objects.equals(this.serverId, ipConsumer.serverId) && Objects.equals(this.serverName, ipConsumer.serverName);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpConsumer {\n");
    
    sb.append("    datacenterId: ").append(toIndentedString(datacenterId)).append("\n");

    sb.append("    datacenterName: ").append(toIndentedString(datacenterName)).append("\n");

    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");

    sb.append("    k8sClusterUuid: ").append(toIndentedString(k8sClusterUuid)).append("\n");

    sb.append("    k8sNodePoolUuid: ").append(toIndentedString(k8sNodePoolUuid)).append("\n");

    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");

    sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");

    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");

    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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



// IpConsumer instantiates a new IpConsumer object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public IpConsumer() {

}


}
