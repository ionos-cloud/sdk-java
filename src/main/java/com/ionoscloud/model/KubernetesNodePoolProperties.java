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
import com.ionoscloud.model.KubernetesAutoScaling;
import com.ionoscloud.model.KubernetesMaintenanceWindow;
import com.ionoscloud.model.KubernetesNodePoolLan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * KubernetesNodePoolProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class KubernetesNodePoolProperties {
  
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;


  public static final String SERIALIZED_NAME_AUTO_SCALING = "autoScaling";
  @SerializedName(SERIALIZED_NAME_AUTO_SCALING)
  private KubernetesAutoScaling autoScaling;


  /**
   * The availability zone in which the target VM should be provisioned.
   */
  @JsonAdapter(AvailabilityZoneEnum.Adapter.class)
  public enum AvailabilityZoneEnum {
    AUTO("AUTO"),
    
    ZONE_1("ZONE_1"),
    
    ZONE_2("ZONE_2");

    private String value;

    AvailabilityZoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityZoneEnum fromValue(String value) {

      for (AvailabilityZoneEnum b : AvailabilityZoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AvailabilityZoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityZoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityZoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailabilityZoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "availabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private AvailabilityZoneEnum availabilityZone;


  public static final String SERIALIZED_NAME_AVAILABLE_UPGRADE_VERSIONS = "availableUpgradeVersions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_UPGRADE_VERSIONS)
  private List<String> availableUpgradeVersions = null;


  public static final String SERIALIZED_NAME_CORES_COUNT = "coresCount";
  @SerializedName(SERIALIZED_NAME_CORES_COUNT)
  private Integer coresCount;


  public static final String SERIALIZED_NAME_CPU_FAMILY = "cpuFamily";
  @SerializedName(SERIALIZED_NAME_CPU_FAMILY)
  private String cpuFamily;


  public static final String SERIALIZED_NAME_DATACENTER_ID = "datacenterId";
  @SerializedName(SERIALIZED_NAME_DATACENTER_ID)
  private String datacenterId;


  public static final String SERIALIZED_NAME_K8S_VERSION = "k8sVersion";
  @SerializedName(SERIALIZED_NAME_K8S_VERSION)
  private String k8sVersion;


  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;


  public static final String SERIALIZED_NAME_LANS = "lans";
  @SerializedName(SERIALIZED_NAME_LANS)
  private List<KubernetesNodePoolLan> lans = null;


  public static final String SERIALIZED_NAME_MAINTENANCE_WINDOW = "maintenanceWindow";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_WINDOW)
  private KubernetesMaintenanceWindow maintenanceWindow;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_NODE_COUNT = "nodeCount";
  @SerializedName(SERIALIZED_NAME_NODE_COUNT)
  private Integer nodeCount;


  public static final String SERIALIZED_NAME_PUBLIC_IPS = "publicIps";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IPS)
  private List<String> publicIps = null;


  public static final String SERIALIZED_NAME_RAM_SIZE = "ramSize";
  @SerializedName(SERIALIZED_NAME_RAM_SIZE)
  private Integer ramSize;


  public static final String SERIALIZED_NAME_STORAGE_SIZE = "storageSize";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private Integer storageSize;


  /**
   * The storage type for the nodes.
   */
  @JsonAdapter(StorageTypeEnum.Adapter.class)
  public enum StorageTypeEnum {
    HDD("HDD"),
    
    SSD("SSD");

    private String value;

    StorageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StorageTypeEnum fromValue(String value) {

      for (StorageTypeEnum b : StorageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StorageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StorageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StorageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "storageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private StorageTypeEnum storageType;

  

  public KubernetesNodePoolProperties annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public KubernetesNodePoolProperties putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * The annotations attached to the node pool.
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The annotations attached to the node pool.")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }



  public KubernetesNodePoolProperties autoScaling(KubernetesAutoScaling autoScaling) {
    
    this.autoScaling = autoScaling;
    return this;
  }

   /**
   * Get autoScaling
   * @return autoScaling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KubernetesAutoScaling getAutoScaling() {
    return autoScaling;
  }


  public void setAutoScaling(KubernetesAutoScaling autoScaling) {
    this.autoScaling = autoScaling;
  }



  public KubernetesNodePoolProperties availabilityZone(AvailabilityZoneEnum availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * The availability zone in which the target VM should be provisioned.
   * @return availabilityZone
  **/
  @ApiModelProperty(example = "AUTO", required = true, value = "The availability zone in which the target VM should be provisioned.")

  public AvailabilityZoneEnum getAvailabilityZone() {
    return availabilityZone;
  }


  public void setAvailabilityZone(AvailabilityZoneEnum availabilityZone) {
    this.availabilityZone = availabilityZone;
  }



  public KubernetesNodePoolProperties availableUpgradeVersions(List<String> availableUpgradeVersions) {
    
    this.availableUpgradeVersions = availableUpgradeVersions;
    return this;
  }

  public KubernetesNodePoolProperties addAvailableUpgradeVersionsItem(String availableUpgradeVersionsItem) {
    if (this.availableUpgradeVersions == null) {
      this.availableUpgradeVersions = new ArrayList<String>();
    }
    this.availableUpgradeVersions.add(availableUpgradeVersionsItem);
    return this;
  }

   /**
   * The list of available versions for upgrading the node pool.
   * @return availableUpgradeVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1.16.4, 1.17.7]", value = "The list of available versions for upgrading the node pool.")

  public List<String> getAvailableUpgradeVersions() {
    return availableUpgradeVersions;
  }


  public void setAvailableUpgradeVersions(List<String> availableUpgradeVersions) {
    this.availableUpgradeVersions = availableUpgradeVersions;
  }



  public KubernetesNodePoolProperties coresCount(Integer coresCount) {
    
    this.coresCount = coresCount;
    return this;
  }

   /**
   * The total number of cores for the nodes.
   * @return coresCount
  **/
  @ApiModelProperty(example = "4", required = true, value = "The total number of cores for the nodes.")

  public Integer getCoresCount() {
    return coresCount;
  }


  public void setCoresCount(Integer coresCount) {
    this.coresCount = coresCount;
  }



  public KubernetesNodePoolProperties cpuFamily(String cpuFamily) {
    
    this.cpuFamily = cpuFamily;
    return this;
  }

   /**
   * The CPU type for the nodes.
   * @return cpuFamily
  **/
  @ApiModelProperty(example = "AMD_OPTERON", required = true, value = "The CPU type for the nodes.")

  public String getCpuFamily() {
    return cpuFamily;
  }


  public void setCpuFamily(String cpuFamily) {
    this.cpuFamily = cpuFamily;
  }



  public KubernetesNodePoolProperties datacenterId(String datacenterId) {
    
    this.datacenterId = datacenterId;
    return this;
  }

   /**
   * The unique identifier of the VDC where the worker nodes of the node pool are provisioned.Note that the data center is located in the exact place where the parent cluster of the node pool is located.
   * @return datacenterId
  **/
  @ApiModelProperty(example = "1e072e52-2ed3-492f-b6b6-c6b116907521", required = true, value = "The unique identifier of the VDC where the worker nodes of the node pool are provisioned.Note that the data center is located in the exact place where the parent cluster of the node pool is located.")

  public String getDatacenterId() {
    return datacenterId;
  }


  public void setDatacenterId(String datacenterId) {
    this.datacenterId = datacenterId;
  }



  public KubernetesNodePoolProperties k8sVersion(String k8sVersion) {
    
    this.k8sVersion = k8sVersion;
    return this;
  }

   /**
   * The Kubernetes version running in the node pool. Note that this imposes restrictions on which Kubernetes versions can run in the node pools of a cluster. Also, not all Kubernetes versions are suitable upgrade targets for all earlier versions.
   * @return k8sVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.15.4", value = "The Kubernetes version running in the node pool. Note that this imposes restrictions on which Kubernetes versions can run in the node pools of a cluster. Also, not all Kubernetes versions are suitable upgrade targets for all earlier versions.")

  public String getK8sVersion() {
    return k8sVersion;
  }


  public void setK8sVersion(String k8sVersion) {
    this.k8sVersion = k8sVersion;
  }



  public KubernetesNodePoolProperties labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public KubernetesNodePoolProperties putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * The labels attached to the node pool.
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The labels attached to the node pool.")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }



  public KubernetesNodePoolProperties lans(List<KubernetesNodePoolLan> lans) {
    
    this.lans = lans;
    return this;
  }

  public KubernetesNodePoolProperties addLansItem(KubernetesNodePoolLan lansItem) {
    if (this.lans == null) {
      this.lans = new ArrayList<KubernetesNodePoolLan>();
    }
    this.lans.add(lansItem);
    return this;
  }

   /**
   * The array of existing private LANs to attach to worker nodes.
   * @return lans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of existing private LANs to attach to worker nodes.")

  public List<KubernetesNodePoolLan> getLans() {
    return lans;
  }


  public void setLans(List<KubernetesNodePoolLan> lans) {
    this.lans = lans;
  }



  public KubernetesNodePoolProperties maintenanceWindow(KubernetesMaintenanceWindow maintenanceWindow) {
    
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



  public KubernetesNodePoolProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A Kubernetes node pool name. Valid Kubernetes node pool name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * @return name
  **/
  @ApiModelProperty(example = "K8s-node-pool", required = true, value = "A Kubernetes node pool name. Valid Kubernetes node pool name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public KubernetesNodePoolProperties nodeCount(Integer nodeCount) {
    
    this.nodeCount = nodeCount;
    return this;
  }

   /**
   * The number of worker nodes of the node pool.
   * @return nodeCount
  **/
  @ApiModelProperty(example = "2", required = true, value = "The number of worker nodes of the node pool.")

  public Integer getNodeCount() {
    return nodeCount;
  }


  public void setNodeCount(Integer nodeCount) {
    this.nodeCount = nodeCount;
  }



  public KubernetesNodePoolProperties publicIps(List<String> publicIps) {
    
    this.publicIps = publicIps;
    return this;
  }

  public KubernetesNodePoolProperties addPublicIpsItem(String publicIpsItem) {
    if (this.publicIps == null) {
      this.publicIps = new ArrayList<String>();
    }
    this.publicIps.add(publicIpsItem);
    return this;
  }

   /**
   * Optional array of reserved public IP addresses to be used by the nodes. The IPs must be from the exact location of the node pool&#39;s data center. If autoscaling is used, the array must contain one more IP than the maximum possible number of nodes (nodeCount+1 for a fixed number of nodes or maxNodeCount+1). The extra IP is used when the nodes are rebuilt.
   * @return publicIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[81.173.1.2, 82.231.2.5, 92.221.2.4]", value = "Optional array of reserved public IP addresses to be used by the nodes. The IPs must be from the exact location of the node pool's data center. If autoscaling is used, the array must contain one more IP than the maximum possible number of nodes (nodeCount+1 for a fixed number of nodes or maxNodeCount+1). The extra IP is used when the nodes are rebuilt.")

  public List<String> getPublicIps() {
    return publicIps;
  }


  public void setPublicIps(List<String> publicIps) {
    this.publicIps = publicIps;
  }



  public KubernetesNodePoolProperties ramSize(Integer ramSize) {
    
    this.ramSize = ramSize;
    return this;
  }

   /**
   * The RAM size for the nodes. Must be specified in multiples of 1024 MB, with a minimum size of 2048 MB.
   * @return ramSize
  **/
  @ApiModelProperty(example = "2048", required = true, value = "The RAM size for the nodes. Must be specified in multiples of 1024 MB, with a minimum size of 2048 MB.")

  public Integer getRamSize() {
    return ramSize;
  }


  public void setRamSize(Integer ramSize) {
    this.ramSize = ramSize;
  }



  public KubernetesNodePoolProperties storageSize(Integer storageSize) {
    
    this.storageSize = storageSize;
    return this;
  }

   /**
   * The allocated volume size in GB. The allocated volume size in GB. To achieve good performance, we recommend a size greater than 100GB for SSD.
   * @return storageSize
  **/
  @ApiModelProperty(example = "100", required = true, value = "The allocated volume size in GB. The allocated volume size in GB. To achieve good performance, we recommend a size greater than 100GB for SSD.")

  public Integer getStorageSize() {
    return storageSize;
  }


  public void setStorageSize(Integer storageSize) {
    this.storageSize = storageSize;
  }



  public KubernetesNodePoolProperties storageType(StorageTypeEnum storageType) {
    
    this.storageType = storageType;
    return this;
  }

   /**
   * The storage type for the nodes.
   * @return storageType
  **/
  @ApiModelProperty(example = "HDD", required = true, value = "The storage type for the nodes.")

  public StorageTypeEnum getStorageType() {
    return storageType;
  }


  public void setStorageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesNodePoolProperties kubernetesNodePoolProperties = (KubernetesNodePoolProperties) o;
    return Objects.equals(this.annotations, kubernetesNodePoolProperties.annotations) && Objects.equals(this.autoScaling, kubernetesNodePoolProperties.autoScaling) && Objects.equals(this.availabilityZone, kubernetesNodePoolProperties.availabilityZone) && Objects.equals(this.availableUpgradeVersions, kubernetesNodePoolProperties.availableUpgradeVersions) && Objects.equals(this.coresCount, kubernetesNodePoolProperties.coresCount) && Objects.equals(this.cpuFamily, kubernetesNodePoolProperties.cpuFamily) && Objects.equals(this.datacenterId, kubernetesNodePoolProperties.datacenterId) && Objects.equals(this.k8sVersion, kubernetesNodePoolProperties.k8sVersion) && Objects.equals(this.labels, kubernetesNodePoolProperties.labels) && Objects.equals(this.lans, kubernetesNodePoolProperties.lans) && Objects.equals(this.maintenanceWindow, kubernetesNodePoolProperties.maintenanceWindow) && Objects.equals(this.name, kubernetesNodePoolProperties.name) && Objects.equals(this.nodeCount, kubernetesNodePoolProperties.nodeCount) && Objects.equals(this.publicIps, kubernetesNodePoolProperties.publicIps) && Objects.equals(this.ramSize, kubernetesNodePoolProperties.ramSize) && Objects.equals(this.storageSize, kubernetesNodePoolProperties.storageSize) && Objects.equals(this.storageType, kubernetesNodePoolProperties.storageType);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesNodePoolProperties {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");

    sb.append("    autoScaling: ").append(toIndentedString(autoScaling)).append("\n");

    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");

    sb.append("    availableUpgradeVersions: ").append(toIndentedString(availableUpgradeVersions)).append("\n");

    sb.append("    coresCount: ").append(toIndentedString(coresCount)).append("\n");

    sb.append("    cpuFamily: ").append(toIndentedString(cpuFamily)).append("\n");

    sb.append("    datacenterId: ").append(toIndentedString(datacenterId)).append("\n");

    sb.append("    k8sVersion: ").append(toIndentedString(k8sVersion)).append("\n");

    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");

    sb.append("    lans: ").append(toIndentedString(lans)).append("\n");

    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");

    sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");

    sb.append("    ramSize: ").append(toIndentedString(ramSize)).append("\n");

    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");

    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
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



// KubernetesNodePoolProperties instantiates a new KubernetesNodePoolProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public KubernetesNodePoolProperties(AvailabilityZoneEnum AvailabilityZone, Integer CoresCount, String CpuFamily, String DatacenterId, String Name, Integer NodeCount, Integer RamSize, Integer StorageSize, StorageTypeEnum StorageType) {

	this.availabilityZone = AvailabilityZone;
	this.coresCount = CoresCount;
	this.cpuFamily = CpuFamily;
	this.datacenterId = DatacenterId;
	this.name = Name;
	this.nodeCount = NodeCount;
	this.ramSize = RamSize;
	this.storageSize = StorageSize;
	this.storageType = StorageType;
}

public KubernetesNodePoolProperties() {
}

}
