# UserS3KeysApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**umUsersS3keysDelete**](UserS3KeysApi.md#umuserss3keysdelete) | **DELETE** /um/users/{userId}/s3keys/{keyId} | Delete S3 keys |
| [**umUsersS3keysFindByKeyId**](UserS3KeysApi.md#umuserss3keysfindbykeyid) | **GET** /um/users/{userId}/s3keys/{keyId} | Retrieve user S3 keys by key ID |
| [**umUsersS3keysGet**](UserS3KeysApi.md#umuserss3keysget) | **GET** /um/users/{userId}/s3keys | List user S3 keys |
| [**umUsersS3keysPost**](UserS3KeysApi.md#umuserss3keyspost) | **POST** /um/users/{userId}/s3keys | Create user S3 keys |
| [**umUsersS3keysPut**](UserS3KeysApi.md#umuserss3keysput) | **PUT** /um/users/{userId}/s3keys/{keyId} | Modify S3 keys by key ID |
| [**umUsersS3ssourlGet**](UserS3KeysApi.md#umuserss3ssourlget) | **GET** /um/users/{userId}/s3ssourl | Retrieve S3 single sign-on URLs |


<a name="umUsersS3keysDelete"></a>
# **umUsersS3keysDelete**
> umUsersS3keysDelete(userId, keyId, pretty, depth, xContractNumber)

Delete S3 keys

Delete the specified user S3 key.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The unique ID of the user. ||
| **keyId** | **String**| The unique ID of the S3 key. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.UserS3KeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UserS3KeysApi apiInstance = new UserS3KeysApi(defaultClient);
    String userId = "userId_example"; // String | The unique ID of the user.
    String keyId = "keyId_example"; // String | The unique ID of the S3 key.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.umUsersS3keysDelete(userId, keyId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysDelete");
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
        apiInstance.umUsersS3keysDelete(userId, keyId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="umUsersS3keysFindByKeyId"></a>
# **umUsersS3keysFindByKeyId**
> S3Key umUsersS3keysFindByKeyId(userId, keyId, pretty, depth, xContractNumber)

Retrieve user S3 keys by key ID

Retrieve the specified user S3 key. The user ID is in the response body when the user is created, and in the list of the users, returned by GET. The key ID is in the response body when the S3 key is created, and in the list of all user S3 keys, returned by GET.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The unique ID of the user. ||
| **keyId** | **String**| The unique ID of the S3 key. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**S3Key**](../models/S3Key.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.UserS3KeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UserS3KeysApi apiInstance = new UserS3KeysApi(defaultClient);
    String userId = "userId_example"; // String | The unique ID of the user.
    String keyId = "keyId_example"; // String | The unique ID of the S3 key.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      S3Key result = apiInstance.umUsersS3keysFindByKeyId(userId, keyId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysFindByKeyId");
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
        S3Key result = apiInstance.umUsersS3keysFindByKeyId(userId, keyId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysFindByKeyId");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="umUsersS3keysGet"></a>
# **umUsersS3keysGet**
> S3Keys umUsersS3keysGet(userId, pretty, depth, xContractNumber)

List user S3 keys

List S3 keys by user ID. The user ID is in the response body when the user is created, and in the list of the users, returned by GET.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The unique ID of the user. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**S3Keys**](../models/S3Keys.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.UserS3KeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UserS3KeysApi apiInstance = new UserS3KeysApi(defaultClient);
    String userId = "userId_example"; // String | The unique ID of the user.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
        String orderBy = "orderBy_example"; // String | Order by field
        Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
        Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      S3Keys result = apiInstance.umUsersS3keysGet(userId, pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysGet");
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
        S3Keys result = apiInstance.umUsersS3keysGet(userId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="umUsersS3keysPost"></a>
# **umUsersS3keysPost**
> S3Key umUsersS3keysPost(userId, pretty, depth, xContractNumber)

Create user S3 keys

Create an S3 key for the specified user. The user ID is in the response body when the user is created, and in the list of the users, returned by GET. A maximum of five keys per user can be generated.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The unique ID of the user. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**S3Key**](../models/S3Key.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.UserS3KeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UserS3KeysApi apiInstance = new UserS3KeysApi(defaultClient);
    String userId = "userId_example"; // String | The unique ID of the user.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      S3Key result = apiInstance.umUsersS3keysPost(userId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysPost");
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
        S3Key result = apiInstance.umUsersS3keysPost(userId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="umUsersS3keysPut"></a>
# **umUsersS3keysPut**
> S3Key umUsersS3keysPut(userId, keyId, s3Key, pretty, depth, xContractNumber)

Modify S3 keys by key ID

Enable or disable the specified user S3 key.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The unique ID of the user. ||
| **keyId** | **String**| The unique ID of the S3 key. ||
| **s3Key** |  [**S3Key**](../models/S3Key.md)| The modified S3 key. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**S3Key**](../models/S3Key.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.UserS3KeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UserS3KeysApi apiInstance = new UserS3KeysApi(defaultClient);
    String userId = "userId_example"; // String | The unique ID of the user.
    String keyId = "keyId_example"; // String | The unique ID of the S3 key.
    S3Key s3Key = new S3Key(); // S3Key | The modified S3 key.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      S3Key result = apiInstance.umUsersS3keysPut(userId, keyId, s3Key, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysPut");
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
        S3Key result = apiInstance.umUsersS3keysPut(userId, keyId, s3Key)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling UserS3KeysApi#umUsersS3keysPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="umUsersS3ssourlGet"></a>
# **umUsersS3ssourlGet**
> S3ObjectStorageSSO umUsersS3ssourlGet(userId, pretty, xContractNumber)

Retrieve S3 single sign-on URLs

Retrieve S3 Object Storage single sign-on URLs for the the specified user. The user ID is in the response body when the user is created, and in the list of the users, returned by GET.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The unique ID of the user. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**S3ObjectStorageSSO**](../models/S3ObjectStorageSSO.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.UserS3KeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UserS3KeysApi apiInstance = new UserS3KeysApi(defaultClient);
    String userId = "userId_example"; // String | The unique ID of the user.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
        String orderBy = "orderBy_example"; // String | Order by field
        Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
        Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      S3ObjectStorageSSO result = apiInstance.umUsersS3ssourlGet(userId, pretty, xContractNumber, orderBy, maxResults, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserS3KeysApi#umUsersS3ssourlGet");
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
        S3ObjectStorageSSO result = apiInstance.umUsersS3ssourlGet(userId)
                .pretty(true)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling UserS3KeysApi#umUsersS3ssourlGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

