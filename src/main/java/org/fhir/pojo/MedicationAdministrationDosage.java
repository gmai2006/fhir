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
import org.fhir.entity.MedicationAdministrationDosageModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
*/
public class MedicationAdministrationDosage  {
  /**
  * Description: "Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.\r\rThe dosage instructions should reflect the dosage of the medication that was administered."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

  /**
  * Description: "A coded specification of the anatomic site where the medication first entered the body.  For example, \"left arm\"."
  */
  private CodeableConcept site;

  /**
  * Description: "A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc."
  */
  private CodeableConcept route;

  /**
  * Description: "A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV."
  */
  private CodeableConcept method;

  /**
  * Description: "The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection."
  */
  private Quantity dose;

  /**
  * Description: "Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours."
  */
  private Ratio rateRatio;

  /**
  * Description: "Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours."
  */
  private Quantity rateSimpleQuantity;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public MedicationAdministrationDosage() {
  }

  public MedicationAdministrationDosage(MedicationAdministrationDosageModel o) {
    this.id = o.getId();
    if (null != o.getText()) {
      this.text = o.getText();
    }
    this.site = CodeableConceptHelper.fromJson(o.getSite());
    this.route = CodeableConceptHelper.fromJson(o.getRoute());
    this.method = CodeableConceptHelper.fromJson(o.getMethod());
    this.dose = QuantityHelper.fromJson(o.getDose());
    this.rateRatio = RatioHelper.fromJson(o.getRateRatio());
    this.rateSimpleQuantity = QuantityHelper.fromJson(o.getRateSimpleQuantity());
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void set_text( Element value) {
    this._text = value;
  }
  public Element get_text() {
    return this._text;
  }
  public void setSite( CodeableConcept value) {
    this.site = value;
  }
  public CodeableConcept getSite() {
    return this.site;
  }
  public void setRoute( CodeableConcept value) {
    this.route = value;
  }
  public CodeableConcept getRoute() {
    return this.route;
  }
  public void setMethod( CodeableConcept value) {
    this.method = value;
  }
  public CodeableConcept getMethod() {
    return this.method;
  }
  public void setDose( Quantity value) {
    this.dose = value;
  }
  public Quantity getDose() {
    return this.dose;
  }
  public void setRateRatio( Ratio value) {
    this.rateRatio = value;
  }
  public Ratio getRateRatio() {
    return this.rateRatio;
  }
  public void setRateSimpleQuantity( Quantity value) {
    this.rateSimpleQuantity = value;
  }
  public Quantity getRateSimpleQuantity() {
    return this.rateSimpleQuantity;
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
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationAdministrationDosage]:" + "\n");
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); 
     if(this.site != null) builder.append("site" + "->" + this.site.toString() + "\n"); 
     if(this.route != null) builder.append("route" + "->" + this.route.toString() + "\n"); 
     if(this.method != null) builder.append("method" + "->" + this.method.toString() + "\n"); 
     if(this.dose != null) builder.append("dose" + "->" + this.dose.toString() + "\n"); 
     if(this.rateRatio != null) builder.append("rateRatio" + "->" + this.rateRatio.toString() + "\n"); 
     if(this.rateSimpleQuantity != null) builder.append("rateSimpleQuantity" + "->" + this.rateSimpleQuantity.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}