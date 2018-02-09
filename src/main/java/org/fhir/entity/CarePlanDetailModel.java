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

/**
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
*/
@Entity
@Table(name="careplandetail")
public class CarePlanDetailModel  {
  /**
  * Description: "High-level categorization of the type of activity in a care plan."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Identifies the protocol, questionnaire, guideline or other specification the planned activity should be conducted in accordance with."
  */
  @javax.persistence.Basic
  @Column(name="\"definition_id\"")
  private String definition_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`definition_id`", insertable=false, updatable=false)
  private ReferenceModel definition;

  /**
  * Description: "Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCode\"", length = 16777215)
  private String reasonCode;

  /**
  * Description: "Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "Internal reference that identifies the goals that this activity is intended to contribute towards meeting."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> goal = new java.util.ArrayList<>();

  /**
  * Description: "Identifies what progress is being made for the specific activity."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Provides reason why the activity isn't yet started, is on hold, was cancelled, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"statusReason\"")
  private String statusReason;

  /**
  * Description: "If true, indicates that the described activity is one that must NOT be engaged in when following the plan.  If false, indicates that the described activity is one that should be engaged in when following the plan."
  */
  @javax.persistence.Basic
  @Column(name="\"prohibited\"")
  private Boolean prohibited;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  * Actual type: Timing
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"scheduledTiming\"", length = 16777215)
  private String scheduledTiming;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"scheduledPeriod\"", length = 16777215)
  private String scheduledPeriod;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  @javax.persistence.Basic
  @Column(name="\"scheduledString\"")
  private String scheduledString;

  /**
  * Description: "Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`location_id`", insertable=false, updatable=false)
  private ReferenceModel location;

  /**
  * Description: "Identifies who's expected to be involved in the activity."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> performer = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the food, drug or other product to be consumed or supplied in the activity."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"productCodeableConcept\"", length = 16777215)
  private String productCodeableConcept;

  /**
  * Description: "Identifies the food, drug or other product to be consumed or supplied in the activity."
  */
  @javax.persistence.Basic
  @Column(name="\"productreference_id\"")
  private String productreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`productreference_id`", insertable=false, updatable=false)
  private ReferenceModel productReference;

  /**
  * Description: "Identifies the quantity expected to be consumed in a given day."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dailyAmount\"", length = 16777215)
  private String dailyAmount;

  /**
  * Description: "Identifies the quantity expected to be supplied, administered or consumed by the subject."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public CarePlanDetailModel() {
  }

  public CarePlanDetailModel(CarePlanDetail o) {
    this.id = o.getId();
      this.category = CodeableConcept.toJson(o.getCategory());
      if (null != o.getDefinition()) {
      	this.definition_id = "definition" + this.getId();
        this.definition = new ReferenceModel(o.getDefinition());
        this.definition.setId(this.definition_id);
        this.definition.parent_id = this.definition.getId();
      }

      this.code = CodeableConcept.toJson(o.getCode());
      this.reasonCode = CodeableConcept.toJson(o.getReasonCode());
      this.reasonReference = Reference.toModelArray(o.getReasonReference());

      this.goal = Reference.toModelArray(o.getGoal());

      this.status = o.getStatus();

      this.statusReason = o.getStatusReason();

      this.prohibited = o.getProhibited();

      this.scheduledTiming = Timing.toJson(o.getScheduledTiming());
      this.scheduledPeriod = Period.toJson(o.getScheduledPeriod());
      this.scheduledString = o.getScheduledString();

      if (null != o.getLocation()) {
      	this.location_id = "location" + this.getId();
        this.location = new ReferenceModel(o.getLocation());
        this.location.setId(this.location_id);
        this.location.parent_id = this.location.getId();
      }

      this.performer = Reference.toModelArray(o.getPerformer());

      this.productCodeableConcept = CodeableConcept.toJson(o.getProductCodeableConcept());
      if (null != o.getProductReference()) {
      	this.productreference_id = "productReference" + this.getId();
        this.productReference = new ReferenceModel(o.getProductReference());
        this.productReference.setId(this.productreference_id);
        this.productReference.parent_id = this.productReference.getId();
      }

      this.dailyAmount = Quantity.toJson(o.getDailyAmount());
      this.quantity = Quantity.toJson(o.getQuantity());
      this.description = o.getDescription();

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setDefinition( ReferenceModel value) {
    this.definition = value;
  }
  public ReferenceModel getDefinition() {
    return this.definition;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setReasonCode( String value) {
    this.reasonCode = value;
  }
  public String getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setGoal( java.util.List<ReferenceModel> value) {
    this.goal = value;
  }
  public java.util.List<ReferenceModel> getGoal() {
    return this.goal;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatusReason( String value) {
    this.statusReason = value;
  }
  public String getStatusReason() {
    return this.statusReason;
  }
  public void setProhibited( Boolean value) {
    this.prohibited = value;
  }
  public Boolean getProhibited() {
    return this.prohibited;
  }
  public void setScheduledTiming( String value) {
    this.scheduledTiming = value;
  }
  public String getScheduledTiming() {
    return this.scheduledTiming;
  }
  public void setScheduledPeriod( String value) {
    this.scheduledPeriod = value;
  }
  public String getScheduledPeriod() {
    return this.scheduledPeriod;
  }
  public void setScheduledString( String value) {
    this.scheduledString = value;
  }
  public String getScheduledString() {
    return this.scheduledString;
  }
  public void setLocation( ReferenceModel value) {
    this.location = value;
  }
  public ReferenceModel getLocation() {
    return this.location;
  }
  public void setPerformer( java.util.List<ReferenceModel> value) {
    this.performer = value;
  }
  public java.util.List<ReferenceModel> getPerformer() {
    return this.performer;
  }
  public void setProductCodeableConcept( String value) {
    this.productCodeableConcept = value;
  }
  public String getProductCodeableConcept() {
    return this.productCodeableConcept;
  }
  public void setProductReference( ReferenceModel value) {
    this.productReference = value;
  }
  public ReferenceModel getProductReference() {
    return this.productReference;
  }
  public void setDailyAmount( String value) {
    this.dailyAmount = value;
  }
  public String getDailyAmount() {
    return this.dailyAmount;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
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
     builder.append("statusReason" + "[" + String.valueOf(this.statusReason) + "]\n"); 
     builder.append("prohibited" + "[" + String.valueOf(this.prohibited) + "]\n"); 
     builder.append("scheduledTiming" + "[" + String.valueOf(this.scheduledTiming) + "]\n"); 
     builder.append("scheduledPeriod" + "[" + String.valueOf(this.scheduledPeriod) + "]\n"); 
     builder.append("scheduledString" + "[" + String.valueOf(this.scheduledString) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("productCodeableConcept" + "[" + String.valueOf(this.productCodeableConcept) + "]\n"); 
     builder.append("productReference" + "[" + String.valueOf(this.productReference) + "]\n"); 
     builder.append("dailyAmount" + "[" + String.valueOf(this.dailyAmount) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}