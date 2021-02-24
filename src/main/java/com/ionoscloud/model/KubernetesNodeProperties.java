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
 * KubernetesNodeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-24T12:41:13.594Z[Etc/UTC]")

public class KubernetesNodeProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PUBLIC_I_P = "publicIP";
  @SerializedName(SERIALIZED_NAME_PUBLIC_I_P)
  private String publicIP;

  public static final String SERIALIZED_NAME_K8S_VERSION = "k8sVersion";
  @SerializedName(SERIALIZED_NAME_K8S_VERSION)
  private String k8sVersion;


  public KubernetesNodeProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A Kubernetes Node Name.
   * @return name
  **/
  @ApiModelProperty(example = "k8s-node", required = true, value = "A Kubernetes Node Name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KubernetesNodeProperties publicIP(String publicIP) {
    
    this.publicIP = publicIP;
    return this;
  }

   /**
   * A valid public IP.
   * @return publicIP
  **/
  @ApiModelProperty(example = "192.168.23.2", required = true, value = "A valid public IP.")

  public String getPublicIP() {
    return publicIP;
  }


  public void setPublicIP(String publicIP) {
    this.publicIP = publicIP;
  }


  public KubernetesNodeProperties k8sVersion(String k8sVersion) {
    
    this.k8sVersion = k8sVersion;
    return this;
  }

   /**
   * The kubernetes version in which a nodepool is running. This imposes restrictions on what kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all kubernetes versions are viable upgrade targets for all prior versions.
   * @return k8sVersion
  **/
  @ApiModelProperty(example = "1.15.4", required = true, value = "The kubernetes version in which a nodepool is running. This imposes restrictions on what kubernetes versions can be run in a cluster's nodepools. Additionally, not all kubernetes versions are viable upgrade targets for all prior versions.")

  public String getK8sVersion() {
    return k8sVersion;
  }


  public void setK8sVersion(String k8sVersion) {
    this.k8sVersion = k8sVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesNodeProperties kubernetesNodeProperties = (KubernetesNodeProperties) o;
    return Objects.equals(this.name, kubernetesNodeProperties.name) && Objects.equals(this.publicIP, kubernetesNodeProperties.publicIP) && Objects.equals(this.k8sVersion, kubernetesNodeProperties.k8sVersion);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesNodeProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
    sb.append("    k8sVersion: ").append(toIndentedString(k8sVersion)).append("\n");
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

