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
import org.fhir.entity.MedicationContentModel;
import com.google.gson.GsonBuilder;

/**
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
*/
public class MedicationContent  extends BackboneElement  {
  /**
  * Description: "Identifies one of the items in the package."
  */
  protected CodeableConcept itemCodeableConcept;

  /**
  * Description: "Identifies one of the items in the package."
  */
  protected Reference itemReference;

  /**
  * Description: "The amount of the product that is in the package."
  */
  protected Quantity amount;

  public MedicationContent() {
  }

  public MedicationContent(MedicationContentModel o) {
    this.id = o.getId();
    if (null != o.getItemCodeableConcept() && !o.getItemCodeableConcept().isEmpty()) {
      this.itemCodeableConcept = new CodeableConcept(o.getItemCodeableConcept().get(0));
    }
    if (null != o.getItemReference() && !o.getItemReference().isEmpty()) {
      this.itemReference = new Reference(o.getItemReference().get(0));
    }
    if (null != o.getAmount() && !o.getAmount().isEmpty()) {
      this.amount = new Quantity(o.getAmount().get(0));
    }
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
  public void setAmount( Quantity value) {
    this.amount = value;
  }
  public Quantity getAmount() {
    return this.amount;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationContent]:" + "\n");
     if(this.itemCodeableConcept != null) builder.append("itemCodeableConcept" + "->" + this.itemCodeableConcept.toString() + "\n"); 
     if(this.itemReference != null) builder.append("itemReference" + "->" + this.itemReference.toString() + "\n"); 
     if(this.amount != null) builder.append("amount" + "->" + this.amount.toString() + "\n"); ;
    return builder.toString();
  }


}