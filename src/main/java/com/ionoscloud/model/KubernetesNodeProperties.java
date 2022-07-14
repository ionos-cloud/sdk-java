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
 * KubernetesNodeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-14T13:53:14.995Z[Etc/UTC]")

public class KubernetesNodeProperties {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_PUBLIC_I_P = "publicIP";
  @SerializedName(SERIALIZED_NAME_PUBLIC_I_P)
  private String publicIP;


  public static final String SERIALIZED_NAME_PRIVATE_I_P = "privateIP";
  @SerializedName(SERIALIZED_NAME_PRIVATE_I_P)
  private String privateIP;


  public static final String SERIALIZED_NAME_K8S_VERSION = "k8sVersion";
  @SerializedName(SERIALIZED_NAME_K8S_VERSION)
  private String k8sVersion;

  

  public KubernetesNodeProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A Kubernetes node name.
   * @return name
  **/
  @ApiModelProperty(example = "k8s-node", required = true, value = "A Kubernetes node name.")

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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192.168.23.2", value = "A valid public IP.")

  public String getPublicIP() {
    return publicIP;
  }


  public void setPublicIP(String publicIP) {
    this.publicIP = publicIP;
  }



  public KubernetesNodeProperties privateIP(String privateIP) {
    
    this.privateIP = privateIP;
    return this;
  }

   /**
   * A valid private IP.
   * @return privateIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192.168.23.2", value = "A valid private IP.")

  public String getPrivateIP() {
    return privateIP;
  }


  public void setPrivateIP(String privateIP) {
    this.privateIP = privateIP;
  }



  public KubernetesNodeProperties k8sVersion(String k8sVersion) {
    
    this.k8sVersion = k8sVersion;
    return this;
  }

   /**
   * The Kubernetes version the nodepool is running. This imposes restrictions on what Kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all Kubernetes versions are viable upgrade targets for all prior versions.
   * @return k8sVersion
  **/
  @ApiModelProperty(example = "1.15.4", required = true, value = "The Kubernetes version the nodepool is running. This imposes restrictions on what Kubernetes versions can be run in a cluster's nodepools. Additionally, not all Kubernetes versions are viable upgrade targets for all prior versions.")

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
    return Objects.equals(this.name, kubernetesNodeProperties.name) && Objects.equals(this.publicIP, kubernetesNodeProperties.publicIP) && Objects.equals(this.privateIP, kubernetesNodeProperties.privateIP) && Objects.equals(this.k8sVersion, kubernetesNodeProperties.k8sVersion);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesNodeProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");

    sb.append("    privateIP: ").append(toIndentedString(privateIP)).append("\n");

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

