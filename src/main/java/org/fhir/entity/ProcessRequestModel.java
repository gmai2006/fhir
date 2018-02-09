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
* "This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources."
*/
@Entity
@Table(name="processrequest")
public class ProcessRequestModel  {
  /**
  * Description: "This is a ProcessRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The ProcessRequest business identifier."
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
  * Description: "The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest."
  */
  @javax.persistence.Basic
  @Column(name="\"action\"")
  private String action;

  /**
  * Description: "The organization which is the target of the request."
  */
  @javax.persistence.Basic
  @Column(name="\"target_id\"")
  private String target_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`target_id`", insertable=false, updatable=false)
  private ReferenceModel target;

  /**
  * Description: "The date when this resource was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"created\"")
  private String created;

  /**
  * Description: "The practitioner who is responsible for the action specified in this request."
  */
  @javax.persistence.Basic
  @Column(name="\"provider_id\"")
  private String provider_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`provider_id`", insertable=false, updatable=false)
  private ReferenceModel provider;

  /**
  * Description: "The organization which is responsible for the action speccified in this request."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`organization_id`", insertable=false, updatable=false)
  private ReferenceModel organization;

  /**
  * Description: "Reference of resource which is the target or subject of this action."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`request_id`", insertable=false, updatable=false)
  private ReferenceModel request;

  /**
  * Description: "Reference of a prior response to resource which is the target or subject of this action."
  */
  @javax.persistence.Basic
  @Column(name="\"response_id\"")
  private String response_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`response_id`", insertable=false, updatable=false)
  private ReferenceModel response;

  /**
  * Description: "If true remove all history excluding audit."
  */
  @javax.persistence.Basic
  @Column(name="\"nullify\"")
  private Boolean nullify;

  /**
  * Description: "A reference to supply which authenticates the process."
  */
  @javax.persistence.Basic
  @Column(name="\"reference\"")
  private String reference;

  /**
  * Description: "List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ProcessRequestItemModel> item = new java.util.ArrayList<>();

  /**
  * Description: "Names of resource types to include."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"include\"", length = 16777215)
  private String include;

  /**
  * Description: "Names of resource types to exclude."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"exclude\"", length = 16777215)
  private String exclude;

  /**
  * Description: "A period of time during which the fulfilling resources would have been created."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

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


  public ProcessRequestModel() {
  }

  public ProcessRequestModel(ProcessRequest o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.action = o.getAction();

      if (null != o.getTarget()) {
      	this.target_id = "target" + this.getId();
        this.target = new ReferenceModel(o.getTarget());
        this.target.setId(this.target_id);
        this.target.parent_id = this.target.getId();
      }

      this.created = o.getCreated();

      if (null != o.getProvider()) {
      	this.provider_id = "provider" + this.getId();
        this.provider = new ReferenceModel(o.getProvider());
        this.provider.setId(this.provider_id);
        this.provider.parent_id = this.provider.getId();
      }

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

      if (null != o.getResponse()) {
      	this.response_id = "response" + this.getId();
        this.response = new ReferenceModel(o.getResponse());
        this.response.setId(this.response_id);
        this.response.parent_id = this.response.getId();
      }

      this.nullify = o.getNullify();

      this.reference = o.getReference();

      this.item = ProcessRequestItem.toModelArray(o.getItem());

      this.include = org.fhir.utils.JsonUtils.write2String(o.getInclude());

      this.exclude = org.fhir.utils.JsonUtils.write2String(o.getExclude());

      this.period = Period.toJson(o.getPeriod());
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
  public void setAction( String value) {
    this.action = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setTarget( ReferenceModel value) {
    this.target = value;
  }
  public ReferenceModel getTarget() {
    return this.target;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setProvider( ReferenceModel value) {
    this.provider = value;
  }
  public ReferenceModel getProvider() {
    return this.provider;
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
  public void setResponse( ReferenceModel value) {
    this.response = value;
  }
  public ReferenceModel getResponse() {
    return this.response;
  }
  public void setNullify( Boolean value) {
    this.nullify = value;
  }
  public Boolean getNullify() {
    return this.nullify;
  }
  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void setItem( java.util.List<ProcessRequestItemModel> value) {
    this.item = value;
  }
  public java.util.List<ProcessRequestItemModel> getItem() {
    return this.item;
  }
  public void setInclude( String value) {
    this.include = value;
  }
  public String getInclude() {
    return this.include;
  }
  public void setExclude( String value) {
    this.exclude = value;
  }
  public String getExclude() {
    return this.exclude;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
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
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("provider" + "[" + String.valueOf(this.provider) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("response" + "[" + String.valueOf(this.response) + "]\n"); 
     builder.append("nullify" + "[" + String.valueOf(this.nullify) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("include" + "[" + String.valueOf(this.include) + "]\n"); 
     builder.append("exclude" + "[" + String.valueOf(this.exclude) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
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