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
import com.google.gson.GsonBuilder;

/**
* "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
*/
public class MedicationRequest  {
  /**
  * Description: "This is a MedicationRequest resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. For example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records must be tracked through an entire system."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Protocol or definition followed by this request."
  */
  private java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "A plan or request that is fulfilled in whole or in part by this medication request."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription."
  */
  private Identifier groupIdentifier;

  /**
  * Description: "A code specifying the current state of the order.  Generally this will be active or completed state."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Whether the request is a proposal, plan, or an original order."
  */
  private String intent;

  /**
  * Description: "Extensions for intent"
  */
  private transient Element _intent;

  /**
  * Description: "Indicates the type of medication order and where the medication is expected to be consumed or administered."
  */
  private CodeableConcept category;

  /**
  * Description: "Indicates how quickly the Medication Request should be addressed with respect to other requests."
  */
  private String priority;

  /**
  * Description: "Extensions for priority"
  */
  private transient Element _priority;

  /**
  * Description: "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
  */
  private CodeableConcept medicationCodeableConcept;

  /**
  * Description: "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
  */
  private Reference medicationReference;

  /**
  * Description: "A link to a resource representing the person or set of individuals to whom the medication will be given."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "A link to an encounter, or episode of care, that identifies the particular occurrence or set occurrences of contact between patient and health care provider."
  */
  private Reference context;

  /**
  * Description: "Include additional information (for example, patient height and weight) that supports the ordering of the medication."
  */
  private java.util.List<Reference> supportingInformation = new java.util.ArrayList<>();

  /**
  * Description: "The date (and perhaps time) when the prescription was initially written or authored on."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  private transient Element _authoredOn;

  /**
  * Description: "The individual, organization or device that initiated the request and has responsibility for its activation."
  */
  private MedicationRequestRequester requester;

  /**
  * Description: "The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order."
  */
  private Reference recorder;

  /**
  * Description: "The reason or the indication for ordering the medication."
  */
  private java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Condition or observation that supports why the medication was ordered."
  */
  private java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "Extra information about the prescription that could not be conveyed by the other attributes."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Indicates how the medication is to be used by the patient."
  */
  private java.util.List<Dosage> dosageInstruction = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department."
  */
  private MedicationRequestDispenseRequest dispenseRequest;

  /**
  * Description: "Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done."
  */
  private MedicationRequestSubstitution substitution;

  /**
  * Description: "A link to a resource representing an earlier order related order or prescription."
  */
  private Reference priorPrescription;

  /**
  * Description: "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc."
  */
  private java.util.List<Reference> detectedIssue = new java.util.ArrayList<>();

  /**
  * Description: "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource."
  */
  private java.util.List<Reference> eventHistory = new java.util.ArrayList<>();

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

  public MedicationRequest() {
  }

  public MedicationRequest(MedicationRequestModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.definition = Reference.fromArray(o.getDefinition());

      this.basedOn = Reference.fromArray(o.getBasedOn());

      this.groupIdentifier = Identifier.fromJson(o.getGroupIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getIntent()) {
        this.intent = new String(o.getIntent());
      }

      this.category = CodeableConcept.fromJson(o.getCategory());
      if (null != o.getPriority()) {
        this.priority = new String(o.getPriority());
      }

      this.medicationCodeableConcept = CodeableConcept.fromJson(o.getMedicationCodeableConcept());
      if (null != o.getMedicationReference()) {
        this.medicationReference = new Reference(o.getMedicationReference());
        this.medicationReference.setId(this.getId());
      }

      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      this.supportingInformation = Reference.fromArray(o.getSupportingInformation());

      if (null != o.getAuthoredOn()) {
        this.authoredOn = new String(o.getAuthoredOn());
      }

      if (null != o.getRequester()) {
        this.requester = new MedicationRequestRequester(o.getRequester());
        this.requester.setId(this.getId());
      }

      if (null != o.getRecorder()) {
        this.recorder = new Reference(o.getRecorder());
        this.recorder.setId(this.getId());
      }

      this.reasonCode = CodeableConcept.fromArray(o.getReasonCode());
      this.reasonReference = Reference.fromArray(o.getReasonReference());

      this.note = Annotation.fromArray(o.getNote());
      this.dosageInstruction = Dosage.fromArray(o.getDosageInstruction());

      if (null != o.getDispenseRequest()) {
        this.dispenseRequest = new MedicationRequestDispenseRequest(o.getDispenseRequest());
        this.dispenseRequest.setId(this.getId());
      }

      if (null != o.getSubstitution()) {
        this.substitution = new MedicationRequestSubstitution(o.getSubstitution());
        this.substitution.setId(this.getId());
      }

      if (null != o.getPriorPrescription()) {
        this.priorPrescription = new Reference(o.getPriorPrescription());
        this.priorPrescription.setId(this.getId());
      }

      this.detectedIssue = Reference.fromArray(o.getDetectedIssue());

      this.eventHistory = Reference.fromArray(o.getEventHistory());

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
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("groupIdentifier" + "[" + String.valueOf(this.groupIdentifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("_intent" + "[" + String.valueOf(this._intent) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("_priority" + "[" + String.valueOf(this._priority) + "]\n"); 
     builder.append("medicationCodeableConcept" + "[" + String.valueOf(this.medicationCodeableConcept) + "]\n"); 
     builder.append("medicationReference" + "[" + String.valueOf(this.medicationReference) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("supportingInformation" + "[" + String.valueOf(this.supportingInformation) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("_authoredOn" + "[" + String.valueOf(this._authoredOn) + "]\n"); 
     builder.append("requester" + "[" + String.valueOf(this.requester) + "]\n"); 
     builder.append("recorder" + "[" + String.valueOf(this.recorder) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("dosageInstruction" + "[" + String.valueOf(this.dosageInstruction) + "]\n"); 
     builder.append("dispenseRequest" + "[" + String.valueOf(this.dispenseRequest) + "]\n"); 
     builder.append("substitution" + "[" + String.valueOf(this.substitution) + "]\n"); 
     builder.append("priorPrescription" + "[" + String.valueOf(this.priorPrescription) + "]\n"); 
     builder.append("detectedIssue" + "[" + String.valueOf(this.detectedIssue) + "]\n"); 
     builder.append("eventHistory" + "[" + String.valueOf(this.eventHistory) + "]\n"); 
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

  public static java.util.List<MedicationRequest> fromArray(java.util.List<MedicationRequestModel> list) {
    return (java.util.List<MedicationRequest>)list.stream()
      .map(model -> new MedicationRequest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MedicationRequestModel> toModelArray(java.util.List<MedicationRequest> list) {
    return (java.util.List<MedicationRequestModel>)list.stream()
      .map(model -> new MedicationRequestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MedicationRequest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MedicationRequest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MedicationRequest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MedicationRequest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}