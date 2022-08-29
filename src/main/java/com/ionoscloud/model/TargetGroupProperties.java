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
import com.ionoscloud.model.TargetGroupHealthCheck;
import com.ionoscloud.model.TargetGroupHttpHealthCheck;
import com.ionoscloud.model.TargetGroupTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TargetGroupProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:52:45.187Z[Etc/UTC]")

public class TargetGroupProperties {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  /**
   * Balancing algorithm
   */
  @JsonAdapter(AlgorithmEnum.Adapter.class)
  public enum AlgorithmEnum {
    ROUND_ROBIN("ROUND_ROBIN"),
    
    LEAST_CONNECTION("LEAST_CONNECTION"),
    
    RANDOM("RANDOM"),
    
    SOURCE_IP("SOURCE_IP");

    private String value;

    AlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlgorithmEnum fromValue(String value) {

      for (AlgorithmEnum b : AlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AlgorithmEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private AlgorithmEnum algorithm;


  /**
   * Balancing protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    HTTP("HTTP");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {

      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;


  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<TargetGroupTarget> targets = null;


  public static final String SERIALIZED_NAME_HEALTH_CHECK = "healthCheck";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK)
  private TargetGroupHealthCheck healthCheck;


  public static final String SERIALIZED_NAME_HTTP_HEALTH_CHECK = "httpHealthCheck";
  @SerializedName(SERIALIZED_NAME_HTTP_HEALTH_CHECK)
  private TargetGroupHttpHealthCheck httpHealthCheck;

  

  public TargetGroupProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the target group.
   * @return name
  **/
  @ApiModelProperty(example = "My target group", required = true, value = "The name of the target group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public TargetGroupProperties algorithm(AlgorithmEnum algorithm) {
    
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Balancing algorithm
   * @return algorithm
  **/
  @ApiModelProperty(example = "ROUND_ROBIN", required = true, value = "Balancing algorithm")

  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }


  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
  }



  public TargetGroupProperties protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Balancing protocol
   * @return protocol
  **/
  @ApiModelProperty(example = "HTTP", required = true, value = "Balancing protocol")

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }



  public TargetGroupProperties targets(List<TargetGroupTarget> targets) {
    
    this.targets = targets;
    return this;
  }

  public TargetGroupProperties addTargetsItem(TargetGroupTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<TargetGroupTarget>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Array of items in the collection.
   * @return targets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of items in the collection.")

  public List<TargetGroupTarget> getTargets() {
    return targets;
  }


  public void setTargets(List<TargetGroupTarget> targets) {
    this.targets = targets;
  }



  public TargetGroupProperties healthCheck(TargetGroupHealthCheck healthCheck) {
    
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TargetGroupHealthCheck getHealthCheck() {
    return healthCheck;
  }


  public void setHealthCheck(TargetGroupHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
  }



  public TargetGroupProperties httpHealthCheck(TargetGroupHttpHealthCheck httpHealthCheck) {
    
    this.httpHealthCheck = httpHealthCheck;
    return this;
  }

   /**
   * Get httpHealthCheck
   * @return httpHealthCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TargetGroupHttpHealthCheck getHttpHealthCheck() {
    return httpHealthCheck;
  }


  public void setHttpHealthCheck(TargetGroupHttpHealthCheck httpHealthCheck) {
    this.httpHealthCheck = httpHealthCheck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupProperties targetGroupProperties = (TargetGroupProperties) o;
    return Objects.equals(this.name, targetGroupProperties.name) && Objects.equals(this.algorithm, targetGroupProperties.algorithm) && Objects.equals(this.protocol, targetGroupProperties.protocol) && Objects.equals(this.targets, targetGroupProperties.targets) && Objects.equals(this.healthCheck, targetGroupProperties.healthCheck) && Objects.equals(this.httpHealthCheck, targetGroupProperties.httpHealthCheck);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");

    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");

    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");

    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");

    sb.append("    httpHealthCheck: ").append(toIndentedString(httpHealthCheck)).append("\n");
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

