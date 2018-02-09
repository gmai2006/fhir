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
public class Appointment  {
  /**
  * Description: "This is a Appointment resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A broad categorisation of the service that is to be performed during this appointment."
  */
  private CodeableConcept serviceCategory;

  /**
  * Description: "The specific service that is to be performed during this appointment."
  */
  private java.util.List<CodeableConcept> serviceType = new java.util.ArrayList<>();

  /**
  * Description: "The specialty of a practitioner that would be required to perform the service requested in this appointment."
  */
  private java.util.List<CodeableConcept> specialty = new java.util.ArrayList<>();

  /**
  * Description: "The style of appointment or patient that has been booked in the slot (not service type)."
  */
  private CodeableConcept appointmentType;

  /**
  * Description: "The reason that this appointment is being scheduled. This is more clinical than administrative."
  */
  private java.util.List<CodeableConcept> reason = new java.util.ArrayList<>();

  /**
  * Description: "Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure."
  */
  private java.util.List<Reference> indication = new java.util.ArrayList<>();

  /**
  * Description: "The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float priority;

  /**
  * Description: "Extensions for priority"
  */
  private transient Element _priority;

  /**
  * Description: "The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Additional information to support the appointment provided when making the appointment."
  */
  private java.util.List<Reference> supportingInformation = new java.util.ArrayList<>();

  /**
  * Description: "Date/Time that the appointment is to take place."
  */
  private String start;

  /**
  * Description: "Extensions for start"
  */
  private transient Element _start;

  /**
  * Description: "Date/Time that the appointment is to conclude."
  */
  private String end;

  /**
  * Description: "Extensions for end"
  */
  private transient Element _end;

  /**
  * Description: "Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float minutesDuration;

  /**
  * Description: "Extensions for minutesDuration"
  */
  private transient Element _minutesDuration;

  /**
  * Description: "The slots from the participants' schedules that will be filled by the appointment."
  */
  private java.util.List<Reference> slot = new java.util.ArrayList<>();

  /**
  * Description: "The date that this appointment was initially created. This could be different to the meta.lastModified value on the initial entry, as this could have been before the resource was created on the FHIR server, and should remain unchanged over the lifespan of the appointment."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String created;

  /**
  * Description: "Extensions for created"
  */
  private transient Element _created;

  /**
  * Description: "Additional comments about the appointment."
  */
  private String comment;

  /**
  * Description: "Extensions for comment"
  */
  private transient Element _comment;

  /**
  * Description: "The referral request this appointment is allocated to assess (incoming referral)."
  */
  private java.util.List<Reference> incomingReferral = new java.util.ArrayList<>();

  /**
  * Description: "List of participants involved in the appointment."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<AppointmentParticipant> participant = new java.util.ArrayList<>();

  /**
  * Description: "A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within. When using these values, the minutes duration should be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time."
  */
  private java.util.List<Period> requestedPeriod = new java.util.ArrayList<>();

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

  public Appointment() {
  }

  public Appointment(AppointmentModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.serviceCategory = CodeableConcept.fromJson(o.getServiceCategory());
      this.serviceType = CodeableConcept.fromArray(o.getServiceType());
      this.specialty = CodeableConcept.fromArray(o.getSpecialty());
      this.appointmentType = CodeableConcept.fromJson(o.getAppointmentType());
      this.reason = CodeableConcept.fromArray(o.getReason());
      this.indication = Reference.fromArray(o.getIndication());

      if (null != o.getPriority()) {
        this.priority = new Float(o.getPriority());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.supportingInformation = Reference.fromArray(o.getSupportingInformation());

      if (null != o.getStart()) {
        this.start = new String(o.getStart());
      }

      if (null != o.getEnd()) {
        this.end = new String(o.getEnd());
      }

      if (null != o.getMinutesDuration()) {
        this.minutesDuration = new Float(o.getMinutesDuration());
      }

      this.slot = Reference.fromArray(o.getSlot());

      if (null != o.getCreated()) {
        this.created = new String(o.getCreated());
      }

      if (null != o.getComment()) {
        this.comment = new String(o.getComment());
      }

      this.incomingReferral = Reference.fromArray(o.getIncomingReferral());

      this.participant = AppointmentParticipant.fromArray(o.getParticipant());

      this.requestedPeriod = Period.fromArray(o.getRequestedPeriod());
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
     builder.append("serviceCategory" + "[" + String.valueOf(this.serviceCategory) + "]\n"); 
     builder.append("serviceType" + "[" + String.valueOf(this.serviceType) + "]\n"); 
     builder.append("specialty" + "[" + String.valueOf(this.specialty) + "]\n"); 
     builder.append("appointmentType" + "[" + String.valueOf(this.appointmentType) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("indication" + "[" + String.valueOf(this.indication) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("_priority" + "[" + String.valueOf(this._priority) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("supportingInformation" + "[" + String.valueOf(this.supportingInformation) + "]\n"); 
     builder.append("start" + "[" + String.valueOf(this.start) + "]\n"); 
     builder.append("_start" + "[" + String.valueOf(this._start) + "]\n"); 
     builder.append("end" + "[" + String.valueOf(this.end) + "]\n"); 
     builder.append("_end" + "[" + String.valueOf(this._end) + "]\n"); 
     builder.append("minutesDuration" + "[" + String.valueOf(this.minutesDuration) + "]\n"); 
     builder.append("_minutesDuration" + "[" + String.valueOf(this._minutesDuration) + "]\n"); 
     builder.append("slot" + "[" + String.valueOf(this.slot) + "]\n"); 
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("_created" + "[" + String.valueOf(this._created) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
     builder.append("_comment" + "[" + String.valueOf(this._comment) + "]\n"); 
     builder.append("incomingReferral" + "[" + String.valueOf(this.incomingReferral) + "]\n"); 
     builder.append("participant" + "[" + String.valueOf(this.participant) + "]\n"); 
     builder.append("requestedPeriod" + "[" + String.valueOf(this.requestedPeriod) + "]\n"); 
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

  public static java.util.List<Appointment> fromArray(java.util.List<AppointmentModel> list) {
    return (java.util.List<Appointment>)list.stream()
      .map(model -> new Appointment(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AppointmentModel> toModelArray(java.util.List<Appointment> list) {
    return (java.util.List<AppointmentModel>)list.stream()
      .map(model -> new AppointmentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Appointment fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Appointment.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Appointment o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Appointment> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}