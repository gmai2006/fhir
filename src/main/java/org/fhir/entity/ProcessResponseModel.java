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
* "This resource provides processing status, errors and notes from the processing of a resource."
*/
@Entity
@Table(name="processresponse")
public class ProcessResponseModel  {
  /**
  * Description: "This is a ProcessResponse resource"
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`organization_id`", insertable=false, updatable=false)
  private ReferenceModel organization;

  /**
  * Description: "Original request resource reference."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`request_id`", insertable=false, updatable=false)
  private ReferenceModel request;

  /**
  * Description: "Transaction status: error, complete, held."
  * Actual type: CodeableConcept
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
  * Description: "The form to be used for printing the content."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"form\"", length = 16777215)
  private String form;

  /**
  * Description: "Suite of processing notes or additional requirements if the processing has been held."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ProcessResponseProcessNoteModel> processNote = new java.util.ArrayList<>();

  /**
  * Description: "Processing errors."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"error\"", length = 16777215)
  private String error;

  /**
  * Description: "Request for additional supporting or authorizing information, such as: documents, images or resources."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> communicationRequest = new java.util.ArrayList<>();

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


  public ProcessResponseModel() {
  }

  public ProcessResponseModel(ProcessResponse o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.created = o.getCreated();

      if (null != o.getOrganization()) {
      	this.organization_id = "organization" + this.getId();
        this.organization = new ReferenceModel(o.getOrganization());
        this.organization.setId(this.organization_id);
        this.organization.parent_id = this.organization.getId();
      }

      if (null != o.getRequest()) {
      	this.request_id = "request" + this.getId();
        this.request = new ReferenceModel(o.getRequest());
        this.request.setId(this.request_id);
        this.request.parent_id = this.request.getId();
      }

      this.outcome = CodeableConcept.toJson(o.getOutcome());
      this.disposition = o.getDisposition();

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

      this.form = CodeableConcept.toJson(o.getForm());
      this.processNote = ProcessResponseProcessNote.toModelArray(o.getProcessNote());

      this.error = CodeableConcept.toJson(o.getError());
      this.communicationRequest = Reference.toModelArray(o.getCommunicationRequest());

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
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setOrganization( ReferenceModel value) {
    this.organization = value;
  }
  public ReferenceModel getOrganization() {
    return this.organization;
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
  public void setForm( String value) {
    this.form = value;
  }
  public String getForm() {
    return this.form;
  }
  public void setProcessNote( java.util.List<ProcessResponseProcessNoteModel> value) {
    this.processNote = value;
  }
  public java.util.List<ProcessResponseProcessNoteModel> getProcessNote() {
    return this.processNote;
  }
  public void setError( String value) {
    this.error = value;
  }
  public String getError() {
    return this.error;
  }
  public void setCommunicationRequest( java.util.List<ReferenceModel> value) {
    this.communicationRequest = value;
  }
  public java.util.List<ReferenceModel> getCommunicationRequest() {
    return this.communicationRequest;
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
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("disposition" + "[" + String.valueOf(this.disposition) + "]\n"); 
     builder.append("requestProvider" + "[" + String.valueOf(this.requestProvider) + "]\n"); 
     builder.append("requestOrganization" + "[" + String.valueOf(this.requestOrganization) + "]\n"); 
     builder.append("form" + "[" + String.valueOf(this.form) + "]\n"); 
     builder.append("processNote" + "[" + String.valueOf(this.processNote) + "]\n"); 
     builder.append("error" + "[" + String.valueOf(this.error) + "]\n"); 
     builder.append("communicationRequest" + "[" + String.valueOf(this.communicationRequest) + "]\n"); 
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