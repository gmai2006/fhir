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
import org.fhir.entity.CarePlanModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
*/
public class CarePlan  {
  /**
  * Description: "This is a CarePlan resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the protocol, questionnaire, guideline or other specification the care plan should be conducted in accordance with."
  */
  private java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "A care plan that is fulfilled in whole or in part by this care plan."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "Completed or terminated care plan whose function is taken by this new care plan."
  */
  private java.util.List<Reference> replaces = new java.util.ArrayList<>();

  /**
  * Description: "A larger care plan of which this particular care plan is a component or step."
  */
  private java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain."
  */
  private String intent;

  /**
  * Description: "Extensions for intent"
  */
  private transient Element _intent;

  /**
  * Description: "Identifies what \"kind\" of plan this is to support differentiation between multiple co-existing plans; e.g. \"Home health\", \"psychiatric\", \"asthma\", \"disease management\", \"wellness plan\", etc."
  */
  private java.util.List<CodeableConcept> category = new java.util.ArrayList<>();

  /**
  * Description: "Human-friendly name for the CarePlan."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "A description of the scope and nature of the plan."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Identifies the patient or group whose intended care is described by the plan."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "Identifies the original context in which this particular CarePlan was created."
  */
  private Reference context;

  /**
  * Description: "Indicates when the plan did (or is intended to) come into effect and end."
  */
  private Period period;

  /**
  * Description: "Identifies the individual(s) or ogranization who is responsible for the content of the care plan."
  */
  private java.util.List<Reference> author = new java.util.ArrayList<>();

  /**
  * Description: "Identifies all people and organizations who are expected to be involved in the care envisioned by this plan."
  */
  private java.util.List<Reference> careTeam = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan."
  */
  private java.util.List<Reference> addresses = new java.util.ArrayList<>();

  /**
  * Description: "Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc."
  */
  private java.util.List<Reference> supportingInfo = new java.util.ArrayList<>();

  /**
  * Description: "Describes the intended objective(s) of carrying out the care plan."
  */
  private java.util.List<Reference> goal = new java.util.ArrayList<>();

  /**
  * Description: "Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc."
  */
  private java.util.List<CarePlanActivity> activity = new java.util.ArrayList<>();

  /**
  * Description: "General notes about the care plan not covered elsewhere."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

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

  public CarePlan() {
  }

  public CarePlan(CarePlanModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.definition = Reference.fromArray(o.getDefinition());

      this.basedOn = Reference.fromArray(o.getBasedOn());

      this.replaces = Reference.fromArray(o.getReplaces());

      this.partOf = Reference.fromArray(o.getPartOf());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getIntent()) {
        this.intent = new String(o.getIntent());
      }

      this.category = CodeableConcept.fromArray(o.getCategory());
      if (null != o.getTitle()) {
        this.title = new String(o.getTitle());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.author = Reference.fromArray(o.getAuthor());

      this.careTeam = Reference.fromArray(o.getCareTeam());

      this.addresses = Reference.fromArray(o.getAddresses());

      this.supportingInfo = Reference.fromArray(o.getSupportingInfo());

      this.goal = Reference.fromArray(o.getGoal());

      this.activity = CarePlanActivity.fromArray(o.getActivity());

      this.note = Annotation.fromArray(o.getNote());
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
  public void setDefinition( java.util.List<Reference> value) {
    this.definition = value;
  }
  public java.util.List<Reference> getDefinition() {
    return this.definition;
  }
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setReplaces( java.util.List<Reference> value) {
    this.replaces = value;
  }
  public java.util.List<Reference> getReplaces() {
    return this.replaces;
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
  public void setIntent( String value) {
    this.intent = IntentEnum.fromCode(value);
  }
  public String getIntent() {
    return this.intent;
  }
  public void set_intent( Element value) {
    this._intent = value;
  }
  public Element get_intent() {
    return this._intent;
  }
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
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
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setAuthor( java.util.List<Reference> value) {
    this.author = value;
  }
  public java.util.List<Reference> getAuthor() {
    return this.author;
  }
  public void setCareTeam( java.util.List<Reference> value) {
    this.careTeam = value;
  }
  public java.util.List<Reference> getCareTeam() {
    return this.careTeam;
  }
  public void setAddresses( java.util.List<Reference> value) {
    this.addresses = value;
  }
  public java.util.List<Reference> getAddresses() {
    return this.addresses;
  }
  public void setSupportingInfo( java.util.List<Reference> value) {
    this.supportingInfo = value;
  }
  public java.util.List<Reference> getSupportingInfo() {
    return this.supportingInfo;
  }
  public void setGoal( java.util.List<Reference> value) {
    this.goal = value;
  }
  public java.util.List<Reference> getGoal() {
    return this.goal;
  }
  public void setActivity( java.util.List<CarePlanActivity> value) {
    this.activity = value;
  }
  public java.util.List<CarePlanActivity> getActivity() {
    return this.activity;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
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
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("replaces" + "[" + String.valueOf(this.replaces) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("_intent" + "[" + String.valueOf(this._intent) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("author" + "[" + String.valueOf(this.author) + "]\n"); 
     builder.append("careTeam" + "[" + String.valueOf(this.careTeam) + "]\n"); 
     builder.append("addresses" + "[" + String.valueOf(this.addresses) + "]\n"); 
     builder.append("supportingInfo" + "[" + String.valueOf(this.supportingInfo) + "]\n"); 
     builder.append("goal" + "[" + String.valueOf(this.goal) + "]\n"); 
     builder.append("activity" + "[" + String.valueOf(this.activity) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
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
  	CarePlan,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "CarePlan" : { return CarePlan.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	draft,
  	active,
  	suspended,
  	completed,
  	enteredinerror,
  	cancelled,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "active" : { return active.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum IntentEnum {
  	proposal,
  	plan,
  	order,
  	option,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "proposal" : { return proposal.toString(); }
  			case "plan" : { return plan.toString(); }
  			case "order" : { return order.toString(); }
  			case "option" : { return option.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<CarePlan> fromArray(java.util.List<CarePlanModel> list) {
    return (java.util.List<CarePlan>)list.stream()
      .map(model -> new CarePlan(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CarePlanModel> toModelArray(java.util.List<CarePlan> list) {
    return (java.util.List<CarePlanModel>)list.stream()
      .map(model -> new CarePlanModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CarePlan fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CarePlan.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CarePlan o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CarePlan> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}