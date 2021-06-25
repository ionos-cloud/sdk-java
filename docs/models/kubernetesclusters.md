# KubernetesClusters

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Unique representation for Kubernetes Cluster as a collection on a resource. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](kubernetesclusters.md#TypeEnum) | The type of resource within a collection | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/a12429a4804e6e50d2155ea044d46f0bc32a860f/docs/URI.md) | URL to the collection representation \(absolute path\) | \[optional\] \[readonly\] |
| **items** | [**List&lt;KubernetesCluster&gt;**](kubernetescluster.md) | Array of items in that collection | \[optional\] \[readonly\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| COLLECTION | "collection" |

