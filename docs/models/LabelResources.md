

# LabelResources

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **links** | [**PaginationLinks**](PaginationLinks.md) |  |  [optional] |
| **href** | [**URI**](URI.md) | URL to the collection representation (absolute path). |  [optional] [readonly] |
| **id** | **String** | A unique representation of the label as a resource collection. |  [optional] [readonly] |
| **items** | [**List&lt;LabelResource&gt;**](LabelResource.md) | Array of items in the collection. |  [optional] [readonly] |
| **limit** | [**BigDecimal**](BigDecimal.md) | The limit (if specified in the request). |  [optional] |
| **offset** | [**BigDecimal**](BigDecimal.md) | The offset (if specified in the request). |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | The type of resource within a collection. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| COLLECTION | &quot;collection&quot; |


