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
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
@Entity
@Table(name="claim")
public class ClaimModel  {
  /**
  * Description: "This is a Claim resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The business identifier for the instance: claim number, pre-determination or pre-authorization number."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The category of claim, eg, oral, pharmacy, vision, insitutional, professional."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"subType\"", length = 16777215)
  private String subType;

  /**
  * Description: "Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination)."
  */
  @javax.persistence.Basic
  @Column(name="\"use\"")
  private String use;

  /**
  * Description: "Patient Resource."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`patient_id`", insertable=false, updatable=false)
  private ReferenceModel patient;

  /**
  * Description: "The billable period for which charges are being submitted."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"billablePeriod\"", length = 16777215)
  private String billablePeriod;

  /**
  * Description: "The date when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"created\"")
  private String created;

  /**
  * Description: "Person who created the invoice/claim/pre-determination or pre-authorization."
  */
  @javax.persistence.Basic
  @Column(name="\"enterer_id\"")
  private String enterer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`enterer_id`", insertable=false, updatable=false)
  private ReferenceModel enterer;

  /**
  * Description: "The Insurer who is target of the request."
  */
  @javax.persistence.Basic
  @Column(name="\"insurer_id\"")
  private String insurer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`insurer_id`", insertable=false, updatable=false)
  private ReferenceModel insurer;

  /**
  * Description: "The provider which is responsible for the bill, claim pre-determination, pre-authorization."
  */
  @javax.persistence.Basic
  @Column(name="\"provider_id\"")
  private String provider_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`provider_id`", insertable=false, updatable=false)
  private ReferenceModel provider;

  /**
  * Description: "The organization which is responsible for the bill, claim pre-determination, pre-authorization."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`organization_id`", insertable=false, updatable=false)
  private ReferenceModel organization;

  /**
  * Description: "Immediate (STAT), best effort (NORMAL), deferred (DEFER)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"priority\"", length = 16777215)
  private String priority;

  /**
  * Description: "In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"fundsReserve\"", length = 16777215)
  private String fundsReserve;

  /**
  * Description: "Other claims which are related to this claim such as prior claim versions or for related services."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimRelatedModel> related = new java.util.ArrayList<>();

  /**
  * Description: "Prescription to support the dispensing of Pharmacy or Vision products."
  */
  @javax.persistence.Basic
  @Column(name="\"prescription_id\"")
  private String prescription_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`prescription_id`", insertable=false, updatable=false)
  private ReferenceModel prescription;

  /**
  * Description: "Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new precription for an alternate medication which has the same theraputic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'."
  */
  @javax.persistence.Basic
  @Column(name="\"originalprescription_id\"")
  private String originalprescription_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`originalprescription_id`", insertable=false, updatable=false)
  private ReferenceModel originalPrescription;

  /**
  * Description: "The party to be reimbursed for the services."
  */
  @javax.persistence.Basic
  @Column(name="\"payee_id\"")
  private String payee_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`payee_id`", insertable=false, updatable=false)
  private ClaimPayeeModel payee;

  /**
  * Description: "The referral resource which lists the date, practitioner, reason and other supporting information."
  */
  @javax.persistence.Basic
  @Column(name="\"referral_id\"")
  private String referral_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`referral_id`", insertable=false, updatable=false)
  private ReferenceModel referral;

  /**
  * Description: "Facility where the services were provided."
  */
  @javax.persistence.Basic
  @Column(name="\"facility_id\"")
  private String facility_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`facility_id`", insertable=false, updatable=false)
  private ReferenceModel facility;

  /**
  * Description: "The members of the team who provided the overall service as well as their role and whether responsible and qualifications."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimCareTeamModel> careTeam = new java.util.ArrayList<>();

  /**
  * Description: "Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimInformationModel> information = new java.util.ArrayList<>();

  /**
  * Description: "List of patient diagnosis for which care is sought."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimDiagnosisModel> diagnosis = new java.util.ArrayList<>();

  /**
  * Description: "Ordered list of patient procedures performed to support the adjudication."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimProcedureModel> procedure = new java.util.ArrayList<>();

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimInsuranceModel> insurance = new java.util.ArrayList<>();

  /**
  * Description: "An accident which resulted in the need for healthcare services."
  */
  @javax.persistence.Basic
  @Column(name="\"accident_id\"")
  private String accident_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`accident_id`", insertable=false, updatable=false)
  private ClaimAccidentModel accident;

