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
import org.fhir.entity.StructureMapSourceModel;
import com.google.gson.GsonBuilder;

/**
* "A Map of relationships between 2 structures that can be used to transform data."
*/
public class StructureMapSource  extends BackboneElement  {
  /**
  * Description: "Type or variable this rule applies to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String context;

  /**
  * Description: "Extensions for context"
  */
  protected transient Element _context;

  /**
  * Description: "Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float min;

  /**
  * Description: "Extensions for min"
  */
  protected transient Element _min;

  /**
  * Description: "Specified maximum cardinality for the element - a number or a \"*\". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value)."
  */
  protected String max;

  /**
  * Description: "Extensions for max"
  */
  protected transient Element _max;

  /**
  * Description: "Specified type for the element. This works as a condition on the mapping - use for polymorphic elements."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Boolean defaultValueBoolean;

  /**
  * Description: "Extensions for defaultValueBoolean"
  */
  protected transient Element _defaultValueBoolean;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float defaultValueInteger;

  /**
  * Description: "Extensions for defaultValueInteger"
  */
  protected transient Element _defaultValueInteger;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float defaultValueDecimal;

  /**
  * Description: "Extensions for defaultValueDecimal"
  */
  protected transient Element _defaultValueDecimal;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected String defaultValueBase64Binary;

  /**
  * Description: "Extensions for defaultValueBase64Binary"
  */
  protected transient Element _defaultValueBase64Binary;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected String defaultValueInstant;

  /**
  * Description: "Extensions for defaultValueInstant"
  */
  protected transient Element _defaultValueInstant;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected String defaultValueString;

  /**
  * Description: "Extensions for defaultValueString"
  */
  protected transient Element _defaultValueString;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected String defaultValueUri;

  /**
  * Description: "Extensions for defaultValueUri"
  */
  protected transient Element _defaultValueUri;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String defaultValueDate;

  /**
  * Description: "Extensions for defaultValueDate"
  */
  protected transient Element _defaultValueDate;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String defaultValueDateTime;

  /**
  * Description: "Extensions for defaultValueDateTime"
  */
  protected transient Element _defaultValueDateTime;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  protected String defaultValueTime;

  /**
  * Description: "Extensions for defaultValueTime"
  */
  protected transient Element _defaultValueTime;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String defaultValueCode;

  /**
  * Description: "Extensions for defaultValueCode"
  */
  protected transient Element _defaultValueCode;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String defaultValueOid;

  /**
  * Description: "Extensions for defaultValueOid"
  */
  protected transient Element _defaultValueOid;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
  protected String defaultValueUuid;

  /**
  * Description: "Extensions for defaultValueUuid"
  */
  protected transient Element _defaultValueUuid;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String defaultValueId;

  /**
  * Description: "Extensions for defaultValueId"
  */
  protected transient Element _defaultValueId;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float defaultValueUnsignedInt;

  /**
  * Description: "Extensions for defaultValueUnsignedInt"
  */
  protected transient Element _defaultValueUnsignedInt;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float defaultValuePositiveInt;

  /**
  * Description: "Extensions for defaultValuePositiveInt"
  */
  protected transient Element _defaultValuePositiveInt;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected String defaultValueMarkdown;

  /**
  * Description: "Extensions for defaultValueMarkdown"
  */
  protected transient Element _defaultValueMarkdown;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Element defaultValueElement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Extension defaultValueExtension;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected BackboneElement defaultValueBackboneElement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Narrative defaultValueNarrative;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Annotation defaultValueAnnotation;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Attachment defaultValueAttachment;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Identifier defaultValueIdentifier;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected CodeableConcept defaultValueCodeableConcept;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Coding defaultValueCoding;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Quantity defaultValueQuantity;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Duration defaultValueDuration;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Quantity defaultValueSimpleQuantity;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Distance defaultValueDistance;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Count defaultValueCount;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Money defaultValueMoney;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Age defaultValueAge;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Range defaultValueRange;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Period defaultValuePeriod;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Ratio defaultValueRatio;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Reference defaultValueReference;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected SampledData defaultValueSampledData;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Signature defaultValueSignature;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected HumanName defaultValueHumanName;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Address defaultValueAddress;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected ContactPoint defaultValueContactPoint;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Timing defaultValueTiming;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Meta defaultValueMeta;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected ElementDefinition defaultValueElementDefinition;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected ContactDetail defaultValueContactDetail;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Contributor defaultValueContributor;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected Dosage defaultValueDosage;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected RelatedArtifact defaultValueRelatedArtifact;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected UsageContext defaultValueUsageContext;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected DataRequirement defaultValueDataRequirement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected ParameterDefinition defaultValueParameterDefinition;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  protected TriggerDefinition defaultValueTriggerDefinition;

  /**
  * Description: "Optional field for this source."
  */
  protected String element;

  /**
  * Description: "Extensions for element"
  */
  protected transient Element _element;

  /**
  * Description: "How to handle the list mode for this element."
  */
  protected String listMode;

  /**
  * Description: "Extensions for listMode"
  */
  protected transient Element _listMode;

  /**
  * Description: "Named context for field, if a field is specified."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String variable;

  /**
  * Description: "Extensions for variable"
  */
  protected transient Element _variable;

