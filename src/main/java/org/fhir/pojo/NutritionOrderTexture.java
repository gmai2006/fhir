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
import org.fhir.entity.NutritionOrderTextureModel;
import com.google.gson.GsonBuilder;

/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
public class NutritionOrderTexture  extends BackboneElement  {
  /**
  * Description: "Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed."
  */
  protected CodeableConcept modifier;

  /**
  * Description: "The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types."
  */
  protected CodeableConcept foodType;

  public NutritionOrderTexture() {
  }

  public NutritionOrderTexture(NutritionOrderTextureModel o) {
    this.id = o.getId();
    this.modifier = CodeableConceptHelper.fromJson(o.getModifier());
    this.foodType = CodeableConceptHelper.fromJson(o.getFoodType());
  }

  public void setModifier( CodeableConcept value) {
    this.modifier = value;
  }
  public CodeableConcept getModifier() {
    return this.modifier;
  }
  public void setFoodType( CodeableConcept value) {
    this.foodType = value;
  }
  public CodeableConcept getFoodType() {
    return this.foodType;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[NutritionOrderTexture]:" + "\n");
     if(this.modifier != null) builder.append("modifier" + "->" + this.modifier.toString() + "\n"); 
     if(this.foodType != null) builder.append("foodType" + "->" + this.foodType.toString() + "\n"); ;
    return builder.toString();
  }


}