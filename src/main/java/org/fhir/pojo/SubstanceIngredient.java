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
import org.fhir.entity.SubstanceIngredientModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A homogeneous material with a definite composition."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SubstanceIngredient  extends BackboneElement  {
  /**
  * Description: "The amount of the ingredient in the substance - a concentration ratio."
  */
  protected Ratio quantity;

  /**
  * Description: "Another substance that is a component of this substance."
  */
  protected CodeableConcept substanceCodeableConcept;

  /**
  * Description: "Another substance that is a component of this substance."
  */
  protected Reference substanceReference;

  public SubstanceIngredient() {
  }

  public SubstanceIngredient(SubstanceIngredientModel o) {
    this.id = o.getId();
    this.quantity = RatioHelper.fromJson(o.getQuantity());
    if (null != o.getSubstanceCodeableConcept() && !o.getSubstanceCodeableConcept().isEmpty()) {
      this.substanceCodeableConcept = new CodeableConcept(o.getSubstanceCodeableConcept().get(0));
    }
    if (null != o.getSubstanceReference() && !o.getSubstanceReference().isEmpty()) {
      this.substanceReference = new Reference(o.getSubstanceReference().get(0));
    }
  }

  public void setQuantity( Ratio value) {
    this.quantity = value;
  }
  public Ratio getQuantity() {
    return this.quantity;
  }
  public void setSubstanceCodeableConcept( CodeableConcept value) {
    this.substanceCodeableConcept = value;
  }
  public CodeableConcept getSubstanceCodeableConcept() {
    return this.substanceCodeableConcept;
  }
  public void setSubstanceReference( Reference value) {
    this.substanceReference = value;
  }
  public Reference getSubstanceReference() {
    return this.substanceReference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SubstanceIngredient]:" + "\n");
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.substanceCodeableConcept != null) builder.append("substanceCodeableConcept" + "->" + this.substanceCodeableConcept.toString() + "\n"); 
     if(this.substanceReference != null) builder.append("substanceReference" + "->" + this.substanceReference.toString() + "\n"); ;
    return builder.toString();
  }


}