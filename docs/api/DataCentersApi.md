# DataCentersApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersDelete**](DataCentersApi.md#datacentersdelete) | **DELETE** /datacenters/{datacenterId} | Delete data centers |
| [**datacentersFindById**](DataCentersApi.md#datacentersfindbyid) | **GET** /datacenters/{datacenterId} | Retrieve data centers |
| [**datacentersGet**](DataCentersApi.md#datacentersget) | **GET** /datacenters | List your data centers |
| [**datacentersPatch**](DataCentersApi.md#datacenterspatch) | **PATCH** /datacenters/{datacenterId} | Partially modify data centers |
| [**datacentersPost**](DataCentersApi.md#datacenterspost) | **POST** /datacenters | Create data centers |
| [**datacentersPut**](DataCentersApi.md#datacentersput) | **PUT** /datacenters/{datacenterId} | Modify data centers |


<a name="datacentersDelete"></a>
# **datacentersDelete**
> datacentersDelete(datacenterId, pretty, depth, xContractNumber)

Delete data centers

Delete the specified data center and all the elements it contains. This is method is destructive and should be used carefully.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.DataCentersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DataCentersApi apiInstance = new DataCentersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      apiInstance.datacentersDelete(datacenterId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataCentersApi#datacentersDelete");
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
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersFindById"></a>
# **datacentersFindById**
> Datacenter datacentersFindById(datacenterId, pretty, depth, xContractNumber)

Retrieve data centers

Retrieve data centers by resource ID. This value is in the response body when the data center is created, and in the list of the data centers, returned by GET.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.DataCentersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DataCentersApi apiInstance = new DataCentersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Datacenter result = apiInstance.datacentersFindById(datacenterId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataCentersApi#datacentersFindById");
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
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Datacenter**](Datacenter.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersGet"></a>
# **datacentersGet**
> Datacenters datacentersGet(pretty, depth, xContractNumber, offset, limit)

List your data centers

List the data centers for your account. Default limit is the first 100 items; use pagination query parameters for listing more items.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.DataCentersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DataCentersApi apiInstance = new DataCentersApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (use together with limit for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
    try {
      Datacenters result = apiInstance.datacentersGet(pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataCentersApi#datacentersGet");
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
| **offset** | **Integer**| The first element (from the complete list of the elements) to include in the response (use together with limit for pagination). | [optional] [default to 0]
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 1000]

### Return type

[**Datacenters**](Datacenters.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datacentersPatch"></a>
# **datacentersPatch**
> Datacenter datacentersPatch(datacenterId, datacenter, pretty, depth, xContractNumber)

Partially modify data centers

Update the properties of the specified data center, rename it, or change the description.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.DataCentersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DataCentersApi apiInstance = new DataCentersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    DatacenterProperties datacenter = new DatacenterProperties(); // DatacenterProperties | The properties of the data center to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Datacenter result = apiInstance.datacentersPatch(datacenterId, datacenter, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataCentersApi#datacentersPatch");
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
| **datacenter** |  [**DatacenterProperties**](DatacenterProperties.md)| The properties of the data center to be updated. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Datacenter**](Datacenter.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersPost"></a>
# **datacentersPost**
> Datacenter datacentersPost(datacenter, pretty, depth, xContractNumber)

Create data centers

Create new data centers, and data centers that already contain elements, such as servers and storage volumes.  Virtual data centers are the foundation of the platform; they act as logical containers for all other objects you create, such as servers and storage volumes. You can provision as many data centers as needed. Data centers have their own private networks and are logically segmented from each other to create isolation.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.DataCentersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DataCentersApi apiInstance = new DataCentersApi(defaultClient);
    Datacenter datacenter = new Datacenter(); // Datacenter | The data center to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Datacenter result = apiInstance.datacentersPost(datacenter, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataCentersApi#datacentersPost");
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
| **datacenter** |  [**Datacenter**](Datacenter.md)| The data center to create. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Datacenter**](Datacenter.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datacentersPut"></a>
# **datacentersPut**
> Datacenter datacentersPut(datacenterId, datacenter, pretty, depth, xContractNumber)

Modify data centers

Modify the properties of the specified data center, rename it, or change the description.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.DataCentersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    DataCentersApi apiInstance = new DataCentersApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    Datacenter datacenter = new Datacenter(); // Datacenter | The modified data center.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      Datacenter result = apiInstance.datacentersPut(datacenterId, datacenter, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataCentersApi#datacentersPut");
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
| **datacenter** |  [**Datacenter**](Datacenter.md)| The modified data center. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**Datacenter**](Datacenter.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

