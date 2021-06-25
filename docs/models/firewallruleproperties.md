# FirewallruleProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that resource | \[optional\] |
| **protocol** | [**ProtocolEnum**](firewallruleproperties.md#ProtocolEnum) | The protocol for the rule. Property cannot be modified after creation \(disallowed in update requests\) |  |
| **sourceMac** | [**SourceMacEnum**](firewallruleproperties.md#SourceMacEnum) | Only traffic originating from the respective MAC address is allowed. Valid format: aa:bb:cc:dd:ee:ff. Value null allows all source MAC address | \[optional\] |
| **sourceIp** | [**SourceIpEnum**](firewallruleproperties.md#SourceIpEnum) | Only traffic originating from the respective IPv4 address is allowed. Value null allows all source IPs | \[optional\] |
| **targetIp** | [**TargetIpEnum**](firewallruleproperties.md#TargetIpEnum) | In case the target NIC has multiple IP addresses, only traffic directed to the respective IP address of the NIC is allowed. Value null allows all target IPs | \[optional\] |
| **icmpCode** | **Integer** | Defines the allowed code \(from 0 to 254\) if protocol ICMP is chosen. Value null allows all codes | \[optional\] |
| **icmpType** | **Integer** | Defines the allowed type \(from 0 to 254\) if the protocol ICMP is chosen. Value null allows all types | \[optional\] |
| **portRangeStart** | **Integer** | Defines the start range of the allowed port \(from 1 to 65534\) if protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd value null to allow all ports | \[optional\] |
| **portRangeEnd** | **Integer** | Defines the end range of the allowed port \(from 1 to 65534\) if the protocol TCP or UDP is chosen. Leave portRangeStart and portRangeEnd null to allow all ports | \[optional\] |
| **type** | [**TypeEnum**](firewallruleproperties.md#TypeEnum) | The type of firewall rule. If is not specified, it will take the default value INGRESS | \[optional\] |

## Enum: ProtocolEnum

| Name | Value |
| :--- | :--- |
| TCP | "TCP" |
| UDP | "UDP" |
| ICMP | "ICMP" |
| ANY | "ANY" |

## Enum: SourceMacEnum

| Name | Value |
| :--- | :--- |
| _VALID\_MAC\_ADDRESS_ | "@Valid MAC address@" |
| NULL | "null" |

## Enum: SourceIpEnum

| Name | Value |
| :--- | :--- |
| _VALID\_IP\_ADDRESS_ | "@Valid IP address@" |
| NULL | "null" |

## Enum: TargetIpEnum

| Name | Value |
| :--- | :--- |
| _VALID\_IP\_ADDRESS_ | "@Valid IP address@" |
| NULL | "null" |

## Enum: TypeEnum

| Name | Value |
| :--- | :--- |
| INGRESS | "INGRESS" |
| EGRESS | "EGRESS" |

