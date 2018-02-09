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

/**
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
@Entity
@Table(name="encounter")
public class EncounterModel  {
  /**
  * Description: "This is a Encounter resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifier(s) by which this encounter is known."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "planned | arrived | triaged | in-progress | onleave | finished | cancelled +."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<EncounterStatusHistoryModel> statusHistory = new java.util.ArrayList<>();

  /**
  * Description: "inpatient | outpatient | ambulatory | emergency +."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"FHIRclass\"", length = 16777215)
  private String FHIRclass;

  /**
  * Description: "The class history permits the tracking of the encounters transitions without needing to go  through the resource history.\n\nThis would be used for a case where an admission starts of as an emergency encounter, then transisions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kindof discharge from emergency to inpatient."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<EncounterClassHistoryModel> classHistory = new java.util.ArrayList<>();

  /**
  * Description: "Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Indicates the urgency of the encounter."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"priority\"", length = 16777215)
  private String priority;

  /**
  * Description: "The patient ro group present at the encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> episodeOfCare = new java.util.ArrayList<>();

  /**
  * Description: "The referral request this encounter satisfies (incoming referral)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> incomingReferral = new java.util.ArrayList<>();

  /**
  * Description: "The list of people responsible for providing the service."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<EncounterParticipantModel> participant = new java.util.ArrayList<>();

  /**
  * Description: "The appointment that scheduled this encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"appointment_id\"")
  private String appointment_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`appointment_id`", insertable=false, updatable=false)
  private ReferenceModel appointment;

  /**
  * Description: "The start and end time of the encounter."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "Quantity of time the encounter lasted. This excludes the time during leaves of absence."
  * Actual type: Duration
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"length\"", length = 16777215)
  private String length;

  /**
  * Description: "Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "The list of diagnosis relevant to this encounter."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<EncounterDiagnosisModel> diagnosis = new java.util.ArrayList<>();

  /**
  * Description: "The set of accounts that may be used for billing for this Encounter."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> account = new java.util.ArrayList<>();

  /**
  * Description: "Details about the admission to a healthcare service."
  */
  @javax.persistence.Basic
  @Column(name="\"hospitalization_id\"")
  private String hospitalization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`hospitalization_id`", insertable=false, updatable=false)
  private EncounterHospitalizationModel hospitalization;

  /**
  * Description: "List of locations where  the patient has been during this encounter."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<EncounterLocationModel> location = new java.util.ArrayList<>();

  /**
  * Description: "An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization."
  */
  @javax.persistence.Basic
  @Column(name="\"serviceprovider_id\"")
  private String serviceprovider_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`serviceprovider_id`", insertable=false, updatable=false)
  private ReferenceModel serviceProvider;

  /**
  * Description: "Another Encounter of which this encounter is a part of (administratively or in time)."
  */
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`partof_id`", insertable=false, updatable=false)
  private ReferenceModel partOf;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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


  public EncounterModel() {
  }

  public EncounterModel(Encounter o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.statusHistory = EncounterStatusHistory.toModelArray(o.getStatusHistory());

      this.FHIRclass = Coding.toJson(o.getFHIRclass());
      this.classHistory = EncounterClassHistory.toModelArray(o.getClassHistory());

      this.type = CodeableConcept.toJson(o.getType());
      this.priority = CodeableConcept.toJson(o.getPriority());
      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      this.episodeOfCare = Reference.toModelArray(o.getEpisodeOfCare());

      this.incomingReferral = Reference.toModelArray(o.getIncomingReferral());

      this.participant = EncounterParticipant.toModelArray(o.getParticipant());

      if (null != o.getAppointment()) {
      	this.appointment_id = "appointment" + this.getId();
        this.appointment = new ReferenceModel(o.getAppointment());
        this.appointment.setId(this.appointment_id);
        this.appointment.parent_id = this.appointment.getId();
      }

      this.period = Period.toJson(o.getPeriod());
      this.length = Duration.toJson(o.getLength());
      this.reason = CodeableConcept.toJson(o.getReason());
      this.diagnosis = EncounterDiagnosis.toModelArray(o.getDiagnosis());

      this.account = Reference.toModelArray(o.getAccount());

      if (null != o.getHospitalization()) {
      	this.hospitalization_id = "hospitalization" + this.getId();
        this.hospitalization = new EncounterHospitalizationModel(o.getHospitalization());
        this.hospitalization.setId(this.hospitalization_id);
        this.hospitalization.parent_id = this.hospitalization.getId();
      }

      this.location = EncounterLocation.toModelArray(o.getLocation());

      if (null != o.getServiceProvider()) {
      	this.serviceprovider_id = "serviceProvider" + this.getId();
        this.serviceProvider = new ReferenceModel(o.getServiceProvider());
        this.serviceProvider.setId(this.serviceprovider_id);
        this.serviceProvider.parent_id = this.serviceProvider.getId();
      }

      if (null != o.getPartOf()) {
      	this.partof_id = "partOf" + this.getId();
        this.partOf = new ReferenceModel(o.getPartOf());
        this.partOf.setId(this.partof_id);
        this.partOf.parent_id = this.partOf.getId();
      }

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatusHistory( java.util.List<EncounterStatusHistoryModel> value) {
    this.statusHistory = value;
  }
  public java.util.List<EncounterStatusHistoryModel> getStatusHistory() {
    return this.statusHistory;
  }
  public void setFHIRclass( String value) {
    this.FHIRclass = value;
  }
  public String getFHIRclass() {
    return this.FHIRclass;
  }
  public void setClassHistory( java.util.List<EncounterClassHistoryModel> value) {
    this.classHistory = value;
  }
  public java.util.List<EncounterClassHistoryModel> getClassHistory() {
    return this.classHistory;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setEpisodeOfCare( java.util.List<ReferenceModel> value) {
    this.episodeOfCare = value;
  }
  public java.util.List<ReferenceModel> getEpisodeOfCare() {
    return this.episodeOfCare;
  }
  public void setIncomingReferral( java.util.List<ReferenceModel> value) {
    this.incomingReferral = value;
  }
  public java.util.List<ReferenceModel> getIncomingReferral() {
    return this.incomingReferral;
  }
  public void setParticipant( java.util.List<EncounterParticipantModel> value) {
    this.participant = value;
  }
  public java.util.List<EncounterParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setAppointment( ReferenceModel value) {
    this.appointment = value;
  }
  public ReferenceModel getAppointment() {
    return this.appointment;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setLength( String value) {
    this.length = value;
  }
  public String getLength() {
    return this.length;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setDiagnosis( java.util.List<EncounterDiagnosisModel> value) {
    this.diagnosis = value;
  }
  public java.util.List<EncounterDiagnosisModel> getDiagnosis() {
    return this.diagnosis;
  }
  public void setAccount( java.util.List<ReferenceModel> value) {
    this.account = value;
  }
  public java.util.List<ReferenceModel> getAccount() {
    return this.account;
  }
  public void setHospitalization( EncounterHospitalizationModel value) {
    this.hospitalization = value;
  }
  public EncounterHospitalizationModel getHospitalization() {
    return this.hospitalization;
  }
  public void setLocation( java.util.List<EncounterLocationModel> value) {
    this.location = value;
  }
  public java.util.List<EncounterLocationModel> getLocation() {
    return this.location;
  }
  public void setServiceProvider( ReferenceModel value) {
    this.serviceProvider = value;
  }
  public ReferenceModel getServiceProvider() {
    return this.serviceProvider;
  }
  public void setPartOf( ReferenceModel value) {
    this.partOf = value;
  }
  public ReferenceModel getPartOf() {
    return this.partOf;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
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
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}