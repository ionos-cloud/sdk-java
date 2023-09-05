

# SnapshotProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cpuHotPlug** | **Boolean** | Hot-plug capable CPU (no reboot required). |  [optional] |
| **cpuHotUnplug** | **Boolean** | Hot-unplug capable CPU (no reboot required). |  [optional] |
| **description** | **String** | Human-readable description. |  [optional] |
| **discScsiHotPlug** | **Boolean** | Hot-plug capable SCSI drive (no reboot required). |  [optional] |
| **discScsiHotUnplug** | **Boolean** | Is capable of SCSI drive hot unplug (no reboot required). This works only for non-Windows virtual Machines. |  [optional] |
| **discVirtioHotPlug** | **Boolean** | Hot-plug capable Virt-IO drive (no reboot required). |  [optional] |
| **discVirtioHotUnplug** | **Boolean** | Hot-unplug capable Virt-IO drive (no reboot required). Not supported with Windows VMs. |  [optional] |
| **licenceType** | [**LicenceTypeEnum**](#LicenceTypeEnum) | OS type of this snapshot |  [optional] |
| **location** | **String** | Location of that image/snapshot.  |  [optional] [readonly] |
| **name** | **String** | The name of the  resource. |  [optional] |
| **nicHotPlug** | **Boolean** | Hot-plug capable NIC (no reboot required). |  [optional] |
| **nicHotUnplug** | **Boolean** | Hot-unplug capable NIC (no reboot required). |  [optional] |
| **ramHotPlug** | **Boolean** | Hot-plug capable RAM (no reboot required). |  [optional] |
| **ramHotUnplug** | **Boolean** | Hot-unplug capable RAM (no reboot required). |  [optional] |
| **secAuthProtection** | **Boolean** | Boolean value representing if the snapshot requires extra protection, such as two-step verification. |  [optional] |
| **size** | [**BigDecimal**](BigDecimal.md) | The size of the image in GB. |  [optional] [readonly] |



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


