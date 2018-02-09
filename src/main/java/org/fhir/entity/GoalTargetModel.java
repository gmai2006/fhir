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
* "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
*/
@Entity
@Table(name="goaltarget")
public class GoalTargetModel  {
  /**
  * Description: "The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"measure\"", length = 16777215)
  private String measure;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailQuantity\"", length = 16777215)
  private String detailQuantity;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailRange\"", length = 16777215)
  private String detailRange;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  * Actual type: CodeableConcept
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
  * Actual type: Duration
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dueDuration\"", length = 16777215)
  private String dueDuration;

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

  public GoalTargetModel() {
  }

  public GoalTargetModel(GoalTarget o) {
    this.id = o.getId();
      this.measure = CodeableConcept.toJson(o.getMeasure());
      this.detailQuantity = Quantity.toJson(o.getDetailQuantity());
      this.detailRange = Range.toJson(o.getDetailRange());
      this.detailCodeableConcept = CodeableConcept.toJson(o.getDetailCodeableConcept());
      this.dueDate = o.getDueDate();

      this.dueDuration = Duration.toJson(o.getDueDuration());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setMeasure( String value) {
    this.measure = value;
  }
  public String getMeasure() {
    return this.measure;
  }
  public void setDetailQuantity( String value) {
    this.detailQuantity = value;
  }
  public String getDetailQuantity() {
    return this.detailQuantity;
  }
  public void setDetailRange( String value) {
    this.detailRange = value;
  }
  public String getDetailRange() {
    return this.detailRange;
  }
  public void setDetailCodeableConcept( String value) {
    this.detailCodeableConcept = value;
  }
  public String getDetailCodeableConcept() {
    return this.detailCodeableConcept;
  }
  public void setDueDate( String value) {
    this.dueDate = value;
  }
  public String getDueDate() {
    return this.dueDate;
  }
  public void setDueDuration( String value) {
    this.dueDuration = value;
  }
  public String getDueDuration() {
    return this.dueDuration;
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
     builder.append("measure" + "[" + String.valueOf(this.measure) + "]\n"); 
     builder.append("detailQuantity" + "[" + String.valueOf(this.detailQuantity) + "]\n"); 
     builder.append("detailRange" + "[" + String.valueOf(this.detailRange) + "]\n"); 
     builder.append("detailCodeableConcept" + "[" + String.valueOf(this.detailCodeableConcept) + "]\n"); 
     builder.append("dueDate" + "[" + String.valueOf(this.dueDate) + "]\n"); 
     builder.append("dueDuration" + "[" + String.valueOf(this.dueDuration) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}