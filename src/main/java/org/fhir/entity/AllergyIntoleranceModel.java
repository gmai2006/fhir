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
* "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
* generated on 07/14/2018
*/
@Entity
@Table(name="allergyintolerance")
public class AllergyIntoleranceModel  implements Serializable {
	private static final long serialVersionUID = 153159210204182987L;
  /**
  * Description: "This is a AllergyIntolerance resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The clinical status of the allergy or intolerance."
  */
  @javax.persistence.Basic
  @Column(name="\"clinicalStatus\"")
  private String clinicalStatus;

  /**
  * Description: "Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified substance (including pharmaceutical product)."
  */
  @javax.persistence.Basic
  @Column(name="\"verificationStatus\"")
  private String verificationStatus;

  /**
  * Description: "Identification of the underlying physiological mechanism for the reaction risk."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "Category of the identified substance."
  */
  @javax.persistence.Basic
  @Column(name="\"category\"")
  private String category;

  /**
  * Description: "Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance."
  */
  @javax.persistence.Basic
  @Column(name="\"criticality\"")
  private String criticality;

  /**
  * Description: "Code for an allergy or intolerance statement (either a positive or a negated/excluded statement).  This may be a code for a substance or pharmaceutical product that is considered to be responsible for the adverse reaction risk (e.g., \"Latex\"), an allergy or intolerance condition (e.g., \"Latex allergy\"), or a negated/excluded code for a specific substance or class (e.g., \"No latex allergy\") or a general or categorical negated statement (e.g.,  \"No known allergy\", \"No known drug allergies\")."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The patient who has the allergy or intolerance."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"onsetDateTime\"")
  private String onsetDateTime;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetAge\"", length = 16777215)
  private String onsetAge;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetPeriod\"", length = 16777215)
  private String onsetPeriod;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"onsetRange\"", length = 16777215)
  private String onsetRange;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  */
  @javax.persistence.Basic
  @Column(name="\"onsetString\"")
  private String onsetString;

  /**
  * Description: "The date on which the existance of the AllergyIntolerance was first asserted or acknowledged."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"assertedDate\"")
  private String assertedDate;

  /**
  * Description: "Individual who recorded the record and takes responsibility for its content."
  */
  @javax.persistence.Basic
  @Column(name="\"recorder_id\"")
  private String recorder_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="recorder_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> recorder;

  /**
  * Description: "The source of the information about the allergy that is recorded."
  */
  @javax.persistence.Basic
  @Column(name="\"asserter_id\"")
  private String asserter_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="asserter_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> asserter;

  /**
  * Description: "Represents the date and/or time of the last known occurrence of a reaction event."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"lastOccurrence\"")
  private String lastOccurrence;

  /**
  * Description: "Additional narrative about the propensity for the Adverse Reaction, not captured in other fields."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Details about each adverse reaction event linked to exposure to the identified substance."
  */
  @javax.persistence.Basic
  @Column(name="\"reaction_id\"")
  private String reaction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reaction_id", insertable=false, updatable=false)
  private java.util.List<AllergyIntoleranceReactionModel> reaction;

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

  public AllergyIntoleranceModel() {
  }

  public AllergyIntoleranceModel(AllergyIntolerance o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.clinicalStatus = o.getClinicalStatus();
    this.verificationStatus = o.getVerificationStatus();
    this.type = o.getType();
    this.category = org.fhir.utils.JsonUtils.toJson(o.getCategory());
    this.criticality = o.getCriticality();
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    this.onsetDateTime = o.getOnsetDateTime();
    if (null != o.getOnsetAge()) {
    	this.onsetAge = JsonUtils.toJson(o.getOnsetAge());
    }
    if (null != o.getOnsetPeriod()) {
    	this.onsetPeriod = JsonUtils.toJson(o.getOnsetPeriod());
    }
    if (null != o.getOnsetRange()) {
    	this.onsetRange = JsonUtils.toJson(o.getOnsetRange());
    }
    this.onsetString = o.getOnsetString();
    this.assertedDate = o.getAssertedDate();
    if (null != o.getRecorder() ) {
    	this.recorder_id = "recorder" + this.id;
    	this.recorder = ReferenceHelper.toModel(o.getRecorder(), this.recorder_id);
    }
    if (null != o.getAsserter() ) {
    	this.asserter_id = "asserter" + this.id;
    	this.asserter = ReferenceHelper.toModel(o.getAsserter(), this.asserter_id);
    }
    this.lastOccurrence = o.getLastOccurrence();
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getReaction() && !o.getReaction().isEmpty()) {
    	this.reaction_id = "reaction" + this.id;
    	this.reaction = AllergyIntoleranceReactionHelper.toModelFromArray(o.getReaction(), this.reaction_id);
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
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCriticality() {
    return this.criticality;
  }
  public void setCriticality( String value) {
    this.criticality = value;
  }
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
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
  public String getAssertedDate() {
    return this.assertedDate;
  }
  public void setAssertedDate( String value) {
    this.assertedDate = value;
  }
  public java.util.List<ReferenceModel> getRecorder() {
    return this.recorder;
  }
  public void setRecorder( java.util.List<ReferenceModel> value) {
    this.recorder = value;
  }
  public java.util.List<ReferenceModel> getAsserter() {
    return this.asserter;
  }
  public void setAsserter( java.util.List<ReferenceModel> value) {
    this.asserter = value;
  }
  public String getLastOccurrence() {
    return this.lastOccurrence;
  }
  public void setLastOccurrence( String value) {
    this.lastOccurrence = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<AllergyIntoleranceReactionModel> getReaction() {
    return this.reaction;
  }
  public void setReaction( java.util.List<AllergyIntoleranceReactionModel> value) {
    this.reaction = value;
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
    builder.append("[AllergyIntoleranceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("clinicalStatus" + "->" + this.clinicalStatus + "\n"); 
     builder.append("verificationStatus" + "->" + this.verificationStatus + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("criticality" + "->" + this.criticality + "\n"); 
     builder.append("onsetDateTime" + "->" + this.onsetDateTime + "\n"); 
     builder.append("onsetAge" + "->" + this.onsetAge + "\n"); 
     builder.append("onsetPeriod" + "->" + this.onsetPeriod + "\n"); 
     builder.append("onsetRange" + "->" + this.onsetRange + "\n"); 
     builder.append("onsetString" + "->" + this.onsetString + "\n"); 
     builder.append("assertedDate" + "->" + this.assertedDate + "\n"); 
     builder.append("lastOccurrence" + "->" + this.lastOccurrence + "\n"); 
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
    builder.append("[AllergyIntoleranceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("clinicalStatus" + "->" + this.clinicalStatus + "\n"); 
     builder.append("verificationStatus" + "->" + this.verificationStatus + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("criticality" + "->" + this.criticality + "\n"); 
     builder.append("onsetDateTime" + "->" + this.onsetDateTime + "\n"); 
     builder.append("onsetAge" + "->" + this.onsetAge + "\n"); 
     builder.append("onsetPeriod" + "->" + this.onsetPeriod + "\n"); 
     builder.append("onsetRange" + "->" + this.onsetRange + "\n"); 
     builder.append("onsetString" + "->" + this.onsetString + "\n"); 
     builder.append("assertedDate" + "->" + this.assertedDate + "\n"); 
     builder.append("lastOccurrence" + "->" + this.lastOccurrence + "\n"); 
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