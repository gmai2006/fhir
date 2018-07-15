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
* "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient."
* generated on 07/14/2018
*/
@Entity
@Table(name="familymemberhistory")
public class FamilyMemberHistoryModel  implements Serializable {
	private static final long serialVersionUID = 153159210203134944L;
  /**
  * Description: "This is a FamilyMemberHistory resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A protocol or questionnaire that was adhered to in whole or in part by this event."
  */
  @javax.persistence.Basic
  @Column(name="\"definition_id\"")
  private String definition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="definition_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition;

  /**
  * Description: "A code specifying the status of the record of the family history of a specific family member."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "If true, indicates the taking of an individual family member's history did not occur. The notDone element should not be used to document negated conditions, such as a family member that did not have a condition."
  */
  @javax.persistence.Basic
  @Column(name="\"notDone\"")
  private Boolean notDone;

  /**
  * Description: "Describes why the family member's history is absent."
  */
  @javax.persistence.Basic
  @Column(name="\"notdonereason_id\"")
  private String notdonereason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="notdonereason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> notDoneReason;

  /**
  * Description: "The person who this history concerns."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "The date (and possibly time) when the family member history was taken."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "This will either be a name or a description; e.g. \"Aunt Susan\", \"my cousin with the red hair\"."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "The type of relationship this person has to the patient (father, mother, brother etc.)."
  */
  @javax.persistence.Basic
  @Column(name="\"relationship_id\"")
  private String relationship_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="relationship_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> relationship;

