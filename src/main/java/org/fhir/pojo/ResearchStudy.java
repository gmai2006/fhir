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
import org.fhir.entity.ResearchStudyModel;
import com.google.gson.GsonBuilder;

/**
* "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
*/
public class ResearchStudy  {
  /**
  * Description: "This is a ResearchStudy resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this research study by the sponsor or other systems."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A short, descriptive user-friendly label for the study."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "The set of steps expected to be performed as part of the execution of the study."
  */
  private java.util.List<Reference> protocol = new java.util.ArrayList<>();

  /**
  * Description: "A larger research study of which this particular study is a component or step."
  */
  private java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "The current state of the study."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc."
  */
  private java.util.List<CodeableConcept> category = new java.util.ArrayList<>();

  /**
  * Description: "The condition(s), medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about."
  */
  private java.util.List<CodeableConcept> focus = new java.util.ArrayList<>();

  /**
  * Description: "Contact details to assist a user in learning more about or engaging with the study."
  */
  private java.util.List<ContactDetail> contact = new java.util.ArrayList<>();

  /**
  * Description: "Citations, references and other related documents."
  */
  private java.util.List<RelatedArtifact> relatedArtifact = new java.util.ArrayList<>();

  /**
  * Description: "Key terms to aid in searching for or filtering the study."
  */
  private java.util.List<CodeableConcept> keyword = new java.util.ArrayList<>();

  /**
  * Description: "Indicates a country, state or other region where the study is taking place."
  */
  private java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "A full description of how the study is being conducted."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. \" 200 female Europeans between the ages of 20 and 45 with early onset diabetes\"."
  */
  private java.util.List<Reference> enrollment = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the start date and the expected (or actual, depending on status) end date for the study."
  */
  private Period period;

  /**
  * Description: "The organization responsible for the execution of the study."
  */
  private Reference sponsor;

  /**
  * Description: "Indicates the individual who has primary oversite of the execution of the study."
  */
  private Reference principalInvestigator;

  /**
  * Description: "Clinic, hospital or other healthcare location that is participating in the study."
  */
  private java.util.List<Reference> site = new java.util.ArrayList<>();

  /**
  * Description: "A description and/or code explaining the premature termination of the study."
  */
  private CodeableConcept reasonStopped;

  /**
  * Description: "Comments made about the event by the performer, subject or other participants."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up."
  */
  private java.util.List<ResearchStudyArm> arm = new java.util.ArrayList<>();

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

  public ResearchStudy() {
  }

  public ResearchStudy(ResearchStudyModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getTitle()) {
        this.title = new String(o.getTitle());
      }

      this.protocol = Reference.fromArray(o.getProtocol());

      this.partOf = Reference.fromArray(o.getPartOf());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.category = CodeableConcept.fromArray(o.getCategory());
      this.focus = CodeableConcept.fromArray(o.getFocus());
      this.contact = ContactDetail.fromArray(o.getContact());

      this.relatedArtifact = RelatedArtifact.fromArray(o.getRelatedArtifact());

      this.keyword = CodeableConcept.fromArray(o.getKeyword());
      this.jurisdiction = CodeableConcept.fromArray(o.getJurisdiction());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.enrollment = Reference.fromArray(o.getEnrollment());

      this.period = Period.fromJson(o.getPeriod());
      if (null != o.getSponsor()) {
        this.sponsor = new Reference(o.getSponsor());
        this.sponsor.setId(this.getId());
      }

      if (null != o.getPrincipalInvestigator()) {
        this.principalInvestigator = new Reference(o.getPrincipalInvestigator());
        this.principalInvestigator.setId(this.getId());
      }

      this.site = Reference.fromArray(o.getSite());

      this.reasonStopped = CodeableConcept.fromJson(o.getReasonStopped());
      this.note = Annotation.fromArray(o.getNote());
      this.arm = ResearchStudyArm.fromArray(o.getArm());

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
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void set_title( Element value) {
    this._title = value;
  }
  public Element get_title() {
    return this._title;
  }
  public void setProtocol( java.util.List<Reference> value) {
    this.protocol = value;
  }
  public java.util.List<Reference> getProtocol() {
    return this.protocol;
  }
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
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
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
  }
  public void setFocus( java.util.List<CodeableConcept> value) {
    this.focus = value;
  }
  public java.util.List<CodeableConcept> getFocus() {
    return this.focus;
  }
  public void setContact( java.util.List<ContactDetail> value) {
    this.contact = value;
  }
  public java.util.List<ContactDetail> getContact() {
    return this.contact;
  }
  public void setRelatedArtifact( java.util.List<RelatedArtifact> value) {
    this.relatedArtifact = value;
  }
  public java.util.List<RelatedArtifact> getRelatedArtifact() {
    return this.relatedArtifact;
  }
  public void setKeyword( java.util.List<CodeableConcept> value) {
    this.keyword = value;
  }
  public java.util.List<CodeableConcept> getKeyword() {
    return this.keyword;
  }
  public void setJurisdiction( java.util.List<CodeableConcept> value) {
    this.jurisdiction = value;
  }
  public java.util.List<CodeableConcept> getJurisdiction() {
    return this.jurisdiction;
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
  public void setEnrollment( java.util.List<Reference> value) {
    this.enrollment = value;
  }
  public java.util.List<Reference> getEnrollment() {
    return this.enrollment;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setSponsor( Reference value) {
    this.sponsor = value;
  }
  public Reference getSponsor() {
    return this.sponsor;
  }
  public void setPrincipalInvestigator( Reference value) {
    this.principalInvestigator = value;
  }
  public Reference getPrincipalInvestigator() {
    return this.principalInvestigator;
  }
  public void setSite( java.util.List<Reference> value) {
    this.site = value;
  }
  public java.util.List<Reference> getSite() {
    return this.site;
  }
  public void setReasonStopped( CodeableConcept value) {
    this.reasonStopped = value;
  }
  public CodeableConcept getReasonStopped() {
    return this.reasonStopped;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setArm( java.util.List<ResearchStudyArm> value) {
    this.arm = value;
  }
  public java.util.List<ResearchStudyArm> getArm() {
    return this.arm;
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
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("protocol" + "[" + String.valueOf(this.protocol) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("focus" + "[" + String.valueOf(this.focus) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("relatedArtifact" + "[" + String.valueOf(this.relatedArtifact) + "]\n"); 
     builder.append("keyword" + "[" + String.valueOf(this.keyword) + "]\n"); 
     builder.append("jurisdiction" + "[" + String.valueOf(this.jurisdiction) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("enrollment" + "[" + String.valueOf(this.enrollment) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("sponsor" + "[" + String.valueOf(this.sponsor) + "]\n"); 
     builder.append("principalInvestigator" + "[" + String.valueOf(this.principalInvestigator) + "]\n"); 
     builder.append("site" + "[" + String.valueOf(this.site) + "]\n"); 
     builder.append("reasonStopped" + "[" + String.valueOf(this.reasonStopped) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("arm" + "[" + String.valueOf(this.arm) + "]\n"); 
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
  	ResearchStudy,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ResearchStudy" : { return ResearchStudy.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	draft,
  	inprogress,
  	suspended,
  	stopped,
  	completed,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ResearchStudy> fromArray(java.util.List<ResearchStudyModel> list) {
    return (java.util.List<ResearchStudy>)list.stream()
      .map(model -> new ResearchStudy(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ResearchStudyModel> toModelArray(java.util.List<ResearchStudy> list) {
    return (java.util.List<ResearchStudyModel>)list.stream()
      .map(model -> new ResearchStudyModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ResearchStudy fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ResearchStudy.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ResearchStudy o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ResearchStudy> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}