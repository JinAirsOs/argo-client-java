

# TriggerTemplate

TriggerTemplate is the template that describes trigger specification.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**argoWorkflow** | [**ArgoWorkflowTrigger**](ArgoWorkflowTrigger.md) |  |  [optional]
**awsLambda** | [**AWSLambdaTrigger**](AWSLambdaTrigger.md) |  |  [optional]
**azureEventHubs** | [**AzureEventHubsTrigger**](AzureEventHubsTrigger.md) |  |  [optional]
**conditions** | **String** |  |  [optional]
**conditionsReset** | [**List&lt;ConditionsResetCriteria&gt;**](ConditionsResetCriteria.md) |  |  [optional]
**custom** | [**CustomTrigger**](CustomTrigger.md) |  |  [optional]
**http** | [**HTTPTrigger**](HTTPTrigger.md) |  |  [optional]
**k8s** | [**StandardK8STrigger**](StandardK8STrigger.md) |  |  [optional]
**kafka** | [**KafkaTrigger**](KafkaTrigger.md) |  |  [optional]
**log** | [**LogTrigger**](LogTrigger.md) |  |  [optional]
**name** | **String** | Name is a unique name of the action to take. |  [optional]
**nats** | [**NATSTrigger**](NATSTrigger.md) |  |  [optional]
**openWhisk** | [**OpenWhiskTrigger**](OpenWhiskTrigger.md) |  |  [optional]
**pulsar** | [**PulsarTrigger**](PulsarTrigger.md) |  |  [optional]
**slack** | [**SlackTrigger**](SlackTrigger.md) |  |  [optional]



