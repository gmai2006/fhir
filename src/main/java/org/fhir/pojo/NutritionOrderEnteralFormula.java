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
public class NutritionOrderEnteralFormula  extends BackboneElement  {
  /**
  * Description: "The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula."
  */
  protected CodeableConcept baseFormulaType;

  /**
  * Description: "The product or brand name of the enteral or infant formula product such as \"ACME Adult Standard Formula\"."
  */
  protected String baseFormulaProductName;

  /**
  * Description: "Extensions for baseFormulaProductName"
  */
  protected transient Element _baseFormulaProductName;

  /**
  * Description: "Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula."
  */
  protected CodeableConcept additiveType;

  /**
  * Description: "The product or brand name of the type of modular component to be added to the formula."
  */
  protected String additiveProductName;

  /**
  * Description: "Extensions for additiveProductName"
  */
  protected transient Element _additiveProductName;

  /**
  * Description: "The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL."
  */
  protected Quantity caloricDensity;

  /**
  * Description: "The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube."
  */
  protected CodeableConcept routeofAdministration;

  /**
  * Description: "Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours."
  */
  protected java.util.List<NutritionOrderAdministration> administration;

  /**
  * Description: "The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours."
  */
  protected Quantity maxVolumeToDeliver;

  /**
  * Description: "Free text formula administration, feeding instructions or additional instructions or information."
  */
  protected String administrationInstruction;

  /**
  * Description: "Extensions for administrationInstruction"
  */
  protected transient Element _administrationInstruction;

  public NutritionOrderEnteralFormula() {
  }

  public NutritionOrderEnteralFormula(NutritionOrderEnteralFormulaModel o) {
    this.id = o.getId();
    if (null != o.getBaseFormulaType() && !o.getBaseFormulaType().isEmpty()) {
      this.baseFormulaType = new CodeableConcept(o.getBaseFormulaType().get(0));
    }
    if (null != o.getBaseFormulaProductName()) {
      this.baseFormulaProductName = o.getBaseFormulaProductName();
    }
    if (null != o.getAdditiveType() && !o.getAdditiveType().isEmpty()) {
      this.additiveType = new CodeableConcept(o.getAdditiveType().get(0));
    }
    if (null != o.getAdditiveProductName()) {
      this.additiveProductName = o.getAdditiveProductName();
    }
    if (null != o.getCaloricDensity() && !o.getCaloricDensity().isEmpty()) {
      this.caloricDensity = new Quantity(o.getCaloricDensity().get(0));
    }
    if (null != o.getRouteofAdministration() && !o.getRouteofAdministration().isEmpty()) {
      this.routeofAdministration = new CodeableConcept(o.getRouteofAdministration().get(0));
    }
    if (null != o.getAdministration() && !o.getAdministration().isEmpty()) {
    	this.administration = NutritionOrderAdministrationHelper.fromArray2Array(o.getAdministration());
    }
    if (null != o.getMaxVolumeToDeliver() && !o.getMaxVolumeToDeliver().isEmpty()) {
      this.maxVolumeToDeliver = new Quantity(o.getMaxVolumeToDeliver().get(0));
    }
    if (null != o.getAdministrationInstruction()) {
      this.administrationInstruction = o.getAdministrationInstruction();
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
     if(this._administrationInstruction != null) builder.append("_administrationInstruction" + "->" + this._administrationInstruction.toString() + "\n"); ;
    return builder.toString();
  }


}