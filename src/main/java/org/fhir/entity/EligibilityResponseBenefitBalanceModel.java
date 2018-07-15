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
* "This resource provides eligibility and plan details from the processing of an Eligibility resource."
* generated on 07/14/2018
*/
@Entity
@Table(name="eligibilityresponsebenefitbalance")
public class EligibilityResponseBenefitBalanceModel  implements Serializable {
	private static final long serialVersionUID = 153159210217748694L;
  /**
  * Description: "Dental, Vision, Medical, Pharmacy, Rehab etc."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "Dental: basic, major, ortho; Vision exam, glasses, contacts; etc."
  */
  @javax.persistence.Basic
  @Column(name="\"subcategory_id\"")
  private String subcategory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subcategory_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> subCategory;

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
  */
  @javax.persistence.Basic
  @Column(name="\"network_id\"")
  private String network_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="network_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> network;

  /**
  * Description: "Unit designation: individual or family."
  */
  @javax.persistence.Basic
  @Column(name="\"unit_id\"")
  private String unit_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="unit_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> unit;

  /**
  * Description: "The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual vistis'."
  */
  @javax.persistence.Basic
  @Column(name="\"term_id\"")
  private String term_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="term_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> term;

  /**
  * Description: "Benefits Used to date."
  */
  @javax.persistence.Basic
  @Column(name="\"financial_id\"")
  private String financial_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="financial_id", insertable=false, updatable=false)
  private java.util.List<EligibilityResponseFinancialModel> financial;

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

  public EligibilityResponseBenefitBalanceModel() {
  }

  public EligibilityResponseBenefitBalanceModel(EligibilityResponseBenefitBalance o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCategory() ) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModel(o.getCategory(), this.category_id);
    }
    if (null != o.getSubCategory() ) {
    	this.subcategory_id = "subcategory" + this.id;
    	this.subCategory = CodeableConceptHelper.toModel(o.getSubCategory(), this.subcategory_id);
    }
    this.excluded = o.getExcluded();
    this.name = o.getName();
    this.description = o.getDescription();
    if (null != o.getNetwork() ) {
    	this.network_id = "network" + this.id;
    	this.network = CodeableConceptHelper.toModel(o.getNetwork(), this.network_id);
    }
    if (null != o.getUnit() ) {
    	this.unit_id = "unit" + this.id;
    	this.unit = CodeableConceptHelper.toModel(o.getUnit(), this.unit_id);
    }
    if (null != o.getTerm() ) {
    	this.term_id = "term" + this.id;
    	this.term = CodeableConceptHelper.toModel(o.getTerm(), this.term_id);
    }
    if (null != o.getFinancial() && !o.getFinancial().isEmpty()) {
    	this.financial_id = "financial" + this.id;
    	this.financial = EligibilityResponseFinancialHelper.toModelFromArray(o.getFinancial(), this.financial_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getSubCategory() {
    return this.subCategory;
  }
  public void setSubCategory( java.util.List<CodeableConceptModel> value) {
    this.subCategory = value;
  }
  public Boolean getExcluded() {
    return this.excluded;
  }
  public void setExcluded( Boolean value) {
    this.excluded = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<CodeableConceptModel> getNetwork() {
    return this.network;
  }
  public void setNetwork( java.util.List<CodeableConceptModel> value) {
    this.network = value;
  }
  public java.util.List<CodeableConceptModel> getUnit() {
    return this.unit;
  }
  public void setUnit( java.util.List<CodeableConceptModel> value) {
    this.unit = value;
  }
  public java.util.List<CodeableConceptModel> getTerm() {
    return this.term;
  }
  public void setTerm( java.util.List<CodeableConceptModel> value) {
    this.term = value;
  }
  public java.util.List<EligibilityResponseFinancialModel> getFinancial() {
    return this.financial;
  }
  public void setFinancial( java.util.List<EligibilityResponseFinancialModel> value) {
    this.financial = value;
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
    builder.append("[EligibilityResponseBenefitBalanceModel]:" + "\n");
     builder.append("excluded" + "->" + this.excluded + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EligibilityResponseBenefitBalanceModel]:" + "\n");
     builder.append("excluded" + "->" + this.excluded + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}