# Labels

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Unique representation for Label as a collection of resource. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](labels.md#TypeEnum) | The type of resource within a collection | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/URI.md) | URL to the collection representation \(absolute path\) | \[optional\] \[readonly\] |
| **items** | [**List&lt;Label&gt;**](label.md) | Array of items in that collection | \[optional\] \[readonly\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| LABEL | "label" |

