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
/**
* "A Map of relationships between 2 structures that can be used to transform data."
*/
@Entity
@Table(name="structuremapsource")
public class StructureMapSourceModel  implements Serializable {
	private static final long serialVersionUID = 151857669687110559L;
  /**
  * Description: "Type or variable this rule applies to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"context\"")
  private String context;

  /**
  * Description: "Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"min\"")
  private Float min;

  /**
  * Description: "Specified maximum cardinality for the element - a number or a \"*\". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value)."
  */
  @javax.persistence.Basic
  @Column(name="\"max\"")
  private String max;

  /**
  * Description: "Specified type for the element. This works as a condition on the mapping - use for polymorphic elements."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueBoolean\"")
  private Boolean defaultValueBoolean;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"defaultValueInteger\"")
  private Float defaultValueInteger;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"defaultValueDecimal\"")
  private Float defaultValueDecimal;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueBase64Binary\"")
  private String defaultValueBase64Binary;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueInstant\"")
  private String defaultValueInstant;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueString\"")
  private String defaultValueString;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueUri\"")
  private String defaultValueUri;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"defaultValueDate\"")
  private String defaultValueDate;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"defaultValueDateTime\"")
  private String defaultValueDateTime;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"defaultValueTime\"")
  private String defaultValueTime;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"defaultValueCode\"")
  private String defaultValueCode;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  @javax.persistence.Basic
  @Column(name="\"defaultValueOid\"")
  private String defaultValueOid;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
  @javax.persistence.Basic
  @Column(name="\"defaultValueUuid\"")
  private String defaultValueUuid;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"defaultValueId\"")
  private String defaultValueId;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"defaultValueUnsignedInt\"")
  private Float defaultValueUnsignedInt;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"defaultValuePositiveInt\"")
  private Float defaultValuePositiveInt;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueMarkdown\"")
  private String defaultValueMarkdown;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueElement\"", length = 16777215)
  private String defaultValueElement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueExtension\"", length = 16777215)
  private String defaultValueExtension;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueBackboneElement\"", length = 16777215)
  private String defaultValueBackboneElement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluenarrative_id\"")
  private String defaultvaluenarrative_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluenarrative_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> defaultValueNarrative;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueAnnotation\"", length = 16777215)
  private String defaultValueAnnotation;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueAttachment\"", length = 16777215)
  private String defaultValueAttachment;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueIdentifier\"", length = 16777215)
  private String defaultValueIdentifier;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueCodeableConcept\"", length = 16777215)
  private String defaultValueCodeableConcept;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueCoding\"", length = 16777215)
  private String defaultValueCoding;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueQuantity\"", length = 16777215)
  private String defaultValueQuantity;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueDuration\"", length = 16777215)
  private String defaultValueDuration;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueSimpleQuantity\"", length = 16777215)
  private String defaultValueSimpleQuantity;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluedistance_id\"")
  private String defaultvaluedistance_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluedistance_id", insertable=false, updatable=false)
  private java.util.List<DistanceModel> defaultValueDistance;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueCount\"", length = 16777215)
  private String defaultValueCount;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueMoney\"", length = 16777215)
  private String defaultValueMoney;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueAge\"", length = 16777215)
  private String defaultValueAge;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueRange\"", length = 16777215)
  private String defaultValueRange;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValuePeriod\"", length = 16777215)
  private String defaultValuePeriod;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueRatio\"", length = 16777215)
  private String defaultValueRatio;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluereference_id\"")
  private String defaultvaluereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> defaultValueReference;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueSampledData\"", length = 16777215)
  private String defaultValueSampledData;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueSignature\"", length = 16777215)
  private String defaultValueSignature;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueHumanName\"", length = 16777215)
  private String defaultValueHumanName;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueAddress\"", length = 16777215)
  private String defaultValueAddress;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueContactPoint\"", length = 16777215)
  private String defaultValueContactPoint;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueTiming\"", length = 16777215)
  private String defaultValueTiming;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluemeta_id\"")
  private String defaultvaluemeta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluemeta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> defaultValueMeta;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueElementDefinition\"", length = 16777215)
  private String defaultValueElementDefinition;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluecontactdetail_id\"")
  private String defaultvaluecontactdetail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluecontactdetail_id", insertable=false, updatable=false)
  private java.util.List<ContactDetailModel> defaultValueContactDetail;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluecontributor_id\"")
  private String defaultvaluecontributor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluecontributor_id", insertable=false, updatable=false)
  private java.util.List<ContributorModel> defaultValueContributor;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluedosage_id\"")
  private String defaultvaluedosage_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluedosage_id", insertable=false, updatable=false)
  private java.util.List<DosageModel> defaultValueDosage;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluerelatedartifact_id\"")
  private String defaultvaluerelatedartifact_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluerelatedartifact_id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> defaultValueRelatedArtifact;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvalueusagecontext_id\"")
  private String defaultvalueusagecontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvalueusagecontext_id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> defaultValueUsageContext;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluedatarequirement_id\"")
  private String defaultvaluedatarequirement_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluedatarequirement_id", insertable=false, updatable=false)
  private java.util.List<DataRequirementModel> defaultValueDataRequirement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"defaultValueParameterDefinition\"", length = 16777215)
  private String defaultValueParameterDefinition;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.persistence.Basic
  @Column(name="\"defaultvaluetriggerdefinition_id\"")
  private String defaultvaluetriggerdefinition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="defaultvaluetriggerdefinition_id", insertable=false, updatable=false)
  private java.util.List<TriggerDefinitionModel> defaultValueTriggerDefinition;

  /**
  * Description: "Optional field for this source."
  */
  @javax.persistence.Basic
  @Column(name="\"element\"")
  private String element;

