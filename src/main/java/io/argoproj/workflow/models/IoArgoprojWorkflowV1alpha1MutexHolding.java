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

import java.util.Objects;

/**
 * MutexHolding describes the mutex and the object which is holding it.
 */
@ApiModel(description = "MutexHolding describes the mutex and the object which is holding it.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1MutexHolding {
  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private String holder;

  public static final String SERIALIZED_NAME_MUTEX = "mutex";
  @SerializedName(SERIALIZED_NAME_MUTEX)
  private String mutex;


  public IoArgoprojWorkflowV1alpha1MutexHolding holder(String holder) {
    
    this.holder = holder;
    return this;
  }

   /**
   * Holder is a reference to the object which holds the Mutex. Holding Scenario:   1. Current workflow&#39;s NodeID which is holding the lock.      e.g: ${NodeID} Waiting Scenario:   1. Current workflow or other workflow NodeID which is holding the lock.      e.g: ${WorkflowName}/${NodeID}
   * @return holder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Holder is a reference to the object which holds the Mutex. Holding Scenario:   1. Current workflow's NodeID which is holding the lock.      e.g: ${NodeID} Waiting Scenario:   1. Current workflow or other workflow NodeID which is holding the lock.      e.g: ${WorkflowName}/${NodeID}")

  public String getHolder() {
    return holder;
  }


  public void setHolder(String holder) {
    this.holder = holder;
  }


  public IoArgoprojWorkflowV1alpha1MutexHolding mutex(String mutex) {
    
    this.mutex = mutex;
    return this;
  }

   /**
   * Reference for the mutex e.g: ${namespace}/mutex/${mutexName}
   * @return mutex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference for the mutex e.g: ${namespace}/mutex/${mutexName}")

  public String getMutex() {
    return mutex;
  }


  public void setMutex(String mutex) {
    this.mutex = mutex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1MutexHolding ioArgoprojWorkflowV1alpha1MutexHolding = (IoArgoprojWorkflowV1alpha1MutexHolding) o;
    return Objects.equals(this.holder, ioArgoprojWorkflowV1alpha1MutexHolding.holder) &&
        Objects.equals(this.mutex, ioArgoprojWorkflowV1alpha1MutexHolding.mutex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holder, mutex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1MutexHolding {\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
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

