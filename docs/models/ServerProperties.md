

# ServerProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | A name of that resource |  [optional] |
| **cores** | **Integer** | The total number of cores for the server |  |
| **ram** | **Integer** | The amount of memory for the server in MB, e.g. 2048. Size must be specified in multiples of 256 MB with a minimum of 256 MB; however, if you set ramHotPlug to TRUE then you must use a minimum of 1024 MB. If you set the RAM size more than 240GB, then ramHotPlug will be set to FALSE and can not be set to TRUE unless RAM size not set to less than 240GB. |  |
| **availabilityZone** | [**AvailabilityZoneEnum**](#AvailabilityZoneEnum) | The availability zone in which the server should exist |  [optional] |
| **vmState** | [**VmStateEnum**](#VmStateEnum) | Status of the virtual Machine |  [optional] [readonly] |
| **bootCdrom** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
| **bootVolume** | [**ResourceReference**](ResourceReference.md) |  |  [optional] |
| **cpuFamily** | **String** | Cpu family of pserver |  [optional] |



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


