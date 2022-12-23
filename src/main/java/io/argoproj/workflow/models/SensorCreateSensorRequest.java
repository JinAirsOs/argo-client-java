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
 * SensorCreateSensorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SensorCreateSensorRequest {
  public static final String SERIALIZED_NAME_CREATE_OPTIONS = "createOptions";
  @SerializedName(SERIALIZED_NAME_CREATE_OPTIONS)
  private CreateOptions createOptions;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_SENSOR = "sensor";
  @SerializedName(SERIALIZED_NAME_SENSOR)
  private IoArgoprojEventsV1alpha1Sensor sensor;


  public SensorCreateSensorRequest createOptions(CreateOptions createOptions) {
    
    this.createOptions = createOptions;
    return this;
  }

   /**
   * Get createOptions
   * @return createOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateOptions getCreateOptions() {
    return createOptions;
  }


  public void setCreateOptions(CreateOptions createOptions) {
    this.createOptions = createOptions;
  }


  public SensorCreateSensorRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public SensorCreateSensorRequest sensor(IoArgoprojEventsV1alpha1Sensor sensor) {
    
    this.sensor = sensor;
    return this;
  }

   /**
   * Get sensor
   * @return sensor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1Sensor getSensor() {
    return sensor;
  }


  public void setSensor(IoArgoprojEventsV1alpha1Sensor sensor) {
    this.sensor = sensor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensorCreateSensorRequest sensorCreateSensorRequest = (SensorCreateSensorRequest) o;
    return Objects.equals(this.createOptions, sensorCreateSensorRequest.createOptions) &&
        Objects.equals(this.namespace, sensorCreateSensorRequest.namespace) &&
        Objects.equals(this.sensor, sensorCreateSensorRequest.sensor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createOptions, namespace, sensor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorCreateSensorRequest {\n");
    sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    sensor: ").append(toIndentedString(sensor)).append("\n");
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

