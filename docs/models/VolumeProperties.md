

# VolumeProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **availabilityZone** | [**AvailabilityZoneEnum**](#AvailabilityZoneEnum) | The availability zone in which the volume should be provisioned. The storage volume will be provisioned on as few physical storage devices as possible, but this cannot be guaranteed upfront. This is uavailable for DAS (Direct Attached Storage), and subject to availability for SSD. |  [optional] |
| **backupunitId** | **String** | The ID of the backup unit that the user has access to. The property is immutable and is only allowed to be set on creation of a new a volume. It is mandatory to provide either &#39;public image&#39; or &#39;imageAlias&#39; in conjunction with this property. |  [optional] |
| **bootOrder** | [**BootOrderEnum**](#BootOrderEnum) | Determines whether the volume will be used as a boot volume. Set to &#x60;NONE&#x60;, the volume will not be used as boot volume. Set to &#x60;PRIMARY&#x60;, the volume will be used as boot volume and all other volumes must be set to &#x60;NONE&#x60;. Set to &#x60;AUTO&#x60; or &#x60;null&#x60; requires all volumes to be set to &#x60;AUTO&#x60; or &#x60;null&#x60;; this will use the legacy behavior, which is to use the volume as a boot volume only if there are no other volumes or cdrom devices. |  [optional] |
| **bootServer** | **String** | The UUID of the attached server. |  [optional] [readonly] |
| **bus** | [**BusEnum**](#BusEnum) | The bus type for this volume; default is VIRTIO. |  [optional] |
| **cpuHotPlug** | **Boolean** | Hot-plug capable CPU (no reboot required). |  [optional] |
| **deviceNumber** | **Long** | The Logical Unit Number of the storage volume. Null for volumes, not mounted to a VM. |  [optional] [readonly] |
| **discVirtioHotPlug** | **Boolean** | Hot-plug capable Virt-IO drive (no reboot required). |  [optional] |
| **discVirtioHotUnplug** | **Boolean** | Hot-unplug capable Virt-IO drive (no reboot required). Not supported with Windows VMs. |  [optional] |
| **image** | **String** | Image or snapshot ID to be used as template for this volume. |  [optional] |
| **imageAlias** | **String** |  |  [optional] |
| **imagePassword** | **String** | Initial password to be set for installed OS. Works with public images only. Not modifiable, forbidden in update requests. Password rules allows all characters from a-z, A-Z, 0-9. |  [optional] |
| **licenceType** | [**LicenceTypeEnum**](#LicenceTypeEnum) | OS type for this volume. |  [optional] |
| **name** | **String** | The name of the  resource. |  [optional] |
| **nicHotPlug** | **Boolean** | Hot-plug capable NIC (no reboot required). |  [optional] |
| **nicHotUnplug** | **Boolean** | Hot-unplug capable NIC (no reboot required). |  [optional] |
| **pciSlot** | **Integer** | The PCI slot number of the storage volume. Null for volumes, not mounted to a VM. |  [optional] [readonly] |
| **ramHotPlug** | **Boolean** | Hot-plug capable RAM (no reboot required). |  [optional] |
| **size** | [**BigDecimal**](BigDecimal.md) | The size of the volume in GB. |  |
| **sshKeys** | **List&lt;String&gt;** | Public SSH keys are set on the image as authorized keys for appropriate SSH login to the instance using the corresponding private key. This field may only be set in creation requests. When reading, it always returns null. SSH keys are only supported if a public Linux image is used for the volume creation. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | Hardware type of the volume. DAS (Direct Attached Storage) could be used only in a composite call with a Cube server. |  [optional] |
| **userData** | **String** | The cloud-init configuration for the volume as base64 encoded string. The property is immutable and is only allowed to be set on creation of a new a volume. It is mandatory to provide either &#39;public image&#39; or &#39;imageAlias&#39; that has cloud-init compatibility in conjunction with this property. |  [optional] |



## Enum: AvailabilityZoneEnum

| Name | Value |
| ---- | -----
| AUTO | &quot;AUTO&quot; |
| ZONE_1 | &quot;ZONE_1&quot; |
| ZONE_2 | &quot;ZONE_2&quot; |
| ZONE_3 | &quot;ZONE_3&quot; |



## Enum: BootOrderEnum

| Name | Value |
| ---- | -----
| AUTO | &quot;AUTO&quot; |
| NONE | &quot;NONE&quot; |
| PRIMARY | &quot;PRIMARY&quot; |



## Enum: BusEnum

| Name | Value |
| ---- | -----
| VIRTIO | &quot;VIRTIO&quot; |
| IDE | &quot;IDE&quot; |
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



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| HDD | &quot;HDD&quot; |
| SSD | &quot;SSD&quot; |
| SSD_STANDARD | &quot;SSD Standard&quot; |
| SSD_PREMIUM | &quot;SSD Premium&quot; |
| DAS | &quot;DAS&quot; |
| ISO | &quot;ISO&quot; |


