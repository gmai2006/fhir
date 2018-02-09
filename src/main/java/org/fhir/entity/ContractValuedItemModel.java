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
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
@Entity
@Table(name="contractvalueditem")
public class ContractValuedItemModel  {
  /**
  * Description: "Specific type of Contract Valued Item that may be priced."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"entityCodeableConcept\"", length = 16777215)
  private String entityCodeableConcept;

  /**
  * Description: "Specific type of Contract Valued Item that may be priced."
  */
  @javax.persistence.Basic
  @Column(name="\"entityreference_id\"")
  private String entityreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`entityreference_id`", insertable=false, updatable=false)
  private ReferenceModel entityReference;

  /**
  * Description: "Identifies a Contract Valued Item instance."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Indicates the time during which this Contract ValuedItem information is effective."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"effectiveTime\"")
  private String effectiveTime;

  /**
  * Description: "Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "A Contract Valued Item unit valuation measure."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"unitPrice\"", length = 16777215)
  private String unitPrice;

  /**
  * Description: "A real number that represents a multiplier used in determining the overall value of the Contract Valued Item delivered. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"factor\"")
  private Float factor;

  /**
  * Description: "An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the Contract Valued Item delivered. The concept of Points allows for assignment of point values for a Contract Valued Item, such that a monetary amount can be assigned to each point."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"points\"")
  private Float points;

  /**
  * Description: "Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"net\"", length = 16777215)
  private String net;

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

  public ContractValuedItemModel() {
  }

  public ContractValuedItemModel(ContractValuedItem o) {
    this.id = o.getId();
      this.entityCodeableConcept = CodeableConcept.toJson(o.getEntityCodeableConcept());
      if (null != o.getEntityReference()) {
      	this.entityreference_id = "entityReference" + this.getId();
        this.entityReference = new ReferenceModel(o.getEntityReference());
        this.entityReference.setId(this.entityreference_id);
        this.entityReference.parent_id = this.entityReference.getId();
      }

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.effectiveTime = o.getEffectiveTime();

      this.quantity = Quantity.toJson(o.getQuantity());
      this.unitPrice = Money.toJson(o.getUnitPrice());
      this.factor = o.getFactor();

      this.points = o.getPoints();

      this.net = Money.toJson(o.getNet());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setEntityCodeableConcept( String value) {
    this.entityCodeableConcept = value;
  }
  public String getEntityCodeableConcept() {
    return this.entityCodeableConcept;
  }
  public void setEntityReference( ReferenceModel value) {
    this.entityReference = value;
  }
  public ReferenceModel getEntityReference() {
    return this.entityReference;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setEffectiveTime( String value) {
    this.effectiveTime = value;
  }
  public String getEffectiveTime() {
    return this.effectiveTime;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setUnitPrice( String value) {
    this.unitPrice = value;
  }
  public String getUnitPrice() {
    return this.unitPrice;
  }
  public void setFactor( Float value) {
    this.factor = value;
  }
  public Float getFactor() {
    return this.factor;
  }
  public void setPoints( Float value) {
    this.points = value;
  }
  public Float getPoints() {
    return this.points;
  }
  public void setNet( String value) {
    this.net = value;
  }
  public String getNet() {
    return this.net;
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
     builder.append("entityCodeableConcept" + "[" + String.valueOf(this.entityCodeableConcept) + "]\n"); 
     builder.append("entityReference" + "[" + String.valueOf(this.entityReference) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("effectiveTime" + "[" + String.valueOf(this.effectiveTime) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("unitPrice" + "[" + String.valueOf(this.unitPrice) + "]\n"); 
     builder.append("factor" + "[" + String.valueOf(this.factor) + "]\n"); 
     builder.append("points" + "[" + String.valueOf(this.points) + "]\n"); 
     builder.append("net" + "[" + String.valueOf(this.net) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}