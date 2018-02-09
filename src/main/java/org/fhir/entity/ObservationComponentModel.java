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
* "Measurements and simple assertions made about a patient, device or other subject."
*/
@Entity
@Table(name="observationcomponent")
public class ObservationComponentModel  {
  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"code\"."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueQuantity\"", length = 16777215)
  private String valueQuantity;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCodeableConcept\"", length = 16777215)
  private String valueCodeableConcept;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.persistence.Basic
  @Column(name="\"valueString\"")
  private String valueString;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRange\"", length = 16777215)
  private String valueRange;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: Ratio
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRatio\"", length = 16777215)
  private String valueRatio;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: SampledData
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSampledData\"", length = 16777215)
  private String valueSampledData;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: Attachment
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAttachment\"", length = 16777215)
  private String valueAttachment;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueTime\"")
  private String valueTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDateTime\"")
  private String valueDateTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valuePeriod\"", length = 16777215)
  private String valuePeriod;

  /**
  * Description: "Provides a reason why the expected value in the element Observation.value[x] is missing."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dataAbsentReason\"", length = 16777215)
  private String dataAbsentReason;

  /**
  * Description: "The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"interpretation\"", length = 16777215)
  private String interpretation;

  /**
  * Description: "Guidance on how to interpret the value by comparison to a normal or recommended range."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ObservationReferenceRangeModel> referenceRange = new java.util.ArrayList<>();

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

  public ObservationComponentModel() {
  }

  public ObservationComponentModel(ObservationComponent o) {
    this.id = o.getId();
      this.code = CodeableConcept.toJson(o.getCode());
      this.valueQuantity = Quantity.toJson(o.getValueQuantity());
      this.valueCodeableConcept = CodeableConcept.toJson(o.getValueCodeableConcept());
      this.valueString = o.getValueString();

      this.valueRange = Range.toJson(o.getValueRange());
      this.valueRatio = Ratio.toJson(o.getValueRatio());
      this.valueSampledData = SampledData.toJson(o.getValueSampledData());
      this.valueAttachment = Attachment.toJson(o.getValueAttachment());
      this.valueTime = o.getValueTime();

      this.valueDateTime = o.getValueDateTime();

      this.valuePeriod = Period.toJson(o.getValuePeriod());
      this.dataAbsentReason = CodeableConcept.toJson(o.getDataAbsentReason());
      this.interpretation = CodeableConcept.toJson(o.getInterpretation());
      this.referenceRange = ObservationReferenceRange.toModelArray(o.getReferenceRange());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setValueQuantity( String value) {
    this.valueQuantity = value;
  }
  public String getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueCodeableConcept( String value) {
    this.valueCodeableConcept = value;
  }
  public String getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueRange( String value) {
    this.valueRange = value;
  }
  public String getValueRange() {
    return this.valueRange;
  }
  public void setValueRatio( String value) {
    this.valueRatio = value;
  }
  public String getValueRatio() {
    return this.valueRatio;
  }
  public void setValueSampledData( String value) {
    this.valueSampledData = value;
  }
  public String getValueSampledData() {
    return this.valueSampledData;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void setValuePeriod( String value) {
    this.valuePeriod = value;
  }
  public String getValuePeriod() {
    return this.valuePeriod;
  }
  public void setDataAbsentReason( String value) {
    this.dataAbsentReason = value;
  }
  public String getDataAbsentReason() {
    return this.dataAbsentReason;
  }
  public void setInterpretation( String value) {
    this.interpretation = value;
  }
  public String getInterpretation() {
    return this.interpretation;
  }
  public void setReferenceRange( java.util.List<ObservationReferenceRangeModel> value) {
    this.referenceRange = value;
  }
  public java.util.List<ObservationReferenceRangeModel> getReferenceRange() {
    return this.referenceRange;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("valueRange" + "[" + String.valueOf(this.valueRange) + "]\n"); 
     builder.append("valueRatio" + "[" + String.valueOf(this.valueRatio) + "]\n"); 
     builder.append("valueSampledData" + "[" + String.valueOf(this.valueSampledData) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("valueDateTime" + "[" + String.valueOf(this.valueDateTime) + "]\n"); 
     builder.append("valuePeriod" + "[" + String.valueOf(this.valuePeriod) + "]\n"); 
     builder.append("dataAbsentReason" + "[" + String.valueOf(this.dataAbsentReason) + "]\n"); 
     builder.append("interpretation" + "[" + String.valueOf(this.interpretation) + "]\n"); 
     builder.append("referenceRange" + "[" + String.valueOf(this.referenceRange) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}