

# IpBlocks

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The resource&#39;s unique identifier. |  [optional] [readonly] |
| **type** | [**Type**](Type.md) | The type of object that has been created. |  [optional] |
| **href** | [**URI**](URI.md) | URL to the object representation (absolute path). |  [optional] [readonly] |
| **items** | [**List&lt;IpBlock&gt;**](IpBlock.md) | Array of items in the collection. |  [optional] [readonly] |
| **offset** | [**BigDecimal**](BigDecimal.md) | The offset, specified in the request (if not is specified, 0 is used by default). |  [optional] |
| **limit** | [**BigDecimal**](BigDecimal.md) | The limit, specified in the request (if not specified, the endpoint&#39;s default pagination limit is used). |  [optional] |
| **links** | [**PaginationLinks**](PaginationLinks.md) |  |  [optional] |


