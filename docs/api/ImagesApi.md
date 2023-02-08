# ImagesApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**imagesDelete**](ImagesApi.md#imagesdelete) | **DELETE** /images/{imageId} | Delete images |
| [**imagesFindById**](ImagesApi.md#imagesfindbyid) | **GET** /images/{imageId} | Retrieve images |
| [**imagesGet**](ImagesApi.md#imagesget) | **GET** /images | List images |
| [**imagesPatch**](ImagesApi.md#imagespatch) | **PATCH** /images/{imageId} | Partially modify images |
| [**imagesPut**](ImagesApi.md#imagesput) | **PUT** /images/{imageId} | Modify images |


<a name="imagesDelete"></a>
# **imagesDelete**
> imagesDelete(imageId, pretty, depth, xContractNumber)

Delete images

Delete the specified image; this operation is only supported for private images.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imageId** | **String**| The unique ID of the image. ||
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
import com.ionoscloud.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String imageId = "imageId_example"; // String | The unique ID of the image.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.imagesDelete(imageId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagesDelete");
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
        apiInstance.imagesDelete(imageId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ImagesApi#imagesDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="imagesFindById"></a>
# **imagesFindById**
> Image imagesFindById(imageId, pretty, depth, xContractNumber)

Retrieve images

Retrieve the properties of the specified image.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imageId** | **String**| The unique ID of the image. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Image**](../models/Image.md)

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
import com.ionoscloud.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String imageId = "imageId_example"; // String | The unique ID of the image.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      Image result = apiInstance.imagesFindById(imageId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagesFindById");
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
        Image result = apiInstance.imagesFindById(imageId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ImagesApi#imagesFindById");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="imagesGet"></a>
# **imagesGet**
> Images imagesGet(pretty, depth, xContractNumber)

List images

List all the images within the data center.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**Images**](../models/Images.md)

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
import com.ionoscloud.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ImagesApi apiInstance = new ImagesApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
        String orderBy = "orderBy_example"; // String | Order by field
        Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
        Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      Images result = apiInstance.imagesGet(pretty, depth, xContractNumber, orderBy, maxResults, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagesGet");
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
        Images result = apiInstance.imagesGet()
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ImagesApi#imagesGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="imagesPatch"></a>
# **imagesPatch**
> Image imagesPatch(imageId, image, pretty, depth, xContractNumber)

Partially modify images

Update the properties of the specified image.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imageId** | **String**| The unique ID of the image. ||
| **image** |  [**ImageProperties**](../models/ImageProperties.md)| The image properties to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Image**](../models/Image.md)

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
import com.ionoscloud.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String imageId = "imageId_example"; // String | The unique ID of the image.
    ImageProperties image = new ImageProperties(); // ImageProperties | The image properties to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      Image result = apiInstance.imagesPatch(imageId, image, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagesPatch");
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
        Image result = apiInstance.imagesPatch(imageId, image)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ImagesApi#imagesPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="imagesPut"></a>
# **imagesPut**
> Image imagesPut(imageId, image, pretty, depth, xContractNumber)

Modify images

Modify the properties of the specified image.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imageId** | **String**| The unique ID of the image. ||
| **image** |  [**Image**](../models/Image.md)| The modified image ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**Image**](../models/Image.md)

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
import com.ionoscloud.api.ImagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    ImagesApi apiInstance = new ImagesApi(defaultClient);
    String imageId = "imageId_example"; // String | The unique ID of the image.
    Image image = new Image(); // Image | The modified image
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      Image result = apiInstance.imagesPut(imageId, image, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#imagesPut");
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
        Image result = apiInstance.imagesPut(imageId, image)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ImagesApi#imagesPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

