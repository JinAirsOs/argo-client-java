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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1CatchupConfiguration;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1ConfigMapPersistence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoArgoprojEventsV1alpha1EventPersistence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1EventPersistence {
  public static final String SERIALIZED_NAME_CATCHUP = "catchup";
  @SerializedName(SERIALIZED_NAME_CATCHUP)
  private IoArgoprojEventsV1alpha1CatchupConfiguration catchup;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private IoArgoprojEventsV1alpha1ConfigMapPersistence configMap;


  public IoArgoprojEventsV1alpha1EventPersistence catchup(IoArgoprojEventsV1alpha1CatchupConfiguration catchup) {
    
    this.catchup = catchup;
    return this;
  }

   /**
   * Get catchup
   * @return catchup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1CatchupConfiguration getCatchup() {
    return catchup;
  }


  public void setCatchup(IoArgoprojEventsV1alpha1CatchupConfiguration catchup) {
    this.catchup = catchup;
  }


  public IoArgoprojEventsV1alpha1EventPersistence configMap(IoArgoprojEventsV1alpha1ConfigMapPersistence configMap) {
    
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1ConfigMapPersistence getConfigMap() {
    return configMap;
  }


  public void setConfigMap(IoArgoprojEventsV1alpha1ConfigMapPersistence configMap) {
    this.configMap = configMap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1EventPersistence ioArgoprojEventsV1alpha1EventPersistence = (IoArgoprojEventsV1alpha1EventPersistence) o;
    return Objects.equals(this.catchup, ioArgoprojEventsV1alpha1EventPersistence.catchup) &&
        Objects.equals(this.configMap, ioArgoprojEventsV1alpha1EventPersistence.configMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catchup, configMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1EventPersistence {\n");
    sb.append("    catchup: ").append(toIndentedString(catchup)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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

