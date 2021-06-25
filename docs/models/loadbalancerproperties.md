# LoadbalancerProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that resource | \[optional\] |
| **ip** | [**IpEnum**](loadbalancerproperties.md#IpEnum) | IPv4 address of the loadbalancer. All attached NICs will inherit this IP. Leaving value null will assign IP automatically | \[optional\] |
| **dhcp** | **Boolean** | Indicates if the loadbalancer will reserve an IP using DHCP | \[optional\] |

## Enum: IpEnum

| Name | Value |
| :--- | :--- |
| _VALID\_IP\_ADDRESS_ | "@Valid IP address@" |
| NULL | "null" |

