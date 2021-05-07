

# KubernetesNodeProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | A Kubernetes Node Name. |  |
| **publicIP** | **String** | A valid public IP. |  [optional] |
| **privateIP** | **String** | A valid private IP. |  [optional] |
| **k8sVersion** | **String** | The kubernetes version in which a nodepool is running. This imposes restrictions on what kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all kubernetes versions are viable upgrade targets for all prior versions. |  |


