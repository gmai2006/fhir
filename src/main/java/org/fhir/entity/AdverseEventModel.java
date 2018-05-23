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
* "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death."
*/
@Entity
@Table(name="adverseevent")
public class AdverseEventModel  implements Serializable {
	private static final long serialVersionUID = 151967883229945123L;
  /**
  * Description: "This is a AdverseEvent resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The identifier(s) of this adverse event that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itsefl is not appropriate."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The type of event which is important to characterize what occurred and caused harm to the subject, or had the potential to cause harm to the subject."
  */
  @javax.persistence.Basic
  @Column(name="\"category\"")
  private String category;

  /**
  * Description: "This element defines the specific type of event that occurred or that was prevented from occurring."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "This subject or group impacted by the event.  With a prospective adverse event, there will be no subject as the adverse event was prevented."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The date (and perhaps time) when the adverse event occurred."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical)."
  */
  @javax.persistence.Basic
  @Column(name="\"reaction_id\"")
  private String reaction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reaction_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reaction;

  /**
  * Description: "The information about where the adverse event occurred."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="location_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location;

  /**
  * Description: "Describes the seriousness or severity of the adverse event."
  */
  @javax.persistence.Basic
  @Column(name="\"seriousness_id\"")
  private String seriousness_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="seriousness_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> seriousness;

  /**
  * Description: "Describes the type of outcome from the adverse event."
  */
  @javax.persistence.Basic
  @Column(name="\"outcome_id\"")
  private String outcome_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="outcome_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> outcome;

  /**
  * Description: "Information on who recorded the adverse event.  May be the patient or a practitioner."
  */
  @javax.persistence.Basic
  @Column(name="\"recorder_id\"")
  private String recorder_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="recorder_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> recorder;

  /**
  * Description: "Parties that may or should contribute or have contributed information to the Act. Such information includes information leading to the decision to perform the Act and how to perform the Act (e.g. consultant), information that the Act itself seeks to reveal (e.g. informant of clinical history), or information about what Act was performed (e.g. informant witness)."
  */
  @javax.persistence.Basic
  @Column(name="\"eventparticipant_id\"")
  private String eventparticipant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="eventparticipant_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> eventParticipant;

