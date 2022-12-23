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

import java.util.Objects;

/**
 * IoArgoprojEventsV1alpha1AMQPConsumeConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1AMQPConsumeConfig {
  public static final String SERIALIZED_NAME_AUTO_ACK = "autoAck";
  @SerializedName(SERIALIZED_NAME_AUTO_ACK)
  private Boolean autoAck;

  public static final String SERIALIZED_NAME_CONSUMER_TAG = "consumerTag";
  @SerializedName(SERIALIZED_NAME_CONSUMER_TAG)
  private String consumerTag;

  public static final String SERIALIZED_NAME_EXCLUSIVE = "exclusive";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE)
  private Boolean exclusive;

  public static final String SERIALIZED_NAME_NO_LOCAL = "noLocal";
  @SerializedName(SERIALIZED_NAME_NO_LOCAL)
  private Boolean noLocal;

  public static final String SERIALIZED_NAME_NO_WAIT = "noWait";
  @SerializedName(SERIALIZED_NAME_NO_WAIT)
  private Boolean noWait;


  public IoArgoprojEventsV1alpha1AMQPConsumeConfig autoAck(Boolean autoAck) {
    
    this.autoAck = autoAck;
    return this;
  }

   /**
   * Get autoAck
   * @return autoAck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoAck() {
    return autoAck;
  }


  public void setAutoAck(Boolean autoAck) {
    this.autoAck = autoAck;
  }


  public IoArgoprojEventsV1alpha1AMQPConsumeConfig consumerTag(String consumerTag) {
    
    this.consumerTag = consumerTag;
    return this;
  }

   /**
   * Get consumerTag
   * @return consumerTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsumerTag() {
    return consumerTag;
  }


  public void setConsumerTag(String consumerTag) {
    this.consumerTag = consumerTag;
  }


  public IoArgoprojEventsV1alpha1AMQPConsumeConfig exclusive(Boolean exclusive) {
    
    this.exclusive = exclusive;
    return this;
  }

   /**
   * Get exclusive
   * @return exclusive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExclusive() {
    return exclusive;
  }


  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }


  public IoArgoprojEventsV1alpha1AMQPConsumeConfig noLocal(Boolean noLocal) {
    
    this.noLocal = noLocal;
    return this;
  }

   /**
   * Get noLocal
   * @return noLocal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNoLocal() {
    return noLocal;
  }


  public void setNoLocal(Boolean noLocal) {
    this.noLocal = noLocal;
  }


  public IoArgoprojEventsV1alpha1AMQPConsumeConfig noWait(Boolean noWait) {
    
    this.noWait = noWait;
    return this;
  }

   /**
   * Get noWait
   * @return noWait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNoWait() {
    return noWait;
  }


  public void setNoWait(Boolean noWait) {
    this.noWait = noWait;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1AMQPConsumeConfig ioArgoprojEventsV1alpha1AMQPConsumeConfig = (IoArgoprojEventsV1alpha1AMQPConsumeConfig) o;
    return Objects.equals(this.autoAck, ioArgoprojEventsV1alpha1AMQPConsumeConfig.autoAck) &&
        Objects.equals(this.consumerTag, ioArgoprojEventsV1alpha1AMQPConsumeConfig.consumerTag) &&
        Objects.equals(this.exclusive, ioArgoprojEventsV1alpha1AMQPConsumeConfig.exclusive) &&
        Objects.equals(this.noLocal, ioArgoprojEventsV1alpha1AMQPConsumeConfig.noLocal) &&
        Objects.equals(this.noWait, ioArgoprojEventsV1alpha1AMQPConsumeConfig.noWait);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAck, consumerTag, exclusive, noLocal, noWait);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1AMQPConsumeConfig {\n");
    sb.append("    autoAck: ").append(toIndentedString(autoAck)).append("\n");
    sb.append("    consumerTag: ").append(toIndentedString(consumerTag)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    noLocal: ").append(toIndentedString(noLocal)).append("\n");
    sb.append("    noWait: ").append(toIndentedString(noWait)).append("\n");
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

