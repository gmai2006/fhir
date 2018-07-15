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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicationAdministrationDosage  extends BackboneElement  {
  /**
  * Description: "Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.\r\rThe dosage instructions should reflect the dosage of the medication that was administered."
  */
  protected String text;

  /**
  * Description: "Extensions for text"
  */
  protected transient Element _text;

  /**
  * Description: "A coded specification of the anatomic site where the medication first entered the body.  For example, \"left arm\"."
  */
  protected CodeableConcept site;

  /**
  * Description: "A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc."
  */
  protected CodeableConcept route;

  /**
  * Description: "A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV."
  */
  protected CodeableConcept method;

  /**
  * Description: "The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection."
  */
  protected Quantity dose;

  /**
  * Description: "Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours."
  */
  protected Ratio rateRatio;

  /**
  * Description: "Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours."
  */
  protected Quantity rateSimpleQuantity;

  public MedicationAdministrationDosage() {
  }

  public MedicationAdministrationDosage(MedicationAdministrationDosageModel o) {
    this.id = o.getId();
    if (null != o.getText()) {
      this.text = o.getText();
    }
    if (null != o.getSite() && !o.getSite().isEmpty()) {
      this.site = new CodeableConcept(o.getSite().get(0));
    }
    if (null != o.getRoute() && !o.getRoute().isEmpty()) {
      this.route = new CodeableConcept(o.getRoute().get(0));
    }
    if (null != o.getMethod() && !o.getMethod().isEmpty()) {
      this.method = new CodeableConcept(o.getMethod().get(0));
    }
    if (null != o.getDose() && !o.getDose().isEmpty()) {
      this.dose = new Quantity(o.getDose().get(0));
    }
    this.rateRatio = RatioHelper.fromJson(o.getRateRatio());
    if (null != o.getRateSimpleQuantity() && !o.getRateSimpleQuantity().isEmpty()) {
      this.rateSimpleQuantity = new Quantity(o.getRateSimpleQuantity().get(0));
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
     if(this.rateSimpleQuantity != null) builder.append("rateSimpleQuantity" + "->" + this.rateSimpleQuantity.toString() + "\n"); ;
    return builder.toString();
  }


}