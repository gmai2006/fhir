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
import org.fhir.entity.NutritionOrderEnteralFormulaModel;
import com.google.gson.GsonBuilder;

/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
public class NutritionOrderEnteralFormula  {
  /**
  * Description: "The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula."
  */
  private CodeableConcept baseFormulaType;

  /**
  * Description: "The product or brand name of the enteral or infant formula product such as \"ACME Adult Standard Formula\"."
  */
  private String baseFormulaProductName;

  /**
  * Description: "Extensions for baseFormulaProductName"
  */
  private transient Element _baseFormulaProductName;

  /**
  * Description: "Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula."
  */
  private CodeableConcept additiveType;

  /**
  * Description: "The product or brand name of the type of modular component to be added to the formula."
  */
  private String additiveProductName;

  /**
  * Description: "Extensions for additiveProductName"
  */
  private transient Element _additiveProductName;

  /**
  * Description: "The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL."
  */
  private Quantity caloricDensity;

  /**
  * Description: "The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube."
  */
  private CodeableConcept routeofAdministration;

  /**
  * Description: "Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours."
  */
  private java.util.List<NutritionOrderAdministration> administration = new java.util.ArrayList<>();

  /**
  * Description: "The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours."
  */
  private Quantity maxVolumeToDeliver;

  /**
  * Description: "Free text formula administration, feeding instructions or additional instructions or information."
  */
  private String administrationInstruction;

  /**
  * Description: "Extensions for administrationInstruction"
  */
  private transient Element _administrationInstruction;

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

  public NutritionOrderEnteralFormula() {
  }

  public NutritionOrderEnteralFormula(NutritionOrderEnteralFormulaModel o) {
    this.id = o.getId();
    this.baseFormulaType = CodeableConceptHelper.fromJson(o.getBaseFormulaType());
    if (null != o.getBaseFormulaProductName()) {
      this.baseFormulaProductName = o.getBaseFormulaProductName();
    }
    this.additiveType = CodeableConceptHelper.fromJson(o.getAdditiveType());
    if (null != o.getAdditiveProductName()) {
      this.additiveProductName = o.getAdditiveProductName();
    }
    this.caloricDensity = QuantityHelper.fromJson(o.getCaloricDensity());
    this.routeofAdministration = CodeableConceptHelper.fromJson(o.getRouteofAdministration());
    if (null != o.getAdministration() && !o.getAdministration().isEmpty()) {
    	this.administration = NutritionOrderAdministrationHelper.fromArray2Array(o.getAdministration());
    }
    this.maxVolumeToDeliver = QuantityHelper.fromJson(o.getMaxVolumeToDeliver());
    if (null != o.getAdministrationInstruction()) {
      this.administrationInstruction = o.getAdministrationInstruction();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setBaseFormulaType( CodeableConcept value) {
    this.baseFormulaType = value;
  }
  public CodeableConcept getBaseFormulaType() {
    return this.baseFormulaType;
  }
  public void setBaseFormulaProductName( String value) {
    this.baseFormulaProductName = value;
  }
  public String getBaseFormulaProductName() {
    return this.baseFormulaProductName;
  }
  public void set_baseFormulaProductName( Element value) {
    this._baseFormulaProductName = value;
  }
  public Element get_baseFormulaProductName() {
    return this._baseFormulaProductName;
  }
  public void setAdditiveType( CodeableConcept value) {
    this.additiveType = value;
  }
  public CodeableConcept getAdditiveType() {
    return this.additiveType;
  }
  public void setAdditiveProductName( String value) {
    this.additiveProductName = value;
  }
  public String getAdditiveProductName() {
    return this.additiveProductName;
  }
  public void set_additiveProductName( Element value) {
    this._additiveProductName = value;
  }
  public Element get_additiveProductName() {
    return this._additiveProductName;
  }
  public void setCaloricDensity( Quantity value) {
    this.caloricDensity = value;
  }
  public Quantity getCaloricDensity() {
    return this.caloricDensity;
  }
  public void setRouteofAdministration( CodeableConcept value) {
    this.routeofAdministration = value;
  }
  public CodeableConcept getRouteofAdministration() {
    return this.routeofAdministration;
  }
  public void setAdministration( java.util.List<NutritionOrderAdministration> value) {
    this.administration = value;
  }
  public java.util.List<NutritionOrderAdministration> getAdministration() {
    return this.administration;
  }
  public void setMaxVolumeToDeliver( Quantity value) {
    this.maxVolumeToDeliver = value;
  }
  public Quantity getMaxVolumeToDeliver() {
    return this.maxVolumeToDeliver;
  }
  public void setAdministrationInstruction( String value) {
    this.administrationInstruction = value;
  }
  public String getAdministrationInstruction() {
    return this.administrationInstruction;
  }
  public void set_administrationInstruction( Element value) {
    this._administrationInstruction = value;
  }
  public Element get_administrationInstruction() {
    return this._administrationInstruction;
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
    builder.append("[NutritionOrderEnteralFormula]:" + "\n");
     if(this.baseFormulaType != null) builder.append("baseFormulaType" + "->" + this.baseFormulaType.toString() + "\n"); 
     if(this.baseFormulaProductName != null) builder.append("baseFormulaProductName" + "->" + this.baseFormulaProductName.toString() + "\n"); 
     if(this._baseFormulaProductName != null) builder.append("_baseFormulaProductName" + "->" + this._baseFormulaProductName.toString() + "\n"); 
     if(this.additiveType != null) builder.append("additiveType" + "->" + this.additiveType.toString() + "\n"); 
     if(this.additiveProductName != null) builder.append("additiveProductName" + "->" + this.additiveProductName.toString() + "\n"); 
     if(this._additiveProductName != null) builder.append("_additiveProductName" + "->" + this._additiveProductName.toString() + "\n"); 
     if(this.caloricDensity != null) builder.append("caloricDensity" + "->" + this.caloricDensity.toString() + "\n"); 
     if(this.routeofAdministration != null) builder.append("routeofAdministration" + "->" + this.routeofAdministration.toString() + "\n"); 
     if(this.administration != null) builder.append("administration" + "->" + this.administration.toString() + "\n"); 
     if(this.maxVolumeToDeliver != null) builder.append("maxVolumeToDeliver" + "->" + this.maxVolumeToDeliver.toString() + "\n"); 
     if(this.administrationInstruction != null) builder.append("administrationInstruction" + "->" + this.administrationInstruction.toString() + "\n"); 
     if(this._administrationInstruction != null) builder.append("_administrationInstruction" + "->" + this._administrationInstruction.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}