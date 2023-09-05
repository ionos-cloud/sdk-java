

# FirewallruleProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **icmpCode** | **Integer** | Defines the allowed code (from 0 to 254) if protocol ICMP or ICMPv6 is chosen. Value null allows all codes. |  [optional] |
| **icmpType** | **Integer** | Defines the allowed type (from 0 to 254) if the protocol ICMP or ICMPv6 is chosen. Value null allows all types. |  [optional] |
| **ipVersion** | [**IpVersionEnum**](#IpVersionEnum) | The IP version for this rule. If sourceIp or targetIp are specified, you can omit this value - the IP version will then be deduced from the IP address(es) used; if you specify it anyway, it must match the specified IP address(es). If neither sourceIp nor targetIp are specified, this rule allows traffic only for the specified IP version. If neither sourceIp, targetIp nor ipVersion are specified, this rule will only allow IPv4 traffic. |  [optional] |
| **name** | **String** | The name of the  resource. |  [optional] |
| **portRangeEnd** | **Integer** | Defines the end range of the allowed port (from 1 to 65534) if the protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd null to allow all ports. |  [optional] |
| **portRangeStart** | **Integer** | Defines the start range of the allowed port (from 1 to 65534) if protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd value null to allow all ports. |  [optional] |
| **protocol** | [**ProtocolEnum**](#ProtocolEnum) | The protocol for the rule. Property cannot be modified after it is created (disallowed in update requests). |  |
| **sourceIp** | **String** | Only traffic originating from the respective IP address (or CIDR block) is allowed. Value null allows traffic from any IP address (according to the selected ipVersion). |  [optional] |
| **sourceMac** | **String** | Only traffic originating from the respective MAC address is allowed. Valid format: aa:bb:cc:dd:ee:ff. Value null allows traffic from any MAC address. |  [optional] |
| **targetIp** | **String** | If the target NIC has multiple IP addresses, only the traffic directed to the respective IP address (or CIDR block) of the NIC is allowed. Value null allows traffic to any target IP address (according to the selected ipVersion). |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | The type of the firewall rule. If not specified, the default INGRESS value is used. |  [optional] |



## Enum: IpVersionEnum

| Name | Value |
| ---- | -----
| IPV4 | &quot;IPv4&quot; |
| IPV6 | &quot;IPv6&quot; |



## Enum: ProtocolEnum

| Name | Value |
| ---- | -----
| TCP | &quot;TCP&quot; |
| UDP | &quot;UDP&quot; |
| ICMP | &quot;ICMP&quot; |
| ICMPV6 | &quot;ICMPv6&quot; |
| ANY | &quot;ANY&quot; |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| INGRESS | &quot;INGRESS&quot; |
| EGRESS | &quot;EGRESS&quot; |


