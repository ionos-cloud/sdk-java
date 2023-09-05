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
import com.ionoscloud.model.LabelProperties;
import com.ionoscloud.model.NoStateMetaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * Label
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class Label {
  
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;


  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private NoStateMetaData metadata;


  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private LabelProperties properties;


  /**
   * The type of object that has been created.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LABEL("label");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {

      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  

   /**
   * URL to the object representation (absolute path).
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<RESOURCE-URI>", value = "URL to the object representation (absolute path).")

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }



   /**
   * Label is identified using standard URN.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "urn:label:datacenter:700e1cab-99b2-4c30-ba8c-1d273ddba022:environment", value = "Label is identified using standard URN.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  public Label metadata(NoStateMetaData metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NoStateMetaData getMetadata() {
    return metadata;
  }


  public void setMetadata(NoStateMetaData metadata) {
    this.metadata = metadata;
  }



  public Label properties(LabelProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "")

  public LabelProperties getProperties() {
    return properties;
  }


  public void setProperties(LabelProperties properties) {
    this.properties = properties;
  }



   /**
   * The type of object that has been created.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of object that has been created.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.href, label.href) && Objects.equals(this.id, label.id) && Objects.equals(this.metadata, label.metadata) && Objects.equals(this.properties, label.properties) && Objects.equals(this.type, label.type);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");

    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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



// Label instantiates a new Label object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public Label(LabelProperties Properties) {

	this.properties = Properties;
}

public Label() {
}

}
