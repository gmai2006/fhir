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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
@Entity
@Table(name="auditevententity")
public class AuditEventEntityModel  implements Serializable {
	private static final long serialVersionUID = 151873631121248861L;
  /**
  * Description: "Identifies a specific instance of the entity. The reference should always be version specific."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="reference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reference;

  /**
  * Description: "The type of the object that was involved in this audit event."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Code representing the role the entity played in the event being audited."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"role\"", length = 16777215)
  private String role;

  /**
  * Description: "Identifier for the data life-cycle stage for the entity."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"lifecycle\"", length = 16777215)
  private String lifecycle;

  /**
  * Description: "Security labels for the identified entity."
  * Actual type: List<String>;
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
  @javax.persistence.Basic
  @Column(name="\"detail_id\"")
  private String detail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="detail_id", insertable=false, updatable=false)
  private java.util.List<AuditEventDetailModel> detail;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public AuditEventEntityModel() {
  }

  public AuditEventEntityModel(AuditEventEntity o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.identifier = JsonUtils.toJson(o.getIdentifier());
    if (null != o.getReference() ) {
    	this.reference_id = "reference" + this.parent_id;
    	this.reference = ReferenceHelper.toModel(o.getReference(), this.reference_id);
    }
    this.type = JsonUtils.toJson(o.getType());
    this.role = JsonUtils.toJson(o.getRole());
    this.lifecycle = JsonUtils.toJson(o.getLifecycle());
    this.name = o.getName();
    this.description = o.getDescription();
    this.query = o.getQuery();
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
    	this.detail_id = "detail" + this.parent_id;
    	this.detail = AuditEventDetailHelper.toModelFromArray(o.getDetail(), this.detail_id);
    }
  }

  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public java.util.List<ReferenceModel> getReference() {
    return this.reference;
  }
  public void setReference( java.util.List<ReferenceModel> value) {
    this.reference = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getRole() {
    return this.role;
  }
  public void setRole( String value) {
    this.role = value;
  }
  public String getLifecycle() {
    return this.lifecycle;
  }
  public void setLifecycle( String value) {
    this.lifecycle = value;
  }
  public String getSecurityLabel() {
    return this.securityLabel;
  }
  public void setSecurityLabel( String value) {
    this.securityLabel = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getQuery() {
    return this.query;
  }
  public void setQuery( String value) {
    this.query = value;
  }
  public java.util.List<AuditEventDetailModel> getDetail() {
    return this.detail;
  }
  public void setDetail( java.util.List<AuditEventDetailModel> value) {
    this.detail = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventEntityModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("role" + "->" + this.role + "\n"); 
     builder.append("lifecycle" + "->" + this.lifecycle + "\n"); 
     builder.append("securityLabel" + "->" + this.securityLabel + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("query" + "->" + this.query + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventEntityModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("reference" + "->" + this.reference + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("role" + "->" + this.role + "\n"); 
     builder.append("lifecycle" + "->" + this.lifecycle + "\n"); 
     builder.append("securityLabel" + "->" + this.securityLabel + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("query" + "->" + this.query + "\n"); 
     builder.append("detail" + "->" + this.detail + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}