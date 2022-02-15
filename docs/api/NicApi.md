# NicApi

All URIs are relative to *https://api.ionos.com/cloudapi/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersServersNicsDelete**](NicApi.md#datacentersserversnicsdelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Delete a Nic |
| [**datacentersServersNicsFindById**](NicApi.md#datacentersserversnicsfindbyid) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Retrieve a Nic |
| [**datacentersServersNicsFirewallrulesDelete**](NicApi.md#datacentersserversnicsfirewallrulesdelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Delete a Firewall Rule |
| [**datacentersServersNicsFirewallrulesFindById**](NicApi.md#datacentersserversnicsfirewallrulesfindbyid) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Retrieve a Firewall Rule |
| [**datacentersServersNicsFirewallrulesGet**](NicApi.md#datacentersserversnicsfirewallrulesget) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules | List Firewall Rules  |
| [**datacentersServersNicsFirewallrulesPatch**](NicApi.md#datacentersserversnicsfirewallrulespatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Partially modify a Firewall Rule |
| [**datacentersServersNicsFirewallrulesPost**](NicApi.md#datacentersserversnicsfirewallrulespost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules | Create a Firewall Rule |
| [**datacentersServersNicsFirewallrulesPut**](NicApi.md#datacentersserversnicsfirewallrulesput) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Modify a Firewall Rule |
| [**datacentersServersNicsGet**](NicApi.md#datacentersserversnicsget) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics | List Nics  |
| [**datacentersServersNicsPatch**](NicApi.md#datacentersserversnicspatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Partially modify a Nic |
| [**datacentersServersNicsPost**](NicApi.md#datacentersserversnicspost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/nics | Create a Nic |
| [**datacentersServersNicsPut**](NicApi.md#datacentersserversnicsput) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Modify a Nic |


<a name="datacentersServersNicsDelete"></a>
# **datacentersServersNicsDelete**
> Object datacentersServersNicsDelete(datacenterId, serverId, nicId, pretty, depth, xContractNumber)

Delete a Nic

Deletes the specified NIC.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersServersNicsDelete(datacenterId, serverId, nicId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsFindById"></a>
# **datacentersServersNicsFindById**
> Nic datacentersServersNicsFindById(datacenterId, serverId, nicId, pretty, depth, xContractNumber)

Retrieve a Nic

Retrieves the attributes of a given NIC

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Nic result = apiInstance.datacentersServersNicsFindById(datacenterId, serverId, nicId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Nic**](../models/Nic.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsFirewallrulesDelete"></a>
# **datacentersServersNicsFirewallrulesDelete**
> Object datacentersServersNicsFirewallrulesDelete(datacenterId, serverId, nicId, firewallruleId, pretty, depth, xContractNumber)

Delete a Firewall Rule

Removes the specific Firewall Rule

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    String firewallruleId = "firewallruleId_example"; // String | The unique ID of the Firewall Rule
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersServersNicsFirewallrulesDelete(datacenterId, serverId, nicId, firewallruleId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsFirewallrulesDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **firewallruleId** | **String**| The unique ID of the Firewall Rule |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsFirewallrulesFindById"></a>
# **datacentersServersNicsFirewallrulesFindById**
> FirewallRule datacentersServersNicsFirewallrulesFindById(datacenterId, serverId, nicId, firewallruleId, pretty, depth, xContractNumber)

Retrieve a Firewall Rule

Retrieves the attributes of a given Firewall Rule.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    String firewallruleId = "firewallruleId_example"; // String | The unique ID of the Firewall Rule
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesFindById(datacenterId, serverId, nicId, firewallruleId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsFirewallrulesFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **firewallruleId** | **String**| The unique ID of the Firewall Rule |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FirewallRule**](../models/FirewallRule.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsFirewallrulesGet"></a>
# **datacentersServersNicsFirewallrulesGet**
> FirewallRules datacentersServersNicsFirewallrulesGet(datacenterId, serverId, nicId, pretty, depth, xContractNumber, offset, limit)

List Firewall Rules 

Retrieves a list of firewall rules associated with a particular NIC

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      FirewallRules result = apiInstance.datacentersServersNicsFirewallrulesGet(datacenterId, serverId, nicId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsFirewallrulesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with &lt;code&gt;limit&lt;/code&gt; for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with &lt;code&gt;offset&lt;/code&gt; for pagination) | [optional] [default to 1000]

### Return type

[**FirewallRules**](../models/FirewallRules.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsFirewallrulesPatch"></a>
# **datacentersServersNicsFirewallrulesPatch**
> FirewallRule datacentersServersNicsFirewallrulesPatch(datacenterId, serverId, nicId, firewallruleId, firewallrule, pretty, depth, xContractNumber)

Partially modify a Firewall Rule

You can use update attributes of a resource

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    String firewallruleId = "firewallruleId_example"; // String | The unique ID of the Firewall Rule
    FirewallruleProperties firewallrule = new FirewallruleProperties(); // FirewallruleProperties | Modified Firewall Rule
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPatch(datacenterId, serverId, nicId, firewallruleId, firewallrule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsFirewallrulesPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **firewallruleId** | **String**| The unique ID of the Firewall Rule |
| **firewallrule** |  [**FirewallruleProperties**](FirewallruleProperties.md)| Modified Firewall Rule |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FirewallRule**](../models/FirewallRule.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsFirewallrulesPost"></a>
# **datacentersServersNicsFirewallrulesPost**
> FirewallRule datacentersServersNicsFirewallrulesPost(datacenterId, serverId, nicId, firewallrule, pretty, depth, xContractNumber)

Create a Firewall Rule

This will add a Firewall Rule to the NIC

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    FirewallRule firewallrule = new FirewallRule(); // FirewallRule | Firewall Rule to be created
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPost(datacenterId, serverId, nicId, firewallrule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsFirewallrulesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the server |
| **nicId** | **String**| The unique ID of the NIC |
| **firewallrule** |  [**FirewallRule**](FirewallRule.md)| Firewall Rule to be created |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FirewallRule**](../models/FirewallRule.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsFirewallrulesPut"></a>
# **datacentersServersNicsFirewallrulesPut**
> FirewallRule datacentersServersNicsFirewallrulesPut(datacenterId, serverId, nicId, firewallruleId, firewallrule, pretty, depth, xContractNumber)

Modify a Firewall Rule

You can use update attributes of a resource

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    String firewallruleId = "firewallruleId_example"; // String | The unique ID of the Firewall Rule
    FirewallRule firewallrule = new FirewallRule(); // FirewallRule | Modified Firewall Rule
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPut(datacenterId, serverId, nicId, firewallruleId, firewallrule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsFirewallrulesPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **firewallruleId** | **String**| The unique ID of the Firewall Rule |
| **firewallrule** |  [**FirewallRule**](FirewallRule.md)| Modified Firewall Rule |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**FirewallRule**](../models/FirewallRule.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsGet"></a>
# **datacentersServersNicsGet**
> Nics datacentersServersNicsGet(datacenterId, serverId, pretty, depth, xContractNumber, offset, limit)

List Nics 

Retrieves a list of NICs.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      Nics result = apiInstance.datacentersServersNicsGet(datacenterId, serverId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with &lt;code&gt;limit&lt;/code&gt; for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with &lt;code&gt;offset&lt;/code&gt; for pagination) | [optional] [default to 1000]

### Return type

[**Nics**](../models/Nics.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsPatch"></a>
# **datacentersServersNicsPatch**
> Nic datacentersServersNicsPatch(datacenterId, serverId, nicId, nic, pretty, depth, xContractNumber)

Partially modify a Nic

You can use update attributes of a Nic

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    NicProperties nic = new NicProperties(); // NicProperties | Modified properties of Nic
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Nic result = apiInstance.datacentersServersNicsPatch(datacenterId, serverId, nicId, nic, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **nic** |  [**NicProperties**](NicProperties.md)| Modified properties of Nic |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Nic**](../models/Nic.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsPost"></a>
# **datacentersServersNicsPost**
> Nic datacentersServersNicsPost(datacenterId, serverId, nic, pretty, depth, xContractNumber)

Create a Nic

Adds a NIC to the target server. Combine count of Nics and volumes attached to the server should not exceed size 24.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    Nic nic = new Nic(); // Nic | Nic to be created
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Nic result = apiInstance.datacentersServersNicsPost(datacenterId, serverId, nic, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nic** |  [**Nic**](Nic.md)| Nic to be created |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Nic**](../models/Nic.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsPut"></a>
# **datacentersServersNicsPut**
> Nic datacentersServersNicsPut(datacenterId, serverId, nicId, nic, pretty, depth, xContractNumber)

Modify a Nic

You can use update attributes of a Nic

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NicApi apiInstance = new NicApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    Nic nic = new Nic(); // Nic | Modified Nic
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Nic result = apiInstance.datacentersServersNicsPut(datacenterId, serverId, nicId, nic, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NicApi#datacentersServersNicsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **nic** |  [**Nic**](Nic.md)| Modified Nic |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Nic**](../models/Nic.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

