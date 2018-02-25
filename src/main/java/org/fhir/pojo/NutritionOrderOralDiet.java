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
import org.fhir.entity.NutritionOrderOralDietModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NutritionOrderOralDiet  extends BackboneElement  {
  /**
  * Description: "The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet."
  */
  protected java.util.List<CodeableConcept> type;

  /**
  * Description: "The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present."
  */
  protected java.util.List<Timing> schedule;

  /**
  * Description: "Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet."
  */
  protected java.util.List<NutritionOrderNutrient> nutrient;

  /**
  * Description: "Class that describes any texture modifications required for the patient to safely consume various types of solid foods."
  */
  protected java.util.List<NutritionOrderTexture> texture;

  /**
  * Description: "The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient."
  */
  protected java.util.List<CodeableConcept> fluidConsistencyType;

  /**
  * Description: "Free text or additional instructions or information pertaining to the oral diet."
  */
  protected String instruction;

  /**
  * Description: "Extensions for instruction"
  */
  protected transient Element _instruction;

  public NutritionOrderOralDiet() {
  }

  public NutritionOrderOralDiet(NutritionOrderOralDietModel o) {
    this.id = o.getId();
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type = CodeableConceptHelper.fromArray2Array(o.getType());
    }
    if (null != o.getNutrient() && !o.getNutrient().isEmpty()) {
    	this.nutrient = NutritionOrderNutrientHelper.fromArray2Array(o.getNutrient());
    }
    if (null != o.getTexture() && !o.getTexture().isEmpty()) {
    	this.texture = NutritionOrderTextureHelper.fromArray2Array(o.getTexture());
    }
    if (null != o.getFluidConsistencyType() && !o.getFluidConsistencyType().isEmpty()) {
    	this.fluidConsistencyType = CodeableConceptHelper.fromArray2Array(o.getFluidConsistencyType());
    }
    if (null != o.getInstruction()) {
      this.instruction = o.getInstruction();
    }
  }

  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
  }
  public void setSchedule( java.util.List<Timing> value) {
    this.schedule = value;
  }
  public java.util.List<Timing> getSchedule() {
    return this.schedule;
  }
  public void setNutrient( java.util.List<NutritionOrderNutrient> value) {
    this.nutrient = value;
  }
  public java.util.List<NutritionOrderNutrient> getNutrient() {
    return this.nutrient;
  }
  public void setTexture( java.util.List<NutritionOrderTexture> value) {
    this.texture = value;
  }
  public java.util.List<NutritionOrderTexture> getTexture() {
    return this.texture;
  }
  public void setFluidConsistencyType( java.util.List<CodeableConcept> value) {
    this.fluidConsistencyType = value;
  }
  public java.util.List<CodeableConcept> getFluidConsistencyType() {
    return this.fluidConsistencyType;
  }
  public void setInstruction( String value) {
    this.instruction = value;
  }
  public String getInstruction() {
    return this.instruction;
  }
  public void set_instruction( Element value) {
    this._instruction = value;
  }
  public Element get_instruction() {
    return this._instruction;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[NutritionOrderOralDiet]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.schedule != null) builder.append("schedule" + "->" + this.schedule.toString() + "\n"); 
     if(this.nutrient != null) builder.append("nutrient" + "->" + this.nutrient.toString() + "\n"); 
     if(this.texture != null) builder.append("texture" + "->" + this.texture.toString() + "\n"); 
     if(this.fluidConsistencyType != null) builder.append("fluidConsistencyType" + "->" + this.fluidConsistencyType.toString() + "\n"); 
     if(this.instruction != null) builder.append("instruction" + "->" + this.instruction.toString() + "\n"); 
     if(this._instruction != null) builder.append("_instruction" + "->" + this._instruction.toString() + "\n"); ;
    return builder.toString();
  }


}