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
* "Measurements and simple assertions made about a patient, device or other subject."
*/
@Entity
@Table(name="observationcomponent")
public class ObservationComponentModel  implements Serializable {
	private static final long serialVersionUID = 151873631135521551L;
  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"code\"."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.persistence.Basic
  @Column(name="\"valuequantity_id\"")
  private String valuequantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuequantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> valueQuantity;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRange\"", length = 16777215)
  private String valueRange;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRatio\"", length = 16777215)
  private String valueRatio;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSampledData\"", length = 16777215)
  private String valueSampledData;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  * Actual type: String;
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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valuePeriod\"", length = 16777215)
  private String valuePeriod;

  /**
  * Description: "Provides a reason why the expected value in the element Observation.value[x] is missing."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dataAbsentReason\"", length = 16777215)
  private String dataAbsentReason;

  /**
  * Description: "The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"interpretation\"", length = 16777215)
  private String interpretation;

  /**
  * Description: "Guidance on how to interpret the value by comparison to a normal or recommended range."
  */
  @javax.persistence.Basic
  @Column(name="\"referencerange_id\"")
  private String referencerange_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="referencerange_id", insertable=false, updatable=false)
  private java.util.List<ObservationReferenceRangeModel> referenceRange;

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

  public ObservationComponentModel() {
  }

  public ObservationComponentModel(ObservationComponent o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.code = JsonUtils.toJson(o.getCode());
    if (null != o.getValueQuantity() ) {
    	this.valuequantity_id = "valuequantity" + this.parent_id;
    	this.valueQuantity = QuantityHelper.toModel(o.getValueQuantity(), this.valuequantity_id);
    }
    this.valueCodeableConcept = JsonUtils.toJson(o.getValueCodeableConcept());
    this.valueString = o.getValueString();
    this.valueRange = JsonUtils.toJson(o.getValueRange());
    this.valueRatio = JsonUtils.toJson(o.getValueRatio());
    this.valueSampledData = JsonUtils.toJson(o.getValueSampledData());
    this.valueAttachment = JsonUtils.toJson(o.getValueAttachment());
    this.valueTime = o.getValueTime();
    this.valueDateTime = o.getValueDateTime();
    this.valuePeriod = JsonUtils.toJson(o.getValuePeriod());
    this.dataAbsentReason = JsonUtils.toJson(o.getDataAbsentReason());
    this.interpretation = JsonUtils.toJson(o.getInterpretation());
    if (null != o.getReferenceRange() && !o.getReferenceRange().isEmpty()) {
    	this.referencerange_id = "referencerange" + this.parent_id;
    	this.referenceRange = ObservationReferenceRangeHelper.toModelFromArray(o.getReferenceRange(), this.referencerange_id);
    }
  }

  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public java.util.List<QuantityModel> getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueQuantity( java.util.List<QuantityModel> value) {
    this.valueQuantity = value;
  }
  public String getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCodeableConcept( String value) {
    this.valueCodeableConcept = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueRange() {
    return this.valueRange;
  }
  public void setValueRange( String value) {
    this.valueRange = value;
  }
  public String getValueRatio() {
    return this.valueRatio;
  }
  public void setValueRatio( String value) {
    this.valueRatio = value;
  }
  public String getValueSampledData() {
    return this.valueSampledData;
  }
  public void setValueSampledData( String value) {
    this.valueSampledData = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValuePeriod() {
    return this.valuePeriod;
  }
  public void setValuePeriod( String value) {
    this.valuePeriod = value;
  }
  public String getDataAbsentReason() {
    return this.dataAbsentReason;
  }
  public void setDataAbsentReason( String value) {
    this.dataAbsentReason = value;
  }
  public String getInterpretation() {
    return this.interpretation;
  }
  public void setInterpretation( String value) {
    this.interpretation = value;
  }
  public java.util.List<ObservationReferenceRangeModel> getReferenceRange() {
    return this.referenceRange;
  }
  public void setReferenceRange( java.util.List<ObservationReferenceRangeModel> value) {
    this.referenceRange = value;
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
    builder.append("[ObservationComponentModel]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("valueRatio" + "->" + this.valueRatio + "\n"); 
     builder.append("valueSampledData" + "->" + this.valueSampledData + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valuePeriod" + "->" + this.valuePeriod + "\n"); 
     builder.append("dataAbsentReason" + "->" + this.dataAbsentReason + "\n"); 
     builder.append("interpretation" + "->" + this.interpretation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ObservationComponentModel]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("valueQuantity" + "->" + this.valueQuantity + "\n"); 
     builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("valueRatio" + "->" + this.valueRatio + "\n"); 
     builder.append("valueSampledData" + "->" + this.valueSampledData + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valuePeriod" + "->" + this.valuePeriod + "\n"); 
     builder.append("dataAbsentReason" + "->" + this.dataAbsentReason + "\n"); 
     builder.append("interpretation" + "->" + this.interpretation + "\n"); 
     builder.append("referenceRange" + "->" + this.referenceRange + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}