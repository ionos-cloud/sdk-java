

# NicProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **deviceNumber** | **Integer** | The Logical Unit Number (LUN) of the storage volume. Null if this NIC was created using Cloud API and no DCD changes were performed on the Datacenter. |  [optional] [readonly] |
| **dhcp** | **Boolean** | Indicates if the NIC will reserve an IP using DHCP. |  [optional] |
| **dhcpv6** | **Boolean** | Indicates if the NIC will receive an IPv6 using DHCP. It can be set to &#39;true&#39; or &#39;false&#39; only if this NIC is connected to an IPv6 enabled LAN. |  [optional] |
| **firewallActive** | **Boolean** | Activate or deactivate the firewall. By default, an active firewall without any defined rules will block all incoming network traffic except for the firewall rules that explicitly allows certain protocols, IP addresses and ports. |  [optional] |
| **firewallType** | [**FirewallTypeEnum**](#FirewallTypeEnum) | The type of firewall rules that will be allowed on the NIC. If not specified, the default INGRESS value is used. |  [optional] |
| **ips** | **List&lt;String&gt;** | Collection of IP addresses, assigned to the NIC. Explicitly assigned public IPs need to come from reserved IP blocks. Passing value null or empty array will assign an IP address automatically. |  [optional] |
| **ipv6CidrBlock** | **String** | If this NIC is connected to an IPv6 enabled LAN then this property contains the /80 IPv6 CIDR block of the NIC. If you leave this property &#39;null&#39; when adding a NIC to an IPv6-enabled LAN, then an IPv6 CIDR block will automatically be assigned to the NIC, but you can also specify an /80 IPv6 CIDR block for the NIC on your own, which must be inside the /64 IPv6 CIDR block of the LAN and unique. This value can only be set, if the LAN already has an IPv6 CIDR block assigned. An IPv6-enabled LAN is limited to a maximum of 65,536 NICs. |  [optional] |
| **ipv6Ips** | **List&lt;String&gt;** | If this NIC is connected to an IPv6 enabled LAN then this property contains the IPv6 IP addresses of the NIC. The maximum number of IPv6 IP addresses per NIC is 50, if you need more, contact support. If you leave this property &#39;null&#39; when adding a NIC, when changing the NIC&#39;s IPv6 CIDR block, when changing the LAN&#39;s IPv6 CIDR block or when moving the NIC to a different IPv6 enabled LAN, then we will automatically assign the same number of IPv6 addresses which you had before from the NICs new CIDR block. If you leave this property &#39;null&#39; while not changing the CIDR block, the IPv6 IP addresses won&#39;t be changed either. You can also provide your own self choosen IPv6 addresses, which then must be inside the IPv6 CIDR block of this NIC. |  [optional] |
| **lan** | **Integer** | The LAN ID the NIC will be on. If the LAN ID does not exist, it will be implicitly created. |  |
| **mac** | **String** | The MAC address of the NIC. |  [optional] [readonly] |
| **name** | **String** | The name of the  resource. |  [optional] |
| **pciSlot** | **Integer** | The PCI slot number for the NIC. |  [optional] [readonly] |



## Enum: FirewallTypeEnum

| Name | Value |
| ---- | -----
| INGRESS | &quot;INGRESS&quot; |
| EGRESS | &quot;EGRESS&quot; |
| BIDIRECTIONAL | &quot;BIDIRECTIONAL&quot; |


