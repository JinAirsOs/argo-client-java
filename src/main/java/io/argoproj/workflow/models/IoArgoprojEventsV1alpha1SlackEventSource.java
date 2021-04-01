/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v3.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1WebhookContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1SlackEventSource
 */

public class IoArgoprojEventsV1alpha1SlackEventSource {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_SIGNING_SECRET = "signingSecret";
  @SerializedName(SERIALIZED_NAME_SIGNING_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector signingSecret;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector token;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private IoArgoprojEventsV1alpha1WebhookContext webhook;


  public IoArgoprojEventsV1alpha1SlackEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1SlackEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
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


  public IoArgoprojEventsV1alpha1SlackEventSource signingSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector signingSecret) {
    
    this.signingSecret = signingSecret;
    return this;
  }

   /**
   * Get signingSecret
   * @return signingSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSigningSecret() {
    return signingSecret;
  }


  public void setSigningSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector signingSecret) {
    this.signingSecret = signingSecret;
  }


  public IoArgoprojEventsV1alpha1SlackEventSource token(io.kubernetes.client.openapi.models.V1SecretKeySelector token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getToken() {
    return token;
  }


  public void setToken(io.kubernetes.client.openapi.models.V1SecretKeySelector token) {
    this.token = token;
  }


  public IoArgoprojEventsV1alpha1SlackEventSource webhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1WebhookContext getWebhook() {
    return webhook;
  }


  public void setWebhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1SlackEventSource ioArgoprojEventsV1alpha1SlackEventSource = (IoArgoprojEventsV1alpha1SlackEventSource) o;
    return Objects.equals(this.metadata, ioArgoprojEventsV1alpha1SlackEventSource.metadata) &&
        Objects.equals(this.signingSecret, ioArgoprojEventsV1alpha1SlackEventSource.signingSecret) &&
        Objects.equals(this.token, ioArgoprojEventsV1alpha1SlackEventSource.token) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1SlackEventSource.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, signingSecret, token, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1SlackEventSource {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    signingSecret: ").append(toIndentedString(signingSecret)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

