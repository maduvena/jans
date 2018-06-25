package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UmaRpGetRptResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T16:29:00.516Z")
public class UmaRpGetRptResponseData {
  @SerializedName("pct")
  private String pct = null;

  @SerializedName("updated")
  private Boolean updated = null;

  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("token_type")
  private String tokenType = null;

  public UmaRpGetRptResponseData pct(String pct) {
    this.pct = pct;
    return this;
  }

   /**
   * Get pct
   * @return pct
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPct() {
    return pct;
  }

  public void setPct(String pct) {
    this.pct = pct;
  }

  public UmaRpGetRptResponseData updated(Boolean updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isUpdated() {
    return updated;
  }

  public void setUpdated(Boolean updated) {
    this.updated = updated;
  }

  public UmaRpGetRptResponseData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @ApiModelProperty(example = "b75434ff-f465-4b70-92e4-b7ba6b6c58f2", required = true, value = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public UmaRpGetRptResponseData tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @ApiModelProperty(example = "bearer", required = true, value = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UmaRpGetRptResponseData umaRpGetRptResponseData = (UmaRpGetRptResponseData) o;
    return Objects.equals(this.pct, umaRpGetRptResponseData.pct) &&
        Objects.equals(this.updated, umaRpGetRptResponseData.updated) &&
        Objects.equals(this.accessToken, umaRpGetRptResponseData.accessToken) &&
        Objects.equals(this.tokenType, umaRpGetRptResponseData.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pct, updated, accessToken, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UmaRpGetRptResponseData {\n");
    
    sb.append("    pct: ").append(toIndentedString(pct)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

