/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v3.0.5
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1GitlabEventSource
 */

public class IoArgoprojEventsV1alpha1GitlabEventSource {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector accessToken;

  public static final String SERIALIZED_NAME_DELETE_HOOK_ON_FINISH = "deleteHookOnFinish";
  @SerializedName(SERIALIZED_NAME_DELETE_HOOK_ON_FINISH)
  private Boolean deleteHookOnFinish;

  public static final String SERIALIZED_NAME_ENABLE_S_S_L_VERIFICATION = "enableSSLVerification";
  @SerializedName(SERIALIZED_NAME_ENABLE_S_S_L_VERIFICATION)
  private Boolean enableSSLVerification;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = null;

  public static final String SERIALIZED_NAME_GITLAB_BASE_U_R_L = "gitlabBaseURL";
  @SerializedName(SERIALIZED_NAME_GITLAB_BASE_U_R_L)
  private String gitlabBaseURL;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PROJECT_I_D = "projectID";
  @SerializedName(SERIALIZED_NAME_PROJECT_I_D)
  private String projectID;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private IoArgoprojEventsV1alpha1WebhookContext webhook;


  public IoArgoprojEventsV1alpha1GitlabEventSource accessToken(io.kubernetes.client.openapi.models.V1SecretKeySelector accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(io.kubernetes.client.openapi.models.V1SecretKeySelector accessToken) {
    this.accessToken = accessToken;
  }


  public IoArgoprojEventsV1alpha1GitlabEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
    
    this.deleteHookOnFinish = deleteHookOnFinish;
    return this;
  }

   /**
   * Get deleteHookOnFinish
   * @return deleteHookOnFinish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteHookOnFinish() {
    return deleteHookOnFinish;
  }


  public void setDeleteHookOnFinish(Boolean deleteHookOnFinish) {
    this.deleteHookOnFinish = deleteHookOnFinish;
  }


  public IoArgoprojEventsV1alpha1GitlabEventSource enableSSLVerification(Boolean enableSSLVerification) {
    
    this.enableSSLVerification = enableSSLVerification;
    return this;
  }

   /**
   * Get enableSSLVerification
   * @return enableSSLVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableSSLVerification() {
    return enableSSLVerification;
  }


  public void setEnableSSLVerification(Boolean enableSSLVerification) {
    this.enableSSLVerification = enableSSLVerification;
  }


  public IoArgoprojEventsV1alpha1GitlabEventSource events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public IoArgoprojEventsV1alpha1GitlabEventSource addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Events are gitlab event to listen to. Refer https://github.com/xanzy/go-gitlab/blob/bf34eca5d13a9f4c3f501d8a97b8ac226d55e4d9/projects.go#L794.
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Events are gitlab event to listen to. Refer https://github.com/xanzy/go-gitlab/blob/bf34eca5d13a9f4c3f501d8a97b8ac226d55e4d9/projects.go#L794.")

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public IoArgoprojEventsV1alpha1GitlabEventSource gitlabBaseURL(String gitlabBaseURL) {
    
    this.gitlabBaseURL = gitlabBaseURL;
    return this;
  }

   /**
   * Get gitlabBaseURL
   * @return gitlabBaseURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGitlabBaseURL() {
    return gitlabBaseURL;
  }


  public void setGitlabBaseURL(String gitlabBaseURL) {
    this.gitlabBaseURL = gitlabBaseURL;
  }


  public IoArgoprojEventsV1alpha1GitlabEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1GitlabEventSource putMetadataItem(String key, String metadataItem) {
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


  public IoArgoprojEventsV1alpha1GitlabEventSource projectID(String projectID) {
    
    this.projectID = projectID;
    return this;
  }

   /**
   * Get projectID
   * @return projectID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectID() {
    return projectID;
  }


  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }


  public IoArgoprojEventsV1alpha1GitlabEventSource webhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    
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
    IoArgoprojEventsV1alpha1GitlabEventSource ioArgoprojEventsV1alpha1GitlabEventSource = (IoArgoprojEventsV1alpha1GitlabEventSource) o;
    return Objects.equals(this.accessToken, ioArgoprojEventsV1alpha1GitlabEventSource.accessToken) &&
        Objects.equals(this.deleteHookOnFinish, ioArgoprojEventsV1alpha1GitlabEventSource.deleteHookOnFinish) &&
        Objects.equals(this.enableSSLVerification, ioArgoprojEventsV1alpha1GitlabEventSource.enableSSLVerification) &&
        Objects.equals(this.events, ioArgoprojEventsV1alpha1GitlabEventSource.events) &&
        Objects.equals(this.gitlabBaseURL, ioArgoprojEventsV1alpha1GitlabEventSource.gitlabBaseURL) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1GitlabEventSource.metadata) &&
        Objects.equals(this.projectID, ioArgoprojEventsV1alpha1GitlabEventSource.projectID) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1GitlabEventSource.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, deleteHookOnFinish, enableSSLVerification, events, gitlabBaseURL, metadata, projectID, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1GitlabEventSource {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
    sb.append("    enableSSLVerification: ").append(toIndentedString(enableSSLVerification)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    gitlabBaseURL: ").append(toIndentedString(gitlabBaseURL)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
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

