

# KubernetesClusters

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A unique representation of the Kubernetes cluster as a resource collection. |  [optional] [readonly] |
| **type** | [**TypeEnum**](#TypeEnum) | The type of resource within a collection. |  [optional] [readonly] |
| **href** | [**URI**](URI.md) | URL to the collection representation (absolute path). |  [optional] [readonly] |
| **items** | [**List&lt;KubernetesCluster&gt;**](KubernetesCluster.md) | Array of items in the collection. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| COLLECTION | &quot;collection&quot; |


