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
import org.fhir.entity.GoalModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
*/
public class Goal  {
  /**
  * Description: "This is a Goal resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Indicates whether the goal has been reached and is still considered relevant."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Indicates a category the goal falls within."
  */
  private java.util.List<CodeableConcept> category = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the mutually agreed level of importance associated with reaching/sustaining the goal."
  */
  private CodeableConcept priority;

  /**
  * Description: "Human-readable and/or coded description of a specific desired objective of care, such as \"control blood pressure\" or \"negotiate an obstacle course\" or \"dance with child at wedding\"."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept description;

  /**
  * Description: "Identifies the patient, group or organization for whom the goal is being established."
  */
  private Reference subject;

  /**
  * Description: "The date or event after which the goal should begin being pursued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String startDate;

  /**
  * Description: "Extensions for startDate"
  */
  private transient Element _startDate;

  /**
  * Description: "The date or event after which the goal should begin being pursued."
  */
  private CodeableConcept startCodeableConcept;

  /**
  * Description: "Indicates what should be done by when."
  */
  private GoalTarget target;

  /**
  * Description: "Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String statusDate;

  /**
  * Description: "Extensions for statusDate"
  */
  private transient Element _statusDate;

  /**
  * Description: "Captures the reason for the current status."
  */
  private String statusReason;

  /**
  * Description: "Extensions for statusReason"
  */
  private transient Element _statusReason;

  /**
  * Description: "Indicates whose goal this is - patient goal, practitioner goal, etc."
  */
  private Reference expressedBy;

  /**
  * Description: "The identified conditions and other health record elements that are intended to be addressed by the goal."
  */
  private java.util.List<Reference> addresses = new java.util.ArrayList<>();

  /**
  * Description: "Any comments related to the goal."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the change (or lack of change) at the point when the status of the goal is assessed."
  */
  private java.util.List<CodeableConcept> outcomeCode = new java.util.ArrayList<>();

  /**
  * Description: "Details of what's changed (or not changed)."
  */
  private java.util.List<Reference> outcomeReference = new java.util.ArrayList<>();

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

  public Goal() {
  }

  public Goal(GoalModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    this.priority = CodeableConceptHelper.fromJson(o.getPriority());
    this.description = CodeableConceptHelper.fromJson(o.getDescription());
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getStartDate()) {
      this.startDate = o.getStartDate();
    }
    this.startCodeableConcept = CodeableConceptHelper.fromJson(o.getStartCodeableConcept());
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
      this.target = new GoalTarget(o.getTarget().get(0));
    }
    if (null != o.getStatusDate()) {
      this.statusDate = o.getStatusDate();
    }
    if (null != o.getStatusReason()) {
      this.statusReason = o.getStatusReason();
    }
    if (null != o.getExpressedBy() && !o.getExpressedBy().isEmpty()) {
      this.expressedBy = new Reference(o.getExpressedBy().get(0));
    }
    if (null != o.getAddresses() && !o.getAddresses().isEmpty()) {
    	this.addresses = ReferenceHelper.fromArray2Array(o.getAddresses());
    }
    if (null != o.getOutcomeReference() && !o.getOutcomeReference().isEmpty()) {
    	this.outcomeReference = ReferenceHelper.fromArray2Array(o.getOutcomeReference());
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
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
  }
  public void setPriority( CodeableConcept value) {
    this.priority = value;
  }
  public CodeableConcept getPriority() {
    return this.priority;
  }
  public void setDescription( CodeableConcept value) {
    this.description = value;
  }
  public CodeableConcept getDescription() {
    return this.description;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setStartDate( String value) {
    this.startDate = value;
  }
  public String getStartDate() {
    return this.startDate;
  }
  public void set_startDate( Element value) {
    this._startDate = value;
  }
  public Element get_startDate() {
    return this._startDate;
  }
  public void setStartCodeableConcept( CodeableConcept value) {
    this.startCodeableConcept = value;
  }
  public CodeableConcept getStartCodeableConcept() {
    return this.startCodeableConcept;
  }
  public void setTarget( GoalTarget value) {
    this.target = value;
  }
  public GoalTarget getTarget() {
    return this.target;
  }
  public void setStatusDate( String value) {
    this.statusDate = value;
  }
  public String getStatusDate() {
    return this.statusDate;
  }
  public void set_statusDate( Element value) {
    this._statusDate = value;
  }
  public Element get_statusDate() {
    return this._statusDate;
  }
  public void setStatusReason( String value) {
    this.statusReason = value;
  }
  public String getStatusReason() {
    return this.statusReason;
  }
  public void set_statusReason( Element value) {
    this._statusReason = value;
  }
  public Element get_statusReason() {
    return this._statusReason;
  }
  public void setExpressedBy( Reference value) {
    this.expressedBy = value;
  }
  public Reference getExpressedBy() {
    return this.expressedBy;
  }
  public void setAddresses( java.util.List<Reference> value) {
    this.addresses = value;
  }
  public java.util.List<Reference> getAddresses() {
    return this.addresses;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setOutcomeCode( java.util.List<CodeableConcept> value) {
    this.outcomeCode = value;
  }
  public java.util.List<CodeableConcept> getOutcomeCode() {
    return this.outcomeCode;
  }
  public void setOutcomeReference( java.util.List<Reference> value) {
    this.outcomeReference = value;
  }
  public java.util.List<Reference> getOutcomeReference() {
    return this.outcomeReference;
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
    builder.append("[Goal]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.startDate != null) builder.append("startDate" + "->" + this.startDate.toString() + "\n"); 
     if(this._startDate != null) builder.append("_startDate" + "->" + this._startDate.toString() + "\n"); 
     if(this.startCodeableConcept != null) builder.append("startCodeableConcept" + "->" + this.startCodeableConcept.toString() + "\n"); 
     if(this.target != null) builder.append("target" + "->" + this.target.toString() + "\n"); 
     if(this.statusDate != null) builder.append("statusDate" + "->" + this.statusDate.toString() + "\n"); 
     if(this._statusDate != null) builder.append("_statusDate" + "->" + this._statusDate.toString() + "\n"); 
     if(this.statusReason != null) builder.append("statusReason" + "->" + this.statusReason.toString() + "\n"); 
     if(this._statusReason != null) builder.append("_statusReason" + "->" + this._statusReason.toString() + "\n"); 
     if(this.expressedBy != null) builder.append("expressedBy" + "->" + this.expressedBy.toString() + "\n"); 
     if(this.addresses != null) builder.append("addresses" + "->" + this.addresses.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.outcomeCode != null) builder.append("outcomeCode" + "->" + this.outcomeCode.toString() + "\n"); 
     if(this.outcomeReference != null) builder.append("outcomeReference" + "->" + this.outcomeReference.toString() + "\n"); 
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
  	Goal,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Goal" : { return Goal.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	proposed,
  	accepted,
  	planned,
  	inprogress,
  	ontarget,
  	aheadoftarget,
  	behindtarget,
  	sustaining,
  	achieved,
  	onhold,
  	cancelled,
  	enteredinerror,
  	rejected,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "proposed" : { return proposed.toString(); }
  			case "accepted" : { return accepted.toString(); }
  			case "planned" : { return planned.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "ontarget" : { return ontarget.toString(); }
  			case "aheadoftarget" : { return aheadoftarget.toString(); }
  			case "behindtarget" : { return behindtarget.toString(); }
  			case "sustaining" : { return sustaining.toString(); }
  			case "achieved" : { return achieved.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "rejected" : { return rejected.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}