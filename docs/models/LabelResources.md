

# LabelResources

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique representation for Label as a collection on a resource. |  [optional] [readonly] |
| **type** | [**TypeEnum**](#TypeEnum) | The type of resource within a collection |  [optional] [readonly] |
| **href** | [**URI**](URI.md) | URL to the collection representation (absolute path) |  [optional] [readonly] |
| **items** | [**List&lt;LabelResource&gt;**](LabelResource.md) | Array of items in that collection |  [optional] [readonly] |
| **offset** | [**BigDecimal**](BigDecimal.md) | the offset (if specified in the request) |  [optional] |
| **limit** | [**BigDecimal**](BigDecimal.md) | the limit (if specified in the request) |  [optional] |
| **links** | [**PaginationLinks**](PaginationLinks.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| COLLECTION | &quot;collection&quot; |


