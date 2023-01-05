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
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1Arguments;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1TemplateRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoArgoprojWorkflowV1alpha1LifecycleHook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1LifecycleHook {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private IoArgoprojWorkflowV1alpha1Arguments arguments;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private IoArgoprojWorkflowV1alpha1TemplateRef templateRef;


  public IoArgoprojWorkflowV1alpha1LifecycleHook arguments(IoArgoprojWorkflowV1alpha1Arguments arguments) {
    
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


  public IoArgoprojWorkflowV1alpha1LifecycleHook expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * Expression is a condition expression for when a node will be retried. If it evaluates to false, the node will not be retried and the retry strategy will be ignored
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expression is a condition expression for when a node will be retried. If it evaluates to false, the node will not be retried and the retry strategy will be ignored")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public IoArgoprojWorkflowV1alpha1LifecycleHook template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template is the name of the template to execute by the hook
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template is the name of the template to execute by the hook")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public IoArgoprojWorkflowV1alpha1LifecycleHook templateRef(IoArgoprojWorkflowV1alpha1TemplateRef templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Get templateRef
   * @return templateRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1TemplateRef getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(IoArgoprojWorkflowV1alpha1TemplateRef templateRef) {
    this.templateRef = templateRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1LifecycleHook ioArgoprojWorkflowV1alpha1LifecycleHook = (IoArgoprojWorkflowV1alpha1LifecycleHook) o;
    return Objects.equals(this.arguments, ioArgoprojWorkflowV1alpha1LifecycleHook.arguments) &&
        Objects.equals(this.expression, ioArgoprojWorkflowV1alpha1LifecycleHook.expression) &&
        Objects.equals(this.template, ioArgoprojWorkflowV1alpha1LifecycleHook.template) &&
        Objects.equals(this.templateRef, ioArgoprojWorkflowV1alpha1LifecycleHook.templateRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, expression, template, templateRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1LifecycleHook {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
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

