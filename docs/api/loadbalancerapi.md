# LoadBalancerApi

## LoadBalancerApi

All URIs are relative to [https://api.ionos.com/cloudapi/v5](https://api.ionos.com/cloudapi/v5)

| Method | HTTP request | Description |
| :--- | :--- | :--- |
| [**datacentersLoadbalancersBalancednicsDelete**](loadbalancerapi.md#datacentersloadbalancersbalancednicsdelete) | **DELETE** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics/{nicId} | Detach a nic from loadbalancer |
| [**datacentersLoadbalancersBalancednicsFindByNicId**](loadbalancerapi.md#datacentersloadbalancersbalancednicsfindbynicid) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics/{nicId} | Retrieve a nic attached to Load Balancer |
| [**datacentersLoadbalancersBalancednicsGet**](loadbalancerapi.md#datacentersloadbalancersbalancednicsget) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics | List Load Balancer Members |
| [**datacentersLoadbalancersBalancednicsPost**](loadbalancerapi.md#datacentersloadbalancersbalancednicspost) | **POST** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId}/balancednics | Attach a nic to Load Balancer |
| [**datacentersLoadbalancersDelete**](loadbalancerapi.md#datacentersloadbalancersdelete) | **DELETE** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Delete a Loadbalancer. |
| [**datacentersLoadbalancersFindById**](loadbalancerapi.md#datacentersloadbalancersfindbyid) | **GET** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Retrieve a loadbalancer |
| [**datacentersLoadbalancersGet**](loadbalancerapi.md#datacentersloadbalancersget) | **GET** /datacenters/{datacenterId}/loadbalancers | List Load Balancers |
| [**datacentersLoadbalancersPatch**](loadbalancerapi.md#datacentersloadbalancerspatch) | **PATCH** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Partially modify a Loadbalancer |
| [**datacentersLoadbalancersPost**](loadbalancerapi.md#datacentersloadbalancerspost) | **POST** /datacenters/{datacenterId}/loadbalancers | Create a Load Balancer |
| [**datacentersLoadbalancersPut**](loadbalancerapi.md#datacentersloadbalancersput) | **PUT** /datacenters/{datacenterId}/loadbalancers/{loadbalancerId} | Modify a Load Balancer |

## **datacentersLoadbalancersBalancednicsDelete**

> Object datacentersLoadbalancersBalancednicsDelete\(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber\)

Detach a nic from loadbalancer

This will remove a nic from Load Balancer

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
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
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersBalancednicsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancerId** | **String** | The unique ID of the Load Balancer |  |
| **nicId** | **String** | The unique ID of the NIC |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLoadbalancersBalancednicsFindByNicId**

> Nic datacentersLoadbalancersBalancednicsFindByNicId\(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber\)

Retrieve a nic attached to Load Balancer

This will retrieve the properties of an attached nic.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Nic result = apiInstance.datacentersLoadbalancersBalancednicsFindByNicId(datacenterId, loadbalancerId, nicId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersBalancednicsFindByNicId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancerId** | **String** | The unique ID of the Load Balancer |  |
| **nicId** | **String** | The unique ID of the NIC |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**Nic**](../models/nic.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLoadbalancersBalancednicsGet**

> BalancedNics datacentersLoadbalancersBalancednicsGet\(datacenterId, loadbalancerId, pretty, depth, xContractNumber, offset, limit\)

List Load Balancer Members

You can retrieve a list of nics attached to a Load Balancer

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      BalancedNics result = apiInstance.datacentersLoadbalancersBalancednicsGet(datacenterId, loadbalancerId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersBalancednicsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancerId** | **String** | The unique ID of the Load Balancer |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |
| **offset** | **Integer** | the first element \(of the total list of elements\) to include in the response \(use together with &lt;code&gt;limit&lt;/code&gt; for pagination\) | \[optional\] \[default to 0\] |
| **limit** | **Integer** | the maximum number of elements to return \(use together with &lt;code&gt;offset&lt;/code&gt; for pagination\) | \[optional\] \[default to 1000\] |

### Return type

[**BalancedNics**](../models/balancednics.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLoadbalancersBalancednicsPost**

> Nic datacentersLoadbalancersBalancednicsPost\(datacenterId, loadbalancerId, nic, pretty, depth, xContractNumber\)

Attach a nic to Load Balancer

This will attach a pre-existing nic to a Load Balancer.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
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
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersBalancednicsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancerId** | **String** | The unique ID of the Load Balancer |  |
| **nic** | [**Nic**](../models/nic.md) | Nic id to be attached |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**Nic**](../models/nic.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **datacentersLoadbalancersDelete**

> Object datacentersLoadbalancersDelete\(datacenterId, loadbalancerId, pretty, depth, xContractNumber\)

Delete a Loadbalancer.

Removes the specific Loadbalancer

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersLoadbalancersDelete(datacenterId, loadbalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancerId** | **String** | The unique ID of the Load Balancer |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLoadbalancersFindById**

> Loadbalancer datacentersLoadbalancersFindById\(datacenterId, loadbalancerId, pretty, depth, xContractNumber\)

Retrieve a loadbalancer

Retrieves the attributes of a given Loadbalancer

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String loadbalancerId = "loadbalancerId_example"; // String | The unique ID of the Load Balancer
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Loadbalancer result = apiInstance.datacentersLoadbalancersFindById(datacenterId, loadbalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancerId** | **String** | The unique ID of the Load Balancer |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**Loadbalancer**](../models/loadbalancer.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLoadbalancersGet**

> Loadbalancers datacentersLoadbalancersGet\(datacenterId, pretty, depth, xContractNumber, offset, limit\)

List Load Balancers

Retrieve a list of Load Balancers within the datacenter

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      Loadbalancers result = apiInstance.datacentersLoadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |
| **offset** | **Integer** | the first element \(of the total list of elements\) to include in the response \(use together with &lt;code&gt;limit&lt;/code&gt; for pagination\) | \[optional\] \[default to 0\] |
| **limit** | **Integer** | the maximum number of elements to return \(use together with &lt;code&gt;offset&lt;/code&gt; for pagination\) | \[optional\] \[default to 1000\] |

### Return type

[**Loadbalancers**](../models/loadbalancers.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLoadbalancersPatch**

> Loadbalancer datacentersLoadbalancersPatch\(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber\)

Partially modify a Loadbalancer

You can use update attributes of a resource

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
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
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancerId** | **String** | The unique ID of the Load Balancer |  |
| **loadbalancer** | [**LoadbalancerProperties**](../models/loadbalancerproperties.md) | Modified Loadbalancer |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**Loadbalancer**](../models/loadbalancer.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **datacentersLoadbalancersPost**

> Loadbalancer datacentersLoadbalancersPost\(datacenterId, loadbalancer, pretty, depth, xContractNumber\)

Create a Load Balancer

Creates a Loadbalancer within the datacenter

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    Loadbalancer loadbalancer = new Loadbalancer(); // Loadbalancer | Loadbalancer to be created
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Loadbalancer result = apiInstance.datacentersLoadbalancersPost(datacenterId, loadbalancer, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancer** | [**Loadbalancer**](../models/loadbalancer.md) | Loadbalancer to be created |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**Loadbalancer**](../models/loadbalancer.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **datacentersLoadbalancersPut**

> Loadbalancer datacentersLoadbalancersPut\(datacenterId, loadbalancerId, loadbalancer, pretty, depth, xContractNumber\)

Modify a Load Balancer

You can use update attributes of a resource

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LoadBalancerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
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
      System.err.println("Exception when calling LoadBalancerApi#datacentersLoadbalancersPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the datacenter |  |
| **loadbalancerId** | **String** | The unique ID of the Load Balancer |  |
| **loadbalancer** | [**Loadbalancer**](../models/loadbalancer.md) | Modified Loadbalancer |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**Loadbalancer**](../models/loadbalancer.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

