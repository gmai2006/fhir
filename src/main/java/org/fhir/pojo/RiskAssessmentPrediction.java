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
import org.fhir.entity.RiskAssessmentPredictionModel;
import com.google.gson.GsonBuilder;

/**
* "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
*/
public class RiskAssessmentPrediction  {
  /**
  * Description: "One of the potential outcomes for the patient (e.g. remission, death,  a particular condition)."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept outcome;

  /**
  * Description: "How likely is the outcome (in the specified timeframe)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float probabilityDecimal;

  /**
  * Description: "Extensions for probabilityDecimal"
  */
  private transient Element _probabilityDecimal;

  /**
  * Description: "How likely is the outcome (in the specified timeframe)."
  */
  private Range probabilityRange;

  /**
  * Description: "How likely is the outcome (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, high)."
  */
  private CodeableConcept qualitativeRisk;

  /**
  * Description: "Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float relativeRisk;

  /**
  * Description: "Extensions for relativeRisk"
  */
  private transient Element _relativeRisk;

  /**
  * Description: "Indicates the period of time or age range of the subject to which the specified probability applies."
  */
  private Period whenPeriod;

  /**
  * Description: "Indicates the period of time or age range of the subject to which the specified probability applies."
  */
  private Range whenRange;

  /**
  * Description: "Additional information explaining the basis for the prediction."
  */
  private String rationale;

  /**
  * Description: "Extensions for rationale"
  */
  private transient Element _rationale;

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

  public RiskAssessmentPrediction() {
  }

  public RiskAssessmentPrediction(RiskAssessmentPredictionModel o) {
    this.id = o.getId();
    this.outcome = CodeableConceptHelper.fromJson(o.getOutcome());
    if (null != o.getProbabilityDecimal()) {
      this.probabilityDecimal = o.getProbabilityDecimal();
    }
    this.probabilityRange = RangeHelper.fromJson(o.getProbabilityRange());
    this.qualitativeRisk = CodeableConceptHelper.fromJson(o.getQualitativeRisk());
    if (null != o.getRelativeRisk()) {
      this.relativeRisk = o.getRelativeRisk();
    }
    this.whenPeriod = PeriodHelper.fromJson(o.getWhenPeriod());
    this.whenRange = RangeHelper.fromJson(o.getWhenRange());
    if (null != o.getRationale()) {
      this.rationale = o.getRationale();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setOutcome( CodeableConcept value) {
    this.outcome = value;
  }
  public CodeableConcept getOutcome() {
    return this.outcome;
  }
  public void setProbabilityDecimal( Float value) {
    this.probabilityDecimal = value;
  }
  public Float getProbabilityDecimal() {
    return this.probabilityDecimal;
  }
  public void set_probabilityDecimal( Element value) {
    this._probabilityDecimal = value;
  }
  public Element get_probabilityDecimal() {
    return this._probabilityDecimal;
  }
  public void setProbabilityRange( Range value) {
    this.probabilityRange = value;
  }
  public Range getProbabilityRange() {
    return this.probabilityRange;
  }
  public void setQualitativeRisk( CodeableConcept value) {
    this.qualitativeRisk = value;
  }
  public CodeableConcept getQualitativeRisk() {
    return this.qualitativeRisk;
  }
  public void setRelativeRisk( Float value) {
    this.relativeRisk = value;
  }
  public Float getRelativeRisk() {
    return this.relativeRisk;
  }
  public void set_relativeRisk( Element value) {
    this._relativeRisk = value;
  }
  public Element get_relativeRisk() {
    return this._relativeRisk;
  }
  public void setWhenPeriod( Period value) {
    this.whenPeriod = value;
  }
  public Period getWhenPeriod() {
    return this.whenPeriod;
  }
  public void setWhenRange( Range value) {
    this.whenRange = value;
  }
  public Range getWhenRange() {
    return this.whenRange;
  }
  public void setRationale( String value) {
    this.rationale = value;
  }
  public String getRationale() {
    return this.rationale;
  }
  public void set_rationale( Element value) {
    this._rationale = value;
  }
  public Element get_rationale() {
    return this._rationale;
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
    builder.append("[RiskAssessmentPrediction]:" + "\n");
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this.probabilityDecimal != null) builder.append("probabilityDecimal" + "->" + this.probabilityDecimal.toString() + "\n"); 
     if(this._probabilityDecimal != null) builder.append("_probabilityDecimal" + "->" + this._probabilityDecimal.toString() + "\n"); 
     if(this.probabilityRange != null) builder.append("probabilityRange" + "->" + this.probabilityRange.toString() + "\n"); 
     if(this.qualitativeRisk != null) builder.append("qualitativeRisk" + "->" + this.qualitativeRisk.toString() + "\n"); 
     if(this.relativeRisk != null) builder.append("relativeRisk" + "->" + this.relativeRisk.toString() + "\n"); 
     if(this._relativeRisk != null) builder.append("_relativeRisk" + "->" + this._relativeRisk.toString() + "\n"); 
     if(this.whenPeriod != null) builder.append("whenPeriod" + "->" + this.whenPeriod.toString() + "\n"); 
     if(this.whenRange != null) builder.append("whenRange" + "->" + this.whenRange.toString() + "\n"); 
     if(this.rationale != null) builder.append("rationale" + "->" + this.rationale.toString() + "\n"); 
     if(this._rationale != null) builder.append("_rationale" + "->" + this._rationale.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}