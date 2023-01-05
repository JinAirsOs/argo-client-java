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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateOptions may be provided when creating an API object.
 */
@ApiModel(description = "CreateOptions may be provided when creating an API object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateOptions {
  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private List<String> dryRun = null;

  public static final String SERIALIZED_NAME_FIELD_MANAGER = "fieldManager";
  @SerializedName(SERIALIZED_NAME_FIELD_MANAGER)
  private String fieldManager;

  public static final String SERIALIZED_NAME_FIELD_VALIDATION = "fieldValidation";
  @SerializedName(SERIALIZED_NAME_FIELD_VALIDATION)
  private String fieldValidation;


  public CreateOptions dryRun(List<String> dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

  public CreateOptions addDryRunItem(String dryRunItem) {
    if (this.dryRun == null) {
      this.dryRun = new ArrayList<>();
    }
    this.dryRun.add(dryRunItem);
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDryRun() {
    return dryRun;
  }


  public void setDryRun(List<String> dryRun) {
    this.dryRun = dryRun;
  }


  public CreateOptions fieldManager(String fieldManager) {
    
    this.fieldManager = fieldManager;
    return this;
  }

   /**
   * Get fieldManager
   * @return fieldManager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFieldManager() {
    return fieldManager;
  }


  public void setFieldManager(String fieldManager) {
    this.fieldManager = fieldManager;
  }


  public CreateOptions fieldValidation(String fieldValidation) {
    
    this.fieldValidation = fieldValidation;
    return this;
  }

   /**
   * Get fieldValidation
   * @return fieldValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFieldValidation() {
    return fieldValidation;
  }


  public void setFieldValidation(String fieldValidation) {
    this.fieldValidation = fieldValidation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOptions createOptions = (CreateOptions) o;
    return Objects.equals(this.dryRun, createOptions.dryRun) &&
        Objects.equals(this.fieldManager, createOptions.fieldManager) &&
        Objects.equals(this.fieldValidation, createOptions.fieldValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, fieldManager, fieldValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOptions {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    fieldManager: ").append(toIndentedString(fieldManager)).append("\n");
    sb.append("    fieldValidation: ").append(toIndentedString(fieldValidation)).append("\n");
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

