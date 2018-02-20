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
import org.fhir.entity.AppointmentParticipantModel;
import com.google.gson.GsonBuilder;

/**
* "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)."
*/
public class AppointmentParticipant  extends BackboneElement  {
  /**
  * Description: "Role of participant in the appointment."
  */
  protected java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "A Person, Location/HealthcareService or Device that is participating in the appointment."
  */
  protected Reference actor;

  /**
  * Description: "Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present."
  */
  protected String required;

  /**
  * Description: "Extensions for required"
  */
  protected transient Element _required;

  /**
  * Description: "Participation status of the actor."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  public AppointmentParticipant() {
  }

  public AppointmentParticipant(AppointmentParticipantModel o) {
    this.id = o.getId();
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type = CodeableConceptHelper.fromArray2Array(o.getType());
    }
    if (null != o.getActor() && !o.getActor().isEmpty()) {
      this.actor = new Reference(o.getActor().get(0));
    }
    if (null != o.getRequired()) {
      this.required = o.getRequired();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
  }

  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
  }
  public void setActor( Reference value) {
    this.actor = value;
  }
  public Reference getActor() {
    return this.actor;
  }
  public void setRequired( String value) {
    this.required = RequiredEnum.fromCode(value);
  }
  public String getRequired() {
    return this.required;
  }
  public void set_required( Element value) {
    this._required = value;
  }
  public Element get_required() {
    return this._required;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AppointmentParticipant]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.actor != null) builder.append("actor" + "->" + this.actor.toString() + "\n"); 
     if(this.required != null) builder.append("required" + "->" + this.required.toString() + "\n"); 
     if(this._required != null) builder.append("_required" + "->" + this._required.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); ;
    return builder.toString();
  }

  public enum RequiredEnum {
  	required,
  	optional,
  	informationonly,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "required" : { return required.toString(); }
  			case "optional" : { return optional.toString(); }
  			case "informationonly" : { return informationonly.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	accepted,
  	declined,
  	tentative,
  	needsaction,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "accepted" : { return accepted.toString(); }
  			case "declined" : { return declined.toString(); }
  			case "tentative" : { return tentative.toString(); }
  			case "needsaction" : { return needsaction.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}