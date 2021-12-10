

# KubernetesNodePoolProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | A Kubernetes node pool name. Valid Kubernetes node pool name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. |  |
| **datacenterId** | **String** | A valid ID of the data center, to which user has access. |  |
| **nodeCount** | **Integer** | The number of nodes that make up the node pool. |  |
| **cpuFamily** | **String** | A valid CPU family name. |  |
| **coresCount** | **Integer** | The number of cores for the node. |  |
| **ramSize** | **Integer** | The RAM size for the node. Must be set in multiples of 1024 MB, with minimum size is of 2048 MB. |  |
| **availabilityZone** | [**AvailabilityZoneEnum**](#AvailabilityZoneEnum) | The availability zone in which the target VM should be provisioned. |  |
| **storageType** | [**StorageTypeEnum**](#StorageTypeEnum) | The type of hardware for the volume. |  |
| **storageSize** | **Integer** | The size of the volume in GB. The size should be greater than 10GB. |  |
| **k8sVersion** | **String** | The Kubernetes version the nodepool is running. This imposes restrictions on what Kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all Kubernetes versions are viable upgrade targets for all prior versions. |  [optional] |
| **maintenanceWindow** | [**KubernetesMaintenanceWindow**](KubernetesMaintenanceWindow.md) |  |  [optional] |
| **autoScaling** | [**KubernetesAutoScaling**](KubernetesAutoScaling.md) |  |  [optional] |
| **lans** | [**List&lt;KubernetesNodePoolLan&gt;**](KubernetesNodePoolLan.md) | array of additional LANs attached to worker nodes |  [optional] |
| **labels** | **Map&lt;String, String&gt;** | map of labels attached to node pool. |  [optional] |
| **annotations** | **Map&lt;String, String&gt;** | map of annotations attached to node pool. |  [optional] |
| **publicIps** | **List&lt;String&gt;** | Optional array of reserved public IP addresses to be used by the nodes. IPs must be from same location as the data center used for the node pool. The array must contain one extra IP than maximum number of nodes could be. (nodeCount+1 if fixed node amount or maxNodeCount+1 if auto scaling is used) The extra provided IP Will be used during rebuilding of nodes. |  [optional] |
| **availableUpgradeVersions** | **List&lt;String&gt;** | List of available versions for upgrading the node pool. |  [optional] |
| **gatewayIp** | **String** | Public IP address for the gateway performing source NAT for the node pool&#39;s nodes belonging to a private cluster. Required only if the node pool belongs to a private cluster. |  [optional] |



## Enum: AvailabilityZoneEnum

| Name | Value |
| ---- | -----
| AUTO | &quot;AUTO&quot; |
| ZONE_1 | &quot;ZONE_1&quot; |
| ZONE_2 | &quot;ZONE_2&quot; |



## Enum: StorageTypeEnum

| Name | Value |
| ---- | -----
| HDD | &quot;HDD&quot; |
| SSD | &quot;SSD&quot; |


