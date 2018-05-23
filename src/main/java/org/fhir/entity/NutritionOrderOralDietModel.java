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
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
@Entity
@Table(name="nutritionorderoraldiet")
public class NutritionOrderOralDietModel  implements Serializable {
	private static final long serialVersionUID = 151967883193940352L;
  /**
  * Description: "The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"schedule\"", length = 16777215)
  private String schedule;

  /**
  * Description: "Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet."
  */
  @javax.persistence.Basic
  @Column(name="\"nutrient_id\"")
  private String nutrient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="nutrient_id", insertable=false, updatable=false)
  private java.util.List<NutritionOrderNutrientModel> nutrient;

  /**
  * Description: "Class that describes any texture modifications required for the patient to safely consume various types of solid foods."
  */
  @javax.persistence.Basic
  @Column(name="\"texture_id\"")
  private String texture_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="texture_id", insertable=false, updatable=false)
  private java.util.List<NutritionOrderTextureModel> texture;

  /**
  * Description: "The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"fluidconsistencytype_id\"")
  private String fluidconsistencytype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="fluidconsistencytype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> fluidConsistencyType;

  /**
  * Description: "Free text or additional instructions or information pertaining to the oral diet."
  */
  @javax.persistence.Basic
  @Column(name="\"instruction\"")
  private String instruction;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public NutritionOrderOralDietModel() {
  }

  public NutritionOrderOralDietModel(NutritionOrderOralDiet o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModelFromArray(o.getType(), this.type_id);
    }
    if (null != o.getSchedule()) {
    	this.schedule = JsonUtils.toJson(o.getSchedule());
    }
    if (null != o.getNutrient() && !o.getNutrient().isEmpty()) {
    	this.nutrient_id = "nutrient" + this.id;
    	this.nutrient = NutritionOrderNutrientHelper.toModelFromArray(o.getNutrient(), this.nutrient_id);
    }
    if (null != o.getTexture() && !o.getTexture().isEmpty()) {
    	this.texture_id = "texture" + this.id;
    	this.texture = NutritionOrderTextureHelper.toModelFromArray(o.getTexture(), this.texture_id);
    }
    if (null != o.getFluidConsistencyType() && !o.getFluidConsistencyType().isEmpty()) {
    	this.fluidconsistencytype_id = "fluidconsistencytype" + this.id;
    	this.fluidConsistencyType = CodeableConceptHelper.toModelFromArray(o.getFluidConsistencyType(), this.fluidconsistencytype_id);
    }
    this.instruction = o.getInstruction();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public String getSchedule() {
    return this.schedule;
  }
  public void setSchedule( String value) {
    this.schedule = value;
  }
  public java.util.List<NutritionOrderNutrientModel> getNutrient() {
    return this.nutrient;
  }
  public void setNutrient( java.util.List<NutritionOrderNutrientModel> value) {
    this.nutrient = value;
  }
  public java.util.List<NutritionOrderTextureModel> getTexture() {
    return this.texture;
  }
  public void setTexture( java.util.List<NutritionOrderTextureModel> value) {
    this.texture = value;
  }
  public java.util.List<CodeableConceptModel> getFluidConsistencyType() {
    return this.fluidConsistencyType;
  }
  public void setFluidConsistencyType( java.util.List<CodeableConceptModel> value) {
    this.fluidConsistencyType = value;
  }
  public String getInstruction() {
    return this.instruction;
  }
  public void setInstruction( String value) {
    this.instruction = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[NutritionOrderOralDietModel]:" + "\n");
     builder.append("schedule" + "->" + this.schedule + "\n"); 
     builder.append("instruction" + "->" + this.instruction + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[NutritionOrderOralDietModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("schedule" + "->" + this.schedule + "\n"); 
     builder.append("nutrient" + "->" + this.nutrient + "\n"); 
     builder.append("texture" + "->" + this.texture + "\n"); 
     builder.append("fluidConsistencyType" + "->" + this.fluidConsistencyType + "\n"); 
     builder.append("instruction" + "->" + this.instruction + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}