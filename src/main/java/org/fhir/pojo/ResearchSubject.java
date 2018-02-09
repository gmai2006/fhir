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
import org.fhir.entity.ResearchSubjectModel;
import com.google.gson.GsonBuilder;

/**
* "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
*/
public class ResearchSubject  {
  /**
  * Description: "This is a ResearchSubject resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this research study by the sponsor or other systems."
  */
  private Identifier identifier;

  /**
  * Description: "The current state of the subject."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The dates the subject began and ended their participation in the study."
  */
  private Period period;

  /**
  * Description: "Reference to the study the subject is participating in."
  */
  @javax.validation.constraints.NotNull
  private Reference study;

  /**
  * Description: "The record of the person or animal who is involved in the study."
  */
  @javax.validation.constraints.NotNull
  private Reference individual;

  /**
  * Description: "The name of the arm in the study the subject is expected to follow as part of this study."
  */
  private String assignedArm;

  /**
  * Description: "Extensions for assignedArm"
  */
  private transient Element _assignedArm;

  /**
  * Description: "The name of the arm in the study the subject actually followed as part of this study."
  */
  private String actualArm;

  /**
  * Description: "Extensions for actualArm"
  */
  private transient Element _actualArm;

  /**
  * Description: "A record of the patient's informed agreement to participate in the study."
  */
  private Reference consent;

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

  public ResearchSubject() {
  }

  public ResearchSubject(ResearchSubjectModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.period = Period.fromJson(o.getPeriod());
      if (null != o.getStudy()) {
        this.study = new Reference(o.getStudy());
        this.study.setId(this.getId());
      }

      if (null != o.getIndividual()) {
        this.individual = new Reference(o.getIndividual());
        this.individual.setId(this.getId());
      }

      if (null != o.getAssignedArm()) {
        this.assignedArm = new String(o.getAssignedArm());
      }

      if (null != o.getActualArm()) {
        this.actualArm = new String(o.getActualArm());
      }

      if (null != o.getConsent()) {
        this.consent = new Reference(o.getConsent());
        this.consent.setId(this.getId());
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
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
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
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setStudy( Reference value) {
    this.study = value;
  }
  public Reference getStudy() {
    return this.study;
  }
  public void setIndividual( Reference value) {
    this.individual = value;
  }
  public Reference getIndividual() {
    return this.individual;
  }
  public void setAssignedArm( String value) {
    this.assignedArm = value;
  }
  public String getAssignedArm() {
    return this.assignedArm;
  }
  public void set_assignedArm( Element value) {
    this._assignedArm = value;
  }
  public Element get_assignedArm() {
    return this._assignedArm;
  }
  public void setActualArm( String value) {
    this.actualArm = value;
  }
  public String getActualArm() {
    return this.actualArm;
  }
  public void set_actualArm( Element value) {
    this._actualArm = value;
  }
  public Element get_actualArm() {
    return this._actualArm;
  }
  public void setConsent( Reference value) {
    this.consent = value;
  }
  public Reference getConsent() {
    return this.consent;
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
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("study" + "[" + String.valueOf(this.study) + "]\n"); 
     builder.append("individual" + "[" + String.valueOf(this.individual) + "]\n"); 
     builder.append("assignedArm" + "[" + String.valueOf(this.assignedArm) + "]\n"); 
     builder.append("_assignedArm" + "[" + String.valueOf(this._assignedArm) + "]\n"); 
     builder.append("actualArm" + "[" + String.valueOf(this.actualArm) + "]\n"); 
     builder.append("_actualArm" + "[" + String.valueOf(this._actualArm) + "]\n"); 
     builder.append("consent" + "[" + String.valueOf(this.consent) + "]\n"); 
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
  	ResearchSubject,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ResearchSubject" : { return ResearchSubject.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	candidate,
  	enrolled,
  	active,
  	suspended,
  	withdrawn,
  	completed,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "candidate" : { return candidate.toString(); }
  			case "enrolled" : { return enrolled.toString(); }
  			case "active" : { return active.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "withdrawn" : { return withdrawn.toString(); }
  			case "completed" : { return completed.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ResearchSubject> fromArray(java.util.List<ResearchSubjectModel> list) {
    return (java.util.List<ResearchSubject>)list.stream()
      .map(model -> new ResearchSubject(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ResearchSubjectModel> toModelArray(java.util.List<ResearchSubject> list) {
    return (java.util.List<ResearchSubjectModel>)list.stream()
      .map(model -> new ResearchSubjectModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ResearchSubject fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ResearchSubject.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ResearchSubject o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ResearchSubject> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}