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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * FirewallruleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class FirewallruleProperties {
  
  public static final String SERIALIZED_NAME_ICMP_CODE = "icmpCode";
  @SerializedName(SERIALIZED_NAME_ICMP_CODE)
  private Integer icmpCode;


  public static final String SERIALIZED_NAME_ICMP_TYPE = "icmpType";
  @SerializedName(SERIALIZED_NAME_ICMP_TYPE)
  private Integer icmpType;


  /**
   * The IP version for this rule. If sourceIp or targetIp are specified, you can omit this value - the IP version will then be deduced from the IP address(es) used; if you specify it anyway, it must match the specified IP address(es). If neither sourceIp nor targetIp are specified, this rule allows traffic only for the specified IP version. If neither sourceIp, targetIp nor ipVersion are specified, this rule will only allow IPv4 traffic.
   */
  @JsonAdapter(IpVersionEnum.Adapter.class)
  public enum IpVersionEnum {
    IPV4("IPv4"),
    
    IPV6("IPv6");

    private String value;

    IpVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IpVersionEnum fromValue(String value) {

      for (IpVersionEnum b : IpVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IpVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IpVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IpVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IpVersionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IP_VERSION = "ipVersion";
  @SerializedName(SERIALIZED_NAME_IP_VERSION)
  private IpVersionEnum ipVersion;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_PORT_RANGE_END = "portRangeEnd";
  @SerializedName(SERIALIZED_NAME_PORT_RANGE_END)
  private Integer portRangeEnd;


  public static final String SERIALIZED_NAME_PORT_RANGE_START = "portRangeStart";
  @SerializedName(SERIALIZED_NAME_PORT_RANGE_START)
  private Integer portRangeStart;


  /**
   * The protocol for the rule. Property cannot be modified after it is created (disallowed in update requests).
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    TCP("TCP"),
    
    UDP("UDP"),
    
    ICMP("ICMP"),
    
    ICMPV6("ICMPv6"),
    
    ANY("ANY");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {

      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;


  public static final String SERIALIZED_NAME_SOURCE_IP = "sourceIp";
  @SerializedName(SERIALIZED_NAME_SOURCE_IP)
  private String sourceIp;


  public static final String SERIALIZED_NAME_SOURCE_MAC = "sourceMac";
  @SerializedName(SERIALIZED_NAME_SOURCE_MAC)
  private String sourceMac;


  public static final String SERIALIZED_NAME_TARGET_IP = "targetIp";
  @SerializedName(SERIALIZED_NAME_TARGET_IP)
  private String targetIp;


  /**
   * The type of the firewall rule. If not specified, the default INGRESS value is used.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INGRESS("INGRESS"),
    
    EGRESS("EGRESS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {

      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  

  public FirewallruleProperties icmpCode(Integer icmpCode) {
    
    this.icmpCode = icmpCode;
    return this;
  }

   /**
   * Defines the allowed code (from 0 to 254) if protocol ICMP or ICMPv6 is chosen. Value null allows all codes.
   * minimum: 0
   * maximum: 254
   * @return icmpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Defines the allowed code (from 0 to 254) if protocol ICMP or ICMPv6 is chosen. Value null allows all codes.")

  public Integer getIcmpCode() {
    return icmpCode;
  }


  public void setIcmpCode(Integer icmpCode) {
    this.icmpCode = icmpCode;
  }



  public FirewallruleProperties icmpType(Integer icmpType) {
    
    this.icmpType = icmpType;
    return this;
  }

   /**
   * Defines the allowed type (from 0 to 254) if the protocol ICMP or ICMPv6 is chosen. Value null allows all types.
   * minimum: 0
   * maximum: 254
   * @return icmpType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Defines the allowed type (from 0 to 254) if the protocol ICMP or ICMPv6 is chosen. Value null allows all types.")

  public Integer getIcmpType() {
    return icmpType;
  }


  public void setIcmpType(Integer icmpType) {
    this.icmpType = icmpType;
  }



  public FirewallruleProperties ipVersion(IpVersionEnum ipVersion) {
    
    this.ipVersion = ipVersion;
    return this;
  }

   /**
   * The IP version for this rule. If sourceIp or targetIp are specified, you can omit this value - the IP version will then be deduced from the IP address(es) used; if you specify it anyway, it must match the specified IP address(es). If neither sourceIp nor targetIp are specified, this rule allows traffic only for the specified IP version. If neither sourceIp, targetIp nor ipVersion are specified, this rule will only allow IPv4 traffic.
   * @return ipVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IPv4", value = "The IP version for this rule. If sourceIp or targetIp are specified, you can omit this value - the IP version will then be deduced from the IP address(es) used; if you specify it anyway, it must match the specified IP address(es). If neither sourceIp nor targetIp are specified, this rule allows traffic only for the specified IP version. If neither sourceIp, targetIp nor ipVersion are specified, this rule will only allow IPv4 traffic.")

  public IpVersionEnum getIpVersion() {
    return ipVersion;
  }


  public void setIpVersion(IpVersionEnum ipVersion) {
    this.ipVersion = ipVersion;
  }



  public FirewallruleProperties name(String name) {
    
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



  public FirewallruleProperties portRangeEnd(Integer portRangeEnd) {
    
    this.portRangeEnd = portRangeEnd;
    return this;
  }

   /**
   * Defines the end range of the allowed port (from 1 to 65534) if the protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd null to allow all ports.
   * minimum: 1
   * maximum: 65534
   * @return portRangeEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Defines the end range of the allowed port (from 1 to 65534) if the protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd null to allow all ports.")

  public Integer getPortRangeEnd() {
    return portRangeEnd;
  }


  public void setPortRangeEnd(Integer portRangeEnd) {
    this.portRangeEnd = portRangeEnd;
  }



  public FirewallruleProperties portRangeStart(Integer portRangeStart) {
    
    this.portRangeStart = portRangeStart;
    return this;
  }

   /**
   * Defines the start range of the allowed port (from 1 to 65534) if protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd value null to allow all ports.
   * minimum: 1
   * maximum: 65534
   * @return portRangeStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Defines the start range of the allowed port (from 1 to 65534) if protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd value null to allow all ports.")

  public Integer getPortRangeStart() {
    return portRangeStart;
  }


  public void setPortRangeStart(Integer portRangeStart) {
    this.portRangeStart = portRangeStart;
  }



  public FirewallruleProperties protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * The protocol for the rule. Property cannot be modified after it is created (disallowed in update requests).
   * @return protocol
  **/
  @ApiModelProperty(example = "TCP", required = true, value = "The protocol for the rule. Property cannot be modified after it is created (disallowed in update requests).")

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }



  public FirewallruleProperties sourceIp(String sourceIp) {
    
    this.sourceIp = sourceIp;
    return this;
  }

   /**
   * Only traffic originating from the respective IP address (or CIDR block) is allowed. Value null allows traffic from any IP address (according to the selected ipVersion).
   * @return sourceIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.231.113.64", value = "Only traffic originating from the respective IP address (or CIDR block) is allowed. Value null allows traffic from any IP address (according to the selected ipVersion).")

  public String getSourceIp() {
    return sourceIp;
  }


  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }



  public FirewallruleProperties sourceMac(String sourceMac) {
    
    this.sourceMac = sourceMac;
    return this;
  }

   /**
   * Only traffic originating from the respective MAC address is allowed. Valid format: aa:bb:cc:dd:ee:ff. Value null allows traffic from any MAC address.
   * @return sourceMac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00:0a:95:9d:68:16", value = "Only traffic originating from the respective MAC address is allowed. Valid format: aa:bb:cc:dd:ee:ff. Value null allows traffic from any MAC address.")

  public String getSourceMac() {
    return sourceMac;
  }


  public void setSourceMac(String sourceMac) {
    this.sourceMac = sourceMac;
  }



  public FirewallruleProperties targetIp(String targetIp) {
    
    this.targetIp = targetIp;
    return this;
  }

   /**
   * If the target NIC has multiple IP addresses, only the traffic directed to the respective IP address (or CIDR block) of the NIC is allowed. Value null allows traffic to any target IP address (according to the selected ipVersion).
   * @return targetIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.231.113.64", value = "If the target NIC has multiple IP addresses, only the traffic directed to the respective IP address (or CIDR block) of the NIC is allowed. Value null allows traffic to any target IP address (according to the selected ipVersion).")

  public String getTargetIp() {
    return targetIp;
  }


  public void setTargetIp(String targetIp) {
    this.targetIp = targetIp;
  }



  public FirewallruleProperties type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the firewall rule. If not specified, the default INGRESS value is used.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INGRESS", value = "The type of the firewall rule. If not specified, the default INGRESS value is used.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
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
    FirewallruleProperties firewallruleProperties = (FirewallruleProperties) o;
    return Objects.equals(this.icmpCode, firewallruleProperties.icmpCode) && Objects.equals(this.icmpType, firewallruleProperties.icmpType) && Objects.equals(this.ipVersion, firewallruleProperties.ipVersion) && Objects.equals(this.name, firewallruleProperties.name) && Objects.equals(this.portRangeEnd, firewallruleProperties.portRangeEnd) && Objects.equals(this.portRangeStart, firewallruleProperties.portRangeStart) && Objects.equals(this.protocol, firewallruleProperties.protocol) && Objects.equals(this.sourceIp, firewallruleProperties.sourceIp) && Objects.equals(this.sourceMac, firewallruleProperties.sourceMac) && Objects.equals(this.targetIp, firewallruleProperties.targetIp) && Objects.equals(this.type, firewallruleProperties.type);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirewallruleProperties {\n");
    
    sb.append("    icmpCode: ").append(toIndentedString(icmpCode)).append("\n");

    sb.append("    icmpType: ").append(toIndentedString(icmpType)).append("\n");

    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    portRangeEnd: ").append(toIndentedString(portRangeEnd)).append("\n");

    sb.append("    portRangeStart: ").append(toIndentedString(portRangeStart)).append("\n");

    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");

    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");

    sb.append("    sourceMac: ").append(toIndentedString(sourceMac)).append("\n");

    sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");

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



// FirewallruleProperties instantiates a new FirewallruleProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public FirewallruleProperties(ProtocolEnum Protocol) {

	this.protocol = Protocol;
}

public FirewallruleProperties() {
}

}
