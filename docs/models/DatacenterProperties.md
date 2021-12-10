

# DatacenterProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the  resource. |  [optional] |
| **description** | **String** | A description for the datacenter, such as staging, production. |  [optional] |
| **location** | **String** | The physical location where the datacenter will be created. This will be where all of your servers live. Property cannot be modified after datacenter creation (disallowed in update requests). |  |
| **version** | **Integer** | The version of the data center; incremented with every change. |  [optional] [readonly] |
| **features** | **List&lt;String&gt;** | List of features supported by the location where this data center is provisioned. |  [optional] [readonly] |
| **secAuthProtection** | **Boolean** | Boolean value representing if the data center requires extra protection, such as two-step verification. |  [optional] |
| **cpuArchitecture** | [**List&lt;CpuArchitectureProperties&gt;**](CpuArchitectureProperties.md) | Array of features and CPU families available in a location |  [optional] [readonly] |


