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
import com.google.gson.GsonBuilder;

/**
* "Measurements and simple assertions made about a patient, device or other subject."
*/
public class Observation  {
  /**
  * Description: "This is a Observation resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to this observation."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A plan, proposal or order that is fulfilled in whole or in part by this event."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "The status of the result value."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A code that classifies the general type of observation being made."
  */
  private java.util.List<CodeableConcept> category = new java.util.ArrayList<>();

  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"name\"."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept code;

  /**
  * Description: "The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject."
  */
  private Reference subject;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made."
  */
  private Reference context;

  /**
  * Description: "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  private transient Element _effectiveDateTime;

  /**
  * Description: "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself."
  */
  private Period effectivePeriod;

  /**
  * Description: "The date and time this observation was made available to providers, typically after the results have been reviewed and verified."
  */
  private String issued;

  /**
  * Description: "Extensions for issued"
  */
  private transient Element _issued;

  /**
  * Description: "Who was responsible for asserting the observed value as \"true\"."
  */
  private java.util.List<Reference> performer = new java.util.ArrayList<>();

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Quantity valueQuantity;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private CodeableConcept valueCodeableConcept;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  private transient Element _valueString;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Boolean valueBoolean;

  /**
  * Description: "Extensions for valueBoolean"
  */
  private transient Element _valueBoolean;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Range valueRange;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Ratio valueRatio;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private SampledData valueSampledData;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Attachment valueAttachment;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String valueTime;

  /**
  * Description: "Extensions for valueTime"
  */
  private transient Element _valueTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String valueDateTime;

  /**
  * Description: "Extensions for valueDateTime"
  */
  private transient Element _valueDateTime;

  /**
  * Description: "The information determined as a result of making the observation, if the information has a simple value."
  */
  private Period valuePeriod;

  /**
  * Description: "Provides a reason why the expected value in the element Observation.value[x] is missing."
  */
  private CodeableConcept dataAbsentReason;

  /**
  * Description: "The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag."
  */
  private CodeableConcept interpretation;

  /**
  * Description: "May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result."
  */
  private String comment;

  /**
  * Description: "Extensions for comment"
  */
  private transient Element _comment;

  /**
  * Description: "Indicates the site on the subject's body where the observation was made (i.e. the target site)."
  */
  private CodeableConcept bodySite;

  /**
  * Description: "Indicates the mechanism used to perform the observation."
  */
  private CodeableConcept method;

  /**
  * Description: "The specimen that was used when this observation was made."
  */
  private Reference specimen;

  /**
  * Description: "The device used to generate the observation data."
  */
  private Reference device;

  /**
  * Description: "Guidance on how to interpret the value by comparison to a normal or recommended range."
  */
  private java.util.List<ObservationReferenceRange> referenceRange = new java.util.ArrayList<>();

  /**
  * Description: "A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code."
  */
  private java.util.List<ObservationRelated> related = new java.util.ArrayList<>();

  /**
  * Description: "Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations."
  */
  private java.util.List<ObservationComponent> component = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public Observation() {
  }

