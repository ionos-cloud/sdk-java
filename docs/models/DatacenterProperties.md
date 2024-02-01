

# DatacenterProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cpuArchitecture** | [**List&lt;CpuArchitectureProperties&gt;**](CpuArchitectureProperties.md) | Array of features and CPU families available in a location |  [optional] [readonly] |
| **description** | **String** | A description for the datacenter, such as staging, production. |  [optional] |
| **features** | **List&lt;String&gt;** | List of features supported by the location where this data center is provisioned. |  [optional] [readonly] |
| **ipv6CidrBlock** | **String** | This value is either &#39;null&#39; or contains an automatically-assigned /56 IPv6 CIDR block if IPv6 is enabled on this virtual data center. It can neither be changed nor removed. |  [optional] [readonly] |
| **location** | **String** | The physical location where the datacenter will be created. This will be where all of your servers live. Property cannot be modified after datacenter creation (disallowed in update requests). |  |
| **name** | **String** | The name of the  resource. |  [optional] |
| **secAuthProtection** | **Boolean** | Boolean value representing if the data center requires extra protection, such as two-step verification. |  [optional] |
| **version** | **Integer** | The version of the data center; incremented with every change. |  [optional] [readonly] |


