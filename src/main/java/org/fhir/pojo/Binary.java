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
import org.fhir.entity.BinaryModel;
import com.google.gson.GsonBuilder;

/**
* "A binary resource can contain any content, whether text, image, pdf, zip archive, etc."
*/
public class Binary  {
  /**
  * Description: "This is a Binary resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "MimeType of the binary content represented as a standard MimeType (BCP 13)."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String contentType;

  /**
  * Description: "Extensions for contentType"
  */
  private transient Element _contentType;

  /**
  * Description: "Treat this binary as if it was this other resource for access control purposes."
  */
  private Reference securityContext;

  /**
  * Description: "The actual content, base64 encoded."
  */
  private String content;

  /**
  * Description: "Extensions for content"
  */
  private transient Element _content;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
  */
  private transient Element _language;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from Resource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Binary() {
  }

  public Binary(BinaryModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getContentType()) {
        this.contentType = new String(o.getContentType());
      }

      if (null != o.getSecurityContext()) {
        this.securityContext = new Reference(o.getSecurityContext());
        this.securityContext.setId(this.getId());
      }

      if (null != o.getContent()) {
        this.content = new String(o.getContent());
      }

      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
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
  public void setSecurityContext( Reference value) {
    this.securityContext = value;
  }
  public Reference getSecurityContext() {
    return this.securityContext;
  }
  public void setContent( String value) {
    this.content = value;
  }
  public String getContent() {
    return this.content;
  }
  public void set_content( Element value) {
    this._content = value;
  }
  public Element get_content() {
    return this._content;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("contentType" + "[" + String.valueOf(this.contentType) + "]\n"); 
     builder.append("_contentType" + "[" + String.valueOf(this._contentType) + "]\n"); 
     builder.append("securityContext" + "[" + String.valueOf(this.securityContext) + "]\n"); 
     builder.append("content" + "[" + String.valueOf(this.content) + "]\n"); 
     builder.append("_content" + "[" + String.valueOf(this._content) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Binary,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Binary" : { return Binary.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Binary> fromArray(java.util.List<BinaryModel> list) {
    return (java.util.List<Binary>)list.stream()
      .map(model -> new Binary(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<BinaryModel> toModelArray(java.util.List<Binary> list) {
    return (java.util.List<BinaryModel>)list.stream()
      .map(model -> new BinaryModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Binary fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Binary.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Binary o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Binary> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}