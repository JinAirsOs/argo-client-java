

# CronWorkflowStatus

CronWorkflowStatus is the status of a CronWorkflow
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | [**List&lt;V1ObjectReference&gt;**](V1ObjectReference.md) | Active is a list of active workflows stemming from this CronWorkflow | 
**conditions** | [**List&lt;Condition&gt;**](Condition.md) | Conditions is a list of conditions the CronWorkflow may have | 
**lastScheduledTime** | [**DateTime**](DateTime.md) | Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. | 



