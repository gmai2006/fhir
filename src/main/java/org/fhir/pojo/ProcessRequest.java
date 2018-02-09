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
import org.fhir.entity.ProcessRequestModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources."
*/
public class ProcessRequest  {
  /**
  * Description: "This is a ProcessRequest resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The ProcessRequest business identifier."
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
  * Description: "The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest."
  */
  private String action;

  /**
  * Description: "Extensions for action"
  */
  private transient Element _action;

  /**
  * Description: "The organization which is the target of the request."
  */
  private Reference target;

  /**
  * Description: "The date when this resource was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String created;

  /**
  * Description: "Extensions for created"
  */
  private transient Element _created;

  /**
  * Description: "The practitioner who is responsible for the action specified in this request."
  */
  private Reference provider;

  /**
  * Description: "The organization which is responsible for the action speccified in this request."
  */
  private Reference organization;

  /**
  * Description: "Reference of resource which is the target or subject of this action."
  */
  private Reference request;

  /**
  * Description: "Reference of a prior response to resource which is the target or subject of this action."
  */
  private Reference response;

  /**
  * Description: "If true remove all history excluding audit."
  */
  private Boolean nullify;

  /**
  * Description: "Extensions for nullify"
  */
  private transient Element _nullify;

  /**
  * Description: "A reference to supply which authenticates the process."
  */
  private String reference;

  /**
  * Description: "Extensions for reference"
  */
  private transient Element _reference;

  /**
  * Description: "List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated."
  */
  private java.util.List<ProcessRequestItem> item = new java.util.ArrayList<>();

  /**
  * Description: "Names of resource types to include."
  */
  private java.util.List<String> include = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for include"
  */
  private transient java.util.List<Element> _include = new java.util.ArrayList<>();

  /**
  * Description: "Names of resource types to exclude."
  */
  private java.util.List<String> exclude = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for exclude"
  */
  private transient java.util.List<Element> _exclude = new java.util.ArrayList<>();

  /**
  * Description: "A period of time during which the fulfilling resources would have been created."
  */
  private Period period;

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

  public ProcessRequest() {
  }

  public ProcessRequest(ProcessRequestModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getAction()) {
        this.action = new String(o.getAction());
      }

      if (null != o.getTarget()) {
        this.target = new Reference(o.getTarget());
        this.target.setId(this.getId());
      }

      if (null != o.getCreated()) {
        this.created = new String(o.getCreated());
      }

      if (null != o.getProvider()) {
        this.provider = new Reference(o.getProvider());
        this.provider.setId(this.getId());
      }

      if (null != o.getOrganization()) {
        this.organization = new Reference(o.getOrganization());
        this.organization.setId(this.getId());
      }

      if (null != o.getRequest()) {
        this.request = new Reference(o.getRequest());
        this.request.setId(this.getId());
      }

      if (null != o.getResponse()) {
        this.response = new Reference(o.getResponse());
        this.response.setId(this.getId());
      }

      if (null != o.getNullify()) {
        this.nullify = new Boolean(o.getNullify());
      }

      if (null != o.getReference()) {
        this.reference = new String(o.getReference());
      }

      this.item = ProcessRequestItem.fromArray(o.getItem());

      this.include = org.fhir.utils.JsonUtils.json2Array(o.getInclude());

      this.exclude = org.fhir.utils.JsonUtils.json2Array(o.getExclude());

      this.period = Period.fromJson(o.getPeriod());
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
  public void setAction( String value) {
    this.action = ActionEnum.fromCode(value);
  }
  public String getAction() {
    return this.action;
  }
  public void set_action( Element value) {
    this._action = value;
  }
  public Element get_action() {
    return this._action;
  }
  public void setTarget( Reference value) {
    this.target = value;
  }
  public Reference getTarget() {
    return this.target;
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
  public void setRequest( Reference value) {
    this.request = value;
  }
  public Reference getRequest() {
    return this.request;
  }
  public void setResponse( Reference value) {
    this.response = value;
  }
  public Reference getResponse() {
    return this.response;
  }
  public void setNullify( Boolean value) {
    this.nullify = value;
  }
  public Boolean getNullify() {
    return this.nullify;
  }
  public void set_nullify( Element value) {
    this._nullify = value;
  }
  public Element get_nullify() {
    return this._nullify;
  }
  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void set_reference( Element value) {
    this._reference = value;
  }
  public Element get_reference() {
    return this._reference;
  }
  public void setItem( java.util.List<ProcessRequestItem> value) {
    this.item = value;
  }
  public java.util.List<ProcessRequestItem> getItem() {
    return this.item;
  }
  public void setInclude( java.util.List<String> value) {
    this.include = value;
  }
  public java.util.List<String> getInclude() {
    return this.include;
  }
  public void set_include( java.util.List<Element> value) {
    this._include = value;
  }
  public java.util.List<Element> get_include() {
    return this._include;
  }
  public void setExclude( java.util.List<String> value) {
    this.exclude = value;
  }
  public java.util.List<String> getExclude() {
    return this.exclude;
  }
  public void set_exclude( java.util.List<Element> value) {
    this._exclude = value;
  }
  public java.util.List<Element> get_exclude() {
    return this._exclude;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
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
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("_action" + "[" + String.valueOf(this._action) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("_created" + "[" + String.valueOf(this._created) + "]\n"); 
     builder.append("provider" + "[" + String.valueOf(this.provider) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("response" + "[" + String.valueOf(this.response) + "]\n"); 
     builder.append("nullify" + "[" + String.valueOf(this.nullify) + "]\n"); 
     builder.append("_nullify" + "[" + String.valueOf(this._nullify) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("_reference" + "[" + String.valueOf(this._reference) + "]\n"); 
     builder.append("item" + "[" + String.valueOf(this.item) + "]\n"); 
     builder.append("include" + "[" + String.valueOf(this.include) + "]\n"); 
     builder.append("_include" + "[" + String.valueOf(this._include) + "]\n"); 
     builder.append("exclude" + "[" + String.valueOf(this.exclude) + "]\n"); 
     builder.append("_exclude" + "[" + String.valueOf(this._exclude) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
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
  	ProcessRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ProcessRequest" : { return ProcessRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ActionEnum {
  	cancel,
  	poll,
  	reprocess,
  	status,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "cancel" : { return cancel.toString(); }
  			case "poll" : { return poll.toString(); }
  			case "reprocess" : { return reprocess.toString(); }
  			case "status" : { return status.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ProcessRequest> fromArray(java.util.List<ProcessRequestModel> list) {
    return (java.util.List<ProcessRequest>)list.stream()
      .map(model -> new ProcessRequest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ProcessRequestModel> toModelArray(java.util.List<ProcessRequest> list) {
    return (java.util.List<ProcessRequestModel>)list.stream()
      .map(model -> new ProcessRequestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ProcessRequest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ProcessRequest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ProcessRequest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ProcessRequest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}