

# NicProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the  resource. |  [optional] |
| **mac** | **String** | The MAC address of the NIC. |  [optional] [readonly] |
| **ips** | **List&lt;String&gt;** | Collection of IP addresses, assigned to the NIC. Explicitly assigned public IPs need to come from reserved IP blocks. Passing value null or empty array will assign an IP address automatically. |  [optional] |
| **dhcp** | **Boolean** | Indicates if the NIC will reserve an IP using DHCP. |  [optional] |
| **lan** | **Integer** | The LAN ID the NIC will be on. If the LAN ID does not exist, it will be implicitly created. |  |
| **firewallActive** | **Boolean** | Activate or deactivate the firewall. By default, an active firewall without any defined rules will block all incoming network traffic except for the firewall rules that explicitly allows certain protocols, IP addresses and ports. |  [optional] |
| **firewallType** | [**FirewallTypeEnum**](#FirewallTypeEnum) | The type of firewall rules that will be allowed on the NIC. If not specified, the default INGRESS value is used. |  [optional] |
| **deviceNumber** | **Integer** | The Logical Unit Number (LUN) of the storage volume. Null if this NIC was created using Cloud API and no DCD changes were performed on the Datacenter. |  [optional] [readonly] |
| **pciSlot** | **Integer** | The PCI slot number for the NIC. |  [optional] [readonly] |



## Enum: FirewallTypeEnum

| Name | Value |
| ---- | -----
| INGRESS | &quot;INGRESS&quot; |
| EGRESS | &quot;EGRESS&quot; |
| BIDIRECTIONAL | &quot;BIDIRECTIONAL&quot; |


