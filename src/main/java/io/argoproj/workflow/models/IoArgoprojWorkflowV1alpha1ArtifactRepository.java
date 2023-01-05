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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1AzureArtifactRepository;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1GCSArtifactRepository;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1HDFSArtifactRepository;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1OSSArtifactRepository;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1S3ArtifactRepository;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
 */
@ApiModel(description = "ArtifactRepository represents an artifact repository in which a controller will store its artifacts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1ArtifactRepository {
  public static final String SERIALIZED_NAME_ARCHIVE_LOGS = "archiveLogs";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOGS)
  private Boolean archiveLogs;

  public static final String SERIALIZED_NAME_ARTIFACTORY = "artifactory";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY)
  private IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository artifactory;

  public static final String SERIALIZED_NAME_AZURE = "azure";
  @SerializedName(SERIALIZED_NAME_AZURE)
  private IoArgoprojWorkflowV1alpha1AzureArtifactRepository azure;

  public static final String SERIALIZED_NAME_GCS = "gcs";
  @SerializedName(SERIALIZED_NAME_GCS)
  private IoArgoprojWorkflowV1alpha1GCSArtifactRepository gcs;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  private IoArgoprojWorkflowV1alpha1HDFSArtifactRepository hdfs;

  public static final String SERIALIZED_NAME_OSS = "oss";
  @SerializedName(SERIALIZED_NAME_OSS)
  private IoArgoprojWorkflowV1alpha1OSSArtifactRepository oss;

  public static final String SERIALIZED_NAME_S3 = "s3";
  @SerializedName(SERIALIZED_NAME_S3)
  private IoArgoprojWorkflowV1alpha1S3ArtifactRepository s3;


  public IoArgoprojWorkflowV1alpha1ArtifactRepository archiveLogs(Boolean archiveLogs) {
    
    this.archiveLogs = archiveLogs;
    return this;
  }

   /**
   * ArchiveLogs enables log archiving
   * @return archiveLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ArchiveLogs enables log archiving")

  public Boolean getArchiveLogs() {
    return archiveLogs;
  }


  public void setArchiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactRepository artifactory(IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository artifactory) {
    
    this.artifactory = artifactory;
    return this;
  }

   /**
   * Get artifactory
   * @return artifactory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository getArtifactory() {
    return artifactory;
  }


  public void setArtifactory(IoArgoprojWorkflowV1alpha1ArtifactoryArtifactRepository artifactory) {
    this.artifactory = artifactory;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactRepository azure(IoArgoprojWorkflowV1alpha1AzureArtifactRepository azure) {
    
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1AzureArtifactRepository getAzure() {
    return azure;
  }


  public void setAzure(IoArgoprojWorkflowV1alpha1AzureArtifactRepository azure) {
    this.azure = azure;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactRepository gcs(IoArgoprojWorkflowV1alpha1GCSArtifactRepository gcs) {
    
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1GCSArtifactRepository getGcs() {
    return gcs;
  }


  public void setGcs(IoArgoprojWorkflowV1alpha1GCSArtifactRepository gcs) {
    this.gcs = gcs;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactRepository hdfs(IoArgoprojWorkflowV1alpha1HDFSArtifactRepository hdfs) {
    
    this.hdfs = hdfs;
    return this;
  }

   /**
   * Get hdfs
   * @return hdfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository getHdfs() {
    return hdfs;
  }


  public void setHdfs(IoArgoprojWorkflowV1alpha1HDFSArtifactRepository hdfs) {
    this.hdfs = hdfs;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactRepository oss(IoArgoprojWorkflowV1alpha1OSSArtifactRepository oss) {
    
    this.oss = oss;
    return this;
  }

   /**
   * Get oss
   * @return oss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1OSSArtifactRepository getOss() {
    return oss;
  }


  public void setOss(IoArgoprojWorkflowV1alpha1OSSArtifactRepository oss) {
    this.oss = oss;
  }


  public IoArgoprojWorkflowV1alpha1ArtifactRepository s3(IoArgoprojWorkflowV1alpha1S3ArtifactRepository s3) {
    
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1S3ArtifactRepository getS3() {
    return s3;
  }


  public void setS3(IoArgoprojWorkflowV1alpha1S3ArtifactRepository s3) {
    this.s3 = s3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ArtifactRepository ioArgoprojWorkflowV1alpha1ArtifactRepository = (IoArgoprojWorkflowV1alpha1ArtifactRepository) o;
    return Objects.equals(this.archiveLogs, ioArgoprojWorkflowV1alpha1ArtifactRepository.archiveLogs) &&
        Objects.equals(this.artifactory, ioArgoprojWorkflowV1alpha1ArtifactRepository.artifactory) &&
        Objects.equals(this.azure, ioArgoprojWorkflowV1alpha1ArtifactRepository.azure) &&
        Objects.equals(this.gcs, ioArgoprojWorkflowV1alpha1ArtifactRepository.gcs) &&
        Objects.equals(this.hdfs, ioArgoprojWorkflowV1alpha1ArtifactRepository.hdfs) &&
        Objects.equals(this.oss, ioArgoprojWorkflowV1alpha1ArtifactRepository.oss) &&
        Objects.equals(this.s3, ioArgoprojWorkflowV1alpha1ArtifactRepository.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveLogs, artifactory, azure, gcs, hdfs, oss, s3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactRepository {\n");
    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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

