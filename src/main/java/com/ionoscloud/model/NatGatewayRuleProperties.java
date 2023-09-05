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
import com.ionoscloud.model.NatGatewayRuleProtocol;
import com.ionoscloud.model.NatGatewayRuleType;
import com.ionoscloud.model.TargetPortRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NatGatewayRuleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class NatGatewayRuleProperties {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private NatGatewayRuleProtocol protocol;


  public static final String SERIALIZED_NAME_PUBLIC_IP = "publicIp";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;


  public static final String SERIALIZED_NAME_SOURCE_SUBNET = "sourceSubnet";
  @SerializedName(SERIALIZED_NAME_SOURCE_SUBNET)
  private String sourceSubnet;


  public static final String SERIALIZED_NAME_TARGET_PORT_RANGE = "targetPortRange";
  @SerializedName(SERIALIZED_NAME_TARGET_PORT_RANGE)
  private TargetPortRange targetPortRange;


  public static final String SERIALIZED_NAME_TARGET_SUBNET = "targetSubnet";
  @SerializedName(SERIALIZED_NAME_TARGET_SUBNET)
  private String targetSubnet;


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NatGatewayRuleType type;

  

  public NatGatewayRuleProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the NAT Gateway rule.
   * @return name
  **/
  @ApiModelProperty(example = "My NAT Gateway rule", required = true, value = "The name of the NAT Gateway rule.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public NatGatewayRuleProperties protocol(NatGatewayRuleProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol of the NAT Gateway rule. Defaults to ALL. If protocol is &#39;ICMP&#39; then targetPortRange start and end cannot be set.
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"TCP\"", value = "Protocol of the NAT Gateway rule. Defaults to ALL. If protocol is 'ICMP' then targetPortRange start and end cannot be set.")

  public NatGatewayRuleProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(NatGatewayRuleProtocol protocol) {
    this.protocol = protocol;
  }



  public NatGatewayRuleProperties publicIp(String publicIp) {
    
    this.publicIp = publicIp;
    return this;
  }

   /**
   * Public IP address of the NAT Gateway rule. Specifies the address used for masking outgoing packets source address field. Should be one of the customer reserved IP address already configured on the NAT Gateway resource
   * @return publicIp
  **/
  @ApiModelProperty(example = "192.18.7.17", required = true, value = "Public IP address of the NAT Gateway rule. Specifies the address used for masking outgoing packets source address field. Should be one of the customer reserved IP address already configured on the NAT Gateway resource")

  public String getPublicIp() {
    return publicIp;
  }


  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }



  public NatGatewayRuleProperties sourceSubnet(String sourceSubnet) {
    
    this.sourceSubnet = sourceSubnet;
    return this;
  }

   /**
   * Source subnet of the NAT Gateway rule. For SNAT rules it specifies which packets this translation rule applies to based on the packets source IP address.
   * @return sourceSubnet
  **/
  @ApiModelProperty(example = "10.0.1.0/24", required = true, value = "Source subnet of the NAT Gateway rule. For SNAT rules it specifies which packets this translation rule applies to based on the packets source IP address.")

  public String getSourceSubnet() {
    return sourceSubnet;
  }


  public void setSourceSubnet(String sourceSubnet) {
    this.sourceSubnet = sourceSubnet;
  }



  public NatGatewayRuleProperties targetPortRange(TargetPortRange targetPortRange) {
    
    this.targetPortRange = targetPortRange;
    return this;
  }

   /**
   * Get targetPortRange
   * @return targetPortRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TargetPortRange getTargetPortRange() {
    return targetPortRange;
  }


  public void setTargetPortRange(TargetPortRange targetPortRange) {
    this.targetPortRange = targetPortRange;
  }



  public NatGatewayRuleProperties targetSubnet(String targetSubnet) {
    
    this.targetSubnet = targetSubnet;
    return this;
  }

   /**
   * Target or destination subnet of the NAT Gateway rule. For SNAT rules it specifies which packets this translation rule applies to based on the packets destination IP address. If none is provided, rule will match any address.
   * @return targetSubnet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0.1.0/24", value = "Target or destination subnet of the NAT Gateway rule. For SNAT rules it specifies which packets this translation rule applies to based on the packets destination IP address. If none is provided, rule will match any address.")

  public String getTargetSubnet() {
    return targetSubnet;
  }


  public void setTargetSubnet(String targetSubnet) {
    this.targetSubnet = targetSubnet;
  }



  public NatGatewayRuleProperties type(NatGatewayRuleType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the NAT Gateway rule.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"SNAT\"", value = "Type of the NAT Gateway rule.")

  public NatGatewayRuleType getType() {
    return type;
  }


  public void setType(NatGatewayRuleType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatGatewayRuleProperties natGatewayRuleProperties = (NatGatewayRuleProperties) o;
    return Objects.equals(this.name, natGatewayRuleProperties.name) && Objects.equals(this.protocol, natGatewayRuleProperties.protocol) && Objects.equals(this.publicIp, natGatewayRuleProperties.publicIp) && Objects.equals(this.sourceSubnet, natGatewayRuleProperties.sourceSubnet) && Objects.equals(this.targetPortRange, natGatewayRuleProperties.targetPortRange) && Objects.equals(this.targetSubnet, natGatewayRuleProperties.targetSubnet) && Objects.equals(this.type, natGatewayRuleProperties.type);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatGatewayRuleProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");

    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");

    sb.append("    sourceSubnet: ").append(toIndentedString(sourceSubnet)).append("\n");

    sb.append("    targetPortRange: ").append(toIndentedString(targetPortRange)).append("\n");

    sb.append("    targetSubnet: ").append(toIndentedString(targetSubnet)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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



// NatGatewayRuleProperties instantiates a new NatGatewayRuleProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public NatGatewayRuleProperties(String Name, String PublicIp, String SourceSubnet) {

	this.name = Name;
	this.publicIp = PublicIp;
	this.sourceSubnet = SourceSubnet;
}

public NatGatewayRuleProperties() {
}

}
