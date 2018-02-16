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
import org.fhir.entity.AppointmentModel;
import com.google.gson.GsonBuilder;

/**
* "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)."
*/
public class Appointment  extends DomainResource  {
  /**
  * Description: "This is a Appointment resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A broad categorisation of the service that is to be performed during this appointment."
  */
  protected CodeableConcept serviceCategory;

  /**
  * Description: "The specific service that is to be performed during this appointment."
  */
  protected java.util.List<CodeableConcept> serviceType = new java.util.ArrayList<>();

  /**
  * Description: "The specialty of a practitioner that would be required to perform the service requested in this appointment."
  */
  protected java.util.List<CodeableConcept> specialty = new java.util.ArrayList<>();

  /**
  * Description: "The style of appointment or patient that has been booked in the slot (not service type)."
  */
  protected CodeableConcept appointmentType;

  /**
  * Description: "The reason that this appointment is being scheduled. This is more clinical than administrative."
  */
  protected java.util.List<CodeableConcept> reason = new java.util.ArrayList<>();

  /**
  * Description: "Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure."
  */
  protected java.util.List<Reference> indication = new java.util.ArrayList<>();

  /**
  * Description: "The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float priority;

  /**
  * Description: "Extensions for priority"
  */
  protected transient Element _priority;

  /**
  * Description: "The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Additional information to support the appointment provided when making the appointment."
  */
  protected java.util.List<Reference> supportingInformation = new java.util.ArrayList<>();

  /**
  * Description: "Date/Time that the appointment is to take place."
  */
  protected String start;

  /**
  * Description: "Extensions for start"
  */
  protected transient Element _start;

  /**
  * Description: "Date/Time that the appointment is to conclude."
  */
  protected String end;

  /**
  * Description: "Extensions for end"
  */
  protected transient Element _end;

  /**
  * Description: "Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float minutesDuration;

  /**
  * Description: "Extensions for minutesDuration"
  */
  protected transient Element _minutesDuration;

  /**
  * Description: "The slots from the participants' schedules that will be filled by the appointment."
  */
  protected java.util.List<Reference> slot = new java.util.ArrayList<>();

  /**
  * Description: "The date that this appointment was initially created. This could be different to the meta.lastModified value on the initial entry, as this could have been before the resource was created on the FHIR server, and should remain unchanged over the lifespan of the appointment."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String created;

  /**
  * Description: "Extensions for created"
  */
  protected transient Element _created;

  /**
  * Description: "Additional comments about the appointment."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  /**
  * Description: "The referral request this appointment is allocated to assess (incoming referral)."
  */
  protected java.util.List<Reference> incomingReferral = new java.util.ArrayList<>();

  /**
  * Description: "List of participants involved in the appointment."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<AppointmentParticipant> participant = new java.util.ArrayList<>();

  /**
  * Description: "A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within. When using these values, the minutes duration should be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time."
  */
  protected java.util.List<Period> requestedPeriod = new java.util.ArrayList<>();

  public Appointment() {
  }

