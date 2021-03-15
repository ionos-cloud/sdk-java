

# KubernetesNodeMetadata

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **etag** | **String** | Resource&#39;s Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11 . Entity Tag is also added as an &#39;ETag response header to requests which don&#39;t use &#39;depth&#39; parameter.  |  [optional] [readonly] |
| **createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last time the resource was created |  [optional] [readonly] |
| **lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last time the resource has been modified |  [optional] [readonly] |
| **state** | [**StateEnum**](#StateEnum) | State of the resource. |  [optional] [readonly] |
| **lastSoftwareUpdatedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last time the software updated on node. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
| ---- | -----
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| READY | &quot;READY&quot; |
| TERMINATING | &quot;TERMINATING&quot; |
| REBUILDING | &quot;REBUILDING&quot; |
| BUSY | &quot;BUSY&quot; |


