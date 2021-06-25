# LabelResources

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | Unique representation for Label as a collection on a resource. | \[optional\] \[readonly\] |
| **type** | [**TypeEnum**](labelresources.md#TypeEnum) | The type of resource within a collection | \[optional\] \[readonly\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/URI.md) | URL to the collection representation \(absolute path\) | \[optional\] \[readonly\] |
| **items** | [**List&lt;LabelResource&gt;**](labelresource.md) | Array of items in that collection | \[optional\] \[readonly\] |
| **offset** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/BigDecimal.md) | the offset \(if specified in the request\) | \[optional\] |
| **limit** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/BigDecimal.md) | the limit \(if specified in the request\) | \[optional\] |
| **links** | [**PaginationLinks**](paginationlinks.md) |  | \[optional\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| COLLECTION | "collection" |

