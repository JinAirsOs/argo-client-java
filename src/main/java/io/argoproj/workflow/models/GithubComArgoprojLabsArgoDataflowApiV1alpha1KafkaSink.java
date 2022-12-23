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
 * GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink {
  public static final String SERIALIZED_NAME_ACKS = "acks";
  @SerializedName(SERIALIZED_NAME_ACKS)
  private String acks;

  public static final String SERIALIZED_NAME_ASYNC = "async";
  @SerializedName(SERIALIZED_NAME_ASYNC)
  private Boolean async;

  public static final String SERIALIZED_NAME_BATCH_SIZE = "batchSize";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
  private String batchSize;

  public static final String SERIALIZED_NAME_COMPRESSION_TYPE = "compressionType";
  @SerializedName(SERIALIZED_NAME_COMPRESSION_TYPE)
  private String compressionType;

  public static final String SERIALIZED_NAME_ENABLE_IDEMPOTENCE = "enableIdempotence";
  @SerializedName(SERIALIZED_NAME_ENABLE_IDEMPOTENCE)
  private Boolean enableIdempotence;

  public static final String SERIALIZED_NAME_KAFKA = "kafka";
  @SerializedName(SERIALIZED_NAME_KAFKA)
  private GithubComArgoprojLabsArgoDataflowApiV1alpha1Kafka kafka;

  public static final String SERIALIZED_NAME_LINGER = "linger";
  @SerializedName(SERIALIZED_NAME_LINGER)
  private Duration linger;

  public static final String SERIALIZED_NAME_MAX_INFLIGHT = "maxInflight";
  @SerializedName(SERIALIZED_NAME_MAX_INFLIGHT)
  private Integer maxInflight;

  public static final String SERIALIZED_NAME_MESSAGE_TIMEOUT = "messageTimeout";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TIMEOUT)
  private Duration messageTimeout;


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink acks(String acks) {
    
    this.acks = acks;
    return this;
  }

   /**
   * Get acks
   * @return acks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcks() {
    return acks;
  }


  public void setAcks(String acks) {
    this.acks = acks;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink async(Boolean async) {
    
    this.async = async;
    return this;
  }

   /**
   * Get async
   * @return async
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAsync() {
    return async;
  }


  public void setAsync(Boolean async) {
    this.async = async;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink batchSize(String batchSize) {
    
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  &lt;quantity&gt;        ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt;   (Note that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.) &lt;digit&gt;           ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt;          ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt;          ::&#x3D; &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;            ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt;    ::&#x3D; &lt;number&gt; | &lt;sign&gt;&lt;number&gt; &lt;suffix&gt;          ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt; &lt;binarySI&gt;        ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html) &lt;decimalSI&gt;       ::&#x3D; m | \&quot;\&quot; | k | M | G | T | P | E   (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I didn&#39;t choose the capitalization.) &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot; &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt;  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost   b. No fractional digits will be emitted   c. The exponent (or suffix) is as large as possible. The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \&quot;1500m\&quot;   1.5Gi will be serialized as \&quot;1536Mi\&quot;  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   * @return batchSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.) <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html) <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.) <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber>  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost   b. No fractional digits will be emitted   c. The exponent (or suffix) is as large as possible. The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \"1500m\"   1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")

  public String getBatchSize() {
    return batchSize;
  }


  public void setBatchSize(String batchSize) {
    this.batchSize = batchSize;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink compressionType(String compressionType) {
    
    this.compressionType = compressionType;
    return this;
  }

   /**
   * Get compressionType
   * @return compressionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompressionType() {
    return compressionType;
  }


  public void setCompressionType(String compressionType) {
    this.compressionType = compressionType;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink enableIdempotence(Boolean enableIdempotence) {
    
    this.enableIdempotence = enableIdempotence;
    return this;
  }

   /**
   * Get enableIdempotence
   * @return enableIdempotence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableIdempotence() {
    return enableIdempotence;
  }


  public void setEnableIdempotence(Boolean enableIdempotence) {
    this.enableIdempotence = enableIdempotence;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink kafka(GithubComArgoprojLabsArgoDataflowApiV1alpha1Kafka kafka) {
    
    this.kafka = kafka;
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GithubComArgoprojLabsArgoDataflowApiV1alpha1Kafka getKafka() {
    return kafka;
  }


  public void setKafka(GithubComArgoprojLabsArgoDataflowApiV1alpha1Kafka kafka) {
    this.kafka = kafka;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink linger(Duration linger) {
    
    this.linger = linger;
    return this;
  }

   /**
   * Get linger
   * @return linger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Duration getLinger() {
    return linger;
  }


  public void setLinger(Duration linger) {
    this.linger = linger;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink maxInflight(Integer maxInflight) {
    
    this.maxInflight = maxInflight;
    return this;
  }

   /**
   * Get maxInflight
   * @return maxInflight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxInflight() {
    return maxInflight;
  }


  public void setMaxInflight(Integer maxInflight) {
    this.maxInflight = maxInflight;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink messageTimeout(Duration messageTimeout) {
    
    this.messageTimeout = messageTimeout;
    return this;
  }

   /**
   * Get messageTimeout
   * @return messageTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Duration getMessageTimeout() {
    return messageTimeout;
  }


  public void setMessageTimeout(Duration messageTimeout) {
    this.messageTimeout = messageTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink = (GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink) o;
    return Objects.equals(this.acks, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.acks) &&
        Objects.equals(this.async, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.async) &&
        Objects.equals(this.batchSize, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.batchSize) &&
        Objects.equals(this.compressionType, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.compressionType) &&
        Objects.equals(this.enableIdempotence, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.enableIdempotence) &&
        Objects.equals(this.kafka, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.kafka) &&
        Objects.equals(this.linger, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.linger) &&
        Objects.equals(this.maxInflight, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.maxInflight) &&
        Objects.equals(this.messageTimeout, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink.messageTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acks, async, batchSize, compressionType, enableIdempotence, kafka, linger, maxInflight, messageTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSink {\n");
    sb.append("    acks: ").append(toIndentedString(acks)).append("\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    compressionType: ").append(toIndentedString(compressionType)).append("\n");
    sb.append("    enableIdempotence: ").append(toIndentedString(enableIdempotence)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    linger: ").append(toIndentedString(linger)).append("\n");
    sb.append("    maxInflight: ").append(toIndentedString(maxInflight)).append("\n");
    sb.append("    messageTimeout: ").append(toIndentedString(messageTimeout)).append("\n");
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

