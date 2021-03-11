# KubernetesCluster

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | The resource's unique identifier. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](kubernetescluster.md#TypeEnum) | The type of object | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/8f2023b15d2a11cc163b3abd7b642806c3db5f2c/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **metadata** | [**DatacenterElementMetadata**](datacenterelementmetadata.md) |  | \[optional\] |
| **properties** | [**KubernetesClusterProperties**](kubernetesclusterproperties.md) |  |  |
| **entities** | [**KubernetesClusterEntities**](kubernetesclusterentities.md) |  | \[optional\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| K8S | "k8s" |

