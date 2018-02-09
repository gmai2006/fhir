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
@Table(name="observation")
public class ObservationModel  {
  /**
  * Description: "This is a Observation resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to this observation."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A plan, proposal or order that is fulfilled in whole or in part by this event."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "The status of the result value."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A code that classifies the general type of observation being made."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"name\"."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"effectiveDateTime\"")
  private String effectiveDateTime;

  /**
  * Description: "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"effectivePeriod\"", length = 16777215)
  private String effectivePeriod;

  /**
  * Description: "The date and time this observation was made available to providers, typically after the results have been reviewed and verified."
  */
  @javax.persistence.Basic
  @Column(name="\"issued\"")
  private String issued;

  /**
  * Description: "Who was responsible for asserting the observed value as \"true\"."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> performer = new java.util.ArrayList<>();

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
  */
  @javax.persistence.Basic
  @Column(name="\"valueBoolean\"")
  private Boolean valueBoolean;

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
  * Description: "May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

  /**
  * Description: "Indicates the site on the subject's body where the observation was made (i.e. the target site)."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bodySite\"", length = 16777215)
  private String bodySite;

  /**
  * Description: "Indicates the mechanism used to perform the observation."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"method\"", length = 16777215)
  private String method;

  /**
  * Description: "The specimen that was used when this observation was made."
  */
  @javax.persistence.Basic
  @Column(name="\"specimen_id\"")
  private String specimen_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`specimen_id`", insertable=false, updatable=false)
  private ReferenceModel specimen;

  /**
  * Description: "The device used to generate the observation data."
  */
  @javax.persistence.Basic
  @Column(name="\"device_id\"")
  private String device_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`device_id`", insertable=false, updatable=false)
  private ReferenceModel device;

  /**
  * Description: "Guidance on how to interpret the value by comparison to a normal or recommended range."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ObservationReferenceRangeModel> referenceRange = new java.util.ArrayList<>();

  /**
  * Description: "A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ObservationRelatedModel> related = new java.util.ArrayList<>();

  /**
  * Description: "Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ObservationComponentModel> component = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;


  public ObservationModel() {
  }

  public ObservationModel(Observation o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.basedOn = Reference.toModelArray(o.getBasedOn());

      this.status = o.getStatus();

      this.category = CodeableConcept.toJson(o.getCategory());
      this.code = CodeableConcept.toJson(o.getCode());
      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      if (null != o.getContext()) {
      	this.context_id = "context" + this.getId();
        this.context = new ReferenceModel(o.getContext());
        this.context.setId(this.context_id);
        this.context.parent_id = this.context.getId();
      }

      this.effectiveDateTime = o.getEffectiveDateTime();

      this.effectivePeriod = Period.toJson(o.getEffectivePeriod());
      this.issued = o.getIssued();

      this.performer = Reference.toModelArray(o.getPerformer());

      this.valueQuantity = Quantity.toJson(o.getValueQuantity());
      this.valueCodeableConcept = CodeableConcept.toJson(o.getValueCodeableConcept());
      this.valueString = o.getValueString();

      this.valueBoolean = o.getValueBoolean();

      this.valueRange = Range.toJson(o.getValueRange());
      this.valueRatio = Ratio.toJson(o.getValueRatio());
      this.valueSampledData = SampledData.toJson(o.getValueSampledData());
      this.valueAttachment = Attachment.toJson(o.getValueAttachment());
      this.valueTime = o.getValueTime();

      this.valueDateTime = o.getValueDateTime();

      this.valuePeriod = Period.toJson(o.getValuePeriod());
      this.dataAbsentReason = CodeableConcept.toJson(o.getDataAbsentReason());
      this.interpretation = CodeableConcept.toJson(o.getInterpretation());
      this.comment = o.getComment();

      this.bodySite = CodeableConcept.toJson(o.getBodySite());
      this.method = CodeableConcept.toJson(o.getMethod());
      if (null != o.getSpecimen()) {
      	this.specimen_id = "specimen" + this.getId();
        this.specimen = new ReferenceModel(o.getSpecimen());
        this.specimen.setId(this.specimen_id);
        this.specimen.parent_id = this.specimen.getId();
      }

      if (null != o.getDevice()) {
      	this.device_id = "device" + this.getId();
        this.device = new ReferenceModel(o.getDevice());
        this.device.setId(this.device_id);
        this.device.parent_id = this.device.getId();
      }

      this.referenceRange = ObservationReferenceRange.toModelArray(o.getReferenceRange());

      this.related = ObservationRelated.toModelArray(o.getRelated());

      this.component = ObservationComponent.toModelArray(o.getComponent());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setContext( ReferenceModel value) {
    this.context = value;
  }
  public ReferenceModel getContext() {
    return this.context;
  }
  public void setEffectiveDateTime( String value) {
    this.effectiveDateTime = value;
  }
  public String getEffectiveDateTime() {
    return this.effectiveDateTime;
  }
  public void setEffectivePeriod( String value) {
    this.effectivePeriod = value;
  }
  public String getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void setPerformer( java.util.List<ReferenceModel> value) {
    this.performer = value;
  }
  public java.util.List<ReferenceModel> getPerformer() {
    return this.performer;
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
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
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
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setBodySite( String value) {
    this.bodySite = value;
  }
  public String getBodySite() {
    return this.bodySite;
  }
  public void setMethod( String value) {
    this.method = value;
  }
  public String getMethod() {
    return this.method;
  }
  public void setSpecimen( ReferenceModel value) {
    this.specimen = value;
  }
  public ReferenceModel getSpecimen() {
    return this.specimen;
  }
  public void setDevice( ReferenceModel value) {
    this.device = value;
  }
  public ReferenceModel getDevice() {
    return this.device;
  }
  public void setReferenceRange( java.util.List<ObservationReferenceRangeModel> value) {
    this.referenceRange = value;
  }
  public java.util.List<ObservationReferenceRangeModel> getReferenceRange() {
    return this.referenceRange;
  }
  public void setRelated( java.util.List<ObservationRelatedModel> value) {
    this.related = value;
  }
  public java.util.List<ObservationRelatedModel> getRelated() {
    return this.related;
  }
  public void setComponent( java.util.List<ObservationComponentModel> value) {
    this.component = value;
  }
  public java.util.List<ObservationComponentModel> getComponent() {
    return this.component;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
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
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("effectiveDateTime" + "[" + String.valueOf(this.effectiveDateTime) + "]\n"); 
     builder.append("effectivePeriod" + "[" + String.valueOf(this.effectivePeriod) + "]\n"); 
     builder.append("issued" + "[" + String.valueOf(this.issued) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("valueBoolean" + "[" + String.valueOf(this.valueBoolean) + "]\n"); 
     builder.append("valueRange" + "[" + String.valueOf(this.valueRange) + "]\n"); 
     builder.append("valueRatio" + "[" + String.valueOf(this.valueRatio) + "]\n"); 
     builder.append("valueSampledData" + "[" + String.valueOf(this.valueSampledData) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("valueDateTime" + "[" + String.valueOf(this.valueDateTime) + "]\n"); 
     builder.append("valuePeriod" + "[" + String.valueOf(this.valuePeriod) + "]\n"); 
     builder.append("dataAbsentReason" + "[" + String.valueOf(this.dataAbsentReason) + "]\n"); 
     builder.append("interpretation" + "[" + String.valueOf(this.interpretation) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
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
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}