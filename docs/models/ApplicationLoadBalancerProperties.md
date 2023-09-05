

# ApplicationLoadBalancerProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ips** | **List&lt;String&gt;** | Collection of the Application Load Balancer IP addresses. (Inbound and outbound) IPs of the &#39;listenerLan&#39; are customer-reserved public IPs for the public load balancers, and private IPs for the private load balancers. |  [optional] |
| **lbPrivateIps** | **List&lt;String&gt;** | Collection of private IP addresses with the subnet mask of the Application Load Balancer. IPs must contain valid a subnet mask. If no IP is provided, the system will generate an IP with /24 subnet. |  [optional] |
| **listenerLan** | **Integer** | The ID of the listening (inbound) LAN. |  |
| **name** | **String** | The Application Load Balancer name. |  |
| **targetLan** | **Integer** | The ID of the balanced private target LAN (outbound). |  |


