# FlowLogsApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersServersNicsFlowlogsDelete**](FlowLogsApi.md#datacentersserversnicsflowlogsdelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs/{flowlogId} | Delete Flow Logs |
| [**datacentersServersNicsFlowlogsFindById**](FlowLogsApi.md#datacentersserversnicsflowlogsfindbyid) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs/{flowlogId} | Retrieve Flow Logs |
| [**datacentersServersNicsFlowlogsGet**](FlowLogsApi.md#datacentersserversnicsflowlogsget) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs | List Flow Logs |
| [**datacentersServersNicsFlowlogsPatch**](FlowLogsApi.md#datacentersserversnicsflowlogspatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs/{flowlogId} | Partially modify Flow Logs |
| [**datacentersServersNicsFlowlogsPost**](FlowLogsApi.md#datacentersserversnicsflowlogspost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs | Create a Flow Log |
| [**datacentersServersNicsFlowlogsPut**](FlowLogsApi.md#datacentersserversnicsflowlogsput) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs/{flowlogId} | Modify Flow Logs |


<a name="datacentersServersNicsFlowlogsDelete"></a>
# **datacentersServersNicsFlowlogsDelete**
> datacentersServersNicsFlowlogsDelete(datacenterId, serverId, nicId, flowlogId, pretty, depth)

Delete Flow Logs

Delete the specified Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **flowlogId** | **String**| The unique ID of the Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersServersNicsFlowlogsDeleteWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersServersNicsFlowlogsDelete instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.FlowLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    String flowlogId = "flowlogId_example"; // String | The unique ID of the Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      apiInstance.datacentersServersNicsFlowlogsDeleteWithHttpInfo(datacenterId, serverId, nicId, flowlogId, pretty, depth);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsDelete");
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
        apiInstance.datacentersServersNicsFlowlogsDelete(datacenterId, serverId, nicId, flowlogId)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFlowlogsFindById"></a>
# **datacentersServersNicsFlowlogsFindById**
> FlowLog datacentersServersNicsFlowlogsFindById(datacenterId, serverId, nicId, flowlogId, pretty, depth)

Retrieve Flow Logs

Retrieve the properties of the specified Flow Log.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **flowlogId** | **String**| The unique ID of the Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersServersNicsFlowlogsFindByIdWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersServersNicsFlowlogsFindById instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.FlowLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    String flowlogId = "flowlogId_example"; // String | The unique ID of the Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersServersNicsFlowlogsFindByIdWithHttpInfo(datacenterId, serverId, nicId, flowlogId, pretty, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsFindById");
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
        FlowLog result = apiInstance.datacentersServersNicsFlowlogsFindById(datacenterId, serverId, nicId, flowlogId)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsFindById");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFlowlogsGet"></a>
# **datacentersServersNicsFlowlogsGet**
> FlowLogs datacentersServersNicsFlowlogsGet(datacenterId, serverId, nicId, pretty, depth, offset, limit)

List Flow Logs

List all the Flow Logs for the specified NIC.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
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

⚠️ **Note**: the example bellow uses the datacentersServersNicsFlowlogsGetWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersServersNicsFlowlogsGet instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.FlowLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (used together with <b><i>limit</i></b> for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      ApiResponse<FlowLogs> result = apiInstance.datacentersServersNicsFlowlogsGetWithHttpInfo(datacenterId, serverId, nicId, pretty, depth, offset, limit, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsGet");
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
        FlowLogs result = apiInstance.datacentersServersNicsFlowlogsGet(datacenterId, serverId, nicId)
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
        System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFlowlogsPatch"></a>
# **datacentersServersNicsFlowlogsPatch**
> FlowLog datacentersServersNicsFlowlogsPatch(datacenterId, serverId, nicId, flowlogId, flowlog, pretty, depth)

Partially modify Flow Logs

Update the specified Flow Log record.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **flowlogId** | **String**| The unique ID of the Flow Log. ||
| **flowlog** |  [**FlowLogProperties**](../models/FlowLogProperties.md)| The Flow Log record to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersServersNicsFlowlogsPatchWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersServersNicsFlowlogsPatch instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.FlowLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    String flowlogId = "flowlogId_example"; // String | The unique ID of the Flow Log.
    action = new String(); // String | Specifies the traffic action pattern.
    bucket = new String(); // String | The S3 bucket name of an existing IONOS Cloud S3 bucket.
    direction = new String(); // String | Specifies the traffic direction pattern.
    name = new String(); // String | The resource name.
    flowlog = new FlowLogProperties(String, String, String, String); // FlowLogProperties | The Flow Log record to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersServersNicsFlowlogsPatchWithHttpInfo(datacenterId, serverId, nicId, flowlogId, flowlog, pretty, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsPatch");
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
        FlowLog result = apiInstance.datacentersServersNicsFlowlogsPatch(datacenterId, serverId, nicId, flowlogId, flowlog)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFlowlogsPost"></a>
# **datacentersServersNicsFlowlogsPost**
> FlowLog datacentersServersNicsFlowlogsPost(datacenterId, serverId, nicId, flowlog, pretty, depth)

Create a Flow Log

Adds a new Flow Log for the specified NIC.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **flowlog** |  [**FlowLog**](../models/FlowLog.md)| The Flow Log to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersServersNicsFlowlogsPostWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersServersNicsFlowlogsPost instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.FlowLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    properties = new FlowLogProperties(); // FlowLogProperties | 
    flowlog = new FlowLog(FlowLogProperties); // FlowLog | The Flow Log to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersServersNicsFlowlogsPostWithHttpInfo(datacenterId, serverId, nicId, flowlog, pretty, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsPost");
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
        FlowLog result = apiInstance.datacentersServersNicsFlowlogsPost(datacenterId, serverId, nicId, flowlog)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFlowlogsPut"></a>
# **datacentersServersNicsFlowlogsPut**
> FlowLog datacentersServersNicsFlowlogsPut(datacenterId, serverId, nicId, flowlogId, flowlog, pretty, depth)

Modify Flow Logs

Modify the specified Flow Log record.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **flowlogId** | **String**| The unique ID of the Flow Log. ||
| **flowlog** |  [**FlowLogPut**](../models/FlowLogPut.md)| The modified Flow Log. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|

### Return type

[**FlowLog**](../models/FlowLog.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

⚠️ **Note**: the example bellow uses the datacentersServersNicsFlowlogsPutWithHttpInfo which also returns the status code and the headers, if you don't
need them you may use datacentersServersNicsFlowlogsPut instead
### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.ApiResponse;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.FlowLogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: Token Authentication
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");

    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    String flowlogId = "flowlogId_example"; // String | The unique ID of the Flow Log.
    properties = new FlowLogProperties(); // FlowLogProperties | 
    flowlog = new FlowLogPut(FlowLogProperties); // FlowLogPut | The modified Flow Log.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    try {
      ApiResponse<FlowLog> result = apiInstance.datacentersServersNicsFlowlogsPutWithHttpInfo(datacenterId, serverId, nicId, flowlogId, flowlog, pretty, depth);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsPut");
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
        FlowLog result = apiInstance.datacentersServersNicsFlowlogsPut(datacenterId, serverId, nicId, flowlogId, flowlog)
                .pretty(true)
                .depth(0)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FlowLogsApi#datacentersServersNicsFlowlogsPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

