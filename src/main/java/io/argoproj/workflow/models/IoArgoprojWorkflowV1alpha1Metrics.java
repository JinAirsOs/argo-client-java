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
 * Metrics are a list of metrics emitted from a Workflow/Template
 */
@ApiModel(description = "Metrics are a list of metrics emitted from a Workflow/Template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1Metrics {
  public static final String SERIALIZED_NAME_PROMETHEUS = "prometheus";
  @SerializedName(SERIALIZED_NAME_PROMETHEUS)
  private List<IoArgoprojWorkflowV1alpha1Prometheus> prometheus = new ArrayList<>();


  public IoArgoprojWorkflowV1alpha1Metrics prometheus(List<IoArgoprojWorkflowV1alpha1Prometheus> prometheus) {
    
    this.prometheus = prometheus;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1Metrics addPrometheusItem(IoArgoprojWorkflowV1alpha1Prometheus prometheusItem) {
    this.prometheus.add(prometheusItem);
    return this;
  }

   /**
   * Prometheus is a list of prometheus metrics to be emitted
   * @return prometheus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Prometheus is a list of prometheus metrics to be emitted")

  public List<IoArgoprojWorkflowV1alpha1Prometheus> getPrometheus() {
    return prometheus;
  }


  public void setPrometheus(List<IoArgoprojWorkflowV1alpha1Prometheus> prometheus) {
    this.prometheus = prometheus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Metrics ioArgoprojWorkflowV1alpha1Metrics = (IoArgoprojWorkflowV1alpha1Metrics) o;
    return Objects.equals(this.prometheus, ioArgoprojWorkflowV1alpha1Metrics.prometheus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prometheus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Metrics {\n");
    sb.append("    prometheus: ").append(toIndentedString(prometheus)).append("\n");
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

