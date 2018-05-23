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
import org.fhir.utils.JsonUtils;
/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
@Entity
@Table(name="contractvalueditem")
public class ContractValuedItemModel  implements Serializable {
	private static final long serialVersionUID = 151967883230382333L;
  /**
  * Description: "Specific type of Contract Valued Item that may be priced."
  */
  @javax.persistence.Basic
  @Column(name="\"entitycodeableconcept_id\"")
  private String entitycodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="entitycodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> entityCodeableConcept;

  /**
  * Description: "Specific type of Contract Valued Item that may be priced."
  */
  @javax.persistence.Basic
  @Column(name="\"entityreference_id\"")
  private String entityreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="entityreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> entityReference;

  /**
  * Description: "Identifies a Contract Valued Item instance."
  * Actual type: String;
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
  */
  @javax.persistence.Basic
  @Column(name="\"quantity_id\"")
  private String quantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="quantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> quantity;

  /**
  * Description: "A Contract Valued Item unit valuation measure."
  */
  @javax.persistence.Basic
  @Column(name="\"unitprice_id\"")
  private String unitprice_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="unitprice_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> unitPrice;

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
  */
  @javax.persistence.Basic
  @Column(name="\"net_id\"")
  private String net_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="net_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> net;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public ContractValuedItemModel() {
  }

  public ContractValuedItemModel(ContractValuedItem o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getEntityCodeableConcept() ) {
    	this.entitycodeableconcept_id = "entitycodeableconcept" + this.id;
    	this.entityCodeableConcept = CodeableConceptHelper.toModel(o.getEntityCodeableConcept(), this.entitycodeableconcept_id);
    }
    if (null != o.getEntityReference() ) {
    	this.entityreference_id = "entityreference" + this.id;
    	this.entityReference = ReferenceHelper.toModel(o.getEntityReference(), this.entityreference_id);
    }
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.effectiveTime = o.getEffectiveTime();
    if (null != o.getQuantity() ) {
    	this.quantity_id = "quantity" + this.id;
    	this.quantity = QuantityHelper.toModel(o.getQuantity(), this.quantity_id);
    }
    if (null != o.getUnitPrice() ) {
    	this.unitprice_id = "unitprice" + this.id;
    	this.unitPrice = MoneyHelper.toModel(o.getUnitPrice(), this.unitprice_id);
    }
    this.factor = o.getFactor();
    this.points = o.getPoints();
    if (null != o.getNet() ) {
    	this.net_id = "net" + this.id;
    	this.net = MoneyHelper.toModel(o.getNet(), this.net_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getEntityCodeableConcept() {
    return this.entityCodeableConcept;
  }
  public void setEntityCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.entityCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getEntityReference() {
    return this.entityReference;
  }
  public void setEntityReference( java.util.List<ReferenceModel> value) {
    this.entityReference = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getEffectiveTime() {
    return this.effectiveTime;
  }
  public void setEffectiveTime( String value) {
    this.effectiveTime = value;
  }
  public java.util.List<QuantityModel> getQuantity() {
    return this.quantity;
  }
  public void setQuantity( java.util.List<QuantityModel> value) {
    this.quantity = value;
  }
  public java.util.List<MoneyModel> getUnitPrice() {
    return this.unitPrice;
  }
  public void setUnitPrice( java.util.List<MoneyModel> value) {
    this.unitPrice = value;
  }
  public Float getFactor() {
    return this.factor;
  }
  public void setFactor( Float value) {
    this.factor = value;
  }
  public Float getPoints() {
    return this.points;
  }
  public void setPoints( Float value) {
    this.points = value;
  }
  public java.util.List<MoneyModel> getNet() {
    return this.net;
  }
  public void setNet( java.util.List<MoneyModel> value) {
    this.net = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ContractValuedItemModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("effectiveTime" + "->" + this.effectiveTime + "\n"); 
     builder.append("factor" + "->" + this.factor + "\n"); 
     builder.append("points" + "->" + this.points + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ContractValuedItemModel]:" + "\n");
     builder.append("entityCodeableConcept" + "->" + this.entityCodeableConcept + "\n"); 
     builder.append("entityReference" + "->" + this.entityReference + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("effectiveTime" + "->" + this.effectiveTime + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("unitPrice" + "->" + this.unitPrice + "\n"); 
     builder.append("factor" + "->" + this.factor + "\n"); 
     builder.append("points" + "->" + this.points + "\n"); 
     builder.append("net" + "->" + this.net + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}