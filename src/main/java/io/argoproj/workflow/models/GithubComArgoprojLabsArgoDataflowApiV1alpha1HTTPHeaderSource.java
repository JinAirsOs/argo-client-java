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
 * GithubComArgoprojLabsArgoDataflowApiV1alpha1HTTPHeaderSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GithubComArgoprojLabsArgoDataflowApiV1alpha1HTTPHeaderSource {
  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeyRef;


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1HTTPHeaderSource secretKeyRef(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeyRef) {
    
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSecretKeyRef() {
    return secretKeyRef;
  }


  public void setSecretKeyRef(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComArgoprojLabsArgoDataflowApiV1alpha1HTTPHeaderSource githubComArgoprojLabsArgoDataflowApiV1alpha1HTTPHeaderSource = (GithubComArgoprojLabsArgoDataflowApiV1alpha1HTTPHeaderSource) o;
    return Objects.equals(this.secretKeyRef, githubComArgoprojLabsArgoDataflowApiV1alpha1HTTPHeaderSource.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretKeyRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComArgoprojLabsArgoDataflowApiV1alpha1HTTPHeaderSource {\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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

