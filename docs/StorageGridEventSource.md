

# StorageGridEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiURL** | **String** | APIURL is the url of the storagegrid api. |  [optional]
**authToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**bucket** | **String** | Name of the bucket to register notifications for. |  [optional]
**events** | **List&lt;String&gt;** |  |  [optional]
**filter** | [**StorageGridFilter**](StorageGridFilter.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**region** | **String** |  |  [optional]
**topicArn** | **String** |  |  [optional]
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]



