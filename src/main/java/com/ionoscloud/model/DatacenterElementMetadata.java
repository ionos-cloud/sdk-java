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
import org.threeten.bp.OffsetDateTime;

/**
 * DatacenterElementMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T15:06:52.944Z[Etc/UTC]")

public class DatacenterElementMetadata {
  
  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;


  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;


  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;


  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID = "lastModifiedByUserId";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID)
  private String lastModifiedByUserId;


  /**
   * State of the resource. *AVAILABLE* There are no pending modification requests for this item; *BUSY* There is at least one modification request pending and all following requests will be queued; *INACTIVE* Resource has been de-provisioned; *DEPLOYING* Resource state DEPLOYING - relevant for Kubernetes cluster/nodepool; *ACTIVE* Resource state ACTIVE - relevant for Kubernetes cluster/nodepool; *FAILED* Resource state FAILED - relevant for Kubernetes cluster/nodepool; *SUSPENDED* Resource state SUSPENDED - relevant for Kubernetes cluster/nodepool; *FAILED_SUSPENDED* Resource state FAILED_SUSPENDED - relevant for Kubernetes cluster; *UPDATING* Resource state UPDATING - relevant for Kubernetes cluster/nodepool; *FAILED_UPDATING* Resource state FAILED_UPDATING - relevant for Kubernetes cluster/nodepool; *DESTROYING* Resource state DESTROYING - relevant for Kubernetes cluster; *FAILED_DESTROYING* Resource state FAILED_DESTROYING - relevant for Kubernetes cluster/nodepool; *TERMINATED* Resource state TERMINATED - relevant for Kubernetes cluster/nodepool
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    UNKNOWN_VALUE("UNKNOWN_VALUE"),
    AVAILABLE("AVAILABLE"),
    
    INACTIVE("INACTIVE"),
    
    BUSY("BUSY"),
    
    DEPLOYING("DEPLOYING"),
    
    ACTIVE("ACTIVE"),
    
    FAILED("FAILED"),
    
    SUSPENDED("SUSPENDED"),
    
    FAILED_SUSPENDED("FAILED_SUSPENDED"),
    
    UPDATING("UPDATING"),
    
    FAILED_UPDATING("FAILED_UPDATING"),
    
    DESTROYING("DESTROYING"),
    
    FAILED_DESTROYING("FAILED_DESTROYING"),
    
    TERMINATED("TERMINATED"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {

      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return StateEnum.UNKNOWN_VALUE;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  

   /**
   * Resource&#39;s Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11 . Entity Tag is also added as an &#39;ETag response header to requests which don&#39;t use &#39;depth&#39; parameter. 
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45480eb3fbfc31f1d916c1eaa4abdcc3", value = "Resource's Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11 . Entity Tag is also added as an 'ETag response header to requests which don't use 'depth' parameter. ")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    this.etag = etag;
  }



   /**
   * The last time the resource was created
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "The last time the resource was created")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }



   /**
   * The user who created the resource.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "The user who created the resource.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }



   /**
   * The user id of the user who has created the resource.
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "The user id of the user who has created the resource.")

  public String getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }



   /**
   * The last time the resource has been modified
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "The last time the resource has been modified")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }



   /**
   * The user who last modified the resource.
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "The user who last modified the resource.")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }



   /**
   * The user id of the user who has last modified the resource.
   * @return lastModifiedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "63cef532-26fe-4a64-a4e0-de7c8a506c90", value = "The user id of the user who has last modified the resource.")

  public String getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }


  public void setLastModifiedByUserId(String lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
  }



   /**
   * State of the resource. *AVAILABLE* There are no pending modification requests for this item; *BUSY* There is at least one modification request pending and all following requests will be queued; *INACTIVE* Resource has been de-provisioned; *DEPLOYING* Resource state DEPLOYING - relevant for Kubernetes cluster/nodepool; *ACTIVE* Resource state ACTIVE - relevant for Kubernetes cluster/nodepool; *FAILED* Resource state FAILED - relevant for Kubernetes cluster/nodepool; *SUSPENDED* Resource state SUSPENDED - relevant for Kubernetes cluster/nodepool; *FAILED_SUSPENDED* Resource state FAILED_SUSPENDED - relevant for Kubernetes cluster; *UPDATING* Resource state UPDATING - relevant for Kubernetes cluster/nodepool; *FAILED_UPDATING* Resource state FAILED_UPDATING - relevant for Kubernetes cluster/nodepool; *DESTROYING* Resource state DESTROYING - relevant for Kubernetes cluster; *FAILED_DESTROYING* Resource state FAILED_DESTROYING - relevant for Kubernetes cluster/nodepool; *TERMINATED* Resource state TERMINATED - relevant for Kubernetes cluster/nodepool
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AVAILABLE", value = "State of the resource. *AVAILABLE* There are no pending modification requests for this item; *BUSY* There is at least one modification request pending and all following requests will be queued; *INACTIVE* Resource has been de-provisioned; *DEPLOYING* Resource state DEPLOYING - relevant for Kubernetes cluster/nodepool; *ACTIVE* Resource state ACTIVE - relevant for Kubernetes cluster/nodepool; *FAILED* Resource state FAILED - relevant for Kubernetes cluster/nodepool; *SUSPENDED* Resource state SUSPENDED - relevant for Kubernetes cluster/nodepool; *FAILED_SUSPENDED* Resource state FAILED_SUSPENDED - relevant for Kubernetes cluster; *UPDATING* Resource state UPDATING - relevant for Kubernetes cluster/nodepool; *FAILED_UPDATING* Resource state FAILED_UPDATING - relevant for Kubernetes cluster/nodepool; *DESTROYING* Resource state DESTROYING - relevant for Kubernetes cluster; *FAILED_DESTROYING* Resource state FAILED_DESTROYING - relevant for Kubernetes cluster/nodepool; *TERMINATED* Resource state TERMINATED - relevant for Kubernetes cluster/nodepool")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatacenterElementMetadata datacenterElementMetadata = (DatacenterElementMetadata) o;
    return Objects.equals(this.etag, datacenterElementMetadata.etag) && Objects.equals(this.createdDate, datacenterElementMetadata.createdDate) && Objects.equals(this.createdBy, datacenterElementMetadata.createdBy) && Objects.equals(this.createdByUserId, datacenterElementMetadata.createdByUserId) && Objects.equals(this.lastModifiedDate, datacenterElementMetadata.lastModifiedDate) && Objects.equals(this.lastModifiedBy, datacenterElementMetadata.lastModifiedBy) && Objects.equals(this.lastModifiedByUserId, datacenterElementMetadata.lastModifiedByUserId) && Objects.equals(this.state, datacenterElementMetadata.state);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatacenterElementMetadata {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");

    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");

    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");

    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");

    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");

    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");

    sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");

    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

