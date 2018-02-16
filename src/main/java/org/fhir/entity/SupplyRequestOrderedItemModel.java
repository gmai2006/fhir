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
* "A record of a request for a medication, substance or device used in the healthcare setting."
*/
@Entity
@Table(name="supplyrequestordereditem")
public class SupplyRequestOrderedItemModel  implements Serializable {
	private static final long serialVersionUID = 151873631143082756L;
  /**
  * Description: "The amount that is being ordered of the indicated item."
  */
  @javax.persistence.Basic
  @Column(name="\"quantity_id\"")
  private String quantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="quantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> quantity;

  /**
  * Description: "The item that is requested to be supplied. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"itemCodeableConcept\"", length = 16777215)
  private String itemCodeableConcept;

  /**
  * Description: "The item that is requested to be supplied. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list."
  */
  @javax.persistence.Basic
  @Column(name="\"itemreference_id\"")
  private String itemreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="itemreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> itemReference;

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

  public SupplyRequestOrderedItemModel() {
  }

  public SupplyRequestOrderedItemModel(SupplyRequestOrderedItem o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    if (null != o.getQuantity() ) {
    	this.quantity_id = "quantity" + this.parent_id;
    	this.quantity = QuantityHelper.toModel(o.getQuantity(), this.quantity_id);
    }
    this.itemCodeableConcept = JsonUtils.toJson(o.getItemCodeableConcept());
    if (null != o.getItemReference() ) {
    	this.itemreference_id = "itemreference" + this.parent_id;
    	this.itemReference = ReferenceHelper.toModel(o.getItemReference(), this.itemreference_id);
    }
  }

  public java.util.List<QuantityModel> getQuantity() {
    return this.quantity;
  }
  public void setQuantity( java.util.List<QuantityModel> value) {
    this.quantity = value;
  }
  public String getItemCodeableConcept() {
    return this.itemCodeableConcept;
  }
  public void setItemCodeableConcept( String value) {
    this.itemCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getItemReference() {
    return this.itemReference;
  }
  public void setItemReference( java.util.List<ReferenceModel> value) {
    this.itemReference = value;
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
    builder.append("[SupplyRequestOrderedItemModel]:" + "\n");
     builder.append("itemCodeableConcept" + "->" + this.itemCodeableConcept + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SupplyRequestOrderedItemModel]:" + "\n");
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("itemCodeableConcept" + "->" + this.itemCodeableConcept + "\n"); 
     builder.append("itemReference" + "->" + this.itemReference + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}