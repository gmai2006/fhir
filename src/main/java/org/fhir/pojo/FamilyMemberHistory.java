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
import org.fhir.entity.FamilyMemberHistoryModel;
import com.google.gson.GsonBuilder;

/**
* "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient."
*/
public class FamilyMemberHistory  {
  /**
  * Description: "This is a FamilyMemberHistory resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A protocol or questionnaire that was adhered to in whole or in part by this event."
  */
  private java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "A code specifying the status of the record of the family history of a specific family member."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "If true, indicates the taking of an individual family member's history did not occur. The notDone element should not be used to document negated conditions, such as a family member that did not have a condition."
  */
  private Boolean notDone;

  /**
  * Description: "Extensions for notDone"
  */
  private transient Element _notDone;

  /**
  * Description: "Describes why the family member's history is absent."
  */
  private CodeableConcept notDoneReason;

  /**
  * Description: "The person who this history concerns."
  */
  @javax.validation.constraints.NotNull
  private Reference patient;

  /**
  * Description: "The date (and possibly time) when the family member history was taken."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "This will either be a name or a description; e.g. \"Aunt Susan\", \"my cousin with the red hair\"."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "The type of relationship this person has to the patient (father, mother, brother etc.)."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept relationship;

  /**
  * Description: "Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes."
  */
  private String gender;

  /**
  * Description: "Extensions for gender"
  */
  private transient Element _gender;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  */
  private Period bornPeriod;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String bornDate;

  /**
  * Description: "Extensions for bornDate"
  */
  private transient Element _bornDate;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  */
  private String bornString;

  /**
  * Description: "Extensions for bornString"
  */
  private transient Element _bornString;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  */
  private Age ageAge;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  */
  private Range ageRange;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  */
  private String ageString;

  /**
  * Description: "Extensions for ageString"
  */
  private transient Element _ageString;

  /**
  * Description: "If true, indicates that the age value specified is an estimated value."
  */
  private Boolean estimatedAge;

  /**
  * Description: "Extensions for estimatedAge"
  */
  private transient Element _estimatedAge;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  private Boolean deceasedBoolean;

  /**
  * Description: "Extensions for deceasedBoolean"
  */
  private transient Element _deceasedBoolean;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  private Age deceasedAge;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  private Range deceasedRange;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String deceasedDate;

  /**
  * Description: "Extensions for deceasedDate"
  */
  private transient Element _deceasedDate;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  private String deceasedString;

  /**
  * Description: "Extensions for deceasedString"
  */
  private transient Element _deceasedString;

  /**
  * Description: "Describes why the family member history occurred in coded or textual form."
  */
  private java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event."
  */
  private java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition."
  */
  private java.util.List<FamilyMemberHistoryCondition> condition = new java.util.ArrayList<>();

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

  public FamilyMemberHistory() {
  }

