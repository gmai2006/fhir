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
import org.fhir.entity.CarePlanDetailModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
*/
public class CarePlanDetail  {
  /**
  * Description: "High-level categorization of the type of activity in a care plan."
  */
  private CodeableConcept category;

  /**
  * Description: "Identifies the protocol, questionnaire, guideline or other specification the planned activity should be conducted in accordance with."
  */
  private Reference definition;

  /**
  * Description: "Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter."
  */
  private CodeableConcept code;

  /**
  * Description: "Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited."
  */
  private java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan."
  */
  private java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "Internal reference that identifies the goals that this activity is intended to contribute towards meeting."
  */
  private java.util.List<Reference> goal = new java.util.ArrayList<>();

  /**
  * Description: "Identifies what progress is being made for the specific activity."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Provides reason why the activity isn't yet started, is on hold, was cancelled, etc."
  */
  private String statusReason;

  /**
  * Description: "Extensions for statusReason"
  */
  private transient Element _statusReason;

  /**
  * Description: "If true, indicates that the described activity is one that must NOT be engaged in when following the plan.  If false, indicates that the described activity is one that should be engaged in when following the plan."
  */
  private Boolean prohibited;

  /**
  * Description: "Extensions for prohibited"
  */
  private transient Element _prohibited;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  private Timing scheduledTiming;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  private Period scheduledPeriod;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  private String scheduledString;

  /**
  * Description: "Extensions for scheduledString"
  */
  private transient Element _scheduledString;

  /**
  * Description: "Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc."
  */
  private Reference location;

  /**
  * Description: "Identifies who's expected to be involved in the activity."
  */
  private java.util.List<Reference> performer = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the food, drug or other product to be consumed or supplied in the activity."
  */
  private CodeableConcept productCodeableConcept;

  /**
  * Description: "Identifies the food, drug or other product to be consumed or supplied in the activity."
  */
  private Reference productReference;

  /**
  * Description: "Identifies the quantity expected to be consumed in a given day."
  */
  private Quantity dailyAmount;

  /**
  * Description: "Identifies the quantity expected to be supplied, administered or consumed by the subject."
  */
  private Quantity quantity;

