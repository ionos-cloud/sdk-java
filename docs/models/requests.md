# Requests

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **id** | **String** | The resource's unique identifier | \[optional\] \[readonly\] |
| **type** | [**Type**](type.md) | The type of object that has been created | \[optional\] |
| **href** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/URI.md) | URL to the object representation \(absolute path\) | \[optional\] \[readonly\] |
| **items** | [**List&lt;Request&gt;**](request.md) | Array of items in that collection | \[optional\] \[readonly\] |
| **offset** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/BigDecimal.md) | the offset specified in the request \(or, if none was specified, the default offset of 0\) |  |
| **limit** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/BigDecimal.md) | the limit specified in the request \(or, if none was specified, the default limit of 0\) |  |
| **links** | [**PaginationLinks**](paginationlinks.md) |  |  |

