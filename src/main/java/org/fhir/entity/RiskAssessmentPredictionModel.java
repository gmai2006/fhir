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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
*/
@Entity
@Table(name="riskassessmentprediction")
public class RiskAssessmentPredictionModel  implements Serializable {
	private static final long serialVersionUID = 15191089375557077L;
  /**
  * Description: "One of the potential outcomes for the patient (e.g. remission, death,  a particular condition)."
  */
  @javax.persistence.Basic
  @Column(name="\"outcome_id\"")
  private String outcome_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="outcome_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> outcome;

  /**
  * Description: "How likely is the outcome (in the specified timeframe)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"probabilityDecimal\"")
  private Float probabilityDecimal;

  /**
  * Description: "How likely is the outcome (in the specified timeframe)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"probabilityRange\"", length = 16777215)
  private String probabilityRange;

  /**
  * Description: "How likely is the outcome (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, high)."
  */
  @javax.persistence.Basic
  @Column(name="\"qualitativerisk_id\"")
  private String qualitativerisk_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="qualitativerisk_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> qualitativeRisk;

  /**
  * Description: "Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"relativeRisk\"")
  private Float relativeRisk;

  /**
  * Description: "Indicates the period of time or age range of the subject to which the specified probability applies."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"whenPeriod\"", length = 16777215)
  private String whenPeriod;

  /**
  * Description: "Indicates the period of time or age range of the subject to which the specified probability applies."
  * Actual type: String;
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
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public RiskAssessmentPredictionModel() {
  }

  public RiskAssessmentPredictionModel(RiskAssessmentPrediction o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getOutcome() ) {
    	this.outcome_id = "outcome" + this.parent_id;
    	this.outcome = CodeableConceptHelper.toModel(o.getOutcome(), this.outcome_id);
    }
    this.probabilityDecimal = o.getProbabilityDecimal();
    if (null != o.getProbabilityRange()) {
    	this.probabilityRange = JsonUtils.toJson(o.getProbabilityRange());
    }
    if (null != o.getQualitativeRisk() ) {
    	this.qualitativerisk_id = "qualitativerisk" + this.parent_id;
    	this.qualitativeRisk = CodeableConceptHelper.toModel(o.getQualitativeRisk(), this.qualitativerisk_id);
    }
    this.relativeRisk = o.getRelativeRisk();
    if (null != o.getWhenPeriod()) {
    	this.whenPeriod = JsonUtils.toJson(o.getWhenPeriod());
    }
    if (null != o.getWhenRange()) {
    	this.whenRange = JsonUtils.toJson(o.getWhenRange());
    }
    this.rationale = o.getRationale();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getOutcome() {
    return this.outcome;
  }
  public void setOutcome( java.util.List<CodeableConceptModel> value) {
    this.outcome = value;
  }
  public Float getProbabilityDecimal() {
    return this.probabilityDecimal;
  }
  public void setProbabilityDecimal( Float value) {
    this.probabilityDecimal = value;
  }
  public String getProbabilityRange() {
    return this.probabilityRange;
  }
  public void setProbabilityRange( String value) {
    this.probabilityRange = value;
  }
  public java.util.List<CodeableConceptModel> getQualitativeRisk() {
    return this.qualitativeRisk;
  }
  public void setQualitativeRisk( java.util.List<CodeableConceptModel> value) {
    this.qualitativeRisk = value;
  }
  public Float getRelativeRisk() {
    return this.relativeRisk;
  }
  public void setRelativeRisk( Float value) {
    this.relativeRisk = value;
  }
  public String getWhenPeriod() {
    return this.whenPeriod;
  }
  public void setWhenPeriod( String value) {
    this.whenPeriod = value;
  }
  public String getWhenRange() {
    return this.whenRange;
  }
  public void setWhenRange( String value) {
    this.whenRange = value;
  }
  public String getRationale() {
    return this.rationale;
  }
  public void setRationale( String value) {
    this.rationale = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RiskAssessmentPredictionModel]:" + "\n");
     builder.append("probabilityDecimal" + "->" + this.probabilityDecimal + "\n"); 
     builder.append("probabilityRange" + "->" + this.probabilityRange + "\n"); 
     builder.append("relativeRisk" + "->" + this.relativeRisk + "\n"); 
     builder.append("whenPeriod" + "->" + this.whenPeriod + "\n"); 
     builder.append("whenRange" + "->" + this.whenRange + "\n"); 
     builder.append("rationale" + "->" + this.rationale + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RiskAssessmentPredictionModel]:" + "\n");
     builder.append("outcome" + "->" + this.outcome + "\n"); 
     builder.append("probabilityDecimal" + "->" + this.probabilityDecimal + "\n"); 
     builder.append("probabilityRange" + "->" + this.probabilityRange + "\n"); 
     builder.append("qualitativeRisk" + "->" + this.qualitativeRisk + "\n"); 
     builder.append("relativeRisk" + "->" + this.relativeRisk + "\n"); 
     builder.append("whenPeriod" + "->" + this.whenPeriod + "\n"); 
     builder.append("whenRange" + "->" + this.whenRange + "\n"); 
     builder.append("rationale" + "->" + this.rationale + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}