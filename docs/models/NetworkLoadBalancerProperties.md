

# NetworkLoadBalancerProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Network Load Balancer. |  |
| **listenerLan** | **Integer** | ID of the listening LAN (inbound). |  |
| **ips** | **List&lt;String&gt;** | Collection of IP addresses of the Network Load Balancer. (Inbound and outbound) IP of the listenerLan must be a customer reserved IP for the public Load Balancer and private IP for the private Load balancer. |  [optional] |
| **targetLan** | **Integer** | ID of the balanced private target LAN (outbound). |  |
| **lbPrivateIps** | **List&lt;String&gt;** | Collection of private IP addresses with subnet mask of the Network Load Balancer. IPs must contain valid subnet mask. If user will not provide any IP then the system will generate one IP with /24 subnet. |  [optional] |


