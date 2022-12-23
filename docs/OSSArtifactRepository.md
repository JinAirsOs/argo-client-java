

# OSSArtifactRepository

OSSArtifactRepository defines the controller configuration for an OSS artifact repository
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**bucket** | **String** | Bucket is the name of the bucket |  [optional]
**createBucketIfNotPresent** | **Boolean** | CreateBucketIfNotPresent tells the driver to attempt to create the OSS bucket for output artifacts, if it doesn&#39;t exist |  [optional]
**endpoint** | **String** | Endpoint is the hostname of the bucket endpoint |  [optional]
**keyFormat** | **String** | KeyFormat is defines the format of how to store keys. Can reference workflow variables |  [optional]
**lifecycleRule** | [**OSSLifecycleRule**](OSSLifecycleRule.md) |  |  [optional]
**secretKeySecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**securityToken** | **String** | SecurityToken is the user&#39;s temporary security token. For more details, check out: https://www.alibabacloud.com/help/doc-detail/100624.htm |  [optional]



