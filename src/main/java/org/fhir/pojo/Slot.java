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
import org.fhir.entity.SlotModel;
import com.google.gson.GsonBuilder;

/**
* "A slot of time on a schedule that may be available for booking appointments."
*/
public class Slot  extends DomainResource  {
  /**
  * Description: "This is a Slot resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "External Ids for this item."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A broad categorisation of the service that is to be performed during this appointment."
  */
  protected CodeableConcept serviceCategory;

  /**
  * Description: "The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource."
  */
  protected java.util.List<CodeableConcept> serviceType = new java.util.ArrayList<>();

  /**
  * Description: "The specialty of a practitioner that would be required to perform the service requested in this appointment."
  */
  protected java.util.List<CodeableConcept> specialty = new java.util.ArrayList<>();

  /**
  * Description: "The style of appointment or patient that may be booked in the slot (not service type)."
  */
  protected CodeableConcept appointmentType;

  /**
  * Description: "The schedule resource that this slot defines an interval of status information."
  */
  @javax.validation.constraints.NotNull
  protected Reference schedule;

  /**
  * Description: "busy | free | busy-unavailable | busy-tentative | entered-in-error."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Date/Time that the slot is to begin."
  */
  protected String start;

  /**
  * Description: "Extensions for start"
  */
  protected transient Element _start;

  /**
  * Description: "Date/Time that the slot is to conclude."
  */
  protected String end;

  /**
  * Description: "Extensions for end"
  */
  protected transient Element _end;

  /**
  * Description: "This slot has already been overbooked, appointments are unlikely to be accepted for this time."
  */
  protected Boolean overbooked;

  /**
  * Description: "Extensions for overbooked"
  */
  protected transient Element _overbooked;

  /**
  * Description: "Comments on the slot to describe any extended information. Such as custom constraints on the slot."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  public Slot() {
  }

  public Slot(SlotModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getServiceCategory() && !o.getServiceCategory().isEmpty()) {
      this.serviceCategory = new CodeableConcept(o.getServiceCategory().get(0));
    }
    if (null != o.getServiceType() && !o.getServiceType().isEmpty()) {
    	this.serviceType = CodeableConceptHelper.fromArray2Array(o.getServiceType());
    }
    if (null != o.getSpecialty() && !o.getSpecialty().isEmpty()) {
    	this.specialty = CodeableConceptHelper.fromArray2Array(o.getSpecialty());
    }
    if (null != o.getAppointmentType() && !o.getAppointmentType().isEmpty()) {
      this.appointmentType = new CodeableConcept(o.getAppointmentType().get(0));
    }
    if (null != o.getSchedule() && !o.getSchedule().isEmpty()) {
      this.schedule = new Reference(o.getSchedule().get(0));
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getStart()) {
      this.start = o.getStart();
    }
    if (null != o.getEnd()) {
      this.end = o.getEnd();
    }
    if (null != o.getOverbooked()) {
      this.overbooked = o.getOverbooked();
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
  public void setSchedule( Reference value) {
    this.schedule = value;
  }
  public Reference getSchedule() {
    return this.schedule;
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
  public void setOverbooked( Boolean value) {
    this.overbooked = value;
  }
  public Boolean getOverbooked() {
    return this.overbooked;
  }
  public void set_overbooked( Element value) {
    this._overbooked = value;
  }
  public Element get_overbooked() {
    return this._overbooked;
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
    builder.append("[Slot]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.serviceCategory != null) builder.append("serviceCategory" + "->" + this.serviceCategory.toString() + "\n"); 
     if(this.serviceType != null) builder.append("serviceType" + "->" + this.serviceType.toString() + "\n"); 
     if(this.specialty != null) builder.append("specialty" + "->" + this.specialty.toString() + "\n"); 
     if(this.appointmentType != null) builder.append("appointmentType" + "->" + this.appointmentType.toString() + "\n"); 
     if(this.schedule != null) builder.append("schedule" + "->" + this.schedule.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.start != null) builder.append("start" + "->" + this.start.toString() + "\n"); 
     if(this._start != null) builder.append("_start" + "->" + this._start.toString() + "\n"); 
     if(this.end != null) builder.append("end" + "->" + this.end.toString() + "\n"); 
     if(this._end != null) builder.append("_end" + "->" + this._end.toString() + "\n"); 
     if(this.overbooked != null) builder.append("overbooked" + "->" + this.overbooked.toString() + "\n"); 
     if(this._overbooked != null) builder.append("_overbooked" + "->" + this._overbooked.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Slot,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Slot" : { return Slot.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	busy,
  	free,
  	busyunavailable,
  	busytentative,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "busy" : { return busy.toString(); }
  			case "free" : { return free.toString(); }
  			case "busyunavailable" : { return busyunavailable.toString(); }
  			case "busytentative" : { return busytentative.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}