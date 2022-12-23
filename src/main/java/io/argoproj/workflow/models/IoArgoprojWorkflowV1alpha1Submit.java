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
 * IoArgoprojWorkflowV1alpha1Submit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1Submit {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private IoArgoprojWorkflowV1alpha1Arguments arguments;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private io.kubernetes.client.openapi.models.V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_WORKFLOW_TEMPLATE_REF = "workflowTemplateRef";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TEMPLATE_REF)
  private IoArgoprojWorkflowV1alpha1WorkflowTemplateRef workflowTemplateRef;


  public IoArgoprojWorkflowV1alpha1Submit arguments(IoArgoprojWorkflowV1alpha1Arguments arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1Arguments getArguments() {
    return arguments;
  }


  public void setArguments(IoArgoprojWorkflowV1alpha1Arguments arguments) {
    this.arguments = arguments;
  }


  public IoArgoprojWorkflowV1alpha1Submit metadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public IoArgoprojWorkflowV1alpha1Submit workflowTemplateRef(IoArgoprojWorkflowV1alpha1WorkflowTemplateRef workflowTemplateRef) {
    
    this.workflowTemplateRef = workflowTemplateRef;
    return this;
  }

   /**
   * Get workflowTemplateRef
   * @return workflowTemplateRef
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IoArgoprojWorkflowV1alpha1WorkflowTemplateRef getWorkflowTemplateRef() {
    return workflowTemplateRef;
  }


  public void setWorkflowTemplateRef(IoArgoprojWorkflowV1alpha1WorkflowTemplateRef workflowTemplateRef) {
    this.workflowTemplateRef = workflowTemplateRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Submit ioArgoprojWorkflowV1alpha1Submit = (IoArgoprojWorkflowV1alpha1Submit) o;
    return Objects.equals(this.arguments, ioArgoprojWorkflowV1alpha1Submit.arguments) &&
        Objects.equals(this.metadata, ioArgoprojWorkflowV1alpha1Submit.metadata) &&
        Objects.equals(this.workflowTemplateRef, ioArgoprojWorkflowV1alpha1Submit.workflowTemplateRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, metadata, workflowTemplateRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Submit {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    workflowTemplateRef: ").append(toIndentedString(workflowTemplateRef)).append("\n");
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

