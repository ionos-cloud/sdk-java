

# TargetGroupProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the target group. |  |
| **algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | Balancing algorithm |  |
| **protocol** | [**ProtocolEnum**](#ProtocolEnum) | Balancing protocol |  |
| **targets** | [**List&lt;TargetGroupTarget&gt;**](TargetGroupTarget.md) | Array of items in the collection. |  [optional] |
| **healthCheck** | [**TargetGroupHealthCheck**](TargetGroupHealthCheck.md) |  |  [optional] |
| **httpHealthCheck** | [**TargetGroupHttpHealthCheck**](TargetGroupHttpHealthCheck.md) |  |  [optional] |



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


