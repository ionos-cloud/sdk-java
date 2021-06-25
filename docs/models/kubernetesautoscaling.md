# KubernetesAutoScaling

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **minNodeCount** | **Integer** | The minimum number of worker nodes that the managed node group can scale in. Should be set together with 'maxNodeCount'. Value for this attribute must be greater than equal to 1 and less than equal to maxNodeCount. |  |
| **maxNodeCount** | **Integer** | The maximum number of worker nodes that the managed node pool can scale-out. Should be set together with 'minNodeCount'. Value for this attribute must be greater than equal to 1 and minNodeCount. |  |

