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
@Table(name="observation")
public class ObservationModel  implements Serializable {
	private static final long serialVersionUID = 151910893731951643L;
  /**
  * Description: "This is a Observation resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to this observation."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A plan, proposal or order that is fulfilled in whole or in part by this event."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "The status of the result value."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A code that classifies the general type of observation being made."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "Describes what was observed. Sometimes this is called the observation \"name\"."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"effectiveDateTime\"")
  private String effectiveDateTime;

  /**
  * Description: "The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself."
  * Actual type: String;
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
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="performer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> performer;

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
  */
  @javax.persistence.Basic
  @Column(name="\"valuecodeableconcept_id\"")
  private String valuecodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuecodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> valueCodeableConcept;

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
  */
  @javax.persistence.Basic
  @Column(name="\"dataabsentreason_id\"")
  private String dataabsentreason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dataabsentreason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> dataAbsentReason;

  /**
  * Description: "The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag."
  */
  @javax.persistence.Basic
  @Column(name="\"interpretation_id\"")
  private String interpretation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="interpretation_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> interpretation;

  /**
  * Description: "May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

  /**
  * Description: "Indicates the site on the subject's body where the observation was made (i.e. the target site)."
  */
  @javax.persistence.Basic
  @Column(name="\"bodysite_id\"")
  private String bodysite_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="bodysite_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> bodySite;

  /**
  * Description: "Indicates the mechanism used to perform the observation."
  */
  @javax.persistence.Basic
  @Column(name="\"method_id\"")
  private String method_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="method_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> method;

  /**
  * Description: "The specimen that was used when this observation was made."
  */
  @javax.persistence.Basic
  @Column(name="\"specimen_id\"")
  private String specimen_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="specimen_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> specimen;

