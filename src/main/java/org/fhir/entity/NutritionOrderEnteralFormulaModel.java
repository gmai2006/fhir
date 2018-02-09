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

/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
@Entity
@Table(name="nutritionorderenteralformula")
public class NutritionOrderEnteralFormulaModel  {
  /**
  * Description: "The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"baseFormulaType\"", length = 16777215)
  private String baseFormulaType;

  /**
  * Description: "The product or brand name of the enteral or infant formula product such as \"ACME Adult Standard Formula\"."
  */
  @javax.persistence.Basic
  @Column(name="\"baseFormulaProductName\"")
  private String baseFormulaProductName;

  /**
  * Description: "Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"additiveType\"", length = 16777215)
  private String additiveType;

  /**
  * Description: "The product or brand name of the type of modular component to be added to the formula."
  */
  @javax.persistence.Basic
  @Column(name="\"additiveProductName\"")
  private String additiveProductName;

  /**
  * Description: "The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"caloricDensity\"", length = 16777215)
  private String caloricDensity;

  /**
  * Description: "The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"routeofAdministration\"", length = 16777215)
  private String routeofAdministration;

  /**
  * Description: "Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<NutritionOrderAdministrationModel> administration = new java.util.ArrayList<>();

  /**
  * Description: "The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"maxVolumeToDeliver\"", length = 16777215)
  private String maxVolumeToDeliver;

  /**
  * Description: "Free text formula administration, feeding instructions or additional instructions or information."
  */
  @javax.persistence.Basic
  @Column(name="\"administrationInstruction\"")
  private String administrationInstruction;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public NutritionOrderEnteralFormulaModel() {
  }

  public NutritionOrderEnteralFormulaModel(NutritionOrderEnteralFormula o) {
    this.id = o.getId();
      this.baseFormulaType = CodeableConcept.toJson(o.getBaseFormulaType());
      this.baseFormulaProductName = o.getBaseFormulaProductName();

      this.additiveType = CodeableConcept.toJson(o.getAdditiveType());
      this.additiveProductName = o.getAdditiveProductName();

      this.caloricDensity = Quantity.toJson(o.getCaloricDensity());
      this.routeofAdministration = CodeableConcept.toJson(o.getRouteofAdministration());
      this.administration = NutritionOrderAdministration.toModelArray(o.getAdministration());

      this.maxVolumeToDeliver = Quantity.toJson(o.getMaxVolumeToDeliver());
      this.administrationInstruction = o.getAdministrationInstruction();

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setBaseFormulaType( String value) {
    this.baseFormulaType = value;
  }
  public String getBaseFormulaType() {
    return this.baseFormulaType;
  }
  public void setBaseFormulaProductName( String value) {
    this.baseFormulaProductName = value;
  }
  public String getBaseFormulaProductName() {
    return this.baseFormulaProductName;
  }
  public void setAdditiveType( String value) {
    this.additiveType = value;
  }
  public String getAdditiveType() {
    return this.additiveType;
  }
  public void setAdditiveProductName( String value) {
    this.additiveProductName = value;
  }
  public String getAdditiveProductName() {
    return this.additiveProductName;
  }
  public void setCaloricDensity( String value) {
    this.caloricDensity = value;
  }
  public String getCaloricDensity() {
    return this.caloricDensity;
  }
  public void setRouteofAdministration( String value) {
    this.routeofAdministration = value;
  }
  public String getRouteofAdministration() {
    return this.routeofAdministration;
  }
  public void setAdministration( java.util.List<NutritionOrderAdministrationModel> value) {
    this.administration = value;
  }
  public java.util.List<NutritionOrderAdministrationModel> getAdministration() {
    return this.administration;
  }
  public void setMaxVolumeToDeliver( String value) {
    this.maxVolumeToDeliver = value;
  }
  public String getMaxVolumeToDeliver() {
    return this.maxVolumeToDeliver;
  }
  public void setAdministrationInstruction( String value) {
    this.administrationInstruction = value;
  }
  public String getAdministrationInstruction() {
    return this.administrationInstruction;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("baseFormulaType" + "[" + String.valueOf(this.baseFormulaType) + "]\n"); 
     builder.append("baseFormulaProductName" + "[" + String.valueOf(this.baseFormulaProductName) + "]\n"); 
     builder.append("additiveType" + "[" + String.valueOf(this.additiveType) + "]\n"); 
     builder.append("additiveProductName" + "[" + String.valueOf(this.additiveProductName) + "]\n"); 
     builder.append("caloricDensity" + "[" + String.valueOf(this.caloricDensity) + "]\n"); 
     builder.append("routeofAdministration" + "[" + String.valueOf(this.routeofAdministration) + "]\n"); 
     builder.append("administration" + "[" + String.valueOf(this.administration) + "]\n"); 
     builder.append("maxVolumeToDeliver" + "[" + String.valueOf(this.maxVolumeToDeliver) + "]\n"); 
     builder.append("administrationInstruction" + "[" + String.valueOf(this.administrationInstruction) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}