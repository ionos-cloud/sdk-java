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
 * FlowLogProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class FlowLogProperties {
  
  /**
   * Specifies the traffic action pattern.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    ACCEPTED("ACCEPTED"),
    
    REJECTED("REJECTED"),
    
    ALL("ALL");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {

      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;


  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;


  /**
   * Specifies the traffic direction pattern.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INGRESS("INGRESS"),
    
    EGRESS("EGRESS"),
    
    BIDIRECTIONAL("BIDIRECTIONAL");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {

      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  

  public FlowLogProperties action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Specifies the traffic action pattern.
   * @return action
  **/
  @ApiModelProperty(example = "ACCEPTED", required = true, value = "Specifies the traffic action pattern.")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }



  public FlowLogProperties bucket(String bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * The S3 bucket name of an existing IONOS Cloud S3 bucket.
   * @return bucket
  **/
  @ApiModelProperty(example = "bucketName/key", required = true, value = "The S3 bucket name of an existing IONOS Cloud S3 bucket.")

  public String getBucket() {
    return bucket;
  }


  public void setBucket(String bucket) {
    this.bucket = bucket;
  }



  public FlowLogProperties direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Specifies the traffic direction pattern.
   * @return direction
  **/
  @ApiModelProperty(example = "INGRESS", required = true, value = "Specifies the traffic direction pattern.")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }



  public FlowLogProperties name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowLogProperties flowLogProperties = (FlowLogProperties) o;
    return Objects.equals(this.action, flowLogProperties.action) && Objects.equals(this.bucket, flowLogProperties.bucket) && Objects.equals(this.direction, flowLogProperties.direction) && Objects.equals(this.name, flowLogProperties.name);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowLogProperties {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");

    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");

    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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



// FlowLogProperties instantiates a new FlowLogProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public FlowLogProperties(ActionEnum Action, String Bucket, DirectionEnum Direction, String Name) {

	this.action = Action;
	this.bucket = Bucket;
	this.direction = Direction;
	this.name = Name;
}

public FlowLogProperties() {
}

}
