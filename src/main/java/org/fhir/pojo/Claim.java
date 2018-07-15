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
import org.fhir.entity.ClaimModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Claim  extends DomainResource  {
  /**
  * Description: "This is a Claim resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The business identifier for the instance: claim number, pre-determination or pre-authorization number."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The category of claim, eg, oral, pharmacy, vision, insitutional, professional."
  */
  protected CodeableConcept type;

  /**
  * Description: "A finer grained suite of claim subtype codes which may convey Inpatient vs Outpatient and/or a specialty service. In the US the BillType."
  */
  protected java.util.List<CodeableConcept> subType;

  /**
  * Description: "Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination)."
  */
  protected String use;

  /**
  * Description: "Extensions for use"
  */
  protected transient Element _use;

  /**
  * Description: "Patient Resource."
  */
  protected Reference patient;

  /**
  * Description: "The billable period for which charges are being submitted."
  */
  protected Period billablePeriod;

  /**
  * Description: "The date when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String created;

  /**
  * Description: "Extensions for created"
  */
  protected transient Element _created;

  /**
  * Description: "Person who created the invoice/claim/pre-determination or pre-authorization."
  */
  protected Reference enterer;

  /**
  * Description: "The Insurer who is target of the request."
  */
  protected Reference insurer;

  /**
  * Description: "The provider which is responsible for the bill, claim pre-determination, pre-authorization."
  */
  protected Reference provider;

  /**
  * Description: "The organization which is responsible for the bill, claim pre-determination, pre-authorization."
  */
  protected Reference organization;

  /**
  * Description: "Immediate (STAT), best effort (NORMAL), deferred (DEFER)."
  */
  protected CodeableConcept priority;

  /**
  * Description: "In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested."
  */
  protected CodeableConcept fundsReserve;

  /**
  * Description: "Other claims which are related to this claim such as prior claim versions or for related services."
  */
  protected java.util.List<ClaimRelated> related;

  /**
  * Description: "Prescription to support the dispensing of Pharmacy or Vision products."
  */
  protected Reference prescription;

  /**
  * Description: "Original prescription which has been superceded by this prescription to support the dispensing of pharmacy services, medications or products. For example, a physician may prescribe a medication which the pharmacy determines is contraindicated, or for which the patient has an intolerance, and therefor issues a new precription for an alternate medication which has the same theraputic intent. The prescription from the pharmacy becomes the 'prescription' and that from the physician becomes the 'original prescription'."
  */
  protected Reference originalPrescription;

  /**
  * Description: "The party to be reimbursed for the services."
  */
  protected ClaimPayee payee;

  /**
  * Description: "The referral resource which lists the date, practitioner, reason and other supporting information."
  */
  protected Reference referral;

  /**
  * Description: "Facility where the services were provided."
  */
  protected Reference facility;

  /**
  * Description: "The members of the team who provided the overall service as well as their role and whether responsible and qualifications."
  */
  protected java.util.List<ClaimCareTeam> careTeam;

  /**
  * Description: "Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required."
  */
  protected java.util.List<ClaimInformation> information;

  /**
  * Description: "List of patient diagnosis for which care is sought."
  */
  protected java.util.List<ClaimDiagnosis> diagnosis;

  /**
  * Description: "Ordered list of patient procedures performed to support the adjudication."
  */
  protected java.util.List<ClaimProcedure> procedure;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  protected java.util.List<ClaimInsurance> insurance;

  /**
  * Description: "An accident which resulted in the need for healthcare services."
  */
  protected ClaimAccident accident;

  /**
  * Description: "The start and optional end dates of when the patient was precluded from working due to the treatable condition(s)."
  */
  protected Period employmentImpacted;

  /**
  * Description: "The start and optional end dates of when the patient was confined to a treatment center."
  */
  protected Period hospitalization;

  /**
  * Description: "First tier of goods and services."
  */
  protected java.util.List<ClaimItem> item;

  /**
  * Description: "The total value of the claim."
  */
  protected Money total;

  public Claim() {
  }

  public Claim(ClaimModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getSubType() && !o.getSubType().isEmpty()) {
    	this.subType = CodeableConceptHelper.fromArray2Array(o.getSubType());
    }
    if (null != o.getUse()) {
      this.use = o.getUse();
    }
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
    if (null != o.getPriority() && !o.getPriority().isEmpty()) {
      this.priority = new CodeableConcept(o.getPriority().get(0));
    }
    if (null != o.getFundsReserve() && !o.getFundsReserve().isEmpty()) {
      this.fundsReserve = new CodeableConcept(o.getFundsReserve().get(0));
    }
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related = ClaimRelatedHelper.fromArray2Array(o.getRelated());
    }
    if (null != o.getPrescription() && !o.getPrescription().isEmpty()) {
      this.prescription = new Reference(o.getPrescription().get(0));
    }
    if (null != o.getOriginalPrescription() && !o.getOriginalPrescription().isEmpty()) {
      this.originalPrescription = new Reference(o.getOriginalPrescription().get(0));
    }
    if (null != o.getPayee() && !o.getPayee().isEmpty()) {
      this.payee = new ClaimPayee(o.getPayee().get(0));
    }
    if (null != o.getReferral() && !o.getReferral().isEmpty()) {
      this.referral = new Reference(o.getReferral().get(0));
    }
    if (null != o.getFacility() && !o.getFacility().isEmpty()) {
      this.facility = new Reference(o.getFacility().get(0));
    }
    if (null != o.getCareTeam() && !o.getCareTeam().isEmpty()) {
    	this.careTeam = ClaimCareTeamHelper.fromArray2Array(o.getCareTeam());
    }
    if (null != o.getInformation() && !o.getInformation().isEmpty()) {
    	this.information = ClaimInformationHelper.fromArray2Array(o.getInformation());
    }
    if (null != o.getDiagnosis() && !o.getDiagnosis().isEmpty()) {
    	this.diagnosis = ClaimDiagnosisHelper.fromArray2Array(o.getDiagnosis());
    }
    if (null != o.getProcedure() && !o.getProcedure().isEmpty()) {
    	this.procedure = ClaimProcedureHelper.fromArray2Array(o.getProcedure());
    }
    if (null != o.getInsurance() && !o.getInsurance().isEmpty()) {
    	this.insurance = ClaimInsuranceHelper.fromArray2Array(o.getInsurance());
    }
    if (null != o.getAccident() && !o.getAccident().isEmpty()) {
      this.accident = new ClaimAccident(o.getAccident().get(0));
    }
    this.employmentImpacted = PeriodHelper.fromJson(o.getEmploymentImpacted());
    this.hospitalization = PeriodHelper.fromJson(o.getHospitalization());
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = ClaimItemHelper.fromArray2Array(o.getItem());
    }
    if (null != o.getTotal() && !o.getTotal().isEmpty()) {
      this.total = new Money(o.getTotal().get(0));
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
    this.status = value;
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
  public void setUse( String value) {
    this.use = UseEnum.fromCode(value);
  }
  public String getUse() {
    return this.use;
  }
  public void set_use( Element value) {
    this._use = value;
  }
  public Element get_use() {
    return this._use;
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
  public void setPriority( CodeableConcept value) {
    this.priority = value;
  }
  public CodeableConcept getPriority() {
    return this.priority;
  }
  public void setFundsReserve( CodeableConcept value) {
    this.fundsReserve = value;
  }
  public CodeableConcept getFundsReserve() {
    return this.fundsReserve;
  }
  public void setRelated( java.util.List<ClaimRelated> value) {
    this.related = value;
  }
  public java.util.List<ClaimRelated> getRelated() {
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
  public void setPayee( ClaimPayee value) {
    this.payee = value;
  }
  public ClaimPayee getPayee() {
    return this.payee;
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
  public void setCareTeam( java.util.List<ClaimCareTeam> value) {
    this.careTeam = value;
  }
  public java.util.List<ClaimCareTeam> getCareTeam() {
    return this.careTeam;
  }
  public void setInformation( java.util.List<ClaimInformation> value) {
    this.information = value;
  }
  public java.util.List<ClaimInformation> getInformation() {
    return this.information;
  }
  public void setDiagnosis( java.util.List<ClaimDiagnosis> value) {
    this.diagnosis = value;
  }
  public java.util.List<ClaimDiagnosis> getDiagnosis() {
    return this.diagnosis;
  }
  public void setProcedure( java.util.List<ClaimProcedure> value) {
    this.procedure = value;
  }
  public java.util.List<ClaimProcedure> getProcedure() {
    return this.procedure;
  }
  public void setInsurance( java.util.List<ClaimInsurance> value) {
    this.insurance = value;
  }
  public java.util.List<ClaimInsurance> getInsurance() {
    return this.insurance;
  }
  public void setAccident( ClaimAccident value) {
    this.accident = value;
  }
  public ClaimAccident getAccident() {
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
  public void setItem( java.util.List<ClaimItem> value) {
    this.item = value;
  }
  public java.util.List<ClaimItem> getItem() {
    return this.item;
  }
  public void setTotal( Money value) {
    this.total = value;
  }
  public Money getTotal() {
    return this.total;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Claim]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.subType != null) builder.append("subType" + "->" + this.subType.toString() + "\n"); 
     if(this.use != null) builder.append("use" + "->" + this.use.toString() + "\n"); 
     if(this._use != null) builder.append("_use" + "->" + this._use.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.billablePeriod != null) builder.append("billablePeriod" + "->" + this.billablePeriod.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.enterer != null) builder.append("enterer" + "->" + this.enterer.toString() + "\n"); 
     if(this.insurer != null) builder.append("insurer" + "->" + this.insurer.toString() + "\n"); 
     if(this.provider != null) builder.append("provider" + "->" + this.provider.toString() + "\n"); 
     if(this.organization != null) builder.append("organization" + "->" + this.organization.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this.fundsReserve != null) builder.append("fundsReserve" + "->" + this.fundsReserve.toString() + "\n"); 
     if(this.related != null) builder.append("related" + "->" + this.related.toString() + "\n"); 
     if(this.prescription != null) builder.append("prescription" + "->" + this.prescription.toString() + "\n"); 
     if(this.originalPrescription != null) builder.append("originalPrescription" + "->" + this.originalPrescription.toString() + "\n"); 
     if(this.payee != null) builder.append("payee" + "->" + this.payee.toString() + "\n"); 
     if(this.referral != null) builder.append("referral" + "->" + this.referral.toString() + "\n"); 
     if(this.facility != null) builder.append("facility" + "->" + this.facility.toString() + "\n"); 
     if(this.careTeam != null) builder.append("careTeam" + "->" + this.careTeam.toString() + "\n"); 
     if(this.information != null) builder.append("information" + "->" + this.information.toString() + "\n"); 
     if(this.diagnosis != null) builder.append("diagnosis" + "->" + this.diagnosis.toString() + "\n"); 
     if(this.procedure != null) builder.append("procedure" + "->" + this.procedure.toString() + "\n"); 
     if(this.insurance != null) builder.append("insurance" + "->" + this.insurance.toString() + "\n"); 
     if(this.accident != null) builder.append("accident" + "->" + this.accident.toString() + "\n"); 
     if(this.employmentImpacted != null) builder.append("employmentImpacted" + "->" + this.employmentImpacted.toString() + "\n"); 
     if(this.hospitalization != null) builder.append("hospitalization" + "->" + this.hospitalization.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); 
     if(this.total != null) builder.append("total" + "->" + this.total.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	Claim,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Claim" : { return Claim.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum UseEnum {
  	complete,
  	proposed,
  	exploratory,
  	other,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "complete" : { return complete.toString(); }
  			case "proposed" : { return proposed.toString(); }
  			case "exploratory" : { return exploratory.toString(); }
  			case "other" : { return other.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}