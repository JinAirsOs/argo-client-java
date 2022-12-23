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
 * GithubComArgoprojLabsArgoDataflowApiV1alpha1NATSAuth
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GithubComArgoprojLabsArgoDataflowApiV1alpha1NATSAuth {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector token;


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1NATSAuth token(io.kubernetes.client.openapi.models.V1SecretKeySelector token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getToken() {
    return token;
  }


  public void setToken(io.kubernetes.client.openapi.models.V1SecretKeySelector token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComArgoprojLabsArgoDataflowApiV1alpha1NATSAuth githubComArgoprojLabsArgoDataflowApiV1alpha1NATSAuth = (GithubComArgoprojLabsArgoDataflowApiV1alpha1NATSAuth) o;
    return Objects.equals(this.token, githubComArgoprojLabsArgoDataflowApiV1alpha1NATSAuth.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComArgoprojLabsArgoDataflowApiV1alpha1NATSAuth {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

