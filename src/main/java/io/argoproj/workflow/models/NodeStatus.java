/*
 * Argo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.4.0
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
import io.argoproj.workflow.models.Inputs;
import io.argoproj.workflow.models.IoK8sApimachineryPkgApisMetaV1Time;
import io.argoproj.workflow.models.Outputs;
import io.argoproj.workflow.models.TemplateRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeStatus contains status information about an individual node in the workflow
 */
@ApiModel(description = "NodeStatus contains status information about an individual node in the workflow")

public class NodeStatus {
  public static final String SERIALIZED_NAME_BOUNDARY_I_D = "boundaryID";
  @SerializedName(SERIALIZED_NAME_BOUNDARY_I_D)
  private String boundaryID;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<String> children = null;

  public static final String SERIALIZED_NAME_DAEMONED = "daemoned";
  @SerializedName(SERIALIZED_NAME_DAEMONED)
  private Boolean daemoned;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private IoK8sApimachineryPkgApisMetaV1Time finishedAt = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Inputs inputs;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OUTBOUND_NODES = "outboundNodes";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_NODES)
  private List<String> outboundNodes = null;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private Outputs outputs;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_POD_I_P = "podIP";
  @SerializedName(SERIALIZED_NAME_POD_I_P)
  private String podIP;

  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private IoK8sApimachineryPkgApisMetaV1Time startedAt = null;

  public static final String SERIALIZED_NAME_STORED_TEMPLATE_I_D = "storedTemplateID";
  @SerializedName(SERIALIZED_NAME_STORED_TEMPLATE_I_D)
  private String storedTemplateID;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private TemplateRef templateRef;

  public static final String SERIALIZED_NAME_TEMPLATE_SCOPE = "templateScope";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_SCOPE)
  private String templateScope;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_WORKFLOW_TEMPLATE_NAME = "workflowTemplateName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TEMPLATE_NAME)
  private String workflowTemplateName;


  public NodeStatus boundaryID(String boundaryID) {
    
    this.boundaryID = boundaryID;
    return this;
  }

   /**
   * BoundaryID indicates the node ID of the associated template root node in which this node belongs to
   * @return boundaryID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BoundaryID indicates the node ID of the associated template root node in which this node belongs to")

  public String getBoundaryID() {
    return boundaryID;
  }


  public void setBoundaryID(String boundaryID) {
    this.boundaryID = boundaryID;
  }


  public NodeStatus children(List<String> children) {
    
    this.children = children;
    return this;
  }

  public NodeStatus addChildrenItem(String childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<String>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Children is a list of child node IDs
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Children is a list of child node IDs")

  public List<String> getChildren() {
    return children;
  }


  public void setChildren(List<String> children) {
    this.children = children;
  }


  public NodeStatus daemoned(Boolean daemoned) {
    
    this.daemoned = daemoned;
    return this;
  }

   /**
   * Daemoned tracks whether or not this node was daemoned and need to be terminated
   * @return daemoned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Daemoned tracks whether or not this node was daemoned and need to be terminated")

  public Boolean getDaemoned() {
    return daemoned;
  }


  public void setDaemoned(Boolean daemoned) {
    this.daemoned = daemoned;
  }


  public NodeStatus displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * DisplayName is a human readable representation of the node. Unique within a template boundary
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "DisplayName is a human readable representation of the node. Unique within a template boundary")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public NodeStatus finishedAt(IoK8sApimachineryPkgApisMetaV1Time finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoK8sApimachineryPkgApisMetaV1Time getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(IoK8sApimachineryPkgApisMetaV1Time finishedAt) {
    this.finishedAt = finishedAt;
  }


  public NodeStatus id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID is a unique identifier of a node within the worklow It is implemented as a hash of the node name, which makes the ID deterministic
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID is a unique identifier of a node within the worklow It is implemented as a hash of the node name, which makes the ID deterministic")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public NodeStatus inputs(Inputs inputs) {
    
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Inputs getInputs() {
    return inputs;
  }


  public void setInputs(Inputs inputs) {
    this.inputs = inputs;
  }


  public NodeStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about why the node is in this condition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable message indicating details about why the node is in this condition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public NodeStatus name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is unique name in the node tree used to generate the node ID
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is unique name in the node tree used to generate the node ID")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NodeStatus outboundNodes(List<String> outboundNodes) {
    
    this.outboundNodes = outboundNodes;
    return this;
  }

  public NodeStatus addOutboundNodesItem(String outboundNodesItem) {
    if (this.outboundNodes == null) {
      this.outboundNodes = new ArrayList<String>();
    }
    this.outboundNodes.add(outboundNodesItem);
    return this;
  }

   /**
   * OutboundNodes tracks the node IDs which are considered \&quot;outbound\&quot; nodes to a template invocation. For every invocation of a template, there are nodes which we considered as \&quot;outbound\&quot;. Essentially, these are last nodes in the execution sequence to run, before the template is considered completed. These nodes are then connected as parents to a following step.  In the case of single pod steps (i.e. container, script, resource templates), this list will be nil since the pod itself is already considered the \&quot;outbound\&quot; node. In the case of DAGs, outbound nodes are the \&quot;target\&quot; tasks (tasks with no children). In the case of steps, outbound nodes are all the containers involved in the last step group. NOTE: since templates are composable, the list of outbound nodes are carried upwards when a DAG/steps template invokes another DAG/steps template. In other words, the outbound nodes of a template, will be a superset of the outbound nodes of its last children.
   * @return outboundNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OutboundNodes tracks the node IDs which are considered \"outbound\" nodes to a template invocation. For every invocation of a template, there are nodes which we considered as \"outbound\". Essentially, these are last nodes in the execution sequence to run, before the template is considered completed. These nodes are then connected as parents to a following step.  In the case of single pod steps (i.e. container, script, resource templates), this list will be nil since the pod itself is already considered the \"outbound\" node. In the case of DAGs, outbound nodes are the \"target\" tasks (tasks with no children). In the case of steps, outbound nodes are all the containers involved in the last step group. NOTE: since templates are composable, the list of outbound nodes are carried upwards when a DAG/steps template invokes another DAG/steps template. In other words, the outbound nodes of a template, will be a superset of the outbound nodes of its last children.")

  public List<String> getOutboundNodes() {
    return outboundNodes;
  }


  public void setOutboundNodes(List<String> outboundNodes) {
    this.outboundNodes = outboundNodes;
  }


  public NodeStatus outputs(Outputs outputs) {
    
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Outputs getOutputs() {
    return outputs;
  }


  public void setOutputs(Outputs outputs) {
    this.outputs = outputs;
  }


  public NodeStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Phase a simple, high-level summary of where the node is in its lifecycle. Can be used as a state machine.
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phase a simple, high-level summary of where the node is in its lifecycle. Can be used as a state machine.")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public NodeStatus podIP(String podIP) {
    
    this.podIP = podIP;
    return this;
  }

   /**
   * PodIP captures the IP of the pod for daemoned steps
   * @return podIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodIP captures the IP of the pod for daemoned steps")

  public String getPodIP() {
    return podIP;
  }


  public void setPodIP(String podIP) {
    this.podIP = podIP;
  }


  public NodeStatus startedAt(IoK8sApimachineryPkgApisMetaV1Time startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoK8sApimachineryPkgApisMetaV1Time getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(IoK8sApimachineryPkgApisMetaV1Time startedAt) {
    this.startedAt = startedAt;
  }


  public NodeStatus storedTemplateID(String storedTemplateID) {
    
    this.storedTemplateID = storedTemplateID;
    return this;
  }

   /**
   * StoredTemplateID is the ID of stored template. DEPRECATED: This value is not used anymore.
   * @return storedTemplateID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StoredTemplateID is the ID of stored template. DEPRECATED: This value is not used anymore.")

  public String getStoredTemplateID() {
    return storedTemplateID;
  }


  public void setStoredTemplateID(String storedTemplateID) {
    this.storedTemplateID = storedTemplateID;
  }


  public NodeStatus templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * TemplateName is the template name which this node corresponds to. Not applicable to virtual nodes (e.g. Retry, StepGroup)
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TemplateName is the template name which this node corresponds to. Not applicable to virtual nodes (e.g. Retry, StepGroup)")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public NodeStatus templateRef(TemplateRef templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Get templateRef
   * @return templateRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateRef getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(TemplateRef templateRef) {
    this.templateRef = templateRef;
  }


  public NodeStatus templateScope(String templateScope) {
    
    this.templateScope = templateScope;
    return this;
  }

   /**
   * TemplateScope is the template scope in which the template of this node was retrieved.
   * @return templateScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TemplateScope is the template scope in which the template of this node was retrieved.")

  public String getTemplateScope() {
    return templateScope;
  }


  public void setTemplateScope(String templateScope) {
    this.templateScope = templateScope;
  }


  public NodeStatus type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type indicates type of node
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type indicates type of node")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public NodeStatus workflowTemplateName(String workflowTemplateName) {
    
    this.workflowTemplateName = workflowTemplateName;
    return this;
  }

   /**
   * WorkflowTemplateName is the WorkflowTemplate resource name on which the resolved template of this node is retrieved. DEPRECATED: This value is not used anymore.
   * @return workflowTemplateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WorkflowTemplateName is the WorkflowTemplate resource name on which the resolved template of this node is retrieved. DEPRECATED: This value is not used anymore.")

  public String getWorkflowTemplateName() {
    return workflowTemplateName;
  }


  public void setWorkflowTemplateName(String workflowTemplateName) {
    this.workflowTemplateName = workflowTemplateName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatus nodeStatus = (NodeStatus) o;
    return Objects.equals(this.boundaryID, nodeStatus.boundaryID) &&
        Objects.equals(this.children, nodeStatus.children) &&
        Objects.equals(this.daemoned, nodeStatus.daemoned) &&
        Objects.equals(this.displayName, nodeStatus.displayName) &&
        Objects.equals(this.finishedAt, nodeStatus.finishedAt) &&
        Objects.equals(this.id, nodeStatus.id) &&
        Objects.equals(this.inputs, nodeStatus.inputs) &&
        Objects.equals(this.message, nodeStatus.message) &&
        Objects.equals(this.name, nodeStatus.name) &&
        Objects.equals(this.outboundNodes, nodeStatus.outboundNodes) &&
        Objects.equals(this.outputs, nodeStatus.outputs) &&
        Objects.equals(this.phase, nodeStatus.phase) &&
        Objects.equals(this.podIP, nodeStatus.podIP) &&
        Objects.equals(this.startedAt, nodeStatus.startedAt) &&
        Objects.equals(this.storedTemplateID, nodeStatus.storedTemplateID) &&
        Objects.equals(this.templateName, nodeStatus.templateName) &&
        Objects.equals(this.templateRef, nodeStatus.templateRef) &&
        Objects.equals(this.templateScope, nodeStatus.templateScope) &&
        Objects.equals(this.type, nodeStatus.type) &&
        Objects.equals(this.workflowTemplateName, nodeStatus.workflowTemplateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundaryID, children, daemoned, displayName, finishedAt, id, inputs, message, name, outboundNodes, outputs, phase, podIP, startedAt, storedTemplateID, templateName, templateRef, templateScope, type, workflowTemplateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatus {\n");
    sb.append("    boundaryID: ").append(toIndentedString(boundaryID)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    daemoned: ").append(toIndentedString(daemoned)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outboundNodes: ").append(toIndentedString(outboundNodes)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    storedTemplateID: ").append(toIndentedString(storedTemplateID)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
    sb.append("    templateScope: ").append(toIndentedString(templateScope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workflowTemplateName: ").append(toIndentedString(workflowTemplateName)).append("\n");
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

