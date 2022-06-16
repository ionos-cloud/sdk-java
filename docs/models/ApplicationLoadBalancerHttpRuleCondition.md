

# ApplicationLoadBalancerHttpRuleCondition

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum) | Type of the HTTP rule condition. |  |
| **condition** | [**ConditionEnum**](#ConditionEnum) | Matching rule for the HTTP rule condition attribute; mandatory for HEADER, PATH, QUERY, METHOD, HOST, and COOKIE types; must be null when type is SOURCE_IP. |  |
| **negate** | **Boolean** | Specifies whether the condition is negated or not; the default is False. |  [optional] |
| **key** | **String** | Must be null when type is PATH, METHOD, HOST, or SOURCE_IP. Key can only be set when type is COOKIES, HEADER, or QUERY. |  [optional] |
| **value** | **String** | Mandatory for conditions CONTAINS, EQUALS, MATCHES, STARTS_WITH, ENDS_WITH; must be null when condition is EXISTS; should be a valid CIDR if provided and if type is SOURCE_IP. |  [optional] |



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



## Enum: ConditionEnum

| Name | Value |
| ---- | -----
| EXISTS | &quot;EXISTS&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| EQUALS | &quot;EQUALS&quot; |
| MATCHES | &quot;MATCHES&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |


