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
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
@Entity
@Table(name="claimresponse")
public class ClaimResponseModel  {
  /**
  * Description: "This is a ClaimResponse resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The Response business identifier."
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
  * Description: "Patient Resource."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`patient_id`", insertable=false, updatable=false)
  private ReferenceModel patient;

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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`insurer_id`", insertable=false, updatable=false)
  private ReferenceModel insurer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"requestprovider_id\"")
  private String requestprovider_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`requestprovider_id`", insertable=false, updatable=false)
  private ReferenceModel requestProvider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"requestorganization_id\"")
  private String requestorganization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`requestorganization_id`", insertable=false, updatable=false)
  private ReferenceModel requestOrganization;

  /**
  * Description: "Original request resource referrence."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`request_id`", insertable=false, updatable=false)
  private ReferenceModel request;

  /**
  * Description: "Processing outcome errror, partial or complete processing."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"outcome\"", length = 16777215)
  private String outcome;

  /**
  * Description: "A description of the status of the adjudication."
  */
  @javax.persistence.Basic
  @Column(name="\"disposition\"")
  private String disposition;

  /**
  * Description: "Party to be reimbursed: Subscriber, provider, other."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"payeeType\"", length = 16777215)
  private String payeeType;

  /**
  * Description: "The first tier service adjudications for submitted services."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseItemModel> item = new java.util.ArrayList<>();

  /**
  * Description: "The first tier service adjudications for payor added services."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseAddItemModel> addItem = new java.util.ArrayList<>();

  /**
  * Description: "Mutually exclusive with Services Provided (Item)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseErrorModel> error = new java.util.ArrayList<>();

  /**
  * Description: "The total cost of the services reported."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"totalCost\"", length = 16777215)
  private String totalCost;

  /**
  * Description: "The amount of deductible applied which was not allocated to any particular service line."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"unallocDeductable\"", length = 16777215)
  private String unallocDeductable;

  /**
  * Description: "Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible)."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"totalBenefit\"", length = 16777215)
  private String totalBenefit;

  /**
  * Description: "Payment details for the claim if the claim has been paid."
  */
  @javax.persistence.Basic
  @Column(name="\"payment_id\"")
  private String payment_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`payment_id`", insertable=false, updatable=false)
  private ClaimResponsePaymentModel payment;

