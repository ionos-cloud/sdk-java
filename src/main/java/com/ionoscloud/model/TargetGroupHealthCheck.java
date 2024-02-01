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
 * TargetGroupHealthCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class TargetGroupHealthCheck {
  
  public static final String SERIALIZED_NAME_CHECK_INTERVAL = "checkInterval";
  @SerializedName(SERIALIZED_NAME_CHECK_INTERVAL)
  private Integer checkInterval;


  public static final String SERIALIZED_NAME_CHECK_TIMEOUT = "checkTimeout";
  @SerializedName(SERIALIZED_NAME_CHECK_TIMEOUT)
  private Integer checkTimeout;


  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries;

  

  public TargetGroupHealthCheck checkInterval(Integer checkInterval) {
    
    this.checkInterval = checkInterval;
    return this;
  }

   /**
   * The interval in milliseconds between consecutive health checks; the default value is &#39;2000&#39;.
   * @return checkInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "The interval in milliseconds between consecutive health checks; the default value is '2000'.")

  public Integer getCheckInterval() {
    return checkInterval;
  }


  public void setCheckInterval(Integer checkInterval) {
    this.checkInterval = checkInterval;
  }



  public TargetGroupHealthCheck checkTimeout(Integer checkTimeout) {
    
    this.checkTimeout = checkTimeout;
    return this;
  }

   /**
   * The maximum time in milliseconds is to wait for a target to respond to a check. For target VMs with a &#39;Check Interval&#39; set, the smaller of the two values is used once the TCP connection is established.
   * @return checkTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2000", value = "The maximum time in milliseconds is to wait for a target to respond to a check. For target VMs with a 'Check Interval' set, the smaller of the two values is used once the TCP connection is established.")

  public Integer getCheckTimeout() {
    return checkTimeout;
  }


  public void setCheckTimeout(Integer checkTimeout) {
    this.checkTimeout = checkTimeout;
  }



  public TargetGroupHealthCheck retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * The maximum number of attempts to reconnect to a target after a connection failure. The valid range is &#39;0 to 65535&#39;; the default value is &#39;3&#39;.
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The maximum number of attempts to reconnect to a target after a connection failure. The valid range is '0 to 65535'; the default value is '3'.")

  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupHealthCheck targetGroupHealthCheck = (TargetGroupHealthCheck) o;
    return Objects.equals(this.checkInterval, targetGroupHealthCheck.checkInterval) && Objects.equals(this.checkTimeout, targetGroupHealthCheck.checkTimeout) && Objects.equals(this.retries, targetGroupHealthCheck.retries);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupHealthCheck {\n");
    
    sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");

    sb.append("    checkTimeout: ").append(toIndentedString(checkTimeout)).append("\n");

    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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



// TargetGroupHealthCheck instantiates a new TargetGroupHealthCheck object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public TargetGroupHealthCheck() {

}


}
