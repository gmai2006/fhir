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
import com.google.gson.GsonBuilder;

/**
* "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
*/
public class ImmunizationRecommendationRecommendation  {
  /**
  * Description: "The date the immunization recommendation was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "Vaccine that pertains to the recommendation."
  */
  private CodeableConcept vaccineCode;

  /**
  * Description: "The targeted disease for the recommendation."
  */
  private CodeableConcept targetDisease;

  /**
  * Description: "The next recommended dose number (e.g. dose 2 is the next recommended dose)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float doseNumber;

  /**
  * Description: "Extensions for doseNumber"
  */
  private transient Element _doseNumber;

  /**
  * Description: "Vaccine administration status."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept forecastStatus;

  /**
  * Description: "Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc."
  */
  private java.util.List<ImmunizationRecommendationDateCriterion> dateCriterion = new java.util.ArrayList<>();

  /**
  * Description: "Contains information about the protocol under which the vaccine was administered."
  */
  private ImmunizationRecommendationProtocol protocol;

  /**
  * Description: "Immunization event history that supports the status and recommendation."
  */
  private java.util.List<Reference> supportingImmunization = new java.util.ArrayList<>();

  /**
  * Description: "Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information."
  */
  private java.util.List<Reference> supportingPatientInformation = new java.util.ArrayList<>();

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

  public ImmunizationRecommendationRecommendation() {
  }

  public ImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendationModel o) {
    this.id = o.getId();
      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      this.vaccineCode = CodeableConcept.fromJson(o.getVaccineCode());
      this.targetDisease = CodeableConcept.fromJson(o.getTargetDisease());
      if (null != o.getDoseNumber()) {
        this.doseNumber = new Float(o.getDoseNumber());
      }

      this.forecastStatus = CodeableConcept.fromJson(o.getForecastStatus());
      this.dateCriterion = ImmunizationRecommendationDateCriterion.fromArray(o.getDateCriterion());

      if (null != o.getProtocol()) {
        this.protocol = new ImmunizationRecommendationProtocol(o.getProtocol());
        this.protocol.setId(this.getId());
      }

      this.supportingImmunization = Reference.fromArray(o.getSupportingImmunization());

      this.supportingPatientInformation = Reference.fromArray(o.getSupportingPatientInformation());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("vaccineCode" + "[" + String.valueOf(this.vaccineCode) + "]\n"); 
     builder.append("targetDisease" + "[" + String.valueOf(this.targetDisease) + "]\n"); 
     builder.append("doseNumber" + "[" + String.valueOf(this.doseNumber) + "]\n"); 
     builder.append("_doseNumber" + "[" + String.valueOf(this._doseNumber) + "]\n"); 
     builder.append("forecastStatus" + "[" + String.valueOf(this.forecastStatus) + "]\n"); 
     builder.append("dateCriterion" + "[" + String.valueOf(this.dateCriterion) + "]\n"); 
     builder.append("protocol" + "[" + String.valueOf(this.protocol) + "]\n"); 
     builder.append("supportingImmunization" + "[" + String.valueOf(this.supportingImmunization) + "]\n"); 
     builder.append("supportingPatientInformation" + "[" + String.valueOf(this.supportingPatientInformation) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ImmunizationRecommendationRecommendation> fromArray(java.util.List<ImmunizationRecommendationRecommendationModel> list) {
    return (java.util.List<ImmunizationRecommendationRecommendation>)list.stream()
      .map(model -> new ImmunizationRecommendationRecommendation(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ImmunizationRecommendationRecommendationModel> toModelArray(java.util.List<ImmunizationRecommendationRecommendation> list) {
    return (java.util.List<ImmunizationRecommendationRecommendationModel>)list.stream()
      .map(model -> new ImmunizationRecommendationRecommendationModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ImmunizationRecommendationRecommendation fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImmunizationRecommendationRecommendation.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImmunizationRecommendationRecommendation o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImmunizationRecommendationRecommendation> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}