# FlowLogProperties

## Properties

| Name | Type | Description | Notes |
| :--- | :--- | :--- | :--- |
| **name** | **String** | A name of that resource |  |
| **action** | [**ActionEnum**](flowlogproperties.md#ActionEnum) | Specifies the traffic action pattern. |  |
| **direction** | [**DirectionEnum**](flowlogproperties.md#DirectionEnum) | Specifies the traffic direction pattern. |  |
| **bucket** | **String** | S3 bucket name of an existing IONOS Cloud S3 bucket. |  |

## Enum: ActionEnum

| Name | Value |
| :--- | :--- |
| ACCEPTED | "ACCEPTED" |
| REJECTED | "REJECTED" |
| ALL | "ALL" |

## Enum: DirectionEnum

| Name | Value |
| :--- | :--- |
| INGRESS | "INGRESS" |
| EGRESS | "EGRESS" |
| BIDIRECTIONAL | "BIDIRECTIONAL" |

