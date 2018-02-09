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
public class ExplanationOfBenefitBenefitBalance  {
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
  private java.util.List<ExplanationOfBenefitFinancial> financial = new java.util.ArrayList<>();

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

  public ExplanationOfBenefitBenefitBalance() {
  }

  public ExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalanceModel o) {
    this.id = o.getId();
      this.category = CodeableConcept.fromJson(o.getCategory());
      this.subCategory = CodeableConcept.fromJson(o.getSubCategory());
      if (null != o.getExcluded()) {
        this.excluded = new Boolean(o.getExcluded());
      }

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.network = CodeableConcept.fromJson(o.getNetwork());
      this.unit = CodeableConcept.fromJson(o.getUnit());
      this.term = CodeableConcept.fromJson(o.getTerm());
      this.financial = ExplanationOfBenefitFinancial.fromArray(o.getFinancial());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("subCategory" + "[" + String.valueOf(this.subCategory) + "]\n"); 
     builder.append("excluded" + "[" + String.valueOf(this.excluded) + "]\n"); 
     builder.append("_excluded" + "[" + String.valueOf(this._excluded) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("network" + "[" + String.valueOf(this.network) + "]\n"); 
     builder.append("unit" + "[" + String.valueOf(this.unit) + "]\n"); 
     builder.append("term" + "[" + String.valueOf(this.term) + "]\n"); 
     builder.append("financial" + "[" + String.valueOf(this.financial) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ExplanationOfBenefitBenefitBalance> fromArray(java.util.List<ExplanationOfBenefitBenefitBalanceModel> list) {
    return (java.util.List<ExplanationOfBenefitBenefitBalance>)list.stream()
      .map(model -> new ExplanationOfBenefitBenefitBalance(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ExplanationOfBenefitBenefitBalanceModel> toModelArray(java.util.List<ExplanationOfBenefitBenefitBalance> list) {
    return (java.util.List<ExplanationOfBenefitBenefitBalanceModel>)list.stream()
      .map(model -> new ExplanationOfBenefitBenefitBalanceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ExplanationOfBenefitBenefitBalance fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ExplanationOfBenefitBenefitBalance.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ExplanationOfBenefitBenefitBalance o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ExplanationOfBenefitBenefitBalance> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}