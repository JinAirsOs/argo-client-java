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
 * GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET {
  public static final String SERIALIZED_NAME_SASL = "sasl";
  @SerializedName(SERIALIZED_NAME_SASL)
  private GithubComArgoprojLabsArgoDataflowApiV1alpha1SASL sasl;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS tls;


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET sasl(GithubComArgoprojLabsArgoDataflowApiV1alpha1SASL sasl) {
    
    this.sasl = sasl;
    return this;
  }

   /**
   * Get sasl
   * @return sasl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GithubComArgoprojLabsArgoDataflowApiV1alpha1SASL getSasl() {
    return sasl;
  }


  public void setSasl(GithubComArgoprojLabsArgoDataflowApiV1alpha1SASL sasl) {
    this.sasl = sasl;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET tls(GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS getTls() {
    return tls;
  }


  public void setTls(GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS tls) {
    this.tls = tls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET = (GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET) o;
    return Objects.equals(this.sasl, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET.sasl) &&
        Objects.equals(this.tls, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET.tls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sasl, tls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaNET {\n");
    sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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

