

# KubernetesNodeMetadata

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the resource was created. |  [optional] [readonly] |
| **etag** | **String** | The resource entity tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11  Entity tags are also added as &#39;ETag&#39; response headers to requests that do not use the &#39;depth&#39; parameter. |  [optional] [readonly] |
| **lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the resource was last modified. |  [optional] [readonly] |
| **lastSoftwareUpdatedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when the software on the node was last updated. |  [optional] [readonly] |
| **state** | [**StateEnum**](#StateEnum) | The resource state. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
| ---- | -----
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| READY | &quot;READY&quot; |
| TERMINATING | &quot;TERMINATING&quot; |
| REBUILDING | &quot;REBUILDING&quot; |
| BUSY | &quot;BUSY&quot; |


