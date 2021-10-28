# RequestApi

All URIs are relative to *https://api.ionos.com/cloudapi/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**requestsFindById**](RequestApi.md#requestsfindbyid) | **GET** /requests/{requestId} | Retrieve a Request |
| [**requestsGet**](RequestApi.md#requestsget) | **GET** /requests | List Requests |
| [**requestsStatusGet**](RequestApi.md#requestsstatusget) | **GET** /requests/{requestId}/status | Retrieve Request Status |


<a name="requestsFindById"></a>
# **requestsFindById**
> Request requestsFindById(requestId, pretty, depth, xContractNumber)

Retrieve a Request

Retrieves the attributes of a given request.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.RequestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RequestApi apiInstance = new RequestApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Request result = apiInstance.requestsFindById(requestId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestApi#requestsFindById");
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
| **requestId** | **String**|  |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Request**](Request.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestsGet"></a>
# **requestsGet**
> Requests requestsGet(pretty, depth, xContractNumber, filterStatus, filterCreatedAfter, filterCreatedBefore, filterCreatedDate, filterCreatedBy, filterEtag, filterRequestStatus, filterMethod, filterHeaders, filterBody, filterUrl, offset, limit)

List Requests

Retrieve a list of API requests.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.RequestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RequestApi apiInstance = new RequestApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    String filterStatus = "filterStatus_example"; // String | Request filter to fetch all requests based on a particular status [QUEUED, RUNNING, DONE, FAILED]. It doesn't depend on depth query parameter
    String filterCreatedAfter = "filterCreatedAfter_example"; // String | Request filter to fetch all requests created after the specified date. It doesn't depend on depth query parameter. Date format e.g. 2021-01-01+00:00:00
    String filterCreatedBefore = "filterCreatedBefore_example"; // String | Request filter to fetch all requests created before the specified date. It doesn't depend on depth query parameter. Date format e.g. 2021-01-01+00:00:00
    String filterCreatedDate = "filterCreatedDate_example"; // String | Response filter to select and display only the requests that contains the specified createdDate. The value is case insensitive and it  depends on depth query parameter that should have a value greater than 0. Date format e.g. 2020-11-16T17:42:59Z
    String filterCreatedBy = "filterCreatedBy_example"; // String | Response filter to select and display only the requests that contains the specified createdBy. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0. 
    String filterEtag = "filterEtag_example"; // String | Response filter to select and display only the requests that contains the specified etag. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0. 
    String filterRequestStatus = "filterRequestStatus_example"; // String | Response filter to select and display only the requests that contains the specified requestStatus. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0. 
    String filterMethod = "filterMethod_example"; // String | Response filter to select and display only the requests that contains the specified method. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0. 
    String filterHeaders = "filterHeaders_example"; // String | Response filter to select and display only the requests that contains the specified headers. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0. 
    String filterBody = "filterBody_example"; // String | Response filter to select and display only the requests that contains the specified body. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0. 
    String filterUrl = "filterUrl_example"; // String | Response filter to select and display only the requests that contains the specified url. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0. 
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      Requests result = apiInstance.requestsGet(pretty, depth, xContractNumber, filterStatus, filterCreatedAfter, filterCreatedBefore, filterCreatedDate, filterCreatedBy, filterEtag, filterRequestStatus, filterMethod, filterHeaders, filterBody, filterUrl, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestApi#requestsGet");
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
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]
| **filterStatus** | **String**| Request filter to fetch all requests based on a particular status [QUEUED, RUNNING, DONE, FAILED]. It doesn&#39;t depend on depth query parameter | [optional]
| **filterCreatedAfter** | **String**| Request filter to fetch all requests created after the specified date. It doesn&#39;t depend on depth query parameter. Date format e.g. 2021-01-01+00:00:00 | [optional]
| **filterCreatedBefore** | **String**| Request filter to fetch all requests created before the specified date. It doesn&#39;t depend on depth query parameter. Date format e.g. 2021-01-01+00:00:00 | [optional]
| **filterCreatedDate** | **String**| Response filter to select and display only the requests that contains the specified createdDate. The value is case insensitive and it  depends on depth query parameter that should have a value greater than 0. Date format e.g. 2020-11-16T17:42:59Z | [optional]
| **filterCreatedBy** | **String**| Response filter to select and display only the requests that contains the specified createdBy. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0.  | [optional]
| **filterEtag** | **String**| Response filter to select and display only the requests that contains the specified etag. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0.  | [optional]
| **filterRequestStatus** | **String**| Response filter to select and display only the requests that contains the specified requestStatus. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0.  | [optional]
| **filterMethod** | **String**| Response filter to select and display only the requests that contains the specified method. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0.  | [optional]
| **filterHeaders** | **String**| Response filter to select and display only the requests that contains the specified headers. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0.  | [optional]
| **filterBody** | **String**| Response filter to select and display only the requests that contains the specified body. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0.  | [optional]
| **filterUrl** | **String**| Response filter to select and display only the requests that contains the specified url. The value is case insensitive and it depends on depth query parameter that should have a value greater than 0.  | [optional]
| **offset** | **Integer**| the first element (of the total list of elements) to include in the response (use together with &lt;code&gt;limit&lt;/code&gt; for pagination) | [optional] [default to 0]
| **limit** | **Integer**| the maximum number of elements to return (use together with &lt;code&gt;offset&lt;/code&gt; for pagination) | [optional] [default to 1000]

### Return type

[**Requests**](Requests.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestsStatusGet"></a>
# **requestsStatusGet**
> RequestStatus requestsStatusGet(requestId, pretty, depth, xContractNumber)

Retrieve Request Status

Retrieves the status of a given request.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.RequestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RequestApi apiInstance = new RequestApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      RequestStatus result = apiInstance.requestsStatusGet(requestId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestApi#requestsStatusGet");
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
| **requestId** | **String**|  |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**RequestStatus**](RequestStatus.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

