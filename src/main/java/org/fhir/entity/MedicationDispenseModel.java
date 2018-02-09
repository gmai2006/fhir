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

/**
* "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
*/
@Entity
@Table(name="medicationdispense")
public class MedicationDispenseModel  {
  /**
  * Description: "This is a MedicationDispense resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The procedure that the dispense is done because of."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf = new java.util.ArrayList<>();

  /**
  * Description: "A code specifying the state of the set of dispense events."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Indicates type of medication dispense and where the medication is expected to be consumed or administered."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  * Actual type: CodeableConcept
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`medicationreference_id`", insertable=false, updatable=false)
  private ReferenceModel medicationReference;

  /**
  * Description: "A link to a resource representing the person or the group to whom the medication will be given."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "The encounter or episode of care that establishes the context for this event."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "Additional information that supports the medication being dispensed."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInformation = new java.util.ArrayList<>();

  /**
  * Description: "Indicates who or what performed the event.  It should be assumed that the performer is the dispenser of the medication."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<MedicationDispensePerformerModel> performer = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the medication order that is being dispensed against."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> authorizingPrescription = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The amount of medication that has been dispensed. Includes unit of measure."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "The amount of medication expressed as a timing amount."
  * Actual type: Quantity
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`destination_id`", insertable=false, updatable=false)
  private ReferenceModel destination;

  /**
  * Description: "Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> receiver = new java.util.ArrayList<>();

  /**
  * Description: "Extra information about the dispense that could not be conveyed in the other attributes."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Indicates how the medication is to be used by the patient."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<DosageModel> dosageInstruction = new java.util.ArrayList<>();

  /**
  * Description: "Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done."
  */
  @javax.persistence.Basic
  @Column(name="\"substitution_id\"")
  private String substitution_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`substitution_id`", insertable=false, updatable=false)
  private MedicationDispenseSubstitutionModel substitution;

  /**
  * Description: "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> detectedIssue = new java.util.ArrayList<>();

  /**
  * Description: "True if the dispense was not performed for some reason."
  */
  @javax.persistence.Basic
  @Column(name="\"notDone\"")
  private Boolean notDone;

