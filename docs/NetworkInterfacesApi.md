# NetworkInterfacesApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersServersNicsDelete**](NetworkInterfacesApi.md#datacentersserversnicsdelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Delete a Network Interface |
| [**datacentersServersNicsFindById**](NetworkInterfacesApi.md#datacentersserversnicsfindbyid) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Retrieve a Network Interface |
| [**datacentersServersNicsGet**](NetworkInterfacesApi.md#datacentersserversnicsget) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics | List Network Interfaces |
| [**datacentersServersNicsPatch**](NetworkInterfacesApi.md#datacentersserversnicspatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Partially Modify a Network Interface |
| [**datacentersServersNicsPost**](NetworkInterfacesApi.md#datacentersserversnicspost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/nics | Create a Network Interface |
| [**datacentersServersNicsPut**](NetworkInterfacesApi.md#datacentersserversnicsput) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId} | Modify a Network Interface |


<a name="datacentersServersNicsDelete"></a>
# **datacentersServersNicsDelete**
> Object datacentersServersNicsDelete(datacenterId, serverId, nicId, pretty, depth, xContractNumber)

Delete a Network Interface

Deletes the specified network interface.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkInterfacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkInterfacesApi apiInstance = new NetworkInterfacesApi(defaultClient);
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
      System.err.println("Exception when calling NetworkInterfacesApi#datacentersServersNicsDelete");
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

Retrieve a Network Interface

Retrieves the attributes of a given network interface.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkInterfacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkInterfacesApi apiInstance = new NetworkInterfacesApi(defaultClient);
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
      System.err.println("Exception when calling NetworkInterfacesApi#datacentersServersNicsFindById");
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

[**Nic**](Nic.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsGet"></a>
# **datacentersServersNicsGet**
> Nics datacentersServersNicsGet(datacenterId, serverId, pretty, depth, xContractNumber, offset, limit)

List Network Interfaces

Retrieves a list of network interfaces.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkInterfacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkInterfacesApi apiInstance = new NetworkInterfacesApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with limit for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with offset for pagination)
    try {
      Nics result = apiInstance.datacentersServersNicsGet(datacenterId, serverId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkInterfacesApi#datacentersServersNicsGet");
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
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with limit for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with offset for pagination) | [optional] [default to 1000]

### Return type

[**Nics**](Nics.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsPatch"></a>
# **datacentersServersNicsPatch**
> Nic datacentersServersNicsPatch(datacenterId, serverId, nicId, nic, pretty, depth, xContractNumber)

Partially Modify a Network Interface

You can use update attributes of a network interface.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkInterfacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkInterfacesApi apiInstance = new NetworkInterfacesApi(defaultClient);
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
      System.err.println("Exception when calling NetworkInterfacesApi#datacentersServersNicsPatch");
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

[**Nic**](Nic.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsPost"></a>
# **datacentersServersNicsPost**
> Nic datacentersServersNicsPost(datacenterId, serverId, nic, pretty, depth, xContractNumber)

Create a Network Interface

Adds a network interface to the target server. Combined count of network interfaces and volumes attached to the server should not exceed size 24.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkInterfacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkInterfacesApi apiInstance = new NetworkInterfacesApi(defaultClient);
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
      System.err.println("Exception when calling NetworkInterfacesApi#datacentersServersNicsPost");
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

[**Nic**](Nic.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsPut"></a>
# **datacentersServersNicsPut**
> Nic datacentersServersNicsPut(datacenterId, serverId, nicId, nic, pretty, depth, xContractNumber)

Modify a Network Interface

You can use update attributes of a network interface.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkInterfacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkInterfacesApi apiInstance = new NetworkInterfacesApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    NicPut nic = new NicPut(); // NicPut | Modified Nic
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Nic result = apiInstance.datacentersServersNicsPut(datacenterId, serverId, nicId, nic, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkInterfacesApi#datacentersServersNicsPut");
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
| **nic** |  [**NicPut**](NicPut.md)| Modified Nic |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Nic**](Nic.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
