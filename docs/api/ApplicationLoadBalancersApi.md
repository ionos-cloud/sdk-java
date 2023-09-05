# ApplicationLoadBalancersApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersApplicationloadbalancersDelete**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersdelete) | **DELETE** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId} | Delete an Application Load Balancer by ID |
| [**datacentersApplicationloadbalancersFindByApplicationLoadBalancerId**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersfindbyapplicationloadbalancerid) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId} | Get an Application Load Balancer by ID |
| [**datacentersApplicationloadbalancersFlowlogsDelete**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogsdelete) | **DELETE** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs/{flowLogId} | Delete an ALB Flow Log by ID |
| [**datacentersApplicationloadbalancersFlowlogsFindByFlowLogId**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogsfindbyflowlogid) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs/{flowLogId} | Get an ALB Flow Log by ID |
| [**datacentersApplicationloadbalancersFlowlogsGet**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogsget) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs | Get ALB Flow Logs |
| [**datacentersApplicationloadbalancersFlowlogsPatch**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogspatch) | **PATCH** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs/{flowLogId} | Partially Modify an ALB Flow Log by ID |
| [**datacentersApplicationloadbalancersFlowlogsPost**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogspost) | **POST** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs | Create an ALB Flow Log |
| [**datacentersApplicationloadbalancersFlowlogsPut**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogsput) | **PUT** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs/{flowLogId} | Modify an ALB Flow Log by ID |
| [**datacentersApplicationloadbalancersForwardingrulesDelete**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulesdelete) | **DELETE** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules/{forwardingRuleId} | Delete an ALB Forwarding Rule by ID |
| [**datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulesfindbyforwardingruleid) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules/{forwardingRuleId} | Get an ALB Forwarding Rule by ID |
| [**datacentersApplicationloadbalancersForwardingrulesGet**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulesget) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules | Get ALB Forwarding Rules |
| [**datacentersApplicationloadbalancersForwardingrulesPatch**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulespatch) | **PATCH** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules/{forwardingRuleId} | Partially modify an ALB Forwarding Rule by ID |
| [**datacentersApplicationloadbalancersForwardingrulesPost**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulespost) | **POST** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules | Create an ALB Forwarding Rule |
| [**datacentersApplicationloadbalancersForwardingrulesPut**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulesput) | **PUT** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules/{forwardingRuleId} | Modify an ALB Forwarding Rule by ID |
| [**datacentersApplicationloadbalancersGet**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersget) | **GET** /datacenters/{datacenterId}/applicationloadbalancers | Get Application Load Balancers |
| [**datacentersApplicationloadbalancersPatch**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancerspatch) | **PATCH** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId} | Partially Modify an Application Load Balancer by ID |
| [**datacentersApplicationloadbalancersPost**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancerspost) | **POST** /datacenters/{datacenterId}/applicationloadbalancers | Create an Application Load Balancer |
| [**datacentersApplicationloadbalancersPut**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersput) | **PUT** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId} | Modify an Application Load Balancer by ID |


<a name="datacentersApplicationloadbalancersDelete"></a>
# **datacentersApplicationloadbalancersDelete**
> datacentersApplicationloadbalancersDelete(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber)

Delete an Application Load Balancer by ID

