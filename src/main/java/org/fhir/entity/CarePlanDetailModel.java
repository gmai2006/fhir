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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
*/
@Entity
@Table(name="careplandetail")
public class CarePlanDetailModel  implements Serializable {
	private static final long serialVersionUID = 151873631186943800L;
  /**
  * Description: "High-level categorization of the type of activity in a care plan."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="definition_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition;

  /**
  * Description: "Detailed description of the type of planned activity; e.g. What lab test, what procedure, what kind of encounter."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCode\"", length = 16777215)
  private String reasonCode;

  /**
  * Description: "Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="reasonreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference;

  /**
  * Description: "Internal reference that identifies the goals that this activity is intended to contribute towards meeting."
  */
  @javax.persistence.Basic
  @Column(name="\"goal_id\"")
  private String goal_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="goal_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> goal;

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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"scheduledTiming\"", length = 16777215)
  private String scheduledTiming;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="location_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location;

  /**
  * Description: "Identifies who's expected to be involved in the activity."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="performer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> performer;

  /**
  * Description: "Identifies the food, drug or other product to be consumed or supplied in the activity."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="productreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> productReference;

  /**
  * Description: "Identifies the quantity expected to be consumed in a given day."
  */
  @javax.persistence.Basic
  @Column(name="\"dailyamount_id\"")
  private String dailyamount_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dailyamount_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> dailyAmount;

  /**
  * Description: "Identifies the quantity expected to be supplied, administered or consumed by the subject."
  */
  @javax.persistence.Basic
  @Column(name="\"quantity_id\"")
  private String quantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="quantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> quantity;

  /**
  * Description: "This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public CarePlanDetailModel() {
  }

  public CarePlanDetailModel(CarePlanDetail o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.category = JsonUtils.toJson(o.getCategory());
    if (null != o.getDefinition() ) {
    	this.definition_id = "definition" + this.parent_id;
    	this.definition = ReferenceHelper.toModel(o.getDefinition(), this.definition_id);
    }
    this.code = JsonUtils.toJson(o.getCode());
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonreference_id = "reasonreference" + this.parent_id;
    	this.reasonReference = ReferenceHelper.toModelFromArray(o.getReasonReference(), this.reasonreference_id);
    }
    if (null != o.getGoal() && !o.getGoal().isEmpty()) {
    	this.goal_id = "goal" + this.parent_id;
    	this.goal = ReferenceHelper.toModelFromArray(o.getGoal(), this.goal_id);
    }
    this.status = o.getStatus();
    this.statusReason = o.getStatusReason();
    this.prohibited = o.getProhibited();
    this.scheduledTiming = JsonUtils.toJson(o.getScheduledTiming());
    this.scheduledPeriod = JsonUtils.toJson(o.getScheduledPeriod());
    this.scheduledString = o.getScheduledString();
    if (null != o.getLocation() ) {
    	this.location_id = "location" + this.parent_id;
    	this.location = ReferenceHelper.toModel(o.getLocation(), this.location_id);
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer_id = "performer" + this.parent_id;
    	this.performer = ReferenceHelper.toModelFromArray(o.getPerformer(), this.performer_id);
    }
    this.productCodeableConcept = JsonUtils.toJson(o.getProductCodeableConcept());
    if (null != o.getProductReference() ) {
    	this.productreference_id = "productreference" + this.parent_id;
    	this.productReference = ReferenceHelper.toModel(o.getProductReference(), this.productreference_id);
    }
    if (null != o.getDailyAmount() ) {
    	this.dailyamount_id = "dailyamount" + this.parent_id;
    	this.dailyAmount = QuantityHelper.toModel(o.getDailyAmount(), this.dailyamount_id);
    }
    if (null != o.getQuantity() ) {
    	this.quantity_id = "quantity" + this.parent_id;
    	this.quantity = QuantityHelper.toModel(o.getQuantity(), this.quantity_id);
    }
    this.description = o.getDescription();
  }

  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonCode( String value) {
    this.reasonCode = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public java.util.List<ReferenceModel> getGoal() {
    return this.goal;
  }
  public void setGoal( java.util.List<ReferenceModel> value) {
    this.goal = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatusReason() {
    return this.statusReason;
  }
  public void setStatusReason( String value) {
    this.statusReason = value;
  }
  public Boolean getProhibited() {
    return this.prohibited;
  }
  public void setProhibited( Boolean value) {
    this.prohibited = value;
  }
  public String getScheduledTiming() {
    return this.scheduledTiming;
  }
  public void setScheduledTiming( String value) {
    this.scheduledTiming = value;
  }
  public String getScheduledPeriod() {
    return this.scheduledPeriod;
  }
  public void setScheduledPeriod( String value) {
    this.scheduledPeriod = value;
  }
  public String getScheduledString() {
    return this.scheduledString;
  }
  public void setScheduledString( String value) {
    this.scheduledString = value;
  }
  public java.util.List<ReferenceModel> getLocation() {
    return this.location;
  }
  public void setLocation( java.util.List<ReferenceModel> value) {
    this.location = value;
  }
  public java.util.List<ReferenceModel> getPerformer() {
    return this.performer;
  }
  public void setPerformer( java.util.List<ReferenceModel> value) {
    this.performer = value;
  }
  public String getProductCodeableConcept() {
    return this.productCodeableConcept;
  }
  public void setProductCodeableConcept( String value) {
    this.productCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getProductReference() {
    return this.productReference;
  }
  public void setProductReference( java.util.List<ReferenceModel> value) {
    this.productReference = value;
  }
  public java.util.List<QuantityModel> getDailyAmount() {
    return this.dailyAmount;
  }
  public void setDailyAmount( java.util.List<QuantityModel> value) {
    this.dailyAmount = value;
  }
  public java.util.List<QuantityModel> getQuantity() {
    return this.quantity;
  }
  public void setQuantity( java.util.List<QuantityModel> value) {
    this.quantity = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CarePlanDetailModel]:" + "\n");
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("reasonCode" + "->" + this.reasonCode + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("statusReason" + "->" + this.statusReason + "\n"); 
     builder.append("prohibited" + "->" + this.prohibited + "\n"); 
     builder.append("scheduledTiming" + "->" + this.scheduledTiming + "\n"); 
     builder.append("scheduledPeriod" + "->" + this.scheduledPeriod + "\n"); 
     builder.append("scheduledString" + "->" + this.scheduledString + "\n"); 
     builder.append("productCodeableConcept" + "->" + this.productCodeableConcept + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CarePlanDetailModel]:" + "\n");
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("reasonCode" + "->" + this.reasonCode + "\n"); 
     builder.append("reasonReference" + "->" + this.reasonReference + "\n"); 
     builder.append("goal" + "->" + this.goal + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("statusReason" + "->" + this.statusReason + "\n"); 
     builder.append("prohibited" + "->" + this.prohibited + "\n"); 
     builder.append("scheduledTiming" + "->" + this.scheduledTiming + "\n"); 
     builder.append("scheduledPeriod" + "->" + this.scheduledPeriod + "\n"); 
     builder.append("scheduledString" + "->" + this.scheduledString + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("performer" + "->" + this.performer + "\n"); 
     builder.append("productCodeableConcept" + "->" + this.productCodeableConcept + "\n"); 
     builder.append("productReference" + "->" + this.productReference + "\n"); 
     builder.append("dailyAmount" + "->" + this.dailyAmount + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}