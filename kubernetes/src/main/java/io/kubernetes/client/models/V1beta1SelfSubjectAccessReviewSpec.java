/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1beta1NonResourceAttributes;
import io.kubernetes.client.models.V1beta1ResourceAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@ApiModel(description = "SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")

public class V1beta1SelfSubjectAccessReviewSpec {
  @SerializedName("nonResourceAttributes")
  private V1beta1NonResourceAttributes nonResourceAttributes = null;

  @SerializedName("resourceAttributes")
  private V1beta1ResourceAttributes resourceAttributes = null;

  public V1beta1SelfSubjectAccessReviewSpec nonResourceAttributes(V1beta1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

   /**
   * NonResourceAttributes describes information for a non-resource access request
   * @return nonResourceAttributes
  **/
  @ApiModelProperty(value = "NonResourceAttributes describes information for a non-resource access request")
  public V1beta1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(V1beta1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }

  public V1beta1SelfSubjectAccessReviewSpec resourceAttributes(V1beta1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

   /**
   * ResourceAuthorizationAttributes describes information for a resource access request
   * @return resourceAttributes
  **/
  @ApiModelProperty(value = "ResourceAuthorizationAttributes describes information for a resource access request")
  public V1beta1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(V1beta1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SelfSubjectAccessReviewSpec v1beta1SelfSubjectAccessReviewSpec = (V1beta1SelfSubjectAccessReviewSpec) o;
    return Objects.equals(this.nonResourceAttributes, v1beta1SelfSubjectAccessReviewSpec.nonResourceAttributes) &&
        Objects.equals(this.resourceAttributes, v1beta1SelfSubjectAccessReviewSpec.resourceAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceAttributes, resourceAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SelfSubjectAccessReviewSpec {\n");
    
    sb.append("    nonResourceAttributes: ").append(toIndentedString(nonResourceAttributes)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
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

