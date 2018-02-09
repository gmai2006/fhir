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
import com.google.gson.GsonBuilder;

/**
* "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
*/
public class MedicationDispense  {
  /**
  * Description: "This is a MedicationDispense resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The procedure that the dispense is done because of."
  */
  private java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "A code specifying the state of the set of dispense events."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Indicates type of medication dispense and where the medication is expected to be consumed or administered."
  */
  private CodeableConcept category;

  /**
  * Description: "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  private CodeableConcept medicationCodeableConcept;

  /**
  * Description: "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  private Reference medicationReference;

  /**
  * Description: "A link to a resource representing the person or the group to whom the medication will be given."
  */
  private Reference subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this event."
  */
  private Reference context;

  /**
  * Description: "Additional information that supports the medication being dispensed."
  */
  private java.util.List<Reference> supportingInformation = new java.util.ArrayList<>();

  /**
  * Description: "Indicates who or what performed the event.  It should be assumed that the performer is the dispenser of the medication."
  */
  private java.util.List<MedicationDispensePerformer> performer = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the medication order that is being dispensed against."
  */
  private java.util.List<Reference> authorizingPrescription = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc."
  */
  private CodeableConcept type;

  /**
  * Description: "The amount of medication that has been dispensed. Includes unit of measure."
  */
  private Quantity quantity;

  /**
  * Description: "The amount of medication expressed as a timing amount."
  */
  private Quantity daysSupply;

  /**
  * Description: "The time when the dispensed product was packaged and reviewed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String whenPrepared;

  /**
  * Description: "Extensions for whenPrepared"
  */
  private transient Element _whenPrepared;

  /**
  * Description: "The time the dispensed product was provided to the patient or their representative."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String whenHandedOver;

  /**
  * Description: "Extensions for whenHandedOver"
  */
  private transient Element _whenHandedOver;

  /**
  * Description: "Identification of the facility/location where the medication was shipped to, as part of the dispense event."
  */
  private Reference destination;

  /**
  * Description: "Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional."
  */
  private java.util.List<Reference> receiver = new java.util.ArrayList<>();

  /**
  * Description: "Extra information about the dispense that could not be conveyed in the other attributes."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Indicates how the medication is to be used by the patient."
  */
  private java.util.List<Dosage> dosageInstruction = new java.util.ArrayList<>();

  /**
  * Description: "Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done."
  */
  private MedicationDispenseSubstitution substitution;

  /**
  * Description: "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc."
  */
  private java.util.List<Reference> detectedIssue = new java.util.ArrayList<>();

  /**
  * Description: "True if the dispense was not performed for some reason."
  */
  private Boolean notDone;

  /**
  * Description: "Extensions for notDone"
  */
  private transient Element _notDone;

  /**
  * Description: "Indicates the reason why a dispense was not performed."
  */
  private CodeableConcept notDoneReasonCodeableConcept;

  /**
  * Description: "Indicates the reason why a dispense was not performed."
  */
  private Reference notDoneReasonReference;

  /**
  * Description: "A summary of the events of interest that have occurred, such as when the dispense was verified."
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

  public MedicationDispense() {
  }

  public MedicationDispense(MedicationDispenseModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.partOf = Reference.fromArray(o.getPartOf());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.category = CodeableConcept.fromJson(o.getCategory());
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

      this.performer = MedicationDispensePerformer.fromArray(o.getPerformer());

      this.authorizingPrescription = Reference.fromArray(o.getAuthorizingPrescription());

      this.type = CodeableConcept.fromJson(o.getType());
      this.quantity = Quantity.fromJson(o.getQuantity());
      this.daysSupply = Quantity.fromJson(o.getDaysSupply());
      if (null != o.getWhenPrepared()) {
        this.whenPrepared = new String(o.getWhenPrepared());
      }

      if (null != o.getWhenHandedOver()) {
        this.whenHandedOver = new String(o.getWhenHandedOver());
      }

      if (null != o.getDestination()) {
        this.destination = new Reference(o.getDestination());
        this.destination.setId(this.getId());
      }

      this.receiver = Reference.fromArray(o.getReceiver());

      this.note = Annotation.fromArray(o.getNote());
      this.dosageInstruction = Dosage.fromArray(o.getDosageInstruction());

      if (null != o.getSubstitution()) {
        this.substitution = new MedicationDispenseSubstitution(o.getSubstitution());
        this.substitution.setId(this.getId());
      }

      this.detectedIssue = Reference.fromArray(o.getDetectedIssue());

      if (null != o.getNotDone()) {
        this.notDone = new Boolean(o.getNotDone());
      }

      this.notDoneReasonCodeableConcept = CodeableConcept.fromJson(o.getNotDoneReasonCodeableConcept());
      if (null != o.getNotDoneReasonReference()) {
        this.notDoneReasonReference = new Reference(o.getNotDoneReasonReference());
        this.notDoneReasonReference.setId(this.getId());
      }

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
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("medicationCodeableConcept" + "[" + String.valueOf(this.medicationCodeableConcept) + "]\n"); 
     builder.append("medicationReference" + "[" + String.valueOf(this.medicationReference) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("supportingInformation" + "[" + String.valueOf(this.supportingInformation) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("authorizingPrescription" + "[" + String.valueOf(this.authorizingPrescription) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("daysSupply" + "[" + String.valueOf(this.daysSupply) + "]\n"); 
     builder.append("whenPrepared" + "[" + String.valueOf(this.whenPrepared) + "]\n"); 
     builder.append("_whenPrepared" + "[" + String.valueOf(this._whenPrepared) + "]\n"); 
     builder.append("whenHandedOver" + "[" + String.valueOf(this.whenHandedOver) + "]\n"); 
     builder.append("_whenHandedOver" + "[" + String.valueOf(this._whenHandedOver) + "]\n"); 
     builder.append("destination" + "[" + String.valueOf(this.destination) + "]\n"); 
     builder.append("receiver" + "[" + String.valueOf(this.receiver) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("dosageInstruction" + "[" + String.valueOf(this.dosageInstruction) + "]\n"); 
     builder.append("substitution" + "[" + String.valueOf(this.substitution) + "]\n"); 
     builder.append("detectedIssue" + "[" + String.valueOf(this.detectedIssue) + "]\n"); 
     builder.append("notDone" + "[" + String.valueOf(this.notDone) + "]\n"); 
     builder.append("_notDone" + "[" + String.valueOf(this._notDone) + "]\n"); 
     builder.append("notDoneReasonCodeableConcept" + "[" + String.valueOf(this.notDoneReasonCodeableConcept) + "]\n"); 
     builder.append("notDoneReasonReference" + "[" + String.valueOf(this.notDoneReasonReference) + "]\n"); 
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

  public static java.util.List<MedicationDispense> fromArray(java.util.List<MedicationDispenseModel> list) {
    return (java.util.List<MedicationDispense>)list.stream()
      .map(model -> new MedicationDispense(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MedicationDispenseModel> toModelArray(java.util.List<MedicationDispense> list) {
    return (java.util.List<MedicationDispenseModel>)list.stream()
      .map(model -> new MedicationDispenseModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MedicationDispense fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MedicationDispense.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MedicationDispense o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MedicationDispense> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}