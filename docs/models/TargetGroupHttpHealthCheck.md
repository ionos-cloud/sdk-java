

# TargetGroupHttpHealthCheck

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **path** | **String** | The path (destination URL) for the HTTP health check request; the default is /. |  [optional] |
| **method** | [**MethodEnum**](#MethodEnum) | The method for the HTTP health check. |  [optional] |
| **matchType** | [**MatchTypeEnum**](#MatchTypeEnum) |  |  |
| **response** | **String** | The response returned by the request, depending on the match type. |  |
| **regex** | **Boolean** |  |  [optional] |
| **negate** | **Boolean** |  |  [optional] |



## Enum: MethodEnum

| Name | Value |
| ---- | -----
| HEAD | &quot;HEAD&quot; |
| PUT | &quot;PUT&quot; |
| POST | &quot;POST&quot; |
| GET | &quot;GET&quot; |
| TRACE | &quot;TRACE&quot; |
| PATCH | &quot;PATCH&quot; |
| OPTIONS | &quot;OPTIONS&quot; |



## Enum: MatchTypeEnum

| Name | Value |
| ---- | -----
| STATUS_CODE | &quot;STATUS_CODE&quot; |
| RESPONSE_BODY | &quot;RESPONSE_BODY&quot; |


