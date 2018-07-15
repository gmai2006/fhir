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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Goal  extends DomainResource  {
  /**
  * Description: "This is a Goal resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Indicates whether the goal has been reached and is still considered relevant."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Indicates a category the goal falls within."
  */
  protected java.util.List<CodeableConcept> category;

  /**
  * Description: "Identifies the mutually agreed level of importance associated with reaching/sustaining the goal."
  */
  protected CodeableConcept priority;

  /**
  * Description: "Human-readable and/or coded description of a specific desired objective of care, such as \"control blood pressure\" or \"negotiate an obstacle course\" or \"dance with child at wedding\"."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept description;

  /**
  * Description: "Identifies the patient, group or organization for whom the goal is being established."
  */
  protected Reference subject;

  /**
  * Description: "The date or event after which the goal should begin being pursued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String startDate;

  /**
  * Description: "Extensions for startDate"
  */
  protected transient Element _startDate;

  /**
  * Description: "The date or event after which the goal should begin being pursued."
  */
  protected CodeableConcept startCodeableConcept;

  /**
  * Description: "Indicates what should be done by when."
  */
  protected GoalTarget target;

  /**
  * Description: "Identifies when the current status.  I.e. When initially created, when achieved, when cancelled, etc."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String statusDate;

  /**
  * Description: "Extensions for statusDate"
  */
  protected transient Element _statusDate;

  /**
  * Description: "Captures the reason for the current status."
  */
  protected String statusReason;

  /**
  * Description: "Extensions for statusReason"
  */
  protected transient Element _statusReason;

  /**
  * Description: "Indicates whose goal this is - patient goal, practitioner goal, etc."
  */
  protected Reference expressedBy;

  /**
  * Description: "The identified conditions and other health record elements that are intended to be addressed by the goal."
  */
  protected java.util.List<Reference> addresses;

  /**
  * Description: "Any comments related to the goal."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Identifies the change (or lack of change) at the point when the status of the goal is assessed."
  */
  protected java.util.List<CodeableConcept> outcomeCode;

  /**
  * Description: "Details of what's changed (or not changed)."
  */
  protected java.util.List<Reference> outcomeReference;

  public Goal() {
  }

  public Goal(GoalModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category = CodeableConceptHelper.fromArray2Array(o.getCategory());
    }
    if (null != o.getPriority() && !o.getPriority().isEmpty()) {
      this.priority = new CodeableConcept(o.getPriority().get(0));
    }
    if (null != o.getDescription() && !o.getDescription().isEmpty()) {
      this.description = new CodeableConcept(o.getDescription().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getStartDate()) {
      this.startDate = o.getStartDate();
    }
    if (null != o.getStartCodeableConcept() && !o.getStartCodeableConcept().isEmpty()) {
      this.startCodeableConcept = new CodeableConcept(o.getStartCodeableConcept().get(0));
    }
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
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
    if (null != o.getOutcomeCode() && !o.getOutcomeCode().isEmpty()) {
    	this.outcomeCode = CodeableConceptHelper.fromArray2Array(o.getOutcomeCode());
    }
    if (null != o.getOutcomeReference() && !o.getOutcomeReference().isEmpty()) {
    	this.outcomeReference = ReferenceHelper.fromArray2Array(o.getOutcomeReference());
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
     if(this.outcomeReference != null) builder.append("outcomeReference" + "->" + this.outcomeReference.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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