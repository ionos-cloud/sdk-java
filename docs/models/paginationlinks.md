# PaginationLinks

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **prev** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/a12429a4804e6e50d2155ea044d46f0bc32a860f/docs/URI.md) | URL \(with offset and limit parameters\) of the previous page; only present if offset is greater than 0 | \[optional\] \[readonly\] |
| **self** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/a12429a4804e6e50d2155ea044d46f0bc32a860f/docs/URI.md) | URL \(with offset and limit parameters\) of the current page | \[optional\] \[readonly\] |
| **next** | [**URI**](https://github.com/ionos-cloud/sdk-java/tree/a12429a4804e6e50d2155ea044d46f0bc32a860f/docs/URI.md) | URL \(with offset and limit parameters\) of the next page; only present if offset + limit is less than the total number of elements | \[optional\] \[readonly\] |

