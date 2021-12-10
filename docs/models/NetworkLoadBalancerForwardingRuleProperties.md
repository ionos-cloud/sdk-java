

# NetworkLoadBalancerForwardingRuleProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Network Load Balancer forwarding rule. |  |
| **algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | Algorithm for the balancing. |  |
| **protocol** | [**ProtocolEnum**](#ProtocolEnum) | Protocol of the balancing. |  |
| **listenerIp** | **String** | Listening IP. (inbound) |  |
| **listenerPort** | **Integer** | Listening port number. (inbound) (range: 1 to 65535) |  |
| **healthCheck** | [**NetworkLoadBalancerForwardingRuleHealthCheck**](NetworkLoadBalancerForwardingRuleHealthCheck.md) |  |  [optional] |
| **targets** | [**List&lt;NetworkLoadBalancerForwardingRuleTarget&gt;**](NetworkLoadBalancerForwardingRuleTarget.md) | Array of items in that collection. |  |



## Enum: AlgorithmEnum

| Name | Value |
| ---- | -----
| ROUND_ROBIN | &quot;ROUND_ROBIN&quot; |
| LEAST_CONNECTION | &quot;LEAST_CONNECTION&quot; |
| RANDOM | &quot;RANDOM&quot; |
| SOURCE_IP | &quot;SOURCE_IP&quot; |



## Enum: ProtocolEnum

| Name | Value |
| ---- | -----
| HTTP | &quot;HTTP&quot; |
| TCP | &quot;TCP&quot; |