Removes the specified Application Load Balancer from the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersApplicationloadbalancersDeleteWithHttpInfo(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersDelete");
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
        apiInstance.datacentersApplicationloadbalancersDelete(datacenterId, applicationLoadBalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersFindByApplicationLoadBalancerId"></a>
# **datacentersApplicationloadbalancersFindByApplicationLoadBalancerId**
> ApplicationLoadBalancer datacentersApplicationloadbalancersFindByApplicationLoadBalancerId(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber)

Get an Application Load Balancer by ID

Retrieves the properties of the specified Application Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersFindByApplicationLoadBalancerIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersFindByApplicationLoadBalancerId instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<ApplicationLoadBalancer> result = apiInstance.datacentersApplicationloadbalancersFindByApplicationLoadBalancerIdWithHttpInfo(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFindByApplicationLoadBalancerId");
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
        ApplicationLoadBalancer result = apiInstance.datacentersApplicationloadbalancersFindByApplicationLoadBalancerId(datacenterId, applicationLoadBalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFindByApplicationLoadBalancerId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersFlowlogsDelete"></a>
# **datacentersApplicationloadbalancersFlowlogsDelete**
> datacentersApplicationloadbalancersFlowlogsDelete(datacenterId, applicationLoadBalancerId, flowLogId, pretty, depth, xContractNumber)

Delete an ALB Flow Log by ID

Deletes the Application Load Balancer flow log specified by its ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **flowLogId** | **String**| The unique ID of the flow log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersFlowlogsDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersFlowlogsDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the flow log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersApplicationloadbalancersFlowlogsDeleteWithHttpInfo(datacenterId, applicationLoadBalancerId, flowLogId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsDelete");
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
        apiInstance.datacentersApplicationloadbalancersFlowlogsDelete(datacenterId, applicationLoadBalancerId, flowLogId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersFlowlogsFindByFlowLogId"></a>
# **datacentersApplicationloadbalancersFlowlogsFindByFlowLogId**
> FlowLog datacentersApplicationloadbalancersFlowlogsFindByFlowLogId(datacenterId, applicationLoadBalancerId, flowLogId, pretty, depth, xContractNumber)

Get an ALB Flow Log by ID

Retrieves the Application Load Balancer flow log specified by its ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **flowLogId** | **String**| The unique ID of the flow log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersFlowlogsFindByFlowLogIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersFlowlogsFindByFlowLogId instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the flow log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersApplicationloadbalancersFlowlogsFindByFlowLogIdWithHttpInfo(datacenterId, applicationLoadBalancerId, flowLogId, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsFindByFlowLogId");
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
        FlowLog result = apiInstance.datacentersApplicationloadbalancersFlowlogsFindByFlowLogId(datacenterId, applicationLoadBalancerId, flowLogId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsFindByFlowLogId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersFlowlogsGet"></a>
# **datacentersApplicationloadbalancersFlowlogsGet**
> FlowLogs datacentersApplicationloadbalancersFlowlogsGet(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber)

Get ALB Flow Logs

Retrieves the flow logs for the specified Application Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
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

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersFlowlogsGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersFlowlogsGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      ApiResponse<FlowLogs> result = apiInstance.datacentersApplicationloadbalancersFlowlogsGetWithHttpInfo(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsGet");
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
        FlowLogs result = apiInstance.datacentersApplicationloadbalancersFlowlogsGet(datacenterId, applicationLoadBalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersFlowlogsPatch"></a>
# **datacentersApplicationloadbalancersFlowlogsPatch**
> FlowLog datacentersApplicationloadbalancersFlowlogsPatch(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLogProperties, pretty, depth, xContractNumber)

Partially Modify an ALB Flow Log by ID

Updates the properties of the Application Load Balancer flow log specified by its ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **flowLogId** | **String**| The unique ID of the flow log. ||
| **applicationLoadBalancerFlowLogProperties** |  [**FlowLogProperties**](../models/FlowLogProperties.md)| The properties of the ALB flow log to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersFlowlogsPatchWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersFlowlogsPatch instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the flow log.
    action = new String(); // String | Specifies the traffic action pattern.
    bucket = new String(); // String | The S3 bucket name of an existing IONOS Cloud S3 bucket.
    direction = new String(); // String | Specifies the traffic direction pattern.
    name = new String(); // String | The resource name.
    applicationLoadBalancerFlowLogProperties = new FlowLogProperties(String, String, String, String); // FlowLogProperties | The properties of the ALB flow log to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersApplicationloadbalancersFlowlogsPatchWithHttpInfo(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLogProperties, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsPatch");
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
        FlowLog result = apiInstance.datacentersApplicationloadbalancersFlowlogsPatch(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLogProperties)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersFlowlogsPost"></a>
# **datacentersApplicationloadbalancersFlowlogsPost**
> FlowLog datacentersApplicationloadbalancersFlowlogsPost(datacenterId, applicationLoadBalancerId, applicationLoadBalancerFlowLog, pretty, depth, xContractNumber)

Create an ALB Flow Log

Creates a flow log for the Application Load Balancer specified by ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **applicationLoadBalancerFlowLog** |  [**FlowLog**](../models/FlowLog.md)| The flow log to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersFlowlogsPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersFlowlogsPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    properties = new FlowLogProperties(); // FlowLogProperties | 
    applicationLoadBalancerFlowLog = new FlowLog(FlowLogProperties); // FlowLog | The flow log to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersApplicationloadbalancersFlowlogsPostWithHttpInfo(datacenterId, applicationLoadBalancerId, applicationLoadBalancerFlowLog, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsPost");
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
        FlowLog result = apiInstance.datacentersApplicationloadbalancersFlowlogsPost(datacenterId, applicationLoadBalancerId, applicationLoadBalancerFlowLog)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersFlowlogsPut"></a>
# **datacentersApplicationloadbalancersFlowlogsPut**
> FlowLog datacentersApplicationloadbalancersFlowlogsPut(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLog, pretty, depth, xContractNumber)

Modify an ALB Flow Log by ID

Modifies the Application Load Balancer flow log specified by its ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **flowLogId** | **String**| The unique ID of the flow log. ||
| **applicationLoadBalancerFlowLog** |  [**FlowLogPut**](../models/FlowLogPut.md)| The modified ALB flow log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersFlowlogsPutWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersFlowlogsPut instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the flow log.
    properties = new FlowLogProperties(); // FlowLogProperties | 
    applicationLoadBalancerFlowLog = new FlowLogPut(FlowLogProperties); // FlowLogPut | The modified ALB flow log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersApplicationloadbalancersFlowlogsPutWithHttpInfo(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLog, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsPut");
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
        FlowLog result = apiInstance.datacentersApplicationloadbalancersFlowlogsPut(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLog)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersFlowlogsPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersForwardingrulesDelete"></a>
# **datacentersApplicationloadbalancersForwardingrulesDelete**
> datacentersApplicationloadbalancersForwardingrulesDelete(datacenterId, applicationLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber)

Delete an ALB Forwarding Rule by ID

Deletes the Application Load Balancer forwarding rule specified by its ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersForwardingrulesDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersForwardingrulesDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersApplicationloadbalancersForwardingrulesDeleteWithHttpInfo(datacenterId, applicationLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesDelete");
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
        apiInstance.datacentersApplicationloadbalancersForwardingrulesDelete(datacenterId, applicationLoadBalancerId, forwardingRuleId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId"></a>
# **datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId**
> ApplicationLoadBalancerForwardingRule datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, applicationLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber)

Get an ALB Forwarding Rule by ID

Retrieves the Application Load Balancer forwarding rule specified by its ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<ApplicationLoadBalancerForwardingRule> result = apiInstance.datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleIdWithHttpInfo(datacenterId, applicationLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId");
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
        ApplicationLoadBalancerForwardingRule result = apiInstance.datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, applicationLoadBalancerId, forwardingRuleId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersForwardingrulesGet"></a>
# **datacentersApplicationloadbalancersForwardingrulesGet**
> ApplicationLoadBalancerForwardingRules datacentersApplicationloadbalancersForwardingrulesGet(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber)

Get ALB Forwarding Rules

Lists the forwarding rules of the specified Application Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**ApplicationLoadBalancerForwardingRules**](../models/ApplicationLoadBalancerForwardingRules.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersForwardingrulesGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersForwardingrulesGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      ApiResponse<ApplicationLoadBalancerForwardingRules> result = apiInstance.datacentersApplicationloadbalancersForwardingrulesGetWithHttpInfo(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesGet");
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
        ApplicationLoadBalancerForwardingRules result = apiInstance.datacentersApplicationloadbalancersForwardingrulesGet(datacenterId, applicationLoadBalancerId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersForwardingrulesPatch"></a>
# **datacentersApplicationloadbalancersForwardingrulesPatch**
> ApplicationLoadBalancerForwardingRule datacentersApplicationloadbalancersForwardingrulesPatch(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRuleProperties, pretty, depth, xContractNumber)

Partially modify an ALB Forwarding Rule by ID

Updates the properties of the Application Load Balancer forwarding rule specified by its ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. ||
| **applicationLoadBalancerForwardingRuleProperties** |  [**ApplicationLoadBalancerForwardingRuleProperties**](../models/ApplicationLoadBalancerForwardingRuleProperties.md)| The properties of the forwarding rule to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersForwardingrulesPatchWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersForwardingrulesPatch instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    listenerIp = new String(); // String | The listening (inbound) IP.
    listenerPort = new Integer(); // Integer | The listening (inbound) port number; the valid range is 1 to 65535.
    name = new String(); // String | The name of the Application Load Balancer forwarding rule.
    protocol = new String(); // String | The balancing protocol.
    applicationLoadBalancerForwardingRuleProperties = new ApplicationLoadBalancerForwardingRuleProperties(String, Integer, String, String); // ApplicationLoadBalancerForwardingRuleProperties | The properties of the forwarding rule to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<ApplicationLoadBalancerForwardingRule> result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPatchWithHttpInfo(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRuleProperties, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesPatch");
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
        ApplicationLoadBalancerForwardingRule result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPatch(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRuleProperties)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersForwardingrulesPost"></a>
# **datacentersApplicationloadbalancersForwardingrulesPost**
> ApplicationLoadBalancerForwardingRule datacentersApplicationloadbalancersForwardingrulesPost(datacenterId, applicationLoadBalancerId, applicationLoadBalancerForwardingRule, pretty, depth, xContractNumber)

Create an ALB Forwarding Rule

Creates a forwarding rule for the specified Application Load Balancer.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **applicationLoadBalancerForwardingRule** |  [**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)| The forwarding rule to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersForwardingrulesPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersForwardingrulesPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    properties = new ApplicationLoadBalancerForwardingRuleProperties(); // ApplicationLoadBalancerForwardingRuleProperties | 
    applicationLoadBalancerForwardingRule = new ApplicationLoadBalancerForwardingRule(ApplicationLoadBalancerForwardingRuleProperties); // ApplicationLoadBalancerForwardingRule | The forwarding rule to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<ApplicationLoadBalancerForwardingRule> result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPostWithHttpInfo(datacenterId, applicationLoadBalancerId, applicationLoadBalancerForwardingRule, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesPost");
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
        ApplicationLoadBalancerForwardingRule result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPost(datacenterId, applicationLoadBalancerId, applicationLoadBalancerForwardingRule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersForwardingrulesPut"></a>
# **datacentersApplicationloadbalancersForwardingrulesPut**
> ApplicationLoadBalancerForwardingRule datacentersApplicationloadbalancersForwardingrulesPut(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRule, pretty, depth, xContractNumber)

Modify an ALB Forwarding Rule by ID

Modifies the Application Load Balancer forwarding rule specified by its ID.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. ||
| **applicationLoadBalancerForwardingRule** |  [**ApplicationLoadBalancerForwardingRulePut**](../models/ApplicationLoadBalancerForwardingRulePut.md)| The modified ALB forwarding rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersForwardingrulesPutWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersForwardingrulesPut instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    properties = new ApplicationLoadBalancerForwardingRuleProperties(); // ApplicationLoadBalancerForwardingRuleProperties | 
    applicationLoadBalancerForwardingRule = new ApplicationLoadBalancerForwardingRulePut(ApplicationLoadBalancerForwardingRuleProperties); // ApplicationLoadBalancerForwardingRulePut | The modified ALB forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<ApplicationLoadBalancerForwardingRule> result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPutWithHttpInfo(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRule, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesPut");
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
        ApplicationLoadBalancerForwardingRule result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPut(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersForwardingrulesPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersGet"></a>
# **datacentersApplicationloadbalancersGet**
> ApplicationLoadBalancers datacentersApplicationloadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit)

Get Application Load Balancers

Lists all Application Load Balancers within a data center.

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

[**ApplicationLoadBalancers**](../models/ApplicationLoadBalancers.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
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
      ApiResponse<ApplicationLoadBalancers> result = apiInstance.datacentersApplicationloadbalancersGetWithHttpInfo(datacenterId, pretty, depth, xContractNumber, offset, limit, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersGet");
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
        ApplicationLoadBalancers result = apiInstance.datacentersApplicationloadbalancersGet(datacenterId)
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
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersPatch"></a>
# **datacentersApplicationloadbalancersPatch**
> ApplicationLoadBalancer datacentersApplicationloadbalancersPatch(datacenterId, applicationLoadBalancerId, applicationLoadBalancerProperties, pretty, depth, xContractNumber)

Partially Modify an Application Load Balancer by ID

Updates the properties of the specified Application Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **applicationLoadBalancerProperties** |  [**ApplicationLoadBalancerProperties**](../models/ApplicationLoadBalancerProperties.md)| The Application Load Balancer properties to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersPatchWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersPatch instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    listenerLan = new Integer(); // Integer | The ID of the listening (inbound) LAN.
    name = new String(); // String | The Application Load Balancer name.
    targetLan = new Integer(); // Integer | The ID of the balanced private target LAN (outbound).
    applicationLoadBalancerProperties = new ApplicationLoadBalancerProperties(Integer, String, Integer); // ApplicationLoadBalancerProperties | The Application Load Balancer properties to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<ApplicationLoadBalancer> result = apiInstance.datacentersApplicationloadbalancersPatchWithHttpInfo(datacenterId, applicationLoadBalancerId, applicationLoadBalancerProperties, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersPatch");
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
        ApplicationLoadBalancer result = apiInstance.datacentersApplicationloadbalancersPatch(datacenterId, applicationLoadBalancerId, applicationLoadBalancerProperties)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersPost"></a>
# **datacentersApplicationloadbalancersPost**
> ApplicationLoadBalancer datacentersApplicationloadbalancersPost(datacenterId, applicationLoadBalancer, pretty, depth, xContractNumber)

Create an Application Load Balancer

Creates an Application Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancer** |  [**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)| The Application Load Balancer to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    properties = new ApplicationLoadBalancerProperties(); // ApplicationLoadBalancerProperties | 
    applicationLoadBalancer = new ApplicationLoadBalancer(ApplicationLoadBalancerProperties); // ApplicationLoadBalancer | The Application Load Balancer to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<ApplicationLoadBalancer> result = apiInstance.datacentersApplicationloadbalancersPostWithHttpInfo(datacenterId, applicationLoadBalancer, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersPost");
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
        ApplicationLoadBalancer result = apiInstance.datacentersApplicationloadbalancersPost(datacenterId, applicationLoadBalancer)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersApplicationloadbalancersPut"></a>
# **datacentersApplicationloadbalancersPut**
> ApplicationLoadBalancer datacentersApplicationloadbalancersPut(datacenterId, applicationLoadBalancerId, applicationLoadBalancer, pretty, depth, xContractNumber)

Modify an Application Load Balancer by ID

Modifies the properties of the specified Application Load Balancer within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. ||
| **applicationLoadBalancer** |  [**ApplicationLoadBalancerPut**](../models/ApplicationLoadBalancerPut.md)| The modified Application Load Balancer. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersApplicationloadbalancersPutWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersApplicationloadbalancersPut instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.ApplicationLoadBalancersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    properties = new ApplicationLoadBalancerProperties(); // ApplicationLoadBalancerProperties | 
    applicationLoadBalancer = new ApplicationLoadBalancerPut(ApplicationLoadBalancerProperties); // ApplicationLoadBalancerPut | The modified Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<ApplicationLoadBalancer> result = apiInstance.datacentersApplicationloadbalancersPutWithHttpInfo(datacenterId, applicationLoadBalancerId, applicationLoadBalancer, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersPut");
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
        ApplicationLoadBalancer result = apiInstance.datacentersApplicationloadbalancersPut(datacenterId, applicationLoadBalancerId, applicationLoadBalancer)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ApplicationLoadBalancersApi#datacentersApplicationloadbalancersPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

