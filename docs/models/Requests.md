

# Requests

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **links** | [**PaginationLinks**](PaginationLinks.md) |  |  |
| **href** | [**URI**](URI.md) | URL to the object representation (absolute path). |  [optional] [readonly] |
| **id** | **String** | The resource&#39;s unique identifier. |  [optional] [readonly] |
| **items** | [**List&lt;Request&gt;**](Request.md) | Array of items in the collection. |  [optional] [readonly] |
| **limit** | [**BigDecimal**](BigDecimal.md) | The limit, specified in the request (if not specified, the endpoint&#39;s default pagination limit is used). |  |
| **offset** | [**BigDecimal**](BigDecimal.md) | The offset, specified in the request (if not is specified, 0 is used by default). |  |
| **type** | [**Type**](Type.md) | The type of object that has been created. |  [optional] |


