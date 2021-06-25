# NatGatewayProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | Name of the NAT gateway |  |
| **publicIps** | **List&lt;String&gt;** | Collection of public IP addresses of the NAT gateway. Should be customer reserved IP addresses in that location |  |
| **lans** | [**List&lt;NatGatewayLanProperties&gt;**](natgatewaylanproperties.md) | Collection of LANs connected to the NAT gateway. IPs must contain valid subnet mask. If user will not provide any IP then system will generate an IP with /24 subnet. | \[optional\] |

