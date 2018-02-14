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
/**
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
*/
@Entity
@Table(name="medication")
public class MedicationModel  implements Serializable {
	private static final long serialVersionUID = 151857669715145366L;
  /**
  * Description: "This is a Medication resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "A code to indicate if the medication is in active use."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Set to true if the item is attributable to a specific manufacturer."
  */
  @javax.persistence.Basic
  @Column(name="\"isBrand\"")
  private Boolean isBrand;

  /**
  * Description: "Set to true if the medication can be obtained without an order from a prescriber."
  */
  @javax.persistence.Basic
  @Column(name="\"isOverTheCounter\"")
  private Boolean isOverTheCounter;

  /**
  * Description: "Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product."
  */
  @javax.persistence.Basic
  @Column(name="\"manufacturer_id\"")
  private String manufacturer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="manufacturer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> manufacturer;

  /**
  * Description: "Describes the form of the item.  Powder; tablets; capsule."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"form\"", length = 16777215)
  private String form;

  /**
  * Description: "Identifies a particular constituent of interest in the product."
  */
  @javax.persistence.Basic
  @Column(name="\"ingredient_id\"")
  private String ingredient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="ingredient_id", insertable=false, updatable=false)
  private java.util.List<MedicationIngredientModel> ingredient;

  /**
  * Description: "Information that only applies to packages (not products)."
  */
  @javax.persistence.Basic
  @Column(name="\"fhirpackage_id\"")
  private String fhirpackage_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="fhirpackage_id", insertable=false, updatable=false)
  private java.util.List<MedicationPackageModel> FHIRpackage;

  /**
  * Description: "Photo(s) or graphic representation(s) of the medication."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"image\"", length = 16777215)
  private String image;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public MedicationModel() {
  }

  public MedicationModel(Medication o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.code = CodeableConceptHelper.toJson(o.getCode());
    this.status = o.getStatus();
    this.isBrand = o.getIsBrand();
    this.isOverTheCounter = o.getIsOverTheCounter();
    if (null != o.getManufacturer() ) {
    	this.manufacturer_id = "manufacturer" + this.id;
    	this.manufacturer = ReferenceHelper.toModel(o.getManufacturer(), this.manufacturer_id);
    }
    this.form = CodeableConceptHelper.toJson(o.getForm());
    if (null != o.getIngredient() && !o.getIngredient().isEmpty()) {
    	this.ingredient_id = "ingredient" + this.id;
    	this.ingredient = MedicationIngredientHelper.toModelFromArray(o.getIngredient(), this.ingredient_id);
    }
    if (null != o.getFHIRpackage() ) {
    	this.fhirpackage_id = "fhirpackage" + this.id;
    	this.FHIRpackage = MedicationPackageHelper.toModel(o.getFHIRpackage(), this.fhirpackage_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public Boolean getIsBrand() {
    return this.isBrand;
  }
  public void setIsBrand( Boolean value) {
    this.isBrand = value;
  }
  public Boolean getIsOverTheCounter() {
    return this.isOverTheCounter;
  }
  public void setIsOverTheCounter( Boolean value) {
    this.isOverTheCounter = value;
  }
  public java.util.List<ReferenceModel> getManufacturer() {
    return this.manufacturer;
  }
  public void setManufacturer( java.util.List<ReferenceModel> value) {
    this.manufacturer = value;
  }
  public String getForm() {
    return this.form;
  }
  public void setForm( String value) {
    this.form = value;
  }
  public java.util.List<MedicationIngredientModel> getIngredient() {
    return this.ingredient;
  }
  public void setIngredient( java.util.List<MedicationIngredientModel> value) {
    this.ingredient = value;
  }
  public java.util.List<MedicationPackageModel> getFHIRpackage() {
    return this.FHIRpackage;
  }
  public void setFHIRpackage( java.util.List<MedicationPackageModel> value) {
    this.FHIRpackage = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("isBrand" + "->" + this.isBrand + "\n"); 
     builder.append("isOverTheCounter" + "->" + this.isOverTheCounter + "\n"); 
     builder.append("form" + "->" + this.form + "\n"); 
     builder.append("image" + "->" + this.image + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("isBrand" + "->" + this.isBrand + "\n"); 
     builder.append("isOverTheCounter" + "->" + this.isOverTheCounter + "\n"); 
     builder.append("manufacturer" + "->" + this.manufacturer + "\n"); 
     builder.append("form" + "->" + this.form + "\n"); 
     builder.append("ingredient" + "->" + this.ingredient + "\n"); 
     builder.append("FHIRpackage" + "->" + this.FHIRpackage + "\n"); 
     builder.append("image" + "->" + this.image + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}