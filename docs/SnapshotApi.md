# SnapshotApi

All URIs are relative to *https://api.ionos.com/cloudapi/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**snapshotsDelete**](SnapshotApi.md#snapshotsdelete) | **DELETE** /snapshots/{snapshotId} | Delete a Snapshot |
| [**snapshotsFindById**](SnapshotApi.md#snapshotsfindbyid) | **GET** /snapshots/{snapshotId} | Retrieve a Snapshot by its uuid. |
| [**snapshotsGet**](SnapshotApi.md#snapshotsget) | **GET** /snapshots | List Snapshots  |
| [**snapshotsPatch**](SnapshotApi.md#snapshotspatch) | **PATCH** /snapshots/{snapshotId} | Partially modify a Snapshot |
| [**snapshotsPut**](SnapshotApi.md#snapshotsput) | **PUT** /snapshots/{snapshotId} | Modify a Snapshot |


<a name="snapshotsDelete"></a>
# **snapshotsDelete**
> Object snapshotsDelete(snapshotId, pretty, depth, xContractNumber)

Delete a Snapshot

Deletes the specified Snapshot.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.SnapshotApi;

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

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.snapshotsDelete(snapshotId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#snapshotsDelete");
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
| **snapshotId** | **String**| The unique ID of the Snapshot |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snapshotsFindById"></a>
# **snapshotsFindById**
> Snapshot snapshotsFindById(snapshotId, pretty, depth, xContractNumber)

Retrieve a Snapshot by its uuid.

Retrieves the attributes of a given Snapshot.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.SnapshotApi;

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

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Snapshot result = apiInstance.snapshotsFindById(snapshotId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#snapshotsFindById");
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
| **snapshotId** | **String**| The unique ID of the Snapshot |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Snapshot**](Snapshot.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snapshotsGet"></a>
# **snapshotsGet**
> Snapshots snapshotsGet(pretty, depth, xContractNumber)

List Snapshots 

Retrieve a list of available snapshots.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.SnapshotApi;

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

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Snapshots result = apiInstance.snapshotsGet(pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#snapshotsGet");
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

[**Snapshots**](Snapshots.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snapshotsPatch"></a>
# **snapshotsPatch**
> Snapshot snapshotsPatch(snapshotId, snapshot, pretty, depth, xContractNumber)

Partially modify a Snapshot

You can use this method to update attributes of a Snapshot.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.SnapshotApi;

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

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    SnapshotProperties snapshot = new SnapshotProperties(); // SnapshotProperties | Modified Snapshot
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Snapshot result = apiInstance.snapshotsPatch(snapshotId, snapshot, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#snapshotsPatch");
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
| **snapshotId** | **String**| The unique ID of the Snapshot |
| **snapshot** |  [**SnapshotProperties**](SnapshotProperties.md)| Modified Snapshot |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Snapshot**](Snapshot.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snapshotsPut"></a>
# **snapshotsPut**
> Snapshot snapshotsPut(snapshotId, snapshot, pretty, depth, xContractNumber)

Modify a Snapshot

You can use update attributes of a resource

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.SnapshotApi;

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

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    Snapshot snapshot = new Snapshot(); // Snapshot | Modified Snapshot
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Snapshot result = apiInstance.snapshotsPut(snapshotId, snapshot, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#snapshotsPut");
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
| **snapshotId** | **String**| The unique ID of the Snapshot |
| **snapshot** |  [**Snapshot**](Snapshot.md)| Modified Snapshot |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**Snapshot**](Snapshot.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

