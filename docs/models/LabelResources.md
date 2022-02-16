

# LabelResources

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A unique representation of the label as a resource collection. |  [optional] [readonly] |
| **type** | [**TypeEnum**](#TypeEnum) | The type of resource within a collection. |  [optional] [readonly] |
| **href** | [**URI**](URI.md) | URL to the collection representation (absolute path). |  [optional] [readonly] |
| **items** | [**List&lt;LabelResource&gt;**](LabelResource.md) | Array of items in the collection. |  [optional] [readonly] |
| **offset** | [**BigDecimal**](BigDecimal.md) | The offset (if specified in the request). |  [optional] |
| **limit** | [**BigDecimal**](BigDecimal.md) | The limit (if specified in the request). |  [optional] |
| **links** | [**PaginationLinks**](PaginationLinks.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| COLLECTION | &quot;collection&quot; |


