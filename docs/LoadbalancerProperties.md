

# LoadbalancerProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A name of that resource |  [optional]
**ip** | [**IpEnum**](#IpEnum) | IPv4 address of the loadbalancer. All attached NICs will inherit this IP. Leaving value null will assign IP automatically |  [optional]
**dhcp** | **Boolean** | Indicates if the loadbalancer will reserve an IP using DHCP |  [optional]



## Enum: IpEnum

Name | Value
---- | -----
_VALID_IP_ADDRESS_ | &quot;@Valid IP address@&quot;
NULL | &quot;null&quot;



