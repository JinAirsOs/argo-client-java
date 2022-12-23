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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * IoArgoprojEventsV1alpha1Trigger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1Trigger {
  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private IoArgoprojEventsV1alpha1TriggerPolicy policy;

  public static final String SERIALIZED_NAME_RATE_LIMIT = "rateLimit";
  @SerializedName(SERIALIZED_NAME_RATE_LIMIT)
  private IoArgoprojEventsV1alpha1RateLimit rateLimit;

  public static final String SERIALIZED_NAME_RETRY_STRATEGY = "retryStrategy";
  @SerializedName(SERIALIZED_NAME_RETRY_STRATEGY)
  private IoArgoprojEventsV1alpha1Backoff retryStrategy;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private IoArgoprojEventsV1alpha1TriggerTemplate template;


  public IoArgoprojEventsV1alpha1Trigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1Trigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
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

  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public IoArgoprojEventsV1alpha1Trigger policy(IoArgoprojEventsV1alpha1TriggerPolicy policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1TriggerPolicy getPolicy() {
    return policy;
  }


  public void setPolicy(IoArgoprojEventsV1alpha1TriggerPolicy policy) {
    this.policy = policy;
  }


  public IoArgoprojEventsV1alpha1Trigger rateLimit(IoArgoprojEventsV1alpha1RateLimit rateLimit) {
    
    this.rateLimit = rateLimit;
    return this;
  }

   /**
   * Get rateLimit
   * @return rateLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1RateLimit getRateLimit() {
    return rateLimit;
  }


  public void setRateLimit(IoArgoprojEventsV1alpha1RateLimit rateLimit) {
    this.rateLimit = rateLimit;
  }


  public IoArgoprojEventsV1alpha1Trigger retryStrategy(IoArgoprojEventsV1alpha1Backoff retryStrategy) {
    
    this.retryStrategy = retryStrategy;
    return this;
  }

   /**
   * Get retryStrategy
   * @return retryStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1Backoff getRetryStrategy() {
    return retryStrategy;
  }


  public void setRetryStrategy(IoArgoprojEventsV1alpha1Backoff retryStrategy) {
    this.retryStrategy = retryStrategy;
  }


  public IoArgoprojEventsV1alpha1Trigger template(IoArgoprojEventsV1alpha1TriggerTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1TriggerTemplate getTemplate() {
    return template;
  }


  public void setTemplate(IoArgoprojEventsV1alpha1TriggerTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1Trigger ioArgoprojEventsV1alpha1Trigger = (IoArgoprojEventsV1alpha1Trigger) o;
    return Objects.equals(this.parameters, ioArgoprojEventsV1alpha1Trigger.parameters) &&
        Objects.equals(this.policy, ioArgoprojEventsV1alpha1Trigger.policy) &&
        Objects.equals(this.rateLimit, ioArgoprojEventsV1alpha1Trigger.rateLimit) &&
        Objects.equals(this.retryStrategy, ioArgoprojEventsV1alpha1Trigger.retryStrategy) &&
        Objects.equals(this.template, ioArgoprojEventsV1alpha1Trigger.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, policy, rateLimit, retryStrategy, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1Trigger {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

