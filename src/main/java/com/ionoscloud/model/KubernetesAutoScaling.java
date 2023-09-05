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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class KubernetesAutoScaling {
  
  public static final String SERIALIZED_NAME_MAX_NODE_COUNT = "maxNodeCount";
  @SerializedName(SERIALIZED_NAME_MAX_NODE_COUNT)
  private Integer maxNodeCount;


  public static final String SERIALIZED_NAME_MIN_NODE_COUNT = "minNodeCount";
  @SerializedName(SERIALIZED_NAME_MIN_NODE_COUNT)
  private Integer minNodeCount;

  

  public KubernetesAutoScaling maxNodeCount(Integer maxNodeCount) {
    
    this.maxNodeCount = maxNodeCount;
    return this;
  }

   /**
   * The maximum number of worker nodes that the managed node pool can scale in. Must be &gt;&#x3D; minNodeCount and must be &gt;&#x3D; nodeCount. Required if autoScaling is specified.
   * @return maxNodeCount
  **/
  @ApiModelProperty(example = "3", required = true, value = "The maximum number of worker nodes that the managed node pool can scale in. Must be >= minNodeCount and must be >= nodeCount. Required if autoScaling is specified.")

  public Integer getMaxNodeCount() {
    return maxNodeCount;
  }


  public void setMaxNodeCount(Integer maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
  }



  public KubernetesAutoScaling minNodeCount(Integer minNodeCount) {
    
    this.minNodeCount = minNodeCount;
    return this;
  }

   /**
   * The minimum number of working nodes that the managed node pool can scale must be &gt;&#x3D; 1 and &gt;&#x3D; nodeCount. Required if autoScaling is specified.
   * @return minNodeCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "The minimum number of working nodes that the managed node pool can scale must be >= 1 and >= nodeCount. Required if autoScaling is specified.")

  public Integer getMinNodeCount() {
    return minNodeCount;
  }


  public void setMinNodeCount(Integer minNodeCount) {
    this.minNodeCount = minNodeCount;
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
    return Objects.equals(this.maxNodeCount, kubernetesAutoScaling.maxNodeCount) && Objects.equals(this.minNodeCount, kubernetesAutoScaling.minNodeCount);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesAutoScaling {\n");
    
    sb.append("    maxNodeCount: ").append(toIndentedString(maxNodeCount)).append("\n");

    sb.append("    minNodeCount: ").append(toIndentedString(minNodeCount)).append("\n");
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



// KubernetesAutoScaling instantiates a new KubernetesAutoScaling object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public KubernetesAutoScaling(Integer MaxNodeCount, Integer MinNodeCount) {

	this.maxNodeCount = MaxNodeCount;
	this.minNodeCount = MinNodeCount;
}

public KubernetesAutoScaling() {
}

}
