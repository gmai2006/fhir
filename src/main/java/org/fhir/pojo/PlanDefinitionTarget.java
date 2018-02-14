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
import org.fhir.entity.PlanDefinitionTargetModel;
import com.google.gson.GsonBuilder;

/**
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
public class PlanDefinitionTarget  {
  /**
  * Description: "The parameter whose value is to be tracked, e.g. body weigth, blood pressure, or hemoglobin A1c level."
  */
  private CodeableConcept measure;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  */
  private Quantity detailQuantity;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  */
  private Range detailRange;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  */
  private CodeableConcept detailCodeableConcept;

  /**
  * Description: "Indicates the timeframe after the start of the goal in which the goal should be met."
  */
  private Duration due;

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
  @javax.validation.constraints.NotNull
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

  public PlanDefinitionTarget() {
  }

  public PlanDefinitionTarget(PlanDefinitionTargetModel o) {
    this.id = o.getId();
    this.measure = CodeableConceptHelper.fromJson(o.getMeasure());
    this.detailQuantity = QuantityHelper.fromJson(o.getDetailQuantity());
    this.detailRange = RangeHelper.fromJson(o.getDetailRange());
    this.detailCodeableConcept = CodeableConceptHelper.fromJson(o.getDetailCodeableConcept());
    this.due = DurationHelper.fromJson(o.getDue());
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
  public void setDue( Duration value) {
    this.due = value;
  }
  public Duration getDue() {
    return this.due;
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
    builder.append("[PlanDefinitionTarget]:" + "\n");
     if(this.measure != null) builder.append("measure" + "->" + this.measure.toString() + "\n"); 
     if(this.detailQuantity != null) builder.append("detailQuantity" + "->" + this.detailQuantity.toString() + "\n"); 
     if(this.detailRange != null) builder.append("detailRange" + "->" + this.detailRange.toString() + "\n"); 
     if(this.detailCodeableConcept != null) builder.append("detailCodeableConcept" + "->" + this.detailCodeableConcept.toString() + "\n"); 
     if(this.due != null) builder.append("due" + "->" + this.due.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}