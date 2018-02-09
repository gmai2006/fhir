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
* "A record of a request for a medication, substance or device used in the healthcare setting."
*/
@Entity
@Table(name="supplyrequestordereditem")
public class SupplyRequestOrderedItemModel  {
  /**
  * Description: "The amount that is being ordered of the indicated item."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "The item that is requested to be supplied. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list."
  * Actual type: CodeableConcept
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`itemreference_id`", insertable=false, updatable=false)
  private ReferenceModel itemReference;

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

  public SupplyRequestOrderedItemModel() {
  }

  public SupplyRequestOrderedItemModel(SupplyRequestOrderedItem o) {
    this.id = o.getId();
      this.quantity = Quantity.toJson(o.getQuantity());
      this.itemCodeableConcept = CodeableConcept.toJson(o.getItemCodeableConcept());
      if (null != o.getItemReference()) {
      	this.itemreference_id = "itemReference" + this.getId();
        this.itemReference = new ReferenceModel(o.getItemReference());
        this.itemReference.setId(this.itemreference_id);
        this.itemReference.parent_id = this.itemReference.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setItemCodeableConcept( String value) {
    this.itemCodeableConcept = value;
  }
  public String getItemCodeableConcept() {
    return this.itemCodeableConcept;
  }
  public void setItemReference( ReferenceModel value) {
    this.itemReference = value;
  }
  public ReferenceModel getItemReference() {
    return this.itemReference;
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
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("itemCodeableConcept" + "[" + String.valueOf(this.itemCodeableConcept) + "]\n"); 
     builder.append("itemReference" + "[" + String.valueOf(this.itemReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}