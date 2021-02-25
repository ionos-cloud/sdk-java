# ServerProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that resource | \[optional\] |
| **cores** | **Integer** | The total number of cores for the server |  |
| **ram** | **Integer** | The amount of memory for the server in MB, e.g. 2048. Size must be specified in multiples of 256 MB with a minimum of 256 MB; however, if you set ramHotPlug to TRUE then you must use a minimum of 1024 MB. If you set the RAM size more than 240GB, then ramHotPlug will be set to FALSE and can not be set to TRUE unless RAM size not set to less than 240GB. |  |
| **availabilityZone** | [**AvailabilityZoneEnum**](serverproperties.md#AvailabilityZoneEnum) | The availability zone in which the server should exist | \[optional\] |
| **vmState** | [**VmStateEnum**](serverproperties.md#VmStateEnum) | Status of the virtual Machine | \[optional\] \[readonly\] |
| **bootCdrom** | [**ResourceReference**](resourcereference.md) |  | \[optional\] |
| **bootVolume** | [**ResourceReference**](resourcereference.md) |  | \[optional\] |
| **cpuFamily** | **String** | Cpu family of pserver | \[optional\] |

## Enum: AvailabilityZoneEnum

| Name | Value |
| :--- | :--- |
| AUTO | "AUTO" |
| ZONE\_1 | "ZONE\_1" |
| ZONE\_2 | "ZONE\_2" |

## Enum: VmStateEnum

| Name | Value |
| :--- | :--- |
| NOSTATE | "NOSTATE" |
| RUNNING | "RUNNING" |
| BLOCKED | "BLOCKED" |
| PAUSED | "PAUSED" |
| SHUTDOWN | "SHUTDOWN" |
| SHUTOFF | "SHUTOFF" |
| CRASHED | "CRASHED" |

