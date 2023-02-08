# FirewallRulesApi

All URIs are relative to *https://api.ionos.com/cloudapi/v6*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**datacentersServersNicsFirewallrulesDelete**](FirewallRulesApi.md#datacentersserversnicsfirewallrulesdelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Delete firewall rules |
| [**datacentersServersNicsFirewallrulesFindById**](FirewallRulesApi.md#datacentersserversnicsfirewallrulesfindbyid) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Retrieve firewall rules |
| [**datacentersServersNicsFirewallrulesGet**](FirewallRulesApi.md#datacentersserversnicsfirewallrulesget) | **GET** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules | List firewall rules |
| [**datacentersServersNicsFirewallrulesPatch**](FirewallRulesApi.md#datacentersserversnicsfirewallrulespatch) | **PATCH** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Partially modify firewall rules |
| [**datacentersServersNicsFirewallrulesPost**](FirewallRulesApi.md#datacentersserversnicsfirewallrulespost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules | Create firewall rules |
| [**datacentersServersNicsFirewallrulesPut**](FirewallRulesApi.md#datacentersserversnicsfirewallrulesput) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/nics/{nicId}/firewallrules/{firewallruleId} | Modify firewall rules |


<a name="datacentersServersNicsFirewallrulesDelete"></a>
# **datacentersServersNicsFirewallrulesDelete**
> datacentersServersNicsFirewallrulesDelete(datacenterId, serverId, nicId, firewallruleId, pretty, depth, xContractNumber)

Delete firewall rules

Delete the specified firewall rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **firewallruleId** | **String**| The unique ID of the firewall rule. ||
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
import com.ionoscloud.api.FirewallRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    String firewallruleId = "firewallruleId_example"; // String | The unique ID of the firewall rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      apiInstance.datacentersServersNicsFirewallrulesDelete(datacenterId, serverId, nicId, firewallruleId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesDelete");
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
        apiInstance.datacentersServersNicsFirewallrulesDelete(datacenterId, serverId, nicId, firewallruleId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesDelete");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFirewallrulesFindById"></a>
# **datacentersServersNicsFirewallrulesFindById**
> FirewallRule datacentersServersNicsFirewallrulesFindById(datacenterId, serverId, nicId, firewallruleId, pretty, depth, xContractNumber)

Retrieve firewall rules

Retrieve the properties of the specified firewall rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **firewallruleId** | **String**| The unique ID of the firewall rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FirewallRule**](../models/FirewallRule.md)

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
import com.ionoscloud.api.FirewallRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    String firewallruleId = "firewallruleId_example"; // String | The unique ID of the firewall rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesFindById(datacenterId, serverId, nicId, firewallruleId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesFindById");
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
        FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesFindById(datacenterId, serverId, nicId, firewallruleId)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesFindById");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFirewallrulesGet"></a>
# **datacentersServersNicsFirewallrulesGet**
> FirewallRules datacentersServersNicsFirewallrulesGet(datacenterId, serverId, nicId, pretty, depth, xContractNumber, offset, limit)

List firewall rules

List all firewall rules for the specified NIC.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|
| **offset** | **Integer**| The first element (from the complete list of the elements) to include in the response (used together with &lt;b&gt;&lt;i&gt;limit&lt;/i&gt;&lt;/b&gt; for pagination). | [optional] [default to 0]|
| **limit** | **Integer**| The maximum number of elements to return (use together with offset for pagination). | [optional] [default to 1000]|
| orderBy | String | Sorts the results alphanumerically in ascending order based on the specified property. | [optional] |
| maxResults | Integer | Limits the number of results returned. | [optional] |
| filters | Map<String, String> | Limit results to those containing a matching value for a specific property. | [optional] |

### Return type

[**FirewallRules**](../models/FirewallRules.md)

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
import com.ionoscloud.api.FirewallRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    Integer offset = 0; // Integer | The first element (from the complete list of the elements) to include in the response (used together with <b><i>limit</i></b> for pagination).
    Integer limit = 1000; // Integer | The maximum number of elements to return (use together with offset for pagination).
        String orderBy = "orderBy_example"; // String | Order by field
        Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
        Map<String, String> filters = new HashMap<String, String>(); // Map<String, String> | Filter results by field
    try {
      FirewallRules result = apiInstance.datacentersServersNicsFirewallrulesGet(datacenterId, serverId, nicId, pretty, depth, xContractNumber, offset, limit, orderBy, maxResults, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesGet");
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
        FirewallRules result = apiInstance.datacentersServersNicsFirewallrulesGet(datacenterId, serverId, nicId)
                .pretty(true)
                .depth(0)
                .offset(0)
                .limit(1000)
                .xContractNumber(56)
                .orderBy("orderBy_example")
                .maxResults(5)
                .filters(filters)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesGet");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFirewallrulesPatch"></a>
# **datacentersServersNicsFirewallrulesPatch**
> FirewallRule datacentersServersNicsFirewallrulesPatch(datacenterId, serverId, nicId, firewallruleId, firewallrule, pretty, depth, xContractNumber)

Partially modify firewall rules

Update the properties of the specified firewall rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **firewallruleId** | **String**| The unique ID of the firewall rule. ||
| **firewallrule** |  [**FirewallruleProperties**](../models/FirewallruleProperties.md)| The properties of the firewall rule to be updated. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FirewallRule**](../models/FirewallRule.md)

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
import com.ionoscloud.api.FirewallRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    String firewallruleId = "firewallruleId_example"; // String | The unique ID of the firewall rule.
    FirewallruleProperties firewallrule = new FirewallruleProperties(); // FirewallruleProperties | The properties of the firewall rule to be updated.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPatch(datacenterId, serverId, nicId, firewallruleId, firewallrule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesPatch");
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
        FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPatch(datacenterId, serverId, nicId, firewallruleId, firewallrule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesPatch");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFirewallrulesPost"></a>
# **datacentersServersNicsFirewallrulesPost**
> FirewallRule datacentersServersNicsFirewallrulesPost(datacenterId, serverId, nicId, firewallrule, pretty, depth, xContractNumber)

Create firewall rules

Create a firewall rule for the specified NIC.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **firewallrule** |  [**FirewallRule**](../models/FirewallRule.md)| The firewall rule to create. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FirewallRule**](../models/FirewallRule.md)

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
import com.ionoscloud.api.FirewallRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    FirewallRule firewallrule = new FirewallRule(); // FirewallRule | The firewall rule to create.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPost(datacenterId, serverId, nicId, firewallrule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesPost");
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
        FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPost(datacenterId, serverId, nicId, firewallrule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesPost");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

<a name="datacentersServersNicsFirewallrulesPut"></a>
# **datacentersServersNicsFirewallrulesPut**
> FirewallRule datacentersServersNicsFirewallrulesPut(datacenterId, serverId, nicId, firewallruleId, firewallrule, pretty, depth, xContractNumber)

Modify firewall rules

Modify the properties of the specified firewall rule.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **datacenterId** | **String**| The unique ID of the data center. ||
| **serverId** | **String**| The unique ID of the server. ||
| **nicId** | **String**| The unique ID of the NIC. ||
| **firewallruleId** | **String**| The unique ID of the firewall rule. ||
| **firewallrule** |  [**FirewallRule**](../models/FirewallRule.md)| The modified firewall rule. ||
| **pretty** | **Boolean**| Controls whether the response is pretty-printed (with indentations and new lines). | [optional] [default to true]|
| **depth** | **Integer**| Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth&#x3D;0: Only direct properties are included; children (servers and other elements) are not included.  - depth&#x3D;1: Direct properties and children references are included.  - depth&#x3D;2: Direct properties and children properties are included.  - depth&#x3D;3: Direct properties and children properties and children&#39;s children are included.  - depth&#x3D;... and so on | [optional] [default to 0]|
| **xContractNumber** | **Integer**| Users with multiple contracts must provide the contract number, for which all API requests are to be executed. | [optional]|

### Return type

[**FirewallRule**](../models/FirewallRule.md)

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
import com.ionoscloud.api.FirewallRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    FirewallRulesApi apiInstance = new FirewallRulesApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the data center.
    String serverId = "serverId_example"; // String | The unique ID of the server.
    String nicId = "nicId_example"; // String | The unique ID of the NIC.
    String firewallruleId = "firewallruleId_example"; // String | The unique ID of the firewall rule.
    FirewallRule firewallrule = new FirewallRule(); // FirewallRule | The modified firewall rule.
    Boolean pretty = true; // Boolean | Controls whether the response is pretty-printed (with indentations and new lines).
    Integer depth = 0; // Integer | Controls the detail depth of the response objects.  GET /datacenters/[ID]  - depth=0: Only direct properties are included; children (servers and other elements) are not included.  - depth=1: Direct properties and children references are included.  - depth=2: Direct properties and children properties are included.  - depth=3: Direct properties and children properties and children's children are included.  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users with multiple contracts must provide the contract number, for which all API requests are to be executed.
    try {
      FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPut(datacenterId, serverId, nicId, firewallruleId, firewallrule, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesPut");
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
        FirewallRule result = apiInstance.datacentersServersNicsFirewallrulesPut(datacenterId, serverId, nicId, firewallruleId, firewallrule)
                .pretty(true)
                .depth(0)
                .xContractNumber(56)
                .execute();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FirewallRulesApi#datacentersServersNicsFirewallrulesPut");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
```

