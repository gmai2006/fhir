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
import org.fhir.entity.VisionPrescriptionDispenseModel;
import com.google.gson.GsonBuilder;

/**
* "An authorization for the supply of glasses and/or contact lenses to a patient."
*/
public class VisionPrescriptionDispense  {
  /**
  * Description: "Identifies the type of vision correction product which is required for the patient."
  */
  private CodeableConcept product;

  /**
  * Description: "The eye for which the lens applies."
  */
  private String eye;

  /**
  * Description: "Extensions for eye"
  */
  private transient Element _eye;

  /**
  * Description: "Lens power measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float sphere;

  /**
  * Description: "Extensions for sphere"
  */
  private transient Element _sphere;

  /**
  * Description: "Power adjustment for astigmatism measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float cylinder;

  /**
  * Description: "Extensions for cylinder"
  */
  private transient Element _cylinder;

  /**
  * Description: "Adjustment for astigmatism measured in integer degrees."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float axis;

  /**
  * Description: "Extensions for axis"
  */
  private transient Element _axis;

  /**
  * Description: "Amount of prism to compensate for eye alignment in fractional units."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float prism;

  /**
  * Description: "Extensions for prism"
  */
  private transient Element _prism;

  /**
  * Description: "The relative base, or reference lens edge, for the prism."
  */
  private String base;

  /**
  * Description: "Extensions for base"
  */
  private transient Element _base;

  /**
  * Description: "Power adjustment for multifocal lenses measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float add;

  /**
  * Description: "Extensions for add"
  */
  private transient Element _add;

  /**
  * Description: "Contact lens power measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float power;

  /**
  * Description: "Extensions for power"
  */
  private transient Element _power;

  /**
  * Description: "Back curvature measured in millimeters."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float backCurve;

  /**
  * Description: "Extensions for backCurve"
  */
  private transient Element _backCurve;

  /**
  * Description: "Contact lens diameter measured in millimeters."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float diameter;

  /**
  * Description: "Extensions for diameter"
  */
  private transient Element _diameter;

  /**
  * Description: "The recommended maximum wear period for the lens."
  */
  private Quantity duration;

  /**
  * Description: "Special color or pattern."
  */
  private String color;

  /**
  * Description: "Extensions for color"
  */
  private transient Element _color;

  /**
  * Description: "Brand recommendations or restrictions."
  */
  private String brand;

  /**
  * Description: "Extensions for brand"
  */
  private transient Element _brand;

