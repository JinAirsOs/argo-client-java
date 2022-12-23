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

import java.util.Objects;

/**
 * IoArgoprojEventsV1alpha1BitbucketServerRepository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1BitbucketServerRepository {
  public static final String SERIALIZED_NAME_PROJECT_KEY = "projectKey";
  @SerializedName(SERIALIZED_NAME_PROJECT_KEY)
  private String projectKey;

  public static final String SERIALIZED_NAME_REPOSITORY_SLUG = "repositorySlug";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_SLUG)
  private String repositorySlug;


  public IoArgoprojEventsV1alpha1BitbucketServerRepository projectKey(String projectKey) {
    
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


  public IoArgoprojEventsV1alpha1BitbucketServerRepository repositorySlug(String repositorySlug) {
    
    this.repositorySlug = repositorySlug;
    return this;
  }

   /**
   * Get repositorySlug
   * @return repositorySlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRepositorySlug() {
    return repositorySlug;
  }


  public void setRepositorySlug(String repositorySlug) {
    this.repositorySlug = repositorySlug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1BitbucketServerRepository ioArgoprojEventsV1alpha1BitbucketServerRepository = (IoArgoprojEventsV1alpha1BitbucketServerRepository) o;
    return Objects.equals(this.projectKey, ioArgoprojEventsV1alpha1BitbucketServerRepository.projectKey) &&
        Objects.equals(this.repositorySlug, ioArgoprojEventsV1alpha1BitbucketServerRepository.repositorySlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectKey, repositorySlug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1BitbucketServerRepository {\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
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

