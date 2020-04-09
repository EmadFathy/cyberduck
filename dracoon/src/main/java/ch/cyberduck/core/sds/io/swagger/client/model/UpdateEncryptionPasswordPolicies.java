/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.20.1  - built at: 2020-04-05 23:00:17<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.20.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.sds.io.swagger.client.model.CharacterRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request model for updating encryption password policies
 */
@ApiModel(description = "Request model for updating encryption password policies")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T17:57:49.759+02:00")
public class UpdateEncryptionPasswordPolicies {
  @JsonProperty("characterRules")
  private CharacterRules characterRules = null;

  @JsonProperty("minLength")
  private Integer minLength = null;

  @JsonProperty("rejectUserInfo")
  private Boolean rejectUserInfo = null;

  @JsonProperty("rejectKeyboardPatterns")
  private Boolean rejectKeyboardPatterns = null;

  public UpdateEncryptionPasswordPolicies characterRules(CharacterRules characterRules) {
    this.characterRules = characterRules;
    return this;
  }

   /**
   * Properties of character related password policies
   * @return characterRules
  **/
  @ApiModelProperty(value = "Properties of character related password policies")
  public CharacterRules getCharacterRules() {
    return characterRules;
  }

  public void setCharacterRules(CharacterRules characterRules) {
    this.characterRules = characterRules;
  }

  public UpdateEncryptionPasswordPolicies minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Minimum number of characters a password must contain (must be between &#x60;1&#x60; and &#x60;1024&#x60;)
   * @return minLength
  **/
  @ApiModelProperty(value = "Minimum number of characters a password must contain (must be between `1` and `1024`)")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public UpdateEncryptionPasswordPolicies rejectUserInfo(Boolean rejectUserInfo) {
    this.rejectUserInfo = rejectUserInfo;
    return this;
  }

   /**
   * Determines whether a password must NOT contain user info (first name, last name, email, user name)
   * @return rejectUserInfo
  **/
  @ApiModelProperty(value = "Determines whether a password must NOT contain user info (first name, last name, email, user name)")
  public Boolean isRejectUserInfo() {
    return rejectUserInfo;
  }

  public void setRejectUserInfo(Boolean rejectUserInfo) {
    this.rejectUserInfo = rejectUserInfo;
  }

  public UpdateEncryptionPasswordPolicies rejectKeyboardPatterns(Boolean rejectKeyboardPatterns) {
    this.rejectKeyboardPatterns = rejectKeyboardPatterns;
    return this;
  }

   /**
   * Determines whether a password must NOT contain keyboard patterns (e.g. &#x60;qwertz&#x60;, &#x60;asdf&#x60;) (min. 4 character pattern)
   * @return rejectKeyboardPatterns
  **/
  @ApiModelProperty(value = "Determines whether a password must NOT contain keyboard patterns (e.g. `qwertz`, `asdf`) (min. 4 character pattern)")
  public Boolean isRejectKeyboardPatterns() {
    return rejectKeyboardPatterns;
  }

  public void setRejectKeyboardPatterns(Boolean rejectKeyboardPatterns) {
    this.rejectKeyboardPatterns = rejectKeyboardPatterns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEncryptionPasswordPolicies updateEncryptionPasswordPolicies = (UpdateEncryptionPasswordPolicies) o;
    return Objects.equals(this.characterRules, updateEncryptionPasswordPolicies.characterRules) &&
        Objects.equals(this.minLength, updateEncryptionPasswordPolicies.minLength) &&
        Objects.equals(this.rejectUserInfo, updateEncryptionPasswordPolicies.rejectUserInfo) &&
        Objects.equals(this.rejectKeyboardPatterns, updateEncryptionPasswordPolicies.rejectKeyboardPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterRules, minLength, rejectUserInfo, rejectKeyboardPatterns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEncryptionPasswordPolicies {\n");
    
    sb.append("    characterRules: ").append(toIndentedString(characterRules)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    rejectUserInfo: ").append(toIndentedString(rejectUserInfo)).append("\n");
    sb.append("    rejectKeyboardPatterns: ").append(toIndentedString(rejectKeyboardPatterns)).append("\n");
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

