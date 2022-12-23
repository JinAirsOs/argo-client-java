

# OpenWhiskTrigger

OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionName** | **String** | Name of the action/function. |  [optional]
**authToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**host** | **String** | Host URL of the OpenWhisk. |  [optional]
**namespace** | **String** | Namespace for the action. Defaults to \&quot;_\&quot;. +optional. |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. |  [optional]
**version** | **String** |  |  [optional]



