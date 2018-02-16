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
import org.fhir.entity.AdverseEventModel;
import com.google.gson.GsonBuilder;

/**
* "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death."
*/
public class AdverseEvent  extends DomainResource  {
  /**
  * Description: "This is a AdverseEvent resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The identifier(s) of this adverse event that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itsefl is not appropriate."
  */
  protected Identifier identifier;

  /**
  * Description: "The type of event which is important to characterize what occurred and caused harm to the subject, or had the potential to cause harm to the subject."
  */
  protected String category;

  /**
  * Description: "Extensions for category"
  */
  protected transient Element _category;

  /**
  * Description: "This element defines the specific type of event that occurred or that was prevented from occurring."
  */
  protected CodeableConcept type;

  /**
  * Description: "This subject or group impacted by the event.  With a prospective adverse event, there will be no subject as the adverse event was prevented."
  */
  protected Reference subject;

  /**
  * Description: "The date (and perhaps time) when the adverse event occurred."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical)."
  */
  protected java.util.List<Reference> reaction = new java.util.ArrayList<>();

  /**
  * Description: "The information about where the adverse event occurred."
  */
  protected Reference location;

  /**
  * Description: "Describes the seriousness or severity of the adverse event."
  */
  protected CodeableConcept seriousness;

  /**
  * Description: "Describes the type of outcome from the adverse event."
  */
  protected CodeableConcept outcome;

  /**
  * Description: "Information on who recorded the adverse event.  May be the patient or a practitioner."
  */
  protected Reference recorder;

  /**
  * Description: "Parties that may or should contribute or have contributed information to the Act. Such information includes information leading to the decision to perform the Act and how to perform the Act (e.g. consultant), information that the Act itself seeks to reveal (e.g. informant of clinical history), or information about what Act was performed (e.g. informant witness)."
  */
  protected Reference eventParticipant;

  /**
  * Description: "Describes the adverse event in text."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Describes the entity that is suspected to have caused the adverse event."
  */
  protected java.util.List<AdverseEventSuspectEntity> suspectEntity = new java.util.ArrayList<>();

  /**
  * Description: "AdverseEvent.subjectMedicalHistory."
  */
  protected java.util.List<Reference> subjectMedicalHistory = new java.util.ArrayList<>();

  /**
  * Description: "AdverseEvent.referenceDocument."
  */
  protected java.util.List<Reference> referenceDocument = new java.util.ArrayList<>();

  /**
  * Description: "AdverseEvent.study."
  */
  protected java.util.List<Reference> study = new java.util.ArrayList<>();

  public AdverseEvent() {
  }

  public AdverseEvent(AdverseEventModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getCategory()) {
      this.category = o.getCategory();
    }
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getReaction() && !o.getReaction().isEmpty()) {
    	this.reaction = ReferenceHelper.fromArray2Array(o.getReaction());
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
      this.location = new Reference(o.getLocation().get(0));
    }
    this.seriousness = CodeableConceptHelper.fromJson(o.getSeriousness());
    this.outcome = CodeableConceptHelper.fromJson(o.getOutcome());
    if (null != o.getRecorder() && !o.getRecorder().isEmpty()) {
      this.recorder = new Reference(o.getRecorder().get(0));
    }
    if (null != o.getEventParticipant() && !o.getEventParticipant().isEmpty()) {
      this.eventParticipant = new Reference(o.getEventParticipant().get(0));
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getSuspectEntity() && !o.getSuspectEntity().isEmpty()) {
    	this.suspectEntity = AdverseEventSuspectEntityHelper.fromArray2Array(o.getSuspectEntity());
    }
    if (null != o.getSubjectMedicalHistory() && !o.getSubjectMedicalHistory().isEmpty()) {
    	this.subjectMedicalHistory = ReferenceHelper.fromArray2Array(o.getSubjectMedicalHistory());
    }
    if (null != o.getReferenceDocument() && !o.getReferenceDocument().isEmpty()) {
    	this.referenceDocument = ReferenceHelper.fromArray2Array(o.getReferenceDocument());
    }
    if (null != o.getStudy() && !o.getStudy().isEmpty()) {
    	this.study = ReferenceHelper.fromArray2Array(o.getStudy());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setCategory( String value) {
    this.category = CategoryEnum.fromCode(value);
  }
  public String getCategory() {
    return this.category;
  }
  public void set_category( Element value) {
    this._category = value;
  }
  public Element get_category() {
    return this._category;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setReaction( java.util.List<Reference> value) {
    this.reaction = value;
  }
  public java.util.List<Reference> getReaction() {
    return this.reaction;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setSeriousness( CodeableConcept value) {
    this.seriousness = value;
  }
  public CodeableConcept getSeriousness() {
    return this.seriousness;
  }
  public void setOutcome( CodeableConcept value) {
    this.outcome = value;
  }
  public CodeableConcept getOutcome() {
    return this.outcome;
  }
  public void setRecorder( Reference value) {
    this.recorder = value;
  }
  public Reference getRecorder() {
    return this.recorder;
  }
  public void setEventParticipant( Reference value) {
    this.eventParticipant = value;
  }
  public Reference getEventParticipant() {
    return this.eventParticipant;
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
  public void setSuspectEntity( java.util.List<AdverseEventSuspectEntity> value) {
    this.suspectEntity = value;
  }
  public java.util.List<AdverseEventSuspectEntity> getSuspectEntity() {
    return this.suspectEntity;
  }
  public void setSubjectMedicalHistory( java.util.List<Reference> value) {
    this.subjectMedicalHistory = value;
  }
  public java.util.List<Reference> getSubjectMedicalHistory() {
    return this.subjectMedicalHistory;
  }
  public void setReferenceDocument( java.util.List<Reference> value) {
    this.referenceDocument = value;
  }
  public java.util.List<Reference> getReferenceDocument() {
    return this.referenceDocument;
  }
  public void setStudy( java.util.List<Reference> value) {
    this.study = value;
  }
  public java.util.List<Reference> getStudy() {
    return this.study;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AdverseEvent]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this._category != null) builder.append("_category" + "->" + this._category.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.reaction != null) builder.append("reaction" + "->" + this.reaction.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.seriousness != null) builder.append("seriousness" + "->" + this.seriousness.toString() + "\n"); 
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this.recorder != null) builder.append("recorder" + "->" + this.recorder.toString() + "\n"); 
     if(this.eventParticipant != null) builder.append("eventParticipant" + "->" + this.eventParticipant.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.suspectEntity != null) builder.append("suspectEntity" + "->" + this.suspectEntity.toString() + "\n"); 
     if(this.subjectMedicalHistory != null) builder.append("subjectMedicalHistory" + "->" + this.subjectMedicalHistory.toString() + "\n"); 
     if(this.referenceDocument != null) builder.append("referenceDocument" + "->" + this.referenceDocument.toString() + "\n"); 
     if(this.study != null) builder.append("study" + "->" + this.study.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	AdverseEvent,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "AdverseEvent" : { return AdverseEvent.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum CategoryEnum {
  	AE,
  	PAE,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "AE" : { return AE.toString(); }
  			case "PAE" : { return PAE.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}