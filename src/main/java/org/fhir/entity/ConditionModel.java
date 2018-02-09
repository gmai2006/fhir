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
* "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
*/
@Entity
@Table(name="fhircondition")
public class ConditionModel  {
  /**
  * Description: "This is a Condition resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The clinical status of the condition."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"clinicalStatus\"")
  private String clinicalStatus;

  /**
  * Description: "The verification status to support the clinical status of the condition."
  */
  @javax.persistence.Basic
  @Column(name="\"verificationStatus\"")
  private String verificationStatus;

  /**
  * Description: "A category assigned to the condition."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "A subjective assessment of the severity of the condition as evaluated by the clinician."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"severity\"", length = 16777215)
  private String severity;

  /**
  * Description: "Identification of the condition, problem or diagnosis."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "The anatomical location where this condition manifests itself."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bodySite\"", length = 16777215)
  private String bodySite;

  /**
  * Description: "Indicates the patient or group who the condition record is associated with."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "Encounter during which the condition was first asserted."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"onsetDateTime\"")
  private String onsetDateTime;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  * Actual type: Age
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetAge\"", length = 16777215)
  private String onsetAge;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetPeriod\"", length = 16777215)
  private String onsetPeriod;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetRange\"", length = 16777215)
  private String onsetRange;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  */
  @javax.persistence.Basic
  @Column(name="\"onsetString\"")
  private String onsetString;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"abatementDateTime\"")
  private String abatementDateTime;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  * Actual type: Age
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"abatementAge\"", length = 16777215)
  private String abatementAge;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  @javax.persistence.Basic
  @Column(name="\"abatementBoolean\"")
  private Boolean abatementBoolean;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"abatementPeriod\"", length = 16777215)
  private String abatementPeriod;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"abatementRange\"", length = 16777215)
  private String abatementRange;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  @javax.persistence.Basic
  @Column(name="\"abatementString\"")
  private String abatementString;

  /**
  * Description: "The date on which the existance of the Condition was first asserted or acknowledged."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"assertedDate\"")
  private String assertedDate;

  /**
  * Description: "Individual who is making the condition statement."
  */
  @javax.persistence.Basic
  @Column(name="\"asserter_id\"")
  private String asserter_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`asserter_id`", insertable=false, updatable=false)
  private ReferenceModel asserter;

  /**
  * Description: "Clinical stage or grade of a condition. May include formal severity assessments."
  */
  @javax.persistence.Basic
  @Column(name="\"stage_id\"")
  private String stage_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`stage_id`", insertable=false, updatable=false)
  private ConditionStageModel stage;

  /**
  * Description: "Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ConditionEvidenceModel> evidence = new java.util.ArrayList<>();

  /**
  * Description: "Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

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


  public ConditionModel() {
  }

  public ConditionModel(Condition o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.clinicalStatus = o.getClinicalStatus();

      this.verificationStatus = o.getVerificationStatus();

      this.category = CodeableConcept.toJson(o.getCategory());
      this.severity = CodeableConcept.toJson(o.getSeverity());
      this.code = CodeableConcept.toJson(o.getCode());
      this.bodySite = CodeableConcept.toJson(o.getBodySite());
      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      if (null != o.getContext()) {
      	this.context_id = "context" + this.getId();
        this.context = new ReferenceModel(o.getContext());
        this.context.setId(this.context_id);
        this.context.parent_id = this.context.getId();
      }

      this.onsetDateTime = o.getOnsetDateTime();

      this.onsetAge = Age.toJson(o.getOnsetAge());
      this.onsetPeriod = Period.toJson(o.getOnsetPeriod());
      this.onsetRange = Range.toJson(o.getOnsetRange());
      this.onsetString = o.getOnsetString();

      this.abatementDateTime = o.getAbatementDateTime();

      this.abatementAge = Age.toJson(o.getAbatementAge());
      this.abatementBoolean = o.getAbatementBoolean();

      this.abatementPeriod = Period.toJson(o.getAbatementPeriod());
      this.abatementRange = Range.toJson(o.getAbatementRange());
      this.abatementString = o.getAbatementString();

      this.assertedDate = o.getAssertedDate();

      if (null != o.getAsserter()) {
      	this.asserter_id = "asserter" + this.getId();
        this.asserter = new ReferenceModel(o.getAsserter());
        this.asserter.setId(this.asserter_id);
        this.asserter.parent_id = this.asserter.getId();
      }

      if (null != o.getStage()) {
      	this.stage_id = "stage" + this.getId();
        this.stage = new ConditionStageModel(o.getStage());
        this.stage.setId(this.stage_id);
        this.stage.parent_id = this.stage.getId();
      }

      this.evidence = ConditionEvidence.toModelArray(o.getEvidence());

      this.note = Annotation.toJson(o.getNote());
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
  public void setClinicalStatus( String value) {
    this.clinicalStatus = value;
  }
  public String getClinicalStatus() {
    return this.clinicalStatus;
  }
  public void setVerificationStatus( String value) {
    this.verificationStatus = value;
  }
  public String getVerificationStatus() {
    return this.verificationStatus;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setSeverity( String value) {
    this.severity = value;
  }
  public String getSeverity() {
    return this.severity;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setBodySite( String value) {
    this.bodySite = value;
  }
  public String getBodySite() {
    return this.bodySite;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setContext( ReferenceModel value) {
    this.context = value;
  }
  public ReferenceModel getContext() {
    return this.context;
  }
  public void setOnsetDateTime( String value) {
    this.onsetDateTime = value;
  }
  public String getOnsetDateTime() {
    return this.onsetDateTime;
  }
  public void setOnsetAge( String value) {
    this.onsetAge = value;
  }
  public String getOnsetAge() {
    return this.onsetAge;
  }
  public void setOnsetPeriod( String value) {
    this.onsetPeriod = value;
  }
  public String getOnsetPeriod() {
    return this.onsetPeriod;
  }
  public void setOnsetRange( String value) {
    this.onsetRange = value;
  }
  public String getOnsetRange() {
    return this.onsetRange;
  }
  public void setOnsetString( String value) {
    this.onsetString = value;
  }
  public String getOnsetString() {
    return this.onsetString;
  }
  public void setAbatementDateTime( String value) {
    this.abatementDateTime = value;
  }
  public String getAbatementDateTime() {
    return this.abatementDateTime;
  }
  public void setAbatementAge( String value) {
    this.abatementAge = value;
  }
  public String getAbatementAge() {
    return this.abatementAge;
  }
  public void setAbatementBoolean( Boolean value) {
    this.abatementBoolean = value;
  }
  public Boolean getAbatementBoolean() {
    return this.abatementBoolean;
  }
  public void setAbatementPeriod( String value) {
    this.abatementPeriod = value;
  }
  public String getAbatementPeriod() {
    return this.abatementPeriod;
  }
  public void setAbatementRange( String value) {
    this.abatementRange = value;
  }
  public String getAbatementRange() {
    return this.abatementRange;
  }
  public void setAbatementString( String value) {
    this.abatementString = value;
  }
  public String getAbatementString() {
    return this.abatementString;
  }
  public void setAssertedDate( String value) {
    this.assertedDate = value;
  }
  public String getAssertedDate() {
    return this.assertedDate;
  }
  public void setAsserter( ReferenceModel value) {
    this.asserter = value;
  }
  public ReferenceModel getAsserter() {
    return this.asserter;
  }
  public void setStage( ConditionStageModel value) {
    this.stage = value;
  }
  public ConditionStageModel getStage() {
    return this.stage;
  }
  public void setEvidence( java.util.List<ConditionEvidenceModel> value) {
    this.evidence = value;
  }
  public java.util.List<ConditionEvidenceModel> getEvidence() {
    return this.evidence;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
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
     builder.append("clinicalStatus" + "[" + String.valueOf(this.clinicalStatus) + "]\n"); 
     builder.append("verificationStatus" + "[" + String.valueOf(this.verificationStatus) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("severity" + "[" + String.valueOf(this.severity) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("onsetDateTime" + "[" + String.valueOf(this.onsetDateTime) + "]\n"); 
     builder.append("onsetAge" + "[" + String.valueOf(this.onsetAge) + "]\n"); 
     builder.append("onsetPeriod" + "[" + String.valueOf(this.onsetPeriod) + "]\n"); 
     builder.append("onsetRange" + "[" + String.valueOf(this.onsetRange) + "]\n"); 
     builder.append("onsetString" + "[" + String.valueOf(this.onsetString) + "]\n"); 
     builder.append("abatementDateTime" + "[" + String.valueOf(this.abatementDateTime) + "]\n"); 
     builder.append("abatementAge" + "[" + String.valueOf(this.abatementAge) + "]\n"); 
     builder.append("abatementBoolean" + "[" + String.valueOf(this.abatementBoolean) + "]\n"); 
     builder.append("abatementPeriod" + "[" + String.valueOf(this.abatementPeriod) + "]\n"); 
     builder.append("abatementRange" + "[" + String.valueOf(this.abatementRange) + "]\n"); 
     builder.append("abatementString" + "[" + String.valueOf(this.abatementString) + "]\n"); 
     builder.append("assertedDate" + "[" + String.valueOf(this.assertedDate) + "]\n"); 
     builder.append("asserter" + "[" + String.valueOf(this.asserter) + "]\n"); 
     builder.append("stage" + "[" + String.valueOf(this.stage) + "]\n"); 
     builder.append("evidence" + "[" + String.valueOf(this.evidence) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
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