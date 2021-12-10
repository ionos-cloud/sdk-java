# IpBlocksApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ipblocksDelete**](IpBlocksApi.md#ipblocksdelete) | **DELETE** /ipblocks/{ipblockId} | Delete IP blocks |
| [**ipblocksFindById**](IpBlocksApi.md#ipblocksfindbyid) | **GET** /ipblocks/{ipblockId} | Retrieve IP blocks |
| [**ipblocksGet**](IpBlocksApi.md#ipblocksget) | **GET** /ipblocks | List IP blocks  |
| [**ipblocksPatch**](IpBlocksApi.md#ipblockspatch) | **PATCH** /ipblocks/{ipblockId} | Partially modify IP blocks |
| [**ipblocksPost**](IpBlocksApi.md#ipblockspost) | **POST** /ipblocks | Reserve IP blocks |
| [**ipblocksPut**](IpBlocksApi.md#ipblocksput) | **PUT** /ipblocks/{ipblockId} | Modify IP blocks |


<a name="ipblocksDelete"></a>
# **ipblocksDelete**
> ipblocksDelete(ipblockId, pretty, depth, xContractNumber)

Delete IP blocks

Remove the specified IP block.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the IP block.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      apiInstance.ipblocksDelete(ipblockId, pretty, depth, xContractNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#ipblocksDelete");
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
| **ipblockId** | **String**| The unique ID of the IP block. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipblocksFindById"></a>
# **ipblocksFindById**
> IpBlock ipblocksFindById(ipblockId, pretty, depth, xContractNumber)

Retrieve IP blocks

Retrieve the properties of the specified IP block.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the IP block.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      IpBlock result = apiInstance.ipblocksFindById(ipblockId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#ipblocksFindById");
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
| **ipblockId** | **String**| The unique ID of the IP block. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**IpBlock**](IpBlock.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipblocksGet"></a>
# **ipblocksGet**
> IpBlocks ipblocksGet(pretty, depth, xContractNumber, offset, limit)

List IP blocks 

List all reserved IP blocks.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (use together with limit for pagination).
    Integer limit = 100; // Integer | The maximum number of elements to return (use together with offset for pagination).
    try {
      IpBlocks result = apiInstance.ipblocksGet(pretty, depth, xContractNumber, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#ipblocksGet");
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
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 100]

### Return type

[**IpBlocks**](IpBlocks.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipblocksPatch"></a>
# **ipblocksPatch**
> IpBlock ipblocksPatch(ipblockId, ipblock, pretty, depth, xContractNumber)

Partially modify IP blocks

Update the properties of the specified IP block.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the IP block.
    IpBlockProperties ipblock = new IpBlockProperties(); // IpBlockProperties | The properties of the IP block to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      IpBlock result = apiInstance.ipblocksPatch(ipblockId, ipblock, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#ipblocksPatch");
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
| **ipblockId** | **String**| The unique ID of the IP block. |
| **ipblock** |  [**IpBlockProperties**](IpBlockProperties.md)| The properties of the IP block to be updated. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**IpBlock**](IpBlock.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipblocksPost"></a>
# **ipblocksPost**
> IpBlock ipblocksPost(ipblock, pretty, depth, xContractNumber)

Reserve IP blocks

Reserve a new IP block.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    IpBlock ipblock = new IpBlock(); // IpBlock | The IP block to be reserved.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      IpBlock result = apiInstance.ipblocksPost(ipblock, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#ipblocksPost");
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
| **ipblock** |  [**IpBlock**](IpBlock.md)| The IP block to be reserved. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**IpBlock**](IpBlock.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipblocksPut"></a>
# **ipblocksPut**
> IpBlock ipblocksPut(ipblockId, ipblock, pretty, depth, xContractNumber)

Modify IP blocks

Modify the properties of the specified IP block.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the IP block.
    IpBlock ipblock = new IpBlock(); // IpBlock | The modified IP block.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, against which all API requests are to be executed.
    try {
      IpBlock result = apiInstance.ipblocksPut(ipblockId, ipblock, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IpBlocksApi#ipblocksPut");
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
| **ipblockId** | **String**| The unique ID of the IP block. |
| **ipblock** |  [**IpBlock**](IpBlock.md)| The modified IP block. |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, against which all API requests are to be executed. | [optional]

### Return type

[**IpBlock**](IpBlock.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

