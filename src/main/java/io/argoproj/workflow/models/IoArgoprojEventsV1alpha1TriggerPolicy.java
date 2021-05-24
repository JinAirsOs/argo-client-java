/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v3.0.5
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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1K8SResourcePolicy;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1StatusPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoArgoprojEventsV1alpha1TriggerPolicy
 */

public class IoArgoprojEventsV1alpha1TriggerPolicy {
  public static final String SERIALIZED_NAME_K8S = "k8s";
  @SerializedName(SERIALIZED_NAME_K8S)
  private IoArgoprojEventsV1alpha1K8SResourcePolicy k8s;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private IoArgoprojEventsV1alpha1StatusPolicy status;


  public IoArgoprojEventsV1alpha1TriggerPolicy k8s(IoArgoprojEventsV1alpha1K8SResourcePolicy k8s) {
    
    this.k8s = k8s;
    return this;
  }

   /**
   * Get k8s
   * @return k8s
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1K8SResourcePolicy getK8s() {
    return k8s;
  }


  public void setK8s(IoArgoprojEventsV1alpha1K8SResourcePolicy k8s) {
    this.k8s = k8s;
  }


  public IoArgoprojEventsV1alpha1TriggerPolicy status(IoArgoprojEventsV1alpha1StatusPolicy status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1StatusPolicy getStatus() {
    return status;
  }


  public void setStatus(IoArgoprojEventsV1alpha1StatusPolicy status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1TriggerPolicy ioArgoprojEventsV1alpha1TriggerPolicy = (IoArgoprojEventsV1alpha1TriggerPolicy) o;
    return Objects.equals(this.k8s, ioArgoprojEventsV1alpha1TriggerPolicy.k8s) &&
        Objects.equals(this.status, ioArgoprojEventsV1alpha1TriggerPolicy.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(k8s, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1TriggerPolicy {\n");
    sb.append("    k8s: ").append(toIndentedString(k8s)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