  public FamilyMemberHistory(FamilyMemberHistoryModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition = ReferenceHelper.fromArray2Array(o.getDefinition());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getNotDone()) {
      this.notDone = o.getNotDone();
    }
    this.notDoneReason = CodeableConceptHelper.fromJson(o.getNotDoneReason());
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    this.relationship = CodeableConceptHelper.fromJson(o.getRelationship());
    if (null != o.getGender()) {
      this.gender = o.getGender();
    }
    this.bornPeriod = PeriodHelper.fromJson(o.getBornPeriod());
    if (null != o.getBornDate()) {
      this.bornDate = o.getBornDate();
    }
    if (null != o.getBornString()) {
      this.bornString = o.getBornString();
    }
    this.ageAge = AgeHelper.fromJson(o.getAgeAge());
    this.ageRange = RangeHelper.fromJson(o.getAgeRange());
    if (null != o.getAgeString()) {
      this.ageString = o.getAgeString();
    }
    if (null != o.getEstimatedAge()) {
      this.estimatedAge = o.getEstimatedAge();
    }
    if (null != o.getDeceasedBoolean()) {
      this.deceasedBoolean = o.getDeceasedBoolean();
    }
    this.deceasedAge = AgeHelper.fromJson(o.getDeceasedAge());
    this.deceasedRange = RangeHelper.fromJson(o.getDeceasedRange());
    if (null != o.getDeceasedDate()) {
      this.deceasedDate = o.getDeceasedDate();
    }
    if (null != o.getDeceasedString()) {
      this.deceasedString = o.getDeceasedString();
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
    	this.condition = FamilyMemberHistoryConditionHelper.fromArray2Array(o.getCondition());
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
  public void setDefinition( java.util.List<Reference> value) {
    this.definition = value;
  }
  public java.util.List<Reference> getDefinition() {
    return this.definition;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setNotDone( Boolean value) {
    this.notDone = value;
  }
  public Boolean getNotDone() {
    return this.notDone;
  }
  public void set_notDone( Element value) {
    this._notDone = value;
  }
  public Element get_notDone() {
    return this._notDone;
  }
  public void setNotDoneReason( CodeableConcept value) {
    this.notDoneReason = value;
  }
  public CodeableConcept getNotDoneReason() {
    return this.notDoneReason;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
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
  public void setRelationship( CodeableConcept value) {
    this.relationship = value;
  }
  public CodeableConcept getRelationship() {
    return this.relationship;
  }
  public void setGender( String value) {
    this.gender = GenderEnum.fromCode(value);
  }
  public String getGender() {
    return this.gender;
  }
  public void set_gender( Element value) {
    this._gender = value;
  }
  public Element get_gender() {
    return this._gender;
  }
  public void setBornPeriod( Period value) {
    this.bornPeriod = value;
  }
  public Period getBornPeriod() {
    return this.bornPeriod;
  }
  public void setBornDate( String value) {
    this.bornDate = value;
  }
  public String getBornDate() {
    return this.bornDate;
  }
  public void set_bornDate( Element value) {
    this._bornDate = value;
  }
  public Element get_bornDate() {
    return this._bornDate;
  }
  public void setBornString( String value) {
    this.bornString = value;
  }
  public String getBornString() {
    return this.bornString;
  }
  public void set_bornString( Element value) {
    this._bornString = value;
  }
  public Element get_bornString() {
    return this._bornString;
  }
  public void setAgeAge( Age value) {
    this.ageAge = value;
  }
  public Age getAgeAge() {
    return this.ageAge;
  }
  public void setAgeRange( Range value) {
    this.ageRange = value;
  }
  public Range getAgeRange() {
    return this.ageRange;
  }
  public void setAgeString( String value) {
    this.ageString = value;
  }
  public String getAgeString() {
    return this.ageString;
  }
  public void set_ageString( Element value) {
    this._ageString = value;
  }
  public Element get_ageString() {
    return this._ageString;
  }
  public void setEstimatedAge( Boolean value) {
    this.estimatedAge = value;
  }
  public Boolean getEstimatedAge() {
    return this.estimatedAge;
  }
  public void set_estimatedAge( Element value) {
    this._estimatedAge = value;
  }
  public Element get_estimatedAge() {
    return this._estimatedAge;
  }
  public void setDeceasedBoolean( Boolean value) {
    this.deceasedBoolean = value;
  }
  public Boolean getDeceasedBoolean() {
    return this.deceasedBoolean;
  }
  public void set_deceasedBoolean( Element value) {
    this._deceasedBoolean = value;
  }
  public Element get_deceasedBoolean() {
    return this._deceasedBoolean;
  }
  public void setDeceasedAge( Age value) {
    this.deceasedAge = value;
  }
  public Age getDeceasedAge() {
    return this.deceasedAge;
  }
  public void setDeceasedRange( Range value) {
    this.deceasedRange = value;
  }
  public Range getDeceasedRange() {
    return this.deceasedRange;
  }
  public void setDeceasedDate( String value) {
    this.deceasedDate = value;
  }
  public String getDeceasedDate() {
    return this.deceasedDate;
  }
  public void set_deceasedDate( Element value) {
    this._deceasedDate = value;
  }
  public Element get_deceasedDate() {
    return this._deceasedDate;
  }
  public void setDeceasedString( String value) {
    this.deceasedString = value;
  }
  public String getDeceasedString() {
    return this.deceasedString;
  }
  public void set_deceasedString( Element value) {
    this._deceasedString = value;
  }
  public Element get_deceasedString() {
    return this._deceasedString;
  }
  public void setReasonCode( java.util.List<CodeableConcept> value) {
    this.reasonCode = value;
  }
  public java.util.List<CodeableConcept> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonReference( java.util.List<Reference> value) {
    this.reasonReference = value;
  }
  public java.util.List<Reference> getReasonReference() {
    return this.reasonReference;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setCondition( java.util.List<FamilyMemberHistoryCondition> value) {
    this.condition = value;
  }
  public java.util.List<FamilyMemberHistoryCondition> getCondition() {
    return this.condition;
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
    builder.append("[FamilyMemberHistory]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.notDone != null) builder.append("notDone" + "->" + this.notDone.toString() + "\n"); 
     if(this._notDone != null) builder.append("_notDone" + "->" + this._notDone.toString() + "\n"); 
     if(this.notDoneReason != null) builder.append("notDoneReason" + "->" + this.notDoneReason.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.relationship != null) builder.append("relationship" + "->" + this.relationship.toString() + "\n"); 
     if(this.gender != null) builder.append("gender" + "->" + this.gender.toString() + "\n"); 
     if(this._gender != null) builder.append("_gender" + "->" + this._gender.toString() + "\n"); 
     if(this.bornPeriod != null) builder.append("bornPeriod" + "->" + this.bornPeriod.toString() + "\n"); 
     if(this.bornDate != null) builder.append("bornDate" + "->" + this.bornDate.toString() + "\n"); 
     if(this._bornDate != null) builder.append("_bornDate" + "->" + this._bornDate.toString() + "\n"); 
     if(this.bornString != null) builder.append("bornString" + "->" + this.bornString.toString() + "\n"); 
     if(this._bornString != null) builder.append("_bornString" + "->" + this._bornString.toString() + "\n"); 
     if(this.ageAge != null) builder.append("ageAge" + "->" + this.ageAge.toString() + "\n"); 
     if(this.ageRange != null) builder.append("ageRange" + "->" + this.ageRange.toString() + "\n"); 
     if(this.ageString != null) builder.append("ageString" + "->" + this.ageString.toString() + "\n"); 
     if(this._ageString != null) builder.append("_ageString" + "->" + this._ageString.toString() + "\n"); 
     if(this.estimatedAge != null) builder.append("estimatedAge" + "->" + this.estimatedAge.toString() + "\n"); 
     if(this._estimatedAge != null) builder.append("_estimatedAge" + "->" + this._estimatedAge.toString() + "\n"); 
     if(this.deceasedBoolean != null) builder.append("deceasedBoolean" + "->" + this.deceasedBoolean.toString() + "\n"); 
     if(this._deceasedBoolean != null) builder.append("_deceasedBoolean" + "->" + this._deceasedBoolean.toString() + "\n"); 
     if(this.deceasedAge != null) builder.append("deceasedAge" + "->" + this.deceasedAge.toString() + "\n"); 
     if(this.deceasedRange != null) builder.append("deceasedRange" + "->" + this.deceasedRange.toString() + "\n"); 
     if(this.deceasedDate != null) builder.append("deceasedDate" + "->" + this.deceasedDate.toString() + "\n"); 
     if(this._deceasedDate != null) builder.append("_deceasedDate" + "->" + this._deceasedDate.toString() + "\n"); 
     if(this.deceasedString != null) builder.append("deceasedString" + "->" + this.deceasedString.toString() + "\n"); 
     if(this._deceasedString != null) builder.append("_deceasedString" + "->" + this._deceasedString.toString() + "\n"); 
     if(this.reasonCode != null) builder.append("reasonCode" + "->" + this.reasonCode.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.condition != null) builder.append("condition" + "->" + this.condition.toString() + "\n"); 
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
  	FamilyMemberHistory,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "FamilyMemberHistory" : { return FamilyMemberHistory.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	partial,
  	completed,
  	enteredinerror,
  	healthunknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "partial" : { return partial.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "healthunknown" : { return healthunknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum GenderEnum {
  	male,
  	female,
  	other,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "male" : { return male.toString(); }
  			case "female" : { return female.toString(); }
  			case "other" : { return other.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}