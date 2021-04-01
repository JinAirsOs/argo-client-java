/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v3.0.1
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

/**
 * RetryAffinity prevents running steps on the same host.
 */
@ApiModel(description = "RetryAffinity prevents running steps on the same host.")

public class RetryAffinity {
  public static final String SERIALIZED_NAME_NODE_ANTI_AFFINITY = "nodeAntiAffinity";
  @SerializedName(SERIALIZED_NAME_NODE_ANTI_AFFINITY)
  private Object nodeAntiAffinity;


  public RetryAffinity nodeAntiAffinity(Object nodeAntiAffinity) {
    
    this.nodeAntiAffinity = nodeAntiAffinity;
    return this;
  }

   /**
   * RetryNodeAntiAffinity is a placeholder for future expansion, only empty nodeAntiAffinity is allowed. In order to prevent running steps on the same host, it uses \&quot;kubernetes.io/hostname\&quot;.
   * @return nodeAntiAffinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RetryNodeAntiAffinity is a placeholder for future expansion, only empty nodeAntiAffinity is allowed. In order to prevent running steps on the same host, it uses \"kubernetes.io/hostname\".")

  public Object getNodeAntiAffinity() {
    return nodeAntiAffinity;
  }


  public void setNodeAntiAffinity(Object nodeAntiAffinity) {
    this.nodeAntiAffinity = nodeAntiAffinity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryAffinity retryAffinity = (RetryAffinity) o;
    return Objects.equals(this.nodeAntiAffinity, retryAffinity.nodeAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAntiAffinity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryAffinity {\n");
    sb.append("    nodeAntiAffinity: ").append(toIndentedString(nodeAntiAffinity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

