

# ApplicationLoadBalancerForwardingRuleProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Application Load Balancer forwarding rule. |  |
| **protocol** | [**ProtocolEnum**](#ProtocolEnum) | Balancing protocol |  |
| **listenerIp** | **String** | Listening (inbound) IP |  |
| **listenerPort** | **Integer** | Listening (inbound) port number; valid range is 1 to 65535. |  |
| **clientTimeout** | **Integer** | The maximum time in milliseconds to wait for the client to acknowledge or send data; default is 50,000 (50 seconds). |  [optional] |
| **serverCertificates** | [**List&lt;UUID&gt;**](UUID.md) | Array of items in the collection. |  [optional] |
| **httpRules** | [**List&lt;ApplicationLoadBalancerHttpRule&gt;**](ApplicationLoadBalancerHttpRule.md) | An array of items in the collection. The original order of rules is perserved during processing, except for Forward-type rules are processed after the rules with other action defined. The relative order of Forward-type rules is also preserved during the processing. |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
| ---- | -----
| HTTP | &quot;HTTP&quot; |


