# NetworkLoadBalancerProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that Network Load Balancer |  |
| **listenerLan** | **Integer** | Id of the listening LAN. \(inbound\) |  |
| **ips** | **List&lt;String&gt;** | Collection of IP addresses of the Network Load Balancer. \(inbound and outbound\) IP of the listenerLan must be a customer reserved IP for the public load balancer and private IP for the private load balancer. | \[optional\] |
| **targetLan** | **Integer** | Id of the balanced private target LAN. \(outbound\) |  |
| **lbPrivateIps** | **List&lt;String&gt;** | Collection of private IP addresses with subnet mask of the Network Load Balancer. IPs must contain valid subnet mask. If user will not provide any IP then the system will generate one IP with /24 subnet. | \[optional\] |

