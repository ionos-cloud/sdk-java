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
 * TargetGroupTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class TargetGroupTarget {
  
  public static final String SERIALIZED_NAME_HEALTH_CHECK_ENABLED = "healthCheckEnabled";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_ENABLED)
  private Boolean healthCheckEnabled;


  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;


  public static final String SERIALIZED_NAME_MAINTENANCE_ENABLED = "maintenanceEnabled";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_ENABLED)
  private Boolean maintenanceEnabled;


  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;


  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  /**
   * ProxyProtocol is used to set the proxy protocol version.
   */
  @JsonAdapter(ProxyProtocolEnum.Adapter.class)
  public enum ProxyProtocolEnum {
    NONE("none"),
    
    V1("v1"),
    
    V2("v2"),
    
    V2SSL("v2ssl");

    private String value;

    ProxyProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProxyProtocolEnum fromValue(String value) {

      for (ProxyProtocolEnum b : ProxyProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProxyProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProxyProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProxyProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProxyProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROXY_PROTOCOL = "proxyProtocol";
  @SerializedName(SERIALIZED_NAME_PROXY_PROTOCOL)
  private ProxyProtocolEnum proxyProtocol = ProxyProtocolEnum.NONE;

  

  public TargetGroupTarget healthCheckEnabled(Boolean healthCheckEnabled) {
    
    this.healthCheckEnabled = healthCheckEnabled;
    return this;
  }

   /**
   * When the health check is enabled, the target is available only when it accepts regular TCP or HTTP connection attempts for state checking. The state check consists of one connection attempt with the target&#39;s address and port. The default value is &#39;TRUE&#39;.
   * @return healthCheckEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the health check is enabled, the target is available only when it accepts regular TCP or HTTP connection attempts for state checking. The state check consists of one connection attempt with the target's address and port. The default value is 'TRUE'.")

  public Boolean getHealthCheckEnabled() {
    return healthCheckEnabled;
  }


  public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
    this.healthCheckEnabled = healthCheckEnabled;
  }



  public TargetGroupTarget ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * The IP address of the balanced target.
   * @return ip
  **/
  @ApiModelProperty(example = "22.231.2.2", required = true, value = "The IP address of the balanced target.")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }



  public TargetGroupTarget maintenanceEnabled(Boolean maintenanceEnabled) {
    
    this.maintenanceEnabled = maintenanceEnabled;
    return this;
  }

   /**
   * When the maintenance mode is enabled, the target is prevented from receiving traffic; the default value is &#39;FALSE&#39;.
   * @return maintenanceEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the maintenance mode is enabled, the target is prevented from receiving traffic; the default value is 'FALSE'.")

  public Boolean getMaintenanceEnabled() {
    return maintenanceEnabled;
  }


  public void setMaintenanceEnabled(Boolean maintenanceEnabled) {
    this.maintenanceEnabled = maintenanceEnabled;
  }



  public TargetGroupTarget port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port of the balanced target service; the valid range is 1 to 65535.
   * @return port
  **/
  @ApiModelProperty(example = "8080", required = true, value = "The port of the balanced target service; the valid range is 1 to 65535.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }



  public TargetGroupTarget weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * The traffic is distributed proportionally to target weight, which is the ratio of the total weight of all targets. A target with higher weight receives a larger share of traffic. The valid range is from 0 to 256; the default value is &#39;1&#39;. Targets with a weight of &#39;0&#39; do not participate in load balancing but still accept persistent connections. We recommend using values in the middle range to leave room for later adjustments.
   * @return weight
  **/
  @ApiModelProperty(example = "123", required = true, value = "The traffic is distributed proportionally to target weight, which is the ratio of the total weight of all targets. A target with higher weight receives a larger share of traffic. The valid range is from 0 to 256; the default value is '1'. Targets with a weight of '0' do not participate in load balancing but still accept persistent connections. We recommend using values in the middle range to leave room for later adjustments.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }



  public TargetGroupTarget proxyProtocol(ProxyProtocolEnum proxyProtocol) {
    
    this.proxyProtocol = proxyProtocol;
    return this;
  }

   /**
   * ProxyProtocol is used to set the proxy protocol version.
   * @return proxyProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ProxyProtocol is used to set the proxy protocol version.")

  public ProxyProtocolEnum getProxyProtocol() {
    return proxyProtocol;
  }


  public void setProxyProtocol(ProxyProtocolEnum proxyProtocol) {
    this.proxyProtocol = proxyProtocol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupTarget targetGroupTarget = (TargetGroupTarget) o;
    return Objects.equals(this.healthCheckEnabled, targetGroupTarget.healthCheckEnabled) && Objects.equals(this.ip, targetGroupTarget.ip) && Objects.equals(this.maintenanceEnabled, targetGroupTarget.maintenanceEnabled) && Objects.equals(this.port, targetGroupTarget.port) && Objects.equals(this.weight, targetGroupTarget.weight) && Objects.equals(this.proxyProtocol, targetGroupTarget.proxyProtocol);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupTarget {\n");
    
    sb.append("    healthCheckEnabled: ").append(toIndentedString(healthCheckEnabled)).append("\n");

    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");

    sb.append("    maintenanceEnabled: ").append(toIndentedString(maintenanceEnabled)).append("\n");

    sb.append("    port: ").append(toIndentedString(port)).append("\n");

    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");

    sb.append("    proxyProtocol: ").append(toIndentedString(proxyProtocol)).append("\n");
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



// TargetGroupTarget instantiates a new TargetGroupTarget object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public TargetGroupTarget(String Ip, Integer Port, Integer Weight) {

	this.ip = Ip;
	this.port = Port;
	this.weight = Weight;
}

public TargetGroupTarget() {
}

}
