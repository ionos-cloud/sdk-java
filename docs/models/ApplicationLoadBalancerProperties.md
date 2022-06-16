

# ApplicationLoadBalancerProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Application Load Balancer. |  |
| **listenerLan** | **Integer** | ID of the listening (inbound) LAN. |  |
| **ips** | **List&lt;String&gt;** | Collection of the Application Load Balancer IP addresses. (Inbound and outbound) IPs of the listenerLan are customer-reserved public IPs for the public Load Balancers, and private IPs for the private Load Balancers. |  [optional] |
| **targetLan** | **Integer** | ID of the balanced private target LAN (outbound). |  |
| **lbPrivateIps** | **List&lt;String&gt;** | Collection of private IP addresses with the subnet mask of the Application Load Balancer. IPs must contain valid a subnet mask. If no IP is provided, the system will generate an IP with /24 subnet. |  [optional] |


