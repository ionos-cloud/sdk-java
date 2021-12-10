

# FlowLogProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the  resource. |  |
| **action** | [**ActionEnum**](#ActionEnum) | Specifies the traffic action pattern. |  |
| **direction** | [**DirectionEnum**](#DirectionEnum) | Specifies the traffic direction pattern. |  |
| **bucket** | **String** | S3 bucket name of an existing IONOS Cloud S3 bucket. |  |



## Enum: ActionEnum

| Name | Value |
| ---- | -----
| ACCEPTED | &quot;ACCEPTED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| ALL | &quot;ALL&quot; |



## Enum: DirectionEnum

| Name | Value |
| ---- | -----
| INGRESS | &quot;INGRESS&quot; |
| EGRESS | &quot;EGRESS&quot; |
| BIDIRECTIONAL | &quot;BIDIRECTIONAL&quot; |


