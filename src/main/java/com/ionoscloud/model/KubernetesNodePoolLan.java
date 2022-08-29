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
import com.ionoscloud.model.KubernetesNodePoolLanRoutes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * KubernetesNodePoolLan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:52:45.187Z[Etc/UTC]")

public class KubernetesNodePoolLan {
  
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;


  public static final String SERIALIZED_NAME_DHCP = "dhcp";
  @SerializedName(SERIALIZED_NAME_DHCP)
  private Boolean dhcp;


  public static final String SERIALIZED_NAME_ROUTES = "routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List<KubernetesNodePoolLanRoutes> routes = null;

  

  public KubernetesNodePoolLan id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The LAN ID of an existing LAN at the related datacenter
   * @return id
  **/
  @ApiModelProperty(example = "3", required = true, value = "The LAN ID of an existing LAN at the related datacenter")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }



  public KubernetesNodePoolLan dhcp(Boolean dhcp) {
    
    this.dhcp = dhcp;
    return this;
  }

   /**
   * Indicates if the Kubernetes node pool LAN will reserve an IP using DHCP.
   * @return dhcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the Kubernetes node pool LAN will reserve an IP using DHCP.")

  public Boolean getDhcp() {
    return dhcp;
  }


  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
  }



  public KubernetesNodePoolLan routes(List<KubernetesNodePoolLanRoutes> routes) {
    
    this.routes = routes;
    return this;
  }

  public KubernetesNodePoolLan addRoutesItem(KubernetesNodePoolLanRoutes routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<KubernetesNodePoolLanRoutes>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * array of additional LANs attached to worker nodes
   * @return routes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "array of additional LANs attached to worker nodes")

  public List<KubernetesNodePoolLanRoutes> getRoutes() {
    return routes;
  }


  public void setRoutes(List<KubernetesNodePoolLanRoutes> routes) {
    this.routes = routes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesNodePoolLan kubernetesNodePoolLan = (KubernetesNodePoolLan) o;
    return Objects.equals(this.id, kubernetesNodePoolLan.id) && Objects.equals(this.dhcp, kubernetesNodePoolLan.dhcp) && Objects.equals(this.routes, kubernetesNodePoolLan.routes);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesNodePoolLan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");

    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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

