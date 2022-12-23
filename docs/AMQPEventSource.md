

# AMQPEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auth** | [**BasicAuth**](BasicAuth.md) |  |  [optional]
**connectionBackoff** | [**Backoff**](Backoff.md) |  |  [optional]
**consume** | [**AMQPConsumeConfig**](AMQPConsumeConfig.md) |  |  [optional]
**exchangeDeclare** | [**AMQPExchangeDeclareConfig**](AMQPExchangeDeclareConfig.md) |  |  [optional]
**exchangeName** | **String** |  |  [optional]
**exchangeType** | **String** |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**jsonBody** | **Boolean** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**queueBind** | [**AMQPQueueBindConfig**](AMQPQueueBindConfig.md) |  |  [optional]
**queueDeclare** | [**AMQPQueueDeclareConfig**](AMQPQueueDeclareConfig.md) |  |  [optional]
**routingKey** | **String** |  |  [optional]
**tls** | [**TLSConfig**](TLSConfig.md) |  |  [optional]
**url** | **String** |  |  [optional]
**urlSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]



