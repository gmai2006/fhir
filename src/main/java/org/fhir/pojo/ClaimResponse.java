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
import org.fhir.entity.ClaimResponseModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
public class ClaimResponse  {
  /**
  * Description: "This is a ClaimResponse resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The Response business identifier."
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
  * Description: "Patient Resource."
  */
  private Reference patient;

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
  * Description: "The Insurer who produced this adjudicated response."
  */
  private Reference insurer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  private Reference requestProvider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  private Reference requestOrganization;

  /**
  * Description: "Original request resource referrence."
  */
  private Reference request;

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
  * Description: "Party to be reimbursed: Subscriber, provider, other."
  */
  private CodeableConcept payeeType;

  /**
  * Description: "The first tier service adjudications for submitted services."
  */
  private java.util.List<ClaimResponseItem> item = new java.util.ArrayList<>();

  /**
  * Description: "The first tier service adjudications for payor added services."
  */
  private java.util.List<ClaimResponseAddItem> addItem = new java.util.ArrayList<>();

  /**
  * Description: "Mutually exclusive with Services Provided (Item)."
  */
  private java.util.List<ClaimResponseError> error = new java.util.ArrayList<>();

  /**
  * Description: "The total cost of the services reported."
  */
  private Money totalCost;

  /**
  * Description: "The amount of deductible applied which was not allocated to any particular service line."
  */
  private Money unallocDeductable;

  /**
  * Description: "Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible)."
  */
  private Money totalBenefit;

  /**
  * Description: "Payment details for the claim if the claim has been paid."
  */
  private ClaimResponsePayment payment;

  /**
  * Description: "Status of funds reservation (For provider, for Patient, None)."
  */
  private Coding reserved;

  /**
  * Description: "The form to be used for printing the content."
  */
  private CodeableConcept form;

  /**
  * Description: "Note text."
  */
  private java.util.List<ClaimResponseProcessNote> processNote = new java.util.ArrayList<>();

  /**
  * Description: "Request for additional supporting or authorizing information, such as: documents, images or resources."
  */
  private java.util.List<Reference> communicationRequest = new java.util.ArrayList<>();

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  private java.util.List<ClaimResponseInsurance> insurance = new java.util.ArrayList<>();

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

  public ClaimResponse() {
  }

