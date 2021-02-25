# LabelResources

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Unique representation for Label as a collection on a resource. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](labelresources.md#TypeEnum) | The type of resource within a collection | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/URI.md) | URL to the collection representation \(absolute path\) | \[optional\] \[readonly\] |
| **items** | [**List&lt;LabelResource&gt;**](labelresource.md) | Array of items in that collection | \[optional\] \[readonly\] |
| **offset** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/BigDecimal.md) | the offset \(if specified in the request\) | \[optional\] |
| **limit** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/BigDecimal.md) | the limit \(if specified in the request\) | \[optional\] |
| **links** | [**PaginationLinks**](paginationlinks.md) |  | \[optional\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| LABEL | "label" |

