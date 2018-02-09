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
public class AdverseEvent  {
  /**
  * Description: "This is a AdverseEvent resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The identifier(s) of this adverse event that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itsefl is not appropriate."
  */
  private Identifier identifier;

  /**
  * Description: "The type of event which is important to characterize what occurred and caused harm to the subject, or had the potential to cause harm to the subject."
  */
  private String category;

  /**
  * Description: "Extensions for category"
  */
  private transient Element _category;

  /**
  * Description: "This element defines the specific type of event that occurred or that was prevented from occurring."
  */
  private CodeableConcept type;

  /**
  * Description: "This subject or group impacted by the event.  With a prospective adverse event, there will be no subject as the adverse event was prevented."
  */
  private Reference subject;

  /**
  * Description: "The date (and perhaps time) when the adverse event occurred."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical)."
  */
  private java.util.List<Reference> reaction = new java.util.ArrayList<>();

  /**
  * Description: "The information about where the adverse event occurred."
  */
  private Reference location;

  /**
  * Description: "Describes the seriousness or severity of the adverse event."
  */
  private CodeableConcept seriousness;

  /**
  * Description: "Describes the type of outcome from the adverse event."
  */
  private CodeableConcept outcome;

  /**
  * Description: "Information on who recorded the adverse event.  May be the patient or a practitioner."
  */
  private Reference recorder;

  /**
  * Description: "Parties that may or should contribute or have contributed information to the Act. Such information includes information leading to the decision to perform the Act and how to perform the Act (e.g. consultant), information that the Act itself seeks to reveal (e.g. informant of clinical history), or information about what Act was performed (e.g. informant witness)."
  */
  private Reference eventParticipant;

  /**
  * Description: "Describes the adverse event in text."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Describes the entity that is suspected to have caused the adverse event."
  */
  private java.util.List<AdverseEventSuspectEntity> suspectEntity = new java.util.ArrayList<>();

  /**
  * Description: "AdverseEvent.subjectMedicalHistory."
  */
  private java.util.List<Reference> subjectMedicalHistory = new java.util.ArrayList<>();

  /**
  * Description: "AdverseEvent.referenceDocument."
  */
  private java.util.List<Reference> referenceDocument = new java.util.ArrayList<>();

  /**
  * Description: "AdverseEvent.study."
  */
  private java.util.List<Reference> study = new java.util.ArrayList<>();

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

  public AdverseEvent() {
  }

  public AdverseEvent(AdverseEventModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getCategory()) {
        this.category = new String(o.getCategory());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      this.reaction = Reference.fromArray(o.getReaction());

      if (null != o.getLocation()) {
        this.location = new Reference(o.getLocation());
        this.location.setId(this.getId());
      }

      this.seriousness = CodeableConcept.fromJson(o.getSeriousness());
      this.outcome = CodeableConcept.fromJson(o.getOutcome());
      if (null != o.getRecorder()) {
        this.recorder = new Reference(o.getRecorder());
        this.recorder.setId(this.getId());
      }

      if (null != o.getEventParticipant()) {
        this.eventParticipant = new Reference(o.getEventParticipant());
        this.eventParticipant.setId(this.getId());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.suspectEntity = AdverseEventSuspectEntity.fromArray(o.getSuspectEntity());

      this.subjectMedicalHistory = Reference.fromArray(o.getSubjectMedicalHistory());

      this.referenceDocument = Reference.fromArray(o.getReferenceDocument());

      this.study = Reference.fromArray(o.getStudy());

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
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("_category" + "[" + String.valueOf(this._category) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("reaction" + "[" + String.valueOf(this.reaction) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("seriousness" + "[" + String.valueOf(this.seriousness) + "]\n"); 
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("recorder" + "[" + String.valueOf(this.recorder) + "]\n"); 
     builder.append("eventParticipant" + "[" + String.valueOf(this.eventParticipant) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("suspectEntity" + "[" + String.valueOf(this.suspectEntity) + "]\n"); 
     builder.append("subjectMedicalHistory" + "[" + String.valueOf(this.subjectMedicalHistory) + "]\n"); 
     builder.append("referenceDocument" + "[" + String.valueOf(this.referenceDocument) + "]\n"); 
     builder.append("study" + "[" + String.valueOf(this.study) + "]\n"); 
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

  public static java.util.List<AdverseEvent> fromArray(java.util.List<AdverseEventModel> list) {
    return (java.util.List<AdverseEvent>)list.stream()
      .map(model -> new AdverseEvent(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AdverseEventModel> toModelArray(java.util.List<AdverseEvent> list) {
    return (java.util.List<AdverseEventModel>)list.stream()
      .map(model -> new AdverseEventModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static AdverseEvent fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, AdverseEvent.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(AdverseEvent o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<AdverseEvent> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}