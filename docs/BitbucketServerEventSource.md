

# BitbucketServerEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**bitbucketserverBaseURL** | **String** |  |  [optional]
**deleteHookOnFinish** | **Boolean** |  |  [optional]
**events** | **List&lt;String&gt;** |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**projectKey** | **String** |  |  [optional]
**repositories** | [**List&lt;BitbucketServerRepository&gt;**](BitbucketServerRepository.md) |  |  [optional]
**repositorySlug** | **String** |  |  [optional]
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**webhookSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]



