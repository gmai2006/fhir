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
import org.fhir.entity.NutritionOrderNutrientModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NutritionOrderNutrient  extends BackboneElement  {
  /**
  * Description: "The nutrient that is being modified such as carbohydrate or sodium."
  */
  protected CodeableConcept modifier;

  /**
  * Description: "The quantity of the specified nutrient to include in diet."
  */
  protected Quantity amount;

  public NutritionOrderNutrient() {
  }

  public NutritionOrderNutrient(NutritionOrderNutrientModel o) {
    this.id = o.getId();
    if (null != o.getModifier() && !o.getModifier().isEmpty()) {
      this.modifier = new CodeableConcept(o.getModifier().get(0));
    }
    if (null != o.getAmount() && !o.getAmount().isEmpty()) {
      this.amount = new Quantity(o.getAmount().get(0));
    }
  }

  public void setModifier( CodeableConcept value) {
    this.modifier = value;
  }
  public CodeableConcept getModifier() {
    return this.modifier;
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
    builder.append("[NutritionOrderNutrient]:" + "\n");
     if(this.modifier != null) builder.append("modifier" + "->" + this.modifier.toString() + "\n"); 
     if(this.amount != null) builder.append("amount" + "->" + this.amount.toString() + "\n"); ;
    return builder.toString();
  }


}