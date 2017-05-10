/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 */
@ApiModel(description = "Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.")

public class V1Secret {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("data")
  private Map<String, byte[]> data = new HashMap<String, byte[]>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("stringData")
  private Map<String, String> stringData = new HashMap<String, String>();

  @SerializedName("type")
  private String type = null;

  public V1Secret apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(example = "null", value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1Secret data(Map<String, byte[]> data) {
    this.data = data;
    return this;
  }

  public V1Secret putDataItem(String key, byte[] dataItem) {
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Data contains the secret data. Each key must be a valid DNS_SUBDOMAIN or leading dot followed by valid DNS_SUBDOMAIN. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "Data contains the secret data. Each key must be a valid DNS_SUBDOMAIN or leading dot followed by valid DNS_SUBDOMAIN. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4")
  public Map<String, byte[]> getData() {
    return data;
  }

  public void setData(Map<String, byte[]> data) {
    this.data = data;
  }

  public V1Secret kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1Secret metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object's metadata. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "Standard object's metadata. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1Secret stringData(Map<String, String> stringData) {
    this.stringData = stringData;
    return this;
  }

  public V1Secret putStringDataItem(String key, String stringDataItem) {
    this.stringData.put(key, stringDataItem);
    return this;
  }

   /**
   * stringData allows specifying non-binary secret data in string form. It is provided as a write-only convenience method. All keys and values are merged into the data field on write, overwriting any existing values. It is never output when reading from the API.
   * @return stringData
  **/
  @ApiModelProperty(example = "null", value = "stringData allows specifying non-binary secret data in string form. It is provided as a write-only convenience method. All keys and values are merged into the data field on write, overwriting any existing values. It is never output when reading from the API.")
  public Map<String, String> getStringData() {
    return stringData;
  }

  public void setStringData(Map<String, String> stringData) {
    this.stringData = stringData;
  }

  public V1Secret type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Used to facilitate programmatic handling of secret data.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Used to facilitate programmatic handling of secret data.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Secret v1Secret = (V1Secret) o;
    return Objects.equals(this.apiVersion, v1Secret.apiVersion) &&
        Objects.equals(this.data, v1Secret.data) &&
        Objects.equals(this.kind, v1Secret.kind) &&
        Objects.equals(this.metadata, v1Secret.metadata) &&
        Objects.equals(this.stringData, v1Secret.stringData) &&
        Objects.equals(this.type, v1Secret.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, data, kind, metadata, stringData, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Secret {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    stringData: ").append(toIndentedString(stringData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

