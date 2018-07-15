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
* generated on 07/14/2018
*/
@Entity
@Table(name="auditevent")
public class AuditEventModel  implements Serializable {
	private static final long serialVersionUID = 153159210171565156L;
  /**
  * Description: "This is a AuditEvent resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> type;

  /**
  * Description: "Identifier for the category of event."
  */
  @javax.persistence.Basic
  @Column(name="\"subtype_id\"")
  private String subtype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subtype_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> subtype;

  /**
  * Description: "Indicator for type of action performed during the event that generated the audit."
  */
  @javax.persistence.Basic
  @Column(name="\"action\"")
  private String action;

  /**
  * Description: "The time when the event occurred on the source."
  */
  @javax.persistence.Basic
  @Column(name="\"recorded\"")
  private String recorded;

  /**
  * Description: "Indicates whether the event succeeded or failed."
  */
  @javax.persistence.Basic
  @Column(name="\"outcome\"")
  private String outcome;

  /**
  * Description: "A free text description of the outcome of the event."
  */
  @javax.persistence.Basic
  @Column(name="\"outcomeDesc\"")
  private String outcomeDesc;

  /**
  * Description: "The purposeOfUse (reason) that was used during the event being recorded."
  */
  @javax.persistence.Basic
  @Column(name="\"purposeofevent_id\"")
  private String purposeofevent_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="purposeofevent_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> purposeOfEvent;

  /**
  * Description: "An actor taking an active role in the event or activity that is logged."
  */
  @javax.persistence.Basic
  @Column(name="\"agent_id\"")
  private String agent_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="agent_id", insertable=false, updatable=false)
  private java.util.List<AuditEventAgentModel> agent;

  /**
  * Description: "The system that is reporting the event."
  */
  @javax.persistence.Basic
  @Column(name="\"source_id\"")
  private String source_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="source_id", insertable=false, updatable=false)
  private java.util.List<AuditEventSourceModel> source;

  /**
  * Description: "Specific instances of data or objects that have been accessed."
  */
  @javax.persistence.Basic
  @Column(name="\"entity_id\"")
  private String entity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="entity_id", insertable=false, updatable=false)
  private java.util.List<AuditEventEntityModel> entity;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public AuditEventModel() {
  }

  public AuditEventModel(AuditEvent o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodingHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getSubtype() && !o.getSubtype().isEmpty()) {
    	this.subtype_id = "subtype" + this.id;
    	this.subtype = CodingHelper.toModelFromArray(o.getSubtype(), this.subtype_id);
    }
    this.action = o.getAction();
    this.recorded = o.getRecorded();
    this.outcome = o.getOutcome();
    this.outcomeDesc = o.getOutcomeDesc();
    if (null != o.getPurposeOfEvent() && !o.getPurposeOfEvent().isEmpty()) {
    	this.purposeofevent_id = "purposeofevent" + this.id;
    	this.purposeOfEvent = CodeableConceptHelper.toModelFromArray(o.getPurposeOfEvent(), this.purposeofevent_id);
    }
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent_id = "agent" + this.id;
    	this.agent = AuditEventAgentHelper.toModelFromArray(o.getAgent(), this.agent_id);
    }
    if (null != o.getSource() ) {
    	this.source_id = "source" + this.id;
    	this.source = AuditEventSourceHelper.toModel(o.getSource(), this.source_id);
    }
    if (null != o.getEntity() && !o.getEntity().isEmpty()) {
    	this.entity_id = "entity" + this.id;
    	this.entity = AuditEventEntityHelper.toModelFromArray(o.getEntity(), this.entity_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public java.util.List<CodingModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodingModel> value) {
    this.type = value;
  }
  public java.util.List<CodingModel> getSubtype() {
    return this.subtype;
  }
  public void setSubtype( java.util.List<CodingModel> value) {
    this.subtype = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getRecorded() {
    return this.recorded;
  }
  public void setRecorded( String value) {
    this.recorded = value;
  }
  public String getOutcome() {
    return this.outcome;
  }
  public void setOutcome( String value) {
    this.outcome = value;
  }
  public String getOutcomeDesc() {
    return this.outcomeDesc;
  }
  public void setOutcomeDesc( String value) {
    this.outcomeDesc = value;
  }
  public java.util.List<CodeableConceptModel> getPurposeOfEvent() {
    return this.purposeOfEvent;
  }
  public void setPurposeOfEvent( java.util.List<CodeableConceptModel> value) {
    this.purposeOfEvent = value;
  }
  public java.util.List<AuditEventAgentModel> getAgent() {
    return this.agent;
  }
  public void setAgent( java.util.List<AuditEventAgentModel> value) {
    this.agent = value;
  }
  public java.util.List<AuditEventSourceModel> getSource() {
    return this.source;
  }
  public void setSource( java.util.List<AuditEventSourceModel> value) {
    this.source = value;
  }
  public java.util.List<AuditEventEntityModel> getEntity() {
    return this.entity;
  }
  public void setEntity( java.util.List<AuditEventEntityModel> value) {
    this.entity = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("recorded" + "->" + this.recorded + "\n"); 
     builder.append("outcome" + "->" + this.outcome + "\n"); 
     builder.append("outcomeDesc" + "->" + this.outcomeDesc + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("recorded" + "->" + this.recorded + "\n"); 
     builder.append("outcome" + "->" + this.outcome + "\n"); 
     builder.append("outcomeDesc" + "->" + this.outcomeDesc + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}