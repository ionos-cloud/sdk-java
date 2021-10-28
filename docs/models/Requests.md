

# Requests

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The resource&#39;s unique identifier |  [optional] [readonly] |
| **type** | [**Type**](Type.md) | The type of object that has been created |  [optional] |
| **href** | [**URI**](URI.md) | URL to the object representation (absolute path) |  [optional] [readonly] |
| **items** | [**List&lt;Request&gt;**](Request.md) | Array of items in that collection |  [optional] [readonly] |
| **offset** | [**BigDecimal**](BigDecimal.md) | the offset specified in the request (or, if none was specified, the default offset of 0) |  |
| **limit** | [**BigDecimal**](BigDecimal.md) | the limit specified in the request (or, if none was specified use the endpoint&#39;s default pagination limit) |  |
| **links** | [**PaginationLinks**](PaginationLinks.md) |  |  |


