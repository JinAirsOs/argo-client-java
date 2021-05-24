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

/**
 * IoArgoprojEventsV1alpha1KafkaConsumerGroup
 */

public class IoArgoprojEventsV1alpha1KafkaConsumerGroup {
  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_OLDEST = "oldest";
  @SerializedName(SERIALIZED_NAME_OLDEST)
  private Boolean oldest;

  public static final String SERIALIZED_NAME_REBALANCE_STRATEGY = "rebalanceStrategy";
  @SerializedName(SERIALIZED_NAME_REBALANCE_STRATEGY)
  private String rebalanceStrategy;


  public IoArgoprojEventsV1alpha1KafkaConsumerGroup groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public IoArgoprojEventsV1alpha1KafkaConsumerGroup oldest(Boolean oldest) {
    
    this.oldest = oldest;
    return this;
  }

   /**
   * Get oldest
   * @return oldest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOldest() {
    return oldest;
  }


  public void setOldest(Boolean oldest) {
    this.oldest = oldest;
  }


  public IoArgoprojEventsV1alpha1KafkaConsumerGroup rebalanceStrategy(String rebalanceStrategy) {
    
    this.rebalanceStrategy = rebalanceStrategy;
    return this;
  }

   /**
   * Get rebalanceStrategy
   * @return rebalanceStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRebalanceStrategy() {
    return rebalanceStrategy;
  }


  public void setRebalanceStrategy(String rebalanceStrategy) {
    this.rebalanceStrategy = rebalanceStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1KafkaConsumerGroup ioArgoprojEventsV1alpha1KafkaConsumerGroup = (IoArgoprojEventsV1alpha1KafkaConsumerGroup) o;
    return Objects.equals(this.groupName, ioArgoprojEventsV1alpha1KafkaConsumerGroup.groupName) &&
        Objects.equals(this.oldest, ioArgoprojEventsV1alpha1KafkaConsumerGroup.oldest) &&
        Objects.equals(this.rebalanceStrategy, ioArgoprojEventsV1alpha1KafkaConsumerGroup.rebalanceStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, oldest, rebalanceStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1KafkaConsumerGroup {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    oldest: ").append(toIndentedString(oldest)).append("\n");
    sb.append("    rebalanceStrategy: ").append(toIndentedString(rebalanceStrategy)).append("\n");
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

