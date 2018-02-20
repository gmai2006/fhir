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
import org.fhir.utils.JsonUtils;
/**
* "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)."
*/
@Entity
@Table(name="appointment")
public class AppointmentModel  implements Serializable {
	private static final long serialVersionUID = 15191089376215254L;
  /**
  * Description: "This is a Appointment resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A broad categorisation of the service that is to be performed during this appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"servicecategory_id\"")
  private String servicecategory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="servicecategory_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> serviceCategory;

  /**
  * Description: "The specific service that is to be performed during this appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"servicetype_id\"")
  private String servicetype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="servicetype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> serviceType;

  /**
  * Description: "The specialty of a practitioner that would be required to perform the service requested in this appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"specialty_id\"")
  private String specialty_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="specialty_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> specialty;

  /**
  * Description: "The style of appointment or patient that has been booked in the slot (not service type)."
  */
  @javax.persistence.Basic
  @Column(name="\"appointmenttype_id\"")
  private String appointmenttype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="appointmenttype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> appointmentType;

  /**
  * Description: "The reason that this appointment is being scheduled. This is more clinical than administrative."
  */
  @javax.persistence.Basic
  @Column(name="\"reason_id\"")
  private String reason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="reason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reason;

  /**
  * Description: "Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"indication_id\"")
  private String indication_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="indication_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> indication;

  /**
  * Description: "The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private Float priority;

  /**
  * Description: "The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Additional information to support the appointment provided when making the appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"supportinginformation_id\"")
  private String supportinginformation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="supportinginformation_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInformation;

  /**
  * Description: "Date/Time that the appointment is to take place."
  */
  @javax.persistence.Basic
  @Column(name="\"start\"")
  private String start;

  /**
  * Description: "Date/Time that the appointment is to conclude."
  */
  @javax.persistence.Basic
  @Column(name="\"end\"")
  private String end;

  /**
  * Description: "Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"minutesDuration\"")
  private Float minutesDuration;

  /**
  * Description: "The slots from the participants' schedules that will be filled by the appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"slot_id\"")
  private String slot_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="slot_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> slot;

  /**
  * Description: "The date that this appointment was initially created. This could be different to the meta.lastModified value on the initial entry, as this could have been before the resource was created on the FHIR server, and should remain unchanged over the lifespan of the appointment."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"created\"")
  private String created;

  /**
  * Description: "Additional comments about the appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

  /**
  * Description: "The referral request this appointment is allocated to assess (incoming referral)."
  */
  @javax.persistence.Basic
  @Column(name="\"incomingreferral_id\"")
  private String incomingreferral_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="incomingreferral_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> incomingReferral;

