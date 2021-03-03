/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets NatGatewayRuleProtocol
 */
@JsonAdapter(NatGatewayRuleProtocol.Adapter.class)
public enum NatGatewayRuleProtocol {
  
  TCP("TCP"),
  
  UDP("UDP"),
  
  ICMP("ICMP"),
  
  ALL("ALL");

  private String value;

  NatGatewayRuleProtocol(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NatGatewayRuleProtocol fromValue(String value) {
    for (NatGatewayRuleProtocol b : NatGatewayRuleProtocol.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NatGatewayRuleProtocol> {
    @Override
    public void write(final JsonWriter jsonWriter, final NatGatewayRuleProtocol enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NatGatewayRuleProtocol read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NatGatewayRuleProtocol.fromValue(value);
    }
  }
}

