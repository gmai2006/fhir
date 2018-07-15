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
* "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
* generated on 07/14/2018
*/
@Entity
@Table(name="goal")
public class GoalModel  implements Serializable {
	private static final long serialVersionUID = 153159210209037279L;
  /**
  * Description: "This is a Goal resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Indicates whether the goal has been reached and is still considered relevant."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Indicates a category the goal falls within."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "Identifies the mutually agreed level of importance associated with reaching/sustaining the goal."
  */
  @javax.persistence.Basic
  @Column(name="\"priority_id\"")
  private String priority_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="priority_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> priority;

  /**
  * Description: "Human-readable and/or coded description of a specific desired objective of care, such as \"control blood pressure\" or \"negotiate an obstacle course\" or \"dance with child at wedding\"."
  */
  @javax.persistence.Basic
  @Column(name="\"description_id\"")
  private String description_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="description_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> description;

  /**
  * Description: "Identifies the patient, group or organization for whom the goal is being established."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The date or event after which the goal should begin being pursued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"startDate\"")
  private String startDate;

  /**
  * Description: "The date or event after which the goal should begin being pursued."
  */
  @javax.persistence.Basic
  @Column(name="\"startcodeableconcept_id\"")
  private String startcodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="startcodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> startCodeableConcept;

  /**
  * Description: "Indicates what should be done by when."
  */
  @javax.persistence.Basic
  @Column(name="\"target_id\"")
  private String target_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="target_id", insertable=false, updatable=false)
  private java.util.List<GoalTargetModel> target;

  /**
  * Description: "Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"statusDate\"")
  private String statusDate;

  /**
  * Description: "Captures the reason for the current status."
  */
  @javax.persistence.Basic
  @Column(name="\"statusReason\"")
  private String statusReason;

  /**
  * Description: "Indicates whose goal this is - patient goal, practitioner goal, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"expressedby_id\"")
  private String expressedby_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="expressedby_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> expressedBy;

  /**
  * Description: "The identified conditions and other health record elements that are intended to be addressed by the goal."
  */
  @javax.persistence.Basic
  @Column(name="\"addresses_id\"")
  private String addresses_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="addresses_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> addresses;

  /**
  * Description: "Any comments related to the goal."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Identifies the change (or lack of change) at the point when the status of the goal is assessed."
  */
  @javax.persistence.Basic
  @Column(name="\"outcomecode_id\"")
  private String outcomecode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="outcomecode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> outcomeCode;

  /**
  * Description: "Details of what's changed (or not changed)."
  */
  @javax.persistence.Basic
  @Column(name="\"outcomereference_id\"")
  private String outcomereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="outcomereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> outcomeReference;

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

  public GoalModel() {
  }

  public GoalModel(Goal o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModelFromArray(o.getCategory(), this.category_id);
    }
    if (null != o.getPriority() ) {
    	this.priority_id = "priority" + this.id;
    	this.priority = CodeableConceptHelper.toModel(o.getPriority(), this.priority_id);
    }
    if (null != o.getDescription() ) {
    	this.description_id = "description" + this.id;
    	this.description = CodeableConceptHelper.toModel(o.getDescription(), this.description_id);
    }
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    this.startDate = o.getStartDate();
    if (null != o.getStartCodeableConcept() ) {
    	this.startcodeableconcept_id = "startcodeableconcept" + this.id;
    	this.startCodeableConcept = CodeableConceptHelper.toModel(o.getStartCodeableConcept(), this.startcodeableconcept_id);
    }
    if (null != o.getTarget() ) {
    	this.target_id = "target" + this.id;
    	this.target = GoalTargetHelper.toModel(o.getTarget(), this.target_id);
    }
    this.statusDate = o.getStatusDate();
    this.statusReason = o.getStatusReason();
    if (null != o.getExpressedBy() ) {
    	this.expressedby_id = "expressedby" + this.id;
    	this.expressedBy = ReferenceHelper.toModel(o.getExpressedBy(), this.expressedby_id);
    }
    if (null != o.getAddresses() && !o.getAddresses().isEmpty()) {
    	this.addresses_id = "addresses" + this.id;
    	this.addresses = ReferenceHelper.toModelFromArray(o.getAddresses(), this.addresses_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getOutcomeCode() && !o.getOutcomeCode().isEmpty()) {
    	this.outcomecode_id = "outcomecode" + this.id;
    	this.outcomeCode = CodeableConceptHelper.toModelFromArray(o.getOutcomeCode(), this.outcomecode_id);
    }
    if (null != o.getOutcomeReference() && !o.getOutcomeReference().isEmpty()) {
    	this.outcomereference_id = "outcomereference" + this.id;
    	this.outcomeReference = ReferenceHelper.toModelFromArray(o.getOutcomeReference(), this.outcomereference_id);
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
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getPriority() {
    return this.priority;
  }
  public void setPriority( java.util.List<CodeableConceptModel> value) {
    this.priority = value;
  }
  public java.util.List<CodeableConceptModel> getDescription() {
    return this.description;
  }
  public void setDescription( java.util.List<CodeableConceptModel> value) {
    this.description = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public String getStartDate() {
    return this.startDate;
  }
  public void setStartDate( String value) {
    this.startDate = value;
  }
  public java.util.List<CodeableConceptModel> getStartCodeableConcept() {
    return this.startCodeableConcept;
  }
  public void setStartCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.startCodeableConcept = value;
  }
  public java.util.List<GoalTargetModel> getTarget() {
    return this.target;
  }
  public void setTarget( java.util.List<GoalTargetModel> value) {
    this.target = value;
  }
  public String getStatusDate() {
    return this.statusDate;
  }
  public void setStatusDate( String value) {
    this.statusDate = value;
  }
  public String getStatusReason() {
    return this.statusReason;
  }
  public void setStatusReason( String value) {
    this.statusReason = value;
  }
  public java.util.List<ReferenceModel> getExpressedBy() {
    return this.expressedBy;
  }
  public void setExpressedBy( java.util.List<ReferenceModel> value) {
    this.expressedBy = value;
  }
  public java.util.List<ReferenceModel> getAddresses() {
    return this.addresses;
  }
  public void setAddresses( java.util.List<ReferenceModel> value) {
    this.addresses = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<CodeableConceptModel> getOutcomeCode() {
    return this.outcomeCode;
  }
  public void setOutcomeCode( java.util.List<CodeableConceptModel> value) {
    this.outcomeCode = value;
  }
  public java.util.List<ReferenceModel> getOutcomeReference() {
    return this.outcomeReference;
  }
  public void setOutcomeReference( java.util.List<ReferenceModel> value) {
    this.outcomeReference = value;
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
    builder.append("[GoalModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("startDate" + "->" + this.startDate + "\n"); 
     builder.append("statusDate" + "->" + this.statusDate + "\n"); 
     builder.append("statusReason" + "->" + this.statusReason + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
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
    builder.append("[GoalModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("startDate" + "->" + this.startDate + "\n"); 
     builder.append("statusDate" + "->" + this.statusDate + "\n"); 
     builder.append("statusReason" + "->" + this.statusReason + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}