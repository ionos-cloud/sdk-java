# NetworkLoadBalancerForwardingRuleProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that Network Load Balancer forwarding rule |  |
| **algorithm** | [**AlgorithmEnum**](networkloadbalancerforwardingruleproperties.md#AlgorithmEnum) | Algorithm for the balancing. |  |
| **protocol** | [**ProtocolEnum**](networkloadbalancerforwardingruleproperties.md#ProtocolEnum) | Protocol of the balancing. |  |
| **listenerIp** | **String** | Listening IP. \(inbound\) |  |
| **listenerPort** | **Integer** | Listening port number. \(inbound\) \(range: 1 to 65535\) |  |
| **healthCheck** | [**NetworkLoadBalancerForwardingRuleHealthCheck**](networkloadbalancerforwardingrulehealthcheck.md) |  | \[optional\] |
| **targets** | [**List&lt;NetworkLoadBalancerForwardingRuleTarget&gt;**](networkloadbalancerforwardingruletarget.md) | Array of items in that collection |  |

## Enum: AlgorithmEnum

| Name | Value |
| :--- | :--- |
| ROUND\_ROBIN | "ROUND\_ROBIN" |
| LEAST\_CONNECTION | "LEAST\_CONNECTION" |
| RANDOM | "RANDOM" |
| SOURCE\_IP | "SOURCE\_IP" |

## Enum: ProtocolEnum

| Name | Value |
| :--- | :--- |
| TCP | "TCP" |

