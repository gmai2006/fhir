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
* "This resource provides the adjudication details from the processing of a Claim resource."
* generated on 07/14/2018
*/
@Entity
@Table(name="claimresponse")
public class ClaimResponseModel  implements Serializable {
	private static final long serialVersionUID = 153159210196848977L;
  /**
  * Description: "This is a ClaimResponse resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The Response business identifier."
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
  * Description: "Patient Resource."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "The date when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"created\"")
  private String created;

  /**
  * Description: "The Insurer who produced this adjudicated response."
  */
  @javax.persistence.Basic
  @Column(name="\"insurer_id\"")
  private String insurer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="insurer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> insurer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"requestprovider_id\"")
  private String requestprovider_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="requestprovider_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> requestProvider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"requestorganization_id\"")
  private String requestorganization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="requestorganization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> requestOrganization;

  /**
  * Description: "Original request resource referrence."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="request_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> request;

  /**
  * Description: "Processing outcome errror, partial or complete processing."
  */
  @javax.persistence.Basic
  @Column(name="\"outcome_id\"")
  private String outcome_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="outcome_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> outcome;

  /**
  * Description: "A description of the status of the adjudication."
  */
  @javax.persistence.Basic
  @Column(name="\"disposition\"")
  private String disposition;

  /**
  * Description: "Party to be reimbursed: Subscriber, provider, other."
  */
  @javax.persistence.Basic
  @Column(name="\"payeetype_id\"")
  private String payeetype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="payeetype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> payeeType;

  /**
  * Description: "The first tier service adjudications for submitted services."
  */
  @javax.persistence.Basic
  @Column(name="\"item_id\"")
  private String item_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="item_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseItemModel> item;

  /**
  * Description: "The first tier service adjudications for payor added services."
  */
  @javax.persistence.Basic
  @Column(name="\"additem_id\"")
  private String additem_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="additem_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseAddItemModel> addItem;

  /**
  * Description: "Mutually exclusive with Services Provided (Item)."
  */
  @javax.persistence.Basic
  @Column(name="\"error_id\"")
  private String error_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="error_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseErrorModel> error;

  /**
  * Description: "The total cost of the services reported."
  */
  @javax.persistence.Basic
  @Column(name="\"totalcost_id\"")
  private String totalcost_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="totalcost_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> totalCost;

  /**
  * Description: "The amount of deductible applied which was not allocated to any particular service line."
  */
  @javax.persistence.Basic
  @Column(name="\"unallocdeductable_id\"")
  private String unallocdeductable_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="unallocdeductable_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> unallocDeductable;

  /**
  * Description: "Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible)."
  */
  @javax.persistence.Basic
  @Column(name="\"totalbenefit_id\"")
  private String totalbenefit_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="totalbenefit_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> totalBenefit;

  /**
  * Description: "Payment details for the claim if the claim has been paid."
  */
  @javax.persistence.Basic
  @Column(name="\"payment_id\"")
  private String payment_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="payment_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponsePaymentModel> payment;

  /**
  * Description: "Status of funds reservation (For provider, for Patient, None)."
  */
  @javax.persistence.Basic
  @Column(name="\"reserved_id\"")
  private String reserved_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reserved_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> reserved;

  /**
  * Description: "The form to be used for printing the content."
  */
  @javax.persistence.Basic
  @Column(name="\"form_id\"")
  private String form_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="form_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> form;

  /**
  * Description: "Note text."
  */
  @javax.persistence.Basic
  @Column(name="\"processnote_id\"")
  private String processnote_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="processnote_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseProcessNoteModel> processNote;

  /**
  * Description: "Request for additional supporting or authorizing information, such as: documents, images or resources."
  */
  @javax.persistence.Basic
  @Column(name="\"communicationrequest_id\"")
  private String communicationrequest_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="communicationrequest_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> communicationRequest;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  @javax.persistence.Basic
  @Column(name="\"insurance_id\"")
  private String insurance_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="insurance_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseInsuranceModel> insurance;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public ClaimResponseModel() {
  }

  public ClaimResponseModel(ClaimResponse o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    this.created = o.getCreated();
    if (null != o.getInsurer() ) {
    	this.insurer_id = "insurer" + this.id;
    	this.insurer = ReferenceHelper.toModel(o.getInsurer(), this.insurer_id);
    }
    if (null != o.getRequestProvider() ) {
    	this.requestprovider_id = "requestprovider" + this.id;
    	this.requestProvider = ReferenceHelper.toModel(o.getRequestProvider(), this.requestprovider_id);
    }
    if (null != o.getRequestOrganization() ) {
    	this.requestorganization_id = "requestorganization" + this.id;
    	this.requestOrganization = ReferenceHelper.toModel(o.getRequestOrganization(), this.requestorganization_id);
    }
    if (null != o.getRequest() ) {
    	this.request_id = "request" + this.id;
    	this.request = ReferenceHelper.toModel(o.getRequest(), this.request_id);
    }
    if (null != o.getOutcome() ) {
    	this.outcome_id = "outcome" + this.id;
    	this.outcome = CodeableConceptHelper.toModel(o.getOutcome(), this.outcome_id);
    }
    this.disposition = o.getDisposition();
    if (null != o.getPayeeType() ) {
    	this.payeetype_id = "payeetype" + this.id;
    	this.payeeType = CodeableConceptHelper.toModel(o.getPayeeType(), this.payeetype_id);
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item_id = "item" + this.id;
    	this.item = ClaimResponseItemHelper.toModelFromArray(o.getItem(), this.item_id);
    }
    if (null != o.getAddItem() && !o.getAddItem().isEmpty()) {
    	this.additem_id = "additem" + this.id;
    	this.addItem = ClaimResponseAddItemHelper.toModelFromArray(o.getAddItem(), this.additem_id);
    }
    if (null != o.getError() && !o.getError().isEmpty()) {
    	this.error_id = "error" + this.id;
    	this.error = ClaimResponseErrorHelper.toModelFromArray(o.getError(), this.error_id);
    }
    if (null != o.getTotalCost() ) {
    	this.totalcost_id = "totalcost" + this.id;
    	this.totalCost = MoneyHelper.toModel(o.getTotalCost(), this.totalcost_id);
    }
    if (null != o.getUnallocDeductable() ) {
    	this.unallocdeductable_id = "unallocdeductable" + this.id;
    	this.unallocDeductable = MoneyHelper.toModel(o.getUnallocDeductable(), this.unallocdeductable_id);
    }
    if (null != o.getTotalBenefit() ) {
    	this.totalbenefit_id = "totalbenefit" + this.id;
    	this.totalBenefit = MoneyHelper.toModel(o.getTotalBenefit(), this.totalbenefit_id);
    }
    if (null != o.getPayment() ) {
    	this.payment_id = "payment" + this.id;
    	this.payment = ClaimResponsePaymentHelper.toModel(o.getPayment(), this.payment_id);
    }
    if (null != o.getReserved() ) {
    	this.reserved_id = "reserved" + this.id;
    	this.reserved = CodingHelper.toModel(o.getReserved(), this.reserved_id);
    }
    if (null != o.getForm() ) {
    	this.form_id = "form" + this.id;
    	this.form = CodeableConceptHelper.toModel(o.getForm(), this.form_id);
    }
    if (null != o.getProcessNote() && !o.getProcessNote().isEmpty()) {
    	this.processnote_id = "processnote" + this.id;
    	this.processNote = ClaimResponseProcessNoteHelper.toModelFromArray(o.getProcessNote(), this.processnote_id);
    }
    if (null != o.getCommunicationRequest() && !o.getCommunicationRequest().isEmpty()) {
    	this.communicationrequest_id = "communicationrequest" + this.id;
    	this.communicationRequest = ReferenceHelper.toModelFromArray(o.getCommunicationRequest(), this.communicationrequest_id);
    }
    if (null != o.getInsurance() && !o.getInsurance().isEmpty()) {
    	this.insurance_id = "insurance" + this.id;
    	this.insurance = ClaimResponseInsuranceHelper.toModelFromArray(o.getInsurance(), this.insurance_id);
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
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public java.util.List<ReferenceModel> getInsurer() {
    return this.insurer;
  }
  public void setInsurer( java.util.List<ReferenceModel> value) {
    this.insurer = value;
  }
  public java.util.List<ReferenceModel> getRequestProvider() {
    return this.requestProvider;
  }
  public void setRequestProvider( java.util.List<ReferenceModel> value) {
    this.requestProvider = value;
  }
  public java.util.List<ReferenceModel> getRequestOrganization() {
    return this.requestOrganization;
  }
  public void setRequestOrganization( java.util.List<ReferenceModel> value) {
    this.requestOrganization = value;
  }
  public java.util.List<ReferenceModel> getRequest() {
    return this.request;
  }
  public void setRequest( java.util.List<ReferenceModel> value) {
    this.request = value;
  }
  public java.util.List<CodeableConceptModel> getOutcome() {
    return this.outcome;
  }
  public void setOutcome( java.util.List<CodeableConceptModel> value) {
    this.outcome = value;
  }
  public String getDisposition() {
    return this.disposition;
  }
  public void setDisposition( String value) {
    this.disposition = value;
  }
  public java.util.List<CodeableConceptModel> getPayeeType() {
    return this.payeeType;
  }
  public void setPayeeType( java.util.List<CodeableConceptModel> value) {
    this.payeeType = value;
  }
  public java.util.List<ClaimResponseItemModel> getItem() {
    return this.item;
  }
  public void setItem( java.util.List<ClaimResponseItemModel> value) {
    this.item = value;
  }
  public java.util.List<ClaimResponseAddItemModel> getAddItem() {
    return this.addItem;
  }
  public void setAddItem( java.util.List<ClaimResponseAddItemModel> value) {
    this.addItem = value;
  }
  public java.util.List<ClaimResponseErrorModel> getError() {
    return this.error;
  }
  public void setError( java.util.List<ClaimResponseErrorModel> value) {
    this.error = value;
  }
  public java.util.List<MoneyModel> getTotalCost() {
    return this.totalCost;
  }
  public void setTotalCost( java.util.List<MoneyModel> value) {
    this.totalCost = value;
  }
  public java.util.List<MoneyModel> getUnallocDeductable() {
    return this.unallocDeductable;
  }
  public void setUnallocDeductable( java.util.List<MoneyModel> value) {
    this.unallocDeductable = value;
  }
  public java.util.List<MoneyModel> getTotalBenefit() {
    return this.totalBenefit;
  }
  public void setTotalBenefit( java.util.List<MoneyModel> value) {
    this.totalBenefit = value;
  }
  public java.util.List<ClaimResponsePaymentModel> getPayment() {
    return this.payment;
  }
  public void setPayment( java.util.List<ClaimResponsePaymentModel> value) {
    this.payment = value;
  }
  public java.util.List<CodingModel> getReserved() {
    return this.reserved;
  }
  public void setReserved( java.util.List<CodingModel> value) {
    this.reserved = value;
  }
  public java.util.List<CodeableConceptModel> getForm() {
    return this.form;
  }
  public void setForm( java.util.List<CodeableConceptModel> value) {
    this.form = value;
  }
  public java.util.List<ClaimResponseProcessNoteModel> getProcessNote() {
    return this.processNote;
  }
  public void setProcessNote( java.util.List<ClaimResponseProcessNoteModel> value) {
    this.processNote = value;
  }
  public java.util.List<ReferenceModel> getCommunicationRequest() {
    return this.communicationRequest;
  }
  public void setCommunicationRequest( java.util.List<ReferenceModel> value) {
    this.communicationRequest = value;
  }
  public java.util.List<ClaimResponseInsuranceModel> getInsurance() {
    return this.insurance;
  }
  public void setInsurance( java.util.List<ClaimResponseInsuranceModel> value) {
    this.insurance = value;
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
    builder.append("[ClaimResponseModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("disposition" + "->" + this.disposition + "\n"); 
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
    builder.append("[ClaimResponseModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("disposition" + "->" + this.disposition + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}