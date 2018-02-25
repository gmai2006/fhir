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
import org.fhir.entity.MedicationIngredientModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicationIngredient  extends BackboneElement  {
  /**
  * Description: "The actual ingredient - either a substance (simple ingredient) or another medication."
  */
  protected CodeableConcept itemCodeableConcept;

  /**
  * Description: "The actual ingredient - either a substance (simple ingredient) or another medication."
  */
  protected Reference itemReference;

  /**
  * Description: "Indication of whether this ingredient affects the therapeutic action of the drug."
  */
  protected Boolean isActive;

  /**
  * Description: "Extensions for isActive"
  */
  protected transient Element _isActive;

  /**
  * Description: "Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet."
  */
  protected Ratio amount;

  public MedicationIngredient() {
  }

  public MedicationIngredient(MedicationIngredientModel o) {
    this.id = o.getId();
    if (null != o.getItemCodeableConcept() && !o.getItemCodeableConcept().isEmpty()) {
      this.itemCodeableConcept = new CodeableConcept(o.getItemCodeableConcept().get(0));
    }
    if (null != o.getItemReference() && !o.getItemReference().isEmpty()) {
      this.itemReference = new Reference(o.getItemReference().get(0));
    }
    if (null != o.getIsActive()) {
      this.isActive = o.getIsActive();
    }
    this.amount = RatioHelper.fromJson(o.getAmount());
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
  public void setIsActive( Boolean value) {
    this.isActive = value;
  }
  public Boolean getIsActive() {
    return this.isActive;
  }
  public void set_isActive( Element value) {
    this._isActive = value;
  }
  public Element get_isActive() {
    return this._isActive;
  }
  public void setAmount( Ratio value) {
    this.amount = value;
  }
  public Ratio getAmount() {
    return this.amount;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationIngredient]:" + "\n");
     if(this.itemCodeableConcept != null) builder.append("itemCodeableConcept" + "->" + this.itemCodeableConcept.toString() + "\n"); 
     if(this.itemReference != null) builder.append("itemReference" + "->" + this.itemReference.toString() + "\n"); 
     if(this.isActive != null) builder.append("isActive" + "->" + this.isActive.toString() + "\n"); 
     if(this._isActive != null) builder.append("_isActive" + "->" + this._isActive.toString() + "\n"); 
     if(this.amount != null) builder.append("amount" + "->" + this.amount.toString() + "\n"); ;
    return builder.toString();
  }


}