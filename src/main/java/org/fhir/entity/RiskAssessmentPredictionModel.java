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
* "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
*/
@Entity
@Table(name="riskassessmentprediction")
public class RiskAssessmentPredictionModel  {
  /**
  * Description: "One of the potential outcomes for the patient (e.g. remission, death,  a particular condition)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"outcome\"", length = 16777215)
  private String outcome;

  /**
  * Description: "How likely is the outcome (in the specified timeframe)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"probabilityDecimal\"")
  private Float probabilityDecimal;

  /**
  * Description: "How likely is the outcome (in the specified timeframe)."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"probabilityRange\"", length = 16777215)
  private String probabilityRange;

  /**
  * Description: "How likely is the outcome (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, high)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"qualitativeRisk\"", length = 16777215)
  private String qualitativeRisk;

  /**
  * Description: "Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"relativeRisk\"")
  private Float relativeRisk;

  /**
  * Description: "Indicates the period of time or age range of the subject to which the specified probability applies."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"whenPeriod\"", length = 16777215)
  private String whenPeriod;

  /**
  * Description: "Indicates the period of time or age range of the subject to which the specified probability applies."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"whenRange\"", length = 16777215)
  private String whenRange;

  /**
  * Description: "Additional information explaining the basis for the prediction."
  */
  @javax.persistence.Basic
  @Column(name="\"rationale\"")
  private String rationale;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public RiskAssessmentPredictionModel() {
  }

  public RiskAssessmentPredictionModel(RiskAssessmentPrediction o) {
    this.id = o.getId();
      this.outcome = CodeableConcept.toJson(o.getOutcome());
      this.probabilityDecimal = o.getProbabilityDecimal();

      this.probabilityRange = Range.toJson(o.getProbabilityRange());
      this.qualitativeRisk = CodeableConcept.toJson(o.getQualitativeRisk());
      this.relativeRisk = o.getRelativeRisk();

      this.whenPeriod = Period.toJson(o.getWhenPeriod());
      this.whenRange = Range.toJson(o.getWhenRange());
      this.rationale = o.getRationale();

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setOutcome( String value) {
    this.outcome = value;
  }
  public String getOutcome() {
    return this.outcome;
  }
  public void setProbabilityDecimal( Float value) {
    this.probabilityDecimal = value;
  }
  public Float getProbabilityDecimal() {
    return this.probabilityDecimal;
  }
  public void setProbabilityRange( String value) {
    this.probabilityRange = value;
  }
  public String getProbabilityRange() {
    return this.probabilityRange;
  }
  public void setQualitativeRisk( String value) {
    this.qualitativeRisk = value;
  }
  public String getQualitativeRisk() {
    return this.qualitativeRisk;
  }
  public void setRelativeRisk( Float value) {
    this.relativeRisk = value;
  }
  public Float getRelativeRisk() {
    return this.relativeRisk;
  }
  public void setWhenPeriod( String value) {
    this.whenPeriod = value;
  }
  public String getWhenPeriod() {
    return this.whenPeriod;
  }
  public void setWhenRange( String value) {
    this.whenRange = value;
  }
  public String getWhenRange() {
    return this.whenRange;
  }
  public void setRationale( String value) {
    this.rationale = value;
  }
  public String getRationale() {
    return this.rationale;
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
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("probabilityDecimal" + "[" + String.valueOf(this.probabilityDecimal) + "]\n"); 
     builder.append("probabilityRange" + "[" + String.valueOf(this.probabilityRange) + "]\n"); 
     builder.append("qualitativeRisk" + "[" + String.valueOf(this.qualitativeRisk) + "]\n"); 
     builder.append("relativeRisk" + "[" + String.valueOf(this.relativeRisk) + "]\n"); 
     builder.append("whenPeriod" + "[" + String.valueOf(this.whenPeriod) + "]\n"); 
     builder.append("whenRange" + "[" + String.valueOf(this.whenRange) + "]\n"); 
     builder.append("rationale" + "[" + String.valueOf(this.rationale) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}