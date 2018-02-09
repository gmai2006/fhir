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
import org.fhir.entity.AuditEventEntityModel;
import com.google.gson.GsonBuilder;

/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
public class AuditEventEntity  {
  /**
  * Description: "Identifies a specific instance of the entity. The reference should always be version specific."
  */
  private Identifier identifier;

  /**
  * Description: "Identifies a specific instance of the entity. The reference should be version specific."
  */
  private Reference reference;

  /**
  * Description: "The type of the object that was involved in this audit event."
  */
  private Coding type;

  /**
  * Description: "Code representing the role the entity played in the event being audited."
  */
  private Coding role;

  /**
  * Description: "Identifier for the data life-cycle stage for the entity."
  */
  private Coding lifecycle;

  /**
  * Description: "Security labels for the identified entity."
  */
  private java.util.List<Coding> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "A name of the entity in the audit event."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "Text that describes the entity in more detail."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The query parameters for a query-type entities."
  */
  private String query;

  /**
  * Description: "Extensions for query"
  */
  private transient Element _query;

  /**
  * Description: "Tagged value pairs for conveying additional information about the entity."
  */
  private java.util.List<AuditEventDetail> detail = new java.util.ArrayList<>();

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

  public AuditEventEntity() {
  }

  public AuditEventEntity(AuditEventEntityModel o) {
    this.id = o.getId();
      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getReference()) {
        this.reference = new Reference(o.getReference());
        this.reference.setId(this.getId());
      }

      this.type = Coding.fromJson(o.getType());
      this.role = Coding.fromJson(o.getRole());
      this.lifecycle = Coding.fromJson(o.getLifecycle());
      this.securityLabel = Coding.fromArray(o.getSecurityLabel());
      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getQuery()) {
        this.query = new String(o.getQuery());
      }

      this.detail = AuditEventDetail.fromArray(o.getDetail());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setReference( Reference value) {
    this.reference = value;
  }
  public Reference getReference() {
    return this.reference;
  }
  public void setType( Coding value) {
    this.type = value;
  }
  public Coding getType() {
    return this.type;
  }
  public void setRole( Coding value) {
    this.role = value;
  }
  public Coding getRole() {
    return this.role;
  }
  public void setLifecycle( Coding value) {
    this.lifecycle = value;
  }
  public Coding getLifecycle() {
    return this.lifecycle;
  }
  public void setSecurityLabel( java.util.List<Coding> value) {
    this.securityLabel = value;
  }
  public java.util.List<Coding> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setQuery( String value) {
    this.query = value;
  }
  public String getQuery() {
    return this.query;
  }
  public void set_query( Element value) {
    this._query = value;
  }
  public Element get_query() {
    return this._query;
  }
  public void setDetail( java.util.List<AuditEventDetail> value) {
    this.detail = value;
  }
  public java.util.List<AuditEventDetail> getDetail() {
    return this.detail;
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("lifecycle" + "[" + String.valueOf(this.lifecycle) + "]\n"); 
     builder.append("securityLabel" + "[" + String.valueOf(this.securityLabel) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("query" + "[" + String.valueOf(this.query) + "]\n"); 
     builder.append("_query" + "[" + String.valueOf(this._query) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<AuditEventEntity> fromArray(java.util.List<AuditEventEntityModel> list) {
    return (java.util.List<AuditEventEntity>)list.stream()
      .map(model -> new AuditEventEntity(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AuditEventEntityModel> toModelArray(java.util.List<AuditEventEntity> list) {
    return (java.util.List<AuditEventEntityModel>)list.stream()
      .map(model -> new AuditEventEntityModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static AuditEventEntity fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, AuditEventEntity.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(AuditEventEntity o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<AuditEventEntity> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}