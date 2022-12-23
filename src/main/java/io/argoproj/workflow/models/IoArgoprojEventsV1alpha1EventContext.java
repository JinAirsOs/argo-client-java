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
 * IoArgoprojEventsV1alpha1EventContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1EventContext {
  public static final String SERIALIZED_NAME_DATACONTENTTYPE = "datacontenttype";
  @SerializedName(SERIALIZED_NAME_DATACONTENTTYPE)
  private String datacontenttype;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SPECVERSION = "specversion";
  @SerializedName(SERIALIZED_NAME_SPECVERSION)
  private String specversion;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private java.time.Instant time;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public IoArgoprojEventsV1alpha1EventContext datacontenttype(String datacontenttype) {
    
    this.datacontenttype = datacontenttype;
    return this;
  }

   /**
   * DataContentType - A MIME (RFC2046) string describing the media type of &#x60;data&#x60;.
   * @return datacontenttype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DataContentType - A MIME (RFC2046) string describing the media type of `data`.")

  public String getDatacontenttype() {
    return datacontenttype;
  }


  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }


  public IoArgoprojEventsV1alpha1EventContext id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the event; must be non-empty and unique within the scope of the producer.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the event; must be non-empty and unique within the scope of the producer.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IoArgoprojEventsV1alpha1EventContext source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Source - A URI describing the event producer.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source - A URI describing the event producer.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public IoArgoprojEventsV1alpha1EventContext specversion(String specversion) {
    
    this.specversion = specversion;
    return this;
  }

   /**
   * SpecVersion - The version of the CloudEvents specification used by the io.argoproj.workflow.v1alpha1.
   * @return specversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SpecVersion - The version of the CloudEvents specification used by the io.argoproj.workflow.v1alpha1.")

  public String getSpecversion() {
    return specversion;
  }


  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }


  public IoArgoprojEventsV1alpha1EventContext subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public IoArgoprojEventsV1alpha1EventContext time(java.time.Instant time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.time.Instant getTime() {
    return time;
  }


  public void setTime(java.time.Instant time) {
    this.time = time;
  }


  public IoArgoprojEventsV1alpha1EventContext type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type - The type of the occurrence which has happened.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type - The type of the occurrence which has happened.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
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
    IoArgoprojEventsV1alpha1EventContext ioArgoprojEventsV1alpha1EventContext = (IoArgoprojEventsV1alpha1EventContext) o;
    return Objects.equals(this.datacontenttype, ioArgoprojEventsV1alpha1EventContext.datacontenttype) &&
        Objects.equals(this.id, ioArgoprojEventsV1alpha1EventContext.id) &&
        Objects.equals(this.source, ioArgoprojEventsV1alpha1EventContext.source) &&
        Objects.equals(this.specversion, ioArgoprojEventsV1alpha1EventContext.specversion) &&
        Objects.equals(this.subject, ioArgoprojEventsV1alpha1EventContext.subject) &&
        Objects.equals(this.time, ioArgoprojEventsV1alpha1EventContext.time) &&
        Objects.equals(this.type, ioArgoprojEventsV1alpha1EventContext.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datacontenttype, id, source, specversion, subject, time, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1EventContext {\n");
    sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

