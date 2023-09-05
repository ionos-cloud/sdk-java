

# TargetGroupProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | The balancing algorithm. A balancing algorithm consists of predefined rules with the logic that a load balancer uses to distribute network traffic between servers.  - **Round Robin**: Targets are served alternately according to their weighting.  - **Least Connection**: The target with the least active connection is served.  - **Random**: The targets are served based on a consistent pseudorandom algorithm.  - **Source IP**: It is ensured that the same client IP address reaches the same target. |  |
| **healthCheck** | [**TargetGroupHealthCheck**](TargetGroupHealthCheck.md) |  |  [optional] |
| **httpHealthCheck** | [**TargetGroupHttpHealthCheck**](TargetGroupHttpHealthCheck.md) |  |  [optional] |
| **name** | **String** | The target group name. |  |
| **protocol** | [**ProtocolEnum**](#ProtocolEnum) | The forwarding protocol. Only the value &#39;HTTP&#39; is allowed. |  |
| **targets** | [**List&lt;TargetGroupTarget&gt;**](TargetGroupTarget.md) | Array of items in the collection. |  [optional] |



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


