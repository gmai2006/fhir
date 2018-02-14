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
* "An authorization for the supply of glasses and/or contact lenses to a patient."
*/
@Entity
@Table(name="visionprescriptiondispense")
public class VisionPrescriptionDispenseModel  implements Serializable {
	private static final long serialVersionUID = 151857669714546758L;
  /**
  * Description: "Identifies the type of vision correction product which is required for the patient."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"product\"", length = 16777215)
  private String product;

  /**
  * Description: "The eye for which the lens applies."
  */
  @javax.persistence.Basic
  @Column(name="\"eye\"")
  private String eye;

  /**
  * Description: "Lens power measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"sphere\"")
  private Float sphere;

  /**
  * Description: "Power adjustment for astigmatism measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"cylinder\"")
  private Float cylinder;

  /**
  * Description: "Adjustment for astigmatism measured in integer degrees."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"axis\"")
  private Float axis;

  /**
  * Description: "Amount of prism to compensate for eye alignment in fractional units."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"prism\"")
  private Float prism;

  /**
  * Description: "The relative base, or reference lens edge, for the prism."
  */
  @javax.persistence.Basic
  @Column(name="\"base\"")
  private String base;

  /**
  * Description: "Power adjustment for multifocal lenses measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"add\"")
  private Float add;

  /**
  * Description: "Contact lens power measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"power\"")
  private Float power;

  /**
  * Description: "Back curvature measured in millimeters."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"backCurve\"")
  private Float backCurve;

  /**
  * Description: "Contact lens diameter measured in millimeters."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"diameter\"")
  private Float diameter;

  /**
  * Description: "The recommended maximum wear period for the lens."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"duration\"", length = 16777215)
  private String duration;

  /**
  * Description: "Special color or pattern."
  */
  @javax.persistence.Basic
  @Column(name="\"color\"")
  private String color;

  /**
  * Description: "Brand recommendations or restrictions."
  */
  @javax.persistence.Basic
  @Column(name="\"brand\"")
  private String brand;

  /**
  * Description: "Notes for special requirements such as coatings and lens materials."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

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

  public VisionPrescriptionDispenseModel() {
  }

  public VisionPrescriptionDispenseModel(VisionPrescriptionDispense o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.product = CodeableConceptHelper.toJson(o.getProduct());
    this.eye = o.getEye();
    this.sphere = o.getSphere();
    this.cylinder = o.getCylinder();
    this.axis = o.getAxis();
    this.prism = o.getPrism();
    this.base = o.getBase();
    this.add = o.getAdd();
    this.power = o.getPower();
    this.backCurve = o.getBackCurve();
    this.diameter = o.getDiameter();
    this.duration = QuantityHelper.toJson(o.getDuration());
    this.color = o.getColor();
    this.brand = o.getBrand();
  }

  public String getProduct() {
    return this.product;
  }
  public void setProduct( String value) {
    this.product = value;
  }
  public String getEye() {
    return this.eye;
  }
  public void setEye( String value) {
    this.eye = value;
  }
  public Float getSphere() {
    return this.sphere;
  }
  public void setSphere( Float value) {
    this.sphere = value;
  }
  public Float getCylinder() {
    return this.cylinder;
  }
  public void setCylinder( Float value) {
    this.cylinder = value;
  }
  public Float getAxis() {
    return this.axis;
  }
  public void setAxis( Float value) {
    this.axis = value;
  }
  public Float getPrism() {
    return this.prism;
  }
  public void setPrism( Float value) {
    this.prism = value;
  }
  public String getBase() {
    return this.base;
  }
  public void setBase( String value) {
    this.base = value;
  }
  public Float getAdd() {
    return this.add;
  }
  public void setAdd( Float value) {
    this.add = value;
  }
  public Float getPower() {
    return this.power;
  }
  public void setPower( Float value) {
    this.power = value;
  }
  public Float getBackCurve() {
    return this.backCurve;
  }
  public void setBackCurve( Float value) {
    this.backCurve = value;
  }
  public Float getDiameter() {
    return this.diameter;
  }
  public void setDiameter( Float value) {
    this.diameter = value;
  }
  public String getDuration() {
    return this.duration;
  }
  public void setDuration( String value) {
    this.duration = value;
  }
  public String getColor() {
    return this.color;
  }
  public void setColor( String value) {
    this.color = value;
  }
  public String getBrand() {
    return this.brand;
  }
  public void setBrand( String value) {
    this.brand = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
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
    builder.append("[VisionPrescriptionDispenseModel]:" + "\n");
     builder.append("product" + "->" + this.product + "\n"); 
     builder.append("eye" + "->" + this.eye + "\n"); 
     builder.append("sphere" + "->" + this.sphere + "\n"); 
     builder.append("cylinder" + "->" + this.cylinder + "\n"); 
     builder.append("axis" + "->" + this.axis + "\n"); 
     builder.append("prism" + "->" + this.prism + "\n"); 
     builder.append("base" + "->" + this.base + "\n"); 
     builder.append("add" + "->" + this.add + "\n"); 
     builder.append("power" + "->" + this.power + "\n"); 
     builder.append("backCurve" + "->" + this.backCurve + "\n"); 
     builder.append("diameter" + "->" + this.diameter + "\n"); 
     builder.append("duration" + "->" + this.duration + "\n"); 
     builder.append("color" + "->" + this.color + "\n"); 
     builder.append("brand" + "->" + this.brand + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[VisionPrescriptionDispenseModel]:" + "\n");
     builder.append("product" + "->" + this.product + "\n"); 
     builder.append("eye" + "->" + this.eye + "\n"); 
     builder.append("sphere" + "->" + this.sphere + "\n"); 
     builder.append("cylinder" + "->" + this.cylinder + "\n"); 
     builder.append("axis" + "->" + this.axis + "\n"); 
     builder.append("prism" + "->" + this.prism + "\n"); 
     builder.append("base" + "->" + this.base + "\n"); 
     builder.append("add" + "->" + this.add + "\n"); 
     builder.append("power" + "->" + this.power + "\n"); 
     builder.append("backCurve" + "->" + this.backCurve + "\n"); 
     builder.append("diameter" + "->" + this.diameter + "\n"); 
     builder.append("duration" + "->" + this.duration + "\n"); 
     builder.append("color" + "->" + this.color + "\n"); 
     builder.append("brand" + "->" + this.brand + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}