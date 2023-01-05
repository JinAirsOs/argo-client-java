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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest {
  public static final String SERIALIZED_NAME_MEMOIZED = "memoized";
  @SerializedName(SERIALIZED_NAME_MEMOIZED)
  private Boolean memoized;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<String> parameters = null;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest memoized(Boolean memoized) {
    
    this.memoized = memoized;
    return this;
  }

   /**
   * Get memoized
   * @return memoized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMemoized() {
    return memoized;
  }


  public void setMemoized(Boolean memoized) {
    this.memoized = memoized;
  }


  public IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest parameters(List<String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getParameters() {
    return parameters;
  }


  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }


  public IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest ioArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest = (IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest) o;
    return Objects.equals(this.memoized, ioArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest.memoized) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest.name) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest.namespace) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest.parameters) &&
        Objects.equals(this.uid, ioArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoized, name, namespace, parameters, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest {\n");
    sb.append("    memoized: ").append(toIndentedString(memoized)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

