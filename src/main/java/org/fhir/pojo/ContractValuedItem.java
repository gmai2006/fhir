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
import org.fhir.entity.ContractValuedItemModel;
import com.google.gson.GsonBuilder;

/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
public class ContractValuedItem  {
  /**
  * Description: "Specific type of Contract Valued Item that may be priced."
  */
  private CodeableConcept entityCodeableConcept;

  /**
  * Description: "Specific type of Contract Valued Item that may be priced."
  */
  private Reference entityReference;

  /**
  * Description: "Identifies a Contract Valued Item instance."
  */
  private Identifier identifier;

  /**
  * Description: "Indicates the time during which this Contract ValuedItem information is effective."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String effectiveTime;

  /**
  * Description: "Extensions for effectiveTime"
  */
  private transient Element _effectiveTime;

  /**
  * Description: "Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances."
  */
  private Quantity quantity;

  /**
  * Description: "A Contract Valued Item unit valuation measure."
  */
  private Money unitPrice;

  /**
  * Description: "A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float factor;

  /**
  * Description: "Extensions for factor"
  */
  private transient Element _factor;

  /**
  * Description: "An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float points;

  /**
  * Description: "Extensions for points"
  */
  private transient Element _points;

  /**
  * Description: "Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
  */
  private Money net;

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

  public ContractValuedItem() {
  }

  public ContractValuedItem(ContractValuedItemModel o) {
    this.id = o.getId();
    this.entityCodeableConcept = CodeableConceptHelper.fromJson(o.getEntityCodeableConcept());
    if (null != o.getEntityReference() && !o.getEntityReference().isEmpty()) {
      this.entityReference = new Reference(o.getEntityReference().get(0));
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getEffectiveTime()) {
      this.effectiveTime = o.getEffectiveTime();
    }
    this.quantity = QuantityHelper.fromJson(o.getQuantity());
    this.unitPrice = MoneyHelper.fromJson(o.getUnitPrice());
    if (null != o.getFactor()) {
      this.factor = o.getFactor();
    }
    if (null != o.getPoints()) {
      this.points = o.getPoints();
    }
    this.net = MoneyHelper.fromJson(o.getNet());
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setEntityCodeableConcept( CodeableConcept value) {
    this.entityCodeableConcept = value;
  }
  public CodeableConcept getEntityCodeableConcept() {
    return this.entityCodeableConcept;
  }
  public void setEntityReference( Reference value) {
    this.entityReference = value;
  }
  public Reference getEntityReference() {
    return this.entityReference;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setEffectiveTime( String value) {
    this.effectiveTime = value;
  }
  public String getEffectiveTime() {
    return this.effectiveTime;
  }
  public void set_effectiveTime( Element value) {
    this._effectiveTime = value;
  }
  public Element get_effectiveTime() {
    return this._effectiveTime;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setUnitPrice( Money value) {
    this.unitPrice = value;
  }
  public Money getUnitPrice() {
    return this.unitPrice;
  }
  public void setFactor( Float value) {
    this.factor = value;
  }
  public Float getFactor() {
    return this.factor;
  }
  public void set_factor( Element value) {
    this._factor = value;
  }
  public Element get_factor() {
    return this._factor;
  }
  public void setPoints( Float value) {
    this.points = value;
  }
  public Float getPoints() {
    return this.points;
  }
  public void set_points( Element value) {
    this._points = value;
  }
  public Element get_points() {
    return this._points;
  }
  public void setNet( Money value) {
    this.net = value;
  }
  public Money getNet() {
    return this.net;
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
    builder.append("[ContractValuedItem]:" + "\n");
     if(this.entityCodeableConcept != null) builder.append("entityCodeableConcept" + "->" + this.entityCodeableConcept.toString() + "\n"); 
     if(this.entityReference != null) builder.append("entityReference" + "->" + this.entityReference.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.effectiveTime != null) builder.append("effectiveTime" + "->" + this.effectiveTime.toString() + "\n"); 
     if(this._effectiveTime != null) builder.append("_effectiveTime" + "->" + this._effectiveTime.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.unitPrice != null) builder.append("unitPrice" + "->" + this.unitPrice.toString() + "\n"); 
     if(this.factor != null) builder.append("factor" + "->" + this.factor.toString() + "\n"); 
     if(this._factor != null) builder.append("_factor" + "->" + this._factor.toString() + "\n"); 
     if(this.points != null) builder.append("points" + "->" + this.points.toString() + "\n"); 
     if(this._points != null) builder.append("_points" + "->" + this._points.toString() + "\n"); 
     if(this.net != null) builder.append("net" + "->" + this.net.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}