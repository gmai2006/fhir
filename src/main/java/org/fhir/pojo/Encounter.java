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
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.statusHistory = EncounterStatusHistory.fromArray(o.getStatusHistory());

      this.FHIRclass = Coding.fromJson(o.getFHIRclass());
      this.classHistory = EncounterClassHistory.fromArray(o.getClassHistory());

      this.type = CodeableConcept.fromArray(o.getType());
      this.priority = CodeableConcept.fromJson(o.getPriority());
      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      this.episodeOfCare = Reference.fromArray(o.getEpisodeOfCare());

      this.incomingReferral = Reference.fromArray(o.getIncomingReferral());

      this.participant = EncounterParticipant.fromArray(o.getParticipant());

      if (null != o.getAppointment()) {
        this.appointment = new Reference(o.getAppointment());
        this.appointment.setId(this.getId());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.length = Duration.fromJson(o.getLength());
      this.reason = CodeableConcept.fromArray(o.getReason());
      this.diagnosis = EncounterDiagnosis.fromArray(o.getDiagnosis());

      this.account = Reference.fromArray(o.getAccount());

      if (null != o.getHospitalization()) {
        this.hospitalization = new EncounterHospitalization(o.getHospitalization());
        this.hospitalization.setId(this.getId());
      }

      this.location = EncounterLocation.fromArray(o.getLocation());

      if (null != o.getServiceProvider()) {
        this.serviceProvider = new Reference(o.getServiceProvider());
        this.serviceProvider.setId(this.getId());
      }

      if (null != o.getPartOf()) {
        this.partOf = new Reference(o.getPartOf());
        this.partOf.setId(this.getId());
      }

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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("statusHistory" + "[" + String.valueOf(this.statusHistory) + "]\n"); 
     builder.append("FHIRclass" + "[" + String.valueOf(this.FHIRclass) + "]\n"); 
     builder.append("classHistory" + "[" + String.valueOf(this.classHistory) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("episodeOfCare" + "[" + String.valueOf(this.episodeOfCare) + "]\n"); 
     builder.append("incomingReferral" + "[" + String.valueOf(this.incomingReferral) + "]\n"); 
     builder.append("participant" + "[" + String.valueOf(this.participant) + "]\n"); 
     builder.append("appointment" + "[" + String.valueOf(this.appointment) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("length" + "[" + String.valueOf(this.length) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("diagnosis" + "[" + String.valueOf(this.diagnosis) + "]\n"); 
     builder.append("account" + "[" + String.valueOf(this.account) + "]\n"); 
     builder.append("hospitalization" + "[" + String.valueOf(this.hospitalization) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("serviceProvider" + "[" + String.valueOf(this.serviceProvider) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
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

  public static java.util.List<Encounter> fromArray(java.util.List<EncounterModel> list) {
    return (java.util.List<Encounter>)list.stream()
      .map(model -> new Encounter(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<EncounterModel> toModelArray(java.util.List<Encounter> list) {
    return (java.util.List<EncounterModel>)list.stream()
      .map(model -> new EncounterModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Encounter fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Encounter.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Encounter o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Encounter> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}