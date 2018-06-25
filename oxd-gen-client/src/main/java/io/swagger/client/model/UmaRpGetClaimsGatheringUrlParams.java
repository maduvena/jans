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
 * UmaRpGetClaimsGatheringUrlParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T16:29:00.516Z")
public class UmaRpGetClaimsGatheringUrlParams {
  @SerializedName("oxd_id")
  private String oxdId = null;

  @SerializedName("ticket")
  private String ticket = null;

  @SerializedName("claims_redirect_uri")
  private String claimsRedirectUri = null;

  public UmaRpGetClaimsGatheringUrlParams oxdId(String oxdId) {
    this.oxdId = oxdId;
    return this;
  }

   /**
   * Get oxdId
   * @return oxdId
  **/
  @ApiModelProperty(example = "bcad760f-91ba-46e1-a020-05e4281d91b6", required = true, value = "")
  public String getOxdId() {
    return oxdId;
  }

  public void setOxdId(String oxdId) {
    this.oxdId = oxdId;
  }

  public UmaRpGetClaimsGatheringUrlParams ticket(String ticket) {
    this.ticket = ticket;
    return this;
  }

   /**
   * Get ticket
   * @return ticket
  **/
  @ApiModelProperty(example = "fba00191-59ab-4ed6-ac99-a786a88a9f40", required = true, value = "")
  public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  public UmaRpGetClaimsGatheringUrlParams claimsRedirectUri(String claimsRedirectUri) {
    this.claimsRedirectUri = claimsRedirectUri;
    return this;
  }

   /**
   * Get claimsRedirectUri
   * @return claimsRedirectUri
  **/
  @ApiModelProperty(example = "https://client.example.com/cb", required = true, value = "")
  public String getClaimsRedirectUri() {
    return claimsRedirectUri;
  }

  public void setClaimsRedirectUri(String claimsRedirectUri) {
    this.claimsRedirectUri = claimsRedirectUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UmaRpGetClaimsGatheringUrlParams umaRpGetClaimsGatheringUrlParams = (UmaRpGetClaimsGatheringUrlParams) o;
    return Objects.equals(this.oxdId, umaRpGetClaimsGatheringUrlParams.oxdId) &&
        Objects.equals(this.ticket, umaRpGetClaimsGatheringUrlParams.ticket) &&
        Objects.equals(this.claimsRedirectUri, umaRpGetClaimsGatheringUrlParams.claimsRedirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oxdId, ticket, claimsRedirectUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UmaRpGetClaimsGatheringUrlParams {\n");
    
    sb.append("    oxdId: ").append(toIndentedString(oxdId)).append("\n");
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
    sb.append("    claimsRedirectUri: ").append(toIndentedString(claimsRedirectUri)).append("\n");
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

