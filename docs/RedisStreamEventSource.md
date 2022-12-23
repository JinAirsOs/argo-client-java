

# RedisStreamEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consumerGroup** | **String** |  |  [optional]
**db** | **Integer** |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**hostAddress** | **String** |  |  [optional]
**maxMsgCountPerRead** | **Integer** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**password** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**streams** | **List&lt;String&gt;** | Streams to look for entries. XREADGROUP is used on all streams using a single consumer group. |  [optional]
**tls** | [**TLSConfig**](TLSConfig.md) |  |  [optional]
**username** | **String** |  |  [optional]



