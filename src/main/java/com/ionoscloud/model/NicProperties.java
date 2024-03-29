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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NicProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class NicProperties {
  
  public static final String SERIALIZED_NAME_DEVICE_NUMBER = "deviceNumber";
  @SerializedName(SERIALIZED_NAME_DEVICE_NUMBER)
  private Integer deviceNumber;


  public static final String SERIALIZED_NAME_DHCP = "dhcp";
  @SerializedName(SERIALIZED_NAME_DHCP)
  private Boolean dhcp = true;


  public static final String SERIALIZED_NAME_DHCPV6 = "dhcpv6";
  @SerializedName(SERIALIZED_NAME_DHCPV6)
  private Boolean dhcpv6;


  public static final String SERIALIZED_NAME_FIREWALL_ACTIVE = "firewallActive";
  @SerializedName(SERIALIZED_NAME_FIREWALL_ACTIVE)
  private Boolean firewallActive;


  /**
   * The type of firewall rules that will be allowed on the NIC. If not specified, the default INGRESS value is used.
   */
  @JsonAdapter(FirewallTypeEnum.Adapter.class)
  public enum FirewallTypeEnum {
    INGRESS("INGRESS"),
    
    EGRESS("EGRESS"),
    
    BIDIRECTIONAL("BIDIRECTIONAL");

    private String value;

    FirewallTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FirewallTypeEnum fromValue(String value) {

      for (FirewallTypeEnum b : FirewallTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FirewallTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FirewallTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FirewallTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FirewallTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FIREWALL_TYPE = "firewallType";
  @SerializedName(SERIALIZED_NAME_FIREWALL_TYPE)
  private FirewallTypeEnum firewallType;


  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = null;


  public static final String SERIALIZED_NAME_IPV6_CIDR_BLOCK = "ipv6CidrBlock";
  @SerializedName(SERIALIZED_NAME_IPV6_CIDR_BLOCK)
  private String ipv6CidrBlock;


  public static final String SERIALIZED_NAME_IPV6_IPS = "ipv6Ips";
  @SerializedName(SERIALIZED_NAME_IPV6_IPS)
  private List<String> ipv6Ips = null;


  public static final String SERIALIZED_NAME_LAN = "lan";
  @SerializedName(SERIALIZED_NAME_LAN)
  private Integer lan;


  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_PCI_SLOT = "pciSlot";
  @SerializedName(SERIALIZED_NAME_PCI_SLOT)
  private Integer pciSlot;

  

   /**
   * The Logical Unit Number (LUN) of the storage volume. Null if this NIC was created using Cloud API and no DCD changes were performed on the Datacenter.
   * @return deviceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The Logical Unit Number (LUN) of the storage volume. Null if this NIC was created using Cloud API and no DCD changes were performed on the Datacenter.")

  public Integer getDeviceNumber() {
    return deviceNumber;
  }


  public void setDeviceNumber(Integer deviceNumber) {
    this.deviceNumber = deviceNumber;
  }



  public NicProperties dhcp(Boolean dhcp) {
    
    this.dhcp = dhcp;
    return this;
  }

   /**
   * Indicates if the NIC will reserve an IP using DHCP.
   * @return dhcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the NIC will reserve an IP using DHCP.")

  public Boolean getDhcp() {
    return dhcp;
  }


  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
  }



  public NicProperties dhcpv6(Boolean dhcpv6) {
    
    this.dhcpv6 = dhcpv6;
    return this;
  }

   /**
   * Indicates if the NIC will receive an IPv6 using DHCP. It can be set to &#39;true&#39; or &#39;false&#39; only if this NIC is connected to an IPv6 enabled LAN.
   * @return dhcpv6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the NIC will receive an IPv6 using DHCP. It can be set to 'true' or 'false' only if this NIC is connected to an IPv6 enabled LAN.")

  public Boolean getDhcpv6() {
    return dhcpv6;
  }


  public void setDhcpv6(Boolean dhcpv6) {
    this.dhcpv6 = dhcpv6;
  }



  public NicProperties firewallActive(Boolean firewallActive) {
    
    this.firewallActive = firewallActive;
    return this;
  }

   /**
   * Activate or deactivate the firewall. By default, an active firewall without any defined rules will block all incoming network traffic except for the firewall rules that explicitly allows certain protocols, IP addresses and ports.
   * @return firewallActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Activate or deactivate the firewall. By default, an active firewall without any defined rules will block all incoming network traffic except for the firewall rules that explicitly allows certain protocols, IP addresses and ports.")

  public Boolean getFirewallActive() {
    return firewallActive;
  }


  public void setFirewallActive(Boolean firewallActive) {
    this.firewallActive = firewallActive;
  }



  public NicProperties firewallType(FirewallTypeEnum firewallType) {
    
    this.firewallType = firewallType;
    return this;
  }

   /**
   * The type of firewall rules that will be allowed on the NIC. If not specified, the default INGRESS value is used.
   * @return firewallType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INGRESS", value = "The type of firewall rules that will be allowed on the NIC. If not specified, the default INGRESS value is used.")

  public FirewallTypeEnum getFirewallType() {
    return firewallType;
  }


  public void setFirewallType(FirewallTypeEnum firewallType) {
    this.firewallType = firewallType;
  }



  public NicProperties ips(List<String> ips) {
    
    this.ips = ips;
    return this;
  }

  public NicProperties addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<String>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * Collection of IP addresses, assigned to the NIC. Explicitly assigned public IPs need to come from reserved IP blocks. Passing value null or empty array will assign an IP address automatically.
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of IP addresses, assigned to the NIC. Explicitly assigned public IPs need to come from reserved IP blocks. Passing value null or empty array will assign an IP address automatically.")

  public List<String> getIps() {
    return ips;
  }


  public void setIps(List<String> ips) {
    this.ips = ips;
  }



  public NicProperties ipv6CidrBlock(String ipv6CidrBlock) {
    
    this.ipv6CidrBlock = ipv6CidrBlock;
    return this;
  }

   /**
   * If this NIC is connected to an IPv6 enabled LAN then this property contains the /80 IPv6 CIDR block of the NIC. If you leave this property &#39;null&#39; when adding a NIC to an IPv6-enabled LAN, then an IPv6 CIDR block will automatically be assigned to the NIC, but you can also specify an /80 IPv6 CIDR block for the NIC on your own, which must be inside the /64 IPv6 CIDR block of the LAN and unique. This value can only be set, if the LAN already has an IPv6 CIDR block assigned. An IPv6-enabled LAN is limited to a maximum of 65,536 NICs.
   * @return ipv6CidrBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2001:db8:b06d:8f5a:0609::/80", value = "If this NIC is connected to an IPv6 enabled LAN then this property contains the /80 IPv6 CIDR block of the NIC. If you leave this property 'null' when adding a NIC to an IPv6-enabled LAN, then an IPv6 CIDR block will automatically be assigned to the NIC, but you can also specify an /80 IPv6 CIDR block for the NIC on your own, which must be inside the /64 IPv6 CIDR block of the LAN and unique. This value can only be set, if the LAN already has an IPv6 CIDR block assigned. An IPv6-enabled LAN is limited to a maximum of 65,536 NICs.")

  public String getIpv6CidrBlock() {
    return ipv6CidrBlock;
  }


  public void setIpv6CidrBlock(String ipv6CidrBlock) {
    this.ipv6CidrBlock = ipv6CidrBlock;
  }



  public NicProperties ipv6Ips(List<String> ipv6Ips) {
    
    this.ipv6Ips = ipv6Ips;
    return this;
  }

  public NicProperties addIpv6IpsItem(String ipv6IpsItem) {
    if (this.ipv6Ips == null) {
      this.ipv6Ips = new ArrayList<String>();
    }
    this.ipv6Ips.add(ipv6IpsItem);
    return this;
  }

   /**
   * If this NIC is connected to an IPv6 enabled LAN then this property contains the IPv6 IP addresses of the NIC. The maximum number of IPv6 IP addresses per NIC is 50, if you need more, contact support. If you leave this property &#39;null&#39; when adding a NIC, when changing the NIC&#39;s IPv6 CIDR block, when changing the LAN&#39;s IPv6 CIDR block or when moving the NIC to a different IPv6 enabled LAN, then we will automatically assign the same number of IPv6 addresses which you had before from the NICs new CIDR block. If you leave this property &#39;null&#39; while not changing the CIDR block, the IPv6 IP addresses won&#39;t be changed either. You can also provide your own self choosen IPv6 addresses, which then must be inside the IPv6 CIDR block of this NIC.
   * @return ipv6Ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[2001:db8:b06d:8f5a:0609::1]", value = "If this NIC is connected to an IPv6 enabled LAN then this property contains the IPv6 IP addresses of the NIC. The maximum number of IPv6 IP addresses per NIC is 50, if you need more, contact support. If you leave this property 'null' when adding a NIC, when changing the NIC's IPv6 CIDR block, when changing the LAN's IPv6 CIDR block or when moving the NIC to a different IPv6 enabled LAN, then we will automatically assign the same number of IPv6 addresses which you had before from the NICs new CIDR block. If you leave this property 'null' while not changing the CIDR block, the IPv6 IP addresses won't be changed either. You can also provide your own self choosen IPv6 addresses, which then must be inside the IPv6 CIDR block of this NIC.")

  public List<String> getIpv6Ips() {
    return ipv6Ips;
  }


  public void setIpv6Ips(List<String> ipv6Ips) {
    this.ipv6Ips = ipv6Ips;
  }



  public NicProperties lan(Integer lan) {
    
    this.lan = lan;
    return this;
  }

   /**
   * The LAN ID the NIC will be on. If the LAN ID does not exist, it will be implicitly created.
   * @return lan
  **/
  @ApiModelProperty(example = "2", required = true, value = "The LAN ID the NIC will be on. If the LAN ID does not exist, it will be implicitly created.")

  public Integer getLan() {
    return lan;
  }


  public void setLan(Integer lan) {
    this.lan = lan;
  }



   /**
   * The MAC address of the NIC.
   * @return mac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00:0a:95:9d:68:16", value = "The MAC address of the NIC.")

  public String getMac() {
    return mac;
  }


  public void setMac(String mac) {
    this.mac = mac;
  }



  public NicProperties name(String name) {
    
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



   /**
   * The PCI slot number for the NIC.
   * @return pciSlot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The PCI slot number for the NIC.")

  public Integer getPciSlot() {
    return pciSlot;
  }


  public void setPciSlot(Integer pciSlot) {
    this.pciSlot = pciSlot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NicProperties nicProperties = (NicProperties) o;
    return Objects.equals(this.deviceNumber, nicProperties.deviceNumber) && Objects.equals(this.dhcp, nicProperties.dhcp) && Objects.equals(this.dhcpv6, nicProperties.dhcpv6) && Objects.equals(this.firewallActive, nicProperties.firewallActive) && Objects.equals(this.firewallType, nicProperties.firewallType) && Objects.equals(this.ips, nicProperties.ips) && Objects.equals(this.ipv6CidrBlock, nicProperties.ipv6CidrBlock) && Objects.equals(this.ipv6Ips, nicProperties.ipv6Ips) && Objects.equals(this.lan, nicProperties.lan) && Objects.equals(this.mac, nicProperties.mac) && Objects.equals(this.name, nicProperties.name) && Objects.equals(this.pciSlot, nicProperties.pciSlot) && true;
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NicProperties {\n");
    
    sb.append("    deviceNumber: ").append(toIndentedString(deviceNumber)).append("\n");

    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");

    sb.append("    dhcpv6: ").append(toIndentedString(dhcpv6)).append("\n");

    sb.append("    firewallActive: ").append(toIndentedString(firewallActive)).append("\n");

    sb.append("    firewallType: ").append(toIndentedString(firewallType)).append("\n");

    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");

    sb.append("    ipv6CidrBlock: ").append(toIndentedString(ipv6CidrBlock)).append("\n");

    sb.append("    ipv6Ips: ").append(toIndentedString(ipv6Ips)).append("\n");

    sb.append("    lan: ").append(toIndentedString(lan)).append("\n");

    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    pciSlot: ").append(toIndentedString(pciSlot)).append("\n");
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



// NicProperties instantiates a new NicProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public NicProperties(Integer Lan) {

	this.lan = Lan;
}

public NicProperties() {
}

}
