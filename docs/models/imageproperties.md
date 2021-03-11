# ImageProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that resource | \[optional\] |
| **description** | **String** | Human readable description | \[optional\] |
| **location** | **String** | Location of that image/snapshot. | \[optional\] \[readonly\] |
| **size** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/8f2023b15d2a11cc163b3abd7b642806c3db5f2c/docs/BigDecimal.md) | The size of the image in GB | \[optional\] \[readonly\] |
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
| **licenceType** | [**LicenceTypeEnum**](imageproperties.md#LicenceTypeEnum) | OS type of this Image |  |
| **imageType** | [**ImageTypeEnum**](imageproperties.md#ImageTypeEnum) | This indicates the type of image | \[optional\] \[readonly\] |
| **\_public** | **Boolean** | Indicates if the image is part of the public repository or not | \[optional\] \[readonly\] |

## Enum: LicenceTypeEnum

| Name | Value |
| :--- | :--- |
| UNKNOWN | "UNKNOWN" |
| WINDOWS | "WINDOWS" |
| WINDOWS2016 | "WINDOWS2016" |
| LINUX | "LINUX" |
| OTHER | "OTHER" |

## Enum: ImageTypeEnum

| Name | Value |
| :--- | :--- |
| HDD | "HDD" |
| CDROM | "CDROM" |

