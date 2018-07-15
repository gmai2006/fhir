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
import org.fhir.entity.ImmunizationRecommendationRecommendationModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ImmunizationRecommendationRecommendation  extends BackboneElement  {
  /**
  * Description: "The date the immunization recommendation was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Vaccine that pertains to the recommendation."
  */
  protected CodeableConcept vaccineCode;

  /**
  * Description: "The targeted disease for the recommendation."
  */
  protected CodeableConcept targetDisease;

  /**
  * Description: "The next recommended dose number (e.g. dose 2 is the next recommended dose)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float doseNumber;

  /**
  * Description: "Extensions for doseNumber"
  */
  protected transient Element _doseNumber;

  /**
  * Description: "Vaccine administration status."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept forecastStatus;

  /**
  * Description: "Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc."
  */
  protected java.util.List<ImmunizationRecommendationDateCriterion> dateCriterion;

  /**
  * Description: "Contains information about the protocol under which the vaccine was administered."
  */
  protected ImmunizationRecommendationProtocol protocol;

  /**
  * Description: "Immunization event history that supports the status and recommendation."
  */
  protected java.util.List<Reference> supportingImmunization;

  /**
  * Description: "Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information."
  */
  protected java.util.List<Reference> supportingPatientInformation;

  public ImmunizationRecommendationRecommendation() {
  }

  public ImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendationModel o) {
    this.id = o.getId();
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getVaccineCode() && !o.getVaccineCode().isEmpty()) {
      this.vaccineCode = new CodeableConcept(o.getVaccineCode().get(0));
    }
    if (null != o.getTargetDisease() && !o.getTargetDisease().isEmpty()) {
      this.targetDisease = new CodeableConcept(o.getTargetDisease().get(0));
    }
    if (null != o.getDoseNumber()) {
      this.doseNumber = o.getDoseNumber();
    }
    if (null != o.getForecastStatus() && !o.getForecastStatus().isEmpty()) {
      this.forecastStatus = new CodeableConcept(o.getForecastStatus().get(0));
    }
    if (null != o.getDateCriterion() && !o.getDateCriterion().isEmpty()) {
    	this.dateCriterion = ImmunizationRecommendationDateCriterionHelper.fromArray2Array(o.getDateCriterion());
    }
    if (null != o.getProtocol() && !o.getProtocol().isEmpty()) {
      this.protocol = new ImmunizationRecommendationProtocol(o.getProtocol().get(0));
    }
    if (null != o.getSupportingImmunization() && !o.getSupportingImmunization().isEmpty()) {
    	this.supportingImmunization = ReferenceHelper.fromArray2Array(o.getSupportingImmunization());
    }
    if (null != o.getSupportingPatientInformation() && !o.getSupportingPatientInformation().isEmpty()) {
    	this.supportingPatientInformation = ReferenceHelper.fromArray2Array(o.getSupportingPatientInformation());
    }
  }

  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setVaccineCode( CodeableConcept value) {
    this.vaccineCode = value;
  }
  public CodeableConcept getVaccineCode() {
    return this.vaccineCode;
  }
  public void setTargetDisease( CodeableConcept value) {
    this.targetDisease = value;
  }
  public CodeableConcept getTargetDisease() {
    return this.targetDisease;
  }
  public void setDoseNumber( Float value) {
    this.doseNumber = value;
  }
  public Float getDoseNumber() {
    return this.doseNumber;
  }
  public void set_doseNumber( Element value) {
    this._doseNumber = value;
  }
  public Element get_doseNumber() {
    return this._doseNumber;
  }
  public void setForecastStatus( CodeableConcept value) {
    this.forecastStatus = value;
  }
  public CodeableConcept getForecastStatus() {
    return this.forecastStatus;
  }
  public void setDateCriterion( java.util.List<ImmunizationRecommendationDateCriterion> value) {
    this.dateCriterion = value;
  }
  public java.util.List<ImmunizationRecommendationDateCriterion> getDateCriterion() {
    return this.dateCriterion;
  }
  public void setProtocol( ImmunizationRecommendationProtocol value) {
    this.protocol = value;
  }
  public ImmunizationRecommendationProtocol getProtocol() {
    return this.protocol;
  }
  public void setSupportingImmunization( java.util.List<Reference> value) {
    this.supportingImmunization = value;
  }
  public java.util.List<Reference> getSupportingImmunization() {
    return this.supportingImmunization;
  }
  public void setSupportingPatientInformation( java.util.List<Reference> value) {
    this.supportingPatientInformation = value;
  }
  public java.util.List<Reference> getSupportingPatientInformation() {
    return this.supportingPatientInformation;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationRecommendationRecommendation]:" + "\n");
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.vaccineCode != null) builder.append("vaccineCode" + "->" + this.vaccineCode.toString() + "\n"); 
     if(this.targetDisease != null) builder.append("targetDisease" + "->" + this.targetDisease.toString() + "\n"); 
     if(this.doseNumber != null) builder.append("doseNumber" + "->" + this.doseNumber.toString() + "\n"); 
     if(this._doseNumber != null) builder.append("_doseNumber" + "->" + this._doseNumber.toString() + "\n"); 
     if(this.forecastStatus != null) builder.append("forecastStatus" + "->" + this.forecastStatus.toString() + "\n"); 
     if(this.dateCriterion != null) builder.append("dateCriterion" + "->" + this.dateCriterion.toString() + "\n"); 
     if(this.protocol != null) builder.append("protocol" + "->" + this.protocol.toString() + "\n"); 
     if(this.supportingImmunization != null) builder.append("supportingImmunization" + "->" + this.supportingImmunization.toString() + "\n"); 
     if(this.supportingPatientInformation != null) builder.append("supportingPatientInformation" + "->" + this.supportingPatientInformation.toString() + "\n"); ;
    return builder.toString();
  }


}