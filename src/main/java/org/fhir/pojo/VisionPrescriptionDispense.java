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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An authorization for the supply of glasses and/or contact lenses to a patient."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VisionPrescriptionDispense  extends BackboneElement  {
  /**
  * Description: "Identifies the type of vision correction product which is required for the patient."
  */
  protected CodeableConcept product;

  /**
  * Description: "The eye for which the lens applies."
  */
  protected String eye;

  /**
  * Description: "Extensions for eye"
  */
  protected transient Element _eye;

  /**
  * Description: "Lens power measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float sphere;

  /**
  * Description: "Extensions for sphere"
  */
  protected transient Element _sphere;

  /**
  * Description: "Power adjustment for astigmatism measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float cylinder;

  /**
  * Description: "Extensions for cylinder"
  */
  protected transient Element _cylinder;

  /**
  * Description: "Adjustment for astigmatism measured in integer degrees."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float axis;

  /**
  * Description: "Extensions for axis"
  */
  protected transient Element _axis;

  /**
  * Description: "Amount of prism to compensate for eye alignment in fractional units."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float prism;

  /**
  * Description: "Extensions for prism"
  */
  protected transient Element _prism;

  /**
  * Description: "The relative base, or reference lens edge, for the prism."
  */
  protected String base;

  /**
  * Description: "Extensions for base"
  */
  protected transient Element _base;

  /**
  * Description: "Power adjustment for multifocal lenses measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float add;

  /**
  * Description: "Extensions for add"
  */
  protected transient Element _add;

  /**
  * Description: "Contact lens power measured in diopters (0.25 units)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float power;

  /**
  * Description: "Extensions for power"
  */
  protected transient Element _power;

  /**
  * Description: "Back curvature measured in millimeters."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float backCurve;

  /**
  * Description: "Extensions for backCurve"
  */
  protected transient Element _backCurve;

  /**
  * Description: "Contact lens diameter measured in millimeters."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float diameter;

  /**
  * Description: "Extensions for diameter"
  */
  protected transient Element _diameter;

  /**
  * Description: "The recommended maximum wear period for the lens."
  */
  protected Quantity duration;

  /**
  * Description: "Special color or pattern."
  */
  protected String color;

  /**
  * Description: "Extensions for color"
  */
  protected transient Element _color;

  /**
  * Description: "Brand recommendations or restrictions."
  */
  protected String brand;

  /**
  * Description: "Extensions for brand"
  */
  protected transient Element _brand;

  /**
  * Description: "Notes for special requirements such as coatings and lens materials."
  */
  protected java.util.List<Annotation> note;

  public VisionPrescriptionDispense() {
  }

  public VisionPrescriptionDispense(VisionPrescriptionDispenseModel o) {
    this.id = o.getId();
    if (null != o.getProduct() && !o.getProduct().isEmpty()) {
      this.product = new CodeableConcept(o.getProduct().get(0));
    }
    if (null != o.getEye()) {
      this.eye = o.getEye();
    }
    if (null != o.getSphere()) {
      this.sphere = o.getSphere();
    }
    if (null != o.getCylinder()) {
      this.cylinder = o.getCylinder();
    }
    if (null != o.getAxis()) {
      this.axis = o.getAxis();
    }
    if (null != o.getPrism()) {
      this.prism = o.getPrism();
    }
    if (null != o.getBase()) {
      this.base = o.getBase();
    }
    if (null != o.getAdd()) {
      this.add = o.getAdd();
    }
    if (null != o.getPower()) {
      this.power = o.getPower();
    }
    if (null != o.getBackCurve()) {
      this.backCurve = o.getBackCurve();
    }
    if (null != o.getDiameter()) {
      this.diameter = o.getDiameter();
    }
    if (null != o.getDuration() && !o.getDuration().isEmpty()) {
      this.duration = new Quantity(o.getDuration().get(0));
    }
    if (null != o.getColor()) {
      this.color = o.getColor();
    }
    if (null != o.getBrand()) {
      this.brand = o.getBrand();
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[VisionPrescriptionDispense]:" + "\n");
     if(this.product != null) builder.append("product" + "->" + this.product.toString() + "\n"); 
     if(this.eye != null) builder.append("eye" + "->" + this.eye.toString() + "\n"); 
     if(this._eye != null) builder.append("_eye" + "->" + this._eye.toString() + "\n"); 
     if(this.sphere != null) builder.append("sphere" + "->" + this.sphere.toString() + "\n"); 
     if(this._sphere != null) builder.append("_sphere" + "->" + this._sphere.toString() + "\n"); 
     if(this.cylinder != null) builder.append("cylinder" + "->" + this.cylinder.toString() + "\n"); 
     if(this._cylinder != null) builder.append("_cylinder" + "->" + this._cylinder.toString() + "\n"); 
     if(this.axis != null) builder.append("axis" + "->" + this.axis.toString() + "\n"); 
     if(this._axis != null) builder.append("_axis" + "->" + this._axis.toString() + "\n"); 
     if(this.prism != null) builder.append("prism" + "->" + this.prism.toString() + "\n"); 
     if(this._prism != null) builder.append("_prism" + "->" + this._prism.toString() + "\n"); 
     if(this.base != null) builder.append("base" + "->" + this.base.toString() + "\n"); 
     if(this._base != null) builder.append("_base" + "->" + this._base.toString() + "\n"); 
     if(this.add != null) builder.append("add" + "->" + this.add.toString() + "\n"); 
     if(this._add != null) builder.append("_add" + "->" + this._add.toString() + "\n"); 
     if(this.power != null) builder.append("power" + "->" + this.power.toString() + "\n"); 
     if(this._power != null) builder.append("_power" + "->" + this._power.toString() + "\n"); 
     if(this.backCurve != null) builder.append("backCurve" + "->" + this.backCurve.toString() + "\n"); 
     if(this._backCurve != null) builder.append("_backCurve" + "->" + this._backCurve.toString() + "\n"); 
     if(this.diameter != null) builder.append("diameter" + "->" + this.diameter.toString() + "\n"); 
     if(this._diameter != null) builder.append("_diameter" + "->" + this._diameter.toString() + "\n"); 
     if(this.duration != null) builder.append("duration" + "->" + this.duration.toString() + "\n"); 
     if(this.color != null) builder.append("color" + "->" + this.color.toString() + "\n"); 
     if(this._color != null) builder.append("_color" + "->" + this._color.toString() + "\n"); 
     if(this.brand != null) builder.append("brand" + "->" + this.brand.toString() + "\n"); 
     if(this._brand != null) builder.append("_brand" + "->" + this._brand.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); ;
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

}