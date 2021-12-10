

# ServerProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **templateUuid** | **String** | The ID of the template for creating a CUBE server; the available templates for CUBE servers can be found on the templates resource. |  [optional] |
| **name** | **String** | The name of the  resource. |  [optional] |
| **cores** | **Integer** | The total number of cores for the server. |  |
| **ram** | **Integer** | The memory size for the server in MB, such as 2048. Size must be specified in multiples of 256 MB with a minimum of 256 MB; however, if you set ramHotPlug to TRUE then you must use a minimum of 1024 MB. If you set the RAM size more than 240GB, then ramHotPlug will be set to FALSE and can not be set to TRUE unless RAM size not set to less than 240GB. |  |
| **availabilityZone** | [**AvailabilityZoneEnum**](#AvailabilityZoneEnum) | The availability zone in which the server should be provisioned. |  [optional] |
| **vmState** | [**VmStateEnum**](#VmStateEnum) | Status of the virtual machine. |  [optional] [readonly] |
| **bootCdrom** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
| **bootVolume** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
| **cpuFamily** | **String** | CPU architecture on which server gets provisioned; not all CPU architectures are available in all datacenter regions; available CPU architectures can be retrieved from the datacenter resource. |  [optional] |
| **type** | **String** | server usages: ENTERPRISE or CUBE |  [optional] |



## Enum: AvailabilityZoneEnum

| Name | Value |
| ---- | -----
| AUTO | &quot;AUTO&quot; |
| ZONE_1 | &quot;ZONE_1&quot; |
| ZONE_2 | &quot;ZONE_2&quot; |



## Enum: VmStateEnum

| Name | Value |
| ---- | -----
| NOSTATE | &quot;NOSTATE&quot; |
| RUNNING | &quot;RUNNING&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| PAUSED | &quot;PAUSED&quot; |
| SHUTDOWN | &quot;SHUTDOWN&quot; |
| SHUTOFF | &quot;SHUTOFF&quot; |
| CRASHED | &quot;CRASHED&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |


