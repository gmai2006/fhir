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
import org.fhir.entity.DosageModel;
import com.google.gson.GsonBuilder;

/**
* "Indicates how the medication is/was taken or should be taken by the patient."
*/
public class Dosage  extends Element  {
  /**
  * Description: "Indicates the order in which the dosage instructions should be applied or interpreted."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  protected transient Element _sequence;

  /**
  * Description: "Free text dosage instructions e.g. SIG."
  */
  protected String text;

  /**
  * Description: "Extensions for text"
  */
  protected transient Element _text;

  /**
  * Description: "Supplemental instruction - e.g. \"with meals\"."
  */
  protected java.util.List<CodeableConcept> additionalInstruction = new java.util.ArrayList<>();

  /**
  * Description: "Instructions in terms that are understood by the patient or consumer."
  */
  protected String patientInstruction;

  /**
  * Description: "Extensions for patientInstruction"
  */
  protected transient Element _patientInstruction;

  /**
  * Description: "When medication should be administered."
  */
  protected Timing timing;

  /**
  * Description: "Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept)."
  */
  protected Boolean asNeededBoolean;

  /**
  * Description: "Extensions for asNeededBoolean"
  */
  protected transient Element _asNeededBoolean;

  /**
  * Description: "Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept)."
  */
  protected CodeableConcept asNeededCodeableConcept;

  /**
  * Description: "Body site to administer to."
  */
  protected CodeableConcept site;

  /**
  * Description: "How drug should enter body."
  */
  protected CodeableConcept route;

  /**
  * Description: "Technique for administering medication."
  */
  protected CodeableConcept method;

  /**
  * Description: "Amount of medication per dose."
  */
  protected Range doseRange;

  /**
  * Description: "Amount of medication per dose."
  */
  protected Quantity doseSimpleQuantity;

  /**
  * Description: "Upper limit on medication per unit of time."
  */
  protected Ratio maxDosePerPeriod;

  /**
  * Description: "Upper limit on medication per administration."
  */
  protected Quantity maxDosePerAdministration;

  /**
  * Description: "Upper limit on medication per lifetime of the patient."
  */
  protected Quantity maxDosePerLifetime;

  /**
  * Description: "Amount of medication per unit of time."
  */
  protected Ratio rateRatio;

  /**
  * Description: "Amount of medication per unit of time."
  */
  protected Range rateRange;

  /**
  * Description: "Amount of medication per unit of time."
  */
  protected Quantity rateSimpleQuantity;

  public Dosage() {
  }

  public Dosage(DosageModel o) {
    this.id = o.getId();
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    if (null != o.getText()) {
      this.text = o.getText();
    }
    if (null != o.getPatientInstruction()) {
      this.patientInstruction = o.getPatientInstruction();
    }
    this.timing = TimingHelper.fromJson(o.getTiming());
    if (null != o.getAsNeededBoolean()) {
      this.asNeededBoolean = o.getAsNeededBoolean();
    }
    this.asNeededCodeableConcept = CodeableConceptHelper.fromJson(o.getAsNeededCodeableConcept());
    this.site = CodeableConceptHelper.fromJson(o.getSite());
    this.route = CodeableConceptHelper.fromJson(o.getRoute());
    this.method = CodeableConceptHelper.fromJson(o.getMethod());
    this.doseRange = RangeHelper.fromJson(o.getDoseRange());
    if (null != o.getDoseSimpleQuantity() && !o.getDoseSimpleQuantity().isEmpty()) {
      this.doseSimpleQuantity = new Quantity(o.getDoseSimpleQuantity().get(0));
    }
    this.maxDosePerPeriod = RatioHelper.fromJson(o.getMaxDosePerPeriod());
    if (null != o.getMaxDosePerAdministration() && !o.getMaxDosePerAdministration().isEmpty()) {
      this.maxDosePerAdministration = new Quantity(o.getMaxDosePerAdministration().get(0));
    }
    if (null != o.getMaxDosePerLifetime() && !o.getMaxDosePerLifetime().isEmpty()) {
      this.maxDosePerLifetime = new Quantity(o.getMaxDosePerLifetime().get(0));
    }
    this.rateRatio = RatioHelper.fromJson(o.getRateRatio());
    this.rateRange = RangeHelper.fromJson(o.getRateRange());
    if (null != o.getRateSimpleQuantity() && !o.getRateSimpleQuantity().isEmpty()) {
      this.rateSimpleQuantity = new Quantity(o.getRateSimpleQuantity().get(0));
    }
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
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
  public void setAdditionalInstruction( java.util.List<CodeableConcept> value) {
    this.additionalInstruction = value;
  }
  public java.util.List<CodeableConcept> getAdditionalInstruction() {
    return this.additionalInstruction;
  }
  public void setPatientInstruction( String value) {
    this.patientInstruction = value;
  }
  public String getPatientInstruction() {
    return this.patientInstruction;
  }
  public void set_patientInstruction( Element value) {
    this._patientInstruction = value;
  }
  public Element get_patientInstruction() {
    return this._patientInstruction;
  }
  public void setTiming( Timing value) {
    this.timing = value;
  }
  public Timing getTiming() {
    return this.timing;
  }
  public void setAsNeededBoolean( Boolean value) {
    this.asNeededBoolean = value;
  }
  public Boolean getAsNeededBoolean() {
    return this.asNeededBoolean;
  }
  public void set_asNeededBoolean( Element value) {
    this._asNeededBoolean = value;
  }
  public Element get_asNeededBoolean() {
    return this._asNeededBoolean;
  }
  public void setAsNeededCodeableConcept( CodeableConcept value) {
    this.asNeededCodeableConcept = value;
  }
  public CodeableConcept getAsNeededCodeableConcept() {
    return this.asNeededCodeableConcept;
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
  public void setDoseRange( Range value) {
    this.doseRange = value;
  }
  public Range getDoseRange() {
    return this.doseRange;
  }
  public void setDoseSimpleQuantity( Quantity value) {
    this.doseSimpleQuantity = value;
  }
  public Quantity getDoseSimpleQuantity() {
    return this.doseSimpleQuantity;
  }
  public void setMaxDosePerPeriod( Ratio value) {
    this.maxDosePerPeriod = value;
  }
  public Ratio getMaxDosePerPeriod() {
    return this.maxDosePerPeriod;
  }
  public void setMaxDosePerAdministration( Quantity value) {
    this.maxDosePerAdministration = value;
  }
  public Quantity getMaxDosePerAdministration() {
    return this.maxDosePerAdministration;
  }
  public void setMaxDosePerLifetime( Quantity value) {
    this.maxDosePerLifetime = value;
  }
  public Quantity getMaxDosePerLifetime() {
    return this.maxDosePerLifetime;
  }
  public void setRateRatio( Ratio value) {
    this.rateRatio = value;
  }
  public Ratio getRateRatio() {
    return this.rateRatio;
  }
  public void setRateRange( Range value) {
    this.rateRange = value;
  }
  public Range getRateRange() {
    return this.rateRange;
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
    builder.append("[Dosage]:" + "\n");
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); 
     if(this.additionalInstruction != null) builder.append("additionalInstruction" + "->" + this.additionalInstruction.toString() + "\n"); 
     if(this.patientInstruction != null) builder.append("patientInstruction" + "->" + this.patientInstruction.toString() + "\n"); 
     if(this._patientInstruction != null) builder.append("_patientInstruction" + "->" + this._patientInstruction.toString() + "\n"); 
     if(this.timing != null) builder.append("timing" + "->" + this.timing.toString() + "\n"); 
     if(this.asNeededBoolean != null) builder.append("asNeededBoolean" + "->" + this.asNeededBoolean.toString() + "\n"); 
     if(this._asNeededBoolean != null) builder.append("_asNeededBoolean" + "->" + this._asNeededBoolean.toString() + "\n"); 
     if(this.asNeededCodeableConcept != null) builder.append("asNeededCodeableConcept" + "->" + this.asNeededCodeableConcept.toString() + "\n"); 
     if(this.site != null) builder.append("site" + "->" + this.site.toString() + "\n"); 
     if(this.route != null) builder.append("route" + "->" + this.route.toString() + "\n"); 
     if(this.method != null) builder.append("method" + "->" + this.method.toString() + "\n"); 
     if(this.doseRange != null) builder.append("doseRange" + "->" + this.doseRange.toString() + "\n"); 
     if(this.doseSimpleQuantity != null) builder.append("doseSimpleQuantity" + "->" + this.doseSimpleQuantity.toString() + "\n"); 
     if(this.maxDosePerPeriod != null) builder.append("maxDosePerPeriod" + "->" + this.maxDosePerPeriod.toString() + "\n"); 
     if(this.maxDosePerAdministration != null) builder.append("maxDosePerAdministration" + "->" + this.maxDosePerAdministration.toString() + "\n"); 
     if(this.maxDosePerLifetime != null) builder.append("maxDosePerLifetime" + "->" + this.maxDosePerLifetime.toString() + "\n"); 
     if(this.rateRatio != null) builder.append("rateRatio" + "->" + this.rateRatio.toString() + "\n"); 
     if(this.rateRange != null) builder.append("rateRange" + "->" + this.rateRange.toString() + "\n"); 
     if(this.rateSimpleQuantity != null) builder.append("rateSimpleQuantity" + "->" + this.rateSimpleQuantity.toString() + "\n"); ;
    return builder.toString();
  }


}