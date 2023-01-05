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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1BitbucketAuth;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1EventSourceFilter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1WebhookContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1BitbucketEventSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1BitbucketEventSource {
  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private IoArgoprojEventsV1alpha1BitbucketAuth auth;

  public static final String SERIALIZED_NAME_DELETE_HOOK_ON_FINISH = "deleteHookOnFinish";
  @SerializedName(SERIALIZED_NAME_DELETE_HOOK_ON_FINISH)
  private Boolean deleteHookOnFinish;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = null;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private IoArgoprojEventsV1alpha1EventSourceFilter filter;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_PROJECT_KEY = "projectKey";
  @SerializedName(SERIALIZED_NAME_PROJECT_KEY)
  private String projectKey;

  public static final String SERIALIZED_NAME_REPOSITORY_SLUG = "repositorySlug";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_SLUG)
  private String repositorySlug;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private IoArgoprojEventsV1alpha1WebhookContext webhook;


  public IoArgoprojEventsV1alpha1BitbucketEventSource auth(IoArgoprojEventsV1alpha1BitbucketAuth auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1BitbucketAuth getAuth() {
    return auth;
  }


  public void setAuth(IoArgoprojEventsV1alpha1BitbucketAuth auth) {
    this.auth = auth;
  }


  public IoArgoprojEventsV1alpha1BitbucketEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
    
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


  public IoArgoprojEventsV1alpha1BitbucketEventSource events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public IoArgoprojEventsV1alpha1BitbucketEventSource addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Events this webhook is subscribed to.
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Events this webhook is subscribed to.")

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public IoArgoprojEventsV1alpha1BitbucketEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    
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


  public IoArgoprojEventsV1alpha1BitbucketEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1BitbucketEventSource putMetadataItem(String key, String metadataItem) {
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


  public IoArgoprojEventsV1alpha1BitbucketEventSource owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Owner of the repository.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Owner of the repository.")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public IoArgoprojEventsV1alpha1BitbucketEventSource projectKey(String projectKey) {
    
    this.projectKey = projectKey;
    return this;
  }

   /**
   * Get projectKey
   * @return projectKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectKey() {
    return projectKey;
  }


  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }


  public IoArgoprojEventsV1alpha1BitbucketEventSource repositorySlug(String repositorySlug) {
    
    this.repositorySlug = repositorySlug;
    return this;
  }

   /**
   * RepositorySlug is a URL-friendly version of a repository name, automatically generated by Bitbucket for use in the URL.
   * @return repositorySlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RepositorySlug is a URL-friendly version of a repository name, automatically generated by Bitbucket for use in the URL.")

  public String getRepositorySlug() {
    return repositorySlug;
  }


  public void setRepositorySlug(String repositorySlug) {
    this.repositorySlug = repositorySlug;
  }


  public IoArgoprojEventsV1alpha1BitbucketEventSource webhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1BitbucketEventSource ioArgoprojEventsV1alpha1BitbucketEventSource = (IoArgoprojEventsV1alpha1BitbucketEventSource) o;
    return Objects.equals(this.auth, ioArgoprojEventsV1alpha1BitbucketEventSource.auth) &&
        Objects.equals(this.deleteHookOnFinish, ioArgoprojEventsV1alpha1BitbucketEventSource.deleteHookOnFinish) &&
        Objects.equals(this.events, ioArgoprojEventsV1alpha1BitbucketEventSource.events) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1BitbucketEventSource.filter) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1BitbucketEventSource.metadata) &&
        Objects.equals(this.owner, ioArgoprojEventsV1alpha1BitbucketEventSource.owner) &&
        Objects.equals(this.projectKey, ioArgoprojEventsV1alpha1BitbucketEventSource.projectKey) &&
        Objects.equals(this.repositorySlug, ioArgoprojEventsV1alpha1BitbucketEventSource.repositorySlug) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1BitbucketEventSource.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, deleteHookOnFinish, events, filter, metadata, owner, projectKey, repositorySlug, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1BitbucketEventSource {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