  /**
  * Description: "FHIRPath expression  - must be true or the rule does not apply."
  */
  protected String condition;

  /**
  * Description: "Extensions for condition"
  */
  protected transient Element _condition;

  /**
  * Description: "FHIRPath expression  - must be true or the mapping engine throws an error instead of completing."
  */
  protected String check;

  /**
  * Description: "Extensions for check"
  */
  protected transient Element _check;

  public StructureMapSource() {
  }

  public StructureMapSource(StructureMapSourceModel o) {
    this.id = o.getId();
    if (null != o.getContext()) {
      this.context = o.getContext();
    }
    if (null != o.getMin()) {
      this.min = o.getMin();
    }
    if (null != o.getMax()) {
      this.max = o.getMax();
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getDefaultValueBoolean()) {
      this.defaultValueBoolean = o.getDefaultValueBoolean();
    }
    if (null != o.getDefaultValueInteger()) {
      this.defaultValueInteger = o.getDefaultValueInteger();
    }
    if (null != o.getDefaultValueDecimal()) {
      this.defaultValueDecimal = o.getDefaultValueDecimal();
    }
    if (null != o.getDefaultValueBase64Binary()) {
      this.defaultValueBase64Binary = o.getDefaultValueBase64Binary();
    }
    if (null != o.getDefaultValueInstant()) {
      this.defaultValueInstant = o.getDefaultValueInstant();
    }
    if (null != o.getDefaultValueString()) {
      this.defaultValueString = o.getDefaultValueString();
    }
    if (null != o.getDefaultValueUri()) {
      this.defaultValueUri = o.getDefaultValueUri();
    }
    if (null != o.getDefaultValueDate()) {
      this.defaultValueDate = o.getDefaultValueDate();
    }
    if (null != o.getDefaultValueDateTime()) {
      this.defaultValueDateTime = o.getDefaultValueDateTime();
    }
    if (null != o.getDefaultValueTime()) {
      this.defaultValueTime = o.getDefaultValueTime();
    }
    if (null != o.getDefaultValueCode()) {
      this.defaultValueCode = o.getDefaultValueCode();
    }
    if (null != o.getDefaultValueOid()) {
      this.defaultValueOid = o.getDefaultValueOid();
    }
    if (null != o.getDefaultValueUuid()) {
      this.defaultValueUuid = o.getDefaultValueUuid();
    }
    if (null != o.getDefaultValueId()) {
      this.defaultValueId = o.getDefaultValueId();
    }
    if (null != o.getDefaultValueUnsignedInt()) {
      this.defaultValueUnsignedInt = o.getDefaultValueUnsignedInt();
    }
    if (null != o.getDefaultValuePositiveInt()) {
      this.defaultValuePositiveInt = o.getDefaultValuePositiveInt();
    }
    if (null != o.getDefaultValueMarkdown()) {
      this.defaultValueMarkdown = o.getDefaultValueMarkdown();
    }
    this.defaultValueElement = ElementHelper.fromJson(o.getDefaultValueElement());
    this.defaultValueExtension = ExtensionHelper.fromJson(o.getDefaultValueExtension());
    this.defaultValueBackboneElement = BackboneElementHelper.fromJson(o.getDefaultValueBackboneElement());
    if (null != o.getDefaultValueNarrative() && !o.getDefaultValueNarrative().isEmpty()) {
      this.defaultValueNarrative = new Narrative(o.getDefaultValueNarrative().get(0));
    }
    this.defaultValueAnnotation = AnnotationHelper.fromJson(o.getDefaultValueAnnotation());
    this.defaultValueAttachment = AttachmentHelper.fromJson(o.getDefaultValueAttachment());
    this.defaultValueIdentifier = IdentifierHelper.fromJson(o.getDefaultValueIdentifier());
    this.defaultValueCodeableConcept = CodeableConceptHelper.fromJson(o.getDefaultValueCodeableConcept());
    this.defaultValueCoding = CodingHelper.fromJson(o.getDefaultValueCoding());
    if (null != o.getDefaultValueQuantity() && !o.getDefaultValueQuantity().isEmpty()) {
      this.defaultValueQuantity = new Quantity(o.getDefaultValueQuantity().get(0));
    }
    this.defaultValueDuration = DurationHelper.fromJson(o.getDefaultValueDuration());
    if (null != o.getDefaultValueSimpleQuantity() && !o.getDefaultValueSimpleQuantity().isEmpty()) {
      this.defaultValueSimpleQuantity = new Quantity(o.getDefaultValueSimpleQuantity().get(0));
    }
    if (null != o.getDefaultValueDistance() && !o.getDefaultValueDistance().isEmpty()) {
      this.defaultValueDistance = new Distance(o.getDefaultValueDistance().get(0));
    }
    this.defaultValueCount = CountHelper.fromJson(o.getDefaultValueCount());
    if (null != o.getDefaultValueMoney() && !o.getDefaultValueMoney().isEmpty()) {
      this.defaultValueMoney = new Money(o.getDefaultValueMoney().get(0));
    }
    this.defaultValueAge = AgeHelper.fromJson(o.getDefaultValueAge());
    this.defaultValueRange = RangeHelper.fromJson(o.getDefaultValueRange());
    this.defaultValuePeriod = PeriodHelper.fromJson(o.getDefaultValuePeriod());
    this.defaultValueRatio = RatioHelper.fromJson(o.getDefaultValueRatio());
    if (null != o.getDefaultValueReference() && !o.getDefaultValueReference().isEmpty()) {
      this.defaultValueReference = new Reference(o.getDefaultValueReference().get(0));
    }
    this.defaultValueSampledData = SampledDataHelper.fromJson(o.getDefaultValueSampledData());
    this.defaultValueSignature = SignatureHelper.fromJson(o.getDefaultValueSignature());
    this.defaultValueHumanName = HumanNameHelper.fromJson(o.getDefaultValueHumanName());
    if (null != o.getDefaultValueAddress() && !o.getDefaultValueAddress().isEmpty()) {
      this.defaultValueAddress = new Address(o.getDefaultValueAddress().get(0));
    }
    this.defaultValueContactPoint = ContactPointHelper.fromJson(o.getDefaultValueContactPoint());
    this.defaultValueTiming = TimingHelper.fromJson(o.getDefaultValueTiming());
    if (null != o.getDefaultValueMeta() && !o.getDefaultValueMeta().isEmpty()) {
      this.defaultValueMeta = new Meta(o.getDefaultValueMeta().get(0));
    }
    this.defaultValueElementDefinition = ElementDefinitionHelper.fromJson(o.getDefaultValueElementDefinition());
    if (null != o.getDefaultValueContactDetail() && !o.getDefaultValueContactDetail().isEmpty()) {
      this.defaultValueContactDetail = new ContactDetail(o.getDefaultValueContactDetail().get(0));
    }
    if (null != o.getDefaultValueContributor() && !o.getDefaultValueContributor().isEmpty()) {
      this.defaultValueContributor = new Contributor(o.getDefaultValueContributor().get(0));
    }
    if (null != o.getDefaultValueDosage() && !o.getDefaultValueDosage().isEmpty()) {
      this.defaultValueDosage = new Dosage(o.getDefaultValueDosage().get(0));
    }
    if (null != o.getDefaultValueRelatedArtifact() && !o.getDefaultValueRelatedArtifact().isEmpty()) {
      this.defaultValueRelatedArtifact = new RelatedArtifact(o.getDefaultValueRelatedArtifact().get(0));
    }
    if (null != o.getDefaultValueUsageContext() && !o.getDefaultValueUsageContext().isEmpty()) {
      this.defaultValueUsageContext = new UsageContext(o.getDefaultValueUsageContext().get(0));
    }
    if (null != o.getDefaultValueDataRequirement() && !o.getDefaultValueDataRequirement().isEmpty()) {
      this.defaultValueDataRequirement = new DataRequirement(o.getDefaultValueDataRequirement().get(0));
    }
    this.defaultValueParameterDefinition = ParameterDefinitionHelper.fromJson(o.getDefaultValueParameterDefinition());
    if (null != o.getDefaultValueTriggerDefinition() && !o.getDefaultValueTriggerDefinition().isEmpty()) {
      this.defaultValueTriggerDefinition = new TriggerDefinition(o.getDefaultValueTriggerDefinition().get(0));
    }
    if (null != o.getElement()) {
      this.element = o.getElement();
    }
    if (null != o.getListMode()) {
      this.listMode = o.getListMode();
    }
    if (null != o.getVariable()) {
      this.variable = o.getVariable();
    }
    if (null != o.getCondition()) {
      this.condition = o.getCondition();
    }
    if (null != o.getCheck()) {
      this.check = o.getCheck();
    }
  }

