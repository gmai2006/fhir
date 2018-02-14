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
/**
* "This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources."
*/
@Entity
@Table(name="processrequest")
public class ProcessRequestModel  implements Serializable {
	private static final long serialVersionUID = 151857669707481798L;
  /**
  * Description: "This is a ProcessRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The ProcessRequest business identifier."
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="target_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> target;

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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="provider_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> provider;

  /**
  * Description: "The organization which is responsible for the action speccified in this request."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="organization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> organization;

  /**
  * Description: "Reference of resource which is the target or subject of this action."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="request_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> request;

  /**
  * Description: "Reference of a prior response to resource which is the target or subject of this action."
  */
  @javax.persistence.Basic
  @Column(name="\"response_id\"")
  private String response_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="response_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> response;

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
  @javax.persistence.Basic
  @Column(name="\"item_id\"")
  private String item_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="item_id", insertable=false, updatable=false)
  private java.util.List<ProcessRequestItemModel> item;

  /**
  * Description: "Names of resource types to include."
  */
  @javax.persistence.Basic
  @Column(name="\"include\"")
  private String include;

  /**
  * Description: "Names of resource types to exclude."
  */
  @javax.persistence.Basic
  @Column(name="\"exclude\"")
  private String exclude;

  /**
  * Description: "A period of time during which the fulfilling resources would have been created."
  * Actual type: String;
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

  public ProcessRequestModel() {
  }

  public ProcessRequestModel(ProcessRequest o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.status = o.getStatus();
    this.action = o.getAction();
    if (null != o.getTarget() ) {
    	this.target_id = "target" + this.id;
    	this.target = ReferenceHelper.toModel(o.getTarget(), this.target_id);
    }
    this.created = o.getCreated();
    if (null != o.getProvider() ) {
    	this.provider_id = "provider" + this.id;
    	this.provider = ReferenceHelper.toModel(o.getProvider(), this.provider_id);
    }
    if (null != o.getOrganization() ) {
    	this.organization_id = "organization" + this.id;
    	this.organization = ReferenceHelper.toModel(o.getOrganization(), this.organization_id);
    }
    if (null != o.getRequest() ) {
    	this.request_id = "request" + this.id;
    	this.request = ReferenceHelper.toModel(o.getRequest(), this.request_id);
    }
    if (null != o.getResponse() ) {
    	this.response_id = "response" + this.id;
    	this.response = ReferenceHelper.toModel(o.getResponse(), this.response_id);
    }
    this.nullify = o.getNullify();
    this.reference = o.getReference();
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item_id = "item" + this.id;
    	this.item = ProcessRequestItemHelper.toModelFromArray(o.getItem(), this.item_id);
    }
    this.include = org.fhir.utils.JsonUtils.write2String(o.getInclude());
    this.exclude = org.fhir.utils.JsonUtils.write2String(o.getExclude());
    this.period = PeriodHelper.toJson(o.getPeriod());
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
  public String getAction() {
    return this.action;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public java.util.List<ReferenceModel> getTarget() {
    return this.target;
  }
  public void setTarget( java.util.List<ReferenceModel> value) {
    this.target = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public java.util.List<ReferenceModel> getProvider() {
    return this.provider;
  }
  public void setProvider( java.util.List<ReferenceModel> value) {
    this.provider = value;
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
  public java.util.List<ReferenceModel> getResponse() {
    return this.response;
  }
  public void setResponse( java.util.List<ReferenceModel> value) {
    this.response = value;
  }
  public Boolean getNullify() {
    return this.nullify;
  }
  public void setNullify( Boolean value) {
    this.nullify = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void setReference( String value) {
    this.reference = value;
  }
  public java.util.List<ProcessRequestItemModel> getItem() {
    return this.item;
  }
  public void setItem( java.util.List<ProcessRequestItemModel> value) {
    this.item = value;
  }
  public String getInclude() {
    return this.include;
  }
  public void setInclude( String value) {
    this.include = value;
  }
  public String getExclude() {
    return this.exclude;
  }
  public void setExclude( String value) {
    this.exclude = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
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
    builder.append("[ProcessRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("nullify" + "->" + this.nullify + "\n"); 
     builder.append("reference" + "->" + this.reference + "\n"); 
     builder.append("include" + "->" + this.include + "\n"); 
     builder.append("exclude" + "->" + this.exclude + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
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
    builder.append("[ProcessRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("target" + "->" + this.target + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("provider" + "->" + this.provider + "\n"); 
     builder.append("organization" + "->" + this.organization + "\n"); 
     builder.append("request" + "->" + this.request + "\n"); 
     builder.append("response" + "->" + this.response + "\n"); 
     builder.append("nullify" + "->" + this.nullify + "\n"); 
     builder.append("reference" + "->" + this.reference + "\n"); 
     builder.append("item" + "->" + this.item + "\n"); 
     builder.append("include" + "->" + this.include + "\n"); 
     builder.append("exclude" + "->" + this.exclude + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
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