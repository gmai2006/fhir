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
import org.fhir.entity.AuditEventSourceModel;
import com.google.gson.GsonBuilder;

/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
public class AuditEventSource  {
  /**
  * Description: "Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group."
  */
  private String site;

  /**
  * Description: "Extensions for site"
  */
  private transient Element _site;

  /**
  * Description: "Identifier of the source where the event was detected."
  */
  @javax.validation.constraints.NotNull
  private Identifier identifier;

  /**
  * Description: "Code specifying the type of source where event originated."
  */
  private java.util.List<Coding> type = new java.util.ArrayList<>();

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

  public AuditEventSource() {
  }

  public AuditEventSource(AuditEventSourceModel o) {
    this.id = o.getId();
      if (null != o.getSite()) {
        this.site = new String(o.getSite());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      this.type = Coding.fromArray(o.getType());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSite( String value) {
    this.site = value;
  }
  public String getSite() {
    return this.site;
  }
  public void set_site( Element value) {
    this._site = value;
  }
  public Element get_site() {
    return this._site;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setType( java.util.List<Coding> value) {
    this.type = value;
  }
  public java.util.List<Coding> getType() {
    return this.type;
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
     builder.append("site" + "[" + String.valueOf(this.site) + "]\n"); 
     builder.append("_site" + "[" + String.valueOf(this._site) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<AuditEventSource> fromArray(java.util.List<AuditEventSourceModel> list) {
    return (java.util.List<AuditEventSource>)list.stream()
      .map(model -> new AuditEventSource(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AuditEventSourceModel> toModelArray(java.util.List<AuditEventSource> list) {
    return (java.util.List<AuditEventSourceModel>)list.stream()
      .map(model -> new AuditEventSourceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static AuditEventSource fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, AuditEventSource.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(AuditEventSource o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<AuditEventSource> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}