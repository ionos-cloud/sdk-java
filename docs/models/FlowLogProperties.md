

# FlowLogProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#ActionEnum) | Specifies the traffic action pattern. |  |
| **bucket** | **String** | The S3 bucket name of an existing IONOS Cloud S3 bucket. |  |
| **direction** | [**DirectionEnum**](#DirectionEnum) | Specifies the traffic direction pattern. |  |
| **name** | **String** | The resource name. |  |



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


