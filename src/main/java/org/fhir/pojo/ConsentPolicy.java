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
import org.fhir.entity.ConsentPolicyModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
public class ConsentPolicy  {
  /**
  * Description: "Entity or Organization having regulatory jurisdiction or accountability for  enforcing policies pertaining to Consent Directives."
  */
  private String authority;

  /**
  * Description: "Extensions for authority"
  */
  private transient Element _authority;

  /**
  * Description: "The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law."
  */
  private String uri;

  /**
  * Description: "Extensions for uri"
  */
  private transient Element _uri;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public ConsentPolicy() {
  }

  public ConsentPolicy(ConsentPolicyModel o) {
    this.id = o.getId();
      if (null != o.getAuthority()) {
        this.authority = new String(o.getAuthority());
      }

      if (null != o.getUri()) {
        this.uri = new String(o.getUri());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setAuthority( String value) {
    this.authority = value;
  }
  public String getAuthority() {
    return this.authority;
  }
  public void set_authority( Element value) {
    this._authority = value;
  }
  public Element get_authority() {
    return this._authority;
  }
  public void setUri( String value) {
    this.uri = value;
  }
  public String getUri() {
    return this.uri;
  }
  public void set_uri( Element value) {
    this._uri = value;
  }
  public Element get_uri() {
    return this._uri;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
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
     builder.append("authority" + "[" + String.valueOf(this.authority) + "]\n"); 
     builder.append("_authority" + "[" + String.valueOf(this._authority) + "]\n"); 
     builder.append("uri" + "[" + String.valueOf(this.uri) + "]\n"); 
     builder.append("_uri" + "[" + String.valueOf(this._uri) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ConsentPolicy> fromArray(java.util.List<ConsentPolicyModel> list) {
    return (java.util.List<ConsentPolicy>)list.stream()
      .map(model -> new ConsentPolicy(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ConsentPolicyModel> toModelArray(java.util.List<ConsentPolicy> list) {
    return (java.util.List<ConsentPolicyModel>)list.stream()
      .map(model -> new ConsentPolicyModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ConsentPolicy fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ConsentPolicy.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ConsentPolicy o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ConsentPolicy> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}