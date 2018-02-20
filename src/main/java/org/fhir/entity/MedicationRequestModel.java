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
import org.fhir.utils.JsonUtils;
/**
* "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
*/
@Entity
@Table(name="medicationrequest")
public class MedicationRequestModel  implements Serializable {
	private static final long serialVersionUID = 151910893757095064L;
  /**
  * Description: "This is a MedicationRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. For example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records must be tracked through an entire system."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Protocol or definition followed by this request."
  */
  @javax.persistence.Basic
  @Column(name="\"definition_id\"")
  private String definition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="definition_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition;

  /**
  * Description: "A plan or request that is fulfilled in whole or in part by this medication request."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription."
  * Actual type: String;
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
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "Indicates how quickly the Medication Request should be addressed with respect to other requests."
  */
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private String priority;

  /**
  * Description: "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
  */
  @javax.persistence.Basic
  @Column(name="\"medicationcodeableconcept_id\"")
  private String medicationcodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="medicationcodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> medicationCodeableConcept;

  /**
  * Description: "Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications."
  */
  @javax.persistence.Basic
  @Column(name="\"medicationreference_id\"")
  private String medicationreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="medicationreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> medicationReference;

  /**
  * Description: "A link to a resource representing the person or set of individuals to whom the medication will be given."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "A link to an encounter, or episode of care, that identifies the particular occurrence or set occurrences of contact between patient and health care provider."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "Include additional information (for example, patient height and weight) that supports the ordering of the medication."
  */
  @javax.persistence.Basic
  @Column(name="\"supportinginformation_id\"")
  private String supportinginformation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="supportinginformation_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInformation;

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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="requester_id", insertable=false, updatable=false)
  private java.util.List<MedicationRequestRequesterModel> requester;

  /**
  * Description: "The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order."
  */
  @javax.persistence.Basic
  @Column(name="\"recorder_id\"")
  private String recorder_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="recorder_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> recorder;

  /**
  * Description: "The reason or the indication for ordering the medication."
  */
  @javax.persistence.Basic
  @Column(name="\"reasoncode_id\"")
  private String reasoncode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="reasoncode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reasonCode;

  /**
  * Description: "Condition or observation that supports why the medication was ordered."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="reasonreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference;

  /**
  * Description: "Extra information about the prescription that could not be conveyed by the other attributes."
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
  * Description: "Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department."
  */
  @javax.persistence.Basic
  @Column(name="\"dispenserequest_id\"")
  private String dispenserequest_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dispenserequest_id", insertable=false, updatable=false)
  private java.util.List<MedicationRequestDispenseRequestModel> dispenseRequest;

  /**
  * Description: "Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done."
  */
  @javax.persistence.Basic
  @Column(name="\"substitution_id\"")
  private String substitution_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="substitution_id", insertable=false, updatable=false)
  private java.util.List<MedicationRequestSubstitutionModel> substitution;

  /**
  * Description: "A link to a resource representing an earlier order related order or prescription."
  */
  @javax.persistence.Basic
  @Column(name="\"priorprescription_id\"")
  private String priorprescription_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="priorprescription_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> priorPrescription;

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
  * Description: "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource."
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

  public MedicationRequestModel() {
  }

  public MedicationRequestModel(MedicationRequest o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition_id = "definition" + this.id;
    	this.definition = ReferenceHelper.toModelFromArray(o.getDefinition(), this.definition_id);
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    if (null != o.getGroupIdentifier()) {
    	this.groupIdentifier = JsonUtils.toJson(o.getGroupIdentifier());
    }
    this.status = o.getStatus();
    this.intent = o.getIntent();
    if (null != o.getCategory() ) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModel(o.getCategory(), this.category_id);
    }
    this.priority = o.getPriority();
    if (null != o.getMedicationCodeableConcept() ) {
    	this.medicationcodeableconcept_id = "medicationcodeableconcept" + this.id;
    	this.medicationCodeableConcept = CodeableConceptHelper.toModel(o.getMedicationCodeableConcept(), this.medicationcodeableconcept_id);
    }
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
    this.authoredOn = o.getAuthoredOn();
    if (null != o.getRequester() ) {
    	this.requester_id = "requester" + this.id;
    	this.requester = MedicationRequestRequesterHelper.toModel(o.getRequester(), this.requester_id);
    }
    if (null != o.getRecorder() ) {
    	this.recorder_id = "recorder" + this.id;
    	this.recorder = ReferenceHelper.toModel(o.getRecorder(), this.recorder_id);
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasoncode_id = "reasoncode" + this.id;
    	this.reasonCode = CodeableConceptHelper.toModelFromArray(o.getReasonCode(), this.reasoncode_id);
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonreference_id = "reasonreference" + this.id;
    	this.reasonReference = ReferenceHelper.toModelFromArray(o.getReasonReference(), this.reasonreference_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getDosageInstruction() && !o.getDosageInstruction().isEmpty()) {
    	this.dosageinstruction_id = "dosageinstruction" + this.id;
    	this.dosageInstruction = DosageHelper.toModelFromArray(o.getDosageInstruction(), this.dosageinstruction_id);
    }
    if (null != o.getDispenseRequest() ) {
    	this.dispenserequest_id = "dispenserequest" + this.id;
    	this.dispenseRequest = MedicationRequestDispenseRequestHelper.toModel(o.getDispenseRequest(), this.dispenserequest_id);
    }
    if (null != o.getSubstitution() ) {
    	this.substitution_id = "substitution" + this.id;
    	this.substitution = MedicationRequestSubstitutionHelper.toModel(o.getSubstitution(), this.substitution_id);
    }
    if (null != o.getPriorPrescription() ) {
    	this.priorprescription_id = "priorprescription" + this.id;
    	this.priorPrescription = ReferenceHelper.toModel(o.getPriorPrescription(), this.priorprescription_id);
    }
    if (null != o.getDetectedIssue() && !o.getDetectedIssue().isEmpty()) {
    	this.detectedissue_id = "detectedissue" + this.id;
    	this.detectedIssue = ReferenceHelper.toModelFromArray(o.getDetectedIssue(), this.detectedissue_id);
    }
    if (null != o.getEventHistory() && !o.getEventHistory().isEmpty()) {
    	this.eventhistory_id = "eventhistory" + this.id;
    	this.eventHistory = ReferenceHelper.toModelFromArray(o.getEventHistory(), this.eventhistory_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
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
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public String getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setGroupIdentifier( String value) {
    this.groupIdentifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void setIntent( String value) {
    this.intent = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public java.util.List<CodeableConceptModel> getMedicationCodeableConcept() {
    return this.medicationCodeableConcept;
  }
  public void setMedicationCodeableConcept( java.util.List<CodeableConceptModel> value) {
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
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public java.util.List<MedicationRequestRequesterModel> getRequester() {
    return this.requester;
  }
  public void setRequester( java.util.List<MedicationRequestRequesterModel> value) {
    this.requester = value;
  }
  public java.util.List<ReferenceModel> getRecorder() {
    return this.recorder;
  }
  public void setRecorder( java.util.List<ReferenceModel> value) {
    this.recorder = value;
  }
  public java.util.List<CodeableConceptModel> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonCode( java.util.List<CodeableConceptModel> value) {
    this.reasonCode = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
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
  public java.util.List<MedicationRequestDispenseRequestModel> getDispenseRequest() {
    return this.dispenseRequest;
  }
  public void setDispenseRequest( java.util.List<MedicationRequestDispenseRequestModel> value) {
    this.dispenseRequest = value;
  }
  public java.util.List<MedicationRequestSubstitutionModel> getSubstitution() {
    return this.substitution;
  }
  public void setSubstitution( java.util.List<MedicationRequestSubstitutionModel> value) {
    this.substitution = value;
  }
  public java.util.List<ReferenceModel> getPriorPrescription() {
    return this.priorPrescription;
  }
  public void setPriorPrescription( java.util.List<ReferenceModel> value) {
    this.priorPrescription = value;
  }
  public java.util.List<ReferenceModel> getDetectedIssue() {
    return this.detectedIssue;
  }
  public void setDetectedIssue( java.util.List<ReferenceModel> value) {
    this.detectedIssue = value;
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
    builder.append("[MedicationRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("groupIdentifier" + "->" + this.groupIdentifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("intent" + "->" + this.intent + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
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
    builder.append("[MedicationRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("basedOn" + "->" + this.basedOn + "\n"); 
     builder.append("groupIdentifier" + "->" + this.groupIdentifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("intent" + "->" + this.intent + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("medicationCodeableConcept" + "->" + this.medicationCodeableConcept + "\n"); 
     builder.append("medicationReference" + "->" + this.medicationReference + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("supportingInformation" + "->" + this.supportingInformation + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("requester" + "->" + this.requester + "\n"); 
     builder.append("recorder" + "->" + this.recorder + "\n"); 
     builder.append("reasonCode" + "->" + this.reasonCode + "\n"); 
     builder.append("reasonReference" + "->" + this.reasonReference + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("dosageInstruction" + "->" + this.dosageInstruction + "\n"); 
     builder.append("dispenseRequest" + "->" + this.dispenseRequest + "\n"); 
     builder.append("substitution" + "->" + this.substitution + "\n"); 
     builder.append("priorPrescription" + "->" + this.priorPrescription + "\n"); 
     builder.append("detectedIssue" + "->" + this.detectedIssue + "\n"); 
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