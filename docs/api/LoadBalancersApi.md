# LoadBalancersApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersLoadbalancersBalancednicsDelete**](LoadBalancersApi.md#datacentersloadbalancersbalancednicsdelete) | **DELETE** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics/{nicId} | Detach balanced NICs |
| [**datacentersLoadbalancersBalancednicsFindByNicId**](LoadBalancersApi.md#datacentersloadbalancersbalancednicsfindbynicid) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics/{nicId} | Retrieve balanced NICs |
| [**datacentersLoadbalancersBalancednicsGet**](LoadBalancersApi.md#datacentersloadbalancersbalancednicsget) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics | List balanced NICs |
| [**datacentersLoadbalancersBalancednicsPost**](LoadBalancersApi.md#datacentersloadbalancersbalancednicspost) | **POST** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics | Attach balanced NICs |
| [**datacentersLoadbalancersDelete**](LoadBalancersApi.md#datacentersloadbalancersdelete) | **DELETE** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Delete Load Balancers |
| [**datacentersLoadbalancersFindById**](LoadBalancersApi.md#datacentersloadbalancersfindbyid) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Retrieve Load Balancers |
| [**datacentersLoadbalancersGet**](LoadBalancersApi.md#datacentersloadbalancersget) | **GET** /datacenters/{datacenterId}/loadbalancers | List Load Balancers |
| [**datacentersLoadbalancersPatch**](LoadBalancersApi.md#datacentersloadbalancerspatch) | **PATCH** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Partially modify Load Balancers |
| [**datacentersLoadbalancersPost**](LoadBalancersApi.md#datacentersloadbalancerspost) | **POST** /datacenters/{datacenterId}/loadbalancers | Create a Load Balancer |
| [**datacentersLoadbalancersPut**](LoadBalancersApi.md#datacentersloadbalancersput) | **PUT** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Modify a Load Balancer by ID |


<a name="datacentersLoadbalancersBalancednicsDelete"></a>
# **datacentersLoadbalancersBalancednicsDelete**
> datacentersLoadbalancersBalancednicsDelete(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber)

Detach balanced NICs

Detach the specified NIC from the Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancerId** | **String**| The unique ID of the Load Balancer. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersBalancednicsDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersBalancednicsDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersLoadbalancersBalancednicsDeleteWithHttpInfo(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersBalancednicsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        apiInstance.datacentersLoadbalancersBalancednicsDelete(datacenterId, loadbalancerId, nicId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersBalancednicsDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersBalancednicsFindByNicId"></a>
# **datacentersLoadbalancersBalancednicsFindByNicId**
> Nic datacentersLoadbalancersBalancednicsFindByNicId(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber)

Retrieve balanced NICs

Retrieve the properties of the specified NIC, attached to the Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancerId** | **String**| The unique ID of the Load Balancer. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Nic**](../models/Nic.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersBalancednicsFindByNicIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersBalancednicsFindByNicId instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<Nic> result = apiInstance.datacentersLoadbalancersBalancednicsFindByNicIdWithHttpInfo(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersBalancednicsFindByNicId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        Nic result = apiInstance.datacentersLoadbalancersBalancednicsFindByNicId(datacenterId, loadbalancerId, nicId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersBalancednicsFindByNicId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersBalancednicsGet"></a>
# **datacentersLoadbalancersBalancednicsGet**
> BalancedNics datacentersLoadbalancersBalancednicsGet(datacenterId, loadbalancerId, pretty, depth, xContractNumber)

List balanced NICs

List all NICs, attached to the specified Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancerId** | **String**| The unique ID of the Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**BalancedNics**](../models/BalancedNics.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersBalancednicsGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersBalancednicsGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      ApiResponse<BalancedNics> result = apiInstance.datacentersLoadbalancersBalancednicsGetWithHttpInfo(datacenterId, loadbalancerId, pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersBalancednicsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        BalancedNics result = apiInstance.datacentersLoadbalancersBalancednicsGet(datacenterId, loadbalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersBalancednicsGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersBalancednicsPost"></a>
# **datacentersLoadbalancersBalancednicsPost**
> Nic datacentersLoadbalancersBalancednicsPost(datacenterId, loadbalancerId, nic, pretty, depth, xContractNumber)

Attach balanced NICs

Attachs an existing NIC to the specified Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancerId** | **String**| The unique ID of the Load Balancer. ||
| **nic** |  [**Nic**](../models/Nic.md)| The NIC to be attached. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Nic**](../models/Nic.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersBalancednicsPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersBalancednicsPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer.
    properties = new NicProperties(); // NicProperties | 
    nic = new Nic(NicProperties); // Nic | The NIC to be attached.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<Nic> result = apiInstance.datacentersLoadbalancersBalancednicsPostWithHttpInfo(datacenterId, loadbalancerId, nic, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersBalancednicsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        Nic result = apiInstance.datacentersLoadbalancersBalancednicsPost(datacenterId, loadbalancerId, nic)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersBalancednicsPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersDelete"></a>
# **datacentersLoadbalancersDelete**
> datacentersLoadbalancersDelete(datacenterId, loadbalancerId, pretty, depth, xContractNumber)

Delete Load Balancers

Remove the specified Load Balancer from the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancerId** | **String**| The unique ID of the Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersLoadbalancersDeleteWithHttpInfo(datacenterId, loadbalancerId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        apiInstance.datacentersLoadbalancersDelete(datacenterId, loadbalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersFindById"></a>
# **datacentersLoadbalancersFindById**
> Loadbalancer datacentersLoadbalancersFindById(datacenterId, loadbalancerId, pretty, depth, xContractNumber)

Retrieve Load Balancers

Retrieve the properties of the specified Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancerId** | **String**| The unique ID of the Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Loadbalancer**](../models/Loadbalancer.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersFindByIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersFindById instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<Loadbalancer> result = apiInstance.datacentersLoadbalancersFindByIdWithHttpInfo(datacenterId, loadbalancerId, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        Loadbalancer result = apiInstance.datacentersLoadbalancersFindById(datacenterId, loadbalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersFindById");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersGet"></a>
# **datacentersLoadbalancersGet**
> Loadbalancers datacentersLoadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit)

List Load Balancers

List all the Load Balancers within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| **offset** | **Integer**| The first element (from the complete list of the elements) to include in the response (used together with &lt;b&gt;&lt;i&gt;limit&lt;/i&gt;&lt;/b&gt; for pagination). | [optional] [default to 0]|
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 1000]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**Loadbalancers**](../models/Loadbalancers.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (used together with <b><i>limit</i></b> for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      ApiResponse<Loadbalancers> result = apiInstance.datacentersLoadbalancersGetWithHttpInfo(datacenterId, pretty, depth, xContractNumber, offset, limit, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        Loadbalancers result = apiInstance.datacentersLoadbalancersGet(datacenterId)
                .pretty(true)
                .depth(0)
                .offset(0)
                .limit(1000)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersPatch"></a>
# **datacentersLoadbalancersPatch**
> Loadbalancer datacentersLoadbalancersPatch(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber)

Partially modify Load Balancers

Update the properties of the specified Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancerId** | **String**| The unique ID of the Load Balancer. ||
| **loadbalancer** |  [**LoadbalancerProperties**](../models/LoadbalancerProperties.md)| The properties of the Load Balancer to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Loadbalancer**](../models/Loadbalancer.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersPatchWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersPatch instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer.
    LoadbalancerProperties loadbalancer = new LoadbalancerProperties(); // LoadbalancerProperties | The properties of the Load Balancer to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<Loadbalancer> result = apiInstance.datacentersLoadbalancersPatchWithHttpInfo(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        Loadbalancer result = apiInstance.datacentersLoadbalancersPatch(datacenterId, loadbalancerId, loadbalancer)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersPost"></a>
# **datacentersLoadbalancersPost**
> Loadbalancer datacentersLoadbalancersPost(datacenterId, loadbalancer, pretty, depth, xContractNumber)

Create a Load Balancer

Creates a Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancer** |  [**Loadbalancer**](../models/Loadbalancer.md)| The Load Balancer to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Loadbalancer**](../models/Loadbalancer.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    properties = new LoadbalancerProperties(); // LoadbalancerProperties | 
    loadbalancer = new Loadbalancer(LoadbalancerProperties); // Loadbalancer | The Load Balancer to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<Loadbalancer> result = apiInstance.datacentersLoadbalancersPostWithHttpInfo(datacenterId, loadbalancer, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        Loadbalancer result = apiInstance.datacentersLoadbalancersPost(datacenterId, loadbalancer)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersLoadbalancersPut"></a>
# **datacentersLoadbalancersPut**
> Loadbalancer datacentersLoadbalancersPut(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber)

Modify a Load Balancer by ID

Modifies the properties of the specified Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **loadbalancerId** | **String**| The unique ID of the Load Balancer. ||
| **loadbalancer** |  [**Loadbalancer**](../models/Loadbalancer.md)| The modified Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Loadbalancer**](../models/Loadbalancer.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersLoadbalancersPutWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersLoadbalancersPut instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer.
    properties = new LoadbalancerProperties(); // LoadbalancerProperties | 
    loadbalancer = new Loadbalancer(LoadbalancerProperties); // Loadbalancer | The modified Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<Loadbalancer> result = apiInstance.datacentersLoadbalancersPutWithHttpInfo(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

For convenience, you can alternatively use a builder, which allows to omit optional parameters:

```java
    try {
        Loadbalancer result = apiInstance.datacentersLoadbalancersPut(datacenterId, loadbalancerId, loadbalancer)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling LoadBalancersApi#datacentersLoadbalancersPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

