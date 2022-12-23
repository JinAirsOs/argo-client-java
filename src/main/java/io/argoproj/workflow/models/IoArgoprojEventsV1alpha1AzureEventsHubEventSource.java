/*
 * Argo Workflows API
 * Argo Workflows is an open source container-native workflow engine for orchestrating parallel jobs on Kubernetes. For more information, please see https://argoproj.github.io/argo-workflows/
 *
 * The version of the OpenAPI document: VERSION
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * IoArgoprojEventsV1alpha1AzureEventsHubEventSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1AzureEventsHubEventSource {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private IoArgoprojEventsV1alpha1EventSourceFilter filter;

  public static final String SERIALIZED_NAME_FQDN = "fqdn";
  @SerializedName(SERIALIZED_NAME_FQDN)
  private String fqdn;

  public static final String SERIALIZED_NAME_HUB_NAME = "hubName";
  @SerializedName(SERIALIZED_NAME_HUB_NAME)
  private String hubName;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_SHARED_ACCESS_KEY = "sharedAccessKey";
  @SerializedName(SERIALIZED_NAME_SHARED_ACCESS_KEY)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector sharedAccessKey;

  public static final String SERIALIZED_NAME_SHARED_ACCESS_KEY_NAME = "sharedAccessKeyName";
  @SerializedName(SERIALIZED_NAME_SHARED_ACCESS_KEY_NAME)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector sharedAccessKeyName;


  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1EventSourceFilter getFilter() {
    return filter;
  }


  public void setFilter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    this.filter = filter;
  }


  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource fqdn(String fqdn) {
    
    this.fqdn = fqdn;
    return this;
  }

   /**
   * Get fqdn
   * @return fqdn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFqdn() {
    return fqdn;
  }


  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }


  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource hubName(String hubName) {
    
    this.hubName = hubName;
    return this;
  }

   /**
   * Get hubName
   * @return hubName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHubName() {
    return hubName;
  }


  public void setHubName(String hubName) {
    this.hubName = hubName;
  }


  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource sharedAccessKey(io.kubernetes.client.openapi.models.V1SecretKeySelector sharedAccessKey) {
    
    this.sharedAccessKey = sharedAccessKey;
    return this;
  }

   /**
   * Get sharedAccessKey
   * @return sharedAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSharedAccessKey() {
    return sharedAccessKey;
  }


  public void setSharedAccessKey(io.kubernetes.client.openapi.models.V1SecretKeySelector sharedAccessKey) {
    this.sharedAccessKey = sharedAccessKey;
  }


  public IoArgoprojEventsV1alpha1AzureEventsHubEventSource sharedAccessKeyName(io.kubernetes.client.openapi.models.V1SecretKeySelector sharedAccessKeyName) {
    
    this.sharedAccessKeyName = sharedAccessKeyName;
    return this;
  }

   /**
   * Get sharedAccessKeyName
   * @return sharedAccessKeyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSharedAccessKeyName() {
    return sharedAccessKeyName;
  }


  public void setSharedAccessKeyName(io.kubernetes.client.openapi.models.V1SecretKeySelector sharedAccessKeyName) {
    this.sharedAccessKeyName = sharedAccessKeyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1AzureEventsHubEventSource ioArgoprojEventsV1alpha1AzureEventsHubEventSource = (IoArgoprojEventsV1alpha1AzureEventsHubEventSource) o;
    return Objects.equals(this.filter, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.filter) &&
        Objects.equals(this.fqdn, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.fqdn) &&
        Objects.equals(this.hubName, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.hubName) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.metadata) &&
        Objects.equals(this.sharedAccessKey, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.sharedAccessKey) &&
        Objects.equals(this.sharedAccessKeyName, ioArgoprojEventsV1alpha1AzureEventsHubEventSource.sharedAccessKeyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, fqdn, hubName, metadata, sharedAccessKey, sharedAccessKeyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1AzureEventsHubEventSource {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    hubName: ").append(toIndentedString(hubName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sharedAccessKey: ").append(toIndentedString(sharedAccessKey)).append("\n");
    sb.append("    sharedAccessKeyName: ").append(toIndentedString(sharedAccessKeyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

