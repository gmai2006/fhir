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
import com.google.gson.GsonBuilder;

/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
public class NutritionOrderOralDiet  {
  /**
  * Description: "The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet."
  */
  private java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present."
  */
  private java.util.List<Timing> schedule = new java.util.ArrayList<>();

  /**
  * Description: "Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet."
  */
  private java.util.List<NutritionOrderNutrient> nutrient = new java.util.ArrayList<>();

  /**
  * Description: "Class that describes any texture modifications required for the patient to safely consume various types of solid foods."
  */
  private java.util.List<NutritionOrderTexture> texture = new java.util.ArrayList<>();

  /**
  * Description: "The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient."
  */
  private java.util.List<CodeableConcept> fluidConsistencyType = new java.util.ArrayList<>();

  /**
  * Description: "Free text or additional instructions or information pertaining to the oral diet."
  */
  private String instruction;

  /**
  * Description: "Extensions for instruction"
  */
  private transient Element _instruction;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public NutritionOrderOralDiet() {
  }

  public NutritionOrderOralDiet(NutritionOrderOralDietModel o) {
    this.id = o.getId();
    if (null != o.getNutrient() && !o.getNutrient().isEmpty()) {
    	this.nutrient = NutritionOrderNutrientHelper.fromArray2Array(o.getNutrient());
    }
    if (null != o.getTexture() && !o.getTexture().isEmpty()) {
    	this.texture = NutritionOrderTextureHelper.fromArray2Array(o.getTexture());
    }
    if (null != o.getInstruction()) {
      this.instruction = o.getInstruction();
    }
    if (null != o.getId()) {
      this.id = o.getId();
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
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
     if(this._instruction != null) builder.append("_instruction" + "->" + this._instruction.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}