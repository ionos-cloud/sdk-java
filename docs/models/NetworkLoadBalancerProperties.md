

# NetworkLoadBalancerProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ips** | **List&lt;String&gt;** | Collection of the Network Load Balancer IP addresses. (Inbound and outbound) IPs of the listenerLan must be customer-reserved IPs for public Load Balancers, and private IPs for private Load Balancers. |  [optional] |
| **lbPrivateIps** | **List&lt;String&gt;** | Collection of private IP addresses with subnet mask of the Network Load Balancer. IPs must contain a valid subnet mask. If no IP is provided, the system will generate an IP with /24 subnet. |  [optional] |
| **listenerLan** | **Integer** | ID of the listening LAN (inbound). |  |
| **name** | **String** | The name of the Network Load Balancer. |  |
| **targetLan** | **Integer** | ID of the balanced private target LAN (outbound). |  |


