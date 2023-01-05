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
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1ArtifactResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ArtifactResultNodeStatus describes the result of the deletion on a given node
 */
@ApiModel(description = "ArtifactResultNodeStatus describes the result of the deletion on a given node")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1ArtifactResultNodeStatus {
  public static final String SERIALIZED_NAME_ARTIFACT_RESULTS = "artifactResults";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_RESULTS)
  private Map<String, IoArgoprojWorkflowV1alpha1ArtifactResult> artifactResults = null;


  public IoArgoprojWorkflowV1alpha1ArtifactResultNodeStatus artifactResults(Map<String, IoArgoprojWorkflowV1alpha1ArtifactResult> artifactResults) {
    
    this.artifactResults = artifactResults;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1ArtifactResultNodeStatus putArtifactResultsItem(String key, IoArgoprojWorkflowV1alpha1ArtifactResult artifactResultsItem) {
    if (this.artifactResults == null) {
      this.artifactResults = new HashMap<>();
    }
    this.artifactResults.put(key, artifactResultsItem);
    return this;
  }

   /**
   * ArtifactResults maps Artifact name to result of the deletion
   * @return artifactResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ArtifactResults maps Artifact name to result of the deletion")

  public Map<String, IoArgoprojWorkflowV1alpha1ArtifactResult> getArtifactResults() {
    return artifactResults;
  }


  public void setArtifactResults(Map<String, IoArgoprojWorkflowV1alpha1ArtifactResult> artifactResults) {
    this.artifactResults = artifactResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ArtifactResultNodeStatus ioArgoprojWorkflowV1alpha1ArtifactResultNodeStatus = (IoArgoprojWorkflowV1alpha1ArtifactResultNodeStatus) o;
    return Objects.equals(this.artifactResults, ioArgoprojWorkflowV1alpha1ArtifactResultNodeStatus.artifactResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactResultNodeStatus {\n");
    sb.append("    artifactResults: ").append(toIndentedString(artifactResults)).append("\n");
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

