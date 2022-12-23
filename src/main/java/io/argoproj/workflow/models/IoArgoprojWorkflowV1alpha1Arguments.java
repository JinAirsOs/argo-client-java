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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Arguments to a template
 */
@ApiModel(description = "Arguments to a template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1Arguments {
  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<IoArgoprojWorkflowV1alpha1Artifact> artifacts = null;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<IoArgoprojWorkflowV1alpha1Parameter> parameters = null;


  public IoArgoprojWorkflowV1alpha1Arguments artifacts(List<IoArgoprojWorkflowV1alpha1Artifact> artifacts) {
    
    this.artifacts = artifacts;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Arguments addArtifactsItem(IoArgoprojWorkflowV1alpha1Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * Artifacts is the list of artifacts to pass to the template or workflow
   * @return artifacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Artifacts is the list of artifacts to pass to the template or workflow")

  public List<IoArgoprojWorkflowV1alpha1Artifact> getArtifacts() {
    return artifacts;
  }


  public void setArtifacts(List<IoArgoprojWorkflowV1alpha1Artifact> artifacts) {
    this.artifacts = artifacts;
  }


  public IoArgoprojWorkflowV1alpha1Arguments parameters(List<IoArgoprojWorkflowV1alpha1Parameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Arguments addParametersItem(IoArgoprojWorkflowV1alpha1Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters is the list of parameters to pass to the template or workflow
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters is the list of parameters to pass to the template or workflow")

  public List<IoArgoprojWorkflowV1alpha1Parameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<IoArgoprojWorkflowV1alpha1Parameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Arguments ioArgoprojWorkflowV1alpha1Arguments = (IoArgoprojWorkflowV1alpha1Arguments) o;
    return Objects.equals(this.artifacts, ioArgoprojWorkflowV1alpha1Arguments.artifacts) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1Arguments.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Arguments {\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

