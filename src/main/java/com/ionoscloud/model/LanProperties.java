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
import com.ionoscloud.model.IPFailover;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LanProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class LanProperties {
  
  public static final String SERIALIZED_NAME_IP_FAILOVER = "ipFailover";
  @SerializedName(SERIALIZED_NAME_IP_FAILOVER)
  private List<IPFailover> ipFailover = null;


  public static final String SERIALIZED_NAME_IPV6_CIDR_BLOCK = "ipv6CidrBlock";
  @SerializedName(SERIALIZED_NAME_IPV6_CIDR_BLOCK)
  private String ipv6CidrBlock;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_PCC = "pcc";
  @SerializedName(SERIALIZED_NAME_PCC)
  private String pcc;


  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  

  public LanProperties ipFailover(List<IPFailover> ipFailover) {
    
    this.ipFailover = ipFailover;
    return this;
  }

  public LanProperties addIpFailoverItem(IPFailover ipFailoverItem) {
    if (this.ipFailover == null) {
      this.ipFailover = new ArrayList<IPFailover>();
    }
    this.ipFailover.add(ipFailoverItem);
    return this;
  }

   /**
   * IP failover configurations for lan
   * @return ipFailover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP failover configurations for lan")

  public List<IPFailover> getIpFailover() {
    return ipFailover;
  }


  public void setIpFailover(List<IPFailover> ipFailover) {
    this.ipFailover = ipFailover;
  }



  public LanProperties ipv6CidrBlock(String ipv6CidrBlock) {
    
    this.ipv6CidrBlock = ipv6CidrBlock;
    return this;
  }

   /**
   * [The IPv6 feature is in beta phase and not ready for production usage.] For a GET request, this value is either &#39;null&#39; or contains the LAN&#39;s /64 IPv6 CIDR block if this LAN is IPv6 enabled. For POST/PUT/PATCH requests, &#39;AUTO&#39; will result in enabling this LAN for IPv6 and automatically assign a /64 IPv6 CIDR block to this LAN and /80 IPv6 CIDR blocks to the NICs and one /128 IPv6 address to each connected NIC. If you choose the IPv6 CIDR block for the LAN on your own, then you must provide a /64 block, which is inside the IPv6 CIDR block of the virtual datacenter and unique inside all LANs from this virtual datacenter. If you enable IPv6 on a LAN with NICs, those NICs will get a /80 IPv6 CIDR block and one IPv6 address assigned to each automatically, unless you specify them explicitly on the LAN and on the NICs. A virtual data center is limited to a maximum of 256 IPv6-enabled LANs.
   * @return ipv6CidrBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2001:db8:b06d:8f5a::/64", value = "[The IPv6 feature is in beta phase and not ready for production usage.] For a GET request, this value is either 'null' or contains the LAN's /64 IPv6 CIDR block if this LAN is IPv6 enabled. For POST/PUT/PATCH requests, 'AUTO' will result in enabling this LAN for IPv6 and automatically assign a /64 IPv6 CIDR block to this LAN and /80 IPv6 CIDR blocks to the NICs and one /128 IPv6 address to each connected NIC. If you choose the IPv6 CIDR block for the LAN on your own, then you must provide a /64 block, which is inside the IPv6 CIDR block of the virtual datacenter and unique inside all LANs from this virtual datacenter. If you enable IPv6 on a LAN with NICs, those NICs will get a /80 IPv6 CIDR block and one IPv6 address assigned to each automatically, unless you specify them explicitly on the LAN and on the NICs. A virtual data center is limited to a maximum of 256 IPv6-enabled LANs.")

  public String getIpv6CidrBlock() {
    return ipv6CidrBlock;
  }


  public void setIpv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
  }



  public LanProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the  resource.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "The name of the  resource.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public LanProperties pcc(String pcc) {
    
    this.pcc = pcc;
    return this;
  }

   /**
   * The unique identifier of the private Cross-Connect the LAN is connected to, if any.
   * @return pcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3c11273c-b3e1-4ca3-8134-84fd2dd4ebec", value = "The unique identifier of the private Cross-Connect the LAN is connected to, if any.")

  public String getPcc() {
    return pcc;
  }


  public void setPcc(String pcc) {
    this.pcc = pcc;
  }



  public LanProperties _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * This LAN faces the public Internet.
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "This LAN faces the public Internet.")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanProperties lanProperties = (LanProperties) o;
    return Objects.equals(this.ipFailover, lanProperties.ipFailover) && Objects.equals(this.ipv6CidrBlock, lanProperties.ipv6CidrBlock) && Objects.equals(this.name, lanProperties.name) && Objects.equals(this.pcc, lanProperties.pcc) && Objects.equals(this._public, lanProperties._public);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanProperties {\n");
    
    sb.append("    ipFailover: ").append(toIndentedString(ipFailover)).append("\n");

    sb.append("    ipv6CidrBlock: ").append(toIndentedString(ipv6CidrBlock)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    pcc: ").append(toIndentedString(pcc)).append("\n");

    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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



// LanProperties instantiates a new LanProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public LanProperties() {

}


}
