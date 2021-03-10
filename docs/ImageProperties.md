

# ImageProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | A name of that resource |  [optional] |
| **description** | **String** | Human readable description |  [optional] |
| **location** | **String** | Location of that image/snapshot.  |  [optional] [readonly] |
| **size** | [**BigDecimal**](BigDecimal.md) | The size of the image in GB |  [optional] [readonly] |
| **cpuHotPlug** | **Boolean** | Is capable of CPU hot plug (no reboot required) |  [optional] |
| **cpuHotUnplug** | **Boolean** | Is capable of CPU hot unplug (no reboot required) |  [optional] |
| **ramHotPlug** | **Boolean** | Is capable of memory hot plug (no reboot required) |  [optional] |
| **ramHotUnplug** | **Boolean** | Is capable of memory hot unplug (no reboot required) |  [optional] |
| **nicHotPlug** | **Boolean** | Is capable of nic hot plug (no reboot required) |  [optional] |
| **nicHotUnplug** | **Boolean** | Is capable of nic hot unplug (no reboot required) |  [optional] |
| **discVirtioHotPlug** | **Boolean** | Is capable of Virt-IO drive hot plug (no reboot required) |  [optional] |
| **discVirtioHotUnplug** | **Boolean** | Is capable of Virt-IO drive hot unplug (no reboot required). This works only for non-Windows virtual Machines. |  [optional] |
| **discScsiHotPlug** | **Boolean** | Is capable of SCSI drive hot plug (no reboot required) |  [optional] |
| **discScsiHotUnplug** | **Boolean** | Is capable of SCSI drive hot unplug (no reboot required). This works only for non-Windows virtual Machines. |  [optional] |
| **licenceType** | [**LicenceTypeEnum**](#LicenceTypeEnum) | OS type of this Image |  |
| **imageType** | [**ImageTypeEnum**](#ImageTypeEnum) | This indicates the type of image |  [optional] [readonly] |
| **_public** | **Boolean** | Indicates if the image is part of the public repository or not |  [optional] [readonly] |



## Enum: LicenceTypeEnum

| Name | Value |
| ---- | -----
| UNKNOWN | &quot;UNKNOWN&quot; |
| WINDOWS | &quot;WINDOWS&quot; |
| WINDOWS2016 | &quot;WINDOWS2016&quot; |
| LINUX | &quot;LINUX&quot; |
| OTHER | &quot;OTHER&quot; |



## Enum: ImageTypeEnum

| Name | Value |
| ---- | -----
| HDD | &quot;HDD&quot; |
| CDROM | &quot;CDROM&quot; |


