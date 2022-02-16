

# NetworkLoadBalancerForwardingRuleHealthCheck

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clientTimeout** | **Integer** | The maximum time in milliseconds to wait for the client to acknowledge or send data; default is 50,000 (50 seconds). |  [optional] |
| **connectTimeout** | **Integer** | The maximum time in milliseconds to wait for a connection attempt to a target to succeed; default is 5000 (five seconds). |  [optional] |
| **targetTimeout** | **Integer** | The maximum time in milliseconds that a target can remain inactive; default is 50,000 (50 seconds). |  [optional] |
| **retries** | **Integer** | The maximum number of attempts to reconnect to a target after a connection failure. Valid range is 0 to 65535 and default is three reconnection attempts. |  [optional] |


