

# HTTPTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basicAuth** | [**BasicAuth**](BasicAuth.md) |  |  [optional]
**headers** | **Map&lt;String, String&gt;** |  |  [optional]
**method** | **String** |  |  [optional]
**parameters** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) | Parameters is the list of key-value extracted from event&#39;s payload that are applied to the HTTP trigger resource. |  [optional]
**payload** | [**List&lt;TriggerParameter&gt;**](TriggerParameter.md) |  |  [optional]
**secureHeaders** | [**List&lt;SecureHeader&gt;**](SecureHeader.md) |  |  [optional]
**timeout** | **String** |  |  [optional]
**tls** | [**TLSConfig**](TLSConfig.md) |  |  [optional]
**url** | **String** | URL refers to the URL to send HTTP request to. |  [optional]



