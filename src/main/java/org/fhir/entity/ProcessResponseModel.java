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
* "This resource provides processing status, errors and notes from the processing of a resource."
*/
@Entity
@Table(name="processresponse")
public class ProcessResponseModel  implements Serializable {
	private static final long serialVersionUID = 151873631158697493L;
  /**
  * Description: "This is a ProcessResponse resource"
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
  * Description: "The date when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"created\"")
  private String created;

  /**
  * Description: "The organization who produced this adjudicated response."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="organization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> organization;

  /**
  * Description: "Original request resource reference."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="request_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> request;

  /**
  * Description: "Transaction status: error, complete, held."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"outcome\"", length = 16777215)
  private String outcome;

  /**
  * Description: "A description of the status of the adjudication or processing."
  */
  @javax.persistence.Basic
  @Column(name="\"disposition\"")
  private String disposition;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"requestprovider_id\"")
  private String requestprovider_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="requestprovider_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> requestProvider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"requestorganization_id\"")
  private String requestorganization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="requestorganization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> requestOrganization;

  /**
  * Description: "The form to be used for printing the content."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"form\"", length = 16777215)
  private String form;

  /**
  * Description: "Suite of processing notes or additional requirements if the processing has been held."
  */
  @javax.persistence.Basic
  @Column(name="\"processnote_id\"")
  private String processnote_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="processnote_id", insertable=false, updatable=false)
  private java.util.List<ProcessResponseProcessNoteModel> processNote;

  /**
  * Description: "Processing errors."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"error\"", length = 16777215)
  private String error;

  /**
  * Description: "Request for additional supporting or authorizing information, such as: documents, images or resources."
  */
  @javax.persistence.Basic
  @Column(name="\"communicationrequest_id\"")
  private String communicationrequest_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="communicationrequest_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> communicationRequest;

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

  public ProcessResponseModel() {
  }

  public ProcessResponseModel(ProcessResponse o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.status = o.getStatus();
    this.created = o.getCreated();
    if (null != o.getOrganization() ) {
    	this.organization_id = "organization" + this.id;
    	this.organization = ReferenceHelper.toModel(o.getOrganization(), this.organization_id);
    }
    if (null != o.getRequest() ) {
    	this.request_id = "request" + this.id;
    	this.request = ReferenceHelper.toModel(o.getRequest(), this.request_id);
    }
    this.outcome = JsonUtils.toJson(o.getOutcome());
    this.disposition = o.getDisposition();
    if (null != o.getRequestProvider() ) {
    	this.requestprovider_id = "requestprovider" + this.id;
    	this.requestProvider = ReferenceHelper.toModel(o.getRequestProvider(), this.requestprovider_id);
    }
    if (null != o.getRequestOrganization() ) {
    	this.requestorganization_id = "requestorganization" + this.id;
    	this.requestOrganization = ReferenceHelper.toModel(o.getRequestOrganization(), this.requestorganization_id);
    }
    this.form = JsonUtils.toJson(o.getForm());
    if (null != o.getProcessNote() && !o.getProcessNote().isEmpty()) {
    	this.processnote_id = "processnote" + this.id;
    	this.processNote = ProcessResponseProcessNoteHelper.toModelFromArray(o.getProcessNote(), this.processnote_id);
    }
    if (null != o.getCommunicationRequest() && !o.getCommunicationRequest().isEmpty()) {
    	this.communicationrequest_id = "communicationrequest" + this.id;
    	this.communicationRequest = ReferenceHelper.toModelFromArray(o.getCommunicationRequest(), this.communicationrequest_id);
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
  public String getCreated() {
    return this.created;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public java.util.List<ReferenceModel> getOrganization() {
    return this.organization;
  }
  public void setOrganization( java.util.List<ReferenceModel> value) {
    this.organization = value;
  }
  public java.util.List<ReferenceModel> getRequest() {
    return this.request;
  }
  public void setRequest( java.util.List<ReferenceModel> value) {
    this.request = value;
  }
  public String getOutcome() {
    return this.outcome;
  }
  public void setOutcome( String value) {
    this.outcome = value;
  }
  public String getDisposition() {
    return this.disposition;
  }
  public void setDisposition( String value) {
    this.disposition = value;
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
  public String getForm() {
    return this.form;
  }
  public void setForm( String value) {
    this.form = value;
  }
  public java.util.List<ProcessResponseProcessNoteModel> getProcessNote() {
    return this.processNote;
  }
  public void setProcessNote( java.util.List<ProcessResponseProcessNoteModel> value) {
    this.processNote = value;
  }
  public String getError() {
    return this.error;
  }
  public void setError( String value) {
    this.error = value;
  }
  public java.util.List<ReferenceModel> getCommunicationRequest() {
    return this.communicationRequest;
  }
  public void setCommunicationRequest( java.util.List<ReferenceModel> value) {
    this.communicationRequest = value;
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
    builder.append("[ProcessResponseModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("outcome" + "->" + this.outcome + "\n"); 
     builder.append("disposition" + "->" + this.disposition + "\n"); 
     builder.append("form" + "->" + this.form + "\n"); 
     builder.append("error" + "->" + this.error + "\n"); 
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
    builder.append("[ProcessResponseModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("organization" + "->" + this.organization + "\n"); 
     builder.append("request" + "->" + this.request + "\n"); 
     builder.append("outcome" + "->" + this.outcome + "\n"); 
     builder.append("disposition" + "->" + this.disposition + "\n"); 
     builder.append("requestProvider" + "->" + this.requestProvider + "\n"); 
     builder.append("requestOrganization" + "->" + this.requestOrganization + "\n"); 
     builder.append("form" + "->" + this.form + "\n"); 
     builder.append("processNote" + "->" + this.processNote + "\n"); 
     builder.append("error" + "->" + this.error + "\n"); 
     builder.append("communicationRequest" + "->" + this.communicationRequest + "\n"); 
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