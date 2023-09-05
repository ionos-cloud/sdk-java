

# ApplicationLoadBalancerForwardingRuleProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clientTimeout** | **Integer** | The maximum time in milliseconds to wait for the client to acknowledge or send data; default is 50,000 (50 seconds). |  [optional] |
| **httpRules** | [**List&lt;ApplicationLoadBalancerHttpRule&gt;**](ApplicationLoadBalancerHttpRule.md) | An array of items in the collection. The original order of rules is preserved during processing, except that rules of the &#39;FORWARD&#39; type are processed after the rules with other defined actions. The relative order of the &#39;FORWARD&#39; type rules is also preserved during the processing. |  [optional] |
| **listenerIp** | **String** | The listening (inbound) IP. |  |
| **listenerPort** | **Integer** | The listening (inbound) port number; the valid range is 1 to 65535. |  |
| **name** | **String** | The name of the Application Load Balancer forwarding rule. |  |
| **protocol** | [**ProtocolEnum**](#ProtocolEnum) | The balancing protocol. |  |
| **serverCertificates** | [**List&lt;UUID&gt;**](UUID.md) | Array of items in the collection. |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
| ---- | -----
| HTTP | &quot;HTTP&quot; |


