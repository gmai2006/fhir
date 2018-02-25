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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CarePlan  extends DomainResource  {
  /**
  * Description: "This is a CarePlan resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Identifies the protocol, questionnaire, guideline or other specification the care plan should be conducted in accordance with."
  */
  protected java.util.List<Reference> definition;

  /**
  * Description: "A care plan that is fulfilled in whole or in part by this care plan."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "Completed or terminated care plan whose function is taken by this new care plan."
  */
  protected java.util.List<Reference> replaces;

  /**
  * Description: "A larger care plan of which this particular care plan is a component or step."
  */
  protected java.util.List<Reference> partOf;

  /**
  * Description: "Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain."
  */
  protected String intent;

  /**
  * Description: "Extensions for intent"
  */
  protected transient Element _intent;

  /**
  * Description: "Identifies what \"kind\" of plan this is to support differentiation between multiple co-existing plans; e.g. \"Home health\", \"psychiatric\", \"asthma\", \"disease management\", \"wellness plan\", etc."
  */
  protected java.util.List<CodeableConcept> category;

  /**
  * Description: "Human-friendly name for the CarePlan."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "A description of the scope and nature of the plan."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Identifies the patient or group whose intended care is described by the plan."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "Identifies the original context in which this particular CarePlan was created."
  */
  protected Reference context;

  /**
  * Description: "Indicates when the plan did (or is intended to) come into effect and end."
  */
  protected Period period;

  /**
  * Description: "Identifies the individual(s) or ogranization who is responsible for the content of the care plan."
  */
  protected java.util.List<Reference> author;

  /**
  * Description: "Identifies all people and organizations who are expected to be involved in the care envisioned by this plan."
  */
  protected java.util.List<Reference> careTeam;

  /**
  * Description: "Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan."
  */
  protected java.util.List<Reference> addresses;

  /**
  * Description: "Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc."
  */
  protected java.util.List<Reference> supportingInfo;

  /**
  * Description: "Describes the intended objective(s) of carrying out the care plan."
  */
  protected java.util.List<Reference> goal;

  /**
  * Description: "Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc."
  */
  protected java.util.List<CarePlanActivity> activity;

  /**
  * Description: "General notes about the care plan not covered elsewhere."
  */
  protected java.util.List<Annotation> note;

  public CarePlan() {
  }

  public CarePlan(CarePlanModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition = ReferenceHelper.fromArray2Array(o.getDefinition());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getReplaces() && !o.getReplaces().isEmpty()) {
    	this.replaces = ReferenceHelper.fromArray2Array(o.getReplaces());
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partOf = ReferenceHelper.fromArray2Array(o.getPartOf());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getIntent()) {
      this.intent = o.getIntent();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category = CodeableConceptHelper.fromArray2Array(o.getCategory());
    }
    if (null != o.getTitle()) {
      this.title = o.getTitle();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
    	this.author = ReferenceHelper.fromArray2Array(o.getAuthor());
    }
    if (null != o.getCareTeam() && !o.getCareTeam().isEmpty()) {
    	this.careTeam = ReferenceHelper.fromArray2Array(o.getCareTeam());
    }
    if (null != o.getAddresses() && !o.getAddresses().isEmpty()) {
    	this.addresses = ReferenceHelper.fromArray2Array(o.getAddresses());
    }
    if (null != o.getSupportingInfo() && !o.getSupportingInfo().isEmpty()) {
    	this.supportingInfo = ReferenceHelper.fromArray2Array(o.getSupportingInfo());
    }
    if (null != o.getGoal() && !o.getGoal().isEmpty()) {
    	this.goal = ReferenceHelper.fromArray2Array(o.getGoal());
    }
    if (null != o.getActivity() && !o.getActivity().isEmpty()) {
    	this.activity = CarePlanActivityHelper.fromArray2Array(o.getActivity());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CarePlan]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.replaces != null) builder.append("replaces" + "->" + this.replaces.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.intent != null) builder.append("intent" + "->" + this.intent.toString() + "\n"); 
     if(this._intent != null) builder.append("_intent" + "->" + this._intent.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.author != null) builder.append("author" + "->" + this.author.toString() + "\n"); 
     if(this.careTeam != null) builder.append("careTeam" + "->" + this.careTeam.toString() + "\n"); 
     if(this.addresses != null) builder.append("addresses" + "->" + this.addresses.toString() + "\n"); 
     if(this.supportingInfo != null) builder.append("supportingInfo" + "->" + this.supportingInfo.toString() + "\n"); 
     if(this.goal != null) builder.append("goal" + "->" + this.goal.toString() + "\n"); 
     if(this.activity != null) builder.append("activity" + "->" + this.activity.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); ;
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

}