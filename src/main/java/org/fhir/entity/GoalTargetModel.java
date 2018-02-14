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
/**
* "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
*/
@Entity
@Table(name="goaltarget")
public class GoalTargetModel  implements Serializable {
	private static final long serialVersionUID = 151857669705238590L;
  /**
  * Description: "The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"measure\"", length = 16777215)
  private String measure;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailQuantity\"", length = 16777215)
  private String detailQuantity;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailRange\"", length = 16777215)
  private String detailRange;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailCodeableConcept\"", length = 16777215)
  private String detailCodeableConcept;

  /**
  * Description: "Indicates either the date or the duration after start by which the goal should be met."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"dueDate\"")
  private String dueDate;

  /**
  * Description: "Indicates either the date or the duration after start by which the goal should be met."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dueDuration\"", length = 16777215)
  private String dueDuration;

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

  public GoalTargetModel() {
  }

  public GoalTargetModel(GoalTarget o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.measure = CodeableConceptHelper.toJson(o.getMeasure());
    this.detailQuantity = QuantityHelper.toJson(o.getDetailQuantity());
    this.detailRange = RangeHelper.toJson(o.getDetailRange());
    this.detailCodeableConcept = CodeableConceptHelper.toJson(o.getDetailCodeableConcept());
    this.dueDate = o.getDueDate();
    this.dueDuration = DurationHelper.toJson(o.getDueDuration());
  }

  public String getMeasure() {
    return this.measure;
  }
  public void setMeasure( String value) {
    this.measure = value;
  }
  public String getDetailQuantity() {
    return this.detailQuantity;
  }
  public void setDetailQuantity( String value) {
    this.detailQuantity = value;
  }
  public String getDetailRange() {
    return this.detailRange;
  }
  public void setDetailRange( String value) {
    this.detailRange = value;
  }
  public String getDetailCodeableConcept() {
    return this.detailCodeableConcept;
  }
  public void setDetailCodeableConcept( String value) {
    this.detailCodeableConcept = value;
  }
  public String getDueDate() {
    return this.dueDate;
  }
  public void setDueDate( String value) {
    this.dueDate = value;
  }
  public String getDueDuration() {
    return this.dueDuration;
  }
  public void setDueDuration( String value) {
    this.dueDuration = value;
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
    builder.append("[GoalTargetModel]:" + "\n");
     builder.append("measure" + "->" + this.measure + "\n"); 
     builder.append("detailQuantity" + "->" + this.detailQuantity + "\n"); 
     builder.append("detailRange" + "->" + this.detailRange + "\n"); 
     builder.append("detailCodeableConcept" + "->" + this.detailCodeableConcept + "\n"); 
     builder.append("dueDate" + "->" + this.dueDate + "\n"); 
     builder.append("dueDuration" + "->" + this.dueDuration + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[GoalTargetModel]:" + "\n");
     builder.append("measure" + "->" + this.measure + "\n"); 
     builder.append("detailQuantity" + "->" + this.detailQuantity + "\n"); 
     builder.append("detailRange" + "->" + this.detailRange + "\n"); 
     builder.append("detailCodeableConcept" + "->" + this.detailCodeableConcept + "\n"); 
     builder.append("dueDate" + "->" + this.dueDate + "\n"); 
     builder.append("dueDuration" + "->" + this.dueDuration + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}