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
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.definition = Reference.fromArray(o.getDefinition());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getNotDone()) {
        this.notDone = new Boolean(o.getNotDone());
      }

      this.notDoneReason = CodeableConcept.fromJson(o.getNotDoneReason());
      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      this.relationship = CodeableConcept.fromJson(o.getRelationship());
      if (null != o.getGender()) {
        this.gender = new String(o.getGender());
      }

      this.bornPeriod = Period.fromJson(o.getBornPeriod());
      if (null != o.getBornDate()) {
        this.bornDate = new String(o.getBornDate());
      }

      if (null != o.getBornString()) {
        this.bornString = new String(o.getBornString());
      }

      this.ageAge = Age.fromJson(o.getAgeAge());
      this.ageRange = Range.fromJson(o.getAgeRange());
      if (null != o.getAgeString()) {
        this.ageString = new String(o.getAgeString());
      }

      if (null != o.getEstimatedAge()) {
        this.estimatedAge = new Boolean(o.getEstimatedAge());
      }

      if (null != o.getDeceasedBoolean()) {
        this.deceasedBoolean = new Boolean(o.getDeceasedBoolean());
      }

      this.deceasedAge = Age.fromJson(o.getDeceasedAge());
      this.deceasedRange = Range.fromJson(o.getDeceasedRange());
      if (null != o.getDeceasedDate()) {
        this.deceasedDate = new String(o.getDeceasedDate());
      }

      if (null != o.getDeceasedString()) {
        this.deceasedString = new String(o.getDeceasedString());
      }

      this.reasonCode = CodeableConcept.fromArray(o.getReasonCode());
      this.reasonReference = Reference.fromArray(o.getReasonReference());

      this.note = Annotation.fromArray(o.getNote());
      this.condition = FamilyMemberHistoryCondition.fromArray(o.getCondition());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("notDone" + "[" + String.valueOf(this.notDone) + "]\n"); 
     builder.append("_notDone" + "[" + String.valueOf(this._notDone) + "]\n"); 
     builder.append("notDoneReason" + "[" + String.valueOf(this.notDoneReason) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("relationship" + "[" + String.valueOf(this.relationship) + "]\n"); 
     builder.append("gender" + "[" + String.valueOf(this.gender) + "]\n"); 
     builder.append("_gender" + "[" + String.valueOf(this._gender) + "]\n"); 
     builder.append("bornPeriod" + "[" + String.valueOf(this.bornPeriod) + "]\n"); 
     builder.append("bornDate" + "[" + String.valueOf(this.bornDate) + "]\n"); 
     builder.append("_bornDate" + "[" + String.valueOf(this._bornDate) + "]\n"); 
     builder.append("bornString" + "[" + String.valueOf(this.bornString) + "]\n"); 
     builder.append("_bornString" + "[" + String.valueOf(this._bornString) + "]\n"); 
     builder.append("ageAge" + "[" + String.valueOf(this.ageAge) + "]\n"); 
     builder.append("ageRange" + "[" + String.valueOf(this.ageRange) + "]\n"); 
     builder.append("ageString" + "[" + String.valueOf(this.ageString) + "]\n"); 
     builder.append("_ageString" + "[" + String.valueOf(this._ageString) + "]\n"); 
     builder.append("estimatedAge" + "[" + String.valueOf(this.estimatedAge) + "]\n"); 
     builder.append("_estimatedAge" + "[" + String.valueOf(this._estimatedAge) + "]\n"); 
     builder.append("deceasedBoolean" + "[" + String.valueOf(this.deceasedBoolean) + "]\n"); 
     builder.append("_deceasedBoolean" + "[" + String.valueOf(this._deceasedBoolean) + "]\n"); 
     builder.append("deceasedAge" + "[" + String.valueOf(this.deceasedAge) + "]\n"); 
     builder.append("deceasedRange" + "[" + String.valueOf(this.deceasedRange) + "]\n"); 
     builder.append("deceasedDate" + "[" + String.valueOf(this.deceasedDate) + "]\n"); 
     builder.append("_deceasedDate" + "[" + String.valueOf(this._deceasedDate) + "]\n"); 
     builder.append("deceasedString" + "[" + String.valueOf(this.deceasedString) + "]\n"); 
     builder.append("_deceasedString" + "[" + String.valueOf(this._deceasedString) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("condition" + "[" + String.valueOf(this.condition) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<FamilyMemberHistory> fromArray(java.util.List<FamilyMemberHistoryModel> list) {
    return (java.util.List<FamilyMemberHistory>)list.stream()
      .map(model -> new FamilyMemberHistory(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<FamilyMemberHistoryModel> toModelArray(java.util.List<FamilyMemberHistory> list) {
    return (java.util.List<FamilyMemberHistoryModel>)list.stream()
      .map(model -> new FamilyMemberHistoryModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static FamilyMemberHistory fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, FamilyMemberHistory.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(FamilyMemberHistory o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<FamilyMemberHistory> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}