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
 * GroupProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-10T09:04:24.312Z[Etc/UTC]")

public class GroupProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATE_DATA_CENTER = "createDataCenter";
  @SerializedName(SERIALIZED_NAME_CREATE_DATA_CENTER)
  private Boolean createDataCenter;

  public static final String SERIALIZED_NAME_CREATE_SNAPSHOT = "createSnapshot";
  @SerializedName(SERIALIZED_NAME_CREATE_SNAPSHOT)
  private Boolean createSnapshot;

  public static final String SERIALIZED_NAME_RESERVE_IP = "reserveIp";
  @SerializedName(SERIALIZED_NAME_RESERVE_IP)
  private Boolean reserveIp;

  public static final String SERIALIZED_NAME_ACCESS_ACTIVITY_LOG = "accessActivityLog";
  @SerializedName(SERIALIZED_NAME_ACCESS_ACTIVITY_LOG)
  private Boolean accessActivityLog;

  public static final String SERIALIZED_NAME_CREATE_PCC = "createPcc";
  @SerializedName(SERIALIZED_NAME_CREATE_PCC)
  private Boolean createPcc;

  public static final String SERIALIZED_NAME_S3_PRIVILEGE = "s3Privilege";
  @SerializedName(SERIALIZED_NAME_S3_PRIVILEGE)
  private Boolean s3Privilege;

  public static final String SERIALIZED_NAME_CREATE_BACKUP_UNIT = "createBackupUnit";
  @SerializedName(SERIALIZED_NAME_CREATE_BACKUP_UNIT)
  private Boolean createBackupUnit;

  public static final String SERIALIZED_NAME_CREATE_INTERNET_ACCESS = "createInternetAccess";
  @SerializedName(SERIALIZED_NAME_CREATE_INTERNET_ACCESS)
  private Boolean createInternetAccess;

  public static final String SERIALIZED_NAME_CREATE_K8S_CLUSTER = "createK8sCluster";
  @SerializedName(SERIALIZED_NAME_CREATE_K8S_CLUSTER)
  private Boolean createK8sCluster;


  public GroupProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name of that resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "A name of that resource")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GroupProperties createDataCenter(Boolean createDataCenter) {
    
    this.createDataCenter = createDataCenter;
    return this;
  }

   /**
   * create data center privilege
   * @return createDataCenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create data center privilege")

  public Boolean getCreateDataCenter() {
    return createDataCenter;
  }


  public void setCreateDataCenter(Boolean createDataCenter) {
    this.createDataCenter = createDataCenter;
  }


  public GroupProperties createSnapshot(Boolean createSnapshot) {
    
    this.createSnapshot = createSnapshot;
    return this;
  }

   /**
   * create snapshot privilege
   * @return createSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create snapshot privilege")

  public Boolean getCreateSnapshot() {
    return createSnapshot;
  }


  public void setCreateSnapshot(Boolean createSnapshot) {
    this.createSnapshot = createSnapshot;
  }


  public GroupProperties reserveIp(Boolean reserveIp) {
    
    this.reserveIp = reserveIp;
    return this;
  }

   /**
   * reserve ip block privilege
   * @return reserveIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "reserve ip block privilege")

  public Boolean getReserveIp() {
    return reserveIp;
  }


  public void setReserveIp(Boolean reserveIp) {
    this.reserveIp = reserveIp;
  }


  public GroupProperties accessActivityLog(Boolean accessActivityLog) {
    
    this.accessActivityLog = accessActivityLog;
    return this;
  }

   /**
   * activity log access privilege
   * @return accessActivityLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "activity log access privilege")

  public Boolean getAccessActivityLog() {
    return accessActivityLog;
  }


  public void setAccessActivityLog(Boolean accessActivityLog) {
    this.accessActivityLog = accessActivityLog;
  }


  public GroupProperties createPcc(Boolean createPcc) {
    
    this.createPcc = createPcc;
    return this;
  }

   /**
   * create pcc privilege
   * @return createPcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create pcc privilege")

  public Boolean getCreatePcc() {
    return createPcc;
  }


  public void setCreatePcc(Boolean createPcc) {
    this.createPcc = createPcc;
  }


  public GroupProperties s3Privilege(Boolean s3Privilege) {
    
    this.s3Privilege = s3Privilege;
    return this;
  }

   /**
   * S3 privilege
   * @return s3Privilege
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "S3 privilege")

  public Boolean getS3Privilege() {
    return s3Privilege;
  }


  public void setS3Privilege(Boolean s3Privilege) {
    this.s3Privilege = s3Privilege;
  }


  public GroupProperties createBackupUnit(Boolean createBackupUnit) {
    
    this.createBackupUnit = createBackupUnit;
    return this;
  }

   /**
   * create backup unit privilege
   * @return createBackupUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create backup unit privilege")

  public Boolean getCreateBackupUnit() {
    return createBackupUnit;
  }


  public void setCreateBackupUnit(Boolean createBackupUnit) {
    this.createBackupUnit = createBackupUnit;
  }


  public GroupProperties createInternetAccess(Boolean createInternetAccess) {
    
    this.createInternetAccess = createInternetAccess;
    return this;
  }

   /**
   * create internet access privilege
   * @return createInternetAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create internet access privilege")

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
   * create kubernetes cluster privilege
   * @return createK8sCluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create kubernetes cluster privilege")

  public Boolean getCreateK8sCluster() {
    return createK8sCluster;
  }


  public void setCreateK8sCluster(Boolean createK8sCluster) {
    this.createK8sCluster = createK8sCluster;
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
    return Objects.equals(this.name, groupProperties.name) && Objects.equals(this.createDataCenter, groupProperties.createDataCenter) && Objects.equals(this.createSnapshot, groupProperties.createSnapshot) && Objects.equals(this.reserveIp, groupProperties.reserveIp) && Objects.equals(this.accessActivityLog, groupProperties.accessActivityLog) && Objects.equals(this.createPcc, groupProperties.createPcc) && Objects.equals(this.s3Privilege, groupProperties.s3Privilege) && Objects.equals(this.createBackupUnit, groupProperties.createBackupUnit) && Objects.equals(this.createInternetAccess, groupProperties.createInternetAccess) && Objects.equals(this.createK8sCluster, groupProperties.createK8sCluster);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createDataCenter: ").append(toIndentedString(createDataCenter)).append("\n");
    sb.append("    createSnapshot: ").append(toIndentedString(createSnapshot)).append("\n");
    sb.append("    reserveIp: ").append(toIndentedString(reserveIp)).append("\n");
    sb.append("    accessActivityLog: ").append(toIndentedString(accessActivityLog)).append("\n");
    sb.append("    createPcc: ").append(toIndentedString(createPcc)).append("\n");
    sb.append("    s3Privilege: ").append(toIndentedString(s3Privilege)).append("\n");
    sb.append("    createBackupUnit: ").append(toIndentedString(createBackupUnit)).append("\n");
    sb.append("    createInternetAccess: ").append(toIndentedString(createInternetAccess)).append("\n");
    sb.append("    createK8sCluster: ").append(toIndentedString(createK8sCluster)).append("\n");
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

