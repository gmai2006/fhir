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
import org.fhir.entity.ObservationModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Measurements and simple assertions made about a patient, device or other subject."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Observation  extends DomainResource  {
  /**
  * Description: "This is a Observation resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A unique identifier assigned to this observation."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "A plan, proposal or order that is fulfilled in whole or in part by this event."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "The status of the result value."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A code that classifies the general type of observation being made."
  */
  protected java.util.List<CodeableConcept> category;

  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"name\"."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject."
  */
  protected Reference subject;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made."
  */
  protected Reference context;

  /**
  * Description: "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  protected transient Element _effectiveDateTime;

  /**
  * Description: "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself."
  */
  protected Period effectivePeriod;

  /**
  * Description: "The date and time this observation was made available to providers, typically after the results have been reviewed and verified."
  */
  protected String issued;

  /**
  * Description: "Extensions for issued"
  */
  protected transient Element _issued;

  /**
  * Description: "Who was responsible for asserting the observed value as \"true\"."
  */
  protected java.util.List<Reference> performer;

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
  protected Boolean valueBoolean;

  /**
  * Description: "Extensions for valueBoolean"
  */
  protected transient Element _valueBoolean;

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
  * Description: "May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  /**
  * Description: "Indicates the site on the subject's body where the observation was made (i.e. the target site)."
  */
  protected CodeableConcept bodySite;

  /**
  * Description: "Indicates the mechanism used to perform the observation."
  */
  protected CodeableConcept method;

  /**
  * Description: "The specimen that was used when this observation was made."
  */
  protected Reference specimen;

  /**
  * Description: "The device used to generate the observation data."
  */
  protected Reference device;

  /**
  * Description: "Guidance on how to interpret the value by comparison to a normal or recommended range."
  */
  protected java.util.List<ObservationReferenceRange> referenceRange;

  /**
  * Description: "A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code."
  */
  protected java.util.List<ObservationRelated> related;

  /**
  * Description: "Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations."
  */
  protected java.util.List<ObservationComponent> component;

  public Observation() {
  }

  public Observation(ObservationModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category = CodeableConceptHelper.fromArray2Array(o.getCategory());
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getEffectiveDateTime()) {
      this.effectiveDateTime = o.getEffectiveDateTime();
    }
    this.effectivePeriod = PeriodHelper.fromJson(o.getEffectivePeriod());
    if (null != o.getIssued()) {
      this.issued = o.getIssued();
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer = ReferenceHelper.fromArray2Array(o.getPerformer());
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
    if (null != o.getValueBoolean()) {
      this.valueBoolean = o.getValueBoolean();
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
    if (null != o.getComment()) {
      this.comment = o.getComment();
    }
    if (null != o.getBodySite() && !o.getBodySite().isEmpty()) {
      this.bodySite = new CodeableConcept(o.getBodySite().get(0));
    }
    if (null != o.getMethod() && !o.getMethod().isEmpty()) {
      this.method = new CodeableConcept(o.getMethod().get(0));
    }
    if (null != o.getSpecimen() && !o.getSpecimen().isEmpty()) {
      this.specimen = new Reference(o.getSpecimen().get(0));
    }
    if (null != o.getDevice() && !o.getDevice().isEmpty()) {
      this.device = new Reference(o.getDevice().get(0));
    }
    if (null != o.getReferenceRange() && !o.getReferenceRange().isEmpty()) {
    	this.referenceRange = ObservationReferenceRangeHelper.fromArray2Array(o.getReferenceRange());
    }
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related = ObservationRelatedHelper.fromArray2Array(o.getRelated());
    }
    if (null != o.getComponent() && !o.getComponent().isEmpty()) {
    	this.component = ObservationComponentHelper.fromArray2Array(o.getComponent());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setEffectiveDateTime( String value) {
    this.effectiveDateTime = value;
  }
  public String getEffectiveDateTime() {
    return this.effectiveDateTime;
  }
  public void set_effectiveDateTime( Element value) {
    this._effectiveDateTime = value;
  }
  public Element get_effectiveDateTime() {
    return this._effectiveDateTime;
  }
  public void setEffectivePeriod( Period value) {
    this.effectivePeriod = value;
  }
  public Period getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void set_issued( Element value) {
    this._issued = value;
  }
  public Element get_issued() {
    return this._issued;
  }
  public void setPerformer( java.util.List<Reference> value) {
    this.performer = value;
  }
  public java.util.List<Reference> getPerformer() {
    return this.performer;
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
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void set_valueBoolean( Element value) {
    this._valueBoolean = value;
  }
  public Element get_valueBoolean() {
    return this._valueBoolean;
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
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }
  public void setBodySite( CodeableConcept value) {
    this.bodySite = value;
  }
  public CodeableConcept getBodySite() {
    return this.bodySite;
  }
  public void setMethod( CodeableConcept value) {
    this.method = value;
  }
  public CodeableConcept getMethod() {
    return this.method;
  }
  public void setSpecimen( Reference value) {
    this.specimen = value;
  }
  public Reference getSpecimen() {
    return this.specimen;
  }
  public void setDevice( Reference value) {
    this.device = value;
  }
  public Reference getDevice() {
    return this.device;
  }
  public void setReferenceRange( java.util.List<ObservationReferenceRange> value) {
    this.referenceRange = value;
  }
  public java.util.List<ObservationReferenceRange> getReferenceRange() {
    return this.referenceRange;
  }
  public void setRelated( java.util.List<ObservationRelated> value) {
    this.related = value;
  }
  public java.util.List<ObservationRelated> getRelated() {
    return this.related;
  }
  public void setComponent( java.util.List<ObservationComponent> value) {
    this.component = value;
  }
  public java.util.List<ObservationComponent> getComponent() {
    return this.component;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Observation]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.effectiveDateTime != null) builder.append("effectiveDateTime" + "->" + this.effectiveDateTime.toString() + "\n"); 
     if(this._effectiveDateTime != null) builder.append("_effectiveDateTime" + "->" + this._effectiveDateTime.toString() + "\n"); 
     if(this.effectivePeriod != null) builder.append("effectivePeriod" + "->" + this.effectivePeriod.toString() + "\n"); 
     if(this.issued != null) builder.append("issued" + "->" + this.issued.toString() + "\n"); 
     if(this._issued != null) builder.append("_issued" + "->" + this._issued.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.valueQuantity != null) builder.append("valueQuantity" + "->" + this.valueQuantity.toString() + "\n"); 
     if(this.valueCodeableConcept != null) builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept.toString() + "\n"); 
     if(this.valueString != null) builder.append("valueString" + "->" + this.valueString.toString() + "\n"); 
     if(this._valueString != null) builder.append("_valueString" + "->" + this._valueString.toString() + "\n"); 
     if(this.valueBoolean != null) builder.append("valueBoolean" + "->" + this.valueBoolean.toString() + "\n"); 
     if(this._valueBoolean != null) builder.append("_valueBoolean" + "->" + this._valueBoolean.toString() + "\n"); 
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
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); 
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); 
     if(this.method != null) builder.append("method" + "->" + this.method.toString() + "\n"); 
     if(this.specimen != null) builder.append("specimen" + "->" + this.specimen.toString() + "\n"); 
     if(this.device != null) builder.append("device" + "->" + this.device.toString() + "\n"); 
     if(this.referenceRange != null) builder.append("referenceRange" + "->" + this.referenceRange.toString() + "\n"); 
     if(this.related != null) builder.append("related" + "->" + this.related.toString() + "\n"); 
     if(this.component != null) builder.append("component" + "->" + this.component.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Observation,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Observation" : { return Observation.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	registered,
  	preliminary,
  	FHIRfinal,
  	amended,
  	corrected,
  	cancelled,
  	enteredinerror,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "registered" : { return registered.toString(); }
  			case "preliminary" : { return preliminary.toString(); }
  			case "final" : { return FHIRfinal.toString(); }
  			case "amended" : { return amended.toString(); }
  			case "corrected" : { return corrected.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}