  /**
  * Description: "How to handle the list mode for this element."
  */
  @javax.persistence.Basic
  @Column(name="\"listMode\"")
  private String listMode;

  /**
  * Description: "Named context for field, if a field is specified."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"variable\"")
  private String variable;

  /**
  * Description: "FHIRPath expression  - must be true or the rule does not apply."
  */
  @javax.persistence.Basic
  @Column(name="\"condition\"")
  private String condition;

  /**
  * Description: "FHIRPath expression  - must be true or the mapping engine throws an error instead of completing."
  */
  @javax.persistence.Basic
  @Column(name="\"check\"")
  private String check;

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

  public StructureMapSourceModel() {
  }

  public StructureMapSourceModel(StructureMapSource o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.context = o.getContext();
    this.min = o.getMin();
    this.max = o.getMax();
    this.type = o.getType();
    this.defaultValueBoolean = o.getDefaultValueBoolean();
    this.defaultValueInteger = o.getDefaultValueInteger();
    this.defaultValueDecimal = o.getDefaultValueDecimal();
    this.defaultValueBase64Binary = o.getDefaultValueBase64Binary();
    this.defaultValueInstant = o.getDefaultValueInstant();
    this.defaultValueString = o.getDefaultValueString();
    this.defaultValueUri = o.getDefaultValueUri();
    this.defaultValueDate = o.getDefaultValueDate();
    this.defaultValueDateTime = o.getDefaultValueDateTime();
    this.defaultValueTime = o.getDefaultValueTime();
    this.defaultValueCode = o.getDefaultValueCode();
    this.defaultValueOid = o.getDefaultValueOid();
    this.defaultValueUuid = o.getDefaultValueUuid();
    this.defaultValueId = o.getDefaultValueId();
    this.defaultValueUnsignedInt = o.getDefaultValueUnsignedInt();
    this.defaultValuePositiveInt = o.getDefaultValuePositiveInt();
    this.defaultValueMarkdown = o.getDefaultValueMarkdown();
    this.defaultValueElement = ElementHelper.toJson(o.getDefaultValueElement());
    this.defaultValueExtension = ExtensionHelper.toJson(o.getDefaultValueExtension());
    this.defaultValueBackboneElement = BackboneElementHelper.toJson(o.getDefaultValueBackboneElement());
    if (null != o.getDefaultValueNarrative() ) {
    	this.defaultvaluenarrative_id = "defaultvaluenarrative" + this.parent_id;
    	this.defaultValueNarrative = NarrativeHelper.toModel(o.getDefaultValueNarrative(), this.defaultvaluenarrative_id);
    }
    this.defaultValueAnnotation = AnnotationHelper.toJson(o.getDefaultValueAnnotation());
    this.defaultValueAttachment = AttachmentHelper.toJson(o.getDefaultValueAttachment());
    this.defaultValueIdentifier = IdentifierHelper.toJson(o.getDefaultValueIdentifier());
    this.defaultValueCodeableConcept = CodeableConceptHelper.toJson(o.getDefaultValueCodeableConcept());
    this.defaultValueCoding = CodingHelper.toJson(o.getDefaultValueCoding());
    this.defaultValueQuantity = QuantityHelper.toJson(o.getDefaultValueQuantity());
    this.defaultValueDuration = DurationHelper.toJson(o.getDefaultValueDuration());
    this.defaultValueSimpleQuantity = QuantityHelper.toJson(o.getDefaultValueSimpleQuantity());
    if (null != o.getDefaultValueDistance() ) {
    	this.defaultvaluedistance_id = "defaultvaluedistance" + this.parent_id;
    	this.defaultValueDistance = DistanceHelper.toModel(o.getDefaultValueDistance(), this.defaultvaluedistance_id);
    }
    this.defaultValueCount = CountHelper.toJson(o.getDefaultValueCount());
    this.defaultValueMoney = MoneyHelper.toJson(o.getDefaultValueMoney());
    this.defaultValueAge = AgeHelper.toJson(o.getDefaultValueAge());
    this.defaultValueRange = RangeHelper.toJson(o.getDefaultValueRange());
    this.defaultValuePeriod = PeriodHelper.toJson(o.getDefaultValuePeriod());
    this.defaultValueRatio = RatioHelper.toJson(o.getDefaultValueRatio());
    if (null != o.getDefaultValueReference() ) {
    	this.defaultvaluereference_id = "defaultvaluereference" + this.parent_id;
    	this.defaultValueReference = ReferenceHelper.toModel(o.getDefaultValueReference(), this.defaultvaluereference_id);
    }
    this.defaultValueSampledData = SampledDataHelper.toJson(o.getDefaultValueSampledData());
    this.defaultValueSignature = SignatureHelper.toJson(o.getDefaultValueSignature());
    this.defaultValueHumanName = HumanNameHelper.toJson(o.getDefaultValueHumanName());
    this.defaultValueAddress = AddressHelper.toJson(o.getDefaultValueAddress());
    this.defaultValueContactPoint = ContactPointHelper.toJson(o.getDefaultValueContactPoint());
    this.defaultValueTiming = TimingHelper.toJson(o.getDefaultValueTiming());
    if (null != o.getDefaultValueMeta() ) {
    	this.defaultvaluemeta_id = "defaultvaluemeta" + this.parent_id;
    	this.defaultValueMeta = MetaHelper.toModel(o.getDefaultValueMeta(), this.defaultvaluemeta_id);
    }
    this.defaultValueElementDefinition = ElementDefinitionHelper.toJson(o.getDefaultValueElementDefinition());
    if (null != o.getDefaultValueContactDetail() ) {
    	this.defaultvaluecontactdetail_id = "defaultvaluecontactdetail" + this.parent_id;
    	this.defaultValueContactDetail = ContactDetailHelper.toModel(o.getDefaultValueContactDetail(), this.defaultvaluecontactdetail_id);
    }
    if (null != o.getDefaultValueContributor() ) {
    	this.defaultvaluecontributor_id = "defaultvaluecontributor" + this.parent_id;
    	this.defaultValueContributor = ContributorHelper.toModel(o.getDefaultValueContributor(), this.defaultvaluecontributor_id);
    }
    if (null != o.getDefaultValueDosage() ) {
    	this.defaultvaluedosage_id = "defaultvaluedosage" + this.parent_id;
    	this.defaultValueDosage = DosageHelper.toModel(o.getDefaultValueDosage(), this.defaultvaluedosage_id);
    }
    if (null != o.getDefaultValueRelatedArtifact() ) {
    	this.defaultvaluerelatedartifact_id = "defaultvaluerelatedartifact" + this.parent_id;
    	this.defaultValueRelatedArtifact = RelatedArtifactHelper.toModel(o.getDefaultValueRelatedArtifact(), this.defaultvaluerelatedartifact_id);
    }
    if (null != o.getDefaultValueUsageContext() ) {
    	this.defaultvalueusagecontext_id = "defaultvalueusagecontext" + this.parent_id;
    	this.defaultValueUsageContext = UsageContextHelper.toModel(o.getDefaultValueUsageContext(), this.defaultvalueusagecontext_id);
    }
    if (null != o.getDefaultValueDataRequirement() ) {
    	this.defaultvaluedatarequirement_id = "defaultvaluedatarequirement" + this.parent_id;
    	this.defaultValueDataRequirement = DataRequirementHelper.toModel(o.getDefaultValueDataRequirement(), this.defaultvaluedatarequirement_id);
    }
    this.defaultValueParameterDefinition = ParameterDefinitionHelper.toJson(o.getDefaultValueParameterDefinition());
    if (null != o.getDefaultValueTriggerDefinition() ) {
    	this.defaultvaluetriggerdefinition_id = "defaultvaluetriggerdefinition" + this.parent_id;
    	this.defaultValueTriggerDefinition = TriggerDefinitionHelper.toModel(o.getDefaultValueTriggerDefinition(), this.defaultvaluetriggerdefinition_id);
    }
    this.element = o.getElement();
    this.listMode = o.getListMode();
    this.variable = o.getVariable();
    this.condition = o.getCondition();
    this.check = o.getCheck();
  }

