

# TargetGroupTarget

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **healthCheckEnabled** | **Boolean** | When the health check is enabled, the target is available only when it accepts regular TCP or HTTP connection attempts for state checking. The state check consists of one connection attempt with the target&#39;s address and port. The default value is &#39;TRUE&#39;. |  [optional] |
| **ip** | **String** | The IP address of the balanced target. |  |
| **maintenanceEnabled** | **Boolean** | When the maintenance mode is enabled, the target is prevented from receiving traffic; the default value is &#39;FALSE&#39;. |  [optional] |
| **port** | **Integer** | The port of the balanced target service; the valid range is 1 to 65535. |  |
| **weight** | **Integer** | The traffic is distributed proportionally to target weight, which is the ratio of the total weight of all targets. A target with higher weight receives a larger share of traffic. The valid range is from 0 to 256; the default value is &#39;1&#39;. Targets with a weight of &#39;0&#39; do not participate in load balancing but still accept persistent connections. We recommend using values in the middle range to leave room for later adjustments. |  |
| **proxyProtocol** | [**ProxyProtocolEnum**](#ProxyProtocolEnum) | ProxyProtocol is used to set the proxy protocol version. |  [optional] |



## Enum: ProxyProtocolEnum

| Name | Value |
| ---- | -----
| NONE | &quot;none&quot; |
| V1 | &quot;v1&quot; |
| V2 | &quot;v2&quot; |
| V2SSL | &quot;v2ssl&quot; |


