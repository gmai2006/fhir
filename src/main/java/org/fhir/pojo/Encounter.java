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
import com.google.gson.GsonBuilder;

/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
public class Encounter  {
  /**
  * Description: "This is a Encounter resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifier(s) by which this encounter is known."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "planned | arrived | triaged | in-progress | onleave | finished | cancelled +."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them."
  */
  private java.util.List<EncounterStatusHistory> statusHistory = new java.util.ArrayList<>();

  /**
  * Description: "inpatient | outpatient | ambulatory | emergency +."
  */
  private Coding FHIRclass;

  /**
  * Description: "The class history permits the tracking of the encounters transitions without needing to go  through the resource history.\n\nThis would be used for a case where an admission starts of as an emergency encounter, then transisions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kindof discharge from emergency to inpatient."
  */
  private java.util.List<EncounterClassHistory> classHistory = new java.util.ArrayList<>();

  /**
  * Description: "Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)."
  */
  private java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the urgency of the encounter."
  */
  private CodeableConcept priority;

  /**
  * Description: "The patient ro group present at the encounter."
  */
  private Reference subject;

  /**
  * Description: "Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years)."
  */
  private java.util.List<Reference> episodeOfCare = new java.util.ArrayList<>();

  /**
  * Description: "The referral request this encounter satisfies (incoming referral)."
  */
  private java.util.List<Reference> incomingReferral = new java.util.ArrayList<>();

  /**
  * Description: "The list of people responsible for providing the service."
  */
  private java.util.List<EncounterParticipant> participant = new java.util.ArrayList<>();

  /**
  * Description: "The appointment that scheduled this encounter."
  */
  private Reference appointment;

  /**
  * Description: "The start and end time of the encounter."
  */
  private Period period;

  /**
  * Description: "Quantity of time the encounter lasted. This excludes the time during leaves of absence."
  */
  private Duration length;

  /**
  * Description: "Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis."
  */
  private java.util.List<CodeableConcept> reason = new java.util.ArrayList<>();

  /**
  * Description: "The list of diagnosis relevant to this encounter."
  */
  private java.util.List<EncounterDiagnosis> diagnosis = new java.util.ArrayList<>();

  /**
  * Description: "The set of accounts that may be used for billing for this Encounter."
  */
  private java.util.List<Reference> account = new java.util.ArrayList<>();

  /**
  * Description: "Details about the admission to a healthcare service."
  */
  private EncounterHospitalization hospitalization;

  /**
  * Description: "List of locations where  the patient has been during this encounter."
  */
  private java.util.List<EncounterLocation> location = new java.util.ArrayList<>();

  /**
  * Description: "An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization."
  */
  private Reference serviceProvider;

  /**
  * Description: "Another Encounter of which this encounter is a part of (administratively or in time)."
  */
  private Reference partOf;

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
  @javax.validation.constraints.NotNull
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

  public Encounter() {
  }

  public Encounter(EncounterModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getStatusHistory() && !o.getStatusHistory().isEmpty()) {
    	this.statusHistory = EncounterStatusHistoryHelper.fromArray2Array(o.getStatusHistory());
    }
    this.FHIRclass = CodingHelper.fromJson(o.getFHIRclass());
    if (null != o.getClassHistory() && !o.getClassHistory().isEmpty()) {
    	this.classHistory = EncounterClassHistoryHelper.fromArray2Array(o.getClassHistory());
    }
    this.priority = CodeableConceptHelper.fromJson(o.getPriority());
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
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
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
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
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