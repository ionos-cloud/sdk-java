# CHANGELOG

## 6.1.4 \(August 29th, 2022\)
* changed manageDbaas to manageDDaaS on GroupProperties

## 6.1.3 \(July 14th, 2022\)
* added manageDbaas to GroupProperties
## 6.1.2 \(July 4th, 2022\)

### Features
* added new optional query parameter to **datacentersServersDelete** method: `deleteVolumes` *(If true, all attached storage volumes will also be deleted)*
* new parameter on **VolumeProperties** model: `bootOrder` *(determines whether the volume will be used as a boot volume)*

## 6.1.1 \(July 3rd, 2022\)
* ❗ Important: This release is unusable, due to some private Kubernetes parameters that are not available at the moment of the release.

## 6.1.0 \(June 16th, 2022\)

### Enhancements:

* added Application Load Balancer and Target Group, 18 new models and 2 new apis
* added Token Authentication

## v5.1.0-SNAPSHOT - May 11, 2021

* Aligning with the latest Ionos Cloud Api changes
* Deserialization of API Enum responses relaxed in order to accept possibly new entries without
  crashing the client app using the sdk
* `ImageAliases` and `CloudInit` attributes added to the `ImageProperties` model
* `Public` and `GatewayIp` attributes added to the `KubernetesClusterProperties` model
* `k8sNodePoolUuid` and `k8sClusterUuid` were added to the `IpConsumer` model
* new filters supported in `RequestApi`: `filter.createdDate`, `filter.createdBy`, `filter.etag`,
`filter.requestStatus`, `filter.method`, `filter.headers`, `filter.body`, `filter.url`

* The following data types where changed for user operations:
  - `User` type was replaced by `UserPost` in POST operations
  - `User` type was replaced by `UserPut` in PUT operations

* The following data types where changed for k8s cluster operations:
  - `KubernetesCluster` type was replaced by `KubernetesClusterForPost` in POST operations
  - `KubernetesCluster` type was replaced by `KubernetesClusterForPut` in PUT operations

* The following data types where changed for k8s nodepool operations:
  - `KubernetesNodePool` type was replaced by `KubernetesNodePoolForPost` in POST operations
  - `KubernetesNodePool` type was replaced by `KubernetesNodePoolForPUT` in PUT operations both as input and as response type
