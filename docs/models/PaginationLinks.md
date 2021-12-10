

# PaginationLinks

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **prev** | [**URI**](URI.md) | URL (with offset and limit parameters) of the previous page; only present if offset is greater than 0. |  [optional] [readonly] |
| **self** | [**URI**](URI.md) | URL (with offset and limit parameters) of the current page. |  [optional] [readonly] |
| **next** | [**URI**](URI.md) | URL (with offset and limit parameters) of the next page; only present if offset + limit is less than the total number of elements. |  [optional] [readonly] |


