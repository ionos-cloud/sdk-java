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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:52:45.187Z[Etc/UTC]")

public class NicProperties {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;


  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = null;


  public static final String SERIALIZED_NAME_DHCP = "dhcp";
  @SerializedName(SERIALIZED_NAME_DHCP)
  private Boolean dhcp;


  public static final String SERIALIZED_NAME_LAN = "lan";
  @SerializedName(SERIALIZED_NAME_LAN)
  private Integer lan;


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


  public static final String SERIALIZED_NAME_DEVICE_NUMBER = "deviceNumber";
  @SerializedName(SERIALIZED_NAME_DEVICE_NUMBER)
  private Integer deviceNumber;


  public static final String SERIALIZED_NAME_PCI_SLOT = "pciSlot";
  @SerializedName(SERIALIZED_NAME_PCI_SLOT)
  private Integer pciSlot;

  

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
    return Objects.equals(this.name, nicProperties.name) && Objects.equals(this.mac, nicProperties.mac) && Objects.equals(this.ips, nicProperties.ips) && Objects.equals(this.dhcp, nicProperties.dhcp) && Objects.equals(this.lan, nicProperties.lan) && Objects.equals(this.firewallActive, nicProperties.firewallActive) && Objects.equals(this.firewallType, nicProperties.firewallType) && Objects.equals(this.deviceNumber, nicProperties.deviceNumber) && Objects.equals(this.pciSlot, nicProperties.pciSlot);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NicProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");

    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");

    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");

    sb.append("    lan: ").append(toIndentedString(lan)).append("\n");

    sb.append("    firewallActive: ").append(toIndentedString(firewallActive)).append("\n");

    sb.append("    firewallType: ").append(toIndentedString(firewallType)).append("\n");

    sb.append("    deviceNumber: ").append(toIndentedString(deviceNumber)).append("\n");

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

}

