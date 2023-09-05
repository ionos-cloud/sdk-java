

# ImageProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cloudInit** | [**CloudInitEnum**](#CloudInitEnum) | Cloud init compatibility. |  [optional] |
| **cpuHotPlug** | **Boolean** | Hot-plug capable CPU (no reboot required). |  [optional] |
| **cpuHotUnplug** | **Boolean** | Hot-unplug capable CPU (no reboot required). |  [optional] |
| **description** | **String** | Human-readable description. |  [optional] |
| **discScsiHotPlug** | **Boolean** | Hot-plug capable SCSI drive (no reboot required). |  [optional] |
| **discScsiHotUnplug** | **Boolean** | Hot-unplug capable SCSI drive (no reboot required). Not supported with Windows VMs. |  [optional] |
| **discVirtioHotPlug** | **Boolean** | Hot-plug capable Virt-IO drive (no reboot required). |  [optional] |
| **discVirtioHotUnplug** | **Boolean** | Hot-unplug capable Virt-IO drive (no reboot required). Not supported with Windows VMs. |  [optional] |
| **imageAliases** | **List&lt;String&gt;** | List of image aliases mapped for this image |  [optional] [readonly] |
| **imageType** | [**ImageTypeEnum**](#ImageTypeEnum) | The image type. |  [optional] [readonly] |
| **licenceType** | [**LicenceTypeEnum**](#LicenceTypeEnum) | The OS type of this image. |  |
| **location** | **String** | The location of this image/snapshot. |  [optional] [readonly] |
| **name** | **String** | The resource name. |  [optional] |
| **nicHotPlug** | **Boolean** | Hot-plug capable NIC (no reboot required). |  [optional] |
| **nicHotUnplug** | **Boolean** | Hot-unplug capable NIC (no reboot required). |  [optional] |
| **_public** | **Boolean** | Indicates whether the image is part of a public repository. |  [optional] [readonly] |
| **ramHotPlug** | **Boolean** | Hot-plug capable RAM (no reboot required). |  [optional] |
| **ramHotUnplug** | **Boolean** | Hot-unplug capable RAM (no reboot required). |  [optional] |
| **size** | [**BigDecimal**](BigDecimal.md) | The image size in GB. |  [optional] [readonly] |



## Enum: CloudInitEnum

| Name | Value |
| ---- | -----
| NONE | &quot;NONE&quot; |
| V1 | &quot;V1&quot; |



## Enum: ImageTypeEnum

| Name | Value |
| ---- | -----
| HDD | &quot;HDD&quot; |
| CDROM | &quot;CDROM&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: LicenceTypeEnum

| Name | Value |
| ---- | -----
| UNKNOWN | &quot;UNKNOWN&quot; |
| WINDOWS | &quot;WINDOWS&quot; |
| WINDOWS2016 | &quot;WINDOWS2016&quot; |
| WINDOWS2022 | &quot;WINDOWS2022&quot; |
| RHEL | &quot;RHEL&quot; |
| LINUX | &quot;LINUX&quot; |
| OTHER | &quot;OTHER&quot; |


