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
* "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
*/
@Entity
@Table(name="immunizationrecommendationrecommendation")
public class ImmunizationRecommendationRecommendationModel  {
  /**
  * Description: "The date the immunization recommendation was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Vaccine that pertains to the recommendation."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"vaccineCode\"", length = 16777215)
  private String vaccineCode;

  /**
  * Description: "The targeted disease for the recommendation."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"targetDisease\"", length = 16777215)
  private String targetDisease;

  /**
  * Description: "The next recommended dose number (e.g. dose 2 is the next recommended dose)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"doseNumber\"")
  private Float doseNumber;

  /**
  * Description: "Vaccine administration status."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"forecastStatus\"", length = 16777215)
  private String forecastStatus;

  /**
  * Description: "Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ImmunizationRecommendationDateCriterionModel> dateCriterion = new java.util.ArrayList<>();

  /**
  * Description: "Contains information about the protocol under which the vaccine was administered."
  */
  @javax.persistence.Basic
  @Column(name="\"protocol_id\"")
  private String protocol_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`protocol_id`", insertable=false, updatable=false)
  private ImmunizationRecommendationProtocolModel protocol;

  /**
  * Description: "Immunization event history that supports the status and recommendation."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingImmunization = new java.util.ArrayList<>();

  /**
  * Description: "Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingPatientInformation = new java.util.ArrayList<>();

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

  public ImmunizationRecommendationRecommendationModel() {
  }

  public ImmunizationRecommendationRecommendationModel(ImmunizationRecommendationRecommendation o) {
    this.id = o.getId();
      this.date = o.getDate();

      this.vaccineCode = CodeableConcept.toJson(o.getVaccineCode());
      this.targetDisease = CodeableConcept.toJson(o.getTargetDisease());
      this.doseNumber = o.getDoseNumber();

      this.forecastStatus = CodeableConcept.toJson(o.getForecastStatus());
      this.dateCriterion = ImmunizationRecommendationDateCriterion.toModelArray(o.getDateCriterion());

      if (null != o.getProtocol()) {
      	this.protocol_id = "protocol" + this.getId();
        this.protocol = new ImmunizationRecommendationProtocolModel(o.getProtocol());
        this.protocol.setId(this.protocol_id);
        this.protocol.parent_id = this.protocol.getId();
      }

      this.supportingImmunization = Reference.toModelArray(o.getSupportingImmunization());

      this.supportingPatientInformation = Reference.toModelArray(o.getSupportingPatientInformation());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setVaccineCode( String value) {
    this.vaccineCode = value;
  }
  public String getVaccineCode() {
    return this.vaccineCode;
  }
  public void setTargetDisease( String value) {
    this.targetDisease = value;
  }
  public String getTargetDisease() {
    return this.targetDisease;
  }
  public void setDoseNumber( Float value) {
    this.doseNumber = value;
  }
  public Float getDoseNumber() {
    return this.doseNumber;
  }
  public void setForecastStatus( String value) {
    this.forecastStatus = value;
  }
  public String getForecastStatus() {
    return this.forecastStatus;
  }
  public void setDateCriterion( java.util.List<ImmunizationRecommendationDateCriterionModel> value) {
    this.dateCriterion = value;
  }
  public java.util.List<ImmunizationRecommendationDateCriterionModel> getDateCriterion() {
    return this.dateCriterion;
  }
  public void setProtocol( ImmunizationRecommendationProtocolModel value) {
    this.protocol = value;
  }
  public ImmunizationRecommendationProtocolModel getProtocol() {
    return this.protocol;
  }
  public void setSupportingImmunization( java.util.List<ReferenceModel> value) {
    this.supportingImmunization = value;
  }
  public java.util.List<ReferenceModel> getSupportingImmunization() {
    return this.supportingImmunization;
  }
  public void setSupportingPatientInformation( java.util.List<ReferenceModel> value) {
    this.supportingPatientInformation = value;
  }
  public java.util.List<ReferenceModel> getSupportingPatientInformation() {
    return this.supportingPatientInformation;
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
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("vaccineCode" + "[" + String.valueOf(this.vaccineCode) + "]\n"); 
     builder.append("targetDisease" + "[" + String.valueOf(this.targetDisease) + "]\n"); 
     builder.append("doseNumber" + "[" + String.valueOf(this.doseNumber) + "]\n"); 
     builder.append("forecastStatus" + "[" + String.valueOf(this.forecastStatus) + "]\n"); 
     builder.append("dateCriterion" + "[" + String.valueOf(this.dateCriterion) + "]\n"); 
     builder.append("protocol" + "[" + String.valueOf(this.protocol) + "]\n"); 
     builder.append("supportingImmunization" + "[" + String.valueOf(this.supportingImmunization) + "]\n"); 
     builder.append("supportingPatientInformation" + "[" + String.valueOf(this.supportingPatientInformation) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}