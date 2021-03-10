

# DatacenterElementMetadata

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **etag** | **String** | Resource&#39;s Entity Tag as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11 . Entity Tag is also added as an &#39;ETag response header to requests which don&#39;t use &#39;depth&#39; parameter.  |  [optional] [readonly] |
| **createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last time the resource was created |  [optional] [readonly] |
| **createdBy** | **String** | The user who created the resource. |  [optional] [readonly] |
| **createdByUserId** | **String** | The user id of the user who has created the resource. |  [optional] [readonly] |
| **lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last time the resource has been modified |  [optional] [readonly] |
| **lastModifiedBy** | **String** | The user who last modified the resource. |  [optional] [readonly] |
| **lastModifiedByUserId** | **String** | The user id of the user who has last modified the resource. |  [optional] [readonly] |
| **state** | [**StateEnum**](#StateEnum) | State of the resource. *AVAILABLE* There are no pending modification requests for this item; *BUSY* There is at least one modification request pending and all following requests will be queued; *INACTIVE* Resource has been de-provisioned; *DEPLOYING* Resource state DEPLOYING - relevant for Kubernetes cluster/nodepool; *ACTIVE* Resource state ACTIVE - relevant for Kubernetes cluster/nodepool; *FAILED* Resource state FAILED - relevant for Kubernetes cluster/nodepool; *SUSPENDED* Resource state SUSPENDED - relevant for Kubernetes cluster/nodepool; *FAILED_SUSPENDED* Resource state FAILED_SUSPENDED - relevant for Kubernetes cluster; *UPDATING* Resource state UPDATING - relevant for Kubernetes cluster/nodepool; *FAILED_UPDATING* Resource state FAILED_UPDATING - relevant for Kubernetes cluster/nodepool; *DESTROYING* Resource state DESTROYING - relevant for Kubernetes cluster; *FAILED_DESTROYING* Resource state FAILED_DESTROYING - relevant for Kubernetes cluster/nodepool; *TERMINATED* Resource state TERMINATED - relevant for Kubernetes cluster/nodepool |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
| ---- | -----
| AVAILABLE | &quot;AVAILABLE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| BUSY | &quot;BUSY&quot; |
| DEPLOYING | &quot;DEPLOYING&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| FAILED | &quot;FAILED&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |
| FAILED_SUSPENDED | &quot;FAILED_SUSPENDED&quot; |
| UPDATING | &quot;UPDATING&quot; |
| FAILED_UPDATING | &quot;FAILED_UPDATING&quot; |
| DESTROYING | &quot;DESTROYING&quot; |
| FAILED_DESTROYING | &quot;FAILED_DESTROYING&quot; |
| TERMINATED | &quot;TERMINATED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |


