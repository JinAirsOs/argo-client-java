

# GithubEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** |  |  [optional]
**apiToken** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**contentType** | **String** |  |  [optional]
**deleteHookOnFinish** | **Boolean** |  |  [optional]
**events** | **List&lt;String&gt;** |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**githubApp** | [**GithubAppCreds**](GithubAppCreds.md) |  |  [optional]
**githubBaseURL** | **String** |  |  [optional]
**githubUploadURL** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**insecure** | **Boolean** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**organizations** | **List&lt;String&gt;** | Organizations holds the names of organizations (used for organization level webhooks). Not required if Repositories is set. |  [optional]
**owner** | **String** |  |  [optional]
**repositories** | [**List&lt;OwnedRepositories&gt;**](OwnedRepositories.md) | Repositories holds the information of repositories, which uses repo owner as the key, and list of repo names as the value. Not required if Organizations is set. |  [optional]
**repository** | **String** |  |  [optional]
**webhook** | [**WebhookContext**](WebhookContext.md) |  |  [optional]
**webhookSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]



