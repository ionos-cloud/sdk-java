# Label

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Label is identified using standard URN. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](label.md#TypeEnum) | The type of object that has been created | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **metadata** | [**NoStateMetaData**](nostatemetadata.md) |  | \[optional\] |
| **properties** | [**LabelProperties**](labelproperties.md) |  |  |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| LABEL | "label" |

