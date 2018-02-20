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
import org.fhir.entity.AppointmentResponseModel;
import com.google.gson.GsonBuilder;

/**
* "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection."
*/
public class AppointmentResponse  extends DomainResource  {
  /**
  * Description: "This is a AppointmentResponse resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Appointment that this response is replying to."
  */
  @javax.validation.constraints.NotNull
  protected Reference appointment;

  /**
  * Description: "Date/Time that the appointment is to take place, or requested new start time."
  */
  protected String start;

  /**
  * Description: "Extensions for start"
  */
  protected transient Element _start;

  /**
  * Description: "This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time."
  */
  protected String end;

  /**
  * Description: "Extensions for end"
  */
  protected transient Element _end;

  /**
  * Description: "Role of participant in the appointment."
  */
  protected java.util.List<CodeableConcept> participantType = new java.util.ArrayList<>();

  /**
  * Description: "A Person, Location/HealthcareService or Device that is participating in the appointment."
  */
  protected Reference actor;

  /**
  * Description: "Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String participantStatus;

  /**
  * Description: "Extensions for participantStatus"
  */
  protected transient Element _participantStatus;

  /**
  * Description: "Additional comments about the appointment."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  public AppointmentResponse() {
  }

  public AppointmentResponse(AppointmentResponseModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getAppointment() && !o.getAppointment().isEmpty()) {
      this.appointment = new Reference(o.getAppointment().get(0));
    }
    if (null != o.getStart()) {
      this.start = o.getStart();
    }
    if (null != o.getEnd()) {
      this.end = o.getEnd();
    }
    if (null != o.getParticipantType() && !o.getParticipantType().isEmpty()) {
    	this.participantType = CodeableConceptHelper.fromArray2Array(o.getParticipantType());
    }
    if (null != o.getActor() && !o.getActor().isEmpty()) {
      this.actor = new Reference(o.getActor().get(0));
    }
    if (null != o.getParticipantStatus()) {
      this.participantStatus = o.getParticipantStatus();
    }
    if (null != o.getComment()) {
      this.comment = o.getComment();
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
  public void setAppointment( Reference value) {
    this.appointment = value;
  }
  public Reference getAppointment() {
    return this.appointment;
  }
  public void setStart( String value) {
    this.start = value;
  }
  public String getStart() {
    return this.start;
  }
  public void set_start( Element value) {
    this._start = value;
  }
  public Element get_start() {
    return this._start;
  }
  public void setEnd( String value) {
    this.end = value;
  }
  public String getEnd() {
    return this.end;
  }
  public void set_end( Element value) {
    this._end = value;
  }
  public Element get_end() {
    return this._end;
  }
  public void setParticipantType( java.util.List<CodeableConcept> value) {
    this.participantType = value;
  }
  public java.util.List<CodeableConcept> getParticipantType() {
    return this.participantType;
  }
  public void setActor( Reference value) {
    this.actor = value;
  }
  public Reference getActor() {
    return this.actor;
  }
  public void setParticipantStatus( String value) {
    this.participantStatus = value;
  }
  public String getParticipantStatus() {
    return this.participantStatus;
  }
  public void set_participantStatus( Element value) {
    this._participantStatus = value;
  }
  public Element get_participantStatus() {
    return this._participantStatus;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AppointmentResponse]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.appointment != null) builder.append("appointment" + "->" + this.appointment.toString() + "\n"); 
     if(this.start != null) builder.append("start" + "->" + this.start.toString() + "\n"); 
     if(this._start != null) builder.append("_start" + "->" + this._start.toString() + "\n"); 
     if(this.end != null) builder.append("end" + "->" + this.end.toString() + "\n"); 
     if(this._end != null) builder.append("_end" + "->" + this._end.toString() + "\n"); 
     if(this.participantType != null) builder.append("participantType" + "->" + this.participantType.toString() + "\n"); 
     if(this.actor != null) builder.append("actor" + "->" + this.actor.toString() + "\n"); 
     if(this.participantStatus != null) builder.append("participantStatus" + "->" + this.participantStatus.toString() + "\n"); 
     if(this._participantStatus != null) builder.append("_participantStatus" + "->" + this._participantStatus.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	AppointmentResponse,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "AppointmentResponse" : { return AppointmentResponse.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}