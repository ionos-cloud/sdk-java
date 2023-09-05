

# ApplicationLoadBalancerHttpRuleCondition

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **condition** | [**ConditionEnum**](#ConditionEnum) | The matching rule for the HTTP rule condition attribute; this parameter is mandatory for &#39;HEADER&#39;, &#39;PATH&#39;, &#39;QUERY&#39;, &#39;METHOD&#39;, &#39;HOST&#39;, and &#39;COOKIE&#39; types. It must be &#39;null&#39; if the type is &#39;SOURCE_IP&#39;. |  |
| **key** | **String** | The key can only be set when the HTTP rule condition type is &#39;COOKIES&#39;, &#39;HEADER&#39;, or &#39;QUERY&#39;. For the type &#39;PATH&#39;, &#39;METHOD&#39;, &#39;HOST&#39;, or &#39;SOURCE_IP&#39; the value must be &#39;null&#39;. |  [optional] |
| **negate** | **Boolean** | Specifies whether the condition should be negated; the default value is &#39;FALSE&#39;. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | The HTTP rule condition type. |  |
| **value** | **String** | This parameter is mandatory for the conditions &#39;CONTAINS&#39;, &#39;EQUALS&#39;, &#39;MATCHES&#39;, &#39;STARTS_WITH&#39;, &#39;ENDS_WITH&#39;, or if the type is &#39;SOURCE_IP&#39;. Specify a valid CIDR. If the condition is &#39;EXISTS&#39;, the value must be &#39;null&#39;. |  [optional] |



## Enum: ConditionEnum

| Name | Value |
| ---- | -----
| EXISTS | &quot;EXISTS&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| EQUALS | &quot;EQUALS&quot; |
| MATCHES | &quot;MATCHES&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| HEADER | &quot;HEADER&quot; |
| PATH | &quot;PATH&quot; |
| QUERY | &quot;QUERY&quot; |
| METHOD | &quot;METHOD&quot; |
| HOST | &quot;HOST&quot; |
| COOKIE | &quot;COOKIE&quot; |
| SOURCE_IP | &quot;SOURCE_IP&quot; |


