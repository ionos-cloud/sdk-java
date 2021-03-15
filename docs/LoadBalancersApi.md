# LoadBalancersApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersLoadbalancersBalancednicsDelete**](LoadBalancersApi.md#datacentersloadbalancersbalancednicsdelete) | **DELETE** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics/{nicId} | Detach a nic from loadbalancer |
| [**datacentersLoadbalancersBalancednicsFindByNicId**](LoadBalancersApi.md#datacentersloadbalancersbalancednicsfindbynicid) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics/{nicId} | Retrieve a network interface attached to Load Balancer |
| [**datacentersLoadbalancersBalancednicsGet**](LoadBalancersApi.md#datacentersloadbalancersbalancednicsget) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics | List Load Balancer balaced NICs |
| [**datacentersLoadbalancersBalancednicsPost**](LoadBalancersApi.md#datacentersloadbalancersbalancednicspost) | **POST** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics | Attach a nic to Load Balancer |
| [**datacentersLoadbalancersDelete**](LoadBalancersApi.md#datacentersloadbalancersdelete) | **DELETE** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Delete a Loadbalancer. |
| [**datacentersLoadbalancersFindById**](LoadBalancersApi.md#datacentersloadbalancersfindbyid) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Retrieve a loadbalancer |
| [**datacentersLoadbalancersGet**](LoadBalancersApi.md#datacentersloadbalancersget) | **GET** /datacenters/{datacenterId}/loadbalancers | List Load Balancers |
| [**datacentersLoadbalancersPatch**](LoadBalancersApi.md#datacentersloadbalancerspatch) | **PATCH** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Partially modify a Loadbalancer |
| [**datacentersLoadbalancersPost**](LoadBalancersApi.md#datacentersloadbalancerspost) | **POST** /datacenters/{datacenterId}/loadbalancers | Create a Load Balancer |
| [**datacentersLoadbalancersPut**](LoadBalancersApi.md#datacentersloadbalancersput) | **PUT** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Modify a Load Balancer |


<a name="datacentersLoadbalancersBalancednicsDelete"></a>
# **datacentersLoadbalancersBalancednicsDelete**
> Object datacentersLoadbalancersBalancednicsDelete(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber)

Detach a nic from loadbalancer

This will remove a network interface from load balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersLoadbalancersBalancednicsDelete(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancerId** | **String**| The unique ID of the Load Balancer |
| **nicId** | **String**| The unique ID of the NIC |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLoadbalancersBalancednicsFindByNicId"></a>
# **datacentersLoadbalancersBalancednicsFindByNicId**
> Nic datacentersLoadbalancersBalancednicsFindByNicId(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber, offset, limit)

Retrieve a network interface attached to Load Balancer

This will retrieve the properties of an attached network interface.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with limit for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with offset for pagination)
    try {
      Nic result = apiInstance.datacentersLoadbalancersBalancednicsFindByNicId(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancerId** | **String**| The unique ID of the Load Balancer |
| **nicId** | **String**| The unique ID of the NIC |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with limit for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with offset for pagination) | [optional] [default to 1000]

### Return type

[**Nic**](Nic.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLoadbalancersBalancednicsGet"></a>
# **datacentersLoadbalancersBalancednicsGet**
> BalancedNics datacentersLoadbalancersBalancednicsGet(datacenterId, loadbalancerId, pretty, depth, xContractNumber)

List Load Balancer balaced NICs

You can retrieve a list of nics attached to a load balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      BalancedNics result = apiInstance.datacentersLoadbalancersBalancednicsGet(datacenterId, loadbalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancerId** | **String**| The unique ID of the Load Balancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**BalancedNics**](BalancedNics.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLoadbalancersBalancednicsPost"></a>
# **datacentersLoadbalancersBalancednicsPost**
> Nic datacentersLoadbalancersBalancednicsPost(datacenterId, loadbalancerId, nic, pretty, depth, xContractNumber)

Attach a nic to Load Balancer

This will attach a pre-existing nic to a load balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    Nic nic = new Nic(); // Nic | Nic id to be attached
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Nic result = apiInstance.datacentersLoadbalancersBalancednicsPost(datacenterId, loadbalancerId, nic, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancerId** | **String**| The unique ID of the Load Balancer |
| **nic** |  [**Nic**](Nic.md)| Nic id to be attached |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Nic**](Nic.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersLoadbalancersDelete"></a>
# **datacentersLoadbalancersDelete**
> Object datacentersLoadbalancersDelete(datacenterId, loadbalancerId, pretty, depth, xContractNumber, offset, limit)

Delete a Loadbalancer.

Removes the specified load balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with limit for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with offset for pagination)
    try {
      Object result = apiInstance.datacentersLoadbalancersDelete(datacenterId, loadbalancerId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancerId** | **String**| The unique ID of the Load Balancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with limit for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with offset for pagination) | [optional] [default to 1000]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLoadbalancersFindById"></a>
# **datacentersLoadbalancersFindById**
> Loadbalancer datacentersLoadbalancersFindById(datacenterId, loadbalancerId, pretty, depth, xContractNumber)

Retrieve a loadbalancer

Retrieves the attributes of a given load balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Loadbalancer result = apiInstance.datacentersLoadbalancersFindById(datacenterId, loadbalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancerId** | **String**| The unique ID of the Load Balancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Loadbalancer**](Loadbalancer.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLoadbalancersGet"></a>
# **datacentersLoadbalancersGet**
> Loadbalancers datacentersLoadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit)

List Load Balancers

Retrieve a list of Load Balancers within the datacenter.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with limit for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with offset for pagination)
    try {
      Loadbalancers result = apiInstance.datacentersLoadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with limit for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with offset for pagination) | [optional] [default to 1000]

### Return type

[**Loadbalancers**](Loadbalancers.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersLoadbalancersPatch"></a>
# **datacentersLoadbalancersPatch**
> Loadbalancer datacentersLoadbalancersPatch(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber)

Partially modify a Loadbalancer

You can use update attributes of a resource.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    LoadbalancerProperties loadbalancer = new LoadbalancerProperties(); // LoadbalancerProperties | Modified Loadbalancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Loadbalancer result = apiInstance.datacentersLoadbalancersPatch(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancerId** | **String**| The unique ID of the Load Balancer |
| **loadbalancer** |  [**LoadbalancerProperties**](LoadbalancerProperties.md)| Modified Loadbalancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Loadbalancer**](Loadbalancer.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersLoadbalancersPost"></a>
# **datacentersLoadbalancersPost**
> Loadbalancer datacentersLoadbalancersPost(datacenterId, loadbalancer, pretty, depth, xContractNumber)

Create a Load Balancer

Creates a Loadbalancer within the datacenter.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    Loadbalancer loadbalancer = new Loadbalancer(); // Loadbalancer | Loadbalancer to be created
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Loadbalancer result = apiInstance.datacentersLoadbalancersPost(datacenterId, loadbalancer, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancer** |  [**Loadbalancer**](Loadbalancer.md)| Loadbalancer to be created |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Loadbalancer**](Loadbalancer.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersLoadbalancersPut"></a>
# **datacentersLoadbalancersPut**
> Loadbalancer datacentersLoadbalancersPut(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber)

Modify a Load Balancer

You can use update attributes of a resource.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    LoadBalancersApi apiInstance = new LoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    Loadbalancer loadbalancer = new Loadbalancer(); // Loadbalancer | Modified Loadbalancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Loadbalancer result = apiInstance.datacentersLoadbalancersPut(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **loadbalancerId** | **String**| The unique ID of the Load Balancer |
| **loadbalancer** |  [**Loadbalancer**](Loadbalancer.md)| Modified Loadbalancer |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Loadbalancer**](Loadbalancer.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

