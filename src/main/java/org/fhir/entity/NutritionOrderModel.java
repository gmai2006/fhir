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
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
@Entity
@Table(name="nutritionorder")
public class NutritionOrderModel  {
  /**
  * Description: "This is a NutritionOrder resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this order by the order sender or by the order receiver."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The workflow status of the nutrition order/request."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`patient_id`", insertable=false, updatable=false)
  private ReferenceModel patient;

  /**
  * Description: "An encounter that provides additional information about the healthcare context in which this request is made."
  */
  @javax.persistence.Basic
  @Column(name="\"encounter_id\"")
  private String encounter_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`encounter_id`", insertable=false, updatable=false)
  private ReferenceModel encounter;

  /**
  * Description: "The date and time that this nutrition order was requested."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"dateTime\"")
  private String dateTime;

  /**
  * Description: "The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings."
  */
  @javax.persistence.Basic
  @Column(name="\"orderer_id\"")
  private String orderer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`orderer_id`", insertable=false, updatable=false)
  private ReferenceModel orderer;

  /**
  * Description: "A link to a record of allergies or intolerances  which should be included in the nutrition order."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> allergyIntolerance = new java.util.ArrayList<>();

  /**
  * Description: "This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"foodPreferenceModifier\"", length = 16777215)
  private String foodPreferenceModifier;

  /**
  * Description: "This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"excludeFoodModifier\"", length = 16777215)
  private String excludeFoodModifier;

  /**
  * Description: "Diet given orally in contrast to enteral (tube) feeding."
  */
  @javax.persistence.Basic
  @Column(name="\"oraldiet_id\"")
  private String oraldiet_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`oraldiet_id`", insertable=false, updatable=false)
  private NutritionOrderOralDietModel oralDiet;

  /**
  * Description: "Oral nutritional products given in order to add further nutritional value to the patient's diet."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<NutritionOrderSupplementModel> supplement = new java.util.ArrayList<>();

  /**
  * Description: "Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity."
  */
  @javax.persistence.Basic
  @Column(name="\"enteralformula_id\"")
  private String enteralformula_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`enteralformula_id`", insertable=false, updatable=false)
  private NutritionOrderEnteralFormulaModel enteralFormula;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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


  public NutritionOrderModel() {
  }

  public NutritionOrderModel(NutritionOrder o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      if (null != o.getPatient()) {
      	this.patient_id = "patient" + this.getId();
        this.patient = new ReferenceModel(o.getPatient());
        this.patient.setId(this.patient_id);
        this.patient.parent_id = this.patient.getId();
      }

      if (null != o.getEncounter()) {
      	this.encounter_id = "encounter" + this.getId();
        this.encounter = new ReferenceModel(o.getEncounter());
        this.encounter.setId(this.encounter_id);
        this.encounter.parent_id = this.encounter.getId();
      }

      this.dateTime = o.getDateTime();

      if (null != o.getOrderer()) {
      	this.orderer_id = "orderer" + this.getId();
        this.orderer = new ReferenceModel(o.getOrderer());
        this.orderer.setId(this.orderer_id);
        this.orderer.parent_id = this.orderer.getId();
      }

      this.allergyIntolerance = Reference.toModelArray(o.getAllergyIntolerance());

      this.foodPreferenceModifier = CodeableConcept.toJson(o.getFoodPreferenceModifier());
      this.excludeFoodModifier = CodeableConcept.toJson(o.getExcludeFoodModifier());
      if (null != o.getOralDiet()) {
      	this.oraldiet_id = "oralDiet" + this.getId();
        this.oralDiet = new NutritionOrderOralDietModel(o.getOralDiet());
        this.oralDiet.setId(this.oraldiet_id);
        this.oralDiet.parent_id = this.oralDiet.getId();
      }

      this.supplement = NutritionOrderSupplement.toModelArray(o.getSupplement());

      if (null != o.getEnteralFormula()) {
      	this.enteralformula_id = "enteralFormula" + this.getId();
        this.enteralFormula = new NutritionOrderEnteralFormulaModel(o.getEnteralFormula());
        this.enteralFormula.setId(this.enteralformula_id);
        this.enteralFormula.parent_id = this.enteralFormula.getId();
      }

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setPatient( ReferenceModel value) {
    this.patient = value;
  }
  public ReferenceModel getPatient() {
    return this.patient;
  }
  public void setEncounter( ReferenceModel value) {
    this.encounter = value;
  }
  public ReferenceModel getEncounter() {
    return this.encounter;
  }
  public void setDateTime( String value) {
    this.dateTime = value;
  }
  public String getDateTime() {
    return this.dateTime;
  }
  public void setOrderer( ReferenceModel value) {
    this.orderer = value;
  }
  public ReferenceModel getOrderer() {
    return this.orderer;
  }
  public void setAllergyIntolerance( java.util.List<ReferenceModel> value) {
    this.allergyIntolerance = value;
  }
  public java.util.List<ReferenceModel> getAllergyIntolerance() {
    return this.allergyIntolerance;
  }
  public void setFoodPreferenceModifier( String value) {
    this.foodPreferenceModifier = value;
  }
  public String getFoodPreferenceModifier() {
    return this.foodPreferenceModifier;
  }
  public void setExcludeFoodModifier( String value) {
    this.excludeFoodModifier = value;
  }
  public String getExcludeFoodModifier() {
    return this.excludeFoodModifier;
  }
  public void setOralDiet( NutritionOrderOralDietModel value) {
    this.oralDiet = value;
  }
  public NutritionOrderOralDietModel getOralDiet() {
    return this.oralDiet;
  }
  public void setSupplement( java.util.List<NutritionOrderSupplementModel> value) {
    this.supplement = value;
  }
  public java.util.List<NutritionOrderSupplementModel> getSupplement() {
    return this.supplement;
  }
  public void setEnteralFormula( NutritionOrderEnteralFormulaModel value) {
    this.enteralFormula = value;
  }
  public NutritionOrderEnteralFormulaModel getEnteralFormula() {
    return this.enteralFormula;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
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
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("encounter" + "[" + String.valueOf(this.encounter) + "]\n"); 
     builder.append("dateTime" + "[" + String.valueOf(this.dateTime) + "]\n"); 
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
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}