# ApplicationLoadBalancersApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersApplicationloadbalancersDelete**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersdelete) | **DELETE** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId} | Delete Application Load Balancers |
| [**datacentersApplicationloadbalancersFindByApplicationLoadBalancerId**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersfindbyapplicationloadbalancerid) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId} | Retrieve Application Load Balancers |
| [**datacentersApplicationloadbalancersFlowlogsDelete**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogsdelete) | **DELETE** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs/{flowLogId} | Delete ALB Flow Logs |
| [**datacentersApplicationloadbalancersFlowlogsFindByFlowLogId**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogsfindbyflowlogid) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs/{flowLogId} | Retrieve ALB Flow Logs |
| [**datacentersApplicationloadbalancersFlowlogsGet**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogsget) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs | List ALB Flow Logs |
| [**datacentersApplicationloadbalancersFlowlogsPatch**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogspatch) | **PATCH** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs/{flowLogId} | Partially modify ALB Flow Logs |
| [**datacentersApplicationloadbalancersFlowlogsPost**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogspost) | **POST** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs | Create ALB Flow Logs |
| [**datacentersApplicationloadbalancersFlowlogsPut**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersflowlogsput) | **PUT** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/flowlogs/{flowLogId} | Modify ALB Flow Logs |
| [**datacentersApplicationloadbalancersForwardingrulesDelete**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulesdelete) | **DELETE** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules/{forwardingRuleId} | Delete ALB forwarding rules |
| [**datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulesfindbyforwardingruleid) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules/{forwardingRuleId} | Retrieve ALB forwarding rules |
| [**datacentersApplicationloadbalancersForwardingrulesGet**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulesget) | **GET** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules | List ALB forwarding rules |
| [**datacentersApplicationloadbalancersForwardingrulesPatch**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulespatch) | **PATCH** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules/{forwardingRuleId} | Partially modify ALB forwarding rules |
| [**datacentersApplicationloadbalancersForwardingrulesPost**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulespost) | **POST** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules | Create ALB forwarding rules |
| [**datacentersApplicationloadbalancersForwardingrulesPut**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersforwardingrulesput) | **PUT** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId}/forwardingrules/{forwardingRuleId} | Modify ALB forwarding rules |
| [**datacentersApplicationloadbalancersGet**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersget) | **GET** /datacenters/{datacenterId}/applicationloadbalancers | List Application Load Balancers |
| [**datacentersApplicationloadbalancersPatch**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancerspatch) | **PATCH** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId} | Partially modify Application Load Balancers |
| [**datacentersApplicationloadbalancersPost**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancerspost) | **POST** /datacenters/{datacenterId}/applicationloadbalancers | Create Application Load Balancers |
| [**datacentersApplicationloadbalancersPut**](ApplicationLoadBalancersApi.md#datacentersapplicationloadbalancersput) | **PUT** /datacenters/{datacenterId}/applicationloadbalancers/{applicationLoadBalancerId} | Modify Application Load Balancers |


<a name="datacentersApplicationloadbalancersDelete"></a>
# **datacentersApplicationloadbalancersDelete**
> datacentersApplicationloadbalancersDelete(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber)

Delete Application Load Balancers

Remove the specified Application Load Balancer from the data center..

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersApplicationloadbalancersDelete(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersFindByApplicationLoadBalancerId"></a>
# **datacentersApplicationloadbalancersFindByApplicationLoadBalancerId**
> ApplicationLoadBalancer datacentersApplicationloadbalancersFindByApplicationLoadBalancerId(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber)

Retrieve Application Load Balancers

Retrieve the properties of the specified Application Load Balancer within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancer result = apiInstance.datacentersApplicationloadbalancersFindByApplicationLoadBalancerId(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersFlowlogsDelete"></a>
# **datacentersApplicationloadbalancersFlowlogsDelete**
> datacentersApplicationloadbalancersFlowlogsDelete(datacenterId, applicationLoadBalancerId, flowLogId, pretty, depth, xContractNumber)

Delete ALB Flow Logs

Delete the specified Application Load Balancer Flow Log.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersApplicationloadbalancersFlowlogsDelete(datacenterId, applicationLoadBalancerId, flowLogId, pretty, depth, xContractNumber);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **flowLogId** | **String**| The unique ID of the Flow Log. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersFlowlogsFindByFlowLogId"></a>
# **datacentersApplicationloadbalancersFlowlogsFindByFlowLogId**
> FlowLog datacentersApplicationloadbalancersFlowlogsFindByFlowLogId(datacenterId, applicationLoadBalancerId, flowLogId, pretty, depth, xContractNumber)

Retrieve ALB Flow Logs

Retrieve the specified Application Load Balancer Flow Log.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLog result = apiInstance.datacentersApplicationloadbalancersFlowlogsFindByFlowLogId(datacenterId, applicationLoadBalancerId, flowLogId, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **flowLogId** | **String**| The unique ID of the Flow Log. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersFlowlogsGet"></a>
# **datacentersApplicationloadbalancersFlowlogsGet**
> FlowLogs datacentersApplicationloadbalancersFlowlogsGet(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber)

List ALB Flow Logs

List the Flow Logs for the specified Application Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLogs result = apiInstance.datacentersApplicationloadbalancersFlowlogsGet(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**FlowLogs**](../models/FlowLogs.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersFlowlogsPatch"></a>
# **datacentersApplicationloadbalancersFlowlogsPatch**
> FlowLog datacentersApplicationloadbalancersFlowlogsPatch(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLogProperties, pretty, depth, xContractNumber)

Partially modify ALB Flow Logs

Update the properties of the specified Application Load Balancer Flow Log.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    FlowLogProperties applicationLoadBalancerFlowLogProperties = new FlowLogProperties(); // FlowLogProperties | The properties of the ALB Flow Log to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLog result = apiInstance.datacentersApplicationloadbalancersFlowlogsPatch(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLogProperties, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **flowLogId** | **String**| The unique ID of the Flow Log. |
| **applicationLoadBalancerFlowLogProperties** |  [**FlowLogProperties**](FlowLogProperties.md)| The properties of the ALB Flow Log to be updated. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersFlowlogsPost"></a>
# **datacentersApplicationloadbalancersFlowlogsPost**
> FlowLog datacentersApplicationloadbalancersFlowlogsPost(datacenterId, applicationLoadBalancerId, applicationLoadBalancerFlowLog, pretty, depth, xContractNumber)

Create ALB Flow Logs

Add a new Flow Log for the Application Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    FlowLog applicationLoadBalancerFlowLog = new FlowLog(); // FlowLog | The Flow Log to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLog result = apiInstance.datacentersApplicationloadbalancersFlowlogsPost(datacenterId, applicationLoadBalancerId, applicationLoadBalancerFlowLog, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **applicationLoadBalancerFlowLog** |  [**FlowLog**](FlowLog.md)| The Flow Log to create. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersFlowlogsPut"></a>
# **datacentersApplicationloadbalancersFlowlogsPut**
> FlowLog datacentersApplicationloadbalancersFlowlogsPut(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLog, pretty, depth, xContractNumber)

Modify ALB Flow Logs

Modify the specified Application Load Balancer Flow Log.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    FlowLogPut applicationLoadBalancerFlowLog = new FlowLogPut(); // FlowLogPut | The modified ALB Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FlowLog result = apiInstance.datacentersApplicationloadbalancersFlowlogsPut(datacenterId, applicationLoadBalancerId, flowLogId, applicationLoadBalancerFlowLog, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **flowLogId** | **String**| The unique ID of the Flow Log. |
| **applicationLoadBalancerFlowLog** |  [**FlowLogPut**](FlowLogPut.md)| The modified ALB Flow Log. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersForwardingrulesDelete"></a>
# **datacentersApplicationloadbalancersForwardingrulesDelete**
> datacentersApplicationloadbalancersForwardingrulesDelete(datacenterId, applicationLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber)

Delete ALB forwarding rules

Delete the specified Application Load Balancer forwarding rule.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersApplicationloadbalancersForwardingrulesDelete(datacenterId, applicationLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId"></a>
# **datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId**
> ApplicationLoadBalancerForwardingRule datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, applicationLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber)

Retrieve ALB forwarding rules

Retrieve the specified Application Load Balancer forwarding rule.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancerForwardingRule result = apiInstance.datacentersApplicationloadbalancersForwardingrulesFindByForwardingRuleId(datacenterId, applicationLoadBalancerId, forwardingRuleId, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersForwardingrulesGet"></a>
# **datacentersApplicationloadbalancersForwardingrulesGet**
> ApplicationLoadBalancerForwardingRules datacentersApplicationloadbalancersForwardingrulesGet(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber)

List ALB forwarding rules

List the forwarding rules for the specified Application Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancerForwardingRules result = apiInstance.datacentersApplicationloadbalancersForwardingrulesGet(datacenterId, applicationLoadBalancerId, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancerForwardingRules**](../models/ApplicationLoadBalancerForwardingRules.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersForwardingrulesPatch"></a>
# **datacentersApplicationloadbalancersForwardingrulesPatch**
> ApplicationLoadBalancerForwardingRule datacentersApplicationloadbalancersForwardingrulesPatch(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRuleProperties, pretty, depth, xContractNumber)

Partially modify ALB forwarding rules

Update the properties of the specified Application Load Balancer forwarding rule.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    ApplicationLoadBalancerForwardingRuleProperties applicationLoadBalancerForwardingRuleProperties = new ApplicationLoadBalancerForwardingRuleProperties(); // ApplicationLoadBalancerForwardingRuleProperties | The properties of the forwarding rule to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancerForwardingRule result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPatch(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRuleProperties, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. |
| **applicationLoadBalancerForwardingRuleProperties** |  [**ApplicationLoadBalancerForwardingRuleProperties**](ApplicationLoadBalancerForwardingRuleProperties.md)| The properties of the forwarding rule to be updated. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersForwardingrulesPost"></a>
# **datacentersApplicationloadbalancersForwardingrulesPost**
> ApplicationLoadBalancerForwardingRule datacentersApplicationloadbalancersForwardingrulesPost(datacenterId, applicationLoadBalancerId, applicationLoadBalancerForwardingRule, pretty, depth, xContractNumber)

Create ALB forwarding rules

Create a forwarding rule for the Application Load Balancer.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    ApplicationLoadBalancerForwardingRule applicationLoadBalancerForwardingRule = new ApplicationLoadBalancerForwardingRule(); // ApplicationLoadBalancerForwardingRule | The forwarding rule to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancerForwardingRule result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPost(datacenterId, applicationLoadBalancerId, applicationLoadBalancerForwardingRule, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **applicationLoadBalancerForwardingRule** |  [**ApplicationLoadBalancerForwardingRule**](ApplicationLoadBalancerForwardingRule.md)| The forwarding rule to create. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersForwardingrulesPut"></a>
# **datacentersApplicationloadbalancersForwardingrulesPut**
> ApplicationLoadBalancerForwardingRule datacentersApplicationloadbalancersForwardingrulesPut(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRule, pretty, depth, xContractNumber)

Modify ALB forwarding rules

Modify the specified Application Load Balancer forwarding rule.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    String forwardingRuleId = "forwardingRuleId_example"; // String | The unique ID of the forwarding rule.
    ApplicationLoadBalancerForwardingRulePut applicationLoadBalancerForwardingRule = new ApplicationLoadBalancerForwardingRulePut(); // ApplicationLoadBalancerForwardingRulePut | The modified ALB forwarding rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancerForwardingRule result = apiInstance.datacentersApplicationloadbalancersForwardingrulesPut(datacenterId, applicationLoadBalancerId, forwardingRuleId, applicationLoadBalancerForwardingRule, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **forwardingRuleId** | **String**| The unique ID of the forwarding rule. |
| **applicationLoadBalancerForwardingRule** |  [**ApplicationLoadBalancerForwardingRulePut**](ApplicationLoadBalancerForwardingRulePut.md)| The modified ALB forwarding rule. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancerForwardingRule**](../models/ApplicationLoadBalancerForwardingRule.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersGet"></a>
# **datacentersApplicationloadbalancersGet**
> ApplicationLoadBalancers datacentersApplicationloadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit)

List Application Load Balancers

List all Application Load Balancers within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (used together with <b><i>limit</i></b> for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
    try {
      ApplicationLoadBalancers result = apiInstance.datacentersApplicationloadbalancersGet(datacenterId, pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]
| **offset** | **Integer**| The first element (from the complete list of the elements) to include in the response (used together with &lt;b&gt;&lt;i&gt;limit&lt;/i&gt;&lt;/b&gt; for pagination). | [optional] [default to 0]
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 1000]

### Return type

[**ApplicationLoadBalancers**](../models/ApplicationLoadBalancers.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersPatch"></a>
# **datacentersApplicationloadbalancersPatch**
> ApplicationLoadBalancer datacentersApplicationloadbalancersPatch(datacenterId, applicationLoadBalancerId, applicationLoadBalancerProperties, pretty, depth, xContractNumber)

Partially modify Application Load Balancers

Update the properties of the specified Application Load Balancer within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    ApplicationLoadBalancerProperties applicationLoadBalancerProperties = new ApplicationLoadBalancerProperties(); // ApplicationLoadBalancerProperties | The Application Load Balancer properties to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancer result = apiInstance.datacentersApplicationloadbalancersPatch(datacenterId, applicationLoadBalancerId, applicationLoadBalancerProperties, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **applicationLoadBalancerProperties** |  [**ApplicationLoadBalancerProperties**](ApplicationLoadBalancerProperties.md)| The Application Load Balancer properties to be updated. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersPost"></a>
# **datacentersApplicationloadbalancersPost**
> ApplicationLoadBalancer datacentersApplicationloadbalancersPost(datacenterId, applicationLoadBalancer, pretty, depth, xContractNumber)

Create Application Load Balancers

Create an Application Load Balancer within the datacenter.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    ApplicationLoadBalancer applicationLoadBalancer = new ApplicationLoadBalancer(); // ApplicationLoadBalancer | The Application Load Balancer to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancer result = apiInstance.datacentersApplicationloadbalancersPost(datacenterId, applicationLoadBalancer, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancer** |  [**ApplicationLoadBalancer**](ApplicationLoadBalancer.md)| The Application Load Balancer to create. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersApplicationloadbalancersPut"></a>
# **datacentersApplicationloadbalancersPut**
> ApplicationLoadBalancer datacentersApplicationloadbalancersPut(datacenterId, applicationLoadBalancerId, applicationLoadBalancer, pretty, depth, xContractNumber)

Modify Application Load Balancers

Modify the properties of the specified Application Load Balancer within the data center.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    ApplicationLoadBalancersApi apiInstance = new ApplicationLoadBalancersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String applicationLoadBalancerId = "applicationLoadBalancerId_example"; // String | The unique ID of the Application Load Balancer.
    ApplicationLoadBalancerPut applicationLoadBalancer = new ApplicationLoadBalancerPut(); // ApplicationLoadBalancerPut | The modified Application Load Balancer.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApplicationLoadBalancer result = apiInstance.datacentersApplicationloadbalancersPut(datacenterId, applicationLoadBalancerId, applicationLoadBalancer, pretty, depth, xContractNumber);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. |
| **applicationLoadBalancerId** | **String**| The unique ID of the Application Load Balancer. |
| **applicationLoadBalancer** |  [**ApplicationLoadBalancerPut**](ApplicationLoadBalancerPut.md)| The modified Application Load Balancer. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]

### Return type

[**ApplicationLoadBalancer**](../models/ApplicationLoadBalancer.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

