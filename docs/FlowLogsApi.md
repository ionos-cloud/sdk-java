# FlowLogsApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersServersNicsFlowlogsDelete**](FlowLogsApi.md#datacentersserversnicsflowlogsdelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs/{flowlogId} | Delete a Flow Log |
| [**datacentersServersNicsFlowlogsFindById**](FlowLogsApi.md#datacentersserversnicsflowlogsfindbyid) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs/{flowlogId} | Retrieve a Flow Log |
| [**datacentersServersNicsFlowlogsGet**](FlowLogsApi.md#datacentersserversnicsflowlogsget) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs | List Flow Logs |
| [**datacentersServersNicsFlowlogsPatch**](FlowLogsApi.md#datacentersserversnicsflowlogspatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs/{flowlogId} | Partially update a Flow Log |
| [**datacentersServersNicsFlowlogsPost**](FlowLogsApi.md#datacentersserversnicsflowlogspost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs | Create a Flow Log |
| [**datacentersServersNicsFlowlogsPut**](FlowLogsApi.md#datacentersserversnicsflowlogsput) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/flowlogs/{flowlogId} | Modify a Flow Log |


<a name="datacentersServersNicsFlowlogsDelete"></a>
# **datacentersServersNicsFlowlogsDelete**
> Object datacentersServersNicsFlowlogsDelete(datacenterId, serverId, nicId, flowlogId, pretty, depth)

Delete a Flow Log

Removes the specified Flow Log.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    String flowlogId = "flowlogId_example"; // String | The unique ID of the Flow Log
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    try {
      Object result = apiInstance.datacentersServersNicsFlowlogsDelete(datacenterId, serverId, nicId, flowlogId, pretty, depth);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **flowlogId** | **String**| The unique ID of the Flow Log |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsFlowlogsFindById"></a>
# **datacentersServersNicsFlowlogsFindById**
> FlowLog datacentersServersNicsFlowlogsFindById(datacenterId, serverId, nicId, flowlogId, pretty, depth)

Retrieve a Flow Log

Retrieves the attributes of a given Flow Log.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    String flowlogId = "flowlogId_example"; // String | The unique ID of the Flow Log
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    try {
      FlowLog result = apiInstance.datacentersServersNicsFlowlogsFindById(datacenterId, serverId, nicId, flowlogId, pretty, depth);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **flowlogId** | **String**| The unique ID of the Flow Log |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]

### Return type

[**FlowLog**](FlowLog.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsFlowlogsGet"></a>
# **datacentersServersNicsFlowlogsGet**
> FlowLogs datacentersServersNicsFlowlogsGet(datacenterId, serverId, nicId, pretty, depth, offset, limit)

List Flow Logs

Retrieves a list of Flow Logs associated with a particular network interface.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with limit for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with offset for pagination)
    try {
      FlowLogs result = apiInstance.datacentersServersNicsFlowlogsGet(datacenterId, serverId, nicId, pretty, depth, offset, limit);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the Server |
| **nicId** | **String**| The unique ID of the NIC |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with limit for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with offset for pagination) | [optional] [default to 1000]

### Return type

[**FlowLogs**](FlowLogs.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersServersNicsFlowlogsPatch"></a>
# **datacentersServersNicsFlowlogsPatch**
> FlowLog datacentersServersNicsFlowlogsPatch(datacenterId, serverId, nicId, flowlogId, flowlog, pretty, depth)

Partially update a Flow Log

This will partially update a Flow Log record.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    String flowlogId = "flowlogId_example"; // String | The unique ID of the Flow Log
    FlowLogProperties flowlog = new FlowLogProperties(); // FlowLogProperties | Modified Flow Log
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    try {
      FlowLog result = apiInstance.datacentersServersNicsFlowlogsPatch(datacenterId, serverId, nicId, flowlogId, flowlog, pretty, depth);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the server |
| **nicId** | **String**| The unique ID of the NIC |
| **flowlogId** | **String**| The unique ID of the Flow Log |
| **flowlog** |  [**FlowLogProperties**](FlowLogProperties.md)| Modified Flow Log |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]

### Return type

[**FlowLog**](FlowLog.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsFlowlogsPost"></a>
# **datacentersServersNicsFlowlogsPost**
> FlowLog datacentersServersNicsFlowlogsPost(datacenterId, serverId, nicId, flowlog, pretty, depth)

Create a Flow Log

This will add a Flow Log to the network interface.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    FlowLog flowlog = new FlowLog(); // FlowLog | Flow Log to be created
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    try {
      FlowLog result = apiInstance.datacentersServersNicsFlowlogsPost(datacenterId, serverId, nicId, flowlog, pretty, depth);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the server |
| **nicId** | **String**| The unique ID of the NIC |
| **flowlog** |  [**FlowLog**](FlowLog.md)| Flow Log to be created |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]

### Return type

[**FlowLog**](FlowLog.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersServersNicsFlowlogsPut"></a>
# **datacentersServersNicsFlowlogsPut**
> FlowLog datacentersServersNicsFlowlogsPut(datacenterId, serverId, nicId, flowlogId, flowlog, pretty, depth)

Modify a Flow Log

This will update a Flow Log record.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
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


    FlowLogsApi apiInstance = new FlowLogsApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the datacenter
    String serverId = "serverId_example"; // String | The unique ID of the server
    String nicId = "nicId_example"; // String | The unique ID of the NIC
    String flowlogId = "flowlogId_example"; // String | The unique ID of the Flow Log
    FlowLogPut flowlog = new FlowLogPut(); // FlowLogPut | Modified Flow Log
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    try {
      FlowLog result = apiInstance.datacentersServersNicsFlowlogsPut(datacenterId, serverId, nicId, flowlogId, flowlog, pretty, depth);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the datacenter |
| **serverId** | **String**| The unique ID of the server |
| **nicId** | **String**| The unique ID of the NIC |
| **flowlogId** | **String**| The unique ID of the Flow Log |
| **flowlog** |  [**FlowLogPut**](FlowLogPut.md)| Modified Flow Log |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]

### Return type

[**FlowLog**](FlowLog.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

