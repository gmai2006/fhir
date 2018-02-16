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
import org.fhir.entity.AuditEventModel;
import com.google.gson.GsonBuilder;

/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
public class AuditEvent  extends DomainResource  {
  /**
  * Description: "This is a AuditEvent resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function."
  */
  @javax.validation.constraints.NotNull
  protected Coding type;

  /**
  * Description: "Identifier for the category of event."
  */
  protected java.util.List<Coding> subtype = new java.util.ArrayList<>();

  /**
  * Description: "Indicator for type of action performed during the event that generated the audit."
  */
  protected String action;

  /**
  * Description: "Extensions for action"
  */
  protected transient Element _action;

  /**
  * Description: "The time when the event occurred on the source."
  */
  protected String recorded;

  /**
  * Description: "Extensions for recorded"
  */
  protected transient Element _recorded;

  /**
  * Description: "Indicates whether the event succeeded or failed."
  */
  protected String outcome;

  /**
  * Description: "Extensions for outcome"
  */
  protected transient Element _outcome;

  /**
  * Description: "A free text description of the outcome of the event."
  */
  protected String outcomeDesc;

  /**
  * Description: "Extensions for outcomeDesc"
  */
  protected transient Element _outcomeDesc;

  /**
  * Description: "The purposeOfUse (reason) that was used during the event being recorded."
  */
  protected java.util.List<CodeableConcept> purposeOfEvent = new java.util.ArrayList<>();

  /**
  * Description: "An actor taking an active role in the event or activity that is logged."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<AuditEventAgent> agent = new java.util.ArrayList<>();

  /**
  * Description: "The system that is reporting the event."
  */
  @javax.validation.constraints.NotNull
  protected AuditEventSource source;

  /**
  * Description: "Specific instances of data or objects that have been accessed."
  */
  protected java.util.List<AuditEventEntity> entity = new java.util.ArrayList<>();

  public AuditEvent() {
  }

  public AuditEvent(AuditEventModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.type = CodingHelper.fromJson(o.getType());
    if (null != o.getAction()) {
      this.action = o.getAction();
    }
    if (null != o.getRecorded()) {
      this.recorded = o.getRecorded();
    }
    if (null != o.getOutcome()) {
      this.outcome = o.getOutcome();
    }
    if (null != o.getOutcomeDesc()) {
      this.outcomeDesc = o.getOutcomeDesc();
    }
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent = AuditEventAgentHelper.fromArray2Array(o.getAgent());
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
      this.source = new AuditEventSource(o.getSource().get(0));
    }
    if (null != o.getEntity() && !o.getEntity().isEmpty()) {
    	this.entity = AuditEventEntityHelper.fromArray2Array(o.getEntity());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setType( Coding value) {
    this.type = value;
  }
  public Coding getType() {
    return this.type;
  }
  public void setSubtype( java.util.List<Coding> value) {
    this.subtype = value;
  }
  public java.util.List<Coding> getSubtype() {
    return this.subtype;
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
  public void setRecorded( String value) {
    this.recorded = value;
  }
  public String getRecorded() {
    return this.recorded;
  }
  public void set_recorded( Element value) {
    this._recorded = value;
  }
  public Element get_recorded() {
    return this._recorded;
  }
  public void setOutcome( String value) {
    this.outcome = OutcomeEnum.fromCode(value);
  }
  public String getOutcome() {
    return this.outcome;
  }
  public void set_outcome( Element value) {
    this._outcome = value;
  }
  public Element get_outcome() {
    return this._outcome;
  }
  public void setOutcomeDesc( String value) {
    this.outcomeDesc = value;
  }
  public String getOutcomeDesc() {
    return this.outcomeDesc;
  }
  public void set_outcomeDesc( Element value) {
    this._outcomeDesc = value;
  }
  public Element get_outcomeDesc() {
    return this._outcomeDesc;
  }
  public void setPurposeOfEvent( java.util.List<CodeableConcept> value) {
    this.purposeOfEvent = value;
  }
  public java.util.List<CodeableConcept> getPurposeOfEvent() {
    return this.purposeOfEvent;
  }
  public void setAgent( java.util.List<AuditEventAgent> value) {
    this.agent = value;
  }
  public java.util.List<AuditEventAgent> getAgent() {
    return this.agent;
  }
  public void setSource( AuditEventSource value) {
    this.source = value;
  }
  public AuditEventSource getSource() {
    return this.source;
  }
  public void setEntity( java.util.List<AuditEventEntity> value) {
    this.entity = value;
  }
  public java.util.List<AuditEventEntity> getEntity() {
    return this.entity;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEvent]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.subtype != null) builder.append("subtype" + "->" + this.subtype.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this._action != null) builder.append("_action" + "->" + this._action.toString() + "\n"); 
     if(this.recorded != null) builder.append("recorded" + "->" + this.recorded.toString() + "\n"); 
     if(this._recorded != null) builder.append("_recorded" + "->" + this._recorded.toString() + "\n"); 
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this._outcome != null) builder.append("_outcome" + "->" + this._outcome.toString() + "\n"); 
     if(this.outcomeDesc != null) builder.append("outcomeDesc" + "->" + this.outcomeDesc.toString() + "\n"); 
     if(this._outcomeDesc != null) builder.append("_outcomeDesc" + "->" + this._outcomeDesc.toString() + "\n"); 
     if(this.purposeOfEvent != null) builder.append("purposeOfEvent" + "->" + this.purposeOfEvent.toString() + "\n"); 
     if(this.agent != null) builder.append("agent" + "->" + this.agent.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this.entity != null) builder.append("entity" + "->" + this.entity.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	AuditEvent,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "AuditEvent" : { return AuditEvent.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ActionEnum {
  	C,
  	R,
  	U,
  	D,
  	E,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "C" : { return C.toString(); }
  			case "R" : { return R.toString(); }
  			case "U" : { return U.toString(); }
  			case "D" : { return D.toString(); }
  			case "E" : { return E.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum OutcomeEnum {
  	ZERO,
  	FOUR,
  	EIGHT,
  	TWELVE,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "0" : { return ZERO.toString(); }
  			case "4" : { return FOUR.toString(); }
  			case "8" : { return EIGHT.toString(); }
  			case "12" : { return TWELVE.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}