

# ApplicationLoadBalancerHttpRule

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The unique name of the Application Load Balancer HTTP rule. |  |
| **type** | [**TypeEnum**](#TypeEnum) | Type of the HTTP rule. |  |
| **targetGroup** | **String** | The ID of the target group; mandatory and only valid for FORWARD actions. |  [optional] |
| **dropQuery** | **Boolean** | Default is false; valid only for REDIRECT actions. |  [optional] |
| **location** | **String** | The location for redirecting; mandatory and valid only for REDIRECT actions. |  [optional] |
| **statusCode** | [**StatusCodeEnum**](#StatusCodeEnum) | Valid only for REDIRECT and STATIC actions. For REDIRECT actions, default is 301 and possible values are 301, 302, 303, 307, and 308. For STATIC actions, default is 503 and valid range is 200 to 599. |  [optional] |
| **responseMessage** | **String** | The response message of the request; mandatory for STATIC actions. |  [optional] |
| **contentType** | **String** | Valid only for STATIC actions. |  [optional] |
| **conditions** | [**List&lt;ApplicationLoadBalancerHttpRuleCondition&gt;**](ApplicationLoadBalancerHttpRuleCondition.md) | An array of items in the collection.The action is only performed if each and every condition is met; if no conditions are set, the rule will always be performed. |  [optional] |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| FORWARD | &quot;FORWARD&quot; |
| STATIC | &quot;STATIC&quot; |
| REDIRECT | &quot;REDIRECT&quot; |



## Enum: StatusCodeEnum

| Name | Value |
| ---- | -----
| NUMBER_301 | 301 |
| NUMBER_302 | 302 |
| NUMBER_303 | 303 |
| NUMBER_307 | 307 |
| NUMBER_308 | 308 |
| NUMBER_200 | 200 |
| NUMBER_503 | 503 |
| NUMBER_599 | 599 |


