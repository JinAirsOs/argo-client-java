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
 * IoArgoprojEventsV1alpha1AWSLambdaTrigger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1AWSLambdaTrigger {
  public static final String SERIALIZED_NAME_ACCESS_KEY = "accessKey";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector accessKey;

  public static final String SERIALIZED_NAME_FUNCTION_NAME = "functionName";
  @SerializedName(SERIALIZED_NAME_FUNCTION_NAME)
  private String functionName;

  public static final String SERIALIZED_NAME_INVOCATION_TYPE = "invocationType";
  @SerializedName(SERIALIZED_NAME_INVOCATION_TYPE)
  private String invocationType;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ROLE_A_R_N = "roleARN";
  @SerializedName(SERIALIZED_NAME_ROLE_A_R_N)
  private String roleARN;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector secretKey;


  public IoArgoprojEventsV1alpha1AWSLambdaTrigger accessKey(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKey) {
    this.accessKey = accessKey;
  }


  public IoArgoprojEventsV1alpha1AWSLambdaTrigger functionName(String functionName) {
    
    this.functionName = functionName;
    return this;
  }

   /**
   * FunctionName refers to the name of the function to invoke.
   * @return functionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FunctionName refers to the name of the function to invoke.")

  public String getFunctionName() {
    return functionName;
  }


  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }


  public IoArgoprojEventsV1alpha1AWSLambdaTrigger invocationType(String invocationType) {
    
    this.invocationType = invocationType;
    return this;
  }

   /**
   * Choose from the following options.     * RequestResponse (default) - Invoke the function synchronously. Keep    the connection open until the function returns a response or times out.    The API response includes the function response and additional data.     * Event - Invoke the function asynchronously. Send events that fail multiple    times to the function&#39;s dead-letter queue (if it&#39;s configured). The API    response only includes a status code.     * DryRun - Validate parameter values and verify that the user or role    has permission to invoke the function. +optional
   * @return invocationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Choose from the following options.     * RequestResponse (default) - Invoke the function synchronously. Keep    the connection open until the function returns a response or times out.    The API response includes the function response and additional data.     * Event - Invoke the function asynchronously. Send events that fail multiple    times to the function's dead-letter queue (if it's configured). The API    response only includes a status code.     * DryRun - Validate parameter values and verify that the user or role    has permission to invoke the function. +optional")

  public String getInvocationType() {
    return invocationType;
  }


  public void setInvocationType(String invocationType) {
    this.invocationType = invocationType;
  }


  public IoArgoprojEventsV1alpha1AWSLambdaTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
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


  public IoArgoprojEventsV1alpha1AWSLambdaTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1AWSLambdaTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Payload is the list of key-value extracted from an event payload to construct the request payload.
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payload is the list of key-value extracted from an event payload to construct the request payload.")

  public List<IoArgoprojEventsV1alpha1TriggerParameter> getPayload() {
    return payload;
  }


  public void setPayload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    this.payload = payload;
  }


  public IoArgoprojEventsV1alpha1AWSLambdaTrigger region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public IoArgoprojEventsV1alpha1AWSLambdaTrigger roleARN(String roleARN) {
    
    this.roleARN = roleARN;
    return this;
  }

   /**
   * Get roleARN
   * @return roleARN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoleARN() {
    return roleARN;
  }


  public void setRoleARN(String roleARN) {
    this.roleARN = roleARN;
  }


  public IoArgoprojEventsV1alpha1AWSLambdaTrigger secretKey(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1AWSLambdaTrigger ioArgoprojEventsV1alpha1AWSLambdaTrigger = (IoArgoprojEventsV1alpha1AWSLambdaTrigger) o;
    return Objects.equals(this.accessKey, ioArgoprojEventsV1alpha1AWSLambdaTrigger.accessKey) &&
        Objects.equals(this.functionName, ioArgoprojEventsV1alpha1AWSLambdaTrigger.functionName) &&
        Objects.equals(this.invocationType, ioArgoprojEventsV1alpha1AWSLambdaTrigger.invocationType) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1AWSLambdaTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1AWSLambdaTrigger.payload) &&
        Objects.equals(this.region, ioArgoprojEventsV1alpha1AWSLambdaTrigger.region) &&
        Objects.equals(this.roleARN, ioArgoprojEventsV1alpha1AWSLambdaTrigger.roleARN) &&
        Objects.equals(this.secretKey, ioArgoprojEventsV1alpha1AWSLambdaTrigger.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, functionName, invocationType, parameters, payload, region, roleARN, secretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1AWSLambdaTrigger {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

