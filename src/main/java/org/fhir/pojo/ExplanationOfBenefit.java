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
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      this.subType = CodeableConcept.fromArray(o.getSubType());
      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      this.billablePeriod = Period.fromJson(o.getBillablePeriod());
      if (null != o.getCreated()) {
        this.created = new String(o.getCreated());
      }

      if (null != o.getEnterer()) {
        this.enterer = new Reference(o.getEnterer());
        this.enterer.setId(this.getId());
      }

      if (null != o.getInsurer()) {
        this.insurer = new Reference(o.getInsurer());
        this.insurer.setId(this.getId());
      }

      if (null != o.getProvider()) {
        this.provider = new Reference(o.getProvider());
        this.provider.setId(this.getId());
      }

      if (null != o.getOrganization()) {
        this.organization = new Reference(o.getOrganization());
        this.organization.setId(this.getId());
      }

      if (null != o.getReferral()) {
        this.referral = new Reference(o.getReferral());
        this.referral.setId(this.getId());
      }

      if (null != o.getFacility()) {
        this.facility = new Reference(o.getFacility());
        this.facility.setId(this.getId());
      }

      if (null != o.getClaim()) {
        this.claim = new Reference(o.getClaim());
        this.claim.setId(this.getId());
      }

      if (null != o.getClaimResponse()) {
        this.claimResponse = new Reference(o.getClaimResponse());
        this.claimResponse.setId(this.getId());
      }

      this.outcome = CodeableConcept.fromJson(o.getOutcome());
      if (null != o.getDisposition()) {
        this.disposition = new String(o.getDisposition());
      }

      this.related = ExplanationOfBenefitRelated.fromArray(o.getRelated());

      if (null != o.getPrescription()) {
        this.prescription = new Reference(o.getPrescription());
        this.prescription.setId(this.getId());
      }

      if (null != o.getOriginalPrescription()) {
        this.originalPrescription = new Reference(o.getOriginalPrescription());
        this.originalPrescription.setId(this.getId());
      }

      if (null != o.getPayee()) {
        this.payee = new ExplanationOfBenefitPayee(o.getPayee());
        this.payee.setId(this.getId());
      }

      this.information = ExplanationOfBenefitInformation.fromArray(o.getInformation());

      this.careTeam = ExplanationOfBenefitCareTeam.fromArray(o.getCareTeam());

      this.diagnosis = ExplanationOfBenefitDiagnosis.fromArray(o.getDiagnosis());

      this.procedure = ExplanationOfBenefitProcedure.fromArray(o.getProcedure());

      if (null != o.getPrecedence()) {
        this.precedence = new Float(o.getPrecedence());
      }

      if (null != o.getInsurance()) {
        this.insurance = new ExplanationOfBenefitInsurance(o.getInsurance());
        this.insurance.setId(this.getId());
      }

      if (null != o.getAccident()) {
        this.accident = new ExplanationOfBenefitAccident(o.getAccident());
        this.accident.setId(this.getId());
      }

      this.employmentImpacted = Period.fromJson(o.getEmploymentImpacted());
      this.hospitalization = Period.fromJson(o.getHospitalization());
      this.item = ExplanationOfBenefitItem.fromArray(o.getItem());

      this.addItem = ExplanationOfBenefitAddItem.fromArray(o.getAddItem());

      this.totalCost = Money.fromJson(o.getTotalCost());
      this.unallocDeductable = Money.fromJson(o.getUnallocDeductable());
      this.totalBenefit = Money.fromJson(o.getTotalBenefit());
      if (null != o.getPayment()) {
        this.payment = new ExplanationOfBenefitPayment(o.getPayment());
        this.payment.setId(this.getId());
      }

      this.form = CodeableConcept.fromJson(o.getForm());
      this.processNote = ExplanationOfBenefitProcessNote.fromArray(o.getProcessNote());

      this.benefitBalance = ExplanationOfBenefitBenefitBalance.fromArray(o.getBenefitBalance());

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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("subType" + "[" + String.valueOf(this.subType) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("billablePeriod" + "[" + String.valueOf(this.billablePeriod) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("_created" + "[" + String.valueOf(this._created) + "]\n"); 
     builder.append("enterer" + "[" + String.valueOf(this.enterer) + "]\n"); 
     builder.append("insurer" + "[" + String.valueOf(this.insurer) + "]\n"); 
     builder.append("provider" + "[" + String.valueOf(this.provider) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("referral" + "[" + String.valueOf(this.referral) + "]\n"); 
     builder.append("facility" + "[" + String.valueOf(this.facility) + "]\n"); 
     builder.append("claim" + "[" + String.valueOf(this.claim) + "]\n"); 
     builder.append("claimResponse" + "[" + String.valueOf(this.claimResponse) + "]\n"); 
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("disposition" + "[" + String.valueOf(this.disposition) + "]\n"); 
     builder.append("_disposition" + "[" + String.valueOf(this._disposition) + "]\n"); 
     builder.append("related" + "[" + String.valueOf(this.related) + "]\n"); 
     builder.append("prescription" + "[" + String.valueOf(this.prescription) + "]\n"); 
     builder.append("originalPrescription" + "[" + String.valueOf(this.originalPrescription) + "]\n"); 
     builder.append("payee" + "[" + String.valueOf(this.payee) + "]\n"); 
     builder.append("information" + "[" + String.valueOf(this.information) + "]\n"); 
     builder.append("careTeam" + "[" + String.valueOf(this.careTeam) + "]\n"); 
     builder.append("diagnosis" + "[" + String.valueOf(this.diagnosis) + "]\n"); 
     builder.append("procedure" + "[" + String.valueOf(this.procedure) + "]\n"); 
     builder.append("precedence" + "[" + String.valueOf(this.precedence) + "]\n"); 
     builder.append("_precedence" + "[" + String.valueOf(this._precedence) + "]\n"); 
     builder.append("insurance" + "[" + String.valueOf(this.insurance) + "]\n"); 
     builder.append("accident" + "[" + String.valueOf(this.accident) + "]\n"); 
     builder.append("employmentImpacted" + "[" + String.valueOf(this.employmentImpacted) + "]\n"); 
     builder.append("hospitalization" + "[" + String.valueOf(this.hospitalization) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("addItem" + "[" + String.valueOf(this.addItem) + "]\n"); 
     builder.append("totalCost" + "[" + String.valueOf(this.totalCost) + "]\n"); 
     builder.append("unallocDeductable" + "[" + String.valueOf(this.unallocDeductable) + "]\n"); 
     builder.append("totalBenefit" + "[" + String.valueOf(this.totalBenefit) + "]\n"); 
     builder.append("payment" + "[" + String.valueOf(this.payment) + "]\n"); 
     builder.append("form" + "[" + String.valueOf(this.form) + "]\n"); 
     builder.append("processNote" + "[" + String.valueOf(this.processNote) + "]\n"); 
     builder.append("benefitBalance" + "[" + String.valueOf(this.benefitBalance) + "]\n"); 
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

  public static java.util.List<ExplanationOfBenefit> fromArray(java.util.List<ExplanationOfBenefitModel> list) {
    return (java.util.List<ExplanationOfBenefit>)list.stream()
      .map(model -> new ExplanationOfBenefit(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ExplanationOfBenefitModel> toModelArray(java.util.List<ExplanationOfBenefit> list) {
    return (java.util.List<ExplanationOfBenefitModel>)list.stream()
      .map(model -> new ExplanationOfBenefitModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ExplanationOfBenefit fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefit.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ExplanationOfBenefit o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ExplanationOfBenefit> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}