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
* "This resource provides eligibility and plan details from the processing of an Eligibility resource."
*/
@Entity
@Table(name="eligibilityresponsebenefitbalance")
public class EligibilityResponseBenefitBalanceModel  {
  /**
  * Description: "Dental, Vision, Medical, Pharmacy, Rehab etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"subCategory\"", length = 16777215)
  private String subCategory;

  /**
  * Description: "True if the indicated class of service is excluded from the plan, missing or False indicated the service is included in the coverage."
  */
  @javax.persistence.Basic
  @Column(name="\"excluded\"")
  private Boolean excluded;

  /**
  * Description: "A short name or tag for the benefit, for example MED01, or DENT2."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "A richer description of the benefit, for example 'DENT2 covers 100% of basic, 50% of major but exclused Ortho, Implants and Costmetic services'."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Network designation."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"network\"", length = 16777215)
  private String network;

  /**
  * Description: "Unit designation: individual or family."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"unit\"", length = 16777215)
  private String unit;

  /**
  * Description: "The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"term\"", length = 16777215)
  private String term;

  /**
  * Description: "Benefits Used to date."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<EligibilityResponseFinancialModel> financial = new java.util.ArrayList<>();

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

  public EligibilityResponseBenefitBalanceModel() {
  }

  public EligibilityResponseBenefitBalanceModel(EligibilityResponseBenefitBalance o) {
    this.id = o.getId();
      this.category = CodeableConcept.toJson(o.getCategory());
      this.subCategory = CodeableConcept.toJson(o.getSubCategory());
      this.excluded = o.getExcluded();

      this.name = o.getName();

      this.description = o.getDescription();

      this.network = CodeableConcept.toJson(o.getNetwork());
      this.unit = CodeableConcept.toJson(o.getUnit());
      this.term = CodeableConcept.toJson(o.getTerm());
      this.financial = EligibilityResponseFinancial.toModelArray(o.getFinancial());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setSubCategory( String value) {
    this.subCategory = value;
  }
  public String getSubCategory() {
    return this.subCategory;
  }
  public void setExcluded( Boolean value) {
    this.excluded = value;
  }
  public Boolean getExcluded() {
    return this.excluded;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setNetwork( String value) {
    this.network = value;
  }
  public String getNetwork() {
    return this.network;
  }
  public void setUnit( String value) {
    this.unit = value;
  }
  public String getUnit() {
    return this.unit;
  }
  public void setTerm( String value) {
    this.term = value;
  }
  public String getTerm() {
    return this.term;
  }
  public void setFinancial( java.util.List<EligibilityResponseFinancialModel> value) {
    this.financial = value;
  }
  public java.util.List<EligibilityResponseFinancialModel> getFinancial() {
    return this.financial;
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
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("subCategory" + "[" + String.valueOf(this.subCategory) + "]\n"); 
     builder.append("excluded" + "[" + String.valueOf(this.excluded) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("network" + "[" + String.valueOf(this.network) + "]\n"); 
     builder.append("unit" + "[" + String.valueOf(this.unit) + "]\n"); 
     builder.append("term" + "[" + String.valueOf(this.term) + "]\n"); 
     builder.append("financial" + "[" + String.valueOf(this.financial) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}