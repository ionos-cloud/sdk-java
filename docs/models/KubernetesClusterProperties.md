

# KubernetesClusterProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **apiSubnetAllowList** | **List&lt;String&gt;** | Access to the K8s API server is restricted to these CIDRs. Traffic, internal to the cluster, is not affected by this restriction. If no allowlist is specified, access is not restricted. If an IP without subnet mask is provided, the default value is used: 32 for IPv4 and 128 for IPv6. |  [optional] |
| **availableUpgradeVersions** | **List&lt;String&gt;** | List of available versions for upgrading the cluster |  [optional] |
| **k8sVersion** | **String** | The Kubernetes version the cluster is running. This imposes restrictions on what Kubernetes versions can be run in a cluster&#39;s nodepools. Additionally, not all Kubernetes versions are viable upgrade targets for all prior versions. |  [optional] |
| **location** | **String** | The location of the cluster if the cluster is private. This property is immutable. The location must be enabled for your contract or you must have a Datacenter within that location. This attribute is mandatory if the cluster is private. |  [optional] |
| **maintenanceWindow** | [**KubernetesMaintenanceWindow**](KubernetesMaintenanceWindow.md) |  |  [optional] |
| **name** | **String** | A Kubernetes cluster name. Valid Kubernetes cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. |  |
| **natGatewayIp** | **String** | The nat gateway IP of the cluster if the cluster is private. This property is immutable. Must be a reserved IP in the same location as the cluster&#39;s location. This attribute is mandatory if the cluster is private. |  [optional] |
| **nodeSubnet** | **String** | The node subnet of the cluster, if the cluster is private. This property is optional and immutable. Must be a valid CIDR notation for an IPv4 network prefix of 16 bits length. |  [optional] |
| **_public** | **Boolean** | The indicator if the cluster is public or private. Be aware that setting it to false is currently in beta phase. |  [optional] |
| **s3Buckets** | [**List&lt;S3Bucket&gt;**](S3Bucket.md) | List of S3 bucket configured for K8s usage. For now it contains only an S3 bucket used to store K8s API audit logs |  [optional] |
| **viableNodePoolVersions** | **List&lt;String&gt;** | List of versions that may be used for node pools under this cluster |  [optional] |


