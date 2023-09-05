

# TargetGroupHttpHealthCheck

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Specify the target&#39;s response type to match ALB&#39;s request. |  |
| **method** | [**MethodEnum**](#MethodEnum) | The method used for the health check request. |  [optional] |
| **negate** | **Boolean** | Specifies whether to negate an individual entry; the default value is &#39;FALSE&#39;. |  [optional] |
| **path** | **String** | The destination URL for HTTP the health check; the default is &#39;/&#39;. |  [optional] |
| **regex** | **Boolean** | Specifies whether to use a regular expression to parse the response body; the default value is &#39;FALSE&#39;.  By using regular expressions, you can flexibly customize the expected response from a healthy server. |  [optional] |
| **response** | **String** | The response returned by the request. It can be a status code or a response body depending on the definition of &#39;matchType&#39;. |  |



## Enum: MatchTypeEnum

| Name | Value |
| ---- | -----
| STATUS_CODE | &quot;STATUS_CODE&quot; |
| RESPONSE_BODY | &quot;RESPONSE_BODY&quot; |



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


