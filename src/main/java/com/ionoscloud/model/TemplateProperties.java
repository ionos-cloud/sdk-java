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
import java.math.BigDecimal;

/**
 * TemplateProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class TemplateProperties {
  
  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private BigDecimal cores;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private BigDecimal ram;


  public static final String SERIALIZED_NAME_STORAGE_SIZE = "storageSize";
  @SerializedName(SERIALIZED_NAME_STORAGE_SIZE)
  private BigDecimal storageSize;

  

  public TemplateProperties cores(BigDecimal cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * The CPU cores count.
   * @return cores
  **/
  @ApiModelProperty(example = "2.0", required = true, value = "The CPU cores count.")

  public BigDecimal getCores() {
    return cores;
  }


  public void setCores(BigDecimal cores) {
    this.cores = cores;
  }



  public TemplateProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The resource name.
   * @return name
  **/
  @ApiModelProperty(example = "My resource", required = true, value = "The resource name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public TemplateProperties ram(BigDecimal ram) {
    
    this.ram = ram;
    return this;
  }

   /**
   * The RAM size in MB.
   * @return ram
  **/
  @ApiModelProperty(example = "2048.0", required = true, value = "The RAM size in MB.")

  public BigDecimal getRam() {
    return ram;
  }


  public void setRam(BigDecimal ram) {
    this.ram = ram;
  }



  public TemplateProperties storageSize(BigDecimal storageSize) {
    
    this.storageSize = storageSize;
    return this;
  }

   /**
   * The storage size in GB.
   * @return storageSize
  **/
  @ApiModelProperty(example = "10.0", required = true, value = "The storage size in GB.")

  public BigDecimal getStorageSize() {
    return storageSize;
  }


  public void setStorageSize(BigDecimal storageSize) {
    this.storageSize = storageSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateProperties templateProperties = (TemplateProperties) o;
    return Objects.equals(this.cores, templateProperties.cores) && Objects.equals(this.name, templateProperties.name) && Objects.equals(this.ram, templateProperties.ram) && Objects.equals(this.storageSize, templateProperties.storageSize);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateProperties {\n");
    
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");

    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
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



// TemplateProperties instantiates a new TemplateProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public TemplateProperties(BigDecimal Cores, String Name, BigDecimal Ram, BigDecimal StorageSize) {

	this.cores = Cores;
	this.name = Name;
	this.ram = Ram;
	this.storageSize = StorageSize;
}

public TemplateProperties() {
}

}