  /**
  * Description: "Indicates the reason why a dispense was not performed."
  * Actual type: CodeableConcept
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`notdonereasonreference_id`", insertable=false, updatable=false)
  private ReferenceModel notDoneReasonReference;

  /**
  * Description: "A summary of the events of interest that have occurred, such as when the dispense was verified."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> eventHistory = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.partOf = Reference.toModelArray(o.getPartOf());

      this.status = o.getStatus();

      this.category = CodeableConcept.toJson(o.getCategory());
      this.medicationCodeableConcept = CodeableConcept.toJson(o.getMedicationCodeableConcept());
      if (null != o.getMedicationReference()) {
      	this.medicationreference_id = "medicationReference" + this.getId();
        this.medicationReference = new ReferenceModel(o.getMedicationReference());
        this.medicationReference.setId(this.medicationreference_id);
        this.medicationReference.parent_id = this.medicationReference.getId();
      }

      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      if (null != o.getContext()) {
      	this.context_id = "context" + this.getId();
        this.context = new ReferenceModel(o.getContext());
        this.context.setId(this.context_id);
        this.context.parent_id = this.context.getId();
      }

      this.supportingInformation = Reference.toModelArray(o.getSupportingInformation());

      this.performer = MedicationDispensePerformer.toModelArray(o.getPerformer());

      this.authorizingPrescription = Reference.toModelArray(o.getAuthorizingPrescription());

      this.type = CodeableConcept.toJson(o.getType());
      this.quantity = Quantity.toJson(o.getQuantity());
      this.daysSupply = Quantity.toJson(o.getDaysSupply());
      this.whenPrepared = o.getWhenPrepared();

      this.whenHandedOver = o.getWhenHandedOver();

      if (null != o.getDestination()) {
      	this.destination_id = "destination" + this.getId();
        this.destination = new ReferenceModel(o.getDestination());
        this.destination.setId(this.destination_id);
        this.destination.parent_id = this.destination.getId();
      }

      this.receiver = Reference.toModelArray(o.getReceiver());

      this.note = Annotation.toJson(o.getNote());
      this.dosageInstruction = Dosage.toModelArray(o.getDosageInstruction());

      if (null != o.getSubstitution()) {
      	this.substitution_id = "substitution" + this.getId();
        this.substitution = new MedicationDispenseSubstitutionModel(o.getSubstitution());
        this.substitution.setId(this.substitution_id);
        this.substitution.parent_id = this.substitution.getId();
      }

      this.detectedIssue = Reference.toModelArray(o.getDetectedIssue());

      this.notDone = o.getNotDone();

      this.notDoneReasonCodeableConcept = CodeableConcept.toJson(o.getNotDoneReasonCodeableConcept());
      if (null != o.getNotDoneReasonReference()) {
      	this.notdonereasonreference_id = "notDoneReasonReference" + this.getId();
        this.notDoneReasonReference = new ReferenceModel(o.getNotDoneReasonReference());
        this.notDoneReasonReference.setId(this.notdonereasonreference_id);
        this.notDoneReasonReference.parent_id = this.notDoneReasonReference.getId();
      }

      this.eventHistory = Reference.toModelArray(o.getEventHistory());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setMedicationCodeableConcept( String value) {
    this.medicationCodeableConcept = value;
  }
  public String getMedicationCodeableConcept() {
    return this.medicationCodeableConcept;
  }
  public void setMedicationReference( ReferenceModel value) {
    this.medicationReference = value;
  }
  public ReferenceModel getMedicationReference() {
    return this.medicationReference;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setContext( ReferenceModel value) {
    this.context = value;
  }
  public ReferenceModel getContext() {
    return this.context;
  }
  public void setSupportingInformation( java.util.List<ReferenceModel> value) {
    this.supportingInformation = value;
  }
  public java.util.List<ReferenceModel> getSupportingInformation() {
    return this.supportingInformation;
  }
  public void setPerformer( java.util.List<MedicationDispensePerformerModel> value) {
    this.performer = value;
  }
  public java.util.List<MedicationDispensePerformerModel> getPerformer() {
    return this.performer;
  }
  public void setAuthorizingPrescription( java.util.List<ReferenceModel> value) {
    this.authorizingPrescription = value;
  }
  public java.util.List<ReferenceModel> getAuthorizingPrescription() {
    return this.authorizingPrescription;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setDaysSupply( String value) {
    this.daysSupply = value;
  }
  public String getDaysSupply() {
    return this.daysSupply;
  }
  public void setWhenPrepared( String value) {
    this.whenPrepared = value;
  }
  public String getWhenPrepared() {
    return this.whenPrepared;
  }
  public void setWhenHandedOver( String value) {
    this.whenHandedOver = value;
  }
  public String getWhenHandedOver() {
    return this.whenHandedOver;
  }
  public void setDestination( ReferenceModel value) {
    this.destination = value;
  }
  public ReferenceModel getDestination() {
    return this.destination;
  }
  public void setReceiver( java.util.List<ReferenceModel> value) {
    this.receiver = value;
  }
  public java.util.List<ReferenceModel> getReceiver() {
    return this.receiver;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setDosageInstruction( java.util.List<DosageModel> value) {
    this.dosageInstruction = value;
  }
  public java.util.List<DosageModel> getDosageInstruction() {
    return this.dosageInstruction;
  }
  public void setSubstitution( MedicationDispenseSubstitutionModel value) {
    this.substitution = value;
  }
  public MedicationDispenseSubstitutionModel getSubstitution() {
    return this.substitution;
  }
  public void setDetectedIssue( java.util.List<ReferenceModel> value) {
    this.detectedIssue = value;
  }
  public java.util.List<ReferenceModel> getDetectedIssue() {
    return this.detectedIssue;
  }
  public void setNotDone( Boolean value) {
    this.notDone = value;
  }
  public Boolean getNotDone() {
    return this.notDone;
  }
  public void setNotDoneReasonCodeableConcept( String value) {
    this.notDoneReasonCodeableConcept = value;
  }
  public String getNotDoneReasonCodeableConcept() {
    return this.notDoneReasonCodeableConcept;
  }
  public void setNotDoneReasonReference( ReferenceModel value) {
    this.notDoneReasonReference = value;
  }
  public ReferenceModel getNotDoneReasonReference() {
    return this.notDoneReasonReference;
  }
  public void setEventHistory( java.util.List<ReferenceModel> value) {
    this.eventHistory = value;
  }
  public java.util.List<ReferenceModel> getEventHistory() {
    return this.eventHistory;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
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
     builder.append("whenHandedOver" + "[" + String.valueOf(this.whenHandedOver) + "]\n"); 
     builder.append("destination" + "[" + String.valueOf(this.destination) + "]\n"); 
     builder.append("receiver" + "[" + String.valueOf(this.receiver) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("dosageInstruction" + "[" + String.valueOf(this.dosageInstruction) + "]\n"); 
     builder.append("substitution" + "[" + String.valueOf(this.substitution) + "]\n"); 
     builder.append("detectedIssue" + "[" + String.valueOf(this.detectedIssue) + "]\n"); 
     builder.append("notDone" + "[" + String.valueOf(this.notDone) + "]\n"); 
     builder.append("notDoneReasonCodeableConcept" + "[" + String.valueOf(this.notDoneReasonCodeableConcept) + "]\n"); 
     builder.append("notDoneReasonReference" + "[" + String.valueOf(this.notDoneReasonReference) + "]\n"); 
     builder.append("eventHistory" + "[" + String.valueOf(this.eventHistory) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}