  public String getContext() {
    return this.context;
  }
  public void setContext( String value) {
    this.context = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void setMin( Float value) {
    this.min = value;
  }
  public String getMax() {
    return this.max;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public Boolean getDefaultValueBoolean() {
    return this.defaultValueBoolean;
  }
  public void setDefaultValueBoolean( Boolean value) {
    this.defaultValueBoolean = value;
  }
  public Float getDefaultValueInteger() {
    return this.defaultValueInteger;
  }
  public void setDefaultValueInteger( Float value) {
    this.defaultValueInteger = value;
  }
  public Float getDefaultValueDecimal() {
    return this.defaultValueDecimal;
  }
  public void setDefaultValueDecimal( Float value) {
    this.defaultValueDecimal = value;
  }
  public String getDefaultValueBase64Binary() {
    return this.defaultValueBase64Binary;
  }
  public void setDefaultValueBase64Binary( String value) {
    this.defaultValueBase64Binary = value;
  }
  public String getDefaultValueInstant() {
    return this.defaultValueInstant;
  }
  public void setDefaultValueInstant( String value) {
    this.defaultValueInstant = value;
  }
  public String getDefaultValueString() {
    return this.defaultValueString;
  }
  public void setDefaultValueString( String value) {
    this.defaultValueString = value;
  }
  public String getDefaultValueUri() {
    return this.defaultValueUri;
  }
  public void setDefaultValueUri( String value) {
    this.defaultValueUri = value;
  }
  public String getDefaultValueDate() {
    return this.defaultValueDate;
  }
  public void setDefaultValueDate( String value) {
    this.defaultValueDate = value;
  }
  public String getDefaultValueDateTime() {
    return this.defaultValueDateTime;
  }
  public void setDefaultValueDateTime( String value) {
    this.defaultValueDateTime = value;
  }
  public String getDefaultValueTime() {
    return this.defaultValueTime;
  }
  public void setDefaultValueTime( String value) {
    this.defaultValueTime = value;
  }
  public String getDefaultValueCode() {
    return this.defaultValueCode;
  }
  public void setDefaultValueCode( String value) {
    this.defaultValueCode = value;
  }
  public String getDefaultValueOid() {
    return this.defaultValueOid;
  }
  public void setDefaultValueOid( String value) {
    this.defaultValueOid = value;
  }
  public String getDefaultValueUuid() {
    return this.defaultValueUuid;
  }
  public void setDefaultValueUuid( String value) {
    this.defaultValueUuid = value;
  }
  public String getDefaultValueId() {
    return this.defaultValueId;
  }
  public void setDefaultValueId( String value) {
    this.defaultValueId = value;
  }
  public Float getDefaultValueUnsignedInt() {
    return this.defaultValueUnsignedInt;
  }
  public void setDefaultValueUnsignedInt( Float value) {
    this.defaultValueUnsignedInt = value;
  }
  public Float getDefaultValuePositiveInt() {
    return this.defaultValuePositiveInt;
  }
  public void setDefaultValuePositiveInt( Float value) {
    this.defaultValuePositiveInt = value;
  }
  public String getDefaultValueMarkdown() {
    return this.defaultValueMarkdown;
  }
  public void setDefaultValueMarkdown( String value) {
    this.defaultValueMarkdown = value;
  }
  public String getDefaultValueElement() {
    return this.defaultValueElement;
  }
  public void setDefaultValueElement( String value) {
    this.defaultValueElement = value;
  }
  public String getDefaultValueExtension() {
    return this.defaultValueExtension;
  }
  public void setDefaultValueExtension( String value) {
    this.defaultValueExtension = value;
  }
  public String getDefaultValueBackboneElement() {
    return this.defaultValueBackboneElement;
  }
  public void setDefaultValueBackboneElement( String value) {
    this.defaultValueBackboneElement = value;
  }
  public java.util.List<NarrativeModel> getDefaultValueNarrative() {
    return this.defaultValueNarrative;
  }
  public void setDefaultValueNarrative( java.util.List<NarrativeModel> value) {
    this.defaultValueNarrative = value;
  }
  public String getDefaultValueAnnotation() {
    return this.defaultValueAnnotation;
  }
  public void setDefaultValueAnnotation( String value) {
    this.defaultValueAnnotation = value;
  }
  public String getDefaultValueAttachment() {
    return this.defaultValueAttachment;
  }
  public void setDefaultValueAttachment( String value) {
    this.defaultValueAttachment = value;
  }
  public String getDefaultValueIdentifier() {
    return this.defaultValueIdentifier;
  }
  public void setDefaultValueIdentifier( String value) {
    this.defaultValueIdentifier = value;
  }
  public String getDefaultValueCodeableConcept() {
    return this.defaultValueCodeableConcept;
  }
  public void setDefaultValueCodeableConcept( String value) {
    this.defaultValueCodeableConcept = value;
  }
  public String getDefaultValueCoding() {
    return this.defaultValueCoding;
  }
  public void setDefaultValueCoding( String value) {
    this.defaultValueCoding = value;
  }
  public String getDefaultValueQuantity() {
    return this.defaultValueQuantity;
  }
  public void setDefaultValueQuantity( String value) {
    this.defaultValueQuantity = value;
  }
  public String getDefaultValueDuration() {
    return this.defaultValueDuration;
  }
  public void setDefaultValueDuration( String value) {
    this.defaultValueDuration = value;
  }
  public String getDefaultValueSimpleQuantity() {
    return this.defaultValueSimpleQuantity;
  }
  public void setDefaultValueSimpleQuantity( String value) {
    this.defaultValueSimpleQuantity = value;
  }
  public java.util.List<DistanceModel> getDefaultValueDistance() {
    return this.defaultValueDistance;
  }
  public void setDefaultValueDistance( java.util.List<DistanceModel> value) {
    this.defaultValueDistance = value;
  }
  public String getDefaultValueCount() {
    return this.defaultValueCount;
  }
  public void setDefaultValueCount( String value) {
    this.defaultValueCount = value;
  }
  public String getDefaultValueMoney() {
    return this.defaultValueMoney;
  }
  public void setDefaultValueMoney( String value) {
    this.defaultValueMoney = value;
  }
  public String getDefaultValueAge() {
    return this.defaultValueAge;
  }
  public void setDefaultValueAge( String value) {
    this.defaultValueAge = value;
  }
  public String getDefaultValueRange() {
    return this.defaultValueRange;
  }
  public void setDefaultValueRange( String value) {
    this.defaultValueRange = value;
  }
  public String getDefaultValuePeriod() {
    return this.defaultValuePeriod;
  }
  public void setDefaultValuePeriod( String value) {
    this.defaultValuePeriod = value;
  }
  public String getDefaultValueRatio() {
    return this.defaultValueRatio;
  }
  public void setDefaultValueRatio( String value) {
    this.defaultValueRatio = value;
  }
  public java.util.List<ReferenceModel> getDefaultValueReference() {
    return this.defaultValueReference;
  }
  public void setDefaultValueReference( java.util.List<ReferenceModel> value) {
    this.defaultValueReference = value;
  }
  public String getDefaultValueSampledData() {
    return this.defaultValueSampledData;
  }
  public void setDefaultValueSampledData( String value) {
    this.defaultValueSampledData = value;
  }
  public String getDefaultValueSignature() {
    return this.defaultValueSignature;
  }
  public void setDefaultValueSignature( String value) {
    this.defaultValueSignature = value;
  }
  public String getDefaultValueHumanName() {
    return this.defaultValueHumanName;
  }
  public void setDefaultValueHumanName( String value) {
    this.defaultValueHumanName = value;
  }
  public String getDefaultValueAddress() {
    return this.defaultValueAddress;
  }
  public void setDefaultValueAddress( String value) {
    this.defaultValueAddress = value;
  }
  public String getDefaultValueContactPoint() {
    return this.defaultValueContactPoint;
  }
  public void setDefaultValueContactPoint( String value) {
    this.defaultValueContactPoint = value;
  }
  public String getDefaultValueTiming() {
    return this.defaultValueTiming;
  }
  public void setDefaultValueTiming( String value) {
    this.defaultValueTiming = value;
  }
  public java.util.List<MetaModel> getDefaultValueMeta() {
    return this.defaultValueMeta;
  }
  public void setDefaultValueMeta( java.util.List<MetaModel> value) {
    this.defaultValueMeta = value;
  }
  public String getDefaultValueElementDefinition() {
    return this.defaultValueElementDefinition;
  }
  public void setDefaultValueElementDefinition( String value) {
    this.defaultValueElementDefinition = value;
  }
  public java.util.List<ContactDetailModel> getDefaultValueContactDetail() {
    return this.defaultValueContactDetail;
  }
  public void setDefaultValueContactDetail( java.util.List<ContactDetailModel> value) {
    this.defaultValueContactDetail = value;
  }
  public java.util.List<ContributorModel> getDefaultValueContributor() {
    return this.defaultValueContributor;
  }
  public void setDefaultValueContributor( java.util.List<ContributorModel> value) {
    this.defaultValueContributor = value;
  }
  public java.util.List<DosageModel> getDefaultValueDosage() {
    return this.defaultValueDosage;
  }
  public void setDefaultValueDosage( java.util.List<DosageModel> value) {
    this.defaultValueDosage = value;
  }
  public java.util.List<RelatedArtifactModel> getDefaultValueRelatedArtifact() {
    return this.defaultValueRelatedArtifact;
  }
  public void setDefaultValueRelatedArtifact( java.util.List<RelatedArtifactModel> value) {
    this.defaultValueRelatedArtifact = value;
  }
  public java.util.List<UsageContextModel> getDefaultValueUsageContext() {
    return this.defaultValueUsageContext;
  }
  public void setDefaultValueUsageContext( java.util.List<UsageContextModel> value) {
    this.defaultValueUsageContext = value;
  }
  public java.util.List<DataRequirementModel> getDefaultValueDataRequirement() {
    return this.defaultValueDataRequirement;
  }
  public void setDefaultValueDataRequirement( java.util.List<DataRequirementModel> value) {
    this.defaultValueDataRequirement = value;
  }
  public String getDefaultValueParameterDefinition() {
    return this.defaultValueParameterDefinition;
  }
  public void setDefaultValueParameterDefinition( String value) {
    this.defaultValueParameterDefinition = value;
  }
  public java.util.List<TriggerDefinitionModel> getDefaultValueTriggerDefinition() {
    return this.defaultValueTriggerDefinition;
  }
  public void setDefaultValueTriggerDefinition( java.util.List<TriggerDefinitionModel> value) {
    this.defaultValueTriggerDefinition = value;
  }
  public String getElement() {
    return this.element;
  }
  public void setElement( String value) {
    this.element = value;
  }
  public String getListMode() {
    return this.listMode;
  }
  public void setListMode( String value) {
    this.listMode = value;
  }
  public String getVariable() {
    return this.variable;
  }
  public void setVariable( String value) {
    this.variable = value;
  }
  public String getCondition() {
    return this.condition;
  }
  public void setCondition( String value) {
    this.condition = value;
  }
  public String getCheck() {
    return this.check;
  }
  public void setCheck( String value) {
    this.check = value;
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
    builder.append("[StructureMapSourceModel]:" + "\n");
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("min" + "->" + this.min + "\n"); 
     builder.append("max" + "->" + this.max + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("defaultValueBoolean" + "->" + this.defaultValueBoolean + "\n"); 
     builder.append("defaultValueInteger" + "->" + this.defaultValueInteger + "\n"); 
     builder.append("defaultValueDecimal" + "->" + this.defaultValueDecimal + "\n"); 
     builder.append("defaultValueBase64Binary" + "->" + this.defaultValueBase64Binary + "\n"); 
     builder.append("defaultValueInstant" + "->" + this.defaultValueInstant + "\n"); 
     builder.append("defaultValueString" + "->" + this.defaultValueString + "\n"); 
     builder.append("defaultValueUri" + "->" + this.defaultValueUri + "\n"); 
     builder.append("defaultValueDate" + "->" + this.defaultValueDate + "\n"); 
     builder.append("defaultValueDateTime" + "->" + this.defaultValueDateTime + "\n"); 
     builder.append("defaultValueTime" + "->" + this.defaultValueTime + "\n"); 
     builder.append("defaultValueCode" + "->" + this.defaultValueCode + "\n"); 
     builder.append("defaultValueOid" + "->" + this.defaultValueOid + "\n"); 
     builder.append("defaultValueUuid" + "->" + this.defaultValueUuid + "\n"); 
     builder.append("defaultValueId" + "->" + this.defaultValueId + "\n"); 
     builder.append("defaultValueUnsignedInt" + "->" + this.defaultValueUnsignedInt + "\n"); 
     builder.append("defaultValuePositiveInt" + "->" + this.defaultValuePositiveInt + "\n"); 
     builder.append("defaultValueMarkdown" + "->" + this.defaultValueMarkdown + "\n"); 
     builder.append("defaultValueElement" + "->" + this.defaultValueElement + "\n"); 
     builder.append("defaultValueExtension" + "->" + this.defaultValueExtension + "\n"); 
     builder.append("defaultValueBackboneElement" + "->" + this.defaultValueBackboneElement + "\n"); 
     builder.append("defaultValueAnnotation" + "->" + this.defaultValueAnnotation + "\n"); 
     builder.append("defaultValueAttachment" + "->" + this.defaultValueAttachment + "\n"); 
     builder.append("defaultValueIdentifier" + "->" + this.defaultValueIdentifier + "\n"); 
     builder.append("defaultValueCodeableConcept" + "->" + this.defaultValueCodeableConcept + "\n"); 
     builder.append("defaultValueCoding" + "->" + this.defaultValueCoding + "\n"); 
     builder.append("defaultValueQuantity" + "->" + this.defaultValueQuantity + "\n"); 
     builder.append("defaultValueDuration" + "->" + this.defaultValueDuration + "\n"); 
     builder.append("defaultValueSimpleQuantity" + "->" + this.defaultValueSimpleQuantity + "\n"); 
     builder.append("defaultValueCount" + "->" + this.defaultValueCount + "\n"); 
     builder.append("defaultValueMoney" + "->" + this.defaultValueMoney + "\n"); 
     builder.append("defaultValueAge" + "->" + this.defaultValueAge + "\n"); 
     builder.append("defaultValueRange" + "->" + this.defaultValueRange + "\n"); 
     builder.append("defaultValuePeriod" + "->" + this.defaultValuePeriod + "\n"); 
     builder.append("defaultValueRatio" + "->" + this.defaultValueRatio + "\n"); 
     builder.append("defaultValueSampledData" + "->" + this.defaultValueSampledData + "\n"); 
     builder.append("defaultValueSignature" + "->" + this.defaultValueSignature + "\n"); 
     builder.append("defaultValueHumanName" + "->" + this.defaultValueHumanName + "\n"); 
     builder.append("defaultValueAddress" + "->" + this.defaultValueAddress + "\n"); 
     builder.append("defaultValueContactPoint" + "->" + this.defaultValueContactPoint + "\n"); 
     builder.append("defaultValueTiming" + "->" + this.defaultValueTiming + "\n"); 
     builder.append("defaultValueElementDefinition" + "->" + this.defaultValueElementDefinition + "\n"); 
     builder.append("defaultValueParameterDefinition" + "->" + this.defaultValueParameterDefinition + "\n"); 
     builder.append("element" + "->" + this.element + "\n"); 
     builder.append("listMode" + "->" + this.listMode + "\n"); 
     builder.append("variable" + "->" + this.variable + "\n"); 
     builder.append("condition" + "->" + this.condition + "\n"); 
     builder.append("check" + "->" + this.check + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureMapSourceModel]:" + "\n");
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("min" + "->" + this.min + "\n"); 
     builder.append("max" + "->" + this.max + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("defaultValueBoolean" + "->" + this.defaultValueBoolean + "\n"); 
     builder.append("defaultValueInteger" + "->" + this.defaultValueInteger + "\n"); 
     builder.append("defaultValueDecimal" + "->" + this.defaultValueDecimal + "\n"); 
     builder.append("defaultValueBase64Binary" + "->" + this.defaultValueBase64Binary + "\n"); 
     builder.append("defaultValueInstant" + "->" + this.defaultValueInstant + "\n"); 
     builder.append("defaultValueString" + "->" + this.defaultValueString + "\n"); 
     builder.append("defaultValueUri" + "->" + this.defaultValueUri + "\n"); 
     builder.append("defaultValueDate" + "->" + this.defaultValueDate + "\n"); 
     builder.append("defaultValueDateTime" + "->" + this.defaultValueDateTime + "\n"); 
     builder.append("defaultValueTime" + "->" + this.defaultValueTime + "\n"); 
     builder.append("defaultValueCode" + "->" + this.defaultValueCode + "\n"); 
     builder.append("defaultValueOid" + "->" + this.defaultValueOid + "\n"); 
     builder.append("defaultValueUuid" + "->" + this.defaultValueUuid + "\n"); 
     builder.append("defaultValueId" + "->" + this.defaultValueId + "\n"); 
     builder.append("defaultValueUnsignedInt" + "->" + this.defaultValueUnsignedInt + "\n"); 
     builder.append("defaultValuePositiveInt" + "->" + this.defaultValuePositiveInt + "\n"); 
     builder.append("defaultValueMarkdown" + "->" + this.defaultValueMarkdown + "\n"); 
     builder.append("defaultValueElement" + "->" + this.defaultValueElement + "\n"); 
     builder.append("defaultValueExtension" + "->" + this.defaultValueExtension + "\n"); 
     builder.append("defaultValueBackboneElement" + "->" + this.defaultValueBackboneElement + "\n"); 
     builder.append("defaultValueNarrative" + "->" + this.defaultValueNarrative + "\n"); 
     builder.append("defaultValueAnnotation" + "->" + this.defaultValueAnnotation + "\n"); 
     builder.append("defaultValueAttachment" + "->" + this.defaultValueAttachment + "\n"); 
     builder.append("defaultValueIdentifier" + "->" + this.defaultValueIdentifier + "\n"); 
     builder.append("defaultValueCodeableConcept" + "->" + this.defaultValueCodeableConcept + "\n"); 
     builder.append("defaultValueCoding" + "->" + this.defaultValueCoding + "\n"); 
     builder.append("defaultValueQuantity" + "->" + this.defaultValueQuantity + "\n"); 
     builder.append("defaultValueDuration" + "->" + this.defaultValueDuration + "\n"); 
     builder.append("defaultValueSimpleQuantity" + "->" + this.defaultValueSimpleQuantity + "\n"); 
     builder.append("defaultValueDistance" + "->" + this.defaultValueDistance + "\n"); 
     builder.append("defaultValueCount" + "->" + this.defaultValueCount + "\n"); 
     builder.append("defaultValueMoney" + "->" + this.defaultValueMoney + "\n"); 
     builder.append("defaultValueAge" + "->" + this.defaultValueAge + "\n"); 
     builder.append("defaultValueRange" + "->" + this.defaultValueRange + "\n"); 
     builder.append("defaultValuePeriod" + "->" + this.defaultValuePeriod + "\n"); 
     builder.append("defaultValueRatio" + "->" + this.defaultValueRatio + "\n"); 
     builder.append("defaultValueReference" + "->" + this.defaultValueReference + "\n"); 
     builder.append("defaultValueSampledData" + "->" + this.defaultValueSampledData + "\n"); 
     builder.append("defaultValueSignature" + "->" + this.defaultValueSignature + "\n"); 
     builder.append("defaultValueHumanName" + "->" + this.defaultValueHumanName + "\n"); 
     builder.append("defaultValueAddress" + "->" + this.defaultValueAddress + "\n"); 
     builder.append("defaultValueContactPoint" + "->" + this.defaultValueContactPoint + "\n"); 
     builder.append("defaultValueTiming" + "->" + this.defaultValueTiming + "\n"); 
     builder.append("defaultValueMeta" + "->" + this.defaultValueMeta + "\n"); 
     builder.append("defaultValueElementDefinition" + "->" + this.defaultValueElementDefinition + "\n"); 
     builder.append("defaultValueContactDetail" + "->" + this.defaultValueContactDetail + "\n"); 
     builder.append("defaultValueContributor" + "->" + this.defaultValueContributor + "\n"); 
     builder.append("defaultValueDosage" + "->" + this.defaultValueDosage + "\n"); 
     builder.append("defaultValueRelatedArtifact" + "->" + this.defaultValueRelatedArtifact + "\n"); 
     builder.append("defaultValueUsageContext" + "->" + this.defaultValueUsageContext + "\n"); 
     builder.append("defaultValueDataRequirement" + "->" + this.defaultValueDataRequirement + "\n"); 
     builder.append("defaultValueParameterDefinition" + "->" + this.defaultValueParameterDefinition + "\n"); 
     builder.append("defaultValueTriggerDefinition" + "->" + this.defaultValueTriggerDefinition + "\n"); 
     builder.append("element" + "->" + this.element + "\n"); 
     builder.append("listMode" + "->" + this.listMode + "\n"); 
     builder.append("variable" + "->" + this.variable + "\n"); 
     builder.append("condition" + "->" + this.condition + "\n"); 
     builder.append("check" + "->" + this.check + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}