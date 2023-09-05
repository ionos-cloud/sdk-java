

# NetworkLoadBalancerForwardingRuleProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | Balancing algorithm |  |
| **healthCheck** | [**NetworkLoadBalancerForwardingRuleHealthCheck**](NetworkLoadBalancerForwardingRuleHealthCheck.md) |  |  [optional] |
| **listenerIp** | **String** | Listening (inbound) IP. |  |
| **listenerPort** | **Integer** | Listening (inbound) port number; valid range is 1 to 65535. |  |
| **name** | **String** | The name of the Network Load Balancer forwarding rule. |  |
| **protocol** | [**ProtocolEnum**](#ProtocolEnum) | Balancing protocol |  |
| **targets** | [**List&lt;NetworkLoadBalancerForwardingRuleTarget&gt;**](NetworkLoadBalancerForwardingRuleTarget.md) | Array of items in the collection. |  |



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


