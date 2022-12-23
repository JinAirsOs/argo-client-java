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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.
 */
@ApiModel(description = "EventDependencyFilter defines filters and constraints for a io.argoproj.workflow.v1alpha1.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1EventDependencyFilter {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private IoArgoprojEventsV1alpha1EventContext context;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<IoArgoprojEventsV1alpha1DataFilter> data = null;

  public static final String SERIALIZED_NAME_DATA_LOGICAL_OPERATOR = "dataLogicalOperator";
  @SerializedName(SERIALIZED_NAME_DATA_LOGICAL_OPERATOR)
  private String dataLogicalOperator;

  public static final String SERIALIZED_NAME_EXPR_LOGICAL_OPERATOR = "exprLogicalOperator";
  @SerializedName(SERIALIZED_NAME_EXPR_LOGICAL_OPERATOR)
  private String exprLogicalOperator;

  public static final String SERIALIZED_NAME_EXPRS = "exprs";
  @SerializedName(SERIALIZED_NAME_EXPRS)
  private List<IoArgoprojEventsV1alpha1ExprFilter> exprs = null;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private IoArgoprojEventsV1alpha1TimeFilter time;


  public IoArgoprojEventsV1alpha1EventDependencyFilter context(IoArgoprojEventsV1alpha1EventContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1EventContext getContext() {
    return context;
  }


  public void setContext(IoArgoprojEventsV1alpha1EventContext context) {
    this.context = context;
  }


  public IoArgoprojEventsV1alpha1EventDependencyFilter data(List<IoArgoprojEventsV1alpha1DataFilter> data) {
    
    this.data = data;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventDependencyFilter addDataItem(IoArgoprojEventsV1alpha1DataFilter dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1DataFilter> getData() {
    return data;
  }


  public void setData(List<IoArgoprojEventsV1alpha1DataFilter> data) {
    this.data = data;
  }


  public IoArgoprojEventsV1alpha1EventDependencyFilter dataLogicalOperator(String dataLogicalOperator) {
    
    this.dataLogicalOperator = dataLogicalOperator;
    return this;
  }

   /**
   * DataLogicalOperator defines how multiple Data filters (if defined) are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;).
   * @return dataLogicalOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DataLogicalOperator defines how multiple Data filters (if defined) are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).")

  public String getDataLogicalOperator() {
    return dataLogicalOperator;
  }


  public void setDataLogicalOperator(String dataLogicalOperator) {
    this.dataLogicalOperator = dataLogicalOperator;
  }


  public IoArgoprojEventsV1alpha1EventDependencyFilter exprLogicalOperator(String exprLogicalOperator) {
    
    this.exprLogicalOperator = exprLogicalOperator;
    return this;
  }

   /**
   * ExprLogicalOperator defines how multiple Exprs filters (if defined) are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;).
   * @return exprLogicalOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExprLogicalOperator defines how multiple Exprs filters (if defined) are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).")

  public String getExprLogicalOperator() {
    return exprLogicalOperator;
  }


  public void setExprLogicalOperator(String exprLogicalOperator) {
    this.exprLogicalOperator = exprLogicalOperator;
  }


  public IoArgoprojEventsV1alpha1EventDependencyFilter exprs(List<IoArgoprojEventsV1alpha1ExprFilter> exprs) {
    
    this.exprs = exprs;
    return this;
  }

  public IoArgoprojEventsV1alpha1EventDependencyFilter addExprsItem(IoArgoprojEventsV1alpha1ExprFilter exprsItem) {
    if (this.exprs == null) {
      this.exprs = new ArrayList<>();
    }
    this.exprs.add(exprsItem);
    return this;
  }

   /**
   * Exprs contains the list of expressions evaluated against the event payload.
   * @return exprs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exprs contains the list of expressions evaluated against the event payload.")

  public List<IoArgoprojEventsV1alpha1ExprFilter> getExprs() {
    return exprs;
  }


  public void setExprs(List<IoArgoprojEventsV1alpha1ExprFilter> exprs) {
    this.exprs = exprs;
  }


  public IoArgoprojEventsV1alpha1EventDependencyFilter time(IoArgoprojEventsV1alpha1TimeFilter time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1TimeFilter getTime() {
    return time;
  }


  public void setTime(IoArgoprojEventsV1alpha1TimeFilter time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1EventDependencyFilter ioArgoprojEventsV1alpha1EventDependencyFilter = (IoArgoprojEventsV1alpha1EventDependencyFilter) o;
    return Objects.equals(this.context, ioArgoprojEventsV1alpha1EventDependencyFilter.context) &&
        Objects.equals(this.data, ioArgoprojEventsV1alpha1EventDependencyFilter.data) &&
        Objects.equals(this.dataLogicalOperator, ioArgoprojEventsV1alpha1EventDependencyFilter.dataLogicalOperator) &&
        Objects.equals(this.exprLogicalOperator, ioArgoprojEventsV1alpha1EventDependencyFilter.exprLogicalOperator) &&
        Objects.equals(this.exprs, ioArgoprojEventsV1alpha1EventDependencyFilter.exprs) &&
        Objects.equals(this.time, ioArgoprojEventsV1alpha1EventDependencyFilter.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, data, dataLogicalOperator, exprLogicalOperator, exprs, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1EventDependencyFilter {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataLogicalOperator: ").append(toIndentedString(dataLogicalOperator)).append("\n");
    sb.append("    exprLogicalOperator: ").append(toIndentedString(exprLogicalOperator)).append("\n");
    sb.append("    exprs: ").append(toIndentedString(exprs)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

