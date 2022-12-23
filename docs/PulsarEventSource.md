

# PulsarEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authTokenSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**connectionBackoff** | [**Backoff**](Backoff.md) |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**jsonBody** | **Boolean** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**tls** | [**TLSConfig**](TLSConfig.md) |  |  [optional]
**tlsAllowInsecureConnection** | **Boolean** |  |  [optional]
**tlsTrustCertsSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**tlsValidateHostname** | **Boolean** |  |  [optional]
**topics** | **List&lt;String&gt;** |  |  [optional]
**type** | **String** |  |  [optional]
**url** | **String** |  |  [optional]