  public void setContext( String value) {
    this.context = value;
  }
  public String getContext() {
    return this.context;
  }
  public void set_context( Element value) {
    this._context = value;
  }
  public Element get_context() {
    return this._context;
  }
  public void setMin( Float value) {
    this.min = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void set_min( Element value) {
    this._min = value;
  }
  public Element get_min() {
    return this._min;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getMax() {
    return this.max;
  }
  public void set_max( Element value) {
    this._max = value;
  }
  public Element get_max() {
    return this._max;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setDefaultValueBoolean( Boolean value) {
    this.defaultValueBoolean = value;
  }
  public Boolean getDefaultValueBoolean() {
    return this.defaultValueBoolean;
  }
  public void set_defaultValueBoolean( Element value) {
    this._defaultValueBoolean = value;
  }
  public Element get_defaultValueBoolean() {
    return this._defaultValueBoolean;
  }
  public void setDefaultValueInteger( Float value) {
    this.defaultValueInteger = value;
  }
  public Float getDefaultValueInteger() {
    return this.defaultValueInteger;
  }
  public void set_defaultValueInteger( Element value) {
    this._defaultValueInteger = value;
  }
  public Element get_defaultValueInteger() {
    return this._defaultValueInteger;
  }
  public void setDefaultValueDecimal( Float value) {
    this.defaultValueDecimal = value;
  }
  public Float getDefaultValueDecimal() {
    return this.defaultValueDecimal;
  }
  public void set_defaultValueDecimal( Element value) {
    this._defaultValueDecimal = value;
  }
  public Element get_defaultValueDecimal() {
    return this._defaultValueDecimal;
  }
  public void setDefaultValueBase64Binary( String value) {
    this.defaultValueBase64Binary = value;
  }
  public String getDefaultValueBase64Binary() {
    return this.defaultValueBase64Binary;
  }
  public void set_defaultValueBase64Binary( Element value) {
    this._defaultValueBase64Binary = value;
  }
  public Element get_defaultValueBase64Binary() {
    return this._defaultValueBase64Binary;
  }
  public void setDefaultValueInstant( String value) {
    this.defaultValueInstant = value;
  }
  public String getDefaultValueInstant() {
    return this.defaultValueInstant;
  }
  public void set_defaultValueInstant( Element value) {
    this._defaultValueInstant = value;
  }
  public Element get_defaultValueInstant() {
    return this._defaultValueInstant;
  }
  public void setDefaultValueString( String value) {
    this.defaultValueString = value;
  }
  public String getDefaultValueString() {
    return this.defaultValueString;
  }
  public void set_defaultValueString( Element value) {
    this._defaultValueString = value;
  }
  public Element get_defaultValueString() {
    return this._defaultValueString;
  }
  public void setDefaultValueUri( String value) {
    this.defaultValueUri = value;
  }
  public String getDefaultValueUri() {
    return this.defaultValueUri;
  }
  public void set_defaultValueUri( Element value) {
    this._defaultValueUri = value;
  }
  public Element get_defaultValueUri() {
    return this._defaultValueUri;
  }
  public void setDefaultValueDate( String value) {
    this.defaultValueDate = value;
  }
  public String getDefaultValueDate() {
    return this.defaultValueDate;
  }
  public void set_defaultValueDate( Element value) {
    this._defaultValueDate = value;
  }
  public Element get_defaultValueDate() {
    return this._defaultValueDate;
  }
  public void setDefaultValueDateTime( String value) {
    this.defaultValueDateTime = value;
  }
  public String getDefaultValueDateTime() {
    return this.defaultValueDateTime;
  }
  public void set_defaultValueDateTime( Element value) {
    this._defaultValueDateTime = value;
  }
  public Element get_defaultValueDateTime() {
    return this._defaultValueDateTime;
  }
  public void setDefaultValueTime( String value) {
    this.defaultValueTime = value;
  }
  public String getDefaultValueTime() {
    return this.defaultValueTime;
  }
  public void set_defaultValueTime( Element value) {
    this._defaultValueTime = value;
  }
  public Element get_defaultValueTime() {
    return this._defaultValueTime;
  }
  public void setDefaultValueCode( String value) {
    this.defaultValueCode = value;
  }
  public String getDefaultValueCode() {
    return this.defaultValueCode;
  }
  public void set_defaultValueCode( Element value) {
    this._defaultValueCode = value;
  }
  public Element get_defaultValueCode() {
    return this._defaultValueCode;
  }
  public void setDefaultValueOid( String value) {
    this.defaultValueOid = value;
  }
  public String getDefaultValueOid() {
    return this.defaultValueOid;
  }
  public void set_defaultValueOid( Element value) {
    this._defaultValueOid = value;
  }
  public Element get_defaultValueOid() {
    return this._defaultValueOid;
  }
  public void setDefaultValueUuid( String value) {
    this.defaultValueUuid = value;
  }
  public String getDefaultValueUuid() {
    return this.defaultValueUuid;
  }
  public void set_defaultValueUuid( Element value) {
    this._defaultValueUuid = value;
  }
  public Element get_defaultValueUuid() {
    return this._defaultValueUuid;
  }
  public void setDefaultValueId( String value) {
    this.defaultValueId = value;
  }
  public String getDefaultValueId() {
    return this.defaultValueId;
  }
  public void set_defaultValueId( Element value) {
    this._defaultValueId = value;
  }
  public Element get_defaultValueId() {
    return this._defaultValueId;
  }
  public void setDefaultValueUnsignedInt( Float value) {
    this.defaultValueUnsignedInt = value;
  }
  public Float getDefaultValueUnsignedInt() {
    return this.defaultValueUnsignedInt;
  }
  public void set_defaultValueUnsignedInt( Element value) {
    this._defaultValueUnsignedInt = value;
  }
  public Element get_defaultValueUnsignedInt() {
    return this._defaultValueUnsignedInt;
  }
  public void setDefaultValuePositiveInt( Float value) {
    this.defaultValuePositiveInt = value;
  }
  public Float getDefaultValuePositiveInt() {
    return this.defaultValuePositiveInt;
  }
  public void set_defaultValuePositiveInt( Element value) {
    this._defaultValuePositiveInt = value;
  }
  public Element get_defaultValuePositiveInt() {
    return this._defaultValuePositiveInt;
  }
  public void setDefaultValueMarkdown( String value) {
    this.defaultValueMarkdown = value;
  }
  public String getDefaultValueMarkdown() {
    return this.defaultValueMarkdown;
  }
  public void set_defaultValueMarkdown( Element value) {
    this._defaultValueMarkdown = value;
  }
  public Element get_defaultValueMarkdown() {
    return this._defaultValueMarkdown;
  }
  public void setDefaultValueElement( Element value) {
    this.defaultValueElement = value;
  }
  public Element getDefaultValueElement() {
    return this.defaultValueElement;
  }
  public void setDefaultValueExtension( Extension value) {
    this.defaultValueExtension = value;
  }
  public Extension getDefaultValueExtension() {
    return this.defaultValueExtension;
  }
  public void setDefaultValueBackboneElement( BackboneElement value) {
    this.defaultValueBackboneElement = value;
  }
  public BackboneElement getDefaultValueBackboneElement() {
    return this.defaultValueBackboneElement;
  }
  public void setDefaultValueNarrative( Narrative value) {
    this.defaultValueNarrative = value;
  }
  public Narrative getDefaultValueNarrative() {
    return this.defaultValueNarrative;
  }
  public void setDefaultValueAnnotation( Annotation value) {
    this.defaultValueAnnotation = value;
  }
  public Annotation getDefaultValueAnnotation() {
    return this.defaultValueAnnotation;
  }
  public void setDefaultValueAttachment( Attachment value) {
    this.defaultValueAttachment = value;
  }
  public Attachment getDefaultValueAttachment() {
    return this.defaultValueAttachment;
  }
  public void setDefaultValueIdentifier( Identifier value) {
    this.defaultValueIdentifier = value;
  }
  public Identifier getDefaultValueIdentifier() {
    return this.defaultValueIdentifier;
  }
  public void setDefaultValueCodeableConcept( CodeableConcept value) {
    this.defaultValueCodeableConcept = value;
  }
  public CodeableConcept getDefaultValueCodeableConcept() {
    return this.defaultValueCodeableConcept;
  }
  public void setDefaultValueCoding( Coding value) {
    this.defaultValueCoding = value;
  }
  public Coding getDefaultValueCoding() {
    return this.defaultValueCoding;
  }
  public void setDefaultValueQuantity( Quantity value) {
    this.defaultValueQuantity = value;
  }
  public Quantity getDefaultValueQuantity() {
    return this.defaultValueQuantity;
  }
  public void setDefaultValueDuration( Duration value) {
    this.defaultValueDuration = value;
  }
  public Duration getDefaultValueDuration() {
    return this.defaultValueDuration;
  }
  public void setDefaultValueSimpleQuantity( Quantity value) {
    this.defaultValueSimpleQuantity = value;
  }
  public Quantity getDefaultValueSimpleQuantity() {
    return this.defaultValueSimpleQuantity;
  }
  public void setDefaultValueDistance( Distance value) {
    this.defaultValueDistance = value;
  }
  public Distance getDefaultValueDistance() {
    return this.defaultValueDistance;
  }
  public void setDefaultValueCount( Count value) {
    this.defaultValueCount = value;
  }
  public Count getDefaultValueCount() {
    return this.defaultValueCount;
  }
  public void setDefaultValueMoney( Money value) {
    this.defaultValueMoney = value;
  }
  public Money getDefaultValueMoney() {
    return this.defaultValueMoney;
  }
  public void setDefaultValueAge( Age value) {
    this.defaultValueAge = value;
  }
  public Age getDefaultValueAge() {
    return this.defaultValueAge;
  }
  public void setDefaultValueRange( Range value) {
    this.defaultValueRange = value;
  }
  public Range getDefaultValueRange() {
    return this.defaultValueRange;
  }
  public void setDefaultValuePeriod( Period value) {
    this.defaultValuePeriod = value;
  }
  public Period getDefaultValuePeriod() {
    return this.defaultValuePeriod;
  }
  public void setDefaultValueRatio( Ratio value) {
    this.defaultValueRatio = value;
  }
  public Ratio getDefaultValueRatio() {
    return this.defaultValueRatio;
  }
  public void setDefaultValueReference( Reference value) {
    this.defaultValueReference = value;
  }
  public Reference getDefaultValueReference() {
    return this.defaultValueReference;
  }
  public void setDefaultValueSampledData( SampledData value) {
    this.defaultValueSampledData = value;
  }
  public SampledData getDefaultValueSampledData() {
    return this.defaultValueSampledData;
  }
  public void setDefaultValueSignature( Signature value) {
    this.defaultValueSignature = value;
  }
  public Signature getDefaultValueSignature() {
    return this.defaultValueSignature;
  }
  public void setDefaultValueHumanName( HumanName value) {
    this.defaultValueHumanName = value;
  }
  public HumanName getDefaultValueHumanName() {
    return this.defaultValueHumanName;
  }
  public void setDefaultValueAddress( Address value) {
    this.defaultValueAddress = value;
  }
  public Address getDefaultValueAddress() {
    return this.defaultValueAddress;
  }
  public void setDefaultValueContactPoint( ContactPoint value) {
    this.defaultValueContactPoint = value;
  }
  public ContactPoint getDefaultValueContactPoint() {
    return this.defaultValueContactPoint;
  }
  public void setDefaultValueTiming( Timing value) {
    this.defaultValueTiming = value;
  }
  public Timing getDefaultValueTiming() {
    return this.defaultValueTiming;
  }
  public void setDefaultValueMeta( Meta value) {
    this.defaultValueMeta = value;
  }
  public Meta getDefaultValueMeta() {
    return this.defaultValueMeta;
  }
  public void setDefaultValueElementDefinition( ElementDefinition value) {
    this.defaultValueElementDefinition = value;
  }
  public ElementDefinition getDefaultValueElementDefinition() {
    return this.defaultValueElementDefinition;
  }
  public void setDefaultValueContactDetail( ContactDetail value) {
    this.defaultValueContactDetail = value;
  }
  public ContactDetail getDefaultValueContactDetail() {
    return this.defaultValueContactDetail;
  }
  public void setDefaultValueContributor( Contributor value) {
    this.defaultValueContributor = value;
  }
  public Contributor getDefaultValueContributor() {
    return this.defaultValueContributor;
  }
  public void setDefaultValueDosage( Dosage value) {
    this.defaultValueDosage = value;
  }
  public Dosage getDefaultValueDosage() {
    return this.defaultValueDosage;
  }
  public void setDefaultValueRelatedArtifact( RelatedArtifact value) {
    this.defaultValueRelatedArtifact = value;
  }
  public RelatedArtifact getDefaultValueRelatedArtifact() {
    return this.defaultValueRelatedArtifact;
  }
  public void setDefaultValueUsageContext( UsageContext value) {
    this.defaultValueUsageContext = value;
  }
  public UsageContext getDefaultValueUsageContext() {
    return this.defaultValueUsageContext;
  }
  public void setDefaultValueDataRequirement( DataRequirement value) {
    this.defaultValueDataRequirement = value;
  }
  public DataRequirement getDefaultValueDataRequirement() {
    return this.defaultValueDataRequirement;
  }
  public void setDefaultValueParameterDefinition( ParameterDefinition value) {
    this.defaultValueParameterDefinition = value;
  }
  public ParameterDefinition getDefaultValueParameterDefinition() {
    return this.defaultValueParameterDefinition;
  }
  public void setDefaultValueTriggerDefinition( TriggerDefinition value) {
    this.defaultValueTriggerDefinition = value;
  }
  public TriggerDefinition getDefaultValueTriggerDefinition() {
    return this.defaultValueTriggerDefinition;
  }
  public void setElement( String value) {
    this.element = value;
  }
  public String getElement() {
    return this.element;
  }
  public void set_element( Element value) {
    this._element = value;
  }
  public Element get_element() {
    return this._element;
  }
  public void setListMode( String value) {
    this.listMode = ListModeEnum.fromCode(value);
  }
  public String getListMode() {
    return this.listMode;
  }
  public void set_listMode( Element value) {
    this._listMode = value;
  }
  public Element get_listMode() {
    return this._listMode;
  }
  public void setVariable( String value) {
    this.variable = value;
  }
  public String getVariable() {
    return this.variable;
  }
  public void set_variable( Element value) {
    this._variable = value;
  }
  public Element get_variable() {
    return this._variable;
  }
  public void setCondition( String value) {
    this.condition = value;
  }
  public String getCondition() {
    return this.condition;
  }
  public void set_condition( Element value) {
    this._condition = value;
  }
  public Element get_condition() {
    return this._condition;
  }
  public void setCheck( String value) {
    this.check = value;
  }
  public String getCheck() {
    return this.check;
  }
  public void set_check( Element value) {
    this._check = value;
  }
  public Element get_check() {
    return this._check;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureMapSource]:" + "\n");
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this._context != null) builder.append("_context" + "->" + this._context.toString() + "\n"); 
     if(this.min != null) builder.append("min" + "->" + this.min.toString() + "\n"); 
     if(this._min != null) builder.append("_min" + "->" + this._min.toString() + "\n"); 
     if(this.max != null) builder.append("max" + "->" + this.max.toString() + "\n"); 
     if(this._max != null) builder.append("_max" + "->" + this._max.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.defaultValueBoolean != null) builder.append("defaultValueBoolean" + "->" + this.defaultValueBoolean.toString() + "\n"); 
     if(this._defaultValueBoolean != null) builder.append("_defaultValueBoolean" + "->" + this._defaultValueBoolean.toString() + "\n"); 
     if(this.defaultValueInteger != null) builder.append("defaultValueInteger" + "->" + this.defaultValueInteger.toString() + "\n"); 
     if(this._defaultValueInteger != null) builder.append("_defaultValueInteger" + "->" + this._defaultValueInteger.toString() + "\n"); 
     if(this.defaultValueDecimal != null) builder.append("defaultValueDecimal" + "->" + this.defaultValueDecimal.toString() + "\n"); 
     if(this._defaultValueDecimal != null) builder.append("_defaultValueDecimal" + "->" + this._defaultValueDecimal.toString() + "\n"); 
     if(this.defaultValueBase64Binary != null) builder.append("defaultValueBase64Binary" + "->" + this.defaultValueBase64Binary.toString() + "\n"); 
     if(this._defaultValueBase64Binary != null) builder.append("_defaultValueBase64Binary" + "->" + this._defaultValueBase64Binary.toString() + "\n"); 
     if(this.defaultValueInstant != null) builder.append("defaultValueInstant" + "->" + this.defaultValueInstant.toString() + "\n"); 
     if(this._defaultValueInstant != null) builder.append("_defaultValueInstant" + "->" + this._defaultValueInstant.toString() + "\n"); 
     if(this.defaultValueString != null) builder.append("defaultValueString" + "->" + this.defaultValueString.toString() + "\n"); 
     if(this._defaultValueString != null) builder.append("_defaultValueString" + "->" + this._defaultValueString.toString() + "\n"); 
     if(this.defaultValueUri != null) builder.append("defaultValueUri" + "->" + this.defaultValueUri.toString() + "\n"); 
     if(this._defaultValueUri != null) builder.append("_defaultValueUri" + "->" + this._defaultValueUri.toString() + "\n"); 
     if(this.defaultValueDate != null) builder.append("defaultValueDate" + "->" + this.defaultValueDate.toString() + "\n"); 
     if(this._defaultValueDate != null) builder.append("_defaultValueDate" + "->" + this._defaultValueDate.toString() + "\n"); 
     if(this.defaultValueDateTime != null) builder.append("defaultValueDateTime" + "->" + this.defaultValueDateTime.toString() + "\n"); 
     if(this._defaultValueDateTime != null) builder.append("_defaultValueDateTime" + "->" + this._defaultValueDateTime.toString() + "\n"); 
     if(this.defaultValueTime != null) builder.append("defaultValueTime" + "->" + this.defaultValueTime.toString() + "\n"); 
     if(this._defaultValueTime != null) builder.append("_defaultValueTime" + "->" + this._defaultValueTime.toString() + "\n"); 
     if(this.defaultValueCode != null) builder.append("defaultValueCode" + "->" + this.defaultValueCode.toString() + "\n"); 
     if(this._defaultValueCode != null) builder.append("_defaultValueCode" + "->" + this._defaultValueCode.toString() + "\n"); 
     if(this.defaultValueOid != null) builder.append("defaultValueOid" + "->" + this.defaultValueOid.toString() + "\n"); 
     if(this._defaultValueOid != null) builder.append("_defaultValueOid" + "->" + this._defaultValueOid.toString() + "\n"); 
     if(this.defaultValueUuid != null) builder.append("defaultValueUuid" + "->" + this.defaultValueUuid.toString() + "\n"); 
     if(this._defaultValueUuid != null) builder.append("_defaultValueUuid" + "->" + this._defaultValueUuid.toString() + "\n"); 
     if(this.defaultValueId != null) builder.append("defaultValueId" + "->" + this.defaultValueId.toString() + "\n"); 
     if(this._defaultValueId != null) builder.append("_defaultValueId" + "->" + this._defaultValueId.toString() + "\n"); 
     if(this.defaultValueUnsignedInt != null) builder.append("defaultValueUnsignedInt" + "->" + this.defaultValueUnsignedInt.toString() + "\n"); 
     if(this._defaultValueUnsignedInt != null) builder.append("_defaultValueUnsignedInt" + "->" + this._defaultValueUnsignedInt.toString() + "\n"); 
     if(this.defaultValuePositiveInt != null) builder.append("defaultValuePositiveInt" + "->" + this.defaultValuePositiveInt.toString() + "\n"); 
     if(this._defaultValuePositiveInt != null) builder.append("_defaultValuePositiveInt" + "->" + this._defaultValuePositiveInt.toString() + "\n"); 
     if(this.defaultValueMarkdown != null) builder.append("defaultValueMarkdown" + "->" + this.defaultValueMarkdown.toString() + "\n"); 
     if(this._defaultValueMarkdown != null) builder.append("_defaultValueMarkdown" + "->" + this._defaultValueMarkdown.toString() + "\n"); 
     if(this.defaultValueElement != null) builder.append("defaultValueElement" + "->" + this.defaultValueElement.toString() + "\n"); 
     if(this.defaultValueExtension != null) builder.append("defaultValueExtension" + "->" + this.defaultValueExtension.toString() + "\n"); 
     if(this.defaultValueBackboneElement != null) builder.append("defaultValueBackboneElement" + "->" + this.defaultValueBackboneElement.toString() + "\n"); 
     if(this.defaultValueNarrative != null) builder.append("defaultValueNarrative" + "->" + this.defaultValueNarrative.toString() + "\n"); 
     if(this.defaultValueAnnotation != null) builder.append("defaultValueAnnotation" + "->" + this.defaultValueAnnotation.toString() + "\n"); 
     if(this.defaultValueAttachment != null) builder.append("defaultValueAttachment" + "->" + this.defaultValueAttachment.toString() + "\n"); 
     if(this.defaultValueIdentifier != null) builder.append("defaultValueIdentifier" + "->" + this.defaultValueIdentifier.toString() + "\n"); 
     if(this.defaultValueCodeableConcept != null) builder.append("defaultValueCodeableConcept" + "->" + this.defaultValueCodeableConcept.toString() + "\n"); 
     if(this.defaultValueCoding != null) builder.append("defaultValueCoding" + "->" + this.defaultValueCoding.toString() + "\n"); 
     if(this.defaultValueQuantity != null) builder.append("defaultValueQuantity" + "->" + this.defaultValueQuantity.toString() + "\n"); 
     if(this.defaultValueDuration != null) builder.append("defaultValueDuration" + "->" + this.defaultValueDuration.toString() + "\n"); 
     if(this.defaultValueSimpleQuantity != null) builder.append("defaultValueSimpleQuantity" + "->" + this.defaultValueSimpleQuantity.toString() + "\n"); 
     if(this.defaultValueDistance != null) builder.append("defaultValueDistance" + "->" + this.defaultValueDistance.toString() + "\n"); 
     if(this.defaultValueCount != null) builder.append("defaultValueCount" + "->" + this.defaultValueCount.toString() + "\n"); 
     if(this.defaultValueMoney != null) builder.append("defaultValueMoney" + "->" + this.defaultValueMoney.toString() + "\n"); 
     if(this.defaultValueAge != null) builder.append("defaultValueAge" + "->" + this.defaultValueAge.toString() + "\n"); 
     if(this.defaultValueRange != null) builder.append("defaultValueRange" + "->" + this.defaultValueRange.toString() + "\n"); 
     if(this.defaultValuePeriod != null) builder.append("defaultValuePeriod" + "->" + this.defaultValuePeriod.toString() + "\n"); 
     if(this.defaultValueRatio != null) builder.append("defaultValueRatio" + "->" + this.defaultValueRatio.toString() + "\n"); 
     if(this.defaultValueReference != null) builder.append("defaultValueReference" + "->" + this.defaultValueReference.toString() + "\n"); 
     if(this.defaultValueSampledData != null) builder.append("defaultValueSampledData" + "->" + this.defaultValueSampledData.toString() + "\n"); 
     if(this.defaultValueSignature != null) builder.append("defaultValueSignature" + "->" + this.defaultValueSignature.toString() + "\n"); 
     if(this.defaultValueHumanName != null) builder.append("defaultValueHumanName" + "->" + this.defaultValueHumanName.toString() + "\n"); 
     if(this.defaultValueAddress != null) builder.append("defaultValueAddress" + "->" + this.defaultValueAddress.toString() + "\n"); 
     if(this.defaultValueContactPoint != null) builder.append("defaultValueContactPoint" + "->" + this.defaultValueContactPoint.toString() + "\n"); 
     if(this.defaultValueTiming != null) builder.append("defaultValueTiming" + "->" + this.defaultValueTiming.toString() + "\n"); 
     if(this.defaultValueMeta != null) builder.append("defaultValueMeta" + "->" + this.defaultValueMeta.toString() + "\n"); 
     if(this.defaultValueElementDefinition != null) builder.append("defaultValueElementDefinition" + "->" + this.defaultValueElementDefinition.toString() + "\n"); 
     if(this.defaultValueContactDetail != null) builder.append("defaultValueContactDetail" + "->" + this.defaultValueContactDetail.toString() + "\n"); 
     if(this.defaultValueContributor != null) builder.append("defaultValueContributor" + "->" + this.defaultValueContributor.toString() + "\n"); 
     if(this.defaultValueDosage != null) builder.append("defaultValueDosage" + "->" + this.defaultValueDosage.toString() + "\n"); 
     if(this.defaultValueRelatedArtifact != null) builder.append("defaultValueRelatedArtifact" + "->" + this.defaultValueRelatedArtifact.toString() + "\n"); 
     if(this.defaultValueUsageContext != null) builder.append("defaultValueUsageContext" + "->" + this.defaultValueUsageContext.toString() + "\n"); 
     if(this.defaultValueDataRequirement != null) builder.append("defaultValueDataRequirement" + "->" + this.defaultValueDataRequirement.toString() + "\n"); 
     if(this.defaultValueParameterDefinition != null) builder.append("defaultValueParameterDefinition" + "->" + this.defaultValueParameterDefinition.toString() + "\n"); 
     if(this.defaultValueTriggerDefinition != null) builder.append("defaultValueTriggerDefinition" + "->" + this.defaultValueTriggerDefinition.toString() + "\n"); 
     if(this.element != null) builder.append("element" + "->" + this.element.toString() + "\n"); 
     if(this._element != null) builder.append("_element" + "->" + this._element.toString() + "\n"); 
     if(this.listMode != null) builder.append("listMode" + "->" + this.listMode.toString() + "\n"); 
     if(this._listMode != null) builder.append("_listMode" + "->" + this._listMode.toString() + "\n"); 
     if(this.variable != null) builder.append("variable" + "->" + this.variable.toString() + "\n"); 
     if(this._variable != null) builder.append("_variable" + "->" + this._variable.toString() + "\n"); 
     if(this.condition != null) builder.append("condition" + "->" + this.condition.toString() + "\n"); 
     if(this._condition != null) builder.append("_condition" + "->" + this._condition.toString() + "\n"); 
     if(this.check != null) builder.append("check" + "->" + this.check.toString() + "\n"); 
     if(this._check != null) builder.append("_check" + "->" + this._check.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ListModeEnum {
  	first,
  	not_first,
  	last,
  	not_last,
  	only_one,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "first" : { return first.toString(); }
  			case "not_first" : { return not_first.toString(); }
  			case "last" : { return last.toString(); }
  			case "not_last" : { return not_last.toString(); }
  			case "only_one" : { return only_one.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}