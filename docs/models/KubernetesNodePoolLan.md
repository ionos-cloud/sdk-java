

# KubernetesNodePoolLan

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **Integer** | The LAN ID of an existing LAN at the related datacenter |  |
| **dhcp** | **Boolean** | Indicates if the Kubernetes node pool LAN will reserve an IP using DHCP. |  [optional] |
| **routes** | [**List&lt;KubernetesNodePoolLanRoutes&gt;**](KubernetesNodePoolLanRoutes.md) | array of additional LANs attached to worker nodes |  [optional] |


