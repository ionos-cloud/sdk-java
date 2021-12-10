

# RequestStatusMetadata

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
| **message** | **String** |  |  [optional] |
| **etag** | **String** | Resource&#39;s Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11  Entity Tag is also added as an &#39;ETag response header to requests which don&#39;t use &#39;depth&#39; parameter.  |  [optional] [readonly] |
| **targets** | [**List&lt;RequestTarget&gt;**](RequestTarget.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
| ---- | -----
| QUEUED | &quot;QUEUED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| DONE | &quot;DONE&quot; |
| FAILED | &quot;FAILED&quot; |


