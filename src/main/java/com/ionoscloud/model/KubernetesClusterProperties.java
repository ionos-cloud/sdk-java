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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T11:16:05.486Z[Etc/UTC]")

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
   * A Kubernetes Cluster Name. Valid Kubernetes Cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * @return name
  **/
  @ApiModelProperty(example = "k8s", required = true, value = "A Kubernetes Cluster Name. Valid Kubernetes Cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.")

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
   * The kubernetes version in which a cluster is running. This imposes restrictions on what kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all kubernetes versions are viable upgrade targets for all prior versions.
   * @return k8sVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.15.4", value = "The kubernetes version in which a cluster is running. This imposes restrictions on what kubernetes versions can be run in a cluster's nodepools. Additionally, not all kubernetes versions are viable upgrade targets for all prior versions.")

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
   * Access to the K8s API server is restricted to these CIDRs. Cluster-internal traffic is not affected by this restriction. If no allowlist is specified, access is not restricted. If an IP without subnet mask is provided, the default value will be used: 32 for IPv4 and 128 for IPv6.
   * @return apiSubnetAllowList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1.2.3.4/32, 2002::1234:abcd:ffff:c0a8:101/64, 1.2.3.4, 2002::1234:abcd:ffff:c0a8:101]", value = "Access to the K8s API server is restricted to these CIDRs. Cluster-internal traffic is not affected by this restriction. If no allowlist is specified, access is not restricted. If an IP without subnet mask is provided, the default value will be used: 32 for IPv4 and 128 for IPv6.")

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
   * List of S3 bucket configured for K8s usage. For now it contains only one S3 bucket used to store K8s API audit logs
   * @return s3Buckets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of S3 bucket configured for K8s usage. For now it contains only one S3 bucket used to store K8s API audit logs")

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
    return Objects.equals(this.name, kubernetesClusterProperties.name) && Objects.equals(this.k8sVersion, kubernetesClusterProperties.k8sVersion) && Objects.equals(this.maintenanceWindow, kubernetesClusterProperties.maintenanceWindow) && Objects.equals(this.availableUpgradeVersions, kubernetesClusterProperties.availableUpgradeVersions) && Objects.equals(this.viableNodePoolVersions, kubernetesClusterProperties.viableNodePoolVersions) && true && Objects.equals(this.apiSubnetAllowList, kubernetesClusterProperties.apiSubnetAllowList) && Objects.equals(this.s3Buckets, kubernetesClusterProperties.s3Buckets);
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

