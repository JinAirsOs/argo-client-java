

# EventDependencyFilter

EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**EventContext**](EventContext.md) |  |  [optional]
**data** | [**List&lt;DataFilter&gt;**](DataFilter.md) |  |  [optional]
**dataLogicalOperator** | **String** | DataLogicalOperator defines how multiple Data filters (if defined) are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;). |  [optional]
**exprLogicalOperator** | **String** | ExprLogicalOperator defines how multiple Exprs filters (if defined) are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;). |  [optional]
**exprs** | [**List&lt;ExprFilter&gt;**](ExprFilter.md) | Exprs contains the list of expressions evaluated against the event payload. |  [optional]
**time** | [**TimeFilter**](TimeFilter.md) |  |  [optional]



