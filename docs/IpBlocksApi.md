# IpBlocksApi

All URIs are relative to *https://api.ionos.com/cloudapi/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ipblocksDelete**](IpBlocksApi.md#ipblocksdelete) | **DELETE** /ipblocks/{ipblockId} | Delete IP Block |
| [**ipblocksFindById**](IpBlocksApi.md#ipblocksfindbyid) | **GET** /ipblocks/{ipblockId} | Retrieve an IP Block |
| [**ipblocksGet**](IpBlocksApi.md#ipblocksget) | **GET** /ipblocks | List IP Blocks  |
| [**ipblocksPatch**](IpBlocksApi.md#ipblockspatch) | **PATCH** /ipblocks/{ipblockId} | Partially modify IP Block |
| [**ipblocksPost**](IpBlocksApi.md#ipblockspost) | **POST** /ipblocks | Reserve IP Block |
| [**ipblocksPut**](IpBlocksApi.md#ipblocksput) | **PUT** /ipblocks/{ipblockId} | Modify IP Block |


<a name="ipblocksDelete"></a>
# **ipblocksDelete**
> Object ipblocksDelete(ipblockId, pretty, depth, xContractNumber)

Delete IP Block

Removes the specific IP Block

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth Basic Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    Basic Authentication.setUsername("YOUR USERNAME");
    Basic Authentication.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token Authentication
    ApiKeyAuth Token Authentication = (ApiKeyAuth) defaultClient.getAuthentication("Token Authentication");
    Token Authentication.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token Authentication.setApiKeyPrefix("Token");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | 
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.ipblocksDelete(ipblockId, pretty, depth, xContractNumber);
      System.out.println(result);
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
| **ipblockId** | **String**|  |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipblocksFindById"></a>
# **ipblocksFindById**
> IpBlock ipblocksFindById(ipblockId, pretty, depth, xContractNumber)

Retrieve an IP Block

Retrieves the attributes of a given IP Block.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth Basic Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    Basic Authentication.setUsername("YOUR USERNAME");
    Basic Authentication.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token Authentication
    ApiKeyAuth Token Authentication = (ApiKeyAuth) defaultClient.getAuthentication("Token Authentication");
    Token Authentication.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token Authentication.setApiKeyPrefix("Token");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | 
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
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
| **ipblockId** | **String**|  |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**IpBlock**](IpBlock.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipblocksGet"></a>
# **ipblocksGet**
> IpBlocks ipblocksGet(pretty, depth, xContractNumber)

List IP Blocks 

Retrieve a list of all reserved IP Blocks

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth Basic Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    Basic Authentication.setUsername("YOUR USERNAME");
    Basic Authentication.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token Authentication
    ApiKeyAuth Token Authentication = (ApiKeyAuth) defaultClient.getAuthentication("Token Authentication");
    Token Authentication.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token Authentication.setApiKeyPrefix("Token");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      IpBlocks result = apiInstance.ipblocksGet(pretty, depth, xContractNumber);
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
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**IpBlocks**](IpBlocks.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipblocksPatch"></a>
# **ipblocksPatch**
> IpBlock ipblocksPatch(ipblockId, ipblock, pretty, depth, xContractNumber)

Partially modify IP Block

You can use update attributes of a resource

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth Basic Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    Basic Authentication.setUsername("YOUR USERNAME");
    Basic Authentication.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token Authentication
    ApiKeyAuth Token Authentication = (ApiKeyAuth) defaultClient.getAuthentication("Token Authentication");
    Token Authentication.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token Authentication.setApiKeyPrefix("Token");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | 
    IpBlockProperties ipblock = new IpBlockProperties(); // IpBlockProperties | IP Block to be modified
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
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
| **ipblockId** | **String**|  |
| **ipblock** |  [**IpBlockProperties**](IpBlockProperties.md)| IP Block to be modified |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**IpBlock**](IpBlock.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipblocksPost"></a>
# **ipblocksPost**
> IpBlock ipblocksPost(ipblock, pretty, depth, xContractNumber)

Reserve IP Block

This will reserve a new IP Block

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth Basic Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    Basic Authentication.setUsername("YOUR USERNAME");
    Basic Authentication.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token Authentication
    ApiKeyAuth Token Authentication = (ApiKeyAuth) defaultClient.getAuthentication("Token Authentication");
    Token Authentication.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token Authentication.setApiKeyPrefix("Token");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    IpBlock ipblock = new IpBlock(); // IpBlock | IP Block to be reserved
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
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
| **ipblock** |  [**IpBlock**](IpBlock.md)| IP Block to be reserved |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**IpBlock**](IpBlock.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipblocksPut"></a>
# **ipblocksPut**
> IpBlock ipblocksPut(ipblockId, ipblock, pretty, depth, xContractNumber)

Modify IP Block

You can use update attributes of a resource

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.IpBlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth Basic Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    Basic Authentication.setUsername("YOUR USERNAME");
    Basic Authentication.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token Authentication
    ApiKeyAuth Token Authentication = (ApiKeyAuth) defaultClient.getAuthentication("Token Authentication");
    Token Authentication.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token Authentication.setApiKeyPrefix("Token");

    IpBlocksApi apiInstance = new IpBlocksApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | 
    IpBlock ipblock = new IpBlock(); // IpBlock | IP Block to be modified
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
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
| **ipblockId** | **String**|  |
| **ipblock** |  [**IpBlock**](IpBlock.md)| IP Block to be modified |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**IpBlock**](IpBlock.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

