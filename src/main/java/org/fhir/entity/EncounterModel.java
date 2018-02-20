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
* "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
*/
@Entity
@Table(name="encounter")
public class EncounterModel  implements Serializable {
	private static final long serialVersionUID = 151910893738456658L;
  /**
  * Description: "This is a Encounter resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifier(s) by which this encounter is known."
  * Actual type: List<String>;
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
  @javax.persistence.Basic
  @Column(name="\"statushistory_id\"")
  private String statushistory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="statushistory_id", insertable=false, updatable=false)
  private java.util.List<EncounterStatusHistoryModel> statusHistory;

  /**
  * Description: "inpatient | outpatient | ambulatory | emergency +."
  */
  @javax.persistence.Basic
  @Column(name="\"fhirclass_id\"")
  private String fhirclass_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="fhirclass_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> FHIRclass;

  /**
  * Description: "The class history permits the tracking of the encounters transitions without needing to go  through the resource history.\n\nThis would be used for a case where an admission starts of as an emergency encounter, then transisions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kindof discharge from emergency to inpatient."
  */
  @javax.persistence.Basic
  @Column(name="\"classhistory_id\"")
  private String classhistory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="classhistory_id", insertable=false, updatable=false)
  private java.util.List<EncounterClassHistoryModel> classHistory;

  /**
  * Description: "Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "Indicates the urgency of the encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"priority_id\"")
  private String priority_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="priority_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> priority;

  /**
  * Description: "The patient ro group present at the encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years)."
  */
  @javax.persistence.Basic
  @Column(name="\"episodeofcare_id\"")
  private String episodeofcare_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="episodeofcare_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> episodeOfCare;

  /**
  * Description: "The referral request this encounter satisfies (incoming referral)."
  */
  @javax.persistence.Basic
  @Column(name="\"incomingreferral_id\"")
  private String incomingreferral_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="incomingreferral_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> incomingReferral;

  /**
  * Description: "The list of people responsible for providing the service."
  */
  @javax.persistence.Basic
  @Column(name="\"participant_id\"")
  private String participant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="participant_id", insertable=false, updatable=false)
  private java.util.List<EncounterParticipantModel> participant;

  /**
  * Description: "The appointment that scheduled this encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"appointment_id\"")
  private String appointment_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="appointment_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> appointment;

  /**
  * Description: "The start and end time of the encounter."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "Quantity of time the encounter lasted. This excludes the time during leaves of absence."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"length\"", length = 16777215)
  private String length;

  /**
  * Description: "Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis."
  */
  @javax.persistence.Basic
  @Column(name="\"reason_id\"")
  private String reason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="reason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reason;

  /**
  * Description: "The list of diagnosis relevant to this encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"diagnosis_id\"")
  private String diagnosis_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="diagnosis_id", insertable=false, updatable=false)
  private java.util.List<EncounterDiagnosisModel> diagnosis;

  /**
  * Description: "The set of accounts that may be used for billing for this Encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"account_id\"")
  private String account_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="account_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> account;

  /**
  * Description: "Details about the admission to a healthcare service."
  */
  @javax.persistence.Basic
  @Column(name="\"hospitalization_id\"")
  private String hospitalization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="hospitalization_id", insertable=false, updatable=false)
  private java.util.List<EncounterHospitalizationModel> hospitalization;

  /**
  * Description: "List of locations where  the patient has been during this encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="location_id", insertable=false, updatable=false)
  private java.util.List<EncounterLocationModel> location;

  /**
  * Description: "An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization."
  */
  @javax.persistence.Basic
  @Column(name="\"serviceprovider_id\"")
  private String serviceprovider_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="serviceprovider_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> serviceProvider;

  /**
  * Description: "Another Encounter of which this encounter is a part of (administratively or in time)."
  */
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="partof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf;

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

  public EncounterModel() {
  }

  public EncounterModel(Encounter o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getStatusHistory() && !o.getStatusHistory().isEmpty()) {
    	this.statushistory_id = "statushistory" + this.id;
    	this.statusHistory = EncounterStatusHistoryHelper.toModelFromArray(o.getStatusHistory(), this.statushistory_id);
    }
    if (null != o.getFHIRclass() ) {
    	this.fhirclass_id = "fhirclass" + this.id;
    	this.FHIRclass = CodingHelper.toModel(o.getFHIRclass(), this.fhirclass_id);
    }
    if (null != o.getClassHistory() && !o.getClassHistory().isEmpty()) {
    	this.classhistory_id = "classhistory" + this.id;
    	this.classHistory = EncounterClassHistoryHelper.toModelFromArray(o.getClassHistory(), this.classhistory_id);
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModelFromArray(o.getType(), this.type_id);
    }
    if (null != o.getPriority() ) {
    	this.priority_id = "priority" + this.id;
    	this.priority = CodeableConceptHelper.toModel(o.getPriority(), this.priority_id);
    }
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getEpisodeOfCare() && !o.getEpisodeOfCare().isEmpty()) {
    	this.episodeofcare_id = "episodeofcare" + this.id;
    	this.episodeOfCare = ReferenceHelper.toModelFromArray(o.getEpisodeOfCare(), this.episodeofcare_id);
    }
    if (null != o.getIncomingReferral() && !o.getIncomingReferral().isEmpty()) {
    	this.incomingreferral_id = "incomingreferral" + this.id;
    	this.incomingReferral = ReferenceHelper.toModelFromArray(o.getIncomingReferral(), this.incomingreferral_id);
    }
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant_id = "participant" + this.id;
    	this.participant = EncounterParticipantHelper.toModelFromArray(o.getParticipant(), this.participant_id);
    }
    if (null != o.getAppointment() ) {
    	this.appointment_id = "appointment" + this.id;
    	this.appointment = ReferenceHelper.toModel(o.getAppointment(), this.appointment_id);
    }
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getLength()) {
    	this.length = JsonUtils.toJson(o.getLength());
    }
    if (null != o.getReason() && !o.getReason().isEmpty()) {
    	this.reason_id = "reason" + this.id;
    	this.reason = CodeableConceptHelper.toModelFromArray(o.getReason(), this.reason_id);
    }
    if (null != o.getDiagnosis() && !o.getDiagnosis().isEmpty()) {
    	this.diagnosis_id = "diagnosis" + this.id;
    	this.diagnosis = EncounterDiagnosisHelper.toModelFromArray(o.getDiagnosis(), this.diagnosis_id);
    }
    if (null != o.getAccount() && !o.getAccount().isEmpty()) {
    	this.account_id = "account" + this.id;
    	this.account = ReferenceHelper.toModelFromArray(o.getAccount(), this.account_id);
    }
    if (null != o.getHospitalization() ) {
    	this.hospitalization_id = "hospitalization" + this.id;
    	this.hospitalization = EncounterHospitalizationHelper.toModel(o.getHospitalization(), this.hospitalization_id);
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
    	this.location_id = "location" + this.id;
    	this.location = EncounterLocationHelper.toModelFromArray(o.getLocation(), this.location_id);
    }
    if (null != o.getServiceProvider() ) {
    	this.serviceprovider_id = "serviceprovider" + this.id;
    	this.serviceProvider = ReferenceHelper.toModel(o.getServiceProvider(), this.serviceprovider_id);
    }
    if (null != o.getPartOf() ) {
    	this.partof_id = "partof" + this.id;
    	this.partOf = ReferenceHelper.toModel(o.getPartOf(), this.partof_id);
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
  public java.util.List<EncounterStatusHistoryModel> getStatusHistory() {
    return this.statusHistory;
  }
  public void setStatusHistory( java.util.List<EncounterStatusHistoryModel> value) {
    this.statusHistory = value;
  }
  public java.util.List<CodingModel> getFHIRclass() {
    return this.FHIRclass;
  }
  public void setFHIRclass( java.util.List<CodingModel> value) {
    this.FHIRclass = value;
  }
  public java.util.List<EncounterClassHistoryModel> getClassHistory() {
    return this.classHistory;
  }
  public void setClassHistory( java.util.List<EncounterClassHistoryModel> value) {
    this.classHistory = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<CodeableConceptModel> getPriority() {
    return this.priority;
  }
  public void setPriority( java.util.List<CodeableConceptModel> value) {
    this.priority = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getEpisodeOfCare() {
    return this.episodeOfCare;
  }
  public void setEpisodeOfCare( java.util.List<ReferenceModel> value) {
    this.episodeOfCare = value;
  }
  public java.util.List<ReferenceModel> getIncomingReferral() {
    return this.incomingReferral;
  }
  public void setIncomingReferral( java.util.List<ReferenceModel> value) {
    this.incomingReferral = value;
  }
  public java.util.List<EncounterParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setParticipant( java.util.List<EncounterParticipantModel> value) {
    this.participant = value;
  }
  public java.util.List<ReferenceModel> getAppointment() {
    return this.appointment;
  }
  public void setAppointment( java.util.List<ReferenceModel> value) {
    this.appointment = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getLength() {
    return this.length;
  }
  public void setLength( String value) {
    this.length = value;
  }
  public java.util.List<CodeableConceptModel> getReason() {
    return this.reason;
  }
  public void setReason( java.util.List<CodeableConceptModel> value) {
    this.reason = value;
  }
  public java.util.List<EncounterDiagnosisModel> getDiagnosis() {
    return this.diagnosis;
  }
  public void setDiagnosis( java.util.List<EncounterDiagnosisModel> value) {
    this.diagnosis = value;
  }
  public java.util.List<ReferenceModel> getAccount() {
    return this.account;
  }
  public void setAccount( java.util.List<ReferenceModel> value) {
    this.account = value;
  }
  public java.util.List<EncounterHospitalizationModel> getHospitalization() {
    return this.hospitalization;
  }
  public void setHospitalization( java.util.List<EncounterHospitalizationModel> value) {
    this.hospitalization = value;
  }
  public java.util.List<EncounterLocationModel> getLocation() {
    return this.location;
  }
  public void setLocation( java.util.List<EncounterLocationModel> value) {
    this.location = value;
  }
  public java.util.List<ReferenceModel> getServiceProvider() {
    return this.serviceProvider;
  }
  public void setServiceProvider( java.util.List<ReferenceModel> value) {
    this.serviceProvider = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
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
    builder.append("[EncounterModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("length" + "->" + this.length + "\n"); 
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
    builder.append("[EncounterModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("statusHistory" + "->" + this.statusHistory + "\n"); 
     builder.append("FHIRclass" + "->" + this.FHIRclass + "\n"); 
     builder.append("classHistory" + "->" + this.classHistory + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("episodeOfCare" + "->" + this.episodeOfCare + "\n"); 
     builder.append("incomingReferral" + "->" + this.incomingReferral + "\n"); 
     builder.append("participant" + "->" + this.participant + "\n"); 
     builder.append("appointment" + "->" + this.appointment + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("length" + "->" + this.length + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("diagnosis" + "->" + this.diagnosis + "\n"); 
     builder.append("account" + "->" + this.account + "\n"); 
     builder.append("hospitalization" + "->" + this.hospitalization + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("serviceProvider" + "->" + this.serviceProvider + "\n"); 
     builder.append("partOf" + "->" + this.partOf + "\n"); 
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