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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProcessRequest  extends DomainResource  {
  /**
  * Description: "This is a ProcessRequest resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The ProcessRequest business identifier."
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
  * Description: "The type of processing action being requested, for example Reversal, Readjudication, StatusRequest,PendedRequest."
  */
  protected String action;

  /**
  * Description: "Extensions for action"
  */
  protected transient Element _action;

  /**
  * Description: "The organization which is the target of the request."
  */
  protected Reference target;

  /**
  * Description: "The date when this resource was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String created;

  /**
  * Description: "Extensions for created"
  */
  protected transient Element _created;

  /**
  * Description: "The practitioner who is responsible for the action specified in this request."
  */
  protected Reference provider;

  /**
  * Description: "The organization which is responsible for the action speccified in this request."
  */
  protected Reference organization;

  /**
  * Description: "Reference of resource which is the target or subject of this action."
  */
  protected Reference request;

  /**
  * Description: "Reference of a prior response to resource which is the target or subject of this action."
  */
  protected Reference response;

  /**
  * Description: "If true remove all history excluding audit."
  */
  protected Boolean nullify;

  /**
  * Description: "Extensions for nullify"
  */
  protected transient Element _nullify;

  /**
  * Description: "A reference to supply which authenticates the process."
  */
  protected String reference;

  /**
  * Description: "Extensions for reference"
  */
  protected transient Element _reference;

  /**
  * Description: "List of top level items to be re-adjudicated, if none specified then the entire submission is re-adjudicated."
  */
  protected java.util.List<ProcessRequestItem> item;

  /**
  * Description: "Names of resource types to include."
  */
  protected java.util.List<String> include;

  /**
  * Description: "Extensions for include"
  */
  protected transient java.util.List<Element> _include;

  /**
  * Description: "Names of resource types to exclude."
  */
  protected java.util.List<String> exclude;

  /**
  * Description: "Extensions for exclude"
  */
  protected transient java.util.List<Element> _exclude;

  /**
  * Description: "A period of time during which the fulfilling resources would have been created."
  */
  protected Period period;

  public ProcessRequest() {
  }

  public ProcessRequest(ProcessRequestModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getAction()) {
      this.action = o.getAction();
    }
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
      this.target = new Reference(o.getTarget().get(0));
    }
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getProvider() && !o.getProvider().isEmpty()) {
      this.provider = new Reference(o.getProvider().get(0));
    }
    if (null != o.getOrganization() && !o.getOrganization().isEmpty()) {
      this.organization = new Reference(o.getOrganization().get(0));
    }
    if (null != o.getRequest() && !o.getRequest().isEmpty()) {
      this.request = new Reference(o.getRequest().get(0));
    }
    if (null != o.getResponse() && !o.getResponse().isEmpty()) {
      this.response = new Reference(o.getResponse().get(0));
    }
    if (null != o.getNullify()) {
      this.nullify = o.getNullify();
    }
    if (null != o.getReference()) {
      this.reference = o.getReference();
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = ProcessRequestItemHelper.fromArray2Array(o.getItem());
    }
    if (o.getInclude() != null) {
    	this.include = org.fhir.utils.JsonUtils.json2Array(o.getInclude());
    }
    if (o.getExclude() != null) {
    	this.exclude = org.fhir.utils.JsonUtils.json2Array(o.getExclude());
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ProcessRequest]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this._action != null) builder.append("_action" + "->" + this._action.toString() + "\n"); 
     if(this.target != null) builder.append("target" + "->" + this.target.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.provider != null) builder.append("provider" + "->" + this.provider.toString() + "\n"); 
     if(this.organization != null) builder.append("organization" + "->" + this.organization.toString() + "\n"); 
     if(this.request != null) builder.append("request" + "->" + this.request.toString() + "\n"); 
     if(this.response != null) builder.append("response" + "->" + this.response.toString() + "\n"); 
     if(this.nullify != null) builder.append("nullify" + "->" + this.nullify.toString() + "\n"); 
     if(this._nullify != null) builder.append("_nullify" + "->" + this._nullify.toString() + "\n"); 
     if(this.reference != null) builder.append("reference" + "->" + this.reference.toString() + "\n"); 
     if(this._reference != null) builder.append("_reference" + "->" + this._reference.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); 
     if(this.include != null) builder.append("include" + "->" + this.include.toString() + "\n"); 
     if(this._include != null) builder.append("_include" + "->" + this._include.toString() + "\n"); 
     if(this.exclude != null) builder.append("exclude" + "->" + this.exclude.toString() + "\n"); 
     if(this._exclude != null) builder.append("_exclude" + "->" + this._exclude.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); ;
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

}