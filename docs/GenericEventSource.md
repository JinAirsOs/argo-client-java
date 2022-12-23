

# GenericEventSource

GenericEventSource refers to a generic event source. It can be used to implement a custom event source.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**config** | **String** |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**insecure** | **Boolean** | Insecure determines the type of connection. |  [optional]
**jsonBody** | **Boolean** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**url** | **String** | URL of the gRPC server that implements the event source. |  [optional]



