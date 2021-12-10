

# ImageProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the  resource. |  [optional] |
| **description** | **String** | Human-readable description. |  [optional] |
| **location** | **String** | Location of that image/snapshot.  |  [optional] [readonly] |
| **size** | [**BigDecimal**](BigDecimal.md) | The size of the image in GB. |  [optional] [readonly] |
| **cpuHotPlug** | **Boolean** | Hot-plug capable CPU (no reboot required). |  [optional] |
| **cpuHotUnplug** | **Boolean** | Hot-unplug capable CPU (no reboot required). |  [optional] |
| **ramHotPlug** | **Boolean** | Hot-plug capable RAM (no reboot required). |  [optional] |
| **ramHotUnplug** | **Boolean** | Hot-unplug capable RAM (no reboot required). |  [optional] |
| **nicHotPlug** | **Boolean** | Hot-plug capable NIC (no reboot required). |  [optional] |
| **nicHotUnplug** | **Boolean** | Hot-unplug capable NIC (no reboot required). |  [optional] |
| **discVirtioHotPlug** | **Boolean** | Hot-plug capable Virt-IO drive (no reboot required). |  [optional] |
| **discVirtioHotUnplug** | **Boolean** | Hot-unplug capable Virt-IO drive (no reboot required). Not supported with Windows VMs. |  [optional] |
| **discScsiHotPlug** | **Boolean** | Hot-plug capable SCSI drive (no reboot required). |  [optional] |
| **discScsiHotUnplug** | **Boolean** | Hot-unplug capable SCSI drive (no reboot required). Not supported with Windows VMs. |  [optional] |
| **licenceType** | [**LicenceTypeEnum**](#LicenceTypeEnum) | OS type for this image. |  |
| **imageType** | [**ImageTypeEnum**](#ImageTypeEnum) | The image type. |  [optional] [readonly] |
| **_public** | **Boolean** | Indicates whether the image is part of a public repository. |  [optional] [readonly] |
| **imageAliases** | **List&lt;String&gt;** | List of image aliases mapped for this Image |  [optional] [readonly] |
| **cloudInit** | [**CloudInitEnum**](#CloudInitEnum) | Cloud init compatibility. |  [optional] |



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
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: CloudInitEnum

| Name | Value |
| ---- | -----
| NONE | &quot;NONE&quot; |
| V1 | &quot;V1&quot; |


