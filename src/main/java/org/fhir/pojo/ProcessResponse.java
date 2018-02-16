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
import org.fhir.entity.ProcessResponseModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides processing status, errors and notes from the processing of a resource."
*/
public class ProcessResponse  extends DomainResource  {
  /**
  * Description: "This is a ProcessResponse resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The Response business identifier."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

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
  * Description: "The date when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String created;

  /**
  * Description: "Extensions for created"
  */
  protected transient Element _created;

  /**
  * Description: "The organization who produced this adjudicated response."
  */
  protected Reference organization;

  /**
  * Description: "Original request resource reference."
  */
  protected Reference request;

  /**
  * Description: "Transaction status: error, complete, held."
  */
  protected CodeableConcept outcome;

  /**
  * Description: "A description of the status of the adjudication or processing."
  */
  protected String disposition;

  /**
  * Description: "Extensions for disposition"
  */
  protected transient Element _disposition;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  protected Reference requestProvider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  protected Reference requestOrganization;

  /**
  * Description: "The form to be used for printing the content."
  */
  protected CodeableConcept form;

  /**
  * Description: "Suite of processing notes or additional requirements if the processing has been held."
  */
  protected java.util.List<ProcessResponseProcessNote> processNote = new java.util.ArrayList<>();

  /**
  * Description: "Processing errors."
  */
  protected java.util.List<CodeableConcept> error = new java.util.ArrayList<>();

  /**
  * Description: "Request for additional supporting or authorizing information, such as: documents, images or resources."
  */
  protected java.util.List<Reference> communicationRequest = new java.util.ArrayList<>();

  public ProcessResponse() {
  }

  public ProcessResponse(ProcessResponseModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getOrganization() && !o.getOrganization().isEmpty()) {
      this.organization = new Reference(o.getOrganization().get(0));
    }
    if (null != o.getRequest() && !o.getRequest().isEmpty()) {
      this.request = new Reference(o.getRequest().get(0));
    }
    this.outcome = CodeableConceptHelper.fromJson(o.getOutcome());
    if (null != o.getDisposition()) {
      this.disposition = o.getDisposition();
    }
    if (null != o.getRequestProvider() && !o.getRequestProvider().isEmpty()) {
      this.requestProvider = new Reference(o.getRequestProvider().get(0));
    }
    if (null != o.getRequestOrganization() && !o.getRequestOrganization().isEmpty()) {
      this.requestOrganization = new Reference(o.getRequestOrganization().get(0));
    }
    this.form = CodeableConceptHelper.fromJson(o.getForm());
    if (null != o.getProcessNote() && !o.getProcessNote().isEmpty()) {
    	this.processNote = ProcessResponseProcessNoteHelper.fromArray2Array(o.getProcessNote());
    }
    if (null != o.getCommunicationRequest() && !o.getCommunicationRequest().isEmpty()) {
    	this.communicationRequest = ReferenceHelper.fromArray2Array(o.getCommunicationRequest());
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
  public void setOrganization( Reference value) {
    this.organization = value;
  }
  public Reference getOrganization() {
    return this.organization;
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
  public void setForm( CodeableConcept value) {
    this.form = value;
  }
  public CodeableConcept getForm() {
    return this.form;
  }
  public void setProcessNote( java.util.List<ProcessResponseProcessNote> value) {
    this.processNote = value;
  }
  public java.util.List<ProcessResponseProcessNote> getProcessNote() {
    return this.processNote;
  }
  public void setError( java.util.List<CodeableConcept> value) {
    this.error = value;
  }
  public java.util.List<CodeableConcept> getError() {
    return this.error;
  }
  public void setCommunicationRequest( java.util.List<Reference> value) {
    this.communicationRequest = value;
  }
  public java.util.List<Reference> getCommunicationRequest() {
    return this.communicationRequest;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ProcessResponse]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.organization != null) builder.append("organization" + "->" + this.organization.toString() + "\n"); 
     if(this.request != null) builder.append("request" + "->" + this.request.toString() + "\n"); 
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this.disposition != null) builder.append("disposition" + "->" + this.disposition.toString() + "\n"); 
     if(this._disposition != null) builder.append("_disposition" + "->" + this._disposition.toString() + "\n"); 
     if(this.requestProvider != null) builder.append("requestProvider" + "->" + this.requestProvider.toString() + "\n"); 
     if(this.requestOrganization != null) builder.append("requestOrganization" + "->" + this.requestOrganization.toString() + "\n"); 
     if(this.form != null) builder.append("form" + "->" + this.form.toString() + "\n"); 
     if(this.processNote != null) builder.append("processNote" + "->" + this.processNote.toString() + "\n"); 
     if(this.error != null) builder.append("error" + "->" + this.error.toString() + "\n"); 
     if(this.communicationRequest != null) builder.append("communicationRequest" + "->" + this.communicationRequest.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	ProcessResponse,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ProcessResponse" : { return ProcessResponse.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}