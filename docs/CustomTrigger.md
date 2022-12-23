

# CustomTrigger

CustomTrigger refers to the specification of the custom trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of parameters that is applied to resolved custom trigger trigger object. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. |  [optional]
**secure** | **Boolean** |  |  [optional]
**serverNameOverride** | **String** | ServerNameOverride for the secure connection between sensor and custom trigger gRPC server. |  [optional]
**serverURL** | **String** |  |  [optional]
**spec** | **Map&lt;String, String&gt;** | Spec is the custom trigger resource specification that custom trigger gRPC server knows how to interpret. |  [optional]



