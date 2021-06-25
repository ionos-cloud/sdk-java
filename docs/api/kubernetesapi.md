# KubernetesApi

## KubernetesApi

All URIs are relative to [https://api.ionos.com/cloudapi/v6](https://api.ionos.com/cloudapi/v6)

| Method | HTTP request | Description |
| :--- | :--- | :--- |
| [**k8sDelete**](kubernetesapi.md#k8sdelete) | **DELETE** /k8s/{k8sClusterId} | Delete Kubernetes Cluster |
| [**k8sFindByClusterId**](kubernetesapi.md#k8sfindbyclusterid) | **GET** /k8s/{k8sClusterId} | Retrieve Kubernetes Cluster |
| [**k8sGet**](kubernetesapi.md#k8sget) | **GET** /k8s | List Kubernetes Clusters |
| [**k8sKubeconfigGet**](kubernetesapi.md#k8skubeconfigget) | **GET** /k8s/{k8sClusterId}/kubeconfig | Retrieve Kubernetes Configuration File |
| [**k8sNodepoolsDelete**](kubernetesapi.md#k8snodepoolsdelete) | **DELETE** /k8s/{k8sClusterId}/nodepools/{nodepoolId} | Delete Kubernetes Node Pool |
| [**k8sNodepoolsFindById**](kubernetesapi.md#k8snodepoolsfindbyid) | **GET** /k8s/{k8sClusterId}/nodepools/{nodepoolId} | Retrieve Kubernetes Node Pool |
| [**k8sNodepoolsGet**](kubernetesapi.md#k8snodepoolsget) | **GET** /k8s/{k8sClusterId}/nodepools | List Kubernetes Node Pools |
| [**k8sNodepoolsNodesDelete**](kubernetesapi.md#k8snodepoolsnodesdelete) | **DELETE** /k8s/{k8sClusterId}/nodepools/{nodepoolId}/nodes/{nodeId} | Delete Kubernetes node |
| [**k8sNodepoolsNodesFindById**](kubernetesapi.md#k8snodepoolsnodesfindbyid) | **GET** /k8s/{k8sClusterId}/nodepools/{nodepoolId}/nodes/{nodeId} | Retrieve Kubernetes node |
| [**k8sNodepoolsNodesGet**](kubernetesapi.md#k8snodepoolsnodesget) | **GET** /k8s/{k8sClusterId}/nodepools/{nodepoolId}/nodes | Retrieve Kubernetes nodes. |
| [**k8sNodepoolsNodesReplacePost**](kubernetesapi.md#k8snodepoolsnodesreplacepost) | **POST** /k8s/{k8sClusterId}/nodepools/{nodepoolId}/nodes/{nodeId}/replace | Recreate the Kubernetes node |
| [**k8sNodepoolsPost**](kubernetesapi.md#k8snodepoolspost) | **POST** /k8s/{k8sClusterId}/nodepools | Create a Kubernetes Node Pool |
| [**k8sNodepoolsPut**](kubernetesapi.md#k8snodepoolsput) | **PUT** /k8s/{k8sClusterId}/nodepools/{nodepoolId} | Modify Kubernetes Node Pool |
| [**k8sPost**](kubernetesapi.md#k8spost) | **POST** /k8s | Create Kubernetes Cluster |
| [**k8sPut**](kubernetesapi.md#k8sput) | **PUT** /k8s/{k8sClusterId} | Modify Kubernetes Cluster |
| [**k8sVersionsDefaultGet**](kubernetesapi.md#k8sversionsdefaultget) | **GET** /k8s/versions/default | Retrieve the current default kubernetes version for clusters and nodepools. |
| [**k8sVersionsGet**](kubernetesapi.md#k8sversionsget) | **GET** /k8s/versions | Retrieve available Kubernetes versions |

## **k8sDelete**

> Object k8sDelete\(k8sClusterId, pretty, depth, xContractNumber\)

Delete Kubernetes Cluster

This will remove a Kubernetes Cluster.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.k8sDelete(k8sClusterId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sDelete");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sFindByClusterId**

> KubernetesCluster k8sFindByClusterId\(k8sClusterId, pretty, depth, xContractNumber\)

Retrieve Kubernetes Cluster

This will retrieve a single Kubernetes Cluster.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesCluster result = apiInstance.k8sFindByClusterId(k8sClusterId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sFindByClusterId");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesCluster**](../models/kubernetescluster.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sGet**

> KubernetesClusters k8sGet\(pretty, depth, xContractNumber\)

List Kubernetes Clusters

You can retrieve a list of all kubernetes clusters associated with a contract

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesClusters result = apiInstance.k8sGet(pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sGet");
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

[**KubernetesClusters**](../models/kubernetesclusters.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sKubeconfigGet**

> String k8sKubeconfigGet\(k8sClusterId, pretty, depth, xContractNumber\)

Retrieve Kubernetes Configuration File

You can retrieve kubernetes configuration file in YAML or JSON format for the kubernetes cluster. You can send the Accept header accordingly. Default Accept header is application/yaml

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      String result = apiInstance.k8sKubeconfigGet(k8sClusterId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sKubeconfigGet");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**String**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/yaml, application/x-yaml, application/json

## **k8sNodepoolsDelete**

> Object k8sNodepoolsDelete\(k8sClusterId, nodepoolId, pretty, depth, xContractNumber\)

Delete Kubernetes Node Pool

This will remove a Kubernetes Node Pool.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    String nodepoolId = "nodepoolId_example"; // String | The unique ID of the Kubernetes Node Pool
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.k8sNodepoolsDelete(k8sClusterId, nodepoolId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsDelete");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **nodepoolId** | **String** | The unique ID of the Kubernetes Node Pool |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sNodepoolsFindById**

> KubernetesNodePool k8sNodepoolsFindById\(k8sClusterId, nodepoolId, pretty, depth, xContractNumber\)

Retrieve Kubernetes Node Pool

You can retrieve a single Kubernetes Node Pool.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    String nodepoolId = "nodepoolId_example"; // String | The unique ID of the Kubernetes Node Pool
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesNodePool result = apiInstance.k8sNodepoolsFindById(k8sClusterId, nodepoolId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsFindById");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **nodepoolId** | **String** | The unique ID of the Kubernetes Node Pool |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesNodePool**](../models/kubernetesnodepool.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sNodepoolsGet**

> KubernetesNodePools k8sNodepoolsGet\(k8sClusterId, pretty, depth, xContractNumber\)

List Kubernetes Node Pools

You can retrieve a list of all kubernetes node pools part of kubernetes cluster

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesNodePools result = apiInstance.k8sNodepoolsGet(k8sClusterId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsGet");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesNodePools**](../models/kubernetesnodepools.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sNodepoolsNodesDelete**

> Object k8sNodepoolsNodesDelete\(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber\)

Delete Kubernetes node

This will remove a Kubernetes node.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    String nodepoolId = "nodepoolId_example"; // String | The unique ID of the Kubernetes Node Pool
    String nodeId = "nodeId_example"; // String | The unique ID of the Kubernetes node
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.k8sNodepoolsNodesDelete(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsNodesDelete");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **nodepoolId** | **String** | The unique ID of the Kubernetes Node Pool |  |
| **nodeId** | **String** | The unique ID of the Kubernetes node |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sNodepoolsNodesFindById**

> KubernetesNode k8sNodepoolsNodesFindById\(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber\)

Retrieve Kubernetes node

You can retrieve a single Kubernetes Node.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    String nodepoolId = "nodepoolId_example"; // String | The unique ID of the Kubernetes Node Pool
    String nodeId = "nodeId_example"; // String | The unique ID of the Kubernetes Node.
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesNode result = apiInstance.k8sNodepoolsNodesFindById(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsNodesFindById");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **nodepoolId** | **String** | The unique ID of the Kubernetes Node Pool |  |
| **nodeId** | **String** | The unique ID of the Kubernetes Node. |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesNode**](../models/kubernetesnode.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sNodepoolsNodesGet**

> KubernetesNodes k8sNodepoolsNodesGet\(k8sClusterId, nodepoolId, pretty, depth, xContractNumber\)

Retrieve Kubernetes nodes.

You can retrieve all nodes of Kubernetes Node Pool.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    String nodepoolId = "nodepoolId_example"; // String | The unique ID of the Kubernetes Node Pool
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesNodes result = apiInstance.k8sNodepoolsNodesGet(k8sClusterId, nodepoolId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsNodesGet");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **nodepoolId** | **String** | The unique ID of the Kubernetes Node Pool |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesNodes**](../models/kubernetesnodes.md)

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sNodepoolsNodesReplacePost**

> Object k8sNodepoolsNodesReplacePost\(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber\)

Recreate the Kubernetes node

You can recreate a single Kubernetes Node. Managed Kubernetes starts a process which based on the nodepool's template creates & configures a new node, waits for status \"ACTIVE\", and migrates all the pods from the faulty node, deleting it once empty. While this operation occurs, the nodepool will have an extra billable \"ACTIVE\" node.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    String nodepoolId = "nodepoolId_example"; // String | The unique ID of the Kubernetes Node Pool
    String nodeId = "nodeId_example"; // String | The unique ID of the Kubernetes Node.
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      Object result = apiInstance.k8sNodepoolsNodesReplacePost(k8sClusterId, nodepoolId, nodeId, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsNodesReplacePost");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **nodepoolId** | **String** | The unique ID of the Kubernetes Node Pool |  |
| **nodeId** | **String** | The unique ID of the Kubernetes Node. |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

**Object**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sNodepoolsPost**

> KubernetesNodePool k8sNodepoolsPost\(k8sClusterId, kubernetesNodePool, pretty, depth, xContractNumber\)

Create a Kubernetes Node Pool

This will create a new Kubernetes Node Pool inside a Kubernetes Cluster.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    KubernetesNodePool kubernetesNodePool = new KubernetesNodePool(); // KubernetesNodePool | Details of the Kubernetes Node Pool
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesNodePool result = apiInstance.k8sNodepoolsPost(k8sClusterId, kubernetesNodePool, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsPost");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **kubernetesNodePool** | [**KubernetesNodePool**](../models/kubernetesnodepool.md) | Details of the Kubernetes Node Pool |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesNodePool**](../models/kubernetesnodepool.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **k8sNodepoolsPut**

> KubernetesNodePoolForPut k8sNodepoolsPut\(k8sClusterId, nodepoolId, kubernetesNodePool, pretty, depth, xContractNumber\)

Modify Kubernetes Node Pool

This will modify the Kubernetes Node Pool.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    String nodepoolId = "nodepoolId_example"; // String | The unique ID of the Kubernetes Node Pool
    KubernetesNodePool kubernetesNodePool = new KubernetesNodePool(); // KubernetesNodePool | Details of the Kubernetes Node Pool
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesNodePoolForPut result = apiInstance.k8sNodepoolsPut(k8sClusterId, nodepoolId, kubernetesNodePool, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sNodepoolsPut");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **nodepoolId** | **String** | The unique ID of the Kubernetes Node Pool |  |
| **kubernetesNodePool** | [**KubernetesNodePool**](../models/kubernetesnodepool.md) | Details of the Kubernetes Node Pool |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesNodePoolForPut**](../models/kubernetesnodepoolforput.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **k8sPost**

> KubernetesCluster k8sPost\(kubernetesCluster, pretty, depth, xContractNumber\)

Create Kubernetes Cluster

This will create a new Kubernetes Cluster.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    KubernetesClusterForPost kubernetesCluster = new KubernetesClusterForPost(); // KubernetesClusterForPost | Details of the Kubernetes Cluster
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesCluster result = apiInstance.k8sPost(kubernetesCluster, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sPost");
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
| **kubernetesCluster** | [**KubernetesClusterForPost**](../models/kubernetesclusterforpost.md) | Details of the Kubernetes Cluster |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesCluster**](../models/kubernetescluster.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **k8sPut**

> KubernetesCluster k8sPut\(k8sClusterId, kubernetesCluster, pretty, depth, xContractNumber\)

Modify Kubernetes Cluster

This will modify the Kubernetes Cluster.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    String k8sClusterId = "k8sClusterId_example"; // String | The unique ID of the Kubernetes Cluster
    KubernetesClusterForPut kubernetesCluster = new KubernetesClusterForPut(); // KubernetesClusterForPut | Details of of the Kubernetes Cluster
    Boolean pretty = true; // Boolean | Controls whether response is pretty-printed (with indentation and new lines)
    Integer depth = 0; // Integer | Controls the details depth of response objects.  Eg. GET /datacenters/[ID]  - depth=0: only direct properties are included. Children (servers etc.) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on
    Integer xContractNumber = 56; // Integer | Users having more than 1 contract need to provide contract number, against which all API requests should be executed
    try {
      KubernetesCluster result = apiInstance.k8sPut(k8sClusterId, kubernetesCluster, pretty, depth, xContractNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sPut");
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
| **k8sClusterId** | **String** | The unique ID of the Kubernetes Cluster |  |
| **kubernetesCluster** | [**KubernetesClusterForPut**](../models/kubernetesclusterforput.md) | Details of of the Kubernetes Cluster |  |
| **pretty** | **Boolean** | Controls whether response is pretty-printed \(with indentation and new lines\) | \[optional\] \[default to true\] |
| **depth** | **Integer** | Controls the details depth of response objects.  Eg. GET /datacenters/\[ID\]  - depth=0: only direct properties are included. Children \(servers etc.\) are not included  - depth=1: direct properties and children references are included  - depth=2: direct properties and children properties are included  - depth=3: direct properties and children properties and children's children are included  - depth=... and so on | \[optional\] \[default to 0\] |
| **xContractNumber** | **Integer** | Users having more than 1 contract need to provide contract number, against which all API requests should be executed | \[optional\] |

### Return type

[**KubernetesCluster**](../models/kubernetescluster.md)

### HTTP request headers

* **Content-Type**: application/json
* **Accept**: application/json

## **k8sVersionsDefaultGet**

> String k8sVersionsDefaultGet\(\)

Retrieve the current default kubernetes version for clusters and nodepools.

You can retrieve the current default kubernetes version for clusters and nodepools.

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    try {
      String result = apiInstance.k8sVersionsDefaultGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sVersionsDefaultGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

## **k8sVersionsGet**

> List&lt;String&gt; k8sVersionsGet\(\)

Retrieve available Kubernetes versions

You can retrieve a list of available kubernetes versions

### Example

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.KubernetesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    KubernetesApi apiInstance = new KubernetesApi(defaultClient);
    try {
      List<String> result = apiInstance.k8sVersionsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KubernetesApi#k8sVersionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### HTTP request headers

* **Content-Type**: Not defined
* **Accept**: application/json

