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
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
*/
@Entity
@Table(name="medicationingredient")
public class MedicationIngredientModel  implements Serializable {
	private static final long serialVersionUID = 151967883161312660L;
  /**
  * Description: "The actual ingredient - either a substance (simple ingredient) or another medication."
  */
  @javax.persistence.Basic
  @Column(name="\"itemcodeableconcept_id\"")
  private String itemcodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="itemcodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> itemCodeableConcept;

  /**
  * Description: "The actual ingredient - either a substance (simple ingredient) or another medication."
  */
  @javax.persistence.Basic
  @Column(name="\"itemreference_id\"")
  private String itemreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="itemreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> itemReference;

  /**
  * Description: "Indication of whether this ingredient affects the therapeutic action of the drug."
  */
  @javax.persistence.Basic
  @Column(name="\"isActive\"")
  private Boolean isActive;

  /**
  * Description: "Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"amount\"", length = 16777215)
  private String amount;

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

  public MedicationIngredientModel() {
  }

  public MedicationIngredientModel(MedicationIngredient o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getItemCodeableConcept() ) {
    	this.itemcodeableconcept_id = "itemcodeableconcept" + this.id;
    	this.itemCodeableConcept = CodeableConceptHelper.toModel(o.getItemCodeableConcept(), this.itemcodeableconcept_id);
    }
    if (null != o.getItemReference() ) {
    	this.itemreference_id = "itemreference" + this.id;
    	this.itemReference = ReferenceHelper.toModel(o.getItemReference(), this.itemreference_id);
    }
    this.isActive = o.getIsActive();
    if (null != o.getAmount()) {
    	this.amount = JsonUtils.toJson(o.getAmount());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getItemCodeableConcept() {
    return this.itemCodeableConcept;
  }
  public void setItemCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.itemCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getItemReference() {
    return this.itemReference;
  }
  public void setItemReference( java.util.List<ReferenceModel> value) {
    this.itemReference = value;
  }
  public Boolean getIsActive() {
    return this.isActive;
  }
  public void setIsActive( Boolean value) {
    this.isActive = value;
  }
  public String getAmount() {
    return this.amount;
  }
  public void setAmount( String value) {
    this.amount = value;
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
    builder.append("[MedicationIngredientModel]:" + "\n");
     builder.append("isActive" + "->" + this.isActive + "\n"); 
     builder.append("amount" + "->" + this.amount + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationIngredientModel]:" + "\n");
     builder.append("itemCodeableConcept" + "->" + this.itemCodeableConcept + "\n"); 
     builder.append("itemReference" + "->" + this.itemReference + "\n"); 
     builder.append("isActive" + "->" + this.isActive + "\n"); 
     builder.append("amount" + "->" + this.amount + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}