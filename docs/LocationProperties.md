

# LocationProperties

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | A name of that resource |  [optional] |
| **features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | List of features supported by the location |  [optional] [readonly] |
| **imageAliases** | **List&lt;String&gt;** | List of image aliases available for the location |  [optional] [readonly] |
| **cpuArchitecture** | [**List&lt;CpuArchitectureProperties&gt;**](CpuArchitectureProperties.md) | Array of features and CPU families available in a location |  [optional] [readonly] |



## Enum: List&lt;FeaturesEnum&gt;

| Name | Value |
| ---- | -----
| SSD | &quot;SSD&quot; |
| SSD_STORAGE_ZONING | &quot;SSD_STORAGE_ZONING&quot; |


