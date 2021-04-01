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
 * IoArgoprojEventsV1alpha1WatchPathConfig
 */

public class IoArgoprojEventsV1alpha1WatchPathConfig {
  public static final String SERIALIZED_NAME_DIRECTORY = "directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PATH_REGEXP = "pathRegexp";
  @SerializedName(SERIALIZED_NAME_PATH_REGEXP)
  private String pathRegexp;


  public IoArgoprojEventsV1alpha1WatchPathConfig directory(String directory) {
    
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirectory() {
    return directory;
  }


  public void setDirectory(String directory) {
    this.directory = directory;
  }


  public IoArgoprojEventsV1alpha1WatchPathConfig path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public IoArgoprojEventsV1alpha1WatchPathConfig pathRegexp(String pathRegexp) {
    
    this.pathRegexp = pathRegexp;
    return this;
  }

   /**
   * Get pathRegexp
   * @return pathRegexp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathRegexp() {
    return pathRegexp;
  }


  public void setPathRegexp(String pathRegexp) {
    this.pathRegexp = pathRegexp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1WatchPathConfig ioArgoprojEventsV1alpha1WatchPathConfig = (IoArgoprojEventsV1alpha1WatchPathConfig) o;
    return Objects.equals(this.directory, ioArgoprojEventsV1alpha1WatchPathConfig.directory) &&
        Objects.equals(this.path, ioArgoprojEventsV1alpha1WatchPathConfig.path) &&
        Objects.equals(this.pathRegexp, ioArgoprojEventsV1alpha1WatchPathConfig.pathRegexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, path, pathRegexp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1WatchPathConfig {\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathRegexp: ").append(toIndentedString(pathRegexp)).append("\n");
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