  /**
  * Description: "Describes the adverse event in text."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Describes the entity that is suspected to have caused the adverse event."
  */
  @javax.persistence.Basic
  @Column(name="\"suspectentity_id\"")
  private String suspectentity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="suspectentity_id", insertable=false, updatable=false)
  private java.util.List<AdverseEventSuspectEntityModel> suspectEntity;

  /**
  * Description: "AdverseEvent.subjectMedicalHistory."
  */
  @javax.persistence.Basic
  @Column(name="\"subjectmedicalhistory_id\"")
  private String subjectmedicalhistory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subjectmedicalhistory_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subjectMedicalHistory;

  /**
  * Description: "AdverseEvent.referenceDocument."
  */
  @javax.persistence.Basic
  @Column(name="\"referencedocument_id\"")
  private String referencedocument_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="referencedocument_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> referenceDocument;

  /**
  * Description: "AdverseEvent.study."
  */
  @javax.persistence.Basic
  @Column(name="\"study_id\"")
  private String study_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="study_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> study;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public AdverseEventModel() {
  }

  public AdverseEventModel(AdverseEvent o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.category = o.getCategory();
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    this.date = o.getDate();
    if (null != o.getReaction() && !o.getReaction().isEmpty()) {
    	this.reaction_id = "reaction" + this.id;
    	this.reaction = ReferenceHelper.toModelFromArray(o.getReaction(), this.reaction_id);
    }
    if (null != o.getLocation() ) {
    	this.location_id = "location" + this.id;
    	this.location = ReferenceHelper.toModel(o.getLocation(), this.location_id);
    }
    if (null != o.getSeriousness() ) {
    	this.seriousness_id = "seriousness" + this.id;
    	this.seriousness = CodeableConceptHelper.toModel(o.getSeriousness(), this.seriousness_id);
    }
    if (null != o.getOutcome() ) {
    	this.outcome_id = "outcome" + this.id;
    	this.outcome = CodeableConceptHelper.toModel(o.getOutcome(), this.outcome_id);
    }
    if (null != o.getRecorder() ) {
    	this.recorder_id = "recorder" + this.id;
    	this.recorder = ReferenceHelper.toModel(o.getRecorder(), this.recorder_id);
    }
    if (null != o.getEventParticipant() ) {
    	this.eventparticipant_id = "eventparticipant" + this.id;
    	this.eventParticipant = ReferenceHelper.toModel(o.getEventParticipant(), this.eventparticipant_id);
    }
    this.description = o.getDescription();
    if (null != o.getSuspectEntity() && !o.getSuspectEntity().isEmpty()) {
    	this.suspectentity_id = "suspectentity" + this.id;
    	this.suspectEntity = AdverseEventSuspectEntityHelper.toModelFromArray(o.getSuspectEntity(), this.suspectentity_id);
    }
    if (null != o.getSubjectMedicalHistory() && !o.getSubjectMedicalHistory().isEmpty()) {
    	this.subjectmedicalhistory_id = "subjectmedicalhistory" + this.id;
    	this.subjectMedicalHistory = ReferenceHelper.toModelFromArray(o.getSubjectMedicalHistory(), this.subjectmedicalhistory_id);
    }
    if (null != o.getReferenceDocument() && !o.getReferenceDocument().isEmpty()) {
    	this.referencedocument_id = "referencedocument" + this.id;
    	this.referenceDocument = ReferenceHelper.toModelFromArray(o.getReferenceDocument(), this.referencedocument_id);
    }
    if (null != o.getStudy() && !o.getStudy().isEmpty()) {
    	this.study_id = "study" + this.id;
    	this.study = ReferenceHelper.toModelFromArray(o.getStudy(), this.study_id);
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
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public java.util.List<ReferenceModel> getReaction() {
    return this.reaction;
  }
  public void setReaction( java.util.List<ReferenceModel> value) {
    this.reaction = value;
  }
  public java.util.List<ReferenceModel> getLocation() {
    return this.location;
  }
  public void setLocation( java.util.List<ReferenceModel> value) {
    this.location = value;
  }
  public java.util.List<CodeableConceptModel> getSeriousness() {
    return this.seriousness;
  }
  public void setSeriousness( java.util.List<CodeableConceptModel> value) {
    this.seriousness = value;
  }
  public java.util.List<CodeableConceptModel> getOutcome() {
    return this.outcome;
  }
  public void setOutcome( java.util.List<CodeableConceptModel> value) {
    this.outcome = value;
  }
  public java.util.List<ReferenceModel> getRecorder() {
    return this.recorder;
  }
  public void setRecorder( java.util.List<ReferenceModel> value) {
    this.recorder = value;
  }
  public java.util.List<ReferenceModel> getEventParticipant() {
    return this.eventParticipant;
  }
  public void setEventParticipant( java.util.List<ReferenceModel> value) {
    this.eventParticipant = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<AdverseEventSuspectEntityModel> getSuspectEntity() {
    return this.suspectEntity;
  }
  public void setSuspectEntity( java.util.List<AdverseEventSuspectEntityModel> value) {
    this.suspectEntity = value;
  }
  public java.util.List<ReferenceModel> getSubjectMedicalHistory() {
    return this.subjectMedicalHistory;
  }
  public void setSubjectMedicalHistory( java.util.List<ReferenceModel> value) {
    this.subjectMedicalHistory = value;
  }
  public java.util.List<ReferenceModel> getReferenceDocument() {
    return this.referenceDocument;
  }
  public void setReferenceDocument( java.util.List<ReferenceModel> value) {
    this.referenceDocument = value;
  }
  public java.util.List<ReferenceModel> getStudy() {
    return this.study;
  }
  public void setStudy( java.util.List<ReferenceModel> value) {
    this.study = value;
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
    builder.append("[AdverseEventModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
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
    builder.append("[AdverseEventModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("reaction" + "->" + this.reaction + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("seriousness" + "->" + this.seriousness + "\n"); 
     builder.append("outcome" + "->" + this.outcome + "\n"); 
     builder.append("recorder" + "->" + this.recorder + "\n"); 
     builder.append("eventParticipant" + "->" + this.eventParticipant + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("suspectEntity" + "->" + this.suspectEntity + "\n"); 
     builder.append("subjectMedicalHistory" + "->" + this.subjectMedicalHistory + "\n"); 
     builder.append("referenceDocument" + "->" + this.referenceDocument + "\n"); 
     builder.append("study" + "->" + this.study + "\n"); 
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