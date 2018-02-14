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
import org.fhir.entity.ConditionModel;
import com.google.gson.GsonBuilder;

/**
* "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
*/
public class Condition  {
  /**
  * Description: "This is a Condition resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The clinical status of the condition."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String clinicalStatus;

  /**
  * Description: "Extensions for clinicalStatus"
  */
  private transient Element _clinicalStatus;

  /**
  * Description: "The verification status to support the clinical status of the condition."
  */
  private String verificationStatus;

  /**
  * Description: "Extensions for verificationStatus"
  */
  private transient Element _verificationStatus;

  /**
  * Description: "A category assigned to the condition."
  */
  private java.util.List<CodeableConcept> category = new java.util.ArrayList<>();

  /**
  * Description: "A subjective assessment of the severity of the condition as evaluated by the clinician."
  */
  private CodeableConcept severity;

  /**
  * Description: "Identification of the condition, problem or diagnosis."
  */
  private CodeableConcept code;

  /**
  * Description: "The anatomical location where this condition manifests itself."
  */
  private java.util.List<CodeableConcept> bodySite = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the patient or group who the condition record is associated with."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "Encounter during which the condition was first asserted."
  */
  private Reference context;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String onsetDateTime;

  /**
  * Description: "Extensions for onsetDateTime"
  */
  private transient Element _onsetDateTime;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  */
  private Age onsetAge;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  */
  private Period onsetPeriod;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  */
  private Range onsetRange;

  /**
  * Description: "Estimated or actual date or date-time  the condition began, in the opinion of the clinician."
  */
  private String onsetString;

  /**
  * Description: "Extensions for onsetString"
  */
  private transient Element _onsetString;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String abatementDateTime;

  /**
  * Description: "Extensions for abatementDateTime"
  */
  private transient Element _abatementDateTime;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  private Age abatementAge;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  private Boolean abatementBoolean;

  /**
  * Description: "Extensions for abatementBoolean"
  */
  private transient Element _abatementBoolean;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  private Period abatementPeriod;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  private Range abatementRange;

  /**
  * Description: "The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
  */
  private String abatementString;

  /**
  * Description: "Extensions for abatementString"
  */
  private transient Element _abatementString;

  /**
  * Description: "The date on which the existance of the Condition was first asserted or acknowledged."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String assertedDate;

  /**
  * Description: "Extensions for assertedDate"
  */
  private transient Element _assertedDate;

  /**
  * Description: "Individual who is making the condition statement."
  */
  private Reference asserter;

  /**
  * Description: "Clinical stage or grade of a condition. May include formal severity assessments."
  */
  private ConditionStage stage;

  /**
  * Description: "Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed."
  */
  private java.util.List<ConditionEvidence> evidence = new java.util.ArrayList<>();

