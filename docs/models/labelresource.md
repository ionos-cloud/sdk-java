# LabelResource

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Label on a resource is identified using label key. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](labelresource.md#TypeEnum) | The type of object that has been created | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/a12429a4804e6e50d2155ea044d46f0bc32a860f/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **metadata** | [**NoStateMetaData**](nostatemetadata.md) |  | \[optional\] |
| **properties** | [**LabelResourceProperties**](labelresourceproperties.md) |  |  |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| LABEL | "label" |

