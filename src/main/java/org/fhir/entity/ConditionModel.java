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
/**
* "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
*/
@Entity
@Table(name="fhircondition")
public class ConditionModel  implements Serializable {
	private static final long serialVersionUID = 151857669667929499L;
  /**
  * Description: "This is a Condition resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  * Actual type: List<String>;
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
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "A subjective assessment of the severity of the condition as evaluated by the clinician."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"severity\"", length = 16777215)
  private String severity;

  /**
  * Description: "Identification of the condition, problem or diagnosis."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "The anatomical location where this condition manifests itself."
  * Actual type: List<String>;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "Encounter during which the condition was first asserted."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"onsetDateTime\"")
  private String onsetDateTime;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetAge\"", length = 16777215)
  private String onsetAge;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetPeriod\"", length = 16777215)
  private String onsetPeriod;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  * Actual type: String;
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
  * Actual type: String;
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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"abatementPeriod\"", length = 16777215)
  private String abatementPeriod;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="asserter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> asserter;

  /**
  * Description: "Clinical stage or grade of a condition. May include formal severity assessments."
  */
  @javax.persistence.Basic
  @Column(name="\"stage_id\"")
  private String stage_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="stage_id", insertable=false, updatable=false)
  private java.util.List<ConditionStageModel> stage;

  /**
  * Description: "Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed."
  */
  @javax.persistence.Basic
  @Column(name="\"evidence_id\"")
  private String evidence_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="evidence_id", insertable=false, updatable=false)
  private java.util.List<ConditionEvidenceModel> evidence;

  /**
  * Description: "Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis."
  * Actual type: List<String>;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public ConditionModel() {
  }

  public ConditionModel(Condition o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.clinicalStatus = o.getClinicalStatus();
    this.verificationStatus = o.getVerificationStatus();
    this.severity = CodeableConceptHelper.toJson(o.getSeverity());
    this.code = CodeableConceptHelper.toJson(o.getCode());
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    this.onsetDateTime = o.getOnsetDateTime();
    this.onsetAge = AgeHelper.toJson(o.getOnsetAge());
    this.onsetPeriod = PeriodHelper.toJson(o.getOnsetPeriod());
    this.onsetRange = RangeHelper.toJson(o.getOnsetRange());
    this.onsetString = o.getOnsetString();
    this.abatementDateTime = o.getAbatementDateTime();
    this.abatementAge = AgeHelper.toJson(o.getAbatementAge());
    this.abatementBoolean = o.getAbatementBoolean();
    this.abatementPeriod = PeriodHelper.toJson(o.getAbatementPeriod());
    this.abatementRange = RangeHelper.toJson(o.getAbatementRange());
    this.abatementString = o.getAbatementString();
    this.assertedDate = o.getAssertedDate();
    if (null != o.getAsserter() ) {
    	this.asserter_id = "asserter" + this.id;
    	this.asserter = ReferenceHelper.toModel(o.getAsserter(), this.asserter_id);
    }
    if (null != o.getStage() ) {
    	this.stage_id = "stage" + this.id;
    	this.stage = ConditionStageHelper.toModel(o.getStage(), this.stage_id);
    }
    if (null != o.getEvidence() && !o.getEvidence().isEmpty()) {
    	this.evidence_id = "evidence" + this.id;
    	this.evidence = ConditionEvidenceHelper.toModelFromArray(o.getEvidence(), this.evidence_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
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
  public String getClinicalStatus() {
    return this.clinicalStatus;
  }
  public void setClinicalStatus( String value) {
    this.clinicalStatus = value;
  }
  public String getVerificationStatus() {
    return this.verificationStatus;
  }
  public void setVerificationStatus( String value) {
    this.verificationStatus = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getSeverity() {
    return this.severity;
  }
  public void setSeverity( String value) {
    this.severity = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getBodySite() {
    return this.bodySite;
  }
  public void setBodySite( String value) {
    this.bodySite = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public String getOnsetDateTime() {
    return this.onsetDateTime;
  }
  public void setOnsetDateTime( String value) {
    this.onsetDateTime = value;
  }
  public String getOnsetAge() {
    return this.onsetAge;
  }
  public void setOnsetAge( String value) {
    this.onsetAge = value;
  }
  public String getOnsetPeriod() {
    return this.onsetPeriod;
  }
  public void setOnsetPeriod( String value) {
    this.onsetPeriod = value;
  }
  public String getOnsetRange() {
    return this.onsetRange;
  }
  public void setOnsetRange( String value) {
    this.onsetRange = value;
  }
  public String getOnsetString() {
    return this.onsetString;
  }
  public void setOnsetString( String value) {
    this.onsetString = value;
  }
  public String getAbatementDateTime() {
    return this.abatementDateTime;
  }
  public void setAbatementDateTime( String value) {
    this.abatementDateTime = value;
  }
  public String getAbatementAge() {
    return this.abatementAge;
  }
  public void setAbatementAge( String value) {
    this.abatementAge = value;
  }
  public Boolean getAbatementBoolean() {
    return this.abatementBoolean;
  }
  public void setAbatementBoolean( Boolean value) {
    this.abatementBoolean = value;
  }
  public String getAbatementPeriod() {
    return this.abatementPeriod;
  }
  public void setAbatementPeriod( String value) {
    this.abatementPeriod = value;
  }
  public String getAbatementRange() {
    return this.abatementRange;
  }
  public void setAbatementRange( String value) {
    this.abatementRange = value;
  }
  public String getAbatementString() {
    return this.abatementString;
  }
  public void setAbatementString( String value) {
    this.abatementString = value;
  }
  public String getAssertedDate() {
    return this.assertedDate;
  }
  public void setAssertedDate( String value) {
    this.assertedDate = value;
  }
  public java.util.List<ReferenceModel> getAsserter() {
    return this.asserter;
  }
  public void setAsserter( java.util.List<ReferenceModel> value) {
    this.asserter = value;
  }
  public java.util.List<ConditionStageModel> getStage() {
    return this.stage;
  }
  public void setStage( java.util.List<ConditionStageModel> value) {
    this.stage = value;
  }
  public java.util.List<ConditionEvidenceModel> getEvidence() {
    return this.evidence;
  }
  public void setEvidence( java.util.List<ConditionEvidenceModel> value) {
    this.evidence = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
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
    builder.append("[ConditionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("clinicalStatus" + "->" + this.clinicalStatus + "\n"); 
     builder.append("verificationStatus" + "->" + this.verificationStatus + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("severity" + "->" + this.severity + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("bodySite" + "->" + this.bodySite + "\n"); 
     builder.append("onsetDateTime" + "->" + this.onsetDateTime + "\n"); 
     builder.append("onsetAge" + "->" + this.onsetAge + "\n"); 
     builder.append("onsetPeriod" + "->" + this.onsetPeriod + "\n"); 
     builder.append("onsetRange" + "->" + this.onsetRange + "\n"); 
     builder.append("onsetString" + "->" + this.onsetString + "\n"); 
     builder.append("abatementDateTime" + "->" + this.abatementDateTime + "\n"); 
     builder.append("abatementAge" + "->" + this.abatementAge + "\n"); 
     builder.append("abatementBoolean" + "->" + this.abatementBoolean + "\n"); 
     builder.append("abatementPeriod" + "->" + this.abatementPeriod + "\n"); 
     builder.append("abatementRange" + "->" + this.abatementRange + "\n"); 
     builder.append("abatementString" + "->" + this.abatementString + "\n"); 
     builder.append("assertedDate" + "->" + this.assertedDate + "\n"); 
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
    builder.append("[ConditionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("clinicalStatus" + "->" + this.clinicalStatus + "\n"); 
     builder.append("verificationStatus" + "->" + this.verificationStatus + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("severity" + "->" + this.severity + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("bodySite" + "->" + this.bodySite + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("onsetDateTime" + "->" + this.onsetDateTime + "\n"); 
     builder.append("onsetAge" + "->" + this.onsetAge + "\n"); 
     builder.append("onsetPeriod" + "->" + this.onsetPeriod + "\n"); 
     builder.append("onsetRange" + "->" + this.onsetRange + "\n"); 
     builder.append("onsetString" + "->" + this.onsetString + "\n"); 
     builder.append("abatementDateTime" + "->" + this.abatementDateTime + "\n"); 
     builder.append("abatementAge" + "->" + this.abatementAge + "\n"); 
     builder.append("abatementBoolean" + "->" + this.abatementBoolean + "\n"); 
     builder.append("abatementPeriod" + "->" + this.abatementPeriod + "\n"); 
     builder.append("abatementRange" + "->" + this.abatementRange + "\n"); 
     builder.append("abatementString" + "->" + this.abatementString + "\n"); 
     builder.append("assertedDate" + "->" + this.assertedDate + "\n"); 
     builder.append("asserter" + "->" + this.asserter + "\n"); 
     builder.append("stage" + "->" + this.stage + "\n"); 
     builder.append("evidence" + "->" + this.evidence + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}