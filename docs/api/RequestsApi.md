# RequestsApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**requestsFindById**](RequestsApi.md#requestsfindbyid) | **GET** /requests/{requestId} | Retrieve requests |
| [**requestsGet**](RequestsApi.md#requestsget) | **GET** /requests | List requests |
| [**requestsStatusGet**](RequestsApi.md#requestsstatusget) | **GET** /requests/{requestId}/status | Retrieve request status |


<a name="requestsFindById"></a>
# **requestsFindById**
> Request requestsFindById(requestId, pretty, depth, xContractNumber)

Retrieve requests

Retrieve the properties of the specified request.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.RequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RequestsApi apiInstance = new RequestsApi(defaultClient);
    String requestId = "requestId_example"; // String | The unique ID of the request.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Request result = apiInstance.requestsFindById(requestId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestsApi#requestsFindById");
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
| **requestId** | **String**| The unique ID of the request. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Request**](Request.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestsGet"></a>
# **requestsGet**
> Requests requestsGet(pretty, depth, xContractNumber, filterStatus, filterCreatedAfter, filterCreatedBefore, filterCreatedDate, filterCreatedBy, filterEtag, filterRequestStatus, filterMethod, filterHeaders, filterBody, filterUrl, offset, limit)

List requests

List all API requests.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.RequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RequestsApi apiInstance = new RequestsApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    String filterStatus = "filterStatus_example"; // String | Filter the list by request status [QUEUED, RUNNING, DONE, FAILED]. Filter is not affected by the depth query parameter.
    String filterCreatedAfter = "filterCreatedAfter_example"; // String | Filter the list to only include the requests created after the date, specified in the yyyy-MM-dd HH:mm:ss format. Filter is not affected by the depth query parameter.
    String filterCreatedBefore = "filterCreatedBefore_example"; // String | Filter the list to only include the requests created before the date, specified in the yyyy-MM-dd HH:mm:ss format. Filter is not affected by the depth query parameter.
    String filterCreatedDate = "filterCreatedDate_example"; // String | Filter the list to only include the requests that contain the createdDate, specified in the yyyy-MM-dd HH:mm:ss format. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero.
    String filterCreatedBy = "filterCreatedBy_example"; // String | Filter the list to only include the requests that contain the createdBy, specified in the yyyy-MM-dd HH:mm:ss format. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero. 
    String filterEtag = "filterEtag_example"; // String | Filter the list to only include the requests that contain the specified etag. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero. 
    String filterRequestStatus = "filterRequestStatus_example"; // String | Filter the list to only include the requests that contain the specified requestStatus. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero. 
    String filterMethod = "filterMethod_example"; // String | Filter the list to only include the requests that contain the specified method. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero. 
    String filterHeaders = "filterHeaders_example"; // String | Filter the list to only include the requests that contain the specified headers. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero. 
    String filterBody = "filterBody_example"; // String | Filter the list to only include the requests that contain the specified body. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero. 
    String filterUrl = "filterUrl_example"; // String | Filter the list to only include the requests that contain the specified URL. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero. 
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (use together with limit for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
    try {
      Requests result = apiInstance.requestsGet(pretty, depth, xContractNumber, filterStatus, filterCreatedAfter, filterCreatedBefore, filterCreatedDate, filterCreatedBy, filterEtag, filterRequestStatus, filterMethod, filterHeaders, filterBody, filterUrl, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestsApi#requestsGet");
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
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]
| **filterStatus** | **String**| Filter the list by request status [QUEUED, RUNNING, DONE, FAILED]. Filter is not affected by the depth query parameter. | [optional]
| **filterCreatedAfter** | **String**| Filter the list to only include the requests created after the date, specified in the yyyy-MM-dd HH:mm:ss format. Filter is not affected by the depth query parameter. | [optional]
| **filterCreatedBefore** | **String**| Filter the list to only include the requests created before the date, specified in the yyyy-MM-dd HH:mm:ss format. Filter is not affected by the depth query parameter. | [optional]
| **filterCreatedDate** | **String**| Filter the list to only include the requests that contain the createdDate, specified in the yyyy-MM-dd HH:mm:ss format. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero. | [optional]
| **filterCreatedBy** | **String**| Filter the list to only include the requests that contain the createdBy, specified in the yyyy-MM-dd HH:mm:ss format. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero.  | [optional]
| **filterEtag** | **String**| Filter the list to only include the requests that contain the specified etag. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero.  | [optional]
| **filterRequestStatus** | **String**| Filter the list to only include the requests that contain the specified requestStatus. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero.  | [optional]
| **filterMethod** | **String**| Filter the list to only include the requests that contain the specified method. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero.  | [optional]
| **filterHeaders** | **String**| Filter the list to only include the requests that contain the specified headers. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero.  | [optional]
| **filterBody** | **String**| Filter the list to only include the requests that contain the specified body. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero.  | [optional]
| **filterUrl** | **String**| Filter the list to only include the requests that contain the specified URL. The value is not case-sensitive, and the filter requires that the depth query parameter value is greater than zero.  | [optional]
| **offset** | **Integer**| The first element (from the complete list of the elements) to include in the response (use together with limit for pagination). | [optional] [default to 0]
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 1000]

### Return type

[**Requests**](Requests.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestsStatusGet"></a>
# **requestsStatusGet**
> RequestStatus requestsStatusGet(requestId, pretty, depth, xContractNumber)

Retrieve request status

Retrieve the status of the specified request.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.RequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RequestsApi apiInstance = new RequestsApi(defaultClient);
    String requestId = "requestId_example"; // String | The unique ID of the request.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      RequestStatus result = apiInstance.requestsStatusGet(requestId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestsApi#requestsStatusGet");
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
| **requestId** | **String**| The unique ID of the request. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**RequestStatus**](RequestStatus.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

