

# KubernetesClusterPropertiesForPost

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **apiSubnetAllowList** | **List&lt;String&gt;** | Access to the K8s API server is restricted to these CIDRs. Intra-cluster traffic is not affected by this restriction. If no AllowList is specified, access is not limited. If an IP is specified without a subnet mask, the default value is 32 for IPv4 and 128 for IPv6. |  [optional] |
| **k8sVersion** | **String** | The Kubernetes version that the cluster is running. This limits which Kubernetes versions can run in a cluster&#39;s node pools. Also, not all Kubernetes versions are suitable upgrade targets for all earlier versions. |  [optional] |
| **maintenanceWindow** | [**KubernetesMaintenanceWindow**](KubernetesMaintenanceWindow.md) |  |  [optional] |
| **name** | **String** | A Kubernetes cluster name. Valid Kubernetes cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. |  |
| **s3Buckets** | [**List&lt;S3Bucket&gt;**](S3Bucket.md) | List of S3 buckets configured for K8s usage. At the moment, it contains only one S3 bucket that is used to store K8s API audit logs. |  [optional] |


