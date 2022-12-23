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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * SeccompProfile defines a pod/container&#39;s seccomp profile settings. Only one profile source may be set.
 */
@ApiModel(description = "SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SeccompProfile {
  public static final String SERIALIZED_NAME_LOCALHOST_PROFILE = "localhostProfile";
  @SerializedName(SERIALIZED_NAME_LOCALHOST_PROFILE)
  private String localhostProfile;

  /**
   * type indicates which kind of seccomp profile will be applied. Valid options are:  Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.  Possible enum values:  - &#x60;\&quot;Localhost\&quot;&#x60; indicates a profile defined in a file on the node should be used. The file&#39;s location relative to &lt;kubelet-root-dir&gt;/seccomp.  - &#x60;\&quot;RuntimeDefault\&quot;&#x60; represents the default container runtime seccomp profile.  - &#x60;\&quot;Unconfined\&quot;&#x60; indicates no seccomp profile is applied (A.K.A. unconfined).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LOCALHOST("Localhost"),
    
    RUNTIMEDEFAULT("RuntimeDefault"),
    
    UNCONFINED("Unconfined");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public SeccompProfile localhostProfile(String localhostProfile) {
    
    this.localhostProfile = localhostProfile;
    return this;
  }

   /**
   * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet&#39;s configured seccomp profile location. Must only be set if type is \&quot;Localhost\&quot;.
   * @return localhostProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is \"Localhost\".")

  public String getLocalhostProfile() {
    return localhostProfile;
  }


  public void setLocalhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
  }


  public SeccompProfile type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * type indicates which kind of seccomp profile will be applied. Valid options are:  Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.  Possible enum values:  - &#x60;\&quot;Localhost\&quot;&#x60; indicates a profile defined in a file on the node should be used. The file&#39;s location relative to &lt;kubelet-root-dir&gt;/seccomp.  - &#x60;\&quot;RuntimeDefault\&quot;&#x60; represents the default container runtime seccomp profile.  - &#x60;\&quot;Unconfined\&quot;&#x60; indicates no seccomp profile is applied (A.K.A. unconfined).
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "type indicates which kind of seccomp profile will be applied. Valid options are:  Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.  Possible enum values:  - `\"Localhost\"` indicates a profile defined in a file on the node should be used. The file's location relative to <kubelet-root-dir>/seccomp.  - `\"RuntimeDefault\"` represents the default container runtime seccomp profile.  - `\"Unconfined\"` indicates no seccomp profile is applied (A.K.A. unconfined).")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeccompProfile seccompProfile = (SeccompProfile) o;
    return Objects.equals(this.localhostProfile, seccompProfile.localhostProfile) &&
        Objects.equals(this.type, seccompProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localhostProfile, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeccompProfile {\n");
    sb.append("    localhostProfile: ").append(toIndentedString(localhostProfile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

