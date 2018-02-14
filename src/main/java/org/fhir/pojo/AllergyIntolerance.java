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
import org.fhir.entity.AllergyIntoleranceModel;
import com.google.gson.GsonBuilder;

/**
* "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
*/
public class AllergyIntolerance  {
  /**
  * Description: "This is a AllergyIntolerance resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The clinical status of the allergy or intolerance."
  */
  private String clinicalStatus;

  /**
  * Description: "Extensions for clinicalStatus"
  */
  private transient Element _clinicalStatus;

  /**
  * Description: "Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified substance (including pharmaceutical product)."
  */
  private String verificationStatus;

  /**
  * Description: "Extensions for verificationStatus"
  */
  private transient Element _verificationStatus;

  /**
  * Description: "Identification of the underlying physiological mechanism for the reaction risk."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "Category of the identified substance."
  */
  private java.util.List<String> category = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for category"
  */
  private transient java.util.List<Element> _category = new java.util.ArrayList<>();

  /**
  * Description: "Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance."
  */
  private String criticality;

  /**
  * Description: "Extensions for criticality"
  */
  private transient Element _criticality;

  /**
  * Description: "Code for an allergy or intolerance statement (either a positive or a negated/excluded statement).  This may be a code for a substance or pharmaceutical product that is considered to be responsible for the adverse reaction risk (e.g., \"Latex\"), an allergy or intolerance condition (e.g., \"Latex allergy\"), or a negated/excluded code for a specific substance or class (e.g., \"No latex allergy\") or a general or categorical negated statement (e.g.,  \"No known allergy\", \"No known drug allergies\")."
  */
  private CodeableConcept code;

  /**
  * Description: "The patient who has the allergy or intolerance."
  */
  @javax.validation.constraints.NotNull
  private Reference patient;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String onsetDateTime;

  /**
  * Description: "Extensions for onsetDateTime"
  */
  private transient Element _onsetDateTime;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  */
  private Age onsetAge;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  */
  private Period onsetPeriod;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  */
  private Range onsetRange;

  /**
  * Description: "Estimated or actual date,  date-time, or age when allergy or intolerance was identified."
  */
  private String onsetString;

  /**
  * Description: "Extensions for onsetString"
  */
  private transient Element _onsetString;

  /**
  * Description: "The date on which the existance of the AllergyIntolerance was first asserted or acknowledged."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String assertedDate;

  /**
  * Description: "Extensions for assertedDate"
  */
  private transient Element _assertedDate;

  /**
  * Description: "Individual who recorded the record and takes responsibility for its content."
  */
  private Reference recorder;

  /**
  * Description: "The source of the information about the allergy that is recorded."
  */
  private Reference asserter;

  /**
  * Description: "Represents the date and/or time of the last known occurrence of a reaction event."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String lastOccurrence;

  /**
  * Description: "Extensions for lastOccurrence"
  */
  private transient Element _lastOccurrence;

  /**
  * Description: "Additional narrative about the propensity for the Adverse Reaction, not captured in other fields."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Details about each adverse reaction event linked to exposure to the identified substance."
  */
  private java.util.List<AllergyIntoleranceReaction> reaction = new java.util.ArrayList<>();

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

  public AllergyIntolerance() {
  }

