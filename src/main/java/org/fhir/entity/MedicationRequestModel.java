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
* "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
*/
@Entity
@Table(name="medicationrequest")
public class MedicationRequestModel  {
  /**
  * Description: "This is a MedicationRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. For example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records must be tracked through an entire system."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Protocol or definition followed by this request."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition = new java.util.ArrayList<>();

  /**
  * Description: "A plan or request that is fulfilled in whole or in part by this medication request."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"groupIdentifier\"", length = 16777215)
  private String groupIdentifier;

  /**
  * Description: "A code specifying the current state of the order.  Generally this will be active or completed state."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Whether the request is a proposal, plan, or an original order."
  */
  @javax.persistence.Basic
  @Column(name="\"intent\"")
  private String intent;

  /**
  * Description: "Indicates the type of medication order and where the medication is expected to be consumed or administered."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Indicates how quickly the Medication Request should be addressed with respect to other requests."
  */
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private String priority;

  /**
  * Description: "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"medicationCodeableConcept\"", length = 16777215)
  private String medicationCodeableConcept;

  /**
  * Description: "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
  */
  @javax.persistence.Basic
  @Column(name="\"medicationreference_id\"")
  private String medicationreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`medicationreference_id`", insertable=false, updatable=false)
  private ReferenceModel medicationReference;

  /**
  * Description: "A link to a resource representing the person or set of individuals to whom the medication will be given."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "A link to an encounter, or episode of care, that identifies the particular occurrence or set occurrences of contact between patient and health care provider."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "Include additional information (for example, patient height and weight) that supports the ordering of the medication."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInformation = new java.util.ArrayList<>();

  /**
  * Description: "The date (and perhaps time) when the prescription was initially written or authored on."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"authoredOn\"")
  private String authoredOn;

  /**
  * Description: "The individual, organization or device that initiated the request and has responsibility for its activation."
  */
  @javax.persistence.Basic
  @Column(name="\"requester_id\"")
  private String requester_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`requester_id`", insertable=false, updatable=false)
  private MedicationRequestRequesterModel requester;

  /**
  * Description: "The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order."
  */
  @javax.persistence.Basic
  @Column(name="\"recorder_id\"")
  private String recorder_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`recorder_id`", insertable=false, updatable=false)
  private ReferenceModel recorder;

  /**
  * Description: "The reason or the indication for ordering the medication."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCode\"", length = 16777215)
  private String reasonCode;

  /**
  * Description: "Condition or observation that supports why the medication was ordered."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "Extra information about the prescription that could not be conveyed by the other attributes."
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
  * Description: "Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department."
  */
  @javax.persistence.Basic
  @Column(name="\"dispenserequest_id\"")
  private String dispenserequest_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`dispenserequest_id`", insertable=false, updatable=false)
  private MedicationRequestDispenseRequestModel dispenseRequest;

  /**
  * Description: "Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done."
  */
  @javax.persistence.Basic
  @Column(name="\"substitution_id\"")
  private String substitution_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`substitution_id`", insertable=false, updatable=false)
  private MedicationRequestSubstitutionModel substitution;

  /**
  * Description: "A link to a resource representing an earlier order related order or prescription."
  */
  @javax.persistence.Basic
  @Column(name="\"priorprescription_id\"")
  private String priorprescription_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`priorprescription_id`", insertable=false, updatable=false)
  private ReferenceModel priorPrescription;

  /**
  * Description: "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> detectedIssue = new java.util.ArrayList<>();

  /**
  * Description: "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource."
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


  public MedicationRequestModel() {
  }

  public MedicationRequestModel(MedicationRequest o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.definition = Reference.toModelArray(o.getDefinition());

      this.basedOn = Reference.toModelArray(o.getBasedOn());

      this.groupIdentifier = Identifier.toJson(o.getGroupIdentifier());
      this.status = o.getStatus();

      this.intent = o.getIntent();

      this.category = CodeableConcept.toJson(o.getCategory());
      this.priority = o.getPriority();

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

      this.authoredOn = o.getAuthoredOn();

      if (null != o.getRequester()) {
      	this.requester_id = "requester" + this.getId();
        this.requester = new MedicationRequestRequesterModel(o.getRequester());
        this.requester.setId(this.requester_id);
        this.requester.parent_id = this.requester.getId();
      }

      if (null != o.getRecorder()) {
      	this.recorder_id = "recorder" + this.getId();
        this.recorder = new ReferenceModel(o.getRecorder());
        this.recorder.setId(this.recorder_id);
        this.recorder.parent_id = this.recorder.getId();
      }

      this.reasonCode = CodeableConcept.toJson(o.getReasonCode());
      this.reasonReference = Reference.toModelArray(o.getReasonReference());

      this.note = Annotation.toJson(o.getNote());
      this.dosageInstruction = Dosage.toModelArray(o.getDosageInstruction());

      if (null != o.getDispenseRequest()) {
      	this.dispenserequest_id = "dispenseRequest" + this.getId();
        this.dispenseRequest = new MedicationRequestDispenseRequestModel(o.getDispenseRequest());
        this.dispenseRequest.setId(this.dispenserequest_id);
        this.dispenseRequest.parent_id = this.dispenseRequest.getId();
      }

      if (null != o.getSubstitution()) {
      	this.substitution_id = "substitution" + this.getId();
        this.substitution = new MedicationRequestSubstitutionModel(o.getSubstitution());
        this.substitution.setId(this.substitution_id);
        this.substitution.parent_id = this.substitution.getId();
      }

      if (null != o.getPriorPrescription()) {
      	this.priorprescription_id = "priorPrescription" + this.getId();
        this.priorPrescription = new ReferenceModel(o.getPriorPrescription());
        this.priorPrescription.setId(this.priorprescription_id);
        this.priorPrescription.parent_id = this.priorPrescription.getId();
      }

      this.detectedIssue = Reference.toModelArray(o.getDetectedIssue());

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
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setGroupIdentifier( String value) {
    this.groupIdentifier = value;
  }
  public String getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setIntent( String value) {
    this.intent = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
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
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setRequester( MedicationRequestRequesterModel value) {
    this.requester = value;
  }
  public MedicationRequestRequesterModel getRequester() {
    return this.requester;
  }
  public void setRecorder( ReferenceModel value) {
    this.recorder = value;
  }
  public ReferenceModel getRecorder() {
    return this.recorder;
  }
  public void setReasonCode( String value) {
    this.reasonCode = value;
  }
  public String getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
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
  public void setDispenseRequest( MedicationRequestDispenseRequestModel value) {
    this.dispenseRequest = value;
  }
  public MedicationRequestDispenseRequestModel getDispenseRequest() {
    return this.dispenseRequest;
  }
  public void setSubstitution( MedicationRequestSubstitutionModel value) {
    this.substitution = value;
  }
  public MedicationRequestSubstitutionModel getSubstitution() {
    return this.substitution;
  }
  public void setPriorPrescription( ReferenceModel value) {
    this.priorPrescription = value;
  }
  public ReferenceModel getPriorPrescription() {
    return this.priorPrescription;
  }
  public void setDetectedIssue( java.util.List<ReferenceModel> value) {
    this.detectedIssue = value;
  }
  public java.util.List<ReferenceModel> getDetectedIssue() {
    return this.detectedIssue;
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
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("groupIdentifier" + "[" + String.valueOf(this.groupIdentifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("medicationCodeableConcept" + "[" + String.valueOf(this.medicationCodeableConcept) + "]\n"); 
     builder.append("medicationReference" + "[" + String.valueOf(this.medicationReference) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("supportingInformation" + "[" + String.valueOf(this.supportingInformation) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
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
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}