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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
@Entity
@Table(name="auditevententity")
public class AuditEventEntityModel  {
  /**
  * Description: "Identifies a specific instance of the entity. The reference should always be version specific."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Identifies a specific instance of the entity. The reference should be version specific."
  */
  @javax.persistence.Basic
  @Column(name="\"reference_id\"")
  private String reference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`reference_id`", insertable=false, updatable=false)
  private ReferenceModel reference;

  /**
  * Description: "The type of the object that was involved in this audit event."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Code representing the role the entity played in the event being audited."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"role\"", length = 16777215)
  private String role;

  /**
  * Description: "Identifier for the data life-cycle stage for the entity."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"lifecycle\"", length = 16777215)
  private String lifecycle;

  /**
  * Description: "Security labels for the identified entity."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"securityLabel\"", length = 16777215)
  private String securityLabel;

  /**
  * Description: "A name of the entity in the audit event."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "Text that describes the entity in more detail."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "The query parameters for a query-type entities."
  */
  @javax.persistence.Basic
  @Column(name="\"query\"")
  private String query;

  /**
  * Description: "Tagged value pairs for conveying additional information about the entity."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<AuditEventDetailModel> detail = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public AuditEventEntityModel() {
  }

  public AuditEventEntityModel(AuditEventEntity o) {
    this.id = o.getId();
      this.identifier = Identifier.toJson(o.getIdentifier());
      if (null != o.getReference()) {
      	this.reference_id = "reference" + this.getId();
        this.reference = new ReferenceModel(o.getReference());
        this.reference.setId(this.reference_id);
        this.reference.parent_id = this.reference.getId();
      }

      this.type = Coding.toJson(o.getType());
      this.role = Coding.toJson(o.getRole());
      this.lifecycle = Coding.toJson(o.getLifecycle());
      this.securityLabel = Coding.toJson(o.getSecurityLabel());
      this.name = o.getName();

      this.description = o.getDescription();

      this.query = o.getQuery();

      this.detail = AuditEventDetail.toModelArray(o.getDetail());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setReference( ReferenceModel value) {
    this.reference = value;
  }
  public ReferenceModel getReference() {
    return this.reference;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setRole( String value) {
    this.role = value;
  }
  public String getRole() {
    return this.role;
  }
  public void setLifecycle( String value) {
    this.lifecycle = value;
  }
  public String getLifecycle() {
    return this.lifecycle;
  }
  public void setSecurityLabel( String value) {
    this.securityLabel = value;
  }
  public String getSecurityLabel() {
    return this.securityLabel;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setQuery( String value) {
    this.query = value;
  }
  public String getQuery() {
    return this.query;
  }
  public void setDetail( java.util.List<AuditEventDetailModel> value) {
    this.detail = value;
  }
  public java.util.List<AuditEventDetailModel> getDetail() {
    return this.detail;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
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
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("query" + "[" + String.valueOf(this.query) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}