  /**
  * Description: "Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes."
  */
  @javax.persistence.Basic
  @Column(name="\"gender\"")
  private String gender;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bornPeriod\"", length = 16777215)
  private String bornPeriod;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"bornDate\"")
  private String bornDate;

  /**
  * Description: "The actual or approximate date of birth of the relative."
  */
  @javax.persistence.Basic
  @Column(name="\"bornString\"")
  private String bornString;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"ageAge\"", length = 16777215)
  private String ageAge;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"ageRange\"", length = 16777215)
  private String ageRange;

  /**
  * Description: "The age of the relative at the time the family member history is recorded."
  */
  @javax.persistence.Basic
  @Column(name="\"ageString\"")
  private String ageString;

  /**
  * Description: "If true, indicates that the age value specified is an estimated value."
  */
  @javax.persistence.Basic
  @Column(name="\"estimatedAge\"")
  private Boolean estimatedAge;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  @javax.persistence.Basic
  @Column(name="\"deceasedBoolean\"")
  private Boolean deceasedBoolean;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"deceasedAge\"", length = 16777215)
  private String deceasedAge;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"deceasedRange\"", length = 16777215)
  private String deceasedRange;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"deceasedDate\"")
  private String deceasedDate;

  /**
  * Description: "Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record."
  */
  @javax.persistence.Basic
  @Column(name="\"deceasedString\"")
  private String deceasedString;

  /**
  * Description: "Describes why the family member history occurred in coded or textual form."
  */
  @javax.persistence.Basic
  @Column(name="\"reasoncode_id\"")
  private String reasoncode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reasoncode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reasonCode;

  /**
  * Description: "Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reasonreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference;

  /**
  * Description: "This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition."
  */
  @javax.persistence.Basic
  @Column(name="\"condition_id\"")
  private String condition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="condition_id", insertable=false, updatable=false)
  private java.util.List<FamilyMemberHistoryConditionModel> condition;

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

  public FamilyMemberHistoryModel() {
  }

  public FamilyMemberHistoryModel(FamilyMemberHistory o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition_id = "definition" + this.id;
    	this.definition = ReferenceHelper.toModelFromArray(o.getDefinition(), this.definition_id);
    }
    this.status = o.getStatus();
    this.notDone = o.getNotDone();
    if (null != o.getNotDoneReason() ) {
    	this.notdonereason_id = "notdonereason" + this.id;
    	this.notDoneReason = CodeableConceptHelper.toModel(o.getNotDoneReason(), this.notdonereason_id);
    }
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    this.date = o.getDate();
    this.name = o.getName();
    if (null != o.getRelationship() ) {
    	this.relationship_id = "relationship" + this.id;
    	this.relationship = CodeableConceptHelper.toModel(o.getRelationship(), this.relationship_id);
    }
    this.gender = o.getGender();
    if (null != o.getBornPeriod()) {
    	this.bornPeriod = JsonUtils.toJson(o.getBornPeriod());
    }
    this.bornDate = o.getBornDate();
    this.bornString = o.getBornString();
    if (null != o.getAgeAge()) {
    	this.ageAge = JsonUtils.toJson(o.getAgeAge());
    }
    if (null != o.getAgeRange()) {
    	this.ageRange = JsonUtils.toJson(o.getAgeRange());
    }
    this.ageString = o.getAgeString();
    this.estimatedAge = o.getEstimatedAge();
    this.deceasedBoolean = o.getDeceasedBoolean();
    if (null != o.getDeceasedAge()) {
    	this.deceasedAge = JsonUtils.toJson(o.getDeceasedAge());
    }
    if (null != o.getDeceasedRange()) {
    	this.deceasedRange = JsonUtils.toJson(o.getDeceasedRange());
    }
    this.deceasedDate = o.getDeceasedDate();
    this.deceasedString = o.getDeceasedString();
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasoncode_id = "reasoncode" + this.id;
    	this.reasonCode = CodeableConceptHelper.toModelFromArray(o.getReasonCode(), this.reasoncode_id);
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonreference_id = "reasonreference" + this.id;
    	this.reasonReference = ReferenceHelper.toModelFromArray(o.getReasonReference(), this.reasonreference_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getCondition() && !o.getCondition().isEmpty()) {
    	this.condition_id = "condition" + this.id;
    	this.condition = FamilyMemberHistoryConditionHelper.toModelFromArray(o.getCondition(), this.condition_id);
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
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public Boolean getNotDone() {
    return this.notDone;
  }
  public void setNotDone( Boolean value) {
    this.notDone = value;
  }
  public java.util.List<CodeableConceptModel> getNotDoneReason() {
    return this.notDoneReason;
  }
  public void setNotDoneReason( java.util.List<CodeableConceptModel> value) {
    this.notDoneReason = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public java.util.List<CodeableConceptModel> getRelationship() {
    return this.relationship;
  }
  public void setRelationship( java.util.List<CodeableConceptModel> value) {
    this.relationship = value;
  }
  public String getGender() {
    return this.gender;
  }
  public void setGender( String value) {
    this.gender = value;
  }
  public String getBornPeriod() {
    return this.bornPeriod;
  }
  public void setBornPeriod( String value) {
    this.bornPeriod = value;
  }
  public String getBornDate() {
    return this.bornDate;
  }
  public void setBornDate( String value) {
    this.bornDate = value;
  }
  public String getBornString() {
    return this.bornString;
  }
  public void setBornString( String value) {
    this.bornString = value;
  }
  public String getAgeAge() {
    return this.ageAge;
  }
  public void setAgeAge( String value) {
    this.ageAge = value;
  }
  public String getAgeRange() {
    return this.ageRange;
  }
  public void setAgeRange( String value) {
    this.ageRange = value;
  }
  public String getAgeString() {
    return this.ageString;
  }
  public void setAgeString( String value) {
    this.ageString = value;
  }
  public Boolean getEstimatedAge() {
    return this.estimatedAge;
  }
  public void setEstimatedAge( Boolean value) {
    this.estimatedAge = value;
  }
  public Boolean getDeceasedBoolean() {
    return this.deceasedBoolean;
  }
  public void setDeceasedBoolean( Boolean value) {
    this.deceasedBoolean = value;
  }
  public String getDeceasedAge() {
    return this.deceasedAge;
  }
  public void setDeceasedAge( String value) {
    this.deceasedAge = value;
  }
  public String getDeceasedRange() {
    return this.deceasedRange;
  }
  public void setDeceasedRange( String value) {
    this.deceasedRange = value;
  }
  public String getDeceasedDate() {
    return this.deceasedDate;
  }
  public void setDeceasedDate( String value) {
    this.deceasedDate = value;
  }
  public String getDeceasedString() {
    return this.deceasedString;
  }
  public void setDeceasedString( String value) {
    this.deceasedString = value;
  }
  public java.util.List<CodeableConceptModel> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonCode( java.util.List<CodeableConceptModel> value) {
    this.reasonCode = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<FamilyMemberHistoryConditionModel> getCondition() {
    return this.condition;
  }
  public void setCondition( java.util.List<FamilyMemberHistoryConditionModel> value) {
    this.condition = value;
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
    builder.append("[FamilyMemberHistoryModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("notDone" + "->" + this.notDone + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("gender" + "->" + this.gender + "\n"); 
     builder.append("bornPeriod" + "->" + this.bornPeriod + "\n"); 
     builder.append("bornDate" + "->" + this.bornDate + "\n"); 
     builder.append("bornString" + "->" + this.bornString + "\n"); 
     builder.append("ageAge" + "->" + this.ageAge + "\n"); 
     builder.append("ageRange" + "->" + this.ageRange + "\n"); 
     builder.append("ageString" + "->" + this.ageString + "\n"); 
     builder.append("estimatedAge" + "->" + this.estimatedAge + "\n"); 
     builder.append("deceasedBoolean" + "->" + this.deceasedBoolean + "\n"); 
     builder.append("deceasedAge" + "->" + this.deceasedAge + "\n"); 
     builder.append("deceasedRange" + "->" + this.deceasedRange + "\n"); 
     builder.append("deceasedDate" + "->" + this.deceasedDate + "\n"); 
     builder.append("deceasedString" + "->" + this.deceasedString + "\n"); 
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
    builder.append("[FamilyMemberHistoryModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("notDone" + "->" + this.notDone + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("gender" + "->" + this.gender + "\n"); 
     builder.append("bornPeriod" + "->" + this.bornPeriod + "\n"); 
     builder.append("bornDate" + "->" + this.bornDate + "\n"); 
     builder.append("bornString" + "->" + this.bornString + "\n"); 
     builder.append("ageAge" + "->" + this.ageAge + "\n"); 
     builder.append("ageRange" + "->" + this.ageRange + "\n"); 
     builder.append("ageString" + "->" + this.ageString + "\n"); 
     builder.append("estimatedAge" + "->" + this.estimatedAge + "\n"); 
     builder.append("deceasedBoolean" + "->" + this.deceasedBoolean + "\n"); 
     builder.append("deceasedAge" + "->" + this.deceasedAge + "\n"); 
     builder.append("deceasedRange" + "->" + this.deceasedRange + "\n"); 
     builder.append("deceasedDate" + "->" + this.deceasedDate + "\n"); 
     builder.append("deceasedString" + "->" + this.deceasedString + "\n"); 
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