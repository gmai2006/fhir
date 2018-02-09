/*
 * #%L
 * FHIR Implementation
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
 
/**
 * This code is 100% AUTO generated. Please do not modify it DIRECTLY
 * If you need new features or function or changes please update the templates
 * then submit the template through our web interface.  
 */

package org.fhir.pojo;
import com.google.gson.GsonBuilder;

/**
* "A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different signature approaches have different utilities."
*/
public class Signature  {
  /**
  * Description: "An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<Coding> type = new java.util.ArrayList<>();

  /**
  * Description: "When the digital signature was signed."
  */
  private String when;

  /**
  * Description: "Extensions for when"
  */
  private transient Element _when;

  /**
  * Description: "A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key)."
  */
  private String whoUri;

  /**
  * Description: "Extensions for whoUri"
  */
  private transient Element _whoUri;

  /**
  * Description: "A reference to an application-usable description of the identity that signed  (e.g. the signature used their private key)."
  */
  private Reference whoReference;

  /**
  * Description: "A reference to an application-usable description of the identity that is represented by the signature."
  */
  private String onBehalfOfUri;

  /**
  * Description: "Extensions for onBehalfOfUri"
  */
  private transient Element _onBehalfOfUri;

  /**
  * Description: "A reference to an application-usable description of the identity that is represented by the signature."
  */
  private Reference onBehalfOfReference;

  /**
  * Description: "A mime type that indicates the technical format of the signature. Important mime types are application/signature+xml for X ML DigSig, application/jwt for JWT, and image/* for a graphical image of a signature, etc."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String contentType;

  /**
  * Description: "Extensions for contentType"
  */
  private transient Element _contentType;

  /**
  * Description: "The base64 encoding of the Signature content. When signature is not recorded electronically this element would be empty."
  */
  private String blob;

  /**
  * Description: "Extensions for blob"
  */
  private transient Element _blob;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Signature() {}

  public void setType( java.util.List<Coding> value) {
    this.type = value;
  }
  public java.util.List<Coding> getType() {
    return this.type;
  }
  public void setWhen( String value) {
    this.when = value;
  }
  public String getWhen() {
    return this.when;
  }
  public void set_when( Element value) {
    this._when = value;
  }
  public Element get_when() {
    return this._when;
  }
  public void setWhoUri( String value) {
    this.whoUri = value;
  }
  public String getWhoUri() {
    return this.whoUri;
  }
  public void set_whoUri( Element value) {
    this._whoUri = value;
  }
  public Element get_whoUri() {
    return this._whoUri;
  }
  public void setWhoReference( Reference value) {
    this.whoReference = value;
  }
  public Reference getWhoReference() {
    return this.whoReference;
  }
  public void setOnBehalfOfUri( String value) {
    this.onBehalfOfUri = value;
  }
  public String getOnBehalfOfUri() {
    return this.onBehalfOfUri;
  }
  public void set_onBehalfOfUri( Element value) {
    this._onBehalfOfUri = value;
  }
  public Element get_onBehalfOfUri() {
    return this._onBehalfOfUri;
  }
  public void setOnBehalfOfReference( Reference value) {
    this.onBehalfOfReference = value;
  }
  public Reference getOnBehalfOfReference() {
    return this.onBehalfOfReference;
  }
  public void setContentType( String value) {
    this.contentType = value;
  }
  public String getContentType() {
    return this.contentType;
  }
  public void set_contentType( Element value) {
    this._contentType = value;
  }
  public Element get_contentType() {
    return this._contentType;
  }
  public void setBlob( String value) {
    this.blob = value;
  }
  public String getBlob() {
    return this.blob;
  }
  public void set_blob( Element value) {
    this._blob = value;
  }
  public Element get_blob() {
    return this._blob;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("when" + "[" + String.valueOf(this.when) + "]\n"); 
     builder.append("_when" + "[" + String.valueOf(this._when) + "]\n"); 
     builder.append("whoUri" + "[" + String.valueOf(this.whoUri) + "]\n"); 
     builder.append("_whoUri" + "[" + String.valueOf(this._whoUri) + "]\n"); 
     builder.append("whoReference" + "[" + String.valueOf(this.whoReference) + "]\n"); 
     builder.append("onBehalfOfUri" + "[" + String.valueOf(this.onBehalfOfUri) + "]\n"); 
     builder.append("_onBehalfOfUri" + "[" + String.valueOf(this._onBehalfOfUri) + "]\n"); 
     builder.append("onBehalfOfReference" + "[" + String.valueOf(this.onBehalfOfReference) + "]\n"); 
     builder.append("contentType" + "[" + String.valueOf(this.contentType) + "]\n"); 
     builder.append("_contentType" + "[" + String.valueOf(this._contentType) + "]\n"); 
     builder.append("blob" + "[" + String.valueOf(this.blob) + "]\n"); 
     builder.append("_blob" + "[" + String.valueOf(this._blob) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static Signature fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Signature.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Signature o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Signature> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

}