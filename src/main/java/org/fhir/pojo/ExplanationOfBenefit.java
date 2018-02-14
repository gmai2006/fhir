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
import org.fhir.entity.ExplanationOfBenefitModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefit  {
  /**
  * Description: "This is a ExplanationOfBenefit resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The EOB Business Identifier."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The status of the resource instance."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The category of claim, eg, oral, pharmacy, vision, insitutional, professional."
  */
  private CodeableConcept type;

  /**
  * Description: "A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType."
  */
  private java.util.List<CodeableConcept> subType = new java.util.ArrayList<>();

  /**
  * Description: "Patient Resource."
  */
  private Reference patient;

  /**
  * Description: "The billable period for which charges are being submitted."
  */
  private Period billablePeriod;

  /**
  * Description: "The date when the EOB was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String created;

  /**
  * Description: "Extensions for created"
  */
  private transient Element _created;

  /**
  * Description: "The person who created the explanation of benefit."
  */
  private Reference enterer;

  /**
  * Description: "The insurer which is responsible for the explanation of benefit."
  */
  private Reference insurer;

  /**
  * Description: "The provider which is responsible for the claim."
  */
  private Reference provider;

  /**
  * Description: "The provider which is responsible for the claim."
  */
  private Reference organization;

  /**
  * Description: "The referral resource which lists the date, practitioner, reason and other supporting information."
  */
  private Reference referral;

  /**
  * Description: "Facility where the services were provided."
  */
  private Reference facility;

  /**
  * Description: "The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number."
  */
  private Reference claim;

  /**
  * Description: "The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number."
  */
  private Reference claimResponse;

  /**
  * Description: "Processing outcome errror, partial or complete processing."
  */
  private CodeableConcept outcome;

  /**
  * Description: "A description of the status of the adjudication."
  */
  private String disposition;

  /**
  * Description: "Extensions for disposition"
  */
  private transient Element _disposition;

  /**
  * Description: "Other claims which are related to this claim such as prior claim versions or for related services."
  */
  private java.util.List<ExplanationOfBenefitRelated> related = new java.util.ArrayList<>();

  /**
  * Description: "Prescription to support the dispensing of Pharmacy or Vision products."
  */
  private Reference prescription;

  /**
  * Description: "Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new precription for an alternate medication which has the same theraputic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'."
  */
  private Reference originalPrescription;

  /**
  * Description: "The party to be reimbursed for the services."
  */
  private ExplanationOfBenefitPayee payee;

  /**
  * Description: "Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required."
  */
  private java.util.List<ExplanationOfBenefitInformation> information = new java.util.ArrayList<>();

  /**
  * Description: "The members of the team who provided the overall service as well as their role and whether responsible and qualifications."
  */
  private java.util.List<ExplanationOfBenefitCareTeam> careTeam = new java.util.ArrayList<>();

  /**
  * Description: "Ordered list of patient diagnosis for which care is sought."
  */
  private java.util.List<ExplanationOfBenefitDiagnosis> diagnosis = new java.util.ArrayList<>();

  /**
  * Description: "Ordered list of patient procedures performed to support the adjudication."
  */
  private java.util.List<ExplanationOfBenefitProcedure> procedure = new java.util.ArrayList<>();

  /**
  * Description: "Precedence (primary, secondary, etc.)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float precedence;

  /**
  * Description: "Extensions for precedence"
  */
  private transient Element _precedence;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  private ExplanationOfBenefitInsurance insurance;

  /**
  * Description: "An accident which resulted in the need for healthcare services."
  */
  private ExplanationOfBenefitAccident accident;

  /**
  * Description: "The start and optional end dates of when the patient was precluded from working due to the treatable condition(s)."
  */
  private Period employmentImpacted;

  /**
  * Description: "The start and optional end dates of when the patient was confined to a treatment center."
  */
  private Period hospitalization;

  /**
  * Description: "First tier of goods and services."
  */
  private java.util.List<ExplanationOfBenefitItem> item = new java.util.ArrayList<>();

  /**
  * Description: "The first tier service adjudications for payor added services."
  */
  private java.util.List<ExplanationOfBenefitAddItem> addItem = new java.util.ArrayList<>();

  /**
  * Description: "The total cost of the services reported."
  */
  private Money totalCost;

  /**
  * Description: "The amount of deductable applied which was not allocated to any particular service line."
  */
  private Money unallocDeductable;

  /**
  * Description: "Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductable)."
  */
  private Money totalBenefit;

  /**
  * Description: "Payment details for the claim if the claim has been paid."
  */
  private ExplanationOfBenefitPayment payment;

  /**
  * Description: "The form to be used for printing the content."
  */
  private CodeableConcept form;

  /**
  * Description: "Note text."
  */
  private java.util.List<ExplanationOfBenefitProcessNote> processNote = new java.util.ArrayList<>();

  /**
  * Description: "Balance by Benefit Category."
  */
  private java.util.List<ExplanationOfBenefitBenefitBalance> benefitBalance = new java.util.ArrayList<>();

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
  @javax.validation.constraints.NotNull
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

  public ExplanationOfBenefit() {
  }

  public ExplanationOfBenefit(ExplanationOfBenefitModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    this.billablePeriod = PeriodHelper.fromJson(o.getBillablePeriod());
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getEnterer() && !o.getEnterer().isEmpty()) {
      this.enterer = new Reference(o.getEnterer().get(0));
    }
    if (null != o.getInsurer() && !o.getInsurer().isEmpty()) {
      this.insurer = new Reference(o.getInsurer().get(0));
    }
    if (null != o.getProvider() && !o.getProvider().isEmpty()) {
      this.provider = new Reference(o.getProvider().get(0));
    }
    if (null != o.getOrganization() && !o.getOrganization().isEmpty()) {
      this.organization = new Reference(o.getOrganization().get(0));
    }
    if (null != o.getReferral() && !o.getReferral().isEmpty()) {
      this.referral = new Reference(o.getReferral().get(0));
    }
    if (null != o.getFacility() && !o.getFacility().isEmpty()) {
      this.facility = new Reference(o.getFacility().get(0));
    }
    if (null != o.getClaim() && !o.getClaim().isEmpty()) {
      this.claim = new Reference(o.getClaim().get(0));
    }
    if (null != o.getClaimResponse() && !o.getClaimResponse().isEmpty()) {
      this.claimResponse = new Reference(o.getClaimResponse().get(0));
    }
    this.outcome = CodeableConceptHelper.fromJson(o.getOutcome());
    if (null != o.getDisposition()) {
      this.disposition = o.getDisposition();
    }
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related = ExplanationOfBenefitRelatedHelper.fromArray2Array(o.getRelated());
    }
    if (null != o.getPrescription() && !o.getPrescription().isEmpty()) {
      this.prescription = new Reference(o.getPrescription().get(0));
    }
    if (null != o.getOriginalPrescription() && !o.getOriginalPrescription().isEmpty()) {
      this.originalPrescription = new Reference(o.getOriginalPrescription().get(0));
    }
    if (null != o.getPayee() && !o.getPayee().isEmpty()) {
      this.payee = new ExplanationOfBenefitPayee(o.getPayee().get(0));
    }
    if (null != o.getInformation() && !o.getInformation().isEmpty()) {
    	this.information = ExplanationOfBenefitInformationHelper.fromArray2Array(o.getInformation());
    }
    if (null != o.getCareTeam() && !o.getCareTeam().isEmpty()) {
    	this.careTeam = ExplanationOfBenefitCareTeamHelper.fromArray2Array(o.getCareTeam());
    }
    if (null != o.getDiagnosis() && !o.getDiagnosis().isEmpty()) {
    	this.diagnosis = ExplanationOfBenefitDiagnosisHelper.fromArray2Array(o.getDiagnosis());
    }
    if (null != o.getProcedure() && !o.getProcedure().isEmpty()) {
    	this.procedure = ExplanationOfBenefitProcedureHelper.fromArray2Array(o.getProcedure());
    }
    if (null != o.getPrecedence()) {
      this.precedence = o.getPrecedence();
    }
    if (null != o.getInsurance() && !o.getInsurance().isEmpty()) {
      this.insurance = new ExplanationOfBenefitInsurance(o.getInsurance().get(0));
    }
    if (null != o.getAccident() && !o.getAccident().isEmpty()) {
      this.accident = new ExplanationOfBenefitAccident(o.getAccident().get(0));
    }
    this.employmentImpacted = PeriodHelper.fromJson(o.getEmploymentImpacted());
    this.hospitalization = PeriodHelper.fromJson(o.getHospitalization());
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = ExplanationOfBenefitItemHelper.fromArray2Array(o.getItem());
    }
    if (null != o.getAddItem() && !o.getAddItem().isEmpty()) {
    	this.addItem = ExplanationOfBenefitAddItemHelper.fromArray2Array(o.getAddItem());
    }
    this.totalCost = MoneyHelper.fromJson(o.getTotalCost());
    this.unallocDeductable = MoneyHelper.fromJson(o.getUnallocDeductable());
    this.totalBenefit = MoneyHelper.fromJson(o.getTotalBenefit());
    if (null != o.getPayment() && !o.getPayment().isEmpty()) {
      this.payment = new ExplanationOfBenefitPayment(o.getPayment().get(0));
    }
    this.form = CodeableConceptHelper.fromJson(o.getForm());
    if (null != o.getProcessNote() && !o.getProcessNote().isEmpty()) {
    	this.processNote = ExplanationOfBenefitProcessNoteHelper.fromArray2Array(o.getProcessNote());
    }
    if (null != o.getBenefitBalance() && !o.getBenefitBalance().isEmpty()) {
    	this.benefitBalance = ExplanationOfBenefitBenefitBalanceHelper.fromArray2Array(o.getBenefitBalance());
    }
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
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
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setSubType( java.util.List<CodeableConcept> value) {
    this.subType = value;
  }
  public java.util.List<CodeableConcept> getSubType() {
    return this.subType;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setBillablePeriod( Period value) {
    this.billablePeriod = value;
  }
  public Period getBillablePeriod() {
    return this.billablePeriod;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void set_created( Element value) {
    this._created = value;
  }
  public Element get_created() {
    return this._created;
  }
  public void setEnterer( Reference value) {
    this.enterer = value;
  }
  public Reference getEnterer() {
    return this.enterer;
  }
  public void setInsurer( Reference value) {
    this.insurer = value;
  }
  public Reference getInsurer() {
    return this.insurer;
  }
  public void setProvider( Reference value) {
    this.provider = value;
  }
  public Reference getProvider() {
    return this.provider;
  }
  public void setOrganization( Reference value) {
    this.organization = value;
  }
  public Reference getOrganization() {
    return this.organization;
  }
  public void setReferral( Reference value) {
    this.referral = value;
  }
  public Reference getReferral() {
    return this.referral;
  }
  public void setFacility( Reference value) {
    this.facility = value;
  }
  public Reference getFacility() {
    return this.facility;
  }
  public void setClaim( Reference value) {
    this.claim = value;
  }
  public Reference getClaim() {
    return this.claim;
  }
  public void setClaimResponse( Reference value) {
    this.claimResponse = value;
  }
  public Reference getClaimResponse() {
    return this.claimResponse;
  }
  public void setOutcome( CodeableConcept value) {
    this.outcome = value;
  }
  public CodeableConcept getOutcome() {
    return this.outcome;
  }
  public void setDisposition( String value) {
    this.disposition = value;
  }
  public String getDisposition() {
    return this.disposition;
  }
  public void set_disposition( Element value) {
    this._disposition = value;
  }
  public Element get_disposition() {
    return this._disposition;
  }
  public void setRelated( java.util.List<ExplanationOfBenefitRelated> value) {
    this.related = value;
  }
  public java.util.List<ExplanationOfBenefitRelated> getRelated() {
    return this.related;
  }
  public void setPrescription( Reference value) {
    this.prescription = value;
  }
  public Reference getPrescription() {
    return this.prescription;
  }
  public void setOriginalPrescription( Reference value) {
    this.originalPrescription = value;
  }
  public Reference getOriginalPrescription() {
    return this.originalPrescription;
  }
  public void setPayee( ExplanationOfBenefitPayee value) {
    this.payee = value;
  }
  public ExplanationOfBenefitPayee getPayee() {
    return this.payee;
  }
  public void setInformation( java.util.List<ExplanationOfBenefitInformation> value) {
    this.information = value;
  }
  public java.util.List<ExplanationOfBenefitInformation> getInformation() {
    return this.information;
  }
  public void setCareTeam( java.util.List<ExplanationOfBenefitCareTeam> value) {
    this.careTeam = value;
  }
  public java.util.List<ExplanationOfBenefitCareTeam> getCareTeam() {
    return this.careTeam;
  }
  public void setDiagnosis( java.util.List<ExplanationOfBenefitDiagnosis> value) {
    this.diagnosis = value;
  }
  public java.util.List<ExplanationOfBenefitDiagnosis> getDiagnosis() {
    return this.diagnosis;
  }
  public void setProcedure( java.util.List<ExplanationOfBenefitProcedure> value) {
    this.procedure = value;
  }
  public java.util.List<ExplanationOfBenefitProcedure> getProcedure() {
    return this.procedure;
  }
  public void setPrecedence( Float value) {
    this.precedence = value;
  }
  public Float getPrecedence() {
    return this.precedence;
  }
  public void set_precedence( Element value) {
    this._precedence = value;
  }
  public Element get_precedence() {
    return this._precedence;
  }
  public void setInsurance( ExplanationOfBenefitInsurance value) {
    this.insurance = value;
  }
  public ExplanationOfBenefitInsurance getInsurance() {
    return this.insurance;
  }
  public void setAccident( ExplanationOfBenefitAccident value) {
    this.accident = value;
  }
  public ExplanationOfBenefitAccident getAccident() {
    return this.accident;
  }
  public void setEmploymentImpacted( Period value) {
    this.employmentImpacted = value;
  }
  public Period getEmploymentImpacted() {
    return this.employmentImpacted;
  }
  public void setHospitalization( Period value) {
    this.hospitalization = value;
  }
  public Period getHospitalization() {
    return this.hospitalization;
  }
  public void setItem( java.util.List<ExplanationOfBenefitItem> value) {
    this.item = value;
  }
  public java.util.List<ExplanationOfBenefitItem> getItem() {
    return this.item;
  }
  public void setAddItem( java.util.List<ExplanationOfBenefitAddItem> value) {
    this.addItem = value;
  }
  public java.util.List<ExplanationOfBenefitAddItem> getAddItem() {
    return this.addItem;
  }
  public void setTotalCost( Money value) {
    this.totalCost = value;
  }
  public Money getTotalCost() {
    return this.totalCost;
  }
  public void setUnallocDeductable( Money value) {
    this.unallocDeductable = value;
  }
  public Money getUnallocDeductable() {
    return this.unallocDeductable;
  }
  public void setTotalBenefit( Money value) {
    this.totalBenefit = value;
  }
  public Money getTotalBenefit() {
    return this.totalBenefit;
  }
  public void setPayment( ExplanationOfBenefitPayment value) {
    this.payment = value;
  }
  public ExplanationOfBenefitPayment getPayment() {
    return this.payment;
  }
  public void setForm( CodeableConcept value) {
    this.form = value;
  }
  public CodeableConcept getForm() {
    return this.form;
  }
  public void setProcessNote( java.util.List<ExplanationOfBenefitProcessNote> value) {
    this.processNote = value;
  }
  public java.util.List<ExplanationOfBenefitProcessNote> getProcessNote() {
    return this.processNote;
  }
  public void setBenefitBalance( java.util.List<ExplanationOfBenefitBenefitBalance> value) {
    this.benefitBalance = value;
  }
  public java.util.List<ExplanationOfBenefitBenefitBalance> getBenefitBalance() {
    return this.benefitBalance;
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
    builder.append("[ExplanationOfBenefit]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.subType != null) builder.append("subType" + "->" + this.subType.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.billablePeriod != null) builder.append("billablePeriod" + "->" + this.billablePeriod.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.enterer != null) builder.append("enterer" + "->" + this.enterer.toString() + "\n"); 
     if(this.insurer != null) builder.append("insurer" + "->" + this.insurer.toString() + "\n"); 
     if(this.provider != null) builder.append("provider" + "->" + this.provider.toString() + "\n"); 
     if(this.organization != null) builder.append("organization" + "->" + this.organization.toString() + "\n"); 
     if(this.referral != null) builder.append("referral" + "->" + this.referral.toString() + "\n"); 
     if(this.facility != null) builder.append("facility" + "->" + this.facility.toString() + "\n"); 
     if(this.claim != null) builder.append("claim" + "->" + this.claim.toString() + "\n"); 
     if(this.claimResponse != null) builder.append("claimResponse" + "->" + this.claimResponse.toString() + "\n"); 
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this.disposition != null) builder.append("disposition" + "->" + this.disposition.toString() + "\n"); 
     if(this._disposition != null) builder.append("_disposition" + "->" + this._disposition.toString() + "\n"); 
     if(this.related != null) builder.append("related" + "->" + this.related.toString() + "\n"); 
     if(this.prescription != null) builder.append("prescription" + "->" + this.prescription.toString() + "\n"); 
     if(this.originalPrescription != null) builder.append("originalPrescription" + "->" + this.originalPrescription.toString() + "\n"); 
     if(this.payee != null) builder.append("payee" + "->" + this.payee.toString() + "\n"); 
     if(this.information != null) builder.append("information" + "->" + this.information.toString() + "\n"); 
     if(this.careTeam != null) builder.append("careTeam" + "->" + this.careTeam.toString() + "\n"); 
     if(this.diagnosis != null) builder.append("diagnosis" + "->" + this.diagnosis.toString() + "\n"); 
     if(this.procedure != null) builder.append("procedure" + "->" + this.procedure.toString() + "\n"); 
     if(this.precedence != null) builder.append("precedence" + "->" + this.precedence.toString() + "\n"); 
     if(this._precedence != null) builder.append("_precedence" + "->" + this._precedence.toString() + "\n"); 
     if(this.insurance != null) builder.append("insurance" + "->" + this.insurance.toString() + "\n"); 
     if(this.accident != null) builder.append("accident" + "->" + this.accident.toString() + "\n"); 
     if(this.employmentImpacted != null) builder.append("employmentImpacted" + "->" + this.employmentImpacted.toString() + "\n"); 
     if(this.hospitalization != null) builder.append("hospitalization" + "->" + this.hospitalization.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); 
     if(this.addItem != null) builder.append("addItem" + "->" + this.addItem.toString() + "\n"); 
     if(this.totalCost != null) builder.append("totalCost" + "->" + this.totalCost.toString() + "\n"); 
     if(this.unallocDeductable != null) builder.append("unallocDeductable" + "->" + this.unallocDeductable.toString() + "\n"); 
     if(this.totalBenefit != null) builder.append("totalBenefit" + "->" + this.totalBenefit.toString() + "\n"); 
     if(this.payment != null) builder.append("payment" + "->" + this.payment.toString() + "\n"); 
     if(this.form != null) builder.append("form" + "->" + this.form.toString() + "\n"); 
     if(this.processNote != null) builder.append("processNote" + "->" + this.processNote.toString() + "\n"); 
     if(this.benefitBalance != null) builder.append("benefitBalance" + "->" + this.benefitBalance.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	ExplanationOfBenefit,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ExplanationOfBenefit" : { return ExplanationOfBenefit.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	cancelled,
  	draft,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "draft" : { return draft.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}