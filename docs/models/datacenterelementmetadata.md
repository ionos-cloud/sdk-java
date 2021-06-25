# DatacenterElementMetadata

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **etag** | **String** | Resource's Entity Tag as defined in [http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html\#sec3.11](http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11) . Entity Tag is also added as an 'ETag response header to requests which don't use 'depth' parameter. | \[optional\] \[readonly\] |
| **createdDate** | [**OffsetDateTime**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/OffsetDateTime.md) | The last time the resource was created | \[optional\] \[readonly\] |
| **createdBy** | **String** | The user who created the resource. | \[optional\] \[readonly\] |
| **createdByUserId** | **String** | The user id of the user who has created the resource. | \[optional\] \[readonly\] |
| **lastModifiedDate** | [**OffsetDateTime**](https://github.com/ionos-cloud/sdk-java/tree/651e6f7fe60936a95aad1f01d36232fb4bd0a27e/docs/OffsetDateTime.md) | The last time the resource has been modified | \[optional\] \[readonly\] |
| **lastModifiedBy** | **String** | The user who last modified the resource. | \[optional\] \[readonly\] |
| **lastModifiedByUserId** | **String** | The user id of the user who has last modified the resource. | \[optional\] \[readonly\] |
| **state** | [**StateEnum**](datacenterelementmetadata.md#StateEnum) | State of the resource. _AVAILABLE_ There are no pending modification requests for this item; _BUSY_ There is at least one modification request pending and all following requests will be queued; _INACTIVE_ Resource has been de-provisioned; _DEPLOYING_ Resource state DEPLOYING - relevant for Kubernetes cluster/nodepool; _ACTIVE_ Resource state ACTIVE - relevant for Kubernetes cluster/nodepool; _FAILED_ Resource state FAILED - relevant for Kubernetes cluster/nodepool; _SUSPENDED_ Resource state SUSPENDED - relevant for Kubernetes cluster/nodepool; _FAILED\_SUSPENDED_ Resource state FAILED\_SUSPENDED - relevant for Kubernetes cluster; _UPDATING_ Resource state UPDATING - relevant for Kubernetes cluster/nodepool; _FAILED\_UPDATING_ Resource state FAILED\_UPDATING - relevant for Kubernetes cluster/nodepool; _DESTROYING_ Resource state DESTROYING - relevant for Kubernetes cluster; _FAILED\_DESTROYING_ Resource state FAILED\_DESTROYING - relevant for Kubernetes cluster/nodepool; _TERMINATED_ Resource state TERMINATED - relevant for Kubernetes cluster/nodepool | \[optional\] \[readonly\] |

## Enum: StateEnum

| Name | Value |
| :--- | :--- |
| AVAILABLE | "AVAILABLE" |
| INACTIVE | "INACTIVE" |
| BUSY | "BUSY" |
| DEPLOYING | "DEPLOYING" |
| ACTIVE | "ACTIVE" |
| FAILED | "FAILED" |
| SUSPENDED | "SUSPENDED" |
| FAILED\_SUSPENDED | "FAILED\_SUSPENDED" |
| UPDATING | "UPDATING" |
| FAILED\_UPDATING | "FAILED\_UPDATING" |
| DESTROYING | "DESTROYING" |
| FAILED\_DESTROYING | "FAILED\_DESTROYING" |
| TERMINATED | "TERMINATED" |
| UNKNOWN | "UNKNOWN" |