  /**
  * Description: "Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public Condition() {
  }

  public Condition(ConditionModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getClinicalStatus()) {
      this.clinicalStatus = o.getClinicalStatus();
    }
    if (null != o.getVerificationStatus()) {
      this.verificationStatus = o.getVerificationStatus();
    }
    this.severity = CodeableConceptHelper.fromJson(o.getSeverity());
    this.code = CodeableConceptHelper.fromJson(o.getCode());
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getOnsetDateTime()) {
      this.onsetDateTime = o.getOnsetDateTime();
    }
    this.onsetAge = AgeHelper.fromJson(o.getOnsetAge());
    this.onsetPeriod = PeriodHelper.fromJson(o.getOnsetPeriod());
    this.onsetRange = RangeHelper.fromJson(o.getOnsetRange());
    if (null != o.getOnsetString()) {
      this.onsetString = o.getOnsetString();
    }
    if (null != o.getAbatementDateTime()) {
      this.abatementDateTime = o.getAbatementDateTime();
    }
    this.abatementAge = AgeHelper.fromJson(o.getAbatementAge());
    if (null != o.getAbatementBoolean()) {
      this.abatementBoolean = o.getAbatementBoolean();
    }
    this.abatementPeriod = PeriodHelper.fromJson(o.getAbatementPeriod());
    this.abatementRange = RangeHelper.fromJson(o.getAbatementRange());
    if (null != o.getAbatementString()) {
      this.abatementString = o.getAbatementString();
    }
    if (null != o.getAssertedDate()) {
      this.assertedDate = o.getAssertedDate();
    }
    if (null != o.getAsserter() && !o.getAsserter().isEmpty()) {
      this.asserter = new Reference(o.getAsserter().get(0));
    }
    if (null != o.getStage() && !o.getStage().isEmpty()) {
      this.stage = new ConditionStage(o.getStage().get(0));
    }
    if (null != o.getEvidence() && !o.getEvidence().isEmpty()) {
    	this.evidence = ConditionEvidenceHelper.fromArray2Array(o.getEvidence());
    }
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setClinicalStatus( String value) {
    this.clinicalStatus = value;
  }
  public String getClinicalStatus() {
    return this.clinicalStatus;
  }
  public void set_clinicalStatus( Element value) {
    this._clinicalStatus = value;
  }
  public Element get_clinicalStatus() {
    return this._clinicalStatus;
  }
  public void setVerificationStatus( String value) {
    this.verificationStatus = VerificationStatusEnum.fromCode(value);
  }
  public String getVerificationStatus() {
    return this.verificationStatus;
  }
  public void set_verificationStatus( Element value) {
    this._verificationStatus = value;
  }
  public Element get_verificationStatus() {
    return this._verificationStatus;
  }
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
  }
  public void setSeverity( CodeableConcept value) {
    this.severity = value;
  }
  public CodeableConcept getSeverity() {
    return this.severity;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setBodySite( java.util.List<CodeableConcept> value) {
    this.bodySite = value;
  }
  public java.util.List<CodeableConcept> getBodySite() {
    return this.bodySite;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setOnsetDateTime( String value) {
    this.onsetDateTime = value;
  }
  public String getOnsetDateTime() {
    return this.onsetDateTime;
  }
  public void set_onsetDateTime( Element value) {
    this._onsetDateTime = value;
  }
  public Element get_onsetDateTime() {
    return this._onsetDateTime;
  }
  public void setOnsetAge( Age value) {
    this.onsetAge = value;
  }
  public Age getOnsetAge() {
    return this.onsetAge;
  }
  public void setOnsetPeriod( Period value) {
    this.onsetPeriod = value;
  }
  public Period getOnsetPeriod() {
    return this.onsetPeriod;
  }
  public void setOnsetRange( Range value) {
    this.onsetRange = value;
  }
  public Range getOnsetRange() {
    return this.onsetRange;
  }
  public void setOnsetString( String value) {
    this.onsetString = value;
  }
  public String getOnsetString() {
    return this.onsetString;
  }
  public void set_onsetString( Element value) {
    this._onsetString = value;
  }
  public Element get_onsetString() {
    return this._onsetString;
  }
  public void setAbatementDateTime( String value) {
    this.abatementDateTime = value;
  }
  public String getAbatementDateTime() {
    return this.abatementDateTime;
  }
  public void set_abatementDateTime( Element value) {
    this._abatementDateTime = value;
  }
  public Element get_abatementDateTime() {
    return this._abatementDateTime;
  }
  public void setAbatementAge( Age value) {
    this.abatementAge = value;
  }
  public Age getAbatementAge() {
    return this.abatementAge;
  }
  public void setAbatementBoolean( Boolean value) {
    this.abatementBoolean = value;
  }
  public Boolean getAbatementBoolean() {
    return this.abatementBoolean;
  }
  public void set_abatementBoolean( Element value) {
    this._abatementBoolean = value;
  }
  public Element get_abatementBoolean() {
    return this._abatementBoolean;
  }
  public void setAbatementPeriod( Period value) {
    this.abatementPeriod = value;
  }
  public Period getAbatementPeriod() {
    return this.abatementPeriod;
  }
  public void setAbatementRange( Range value) {
    this.abatementRange = value;
  }
  public Range getAbatementRange() {
    return this.abatementRange;
  }
  public void setAbatementString( String value) {
    this.abatementString = value;
  }
  public String getAbatementString() {
    return this.abatementString;
  }
  public void set_abatementString( Element value) {
    this._abatementString = value;
  }
  public Element get_abatementString() {
    return this._abatementString;
  }
  public void setAssertedDate( String value) {
    this.assertedDate = value;
  }
  public String getAssertedDate() {
    return this.assertedDate;
  }
  public void set_assertedDate( Element value) {
    this._assertedDate = value;
  }
  public Element get_assertedDate() {
    return this._assertedDate;
  }
  public void setAsserter( Reference value) {
    this.asserter = value;
  }
  public Reference getAsserter() {
    return this.asserter;
  }
  public void setStage( ConditionStage value) {
    this.stage = value;
  }
  public ConditionStage getStage() {
    return this.stage;
  }
  public void setEvidence( java.util.List<ConditionEvidence> value) {
    this.evidence = value;
  }
  public java.util.List<ConditionEvidence> getEvidence() {
    return this.evidence;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Condition]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.clinicalStatus != null) builder.append("clinicalStatus" + "->" + this.clinicalStatus.toString() + "\n"); 
     if(this._clinicalStatus != null) builder.append("_clinicalStatus" + "->" + this._clinicalStatus.toString() + "\n"); 
     if(this.verificationStatus != null) builder.append("verificationStatus" + "->" + this.verificationStatus.toString() + "\n"); 
     if(this._verificationStatus != null) builder.append("_verificationStatus" + "->" + this._verificationStatus.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.severity != null) builder.append("severity" + "->" + this.severity.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.onsetDateTime != null) builder.append("onsetDateTime" + "->" + this.onsetDateTime.toString() + "\n"); 
     if(this._onsetDateTime != null) builder.append("_onsetDateTime" + "->" + this._onsetDateTime.toString() + "\n"); 
     if(this.onsetAge != null) builder.append("onsetAge" + "->" + this.onsetAge.toString() + "\n"); 
     if(this.onsetPeriod != null) builder.append("onsetPeriod" + "->" + this.onsetPeriod.toString() + "\n"); 
     if(this.onsetRange != null) builder.append("onsetRange" + "->" + this.onsetRange.toString() + "\n"); 
     if(this.onsetString != null) builder.append("onsetString" + "->" + this.onsetString.toString() + "\n"); 
     if(this._onsetString != null) builder.append("_onsetString" + "->" + this._onsetString.toString() + "\n"); 
     if(this.abatementDateTime != null) builder.append("abatementDateTime" + "->" + this.abatementDateTime.toString() + "\n"); 
     if(this._abatementDateTime != null) builder.append("_abatementDateTime" + "->" + this._abatementDateTime.toString() + "\n"); 
     if(this.abatementAge != null) builder.append("abatementAge" + "->" + this.abatementAge.toString() + "\n"); 
     if(this.abatementBoolean != null) builder.append("abatementBoolean" + "->" + this.abatementBoolean.toString() + "\n"); 
     if(this._abatementBoolean != null) builder.append("_abatementBoolean" + "->" + this._abatementBoolean.toString() + "\n"); 
     if(this.abatementPeriod != null) builder.append("abatementPeriod" + "->" + this.abatementPeriod.toString() + "\n"); 
     if(this.abatementRange != null) builder.append("abatementRange" + "->" + this.abatementRange.toString() + "\n"); 
     if(this.abatementString != null) builder.append("abatementString" + "->" + this.abatementString.toString() + "\n"); 
     if(this._abatementString != null) builder.append("_abatementString" + "->" + this._abatementString.toString() + "\n"); 
     if(this.assertedDate != null) builder.append("assertedDate" + "->" + this.assertedDate.toString() + "\n"); 
     if(this._assertedDate != null) builder.append("_assertedDate" + "->" + this._assertedDate.toString() + "\n"); 
     if(this.asserter != null) builder.append("asserter" + "->" + this.asserter.toString() + "\n"); 
     if(this.stage != null) builder.append("stage" + "->" + this.stage.toString() + "\n"); 
     if(this.evidence != null) builder.append("evidence" + "->" + this.evidence.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Condition,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Condition" : { return Condition.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum VerificationStatusEnum {
  	provisional,
  	differential,
  	confirmed,
  	refuted,
  	enteredinerror,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "provisional" : { return provisional.toString(); }
  			case "differential" : { return differential.toString(); }
  			case "confirmed" : { return confirmed.toString(); }
  			case "refuted" : { return refuted.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}