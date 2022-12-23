

# EventDependency

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventName** | **String** |  |  [optional]
**eventSourceName** | **String** |  |  [optional]
**filters** | [**EventDependencyFilter**](EventDependencyFilter.md) |  |  [optional]
**filtersLogicalOperator** | **String** | FiltersLogicalOperator defines how different filters are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;). |  [optional]
**name** | **String** |  |  [optional]
**transform** | [**EventDependencyTransformer**](EventDependencyTransformer.md) |  |  [optional]



