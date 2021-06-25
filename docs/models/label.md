# Label

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Label is identified using standard URN. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](label.md#TypeEnum) | The type of object that has been created | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/a12429a4804e6e50d2155ea044d46f0bc32a860f/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **metadata** | [**NoStateMetaData**](nostatemetadata.md) |  | \[optional\] |
| **properties** | [**LabelProperties**](labelproperties.md) |  |  |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| LABEL | "label" |

