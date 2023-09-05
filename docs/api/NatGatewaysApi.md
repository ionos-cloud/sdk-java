# NatGatewaysApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersNatgatewaysDelete**](NatGatewaysApi.md#datacentersnatgatewaysdelete) | **DELETE** /datacenters/{datacenterId}/natgateways/{natGatewayId} | Delete NAT Gateways |
| [**datacentersNatgatewaysFindByNatGatewayId**](NatGatewaysApi.md#datacentersnatgatewaysfindbynatgatewayid) | **GET** /datacenters/{datacenterId}/natgateways/{natGatewayId} | Retrieve NAT Gateways |
| [**datacentersNatgatewaysFlowlogsDelete**](NatGatewaysApi.md#datacentersnatgatewaysflowlogsdelete) | **DELETE** /datacenters/{datacenterId}/natgateways/{natGatewayId}/flowlogs/{flowLogId} | Delete NAT Gateway Flow Logs |
| [**datacentersNatgatewaysFlowlogsFindByFlowLogId**](NatGatewaysApi.md#datacentersnatgatewaysflowlogsfindbyflowlogid) | **GET** /datacenters/{datacenterId}/natgateways/{natGatewayId}/flowlogs/{flowLogId} | Retrieve NAT Gateway Flow Logs |
| [**datacentersNatgatewaysFlowlogsGet**](NatGatewaysApi.md#datacentersnatgatewaysflowlogsget) | **GET** /datacenters/{datacenterId}/natgateways/{natGatewayId}/flowlogs | List NAT Gateway Flow Logs |
| [**datacentersNatgatewaysFlowlogsPatch**](NatGatewaysApi.md#datacentersnatgatewaysflowlogspatch) | **PATCH** /datacenters/{datacenterId}/natgateways/{natGatewayId}/flowlogs/{flowLogId} | Partially modify NAT Gateway Flow Logs |
| [**datacentersNatgatewaysFlowlogsPost**](NatGatewaysApi.md#datacentersnatgatewaysflowlogspost) | **POST** /datacenters/{datacenterId}/natgateways/{natGatewayId}/flowlogs | Create a NAT Gateway Flow Log |
| [**datacentersNatgatewaysFlowlogsPut**](NatGatewaysApi.md#datacentersnatgatewaysflowlogsput) | **PUT** /datacenters/{datacenterId}/natgateways/{natGatewayId}/flowlogs/{flowLogId} | Modify NAT Gateway Flow Logs |
| [**datacentersNatgatewaysGet**](NatGatewaysApi.md#datacentersnatgatewaysget) | **GET** /datacenters/{datacenterId}/natgateways | List NAT Gateways |
| [**datacentersNatgatewaysPatch**](NatGatewaysApi.md#datacentersnatgatewayspatch) | **PATCH** /datacenters/{datacenterId}/natgateways/{natGatewayId} | Partially modify NAT Gateways |
| [**datacentersNatgatewaysPost**](NatGatewaysApi.md#datacentersnatgatewayspost) | **POST** /datacenters/{datacenterId}/natgateways | Create a NAT Gateway |
| [**datacentersNatgatewaysPut**](NatGatewaysApi.md#datacentersnatgatewaysput) | **PUT** /datacenters/{datacenterId}/natgateways/{natGatewayId} | Modify NAT Gateways |
| [**datacentersNatgatewaysRulesDelete**](NatGatewaysApi.md#datacentersnatgatewaysrulesdelete) | **DELETE** /datacenters/{datacenterId}/natgateways/{natGatewayId}/rules/{natGatewayRuleId} | Delete NAT Gateway rules |
| [**datacentersNatgatewaysRulesFindByNatGatewayRuleId**](NatGatewaysApi.md#datacentersnatgatewaysrulesfindbynatgatewayruleid) | **GET** /datacenters/{datacenterId}/natgateways/{natGatewayId}/rules/{natGatewayRuleId} | Retrieve NAT Gateway rules |
| [**datacentersNatgatewaysRulesGet**](NatGatewaysApi.md#datacentersnatgatewaysrulesget) | **GET** /datacenters/{datacenterId}/natgateways/{natGatewayId}/rules | List NAT Gateway rules |
| [**datacentersNatgatewaysRulesPatch**](NatGatewaysApi.md#datacentersnatgatewaysrulespatch) | **PATCH** /datacenters/{datacenterId}/natgateways/{natGatewayId}/rules/{natGatewayRuleId} | Partially Modify a NAT Gateway Rule by ID |
| [**datacentersNatgatewaysRulesPost**](NatGatewaysApi.md#datacentersnatgatewaysrulespost) | **POST** /datacenters/{datacenterId}/natgateways/{natGatewayId}/rules | Create a NAT Gateway Rule |
| [**datacentersNatgatewaysRulesPut**](NatGatewaysApi.md#datacentersnatgatewaysrulesput) | **PUT** /datacenters/{datacenterId}/natgateways/{natGatewayId}/rules/{natGatewayRuleId} | Modify a NAT Gateway Rule by ID |


<a name="datacentersNatgatewaysDelete"></a>
# **datacentersNatgatewaysDelete**
> datacentersNatgatewaysDelete(datacenterId, natGatewayId, pretty, depth, xContractNumber)

Delete NAT Gateways

Remove the specified NAT Gateway from the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersNatgatewaysDeleteWithHttpInfo(datacenterId, natGatewayId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysDelete");
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
        apiInstance.datacentersNatgatewaysDelete(datacenterId, natGatewayId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysFindByNatGatewayId"></a>
# **datacentersNatgatewaysFindByNatGatewayId**
> NatGateway datacentersNatgatewaysFindByNatGatewayId(datacenterId, natGatewayId, pretty, depth, xContractNumber)

Retrieve NAT Gateways

Retrieve the properties of the specified NAT Gateway within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NatGateway**](../models/NatGateway.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysFindByNatGatewayIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysFindByNatGatewayId instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<NatGateway> result = apiInstance.datacentersNatgatewaysFindByNatGatewayIdWithHttpInfo(datacenterId, natGatewayId, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFindByNatGatewayId");
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
        NatGateway result = apiInstance.datacentersNatgatewaysFindByNatGatewayId(datacenterId, natGatewayId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFindByNatGatewayId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysFlowlogsDelete"></a>
# **datacentersNatgatewaysFlowlogsDelete**
> datacentersNatgatewaysFlowlogsDelete(datacenterId, natGatewayId, flowLogId, pretty, depth)

Delete NAT Gateway Flow Logs

Delete the specified NAT Gateway Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **flowLogId** | **String**| The unique ID of the Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysFlowlogsDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysFlowlogsDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      apiInstance.datacentersNatgatewaysFlowlogsDeleteWithHttpInfo(datacenterId, natGatewayId, flowLogId, pretty, depth);
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsDelete");
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
        apiInstance.datacentersNatgatewaysFlowlogsDelete(datacenterId, natGatewayId, flowLogId)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysFlowlogsFindByFlowLogId"></a>
# **datacentersNatgatewaysFlowlogsFindByFlowLogId**
> FlowLog datacentersNatgatewaysFlowlogsFindByFlowLogId(datacenterId, natGatewayId, flowLogId, pretty, depth)

Retrieve NAT Gateway Flow Logs

Retrieve the specified NAT Gateway Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **flowLogId** | **String**| The unique ID of the Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysFlowlogsFindByFlowLogIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysFlowlogsFindByFlowLogId instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersNatgatewaysFlowlogsFindByFlowLogIdWithHttpInfo(datacenterId, natGatewayId, flowLogId, pretty, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsFindByFlowLogId");
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
        FlowLog result = apiInstance.datacentersNatgatewaysFlowlogsFindByFlowLogId(datacenterId, natGatewayId, flowLogId)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsFindByFlowLogId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysFlowlogsGet"></a>
# **datacentersNatgatewaysFlowlogsGet**
> FlowLogs datacentersNatgatewaysFlowlogsGet(datacenterId, natGatewayId, pretty, depth, offset, limit)

List NAT Gateway Flow Logs

List all the Flow Logs for the specified NAT Gateway.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **offset** | **Integer**| The first element (from the complete list of the elements) to include in the response (used together with &lt;b&gt;&lt;i&gt;limit&lt;/i&gt;&lt;/b&gt; for pagination). | [optional] [default to 0]|
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 1000]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**FlowLogs**](../models/FlowLogs.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysFlowlogsGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysFlowlogsGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (used together with <b><i>limit</i></b> for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      ApiResponse<FlowLogs> result = apiInstance.datacentersNatgatewaysFlowlogsGetWithHttpInfo(datacenterId, natGatewayId, pretty, depth, offset, limit, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsGet");
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
        FlowLogs result = apiInstance.datacentersNatgatewaysFlowlogsGet(datacenterId, natGatewayId)
                .pretty(true)
                .depth(0)
                .offset(0)
                .limit(1000)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysFlowlogsPatch"></a>
# **datacentersNatgatewaysFlowlogsPatch**
> FlowLog datacentersNatgatewaysFlowlogsPatch(datacenterId, natGatewayId, flowLogId, natGatewayFlowLogProperties, pretty, depth)

Partially modify NAT Gateway Flow Logs

Update the properties of the specified NAT Gateway Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **flowLogId** | **String**| The unique ID of the Flow Log. ||
| **natGatewayFlowLogProperties** |  [**FlowLogProperties**](../models/FlowLogProperties.md)| The properties of the Flow Log to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysFlowlogsPatchWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysFlowlogsPatch instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    action = new String(); // String | Specifies the traffic action pattern.
    bucket = new String(); // String | The S3 bucket name of an existing IONOS Cloud S3 bucket.
    direction = new String(); // String | Specifies the traffic direction pattern.
    name = new String(); // String | The resource name.
    natGatewayFlowLogProperties = new FlowLogProperties(String, String, String, String); // FlowLogProperties | The properties of the Flow Log to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersNatgatewaysFlowlogsPatchWithHttpInfo(datacenterId, natGatewayId, flowLogId, natGatewayFlowLogProperties, pretty, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsPatch");
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
        FlowLog result = apiInstance.datacentersNatgatewaysFlowlogsPatch(datacenterId, natGatewayId, flowLogId, natGatewayFlowLogProperties)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysFlowlogsPost"></a>
# **datacentersNatgatewaysFlowlogsPost**
> FlowLog datacentersNatgatewaysFlowlogsPost(datacenterId, natGatewayId, natGatewayFlowLog, pretty, depth)

Create a NAT Gateway Flow Log

Adds a new Flow Log to the specified NAT Gateway.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **natGatewayFlowLog** |  [**FlowLog**](../models/FlowLog.md)| The Flow Log to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysFlowlogsPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysFlowlogsPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    properties = new FlowLogProperties(); // FlowLogProperties | 
    natGatewayFlowLog = new FlowLog(FlowLogProperties); // FlowLog | The Flow Log to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersNatgatewaysFlowlogsPostWithHttpInfo(datacenterId, natGatewayId, natGatewayFlowLog, pretty, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsPost");
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
        FlowLog result = apiInstance.datacentersNatgatewaysFlowlogsPost(datacenterId, natGatewayId, natGatewayFlowLog)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysFlowlogsPut"></a>
# **datacentersNatgatewaysFlowlogsPut**
> FlowLog datacentersNatgatewaysFlowlogsPut(datacenterId, natGatewayId, flowLogId, natGatewayFlowLog, pretty, depth)

Modify NAT Gateway Flow Logs

Modify the specified NAT Gateway Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **flowLogId** | **String**| The unique ID of the Flow Log. ||
| **natGatewayFlowLog** |  [**FlowLogPut**](../models/FlowLogPut.md)| The modified NAT Gateway Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysFlowlogsPutWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysFlowlogsPut instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    String flowLogId = "flowLogId_example"; // String | The unique ID of the Flow Log.
    properties = new FlowLogProperties(); // FlowLogProperties | 
    natGatewayFlowLog = new FlowLogPut(FlowLogProperties); // FlowLogPut | The modified NAT Gateway Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersNatgatewaysFlowlogsPutWithHttpInfo(datacenterId, natGatewayId, flowLogId, natGatewayFlowLog, pretty, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsPut");
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
        FlowLog result = apiInstance.datacentersNatgatewaysFlowlogsPut(datacenterId, natGatewayId, flowLogId, natGatewayFlowLog)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysFlowlogsPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysGet"></a>
# **datacentersNatgatewaysGet**
> NatGateways datacentersNatgatewaysGet(datacenterId, pretty, depth, xContractNumber)

List NAT Gateways

List all NAT Gateways within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**NatGateways**](../models/NatGateways.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      ApiResponse<NatGateways> result = apiInstance.datacentersNatgatewaysGetWithHttpInfo(datacenterId, pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysGet");
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
        NatGateways result = apiInstance.datacentersNatgatewaysGet(datacenterId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysPatch"></a>
# **datacentersNatgatewaysPatch**
> NatGateway datacentersNatgatewaysPatch(datacenterId, natGatewayId, natGatewayProperties, pretty, depth, xContractNumber)

Partially modify NAT Gateways

Update the properties of the specified NAT Gateway within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **natGatewayProperties** |  [**NatGatewayProperties**](../models/NatGatewayProperties.md)| The properties of the NAT Gateway to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NatGateway**](../models/NatGateway.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysPatchWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysPatch instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    name = new String(); // String | Name of the NAT Gateway.
    publicIps = new List<String>(); // List<String> | Collection of public IP addresses of the NAT Gateway. Should be customer reserved IP addresses in that location.
    natGatewayProperties = new NatGatewayProperties(String, List&lt;String&gt;); // NatGatewayProperties | The properties of the NAT Gateway to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<NatGateway> result = apiInstance.datacentersNatgatewaysPatchWithHttpInfo(datacenterId, natGatewayId, natGatewayProperties, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysPatch");
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
        NatGateway result = apiInstance.datacentersNatgatewaysPatch(datacenterId, natGatewayId, natGatewayProperties)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysPost"></a>
# **datacentersNatgatewaysPost**
> NatGateway datacentersNatgatewaysPost(datacenterId, natGateway, pretty, depth, xContractNumber)

Create a NAT Gateway

Creates a NAT Gateway within the data center.  This operation is restricted to contract owner, admin, and users with &#39;createInternetAccess&#39; privileges.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGateway** |  [**NatGateway**](../models/NatGateway.md)| The NAT Gateway to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NatGateway**](../models/NatGateway.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    properties = new NatGatewayProperties(); // NatGatewayProperties | 
    natGateway = new NatGateway(NatGatewayProperties); // NatGateway | The NAT Gateway to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<NatGateway> result = apiInstance.datacentersNatgatewaysPostWithHttpInfo(datacenterId, natGateway, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysPost");
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
        NatGateway result = apiInstance.datacentersNatgatewaysPost(datacenterId, natGateway)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysPut"></a>
# **datacentersNatgatewaysPut**
> NatGateway datacentersNatgatewaysPut(datacenterId, natGatewayId, natGateway, pretty, depth, xContractNumber)

Modify NAT Gateways

Modify the properties of the specified NAT Gateway within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **natGateway** |  [**NatGatewayPut**](../models/NatGatewayPut.md)| The modified NAT Gateway. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NatGateway**](../models/NatGateway.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysPutWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysPut instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    properties = new NatGatewayProperties(); // NatGatewayProperties | 
    natGateway = new NatGatewayPut(NatGatewayProperties); // NatGatewayPut | The modified NAT Gateway.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<NatGateway> result = apiInstance.datacentersNatgatewaysPutWithHttpInfo(datacenterId, natGatewayId, natGateway, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysPut");
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
        NatGateway result = apiInstance.datacentersNatgatewaysPut(datacenterId, natGatewayId, natGateway)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysRulesDelete"></a>
# **datacentersNatgatewaysRulesDelete**
> datacentersNatgatewaysRulesDelete(datacenterId, natGatewayId, natGatewayRuleId, pretty, depth, xContractNumber)

Delete NAT Gateway rules

Delete the specified NAT Gateway rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **natGatewayRuleId** | **String**| The unique ID of the NAT Gateway rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysRulesDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysRulesDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    String natGatewayRuleId = "natGatewayRuleId_example"; // String | The unique ID of the NAT Gateway rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersNatgatewaysRulesDeleteWithHttpInfo(datacenterId, natGatewayId, natGatewayRuleId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesDelete");
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
        apiInstance.datacentersNatgatewaysRulesDelete(datacenterId, natGatewayId, natGatewayRuleId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysRulesFindByNatGatewayRuleId"></a>
# **datacentersNatgatewaysRulesFindByNatGatewayRuleId**
> NatGatewayRule datacentersNatgatewaysRulesFindByNatGatewayRuleId(datacenterId, natGatewayId, natGatewayRuleId, pretty, depth, xContractNumber)

Retrieve NAT Gateway rules

Retrieve the properties of the specified NAT Gateway rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **natGatewayRuleId** | **String**| The unique ID of the NAT Gateway rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NatGatewayRule**](../models/NatGatewayRule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysRulesFindByNatGatewayRuleIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysRulesFindByNatGatewayRuleId instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    String natGatewayRuleId = "natGatewayRuleId_example"; // String | The unique ID of the NAT Gateway rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<NatGatewayRule> result = apiInstance.datacentersNatgatewaysRulesFindByNatGatewayRuleIdWithHttpInfo(datacenterId, natGatewayId, natGatewayRuleId, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesFindByNatGatewayRuleId");
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
        NatGatewayRule result = apiInstance.datacentersNatgatewaysRulesFindByNatGatewayRuleId(datacenterId, natGatewayId, natGatewayRuleId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesFindByNatGatewayRuleId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysRulesGet"></a>
# **datacentersNatgatewaysRulesGet**
> NatGatewayRules datacentersNatgatewaysRulesGet(datacenterId, natGatewayId, pretty, depth, xContractNumber)

List NAT Gateway rules

List all rules for the specified NAT Gateway.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**NatGatewayRules**](../models/NatGatewayRules.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysRulesGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysRulesGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      ApiResponse<NatGatewayRules> result = apiInstance.datacentersNatgatewaysRulesGetWithHttpInfo(datacenterId, natGatewayId, pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesGet");
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
        NatGatewayRules result = apiInstance.datacentersNatgatewaysRulesGet(datacenterId, natGatewayId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysRulesPatch"></a>
# **datacentersNatgatewaysRulesPatch**
> NatGatewayRule datacentersNatgatewaysRulesPatch(datacenterId, natGatewayId, natGatewayRuleId, natGatewayRuleProperties, pretty, depth, xContractNumber)

Partially Modify a NAT Gateway Rule by ID

Updates the properties of the specified NAT Gateway rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **natGatewayRuleId** | **String**| The unique ID of the NAT Gateway rule. ||
| **natGatewayRuleProperties** |  [**NatGatewayRuleProperties**](../models/NatGatewayRuleProperties.md)| The properties of the NAT Gateway rule to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NatGatewayRule**](../models/NatGatewayRule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysRulesPatchWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysRulesPatch instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    String natGatewayRuleId = "natGatewayRuleId_example"; // String | The unique ID of the NAT Gateway rule.
    name = new String(); // String | The name of the NAT Gateway rule.
    publicIp = new String(); // String | Public IP address of the NAT Gateway rule. Specifies the address used for masking outgoing packets source address field. Should be one of the customer reserved IP address already configured on the NAT Gateway resource
    sourceSubnet = new String(); // String | Source subnet of the NAT Gateway rule. For SNAT rules it specifies which packets this translation rule applies to based on the packets source IP address.
    natGatewayRuleProperties = new NatGatewayRuleProperties(String, String, String); // NatGatewayRuleProperties | The properties of the NAT Gateway rule to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<NatGatewayRule> result = apiInstance.datacentersNatgatewaysRulesPatchWithHttpInfo(datacenterId, natGatewayId, natGatewayRuleId, natGatewayRuleProperties, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesPatch");
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
        NatGatewayRule result = apiInstance.datacentersNatgatewaysRulesPatch(datacenterId, natGatewayId, natGatewayRuleId, natGatewayRuleProperties)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysRulesPost"></a>
# **datacentersNatgatewaysRulesPost**
> NatGatewayRule datacentersNatgatewaysRulesPost(datacenterId, natGatewayId, natGatewayRule, pretty, depth, xContractNumber)

Create a NAT Gateway Rule

Creates a rule for the specified NAT Gateway.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **natGatewayRule** |  [**NatGatewayRule**](../models/NatGatewayRule.md)| The NAT Gateway rule to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NatGatewayRule**](../models/NatGatewayRule.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysRulesPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysRulesPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    properties = new NatGatewayRuleProperties(); // NatGatewayRuleProperties | 
    natGatewayRule = new NatGatewayRule(NatGatewayRuleProperties); // NatGatewayRule | The NAT Gateway rule to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<NatGatewayRule> result = apiInstance.datacentersNatgatewaysRulesPostWithHttpInfo(datacenterId, natGatewayId, natGatewayRule, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesPost");
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
        NatGatewayRule result = apiInstance.datacentersNatgatewaysRulesPost(datacenterId, natGatewayId, natGatewayRule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersNatgatewaysRulesPut"></a>
# **datacentersNatgatewaysRulesPut**
> NatGatewayRule datacentersNatgatewaysRulesPut(datacenterId, natGatewayId, natGatewayRuleId, natGatewayRule, pretty, depth, xContractNumber)

Modify a NAT Gateway Rule by ID

Modify the specified NAT Gateway rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **natGatewayId** | **String**| The unique ID of the NAT Gateway. ||
| **natGatewayRuleId** | **String**| The unique ID of the NAT Gateway rule. ||
| **natGatewayRule** |  [**NatGatewayRulePut**](../models/NatGatewayRulePut.md)| The modified NAT Gateway rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**NatGatewayRule**](../models/NatGatewayRule.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersNatgatewaysRulesPutWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersNatgatewaysRulesPut instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.NatGatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    NatGatewaysApi apiInstance = new NatGatewaysApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String natGatewayId = "natGatewayId_example"; // String | The unique ID of the NAT Gateway.
    String natGatewayRuleId = "natGatewayRuleId_example"; // String | The unique ID of the NAT Gateway rule.
    properties = new NatGatewayRuleProperties(); // NatGatewayRuleProperties | 
    natGatewayRule = new NatGatewayRulePut(NatGatewayRuleProperties); // NatGatewayRulePut | The modified NAT Gateway rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      ApiResponse<NatGatewayRule> result = apiInstance.datacentersNatgatewaysRulesPutWithHttpInfo(datacenterId, natGatewayId, natGatewayRuleId, natGatewayRule, pretty, depth, xContractNumber);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesPut");
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
        NatGatewayRule result = apiInstance.datacentersNatgatewaysRulesPut(datacenterId, natGatewayId, natGatewayRuleId, natGatewayRule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling NatGatewaysApi#datacentersNatgatewaysRulesPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

