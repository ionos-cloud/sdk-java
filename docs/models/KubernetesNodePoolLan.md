

# KubernetesNodePoolLan

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **datacenterId** | **String** | The datacenter ID, requires system privileges, for internal usage only |  [optional] |
| **dhcp** | **Boolean** | Specifies whether the Kubernetes node pool LAN reserves an IP with DHCP. |  [optional] |
| **id** | **Integer** | The LAN ID of an existing LAN at the related data center |  |
| **routes** | [**List&lt;KubernetesNodePoolLanRoutes&gt;**](KubernetesNodePoolLanRoutes.md) | The array of additional LANs attached to worker nodes. |  [optional] |


