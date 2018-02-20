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
public class FamilyMemberHistory  extends DomainResource  {
  /**
  * Description: "This is a FamilyMemberHistory resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A protocol or questionnaire that was adhered to in whole or in part by this event."
  */
  protected java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "A code specifying the status of the record of the family history of a specific family member."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "If true, indicates the taking of an individual family member's history did not occur. The notDone element should not be used to document negated conditions, such as a family member that did not have a condition."
  */
  protected Boolean notDone;

  /**
  * Description: "Extensions for notDone"
  */
  protected transient Element _notDone;

  /**
  * Description: "Describes why the family member's history is absent."
  */
  protected CodeableConcept notDoneReason;

  /**
  * Description: "The person who this history concerns."
  */
  @javax.validation.constraints.NotNull
  protected Reference patient;

  /**
  * Description: "The date (and possibly time) when the family member history was taken."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "This will either be a name or a description; e.g. \"Aunt Susan\", \"my cousin with the red hair\"."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The type of relationship this person has to the patient (father, mother, brother etc.)."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept relationship;

  /**
  * Description: "Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes."
  */
  protected String gender;

  /**
  * Description: "Extensions for gender"
  */
  protected transient Element _gender;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  */
  protected Period bornPeriod;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String bornDate;

  /**
  * Description: "Extensions for bornDate"
  */
  protected transient Element _bornDate;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  */
  protected String bornString;

  /**
  * Description: "Extensions for bornString"
  */
  protected transient Element _bornString;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  */
  protected Age ageAge;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  */
  protected Range ageRange;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  */
  protected String ageString;

  /**
  * Description: "Extensions for ageString"
  */
  protected transient Element _ageString;

  /**
  * Description: "If true, indicates that the age value specified is an estimated value."
  */
  protected Boolean estimatedAge;

  /**
  * Description: "Extensions for estimatedAge"
  */
  protected transient Element _estimatedAge;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  protected Boolean deceasedBoolean;

  /**
  * Description: "Extensions for deceasedBoolean"
  */
  protected transient Element _deceasedBoolean;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  protected Age deceasedAge;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  protected Range deceasedRange;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String deceasedDate;

  /**
  * Description: "Extensions for deceasedDate"
  */
  protected transient Element _deceasedDate;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  protected String deceasedString;

  /**
  * Description: "Extensions for deceasedString"
  */
  protected transient Element _deceasedString;

  /**
  * Description: "Describes why the family member history occurred in coded or textual form."
  */
  protected java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event."
  */
  protected java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible."
  */
  protected java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition."
  */
  protected java.util.List<FamilyMemberHistoryCondition> condition = new java.util.ArrayList<>();

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
    if (null != o.getNotDoneReason() && !o.getNotDoneReason().isEmpty()) {
      this.notDoneReason = new CodeableConcept(o.getNotDoneReason().get(0));
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getRelationship() && !o.getRelationship().isEmpty()) {
      this.relationship = new CodeableConcept(o.getRelationship().get(0));
    }
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
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasonCode = CodeableConceptHelper.fromArray2Array(o.getReasonCode());
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
    	this.condition = FamilyMemberHistoryConditionHelper.fromArray2Array(o.getCondition());
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
     if(this.condition != null) builder.append("condition" + "->" + this.condition.toString() + "\n"); ;
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