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
import com.ionoscloud.model.ErrorMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-05T12:38:36.990Z[Etc/UTC]")

public class Error {
  
  public static final String SERIALIZED_NAME_HTTP_STATUS = "httpStatus";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private Integer httpStatus;


  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ErrorMessage> messages = null;

  

   /**
   * HTTP status code of the operation.
   * @return httpStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400", value = "HTTP status code of the operation.")

  public Integer getHttpStatus() {
    return httpStatus;
  }


  public void setHttpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
  }



  public Error messages(List<ErrorMessage> messages) {
    
    this.messages = messages;
    return this;
  }

  public Error addMessagesItem(ErrorMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<ErrorMessage>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ErrorMessage> getMessages() {
    return messages;
  }


  public void setMessages(List<ErrorMessage> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.httpStatus, error.httpStatus) && Objects.equals(this.messages, error.messages);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");

    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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



// Error instantiates a new Error object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public Error() {

}


}
