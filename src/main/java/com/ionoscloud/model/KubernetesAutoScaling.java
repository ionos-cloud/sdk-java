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
 * KubernetesAutoScaling
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-14T13:53:14.995Z[Etc/UTC]")

public class KubernetesAutoScaling {
  
  public static final String SERIALIZED_NAME_MIN_NODE_COUNT = "minNodeCount";
  @SerializedName(SERIALIZED_NAME_MIN_NODE_COUNT)
  private Integer minNodeCount;


  public static final String SERIALIZED_NAME_MAX_NODE_COUNT = "maxNodeCount";
  @SerializedName(SERIALIZED_NAME_MAX_NODE_COUNT)
  private Integer maxNodeCount;

  

  public KubernetesAutoScaling minNodeCount(Integer minNodeCount) {
    
    this.minNodeCount = minNodeCount;
    return this;
  }

   /**
   * The minimum number of worker nodes that the managed node group can scale in. Should be set together with &#39;maxNodeCount&#39;. Value for this attribute must be greater than equal to 1 and less than equal to maxNodeCount.
   * @return minNodeCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "The minimum number of worker nodes that the managed node group can scale in. Should be set together with 'maxNodeCount'. Value for this attribute must be greater than equal to 1 and less than equal to maxNodeCount.")

  public Integer getMinNodeCount() {
    return minNodeCount;
  }


  public void setMinNodeCount(Integer minNodeCount) {
    this.minNodeCount = minNodeCount;
  }



  public KubernetesAutoScaling maxNodeCount(Integer maxNodeCount) {
    
    this.maxNodeCount = maxNodeCount;
    return this;
  }

   /**
   * The maximum number of worker nodes that the managed node pool can scale-out. Should be set together with &#39;minNodeCount&#39;. Value for this attribute must be greater than equal to 1 and minNodeCount.
   * @return maxNodeCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "The maximum number of worker nodes that the managed node pool can scale-out. Should be set together with 'minNodeCount'. Value for this attribute must be greater than equal to 1 and minNodeCount.")

  public Integer getMaxNodeCount() {
    return maxNodeCount;
  }


  public void setMaxNodeCount(Integer maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesAutoScaling kubernetesAutoScaling = (KubernetesAutoScaling) o;
    return Objects.equals(this.minNodeCount, kubernetesAutoScaling.minNodeCount) && Objects.equals(this.maxNodeCount, kubernetesAutoScaling.maxNodeCount);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesAutoScaling {\n");
    
    sb.append("    minNodeCount: ").append(toIndentedString(minNodeCount)).append("\n");

    sb.append("    maxNodeCount: ").append(toIndentedString(maxNodeCount)).append("\n");
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

