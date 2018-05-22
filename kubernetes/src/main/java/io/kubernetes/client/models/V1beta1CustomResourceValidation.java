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
import io.kubernetes.client.models.V1beta1JSONSchemaProps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomResourceValidation is a list of validation methods for CustomResources.
 */
@ApiModel(description = "CustomResourceValidation is a list of validation methods for CustomResources.")

public class V1beta1CustomResourceValidation {
  @SerializedName("openAPIV3Schema")
  private V1beta1JSONSchemaProps openAPIV3Schema = null;

  public V1beta1CustomResourceValidation openAPIV3Schema(V1beta1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
    return this;
  }

   /**
   * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against.
   * @return openAPIV3Schema
  **/
  @ApiModelProperty(value = "OpenAPIV3Schema is the OpenAPI v3 schema to be validated against.")
  public V1beta1JSONSchemaProps getOpenAPIV3Schema() {
    return openAPIV3Schema;
  }

  public void setOpenAPIV3Schema(V1beta1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceValidation v1beta1CustomResourceValidation = (V1beta1CustomResourceValidation) o;
    return Objects.equals(this.openAPIV3Schema, v1beta1CustomResourceValidation.openAPIV3Schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openAPIV3Schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceValidation {\n");
    
    sb.append("    openAPIV3Schema: ").append(toIndentedString(openAPIV3Schema)).append("\n");
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