  /**
  * Description: "Notes for special requirements such as coatings and lens materials."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

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

  public VisionPrescriptionDispense() {
  }

  public VisionPrescriptionDispense(VisionPrescriptionDispenseModel o) {
    this.id = o.getId();
      this.product = CodeableConcept.fromJson(o.getProduct());
      if (null != o.getEye()) {
        this.eye = new String(o.getEye());
      }

      if (null != o.getSphere()) {
        this.sphere = new Float(o.getSphere());
      }

      if (null != o.getCylinder()) {
        this.cylinder = new Float(o.getCylinder());
      }

      if (null != o.getAxis()) {
        this.axis = new Float(o.getAxis());
      }

      if (null != o.getPrism()) {
        this.prism = new Float(o.getPrism());
      }

      if (null != o.getBase()) {
        this.base = new String(o.getBase());
      }

      if (null != o.getAdd()) {
        this.add = new Float(o.getAdd());
      }

      if (null != o.getPower()) {
        this.power = new Float(o.getPower());
      }

      if (null != o.getBackCurve()) {
        this.backCurve = new Float(o.getBackCurve());
      }

      if (null != o.getDiameter()) {
        this.diameter = new Float(o.getDiameter());
      }

      this.duration = Quantity.fromJson(o.getDuration());
      if (null != o.getColor()) {
        this.color = new String(o.getColor());
      }

      if (null != o.getBrand()) {
        this.brand = new String(o.getBrand());
      }

      this.note = Annotation.fromArray(o.getNote());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setProduct( CodeableConcept value) {
    this.product = value;
  }
  public CodeableConcept getProduct() {
    return this.product;
  }
  public void setEye( String value) {
    this.eye = EyeEnum.fromCode(value);
  }
  public String getEye() {
    return this.eye;
  }
  public void set_eye( Element value) {
    this._eye = value;
  }
  public Element get_eye() {
    return this._eye;
  }
  public void setSphere( Float value) {
    this.sphere = value;
  }
  public Float getSphere() {
    return this.sphere;
  }
  public void set_sphere( Element value) {
    this._sphere = value;
  }
  public Element get_sphere() {
    return this._sphere;
  }
  public void setCylinder( Float value) {
    this.cylinder = value;
  }
  public Float getCylinder() {
    return this.cylinder;
  }
  public void set_cylinder( Element value) {
    this._cylinder = value;
  }
  public Element get_cylinder() {
    return this._cylinder;
  }
  public void setAxis( Float value) {
    this.axis = value;
  }
  public Float getAxis() {
    return this.axis;
  }
  public void set_axis( Element value) {
    this._axis = value;
  }
  public Element get_axis() {
    return this._axis;
  }
  public void setPrism( Float value) {
    this.prism = value;
  }
  public Float getPrism() {
    return this.prism;
  }
  public void set_prism( Element value) {
    this._prism = value;
  }
  public Element get_prism() {
    return this._prism;
  }
  public void setBase( String value) {
    this.base = BaseEnum.fromCode(value);
  }
  public String getBase() {
    return this.base;
  }
  public void set_base( Element value) {
    this._base = value;
  }
  public Element get_base() {
    return this._base;
  }
  public void setAdd( Float value) {
    this.add = value;
  }
  public Float getAdd() {
    return this.add;
  }
  public void set_add( Element value) {
    this._add = value;
  }
  public Element get_add() {
    return this._add;
  }
  public void setPower( Float value) {
    this.power = value;
  }
  public Float getPower() {
    return this.power;
  }
  public void set_power( Element value) {
    this._power = value;
  }
  public Element get_power() {
    return this._power;
  }
  public void setBackCurve( Float value) {
    this.backCurve = value;
  }
  public Float getBackCurve() {
    return this.backCurve;
  }
  public void set_backCurve( Element value) {
    this._backCurve = value;
  }
  public Element get_backCurve() {
    return this._backCurve;
  }
  public void setDiameter( Float value) {
    this.diameter = value;
  }
  public Float getDiameter() {
    return this.diameter;
  }
  public void set_diameter( Element value) {
    this._diameter = value;
  }
  public Element get_diameter() {
    return this._diameter;
  }
  public void setDuration( Quantity value) {
    this.duration = value;
  }
  public Quantity getDuration() {
    return this.duration;
  }
  public void setColor( String value) {
    this.color = value;
  }
  public String getColor() {
    return this.color;
  }
  public void set_color( Element value) {
    this._color = value;
  }
  public Element get_color() {
    return this._color;
  }
  public void setBrand( String value) {
    this.brand = value;
  }
  public String getBrand() {
    return this.brand;
  }
  public void set_brand( Element value) {
    this._brand = value;
  }
  public Element get_brand() {
    return this._brand;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
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
     builder.append("product" + "[" + String.valueOf(this.product) + "]\n"); 
     builder.append("eye" + "[" + String.valueOf(this.eye) + "]\n"); 
     builder.append("_eye" + "[" + String.valueOf(this._eye) + "]\n"); 
     builder.append("sphere" + "[" + String.valueOf(this.sphere) + "]\n"); 
     builder.append("_sphere" + "[" + String.valueOf(this._sphere) + "]\n"); 
     builder.append("cylinder" + "[" + String.valueOf(this.cylinder) + "]\n"); 
     builder.append("_cylinder" + "[" + String.valueOf(this._cylinder) + "]\n"); 
     builder.append("axis" + "[" + String.valueOf(this.axis) + "]\n"); 
     builder.append("_axis" + "[" + String.valueOf(this._axis) + "]\n"); 
     builder.append("prism" + "[" + String.valueOf(this.prism) + "]\n"); 
     builder.append("_prism" + "[" + String.valueOf(this._prism) + "]\n"); 
     builder.append("base" + "[" + String.valueOf(this.base) + "]\n"); 
     builder.append("_base" + "[" + String.valueOf(this._base) + "]\n"); 
     builder.append("add" + "[" + String.valueOf(this.add) + "]\n"); 
     builder.append("_add" + "[" + String.valueOf(this._add) + "]\n"); 
     builder.append("power" + "[" + String.valueOf(this.power) + "]\n"); 
     builder.append("_power" + "[" + String.valueOf(this._power) + "]\n"); 
     builder.append("backCurve" + "[" + String.valueOf(this.backCurve) + "]\n"); 
     builder.append("_backCurve" + "[" + String.valueOf(this._backCurve) + "]\n"); 
     builder.append("diameter" + "[" + String.valueOf(this.diameter) + "]\n"); 
     builder.append("_diameter" + "[" + String.valueOf(this._diameter) + "]\n"); 
     builder.append("duration" + "[" + String.valueOf(this.duration) + "]\n"); 
     builder.append("color" + "[" + String.valueOf(this.color) + "]\n"); 
     builder.append("_color" + "[" + String.valueOf(this._color) + "]\n"); 
     builder.append("brand" + "[" + String.valueOf(this.brand) + "]\n"); 
     builder.append("_brand" + "[" + String.valueOf(this._brand) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum EyeEnum {
  	right,
  	left,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "right" : { return right.toString(); }
  			case "left" : { return left.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum BaseEnum {
  	up,
  	down,
  	in,
  	out,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "up" : { return up.toString(); }
  			case "down" : { return down.toString(); }
  			case "in" : { return in.toString(); }
  			case "out" : { return out.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<VisionPrescriptionDispense> fromArray(java.util.List<VisionPrescriptionDispenseModel> list) {
    return (java.util.List<VisionPrescriptionDispense>)list.stream()
      .map(model -> new VisionPrescriptionDispense(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<VisionPrescriptionDispenseModel> toModelArray(java.util.List<VisionPrescriptionDispense> list) {
    return (java.util.List<VisionPrescriptionDispenseModel>)list.stream()
      .map(model -> new VisionPrescriptionDispenseModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static VisionPrescriptionDispense fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, VisionPrescriptionDispense.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(VisionPrescriptionDispense o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<VisionPrescriptionDispense> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}