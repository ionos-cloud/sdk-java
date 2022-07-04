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
 * RemoteConsoleUrl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T09:11:50.011Z[Etc/UTC]")

public class RemoteConsoleUrl {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


   /**
   * The remote console url with the jwToken parameter for access
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://dcd.ionos.com/noVNC?token=eyJ0eXAiOiJKV1QiLCJraWQiOiI0MWM1MDFlNC03NGY3LTQwYjctYmMxMi1lZWIzMTAzNThlZDkiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJpb25vc2Nsb3VkIiwiaWF0IjoxNjAyNDg5NTkzMDcxLCJzZXJ2ZXIiOnsidXVpZCI6IjMwNGEwZGVlLWE3OTgtNDNhNi04MzIyLTk3M2NiYzc3Yjg4ZCIsIm5hbWUiOiJTZXJ2ZXIifX0.TND9kJd8GXM39XP5PMH_LnF_99al4MEkI_eoEowPvPztirgM50aZEdg6SuLYQzg-R7vrA7hEFaK4NJb2BUUsIZYVMhjl1QmKUE5TnP0Q2zYnIfNQNZFDu2rKrOydPCkPQwlMVvvZLeBSz7lrKYujF-qZ_yY_6SHlFtt-rg6IznRtup8AFziXtl-9cEsWU92_GCTd5LiriQrsnFAiGRbb0p2_6OYAQAH9FeWu4cxrbSwUmeR7Q4klJyZqFd0fv6UTFBtpSiyci7rsB142MXyLcqM4PrBkgd9P5OFbJYf5lbsb9pW04wLSl9rqoWGgZvWsqpuzosUkQRZt_O5yuYmT9w", value = "The remote console url with the jwToken parameter for access")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteConsoleUrl remoteConsoleUrl = (RemoteConsoleUrl) o;
    return Objects.equals(this.url, remoteConsoleUrl.url);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteConsoleUrl {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

