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
public class Medication  {
  /**
  * Description: "This is a Medication resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems."
  */
  private CodeableConcept code;

  /**
  * Description: "A code to indicate if the medication is in active use."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Set to true if the item is attributable to a specific manufacturer."
  */
  private Boolean isBrand;

  /**
  * Description: "Extensions for isBrand"
  */
  private transient Element _isBrand;

  /**
  * Description: "Set to true if the medication can be obtained without an order from a prescriber."
  */
  private Boolean isOverTheCounter;

  /**
  * Description: "Extensions for isOverTheCounter"
  */
  private transient Element _isOverTheCounter;

  /**
  * Description: "Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product."
  */
  private Reference manufacturer;

  /**
  * Description: "Describes the form of the item.  Powder; tablets; capsule."
  */
  private CodeableConcept form;

  /**
  * Description: "Identifies a particular constituent of interest in the product."
  */
  private java.util.List<MedicationIngredient> ingredient = new java.util.ArrayList<>();

  /**
  * Description: "Information that only applies to packages (not products)."
  */
  private MedicationPackage FHIRpackage;

  /**
  * Description: "Photo(s) or graphic representation(s) of the medication."
  */
  private java.util.List<Attachment> image = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

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
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
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
     if(this.image != null) builder.append("image" + "->" + this.image.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
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