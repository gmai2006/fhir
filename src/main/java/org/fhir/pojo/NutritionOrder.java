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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NutritionOrder  extends DomainResource  {
  /**
  * Description: "This is a NutritionOrder resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifiers assigned to this order by the order sender or by the order receiver."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The workflow status of the nutrition order/request."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding."
  */
  @javax.validation.constraints.NotNull
  protected Reference patient;

  /**
  * Description: "An encounter that provides additional information about the healthcare context in which this request is made."
  */
  protected Reference encounter;

  /**
  * Description: "The date and time that this nutrition order was requested."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String dateTime;

  /**
  * Description: "Extensions for dateTime"
  */
  protected transient Element _dateTime;

  /**
  * Description: "The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings."
  */
  protected Reference orderer;

  /**
  * Description: "A link to a record of allergies or intolerances  which should be included in the nutrition order."
  */
  protected java.util.List<Reference> allergyIntolerance;

  /**
  * Description: "This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings."
  */
  protected java.util.List<CodeableConcept> foodPreferenceModifier;

  /**
  * Description: "This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings."
  */
  protected java.util.List<CodeableConcept> excludeFoodModifier;

  /**
  * Description: "Diet given orally in contrast to enteral (tube) feeding."
  */
  protected NutritionOrderOralDiet oralDiet;

  /**
  * Description: "Oral nutritional products given in order to add further nutritional value to the patient's diet."
  */
  protected java.util.List<NutritionOrderSupplement> supplement;

  /**
  * Description: "Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity."
  */
  protected NutritionOrderEnteralFormula enteralFormula;

  public NutritionOrder() {
  }

  public NutritionOrder(NutritionOrderModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
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
    if (null != o.getFoodPreferenceModifier() && !o.getFoodPreferenceModifier().isEmpty()) {
    	this.foodPreferenceModifier = CodeableConceptHelper.fromArray2Array(o.getFoodPreferenceModifier());
    }
    if (null != o.getExcludeFoodModifier() && !o.getExcludeFoodModifier().isEmpty()) {
    	this.excludeFoodModifier = CodeableConceptHelper.fromArray2Array(o.getExcludeFoodModifier());
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
     if(this.enteralFormula != null) builder.append("enteralFormula" + "->" + this.enteralFormula.toString() + "\n"); ;
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