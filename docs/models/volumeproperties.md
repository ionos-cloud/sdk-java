# VolumeProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that resource | \[optional\] |
| **type** | [**TypeEnum**](volumeproperties.md#TypeEnum) | Hardware type of the volume. DAS \(Direct Attached Storage\) could be used only in a composite call with a Cube server | \[optional\] |
| **size** | [**BigDecimal**](https://github.com/ionos-cloud/sdk-java/tree/a12429a4804e6e50d2155ea044d46f0bc32a860f/docs/BigDecimal.md) | The size of the volume in GB |  |
| **availabilityZone** | [**AvailabilityZoneEnum**](volumeproperties.md#AvailabilityZoneEnum) | The availability zone in which the volume should exist. The storage volume will be provisioned on as less physical storages as possible but cannot guarantee upfront. It is not available for DAS \(Direct Attached Storage\) and subject of availability for SSD. | \[optional\] |
| **image** | **String** | Image or snapshot ID to be used as template for this volume | \[optional\] |
| **imagePassword** | **String** | Initial password to be set for installed OS. Works with public images only. Not modifiable, forbidden in update requests. Password rules allows all characters from a-z, A-Z, 0-9 | \[optional\] |
| **sshKeys** | **List&lt;String&gt;** | Public SSH keys are set on the image as authorized keys for appropriate SSH login to the instance using the corresponding private key. This field may only be set in creation requests. When reading, it always returns null. SSH keys are only supported if a public Linux image is used for the volume creation. | \[optional\] |
| **bus** | [**BusEnum**](volumeproperties.md#BusEnum) | The bus type of the volume. Default is VIRTIO | \[optional\] |
| **licenceType** | [**LicenceTypeEnum**](volumeproperties.md#LicenceTypeEnum) | OS type of this volume | \[optional\] \[readonly\] |
| **cpuHotPlug** | **Boolean** | Is capable of CPU hot plug \(no reboot required\) | \[optional\] |
| **ramHotPlug** | **Boolean** | Is capable of memory hot plug \(no reboot required\) | \[optional\] |
| **nicHotPlug** | **Boolean** | Is capable of nic hot plug \(no reboot required\) | \[optional\] |
| **nicHotUnplug** | **Boolean** | Is capable of nic hot unplug \(no reboot required\) | \[optional\] |
| **discVirtioHotPlug** | **Boolean** | Is capable of Virt-IO drive hot plug \(no reboot required\) | \[optional\] |
| **discVirtioHotUnplug** | **Boolean** | Is capable of Virt-IO drive hot unplug \(no reboot required\). This works only for non-Windows virtual Machines. | \[optional\] |
| **deviceNumber** | **Long** | The Logical Unit Number of the storage volume. Null for volumes not mounted to any VM | \[optional\] \[readonly\] |
| **pciSlot** | **Integer** | The PCI slot number of the storage volume. Null for volumes not mounted to any VM | \[optional\] \[readonly\] |
| **backupunitId** | **String** | The uuid of the Backup Unit that user has access to. The property is immutable and is only allowed to be set on a new volume creation. It is mandatory to provide either 'public image' or 'imageAlias' in conjunction with this property. | \[optional\] |
| **userData** | **String** | The cloud-init configuration for the volume as base64 encoded string. The property is immutable and is only allowed to be set on a new volume creation. It is mandatory to provide either 'public image' or 'imageAlias' that has cloud-init compatibility in conjunction with this property. | \[optional\] |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| HDD | "HDD" |
| SSD | "SSD" |
| SSD\_STANDARD | "SSD Standard" |
| SSD\_PREMIUM | "SSD Premium" |
| DAS | "DAS" |

## Enum: AvailabilityZoneEnum

| Name | Value |
| :--- | :--- |
| AUTO | "AUTO" |
| ZONE\_1 | "ZONE\_1" |
| ZONE\_2 | "ZONE\_2" |
| ZONE\_3 | "ZONE\_3" |

## Enum: BusEnum

| Name | Value |
| :--- | :--- |
| VIRTIO | "VIRTIO" |
| IDE | "IDE" |

## Enum: LicenceTypeEnum

| Name | Value |
| :--- | :--- |
| UNKNOWN | "UNKNOWN" |
| WINDOWS | "WINDOWS" |
| WINDOWS2016 | "WINDOWS2016" |
| LINUX | "LINUX" |
| OTHER | "OTHER" |

