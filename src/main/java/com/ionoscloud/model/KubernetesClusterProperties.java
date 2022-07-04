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
import com.ionoscloud.model.KubernetesMaintenanceWindow;
import com.ionoscloud.model.S3Bucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * KubernetesClusterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T09:11:50.011Z[Etc/UTC]")

public class KubernetesClusterProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_K8S_VERSION = "k8sVersion";
  @SerializedName(SERIALIZED_NAME_K8S_VERSION)
  private String k8sVersion;

  public static final String SERIALIZED_NAME_MAINTENANCE_WINDOW = "maintenanceWindow";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_WINDOW)
  private KubernetesMaintenanceWindow maintenanceWindow;

  public static final String SERIALIZED_NAME_AVAILABLE_UPGRADE_VERSIONS = "availableUpgradeVersions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_UPGRADE_VERSIONS)
  private List<String> availableUpgradeVersions = null;

  public static final String SERIALIZED_NAME_VIABLE_NODE_POOL_VERSIONS = "viableNodePoolVersions";
  @SerializedName(SERIALIZED_NAME_VIABLE_NODE_POOL_VERSIONS)
  private List<String> viableNodePoolVersions = null;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public = true;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_IP = "natGatewayIp";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_IP)
  private String natGatewayIp;

  public static final String SERIALIZED_NAME_NODE_SUBNET = "nodeSubnet";
  @SerializedName(SERIALIZED_NAME_NODE_SUBNET)
  private String nodeSubnet;

  public static final String SERIALIZED_NAME_API_SUBNET_ALLOW_LIST = "apiSubnetAllowList";
  @SerializedName(SERIALIZED_NAME_API_SUBNET_ALLOW_LIST)
  private List<String> apiSubnetAllowList = null;

  public static final String SERIALIZED_NAME_S3_BUCKETS = "s3Buckets";
  @SerializedName(SERIALIZED_NAME_S3_BUCKETS)
  private List<S3Bucket> s3Buckets = null;


  public KubernetesClusterProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A Kubernetes cluster name. Valid Kubernetes cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * @return name
  **/
  @ApiModelProperty(example = "k8s", required = true, value = "A Kubernetes cluster name. Valid Kubernetes cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KubernetesClusterProperties k8sVersion(String k8sVersion) {
    
    this.k8sVersion = k8sVersion;
    return this;
  }

   /**
   * The Kubernetes version the cluster is running. This imposes restrictions on what Kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all Kubernetes versions are viable upgrade targets for all prior versions.
   * @return k8sVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.15.4", value = "The Kubernetes version the cluster is running. This imposes restrictions on what Kubernetes versions can be run in a cluster's nodepools. Additionally, not all Kubernetes versions are viable upgrade targets for all prior versions.")

  public String getK8sVersion() {
    return k8sVersion;
  }


  public void setK8sVersion(String k8sVersion) {
    this.k8sVersion = k8sVersion;
  }


  public KubernetesClusterProperties maintenanceWindow(KubernetesMaintenanceWindow maintenanceWindow) {
    
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KubernetesMaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }


  public void setMaintenanceWindow(KubernetesMaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }


  public KubernetesClusterProperties availableUpgradeVersions(List<String> availableUpgradeVersions) {
    
    this.availableUpgradeVersions = availableUpgradeVersions;
    return this;
  }

  public KubernetesClusterProperties addAvailableUpgradeVersionsItem(String availableUpgradeVersionsItem) {
    if (this.availableUpgradeVersions == null) {
      this.availableUpgradeVersions = new ArrayList<String>();
    }
    this.availableUpgradeVersions.add(availableUpgradeVersionsItem);
    return this;
  }

   /**
   * List of available versions for upgrading the cluster
   * @return availableUpgradeVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1.16.4, 1.17.7]", value = "List of available versions for upgrading the cluster")

  public List<String> getAvailableUpgradeVersions() {
    return availableUpgradeVersions;
  }


  public void setAvailableUpgradeVersions(List<String> availableUpgradeVersions) {
    this.availableUpgradeVersions = availableUpgradeVersions;
  }


  public KubernetesClusterProperties viableNodePoolVersions(List<String> viableNodePoolVersions) {
    
    this.viableNodePoolVersions = viableNodePoolVersions;
    return this;
  }

  public KubernetesClusterProperties addViableNodePoolVersionsItem(String viableNodePoolVersionsItem) {
    if (this.viableNodePoolVersions == null) {
      this.viableNodePoolVersions = new ArrayList<String>();
    }
    this.viableNodePoolVersions.add(viableNodePoolVersionsItem);
    return this;
  }

   /**
   * List of versions that may be used for node pools under this cluster
   * @return viableNodePoolVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1.17.7, 1.18.2]", value = "List of versions that may be used for node pools under this cluster")

  public List<String> getViableNodePoolVersions() {
    return viableNodePoolVersions;
  }


  public void setViableNodePoolVersions(List<String> viableNodePoolVersions) {
    this.viableNodePoolVersions = viableNodePoolVersions;
  }


  public KubernetesClusterProperties _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * The indicator if the cluster is public or private. Be aware that setting it to false is currently in beta phase.
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The indicator if the cluster is public or private. Be aware that setting it to false is currently in beta phase.")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public KubernetesClusterProperties location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The location of the cluster if the cluster is private. This property is immutable. The location must be enabled for your contract or you must have a Datacenter within that location. This attribute is mandatory if the cluster is private.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de/fra", value = "The location of the cluster if the cluster is private. This property is immutable. The location must be enabled for your contract or you must have a Datacenter within that location. This attribute is mandatory if the cluster is private.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public KubernetesClusterProperties natGatewayIp(String natGatewayIp) {
    
    this.natGatewayIp = natGatewayIp;
    return this;
  }

   /**
   * The nat gateway IP of the cluster if the cluster is private.
   * @return natGatewayIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "198.51.100.100", value = "The nat gateway IP of the cluster if the cluster is private.")

  public String getNatGatewayIp() {
    return natGatewayIp;
  }


  public void setNatGatewayIp(String natGatewayIp) {
    this.natGatewayIp = natGatewayIp;
  }


  public KubernetesClusterProperties nodeSubnet(String nodeSubnet) {
    
    this.nodeSubnet = nodeSubnet;
    return this;
  }

   /**
   * The node subnet of the cluster if the cluster is private.
   * @return nodeSubnet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192.168.0.0/16", value = "The node subnet of the cluster if the cluster is private.")

  public String getNodeSubnet() {
    return nodeSubnet;
  }


  public void setNodeSubnet(String nodeSubnet) {
    this.nodeSubnet = nodeSubnet;
  }


  public KubernetesClusterProperties apiSubnetAllowList(List<String> apiSubnetAllowList) {
    
    this.apiSubnetAllowList = apiSubnetAllowList;
    return this;
  }

  public KubernetesClusterProperties addApiSubnetAllowListItem(String apiSubnetAllowListItem) {
    if (this.apiSubnetAllowList == null) {
      this.apiSubnetAllowList = new ArrayList<String>();
    }
    this.apiSubnetAllowList.add(apiSubnetAllowListItem);
    return this;
  }

   /**
   * Access to the K8s API server is restricted to these CIDRs. Traffic, internal to the cluster, is not affected by this restriction. If no allowlist is specified, access is not restricted. If an IP without subnet mask is provided, the default value is used: 32 for IPv4 and 128 for IPv6.
   * @return apiSubnetAllowList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1.2.3.4/32, 2002::1234:abcd:ffff:c0a8:101/64, 1.2.3.4, 2002::1234:abcd:ffff:c0a8:101]", value = "Access to the K8s API server is restricted to these CIDRs. Traffic, internal to the cluster, is not affected by this restriction. If no allowlist is specified, access is not restricted. If an IP without subnet mask is provided, the default value is used: 32 for IPv4 and 128 for IPv6.")

  public List<String> getApiSubnetAllowList() {
    return apiSubnetAllowList;
  }


  public void setApiSubnetAllowList(List<String> apiSubnetAllowList) {
    this.apiSubnetAllowList = apiSubnetAllowList;
  }


  public KubernetesClusterProperties s3Buckets(List<S3Bucket> s3Buckets) {
    
    this.s3Buckets = s3Buckets;
    return this;
  }

  public KubernetesClusterProperties addS3BucketsItem(S3Bucket s3BucketsItem) {
    if (this.s3Buckets == null) {
      this.s3Buckets = new ArrayList<S3Bucket>();
    }
    this.s3Buckets.add(s3BucketsItem);
    return this;
  }

   /**
   * List of S3 bucket configured for K8s usage. For now it contains only an S3 bucket used to store K8s API audit logs
   * @return s3Buckets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of S3 bucket configured for K8s usage. For now it contains only an S3 bucket used to store K8s API audit logs")

  public List<S3Bucket> getS3Buckets() {
    return s3Buckets;
  }


  public void setS3Buckets(List<S3Bucket> s3Buckets) {
    this.s3Buckets = s3Buckets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesClusterProperties kubernetesClusterProperties = (KubernetesClusterProperties) o;
    return Objects.equals(this.name, kubernetesClusterProperties.name) && Objects.equals(this.k8sVersion, kubernetesClusterProperties.k8sVersion) && Objects.equals(this.maintenanceWindow, kubernetesClusterProperties.maintenanceWindow) && Objects.equals(this.availableUpgradeVersions, kubernetesClusterProperties.availableUpgradeVersions) && Objects.equals(this.viableNodePoolVersions, kubernetesClusterProperties.viableNodePoolVersions) && Objects.equals(this._public, kubernetesClusterProperties._public) && Objects.equals(this.location, kubernetesClusterProperties.location) && Objects.equals(this.natGatewayIp, kubernetesClusterProperties.natGatewayIp) && Objects.equals(this.nodeSubnet, kubernetesClusterProperties.nodeSubnet) && Objects.equals(this.apiSubnetAllowList, kubernetesClusterProperties.apiSubnetAllowList) && Objects.equals(this.s3Buckets, kubernetesClusterProperties.s3Buckets);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesClusterProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    k8sVersion: ").append(toIndentedString(k8sVersion)).append("\n");
    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
    sb.append("    availableUpgradeVersions: ").append(toIndentedString(availableUpgradeVersions)).append("\n");
    sb.append("    viableNodePoolVersions: ").append(toIndentedString(viableNodePoolVersions)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    natGatewayIp: ").append(toIndentedString(natGatewayIp)).append("\n");
    sb.append("    nodeSubnet: ").append(toIndentedString(nodeSubnet)).append("\n");
    sb.append("    apiSubnetAllowList: ").append(toIndentedString(apiSubnetAllowList)).append("\n");
    sb.append("    s3Buckets: ").append(toIndentedString(s3Buckets)).append("\n");
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

