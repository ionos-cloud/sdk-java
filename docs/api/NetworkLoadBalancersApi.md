# NetworkLoadBalancersApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersNetworkloadbalancersDelete**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersdelete) | **DELETE** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId} | Delete Network Load Balancers |
| [**datacentersNetworkloadbalancersFindByNetworkLoadBalancerId**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersfindbynetworkloadbalancerid) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId} | Retrieve Network Load Balancers |
| [**datacentersNetworkloadbalancersFlowlogsDelete**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogsdelete) | **DELETE** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs/{flowLogId} | Delete NLB Flow Logs |
| [**datacentersNetworkloadbalancersFlowlogsFindByFlowLogId**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogsfindbyflowlogid) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs/{flowLogId} | Retrieve NLB Flow Logs |
| [**datacentersNetworkloadbalancersFlowlogsGet**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogsget) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs | List NLB Flow Logs |
| [**datacentersNetworkloadbalancersFlowlogsPatch**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogspatch) | **PATCH** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs/{flowLogId} | Partially modify NLB Flow Logs |
| [**datacentersNetworkloadbalancersFlowlogsPost**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogspost) | **POST** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs | Create NLB Flow Logs |
| [**datacentersNetworkloadbalancersFlowlogsPut**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersflowlogsput) | **PUT** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/flowlogs/{flowLogId} | Modify NLB Flow Logs |
| [**datacentersNetworkloadbalancersForwardingrulesDelete**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulesdelete) | **DELETE** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules/{forwardingRuleId} | Delete NLB forwarding rules |
| [**datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulesfindbyforwardingruleid) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules/{forwardingRuleId} | Retrieve NLB forwarding rules |
| [**datacentersNetworkloadbalancersForwardingrulesGet**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulesget) | **GET** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules | List NLB forwarding rules |
| [**datacentersNetworkloadbalancersForwardingrulesPatch**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulespatch) | **PATCH** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules/{forwardingRuleId} | Partially modify NLB forwarding rules |
| [**datacentersNetworkloadbalancersForwardingrulesPost**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulespost) | **POST** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules | Create NLB forwarding rules |
| [**datacentersNetworkloadbalancersForwardingrulesPut**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersforwardingrulesput) | **PUT** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId}/forwardingrules/{forwardingRuleId} | Modify NLB forwarding rules |
| [**datacentersNetworkloadbalancersGet**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersget) | **GET** /datacenters/{datacenterId}/networkloadbalancers | List Network Load Balancers |
| [**datacentersNetworkloadbalancersPatch**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancerspatch) | **PATCH** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId} | Partially modify Network Load Balancers |
| [**datacentersNetworkloadbalancersPost**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancerspost) | **POST** /datacenters/{datacenterId}/networkloadbalancers | Create Network Load Balancers |
| [**datacentersNetworkloadbalancersPut**](NetworkLoadBalancersApi.md#datacentersnetworkloadbalancersput) | **PUT** /datacenters/{datacenterId}/networkloadbalancers/{networkLoadBalancerId} | Modify Network Load Balancers |


<a name="datacentersNetworkloadbalancersDelete"></a>
# **datacentersNetworkloadbalancersDelete**
> datacentersNetworkloadbalancersDelete(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber)

Delete Network Load Balancers

Remove the specified Network Load Balancer from the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersNetworkloadbalancersDelete(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersDelete");
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
        apiInstance.datacentersNetworkloadbalancersDelete(datacenterId, networkLoadBalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersFindByNetworkLoadBalancerId"></a>
# **datacentersNetworkloadbalancersFindByNetworkLoadBalancerId**
> NetworkLoadBalancer datacentersNetworkloadbalancersFindByNetworkLoadBalancerId(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber)

Retrieve Network Load Balancers

Retrieve the properties of the specified Network Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NetworkLoadBalancer**](../models/NetworkLoadBalancer.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersFindByNetworkLoadBalancerId(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFindByNetworkLoadBalancerId");
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
        NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersFindByNetworkLoadBalancerId(datacenterId, networkLoadBalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFindByNetworkLoadBalancerId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersFlowlogsDelete"></a>
# **datacentersNetworkloadbalancersFlowlogsDelete**
> datacentersNetworkloadbalancersFlowlogsDelete(datacenterId, networkLoadBalancerId, flowLogId, pretty, depth, xContractNumber)

Delete NLB Flow Logs

Delete the specified Network Load Balancer Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **flowLogId** | **String**| The unique ID of the Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersNetworkloadbalancersFlowlogsDelete(datacenterId, networkLoadBalancerId, flowLogId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsDelete");
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
        apiInstance.datacentersNetworkloadbalancersFlowlogsDelete(datacenterId, networkLoadBalancerId, flowLogId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersFlowlogsFindByFlowLogId"></a>
# **datacentersNetworkloadbalancersFlowlogsFindByFlowLogId**
> FlowLog datacentersNetworkloadbalancersFlowlogsFindByFlowLogId(datacenterId, networkLoadBalancerId, flowLogId, pretty, depth, xContractNumber)

Retrieve NLB Flow Logs

Retrieve the specified Network Load Balancer Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **flowLogId** | **String**| The unique ID of the Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsFindByFlowLogId(datacenterId, networkLoadBalancerId, flowLogId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsFindByFlowLogId");
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
        FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsFindByFlowLogId(datacenterId, networkLoadBalancerId, flowLogId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsFindByFlowLogId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersFlowlogsGet"></a>
# **datacentersNetworkloadbalancersFlowlogsGet**
> FlowLogs datacentersNetworkloadbalancersFlowlogsGet(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber)

List NLB Flow Logs

List all the Flow Logs for the specified Network Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**FlowLogs**](../models/FlowLogs.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
        String orderBy = "orderBy_example"; // String | Order by field
        Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
        Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      FlowLogs result = apiInstance.datacentersNetworkloadbalancersFlowlogsGet(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsGet");
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
        FlowLogs result = apiInstance.datacentersNetworkloadbalancersFlowlogsGet(datacenterId, networkLoadBalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersFlowlogsPatch"></a>
# **datacentersNetworkloadbalancersFlowlogsPatch**
> FlowLog datacentersNetworkloadbalancersFlowlogsPatch(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLogProperties, pretty, depth, xContractNumber)

Partially modify NLB Flow Logs

Update the properties of the specified Network Load Balancer Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **flowLogId** | **String**| The unique ID of the Flow Log. ||
| **networkLoadBalancerFlowLogProperties** |  [**FlowLogProperties**](../models/FlowLogProperties.md)| The properties of the Flow Log to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    FlowLogProperties networkLoadBalancerFlowLogProperties = new FlowLogProperties(); // FlowLogProperties | The properties of the Flow Log to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPatch(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLogProperties, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPatch");
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
        FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPatch(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLogProperties)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersFlowlogsPost"></a>
# **datacentersNetworkloadbalancersFlowlogsPost**
> FlowLog datacentersNetworkloadbalancersFlowlogsPost(datacenterId, networkLoadBalancerId, networkLoadBalancerFlowLog, pretty, depth, xContractNumber)

Create NLB Flow Logs

Add a new Flow Log for the Network Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **networkLoadBalancerFlowLog** |  [**FlowLog**](../models/FlowLog.md)| The Flow Log to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    FlowLog networkLoadBalancerFlowLog = new FlowLog(); // FlowLog | The Flow Log to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPost(datacenterId, networkLoadBalancerId, networkLoadBalancerFlowLog, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPost");
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
        FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPost(datacenterId, networkLoadBalancerId, networkLoadBalancerFlowLog)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersFlowlogsPut"></a>
# **datacentersNetworkloadbalancersFlowlogsPut**
> FlowLog datacentersNetworkloadbalancersFlowlogsPut(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLog, pretty, depth, xContractNumber)

Modify NLB Flow Logs

Modify the specified Network Load Balancer Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **flowLogId** | **String**| The unique ID of the Flow Log. ||
| **networkLoadBalancerFlowLog** |  [**FlowLogPut**](../models/FlowLogPut.md)| The modified NLB Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    FlowLogPut networkLoadBalancerFlowLog = new FlowLogPut(); // FlowLogPut | The modified NLB Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPut(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLog, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPut");
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
        FlowLog result = apiInstance.datacentersNetworkloadbalancersFlowlogsPut(datacenterId, networkLoadBalancerId, flowLogId, networkLoadBalancerFlowLog)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersFlowlogsPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersForwardingrulesDelete"></a>
# **datacentersNetworkloadbalancersForwardingrulesDelete**
> datacentersNetworkloadbalancersForwardingrulesDelete(datacenterId, networkLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber)

Delete NLB forwarding rules

Delete the specified Network Load Balancer forwarding rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersNetworkloadbalancersForwardingrulesDelete(datacenterId, networkLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesDelete");
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
        apiInstance.datacentersNetworkloadbalancersForwardingrulesDelete(datacenterId, networkLoadBalancerId, forwardingRuleId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId"></a>
# **datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId**
> NetworkLoadBalancerForwardingRule datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, networkLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber)

Retrieve NLB forwarding rules

Retrieve the specified Network Load Balance forwarding rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NetworkLoadBalancerForwardingRule**](../models/NetworkLoadBalancerForwardingRule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, networkLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId");
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
        NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, networkLoadBalancerId, forwardingRuleId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesFindByForwardingRuleId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersForwardingrulesGet"></a>
# **datacentersNetworkloadbalancersForwardingrulesGet**
> NetworkLoadBalancerForwardingRules datacentersNetworkloadbalancersForwardingrulesGet(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber)

List NLB forwarding rules

List the forwarding rules for the specified Network Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**NetworkLoadBalancerForwardingRules**](../models/NetworkLoadBalancerForwardingRules.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
        String orderBy = "orderBy_example"; // String | Order by field
        Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
        Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      NetworkLoadBalancerForwardingRules result = apiInstance.datacentersNetworkloadbalancersForwardingrulesGet(datacenterId, networkLoadBalancerId, pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesGet");
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
        NetworkLoadBalancerForwardingRules result = apiInstance.datacentersNetworkloadbalancersForwardingrulesGet(datacenterId, networkLoadBalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersForwardingrulesPatch"></a>
# **datacentersNetworkloadbalancersForwardingrulesPatch**
> NetworkLoadBalancerForwardingRule datacentersNetworkloadbalancersForwardingrulesPatch(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRuleProperties, pretty, depth, xContractNumber)

Partially modify NLB forwarding rules

Update the properties of the specified Network Load Balancer forwarding rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. ||
| **networkLoadBalancerForwardingRuleProperties** |  [**NetworkLoadBalancerForwardingRuleProperties**](../models/NetworkLoadBalancerForwardingRuleProperties.md)| The properties of the forwarding rule to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NetworkLoadBalancerForwardingRule**](../models/NetworkLoadBalancerForwardingRule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    NetworkLoadBalancerForwardingRuleProperties networkLoadBalancerForwardingRuleProperties = new NetworkLoadBalancerForwardingRuleProperties(); // NetworkLoadBalancerForwardingRuleProperties | The properties of the forwarding rule to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPatch(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRuleProperties, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPatch");
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
        NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPatch(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRuleProperties)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersForwardingrulesPost"></a>
# **datacentersNetworkloadbalancersForwardingrulesPost**
> NetworkLoadBalancerForwardingRule datacentersNetworkloadbalancersForwardingrulesPost(datacenterId, networkLoadBalancerId, networkLoadBalancerForwardingRule, pretty, depth, xContractNumber)

Create NLB forwarding rules

Create a forwarding rule for the specified Network Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **networkLoadBalancerForwardingRule** |  [**NetworkLoadBalancerForwardingRule**](../models/NetworkLoadBalancerForwardingRule.md)| The forwarding rule to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NetworkLoadBalancerForwardingRule**](../models/NetworkLoadBalancerForwardingRule.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    NetworkLoadBalancerForwardingRule networkLoadBalancerForwardingRule = new NetworkLoadBalancerForwardingRule(); // NetworkLoadBalancerForwardingRule | The forwarding rule to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPost(datacenterId, networkLoadBalancerId, networkLoadBalancerForwardingRule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPost");
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
        NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPost(datacenterId, networkLoadBalancerId, networkLoadBalancerForwardingRule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersForwardingrulesPut"></a>
# **datacentersNetworkloadbalancersForwardingrulesPut**
> NetworkLoadBalancerForwardingRule datacentersNetworkloadbalancersForwardingrulesPut(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRule, pretty, depth, xContractNumber)

Modify NLB forwarding rules

Modify the specified Network Load Balancer forwarding rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. ||
| **networkLoadBalancerForwardingRule** |  [**NetworkLoadBalancerForwardingRulePut**](../models/NetworkLoadBalancerForwardingRulePut.md)| The modified NLB forwarding rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NetworkLoadBalancerForwardingRule**](../models/NetworkLoadBalancerForwardingRule.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    NetworkLoadBalancerForwardingRulePut networkLoadBalancerForwardingRule = new NetworkLoadBalancerForwardingRulePut(); // NetworkLoadBalancerForwardingRulePut | The modified NLB forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPut(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPut");
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
        NetworkLoadBalancerForwardingRule result = apiInstance.datacentersNetworkloadbalancersForwardingrulesPut(datacenterId, networkLoadBalancerId, forwardingRuleId, networkLoadBalancerForwardingRule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersForwardingrulesPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersGet"></a>
# **datacentersNetworkloadbalancersGet**
> NetworkLoadBalancers datacentersNetworkloadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit)

List Network Load Balancers

List all the Network Load Balancers within the data center.

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

[**NetworkLoadBalancers**](../models/NetworkLoadBalancers.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
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
      NetworkLoadBalancers result = apiInstance.datacentersNetworkloadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit, orderBy, maxResults, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersGet");
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
        NetworkLoadBalancers result = apiInstance.datacentersNetworkloadbalancersGet(datacenterId)
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
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersPatch"></a>
# **datacentersNetworkloadbalancersPatch**
> NetworkLoadBalancer datacentersNetworkloadbalancersPatch(datacenterId, networkLoadBalancerId, networkLoadBalancerProperties, pretty, depth, xContractNumber)

Partially modify Network Load Balancers

Update the properties of the specified Network Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **networkLoadBalancerProperties** |  [**NetworkLoadBalancerProperties**](../models/NetworkLoadBalancerProperties.md)| The properties of the Network Load Balancer to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NetworkLoadBalancer**](../models/NetworkLoadBalancer.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    NetworkLoadBalancerProperties networkLoadBalancerProperties = new NetworkLoadBalancerProperties(); // NetworkLoadBalancerProperties | The properties of the Network Load Balancer to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPatch(datacenterId, networkLoadBalancerId, networkLoadBalancerProperties, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPatch");
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
        NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPatch(datacenterId, networkLoadBalancerId, networkLoadBalancerProperties)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersPost"></a>
# **datacentersNetworkloadbalancersPost**
> NetworkLoadBalancer datacentersNetworkloadbalancersPost(datacenterId, networkLoadBalancer, pretty, depth, xContractNumber)

Create Network Load Balancers

Create a Network Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancer** |  [**NetworkLoadBalancer**](../models/NetworkLoadBalancer.md)| The Network Load Balancer to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NetworkLoadBalancer**](../models/NetworkLoadBalancer.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    NetworkLoadBalancer networkLoadBalancer = new NetworkLoadBalancer(); // NetworkLoadBalancer | The Network Load Balancer to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPost(datacenterId, networkLoadBalancer, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPost");
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
        NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPost(datacenterId, networkLoadBalancer)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNetworkloadbalancersPut"></a>
# **datacentersNetworkloadbalancersPut**
> NetworkLoadBalancer datacentersNetworkloadbalancersPut(datacenterId, networkLoadBalancerId, networkLoadBalancer, pretty, depth, xContractNumber)

Modify Network Load Balancers

Modify the properties of the specified Network Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **networkLoadBalancerId** | **String**| The unique ID of the Network Load Balancer. ||
| **networkLoadBalancer** |  [**NetworkLoadBalancerPut**](../models/NetworkLoadBalancerPut.md)| The modified Network Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NetworkLoadBalancer**](../models/NetworkLoadBalancer.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NetworkLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NetworkLoadBalancersApi apiInstance = new NetworkLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String networkLoadBalancerId = "networkLoadBalancerId_example"; // String | The unique ID of the Network Load Balancer.
    NetworkLoadBalancerPut networkLoadBalancer = new NetworkLoadBalancerPut(); // NetworkLoadBalancerPut | The modified Network Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPut(datacenterId, networkLoadBalancerId, networkLoadBalancer, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPut");
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
        NetworkLoadBalancer result = apiInstance.datacentersNetworkloadbalancersPut(datacenterId, networkLoadBalancerId, networkLoadBalancer)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NetworkLoadBalancersApi#datacentersNetworkloadbalancersPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

