# TemplatesApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**templatesFindById**](TemplatesApi.md#templatesfindbyid) | **GET** /templates/{templateId} | Retrieve an available template |
| [**templatesGet**](TemplatesApi.md#templatesget) | **GET** /templates | List Templates |


<a name="templatesFindById"></a>
# **templatesFindById**
> Template templatesFindById(templateId, depth)

Retrieve an available template

Retrieves the attributes of a given template.

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String templateId = "templateId_example"; // String | 
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    try {
      Template result = apiInstance.templatesFindById(templateId, depth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templatesFindById");
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
| **templateId** | **String**|  |
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]

### Return type

[**Template**](Template.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templatesGet"></a>
# **templatesGet**
> Templates templatesGet(depth)

List Templates

Retrieve a list of available templates. Templates can be used on specific server types only (CUBE at the moment)

### Example
```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    try {
      Templates result = apiInstance.templatesGet(depth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templatesGet");
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
| **depth** | **Integer**| Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth&#x3D;0: only direct properties are included. Children (servers etc.) are not included  - depth&#x3D;1: direct properties and children references are included  - depth&#x3D;2: direct properties and children properties are included  - depth&#x3D;3: direct properties and children properties and children&#39;s children are included  - depth&#x3D;... and so on | [optional] [default to 0]

### Return type

[**Templates**](Templates.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

