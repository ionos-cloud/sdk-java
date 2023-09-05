

# NatGatewayProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lans** | [**List&lt;NatGatewayLanProperties&gt;**](NatGatewayLanProperties.md) | Collection of LANs connected to the NAT Gateway. IPs must contain a valid subnet mask. If no IP is provided, the system will generate an IP with /24 subnet. |  [optional] |
| **name** | **String** | Name of the NAT Gateway. |  |
| **publicIps** | **List&lt;String&gt;** | Collection of public IP addresses of the NAT Gateway. Should be customer reserved IP addresses in that location. |  |