  /**
  * Description: "List of participants involved in the appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"participant_id\"")
  private String participant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="participant_id", insertable=false, updatable=false)
  private java.util.List<AppointmentParticipantModel> participant;

  /**
  * Description: "A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within. When using these values, the minutes duration should be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"requestedPeriod\"", length = 16777215)
  private String requestedPeriod;

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

  public AppointmentModel() {
  }

  public AppointmentModel(Appointment o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getServiceCategory() ) {
    	this.servicecategory_id = "servicecategory" + this.id;
    	this.serviceCategory = CodeableConceptHelper.toModel(o.getServiceCategory(), this.servicecategory_id);
    }
    if (null != o.getServiceType() && !o.getServiceType().isEmpty()) {
    	this.servicetype_id = "servicetype" + this.id;
    	this.serviceType = CodeableConceptHelper.toModelFromArray(o.getServiceType(), this.servicetype_id);
    }
    if (null != o.getSpecialty() && !o.getSpecialty().isEmpty()) {
    	this.specialty_id = "specialty" + this.id;
    	this.specialty = CodeableConceptHelper.toModelFromArray(o.getSpecialty(), this.specialty_id);
    }
    if (null != o.getAppointmentType() ) {
    	this.appointmenttype_id = "appointmenttype" + this.id;
    	this.appointmentType = CodeableConceptHelper.toModel(o.getAppointmentType(), this.appointmenttype_id);
    }
    if (null != o.getReason() && !o.getReason().isEmpty()) {
    	this.reason_id = "reason" + this.id;
    	this.reason = CodeableConceptHelper.toModelFromArray(o.getReason(), this.reason_id);
    }
    if (null != o.getIndication() && !o.getIndication().isEmpty()) {
    	this.indication_id = "indication" + this.id;
    	this.indication = ReferenceHelper.toModelFromArray(o.getIndication(), this.indication_id);
    }
    this.priority = o.getPriority();
    this.description = o.getDescription();
    if (null != o.getSupportingInformation() && !o.getSupportingInformation().isEmpty()) {
    	this.supportinginformation_id = "supportinginformation" + this.id;
    	this.supportingInformation = ReferenceHelper.toModelFromArray(o.getSupportingInformation(), this.supportinginformation_id);
    }
    this.start = o.getStart();
    this.end = o.getEnd();
    this.minutesDuration = o.getMinutesDuration();
    if (null != o.getSlot() && !o.getSlot().isEmpty()) {
    	this.slot_id = "slot" + this.id;
    	this.slot = ReferenceHelper.toModelFromArray(o.getSlot(), this.slot_id);
    }
    this.created = o.getCreated();
    this.comment = o.getComment();
    if (null != o.getIncomingReferral() && !o.getIncomingReferral().isEmpty()) {
    	this.incomingreferral_id = "incomingreferral" + this.id;
    	this.incomingReferral = ReferenceHelper.toModelFromArray(o.getIncomingReferral(), this.incomingreferral_id);
    }
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant_id = "participant" + this.id;
    	this.participant = AppointmentParticipantHelper.toModelFromArray(o.getParticipant(), this.participant_id);
    }
    if (null != o.getRequestedPeriod()) {
    	this.requestedPeriod = JsonUtils.toJson(o.getRequestedPeriod());
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
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
  public java.util.List<CodeableConceptModel> getServiceCategory() {
    return this.serviceCategory;
  }
  public void setServiceCategory( java.util.List<CodeableConceptModel> value) {
    this.serviceCategory = value;
  }
  public java.util.List<CodeableConceptModel> getServiceType() {
    return this.serviceType;
  }
  public void setServiceType( java.util.List<CodeableConceptModel> value) {
    this.serviceType = value;
  }
  public java.util.List<CodeableConceptModel> getSpecialty() {
    return this.specialty;
  }
  public void setSpecialty( java.util.List<CodeableConceptModel> value) {
    this.specialty = value;
  }
  public java.util.List<CodeableConceptModel> getAppointmentType() {
    return this.appointmentType;
  }
  public void setAppointmentType( java.util.List<CodeableConceptModel> value) {
    this.appointmentType = value;
  }
  public java.util.List<CodeableConceptModel> getReason() {
    return this.reason;
  }
  public void setReason( java.util.List<CodeableConceptModel> value) {
    this.reason = value;
  }
  public java.util.List<ReferenceModel> getIndication() {
    return this.indication;
  }
  public void setIndication( java.util.List<ReferenceModel> value) {
    this.indication = value;
  }
  public Float getPriority() {
    return this.priority;
  }
  public void setPriority( Float value) {
    this.priority = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<ReferenceModel> getSupportingInformation() {
    return this.supportingInformation;
  }
  public void setSupportingInformation( java.util.List<ReferenceModel> value) {
    this.supportingInformation = value;
  }
  public String getStart() {
    return this.start;
  }
  public void setStart( String value) {
    this.start = value;
  }
  public String getEnd() {
    return this.end;
  }
  public void setEnd( String value) {
    this.end = value;
  }
  public Float getMinutesDuration() {
    return this.minutesDuration;
  }
  public void setMinutesDuration( Float value) {
    this.minutesDuration = value;
  }
  public java.util.List<ReferenceModel> getSlot() {
    return this.slot;
  }
  public void setSlot( java.util.List<ReferenceModel> value) {
    this.slot = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void setCreated( String value) {
    this.created = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public java.util.List<ReferenceModel> getIncomingReferral() {
    return this.incomingReferral;
  }
  public void setIncomingReferral( java.util.List<ReferenceModel> value) {
    this.incomingReferral = value;
  }
  public java.util.List<AppointmentParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setParticipant( java.util.List<AppointmentParticipantModel> value) {
    this.participant = value;
  }
  public String getRequestedPeriod() {
    return this.requestedPeriod;
  }
  public void setRequestedPeriod( String value) {
    this.requestedPeriod = value;
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
    builder.append("[AppointmentModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("end" + "->" + this.end + "\n"); 
     builder.append("minutesDuration" + "->" + this.minutesDuration + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("requestedPeriod" + "->" + this.requestedPeriod + "\n"); 
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
    builder.append("[AppointmentModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("serviceCategory" + "->" + this.serviceCategory + "\n"); 
     builder.append("serviceType" + "->" + this.serviceType + "\n"); 
     builder.append("specialty" + "->" + this.specialty + "\n"); 
     builder.append("appointmentType" + "->" + this.appointmentType + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("indication" + "->" + this.indication + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("supportingInformation" + "->" + this.supportingInformation + "\n"); 
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("end" + "->" + this.end + "\n"); 
     builder.append("minutesDuration" + "->" + this.minutesDuration + "\n"); 
     builder.append("slot" + "->" + this.slot + "\n"); 
     builder.append("created" + "->" + this.created + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("incomingReferral" + "->" + this.incomingReferral + "\n"); 
     builder.append("participant" + "->" + this.participant + "\n"); 
     builder.append("requestedPeriod" + "->" + this.requestedPeriod + "\n"); 
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