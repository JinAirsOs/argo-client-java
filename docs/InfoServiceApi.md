# InfoServiceApi

All URIs are relative to *http://localhost:2746*

Method | HTTP request | Description
------------- | ------------- | -------------
[**infoServiceGetInfo**](InfoServiceApi.md#infoServiceGetInfo) | **GET** /api/v1/info | 
[**infoServiceGetUserInfo**](InfoServiceApi.md#infoServiceGetUserInfo) | **GET** /api/v1/userinfo | 
[**infoServiceGetVersion**](InfoServiceApi.md#infoServiceGetVersion) | **GET** /api/v1/version | 


<a name="infoServiceGetInfo"></a>
# **infoServiceGetInfo**
> InfoResponse infoServiceGetInfo()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InfoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    InfoServiceApi apiInstance = new InfoServiceApi(defaultClient);
    try {
      InfoResponse result = apiInstance.infoServiceGetInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoServiceApi#infoServiceGetInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="infoServiceGetUserInfo"></a>
# **infoServiceGetUserInfo**
> GetUserInfoResponse infoServiceGetUserInfo()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InfoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    InfoServiceApi apiInstance = new InfoServiceApi(defaultClient);
    try {
      GetUserInfoResponse result = apiInstance.infoServiceGetUserInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoServiceApi#infoServiceGetUserInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUserInfoResponse**](GetUserInfoResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

<a name="infoServiceGetVersion"></a>
# **infoServiceGetVersion**
> Version infoServiceGetVersion()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InfoServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");
    
    // Configure API key authorization: BearerToken
    ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerToken.setApiKeyPrefix("Token");

    InfoServiceApi apiInstance = new InfoServiceApi(defaultClient);
    try {
      Version result = apiInstance.infoServiceGetVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoServiceApi#infoServiceGetVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Version**](Version.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

