

# VolumeProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | A name of that resource |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | Hardware type of the volume. DAS (Direct Attached Storage) could be used only in a composite call with a Cube server |  [optional] |
| **size** | [**BigDecimal**](BigDecimal.md) | The size of the volume in GB |  |
| **availabilityZone** | [**AvailabilityZoneEnum**](#AvailabilityZoneEnum) | The availability zone in which the volume should exist. The storage volume will be provisioned on as less physical storages as possible but cannot guarantee upfront. It is not available for DAS (Direct Attached Storage) and subject of availability for SSD. |  [optional] |
| **image** | **String** | Image or snapshot ID to be used as template for this volume |  [optional] |
| **imagePassword** | **String** | Initial password to be set for installed OS. Works with public images only. Not modifiable, forbidden in update requests. Password rules allows all characters from a-z, A-Z, 0-9 |  [optional] |
| **sshKeys** | **List&lt;String&gt;** | Public SSH keys are set on the image as authorized keys for appropriate SSH login to the instance using the corresponding private key. This field may only be set in creation requests. When reading, it always returns null. SSH keys are only supported if a public Linux image is used for the volume creation. |  [optional] |
| **bus** | [**BusEnum**](#BusEnum) | The bus type of the volume. Default is VIRTIO |  [optional] |
| **licenceType** | [**LicenceTypeEnum**](#LicenceTypeEnum) | OS type of this volume |  [optional] [readonly] |
| **cpuHotPlug** | **Boolean** | Is capable of CPU hot plug (no reboot required) |  [optional] |
| **ramHotPlug** | **Boolean** | Is capable of memory hot plug (no reboot required) |  [optional] |
| **nicHotPlug** | **Boolean** | Is capable of nic hot plug (no reboot required) |  [optional] |
| **nicHotUnplug** | **Boolean** | Is capable of nic hot unplug (no reboot required) |  [optional] |
| **discVirtioHotPlug** | **Boolean** | Is capable of Virt-IO drive hot plug (no reboot required) |  [optional] |
| **discVirtioHotUnplug** | **Boolean** | Is capable of Virt-IO drive hot unplug (no reboot required). This works only for non-Windows virtual Machines. |  [optional] |
| **deviceNumber** | **Long** | The Logical Unit Number of the storage volume. Null for volumes not mounted to any VM |  [optional] [readonly] |
| **pciSlot** | **Integer** | The PCI slot number of the storage volume. Null for volumes not mounted to any VM |  [optional] [readonly] |
| **backupunitId** | **String** | The uuid of the Backup Unit that user has access to. The property is immutable and is only allowed to be set on a new volume creation. It is mandatory to provide either &#39;public image&#39; or &#39;imageAlias&#39; in conjunction with this property. |  [optional] |
| **userData** | **String** | The cloud-init configuration for the volume as base64 encoded string. The property is immutable and is only allowed to be set on a new volume creation. It is mandatory to provide either &#39;public image&#39; or &#39;imageAlias&#39; that has cloud-init compatibility in conjunction with this property. |  [optional] |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| HDD | &quot;HDD&quot; |
| SSD | &quot;SSD&quot; |
| SSD_STANDARD | &quot;SSD Standard&quot; |
| SSD_PREMIUM | &quot;SSD Premium&quot; |
| DAS | &quot;DAS&quot; |



## Enum: AvailabilityZoneEnum

| Name | Value |
| ---- | -----
| AUTO | &quot;AUTO&quot; |
| ZONE_1 | &quot;ZONE_1&quot; |
| ZONE_2 | &quot;ZONE_2&quot; |
| ZONE_3 | &quot;ZONE_3&quot; |



## Enum: BusEnum

| Name | Value |
| ---- | -----
| VIRTIO | &quot;VIRTIO&quot; |
| IDE | &quot;IDE&quot; |



## Enum: LicenceTypeEnum

| Name | Value |
| ---- | -----
| UNKNOWN | &quot;UNKNOWN&quot; |
| WINDOWS | &quot;WINDOWS&quot; |
| WINDOWS2016 | &quot;WINDOWS2016&quot; |
| LINUX | &quot;LINUX&quot; |
| OTHER | &quot;OTHER&quot; |


