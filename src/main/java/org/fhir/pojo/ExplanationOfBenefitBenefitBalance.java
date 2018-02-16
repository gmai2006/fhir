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
import org.fhir.entity.ExplanationOfBenefitBenefitBalanceModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitBenefitBalance  extends BackboneElement  {
  /**
  * Description: "Dental, Vision, Medical, Pharmacy, Rehab etc."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept category;

  /**
  * Description: "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc."
  */
  protected CodeableConcept subCategory;

  /**
  * Description: "True if the indicated class of service is excluded from the plan, missing or False indicated the service is included in the coverage."
  */
  protected Boolean excluded;

  /**
  * Description: "Extensions for excluded"
  */
  protected transient Element _excluded;

  /**
  * Description: "A short name or tag for the benefit, for example MED01, or DENT2."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Network designation."
  */
  protected CodeableConcept network;

  /**
  * Description: "Unit designation: individual or family."
  */
  protected CodeableConcept unit;

  /**
  * Description: "The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'."
  */
  protected CodeableConcept term;

  /**
  * Description: "Benefits Used to date."
  */
  protected java.util.List<ExplanationOfBenefitFinancial> financial = new java.util.ArrayList<>();

  public ExplanationOfBenefitBenefitBalance() {
  }

  public ExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalanceModel o) {
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
    	this.financial = ExplanationOfBenefitFinancialHelper.fromArray2Array(o.getFinancial());
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
  public void setFinancial( java.util.List<ExplanationOfBenefitFinancial> value) {
    this.financial = value;
  }
  public java.util.List<ExplanationOfBenefitFinancial> getFinancial() {
    return this.financial;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitBenefitBalance]:" + "\n");
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
     if(this.financial != null) builder.append("financial" + "->" + this.financial.toString() + "\n"); ;
    return builder.toString();
  }


}