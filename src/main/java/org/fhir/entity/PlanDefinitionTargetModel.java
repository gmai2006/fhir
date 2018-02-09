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
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
@Entity
@Table(name="plandefinitiontarget")
public class PlanDefinitionTargetModel  {
  /**
  * Description: "The parameter whose value is to be tracked, e.g. body weigth, blood pressure, or hemoglobin A1c level."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"measure\"", length = 16777215)
  private String measure;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailQuantity\"", length = 16777215)
  private String detailQuantity;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailRange\"", length = 16777215)
  private String detailRange;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailCodeableConcept\"", length = 16777215)
  private String detailCodeableConcept;

  /**
  * Description: "Indicates the timeframe after the start of the goal in which the goal should be met."
  * Actual type: Duration
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"due\"", length = 16777215)
  private String due;

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

  public PlanDefinitionTargetModel() {
  }

  public PlanDefinitionTargetModel(PlanDefinitionTarget o) {
    this.id = o.getId();
      this.measure = CodeableConcept.toJson(o.getMeasure());
      this.detailQuantity = Quantity.toJson(o.getDetailQuantity());
      this.detailRange = Range.toJson(o.getDetailRange());
      this.detailCodeableConcept = CodeableConcept.toJson(o.getDetailCodeableConcept());
      this.due = Duration.toJson(o.getDue());
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
  public void setDue( String value) {
    this.due = value;
  }
  public String getDue() {
    return this.due;
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
     builder.append("due" + "[" + String.valueOf(this.due) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}