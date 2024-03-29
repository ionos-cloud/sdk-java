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
 * GroupProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class GroupProperties {
  
  public static final String SERIALIZED_NAME_ACCESS_ACTIVITY_LOG = "accessActivityLog";
  @SerializedName(SERIALIZED_NAME_ACCESS_ACTIVITY_LOG)
  private Boolean accessActivityLog;


  public static final String SERIALIZED_NAME_ACCESS_AND_MANAGE_CERTIFICATES = "accessAndManageCertificates";
  @SerializedName(SERIALIZED_NAME_ACCESS_AND_MANAGE_CERTIFICATES)
  private Boolean accessAndManageCertificates;


  public static final String SERIALIZED_NAME_ACCESS_AND_MANAGE_DNS = "accessAndManageDns";
  @SerializedName(SERIALIZED_NAME_ACCESS_AND_MANAGE_DNS)
  private Boolean accessAndManageDns;


  public static final String SERIALIZED_NAME_ACCESS_AND_MANAGE_MONITORING = "accessAndManageMonitoring";
  @SerializedName(SERIALIZED_NAME_ACCESS_AND_MANAGE_MONITORING)
  private Boolean accessAndManageMonitoring;


  public static final String SERIALIZED_NAME_CREATE_BACKUP_UNIT = "createBackupUnit";
  @SerializedName(SERIALIZED_NAME_CREATE_BACKUP_UNIT)
  private Boolean createBackupUnit;


  public static final String SERIALIZED_NAME_CREATE_DATA_CENTER = "createDataCenter";
  @SerializedName(SERIALIZED_NAME_CREATE_DATA_CENTER)
  private Boolean createDataCenter;


  public static final String SERIALIZED_NAME_CREATE_FLOW_LOG = "createFlowLog";
  @SerializedName(SERIALIZED_NAME_CREATE_FLOW_LOG)
  private Boolean createFlowLog;


  public static final String SERIALIZED_NAME_CREATE_INTERNET_ACCESS = "createInternetAccess";
  @SerializedName(SERIALIZED_NAME_CREATE_INTERNET_ACCESS)
  private Boolean createInternetAccess;


  public static final String SERIALIZED_NAME_CREATE_K8S_CLUSTER = "createK8sCluster";
  @SerializedName(SERIALIZED_NAME_CREATE_K8S_CLUSTER)
  private Boolean createK8sCluster;


  public static final String SERIALIZED_NAME_CREATE_PCC = "createPcc";
  @SerializedName(SERIALIZED_NAME_CREATE_PCC)
  private Boolean createPcc;


  public static final String SERIALIZED_NAME_CREATE_SNAPSHOT = "createSnapshot";
  @SerializedName(SERIALIZED_NAME_CREATE_SNAPSHOT)
  private Boolean createSnapshot;


  public static final String SERIALIZED_NAME_MANAGE_D_BAA_S = "manageDBaaS";
  @SerializedName(SERIALIZED_NAME_MANAGE_D_BAA_S)
  private Boolean manageDBaaS;


  public static final String SERIALIZED_NAME_MANAGE_DATAPLATFORM = "manageDataplatform";
  @SerializedName(SERIALIZED_NAME_MANAGE_DATAPLATFORM)
  private Boolean manageDataplatform;


  public static final String SERIALIZED_NAME_MANAGE_REGISTRY = "manageRegistry";
  @SerializedName(SERIALIZED_NAME_MANAGE_REGISTRY)
  private Boolean manageRegistry;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_RESERVE_IP = "reserveIp";
  @SerializedName(SERIALIZED_NAME_RESERVE_IP)
  private Boolean reserveIp;


  public static final String SERIALIZED_NAME_S3_PRIVILEGE = "s3Privilege";
  @SerializedName(SERIALIZED_NAME_S3_PRIVILEGE)
  private Boolean s3Privilege;

  

  public GroupProperties accessActivityLog(Boolean accessActivityLog) {
    
    this.accessActivityLog = accessActivityLog;
    return this;
  }

   /**
   * Activity log access privilege.
   * @return accessActivityLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Activity log access privilege.")

  public Boolean getAccessActivityLog() {
    return accessActivityLog;
  }


  public void setAccessActivityLog(Boolean accessActivityLog) {
    this.accessActivityLog = accessActivityLog;
  }



  public GroupProperties accessAndManageCertificates(Boolean accessAndManageCertificates) {
    
    this.accessAndManageCertificates = accessAndManageCertificates;
    return this;
  }

   /**
   * Privilege for a group to access and manage certificates.
   * @return accessAndManageCertificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Privilege for a group to access and manage certificates.")

  public Boolean getAccessAndManageCertificates() {
    return accessAndManageCertificates;
  }


  public void setAccessAndManageCertificates(Boolean accessAndManageCertificates) {
    this.accessAndManageCertificates = accessAndManageCertificates;
  }



  public GroupProperties accessAndManageDns(Boolean accessAndManageDns) {
    
    this.accessAndManageDns = accessAndManageDns;
    return this;
  }

   /**
   * Privilege for a group to access and manage dns records.
   * @return accessAndManageDns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Privilege for a group to access and manage dns records.")

  public Boolean getAccessAndManageDns() {
    return accessAndManageDns;
  }


  public void setAccessAndManageDns(Boolean accessAndManageDns) {
    this.accessAndManageDns = accessAndManageDns;
  }



  public GroupProperties accessAndManageMonitoring(Boolean accessAndManageMonitoring) {
    
    this.accessAndManageMonitoring = accessAndManageMonitoring;
    return this;
  }

   /**
   * Privilege for a group to access and manage monitoring related functionality (access metrics, CRUD on alarms, alarm-actions etc) using Monotoring-as-a-Service (MaaS).
   * @return accessAndManageMonitoring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Privilege for a group to access and manage monitoring related functionality (access metrics, CRUD on alarms, alarm-actions etc) using Monotoring-as-a-Service (MaaS).")

  public Boolean getAccessAndManageMonitoring() {
    return accessAndManageMonitoring;
  }


  public void setAccessAndManageMonitoring(Boolean accessAndManageMonitoring) {
    this.accessAndManageMonitoring = accessAndManageMonitoring;
  }



  public GroupProperties createBackupUnit(Boolean createBackupUnit) {
    
    this.createBackupUnit = createBackupUnit;
    return this;
  }

   /**
   * Create backup unit privilege.
   * @return createBackupUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create backup unit privilege.")

  public Boolean getCreateBackupUnit() {
    return createBackupUnit;
  }


  public void setCreateBackupUnit(Boolean createBackupUnit) {
    this.createBackupUnit = createBackupUnit;
  }



  public GroupProperties createDataCenter(Boolean createDataCenter) {
    
    this.createDataCenter = createDataCenter;
    return this;
  }

   /**
   * Create data center privilege.
   * @return createDataCenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create data center privilege.")

  public Boolean getCreateDataCenter() {
    return createDataCenter;
  }


  public void setCreateDataCenter(Boolean createDataCenter) {
    this.createDataCenter = createDataCenter;
  }



  public GroupProperties createFlowLog(Boolean createFlowLog) {
    
    this.createFlowLog = createFlowLog;
    return this;
  }

   /**
   * Create Flow Logs privilege.
   * @return createFlowLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create Flow Logs privilege.")

  public Boolean getCreateFlowLog() {
    return createFlowLog;
  }


  public void setCreateFlowLog(Boolean createFlowLog) {
    this.createFlowLog = createFlowLog;
  }



  public GroupProperties createInternetAccess(Boolean createInternetAccess) {
    
    this.createInternetAccess = createInternetAccess;
    return this;
  }

   /**
   * Create internet access privilege.
   * @return createInternetAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create internet access privilege.")

  public Boolean getCreateInternetAccess() {
    return createInternetAccess;
  }


  public void setCreateInternetAccess(Boolean createInternetAccess) {
    this.createInternetAccess = createInternetAccess;
  }



  public GroupProperties createK8sCluster(Boolean createK8sCluster) {
    
    this.createK8sCluster = createK8sCluster;
    return this;
  }

   /**
   * Create Kubernetes cluster privilege.
   * @return createK8sCluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create Kubernetes cluster privilege.")

  public Boolean getCreateK8sCluster() {
    return createK8sCluster;
  }


  public void setCreateK8sCluster(Boolean createK8sCluster) {
    this.createK8sCluster = createK8sCluster;
  }



  public GroupProperties createPcc(Boolean createPcc) {
    
    this.createPcc = createPcc;
    return this;
  }

   /**
   * Create pcc privilege.
   * @return createPcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create pcc privilege.")

  public Boolean getCreatePcc() {
    return createPcc;
  }


  public void setCreatePcc(Boolean createPcc) {
    this.createPcc = createPcc;
  }



  public GroupProperties createSnapshot(Boolean createSnapshot) {
    
    this.createSnapshot = createSnapshot;
    return this;
  }

   /**
   * Create snapshot privilege.
   * @return createSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create snapshot privilege.")

  public Boolean getCreateSnapshot() {
    return createSnapshot;
  }


  public void setCreateSnapshot(Boolean createSnapshot) {
    this.createSnapshot = createSnapshot;
  }



  public GroupProperties manageDBaaS(Boolean manageDBaaS) {
    
    this.manageDBaaS = manageDBaaS;
    return this;
  }

   /**
   * Privilege for a group to manage DBaaS related functionality.
   * @return manageDBaaS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Privilege for a group to manage DBaaS related functionality.")

  public Boolean getManageDBaaS() {
    return manageDBaaS;
  }


  public void setManageDBaaS(Boolean manageDBaaS) {
    this.manageDBaaS = manageDBaaS;
  }



  public GroupProperties manageDataplatform(Boolean manageDataplatform) {
    
    this.manageDataplatform = manageDataplatform;
    return this;
  }

   /**
   * Privilege for a group to access and manage the Data Platform.
   * @return manageDataplatform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Privilege for a group to access and manage the Data Platform.")

  public Boolean getManageDataplatform() {
    return manageDataplatform;
  }


  public void setManageDataplatform(Boolean manageDataplatform) {
    this.manageDataplatform = manageDataplatform;
  }



  public GroupProperties manageRegistry(Boolean manageRegistry) {
    
    this.manageRegistry = manageRegistry;
    return this;
  }

   /**
   * Privilege for group accessing container registry related functionality.
   * @return manageRegistry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Privilege for group accessing container registry related functionality.")

  public Boolean getManageRegistry() {
    return manageRegistry;
  }


  public void setManageRegistry(Boolean manageRegistry) {
    this.manageRegistry = manageRegistry;
  }



  public GroupProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the resource.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "The name of the resource.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public GroupProperties reserveIp(Boolean reserveIp) {
    
    this.reserveIp = reserveIp;
    return this;
  }

   /**
   * Reserve IP block privilege.
   * @return reserveIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reserve IP block privilege.")

  public Boolean getReserveIp() {
    return reserveIp;
  }


  public void setReserveIp(Boolean reserveIp) {
    this.reserveIp = reserveIp;
  }



  public GroupProperties s3Privilege(Boolean s3Privilege) {
    
    this.s3Privilege = s3Privilege;
    return this;
  }

   /**
   * S3 privilege.
   * @return s3Privilege
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "S3 privilege.")

  public Boolean getS3Privilege() {
    return s3Privilege;
  }


  public void setS3Privilege(Boolean s3Privilege) {
    this.s3Privilege = s3Privilege;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupProperties groupProperties = (GroupProperties) o;
    return Objects.equals(this.accessActivityLog, groupProperties.accessActivityLog) && Objects.equals(this.accessAndManageCertificates, groupProperties.accessAndManageCertificates) && Objects.equals(this.accessAndManageDns, groupProperties.accessAndManageDns) && Objects.equals(this.accessAndManageMonitoring, groupProperties.accessAndManageMonitoring) && Objects.equals(this.createBackupUnit, groupProperties.createBackupUnit) && Objects.equals(this.createDataCenter, groupProperties.createDataCenter) && Objects.equals(this.createFlowLog, groupProperties.createFlowLog) && Objects.equals(this.createInternetAccess, groupProperties.createInternetAccess) && Objects.equals(this.createK8sCluster, groupProperties.createK8sCluster) && Objects.equals(this.createPcc, groupProperties.createPcc) && Objects.equals(this.createSnapshot, groupProperties.createSnapshot) && Objects.equals(this.manageDBaaS, groupProperties.manageDBaaS) && Objects.equals(this.manageDataplatform, groupProperties.manageDataplatform) && Objects.equals(this.manageRegistry, groupProperties.manageRegistry) && Objects.equals(this.name, groupProperties.name) && Objects.equals(this.reserveIp, groupProperties.reserveIp) && Objects.equals(this.s3Privilege, groupProperties.s3Privilege);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupProperties {\n");
    
    sb.append("    accessActivityLog: ").append(toIndentedString(accessActivityLog)).append("\n");

    sb.append("    accessAndManageCertificates: ").append(toIndentedString(accessAndManageCertificates)).append("\n");

    sb.append("    accessAndManageDns: ").append(toIndentedString(accessAndManageDns)).append("\n");

    sb.append("    accessAndManageMonitoring: ").append(toIndentedString(accessAndManageMonitoring)).append("\n");

    sb.append("    createBackupUnit: ").append(toIndentedString(createBackupUnit)).append("\n");

    sb.append("    createDataCenter: ").append(toIndentedString(createDataCenter)).append("\n");

    sb.append("    createFlowLog: ").append(toIndentedString(createFlowLog)).append("\n");

    sb.append("    createInternetAccess: ").append(toIndentedString(createInternetAccess)).append("\n");

    sb.append("    createK8sCluster: ").append(toIndentedString(createK8sCluster)).append("\n");

    sb.append("    createPcc: ").append(toIndentedString(createPcc)).append("\n");

    sb.append("    createSnapshot: ").append(toIndentedString(createSnapshot)).append("\n");

    sb.append("    manageDBaaS: ").append(toIndentedString(manageDBaaS)).append("\n");

    sb.append("    manageDataplatform: ").append(toIndentedString(manageDataplatform)).append("\n");

    sb.append("    manageRegistry: ").append(toIndentedString(manageRegistry)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    reserveIp: ").append(toIndentedString(reserveIp)).append("\n");

    sb.append("    s3Privilege: ").append(toIndentedString(s3Privilege)).append("\n");
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



// GroupProperties instantiates a new GroupProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public GroupProperties() {

}


}
