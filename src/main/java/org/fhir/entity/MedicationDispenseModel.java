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
/**
* "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
*/
@Entity
@Table(name="medicationdispense")
public class MedicationDispenseModel  implements Serializable {
	private static final long serialVersionUID = 151857669668374165L;
  /**
  * Description: "This is a MedicationDispense resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The procedure that the dispense is done because of."
  */
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="partof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf;

  /**
  * Description: "A code specifying the state of the set of dispense events."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Indicates type of medication dispense and where the medication is expected to be consumed or administered."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"medicationCodeableConcept\"", length = 16777215)
  private String medicationCodeableConcept;

  /**
  * Description: "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  @javax.persistence.Basic
  @Column(name="\"medicationreference_id\"")
  private String medicationreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="medicationreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> medicationReference;

  /**
  * Description: "A link to a resource representing the person or the group to whom the medication will be given."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this event."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "Additional information that supports the medication being dispensed."
  */
  @javax.persistence.Basic
  @Column(name="\"supportinginformation_id\"")
  private String supportinginformation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="supportinginformation_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInformation;

  /**
  * Description: "Indicates who or what performed the event.  It should be assumed that the performer is the dispenser of the medication."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="performer_id", insertable=false, updatable=false)
  private java.util.List<MedicationDispensePerformerModel> performer;

  /**
  * Description: "Indicates the medication order that is being dispensed against."
  */
  @javax.persistence.Basic
  @Column(name="\"authorizingprescription_id\"")
  private String authorizingprescription_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="authorizingprescription_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> authorizingPrescription;

  /**
  * Description: "Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The amount of medication that has been dispensed. Includes unit of measure."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "The amount of medication expressed as a timing amount."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"daysSupply\"", length = 16777215)
  private String daysSupply;

  /**
  * Description: "The time when the dispensed product was packaged and reviewed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"whenPrepared\"")
  private String whenPrepared;

  /**
  * Description: "The time the dispensed product was provided to the patient or their representative."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"whenHandedOver\"")
  private String whenHandedOver;

  /**
  * Description: "Identification of the facility/location where the medication was shipped to, as part of the dispense event."
  */
  @javax.persistence.Basic
  @Column(name="\"destination_id\"")
  private String destination_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="destination_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> destination;

  /**
  * Description: "Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional."
  */
  @javax.persistence.Basic
  @Column(name="\"receiver_id\"")
  private String receiver_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="receiver_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> receiver;