  public ClaimResponse(ClaimResponseModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getInsurer() && !o.getInsurer().isEmpty()) {
      this.insurer = new Reference(o.getInsurer().get(0));
    }
    if (null != o.getRequestProvider() && !o.getRequestProvider().isEmpty()) {
      this.requestProvider = new Reference(o.getRequestProvider().get(0));
    }
    if (null != o.getRequestOrganization() && !o.getRequestOrganization().isEmpty()) {
      this.requestOrganization = new Reference(o.getRequestOrganization().get(0));
    }
    if (null != o.getRequest() && !o.getRequest().isEmpty()) {
      this.request = new Reference(o.getRequest().get(0));
    }
    this.outcome = CodeableConceptHelper.fromJson(o.getOutcome());
    if (null != o.getDisposition()) {
      this.disposition = o.getDisposition();
    }
    this.payeeType = CodeableConceptHelper.fromJson(o.getPayeeType());
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = ClaimResponseItemHelper.fromArray2Array(o.getItem());
    }
    if (null != o.getAddItem() && !o.getAddItem().isEmpty()) {
    	this.addItem = ClaimResponseAddItemHelper.fromArray2Array(o.getAddItem());
    }
    if (null != o.getError() && !o.getError().isEmpty()) {
    	this.error = ClaimResponseErrorHelper.fromArray2Array(o.getError());
    }
    this.totalCost = MoneyHelper.fromJson(o.getTotalCost());
    this.unallocDeductable = MoneyHelper.fromJson(o.getUnallocDeductable());
    this.totalBenefit = MoneyHelper.fromJson(o.getTotalBenefit());
    if (null != o.getPayment() && !o.getPayment().isEmpty()) {
      this.payment = new ClaimResponsePayment(o.getPayment().get(0));
    }
    this.reserved = CodingHelper.fromJson(o.getReserved());
    this.form = CodeableConceptHelper.fromJson(o.getForm());
    if (null != o.getProcessNote() && !o.getProcessNote().isEmpty()) {
    	this.processNote = ClaimResponseProcessNoteHelper.fromArray2Array(o.getProcessNote());
    }
    if (null != o.getCommunicationRequest() && !o.getCommunicationRequest().isEmpty()) {
    	this.communicationRequest = ReferenceHelper.fromArray2Array(o.getCommunicationRequest());
    }
    if (null != o.getInsurance() && !o.getInsurance().isEmpty()) {
    	this.insurance = ClaimResponseInsuranceHelper.fromArray2Array(o.getInsurance());
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
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
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
  public void setInsurer( Reference value) {
    this.insurer = value;
  }
  public Reference getInsurer() {
    return this.insurer;
  }
  public void setRequestProvider( Reference value) {
    this.requestProvider = value;
  }
  public Reference getRequestProvider() {
    return this.requestProvider;
  }
  public void setRequestOrganization( Reference value) {
    this.requestOrganization = value;
  }
  public Reference getRequestOrganization() {
    return this.requestOrganization;
  }
  public void setRequest( Reference value) {
    this.request = value;
  }
  public Reference getRequest() {
    return this.request;
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
  public void setPayeeType( CodeableConcept value) {
    this.payeeType = value;
  }
  public CodeableConcept getPayeeType() {
    return this.payeeType;
  }
  public void setItem( java.util.List<ClaimResponseItem> value) {
    this.item = value;
  }
  public java.util.List<ClaimResponseItem> getItem() {
    return this.item;
  }
  public void setAddItem( java.util.List<ClaimResponseAddItem> value) {
    this.addItem = value;
  }
  public java.util.List<ClaimResponseAddItem> getAddItem() {
    return this.addItem;
  }
  public void setError( java.util.List<ClaimResponseError> value) {
    this.error = value;
  }
  public java.util.List<ClaimResponseError> getError() {
    return this.error;
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
  public void setPayment( ClaimResponsePayment value) {
    this.payment = value;
  }
  public ClaimResponsePayment getPayment() {
    return this.payment;
  }
  public void setReserved( Coding value) {
    this.reserved = value;
  }
  public Coding getReserved() {
    return this.reserved;
  }
  public void setForm( CodeableConcept value) {
    this.form = value;
  }
  public CodeableConcept getForm() {
    return this.form;
  }
  public void setProcessNote( java.util.List<ClaimResponseProcessNote> value) {
    this.processNote = value;
  }
  public java.util.List<ClaimResponseProcessNote> getProcessNote() {
    return this.processNote;
  }
  public void setCommunicationRequest( java.util.List<Reference> value) {
    this.communicationRequest = value;
  }
  public java.util.List<Reference> getCommunicationRequest() {
    return this.communicationRequest;
  }
  public void setInsurance( java.util.List<ClaimResponseInsurance> value) {
    this.insurance = value;
  }
  public java.util.List<ClaimResponseInsurance> getInsurance() {
    return this.insurance;
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
    builder.append("[ClaimResponse]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.insurer != null) builder.append("insurer" + "->" + this.insurer.toString() + "\n"); 
     if(this.requestProvider != null) builder.append("requestProvider" + "->" + this.requestProvider.toString() + "\n"); 
     if(this.requestOrganization != null) builder.append("requestOrganization" + "->" + this.requestOrganization.toString() + "\n"); 
     if(this.request != null) builder.append("request" + "->" + this.request.toString() + "\n"); 
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this.disposition != null) builder.append("disposition" + "->" + this.disposition.toString() + "\n"); 
     if(this._disposition != null) builder.append("_disposition" + "->" + this._disposition.toString() + "\n"); 
     if(this.payeeType != null) builder.append("payeeType" + "->" + this.payeeType.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); 
     if(this.addItem != null) builder.append("addItem" + "->" + this.addItem.toString() + "\n"); 
     if(this.error != null) builder.append("error" + "->" + this.error.toString() + "\n"); 
     if(this.totalCost != null) builder.append("totalCost" + "->" + this.totalCost.toString() + "\n"); 
     if(this.unallocDeductable != null) builder.append("unallocDeductable" + "->" + this.unallocDeductable.toString() + "\n"); 
     if(this.totalBenefit != null) builder.append("totalBenefit" + "->" + this.totalBenefit.toString() + "\n"); 
     if(this.payment != null) builder.append("payment" + "->" + this.payment.toString() + "\n"); 
     if(this.reserved != null) builder.append("reserved" + "->" + this.reserved.toString() + "\n"); 
     if(this.form != null) builder.append("form" + "->" + this.form.toString() + "\n"); 
     if(this.processNote != null) builder.append("processNote" + "->" + this.processNote.toString() + "\n"); 
     if(this.communicationRequest != null) builder.append("communicationRequest" + "->" + this.communicationRequest.toString() + "\n"); 
     if(this.insurance != null) builder.append("insurance" + "->" + this.insurance.toString() + "\n"); 
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
  	ClaimResponse,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ClaimResponse" : { return ClaimResponse.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}