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
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
@Entity
@Table(name="claim")
public class ClaimModel  implements Serializable {
	private static final long serialVersionUID = 151873631118686211L;
  /**
  * Description: "This is a Claim resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The business identifier for the instance: claim number, pre-determination or pre-authorization number."
  * Actual type: List<String>;
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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType."
  * Actual type: List<String>;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "The billable period for which charges are being submitted."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="enterer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> enterer;

  /**
  * Description: "The Insurer who is target of the request."
  */
  @javax.persistence.Basic
  @Column(name="\"insurer_id\"")
  private String insurer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="insurer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> insurer;

  /**
  * Description: "The provider which is responsible for the bill, claim pre-determination, pre-authorization."
  */
  @javax.persistence.Basic
  @Column(name="\"provider_id\"")
  private String provider_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="provider_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> provider;

  /**
  * Description: "The organization which is responsible for the bill, claim pre-determination, pre-authorization."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="organization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> organization;

  /**
  * Description: "Immediate (STAT), best effort (NORMAL), deferred (DEFER)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"priority\"", length = 16777215)
  private String priority;

  /**
  * Description: "In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"fundsReserve\"", length = 16777215)
  private String fundsReserve;

  /**
  * Description: "Other claims which are related to this claim such as prior claim versions or for related services."
  */
  @javax.persistence.Basic
  @Column(name="\"related_id\"")
  private String related_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="related_id", insertable=false, updatable=false)
  private java.util.List<ClaimRelatedModel> related;

  /**
  * Description: "Prescription to support the dispensing of Pharmacy or Vision products."
  */
  @javax.persistence.Basic
  @Column(name="\"prescription_id\"")
  private String prescription_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="prescription_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> prescription;

  /**
  * Description: "Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new precription for an alternate medication which has the same theraputic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'."
  */
  @javax.persistence.Basic
  @Column(name="\"originalprescription_id\"")
  private String originalprescription_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="originalprescription_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> originalPrescription;

  /**
  * Description: "The party to be reimbursed for the services."
  */
  @javax.persistence.Basic
  @Column(name="\"payee_id\"")
  private String payee_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="payee_id", insertable=false, updatable=false)
  private java.util.List<ClaimPayeeModel> payee;

  /**
  * Description: "The referral resource which lists the date, practitioner, reason and other supporting information."
  */
  @javax.persistence.Basic
  @Column(name="\"referral_id\"")
  private String referral_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="referral_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> referral;

  /**
  * Description: "Facility where the services were provided."
  */
  @javax.persistence.Basic
  @Column(name="\"facility_id\"")
  private String facility_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="facility_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> facility;

  /**
  * Description: "The members of the team who provided the overall service as well as their role and whether responsible and qualifications."
  */
  @javax.persistence.Basic
  @Column(name="\"careteam_id\"")
  private String careteam_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="careteam_id", insertable=false, updatable=false)
  private java.util.List<ClaimCareTeamModel> careTeam;

  /**
  * Description: "Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required."
  */
  @javax.persistence.Basic
  @Column(name="\"information_id\"")
  private String information_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="information_id", insertable=false, updatable=false)
  private java.util.List<ClaimInformationModel> information;

  /**
  * Description: "List of patient diagnosis for which care is sought."
  */
  @javax.persistence.Basic
  @Column(name="\"diagnosis_id\"")
  private String diagnosis_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="diagnosis_id", insertable=false, updatable=false)
  private java.util.List<ClaimDiagnosisModel> diagnosis;

  /**
  * Description: "Ordered list of patient procedures performed to support the adjudication."
  */
  @javax.persistence.Basic
  @Column(name="\"procedure_id\"")
  private String procedure_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="procedure_id", insertable=false, updatable=false)
  private java.util.List<ClaimProcedureModel> procedure;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  @javax.persistence.Basic
  @Column(name="\"insurance_id\"")
  private String insurance_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="insurance_id", insertable=false, updatable=false)
  private java.util.List<ClaimInsuranceModel> insurance;

  /**
  * Description: "An accident which resulted in the need for healthcare services."
  */
  @javax.persistence.Basic
  @Column(name="\"accident_id\"")
  private String accident_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="accident_id", insertable=false, updatable=false)
  private java.util.List<ClaimAccidentModel> accident;

  /**
  * Description: "The start and optional end dates of when the patient was precluded from working due to the treatable condition(s)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"employmentImpacted\"", length = 16777215)
  private String employmentImpacted;

  /**
  * Description: "The start and optional end dates of when the patient was confined to a treatment center."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"hospitalization\"", length = 16777215)
  private String hospitalization;

  /**
  * Description: "First tier of goods and services."
  */
  @javax.persistence.Basic
  @Column(name="\"item_id\"")
  private String item_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="item_id", insertable=false, updatable=false)
  private java.util.List<ClaimItemModel> item;

  /**
  * Description: "The total value of the claim."
  */
  @javax.persistence.Basic
  @Column(name="\"total_id\"")
  private String total_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="total_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> total;

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

  public ClaimModel() {
  }

  public ClaimModel(Claim o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.status = o.getStatus();
    this.type = JsonUtils.toJson(o.getType());
    this.use = o.getUse();
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    this.billablePeriod = JsonUtils.toJson(o.getBillablePeriod());
    this.created = o.getCreated();
    if (null != o.getEnterer() ) {
    	this.enterer_id = "enterer" + this.id;
    	this.enterer = ReferenceHelper.toModel(o.getEnterer(), this.enterer_id);
    }
    if (null != o.getInsurer() ) {
    	this.insurer_id = "insurer" + this.id;
    	this.insurer = ReferenceHelper.toModel(o.getInsurer(), this.insurer_id);
    }
    if (null != o.getProvider() ) {
    	this.provider_id = "provider" + this.id;
    	this.provider = ReferenceHelper.toModel(o.getProvider(), this.provider_id);
    }
    if (null != o.getOrganization() ) {
    	this.organization_id = "organization" + this.id;
    	this.organization = ReferenceHelper.toModel(o.getOrganization(), this.organization_id);
    }
    this.priority = JsonUtils.toJson(o.getPriority());
    this.fundsReserve = JsonUtils.toJson(o.getFundsReserve());
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related_id = "related" + this.id;
    	this.related = ClaimRelatedHelper.toModelFromArray(o.getRelated(), this.related_id);
    }
    if (null != o.getPrescription() ) {
    	this.prescription_id = "prescription" + this.id;
    	this.prescription = ReferenceHelper.toModel(o.getPrescription(), this.prescription_id);
    }
    if (null != o.getOriginalPrescription() ) {
    	this.originalprescription_id = "originalprescription" + this.id;
    	this.originalPrescription = ReferenceHelper.toModel(o.getOriginalPrescription(), this.originalprescription_id);
    }
    if (null != o.getPayee() ) {
    	this.payee_id = "payee" + this.id;
    	this.payee = ClaimPayeeHelper.toModel(o.getPayee(), this.payee_id);
    }
    if (null != o.getReferral() ) {
    	this.referral_id = "referral" + this.id;
    	this.referral = ReferenceHelper.toModel(o.getReferral(), this.referral_id);
    }
    if (null != o.getFacility() ) {
    	this.facility_id = "facility" + this.id;
    	this.facility = ReferenceHelper.toModel(o.getFacility(), this.facility_id);
    }
    if (null != o.getCareTeam() && !o.getCareTeam().isEmpty()) {
    	this.careteam_id = "careteam" + this.id;
    	this.careTeam = ClaimCareTeamHelper.toModelFromArray(o.getCareTeam(), this.careteam_id);
    }
    if (null != o.getInformation() && !o.getInformation().isEmpty()) {
    	this.information_id = "information" + this.id;
    	this.information = ClaimInformationHelper.toModelFromArray(o.getInformation(), this.information_id);
    }
    if (null != o.getDiagnosis() && !o.getDiagnosis().isEmpty()) {
    	this.diagnosis_id = "diagnosis" + this.id;
    	this.diagnosis = ClaimDiagnosisHelper.toModelFromArray(o.getDiagnosis(), this.diagnosis_id);
    }
    if (null != o.getProcedure() && !o.getProcedure().isEmpty()) {
    	this.procedure_id = "procedure" + this.id;
    	this.procedure = ClaimProcedureHelper.toModelFromArray(o.getProcedure(), this.procedure_id);
    }
    if (null != o.getInsurance() && !o.getInsurance().isEmpty()) {
    	this.insurance_id = "insurance" + this.id;
    	this.insurance = ClaimInsuranceHelper.toModelFromArray(o.getInsurance(), this.insurance_id);
    }
    if (null != o.getAccident() ) {
    	this.accident_id = "accident" + this.id;
    	this.accident = ClaimAccidentHelper.toModel(o.getAccident(), this.accident_id);
    }
    this.employmentImpacted = JsonUtils.toJson(o.getEmploymentImpacted());
    this.hospitalization = JsonUtils.toJson(o.getHospitalization());
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item_id = "item" + this.id;
    	this.item = ClaimItemHelper.toModelFromArray(o.getItem(), this.item_id);
    }
    if (null != o.getTotal() ) {
    	this.total_id = "total" + this.id;
    	this.total = MoneyHelper.toModel(o.getTotal(), this.total_id);
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
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getSubType() {
    return this.subType;
  }
  public void setSubType( String value) {
    this.subType = value;
  }
  public String getUse() {
    return this.use;
  }
  public void setUse( String value) {
    this.use = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public String getBillablePeriod() {
    return this.billablePeriod;
  }
  public void setBillablePeriod( String value) {
    this.billablePeriod = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public java.util.List<ReferenceModel> getEnterer() {
    return this.enterer;
  }
  public void setEnterer( java.util.List<ReferenceModel> value) {
    this.enterer = value;
  }
  public java.util.List<ReferenceModel> getInsurer() {
    return this.insurer;
  }
  public void setInsurer( java.util.List<ReferenceModel> value) {
    this.insurer = value;
  }
  public java.util.List<ReferenceModel> getProvider() {
    return this.provider;
  }
  public void setProvider( java.util.List<ReferenceModel> value) {
    this.provider = value;
  }
  public java.util.List<ReferenceModel> getOrganization() {
    return this.organization;
  }
  public void setOrganization( java.util.List<ReferenceModel> value) {
    this.organization = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getFundsReserve() {
    return this.fundsReserve;
  }
  public void setFundsReserve( String value) {
    this.fundsReserve = value;
  }
  public java.util.List<ClaimRelatedModel> getRelated() {
    return this.related;
  }
  public void setRelated( java.util.List<ClaimRelatedModel> value) {
    this.related = value;
  }
  public java.util.List<ReferenceModel> getPrescription() {
    return this.prescription;
  }
  public void setPrescription( java.util.List<ReferenceModel> value) {
    this.prescription = value;
  }
  public java.util.List<ReferenceModel> getOriginalPrescription() {
    return this.originalPrescription;
  }
  public void setOriginalPrescription( java.util.List<ReferenceModel> value) {
    this.originalPrescription = value;
  }
  public java.util.List<ClaimPayeeModel> getPayee() {
    return this.payee;
  }
  public void setPayee( java.util.List<ClaimPayeeModel> value) {
    this.payee = value;
  }
  public java.util.List<ReferenceModel> getReferral() {
    return this.referral;
  }
  public void setReferral( java.util.List<ReferenceModel> value) {
    this.referral = value;
  }
  public java.util.List<ReferenceModel> getFacility() {
    return this.facility;
  }
  public void setFacility( java.util.List<ReferenceModel> value) {
    this.facility = value;
  }
  public java.util.List<ClaimCareTeamModel> getCareTeam() {
    return this.careTeam;
  }
  public void setCareTeam( java.util.List<ClaimCareTeamModel> value) {
    this.careTeam = value;
  }
  public java.util.List<ClaimInformationModel> getInformation() {
    return this.information;
  }
  public void setInformation( java.util.List<ClaimInformationModel> value) {
    this.information = value;
  }
  public java.util.List<ClaimDiagnosisModel> getDiagnosis() {
    return this.diagnosis;
  }
  public void setDiagnosis( java.util.List<ClaimDiagnosisModel> value) {
    this.diagnosis = value;
  }
  public java.util.List<ClaimProcedureModel> getProcedure() {
    return this.procedure;
  }
  public void setProcedure( java.util.List<ClaimProcedureModel> value) {
    this.procedure = value;
  }
  public java.util.List<ClaimInsuranceModel> getInsurance() {
    return this.insurance;
  }
  public void setInsurance( java.util.List<ClaimInsuranceModel> value) {
    this.insurance = value;
  }
  public java.util.List<ClaimAccidentModel> getAccident() {
    return this.accident;
  }
  public void setAccident( java.util.List<ClaimAccidentModel> value) {
    this.accident = value;
  }
  public String getEmploymentImpacted() {
    return this.employmentImpacted;
  }
  public void setEmploymentImpacted( String value) {
    this.employmentImpacted = value;
  }
  public String getHospitalization() {
    return this.hospitalization;
  }
  public void setHospitalization( String value) {
    this.hospitalization = value;
  }
  public java.util.List<ClaimItemModel> getItem() {
    return this.item;
  }
  public void setItem( java.util.List<ClaimItemModel> value) {
    this.item = value;
  }
  public java.util.List<MoneyModel> getTotal() {
    return this.total;
  }
  public void setTotal( java.util.List<MoneyModel> value) {
    this.total = value;
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
    builder.append("[ClaimModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("subType" + "->" + this.subType + "\n"); 
     builder.append("use" + "->" + this.use + "\n"); 
     builder.append("billablePeriod" + "->" + this.billablePeriod + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("fundsReserve" + "->" + this.fundsReserve + "\n"); 
     builder.append("employmentImpacted" + "->" + this.employmentImpacted + "\n"); 
     builder.append("hospitalization" + "->" + this.hospitalization + "\n"); 
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
    builder.append("[ClaimModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("subType" + "->" + this.subType + "\n"); 
     builder.append("use" + "->" + this.use + "\n"); 
     builder.append("patient" + "->" + this.patient + "\n"); 
     builder.append("billablePeriod" + "->" + this.billablePeriod + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("enterer" + "->" + this.enterer + "\n"); 
     builder.append("insurer" + "->" + this.insurer + "\n"); 
     builder.append("provider" + "->" + this.provider + "\n"); 
     builder.append("organization" + "->" + this.organization + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("fundsReserve" + "->" + this.fundsReserve + "\n"); 
     builder.append("related" + "->" + this.related + "\n"); 
     builder.append("prescription" + "->" + this.prescription + "\n"); 
     builder.append("originalPrescription" + "->" + this.originalPrescription + "\n"); 
     builder.append("payee" + "->" + this.payee + "\n"); 
     builder.append("referral" + "->" + this.referral + "\n"); 
     builder.append("facility" + "->" + this.facility + "\n"); 
     builder.append("careTeam" + "->" + this.careTeam + "\n"); 
     builder.append("information" + "->" + this.information + "\n"); 
     builder.append("diagnosis" + "->" + this.diagnosis + "\n"); 
     builder.append("procedure" + "->" + this.procedure + "\n"); 
     builder.append("insurance" + "->" + this.insurance + "\n"); 
     builder.append("accident" + "->" + this.accident + "\n"); 
     builder.append("employmentImpacted" + "->" + this.employmentImpacted + "\n"); 
     builder.append("hospitalization" + "->" + this.hospitalization + "\n"); 
     builder.append("item" + "->" + this.item + "\n"); 
     builder.append("total" + "->" + this.total + "\n"); 
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