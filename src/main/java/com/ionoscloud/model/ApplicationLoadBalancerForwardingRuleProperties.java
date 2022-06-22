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
import com.ionoscloud.model.ApplicationLoadBalancerHttpRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * ApplicationLoadBalancerForwardingRuleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T09:00:27.688Z[Etc/UTC]")

public class ApplicationLoadBalancerForwardingRuleProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Balancing protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    HTTP("HTTP");

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

  public static final String SERIALIZED_NAME_LISTENER_IP = "listenerIp";
  @SerializedName(SERIALIZED_NAME_LISTENER_IP)
  private String listenerIp;

  public static final String SERIALIZED_NAME_LISTENER_PORT = "listenerPort";
  @SerializedName(SERIALIZED_NAME_LISTENER_PORT)
  private Integer listenerPort;

  public static final String SERIALIZED_NAME_CLIENT_TIMEOUT = "clientTimeout";
  @SerializedName(SERIALIZED_NAME_CLIENT_TIMEOUT)
  private Integer clientTimeout;

  public static final String SERIALIZED_NAME_SERVER_CERTIFICATES = "serverCertificates";
  @SerializedName(SERIALIZED_NAME_SERVER_CERTIFICATES)
  private List<UUID> serverCertificates = null;

  public static final String SERIALIZED_NAME_HTTP_RULES = "httpRules";
  @SerializedName(SERIALIZED_NAME_HTTP_RULES)
  private List<ApplicationLoadBalancerHttpRule> httpRules = null;


  public ApplicationLoadBalancerForwardingRuleProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Application Load Balancer forwarding rule.
   * @return name
  **/
  @ApiModelProperty(example = "My Application Load Balancer forwarding rule", required = true, value = "The name of the Application Load Balancer forwarding rule.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationLoadBalancerForwardingRuleProperties protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Balancing protocol
   * @return protocol
  **/
  @ApiModelProperty(example = "HTTP", required = true, value = "Balancing protocol")

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public ApplicationLoadBalancerForwardingRuleProperties listenerIp(String listenerIp) {
    
    this.listenerIp = listenerIp;
    return this;
  }

   /**
   * Listening (inbound) IP
   * @return listenerIp
  **/
  @ApiModelProperty(example = "81.173.1.2", required = true, value = "Listening (inbound) IP")

  public String getListenerIp() {
    return listenerIp;
  }


  public void setListenerIp(String listenerIp) {
    this.listenerIp = listenerIp;
  }


  public ApplicationLoadBalancerForwardingRuleProperties listenerPort(Integer listenerPort) {
    
    this.listenerPort = listenerPort;
    return this;
  }

   /**
   * Listening (inbound) port number; valid range is 1 to 65535.
   * @return listenerPort
  **/
  @ApiModelProperty(example = "8080", required = true, value = "Listening (inbound) port number; valid range is 1 to 65535.")

  public Integer getListenerPort() {
    return listenerPort;
  }


  public void setListenerPort(Integer listenerPort) {
    this.listenerPort = listenerPort;
  }


  public ApplicationLoadBalancerForwardingRuleProperties clientTimeout(Integer clientTimeout) {
    
    this.clientTimeout = clientTimeout;
    return this;
  }

   /**
   * The maximum time in milliseconds to wait for the client to acknowledge or send data; default is 50,000 (50 seconds).
   * @return clientTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "The maximum time in milliseconds to wait for the client to acknowledge or send data; default is 50,000 (50 seconds).")

  public Integer getClientTimeout() {
    return clientTimeout;
  }


  public void setClientTimeout(Integer clientTimeout) {
    this.clientTimeout = clientTimeout;
  }


  public ApplicationLoadBalancerForwardingRuleProperties serverCertificates(List<UUID> serverCertificates) {
    
    this.serverCertificates = serverCertificates;
    return this;
  }

  public ApplicationLoadBalancerForwardingRuleProperties addServerCertificatesItem(UUID serverCertificatesItem) {
    if (this.serverCertificates == null) {
      this.serverCertificates = new ArrayList<UUID>();
    }
    this.serverCertificates.add(serverCertificatesItem);
    return this;
  }

   /**
   * Array of items in the collection.
   * @return serverCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[3839d24f-57bd-408e-96ee-8da3d2db5a03, a6b4f7d5-b23a-4f53-b83e-8a6528ab4612]", value = "Array of items in the collection.")

  public List<UUID> getServerCertificates() {
    return serverCertificates;
  }


  public void setServerCertificates(List<UUID> serverCertificates) {
    this.serverCertificates = serverCertificates;
  }


  public ApplicationLoadBalancerForwardingRuleProperties httpRules(List<ApplicationLoadBalancerHttpRule> httpRules) {
    
    this.httpRules = httpRules;
    return this;
  }

  public ApplicationLoadBalancerForwardingRuleProperties addHttpRulesItem(ApplicationLoadBalancerHttpRule httpRulesItem) {
    if (this.httpRules == null) {
      this.httpRules = new ArrayList<ApplicationLoadBalancerHttpRule>();
    }
    this.httpRules.add(httpRulesItem);
    return this;
  }

   /**
   * An array of items in the collection. The original order of rules is perserved during processing, except for Forward-type rules are processed after the rules with other action defined. The relative order of Forward-type rules is also preserved during the processing.
   * @return httpRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of items in the collection. The original order of rules is perserved during processing, except for Forward-type rules are processed after the rules with other action defined. The relative order of Forward-type rules is also preserved during the processing.")

  public List<ApplicationLoadBalancerHttpRule> getHttpRules() {
    return httpRules;
  }


  public void setHttpRules(List<ApplicationLoadBalancerHttpRule> httpRules) {
    this.httpRules = httpRules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationLoadBalancerForwardingRuleProperties applicationLoadBalancerForwardingRuleProperties = (ApplicationLoadBalancerForwardingRuleProperties) o;
    return Objects.equals(this.name, applicationLoadBalancerForwardingRuleProperties.name) && Objects.equals(this.protocol, applicationLoadBalancerForwardingRuleProperties.protocol) && Objects.equals(this.listenerIp, applicationLoadBalancerForwardingRuleProperties.listenerIp) && Objects.equals(this.listenerPort, applicationLoadBalancerForwardingRuleProperties.listenerPort) && Objects.equals(this.clientTimeout, applicationLoadBalancerForwardingRuleProperties.clientTimeout) && Objects.equals(this.serverCertificates, applicationLoadBalancerForwardingRuleProperties.serverCertificates) && Objects.equals(this.httpRules, applicationLoadBalancerForwardingRuleProperties.httpRules);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationLoadBalancerForwardingRuleProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    listenerIp: ").append(toIndentedString(listenerIp)).append("\n");
    sb.append("    listenerPort: ").append(toIndentedString(listenerPort)).append("\n");
    sb.append("    clientTimeout: ").append(toIndentedString(clientTimeout)).append("\n");
    sb.append("    serverCertificates: ").append(toIndentedString(serverCertificates)).append("\n");
    sb.append("    httpRules: ").append(toIndentedString(httpRules)).append("\n");
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
