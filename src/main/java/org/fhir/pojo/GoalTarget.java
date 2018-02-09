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
import com.google.gson.GsonBuilder;

/**
* "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
*/
public class GoalTarget  {
  /**
  * Description: "The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level."
  */
  private CodeableConcept measure;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  */
  private Quantity detailQuantity;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  */
  private Range detailRange;

  /**
  * Description: "The target value of the focus to be achieved to signify the fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low or both values of the range can be specified. When a low value is missing, it indicates that the goal is achieved at any focus value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any focus value at or above the low value."
  */
  private CodeableConcept detailCodeableConcept;

  /**
  * Description: "Indicates either the date or the duration after start by which the goal should be met."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String dueDate;

  /**
  * Description: "Extensions for dueDate"
  */
  private transient Element _dueDate;

  /**
  * Description: "Indicates either the date or the duration after start by which the goal should be met."
  */
  private Duration dueDuration;

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

  public GoalTarget() {
  }

  public GoalTarget(GoalTargetModel o) {
    this.id = o.getId();
      this.measure = CodeableConcept.fromJson(o.getMeasure());
      this.detailQuantity = Quantity.fromJson(o.getDetailQuantity());
      this.detailRange = Range.fromJson(o.getDetailRange());
      this.detailCodeableConcept = CodeableConcept.fromJson(o.getDetailCodeableConcept());
      if (null != o.getDueDate()) {
        this.dueDate = new String(o.getDueDate());
      }

      this.dueDuration = Duration.fromJson(o.getDueDuration());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("measure" + "[" + String.valueOf(this.measure) + "]\n"); 
     builder.append("detailQuantity" + "[" + String.valueOf(this.detailQuantity) + "]\n"); 
     builder.append("detailRange" + "[" + String.valueOf(this.detailRange) + "]\n"); 
     builder.append("detailCodeableConcept" + "[" + String.valueOf(this.detailCodeableConcept) + "]\n"); 
     builder.append("dueDate" + "[" + String.valueOf(this.dueDate) + "]\n"); 
     builder.append("_dueDate" + "[" + String.valueOf(this._dueDate) + "]\n"); 
     builder.append("dueDuration" + "[" + String.valueOf(this.dueDuration) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<GoalTarget> fromArray(java.util.List<GoalTargetModel> list) {
    return (java.util.List<GoalTarget>)list.stream()
      .map(model -> new GoalTarget(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<GoalTargetModel> toModelArray(java.util.List<GoalTarget> list) {
    return (java.util.List<GoalTargetModel>)list.stream()
      .map(model -> new GoalTargetModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static GoalTarget fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, GoalTarget.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(GoalTarget o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<GoalTarget> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}