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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ConnectableDatacenter;
import org.openapitools.client.model.Peer;

/**
 * PrivateCrossConnectProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-19T16:41:06.426137+02:00[Europe/Bucharest]")
public class PrivateCrossConnectProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PEERS = "peers";
  @SerializedName(SERIALIZED_NAME_PEERS)
  private List<Peer> peers = null;

  public static final String SERIALIZED_NAME_CONNECTABLE_DATACENTERS = "connectableDatacenters";
  @SerializedName(SERIALIZED_NAME_CONNECTABLE_DATACENTERS)
  private List<ConnectableDatacenter> connectableDatacenters = null;


  public PrivateCrossConnectProperties name(String name) {
    
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


  public PrivateCrossConnectProperties description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Human readable description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Private Cross-Connect between datacenter 'A' and datacenter 'B' ", value = "Human readable description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Read-Only attribute. Lists LAN&#39;s joined to this private cross connect
   * @return peers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{ \"peers\": [ { \"id\": \"<lan-id>\", \"name\": \"<lan-name>\", \"datacenterId\": \"<dc-uuid>\",  \"datacenterName\": \"<dc-name>\", \"location\": \"<de/fra>\"} ] }", value = "Read-Only attribute. Lists LAN's joined to this private cross connect")

  public List<Peer> getPeers() {
    return peers;
  }




   /**
   * Read-Only attribute. Lists datacenters that can be joined to this private cross connect
   * @return connectableDatacenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{ \"connectableDatacenters\": [ { \"id\": \"<dc-id>\", \"name\": \"<dc-name>\", \"location\": \"<de/fra>\"} ] }", value = "Read-Only attribute. Lists datacenters that can be joined to this private cross connect")

  public List<ConnectableDatacenter> getConnectableDatacenters() {
    return connectableDatacenters;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateCrossConnectProperties privateCrossConnectProperties = (PrivateCrossConnectProperties) o;
    return Objects.equals(this.name, privateCrossConnectProperties.name) &&
        Objects.equals(this.description, privateCrossConnectProperties.description) &&
        Objects.equals(this.peers, privateCrossConnectProperties.peers) &&
        Objects.equals(this.connectableDatacenters, privateCrossConnectProperties.connectableDatacenters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, peers, connectableDatacenters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateCrossConnectProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
    sb.append("    connectableDatacenters: ").append(toIndentedString(connectableDatacenters)).append("\n");
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

