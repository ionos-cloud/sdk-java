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
import java.util.ArrayList;
import java.util.List;

/**
 * ImageProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T10:06:24.683Z[Etc/UTC]")

public class ImageProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public static final String SERIALIZED_NAME_CPU_HOT_PLUG = "cpuHotPlug";
  @SerializedName(SERIALIZED_NAME_CPU_HOT_PLUG)
  private Boolean cpuHotPlug;

  public static final String SERIALIZED_NAME_CPU_HOT_UNPLUG = "cpuHotUnplug";
  @SerializedName(SERIALIZED_NAME_CPU_HOT_UNPLUG)
  private Boolean cpuHotUnplug;

  public static final String SERIALIZED_NAME_RAM_HOT_PLUG = "ramHotPlug";
  @SerializedName(SERIALIZED_NAME_RAM_HOT_PLUG)
  private Boolean ramHotPlug;

  public static final String SERIALIZED_NAME_RAM_HOT_UNPLUG = "ramHotUnplug";
  @SerializedName(SERIALIZED_NAME_RAM_HOT_UNPLUG)
  private Boolean ramHotUnplug;

  public static final String SERIALIZED_NAME_NIC_HOT_PLUG = "nicHotPlug";
  @SerializedName(SERIALIZED_NAME_NIC_HOT_PLUG)
  private Boolean nicHotPlug;

  public static final String SERIALIZED_NAME_NIC_HOT_UNPLUG = "nicHotUnplug";
  @SerializedName(SERIALIZED_NAME_NIC_HOT_UNPLUG)
  private Boolean nicHotUnplug;

  public static final String SERIALIZED_NAME_DISC_VIRTIO_HOT_PLUG = "discVirtioHotPlug";
  @SerializedName(SERIALIZED_NAME_DISC_VIRTIO_HOT_PLUG)
  private Boolean discVirtioHotPlug;

  public static final String SERIALIZED_NAME_DISC_VIRTIO_HOT_UNPLUG = "discVirtioHotUnplug";
  @SerializedName(SERIALIZED_NAME_DISC_VIRTIO_HOT_UNPLUG)
  private Boolean discVirtioHotUnplug;

  public static final String SERIALIZED_NAME_DISC_SCSI_HOT_PLUG = "discScsiHotPlug";
  @SerializedName(SERIALIZED_NAME_DISC_SCSI_HOT_PLUG)
  private Boolean discScsiHotPlug;

  public static final String SERIALIZED_NAME_DISC_SCSI_HOT_UNPLUG = "discScsiHotUnplug";
  @SerializedName(SERIALIZED_NAME_DISC_SCSI_HOT_UNPLUG)
  private Boolean discScsiHotUnplug;

  /**
   * OS type for this image.
   */
  @JsonAdapter(LicenceTypeEnum.Adapter.class)
  public enum LicenceTypeEnum {
    UNKNOWN("UNKNOWN"),
    
    WINDOWS("WINDOWS"),
    
    WINDOWS2016("WINDOWS2016"),
    
    WINDOWS2022("WINDOWS2022"),
    
    LINUX("LINUX"),
    
    OTHER("OTHER");

    private String value;

    LicenceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LicenceTypeEnum fromValue(String value) {

      for (LicenceTypeEnum b : LicenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LicenceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LicenceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LicenceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LicenceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LICENCE_TYPE = "licenceType";
  @SerializedName(SERIALIZED_NAME_LICENCE_TYPE)
  private LicenceTypeEnum licenceType;

  /**
   * The image type.
   */
  @JsonAdapter(ImageTypeEnum.Adapter.class)
  public enum ImageTypeEnum {
    HDD("HDD"),
    
    CDROM("CDROM"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    ImageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageTypeEnum fromValue(String value) {

      for (ImageTypeEnum b : ImageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private ImageTypeEnum imageType;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_IMAGE_ALIASES = "imageAliases";
  @SerializedName(SERIALIZED_NAME_IMAGE_ALIASES)
  private List<String> imageAliases = null;

  /**
   * Cloud init compatibility.
   */
  @JsonAdapter(CloudInitEnum.Adapter.class)
  public enum CloudInitEnum {
    NONE("NONE"),
    
    V1("V1");

    private String value;

    CloudInitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CloudInitEnum fromValue(String value) {

      for (CloudInitEnum b : CloudInitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CloudInitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CloudInitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CloudInitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CloudInitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLOUD_INIT = "cloudInit";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT)
  private CloudInitEnum cloudInit;


  public ImageProperties name(String name) {
    
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


  public ImageProperties description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Human-readable description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Image/Snapshot of Ubuntu ", value = "Human-readable description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Location of that image/snapshot. 
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "us/las", value = "Location of that image/snapshot. ")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


   /**
   * The size of the image in GB.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.0", value = "The size of the image in GB.")

  public BigDecimal getSize() {
    return size;
  }


  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public ImageProperties cpuHotPlug(Boolean cpuHotPlug) {
    
    this.cpuHotPlug = cpuHotPlug;
    return this;
  }

   /**
   * Hot-plug capable CPU (no reboot required).
   * @return cpuHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-plug capable CPU (no reboot required).")

  public Boolean getCpuHotPlug() {
    return cpuHotPlug;
  }


  public void setCpuHotPlug(Boolean cpuHotPlug) {
    this.cpuHotPlug = cpuHotPlug;
  }


  public ImageProperties cpuHotUnplug(Boolean cpuHotUnplug) {
    
    this.cpuHotUnplug = cpuHotUnplug;
    return this;
  }

   /**
   * Hot-unplug capable CPU (no reboot required).
   * @return cpuHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-unplug capable CPU (no reboot required).")

  public Boolean getCpuHotUnplug() {
    return cpuHotUnplug;
  }


  public void setCpuHotUnplug(Boolean cpuHotUnplug) {
    this.cpuHotUnplug = cpuHotUnplug;
  }


  public ImageProperties ramHotPlug(Boolean ramHotPlug) {
    
    this.ramHotPlug = ramHotPlug;
    return this;
  }

   /**
   * Hot-plug capable RAM (no reboot required).
   * @return ramHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-plug capable RAM (no reboot required).")

  public Boolean getRamHotPlug() {
    return ramHotPlug;
  }


  public void setRamHotPlug(Boolean ramHotPlug) {
    this.ramHotPlug = ramHotPlug;
  }


  public ImageProperties ramHotUnplug(Boolean ramHotUnplug) {
    
    this.ramHotUnplug = ramHotUnplug;
    return this;
  }

   /**
   * Hot-unplug capable RAM (no reboot required).
   * @return ramHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-unplug capable RAM (no reboot required).")

  public Boolean getRamHotUnplug() {
    return ramHotUnplug;
  }


  public void setRamHotUnplug(Boolean ramHotUnplug) {
    this.ramHotUnplug = ramHotUnplug;
  }


  public ImageProperties nicHotPlug(Boolean nicHotPlug) {
    
    this.nicHotPlug = nicHotPlug;
    return this;
  }

   /**
   * Hot-plug capable NIC (no reboot required).
   * @return nicHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-plug capable NIC (no reboot required).")

  public Boolean getNicHotPlug() {
    return nicHotPlug;
  }


  public void setNicHotPlug(Boolean nicHotPlug) {
    this.nicHotPlug = nicHotPlug;
  }


  public ImageProperties nicHotUnplug(Boolean nicHotUnplug) {
    
    this.nicHotUnplug = nicHotUnplug;
    return this;
  }

   /**
   * Hot-unplug capable NIC (no reboot required).
   * @return nicHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-unplug capable NIC (no reboot required).")

  public Boolean getNicHotUnplug() {
    return nicHotUnplug;
  }


  public void setNicHotUnplug(Boolean nicHotUnplug) {
    this.nicHotUnplug = nicHotUnplug;
  }


  public ImageProperties discVirtioHotPlug(Boolean discVirtioHotPlug) {
    
    this.discVirtioHotPlug = discVirtioHotPlug;
    return this;
  }

   /**
   * Hot-plug capable Virt-IO drive (no reboot required).
   * @return discVirtioHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-plug capable Virt-IO drive (no reboot required).")

  public Boolean getDiscVirtioHotPlug() {
    return discVirtioHotPlug;
  }


  public void setDiscVirtioHotPlug(Boolean discVirtioHotPlug) {
    this.discVirtioHotPlug = discVirtioHotPlug;
  }


  public ImageProperties discVirtioHotUnplug(Boolean discVirtioHotUnplug) {
    
    this.discVirtioHotUnplug = discVirtioHotUnplug;
    return this;
  }

   /**
   * Hot-unplug capable Virt-IO drive (no reboot required). Not supported with Windows VMs.
   * @return discVirtioHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-unplug capable Virt-IO drive (no reboot required). Not supported with Windows VMs.")

  public Boolean getDiscVirtioHotUnplug() {
    return discVirtioHotUnplug;
  }


  public void setDiscVirtioHotUnplug(Boolean discVirtioHotUnplug) {
    this.discVirtioHotUnplug = discVirtioHotUnplug;
  }


  public ImageProperties discScsiHotPlug(Boolean discScsiHotPlug) {
    
    this.discScsiHotPlug = discScsiHotPlug;
    return this;
  }

   /**
   * Hot-plug capable SCSI drive (no reboot required).
   * @return discScsiHotPlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-plug capable SCSI drive (no reboot required).")

  public Boolean getDiscScsiHotPlug() {
    return discScsiHotPlug;
  }


  public void setDiscScsiHotPlug(Boolean discScsiHotPlug) {
    this.discScsiHotPlug = discScsiHotPlug;
  }


  public ImageProperties discScsiHotUnplug(Boolean discScsiHotUnplug) {
    
    this.discScsiHotUnplug = discScsiHotUnplug;
    return this;
  }

   /**
   * Hot-unplug capable SCSI drive (no reboot required). Not supported with Windows VMs.
   * @return discScsiHotUnplug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Hot-unplug capable SCSI drive (no reboot required). Not supported with Windows VMs.")

  public Boolean getDiscScsiHotUnplug() {
    return discScsiHotUnplug;
  }


  public void setDiscScsiHotUnplug(Boolean discScsiHotUnplug) {
    this.discScsiHotUnplug = discScsiHotUnplug;
  }


  public ImageProperties licenceType(LicenceTypeEnum licenceType) {
    
    this.licenceType = licenceType;
    return this;
  }

   /**
   * OS type for this image.
   * @return licenceType
  **/
  @ApiModelProperty(example = "LINUX", required = true, value = "OS type for this image.")

  public LicenceTypeEnum getLicenceType() {
    return licenceType;
  }


  public void setLicenceType(LicenceTypeEnum licenceType) {
    this.licenceType = licenceType;
  }


   /**
   * The image type.
   * @return imageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HDD", value = "The image type.")

  public ImageTypeEnum getImageType() {
    return imageType;
  }


  public void setImageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
  }


   /**
   * Indicates whether the image is part of a public repository.
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the image is part of a public repository.")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


   /**
   * List of image aliases mapped for this Image
   * @return imageAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of image aliases mapped for this Image")

  public List<String> getImageAliases() {
    return imageAliases;
  }


  public void setImageAliases(List<String> imageAliases) {
    this.imageAliases = imageAliases;
  }


  public ImageProperties cloudInit(CloudInitEnum cloudInit) {
    
    this.cloudInit = cloudInit;
    return this;
  }

   /**
   * Cloud init compatibility.
   * @return cloudInit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "V1", value = "Cloud init compatibility.")

  public CloudInitEnum getCloudInit() {
    return cloudInit;
  }


  public void setCloudInit(CloudInitEnum cloudInit) {
    this.cloudInit = cloudInit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageProperties imageProperties = (ImageProperties) o;
    return Objects.equals(this.name, imageProperties.name) && Objects.equals(this.description, imageProperties.description) && Objects.equals(this.location, imageProperties.location) && Objects.equals(this.size, imageProperties.size) && Objects.equals(this.cpuHotPlug, imageProperties.cpuHotPlug) && Objects.equals(this.cpuHotUnplug, imageProperties.cpuHotUnplug) && Objects.equals(this.ramHotPlug, imageProperties.ramHotPlug) && Objects.equals(this.ramHotUnplug, imageProperties.ramHotUnplug) && Objects.equals(this.nicHotPlug, imageProperties.nicHotPlug) && Objects.equals(this.nicHotUnplug, imageProperties.nicHotUnplug) && Objects.equals(this.discVirtioHotPlug, imageProperties.discVirtioHotPlug) && Objects.equals(this.discVirtioHotUnplug, imageProperties.discVirtioHotUnplug) && Objects.equals(this.discScsiHotPlug, imageProperties.discScsiHotPlug) && Objects.equals(this.discScsiHotUnplug, imageProperties.discScsiHotUnplug) && Objects.equals(this.licenceType, imageProperties.licenceType) && Objects.equals(this.imageType, imageProperties.imageType) && Objects.equals(this._public, imageProperties._public) && Objects.equals(this.imageAliases, imageProperties.imageAliases) && Objects.equals(this.cloudInit, imageProperties.cloudInit);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    cpuHotPlug: ").append(toIndentedString(cpuHotPlug)).append("\n");
    sb.append("    cpuHotUnplug: ").append(toIndentedString(cpuHotUnplug)).append("\n");
    sb.append("    ramHotPlug: ").append(toIndentedString(ramHotPlug)).append("\n");
    sb.append("    ramHotUnplug: ").append(toIndentedString(ramHotUnplug)).append("\n");
    sb.append("    nicHotPlug: ").append(toIndentedString(nicHotPlug)).append("\n");
    sb.append("    nicHotUnplug: ").append(toIndentedString(nicHotUnplug)).append("\n");
    sb.append("    discVirtioHotPlug: ").append(toIndentedString(discVirtioHotPlug)).append("\n");
    sb.append("    discVirtioHotUnplug: ").append(toIndentedString(discVirtioHotUnplug)).append("\n");
    sb.append("    discScsiHotPlug: ").append(toIndentedString(discScsiHotPlug)).append("\n");
    sb.append("    discScsiHotUnplug: ").append(toIndentedString(discScsiHotUnplug)).append("\n");
    sb.append("    licenceType: ").append(toIndentedString(licenceType)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    imageAliases: ").append(toIndentedString(imageAliases)).append("\n");
    sb.append("    cloudInit: ").append(toIndentedString(cloudInit)).append("\n");
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

