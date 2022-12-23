

# HDFSEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | **List&lt;String&gt;** |  |  [optional]
**checkInterval** | **String** |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**hdfsUser** | **String** | HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used. |  [optional]
**krbCCacheSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**krbConfigConfigMap** | [**V1ConfigMapKeySelector**](V1ConfigMapKeySelector.md) |  |  [optional]
**krbKeytabSecret** | [**V1SecretKeySelector**](V1SecretKeySelector.md) |  |  [optional]
**krbRealm** | **String** | KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used. |  [optional]
**krbServicePrincipalName** | **String** | KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used. |  [optional]
**krbUsername** | **String** | KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used. |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**type** | **String** |  |  [optional]
**watchPathConfig** | [**WatchPathConfig**](WatchPathConfig.md) |  |  [optional]



