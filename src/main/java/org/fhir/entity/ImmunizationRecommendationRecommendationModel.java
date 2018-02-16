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
* "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
*/
@Entity
@Table(name="immunizationrecommendationrecommendation")
public class ImmunizationRecommendationRecommendationModel  implements Serializable {
	private static final long serialVersionUID = 151873631179542196L;
  /**
  * Description: "The date the immunization recommendation was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Vaccine that pertains to the recommendation."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"vaccineCode\"", length = 16777215)
  private String vaccineCode;

  /**
  * Description: "The targeted disease for the recommendation."
  * Actual type: String;
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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"forecastStatus\"", length = 16777215)
  private String forecastStatus;

  /**
  * Description: "Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"datecriterion_id\"")
  private String datecriterion_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="datecriterion_id", insertable=false, updatable=false)
  private java.util.List<ImmunizationRecommendationDateCriterionModel> dateCriterion;

  /**
  * Description: "Contains information about the protocol under which the vaccine was administered."
  */
  @javax.persistence.Basic
  @Column(name="\"protocol_id\"")
  private String protocol_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="protocol_id", insertable=false, updatable=false)
  private java.util.List<ImmunizationRecommendationProtocolModel> protocol;

  /**
  * Description: "Immunization event history that supports the status and recommendation."
  */
  @javax.persistence.Basic
  @Column(name="\"supportingimmunization_id\"")
  private String supportingimmunization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="supportingimmunization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingImmunization;

  /**
  * Description: "Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information."
  */
  @javax.persistence.Basic
  @Column(name="\"supportingpatientinformation_id\"")
  private String supportingpatientinformation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="supportingpatientinformation_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingPatientInformation;

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

  public ImmunizationRecommendationRecommendationModel() {
  }

  public ImmunizationRecommendationRecommendationModel(ImmunizationRecommendationRecommendation o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.date = o.getDate();
    this.vaccineCode = JsonUtils.toJson(o.getVaccineCode());
    this.targetDisease = JsonUtils.toJson(o.getTargetDisease());
    this.doseNumber = o.getDoseNumber();
    this.forecastStatus = JsonUtils.toJson(o.getForecastStatus());
    if (null != o.getDateCriterion() && !o.getDateCriterion().isEmpty()) {
    	this.datecriterion_id = "datecriterion" + this.parent_id;
    	this.dateCriterion = ImmunizationRecommendationDateCriterionHelper.toModelFromArray(o.getDateCriterion(), this.datecriterion_id);
    }
    if (null != o.getProtocol() ) {
    	this.protocol_id = "protocol" + this.parent_id;
    	this.protocol = ImmunizationRecommendationProtocolHelper.toModel(o.getProtocol(), this.protocol_id);
    }
    if (null != o.getSupportingImmunization() && !o.getSupportingImmunization().isEmpty()) {
    	this.supportingimmunization_id = "supportingimmunization" + this.parent_id;
    	this.supportingImmunization = ReferenceHelper.toModelFromArray(o.getSupportingImmunization(), this.supportingimmunization_id);
    }
    if (null != o.getSupportingPatientInformation() && !o.getSupportingPatientInformation().isEmpty()) {
    	this.supportingpatientinformation_id = "supportingpatientinformation" + this.parent_id;
    	this.supportingPatientInformation = ReferenceHelper.toModelFromArray(o.getSupportingPatientInformation(), this.supportingpatientinformation_id);
    }
  }

  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getVaccineCode() {
    return this.vaccineCode;
  }
  public void setVaccineCode( String value) {
    this.vaccineCode = value;
  }
  public String getTargetDisease() {
    return this.targetDisease;
  }
  public void setTargetDisease( String value) {
    this.targetDisease = value;
  }
  public Float getDoseNumber() {
    return this.doseNumber;
  }
  public void setDoseNumber( Float value) {
    this.doseNumber = value;
  }
  public String getForecastStatus() {
    return this.forecastStatus;
  }
  public void setForecastStatus( String value) {
    this.forecastStatus = value;
  }
  public java.util.List<ImmunizationRecommendationDateCriterionModel> getDateCriterion() {
    return this.dateCriterion;
  }
  public void setDateCriterion( java.util.List<ImmunizationRecommendationDateCriterionModel> value) {
    this.dateCriterion = value;
  }
  public java.util.List<ImmunizationRecommendationProtocolModel> getProtocol() {
    return this.protocol;
  }
  public void setProtocol( java.util.List<ImmunizationRecommendationProtocolModel> value) {
    this.protocol = value;
  }
  public java.util.List<ReferenceModel> getSupportingImmunization() {
    return this.supportingImmunization;
  }
  public void setSupportingImmunization( java.util.List<ReferenceModel> value) {
    this.supportingImmunization = value;
  }
  public java.util.List<ReferenceModel> getSupportingPatientInformation() {
    return this.supportingPatientInformation;
  }
  public void setSupportingPatientInformation( java.util.List<ReferenceModel> value) {
    this.supportingPatientInformation = value;
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
    builder.append("[ImmunizationRecommendationRecommendationModel]:" + "\n");
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("vaccineCode" + "->" + this.vaccineCode + "\n"); 
     builder.append("targetDisease" + "->" + this.targetDisease + "\n"); 
     builder.append("doseNumber" + "->" + this.doseNumber + "\n"); 
     builder.append("forecastStatus" + "->" + this.forecastStatus + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationRecommendationRecommendationModel]:" + "\n");
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("vaccineCode" + "->" + this.vaccineCode + "\n"); 
     builder.append("targetDisease" + "->" + this.targetDisease + "\n"); 
     builder.append("doseNumber" + "->" + this.doseNumber + "\n"); 
     builder.append("forecastStatus" + "->" + this.forecastStatus + "\n"); 
     builder.append("dateCriterion" + "->" + this.dateCriterion + "\n"); 
     builder.append("protocol" + "->" + this.protocol + "\n"); 
     builder.append("supportingImmunization" + "->" + this.supportingImmunization + "\n"); 
     builder.append("supportingPatientInformation" + "->" + this.supportingPatientInformation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}