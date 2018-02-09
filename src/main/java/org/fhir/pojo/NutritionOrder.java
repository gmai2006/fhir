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
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      if (null != o.getEncounter()) {
        this.encounter = new Reference(o.getEncounter());
        this.encounter.setId(this.getId());
      }

      if (null != o.getDateTime()) {
        this.dateTime = new String(o.getDateTime());
      }

      if (null != o.getOrderer()) {
        this.orderer = new Reference(o.getOrderer());
        this.orderer.setId(this.getId());
      }

      this.allergyIntolerance = Reference.fromArray(o.getAllergyIntolerance());

      this.foodPreferenceModifier = CodeableConcept.fromArray(o.getFoodPreferenceModifier());
      this.excludeFoodModifier = CodeableConcept.fromArray(o.getExcludeFoodModifier());
      if (null != o.getOralDiet()) {
        this.oralDiet = new NutritionOrderOralDiet(o.getOralDiet());
        this.oralDiet.setId(this.getId());
      }

      this.supplement = NutritionOrderSupplement.fromArray(o.getSupplement());

      if (null != o.getEnteralFormula()) {
        this.enteralFormula = new NutritionOrderEnteralFormula(o.getEnteralFormula());
        this.enteralFormula.setId(this.getId());
      }

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("encounter" + "[" + String.valueOf(this.encounter) + "]\n"); 
     builder.append("dateTime" + "[" + String.valueOf(this.dateTime) + "]\n"); 
     builder.append("_dateTime" + "[" + String.valueOf(this._dateTime) + "]\n"); 
     builder.append("orderer" + "[" + String.valueOf(this.orderer) + "]\n"); 
     builder.append("allergyIntolerance" + "[" + String.valueOf(this.allergyIntolerance) + "]\n"); 
     builder.append("foodPreferenceModifier" + "[" + String.valueOf(this.foodPreferenceModifier) + "]\n"); 
     builder.append("excludeFoodModifier" + "[" + String.valueOf(this.excludeFoodModifier) + "]\n"); 
     builder.append("oralDiet" + "[" + String.valueOf(this.oralDiet) + "]\n"); 
     builder.append("supplement" + "[" + String.valueOf(this.supplement) + "]\n"); 
     builder.append("enteralFormula" + "[" + String.valueOf(this.enteralFormula) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<NutritionOrder> fromArray(java.util.List<NutritionOrderModel> list) {
    return (java.util.List<NutritionOrder>)list.stream()
      .map(model -> new NutritionOrder(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<NutritionOrderModel> toModelArray(java.util.List<NutritionOrder> list) {
    return (java.util.List<NutritionOrderModel>)list.stream()
      .map(model -> new NutritionOrderModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static NutritionOrder fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, NutritionOrder.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(NutritionOrder o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<NutritionOrder> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}