  public Appointment(AppointmentModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    this.serviceCategory = CodeableConceptHelper.fromJson(o.getServiceCategory());
    this.appointmentType = CodeableConceptHelper.fromJson(o.getAppointmentType());
    if (null != o.getIndication() && !o.getIndication().isEmpty()) {
    	this.indication = ReferenceHelper.fromArray2Array(o.getIndication());
    }
    if (null != o.getPriority()) {
      this.priority = o.getPriority();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getSupportingInformation() && !o.getSupportingInformation().isEmpty()) {
    	this.supportingInformation = ReferenceHelper.fromArray2Array(o.getSupportingInformation());
    }
    if (null != o.getStart()) {
      this.start = o.getStart();
    }
    if (null != o.getEnd()) {
      this.end = o.getEnd();
    }
    if (null != o.getMinutesDuration()) {
      this.minutesDuration = o.getMinutesDuration();
    }
    if (null != o.getSlot() && !o.getSlot().isEmpty()) {
    	this.slot = ReferenceHelper.fromArray2Array(o.getSlot());
    }
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getComment()) {
      this.comment = o.getComment();
    }
    if (null != o.getIncomingReferral() && !o.getIncomingReferral().isEmpty()) {
    	this.incomingReferral = ReferenceHelper.fromArray2Array(o.getIncomingReferral());
    }
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant = AppointmentParticipantHelper.fromArray2Array(o.getParticipant());
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
  public void setServiceCategory( CodeableConcept value) {
    this.serviceCategory = value;
  }
  public CodeableConcept getServiceCategory() {
    return this.serviceCategory;
  }
  public void setServiceType( java.util.List<CodeableConcept> value) {
    this.serviceType = value;
  }
  public java.util.List<CodeableConcept> getServiceType() {
    return this.serviceType;
  }
  public void setSpecialty( java.util.List<CodeableConcept> value) {
    this.specialty = value;
  }
  public java.util.List<CodeableConcept> getSpecialty() {
    return this.specialty;
  }
  public void setAppointmentType( CodeableConcept value) {
    this.appointmentType = value;
  }
  public CodeableConcept getAppointmentType() {
    return this.appointmentType;
  }
  public void setReason( java.util.List<CodeableConcept> value) {
    this.reason = value;
  }
  public java.util.List<CodeableConcept> getReason() {
    return this.reason;
  }
  public void setIndication( java.util.List<Reference> value) {
    this.indication = value;
  }
  public java.util.List<Reference> getIndication() {
    return this.indication;
  }
  public void setPriority( Float value) {
    this.priority = value;
  }
  public Float getPriority() {
    return this.priority;
  }
  public void set_priority( Element value) {
    this._priority = value;
  }
  public Element get_priority() {
    return this._priority;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setSupportingInformation( java.util.List<Reference> value) {
    this.supportingInformation = value;
  }
  public java.util.List<Reference> getSupportingInformation() {
    return this.supportingInformation;
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
  public void setMinutesDuration( Float value) {
    this.minutesDuration = value;
  }
  public Float getMinutesDuration() {
    return this.minutesDuration;
  }
  public void set_minutesDuration( Element value) {
    this._minutesDuration = value;
  }
  public Element get_minutesDuration() {
    return this._minutesDuration;
  }
  public void setSlot( java.util.List<Reference> value) {
    this.slot = value;
  }
  public java.util.List<Reference> getSlot() {
    return this.slot;
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
  public void setIncomingReferral( java.util.List<Reference> value) {
    this.incomingReferral = value;
  }
  public java.util.List<Reference> getIncomingReferral() {
    return this.incomingReferral;
  }
  public void setParticipant( java.util.List<AppointmentParticipant> value) {
    this.participant = value;
  }
  public java.util.List<AppointmentParticipant> getParticipant() {
    return this.participant;
  }
  public void setRequestedPeriod( java.util.List<Period> value) {
    this.requestedPeriod = value;
  }
  public java.util.List<Period> getRequestedPeriod() {
    return this.requestedPeriod;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Appointment]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.serviceCategory != null) builder.append("serviceCategory" + "->" + this.serviceCategory.toString() + "\n"); 
     if(this.serviceType != null) builder.append("serviceType" + "->" + this.serviceType.toString() + "\n"); 
     if(this.specialty != null) builder.append("specialty" + "->" + this.specialty.toString() + "\n"); 
     if(this.appointmentType != null) builder.append("appointmentType" + "->" + this.appointmentType.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.indication != null) builder.append("indication" + "->" + this.indication.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this._priority != null) builder.append("_priority" + "->" + this._priority.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.supportingInformation != null) builder.append("supportingInformation" + "->" + this.supportingInformation.toString() + "\n"); 
     if(this.start != null) builder.append("start" + "->" + this.start.toString() + "\n"); 
     if(this._start != null) builder.append("_start" + "->" + this._start.toString() + "\n"); 
     if(this.end != null) builder.append("end" + "->" + this.end.toString() + "\n"); 
     if(this._end != null) builder.append("_end" + "->" + this._end.toString() + "\n"); 
     if(this.minutesDuration != null) builder.append("minutesDuration" + "->" + this.minutesDuration.toString() + "\n"); 
     if(this._minutesDuration != null) builder.append("_minutesDuration" + "->" + this._minutesDuration.toString() + "\n"); 
     if(this.slot != null) builder.append("slot" + "->" + this.slot.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); 
     if(this.incomingReferral != null) builder.append("incomingReferral" + "->" + this.incomingReferral.toString() + "\n"); 
     if(this.participant != null) builder.append("participant" + "->" + this.participant.toString() + "\n"); 
     if(this.requestedPeriod != null) builder.append("requestedPeriod" + "->" + this.requestedPeriod.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Appointment,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Appointment" : { return Appointment.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	proposed,
  	pending,
  	booked,
  	arrived,
  	fulfilled,
  	cancelled,
  	noshow,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "proposed" : { return proposed.toString(); }
  			case "pending" : { return pending.toString(); }
  			case "booked" : { return booked.toString(); }
  			case "arrived" : { return arrived.toString(); }
  			case "fulfilled" : { return fulfilled.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "noshow" : { return noshow.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}