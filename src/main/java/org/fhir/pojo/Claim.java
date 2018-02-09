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
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class Claim  {
  /**
  * Description: "This is a Claim resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The business identifier for the instance: claim number, pre-determination or pre-authorization number."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
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
  * Description: "Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination)."
  */
  private String use;

  /**
  * Description: "Extensions for use"
  */
  private transient Element _use;

  /**
  * Description: "Patient Resource."
  */
  private Reference patient;

  /**
  * Description: "The billable period for which charges are being submitted."
  */
  private Period billablePeriod;

  /**
  * Description: "The date when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String created;

  /**
  * Description: "Extensions for created"
  */
  private transient Element _created;

  /**
  * Description: "Person who created the invoice/claim/pre-determination or pre-authorization."
  */
  private Reference enterer;

  /**
  * Description: "The Insurer who is target of the request."
  */
  private Reference insurer;

  /**
  * Description: "The provider which is responsible for the bill, claim pre-determination, pre-authorization."
  */
  private Reference provider;

  /**
  * Description: "The organization which is responsible for the bill, claim pre-determination, pre-authorization."
  */
  private Reference organization;

  /**
  * Description: "Immediate (STAT), best effort (NORMAL), deferred (DEFER)."
  */
  private CodeableConcept priority;

  /**
  * Description: "In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested."
  */
  private CodeableConcept fundsReserve;

  /**
  * Description: "Other claims which are related to this claim such as prior claim versions or for related services."
  */
  private java.util.List<ClaimRelated> related = new java.util.ArrayList<>();

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
  private ClaimPayee payee;

  /**
  * Description: "The referral resource which lists the date, practitioner, reason and other supporting information."
  */
  private Reference referral;

  /**
  * Description: "Facility where the services were provided."
  */
  private Reference facility;

  /**
  * Description: "The members of the team who provided the overall service as well as their role and whether responsible and qualifications."
  */
  private java.util.List<ClaimCareTeam> careTeam = new java.util.ArrayList<>();

  /**
  * Description: "Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues. Often there are mutiple jurisdiction specific valuesets which are required."
  */
  private java.util.List<ClaimInformation> information = new java.util.ArrayList<>();

  /**
  * Description: "List of patient diagnosis for which care is sought."
  */
  private java.util.List<ClaimDiagnosis> diagnosis = new java.util.ArrayList<>();

  /**
  * Description: "Ordered list of patient procedures performed to support the adjudication."
  */
  private java.util.List<ClaimProcedure> procedure = new java.util.ArrayList<>();

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  private java.util.List<ClaimInsurance> insurance = new java.util.ArrayList<>();

  /**
  * Description: "An accident which resulted in the need for healthcare services."
  */
  private ClaimAccident accident;

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
  private java.util.List<ClaimItem> item = new java.util.ArrayList<>();

  /**
  * Description: "The total value of the claim."
  */
  private Money total;

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

  public Claim() {
  }

  public Claim(ClaimModel o) {
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
      if (null != o.getUse()) {
        this.use = new String(o.getUse());
      }

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

      this.priority = CodeableConcept.fromJson(o.getPriority());
      this.fundsReserve = CodeableConcept.fromJson(o.getFundsReserve());
      this.related = ClaimRelated.fromArray(o.getRelated());

      if (null != o.getPrescription()) {
        this.prescription = new Reference(o.getPrescription());
        this.prescription.setId(this.getId());
      }

      if (null != o.getOriginalPrescription()) {
        this.originalPrescription = new Reference(o.getOriginalPrescription());
        this.originalPrescription.setId(this.getId());
      }

      if (null != o.getPayee()) {
        this.payee = new ClaimPayee(o.getPayee());
        this.payee.setId(this.getId());
      }

      if (null != o.getReferral()) {
        this.referral = new Reference(o.getReferral());
        this.referral.setId(this.getId());
      }

      if (null != o.getFacility()) {
        this.facility = new Reference(o.getFacility());
        this.facility.setId(this.getId());
      }

      this.careTeam = ClaimCareTeam.fromArray(o.getCareTeam());

      this.information = ClaimInformation.fromArray(o.getInformation());

      this.diagnosis = ClaimDiagnosis.fromArray(o.getDiagnosis());

      this.procedure = ClaimProcedure.fromArray(o.getProcedure());

      this.insurance = ClaimInsurance.fromArray(o.getInsurance());

      if (null != o.getAccident()) {
        this.accident = new ClaimAccident(o.getAccident());
        this.accident.setId(this.getId());
      }

      this.employmentImpacted = Period.fromJson(o.getEmploymentImpacted());
      this.hospitalization = Period.fromJson(o.getHospitalization());
      this.item = ClaimItem.fromArray(o.getItem());

      this.total = Money.fromJson(o.getTotal());
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
     builder.append("use" + "[" + String.valueOf(this.use) + "]\n"); 
     builder.append("_use" + "[" + String.valueOf(this._use) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("billablePeriod" + "[" + String.valueOf(this.billablePeriod) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("_created" + "[" + String.valueOf(this._created) + "]\n"); 
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
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

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

  public static java.util.List<Claim> fromArray(java.util.List<ClaimModel> list) {
    return (java.util.List<Claim>)list.stream()
      .map(model -> new Claim(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClaimModel> toModelArray(java.util.List<Claim> list) {
    return (java.util.List<ClaimModel>)list.stream()
      .map(model -> new ClaimModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Claim fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Claim.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Claim o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Claim> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}