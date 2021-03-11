# Label

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Label is identified using standard URN. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](label.md#TypeEnum) | The type of object that has been created | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/8f2023b15d2a11cc163b3abd7b642806c3db5f2c/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **metadata** | [**NoStateMetaData**](nostatemetadata.md) |  | \[optional\] |
| **properties** | [**LabelProperties**](labelproperties.md) |  |  |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| LABEL | "label" |

