# SnapshotProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that resource | \[optional\] |
| **description** | **String** | Human readable description | \[optional\] |
| **location** | **String** | Location of that image/snapshot. | \[optional\] \[readonly\] |
| **size** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/e301a24b681f0ad424762e13995b95c67ad7e66b/docs/BigDecimal.md) | The size of the image in GB | \[optional\] \[readonly\] |
| **secAuthProtection** | **Boolean** | Boolean value representing if the snapshot requires extra protection e.g. two factor protection | \[optional\] |
| **cpuHotPlug** | **Boolean** | Is capable of CPU hot plug \(no reboot required\) | \[optional\] |
| **cpuHotUnplug** | **Boolean** | Is capable of CPU hot unplug \(no reboot required\) | \[optional\] |
| **ramHotPlug** | **Boolean** | Is capable of memory hot plug \(no reboot required\) | \[optional\] |
| **ramHotUnplug** | **Boolean** | Is capable of memory hot unplug \(no reboot required\) | \[optional\] |
| **nicHotPlug** | **Boolean** | Is capable of nic hot plug \(no reboot required\) | \[optional\] |
| **nicHotUnplug** | **Boolean** | Is capable of nic hot unplug \(no reboot required\) | \[optional\] |
| **discVirtioHotPlug** | **Boolean** | Is capable of Virt-IO drive hot plug \(no reboot required\) | \[optional\] |
| **discVirtioHotUnplug** | **Boolean** | Is capable of Virt-IO drive hot unplug \(no reboot required\). This works only for non-Windows virtual Machines. | \[optional\] |
| **discScsiHotPlug** | **Boolean** | Is capable of SCSI drive hot plug \(no reboot required\) | \[optional\] |
| **discScsiHotUnplug** | **Boolean** | Is capable of SCSI drive hot unplug \(no reboot required\). This works only for non-Windows virtual Machines. | \[optional\] |
| **licenceType** | [**LicenceTypeEnum**](snapshotproperties.md#LicenceTypeEnum) | OS type of this Snapshot | \[optional\] |

## Enum: LicenceTypeEnum

| Name | Value |
| :--- | :--- |
| UNKNOWN | "UNKNOWN" |
| WINDOWS | "WINDOWS" |
| WINDOWS2016 | "WINDOWS2016" |
| LINUX | "LINUX" |
| OTHER | "OTHER" |

