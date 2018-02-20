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
import org.fhir.entity.SupplyDeliverySuppliedItemModel;
import com.google.gson.GsonBuilder;

/**
* "Record of delivery of what is supplied."
*/
public class SupplyDeliverySuppliedItem  extends BackboneElement  {
  /**
  * Description: "The amount of supply that has been dispensed. Includes unit of measure."
  */
  protected Quantity quantity;

  /**
  * Description: "Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list."
  */
  protected CodeableConcept itemCodeableConcept;

  /**
  * Description: "Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list."
  */
  protected Reference itemReference;

  public SupplyDeliverySuppliedItem() {
  }

  public SupplyDeliverySuppliedItem(SupplyDeliverySuppliedItemModel o) {
    this.id = o.getId();
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getItemCodeableConcept() && !o.getItemCodeableConcept().isEmpty()) {
      this.itemCodeableConcept = new CodeableConcept(o.getItemCodeableConcept().get(0));
    }
    if (null != o.getItemReference() && !o.getItemReference().isEmpty()) {
      this.itemReference = new Reference(o.getItemReference().get(0));
    }
  }

  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setItemCodeableConcept( CodeableConcept value) {
    this.itemCodeableConcept = value;
  }
  public CodeableConcept getItemCodeableConcept() {
    return this.itemCodeableConcept;
  }
  public void setItemReference( Reference value) {
    this.itemReference = value;
  }
  public Reference getItemReference() {
    return this.itemReference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SupplyDeliverySuppliedItem]:" + "\n");
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.itemCodeableConcept != null) builder.append("itemCodeableConcept" + "->" + this.itemCodeableConcept.toString() + "\n"); 
     if(this.itemReference != null) builder.append("itemReference" + "->" + this.itemReference.toString() + "\n"); ;
    return builder.toString();
  }


}