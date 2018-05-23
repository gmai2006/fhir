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
import org.fhir.entity.EncounterModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Encounter  extends DomainResource  {
  /**
  * Description: "This is a Encounter resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier(s) by which this encounter is known."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "planned | arrived | triaged | in-progress | onleave | finished | cancelled +."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them."
  */
  protected java.util.List<EncounterStatusHistory> statusHistory;

  /**
  * Description: "inpatient | outpatient | ambulatory | emergency +."
  */
  protected Coding FHIRclass;

  /**
  * Description: "The class history permits the tracking of the encounters transitions without needing to go  through the resource history.\n\nThis would be used for a case where an admission starts of as an emergency encounter, then transisions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kindof discharge from emergency to inpatient."
  */
  protected java.util.List<EncounterClassHistory> classHistory;

  /**
  * Description: "Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)."
  */
  protected java.util.List<CodeableConcept> type;

  /**
  * Description: "Indicates the urgency of the encounter."
  */
  protected CodeableConcept priority;

  /**
  * Description: "The patient ro group present at the encounter."
  */
  protected Reference subject;

  /**
  * Description: "Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years)."
  */
  protected java.util.List<Reference> episodeOfCare;

  /**
  * Description: "The referral request this encounter satisfies (incoming referral)."
  */
  protected java.util.List<Reference> incomingReferral;

  /**
  * Description: "The list of people responsible for providing the service."
  */
  protected java.util.List<EncounterParticipant> participant;

  /**
  * Description: "The appointment that scheduled this encounter."
  */
  protected Reference appointment;

  /**
  * Description: "The start and end time of the encounter."
  */
  protected Period period;

  /**
  * Description: "Quantity of time the encounter lasted. This excludes the time during leaves of absence."
  */
  protected Duration length;

  /**
  * Description: "Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis."
  */
  protected java.util.List<CodeableConcept> reason;

  /**
  * Description: "The list of diagnosis relevant to this encounter."
  */
  protected java.util.List<EncounterDiagnosis> diagnosis;

  /**
  * Description: "The set of accounts that may be used for billing for this Encounter."
  */
  protected java.util.List<Reference> account;

  /**
  * Description: "Details about the admission to a healthcare service."
  */
  protected EncounterHospitalization hospitalization;

  /**
  * Description: "List of locations where  the patient has been during this encounter."
  */
  protected java.util.List<EncounterLocation> location;

  /**
  * Description: "An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization."
  */
  protected Reference serviceProvider;

  /**
  * Description: "Another Encounter of which this encounter is a part of (administratively or in time)."
  */
  protected Reference partOf;

  public Encounter() {
  }

  public Encounter(EncounterModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getStatusHistory() && !o.getStatusHistory().isEmpty()) {
    	this.statusHistory = EncounterStatusHistoryHelper.fromArray2Array(o.getStatusHistory());
    }
    if (null != o.getFHIRclass() && !o.getFHIRclass().isEmpty()) {
      this.FHIRclass = new Coding(o.getFHIRclass().get(0));
    }
    if (null != o.getClassHistory() && !o.getClassHistory().isEmpty()) {
    	this.classHistory = EncounterClassHistoryHelper.fromArray2Array(o.getClassHistory());
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type = CodeableConceptHelper.fromArray2Array(o.getType());
    }
    if (null != o.getPriority() && !o.getPriority().isEmpty()) {
      this.priority = new CodeableConcept(o.getPriority().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getEpisodeOfCare() && !o.getEpisodeOfCare().isEmpty()) {
    	this.episodeOfCare = ReferenceHelper.fromArray2Array(o.getEpisodeOfCare());
    }
    if (null != o.getIncomingReferral() && !o.getIncomingReferral().isEmpty()) {
    	this.incomingReferral = ReferenceHelper.fromArray2Array(o.getIncomingReferral());
    }
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant = EncounterParticipantHelper.fromArray2Array(o.getParticipant());
    }
    if (null != o.getAppointment() && !o.getAppointment().isEmpty()) {
      this.appointment = new Reference(o.getAppointment().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    this.length = DurationHelper.fromJson(o.getLength());
    if (null != o.getReason() && !o.getReason().isEmpty()) {
    	this.reason = CodeableConceptHelper.fromArray2Array(o.getReason());
    }
    if (null != o.getDiagnosis() && !o.getDiagnosis().isEmpty()) {
    	this.diagnosis = EncounterDiagnosisHelper.fromArray2Array(o.getDiagnosis());
    }
    if (null != o.getAccount() && !o.getAccount().isEmpty()) {
    	this.account = ReferenceHelper.fromArray2Array(o.getAccount());
    }
    if (null != o.getHospitalization() && !o.getHospitalization().isEmpty()) {
      this.hospitalization = new EncounterHospitalization(o.getHospitalization().get(0));
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
    	this.location = EncounterLocationHelper.fromArray2Array(o.getLocation());
    }
    if (null != o.getServiceProvider() && !o.getServiceProvider().isEmpty()) {
      this.serviceProvider = new Reference(o.getServiceProvider().get(0));
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
      this.partOf = new Reference(o.getPartOf().get(0));
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
  public void setStatusHistory( java.util.List<EncounterStatusHistory> value) {
    this.statusHistory = value;
  }
  public java.util.List<EncounterStatusHistory> getStatusHistory() {
    return this.statusHistory;
  }
  public void setFHIRclass( Coding value) {
    this.FHIRclass = value;
  }
  public Coding getFHIRclass() {
    return this.FHIRclass;
  }
  public void setClassHistory( java.util.List<EncounterClassHistory> value) {
    this.classHistory = value;
  }
  public java.util.List<EncounterClassHistory> getClassHistory() {
    return this.classHistory;
  }
  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
  }
  public void setPriority( CodeableConcept value) {
    this.priority = value;
  }
  public CodeableConcept getPriority() {
    return this.priority;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setEpisodeOfCare( java.util.List<Reference> value) {
    this.episodeOfCare = value;
  }
  public java.util.List<Reference> getEpisodeOfCare() {
    return this.episodeOfCare;
  }
  public void setIncomingReferral( java.util.List<Reference> value) {
    this.incomingReferral = value;
  }
  public java.util.List<Reference> getIncomingReferral() {
    return this.incomingReferral;
  }
  public void setParticipant( java.util.List<EncounterParticipant> value) {
    this.participant = value;
  }
  public java.util.List<EncounterParticipant> getParticipant() {
    return this.participant;
  }
  public void setAppointment( Reference value) {
    this.appointment = value;
  }
  public Reference getAppointment() {
    return this.appointment;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setLength( Duration value) {
    this.length = value;
  }
  public Duration getLength() {
    return this.length;
  }
  public void setReason( java.util.List<CodeableConcept> value) {
    this.reason = value;
  }
  public java.util.List<CodeableConcept> getReason() {
    return this.reason;
  }
  public void setDiagnosis( java.util.List<EncounterDiagnosis> value) {
    this.diagnosis = value;
  }
  public java.util.List<EncounterDiagnosis> getDiagnosis() {
    return this.diagnosis;
  }
  public void setAccount( java.util.List<Reference> value) {
    this.account = value;
  }
  public java.util.List<Reference> getAccount() {
    return this.account;
  }
  public void setHospitalization( EncounterHospitalization value) {
    this.hospitalization = value;
  }
  public EncounterHospitalization getHospitalization() {
    return this.hospitalization;
  }
  public void setLocation( java.util.List<EncounterLocation> value) {
    this.location = value;
  }
  public java.util.List<EncounterLocation> getLocation() {
    return this.location;
  }
  public void setServiceProvider( Reference value) {
    this.serviceProvider = value;
  }
  public Reference getServiceProvider() {
    return this.serviceProvider;
  }
  public void setPartOf( Reference value) {
    this.partOf = value;
  }
  public Reference getPartOf() {
    return this.partOf;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Encounter]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.statusHistory != null) builder.append("statusHistory" + "->" + this.statusHistory.toString() + "\n"); 
     if(this.FHIRclass != null) builder.append("FHIRclass" + "->" + this.FHIRclass.toString() + "\n"); 
     if(this.classHistory != null) builder.append("classHistory" + "->" + this.classHistory.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.episodeOfCare != null) builder.append("episodeOfCare" + "->" + this.episodeOfCare.toString() + "\n"); 
     if(this.incomingReferral != null) builder.append("incomingReferral" + "->" + this.incomingReferral.toString() + "\n"); 
     if(this.participant != null) builder.append("participant" + "->" + this.participant.toString() + "\n"); 
     if(this.appointment != null) builder.append("appointment" + "->" + this.appointment.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.length != null) builder.append("length" + "->" + this.length.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.diagnosis != null) builder.append("diagnosis" + "->" + this.diagnosis.toString() + "\n"); 
     if(this.account != null) builder.append("account" + "->" + this.account.toString() + "\n"); 
     if(this.hospitalization != null) builder.append("hospitalization" + "->" + this.hospitalization.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.serviceProvider != null) builder.append("serviceProvider" + "->" + this.serviceProvider.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Encounter,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Encounter" : { return Encounter.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	planned,
  	arrived,
  	triaged,
  	inprogress,
  	onleave,
  	finished,
  	cancelled,
  	enteredinerror,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "planned" : { return planned.toString(); }
  			case "arrived" : { return arrived.toString(); }
  			case "triaged" : { return triaged.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "onleave" : { return onleave.toString(); }
  			case "finished" : { return finished.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}