  /**
  * Description: "This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public CarePlanDetail() {
  }

  public CarePlanDetail(CarePlanDetailModel o) {
    this.id = o.getId();
      this.category = CodeableConcept.fromJson(o.getCategory());
      if (null != o.getDefinition()) {
        this.definition = new Reference(o.getDefinition());
        this.definition.setId(this.getId());
      }

      this.code = CodeableConcept.fromJson(o.getCode());
      this.reasonCode = CodeableConcept.fromArray(o.getReasonCode());
      this.reasonReference = Reference.fromArray(o.getReasonReference());

      this.goal = Reference.fromArray(o.getGoal());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getStatusReason()) {
        this.statusReason = new String(o.getStatusReason());
      }

      if (null != o.getProhibited()) {
        this.prohibited = new Boolean(o.getProhibited());
      }

      this.scheduledTiming = Timing.fromJson(o.getScheduledTiming());
      this.scheduledPeriod = Period.fromJson(o.getScheduledPeriod());
      if (null != o.getScheduledString()) {
        this.scheduledString = new String(o.getScheduledString());
      }

      if (null != o.getLocation()) {
        this.location = new Reference(o.getLocation());
        this.location.setId(this.getId());
      }

      this.performer = Reference.fromArray(o.getPerformer());

      this.productCodeableConcept = CodeableConcept.fromJson(o.getProductCodeableConcept());
      if (null != o.getProductReference()) {
        this.productReference = new Reference(o.getProductReference());
        this.productReference.setId(this.getId());
      }

      this.dailyAmount = Quantity.fromJson(o.getDailyAmount());
      this.quantity = Quantity.fromJson(o.getQuantity());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setDefinition( Reference value) {
    this.definition = value;
  }
  public Reference getDefinition() {
    return this.definition;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setReasonCode( java.util.List<CodeableConcept> value) {
    this.reasonCode = value;
  }
  public java.util.List<CodeableConcept> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonReference( java.util.List<Reference> value) {
    this.reasonReference = value;
  }
  public java.util.List<Reference> getReasonReference() {
    return this.reasonReference;
  }
  public void setGoal( java.util.List<Reference> value) {
    this.goal = value;
  }
  public java.util.List<Reference> getGoal() {
    return this.goal;
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
  public void setProhibited( Boolean value) {
    this.prohibited = value;
  }
  public Boolean getProhibited() {
    return this.prohibited;
  }
  public void set_prohibited( Element value) {
    this._prohibited = value;
  }
  public Element get_prohibited() {
    return this._prohibited;
  }
  public void setScheduledTiming( Timing value) {
    this.scheduledTiming = value;
  }
  public Timing getScheduledTiming() {
    return this.scheduledTiming;
  }
  public void setScheduledPeriod( Period value) {
    this.scheduledPeriod = value;
  }
  public Period getScheduledPeriod() {
    return this.scheduledPeriod;
  }
  public void setScheduledString( String value) {
    this.scheduledString = value;
  }
  public String getScheduledString() {
    return this.scheduledString;
  }
  public void set_scheduledString( Element value) {
    this._scheduledString = value;
  }
  public Element get_scheduledString() {
    return this._scheduledString;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setPerformer( java.util.List<Reference> value) {
    this.performer = value;
  }
  public java.util.List<Reference> getPerformer() {
    return this.performer;
  }
  public void setProductCodeableConcept( CodeableConcept value) {
    this.productCodeableConcept = value;
  }
  public CodeableConcept getProductCodeableConcept() {
    return this.productCodeableConcept;
  }
  public void setProductReference( Reference value) {
    this.productReference = value;
  }
  public Reference getProductReference() {
    return this.productReference;
  }
  public void setDailyAmount( Quantity value) {
    this.dailyAmount = value;
  }
  public Quantity getDailyAmount() {
    return this.dailyAmount;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
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
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("goal" + "[" + String.valueOf(this.goal) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("statusReason" + "[" + String.valueOf(this.statusReason) + "]\n"); 
     builder.append("_statusReason" + "[" + String.valueOf(this._statusReason) + "]\n"); 
     builder.append("prohibited" + "[" + String.valueOf(this.prohibited) + "]\n"); 
     builder.append("_prohibited" + "[" + String.valueOf(this._prohibited) + "]\n"); 
     builder.append("scheduledTiming" + "[" + String.valueOf(this.scheduledTiming) + "]\n"); 
     builder.append("scheduledPeriod" + "[" + String.valueOf(this.scheduledPeriod) + "]\n"); 
     builder.append("scheduledString" + "[" + String.valueOf(this.scheduledString) + "]\n"); 
     builder.append("_scheduledString" + "[" + String.valueOf(this._scheduledString) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("productCodeableConcept" + "[" + String.valueOf(this.productCodeableConcept) + "]\n"); 
     builder.append("productReference" + "[" + String.valueOf(this.productReference) + "]\n"); 
     builder.append("dailyAmount" + "[" + String.valueOf(this.dailyAmount) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum StatusEnum {
  	notstarted,
  	scheduled,
  	inprogress,
  	onhold,
  	completed,
  	cancelled,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "notstarted" : { return notstarted.toString(); }
  			case "scheduled" : { return scheduled.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<CarePlanDetail> fromArray(java.util.List<CarePlanDetailModel> list) {
    return (java.util.List<CarePlanDetail>)list.stream()
      .map(model -> new CarePlanDetail(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CarePlanDetailModel> toModelArray(java.util.List<CarePlanDetail> list) {
    return (java.util.List<CarePlanDetailModel>)list.stream()
      .map(model -> new CarePlanDetailModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CarePlanDetail fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CarePlanDetail.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CarePlanDetail o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CarePlanDetail> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}