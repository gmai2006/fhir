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
import org.fhir.entity.GoalTargetModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GoalTarget  extends BackboneElement  {
  /**
  * Description: "The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level."
  */
  protected CodeableConcept measure;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  */
  protected Quantity detailQuantity;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  */
  protected Range detailRange;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  */
  protected CodeableConcept detailCodeableConcept;

  /**
  * Description: "Indicates either the date or the duration after start by which the goal should be met."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String dueDate;

  /**
  * Description: "Extensions for dueDate"
  */
  protected transient Element _dueDate;

  /**
  * Description: "Indicates either the date or the duration after start by which the goal should be met."
  */
  protected Duration dueDuration;

  public GoalTarget() {
  }

  public GoalTarget(GoalTargetModel o) {
    this.id = o.getId();
    if (null != o.getMeasure() && !o.getMeasure().isEmpty()) {
      this.measure = new CodeableConcept(o.getMeasure().get(0));
    }
    if (null != o.getDetailQuantity() && !o.getDetailQuantity().isEmpty()) {
      this.detailQuantity = new Quantity(o.getDetailQuantity().get(0));
    }
    this.detailRange = RangeHelper.fromJson(o.getDetailRange());
    if (null != o.getDetailCodeableConcept() && !o.getDetailCodeableConcept().isEmpty()) {
      this.detailCodeableConcept = new CodeableConcept(o.getDetailCodeableConcept().get(0));
    }
    if (null != o.getDueDate()) {
      this.dueDate = o.getDueDate();
    }
    this.dueDuration = DurationHelper.fromJson(o.getDueDuration());
  }

  public void setMeasure( CodeableConcept value) {
    this.measure = value;
  }
  public CodeableConcept getMeasure() {
    return this.measure;
  }
  public void setDetailQuantity( Quantity value) {
    this.detailQuantity = value;
  }
  public Quantity getDetailQuantity() {
    return this.detailQuantity;
  }
  public void setDetailRange( Range value) {
    this.detailRange = value;
  }
  public Range getDetailRange() {
    return this.detailRange;
  }
  public void setDetailCodeableConcept( CodeableConcept value) {
    this.detailCodeableConcept = value;
  }
  public CodeableConcept getDetailCodeableConcept() {
    return this.detailCodeableConcept;
  }
  public void setDueDate( String value) {
    this.dueDate = value;
  }
  public String getDueDate() {
    return this.dueDate;
  }
  public void set_dueDate( Element value) {
    this._dueDate = value;
  }
  public Element get_dueDate() {
    return this._dueDate;
  }
  public void setDueDuration( Duration value) {
    this.dueDuration = value;
  }
  public Duration getDueDuration() {
    return this.dueDuration;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[GoalTarget]:" + "\n");
     if(this.measure != null) builder.append("measure" + "->" + this.measure.toString() + "\n"); 
     if(this.detailQuantity != null) builder.append("detailQuantity" + "->" + this.detailQuantity.toString() + "\n"); 
     if(this.detailRange != null) builder.append("detailRange" + "->" + this.detailRange.toString() + "\n"); 
     if(this.detailCodeableConcept != null) builder.append("detailCodeableConcept" + "->" + this.detailCodeableConcept.toString() + "\n"); 
     if(this.dueDate != null) builder.append("dueDate" + "->" + this.dueDate.toString() + "\n"); 
     if(this._dueDate != null) builder.append("_dueDate" + "->" + this._dueDate.toString() + "\n"); 
     if(this.dueDuration != null) builder.append("dueDuration" + "->" + this.dueDuration.toString() + "\n"); ;
    return builder.toString();
  }


}