  /**
  * Description: "The start and optional end dates of when the patient was precluded from working due to the treatable condition(s)."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"employmentImpacted\"", length = 16777215)
  private String employmentImpacted;

  /**
  * Description: "The start and optional end dates of when the patient was confined to a treatment center."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"hospitalization\"", length = 16777215)
  private String hospitalization;

  /**
  * Description: "First tier of goods and services."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimItemModel> item = new java.util.ArrayList<>();

  /**
  * Description: "The total value of the claim."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"total\"", length = 16777215)
  private String total;

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


  public ClaimModel() {
  }

  public ClaimModel(Claim o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.type = CodeableConcept.toJson(o.getType());
      this.subType = CodeableConcept.toJson(o.getSubType());
      this.use = o.getUse();

      if (null != o.getPatient()) {
      	this.patient_id = "patient" + this.getId();
        this.patient = new ReferenceModel(o.getPatient());
        this.patient.setId(this.patient_id);
        this.patient.parent_id = this.patient.getId();
      }

      this.billablePeriod = Period.toJson(o.getBillablePeriod());
      this.created = o.getCreated();

      if (null != o.getEnterer()) {
      	this.enterer_id = "enterer" + this.getId();
        this.enterer = new ReferenceModel(o.getEnterer());
        this.enterer.setId(this.enterer_id);
        this.enterer.parent_id = this.enterer.getId();
      }

      if (null != o.getInsurer()) {
      	this.insurer_id = "insurer" + this.getId();
        this.insurer = new ReferenceModel(o.getInsurer());
        this.insurer.setId(this.insurer_id);
        this.insurer.parent_id = this.insurer.getId();
      }

      if (null != o.getProvider()) {
      	this.provider_id = "provider" + this.getId();
        this.provider = new ReferenceModel(o.getProvider());
        this.provider.setId(this.provider_id);
        this.provider.parent_id = this.provider.getId();
      }

      if (null != o.getOrganization()) {
      	this.organization_id = "organization" + this.getId();
        this.organization = new ReferenceModel(o.getOrganization());
        this.organization.setId(this.organization_id);
        this.organization.parent_id = this.organization.getId();
      }

      this.priority = CodeableConcept.toJson(o.getPriority());
      this.fundsReserve = CodeableConcept.toJson(o.getFundsReserve());
      this.related = ClaimRelated.toModelArray(o.getRelated());

      if (null != o.getPrescription()) {
      	this.prescription_id = "prescription" + this.getId();
        this.prescription = new ReferenceModel(o.getPrescription());
        this.prescription.setId(this.prescription_id);
        this.prescription.parent_id = this.prescription.getId();
      }

      if (null != o.getOriginalPrescription()) {
      	this.originalprescription_id = "originalPrescription" + this.getId();
        this.originalPrescription = new ReferenceModel(o.getOriginalPrescription());
        this.originalPrescription.setId(this.originalprescription_id);
        this.originalPrescription.parent_id = this.originalPrescription.getId();
      }

      if (null != o.getPayee()) {
      	this.payee_id = "payee" + this.getId();
        this.payee = new ClaimPayeeModel(o.getPayee());
        this.payee.setId(this.payee_id);
        this.payee.parent_id = this.payee.getId();
      }

      if (null != o.getReferral()) {
      	this.referral_id = "referral" + this.getId();
        this.referral = new ReferenceModel(o.getReferral());
        this.referral.setId(this.referral_id);
        this.referral.parent_id = this.referral.getId();
      }

      if (null != o.getFacility()) {
      	this.facility_id = "facility" + this.getId();
        this.facility = new ReferenceModel(o.getFacility());
        this.facility.setId(this.facility_id);
        this.facility.parent_id = this.facility.getId();
      }

      this.careTeam = ClaimCareTeam.toModelArray(o.getCareTeam());

      this.information = ClaimInformation.toModelArray(o.getInformation());

      this.diagnosis = ClaimDiagnosis.toModelArray(o.getDiagnosis());

      this.procedure = ClaimProcedure.toModelArray(o.getProcedure());

      this.insurance = ClaimInsurance.toModelArray(o.getInsurance());

      if (null != o.getAccident()) {
      	this.accident_id = "accident" + this.getId();
        this.accident = new ClaimAccidentModel(o.getAccident());
        this.accident.setId(this.accident_id);
        this.accident.parent_id = this.accident.getId();
      }

      this.employmentImpacted = Period.toJson(o.getEmploymentImpacted());
      this.hospitalization = Period.toJson(o.getHospitalization());
      this.item = ClaimItem.toModelArray(o.getItem());

      this.total = Money.toJson(o.getTotal());
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
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setSubType( String value) {
    this.subType = value;
  }
  public String getSubType() {
    return this.subType;
  }
  public void setUse( String value) {
    this.use = value;
  }
  public String getUse() {
    return this.use;
  }
  public void setPatient( ReferenceModel value) {
    this.patient = value;
  }
  public ReferenceModel getPatient() {
    return this.patient;
  }
  public void setBillablePeriod( String value) {
    this.billablePeriod = value;
  }
  public String getBillablePeriod() {
    return this.billablePeriod;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setEnterer( ReferenceModel value) {
    this.enterer = value;
  }
  public ReferenceModel getEnterer() {
    return this.enterer;
  }
  public void setInsurer( ReferenceModel value) {
    this.insurer = value;
  }
  public ReferenceModel getInsurer() {
    return this.insurer;
  }
  public void setProvider( ReferenceModel value) {
    this.provider = value;
  }
  public ReferenceModel getProvider() {
    return this.provider;
  }
  public void setOrganization( ReferenceModel value) {
    this.organization = value;
  }
  public ReferenceModel getOrganization() {
    return this.organization;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setFundsReserve( String value) {
    this.fundsReserve = value;
  }
  public String getFundsReserve() {
    return this.fundsReserve;
  }
  public void setRelated( java.util.List<ClaimRelatedModel> value) {
    this.related = value;
  }
  public java.util.List<ClaimRelatedModel> getRelated() {
    return this.related;
  }
  public void setPrescription( ReferenceModel value) {
    this.prescription = value;
  }
  public ReferenceModel getPrescription() {
    return this.prescription;
  }
  public void setOriginalPrescription( ReferenceModel value) {
    this.originalPrescription = value;
  }
  public ReferenceModel getOriginalPrescription() {
    return this.originalPrescription;
  }
  public void setPayee( ClaimPayeeModel value) {
    this.payee = value;
  }
  public ClaimPayeeModel getPayee() {
    return this.payee;
  }
  public void setReferral( ReferenceModel value) {
    this.referral = value;
  }
  public ReferenceModel getReferral() {
    return this.referral;
  }
  public void setFacility( ReferenceModel value) {
    this.facility = value;
  }
  public ReferenceModel getFacility() {
    return this.facility;
  }
  public void setCareTeam( java.util.List<ClaimCareTeamModel> value) {
    this.careTeam = value;
  }
  public java.util.List<ClaimCareTeamModel> getCareTeam() {
    return this.careTeam;
  }
  public void setInformation( java.util.List<ClaimInformationModel> value) {
    this.information = value;
  }
  public java.util.List<ClaimInformationModel> getInformation() {
    return this.information;
  }
  public void setDiagnosis( java.util.List<ClaimDiagnosisModel> value) {
    this.diagnosis = value;
  }
  public java.util.List<ClaimDiagnosisModel> getDiagnosis() {
    return this.diagnosis;
  }
  public void setProcedure( java.util.List<ClaimProcedureModel> value) {
    this.procedure = value;
  }
  public java.util.List<ClaimProcedureModel> getProcedure() {
    return this.procedure;
  }
  public void setInsurance( java.util.List<ClaimInsuranceModel> value) {
    this.insurance = value;
  }
  public java.util.List<ClaimInsuranceModel> getInsurance() {
    return this.insurance;
  }
  public void setAccident( ClaimAccidentModel value) {
    this.accident = value;
  }
  public ClaimAccidentModel getAccident() {
    return this.accident;
  }
  public void setEmploymentImpacted( String value) {
    this.employmentImpacted = value;
  }
  public String getEmploymentImpacted() {
    return this.employmentImpacted;
  }
  public void setHospitalization( String value) {
    this.hospitalization = value;
  }
  public String getHospitalization() {
    return this.hospitalization;
  }
  public void setItem( java.util.List<ClaimItemModel> value) {
    this.item = value;
  }
  public java.util.List<ClaimItemModel> getItem() {
    return this.item;
  }
  public void setTotal( String value) {
    this.total = value;
  }
  public String getTotal() {
    return this.total;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("subType" + "[" + String.valueOf(this.subType) + "]\n"); 
     builder.append("use" + "[" + String.valueOf(this.use) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("billablePeriod" + "[" + String.valueOf(this.billablePeriod) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("enterer" + "[" + String.valueOf(this.enterer) + "]\n"); 
     builder.append("insurer" + "[" + String.valueOf(this.insurer) + "]\n"); 
     builder.append("provider" + "[" + String.valueOf(this.provider) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("fundsReserve" + "[" + String.valueOf(this.fundsReserve) + "]\n"); 
     builder.append("related" + "[" + String.valueOf(this.related) + "]\n"); 
     builder.append("prescription" + "[" + String.valueOf(this.prescription) + "]\n"); 
     builder.append("originalPrescription" + "[" + String.valueOf(this.originalPrescription) + "]\n"); 
     builder.append("payee" + "[" + String.valueOf(this.payee) + "]\n"); 
     builder.append("referral" + "[" + String.valueOf(this.referral) + "]\n"); 
     builder.append("facility" + "[" + String.valueOf(this.facility) + "]\n"); 
     builder.append("careTeam" + "[" + String.valueOf(this.careTeam) + "]\n"); 
     builder.append("information" + "[" + String.valueOf(this.information) + "]\n"); 
     builder.append("diagnosis" + "[" + String.valueOf(this.diagnosis) + "]\n"); 
     builder.append("procedure" + "[" + String.valueOf(this.procedure) + "]\n"); 
     builder.append("insurance" + "[" + String.valueOf(this.insurance) + "]\n"); 
     builder.append("accident" + "[" + String.valueOf(this.accident) + "]\n"); 
     builder.append("employmentImpacted" + "[" + String.valueOf(this.employmentImpacted) + "]\n"); 
     builder.append("hospitalization" + "[" + String.valueOf(this.hospitalization) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("total" + "[" + String.valueOf(this.total) + "]\n"); 
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