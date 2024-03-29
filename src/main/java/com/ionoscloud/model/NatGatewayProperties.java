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
import com.ionoscloud.model.NatGatewayLanProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NatGatewayProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class NatGatewayProperties {
  
  public static final String SERIALIZED_NAME_LANS = "lans";
  @SerializedName(SERIALIZED_NAME_LANS)
  private List<NatGatewayLanProperties> lans = null;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_PUBLIC_IPS = "publicIps";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IPS)
  private List<String> publicIps = new ArrayList<String>();

  

  public NatGatewayProperties lans(List<NatGatewayLanProperties> lans) {
    
    this.lans = lans;
    return this;
  }

  public NatGatewayProperties addLansItem(NatGatewayLanProperties lansItem) {
    if (this.lans == null) {
      this.lans = new ArrayList<NatGatewayLanProperties>();
    }
    this.lans.add(lansItem);
    return this;
  }

   /**
   * Collection of LANs connected to the NAT Gateway. IPs must contain a valid subnet mask. If no IP is provided, the system will generate an IP with /24 subnet.
   * @return lans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of LANs connected to the NAT Gateway. IPs must contain a valid subnet mask. If no IP is provided, the system will generate an IP with /24 subnet.")

  public List<NatGatewayLanProperties> getLans() {
    return lans;
  }


  public void setLans(List<NatGatewayLanProperties> lans) {
    this.lans = lans;
  }



  public NatGatewayProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the NAT Gateway.
   * @return name
  **/
  @ApiModelProperty(example = "My NAT Gateway", required = true, value = "Name of the NAT Gateway.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public NatGatewayProperties publicIps(List<String> publicIps) {
    
    this.publicIps = publicIps;
    return this;
  }

  public NatGatewayProperties addPublicIpsItem(String publicIpsItem) {
    this.publicIps.add(publicIpsItem);
    return this;
  }

   /**
   * Collection of public IP addresses of the NAT Gateway. Should be customer reserved IP addresses in that location.
   * @return publicIps
  **/
  @ApiModelProperty(example = "[81.173.1.2, 82.231.2.5, 92.221.2.4]", required = true, value = "Collection of public IP addresses of the NAT Gateway. Should be customer reserved IP addresses in that location.")

  public List<String> getPublicIps() {
    return publicIps;
  }


  public void setPublicIps(List<String> publicIps) {
    this.publicIps = publicIps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatGatewayProperties natGatewayProperties = (NatGatewayProperties) o;
    return Objects.equals(this.lans, natGatewayProperties.lans) && Objects.equals(this.name, natGatewayProperties.name) && Objects.equals(this.publicIps, natGatewayProperties.publicIps);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatGatewayProperties {\n");
    
    sb.append("    lans: ").append(toIndentedString(lans)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
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



// NatGatewayProperties instantiates a new NatGatewayProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public NatGatewayProperties(String Name, List<String> PublicIps) {

	this.name = Name;
	this.publicIps = PublicIps;
}

public NatGatewayProperties() {
}

}
