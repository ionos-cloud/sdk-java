# KubernetesCluster

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | The resource's unique identifier. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](kubernetescluster.md#TypeEnum) | The type of object | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **metadata** | [**DatacenterElementMetadata**](datacenterelementmetadata.md) |  | \[optional\] |
| **properties** | [**KubernetesClusterProperties**](kubernetesclusterproperties.md) |  |  |
| **entities** | [**KubernetesClusterEntities**](kubernetesclusterentities.md) |  | \[optional\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| K8S | "k8s" |