  public AllergyIntolerance(AllergyIntoleranceModel o) {
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
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (o.getCategory() != null) {
    	this.category = org.fhir.utils.JsonUtils.json2Array(o.getCategory());
    }
    if (null != o.getCriticality()) {
      this.criticality = o.getCriticality();
    }
    this.code = CodeableConceptHelper.fromJson(o.getCode());
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
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
    if (null != o.getAssertedDate()) {
      this.assertedDate = o.getAssertedDate();
    }
    if (null != o.getRecorder() && !o.getRecorder().isEmpty()) {
      this.recorder = new Reference(o.getRecorder().get(0));
    }
    if (null != o.getAsserter() && !o.getAsserter().isEmpty()) {
      this.asserter = new Reference(o.getAsserter().get(0));
    }
    if (null != o.getLastOccurrence()) {
      this.lastOccurrence = o.getLastOccurrence();
    }
    if (null != o.getReaction() && !o.getReaction().isEmpty()) {
    	this.reaction = AllergyIntoleranceReactionHelper.fromArray2Array(o.getReaction());
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
    this.clinicalStatus = ClinicalStatusEnum.fromCode(value);
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
  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setCategory( java.util.List<String> value) {
    this.category = CategoryEnum.fromCode(value);
  }
  public java.util.List<String> getCategory() {
    return this.category;
  }
  public void set_category( java.util.List<Element> value) {
    this._category = value;
  }
  public java.util.List<Element> get_category() {
    return this._category;
  }
  public void setCriticality( String value) {
    this.criticality = CriticalityEnum.fromCode(value);
  }
  public String getCriticality() {
    return this.criticality;
  }
  public void set_criticality( Element value) {
    this._criticality = value;
  }
  public Element get_criticality() {
    return this._criticality;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
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
  public void setRecorder( Reference value) {
    this.recorder = value;
  }
  public Reference getRecorder() {
    return this.recorder;
  }
  public void setAsserter( Reference value) {
    this.asserter = value;
  }
  public Reference getAsserter() {
    return this.asserter;
  }
  public void setLastOccurrence( String value) {
    this.lastOccurrence = value;
  }
  public String getLastOccurrence() {
    return this.lastOccurrence;
  }
  public void set_lastOccurrence( Element value) {
    this._lastOccurrence = value;
  }
  public Element get_lastOccurrence() {
    return this._lastOccurrence;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setReaction( java.util.List<AllergyIntoleranceReaction> value) {
    this.reaction = value;
  }
  public java.util.List<AllergyIntoleranceReaction> getReaction() {
    return this.reaction;
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
    builder.append("[AllergyIntolerance]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.clinicalStatus != null) builder.append("clinicalStatus" + "->" + this.clinicalStatus.toString() + "\n"); 
     if(this._clinicalStatus != null) builder.append("_clinicalStatus" + "->" + this._clinicalStatus.toString() + "\n"); 
     if(this.verificationStatus != null) builder.append("verificationStatus" + "->" + this.verificationStatus.toString() + "\n"); 
     if(this._verificationStatus != null) builder.append("_verificationStatus" + "->" + this._verificationStatus.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this._category != null) builder.append("_category" + "->" + this._category.toString() + "\n"); 
     if(this.criticality != null) builder.append("criticality" + "->" + this.criticality.toString() + "\n"); 
     if(this._criticality != null) builder.append("_criticality" + "->" + this._criticality.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.onsetDateTime != null) builder.append("onsetDateTime" + "->" + this.onsetDateTime.toString() + "\n"); 
     if(this._onsetDateTime != null) builder.append("_onsetDateTime" + "->" + this._onsetDateTime.toString() + "\n"); 
     if(this.onsetAge != null) builder.append("onsetAge" + "->" + this.onsetAge.toString() + "\n"); 
     if(this.onsetPeriod != null) builder.append("onsetPeriod" + "->" + this.onsetPeriod.toString() + "\n"); 
     if(this.onsetRange != null) builder.append("onsetRange" + "->" + this.onsetRange.toString() + "\n"); 
     if(this.onsetString != null) builder.append("onsetString" + "->" + this.onsetString.toString() + "\n"); 
     if(this._onsetString != null) builder.append("_onsetString" + "->" + this._onsetString.toString() + "\n"); 
     if(this.assertedDate != null) builder.append("assertedDate" + "->" + this.assertedDate.toString() + "\n"); 
     if(this._assertedDate != null) builder.append("_assertedDate" + "->" + this._assertedDate.toString() + "\n"); 
     if(this.recorder != null) builder.append("recorder" + "->" + this.recorder.toString() + "\n"); 
     if(this.asserter != null) builder.append("asserter" + "->" + this.asserter.toString() + "\n"); 
     if(this.lastOccurrence != null) builder.append("lastOccurrence" + "->" + this.lastOccurrence.toString() + "\n"); 
     if(this._lastOccurrence != null) builder.append("_lastOccurrence" + "->" + this._lastOccurrence.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.reaction != null) builder.append("reaction" + "->" + this.reaction.toString() + "\n"); 
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
  	AllergyIntolerance,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "AllergyIntolerance" : { return AllergyIntolerance.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ClinicalStatusEnum {
  	active,
  	inactive,
  	resolved,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "inactive" : { return inactive.toString(); }
  			case "resolved" : { return resolved.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum VerificationStatusEnum {
  	unconfirmed,
  	confirmed,
  	refuted,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "unconfirmed" : { return unconfirmed.toString(); }
  			case "confirmed" : { return confirmed.toString(); }
  			case "refuted" : { return refuted.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum TypeEnum {
  	allergy,
  	intolerance,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "allergy" : { return allergy.toString(); }
  			case "intolerance" : { return intolerance.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum CategoryEnum {
  	food,
  	medication,
  	environment,
  	biologic,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "food" : { result.add(food.toString()); }
  		  			case "medication" : { result.add(medication.toString()); }
  		  			case "environment" : { result.add(environment.toString()); }
  		  			case "biologic" : { result.add(biologic.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }

  public enum CriticalityEnum {
  	low,
  	high,
  	unabletoassess,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "low" : { return low.toString(); }
  			case "high" : { return high.toString(); }
  			case "unabletoassess" : { return unabletoassess.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}