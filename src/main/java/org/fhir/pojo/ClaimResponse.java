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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource provides the adjudication details from the processing of a Claim resource."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClaimResponse  extends DomainResource  {
  /**
  * Description: "This is a ClaimResponse resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The Response business identifier."
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
  * Description: "Patient Resource."
  */
  protected Reference patient;

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
  * Description: "The Insurer who produced this adjudicated response."
  */
  protected Reference insurer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  protected Reference requestProvider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  protected Reference requestOrganization;

  /**
  * Description: "Original request resource referrence."
  */
  protected Reference request;

  /**
  * Description: "Processing outcome errror, partial or complete processing."
  */
  protected CodeableConcept outcome;

  /**
  * Description: "A description of the status of the adjudication."
  */
  protected String disposition;

  /**
  * Description: "Extensions for disposition"
  */
  protected transient Element _disposition;

  /**
  * Description: "Party to be reimbursed: Subscriber, provider, other."
  */
  protected CodeableConcept payeeType;

  /**
  * Description: "The first tier service adjudications for submitted services."
  */
  protected java.util.List<ClaimResponseItem> item;

  /**
  * Description: "The first tier service adjudications for payor added services."
  */
  protected java.util.List<ClaimResponseAddItem> addItem;

  /**
  * Description: "Mutually exclusive with Services Provided (Item)."
  */
  protected java.util.List<ClaimResponseError> error;

  /**
  * Description: "The total cost of the services reported."
  */
  protected Money totalCost;

  /**
  * Description: "The amount of deductible applied which was not allocated to any particular service line."
  */
  protected Money unallocDeductable;

  /**
  * Description: "Total amount of benefit payable (Equal to sum of the Benefit amounts from all detail lines and additions less the Unallocated Deductible)."
  */
  protected Money totalBenefit;

  /**
  * Description: "Payment details for the claim if the claim has been paid."
  */
  protected ClaimResponsePayment payment;

  /**
  * Description: "Status of funds reservation (For provider, for Patient, None)."
  */
  protected Coding reserved;

  /**
  * Description: "The form to be used for printing the content."
  */
  protected CodeableConcept form;

  /**
  * Description: "Note text."
  */
  protected java.util.List<ClaimResponseProcessNote> processNote;

  /**
  * Description: "Request for additional supporting or authorizing information, such as: documents, images or resources."
  */
  protected java.util.List<Reference> communicationRequest;

  /**
  * Description: "Financial instrument by which payment information for health care."
  */
  protected java.util.List<ClaimResponseInsurance> insurance;

  public ClaimResponse() {
  }

  public ClaimResponse(ClaimResponseModel o) {
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
    if (null != o.getOutcome() && !o.getOutcome().isEmpty()) {
      this.outcome = new CodeableConcept(o.getOutcome().get(0));
    }
    if (null != o.getDisposition()) {
      this.disposition = o.getDisposition();
    }
    if (null != o.getPayeeType() && !o.getPayeeType().isEmpty()) {
      this.payeeType = new CodeableConcept(o.getPayeeType().get(0));
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = ClaimResponseItemHelper.fromArray2Array(o.getItem());
    }
    if (null != o.getAddItem() && !o.getAddItem().isEmpty()) {
    	this.addItem = ClaimResponseAddItemHelper.fromArray2Array(o.getAddItem());
    }
    if (null != o.getError() && !o.getError().isEmpty()) {
    	this.error = ClaimResponseErrorHelper.fromArray2Array(o.getError());
    }
    if (null != o.getTotalCost() && !o.getTotalCost().isEmpty()) {
      this.totalCost = new Money(o.getTotalCost().get(0));
    }
    if (null != o.getUnallocDeductable() && !o.getUnallocDeductable().isEmpty()) {
      this.unallocDeductable = new Money(o.getUnallocDeductable().get(0));
    }
    if (null != o.getTotalBenefit() && !o.getTotalBenefit().isEmpty()) {
      this.totalBenefit = new Money(o.getTotalBenefit().get(0));
    }
    if (null != o.getPayment() && !o.getPayment().isEmpty()) {
      this.payment = new ClaimResponsePayment(o.getPayment().get(0));
    }
    if (null != o.getReserved() && !o.getReserved().isEmpty()) {
      this.reserved = new Coding(o.getReserved().get(0));
    }
    if (null != o.getForm() && !o.getForm().isEmpty()) {
      this.form = new CodeableConcept(o.getForm().get(0));
    }
    if (null != o.getProcessNote() && !o.getProcessNote().isEmpty()) {
    	this.processNote = ClaimResponseProcessNoteHelper.fromArray2Array(o.getProcessNote());
    }
    if (null != o.getCommunicationRequest() && !o.getCommunicationRequest().isEmpty()) {
    	this.communicationRequest = ReferenceHelper.fromArray2Array(o.getCommunicationRequest());
    }
    if (null != o.getInsurance() && !o.getInsurance().isEmpty()) {
    	this.insurance = ClaimResponseInsuranceHelper.fromArray2Array(o.getInsurance());
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
     if(this.insurance != null) builder.append("insurance" + "->" + this.insurance.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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