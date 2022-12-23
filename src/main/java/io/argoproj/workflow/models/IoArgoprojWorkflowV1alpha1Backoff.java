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
 * Backoff is a backoff strategy to use within retryStrategy
 */
@ApiModel(description = "Backoff is a backoff strategy to use within retryStrategy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1Backoff {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_FACTOR = "factor";
  @SerializedName(SERIALIZED_NAME_FACTOR)
  private String factor;

  public static final String SERIALIZED_NAME_MAX_DURATION = "maxDuration";
  @SerializedName(SERIALIZED_NAME_MAX_DURATION)
  private String maxDuration;


  public IoArgoprojWorkflowV1alpha1Backoff duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \&quot;2m\&quot;, \&quot;1h\&quot;)
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Duration is the amount to back off. Default unit is seconds, but could also be a duration (e.g. \"2m\", \"1h\")")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public IoArgoprojWorkflowV1alpha1Backoff factor(String factor) {
    
    this.factor = factor;
    return this;
  }

   /**
   * Get factor
   * @return factor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFactor() {
    return factor;
  }


  public void setFactor(String factor) {
    this.factor = factor;
  }


  public IoArgoprojWorkflowV1alpha1Backoff maxDuration(String maxDuration) {
    
    this.maxDuration = maxDuration;
    return this;
  }

   /**
   * MaxDuration is the maximum amount of time allowed for the backoff strategy
   * @return maxDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MaxDuration is the maximum amount of time allowed for the backoff strategy")

  public String getMaxDuration() {
    return maxDuration;
  }


  public void setMaxDuration(String maxDuration) {
    this.maxDuration = maxDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Backoff ioArgoprojWorkflowV1alpha1Backoff = (IoArgoprojWorkflowV1alpha1Backoff) o;
    return Objects.equals(this.duration, ioArgoprojWorkflowV1alpha1Backoff.duration) &&
        Objects.equals(this.factor, ioArgoprojWorkflowV1alpha1Backoff.factor) &&
        Objects.equals(this.maxDuration, ioArgoprojWorkflowV1alpha1Backoff.maxDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, factor, maxDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Backoff {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
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

