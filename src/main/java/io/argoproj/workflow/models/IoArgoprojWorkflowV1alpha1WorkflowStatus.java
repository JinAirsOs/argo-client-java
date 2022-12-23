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

import java.util.*;

/**
 * WorkflowStatus contains overall status information about a workflow
 */
@ApiModel(description = "WorkflowStatus contains overall status information about a workflow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1WorkflowStatus {
  public static final String SERIALIZED_NAME_ARTIFACT_REPOSITORY_REF = "artifactRepositoryRef";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_REPOSITORY_REF)
  private IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus artifactRepositoryRef;

  public static final String SERIALIZED_NAME_COMPRESSED_NODES = "compressedNodes";
  @SerializedName(SERIALIZED_NAME_COMPRESSED_NODES)
  private String compressedNodes;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<IoArgoprojWorkflowV1alpha1Condition> conditions = null;

  public static final String SERIALIZED_NAME_ESTIMATED_DURATION = "estimatedDuration";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DURATION)
  private Integer estimatedDuration;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private java.time.Instant finishedAt;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private Map<String, IoArgoprojWorkflowV1alpha1NodeStatus> nodes = null;

  public static final String SERIALIZED_NAME_OFFLOAD_NODE_STATUS_VERSION = "offloadNodeStatusVersion";
  @SerializedName(SERIALIZED_NAME_OFFLOAD_NODE_STATUS_VERSION)
  private String offloadNodeStatusVersion;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private IoArgoprojWorkflowV1alpha1Outputs outputs;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIMS = "persistentVolumeClaims";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIMS)
  private List<io.kubernetes.client.openapi.models.V1Volume> persistentVolumeClaims = null;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;

  public static final String SERIALIZED_NAME_RESOURCES_DURATION = "resourcesDuration";
  @SerializedName(SERIALIZED_NAME_RESOURCES_DURATION)
  private Map<String, Long> resourcesDuration = null;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private java.time.Instant startedAt;

  public static final String SERIALIZED_NAME_STORED_TEMPLATES = "storedTemplates";
  @SerializedName(SERIALIZED_NAME_STORED_TEMPLATES)
  private Map<String, IoArgoprojWorkflowV1alpha1Template> storedTemplates = null;

  public static final String SERIALIZED_NAME_STORED_WORKFLOW_TEMPLATE_SPEC = "storedWorkflowTemplateSpec";
  @SerializedName(SERIALIZED_NAME_STORED_WORKFLOW_TEMPLATE_SPEC)
  private IoArgoprojWorkflowV1alpha1WorkflowSpec storedWorkflowTemplateSpec;

  public static final String SERIALIZED_NAME_SYNCHRONIZATION = "synchronization";
  @SerializedName(SERIALIZED_NAME_SYNCHRONIZATION)
  private IoArgoprojWorkflowV1alpha1SynchronizationStatus synchronization;


  public IoArgoprojWorkflowV1alpha1WorkflowStatus artifactRepositoryRef(IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus artifactRepositoryRef) {
    
    this.artifactRepositoryRef = artifactRepositoryRef;
    return this;
  }

   /**
   * Get artifactRepositoryRef
   * @return artifactRepositoryRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus getArtifactRepositoryRef() {
    return artifactRepositoryRef;
  }


  public void setArtifactRepositoryRef(IoArgoprojWorkflowV1alpha1ArtifactRepositoryRefStatus artifactRepositoryRef) {
    this.artifactRepositoryRef = artifactRepositoryRef;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus compressedNodes(String compressedNodes) {
    
    this.compressedNodes = compressedNodes;
    return this;
  }

   /**
   * Compressed and base64 decoded Nodes map
   * @return compressedNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Compressed and base64 decoded Nodes map")

  public String getCompressedNodes() {
    return compressedNodes;
  }


  public void setCompressedNodes(String compressedNodes) {
    this.compressedNodes = compressedNodes;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus conditions(List<IoArgoprojWorkflowV1alpha1Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus addConditionsItem(IoArgoprojWorkflowV1alpha1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is a list of conditions the Workflow may have
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions is a list of conditions the Workflow may have")

  public List<IoArgoprojWorkflowV1alpha1Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<IoArgoprojWorkflowV1alpha1Condition> conditions) {
    this.conditions = conditions;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus estimatedDuration(Integer estimatedDuration) {
    
    this.estimatedDuration = estimatedDuration;
    return this;
  }

   /**
   * EstimatedDuration in seconds.
   * @return estimatedDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EstimatedDuration in seconds.")

  public Integer getEstimatedDuration() {
    return estimatedDuration;
  }


  public void setEstimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus finishedAt(java.time.Instant finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.time.Instant getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(java.time.Instant finishedAt) {
    this.finishedAt = finishedAt;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about why the workflow is in this condition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable message indicating details about why the workflow is in this condition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus nodes(Map<String, IoArgoprojWorkflowV1alpha1NodeStatus> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus putNodesItem(String key, IoArgoprojWorkflowV1alpha1NodeStatus nodesItem) {
    if (this.nodes == null) {
      this.nodes = new HashMap<>();
    }
    this.nodes.put(key, nodesItem);
    return this;
  }

   /**
   * Nodes is a mapping between a node ID and the node&#39;s status.
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nodes is a mapping between a node ID and the node's status.")

  public Map<String, IoArgoprojWorkflowV1alpha1NodeStatus> getNodes() {
    return nodes;
  }


  public void setNodes(Map<String, IoArgoprojWorkflowV1alpha1NodeStatus> nodes) {
    this.nodes = nodes;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus offloadNodeStatusVersion(String offloadNodeStatusVersion) {
    
    this.offloadNodeStatusVersion = offloadNodeStatusVersion;
    return this;
  }

   /**
   * Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data.
   * @return offloadNodeStatusVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether on not node status has been offloaded to a database. If exists, then Nodes and CompressedNodes will be empty. This will actually be populated with a hash of the offloaded data.")

  public String getOffloadNodeStatusVersion() {
    return offloadNodeStatusVersion;
  }


  public void setOffloadNodeStatusVersion(String offloadNodeStatusVersion) {
    this.offloadNodeStatusVersion = offloadNodeStatusVersion;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus outputs(IoArgoprojWorkflowV1alpha1Outputs outputs) {
    
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1Outputs getOutputs() {
    return outputs;
  }


  public void setOutputs(IoArgoprojWorkflowV1alpha1Outputs outputs) {
    this.outputs = outputs;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus persistentVolumeClaims(List<io.kubernetes.client.openapi.models.V1Volume> persistentVolumeClaims) {
    
    this.persistentVolumeClaims = persistentVolumeClaims;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus addPersistentVolumeClaimsItem(io.kubernetes.client.openapi.models.V1Volume persistentVolumeClaimsItem) {
    if (this.persistentVolumeClaims == null) {
      this.persistentVolumeClaims = new ArrayList<>();
    }
    this.persistentVolumeClaims.add(persistentVolumeClaimsItem);
    return this;
  }

   /**
   * PersistentVolumeClaims tracks all PVCs that were created as part of the io.argoproj.workflow.v1alpha1. The contents of this list are drained at the end of the workflow.
   * @return persistentVolumeClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PersistentVolumeClaims tracks all PVCs that were created as part of the io.argoproj.workflow.v1alpha1. The contents of this list are drained at the end of the workflow.")

  public List<io.kubernetes.client.openapi.models.V1Volume> getPersistentVolumeClaims() {
    return persistentVolumeClaims;
  }


  public void setPersistentVolumeClaims(List<io.kubernetes.client.openapi.models.V1Volume> persistentVolumeClaims) {
    this.persistentVolumeClaims = persistentVolumeClaims;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Phase a simple, high-level summary of where the workflow is in its lifecycle.
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phase a simple, high-level summary of where the workflow is in its lifecycle.")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus progress(String progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Progress to completion
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Progress to completion")

  public String getProgress() {
    return progress;
  }


  public void setProgress(String progress) {
    this.progress = progress;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus resourcesDuration(Map<String, Long> resourcesDuration) {
    
    this.resourcesDuration = resourcesDuration;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus putResourcesDurationItem(String key, Long resourcesDurationItem) {
    if (this.resourcesDuration == null) {
      this.resourcesDuration = new HashMap<>();
    }
    this.resourcesDuration.put(key, resourcesDurationItem);
    return this;
  }

   /**
   * ResourcesDuration is the total for the workflow
   * @return resourcesDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ResourcesDuration is the total for the workflow")

  public Map<String, Long> getResourcesDuration() {
    return resourcesDuration;
  }


  public void setResourcesDuration(Map<String, Long> resourcesDuration) {
    this.resourcesDuration = resourcesDuration;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus startedAt(java.time.Instant startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.time.Instant getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(java.time.Instant startedAt) {
    this.startedAt = startedAt;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus storedTemplates(Map<String, IoArgoprojWorkflowV1alpha1Template> storedTemplates) {
    
    this.storedTemplates = storedTemplates;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1WorkflowStatus putStoredTemplatesItem(String key, IoArgoprojWorkflowV1alpha1Template storedTemplatesItem) {
    if (this.storedTemplates == null) {
      this.storedTemplates = new HashMap<>();
    }
    this.storedTemplates.put(key, storedTemplatesItem);
    return this;
  }

   /**
   * StoredTemplates is a mapping between a template ref and the node&#39;s status.
   * @return storedTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StoredTemplates is a mapping between a template ref and the node's status.")

  public Map<String, IoArgoprojWorkflowV1alpha1Template> getStoredTemplates() {
    return storedTemplates;
  }


  public void setStoredTemplates(Map<String, IoArgoprojWorkflowV1alpha1Template> storedTemplates) {
    this.storedTemplates = storedTemplates;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus storedWorkflowTemplateSpec(IoArgoprojWorkflowV1alpha1WorkflowSpec storedWorkflowTemplateSpec) {
    
    this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
    return this;
  }

   /**
   * Get storedWorkflowTemplateSpec
   * @return storedWorkflowTemplateSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1WorkflowSpec getStoredWorkflowTemplateSpec() {
    return storedWorkflowTemplateSpec;
  }


  public void setStoredWorkflowTemplateSpec(IoArgoprojWorkflowV1alpha1WorkflowSpec storedWorkflowTemplateSpec) {
    this.storedWorkflowTemplateSpec = storedWorkflowTemplateSpec;
  }


  public IoArgoprojWorkflowV1alpha1WorkflowStatus synchronization(IoArgoprojWorkflowV1alpha1SynchronizationStatus synchronization) {
    
    this.synchronization = synchronization;
    return this;
  }

   /**
   * Get synchronization
   * @return synchronization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1SynchronizationStatus getSynchronization() {
    return synchronization;
  }


  public void setSynchronization(IoArgoprojWorkflowV1alpha1SynchronizationStatus synchronization) {
    this.synchronization = synchronization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1WorkflowStatus ioArgoprojWorkflowV1alpha1WorkflowStatus = (IoArgoprojWorkflowV1alpha1WorkflowStatus) o;
    return Objects.equals(this.artifactRepositoryRef, ioArgoprojWorkflowV1alpha1WorkflowStatus.artifactRepositoryRef) &&
        Objects.equals(this.compressedNodes, ioArgoprojWorkflowV1alpha1WorkflowStatus.compressedNodes) &&
        Objects.equals(this.conditions, ioArgoprojWorkflowV1alpha1WorkflowStatus.conditions) &&
        Objects.equals(this.estimatedDuration, ioArgoprojWorkflowV1alpha1WorkflowStatus.estimatedDuration) &&
        Objects.equals(this.finishedAt, ioArgoprojWorkflowV1alpha1WorkflowStatus.finishedAt) &&
        Objects.equals(this.message, ioArgoprojWorkflowV1alpha1WorkflowStatus.message) &&
        Objects.equals(this.nodes, ioArgoprojWorkflowV1alpha1WorkflowStatus.nodes) &&
        Objects.equals(this.offloadNodeStatusVersion, ioArgoprojWorkflowV1alpha1WorkflowStatus.offloadNodeStatusVersion) &&
        Objects.equals(this.outputs, ioArgoprojWorkflowV1alpha1WorkflowStatus.outputs) &&
        Objects.equals(this.persistentVolumeClaims, ioArgoprojWorkflowV1alpha1WorkflowStatus.persistentVolumeClaims) &&
        Objects.equals(this.phase, ioArgoprojWorkflowV1alpha1WorkflowStatus.phase) &&
        Objects.equals(this.progress, ioArgoprojWorkflowV1alpha1WorkflowStatus.progress) &&
        Objects.equals(this.resourcesDuration, ioArgoprojWorkflowV1alpha1WorkflowStatus.resourcesDuration) &&
        Objects.equals(this.startedAt, ioArgoprojWorkflowV1alpha1WorkflowStatus.startedAt) &&
        Objects.equals(this.storedTemplates, ioArgoprojWorkflowV1alpha1WorkflowStatus.storedTemplates) &&
        Objects.equals(this.storedWorkflowTemplateSpec, ioArgoprojWorkflowV1alpha1WorkflowStatus.storedWorkflowTemplateSpec) &&
        Objects.equals(this.synchronization, ioArgoprojWorkflowV1alpha1WorkflowStatus.synchronization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactRepositoryRef, compressedNodes, conditions, estimatedDuration, finishedAt, message, nodes, offloadNodeStatusVersion, outputs, persistentVolumeClaims, phase, progress, resourcesDuration, startedAt, storedTemplates, storedWorkflowTemplateSpec, synchronization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowStatus {\n");
    sb.append("    artifactRepositoryRef: ").append(toIndentedString(artifactRepositoryRef)).append("\n");
    sb.append("    compressedNodes: ").append(toIndentedString(compressedNodes)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    offloadNodeStatusVersion: ").append(toIndentedString(offloadNodeStatusVersion)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    persistentVolumeClaims: ").append(toIndentedString(persistentVolumeClaims)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    resourcesDuration: ").append(toIndentedString(resourcesDuration)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    storedTemplates: ").append(toIndentedString(storedTemplates)).append("\n");
    sb.append("    storedWorkflowTemplateSpec: ").append(toIndentedString(storedWorkflowTemplateSpec)).append("\n");
    sb.append("    synchronization: ").append(toIndentedString(synchronization)).append("\n");
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