  /**
  * Description: "Status of funds reservation (For provider, for Patient, None)."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reserved\"", length = 16777215)
  private String reserved;

  /**
  * Description: "The form to be used for printing the content."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"form\"", length = 16777215)
  private String form;

  /**
  * Description: "Note text."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseProcessNoteModel> processNote = new java.util.ArrayList<>();

  /**
  * Description: "Request for additional supporting or authorizing information, such as: documents, images or resources."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> communicationRequest = new java.util.ArrayList<>();

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseInsuranceModel> insurance = new java.util.ArrayList<>();

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


  public ClaimResponseModel() {
  }

  public ClaimResponseModel(ClaimResponse o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      if (null != o.getPatient()) {
      	this.patient_id = "patient" + this.getId();
        this.patient = new ReferenceModel(o.getPatient());
        this.patient.setId(this.patient_id);
        this.patient.parent_id = this.patient.getId();
      }

      this.created = o.getCreated();

      if (null != o.getInsurer()) {
      	this.insurer_id = "insurer" + this.getId();
        this.insurer = new ReferenceModel(o.getInsurer());
        this.insurer.setId(this.insurer_id);
        this.insurer.parent_id = this.insurer.getId();
      }

      if (null != o.getRequestProvider()) {
      	this.requestprovider_id = "requestProvider" + this.getId();
        this.requestProvider = new ReferenceModel(o.getRequestProvider());
        this.requestProvider.setId(this.requestprovider_id);
        this.requestProvider.parent_id = this.requestProvider.getId();
      }

      if (null != o.getRequestOrganization()) {
      	this.requestorganization_id = "requestOrganization" + this.getId();
        this.requestOrganization = new ReferenceModel(o.getRequestOrganization());
        this.requestOrganization.setId(this.requestorganization_id);
        this.requestOrganization.parent_id = this.requestOrganization.getId();
      }

      if (null != o.getRequest()) {
      	this.request_id = "request" + this.getId();
        this.request = new ReferenceModel(o.getRequest());
        this.request.setId(this.request_id);
        this.request.parent_id = this.request.getId();
      }

      this.outcome = CodeableConcept.toJson(o.getOutcome());
      this.disposition = o.getDisposition();

      this.payeeType = CodeableConcept.toJson(o.getPayeeType());
      this.item = ClaimResponseItem.toModelArray(o.getItem());

      this.addItem = ClaimResponseAddItem.toModelArray(o.getAddItem());

      this.error = ClaimResponseError.toModelArray(o.getError());

      this.totalCost = Money.toJson(o.getTotalCost());
      this.unallocDeductable = Money.toJson(o.getUnallocDeductable());
      this.totalBenefit = Money.toJson(o.getTotalBenefit());
      if (null != o.getPayment()) {
      	this.payment_id = "payment" + this.getId();
        this.payment = new ClaimResponsePaymentModel(o.getPayment());
        this.payment.setId(this.payment_id);
        this.payment.parent_id = this.payment.getId();
      }

      this.reserved = Coding.toJson(o.getReserved());
      this.form = CodeableConcept.toJson(o.getForm());
      this.processNote = ClaimResponseProcessNote.toModelArray(o.getProcessNote());

      this.communicationRequest = Reference.toModelArray(o.getCommunicationRequest());

      this.insurance = ClaimResponseInsurance.toModelArray(o.getInsurance());

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
  public void setPatient( ReferenceModel value) {
    this.patient = value;
  }
  public ReferenceModel getPatient() {
    return this.patient;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setInsurer( ReferenceModel value) {
    this.insurer = value;
  }
  public ReferenceModel getInsurer() {
    return this.insurer;
  }
  public void setRequestProvider( ReferenceModel value) {
    this.requestProvider = value;
  }
  public ReferenceModel getRequestProvider() {
    return this.requestProvider;
  }
  public void setRequestOrganization( ReferenceModel value) {
    this.requestOrganization = value;
  }
  public ReferenceModel getRequestOrganization() {
    return this.requestOrganization;
  }
  public void setRequest( ReferenceModel value) {
    this.request = value;
  }
  public ReferenceModel getRequest() {
    return this.request;
  }
  public void setOutcome( String value) {
    this.outcome = value;
  }
  public String getOutcome() {
    return this.outcome;
  }
  public void setDisposition( String value) {
    this.disposition = value;
  }
  public String getDisposition() {
    return this.disposition;
  }
  public void setPayeeType( String value) {
    this.payeeType = value;
  }
  public String getPayeeType() {
    return this.payeeType;
  }
  public void setItem( java.util.List<ClaimResponseItemModel> value) {
    this.item = value;
  }
  public java.util.List<ClaimResponseItemModel> getItem() {
    return this.item;
  }
  public void setAddItem( java.util.List<ClaimResponseAddItemModel> value) {
    this.addItem = value;
  }
  public java.util.List<ClaimResponseAddItemModel> getAddItem() {
    return this.addItem;
  }
  public void setError( java.util.List<ClaimResponseErrorModel> value) {
    this.error = value;
  }
  public java.util.List<ClaimResponseErrorModel> getError() {
    return this.error;
  }
  public void setTotalCost( String value) {
    this.totalCost = value;
  }
  public String getTotalCost() {
    return this.totalCost;
  }
  public void setUnallocDeductable( String value) {
    this.unallocDeductable = value;
  }
  public String getUnallocDeductable() {
    return this.unallocDeductable;
  }
  public void setTotalBenefit( String value) {
    this.totalBenefit = value;
  }
  public String getTotalBenefit() {
    return this.totalBenefit;
  }
  public void setPayment( ClaimResponsePaymentModel value) {
    this.payment = value;
  }
  public ClaimResponsePaymentModel getPayment() {
    return this.payment;
  }
  public void setReserved( String value) {
    this.reserved = value;
  }
  public String getReserved() {
    return this.reserved;
  }
  public void setForm( String value) {
    this.form = value;
  }
  public String getForm() {
    return this.form;
  }
  public void setProcessNote( java.util.List<ClaimResponseProcessNoteModel> value) {
    this.processNote = value;
  }
  public java.util.List<ClaimResponseProcessNoteModel> getProcessNote() {
    return this.processNote;
  }
  public void setCommunicationRequest( java.util.List<ReferenceModel> value) {
    this.communicationRequest = value;
  }
  public java.util.List<ReferenceModel> getCommunicationRequest() {
    return this.communicationRequest;
  }
  public void setInsurance( java.util.List<ClaimResponseInsuranceModel> value) {
    this.insurance = value;
  }
  public java.util.List<ClaimResponseInsuranceModel> getInsurance() {
    return this.insurance;
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
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("insurer" + "[" + String.valueOf(this.insurer) + "]\n"); 
     builder.append("requestProvider" + "[" + String.valueOf(this.requestProvider) + "]\n"); 
     builder.append("requestOrganization" + "[" + String.valueOf(this.requestOrganization) + "]\n"); 
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("disposition" + "[" + String.valueOf(this.disposition) + "]\n"); 
     builder.append("payeeType" + "[" + String.valueOf(this.payeeType) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("addItem" + "[" + String.valueOf(this.addItem) + "]\n"); 
     builder.append("error" + "[" + String.valueOf(this.error) + "]\n"); 
     builder.append("totalCost" + "[" + String.valueOf(this.totalCost) + "]\n"); 
     builder.append("unallocDeductable" + "[" + String.valueOf(this.unallocDeductable) + "]\n"); 
     builder.append("totalBenefit" + "[" + String.valueOf(this.totalBenefit) + "]\n"); 
     builder.append("payment" + "[" + String.valueOf(this.payment) + "]\n"); 
     builder.append("reserved" + "[" + String.valueOf(this.reserved) + "]\n"); 
     builder.append("form" + "[" + String.valueOf(this.form) + "]\n"); 
     builder.append("processNote" + "[" + String.valueOf(this.processNote) + "]\n"); 
     builder.append("communicationRequest" + "[" + String.valueOf(this.communicationRequest) + "]\n"); 
     builder.append("insurance" + "[" + String.valueOf(this.insurance) + "]\n"); 
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