/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v3.0.5
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
 * IoArgoprojEventsV1alpha1DataFilter
 */

public class IoArgoprojEventsV1alpha1DataFilter {
  public static final String SERIALIZED_NAME_COMPARATOR = "comparator";
  @SerializedName(SERIALIZED_NAME_COMPARATOR)
  private String comparator;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<String> value = null;


  public IoArgoprojEventsV1alpha1DataFilter comparator(String comparator) {
    
    this.comparator = comparator;
    return this;
  }

   /**
   * Comparator compares the event data with a user given value. Can be \&quot;&gt;&#x3D;\&quot;, \&quot;&gt;\&quot;, \&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;&lt;\&quot;, or \&quot;&lt;&#x3D;\&quot;. Is optional, and if left blank treated as equality \&quot;&#x3D;\&quot;.
   * @return comparator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comparator compares the event data with a user given value. Can be \">=\", \">\", \"=\", \"!=\", \"<\", or \"<=\". Is optional, and if left blank treated as equality \"=\".")

  public String getComparator() {
    return comparator;
  }


  public void setComparator(String comparator) {
    this.comparator = comparator;
  }


  public IoArgoprojEventsV1alpha1DataFilter path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is the JSONPath of the event&#39;s (JSON decoded) data key Path is a series of keys separated by a dot. A key may contain wildcard characters &#39;*&#39; and &#39;?&#39;. To access an array value use the index as the key. The dot and wildcard characters can be escaped with &#39;\\\\&#39;. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path is the JSONPath of the event's (JSON decoded) data key Path is a series of keys separated by a dot. A key may contain wildcard characters '*' and '?'. To access an array value use the index as the key. The dot and wildcard characters can be escaped with '\\\\'. See https://github.com/tidwall/gjson#path-syntax for more information on how to use this.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public IoArgoprojEventsV1alpha1DataFilter type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public IoArgoprojEventsV1alpha1DataFilter value(List<String> value) {
    
    this.value = value;
    return this;
  }

  public IoArgoprojEventsV1alpha1DataFilter addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<String>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getValue() {
    return value;
  }


  public void setValue(List<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1DataFilter ioArgoprojEventsV1alpha1DataFilter = (IoArgoprojEventsV1alpha1DataFilter) o;
    return Objects.equals(this.comparator, ioArgoprojEventsV1alpha1DataFilter.comparator) &&
        Objects.equals(this.path, ioArgoprojEventsV1alpha1DataFilter.path) &&
        Objects.equals(this.type, ioArgoprojEventsV1alpha1DataFilter.type) &&
        Objects.equals(this.value, ioArgoprojEventsV1alpha1DataFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparator, path, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1DataFilter {\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

