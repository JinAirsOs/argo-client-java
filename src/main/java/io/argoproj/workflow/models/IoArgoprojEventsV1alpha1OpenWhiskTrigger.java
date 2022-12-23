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
 * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
 */
@ApiModel(description = "OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1OpenWhiskTrigger {
  public static final String SERIALIZED_NAME_ACTION_NAME = "actionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_AUTH_TOKEN = "authToken";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector authToken;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> payload = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public IoArgoprojEventsV1alpha1OpenWhiskTrigger actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * Name of the action/function.
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the action/function.")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public IoArgoprojEventsV1alpha1OpenWhiskTrigger authToken(io.kubernetes.client.openapi.models.V1SecretKeySelector authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Get authToken
   * @return authToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getAuthToken() {
    return authToken;
  }


  public void setAuthToken(io.kubernetes.client.openapi.models.V1SecretKeySelector authToken) {
    this.authToken = authToken;
  }


  public IoArgoprojEventsV1alpha1OpenWhiskTrigger host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Host URL of the OpenWhisk.
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host URL of the OpenWhisk.")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public IoArgoprojEventsV1alpha1OpenWhiskTrigger namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the action. Defaults to \&quot;_\&quot;. +optional.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace for the action. Defaults to \"_\". +optional.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public IoArgoprojEventsV1alpha1OpenWhiskTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1OpenWhiskTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
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


  public IoArgoprojEventsV1alpha1OpenWhiskTrigger payload(List<IoArgoprojEventsV1alpha1TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public IoArgoprojEventsV1alpha1OpenWhiskTrigger addPayloadItem(IoArgoprojEventsV1alpha1TriggerParameter payloadItem) {
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


  public IoArgoprojEventsV1alpha1OpenWhiskTrigger version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1OpenWhiskTrigger ioArgoprojEventsV1alpha1OpenWhiskTrigger = (IoArgoprojEventsV1alpha1OpenWhiskTrigger) o;
    return Objects.equals(this.actionName, ioArgoprojEventsV1alpha1OpenWhiskTrigger.actionName) &&
        Objects.equals(this.authToken, ioArgoprojEventsV1alpha1OpenWhiskTrigger.authToken) &&
        Objects.equals(this.host, ioArgoprojEventsV1alpha1OpenWhiskTrigger.host) &&
        Objects.equals(this.namespace, ioArgoprojEventsV1alpha1OpenWhiskTrigger.namespace) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1OpenWhiskTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1OpenWhiskTrigger.payload) &&
        Objects.equals(this.version, ioArgoprojEventsV1alpha1OpenWhiskTrigger.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, authToken, host, namespace, parameters, payload, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1OpenWhiskTrigger {\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

