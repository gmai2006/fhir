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
import org.fhir.entity.MedicationRequestModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicationRequest  extends DomainResource  {
  /**
  * Description: "This is a MedicationRequest resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "This records identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. For example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records must be tracked through an entire system."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Protocol or definition followed by this request."
  */
  protected java.util.List<Reference> definition;

  /**
  * Description: "A plan or request that is fulfilled in whole or in part by this medication request."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription."
  */
  protected Identifier groupIdentifier;

  /**
  * Description: "A code specifying the current state of the order.  Generally this will be active or completed state."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Whether the request is a proposal, plan, or an original order."
  */
  protected String intent;

  /**
  * Description: "Extensions for intent"
  */
  protected transient Element _intent;

  /**
  * Description: "Indicates the type of medication order and where the medication is expected to be consumed or administered."
  */
  protected CodeableConcept category;

  /**
  * Description: "Indicates how quickly the Medication Request should be addressed with respect to other requests."
  */
  protected String priority;

  /**
  * Description: "Extensions for priority"
  */
  protected transient Element _priority;

  /**
  * Description: "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
  */
  protected CodeableConcept medicationCodeableConcept;

  /**
  * Description: "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
  */
  protected Reference medicationReference;

  /**
  * Description: "A link to a resource representing the person or set of individuals to whom the medication will be given."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "A link to an encounter, or episode of care, that identifies the particular occurrence or set occurrences of contact between patient and health care provider."
  */
  protected Reference context;

  /**
  * Description: "Include additional information (for example, patient height and weight) that supports the ordering of the medication."
  */
  protected java.util.List<Reference> supportingInformation;

  /**
  * Description: "The date (and perhaps time) when the prescription was initially written or authored on."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  protected transient Element _authoredOn;

  /**
  * Description: "The individual, organization or device that initiated the request and has responsibility for its activation."
  */
  protected MedicationRequestRequester requester;

  /**
  * Description: "The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order."
  */
  protected Reference recorder;

  /**
  * Description: "The reason or the indication for ordering the medication."
  */
  protected java.util.List<CodeableConcept> reasonCode;

  /**
  * Description: "Condition or observation that supports why the medication was ordered."
  */
  protected java.util.List<Reference> reasonReference;

  /**
  * Description: "Extra information about the prescription that could not be conveyed by the other attributes."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Indicates how the medication is to be used by the patient."
  */
  protected java.util.List<Dosage> dosageInstruction;

  /**
  * Description: "Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department."
  */
  protected MedicationRequestDispenseRequest dispenseRequest;

  /**
  * Description: "Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done."
  */
  protected MedicationRequestSubstitution substitution;

  /**
  * Description: "A link to a resource representing an earlier order related order or prescription."
  */
  protected Reference priorPrescription;

  /**
  * Description: "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc."
  */
  protected java.util.List<Reference> detectedIssue;

  /**
  * Description: "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource."
  */
  protected java.util.List<Reference> eventHistory;

  public MedicationRequest() {
  }

  public MedicationRequest(MedicationRequestModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition = ReferenceHelper.fromArray2Array(o.getDefinition());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    this.groupIdentifier = IdentifierHelper.fromJson(o.getGroupIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getIntent()) {
      this.intent = o.getIntent();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
      this.category = new CodeableConcept(o.getCategory().get(0));
    }
    if (null != o.getPriority()) {
      this.priority = o.getPriority();
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
    if (null != o.getAuthoredOn()) {
      this.authoredOn = o.getAuthoredOn();
    }
    if (null != o.getRequester() && !o.getRequester().isEmpty()) {
      this.requester = new MedicationRequestRequester(o.getRequester().get(0));
    }
    if (null != o.getRecorder() && !o.getRecorder().isEmpty()) {
      this.recorder = new Reference(o.getRecorder().get(0));
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasonCode = CodeableConceptHelper.fromArray2Array(o.getReasonCode());
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (null != o.getDosageInstruction() && !o.getDosageInstruction().isEmpty()) {
    	this.dosageInstruction = DosageHelper.fromArray2Array(o.getDosageInstruction());
    }
    if (null != o.getDispenseRequest() && !o.getDispenseRequest().isEmpty()) {
      this.dispenseRequest = new MedicationRequestDispenseRequest(o.getDispenseRequest().get(0));
    }
    if (null != o.getSubstitution() && !o.getSubstitution().isEmpty()) {
      this.substitution = new MedicationRequestSubstitution(o.getSubstitution().get(0));
    }
    if (null != o.getPriorPrescription() && !o.getPriorPrescription().isEmpty()) {
      this.priorPrescription = new Reference(o.getPriorPrescription().get(0));
    }
    if (null != o.getDetectedIssue() && !o.getDetectedIssue().isEmpty()) {
    	this.detectedIssue = ReferenceHelper.fromArray2Array(o.getDetectedIssue());
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
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setGroupIdentifier( Identifier value) {
    this.groupIdentifier = value;
  }
  public Identifier getGroupIdentifier() {
    return this.groupIdentifier;
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
  public void setIntent( String value) {
    this.intent = IntentEnum.fromCode(value);
  }
  public String getIntent() {
    return this.intent;
  }
  public void set_intent( Element value) {
    this._intent = value;
  }
  public Element get_intent() {
    return this._intent;
  }
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setPriority( String value) {
    this.priority = PriorityEnum.fromCode(value);
  }
  public String getPriority() {
    return this.priority;
  }
  public void set_priority( Element value) {
    this._priority = value;
  }
  public Element get_priority() {
    return this._priority;
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
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void set_authoredOn( Element value) {
    this._authoredOn = value;
  }
  public Element get_authoredOn() {
    return this._authoredOn;
  }
  public void setRequester( MedicationRequestRequester value) {
    this.requester = value;
  }
  public MedicationRequestRequester getRequester() {
    return this.requester;
  }
  public void setRecorder( Reference value) {
    this.recorder = value;
  }
  public Reference getRecorder() {
    return this.recorder;
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
  public void setDosageInstruction( java.util.List<Dosage> value) {
    this.dosageInstruction = value;
  }
  public java.util.List<Dosage> getDosageInstruction() {
    return this.dosageInstruction;
  }
  public void setDispenseRequest( MedicationRequestDispenseRequest value) {
    this.dispenseRequest = value;
  }
  public MedicationRequestDispenseRequest getDispenseRequest() {
    return this.dispenseRequest;
  }
  public void setSubstitution( MedicationRequestSubstitution value) {
    this.substitution = value;
  }
  public MedicationRequestSubstitution getSubstitution() {
    return this.substitution;
  }
  public void setPriorPrescription( Reference value) {
    this.priorPrescription = value;
  }
  public Reference getPriorPrescription() {
    return this.priorPrescription;
  }
  public void setDetectedIssue( java.util.List<Reference> value) {
    this.detectedIssue = value;
  }
  public java.util.List<Reference> getDetectedIssue() {
    return this.detectedIssue;
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
    builder.append("[MedicationRequest]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.groupIdentifier != null) builder.append("groupIdentifier" + "->" + this.groupIdentifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.intent != null) builder.append("intent" + "->" + this.intent.toString() + "\n"); 
     if(this._intent != null) builder.append("_intent" + "->" + this._intent.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this._priority != null) builder.append("_priority" + "->" + this._priority.toString() + "\n"); 
     if(this.medicationCodeableConcept != null) builder.append("medicationCodeableConcept" + "->" + this.medicationCodeableConcept.toString() + "\n"); 
     if(this.medicationReference != null) builder.append("medicationReference" + "->" + this.medicationReference.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.supportingInformation != null) builder.append("supportingInformation" + "->" + this.supportingInformation.toString() + "\n"); 
     if(this.authoredOn != null) builder.append("authoredOn" + "->" + this.authoredOn.toString() + "\n"); 
     if(this._authoredOn != null) builder.append("_authoredOn" + "->" + this._authoredOn.toString() + "\n"); 
     if(this.requester != null) builder.append("requester" + "->" + this.requester.toString() + "\n"); 
     if(this.recorder != null) builder.append("recorder" + "->" + this.recorder.toString() + "\n"); 
     if(this.reasonCode != null) builder.append("reasonCode" + "->" + this.reasonCode.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.dosageInstruction != null) builder.append("dosageInstruction" + "->" + this.dosageInstruction.toString() + "\n"); 
     if(this.dispenseRequest != null) builder.append("dispenseRequest" + "->" + this.dispenseRequest.toString() + "\n"); 
     if(this.substitution != null) builder.append("substitution" + "->" + this.substitution.toString() + "\n"); 
     if(this.priorPrescription != null) builder.append("priorPrescription" + "->" + this.priorPrescription.toString() + "\n"); 
     if(this.detectedIssue != null) builder.append("detectedIssue" + "->" + this.detectedIssue.toString() + "\n"); 
     if(this.eventHistory != null) builder.append("eventHistory" + "->" + this.eventHistory.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	MedicationRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "MedicationRequest" : { return MedicationRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	onhold,
  	cancelled,
  	completed,
  	enteredinerror,
  	stopped,
  	draft,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			case "draft" : { return draft.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum IntentEnum {
  	proposal,
  	plan,
  	order,
  	instanceorder,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "proposal" : { return proposal.toString(); }
  			case "plan" : { return plan.toString(); }
  			case "order" : { return order.toString(); }
  			case "instanceorder" : { return instanceorder.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum PriorityEnum {
  	routine,
  	urgent,
  	stat,
  	asap,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "routine" : { return routine.toString(); }
  			case "urgent" : { return urgent.toString(); }
  			case "stat" : { return stat.toString(); }
  			case "asap" : { return asap.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}