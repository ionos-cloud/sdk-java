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


package org.openapitools.client.model;

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
import org.openapitools.client.model.Lans;
import org.openapitools.client.model.Loadbalancers;
import org.openapitools.client.model.Servers;
import org.openapitools.client.model.Volumes;

/**
 * DatacenterEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-18T18:41:07.637425+02:00[Europe/Bucharest]")
public class DatacenterEntities {
  public static final String SERIALIZED_NAME_SERVERS = "servers";
  @SerializedName(SERIALIZED_NAME_SERVERS)
  private Servers servers;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private Volumes volumes;

  public static final String SERIALIZED_NAME_LOADBALANCERS = "loadbalancers";
  @SerializedName(SERIALIZED_NAME_LOADBALANCERS)
  private Loadbalancers loadbalancers;

  public static final String SERIALIZED_NAME_LANS = "lans";
  @SerializedName(SERIALIZED_NAME_LANS)
  private Lans lans;


  public DatacenterEntities servers(Servers servers) {
    
    this.servers = servers;
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Servers getServers() {
    return servers;
  }


  public void setServers(Servers servers) {
    this.servers = servers;
  }


  public DatacenterEntities volumes(Volumes volumes) {
    
    this.volumes = volumes;
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Volumes getVolumes() {
    return volumes;
  }


  public void setVolumes(Volumes volumes) {
    this.volumes = volumes;
  }


  public DatacenterEntities loadbalancers(Loadbalancers loadbalancers) {
    
    this.loadbalancers = loadbalancers;
    return this;
  }

   /**
   * Get loadbalancers
   * @return loadbalancers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Loadbalancers getLoadbalancers() {
    return loadbalancers;
  }


  public void setLoadbalancers(Loadbalancers loadbalancers) {
    this.loadbalancers = loadbalancers;
  }


  public DatacenterEntities lans(Lans lans) {
    
    this.lans = lans;
    return this;
  }

   /**
   * Get lans
   * @return lans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Lans getLans() {
    return lans;
  }


  public void setLans(Lans lans) {
    this.lans = lans;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatacenterEntities datacenterEntities = (DatacenterEntities) o;
    return Objects.equals(this.servers, datacenterEntities.servers) &&
        Objects.equals(this.volumes, datacenterEntities.volumes) &&
        Objects.equals(this.loadbalancers, datacenterEntities.loadbalancers) &&
        Objects.equals(this.lans, datacenterEntities.lans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servers, volumes, loadbalancers, lans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatacenterEntities {\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
    sb.append("    lans: ").append(toIndentedString(lans)).append("\n");
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

