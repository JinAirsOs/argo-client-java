

# SQSEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**dlq** | **Boolean** |  |  [optional]
**endpoint** | **String** |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**jsonBody** | **Boolean** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**queue** | **String** |  |  [optional]
**queueAccountId** | **String** |  |  [optional]
**region** | **String** |  |  [optional]
**roleARN** | **String** |  |  [optional]
**secretKey** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**waitTimeSeconds** | **String** | WaitTimeSeconds is The duration (in seconds) for which the call waits for a message to arrive in the queue before returning. |  [optional]



