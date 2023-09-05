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
import com.ionoscloud.model.ResourceReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ServerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class ServerProperties {
  
  /**
   * The availability zone in which the server should be provisioned.
   */
  @JsonAdapter(AvailabilityZoneEnum.Adapter.class)
  public enum AvailabilityZoneEnum {
    AUTO("AUTO"),
    
    ZONE_1("ZONE_1"),
    
    ZONE_2("ZONE_2");

    private String value;

    AvailabilityZoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityZoneEnum fromValue(String value) {

      for (AvailabilityZoneEnum b : AvailabilityZoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AvailabilityZoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityZoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityZoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailabilityZoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "availabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private AvailabilityZoneEnum availabilityZone;


  public static final String SERIALIZED_NAME_BOOT_CDROM = "bootCdrom";
  @SerializedName(SERIALIZED_NAME_BOOT_CDROM)
  private ResourceReference bootCdrom;


  public static final String SERIALIZED_NAME_BOOT_VOLUME = "bootVolume";
  @SerializedName(SERIALIZED_NAME_BOOT_VOLUME)
  private ResourceReference bootVolume;


  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;


  public static final String SERIALIZED_NAME_CPU_FAMILY = "cpuFamily";
  @SerializedName(SERIALIZED_NAME_CPU_FAMILY)
  private String cpuFamily;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Integer ram;


  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "templateUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  private String templateUuid;


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  /**
   * Status of the virtual machine.
   */
  @JsonAdapter(VmStateEnum.Adapter.class)
  public enum VmStateEnum {
    NOSTATE("NOSTATE"),
    
    RUNNING("RUNNING"),
    
    BLOCKED("BLOCKED"),
    
    PAUSED("PAUSED"),
    
    SHUTDOWN("SHUTDOWN"),
    
    SHUTOFF("SHUTOFF"),
    
    CRASHED("CRASHED"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    VmStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VmStateEnum fromValue(String value) {

      for (VmStateEnum b : VmStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VmStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VmStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VmStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VmStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VM_STATE = "vmState";
  @SerializedName(SERIALIZED_NAME_VM_STATE)
  private VmStateEnum vmState;

  

  public ServerProperties availabilityZone(AvailabilityZoneEnum availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * The availability zone in which the server should be provisioned.
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUTO", value = "The availability zone in which the server should be provisioned.")

  public AvailabilityZoneEnum getAvailabilityZone() {
    return availabilityZone;
  }


  public void setAvailabilityZone(AvailabilityZoneEnum availabilityZone) {
    this.availabilityZone = availabilityZone;
  }



  public ServerProperties bootCdrom(ResourceReference bootCdrom) {
    
    this.bootCdrom = bootCdrom;
    return this;
  }

   /**
   * Get bootCdrom
   * @return bootCdrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getBootCdrom() {
    return bootCdrom;
  }


  public void setBootCdrom(ResourceReference bootCdrom) {
    this.bootCdrom = bootCdrom;
  }



  public ServerProperties bootVolume(ResourceReference bootVolume) {
    
    this.bootVolume = bootVolume;
    return this;
  }

   /**
   * Get bootVolume
   * @return bootVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getBootVolume() {
    return bootVolume;
  }


  public void setBootVolume(ResourceReference bootVolume) {
    this.bootVolume = bootVolume;
  }



  public ServerProperties cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * The total number of cores for the enterprise server.
   * @return cores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The total number of cores for the enterprise server.")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }



  public ServerProperties cpuFamily(String cpuFamily) {
    
    this.cpuFamily = cpuFamily;
    return this;
  }

   /**
   * CPU architecture on which server gets provisioned; not all CPU architectures are available in all datacenter regions; available CPU architectures can be retrieved from the datacenter resource; must not be provided for CUBE servers.
   * @return cpuFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AMD_OPTERON", value = "CPU architecture on which server gets provisioned; not all CPU architectures are available in all datacenter regions; available CPU architectures can be retrieved from the datacenter resource; must not be provided for CUBE servers.")

  public String getCpuFamily() {
    return cpuFamily;
  }


  public void setCpuFamily(String cpuFamily) {
    this.cpuFamily = cpuFamily;
  }



  public ServerProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the  resource.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "The name of the  resource.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public ServerProperties ram(Integer ram) {
    
    this.ram = ram;
    return this;
  }

   /**
   * The memory size for the enterprise server in MB, such as 2048. Size must be specified in multiples of 256 MB with a minimum of 256 MB; however, if you set ramHotPlug to TRUE then you must use a minimum of 1024 MB. If you set the RAM size more than 240GB, then ramHotPlug will be set to FALSE and can not be set to TRUE unless RAM size not set to less than 240GB.
   * @return ram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4096", value = "The memory size for the enterprise server in MB, such as 2048. Size must be specified in multiples of 256 MB with a minimum of 256 MB; however, if you set ramHotPlug to TRUE then you must use a minimum of 1024 MB. If you set the RAM size more than 240GB, then ramHotPlug will be set to FALSE and can not be set to TRUE unless RAM size not set to less than 240GB.")

  public Integer getRam() {
    return ram;
  }


  public void setRam(Integer ram) {
    this.ram = ram;
  }



  public ServerProperties templateUuid(String templateUuid) {
    
    this.templateUuid = templateUuid;
    return this;
  }

   /**
   * The ID of the template for creating a CUBE server; the available templates for CUBE servers can be found on the templates resource.
   * @return templateUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15f67991-0f51-4efc-a8ad-ef1fb31a480c", value = "The ID of the template for creating a CUBE server; the available templates for CUBE servers can be found on the templates resource.")

  public String getTemplateUuid() {
    return templateUuid;
  }


  public void setTemplateUuid(String templateUuid) {
    this.templateUuid = templateUuid;
  }



  public ServerProperties type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Server type: CUBE or ENTERPRISE.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CUBE", value = "Server type: CUBE or ENTERPRISE.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



   /**
   * Status of the virtual machine.
   * @return vmState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RUNNING", value = "Status of the virtual machine.")

  public VmStateEnum getVmState() {
    return vmState;
  }


  public void setVmState(VmStateEnum vmState) {
    this.vmState = vmState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerProperties serverProperties = (ServerProperties) o;
    return Objects.equals(this.availabilityZone, serverProperties.availabilityZone) && Objects.equals(this.bootCdrom, serverProperties.bootCdrom) && Objects.equals(this.bootVolume, serverProperties.bootVolume) && Objects.equals(this.cores, serverProperties.cores) && Objects.equals(this.cpuFamily, serverProperties.cpuFamily) && Objects.equals(this.name, serverProperties.name) && true && Objects.equals(this.ram, serverProperties.ram) && Objects.equals(this.templateUuid, serverProperties.templateUuid) && Objects.equals(this.type, serverProperties.type) && Objects.equals(this.vmState, serverProperties.vmState);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerProperties {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");

    sb.append("    bootCdrom: ").append(toIndentedString(bootCdrom)).append("\n");

    sb.append("    bootVolume: ").append(toIndentedString(bootVolume)).append("\n");

    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");

    sb.append("    cpuFamily: ").append(toIndentedString(cpuFamily)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");

    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    vmState: ").append(toIndentedString(vmState)).append("\n");
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



// ServerProperties instantiates a new ServerProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public ServerProperties() {

}


}
