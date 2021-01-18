/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
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
 * KubernetesMaintenanceWindow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-15T13:32:34.479649+02:00[Europe/Bucharest]")
public class KubernetesMaintenanceWindow {
  /**
   * The day of the week for a maintenance window.
   */
  @JsonAdapter(DayOfTheWeekEnum.Adapter.class)
  public enum DayOfTheWeekEnum {
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday"),
    
    SUNDAY("Sunday");

    private String value;

    DayOfTheWeekEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayOfTheWeekEnum fromValue(String value) {
      for (DayOfTheWeekEnum b : DayOfTheWeekEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DayOfTheWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayOfTheWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayOfTheWeekEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DayOfTheWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DAY_OF_THE_WEEK = "dayOfTheWeek";
  @SerializedName(SERIALIZED_NAME_DAY_OF_THE_WEEK)
  private DayOfTheWeekEnum dayOfTheWeek;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;


  public KubernetesMaintenanceWindow dayOfTheWeek(DayOfTheWeekEnum dayOfTheWeek) {
    
    this.dayOfTheWeek = dayOfTheWeek;
    return this;
  }

   /**
   * The day of the week for a maintenance window.
   * @return dayOfTheWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Monday", value = "The day of the week for a maintenance window.")

  public DayOfTheWeekEnum getDayOfTheWeek() {
    return dayOfTheWeek;
  }


  public void setDayOfTheWeek(DayOfTheWeekEnum dayOfTheWeek) {
    this.dayOfTheWeek = dayOfTheWeek;
  }


  public KubernetesMaintenanceWindow time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * The time to use for a maintenance window. Accepted formats are: HH:mm:ss; HH:mm:ss\&quot;Z\&quot;; HH:mm:ssZ. This time may varies by 15 minutes.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13:00:00", value = "The time to use for a maintenance window. Accepted formats are: HH:mm:ss; HH:mm:ss\"Z\"; HH:mm:ssZ. This time may varies by 15 minutes.")

  public String getTime() {
    return time;
  }


  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesMaintenanceWindow kubernetesMaintenanceWindow = (KubernetesMaintenanceWindow) o;
    return Objects.equals(this.dayOfTheWeek, kubernetesMaintenanceWindow.dayOfTheWeek) && Objects.equals(this.time, kubernetesMaintenanceWindow.time);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesMaintenanceWindow {\n");
    sb.append("    dayOfTheWeek: ").append(toIndentedString(dayOfTheWeek)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

