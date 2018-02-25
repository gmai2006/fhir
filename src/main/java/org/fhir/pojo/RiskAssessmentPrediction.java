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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RiskAssessmentPrediction  extends BackboneElement  {
  /**
  * Description: "One of the potential outcomes for the patient (e.g. remission, death,  a particular condition)."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept outcome;

  /**
  * Description: "How likely is the outcome (in the specified timeframe)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float probabilityDecimal;

  /**
  * Description: "Extensions for probabilityDecimal"
  */
  protected transient Element _probabilityDecimal;

  /**
  * Description: "How likely is the outcome (in the specified timeframe)."
  */
  protected Range probabilityRange;

  /**
  * Description: "How likely is the outcome (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, high)."
  */
  protected CodeableConcept qualitativeRisk;

  /**
  * Description: "Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float relativeRisk;

  /**
  * Description: "Extensions for relativeRisk"
  */
  protected transient Element _relativeRisk;

  /**
  * Description: "Indicates the period of time or age range of the subject to which the specified probability applies."
  */
  protected Period whenPeriod;

  /**
  * Description: "Indicates the period of time or age range of the subject to which the specified probability applies."
  */
  protected Range whenRange;

  /**
  * Description: "Additional information explaining the basis for the prediction."
  */
  protected String rationale;

  /**
  * Description: "Extensions for rationale"
  */
  protected transient Element _rationale;

  public RiskAssessmentPrediction() {
  }

  public RiskAssessmentPrediction(RiskAssessmentPredictionModel o) {
    this.id = o.getId();
    if (null != o.getOutcome() && !o.getOutcome().isEmpty()) {
      this.outcome = new CodeableConcept(o.getOutcome().get(0));
    }
    if (null != o.getProbabilityDecimal()) {
      this.probabilityDecimal = o.getProbabilityDecimal();
    }
    this.probabilityRange = RangeHelper.fromJson(o.getProbabilityRange());
    if (null != o.getQualitativeRisk() && !o.getQualitativeRisk().isEmpty()) {
      this.qualitativeRisk = new CodeableConcept(o.getQualitativeRisk().get(0));
    }
    if (null != o.getRelativeRisk()) {
      this.relativeRisk = o.getRelativeRisk();
    }
    this.whenPeriod = PeriodHelper.fromJson(o.getWhenPeriod());
    this.whenRange = RangeHelper.fromJson(o.getWhenRange());
    if (null != o.getRationale()) {
      this.rationale = o.getRationale();
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
     if(this._rationale != null) builder.append("_rationale" + "->" + this._rationale.toString() + "\n"); ;
    return builder.toString();
  }


}