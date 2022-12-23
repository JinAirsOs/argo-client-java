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
 * Synchronization holds synchronization lock configuration
 */
@ApiModel(description = "Synchronization holds synchronization lock configuration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1Synchronization {
  public static final String SERIALIZED_NAME_MUTEX = "mutex";
  @SerializedName(SERIALIZED_NAME_MUTEX)
  private IoArgoprojWorkflowV1alpha1Mutex mutex;

  public static final String SERIALIZED_NAME_SEMAPHORE = "semaphore";
  @SerializedName(SERIALIZED_NAME_SEMAPHORE)
  private IoArgoprojWorkflowV1alpha1SemaphoreRef semaphore;


  public IoArgoprojWorkflowV1alpha1Synchronization mutex(IoArgoprojWorkflowV1alpha1Mutex mutex) {
    
    this.mutex = mutex;
    return this;
  }

   /**
   * Get mutex
   * @return mutex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1Mutex getMutex() {
    return mutex;
  }


  public void setMutex(IoArgoprojWorkflowV1alpha1Mutex mutex) {
    this.mutex = mutex;
  }


  public IoArgoprojWorkflowV1alpha1Synchronization semaphore(IoArgoprojWorkflowV1alpha1SemaphoreRef semaphore) {
    
    this.semaphore = semaphore;
    return this;
  }

   /**
   * Get semaphore
   * @return semaphore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1SemaphoreRef getSemaphore() {
    return semaphore;
  }


  public void setSemaphore(IoArgoprojWorkflowV1alpha1SemaphoreRef semaphore) {
    this.semaphore = semaphore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Synchronization ioArgoprojWorkflowV1alpha1Synchronization = (IoArgoprojWorkflowV1alpha1Synchronization) o;
    return Objects.equals(this.mutex, ioArgoprojWorkflowV1alpha1Synchronization.mutex) &&
        Objects.equals(this.semaphore, ioArgoprojWorkflowV1alpha1Synchronization.semaphore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutex, semaphore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Synchronization {\n");
    sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
    sb.append("    semaphore: ").append(toIndentedString(semaphore)).append("\n");
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

