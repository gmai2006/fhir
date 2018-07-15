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
import org.fhir.entity.ObservationComponentModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Measurements and simple assertions made about a patient, device or other subject."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ObservationComponent  extends BackboneElement  {
  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"code\"."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  protected Quantity valueQuantity;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  protected CodeableConcept valueCodeableConcept;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  protected String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  protected transient Element _valueString;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  protected Range valueRange;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  protected Ratio valueRatio;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  protected SampledData valueSampledData;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  protected Attachment valueAttachment;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  protected String valueTime;

  /**
  * Description: "Extensions for valueTime"
  */
  protected transient Element _valueTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String valueDateTime;

  /**
  * Description: "Extensions for valueDateTime"
  */
  protected transient Element _valueDateTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  protected Period valuePeriod;

  /**
  * Description: "Provides a reason why the expected value in the element Observation.value[x] is missing."
  */
  protected CodeableConcept dataAbsentReason;

  /**
  * Description: "The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag."
  */
  protected CodeableConcept interpretation;

  /**
  * Description: "Guidance on how to interpret the value by comparison to a normal or recommended range."
  */
  protected java.util.List<ObservationReferenceRange> referenceRange;

  public ObservationComponent() {
  }

  public ObservationComponent(ObservationComponentModel o) {
    this.id = o.getId();
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getValueQuantity() && !o.getValueQuantity().isEmpty()) {
      this.valueQuantity = new Quantity(o.getValueQuantity().get(0));
    }
    if (null != o.getValueCodeableConcept() && !o.getValueCodeableConcept().isEmpty()) {
      this.valueCodeableConcept = new CodeableConcept(o.getValueCodeableConcept().get(0));
    }
    if (null != o.getValueString()) {
      this.valueString = o.getValueString();
    }
    this.valueRange = RangeHelper.fromJson(o.getValueRange());
    this.valueRatio = RatioHelper.fromJson(o.getValueRatio());
    this.valueSampledData = SampledDataHelper.fromJson(o.getValueSampledData());
    this.valueAttachment = AttachmentHelper.fromJson(o.getValueAttachment());
    if (null != o.getValueTime()) {
      this.valueTime = o.getValueTime();
    }
    if (null != o.getValueDateTime()) {
      this.valueDateTime = o.getValueDateTime();
    }
    this.valuePeriod = PeriodHelper.fromJson(o.getValuePeriod());
    if (null != o.getDataAbsentReason() && !o.getDataAbsentReason().isEmpty()) {
      this.dataAbsentReason = new CodeableConcept(o.getDataAbsentReason().get(0));
    }
    if (null != o.getInterpretation() && !o.getInterpretation().isEmpty()) {
      this.interpretation = new CodeableConcept(o.getInterpretation().get(0));
    }
    if (null != o.getReferenceRange() && !o.getReferenceRange().isEmpty()) {
    	this.referenceRange = ObservationReferenceRangeHelper.fromArray2Array(o.getReferenceRange());
    }
  }

  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setValueQuantity( Quantity value) {
    this.valueQuantity = value;
  }
  public Quantity getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueCodeableConcept( CodeableConcept value) {
    this.valueCodeableConcept = value;
  }
  public CodeableConcept getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void set_valueString( Element value) {
    this._valueString = value;
  }
  public Element get_valueString() {
    return this._valueString;
  }
  public void setValueRange( Range value) {
    this.valueRange = value;
  }
  public Range getValueRange() {
    return this.valueRange;
  }
  public void setValueRatio( Ratio value) {
    this.valueRatio = value;
  }
  public Ratio getValueRatio() {
    return this.valueRatio;
  }
  public void setValueSampledData( SampledData value) {
    this.valueSampledData = value;
  }
  public SampledData getValueSampledData() {
    return this.valueSampledData;
  }
  public void setValueAttachment( Attachment value) {
    this.valueAttachment = value;
  }
  public Attachment getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void set_valueTime( Element value) {
    this._valueTime = value;
  }
  public Element get_valueTime() {
    return this._valueTime;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void set_valueDateTime( Element value) {
    this._valueDateTime = value;
  }
  public Element get_valueDateTime() {
    return this._valueDateTime;
  }
  public void setValuePeriod( Period value) {
    this.valuePeriod = value;
  }
  public Period getValuePeriod() {
    return this.valuePeriod;
  }
  public void setDataAbsentReason( CodeableConcept value) {
    this.dataAbsentReason = value;
  }
  public CodeableConcept getDataAbsentReason() {
    return this.dataAbsentReason;
  }
  public void setInterpretation( CodeableConcept value) {
    this.interpretation = value;
  }
  public CodeableConcept getInterpretation() {
    return this.interpretation;
  }
  public void setReferenceRange( java.util.List<ObservationReferenceRange> value) {
    this.referenceRange = value;
  }
  public java.util.List<ObservationReferenceRange> getReferenceRange() {
    return this.referenceRange;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ObservationComponent]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.valueQuantity != null) builder.append("valueQuantity" + "->" + this.valueQuantity.toString() + "\n"); 
     if(this.valueCodeableConcept != null) builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept.toString() + "\n"); 
     if(this.valueString != null) builder.append("valueString" + "->" + this.valueString.toString() + "\n"); 
     if(this._valueString != null) builder.append("_valueString" + "->" + this._valueString.toString() + "\n"); 
     if(this.valueRange != null) builder.append("valueRange" + "->" + this.valueRange.toString() + "\n"); 
     if(this.valueRatio != null) builder.append("valueRatio" + "->" + this.valueRatio.toString() + "\n"); 
     if(this.valueSampledData != null) builder.append("valueSampledData" + "->" + this.valueSampledData.toString() + "\n"); 
     if(this.valueAttachment != null) builder.append("valueAttachment" + "->" + this.valueAttachment.toString() + "\n"); 
     if(this.valueTime != null) builder.append("valueTime" + "->" + this.valueTime.toString() + "\n"); 
     if(this._valueTime != null) builder.append("_valueTime" + "->" + this._valueTime.toString() + "\n"); 
     if(this.valueDateTime != null) builder.append("valueDateTime" + "->" + this.valueDateTime.toString() + "\n"); 
     if(this._valueDateTime != null) builder.append("_valueDateTime" + "->" + this._valueDateTime.toString() + "\n"); 
     if(this.valuePeriod != null) builder.append("valuePeriod" + "->" + this.valuePeriod.toString() + "\n"); 
     if(this.dataAbsentReason != null) builder.append("dataAbsentReason" + "->" + this.dataAbsentReason.toString() + "\n"); 
     if(this.interpretation != null) builder.append("interpretation" + "->" + this.interpretation.toString() + "\n"); 
     if(this.referenceRange != null) builder.append("referenceRange" + "->" + this.referenceRange.toString() + "\n"); ;
    return builder.toString();
  }


}