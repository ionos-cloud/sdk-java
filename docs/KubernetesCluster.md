

# KubernetesCluster

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The resource&#39;s unique identifier. |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | The type of object |  [optional] [readonly]
**href** | [**URI**](URI.md) | URL to the object representation (absolute path) |  [optional] [readonly]
**metadata** | [**DatacenterElementMetadata**](DatacenterElementMetadata.md) |  |  [optional]
**properties** | [**KubernetesClusterProperties**](KubernetesClusterProperties.md) |  | 
**entities** | [**KubernetesClusterEntities**](KubernetesClusterEntities.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
K8S | &quot;k8s&quot;



