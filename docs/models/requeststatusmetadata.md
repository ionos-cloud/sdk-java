# RequestStatusMetadata

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **status** | [**StatusEnum**](requeststatusmetadata.md#StatusEnum) |  | \[optional\] |
| **message** | **String** |  | \[optional\] |
| **etag** | **String** | Resource's Entity Tag as defined in [http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html\#sec3.11](http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11) . Entity Tag is also added as an 'ETag response header to requests which don't use 'depth' parameter. | \[optional\] \[readonly\] |
| **targets** | [**List&lt;RequestTarget&gt;**](requesttarget.md) |  | \[optional\] |

## Enum: StatusEnum

| Name | Value |
| :--- | :--- |
| QUEUED | "QUEUED" |
| RUNNING | "RUNNING" |
| DONE | "DONE" |
| FAILED | "FAILED" |

