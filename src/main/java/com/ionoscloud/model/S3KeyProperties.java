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
 * S3KeyProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-14T13:53:14.995Z[Etc/UTC]")

public class S3KeyProperties {
  
  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private String secretKey;


  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  

   /**
   * Secret of the S3 key.
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tFVkUARsoeCdntQs2jVSyGG6TMPfPZ+ghnsWj/gG", value = "Secret of the S3 key.")

  public String getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }



  public S3KeyProperties active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Denotes weather the S3 key is active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Denotes weather the S3 key is active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3KeyProperties s3KeyProperties = (S3KeyProperties) o;
    return Objects.equals(this.secretKey, s3KeyProperties.secretKey) && Objects.equals(this.active, s3KeyProperties.active);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3KeyProperties {\n");
    
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");

    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

