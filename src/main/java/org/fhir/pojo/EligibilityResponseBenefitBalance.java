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
import org.fhir.entity.EligibilityResponseBenefitBalanceModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides eligibility and plan details from the processing of an Eligibility resource."
*/
public class EligibilityResponseBenefitBalance  {
  /**
  * Description: "Dental, Vision, Medical, Pharmacy, Rehab etc."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept category;

  /**
  * Description: "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc."
  */
  private CodeableConcept subCategory;

  /**
  * Description: "True if the indicated class of service is excluded from the plan, missing or False indicated the service is included in the coverage."
  */
  private Boolean excluded;

  /**
  * Description: "Extensions for excluded"
  */
  private transient Element _excluded;

  /**
  * Description: "A short name or tag for the benefit, for example MED01, or DENT2."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Network designation."
  */
  private CodeableConcept network;

  /**
  * Description: "Unit designation: individual or family."
  */
  private CodeableConcept unit;

  /**
  * Description: "The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'."
  */
  private CodeableConcept term;

  /**
  * Description: "Benefits Used to date."
  */
  private java.util.List<EligibilityResponseFinancial> financial = new java.util.ArrayList<>();

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

  public EligibilityResponseBenefitBalance() {
  }

  public EligibilityResponseBenefitBalance(EligibilityResponseBenefitBalanceModel o) {
    this.id = o.getId();
    this.category = CodeableConceptHelper.fromJson(o.getCategory());
    this.subCategory = CodeableConceptHelper.fromJson(o.getSubCategory());
    if (null != o.getExcluded()) {
      this.excluded = o.getExcluded();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    this.network = CodeableConceptHelper.fromJson(o.getNetwork());
    this.unit = CodeableConceptHelper.fromJson(o.getUnit());
    this.term = CodeableConceptHelper.fromJson(o.getTerm());
    if (null != o.getFinancial() && !o.getFinancial().isEmpty()) {
    	this.financial = EligibilityResponseFinancialHelper.fromArray2Array(o.getFinancial());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setSubCategory( CodeableConcept value) {
    this.subCategory = value;
  }
  public CodeableConcept getSubCategory() {
    return this.subCategory;
  }
  public void setExcluded( Boolean value) {
    this.excluded = value;
  }
  public Boolean getExcluded() {
    return this.excluded;
  }
  public void set_excluded( Element value) {
    this._excluded = value;
  }
  public Element get_excluded() {
    return this._excluded;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setNetwork( CodeableConcept value) {
    this.network = value;
  }
  public CodeableConcept getNetwork() {
    return this.network;
  }
  public void setUnit( CodeableConcept value) {
    this.unit = value;
  }
  public CodeableConcept getUnit() {
    return this.unit;
  }
  public void setTerm( CodeableConcept value) {
    this.term = value;
  }
  public CodeableConcept getTerm() {
    return this.term;
  }
  public void setFinancial( java.util.List<EligibilityResponseFinancial> value) {
    this.financial = value;
  }
  public java.util.List<EligibilityResponseFinancial> getFinancial() {
    return this.financial;
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
    builder.append("[EligibilityResponseBenefitBalance]:" + "\n");
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.subCategory != null) builder.append("subCategory" + "->" + this.subCategory.toString() + "\n"); 
     if(this.excluded != null) builder.append("excluded" + "->" + this.excluded.toString() + "\n"); 
     if(this._excluded != null) builder.append("_excluded" + "->" + this._excluded.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.network != null) builder.append("network" + "->" + this.network.toString() + "\n"); 
     if(this.unit != null) builder.append("unit" + "->" + this.unit.toString() + "\n"); 
     if(this.term != null) builder.append("term" + "->" + this.term.toString() + "\n"); 
     if(this.financial != null) builder.append("financial" + "->" + this.financial.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}