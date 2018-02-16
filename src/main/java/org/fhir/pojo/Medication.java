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
import org.fhir.entity.MedicationModel;
import com.google.gson.GsonBuilder;

/**
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
*/
public class Medication  extends DomainResource  {
  /**
  * Description: "This is a Medication resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems."
  */
  protected CodeableConcept code;

  /**
  * Description: "A code to indicate if the medication is in active use."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Set to true if the item is attributable to a specific manufacturer."
  */
  protected Boolean isBrand;

  /**
  * Description: "Extensions for isBrand"
  */
  protected transient Element _isBrand;

  /**
  * Description: "Set to true if the medication can be obtained without an order from a prescriber."
  */
  protected Boolean isOverTheCounter;

  /**
  * Description: "Extensions for isOverTheCounter"
  */
  protected transient Element _isOverTheCounter;

  /**
  * Description: "Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product."
  */
  protected Reference manufacturer;

  /**
  * Description: "Describes the form of the item.  Powder; tablets; capsule."
  */
  protected CodeableConcept form;

  /**
  * Description: "Identifies a particular constituent of interest in the product."
  */
  protected java.util.List<MedicationIngredient> ingredient = new java.util.ArrayList<>();

  /**
  * Description: "Information that only applies to packages (not products)."
  */
  protected MedicationPackage FHIRpackage;

  /**
  * Description: "Photo(s) or graphic representation(s) of the medication."
  */
  protected java.util.List<Attachment> image = new java.util.ArrayList<>();

  public Medication() {
  }

  public Medication(MedicationModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.code = CodeableConceptHelper.fromJson(o.getCode());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getIsBrand()) {
      this.isBrand = o.getIsBrand();
    }
    if (null != o.getIsOverTheCounter()) {
      this.isOverTheCounter = o.getIsOverTheCounter();
    }
    if (null != o.getManufacturer() && !o.getManufacturer().isEmpty()) {
      this.manufacturer = new Reference(o.getManufacturer().get(0));
    }
    this.form = CodeableConceptHelper.fromJson(o.getForm());
    if (null != o.getIngredient() && !o.getIngredient().isEmpty()) {
    	this.ingredient = MedicationIngredientHelper.fromArray2Array(o.getIngredient());
    }
    if (null != o.getFHIRpackage() && !o.getFHIRpackage().isEmpty()) {
      this.FHIRpackage = new MedicationPackage(o.getFHIRpackage().get(0));
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setIsBrand( Boolean value) {
    this.isBrand = value;
  }
  public Boolean getIsBrand() {
    return this.isBrand;
  }
  public void set_isBrand( Element value) {
    this._isBrand = value;
  }
  public Element get_isBrand() {
    return this._isBrand;
  }
  public void setIsOverTheCounter( Boolean value) {
    this.isOverTheCounter = value;
  }
  public Boolean getIsOverTheCounter() {
    return this.isOverTheCounter;
  }
  public void set_isOverTheCounter( Element value) {
    this._isOverTheCounter = value;
  }
  public Element get_isOverTheCounter() {
    return this._isOverTheCounter;
  }
  public void setManufacturer( Reference value) {
    this.manufacturer = value;
  }
  public Reference getManufacturer() {
    return this.manufacturer;
  }
  public void setForm( CodeableConcept value) {
    this.form = value;
  }
  public CodeableConcept getForm() {
    return this.form;
  }
  public void setIngredient( java.util.List<MedicationIngredient> value) {
    this.ingredient = value;
  }
  public java.util.List<MedicationIngredient> getIngredient() {
    return this.ingredient;
  }
  public void setFHIRpackage( MedicationPackage value) {
    this.FHIRpackage = value;
  }
  public MedicationPackage getFHIRpackage() {
    return this.FHIRpackage;
  }
  public void setImage( java.util.List<Attachment> value) {
    this.image = value;
  }
  public java.util.List<Attachment> getImage() {
    return this.image;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Medication]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.isBrand != null) builder.append("isBrand" + "->" + this.isBrand.toString() + "\n"); 
     if(this._isBrand != null) builder.append("_isBrand" + "->" + this._isBrand.toString() + "\n"); 
     if(this.isOverTheCounter != null) builder.append("isOverTheCounter" + "->" + this.isOverTheCounter.toString() + "\n"); 
     if(this._isOverTheCounter != null) builder.append("_isOverTheCounter" + "->" + this._isOverTheCounter.toString() + "\n"); 
     if(this.manufacturer != null) builder.append("manufacturer" + "->" + this.manufacturer.toString() + "\n"); 
     if(this.form != null) builder.append("form" + "->" + this.form.toString() + "\n"); 
     if(this.ingredient != null) builder.append("ingredient" + "->" + this.ingredient.toString() + "\n"); 
     if(this.FHIRpackage != null) builder.append("FHIRpackage" + "->" + this.FHIRpackage.toString() + "\n"); 
     if(this.image != null) builder.append("image" + "->" + this.image.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Medication,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Medication" : { return Medication.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	inactive,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "inactive" : { return inactive.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}