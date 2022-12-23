

# PulsarTrigger

PulsarTrigger refers to the specification of the Pulsar trigger.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authTokenSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**connectionBackoff** | [**Backoff**](Backoff.md) |  |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of parameters that is applied to resolved Kafka trigger object. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Payload is the list of key-value extracted from an event payload to construct the request payload. |  [optional]
**tls** | [**TLSConfig**](TLSConfig.md) |  |  [optional]
**tlsAllowInsecureConnection** | **Boolean** |  |  [optional]
**tlsTrustCertsSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**tlsValidateHostname** | **Boolean** |  |  [optional]
**topic** | **String** |  |  [optional]
**url** | **String** |  |  [optional]