  /**
  * Description: "The device used to generate the observation data."
  */
  @javax.persistence.Basic
  @Column(name="\"device_id\"")
  private String device_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="device_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> device;

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
  * Description: "A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code."
  */
  @javax.persistence.Basic
  @Column(name="\"related_id\"")
  private String related_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="related_id", insertable=false, updatable=false)
  private java.util.List<ObservationRelatedModel> related;

  /**
  * Description: "Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations."
  */
  @javax.persistence.Basic
  @Column(name="\"component_id\"")
  private String component_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="component_id", insertable=false, updatable=false)
  private java.util.List<ObservationComponentModel> component;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

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
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    this.status = o.getStatus();
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModelFromArray(o.getCategory(), this.category_id);
    }
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    this.effectiveDateTime = o.getEffectiveDateTime();
    if (null != o.getEffectivePeriod()) {
    	this.effectivePeriod = JsonUtils.toJson(o.getEffectivePeriod());
    }
    this.issued = o.getIssued();
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer_id = "performer" + this.id;
    	this.performer = ReferenceHelper.toModelFromArray(o.getPerformer(), this.performer_id);
    }
    if (null != o.getValueQuantity() ) {
    	this.valuequantity_id = "valuequantity" + this.id;
    	this.valueQuantity = QuantityHelper.toModel(o.getValueQuantity(), this.valuequantity_id);
    }
    if (null != o.getValueCodeableConcept() ) {
    	this.valuecodeableconcept_id = "valuecodeableconcept" + this.id;
    	this.valueCodeableConcept = CodeableConceptHelper.toModel(o.getValueCodeableConcept(), this.valuecodeableconcept_id);
    }
    this.valueString = o.getValueString();
    this.valueBoolean = o.getValueBoolean();
    if (null != o.getValueRange()) {
    	this.valueRange = JsonUtils.toJson(o.getValueRange());
    }
    if (null != o.getValueRatio()) {
    	this.valueRatio = JsonUtils.toJson(o.getValueRatio());
    }
    if (null != o.getValueSampledData()) {
    	this.valueSampledData = JsonUtils.toJson(o.getValueSampledData());
    }
    if (null != o.getValueAttachment()) {
    	this.valueAttachment = JsonUtils.toJson(o.getValueAttachment());
    }
    this.valueTime = o.getValueTime();
    this.valueDateTime = o.getValueDateTime();
    if (null != o.getValuePeriod()) {
    	this.valuePeriod = JsonUtils.toJson(o.getValuePeriod());
    }
    if (null != o.getDataAbsentReason() ) {
    	this.dataabsentreason_id = "dataabsentreason" + this.id;
    	this.dataAbsentReason = CodeableConceptHelper.toModel(o.getDataAbsentReason(), this.dataabsentreason_id);
    }
    if (null != o.getInterpretation() ) {
    	this.interpretation_id = "interpretation" + this.id;
    	this.interpretation = CodeableConceptHelper.toModel(o.getInterpretation(), this.interpretation_id);
    }
    this.comment = o.getComment();
    if (null != o.getBodySite() ) {
    	this.bodysite_id = "bodysite" + this.id;
    	this.bodySite = CodeableConceptHelper.toModel(o.getBodySite(), this.bodysite_id);
    }
    if (null != o.getMethod() ) {
    	this.method_id = "method" + this.id;
    	this.method = CodeableConceptHelper.toModel(o.getMethod(), this.method_id);
    }
    if (null != o.getSpecimen() ) {
    	this.specimen_id = "specimen" + this.id;
    	this.specimen = ReferenceHelper.toModel(o.getSpecimen(), this.specimen_id);
    }
    if (null != o.getDevice() ) {
    	this.device_id = "device" + this.id;
    	this.device = ReferenceHelper.toModel(o.getDevice(), this.device_id);
    }
    if (null != o.getReferenceRange() && !o.getReferenceRange().isEmpty()) {
    	this.referencerange_id = "referencerange" + this.id;
    	this.referenceRange = ObservationReferenceRangeHelper.toModelFromArray(o.getReferenceRange(), this.referencerange_id);
    }
    if (null != o.getRelated() && !o.getRelated().isEmpty()) {
    	this.related_id = "related" + this.id;
    	this.related = ObservationRelatedHelper.toModelFromArray(o.getRelated(), this.related_id);
    }
    if (null != o.getComponent() && !o.getComponent().isEmpty()) {
    	this.component_id = "component" + this.id;
    	this.component = ObservationComponentHelper.toModelFromArray(o.getComponent(), this.component_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public String getEffectiveDateTime() {
    return this.effectiveDateTime;
  }
  public void setEffectiveDateTime( String value) {
    this.effectiveDateTime = value;
  }
  public String getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setEffectivePeriod( String value) {
    this.effectivePeriod = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public java.util.List<ReferenceModel> getPerformer() {
    return this.performer;
  }
  public void setPerformer( java.util.List<ReferenceModel> value) {
    this.performer = value;
  }
  public java.util.List<QuantityModel> getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueQuantity( java.util.List<QuantityModel> value) {
    this.valueQuantity = value;
  }
  public java.util.List<CodeableConceptModel> getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.valueCodeableConcept = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
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
  public java.util.List<CodeableConceptModel> getDataAbsentReason() {
    return this.dataAbsentReason;
  }
  public void setDataAbsentReason( java.util.List<CodeableConceptModel> value) {
    this.dataAbsentReason = value;
  }
  public java.util.List<CodeableConceptModel> getInterpretation() {
    return this.interpretation;
  }
  public void setInterpretation( java.util.List<CodeableConceptModel> value) {
    this.interpretation = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public java.util.List<CodeableConceptModel> getBodySite() {
    return this.bodySite;
  }
  public void setBodySite( java.util.List<CodeableConceptModel> value) {
    this.bodySite = value;
  }
  public java.util.List<CodeableConceptModel> getMethod() {
    return this.method;
  }
  public void setMethod( java.util.List<CodeableConceptModel> value) {
    this.method = value;
  }
  public java.util.List<ReferenceModel> getSpecimen() {
    return this.specimen;
  }
  public void setSpecimen( java.util.List<ReferenceModel> value) {
    this.specimen = value;
  }
  public java.util.List<ReferenceModel> getDevice() {
    return this.device;
  }
  public void setDevice( java.util.List<ReferenceModel> value) {
    this.device = value;
  }
  public java.util.List<ObservationReferenceRangeModel> getReferenceRange() {
    return this.referenceRange;
  }
  public void setReferenceRange( java.util.List<ObservationReferenceRangeModel> value) {
    this.referenceRange = value;
  }
  public java.util.List<ObservationRelatedModel> getRelated() {
    return this.related;
  }
  public void setRelated( java.util.List<ObservationRelatedModel> value) {
    this.related = value;
  }
  public java.util.List<ObservationComponentModel> getComponent() {
    return this.component;
  }
  public void setComponent( java.util.List<ObservationComponentModel> value) {
    this.component = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ObservationModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("effectiveDateTime" + "->" + this.effectiveDateTime + "\n"); 
     builder.append("effectivePeriod" + "->" + this.effectivePeriod + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("valueRatio" + "->" + this.valueRatio + "\n"); 
     builder.append("valueSampledData" + "->" + this.valueSampledData + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valuePeriod" + "->" + this.valuePeriod + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ObservationModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("basedOn" + "->" + this.basedOn + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("effectiveDateTime" + "->" + this.effectiveDateTime + "\n"); 
     builder.append("effectivePeriod" + "->" + this.effectivePeriod + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("performer" + "->" + this.performer + "\n"); 
     builder.append("valueQuantity" + "->" + this.valueQuantity + "\n"); 
     builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("valueRatio" + "->" + this.valueRatio + "\n"); 
     builder.append("valueSampledData" + "->" + this.valueSampledData + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valuePeriod" + "->" + this.valuePeriod + "\n"); 
     builder.append("dataAbsentReason" + "->" + this.dataAbsentReason + "\n"); 
     builder.append("interpretation" + "->" + this.interpretation + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("bodySite" + "->" + this.bodySite + "\n"); 
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("specimen" + "->" + this.specimen + "\n"); 
     builder.append("device" + "->" + this.device + "\n"); 
     builder.append("referenceRange" + "->" + this.referenceRange + "\n"); 
     builder.append("related" + "->" + this.related + "\n"); 
     builder.append("component" + "->" + this.component + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}