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
import com.ionoscloud.model.ResourceLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContractProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T15:06:52.944Z[Etc/UTC]")

public class ContractProperties {
  
  public static final String SERIALIZED_NAME_CONTRACT_NUMBER = "contractNumber";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NUMBER)
  private Long contractNumber;


  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;


  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public static final String SERIALIZED_NAME_REG_DOMAIN = "regDomain";
  @SerializedName(SERIALIZED_NAME_REG_DOMAIN)
  private String regDomain;


  public static final String SERIALIZED_NAME_RESOURCE_LIMITS = "resourceLimits";
  @SerializedName(SERIALIZED_NAME_RESOURCE_LIMITS)
  private ResourceLimits resourceLimits;

  

   /**
   * contract number
   * @return contractNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "contract number")

  public Long getContractNumber() {
    return contractNumber;
  }


  public void setContractNumber(Long contractNumber) {
    this.contractNumber = contractNumber;
  }



   /**
   * owner of the contract
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "owner of the contract")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }



   /**
   * status of the contract
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status of the contract")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



   /**
   * Registration domain of the contract
   * @return regDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Registration domain of the contract")

  public String getRegDomain() {
    return regDomain;
  }


  public void setRegDomain(String regDomain) {
    this.regDomain = regDomain;
  }



  public ContractProperties resourceLimits(ResourceLimits resourceLimits) {
    
    this.resourceLimits = resourceLimits;
    return this;
  }

   /**
   * Get resourceLimits
   * @return resourceLimits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceLimits getResourceLimits() {
    return resourceLimits;
  }


  public void setResourceLimits(ResourceLimits resourceLimits) {
    this.resourceLimits = resourceLimits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractProperties contractProperties = (ContractProperties) o;
    return Objects.equals(this.contractNumber, contractProperties.contractNumber) && Objects.equals(this.owner, contractProperties.owner) && Objects.equals(this.status, contractProperties.status) && Objects.equals(this.regDomain, contractProperties.regDomain) && Objects.equals(this.resourceLimits, contractProperties.resourceLimits);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractProperties {\n");
    
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");

    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");

    sb.append("    status: ").append(toIndentedString(status)).append("\n");

    sb.append("    regDomain: ").append(toIndentedString(regDomain)).append("\n");

    sb.append("    resourceLimits: ").append(toIndentedString(resourceLimits)).append("\n");
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

