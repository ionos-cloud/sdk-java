# Requests

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | The resource's unique identifier | \[optional\] \[readonly\] |
| **type** | [**Type**](type.md) | The type of object that has been created | \[optional\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/8f2023b15d2a11cc163b3abd7b642806c3db5f2c/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **items** | [**List&lt;Request&gt;**](request.md) | Array of items in that collection | \[optional\] \[readonly\] |
| **offset** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/8f2023b15d2a11cc163b3abd7b642806c3db5f2c/docs/BigDecimal.md) | the offset specified in the request \(or, if none was specified, the default offset of 0\) |  |
| **limit** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/8f2023b15d2a11cc163b3abd7b642806c3db5f2c/docs/BigDecimal.md) | the limit specified in the request \(or, if none was specified, the default limit of 0\) |  |
| **links** | [**PaginationLinks**](paginationlinks.md) |  |  |

