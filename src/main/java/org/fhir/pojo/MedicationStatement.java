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
import org.fhir.entity.MedicationStatementModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains \r\rThe primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicationStatement  extends DomainResource  {
  /**
  * Description: "This is a MedicationStatement resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "A plan, proposal or order that is fulfilled in whole or in part by this event."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "A larger event of which this particular event is a component or step."
  */
  protected java.util.List<Reference> partOf;

  /**
  * Description: "The encounter or episode of care that establishes the context for this MedicationStatement."
  */
  protected Reference context;

  /**
  * Description: "A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Indicates where type of medication statement and where the medication is expected to be consumed or administered."
  */
  protected CodeableConcept category;

  /**
  * Description: "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  protected CodeableConcept medicationCodeableConcept;

  /**
  * Description: "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  protected Reference medicationReference;

  /**
  * Description: "The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  protected transient Element _effectiveDateTime;

  /**
  * Description: "The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true)."
  */
  protected Period effectivePeriod;

  /**
  * Description: "The date when the medication statement was asserted by the information source."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String dateAsserted;

  /**
  * Description: "Extensions for dateAsserted"
  */
  protected transient Element _dateAsserted;

  /**
  * Description: "The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when a MedicationStatement is derived from other resources, e.g Claim or MedicationRequest."
  */
  protected Reference informationSource;

  /**
  * Description: "The person, animal or group who is/was taking the medication."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement."
  */
  protected java.util.List<Reference> derivedFrom;

  /**
  * Description: "Indicator of the certainty of whether the medication was taken by the patient."
  */
  protected String taken;

  /**
  * Description: "Extensions for taken"
  */
  protected transient Element _taken;

  /**
  * Description: "A code indicating why the medication was not taken."
  */
  protected java.util.List<CodeableConcept> reasonNotTaken;

  /**
  * Description: "A reason for why the medication is being/was taken."
  */
  protected java.util.List<CodeableConcept> reasonCode;

  /**
  * Description: "Condition or observation that supports why the medication is being/was taken."
  */
  protected java.util.List<Reference> reasonReference;

  /**
  * Description: "Provides extra information about the medication statement that is not conveyed by the other attributes."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Indicates how the medication is/was or should be taken by the patient."
  */
  protected java.util.List<Dosage> dosage;

  public MedicationStatement() {
  }

  public MedicationStatement(MedicationStatementModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partOf = ReferenceHelper.fromArray2Array(o.getPartOf());
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
      this.category = new CodeableConcept(o.getCategory().get(0));
    }
    if (null != o.getMedicationCodeableConcept() && !o.getMedicationCodeableConcept().isEmpty()) {
      this.medicationCodeableConcept = new CodeableConcept(o.getMedicationCodeableConcept().get(0));
    }
    if (null != o.getMedicationReference() && !o.getMedicationReference().isEmpty()) {
      this.medicationReference = new Reference(o.getMedicationReference().get(0));
    }
    if (null != o.getEffectiveDateTime()) {
      this.effectiveDateTime = o.getEffectiveDateTime();
    }
    this.effectivePeriod = PeriodHelper.fromJson(o.getEffectivePeriod());
    if (null != o.getDateAsserted()) {
      this.dateAsserted = o.getDateAsserted();
    }
    if (null != o.getInformationSource() && !o.getInformationSource().isEmpty()) {
      this.informationSource = new Reference(o.getInformationSource().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getDerivedFrom() && !o.getDerivedFrom().isEmpty()) {
    	this.derivedFrom = ReferenceHelper.fromArray2Array(o.getDerivedFrom());
    }
    if (null != o.getTaken()) {
      this.taken = o.getTaken();
    }
    if (null != o.getReasonNotTaken() && !o.getReasonNotTaken().isEmpty()) {
    	this.reasonNotTaken = CodeableConceptHelper.fromArray2Array(o.getReasonNotTaken());
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasonCode = CodeableConceptHelper.fromArray2Array(o.getReasonCode());
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
    if (null != o.getDosage() && !o.getDosage().isEmpty()) {
    	this.dosage = DosageHelper.fromArray2Array(o.getDosage());
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
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
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
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setMedicationCodeableConcept( CodeableConcept value) {
    this.medicationCodeableConcept = value;
  }
  public CodeableConcept getMedicationCodeableConcept() {
    return this.medicationCodeableConcept;
  }
  public void setMedicationReference( Reference value) {
    this.medicationReference = value;
  }
  public Reference getMedicationReference() {
    return this.medicationReference;
  }
  public void setEffectiveDateTime( String value) {
    this.effectiveDateTime = value;
  }
  public String getEffectiveDateTime() {
    return this.effectiveDateTime;
  }
  public void set_effectiveDateTime( Element value) {
    this._effectiveDateTime = value;
  }
  public Element get_effectiveDateTime() {
    return this._effectiveDateTime;
  }
  public void setEffectivePeriod( Period value) {
    this.effectivePeriod = value;
  }
  public Period getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setDateAsserted( String value) {
    this.dateAsserted = value;
  }
  public String getDateAsserted() {
    return this.dateAsserted;
  }
  public void set_dateAsserted( Element value) {
    this._dateAsserted = value;
  }
  public Element get_dateAsserted() {
    return this._dateAsserted;
  }
  public void setInformationSource( Reference value) {
    this.informationSource = value;
  }
  public Reference getInformationSource() {
    return this.informationSource;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setDerivedFrom( java.util.List<Reference> value) {
    this.derivedFrom = value;
  }
  public java.util.List<Reference> getDerivedFrom() {
    return this.derivedFrom;
  }
  public void setTaken( String value) {
    this.taken = TakenEnum.fromCode(value);
  }
  public String getTaken() {
    return this.taken;
  }
  public void set_taken( Element value) {
    this._taken = value;
  }
  public Element get_taken() {
    return this._taken;
  }
  public void setReasonNotTaken( java.util.List<CodeableConcept> value) {
    this.reasonNotTaken = value;
  }
  public java.util.List<CodeableConcept> getReasonNotTaken() {
    return this.reasonNotTaken;
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
  public void setDosage( java.util.List<Dosage> value) {
    this.dosage = value;
  }
  public java.util.List<Dosage> getDosage() {
    return this.dosage;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationStatement]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.medicationCodeableConcept != null) builder.append("medicationCodeableConcept" + "->" + this.medicationCodeableConcept.toString() + "\n"); 
     if(this.medicationReference != null) builder.append("medicationReference" + "->" + this.medicationReference.toString() + "\n"); 
     if(this.effectiveDateTime != null) builder.append("effectiveDateTime" + "->" + this.effectiveDateTime.toString() + "\n"); 
     if(this._effectiveDateTime != null) builder.append("_effectiveDateTime" + "->" + this._effectiveDateTime.toString() + "\n"); 
     if(this.effectivePeriod != null) builder.append("effectivePeriod" + "->" + this.effectivePeriod.toString() + "\n"); 
     if(this.dateAsserted != null) builder.append("dateAsserted" + "->" + this.dateAsserted.toString() + "\n"); 
     if(this._dateAsserted != null) builder.append("_dateAsserted" + "->" + this._dateAsserted.toString() + "\n"); 
     if(this.informationSource != null) builder.append("informationSource" + "->" + this.informationSource.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.derivedFrom != null) builder.append("derivedFrom" + "->" + this.derivedFrom.toString() + "\n"); 
     if(this.taken != null) builder.append("taken" + "->" + this.taken.toString() + "\n"); 
     if(this._taken != null) builder.append("_taken" + "->" + this._taken.toString() + "\n"); 
     if(this.reasonNotTaken != null) builder.append("reasonNotTaken" + "->" + this.reasonNotTaken.toString() + "\n"); 
     if(this.reasonCode != null) builder.append("reasonCode" + "->" + this.reasonCode.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.dosage != null) builder.append("dosage" + "->" + this.dosage.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	MedicationStatement,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "MedicationStatement" : { return MedicationStatement.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	completed,
  	enteredinerror,
  	intended,
  	stopped,
  	onhold,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "intended" : { return intended.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum TakenEnum {
  	y,
  	n,
  	unk,
  	na,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "y" : { return y.toString(); }
  			case "n" : { return n.toString(); }
  			case "unk" : { return unk.toString(); }
  			case "na" : { return na.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}