

# WebhookContext

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**endpoint** | **String** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**method** | **String** |  |  [optional]
**port** | **String** | Port on which HTTP server is listening for incoming events. |  [optional]
**serverCertSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**serverKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**url** | **String** | URL is the url of the server. |  [optional]



