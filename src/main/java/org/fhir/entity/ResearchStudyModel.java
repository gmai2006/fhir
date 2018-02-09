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
* "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
*/
@Entity
@Table(name="researchstudy")
public class ResearchStudyModel  {
  /**
  * Description: "This is a ResearchStudy resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this research study by the sponsor or other systems."
  * Actual type: Array of Identifier-> List<Identifier>
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
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> protocol = new java.util.ArrayList<>();

  /**
  * Description: "A larger research study of which this particular study is a component or step."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf = new java.util.ArrayList<>();

  /**
  * Description: "The current state of the study."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "The condition(s), medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"focus\"", length = 16777215)
  private String focus;

  /**
  * Description: "Contact details to assist a user in learning more about or engaging with the study."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ContactDetailModel> contact = new java.util.ArrayList<>();

  /**
  * Description: "Citations, references and other related documents."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> relatedArtifact = new java.util.ArrayList<>();

  /**
  * Description: "Key terms to aid in searching for or filtering the study."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"keyword\"", length = 16777215)
  private String keyword;

  /**
  * Description: "Indicates a country, state or other region where the study is taking place."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction\"", length = 16777215)
  private String jurisdiction;

  /**
  * Description: "A full description of how the study is being conducted."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. \" 200 female Europeans between the ages of 20 and 45 with early onset diabetes\"."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> enrollment = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the start date and the expected (or actual, depending on status) end date for the study."
  * Actual type: Period
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`sponsor_id`", insertable=false, updatable=false)
  private ReferenceModel sponsor;

  /**
  * Description: "Indicates the individual who has primary oversite of the execution of the study."
  */
  @javax.persistence.Basic
  @Column(name="\"principalinvestigator_id\"")
  private String principalinvestigator_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`principalinvestigator_id`", insertable=false, updatable=false)
  private ReferenceModel principalInvestigator;

  /**
  * Description: "Clinic, hospital or other healthcare location that is participating in the study."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> site = new java.util.ArrayList<>();

  /**
  * Description: "A description and/or code explaining the premature termination of the study."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonStopped\"", length = 16777215)
  private String reasonStopped;

  /**
  * Description: "Comments made about the event by the performer, subject or other participants."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ResearchStudyArmModel> arm = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.title = o.getTitle();

      this.protocol = Reference.toModelArray(o.getProtocol());

      this.partOf = Reference.toModelArray(o.getPartOf());

      this.status = o.getStatus();

      this.category = CodeableConcept.toJson(o.getCategory());
      this.focus = CodeableConcept.toJson(o.getFocus());
      this.contact = ContactDetail.toModelArray(o.getContact());

      this.relatedArtifact = RelatedArtifact.toModelArray(o.getRelatedArtifact());

      this.keyword = CodeableConcept.toJson(o.getKeyword());
      this.jurisdiction = CodeableConcept.toJson(o.getJurisdiction());
      this.description = o.getDescription();

      this.enrollment = Reference.toModelArray(o.getEnrollment());

      this.period = Period.toJson(o.getPeriod());
      if (null != o.getSponsor()) {
      	this.sponsor_id = "sponsor" + this.getId();
        this.sponsor = new ReferenceModel(o.getSponsor());
        this.sponsor.setId(this.sponsor_id);
        this.sponsor.parent_id = this.sponsor.getId();
      }

      if (null != o.getPrincipalInvestigator()) {
      	this.principalinvestigator_id = "principalInvestigator" + this.getId();
        this.principalInvestigator = new ReferenceModel(o.getPrincipalInvestigator());
        this.principalInvestigator.setId(this.principalinvestigator_id);
        this.principalInvestigator.parent_id = this.principalInvestigator.getId();
      }

      this.site = Reference.toModelArray(o.getSite());

      this.reasonStopped = CodeableConcept.toJson(o.getReasonStopped());
      this.note = Annotation.toJson(o.getNote());
      this.arm = ResearchStudyArm.toModelArray(o.getArm());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setProtocol( java.util.List<ReferenceModel> value) {
    this.protocol = value;
  }
  public java.util.List<ReferenceModel> getProtocol() {
    return this.protocol;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setFocus( String value) {
    this.focus = value;
  }
  public String getFocus() {
    return this.focus;
  }
  public void setContact( java.util.List<ContactDetailModel> value) {
    this.contact = value;
  }
  public java.util.List<ContactDetailModel> getContact() {
    return this.contact;
  }
  public void setRelatedArtifact( java.util.List<RelatedArtifactModel> value) {
    this.relatedArtifact = value;
  }
  public java.util.List<RelatedArtifactModel> getRelatedArtifact() {
    return this.relatedArtifact;
  }
  public void setKeyword( String value) {
    this.keyword = value;
  }
  public String getKeyword() {
    return this.keyword;
  }
  public void setJurisdiction( String value) {
    this.jurisdiction = value;
  }
  public String getJurisdiction() {
    return this.jurisdiction;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setEnrollment( java.util.List<ReferenceModel> value) {
    this.enrollment = value;
  }
  public java.util.List<ReferenceModel> getEnrollment() {
    return this.enrollment;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setSponsor( ReferenceModel value) {
    this.sponsor = value;
  }
  public ReferenceModel getSponsor() {
    return this.sponsor;
  }
  public void setPrincipalInvestigator( ReferenceModel value) {
    this.principalInvestigator = value;
  }
  public ReferenceModel getPrincipalInvestigator() {
    return this.principalInvestigator;
  }
  public void setSite( java.util.List<ReferenceModel> value) {
    this.site = value;
  }
  public java.util.List<ReferenceModel> getSite() {
    return this.site;
  }
  public void setReasonStopped( String value) {
    this.reasonStopped = value;
  }
  public String getReasonStopped() {
    return this.reasonStopped;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setArm( java.util.List<ResearchStudyArmModel> value) {
    this.arm = value;
  }
  public java.util.List<ResearchStudyArmModel> getArm() {
    return this.arm;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
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
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("protocol" + "[" + String.valueOf(this.protocol) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("focus" + "[" + String.valueOf(this.focus) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("relatedArtifact" + "[" + String.valueOf(this.relatedArtifact) + "]\n"); 
     builder.append("keyword" + "[" + String.valueOf(this.keyword) + "]\n"); 
     builder.append("jurisdiction" + "[" + String.valueOf(this.jurisdiction) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("enrollment" + "[" + String.valueOf(this.enrollment) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("sponsor" + "[" + String.valueOf(this.sponsor) + "]\n"); 
     builder.append("principalInvestigator" + "[" + String.valueOf(this.principalInvestigator) + "]\n"); 
     builder.append("site" + "[" + String.valueOf(this.site) + "]\n"); 
     builder.append("reasonStopped" + "[" + String.valueOf(this.reasonStopped) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("arm" + "[" + String.valueOf(this.arm) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}