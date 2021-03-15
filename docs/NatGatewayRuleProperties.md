

# NatGatewayRuleProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Name of the NAT gateway rule |  |
| **type** | [**NatGatewayRuleType**](NatGatewayRuleType.md) | Type of the NAT gateway rule. |  [optional] |
| **protocol** | [**NatGatewayRuleProtocol**](NatGatewayRuleProtocol.md) | Protocol of the NAT gateway rule. Defaults to ALL. If protocol is &#39;ICMP&#39; then targetPortRange start and end cannot be set. |  [optional] |
| **sourceSubnet** | **String** | Source subnet of the NAT gateway rule. For SNAT rules it specifies which packets this translation rule applies to based on the packets source IP address. |  |
| **publicIp** | **String** | Public IP address of the NAT gateway rule. Specifies the address used for masking outgoing packets source address field. Should be one of the customer reserved IP address already configured on the NAT gateway resource |  |
| **targetSubnet** | **String** | Target or destination subnet of the NAT gateway rule. For SNAT rules it specifies which packets this translation rule applies to based on the packets destination IP address. If none is provided, rule will match any address. |  [optional] |
| **targetPortRange** | [**TargetPortRange**](TargetPortRange.md) |  |  [optional] |


