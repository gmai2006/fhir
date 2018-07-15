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
import org.fhir.entity.MedicationDispenseModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicationDispense  extends DomainResource  {
  /**
  * Description: "This is a MedicationDispense resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The procedure that the dispense is done because of."
  */
  protected java.util.List<Reference> partOf;

  /**
  * Description: "A code specifying the state of the set of dispense events."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Indicates type of medication dispense and where the medication is expected to be consumed or administered."
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
  * Description: "A link to a resource representing the person or the group to whom the medication will be given."
  */
  protected Reference subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this event."
  */
  protected Reference context;

  /**
  * Description: "Additional information that supports the medication being dispensed."
  */
  protected java.util.List<Reference> supportingInformation;

  /**
  * Description: "Indicates who or what performed the event.  It should be assumed that the performer is the dispenser of the medication."
  */
  protected java.util.List<MedicationDispensePerformer> performer;

  /**
  * Description: "Indicates the medication order that is being dispensed against."
  */
  protected java.util.List<Reference> authorizingPrescription;

  /**
  * Description: "Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc."
  */
  protected CodeableConcept type;

  /**
  * Description: "The amount of medication that has been dispensed. Includes unit of measure."
  */
  protected Quantity quantity;

  /**
  * Description: "The amount of medication expressed as a timing amount."
  */
  protected Quantity daysSupply;

  /**
  * Description: "The time when the dispensed product was packaged and reviewed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String whenPrepared;

  /**
  * Description: "Extensions for whenPrepared"
  */
  protected transient Element _whenPrepared;

  /**
  * Description: "The time the dispensed product was provided to the patient or their representative."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String whenHandedOver;

  /**
  * Description: "Extensions for whenHandedOver"
  */
  protected transient Element _whenHandedOver;

  /**
  * Description: "Identification of the facility/location where the medication was shipped to, as part of the dispense event."
  */
  protected Reference destination;

  /**
  * Description: "Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional."
  */
  protected java.util.List<Reference> receiver;

  /**
  * Description: "Extra information about the dispense that could not be conveyed in the other attributes."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Indicates how the medication is to be used by the patient."
  */
  protected java.util.List<Dosage> dosageInstruction;

  /**
  * Description: "Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done."
  */
  protected MedicationDispenseSubstitution substitution;

  /**
  * Description: "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc."
  */
  protected java.util.List<Reference> detectedIssue;

  /**
  * Description: "True if the dispense was not performed for some reason."
  */
  protected Boolean notDone;

  /**
  * Description: "Extensions for notDone"
  */
  protected transient Element _notDone;

  /**
  * Description: "Indicates the reason why a dispense was not performed."
  */
  protected CodeableConcept notDoneReasonCodeableConcept;

  /**
  * Description: "Indicates the reason why a dispense was not performed."
  */
  protected Reference notDoneReasonReference;

  /**
  * Description: "A summary of the events of interest that have occurred, such as when the dispense was verified."
  */
  protected java.util.List<Reference> eventHistory;

  public MedicationDispense() {
  }

  public MedicationDispense(MedicationDispenseModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
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
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer = MedicationDispensePerformerHelper.fromArray2Array(o.getPerformer());
    }
    if (null != o.getAuthorizingPrescription() && !o.getAuthorizingPrescription().isEmpty()) {
    	this.authorizingPrescription = ReferenceHelper.fromArray2Array(o.getAuthorizingPrescription());
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getDaysSupply() && !o.getDaysSupply().isEmpty()) {
      this.daysSupply = new Quantity(o.getDaysSupply().get(0));
    }
    if (null != o.getWhenPrepared()) {
      this.whenPrepared = o.getWhenPrepared();
    }
    if (null != o.getWhenHandedOver()) {
      this.whenHandedOver = o.getWhenHandedOver();
    }
    if (null != o.getDestination() && !o.getDestination().isEmpty()) {
      this.destination = new Reference(o.getDestination().get(0));
    }
    if (null != o.getReceiver() && !o.getReceiver().isEmpty()) {
    	this.receiver = ReferenceHelper.fromArray2Array(o.getReceiver());
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
    if (null != o.getDosageInstruction() && !o.getDosageInstruction().isEmpty()) {
    	this.dosageInstruction = DosageHelper.fromArray2Array(o.getDosageInstruction());
    }
    if (null != o.getSubstitution() && !o.getSubstitution().isEmpty()) {
      this.substitution = new MedicationDispenseSubstitution(o.getSubstitution().get(0));
    }
    if (null != o.getDetectedIssue() && !o.getDetectedIssue().isEmpty()) {
    	this.detectedIssue = ReferenceHelper.fromArray2Array(o.getDetectedIssue());
    }
    if (null != o.getNotDone()) {
      this.notDone = o.getNotDone();
    }
    if (null != o.getNotDoneReasonCodeableConcept() && !o.getNotDoneReasonCodeableConcept().isEmpty()) {
      this.notDoneReasonCodeableConcept = new CodeableConcept(o.getNotDoneReasonCodeableConcept().get(0));
    }
    if (null != o.getNotDoneReasonReference() && !o.getNotDoneReasonReference().isEmpty()) {
      this.notDoneReasonReference = new Reference(o.getNotDoneReasonReference().get(0));
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
  public void setPerformer( java.util.List<MedicationDispensePerformer> value) {
    this.performer = value;
  }
  public java.util.List<MedicationDispensePerformer> getPerformer() {
    return this.performer;
  }
  public void setAuthorizingPrescription( java.util.List<Reference> value) {
    this.authorizingPrescription = value;
  }
  public java.util.List<Reference> getAuthorizingPrescription() {
    return this.authorizingPrescription;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setDaysSupply( Quantity value) {
    this.daysSupply = value;
  }
  public Quantity getDaysSupply() {
    return this.daysSupply;
  }
  public void setWhenPrepared( String value) {
    this.whenPrepared = value;
  }
  public String getWhenPrepared() {
    return this.whenPrepared;
  }
  public void set_whenPrepared( Element value) {
    this._whenPrepared = value;
  }
  public Element get_whenPrepared() {
    return this._whenPrepared;
  }
  public void setWhenHandedOver( String value) {
    this.whenHandedOver = value;
  }
  public String getWhenHandedOver() {
    return this.whenHandedOver;
  }
  public void set_whenHandedOver( Element value) {
    this._whenHandedOver = value;
  }
  public Element get_whenHandedOver() {
    return this._whenHandedOver;
  }
  public void setDestination( Reference value) {
    this.destination = value;
  }
  public Reference getDestination() {
    return this.destination;
  }
  public void setReceiver( java.util.List<Reference> value) {
    this.receiver = value;
  }
  public java.util.List<Reference> getReceiver() {
    return this.receiver;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setDosageInstruction( java.util.List<Dosage> value) {
    this.dosageInstruction = value;
  }
  public java.util.List<Dosage> getDosageInstruction() {
    return this.dosageInstruction;
  }
  public void setSubstitution( MedicationDispenseSubstitution value) {
    this.substitution = value;
  }
  public MedicationDispenseSubstitution getSubstitution() {
    return this.substitution;
  }
  public void setDetectedIssue( java.util.List<Reference> value) {
    this.detectedIssue = value;
  }
  public java.util.List<Reference> getDetectedIssue() {
    return this.detectedIssue;
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
  public void setNotDoneReasonCodeableConcept( CodeableConcept value) {
    this.notDoneReasonCodeableConcept = value;
  }
  public CodeableConcept getNotDoneReasonCodeableConcept() {
    return this.notDoneReasonCodeableConcept;
  }
  public void setNotDoneReasonReference( Reference value) {
    this.notDoneReasonReference = value;
  }
  public Reference getNotDoneReasonReference() {
    return this.notDoneReasonReference;
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
    builder.append("[MedicationDispense]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.medicationCodeableConcept != null) builder.append("medicationCodeableConcept" + "->" + this.medicationCodeableConcept.toString() + "\n"); 
     if(this.medicationReference != null) builder.append("medicationReference" + "->" + this.medicationReference.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.supportingInformation != null) builder.append("supportingInformation" + "->" + this.supportingInformation.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.authorizingPrescription != null) builder.append("authorizingPrescription" + "->" + this.authorizingPrescription.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.daysSupply != null) builder.append("daysSupply" + "->" + this.daysSupply.toString() + "\n"); 
     if(this.whenPrepared != null) builder.append("whenPrepared" + "->" + this.whenPrepared.toString() + "\n"); 
     if(this._whenPrepared != null) builder.append("_whenPrepared" + "->" + this._whenPrepared.toString() + "\n"); 
     if(this.whenHandedOver != null) builder.append("whenHandedOver" + "->" + this.whenHandedOver.toString() + "\n"); 
     if(this._whenHandedOver != null) builder.append("_whenHandedOver" + "->" + this._whenHandedOver.toString() + "\n"); 
     if(this.destination != null) builder.append("destination" + "->" + this.destination.toString() + "\n"); 
     if(this.receiver != null) builder.append("receiver" + "->" + this.receiver.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.dosageInstruction != null) builder.append("dosageInstruction" + "->" + this.dosageInstruction.toString() + "\n"); 
     if(this.substitution != null) builder.append("substitution" + "->" + this.substitution.toString() + "\n"); 
     if(this.detectedIssue != null) builder.append("detectedIssue" + "->" + this.detectedIssue.toString() + "\n"); 
     if(this.notDone != null) builder.append("notDone" + "->" + this.notDone.toString() + "\n"); 
     if(this._notDone != null) builder.append("_notDone" + "->" + this._notDone.toString() + "\n"); 
     if(this.notDoneReasonCodeableConcept != null) builder.append("notDoneReasonCodeableConcept" + "->" + this.notDoneReasonCodeableConcept.toString() + "\n"); 
     if(this.notDoneReasonReference != null) builder.append("notDoneReasonReference" + "->" + this.notDoneReasonReference.toString() + "\n"); 
     if(this.eventHistory != null) builder.append("eventHistory" + "->" + this.eventHistory.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	MedicationDispense,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "MedicationDispense" : { return MedicationDispense.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StatusEnum {
  	preparation,
  	inprogress,
  	onhold,
  	completed,
  	enteredinerror,
  	stopped,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "preparation" : { return preparation.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}