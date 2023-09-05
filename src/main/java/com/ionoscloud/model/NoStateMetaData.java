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
import org.threeten.bp.OffsetDateTime;

/**
 * NoStateMetaData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class NoStateMetaData {
  
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;


  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;


  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;


  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID = "lastModifiedByUserId";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID)
  private String lastModifiedByUserId;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;

  

   /**
   * The user who has created the resource.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "The user who has created the resource.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }



   /**
   * The unique ID of the user who created the resource.
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "The unique ID of the user who created the resource.")

  public String getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }



   /**
   * The time when the resource was created.
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "The time when the resource was created.")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }



   /**
   * Resource&#39;s Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11  Entity Tag is also added as an &#39;ETag response header to requests which don&#39;t use &#39;depth&#39; parameter. 
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45480eb3fbfc31f1d916c1eaa4abdcc3", value = "Resource's Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11  Entity Tag is also added as an 'ETag response header to requests which don't use 'depth' parameter. ")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    this.etag = etag;
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
   * The unique ID of the user who last modified the resource.
   * @return lastModifiedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "63cef532-26fe-4a64-a4e0-de7c8a506c90", value = "The unique ID of the user who last modified the resource.")

  public String getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }


  public void setLastModifiedByUserId(String lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
  }



   /**
   * The last time the resource was modified.
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.809Z", value = "The last time the resource was modified.")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoStateMetaData noStateMetaData = (NoStateMetaData) o;
    return Objects.equals(this.createdBy, noStateMetaData.createdBy) && Objects.equals(this.createdByUserId, noStateMetaData.createdByUserId) && Objects.equals(this.createdDate, noStateMetaData.createdDate) && Objects.equals(this.etag, noStateMetaData.etag) && Objects.equals(this.lastModifiedBy, noStateMetaData.lastModifiedBy) && Objects.equals(this.lastModifiedByUserId, noStateMetaData.lastModifiedByUserId) && Objects.equals(this.lastModifiedDate, noStateMetaData.lastModifiedDate);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoStateMetaData {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");

    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");

    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");

    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");

    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");

    sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");

    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
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



// NoStateMetaData instantiates a new NoStateMetaData object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public NoStateMetaData() {

}


}
