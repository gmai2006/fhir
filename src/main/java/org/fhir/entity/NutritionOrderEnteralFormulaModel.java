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
@Table(name="nutritionorderenteralformula")
public class NutritionOrderEnteralFormulaModel  implements Serializable {
	private static final long serialVersionUID = 151967883206960559L;
  /**
  * Description: "The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula."
  */
  @javax.persistence.Basic
  @Column(name="\"baseformulatype_id\"")
  private String baseformulatype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="baseformulatype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> baseFormulaType;

  /**
  * Description: "The product or brand name of the enteral or infant formula product such as \"ACME Adult Standard Formula\"."
  */
  @javax.persistence.Basic
  @Column(name="\"baseFormulaProductName\"")
  private String baseFormulaProductName;

  /**
  * Description: "Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula."
  */
  @javax.persistence.Basic
  @Column(name="\"additivetype_id\"")
  private String additivetype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="additivetype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> additiveType;

  /**
  * Description: "The product or brand name of the type of modular component to be added to the formula."
  */
  @javax.persistence.Basic
  @Column(name="\"additiveProductName\"")
  private String additiveProductName;

  /**
  * Description: "The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL."
  */
  @javax.persistence.Basic
  @Column(name="\"caloricdensity_id\"")
  private String caloricdensity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="caloricdensity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> caloricDensity;

  /**
  * Description: "The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube."
  */
  @javax.persistence.Basic
  @Column(name="\"routeofadministration_id\"")
  private String routeofadministration_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="routeofadministration_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> routeofAdministration;

  /**
  * Description: "Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours."
  */
  @javax.persistence.Basic
  @Column(name="\"administration_id\"")
  private String administration_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="administration_id", insertable=false, updatable=false)
  private java.util.List<NutritionOrderAdministrationModel> administration;

  /**
  * Description: "The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours."
  */
  @javax.persistence.Basic
  @Column(name="\"maxvolumetodeliver_id\"")
  private String maxvolumetodeliver_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="maxvolumetodeliver_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> maxVolumeToDeliver;

  /**
  * Description: "Free text formula administration, feeding instructions or additional instructions or information."
  */
  @javax.persistence.Basic
  @Column(name="\"administrationInstruction\"")
  private String administrationInstruction;

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

  public NutritionOrderEnteralFormulaModel() {
  }

  public NutritionOrderEnteralFormulaModel(NutritionOrderEnteralFormula o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getBaseFormulaType() ) {
    	this.baseformulatype_id = "baseformulatype" + this.id;
    	this.baseFormulaType = CodeableConceptHelper.toModel(o.getBaseFormulaType(), this.baseformulatype_id);
    }
    this.baseFormulaProductName = o.getBaseFormulaProductName();
    if (null != o.getAdditiveType() ) {
    	this.additivetype_id = "additivetype" + this.id;
    	this.additiveType = CodeableConceptHelper.toModel(o.getAdditiveType(), this.additivetype_id);
    }
    this.additiveProductName = o.getAdditiveProductName();
    if (null != o.getCaloricDensity() ) {
    	this.caloricdensity_id = "caloricdensity" + this.id;
    	this.caloricDensity = QuantityHelper.toModel(o.getCaloricDensity(), this.caloricdensity_id);
    }
    if (null != o.getRouteofAdministration() ) {
    	this.routeofadministration_id = "routeofadministration" + this.id;
    	this.routeofAdministration = CodeableConceptHelper.toModel(o.getRouteofAdministration(), this.routeofadministration_id);
    }
    if (null != o.getAdministration() && !o.getAdministration().isEmpty()) {
    	this.administration_id = "administration" + this.id;
    	this.administration = NutritionOrderAdministrationHelper.toModelFromArray(o.getAdministration(), this.administration_id);
    }
    if (null != o.getMaxVolumeToDeliver() ) {
    	this.maxvolumetodeliver_id = "maxvolumetodeliver" + this.id;
    	this.maxVolumeToDeliver = QuantityHelper.toModel(o.getMaxVolumeToDeliver(), this.maxvolumetodeliver_id);
    }
    this.administrationInstruction = o.getAdministrationInstruction();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getBaseFormulaType() {
    return this.baseFormulaType;
  }
  public void setBaseFormulaType( java.util.List<CodeableConceptModel> value) {
    this.baseFormulaType = value;
  }
  public String getBaseFormulaProductName() {
    return this.baseFormulaProductName;
  }
  public void setBaseFormulaProductName( String value) {
    this.baseFormulaProductName = value;
  }
  public java.util.List<CodeableConceptModel> getAdditiveType() {
    return this.additiveType;
  }
  public void setAdditiveType( java.util.List<CodeableConceptModel> value) {
    this.additiveType = value;
  }
  public String getAdditiveProductName() {
    return this.additiveProductName;
  }
  public void setAdditiveProductName( String value) {
    this.additiveProductName = value;
  }
  public java.util.List<QuantityModel> getCaloricDensity() {
    return this.caloricDensity;
  }
  public void setCaloricDensity( java.util.List<QuantityModel> value) {
    this.caloricDensity = value;
  }
  public java.util.List<CodeableConceptModel> getRouteofAdministration() {
    return this.routeofAdministration;
  }
  public void setRouteofAdministration( java.util.List<CodeableConceptModel> value) {
    this.routeofAdministration = value;
  }
  public java.util.List<NutritionOrderAdministrationModel> getAdministration() {
    return this.administration;
  }
  public void setAdministration( java.util.List<NutritionOrderAdministrationModel> value) {
    this.administration = value;
  }
  public java.util.List<QuantityModel> getMaxVolumeToDeliver() {
    return this.maxVolumeToDeliver;
  }
  public void setMaxVolumeToDeliver( java.util.List<QuantityModel> value) {
    this.maxVolumeToDeliver = value;
  }
  public String getAdministrationInstruction() {
    return this.administrationInstruction;
  }
  public void setAdministrationInstruction( String value) {
    this.administrationInstruction = value;
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
    builder.append("[NutritionOrderEnteralFormulaModel]:" + "\n");
     builder.append("baseFormulaProductName" + "->" + this.baseFormulaProductName + "\n"); 
     builder.append("additiveProductName" + "->" + this.additiveProductName + "\n"); 
     builder.append("administrationInstruction" + "->" + this.administrationInstruction + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[NutritionOrderEnteralFormulaModel]:" + "\n");
     builder.append("baseFormulaType" + "->" + this.baseFormulaType + "\n"); 
     builder.append("baseFormulaProductName" + "->" + this.baseFormulaProductName + "\n"); 
     builder.append("additiveType" + "->" + this.additiveType + "\n"); 
     builder.append("additiveProductName" + "->" + this.additiveProductName + "\n"); 
     builder.append("caloricDensity" + "->" + this.caloricDensity + "\n"); 
     builder.append("routeofAdministration" + "->" + this.routeofAdministration + "\n"); 
     builder.append("administration" + "->" + this.administration + "\n"); 
     builder.append("maxVolumeToDeliver" + "->" + this.maxVolumeToDeliver + "\n"); 
     builder.append("administrationInstruction" + "->" + this.administrationInstruction + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}