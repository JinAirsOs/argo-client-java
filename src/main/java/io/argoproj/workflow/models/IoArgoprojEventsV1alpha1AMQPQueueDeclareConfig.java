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
 * IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private String arguments;

  public static final String SERIALIZED_NAME_AUTO_DELETE = "autoDelete";
  @SerializedName(SERIALIZED_NAME_AUTO_DELETE)
  private Boolean autoDelete;

  public static final String SERIALIZED_NAME_DURABLE = "durable";
  @SerializedName(SERIALIZED_NAME_DURABLE)
  private Boolean durable;

  public static final String SERIALIZED_NAME_EXCLUSIVE = "exclusive";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE)
  private Boolean exclusive;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NO_WAIT = "noWait";
  @SerializedName(SERIALIZED_NAME_NO_WAIT)
  private Boolean noWait;


  public IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig arguments(String arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArguments() {
    return arguments;
  }


  public void setArguments(String arguments) {
    this.arguments = arguments;
  }


  public IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig autoDelete(Boolean autoDelete) {
    
    this.autoDelete = autoDelete;
    return this;
  }

   /**
   * Get autoDelete
   * @return autoDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoDelete() {
    return autoDelete;
  }


  public void setAutoDelete(Boolean autoDelete) {
    this.autoDelete = autoDelete;
  }


  public IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig durable(Boolean durable) {
    
    this.durable = durable;
    return this;
  }

   /**
   * Get durable
   * @return durable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDurable() {
    return durable;
  }


  public void setDurable(Boolean durable) {
    this.durable = durable;
  }


  public IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig exclusive(Boolean exclusive) {
    
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


  public IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig noWait(Boolean noWait) {
    
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
    IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig ioArgoprojEventsV1alpha1AMQPQueueDeclareConfig = (IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig) o;
    return Objects.equals(this.arguments, ioArgoprojEventsV1alpha1AMQPQueueDeclareConfig.arguments) &&
        Objects.equals(this.autoDelete, ioArgoprojEventsV1alpha1AMQPQueueDeclareConfig.autoDelete) &&
        Objects.equals(this.durable, ioArgoprojEventsV1alpha1AMQPQueueDeclareConfig.durable) &&
        Objects.equals(this.exclusive, ioArgoprojEventsV1alpha1AMQPQueueDeclareConfig.exclusive) &&
        Objects.equals(this.name, ioArgoprojEventsV1alpha1AMQPQueueDeclareConfig.name) &&
        Objects.equals(this.noWait, ioArgoprojEventsV1alpha1AMQPQueueDeclareConfig.noWait);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, autoDelete, durable, exclusive, name, noWait);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1AMQPQueueDeclareConfig {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
    sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

