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
* "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
* generated on 07/14/2018
*/
@Entity
@Table(name="researchstudy")
public class ResearchStudyModel  implements Serializable {
	private static final long serialVersionUID = 153159210220488578L;
  /**
  * Description: "This is a ResearchStudy resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this research study by the sponsor or other systems."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A short, descriptive user-friendly label for the study."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "The set of steps expected to be performed as part of the execution of the study."
  */
  @javax.persistence.Basic
  @Column(name="\"protocol_id\"")
  private String protocol_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="protocol_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> protocol;

  /**
  * Description: "A larger research study of which this particular study is a component or step."
  */
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="partof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf;

  /**
  * Description: "The current state of the study."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "The condition(s), medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about."
  */
  @javax.persistence.Basic
  @Column(name="\"focus_id\"")
  private String focus_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="focus_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> focus;

  /**
  * Description: "Contact details to assist a user in learning more about or engaging with the study."
  */
  @javax.persistence.Basic
  @Column(name="\"contact_id\"")
  private String contact_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="contact_id", insertable=false, updatable=false)
  private java.util.List<ContactDetailModel> contact;

  /**
  * Description: "Citations, references and other related documents."
  */
  @javax.persistence.Basic
  @Column(name="\"relatedartifact_id\"")
  private String relatedartifact_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="relatedartifact_id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> relatedArtifact;

  /**
  * Description: "Key terms to aid in searching for or filtering the study."
  */
  @javax.persistence.Basic
  @Column(name="\"keyword_id\"")
  private String keyword_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="keyword_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> keyword;

  /**
  * Description: "Indicates a country, state or other region where the study is taking place."
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction_id\"")
  private String jurisdiction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="jurisdiction_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> jurisdiction;

  /**
  * Description: "A full description of how the study is being conducted."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. \" 200 female Europeans between the ages of 20 and 45 with early onset diabetes\"."
  */
  @javax.persistence.Basic
  @Column(name="\"enrollment_id\"")
  private String enrollment_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="enrollment_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> enrollment;

  /**
  * Description: "Identifies the start date and the expected (or actual, depending on status) end date for the study."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "The organization responsible for the execution of the study."
  */
  @javax.persistence.Basic
  @Column(name="\"sponsor_id\"")
  private String sponsor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="sponsor_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> sponsor;

  /**
  * Description: "Indicates the individual who has primary oversite of the execution of the study."
  */
  @javax.persistence.Basic
  @Column(name="\"principalinvestigator_id\"")
  private String principalinvestigator_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="principalinvestigator_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> principalInvestigator;

  /**
  * Description: "Clinic, hospital or other healthcare location that is participating in the study."
  */
  @javax.persistence.Basic
  @Column(name="\"site_id\"")
  private String site_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="site_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> site;

  /**
  * Description: "A description and/or code explaining the premature termination of the study."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonstopped_id\"")
  private String reasonstopped_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reasonstopped_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reasonStopped;

  /**
  * Description: "Comments made about the event by the performer, subject or other participants."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up."
  */
  @javax.persistence.Basic
  @Column(name="\"arm_id\"")
  private String arm_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="arm_id", insertable=false, updatable=false)
  private java.util.List<ResearchStudyArmModel> arm;

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

  public ResearchStudyModel() {
  }

  public ResearchStudyModel(ResearchStudy o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.title = o.getTitle();
    if (null != o.getProtocol() && !o.getProtocol().isEmpty()) {
    	this.protocol_id = "protocol" + this.id;
    	this.protocol = ReferenceHelper.toModelFromArray(o.getProtocol(), this.protocol_id);
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partof_id = "partof" + this.id;
    	this.partOf = ReferenceHelper.toModelFromArray(o.getPartOf(), this.partof_id);
    }
    this.status = o.getStatus();
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModelFromArray(o.getCategory(), this.category_id);
    }
    if (null != o.getFocus() && !o.getFocus().isEmpty()) {
    	this.focus_id = "focus" + this.id;
    	this.focus = CodeableConceptHelper.toModelFromArray(o.getFocus(), this.focus_id);
    }
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact_id = "contact" + this.id;
    	this.contact = ContactDetailHelper.toModelFromArray(o.getContact(), this.contact_id);
    }
    if (null != o.getRelatedArtifact() && !o.getRelatedArtifact().isEmpty()) {
    	this.relatedartifact_id = "relatedartifact" + this.id;
    	this.relatedArtifact = RelatedArtifactHelper.toModelFromArray(o.getRelatedArtifact(), this.relatedartifact_id);
    }
    if (null != o.getKeyword() && !o.getKeyword().isEmpty()) {
    	this.keyword_id = "keyword" + this.id;
    	this.keyword = CodeableConceptHelper.toModelFromArray(o.getKeyword(), this.keyword_id);
    }
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction_id = "jurisdiction" + this.id;
    	this.jurisdiction = CodeableConceptHelper.toModelFromArray(o.getJurisdiction(), this.jurisdiction_id);
    }
    this.description = o.getDescription();
    if (null != o.getEnrollment() && !o.getEnrollment().isEmpty()) {
    	this.enrollment_id = "enrollment" + this.id;
    	this.enrollment = ReferenceHelper.toModelFromArray(o.getEnrollment(), this.enrollment_id);
    }
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getSponsor() ) {
    	this.sponsor_id = "sponsor" + this.id;
    	this.sponsor = ReferenceHelper.toModel(o.getSponsor(), this.sponsor_id);
    }
    if (null != o.getPrincipalInvestigator() ) {
    	this.principalinvestigator_id = "principalinvestigator" + this.id;
    	this.principalInvestigator = ReferenceHelper.toModel(o.getPrincipalInvestigator(), this.principalinvestigator_id);
    }
    if (null != o.getSite() && !o.getSite().isEmpty()) {
    	this.site_id = "site" + this.id;
    	this.site = ReferenceHelper.toModelFromArray(o.getSite(), this.site_id);
    }
    if (null != o.getReasonStopped() ) {
    	this.reasonstopped_id = "reasonstopped" + this.id;
    	this.reasonStopped = CodeableConceptHelper.toModel(o.getReasonStopped(), this.reasonstopped_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getArm() && !o.getArm().isEmpty()) {
    	this.arm_id = "arm" + this.id;
    	this.arm = ResearchStudyArmHelper.toModelFromArray(o.getArm(), this.arm_id);
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
  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public java.util.List<ReferenceModel> getProtocol() {
    return this.protocol;
  }
  public void setProtocol( java.util.List<ReferenceModel> value) {
    this.protocol = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
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
  public java.util.List<CodeableConceptModel> getFocus() {
    return this.focus;
  }
  public void setFocus( java.util.List<CodeableConceptModel> value) {
    this.focus = value;
  }
  public java.util.List<ContactDetailModel> getContact() {
    return this.contact;
  }
  public void setContact( java.util.List<ContactDetailModel> value) {
    this.contact = value;
  }
  public java.util.List<RelatedArtifactModel> getRelatedArtifact() {
    return this.relatedArtifact;
  }
  public void setRelatedArtifact( java.util.List<RelatedArtifactModel> value) {
    this.relatedArtifact = value;
  }
  public java.util.List<CodeableConceptModel> getKeyword() {
    return this.keyword;
  }
  public void setKeyword( java.util.List<CodeableConceptModel> value) {
    this.keyword = value;
  }
  public java.util.List<CodeableConceptModel> getJurisdiction() {
    return this.jurisdiction;
  }
  public void setJurisdiction( java.util.List<CodeableConceptModel> value) {
    this.jurisdiction = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<ReferenceModel> getEnrollment() {
    return this.enrollment;
  }
  public void setEnrollment( java.util.List<ReferenceModel> value) {
    this.enrollment = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public java.util.List<ReferenceModel> getSponsor() {
    return this.sponsor;
  }
  public void setSponsor( java.util.List<ReferenceModel> value) {
    this.sponsor = value;
  }
  public java.util.List<ReferenceModel> getPrincipalInvestigator() {
    return this.principalInvestigator;
  }
  public void setPrincipalInvestigator( java.util.List<ReferenceModel> value) {
    this.principalInvestigator = value;
  }
  public java.util.List<ReferenceModel> getSite() {
    return this.site;
  }
  public void setSite( java.util.List<ReferenceModel> value) {
    this.site = value;
  }
  public java.util.List<CodeableConceptModel> getReasonStopped() {
    return this.reasonStopped;
  }
  public void setReasonStopped( java.util.List<CodeableConceptModel> value) {
    this.reasonStopped = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<ResearchStudyArmModel> getArm() {
    return this.arm;
  }
  public void setArm( java.util.List<ResearchStudyArmModel> value) {
    this.arm = value;
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
    builder.append("[ResearchStudyModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
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
    builder.append("[ResearchStudyModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
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