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
 * UserPropertiesPut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class UserPropertiesPut {
  
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;


  public static final String SERIALIZED_NAME_ADMINISTRATOR = "administrator";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATOR)
  private Boolean administrator;


  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;


  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;


  public static final String SERIALIZED_NAME_FORCE_SEC_AUTH = "forceSecAuth";
  @SerializedName(SERIALIZED_NAME_FORCE_SEC_AUTH)
  private Boolean forceSecAuth;


  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;


  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public static final String SERIALIZED_NAME_SEC_AUTH_ACTIVE = "secAuthActive";
  @SerializedName(SERIALIZED_NAME_SEC_AUTH_ACTIVE)
  private Boolean secAuthActive;

  

  public UserPropertiesPut active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Indicates if the user is active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the user is active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }



  public UserPropertiesPut administrator(Boolean administrator) {
    
    this.administrator = administrator;
    return this;
  }

   /**
   * Indicates if the user has admin rights.
   * @return administrator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the user has admin rights.")

  public Boolean getAdministrator() {
    return administrator;
  }


  public void setAdministrator(Boolean administrator) {
    this.administrator = administrator;
  }



  public UserPropertiesPut email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }



  public UserPropertiesPut firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * The first name of the user.
   * @return firstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the user.")

  public String getFirstname() {
    return firstname;
  }


  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }



  public UserPropertiesPut forceSecAuth(Boolean forceSecAuth) {
    
    this.forceSecAuth = forceSecAuth;
    return this;
  }

   /**
   * Indicates if secure authentication should be forced on the user.
   * @return forceSecAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if secure authentication should be forced on the user.")

  public Boolean getForceSecAuth() {
    return forceSecAuth;
  }


  public void setForceSecAuth(Boolean forceSecAuth) {
    this.forceSecAuth = forceSecAuth;
  }



  public UserPropertiesPut lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * The last name of the user.
   * @return lastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the user.")

  public String getLastname() {
    return lastname;
  }


  public void setLastname(String lastname) {
    this.lastname = lastname;
  }



  public UserPropertiesPut password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * password of the user
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "password of the user")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }



  public UserPropertiesPut secAuthActive(Boolean secAuthActive) {
    
    this.secAuthActive = secAuthActive;
    return this;
  }

   /**
   * Indicates if secure authentication is active for the user.
   * @return secAuthActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if secure authentication is active for the user.")

  public Boolean getSecAuthActive() {
    return secAuthActive;
  }


  public void setSecAuthActive(Boolean secAuthActive) {
    this.secAuthActive = secAuthActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPropertiesPut userPropertiesPut = (UserPropertiesPut) o;
    return Objects.equals(this.active, userPropertiesPut.active) && Objects.equals(this.administrator, userPropertiesPut.administrator) && Objects.equals(this.email, userPropertiesPut.email) && Objects.equals(this.firstname, userPropertiesPut.firstname) && Objects.equals(this.forceSecAuth, userPropertiesPut.forceSecAuth) && Objects.equals(this.lastname, userPropertiesPut.lastname) && Objects.equals(this.password, userPropertiesPut.password) && Objects.equals(this.secAuthActive, userPropertiesPut.secAuthActive);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPropertiesPut {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");

    sb.append("    administrator: ").append(toIndentedString(administrator)).append("\n");

    sb.append("    email: ").append(toIndentedString(email)).append("\n");

    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");

    sb.append("    forceSecAuth: ").append(toIndentedString(forceSecAuth)).append("\n");

    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");

    sb.append("    password: ").append(toIndentedString(password)).append("\n");

    sb.append("    secAuthActive: ").append(toIndentedString(secAuthActive)).append("\n");
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



// UserPropertiesPut instantiates a new UserPropertiesPut object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public UserPropertiesPut() {

}


}
