

# KubernetesNodeProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **k8sVersion** | **String** | The Kubernetes version running in the node pool. Note that this imposes restrictions on which Kubernetes versions can run in the node pools of a cluster. Also, not all Kubernetes versions are suitable upgrade targets for all earlier versions. |  |
| **name** | **String** | The Kubernetes node name. |  |
| **privateIP** | **String** | The private IP associated with the node. |  [optional] |
| **publicIP** | **String** | The public IP associated with the node. |  [optional] |


