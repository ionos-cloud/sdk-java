# KubernetesClusterForPut

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | The resource's unique identifier. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](kubernetesclusterforput.md#TypeEnum) | The type of object | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/a12429a4804e6e50d2155ea044d46f0bc32a860f/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **metadata** | [**DatacenterElementMetadata**](datacenterelementmetadata.md) |  | \[optional\] |
| **properties** | [**KubernetesClusterPropertiesForPut**](kubernetesclusterpropertiesforput.md) |  |  |
| **entities** | [**KubernetesClusterEntities**](kubernetesclusterentities.md) |  | \[optional\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| K8S | "k8s" |

