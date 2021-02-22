# BackupUnitApi

All URIs are relative to *https://api.ionos.com/cloudapi/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**backupunitsDelete**](BackupUnitApi.md#backupunitsdelete) | **DELETE** /backupunits/{backupunitId} | Delete a Backup Unit |
| [**backupunitsFindById**](BackupUnitApi.md#backupunitsfindbyid) | **GET** /backupunits/{backupunitId} | Returns the specified backup Unit |
| [**backupunitsGet**](BackupUnitApi.md#backupunitsget) | **GET** /backupunits | List Backup Units  |
| [**backupunitsPatch**](BackupUnitApi.md#backupunitspatch) | **PATCH** /backupunits/{backupunitId} | Partially modify a Backup Unit |
| [**backupunitsPost**](BackupUnitApi.md#backupunitspost) | **POST** /backupunits | Create a Backup Unit |
| [**backupunitsPut**](BackupUnitApi.md#backupunitsput) | **PUT** /backupunits/{backupunitId} | Modify a Backup Unit |
| [**backupunitsSsourlGet**](BackupUnitApi.md#backupunitsssourlget) | **GET** /backupunits/{backupunitId}/ssourl | Returns a single signon URL for the specified backup Unit. |


<a name="backupunitsDelete"></a>
# **backupunitsDelete**
> Object backupunitsDelete(backupunitId, pretty, depth, xContractNumber)

Delete a Backup Unit

NOTE: Running through the deletion process will delete: - the backup plans inside the Backup Unit. - all backups associated with the Backup Unit. - the backup user and finally also the unit

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.BackupUnitApi;

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

    BackupUnitApi apiInstance = new BackupUnitApi(defaultClient);
    String backupunitId = "backupunitId_example"; // String | The unique ID of the backup Unit
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.backupunitsDelete(backupunitId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupUnitApi#backupunitsDelete");
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
| **backupunitId** | **String**| The unique ID of the backup Unit |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="backupunitsFindById"></a>
# **backupunitsFindById**
> BackupUnit backupunitsFindById(backupunitId, pretty, depth, xContractNumber)

Returns the specified backup Unit

You can retrieve the details of an specific backup unit.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.BackupUnitApi;

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

    BackupUnitApi apiInstance = new BackupUnitApi(defaultClient);
    String backupunitId = "backupunitId_example"; // String | The unique ID of the backup unit
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      BackupUnit result = apiInstance.backupunitsFindById(backupunitId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupUnitApi#backupunitsFindById");
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
| **backupunitId** | **String**| The unique ID of the backup unit |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**BackupUnit**](BackupUnit.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="backupunitsGet"></a>
# **backupunitsGet**
> BackupUnits backupunitsGet(pretty, depth, xContractNumber)

List Backup Units 

You can retrieve a complete list of backup Units that you have access to.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.BackupUnitApi;

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

    BackupUnitApi apiInstance = new BackupUnitApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      BackupUnits result = apiInstance.backupunitsGet(pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupUnitApi#backupunitsGet");
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

[**BackupUnits**](BackupUnits.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="backupunitsPatch"></a>
# **backupunitsPatch**
> BackupUnit backupunitsPatch(backupunitId, backupUnitProperties, pretty, depth, xContractNumber)

Partially modify a Backup Unit

You can use update a backup Unit properties

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.BackupUnitApi;

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

    BackupUnitApi apiInstance = new BackupUnitApi(defaultClient);
    String backupunitId = "backupunitId_example"; // String | The unique ID of the backup unit
    BackupUnitProperties backupUnitProperties = new BackupUnitProperties(); // BackupUnitProperties | Modified backup Unit properties
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      BackupUnit result = apiInstance.backupunitsPatch(backupunitId, backupUnitProperties, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupUnitApi#backupunitsPatch");
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
| **backupunitId** | **String**| The unique ID of the backup unit |
| **backupUnitProperties** |  [**BackupUnitProperties**](BackupUnitProperties.md)| Modified backup Unit properties |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**BackupUnit**](BackupUnit.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backupunitsPost"></a>
# **backupunitsPost**
> BackupUnit backupunitsPost(backupUnit, pretty, depth, xContractNumber)

Create a Backup Unit

Create a Backup Unit. A Backup Unit is considered a resource like a virtual datacenter, IP Block, snapshot, etc. It shall be shareable via groups inside our User Management Feature 

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.BackupUnitApi;

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

    BackupUnitApi apiInstance = new BackupUnitApi(defaultClient);
    BackupUnit backupUnit = new BackupUnit(); // BackupUnit | Payload containing data to create a new Backup Unit
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      BackupUnit result = apiInstance.backupunitsPost(backupUnit, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupUnitApi#backupunitsPost");
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
| **backupUnit** |  [**BackupUnit**](BackupUnit.md)| Payload containing data to create a new Backup Unit |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**BackupUnit**](BackupUnit.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backupunitsPut"></a>
# **backupunitsPut**
> BackupUnit backupunitsPut(backupunitId, backupUnit, pretty, depth, xContractNumber)

Modify a Backup Unit

You can use update a backup Unit properties

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.BackupUnitApi;

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

    BackupUnitApi apiInstance = new BackupUnitApi(defaultClient);
    String backupunitId = "backupunitId_example"; // String | The unique ID of the backup unit
    BackupUnit backupUnit = new BackupUnit(); // BackupUnit | Modified backup Unit
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      BackupUnit result = apiInstance.backupunitsPut(backupunitId, backupUnit, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupUnitApi#backupunitsPut");
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
| **backupunitId** | **String**| The unique ID of the backup unit |
| **backupUnit** |  [**BackupUnit**](BackupUnit.md)| Modified backup Unit |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**BackupUnit**](BackupUnit.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backupunitsSsourlGet"></a>
# **backupunitsSsourlGet**
> BackupUnitSSO backupunitsSsourlGet(backupunitId, pretty, xContractNumber)

Returns a single signon URL for the specified backup Unit.

Returns a single signon URL for the specified backup Unit.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.models.*;
import com.ionoscloud.api.BackupUnitApi;

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

    BackupUnitApi apiInstance = new BackupUnitApi(defaultClient);
    String backupunitId = "backupunitId_example"; // String | The unique UUID of the backup unit
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      BackupUnitSSO result = apiInstance.backupunitsSsourlGet(backupunitId, pretty, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackupUnitApi#backupunitsSsourlGet");
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
| **backupunitId** | **String**| The unique UUID of the backup unit |
| **pretty** | **Boolean**| Controls whether response is pretty-printed (with indentation and new lines) | [optional] [default to true]
| **xContractNumber** | **Integer**| Users having more than 1 contract need to provide contract number, against which all API requests should be executed | [optional]

### Return type

[**BackupUnitSSO**](BackupUnitSSO.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

