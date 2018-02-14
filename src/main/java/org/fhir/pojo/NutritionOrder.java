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
import org.fhir.entity.NutritionOrderModel;
import com.google.gson.GsonBuilder;

/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
public class NutritionOrder  {
  /**
  * Description: "This is a NutritionOrder resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this order by the order sender or by the order receiver."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The workflow status of the nutrition order/request."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding."
  */
  @javax.validation.constraints.NotNull
  private Reference patient;

  /**
  * Description: "An encounter that provides additional information about the healthcare context in which this request is made."
  */
  private Reference encounter;

  /**
  * Description: "The date and time that this nutrition order was requested."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String dateTime;

  /**
  * Description: "Extensions for dateTime"
  */
  private transient Element _dateTime;

  /**
  * Description: "The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings."
  */
  private Reference orderer;

  /**
  * Description: "A link to a record of allergies or intolerances  which should be included in the nutrition order."
  */
  private java.util.List<Reference> allergyIntolerance = new java.util.ArrayList<>();

  /**
  * Description: "This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings."
  */
  private java.util.List<CodeableConcept> foodPreferenceModifier = new java.util.ArrayList<>();

  /**
  * Description: "This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings."
  */
  private java.util.List<CodeableConcept> excludeFoodModifier = new java.util.ArrayList<>();

  /**
  * Description: "Diet given orally in contrast to enteral (tube) feeding."
  */
  private NutritionOrderOralDiet oralDiet;

  /**
  * Description: "Oral nutritional products given in order to add further nutritional value to the patient's diet."
  */
  private java.util.List<NutritionOrderSupplement> supplement = new java.util.ArrayList<>();

  /**
  * Description: "Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity."
  */
  private NutritionOrderEnteralFormula enteralFormula;

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

  public NutritionOrder() {
  }

  public NutritionOrder(NutritionOrderModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getEncounter() && !o.getEncounter().isEmpty()) {
      this.encounter = new Reference(o.getEncounter().get(0));
    }
    if (null != o.getDateTime()) {
      this.dateTime = o.getDateTime();
    }
    if (null != o.getOrderer() && !o.getOrderer().isEmpty()) {
      this.orderer = new Reference(o.getOrderer().get(0));
    }
    if (null != o.getAllergyIntolerance() && !o.getAllergyIntolerance().isEmpty()) {
    	this.allergyIntolerance = ReferenceHelper.fromArray2Array(o.getAllergyIntolerance());
    }
    if (null != o.getOralDiet() && !o.getOralDiet().isEmpty()) {
      this.oralDiet = new NutritionOrderOralDiet(o.getOralDiet().get(0));
    }
    if (null != o.getSupplement() && !o.getSupplement().isEmpty()) {
    	this.supplement = NutritionOrderSupplementHelper.fromArray2Array(o.getSupplement());
    }
    if (null != o.getEnteralFormula() && !o.getEnteralFormula().isEmpty()) {
      this.enteralFormula = new NutritionOrderEnteralFormula(o.getEnteralFormula().get(0));
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
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
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
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setEncounter( Reference value) {
    this.encounter = value;
  }
  public Reference getEncounter() {
    return this.encounter;
  }
  public void setDateTime( String value) {
    this.dateTime = value;
  }
  public String getDateTime() {
    return this.dateTime;
  }
  public void set_dateTime( Element value) {
    this._dateTime = value;
  }
  public Element get_dateTime() {
    return this._dateTime;
  }
  public void setOrderer( Reference value) {
    this.orderer = value;
  }
  public Reference getOrderer() {
    return this.orderer;
  }
  public void setAllergyIntolerance( java.util.List<Reference> value) {
    this.allergyIntolerance = value;
  }
  public java.util.List<Reference> getAllergyIntolerance() {
    return this.allergyIntolerance;
  }
  public void setFoodPreferenceModifier( java.util.List<CodeableConcept> value) {
    this.foodPreferenceModifier = value;
  }
  public java.util.List<CodeableConcept> getFoodPreferenceModifier() {
    return this.foodPreferenceModifier;
  }
  public void setExcludeFoodModifier( java.util.List<CodeableConcept> value) {
    this.excludeFoodModifier = value;
  }
  public java.util.List<CodeableConcept> getExcludeFoodModifier() {
    return this.excludeFoodModifier;
  }
  public void setOralDiet( NutritionOrderOralDiet value) {
    this.oralDiet = value;
  }
  public NutritionOrderOralDiet getOralDiet() {
    return this.oralDiet;
  }
  public void setSupplement( java.util.List<NutritionOrderSupplement> value) {
    this.supplement = value;
  }
  public java.util.List<NutritionOrderSupplement> getSupplement() {
    return this.supplement;
  }
  public void setEnteralFormula( NutritionOrderEnteralFormula value) {
    this.enteralFormula = value;
  }
  public NutritionOrderEnteralFormula getEnteralFormula() {
    return this.enteralFormula;
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
    builder.append("[NutritionOrder]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.encounter != null) builder.append("encounter" + "->" + this.encounter.toString() + "\n"); 
     if(this.dateTime != null) builder.append("dateTime" + "->" + this.dateTime.toString() + "\n"); 
     if(this._dateTime != null) builder.append("_dateTime" + "->" + this._dateTime.toString() + "\n"); 
     if(this.orderer != null) builder.append("orderer" + "->" + this.orderer.toString() + "\n"); 
     if(this.allergyIntolerance != null) builder.append("allergyIntolerance" + "->" + this.allergyIntolerance.toString() + "\n"); 
     if(this.foodPreferenceModifier != null) builder.append("foodPreferenceModifier" + "->" + this.foodPreferenceModifier.toString() + "\n"); 
     if(this.excludeFoodModifier != null) builder.append("excludeFoodModifier" + "->" + this.excludeFoodModifier.toString() + "\n"); 
     if(this.oralDiet != null) builder.append("oralDiet" + "->" + this.oralDiet.toString() + "\n"); 
     if(this.supplement != null) builder.append("supplement" + "->" + this.supplement.toString() + "\n"); 
     if(this.enteralFormula != null) builder.append("enteralFormula" + "->" + this.enteralFormula.toString() + "\n"); 
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
  	NutritionOrder,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "NutritionOrder" : { return NutritionOrder.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	proposed,
  	draft,
  	planned,
  	requested,
  	active,
  	onhold,
  	completed,
  	cancelled,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "proposed" : { return proposed.toString(); }
  			case "draft" : { return draft.toString(); }
  			case "planned" : { return planned.toString(); }
  			case "requested" : { return requested.toString(); }
  			case "active" : { return active.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}