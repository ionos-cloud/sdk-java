

# SnapshotProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the  resource. |  [optional] |
| **description** | **String** | Human-readable description. |  [optional] |
| **location** | **String** | Location of that image/snapshot.  |  [optional] [readonly] |
| **size** | [**BigDecimal**](BigDecimal.md) | The size of the image in GB. |  [optional] [readonly] |
| **secAuthProtection** | **Boolean** | Boolean value representing if the snapshot requires extra protection, such as two-step verification. |  [optional] |
| **cpuHotPlug** | **Boolean** | Hot-plug capable CPU (no reboot required). |  [optional] |
| **cpuHotUnplug** | **Boolean** | Hot-unplug capable CPU (no reboot required). |  [optional] |
| **ramHotPlug** | **Boolean** | Hot-plug capable RAM (no reboot required). |  [optional] |
| **ramHotUnplug** | **Boolean** | Hot-unplug capable RAM (no reboot required). |  [optional] |
| **nicHotPlug** | **Boolean** | Hot-plug capable NIC (no reboot required). |  [optional] |
| **nicHotUnplug** | **Boolean** | Hot-unplug capable NIC (no reboot required). |  [optional] |
| **discVirtioHotPlug** | **Boolean** | Hot-plug capable Virt-IO drive (no reboot required). |  [optional] |
| **discVirtioHotUnplug** | **Boolean** | Hot-unplug capable Virt-IO drive (no reboot required). Not supported with Windows VMs. |  [optional] |
| **discScsiHotPlug** | **Boolean** | Hot-plug capable SCSI drive (no reboot required). |  [optional] |
| **discScsiHotUnplug** | **Boolean** | Is capable of SCSI drive hot unplug (no reboot required). This works only for non-Windows virtual Machines. |  [optional] |
| **licenceType** | [**LicenceTypeEnum**](#LicenceTypeEnum) | OS type of this snapshot |  [optional] |



## Enum: LicenceTypeEnum

| Name | Value |
| ---- | -----
| UNKNOWN | &quot;UNKNOWN&quot; |
| WINDOWS | &quot;WINDOWS&quot; |
| WINDOWS2016 | &quot;WINDOWS2016&quot; |
| LINUX | &quot;LINUX&quot; |
| OTHER | &quot;OTHER&quot; |


