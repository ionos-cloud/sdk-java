# KubernetesClusters

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Unique representation for Kubernetes Cluster as a collection on a resource. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](kubernetesclusters.md#TypeEnum) | The type of object that has been created | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/URI.md) | URL to the collection representation \(absolute path\) | \[optional\] \[readonly\] |
| **items** | [**List&lt;KubernetesCluster&gt;**](kubernetescluster.md) | Array of items in that collection | \[optional\] \[readonly\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| COLLECTION | "collection" |