  /**
  * Description: "Extra information about the dispense that could not be conveyed in the other attributes."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Indicates how the medication is to be used by the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"dosageinstruction_id\"")
  private String dosageinstruction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dosageinstruction_id", insertable=false, updatable=false)
  private java.util.List<DosageModel> dosageInstruction;

  /**
  * Description: "Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done."
  */
  @javax.persistence.Basic
  @Column(name="\"substitution_id\"")
  private String substitution_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="substitution_id", insertable=false, updatable=false)
  private java.util.List<MedicationDispenseSubstitutionModel> substitution;

  /**
  * Description: "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc."
  */
  @javax.persistence.Basic
  @Column(name="\"detectedissue_id\"")
  private String detectedissue_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="detectedissue_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> detectedIssue;

  /**
  * Description: "True if the dispense was not performed for some reason."
  */
  @javax.persistence.Basic
  @Column(name="\"notDone\"")
  private Boolean notDone;

  /**
  * Description: "Indicates the reason why a dispense was not performed."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"notDoneReasonCodeableConcept\"", length = 16777215)
  private String notDoneReasonCodeableConcept;

  /**
  * Description: "Indicates the reason why a dispense was not performed."
  */
  @javax.persistence.Basic
  @Column(name="\"notdonereasonreference_id\"")
  private String notdonereasonreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="notdonereasonreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> notDoneReasonReference;

  /**
  * Description: "A summary of the events of interest that have occurred, such as when the dispense was verified."
  */
  @javax.persistence.Basic
  @Column(name="\"eventhistory_id\"")
  private String eventhistory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="eventhistory_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> eventHistory;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public MedicationDispenseModel() {
  }

  public MedicationDispenseModel(MedicationDispense o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partof_id = "partof" + this.id;
    	this.partOf = ReferenceHelper.toModelFromArray(o.getPartOf(), this.partof_id);
    }
    this.status = o.getStatus();
    this.category = CodeableConceptHelper.toJson(o.getCategory());
    this.medicationCodeableConcept = CodeableConceptHelper.toJson(o.getMedicationCodeableConcept());
    if (null != o.getMedicationReference() ) {
    	this.medicationreference_id = "medicationreference" + this.id;
    	this.medicationReference = ReferenceHelper.toModel(o.getMedicationReference(), this.medicationreference_id);
    }
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    if (null != o.getSupportingInformation() && !o.getSupportingInformation().isEmpty()) {
    	this.supportinginformation_id = "supportinginformation" + this.id;
    	this.supportingInformation = ReferenceHelper.toModelFromArray(o.getSupportingInformation(), this.supportinginformation_id);
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer_id = "performer" + this.id;
    	this.performer = MedicationDispensePerformerHelper.toModelFromArray(o.getPerformer(), this.performer_id);
    }
    if (null != o.getAuthorizingPrescription() && !o.getAuthorizingPrescription().isEmpty()) {
    	this.authorizingprescription_id = "authorizingprescription" + this.id;
    	this.authorizingPrescription = ReferenceHelper.toModelFromArray(o.getAuthorizingPrescription(), this.authorizingprescription_id);
    }
    this.type = CodeableConceptHelper.toJson(o.getType());
    this.quantity = QuantityHelper.toJson(o.getQuantity());
    this.daysSupply = QuantityHelper.toJson(o.getDaysSupply());
    this.whenPrepared = o.getWhenPrepared();
    this.whenHandedOver = o.getWhenHandedOver();
    if (null != o.getDestination() ) {
    	this.destination_id = "destination" + this.id;
    	this.destination = ReferenceHelper.toModel(o.getDestination(), this.destination_id);
    }
    if (null != o.getReceiver() && !o.getReceiver().isEmpty()) {
    	this.receiver_id = "receiver" + this.id;
    	this.receiver = ReferenceHelper.toModelFromArray(o.getReceiver(), this.receiver_id);
    }
    if (null != o.getDosageInstruction() && !o.getDosageInstruction().isEmpty()) {
    	this.dosageinstruction_id = "dosageinstruction" + this.id;
    	this.dosageInstruction = DosageHelper.toModelFromArray(o.getDosageInstruction(), this.dosageinstruction_id);
    }
    if (null != o.getSubstitution() ) {
    	this.substitution_id = "substitution" + this.id;
    	this.substitution = MedicationDispenseSubstitutionHelper.toModel(o.getSubstitution(), this.substitution_id);
    }
    if (null != o.getDetectedIssue() && !o.getDetectedIssue().isEmpty()) {
    	this.detectedissue_id = "detectedissue" + this.id;
    	this.detectedIssue = ReferenceHelper.toModelFromArray(o.getDetectedIssue(), this.detectedissue_id);
    }
    this.notDone = o.getNotDone();
    this.notDoneReasonCodeableConcept = CodeableConceptHelper.toJson(o.getNotDoneReasonCodeableConcept());
    if (null != o.getNotDoneReasonReference() ) {
    	this.notdonereasonreference_id = "notdonereasonreference" + this.id;
    	this.notDoneReasonReference = ReferenceHelper.toModel(o.getNotDoneReasonReference(), this.notdonereasonreference_id);
    }
    if (null != o.getEventHistory() && !o.getEventHistory().isEmpty()) {
    	this.eventhistory_id = "eventhistory" + this.id;
    	this.eventHistory = ReferenceHelper.toModelFromArray(o.getEventHistory(), this.eventhistory_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
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
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getMedicationCodeableConcept() {
    return this.medicationCodeableConcept;
  }
  public void setMedicationCodeableConcept( String value) {
    this.medicationCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getMedicationReference() {
    return this.medicationReference;
  }
  public void setMedicationReference( java.util.List<ReferenceModel> value) {
    this.medicationReference = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public java.util.List<ReferenceModel> getSupportingInformation() {
    return this.supportingInformation;
  }
  public void setSupportingInformation( java.util.List<ReferenceModel> value) {
    this.supportingInformation = value;
  }
  public java.util.List<MedicationDispensePerformerModel> getPerformer() {
    return this.performer;
  }
  public void setPerformer( java.util.List<MedicationDispensePerformerModel> value) {
    this.performer = value;
  }
  public java.util.List<ReferenceModel> getAuthorizingPrescription() {
    return this.authorizingPrescription;
  }
  public void setAuthorizingPrescription( java.util.List<ReferenceModel> value) {
    this.authorizingPrescription = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getDaysSupply() {
    return this.daysSupply;
  }
  public void setDaysSupply( String value) {
    this.daysSupply = value;
  }
  public String getWhenPrepared() {
    return this.whenPrepared;
  }
  public void setWhenPrepared( String value) {
    this.whenPrepared = value;
  }
  public String getWhenHandedOver() {
    return this.whenHandedOver;
  }
  public void setWhenHandedOver( String value) {
    this.whenHandedOver = value;
  }
  public java.util.List<ReferenceModel> getDestination() {
    return this.destination;
  }
  public void setDestination( java.util.List<ReferenceModel> value) {
    this.destination = value;
  }
  public java.util.List<ReferenceModel> getReceiver() {
    return this.receiver;
  }
  public void setReceiver( java.util.List<ReferenceModel> value) {
    this.receiver = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<DosageModel> getDosageInstruction() {
    return this.dosageInstruction;
  }
  public void setDosageInstruction( java.util.List<DosageModel> value) {
    this.dosageInstruction = value;
  }
  public java.util.List<MedicationDispenseSubstitutionModel> getSubstitution() {
    return this.substitution;
  }
  public void setSubstitution( java.util.List<MedicationDispenseSubstitutionModel> value) {
    this.substitution = value;
  }
  public java.util.List<ReferenceModel> getDetectedIssue() {
    return this.detectedIssue;
  }
  public void setDetectedIssue( java.util.List<ReferenceModel> value) {
    this.detectedIssue = value;
  }
  public Boolean getNotDone() {
    return this.notDone;
  }
  public void setNotDone( Boolean value) {
    this.notDone = value;
  }
  public String getNotDoneReasonCodeableConcept() {
    return this.notDoneReasonCodeableConcept;
  }
  public void setNotDoneReasonCodeableConcept( String value) {
    this.notDoneReasonCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getNotDoneReasonReference() {
    return this.notDoneReasonReference;
  }
  public void setNotDoneReasonReference( java.util.List<ReferenceModel> value) {
    this.notDoneReasonReference = value;
  }
  public java.util.List<ReferenceModel> getEventHistory() {
    return this.eventHistory;
  }
  public void setEventHistory( java.util.List<ReferenceModel> value) {
    this.eventHistory = value;
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
    builder.append("[MedicationDispenseModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("medicationCodeableConcept" + "->" + this.medicationCodeableConcept + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("daysSupply" + "->" + this.daysSupply + "\n"); 
     builder.append("whenPrepared" + "->" + this.whenPrepared + "\n"); 
     builder.append("whenHandedOver" + "->" + this.whenHandedOver + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("notDone" + "->" + this.notDone + "\n"); 
     builder.append("notDoneReasonCodeableConcept" + "->" + this.notDoneReasonCodeableConcept + "\n"); 
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
    builder.append("[MedicationDispenseModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("partOf" + "->" + this.partOf + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("medicationCodeableConcept" + "->" + this.medicationCodeableConcept + "\n"); 
     builder.append("medicationReference" + "->" + this.medicationReference + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("supportingInformation" + "->" + this.supportingInformation + "\n"); 
     builder.append("performer" + "->" + this.performer + "\n"); 
     builder.append("authorizingPrescription" + "->" + this.authorizingPrescription + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("daysSupply" + "->" + this.daysSupply + "\n"); 
     builder.append("whenPrepared" + "->" + this.whenPrepared + "\n"); 
     builder.append("whenHandedOver" + "->" + this.whenHandedOver + "\n"); 
     builder.append("destination" + "->" + this.destination + "\n"); 
     builder.append("receiver" + "->" + this.receiver + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("dosageInstruction" + "->" + this.dosageInstruction + "\n"); 
     builder.append("substitution" + "->" + this.substitution + "\n"); 
     builder.append("detectedIssue" + "->" + this.detectedIssue + "\n"); 
     builder.append("notDone" + "->" + this.notDone + "\n"); 
     builder.append("notDoneReasonCodeableConcept" + "->" + this.notDoneReasonCodeableConcept + "\n"); 
     builder.append("notDoneReasonReference" + "->" + this.notDoneReasonReference + "\n"); 
     builder.append("eventHistory" + "->" + this.eventHistory + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}