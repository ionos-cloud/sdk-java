# LabelApi

## LabelApi

All URIs are relative to [https://api.ionos.com/cloudapi/v5](https://api.ionos.com/cloudapi/v5)

| Method | HTTP request | Description |
| :--- | :--- | :--- |
| [**datacentersLabelsDelete**](labelapi.md#datacenterslabelsdelete) | **DELETE** /datacenters/{datacenterId}/labels/{key} | Delete a Label from Data Center |
| [**datacentersLabelsFindByKey**](labelapi.md#datacenterslabelsfindbykey) | **GET** /datacenters/{datacenterId}/labels/{key} | Retrieve a Label of Data Center |
| [**datacentersLabelsGet**](labelapi.md#datacenterslabelsget) | **GET** /datacenters/{datacenterId}/labels | List all Data Center Labels |
| [**datacentersLabelsPost**](labelapi.md#datacenterslabelspost) | **POST** /datacenters/{datacenterId}/labels | Add a Label to Data Center |
| [**datacentersLabelsPut**](labelapi.md#datacenterslabelsput) | **PUT** /datacenters/{datacenterId}/labels/{key} | Modify a Label of Data Center |
| [**datacentersServersLabelsDelete**](labelapi.md#datacentersserverslabelsdelete) | **DELETE** /datacenters/{datacenterId}/servers/{serverId}/labels/{key} | Delete a Label from Server |
| [**datacentersServersLabelsFindByKey**](labelapi.md#datacentersserverslabelsfindbykey) | **GET** /datacenters/{datacenterId}/servers/{serverId}/labels/{key} | Retrieve a Label of Server |
| [**datacentersServersLabelsGet**](labelapi.md#datacentersserverslabelsget) | **GET** /datacenters/{datacenterId}/servers/{serverId}/labels | List all Server Labels |
| [**datacentersServersLabelsPost**](labelapi.md#datacentersserverslabelspost) | **POST** /datacenters/{datacenterId}/servers/{serverId}/labels | Add a Label to Server |
| [**datacentersServersLabelsPut**](labelapi.md#datacentersserverslabelsput) | **PUT** /datacenters/{datacenterId}/servers/{serverId}/labels/{key} | Modify a Label of Server |
| [**datacentersVolumesLabelsDelete**](labelapi.md#datacentersvolumeslabelsdelete) | **DELETE** /datacenters/{datacenterId}/volumes/{volumeId}/labels/{key} | Delete a Label from Volume |
| [**datacentersVolumesLabelsFindByKey**](labelapi.md#datacentersvolumeslabelsfindbykey) | **GET** /datacenters/{datacenterId}/volumes/{volumeId}/labels/{key} | Retrieve a Label of Volume |
| [**datacentersVolumesLabelsGet**](labelapi.md#datacentersvolumeslabelsget) | **GET** /datacenters/{datacenterId}/volumes/{volumeId}/labels | List all Volume Labels |
| [**datacentersVolumesLabelsPost**](labelapi.md#datacentersvolumeslabelspost) | **POST** /datacenters/{datacenterId}/volumes/{volumeId}/labels | Add a Label to Volume |
| [**datacentersVolumesLabelsPut**](labelapi.md#datacentersvolumeslabelsput) | **PUT** /datacenters/{datacenterId}/volumes/{volumeId}/labels/{key} | Modify a Label of Volume |
| [**ipblocksLabelsDelete**](labelapi.md#ipblockslabelsdelete) | **DELETE** /ipblocks/{ipblockId}/labels/{key} | Delete a Label from IP Block |
| [**ipblocksLabelsFindByKey**](labelapi.md#ipblockslabelsfindbykey) | **GET** /ipblocks/{ipblockId}/labels/{key} | Retrieve a Label of IP Block |
| [**ipblocksLabelsGet**](labelapi.md#ipblockslabelsget) | **GET** /ipblocks/{ipblockId}/labels | List all Ip Block Labels |
| [**ipblocksLabelsPost**](labelapi.md#ipblockslabelspost) | **POST** /ipblocks/{ipblockId}/labels | Add a Label to IP Block |
| [**ipblocksLabelsPut**](labelapi.md#ipblockslabelsput) | **PUT** /ipblocks/{ipblockId}/labels/{key} | Modify a Label of IP Block |
| [**labelsFindByUrn**](labelapi.md#labelsfindbyurn) | **GET** /labels/{labelurn} | Returns the label by its URN. |
| [**labelsGet**](labelapi.md#labelsget) | **GET** /labels | List Labels |
| [**snapshotsLabelsDelete**](labelapi.md#snapshotslabelsdelete) | **DELETE** /snapshots/{snapshotId}/labels/{key} | Delete a Label from Snapshot |
| [**snapshotsLabelsFindByKey**](labelapi.md#snapshotslabelsfindbykey) | **GET** /snapshots/{snapshotId}/labels/{key} | Retrieve a Label of Snapshot |
| [**snapshotsLabelsGet**](labelapi.md#snapshotslabelsget) | **GET** /snapshots/{snapshotId}/labels | List all Snapshot Labels |
| [**snapshotsLabelsPost**](labelapi.md#snapshotslabelspost) | **POST** /snapshots/{snapshotId}/labels | Add a Label to Snapshot |
| [**snapshotsLabelsPut**](labelapi.md#snapshotslabelsput) | **PUT** /snapshots/{snapshotId}/labels/{key} | Modify a Label of Snapshot |

## **datacentersLabelsDelete**

> Object datacentersLabelsDelete\(datacenterId, key, pretty, depth, xContractNumber\)

Delete a Label from Data Center

This will remove a label from the data center.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Data Center
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersLabelsDelete(datacenterIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersLabelsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Data Center |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLabelsFindByKey**

> LabelResource datacentersLabelsFindByKey\(datacenterId, key, pretty, depth, xContractNumber\)

Retrieve a Label of Data Center

This will retrieve the properties of a associated label to a data center.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Data Center
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersLabelsFindByKey(datacenterIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersLabelsFindByKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Data Center |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLabelsGet**

> LabelResources datacentersLabelsGet\(datacenterId, pretty, depth, xContractNumber, offset, limit\)

List all Data Center Labels

You can retrieve a list of all labels associated with a data center

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Data Center
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      LabelResources result = apiInstance.datacentersLabelsGet(datacenterIdprettydepthxContractNumberoffsetlimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersLabelsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Data Center |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |
| **offset** | **Integer** | the first element \(of the total list of elements\) to include in the response \(use together with &lt;code&gt;limit&lt;/code&gt; for pagination\) | \[optional\] \[default to 0\] |
| **limit** | **Integer** | the maximum number of elements to return \(use together with &lt;code&gt;offset&lt;/code&gt; for pagination\) | \[optional\] \[default to 1000\] |

### Return type

[**LabelResources**](labelresources.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersLabelsPost**

> LabelResource datacentersLabelsPost\(datacenterId, label, pretty, depth, xContractNumber\)

Add a Label to Data Center

This will add a label to the data center.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Data Center
    LabelResource label = new LabelResource(); // LabelResource | Label to be added
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersLabelsPost(datacenterIdlabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersLabelsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Data Center |  |
| **label** | [**LabelResource**](labelresource.md) | Label to be added |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **datacentersLabelsPut**

> LabelResource datacentersLabelsPut\(datacenterId, key, label, pretty, depth, xContractNumber\)

Modify a Label of Data Center

This will modify the value of the label on a data center.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Data Center
    String key = "key_example"; // String | The key of the Label
    LabelResource label = new LabelResource(); // LabelResource | Modified Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersLabelsPut(datacenterIdkeylabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersLabelsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Data Center |  |
| **key** | **String** | The key of the Label |  |
| **label** | [**LabelResource**](labelresource.md) | Modified Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **datacentersServersLabelsDelete**

> Object datacentersServersLabelsDelete\(datacenterId, serverId, key, pretty, depth, xContractNumber\)

Delete a Label from Server

This will remove a label from the server.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersServersLabelsDelete(datacenterIdserverIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersServersLabelsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **serverId** | **String** | The unique ID of the Server |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersServersLabelsFindByKey**

> LabelResource datacentersServersLabelsFindByKey\(datacenterId, serverId, key, pretty, depth, xContractNumber\)

Retrieve a Label of Server

This will retrieve the properties of a associated label to a server.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersServersLabelsFindByKey(datacenterIdserverIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersServersLabelsFindByKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **serverId** | **String** | The unique ID of the Server |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersServersLabelsGet**

> LabelResources datacentersServersLabelsGet\(datacenterId, serverId, pretty, depth, xContractNumber, offset, limit\)

List all Server Labels

You can retrieve a list of all labels associated with a server

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      LabelResources result = apiInstance.datacentersServersLabelsGet(datacenterIdserverIdprettydepthxContractNumberoffsetlimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersServersLabelsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **serverId** | **String** | The unique ID of the Server |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |
| **offset** | **Integer** | the first element \(of the total list of elements\) to include in the response \(use together with &lt;code&gt;limit&lt;/code&gt; for pagination\) | \[optional\] \[default to 0\] |
| **limit** | **Integer** | the maximum number of elements to return \(use together with &lt;code&gt;offset&lt;/code&gt; for pagination\) | \[optional\] \[default to 1000\] |

### Return type

[**LabelResources**](labelresources.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersServersLabelsPost**

> LabelResource datacentersServersLabelsPost\(datacenterId, serverId, label, pretty, depth, xContractNumber\)

Add a Label to Server

This will add a label to the server.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    LabelResource label = new LabelResource(); // LabelResource | Label to be added
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersServersLabelsPost(datacenterIdserverIdlabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersServersLabelsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **serverId** | **String** | The unique ID of the Server |  |
| **label** | [**LabelResource**](labelresource.md) | Label to be added |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **datacentersServersLabelsPut**

> LabelResource datacentersServersLabelsPut\(datacenterId, serverId, key, label, pretty, depth, xContractNumber\)

Modify a Label of Server

This will modify the value of the label on a server.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String serverId = "serverId_example"; // String | The unique ID of the Server
    String key = "key_example"; // String | The key of the Label
    LabelResource label = new LabelResource(); // LabelResource | Modified Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersServersLabelsPut(datacenterIdserverIdkeylabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersServersLabelsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **serverId** | **String** | The unique ID of the Server |  |
| **key** | **String** | The key of the Label |  |
| **label** | [**LabelResource**](labelresource.md) | Modified Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **datacentersVolumesLabelsDelete**

> Object datacentersVolumesLabelsDelete\(datacenterId, volumeId, key, pretty, depth, xContractNumber\)

Delete a Label from Volume

This will remove a label from the volume.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String volumeId = "volumeId_example"; // String | The unique ID of the Volume
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.datacentersVolumesLabelsDelete(datacenterIdvolumeIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersVolumesLabelsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **volumeId** | **String** | The unique ID of the Volume |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersVolumesLabelsFindByKey**

> LabelResource datacentersVolumesLabelsFindByKey\(datacenterId, volumeId, key, pretty, depth, xContractNumber\)

Retrieve a Label of Volume

This will retrieve the properties of a associated label to a volume.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String volumeId = "volumeId_example"; // String | The unique ID of the Volume
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersVolumesLabelsFindByKey(datacenterIdvolumeIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersVolumesLabelsFindByKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **volumeId** | **String** | The unique ID of the Volume |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersVolumesLabelsGet**

> LabelResources datacentersVolumesLabelsGet\(datacenterId, volumeId, pretty, depth, xContractNumber, offset, limit\)

List all Volume Labels

You can retrieve a list of all labels associated with a volume

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String volumeId = "volumeId_example"; // String | The unique ID of the Volume
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 1000; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      LabelResources result = apiInstance.datacentersVolumesLabelsGet(datacenterIdvolumeIdprettydepthxContractNumberoffsetlimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersVolumesLabelsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **volumeId** | **String** | The unique ID of the Volume |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |
| **offset** | **Integer** | the first element \(of the total list of elements\) to include in the response \(use together with &lt;code&gt;limit&lt;/code&gt; for pagination\) | \[optional\] \[default to 0\] |
| **limit** | **Integer** | the maximum number of elements to return \(use together with &lt;code&gt;offset&lt;/code&gt; for pagination\) | \[optional\] \[default to 1000\] |

### Return type

[**LabelResources**](labelresources.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **datacentersVolumesLabelsPost**

> LabelResource datacentersVolumesLabelsPost\(datacenterId, volumeId, label, pretty, depth, xContractNumber\)

Add a Label to Volume

This will add a label to the volume.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String volumeId = "volumeId_example"; // String | The unique ID of the Volume
    LabelResource label = new LabelResource(); // LabelResource | Label to be added
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersVolumesLabelsPost(datacenterIdvolumeIdlabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersVolumesLabelsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **volumeId** | **String** | The unique ID of the Volume |  |
| **label** | [**LabelResource**](labelresource.md) | Label to be added |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **datacentersVolumesLabelsPut**

> LabelResource datacentersVolumesLabelsPut\(datacenterId, volumeId, key, label, pretty, depth, xContractNumber\)

Modify a Label of Volume

This will modify the value of the label on a volume.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String datacenterId = "datacenterId_example"; // String | The unique ID of the Datacenter
    String volumeId = "volumeId_example"; // String | The unique ID of the Volume
    String key = "key_example"; // String | The key of the Label
    LabelResource label = new LabelResource(); // LabelResource | Modified Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.datacentersVolumesLabelsPut(datacenterIdvolumeIdkeylabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#datacentersVolumesLabelsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **datacenterId** | **String** | The unique ID of the Datacenter |  |
| **volumeId** | **String** | The unique ID of the Volume |  |
| **key** | **String** | The key of the Label |  |
| **label** | [**LabelResource**](labelresource.md) | Modified Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **ipblocksLabelsDelete**

> Object ipblocksLabelsDelete\(ipblockId, key, pretty, depth, xContractNumber\)

Delete a Label from IP Block

This will remove a label from the Ip Block.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the Ip Block
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.ipblocksLabelsDelete(ipblockIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#ipblocksLabelsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **ipblockId** | **String** | The unique ID of the Ip Block |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **ipblocksLabelsFindByKey**

> LabelResource ipblocksLabelsFindByKey\(ipblockId, key, pretty, depth, xContractNumber\)

Retrieve a Label of IP Block

This will retrieve the properties of a associated label to a Ip Block.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the Ip Block
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.ipblocksLabelsFindByKey(ipblockIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#ipblocksLabelsFindByKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **ipblockId** | **String** | The unique ID of the Ip Block |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **ipblocksLabelsGet**

> LabelResources ipblocksLabelsGet\(ipblockId, pretty, depth, xContractNumber\)

List all Ip Block Labels

You can retrieve a list of all labels associated with a IP Block

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the Ip Block
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResources result = apiInstance.ipblocksLabelsGet(ipblockIdprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#ipblocksLabelsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **ipblockId** | **String** | The unique ID of the Ip Block |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResources**](labelresources.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **ipblocksLabelsPost**

> LabelResource ipblocksLabelsPost\(ipblockId, label, pretty, depth, xContractNumber\)

Add a Label to IP Block

This will add a label to the Ip Block.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the Ip Block
    LabelResource label = new LabelResource(); // LabelResource | Label to be added
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.ipblocksLabelsPost(ipblockIdlabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#ipblocksLabelsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **ipblockId** | **String** | The unique ID of the Ip Block |  |
| **label** | [**LabelResource**](labelresource.md) | Label to be added |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **ipblocksLabelsPut**

> LabelResource ipblocksLabelsPut\(ipblockId, key, label, pretty, depth, xContractNumber\)

Modify a Label of IP Block

This will modify the value of the label on a Ip Block.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String ipblockId = "ipblockId_example"; // String | The unique ID of the Ip Block
    String key = "key_example"; // String | The key of the Label
    LabelResource label = new LabelResource(); // LabelResource | Modified Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.ipblocksLabelsPut(ipblockIdkeylabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#ipblocksLabelsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **ipblockId** | **String** | The unique ID of the Ip Block |  |
| **key** | **String** | The key of the Label |  |
| **label** | [**LabelResource**](labelresource.md) | Modified Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **labelsFindByUrn**

> Label labelsFindByUrn\(labelurn, pretty, depth, xContractNumber\)

Returns the label by its URN.

You can retrieve the details of a specific label using its URN. A URN is for uniqueness of a Label and composed using urn:label:&lt;resource\_type&gt;:&lt;resource\_uuid&gt;:&lt;key&gt;

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String labelurn = "labelurn_example"; // String | The URN representing the unique ID of the label. A URN is for uniqueness of a Label and composed using urn:label:<resource_type>:<resource_uuid>:<key>
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Label result = apiInstance.labelsFindByUrn(labelurnprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#labelsFindByUrn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **labelurn** | **String** | The URN representing the unique ID of the label. A URN is for uniqueness of a Label and composed using urn:label:&lt;resource\_type&gt;:&lt;resource\_uuid&gt;:&lt;key&gt; |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**Label**](label.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **labelsGet**

> Labels labelsGet\(pretty, depth, xContractNumber\)

List Labels

You can retrieve a complete list of labels that you have access to.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Labels result = apiInstance.labelsGet(prettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#labelsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**Labels**](labels.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **snapshotsLabelsDelete**

> Object snapshotsLabelsDelete\(snapshotId, key, pretty, depth, xContractNumber\)

Delete a Label from Snapshot

This will remove a label from the snapshot.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.snapshotsLabelsDelete(snapshotIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#snapshotsLabelsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **snapshotId** | **String** | The unique ID of the Snapshot |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **snapshotsLabelsFindByKey**

> LabelResource snapshotsLabelsFindByKey\(snapshotId, key, pretty, depth, xContractNumber\)

Retrieve a Label of Snapshot

This will retrieve the properties of a associated label to a snapshot.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    String key = "key_example"; // String | The key of the Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.snapshotsLabelsFindByKey(snapshotIdkeyprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#snapshotsLabelsFindByKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **snapshotId** | **String** | The unique ID of the Snapshot |  |
| **key** | **String** | The key of the Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **snapshotsLabelsGet**

> LabelResources snapshotsLabelsGet\(snapshotId, pretty, depth, xContractNumber\)

List all Snapshot Labels

You can retrieve a list of all labels associated with a snapshot

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResources result = apiInstance.snapshotsLabelsGet(snapshotIdprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#snapshotsLabelsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **snapshotId** | **String** | The unique ID of the Snapshot |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResources**](labelresources.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **snapshotsLabelsPost**

> LabelResource snapshotsLabelsPost\(snapshotId, label, pretty, depth, xContractNumber\)

Add a Label to Snapshot

This will add a label to the snapshot.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    LabelResource label = new LabelResource(); // LabelResource | Label to be added
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.snapshotsLabelsPost(snapshotIdlabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#snapshotsLabelsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **snapshotId** | **String** | The unique ID of the Snapshot |  |
| **label** | [**LabelResource**](labelresource.md) | Label to be added |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **snapshotsLabelsPut**

> LabelResource snapshotsLabelsPut\(snapshotId, key, label, pretty, depth, xContractNumber\)

Modify a Label of Snapshot

This will modify the value of the label on a snapshot.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ionos.com/cloudapi/v5");

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    LabelApi apiInstance = new LabelApi(defaultClient);
    String snapshotId = "snapshotId_example"; // String | The unique ID of the Snapshot
    String key = "key_example"; // String | The key of the Label
    LabelResource label = new LabelResource(); // LabelResource | Modified Label
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      LabelResource result = apiInstance.snapshotsLabelsPut(snapshotIdkeylabelprettydepthxContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#snapshotsLabelsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **snapshotId** | **String** | The unique ID of the Snapshot |  |
| **key** | **String** | The key of the Label |  |
| **label** | [**LabelResource**](labelresource.md) | Modified Label |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**LabelResource**](labelresource.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

