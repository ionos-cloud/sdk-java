# LansApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersLansDelete**](LansApi.md#datacenterslansdelete) | **DELETE** /datacenters/{datacenterId}/lans/{lanId} | Delete LANs |
| [**datacentersLansFindById**](LansApi.md#datacenterslansfindbyid) | **GET** /datacenters/{datacenterId}/lans/{lanId} | Retrieve LANs |
| [**datacentersLansGet**](LansApi.md#datacenterslansget) | **GET** /datacenters/{datacenterId}/lans | List LANs |
| [**datacentersLansNicsFindById**](LansApi.md#datacenterslansnicsfindbyid) | **GET** /datacenters/{datacenterId}/lans/{lanId}/nics/{nicId} | Retrieve attached NICs |
| [**datacentersLansNicsGet**](LansApi.md#datacenterslansnicsget) | **GET** /datacenters/{datacenterId}/lans/{lanId}/nics | List LAN members |
| [**datacentersLansNicsPost**](LansApi.md#datacenterslansnicspost) | **POST** /datacenters/{datacenterId}/lans/{lanId}/nics | Attach NICs |
| [**datacentersLansPatch**](LansApi.md#datacenterslanspatch) | **PATCH** /datacenters/{datacenterId}/lans/{lanId} | Partially modify LANs |
| [**datacentersLansPost**](LansApi.md#datacenterslanspost) | **POST** /datacenters/{datacenterId}/lans | Create LANs |
| [**datacentersLansPut**](LansApi.md#datacenterslansput) | **PUT** /datacenters/{datacenterId}/lans/{lanId} | Modify LANs |


<a name="datacentersLansDelete"></a>
# **datacentersLansDelete**
> datacentersLansDelete(datacenterId, lanId, pretty, depth, xContractNumber)

Delete LANs

Delete the specified LAN within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String lanId = "lanId_example"; // String | The unique ID of the LAN.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      apiInstance.datacentersLansDelete(datacenterId, lanId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansDelete");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **lanId** | **String**| The unique ID of the LAN. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLansFindById"></a>
# **datacentersLansFindById**
> Lan datacentersLansFindById(datacenterId, lanId, pretty, depth, xContractNumber)

Retrieve LANs

Retrieve the properties of the specified LAN within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String lanId = "lanId_example"; // String | The unique ID of the LAN.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Lan result = apiInstance.datacentersLansFindById(datacenterId, lanId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansFindById");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **lanId** | **String**| The unique ID of the LAN. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Lan**](Lan.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLansGet"></a>
# **datacentersLansGet**
> Lans datacentersLansGet(datacenterId, pretty, depth, xContractNumber, offset, limit)

List LANs

List all LANs within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (use together with limit for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
    try {
      Lans result = apiInstance.datacentersLansGet(datacenterId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansGet");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]
| **offset** | **Integer**| The first element (from the complete list of the elements) to include in the response (use together with limit for pagination). | [optional] [default to 0]
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 1000]

### Return type

[**Lans**](Lans.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLansNicsFindById"></a>
# **datacentersLansNicsFindById**
> Nic datacentersLansNicsFindById(datacenterId, lanId, nicId, pretty, depth, xContractNumber)

Retrieve attached NICs

Retrieve the properties of the NIC, attached to the specified LAN.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String lanId = "lanId_example"; // String | The unique ID of the LAN.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Nic result = apiInstance.datacentersLansNicsFindById(datacenterId, lanId, nicId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansNicsFindById");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **lanId** | **String**| The unique ID of the LAN. |
| **nicId** | **String**| The unique ID of the NIC. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Nic**](Nic.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLansNicsGet"></a>
# **datacentersLansNicsGet**
> LanNics datacentersLansNicsGet(datacenterId, lanId, pretty, depth, xContractNumber, offset, limit)

List LAN members

List all NICs, attached to the specified LAN.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String lanId = "lanId_example"; // String | The unique ID of the LAN.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (use together with limit for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
    try {
      LanNics result = apiInstance.datacentersLansNicsGet(datacenterId, lanId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansNicsGet");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **lanId** | **String**| The unique ID of the LAN. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]
| **offset** | **Integer**| The first element (from the complete list of the elements) to include in the response (use together with limit for pagination). | [optional] [default to 0]
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 1000]

### Return type

[**LanNics**](LanNics.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLansNicsPost"></a>
# **datacentersLansNicsPost**
> Nic datacentersLansNicsPost(datacenterId, lanId, nic, pretty, depth, xContractNumber)

Attach NICs

Attach an existing NIC to the specified LAN.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String lanId = "lanId_example"; // String | The unique ID of the LAN.
    Nic nic = new Nic(); // Nic | The NIC to be attached.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Nic result = apiInstance.datacentersLansNicsPost(datacenterId, lanId, nic, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansNicsPost");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **lanId** | **String**| The unique ID of the LAN. |
| **nic** |  [**Nic**](Nic.md)| The NIC to be attached. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Nic**](Nic.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersLansPatch"></a>
# **datacentersLansPatch**
> Lan datacentersLansPatch(datacenterId, lanId, lan, pretty, depth, xContractNumber)

Partially modify LANs

Update the properties of the specified LAN within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String lanId = "lanId_example"; // String | The unique ID of the LAN.
    LanProperties lan = new LanProperties(); // LanProperties | The properties of the LAN to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Lan result = apiInstance.datacentersLansPatch(datacenterId, lanId, lan, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansPatch");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **lanId** | **String**| The unique ID of the LAN. |
| **lan** |  [**LanProperties**](LanProperties.md)| The properties of the LAN to be updated. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Lan**](Lan.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersLansPost"></a>
# **datacentersLansPost**
> LanPost datacentersLansPost(datacenterId, lan, pretty, depth, xContractNumber)

Create LANs

Create a LAN within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    LanPost lan = new LanPost(); // LanPost | The LAN to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      LanPost result = apiInstance.datacentersLansPost(datacenterId, lan, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansPost");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **lan** |  [**LanPost**](LanPost.md)| The LAN to create. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**LanPost**](LanPost.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersLansPut"></a>
# **datacentersLansPut**
> Lan datacentersLansPut(datacenterId, lanId, lan, pretty, depth, xContractNumber)

Modify LANs

Modify the properties of the specified LAN within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LansApi apiInstance = new LansApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String lanId = "lanId_example"; // String | The unique ID of the LAN.
    Lan lan = new Lan(); // Lan | The modified LAN
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Lan result = apiInstance.datacentersLansPut(datacenterId, lanId, lan, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LansApi#datacentersLansPut");
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
| **datacenterId** | **String**| The unique ID of the data center. |
| **lanId** | **String**| The unique ID of the LAN. |
| **lan** |  [**Lan**](Lan.md)| The modified LAN |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Lan**](Lan.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