  public Observation(ObservationModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.basedOn = Reference.fromArray(o.getBasedOn());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.category = CodeableConcept.fromArray(o.getCategory());
      this.code = CodeableConcept.fromJson(o.getCode());
      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      if (null != o.getEffectiveDateTime()) {
        this.effectiveDateTime = new String(o.getEffectiveDateTime());
      }

      this.effectivePeriod = Period.fromJson(o.getEffectivePeriod());
      if (null != o.getIssued()) {
        this.issued = new String(o.getIssued());
      }

      this.performer = Reference.fromArray(o.getPerformer());

      this.valueQuantity = Quantity.fromJson(o.getValueQuantity());
      this.valueCodeableConcept = CodeableConcept.fromJson(o.getValueCodeableConcept());
      if (null != o.getValueString()) {
        this.valueString = new String(o.getValueString());
      }

      if (null != o.getValueBoolean()) {
        this.valueBoolean = new Boolean(o.getValueBoolean());
      }

      this.valueRange = Range.fromJson(o.getValueRange());
      this.valueRatio = Ratio.fromJson(o.getValueRatio());
      this.valueSampledData = SampledData.fromJson(o.getValueSampledData());
      this.valueAttachment = Attachment.fromJson(o.getValueAttachment());
      if (null != o.getValueTime()) {
        this.valueTime = new String(o.getValueTime());
      }

      if (null != o.getValueDateTime()) {
        this.valueDateTime = new String(o.getValueDateTime());
      }

      this.valuePeriod = Period.fromJson(o.getValuePeriod());
      this.dataAbsentReason = CodeableConcept.fromJson(o.getDataAbsentReason());
      this.interpretation = CodeableConcept.fromJson(o.getInterpretation());
      if (null != o.getComment()) {
        this.comment = new String(o.getComment());
      }

      this.bodySite = CodeableConcept.fromJson(o.getBodySite());
      this.method = CodeableConcept.fromJson(o.getMethod());
      if (null != o.getSpecimen()) {
        this.specimen = new Reference(o.getSpecimen());
        this.specimen.setId(this.getId());
      }

      if (null != o.getDevice()) {
        this.device = new Reference(o.getDevice());
        this.device.setId(this.getId());
      }

      this.referenceRange = ObservationReferenceRange.fromArray(o.getReferenceRange());

      this.related = ObservationRelated.fromArray(o.getRelated());

      this.component = ObservationComponent.fromArray(o.getComponent());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("effectiveDateTime" + "[" + String.valueOf(this.effectiveDateTime) + "]\n"); 
     builder.append("_effectiveDateTime" + "[" + String.valueOf(this._effectiveDateTime) + "]\n"); 
     builder.append("effectivePeriod" + "[" + String.valueOf(this.effectivePeriod) + "]\n"); 
     builder.append("issued" + "[" + String.valueOf(this.issued) + "]\n"); 
     builder.append("_issued" + "[" + String.valueOf(this._issued) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("_valueString" + "[" + String.valueOf(this._valueString) + "]\n"); 
     builder.append("valueBoolean" + "[" + String.valueOf(this.valueBoolean) + "]\n"); 
     builder.append("_valueBoolean" + "[" + String.valueOf(this._valueBoolean) + "]\n"); 
     builder.append("valueRange" + "[" + String.valueOf(this.valueRange) + "]\n"); 
     builder.append("valueRatio" + "[" + String.valueOf(this.valueRatio) + "]\n"); 
     builder.append("valueSampledData" + "[" + String.valueOf(this.valueSampledData) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("_valueTime" + "[" + String.valueOf(this._valueTime) + "]\n"); 
     builder.append("valueDateTime" + "[" + String.valueOf(this.valueDateTime) + "]\n"); 
     builder.append("_valueDateTime" + "[" + String.valueOf(this._valueDateTime) + "]\n"); 
     builder.append("valuePeriod" + "[" + String.valueOf(this.valuePeriod) + "]\n"); 
     builder.append("dataAbsentReason" + "[" + String.valueOf(this.dataAbsentReason) + "]\n"); 
     builder.append("interpretation" + "[" + String.valueOf(this.interpretation) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
     builder.append("_comment" + "[" + String.valueOf(this._comment) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("method" + "[" + String.valueOf(this.method) + "]\n"); 
     builder.append("specimen" + "[" + String.valueOf(this.specimen) + "]\n"); 
     builder.append("device" + "[" + String.valueOf(this.device) + "]\n"); 
     builder.append("referenceRange" + "[" + String.valueOf(this.referenceRange) + "]\n"); 
     builder.append("related" + "[" + String.valueOf(this.related) + "]\n"); 
     builder.append("component" + "[" + String.valueOf(this.component) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<Observation> fromArray(java.util.List<ObservationModel> list) {
    return (java.util.List<Observation>)list.stream()
      .map(model -> new Observation(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ObservationModel> toModelArray(java.util.List<Observation> list) {
    return (java.util.List<ObservationModel>)list.stream()
      .map(model -> new ObservationModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Observation fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Observation.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Observation o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Observation> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}