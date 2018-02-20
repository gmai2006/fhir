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
import org.fhir.entity.MedicationAdministrationModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
*/
public class MedicationAdministration  extends DomainResource  {
  /**
  * Description: "This is a MedicationAdministration resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this event."
  */
  protected java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "A larger event of which this particular event is a component or step."
  */
  protected java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Indicates the type of medication administration and where the medication is expected to be consumed or administered."
  */
  protected CodeableConcept category;

  /**
  * Description: "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  protected CodeableConcept medicationCodeableConcept;

  /**
  * Description: "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  protected Reference medicationReference;

  /**
  * Description: "The person or animal or group receiving the medication."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "The visit, admission or other contact between patient and health care provider the medication administration was performed as part of."
  */
  protected Reference context;

  /**
  * Description: "Additional information (for example, patient height and weight) that supports the administration of the medication."
  */
  protected java.util.List<Reference> supportingInformation = new java.util.ArrayList<>();

  /**
  * Description: "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  protected transient Element _effectiveDateTime;

  /**
  * Description: "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate."
  */
  protected Period effectivePeriod;

  /**
  * Description: "The individual who was responsible for giving the medication to the patient."
  */
  protected java.util.List<MedicationAdministrationPerformer> performer = new java.util.ArrayList<>();

  /**
  * Description: "Set this to true if the record is saying that the medication was NOT administered."
  */
  protected Boolean notGiven;

  /**
  * Description: "Extensions for notGiven"
  */
  protected transient Element _notGiven;

  /**
  * Description: "A code indicating why the administration was not performed."
  */
  protected java.util.List<CodeableConcept> reasonNotGiven = new java.util.ArrayList<>();

  /**
  * Description: "A code indicating why the medication was given."
  */
  protected java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Condition or observation that supports why the medication was administered."
  */
  protected java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "The original request, instruction or authority to perform the administration."
  */
  protected Reference prescription;

  /**
  * Description: "The device used in administering the medication to the patient.  For example, a particular infusion pump."
  */
  protected java.util.List<Reference> device = new java.util.ArrayList<>();

  /**
  * Description: "Extra information about the medication administration that is not conveyed by the other attributes."
  */
  protected java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Describes the medication dosage information details e.g. dose, rate, site, route, etc."
  */
  protected MedicationAdministrationDosage dosage;

  /**
  * Description: "A summary of the events of interest that have occurred, such as when the administration was verified."
  */
  protected java.util.List<Reference> eventHistory = new java.util.ArrayList<>();

  public MedicationAdministration() {
  }

  public MedicationAdministration(MedicationAdministrationModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition = ReferenceHelper.fromArray2Array(o.getDefinition());
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partOf = ReferenceHelper.fromArray2Array(o.getPartOf());
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
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getSupportingInformation() && !o.getSupportingInformation().isEmpty()) {
    	this.supportingInformation = ReferenceHelper.fromArray2Array(o.getSupportingInformation());
    }
    if (null != o.getEffectiveDateTime()) {
      this.effectiveDateTime = o.getEffectiveDateTime();
    }
    this.effectivePeriod = PeriodHelper.fromJson(o.getEffectivePeriod());
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer = MedicationAdministrationPerformerHelper.fromArray2Array(o.getPerformer());
    }
    if (null != o.getNotGiven()) {
      this.notGiven = o.getNotGiven();
    }
    if (null != o.getReasonNotGiven() && !o.getReasonNotGiven().isEmpty()) {
    	this.reasonNotGiven = CodeableConceptHelper.fromArray2Array(o.getReasonNotGiven());
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasonCode = CodeableConceptHelper.fromArray2Array(o.getReasonCode());
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (null != o.getPrescription() && !o.getPrescription().isEmpty()) {
      this.prescription = new Reference(o.getPrescription().get(0));
    }
    if (null != o.getDevice() && !o.getDevice().isEmpty()) {
    	this.device = ReferenceHelper.fromArray2Array(o.getDevice());
    }
    if (null != o.getDosage() && !o.getDosage().isEmpty()) {
      this.dosage = new MedicationAdministrationDosage(o.getDosage().get(0));
    }
    if (null != o.getEventHistory() && !o.getEventHistory().isEmpty()) {
    	this.eventHistory = ReferenceHelper.fromArray2Array(o.getEventHistory());
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
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
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
  public void setSupportingInformation( java.util.List<Reference> value) {
    this.supportingInformation = value;
  }
  public java.util.List<Reference> getSupportingInformation() {
    return this.supportingInformation;
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
  public void setPerformer( java.util.List<MedicationAdministrationPerformer> value) {
    this.performer = value;
  }
  public java.util.List<MedicationAdministrationPerformer> getPerformer() {
    return this.performer;
  }
  public void setNotGiven( Boolean value) {
    this.notGiven = value;
  }
  public Boolean getNotGiven() {
    return this.notGiven;
  }
  public void set_notGiven( Element value) {
    this._notGiven = value;
  }
  public Element get_notGiven() {
    return this._notGiven;
  }
  public void setReasonNotGiven( java.util.List<CodeableConcept> value) {
    this.reasonNotGiven = value;
  }
  public java.util.List<CodeableConcept> getReasonNotGiven() {
    return this.reasonNotGiven;
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
  public void setPrescription( Reference value) {
    this.prescription = value;
  }
  public Reference getPrescription() {
    return this.prescription;
  }
  public void setDevice( java.util.List<Reference> value) {
    this.device = value;
  }
  public java.util.List<Reference> getDevice() {
    return this.device;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setDosage( MedicationAdministrationDosage value) {
    this.dosage = value;
  }
  public MedicationAdministrationDosage getDosage() {
    return this.dosage;
  }
  public void setEventHistory( java.util.List<Reference> value) {
    this.eventHistory = value;
  }
  public java.util.List<Reference> getEventHistory() {
    return this.eventHistory;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationAdministration]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.medicationCodeableConcept != null) builder.append("medicationCodeableConcept" + "->" + this.medicationCodeableConcept.toString() + "\n"); 
     if(this.medicationReference != null) builder.append("medicationReference" + "->" + this.medicationReference.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.supportingInformation != null) builder.append("supportingInformation" + "->" + this.supportingInformation.toString() + "\n"); 
     if(this.effectiveDateTime != null) builder.append("effectiveDateTime" + "->" + this.effectiveDateTime.toString() + "\n"); 
     if(this._effectiveDateTime != null) builder.append("_effectiveDateTime" + "->" + this._effectiveDateTime.toString() + "\n"); 
     if(this.effectivePeriod != null) builder.append("effectivePeriod" + "->" + this.effectivePeriod.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.notGiven != null) builder.append("notGiven" + "->" + this.notGiven.toString() + "\n"); 
     if(this._notGiven != null) builder.append("_notGiven" + "->" + this._notGiven.toString() + "\n"); 
     if(this.reasonNotGiven != null) builder.append("reasonNotGiven" + "->" + this.reasonNotGiven.toString() + "\n"); 
     if(this.reasonCode != null) builder.append("reasonCode" + "->" + this.reasonCode.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.prescription != null) builder.append("prescription" + "->" + this.prescription.toString() + "\n"); 
     if(this.device != null) builder.append("device" + "->" + this.device.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.dosage != null) builder.append("dosage" + "->" + this.dosage.toString() + "\n"); 
     if(this.eventHistory != null) builder.append("eventHistory" + "->" + this.eventHistory.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	MedicationAdministration,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "MedicationAdministration" : { return MedicationAdministration.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	inprogress,
  	onhold,
  	completed,
  	enteredinerror,
  	stopped,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "inprogress" : { return inprogress.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}