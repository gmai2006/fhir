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
      this.outcome = CodeableConcept.fromJson(o.getOutcome());
      if (null != o.getProbabilityDecimal()) {
        this.probabilityDecimal = new Float(o.getProbabilityDecimal());
      }

      this.probabilityRange = Range.fromJson(o.getProbabilityRange());
      this.qualitativeRisk = CodeableConcept.fromJson(o.getQualitativeRisk());
      if (null != o.getRelativeRisk()) {
        this.relativeRisk = new Float(o.getRelativeRisk());
      }

      this.whenPeriod = Period.fromJson(o.getWhenPeriod());
      this.whenRange = Range.fromJson(o.getWhenRange());
      if (null != o.getRationale()) {
        this.rationale = new String(o.getRationale());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("probabilityDecimal" + "[" + String.valueOf(this.probabilityDecimal) + "]\n"); 
     builder.append("_probabilityDecimal" + "[" + String.valueOf(this._probabilityDecimal) + "]\n"); 
     builder.append("probabilityRange" + "[" + String.valueOf(this.probabilityRange) + "]\n"); 
     builder.append("qualitativeRisk" + "[" + String.valueOf(this.qualitativeRisk) + "]\n"); 
     builder.append("relativeRisk" + "[" + String.valueOf(this.relativeRisk) + "]\n"); 
     builder.append("_relativeRisk" + "[" + String.valueOf(this._relativeRisk) + "]\n"); 
     builder.append("whenPeriod" + "[" + String.valueOf(this.whenPeriod) + "]\n"); 
     builder.append("whenRange" + "[" + String.valueOf(this.whenRange) + "]\n"); 
     builder.append("rationale" + "[" + String.valueOf(this.rationale) + "]\n"); 
     builder.append("_rationale" + "[" + String.valueOf(this._rationale) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<RiskAssessmentPrediction> fromArray(java.util.List<RiskAssessmentPredictionModel> list) {
    return (java.util.List<RiskAssessmentPrediction>)list.stream()
      .map(model -> new RiskAssessmentPrediction(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<RiskAssessmentPredictionModel> toModelArray(java.util.List<RiskAssessmentPrediction> list) {
    return (java.util.List<RiskAssessmentPredictionModel>)list.stream()
      .map(model -> new RiskAssessmentPredictionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static RiskAssessmentPrediction fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, RiskAssessmentPrediction.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(RiskAssessmentPrediction o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<RiskAssessmentPrediction> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}