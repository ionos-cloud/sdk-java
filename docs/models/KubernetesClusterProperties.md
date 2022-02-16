

# KubernetesClusterProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | A Kubernetes cluster name. Valid Kubernetes cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. |  |
| **k8sVersion** | **String** | The Kubernetes version the cluster is running. This imposes restrictions on what Kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all Kubernetes versions are viable upgrade targets for all prior versions. |  [optional] |
| **maintenanceWindow** | [**KubernetesMaintenanceWindow**](KubernetesMaintenanceWindow.md) |  |  [optional] |
| **availableUpgradeVersions** | **List&lt;String&gt;** | List of available versions for upgrading the cluster |  [optional] |
| **viableNodePoolVersions** | **List&lt;String&gt;** | List of versions that may be used for node pools under this cluster |  [optional] |
| **_public** | **Boolean** | The indicator if the cluster is public or private. Be aware that setting it to false is currently in beta phase. |  [optional] |
| **apiSubnetAllowList** | **List&lt;String&gt;** | Access to the K8s API server is restricted to these CIDRs. Traffic, internal to the cluster, is not affected by this restriction. If no allowlist is specified, access is not restricted. If an IP without subnet mask is provided, the default value is used: 32 for IPv4 and 128 for IPv6. |  [optional] |
| **s3Buckets** | [**List&lt;S3Bucket&gt;**](S3Bucket.md) | List of S3 bucket configured for K8s usage. For now it contains only an S3 bucket used to store K8s API audit logs |  [optional] |


