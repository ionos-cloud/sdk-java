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
import com.ionoscloud.model.LanNics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LanEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-23T15:51:08.261Z[Etc/UTC]")

public class LanEntities {
  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private LanNics nics;


  public LanEntities nics(LanNics nics) {
    
    this.nics = nics;
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LanNics getNics() {
    return nics;
  }


  public void setNics(LanNics nics) {
    this.nics = nics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanEntities lanEntities = (LanEntities) o;
    return Objects.equals(this.nics, lanEntities.nics);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanEntities {\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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

