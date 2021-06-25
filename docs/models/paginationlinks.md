# PaginationLinks

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **prev** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/URI.md) | URL \(with offset and limit parameters\) of the previous page; only present if offset is greater than 0 | \[optional\] \[readonly\] |
| **self** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/URI.md) | URL \(with offset and limit parameters\) of the current page | \[optional\] \[readonly\] |
| **next** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/URI.md) | URL \(with offset and limit parameters\) of the next page; only present if offset + limit is less than the total number of elements | \[optional\] \[readonly\] |

