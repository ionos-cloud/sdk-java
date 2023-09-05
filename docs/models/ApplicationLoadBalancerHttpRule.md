

# ApplicationLoadBalancerHttpRule

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conditions** | [**List&lt;ApplicationLoadBalancerHttpRuleCondition&gt;**](ApplicationLoadBalancerHttpRuleCondition.md) | An array of items in the collection. The action will be executed only if each condition is met; the rule will always be applied if no conditions are set. |  [optional] |
| **contentType** | **String** | Specifies the content type and is valid only for &#39;STATIC&#39; actions. |  [optional] |
| **dropQuery** | **Boolean** | Indicates whether the query part of the URI should be dropped and is valid only for &#39;REDIRECT&#39; actions. Default value is &#39;FALSE&#39;, the redirect URI does not contain any query parameters. |  [optional] |
| **location** | **String** | The location for the redirection; this parameter is mandatory and valid only for &#39;REDIRECT&#39; actions. |  [optional] |
| **name** | **String** | The unique name of the Application Load Balancer HTTP rule. |  |
| **responseMessage** | **String** | The response message of the request; this parameter is mandatory for &#39;STATIC&#39; actions. |  [optional] |
| **statusCode** | **Integer** | The status code is for &#39;REDIRECT&#39; and &#39;STATIC&#39; actions only.   If the HTTP rule is &#39;REDIRECT&#39; the valid values are: 301, 302, 303, 307, 308; default value is &#39;301&#39;.  If the HTTP rule is &#39;STATIC&#39; the valid values are from the range 200-599; default value is &#39;503&#39;. |  [optional] |
| **targetGroup** | **String** | The ID of the target group; this parameter is mandatory and is valid only for &#39;FORWARD&#39; actions. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum) | The HTTP rule type. |  |



## Enum: TypeEnum

| Name | Value |
| ---- | -----
| FORWARD | &quot;FORWARD&quot; |
| STATIC | &quot;STATIC&quot; |
| REDIRECT | &quot;REDIRECT&quot; |


