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
* generated on 07/14/2018
*/
@Entity
@Table(name="immunizationrecommendationrecommendation")
public class ImmunizationRecommendationRecommendationModel  implements Serializable {
	private static final long serialVersionUID = 153159210212216103L;
  /**
  * Description: "The date the immunization recommendation was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "Vaccine that pertains to the recommendation."
  */
  @javax.persistence.Basic
  @Column(name="\"vaccinecode_id\"")
  private String vaccinecode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="vaccinecode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> vaccineCode;

  /**
  * Description: "The targeted disease for the recommendation."
  */
  @javax.persistence.Basic
  @Column(name="\"targetdisease_id\"")
  private String targetdisease_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="targetdisease_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> targetDisease;

  /**
  * Description: "The next recommended dose number (e.g. dose 2 is the next recommended dose)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"doseNumber\"")
  private Float doseNumber;

  /**
  * Description: "Vaccine administration status."
  */
  @javax.persistence.Basic
  @Column(name="\"forecaststatus_id\"")
  private String forecaststatus_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="forecaststatus_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> forecastStatus;

  /**
  * Description: "Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"datecriterion_id\"")
  private String datecriterion_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="datecriterion_id", insertable=false, updatable=false)
  private java.util.List<ImmunizationRecommendationDateCriterionModel> dateCriterion;

  /**
  * Description: "Contains information about the protocol under which the vaccine was administered."
  */
  @javax.persistence.Basic
  @Column(name="\"protocol_id\"")
  private String protocol_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="protocol_id", insertable=false, updatable=false)
  private java.util.List<ImmunizationRecommendationProtocolModel> protocol;

  /**
  * Description: "Immunization event history that supports the status and recommendation."
  */
  @javax.persistence.Basic
  @Column(name="\"supportingimmunization_id\"")
  private String supportingimmunization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="supportingimmunization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingImmunization;

  /**
  * Description: "Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information."
  */
  @javax.persistence.Basic
  @Column(name="\"supportingpatientinformation_id\"")
  private String supportingpatientinformation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="supportingpatientinformation_id", insertable=false, updatable=false)
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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public ImmunizationRecommendationRecommendationModel() {
  }

  public ImmunizationRecommendationRecommendationModel(ImmunizationRecommendationRecommendation o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.date = o.getDate();
    if (null != o.getVaccineCode() ) {
    	this.vaccinecode_id = "vaccinecode" + this.id;
    	this.vaccineCode = CodeableConceptHelper.toModel(o.getVaccineCode(), this.vaccinecode_id);
    }
    if (null != o.getTargetDisease() ) {
    	this.targetdisease_id = "targetdisease" + this.id;
    	this.targetDisease = CodeableConceptHelper.toModel(o.getTargetDisease(), this.targetdisease_id);
    }
    this.doseNumber = o.getDoseNumber();
    if (null != o.getForecastStatus() ) {
    	this.forecaststatus_id = "forecaststatus" + this.id;
    	this.forecastStatus = CodeableConceptHelper.toModel(o.getForecastStatus(), this.forecaststatus_id);
    }
    if (null != o.getDateCriterion() && !o.getDateCriterion().isEmpty()) {
    	this.datecriterion_id = "datecriterion" + this.id;
    	this.dateCriterion = ImmunizationRecommendationDateCriterionHelper.toModelFromArray(o.getDateCriterion(), this.datecriterion_id);
    }
    if (null != o.getProtocol() ) {
    	this.protocol_id = "protocol" + this.id;
    	this.protocol = ImmunizationRecommendationProtocolHelper.toModel(o.getProtocol(), this.protocol_id);
    }
    if (null != o.getSupportingImmunization() && !o.getSupportingImmunization().isEmpty()) {
    	this.supportingimmunization_id = "supportingimmunization" + this.id;
    	this.supportingImmunization = ReferenceHelper.toModelFromArray(o.getSupportingImmunization(), this.supportingimmunization_id);
    }
    if (null != o.getSupportingPatientInformation() && !o.getSupportingPatientInformation().isEmpty()) {
    	this.supportingpatientinformation_id = "supportingpatientinformation" + this.id;
    	this.supportingPatientInformation = ReferenceHelper.toModelFromArray(o.getSupportingPatientInformation(), this.supportingpatientinformation_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public java.util.List<CodeableConceptModel> getVaccineCode() {
    return this.vaccineCode;
  }
  public void setVaccineCode( java.util.List<CodeableConceptModel> value) {
    this.vaccineCode = value;
  }
  public java.util.List<CodeableConceptModel> getTargetDisease() {
    return this.targetDisease;
  }
  public void setTargetDisease( java.util.List<CodeableConceptModel> value) {
    this.targetDisease = value;
  }
  public Float getDoseNumber() {
    return this.doseNumber;
  }
  public void setDoseNumber( Float value) {
    this.doseNumber = value;
  }
  public java.util.List<CodeableConceptModel> getForecastStatus() {
    return this.forecastStatus;
  }
  public void setForecastStatus( java.util.List<CodeableConceptModel> value) {
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationRecommendationRecommendationModel]:" + "\n");
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("doseNumber" + "->" + this.doseNumber + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationRecommendationRecommendationModel]:" + "\n");
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("doseNumber" + "->" + this.doseNumber + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}