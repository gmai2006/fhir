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
import org.fhir.entity.ParametersParameterModel;
import com.google.gson.GsonBuilder;

/**
* "This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it."
*/
public class ParametersParameter  {
  /**
  * Description: "The name of the parameter (reference to the operation definition)."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "If the parameter is a data type."
  */
  private Boolean valueBoolean;

  /**
  * Description: "Extensions for valueBoolean"
  */
  private transient Element _valueBoolean;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float valueInteger;

  /**
  * Description: "Extensions for valueInteger"
  */
  private transient Element _valueInteger;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float valueDecimal;

  /**
  * Description: "Extensions for valueDecimal"
  */
  private transient Element _valueDecimal;

  /**
  * Description: "If the parameter is a data type."
  */
  private String valueBase64Binary;

  /**
  * Description: "Extensions for valueBase64Binary"
  */
  private transient Element _valueBase64Binary;

  /**
  * Description: "If the parameter is a data type."
  */
  private String valueInstant;

  /**
  * Description: "Extensions for valueInstant"
  */
  private transient Element _valueInstant;

  /**
  * Description: "If the parameter is a data type."
  */
  private String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  private transient Element _valueString;

  /**
  * Description: "If the parameter is a data type."
  */
  private String valueUri;

  /**
  * Description: "Extensions for valueUri"
  */
  private transient Element _valueUri;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String valueDate;

  /**
  * Description: "Extensions for valueDate"
  */
  private transient Element _valueDate;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String valueDateTime;

  /**
  * Description: "Extensions for valueDateTime"
  */
  private transient Element _valueDateTime;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String valueTime;

  /**
  * Description: "Extensions for valueTime"
  */
  private transient Element _valueTime;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String valueCode;

  /**
  * Description: "Extensions for valueCode"
  */
  private transient Element _valueCode;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  private String valueOid;

  /**
  * Description: "Extensions for valueOid"
  */
  private transient Element _valueOid;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
  private String valueUuid;

  /**
  * Description: "Extensions for valueUuid"
  */
  private transient Element _valueUuid;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String valueId;

  /**
  * Description: "Extensions for valueId"
  */
  private transient Element _valueId;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float valueUnsignedInt;

  /**
  * Description: "Extensions for valueUnsignedInt"
  */
  private transient Element _valueUnsignedInt;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float valuePositiveInt;

  /**
  * Description: "Extensions for valuePositiveInt"
  */
  private transient Element _valuePositiveInt;

  /**
  * Description: "If the parameter is a data type."
  */
  private String valueMarkdown;

  /**
  * Description: "Extensions for valueMarkdown"
  */
  private transient Element _valueMarkdown;

  /**
  * Description: "If the parameter is a data type."
  */
  private Element valueElement;

  /**
  * Description: "If the parameter is a data type."
  */
  private Extension valueExtension;

  /**
  * Description: "If the parameter is a data type."
  */
  private BackboneElement valueBackboneElement;

  /**
  * Description: "If the parameter is a data type."
  */
  private Narrative valueNarrative;

  /**
  * Description: "If the parameter is a data type."
  */
  private Annotation valueAnnotation;

  /**
  * Description: "If the parameter is a data type."
  */
  private Attachment valueAttachment;

  /**
  * Description: "If the parameter is a data type."
  */
  private Identifier valueIdentifier;

  /**
  * Description: "If the parameter is a data type."
  */
  private CodeableConcept valueCodeableConcept;

  /**
  * Description: "If the parameter is a data type."
  */
  private Coding valueCoding;

  /**
  * Description: "If the parameter is a data type."
  */
  private Quantity valueQuantity;

  /**
  * Description: "If the parameter is a data type."
  */
  private Duration valueDuration;

  /**
  * Description: "If the parameter is a data type."
  */
  private Quantity valueSimpleQuantity;

  /**
  * Description: "If the parameter is a data type."
  */
  private Distance valueDistance;

  /**
  * Description: "If the parameter is a data type."
  */
  private Count valueCount;

  /**
  * Description: "If the parameter is a data type."
  */
  private Money valueMoney;

  /**
  * Description: "If the parameter is a data type."
  */
  private Age valueAge;

  /**
  * Description: "If the parameter is a data type."
  */
  private Range valueRange;

  /**
  * Description: "If the parameter is a data type."
  */
  private Period valuePeriod;

  /**
  * Description: "If the parameter is a data type."
  */
  private Ratio valueRatio;

  /**
  * Description: "If the parameter is a data type."
  */
  private Reference valueReference;

  /**
  * Description: "If the parameter is a data type."
  */
  private SampledData valueSampledData;

  /**
  * Description: "If the parameter is a data type."
  */
  private Signature valueSignature;

  /**
  * Description: "If the parameter is a data type."
  */
  private HumanName valueHumanName;

  /**
  * Description: "If the parameter is a data type."
  */
  private Address valueAddress;

  /**
  * Description: "If the parameter is a data type."
  */
  private ContactPoint valueContactPoint;

  /**
  * Description: "If the parameter is a data type."
  */
  private Timing valueTiming;

  /**
  * Description: "If the parameter is a data type."
  */
  private Meta valueMeta;

  /**
  * Description: "If the parameter is a data type."
  */
  private ElementDefinition valueElementDefinition;

  /**
  * Description: "If the parameter is a data type."
  */
  private ContactDetail valueContactDetail;

  /**
  * Description: "If the parameter is a data type."
  */
  private Contributor valueContributor;

  /**
  * Description: "If the parameter is a data type."
  */
  private Dosage valueDosage;

  /**
  * Description: "If the parameter is a data type."
  */
  private RelatedArtifact valueRelatedArtifact;

  /**
  * Description: "If the parameter is a data type."
  */
  private UsageContext valueUsageContext;

  /**
  * Description: "If the parameter is a data type."
  */
  private DataRequirement valueDataRequirement;

  /**
  * Description: "If the parameter is a data type."
  */
  private ParameterDefinition valueParameterDefinition;

  /**
  * Description: "If the parameter is a data type."
  */
  private TriggerDefinition valueTriggerDefinition;

  /**
  * Description: "If the parameter is a whole resource."
  */
  private ResourceList resource;

  /**
  * Description: "A named part of a multi-part parameter."
  */
  private java.util.List<ParametersParameter> part = new java.util.ArrayList<>();

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
  @javax.validation.constraints.NotNull
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

  public ParametersParameter() {
  }

  public ParametersParameter(ParametersParameterModel o) {
    this.id = o.getId();
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getValueBoolean()) {
      this.valueBoolean = o.getValueBoolean();
    }
    if (null != o.getValueInteger()) {
      this.valueInteger = o.getValueInteger();
    }
    if (null != o.getValueDecimal()) {
      this.valueDecimal = o.getValueDecimal();
    }
    if (null != o.getValueBase64Binary()) {
      this.valueBase64Binary = o.getValueBase64Binary();
    }
    if (null != o.getValueInstant()) {
      this.valueInstant = o.getValueInstant();
    }
    if (null != o.getValueString()) {
      this.valueString = o.getValueString();
    }
    if (null != o.getValueUri()) {
      this.valueUri = o.getValueUri();
    }
    if (null != o.getValueDate()) {
      this.valueDate = o.getValueDate();
    }
    if (null != o.getValueDateTime()) {
      this.valueDateTime = o.getValueDateTime();
    }
    if (null != o.getValueTime()) {
      this.valueTime = o.getValueTime();
    }
    if (null != o.getValueCode()) {
      this.valueCode = o.getValueCode();
    }
    if (null != o.getValueOid()) {
      this.valueOid = o.getValueOid();
    }
    if (null != o.getValueUuid()) {
      this.valueUuid = o.getValueUuid();
    }
    if (null != o.getValueId()) {
      this.valueId = o.getValueId();
    }
    if (null != o.getValueUnsignedInt()) {
      this.valueUnsignedInt = o.getValueUnsignedInt();
    }
    if (null != o.getValuePositiveInt()) {
      this.valuePositiveInt = o.getValuePositiveInt();
    }
    if (null != o.getValueMarkdown()) {
      this.valueMarkdown = o.getValueMarkdown();
    }
    this.valueElement = ElementHelper.fromJson(o.getValueElement());
    this.valueExtension = ExtensionHelper.fromJson(o.getValueExtension());
    this.valueBackboneElement = BackboneElementHelper.fromJson(o.getValueBackboneElement());
    if (null != o.getValueNarrative() && !o.getValueNarrative().isEmpty()) {
      this.valueNarrative = new Narrative(o.getValueNarrative().get(0));
    }
    this.valueAnnotation = AnnotationHelper.fromJson(o.getValueAnnotation());
    this.valueAttachment = AttachmentHelper.fromJson(o.getValueAttachment());
    this.valueIdentifier = IdentifierHelper.fromJson(o.getValueIdentifier());
    this.valueCodeableConcept = CodeableConceptHelper.fromJson(o.getValueCodeableConcept());
    this.valueCoding = CodingHelper.fromJson(o.getValueCoding());
    this.valueQuantity = QuantityHelper.fromJson(o.getValueQuantity());
    this.valueDuration = DurationHelper.fromJson(o.getValueDuration());
    this.valueSimpleQuantity = QuantityHelper.fromJson(o.getValueSimpleQuantity());
    if (null != o.getValueDistance() && !o.getValueDistance().isEmpty()) {
      this.valueDistance = new Distance(o.getValueDistance().get(0));
    }
    this.valueCount = CountHelper.fromJson(o.getValueCount());
    this.valueMoney = MoneyHelper.fromJson(o.getValueMoney());
    this.valueAge = AgeHelper.fromJson(o.getValueAge());
    this.valueRange = RangeHelper.fromJson(o.getValueRange());
    this.valuePeriod = PeriodHelper.fromJson(o.getValuePeriod());
    this.valueRatio = RatioHelper.fromJson(o.getValueRatio());
    if (null != o.getValueReference() && !o.getValueReference().isEmpty()) {
      this.valueReference = new Reference(o.getValueReference().get(0));
    }
    this.valueSampledData = SampledDataHelper.fromJson(o.getValueSampledData());
    this.valueSignature = SignatureHelper.fromJson(o.getValueSignature());
    this.valueHumanName = HumanNameHelper.fromJson(o.getValueHumanName());
    this.valueAddress = AddressHelper.fromJson(o.getValueAddress());
    this.valueContactPoint = ContactPointHelper.fromJson(o.getValueContactPoint());
    this.valueTiming = TimingHelper.fromJson(o.getValueTiming());
    if (null != o.getValueMeta() && !o.getValueMeta().isEmpty()) {
      this.valueMeta = new Meta(o.getValueMeta().get(0));
    }
    this.valueElementDefinition = ElementDefinitionHelper.fromJson(o.getValueElementDefinition());
    if (null != o.getValueContactDetail() && !o.getValueContactDetail().isEmpty()) {
      this.valueContactDetail = new ContactDetail(o.getValueContactDetail().get(0));
    }
    if (null != o.getValueContributor() && !o.getValueContributor().isEmpty()) {
      this.valueContributor = new Contributor(o.getValueContributor().get(0));
    }
    if (null != o.getValueDosage() && !o.getValueDosage().isEmpty()) {
      this.valueDosage = new Dosage(o.getValueDosage().get(0));
    }
    if (null != o.getValueRelatedArtifact() && !o.getValueRelatedArtifact().isEmpty()) {
      this.valueRelatedArtifact = new RelatedArtifact(o.getValueRelatedArtifact().get(0));
    }
    if (null != o.getValueUsageContext() && !o.getValueUsageContext().isEmpty()) {
      this.valueUsageContext = new UsageContext(o.getValueUsageContext().get(0));
    }
    if (null != o.getValueDataRequirement() && !o.getValueDataRequirement().isEmpty()) {
      this.valueDataRequirement = new DataRequirement(o.getValueDataRequirement().get(0));
    }
    this.valueParameterDefinition = ParameterDefinitionHelper.fromJson(o.getValueParameterDefinition());
    if (null != o.getValueTriggerDefinition() && !o.getValueTriggerDefinition().isEmpty()) {
      this.valueTriggerDefinition = new TriggerDefinition(o.getValueTriggerDefinition().get(0));
    }
    this.resource = ResourceListHelper.fromJson(o.getResource());
    if (null != o.getPart() && !o.getPart().isEmpty()) {
    	this.part = ParametersParameterHelper.fromArray2Array(o.getPart());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
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
  public void setValueInteger( Float value) {
    this.valueInteger = value;
  }
  public Float getValueInteger() {
    return this.valueInteger;
  }
  public void set_valueInteger( Element value) {
    this._valueInteger = value;
  }
  public Element get_valueInteger() {
    return this._valueInteger;
  }
  public void setValueDecimal( Float value) {
    this.valueDecimal = value;
  }
  public Float getValueDecimal() {
    return this.valueDecimal;
  }
  public void set_valueDecimal( Element value) {
    this._valueDecimal = value;
  }
  public Element get_valueDecimal() {
    return this._valueDecimal;
  }
  public void setValueBase64Binary( String value) {
    this.valueBase64Binary = value;
  }
  public String getValueBase64Binary() {
    return this.valueBase64Binary;
  }
  public void set_valueBase64Binary( Element value) {
    this._valueBase64Binary = value;
  }
  public Element get_valueBase64Binary() {
    return this._valueBase64Binary;
  }
  public void setValueInstant( String value) {
    this.valueInstant = value;
  }
  public String getValueInstant() {
    return this.valueInstant;
  }
  public void set_valueInstant( Element value) {
    this._valueInstant = value;
  }
  public Element get_valueInstant() {
    return this._valueInstant;
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
  public void setValueUri( String value) {
    this.valueUri = value;
  }
  public String getValueUri() {
    return this.valueUri;
  }
  public void set_valueUri( Element value) {
    this._valueUri = value;
  }
  public Element get_valueUri() {
    return this._valueUri;
  }
  public void setValueDate( String value) {
    this.valueDate = value;
  }
  public String getValueDate() {
    return this.valueDate;
  }
  public void set_valueDate( Element value) {
    this._valueDate = value;
  }
  public Element get_valueDate() {
    return this._valueDate;
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
  public void setValueCode( String value) {
    this.valueCode = value;
  }
  public String getValueCode() {
    return this.valueCode;
  }
  public void set_valueCode( Element value) {
    this._valueCode = value;
  }
  public Element get_valueCode() {
    return this._valueCode;
  }
  public void setValueOid( String value) {
    this.valueOid = value;
  }
  public String getValueOid() {
    return this.valueOid;
  }
  public void set_valueOid( Element value) {
    this._valueOid = value;
  }
  public Element get_valueOid() {
    return this._valueOid;
  }
  public void setValueUuid( String value) {
    this.valueUuid = value;
  }
  public String getValueUuid() {
    return this.valueUuid;
  }
  public void set_valueUuid( Element value) {
    this._valueUuid = value;
  }
  public Element get_valueUuid() {
    return this._valueUuid;
  }
  public void setValueId( String value) {
    this.valueId = value;
  }
  public String getValueId() {
    return this.valueId;
  }
  public void set_valueId( Element value) {
    this._valueId = value;
  }
  public Element get_valueId() {
    return this._valueId;
  }
  public void setValueUnsignedInt( Float value) {
    this.valueUnsignedInt = value;
  }
  public Float getValueUnsignedInt() {
    return this.valueUnsignedInt;
  }
  public void set_valueUnsignedInt( Element value) {
    this._valueUnsignedInt = value;
  }
  public Element get_valueUnsignedInt() {
    return this._valueUnsignedInt;
  }
  public void setValuePositiveInt( Float value) {
    this.valuePositiveInt = value;
  }
  public Float getValuePositiveInt() {
    return this.valuePositiveInt;
  }
  public void set_valuePositiveInt( Element value) {
    this._valuePositiveInt = value;
  }
  public Element get_valuePositiveInt() {
    return this._valuePositiveInt;
  }
  public void setValueMarkdown( String value) {
    this.valueMarkdown = value;
  }
  public String getValueMarkdown() {
    return this.valueMarkdown;
  }
  public void set_valueMarkdown( Element value) {
    this._valueMarkdown = value;
  }
  public Element get_valueMarkdown() {
    return this._valueMarkdown;
  }
  public void setValueElement( Element value) {
    this.valueElement = value;
  }
  public Element getValueElement() {
    return this.valueElement;
  }
  public void setValueExtension( Extension value) {
    this.valueExtension = value;
  }
  public Extension getValueExtension() {
    return this.valueExtension;
  }
  public void setValueBackboneElement( BackboneElement value) {
    this.valueBackboneElement = value;
  }
  public BackboneElement getValueBackboneElement() {
    return this.valueBackboneElement;
  }
  public void setValueNarrative( Narrative value) {
    this.valueNarrative = value;
  }
  public Narrative getValueNarrative() {
    return this.valueNarrative;
  }
  public void setValueAnnotation( Annotation value) {
    this.valueAnnotation = value;
  }
  public Annotation getValueAnnotation() {
    return this.valueAnnotation;
  }
  public void setValueAttachment( Attachment value) {
    this.valueAttachment = value;
  }
  public Attachment getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueIdentifier( Identifier value) {
    this.valueIdentifier = value;
  }
  public Identifier getValueIdentifier() {
    return this.valueIdentifier;
  }
  public void setValueCodeableConcept( CodeableConcept value) {
    this.valueCodeableConcept = value;
  }
  public CodeableConcept getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCoding( Coding value) {
    this.valueCoding = value;
  }
  public Coding getValueCoding() {
    return this.valueCoding;
  }
  public void setValueQuantity( Quantity value) {
    this.valueQuantity = value;
  }
  public Quantity getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueDuration( Duration value) {
    this.valueDuration = value;
  }
  public Duration getValueDuration() {
    return this.valueDuration;
  }
  public void setValueSimpleQuantity( Quantity value) {
    this.valueSimpleQuantity = value;
  }
  public Quantity getValueSimpleQuantity() {
    return this.valueSimpleQuantity;
  }
  public void setValueDistance( Distance value) {
    this.valueDistance = value;
  }
  public Distance getValueDistance() {
    return this.valueDistance;
  }
  public void setValueCount( Count value) {
    this.valueCount = value;
  }
  public Count getValueCount() {
    return this.valueCount;
  }
  public void setValueMoney( Money value) {
    this.valueMoney = value;
  }
  public Money getValueMoney() {
    return this.valueMoney;
  }
  public void setValueAge( Age value) {
    this.valueAge = value;
  }
  public Age getValueAge() {
    return this.valueAge;
  }
  public void setValueRange( Range value) {
    this.valueRange = value;
  }
  public Range getValueRange() {
    return this.valueRange;
  }
  public void setValuePeriod( Period value) {
    this.valuePeriod = value;
  }
  public Period getValuePeriod() {
    return this.valuePeriod;
  }
  public void setValueRatio( Ratio value) {
    this.valueRatio = value;
  }
  public Ratio getValueRatio() {
    return this.valueRatio;
  }
  public void setValueReference( Reference value) {
    this.valueReference = value;
  }
  public Reference getValueReference() {
    return this.valueReference;
  }
  public void setValueSampledData( SampledData value) {
    this.valueSampledData = value;
  }
  public SampledData getValueSampledData() {
    return this.valueSampledData;
  }
  public void setValueSignature( Signature value) {
    this.valueSignature = value;
  }
  public Signature getValueSignature() {
    return this.valueSignature;
  }
  public void setValueHumanName( HumanName value) {
    this.valueHumanName = value;
  }
  public HumanName getValueHumanName() {
    return this.valueHumanName;
  }
  public void setValueAddress( Address value) {
    this.valueAddress = value;
  }
  public Address getValueAddress() {
    return this.valueAddress;
  }
  public void setValueContactPoint( ContactPoint value) {
    this.valueContactPoint = value;
  }
  public ContactPoint getValueContactPoint() {
    return this.valueContactPoint;
  }
  public void setValueTiming( Timing value) {
    this.valueTiming = value;
  }
  public Timing getValueTiming() {
    return this.valueTiming;
  }
  public void setValueMeta( Meta value) {
    this.valueMeta = value;
  }
  public Meta getValueMeta() {
    return this.valueMeta;
  }
  public void setValueElementDefinition( ElementDefinition value) {
    this.valueElementDefinition = value;
  }
  public ElementDefinition getValueElementDefinition() {
    return this.valueElementDefinition;
  }
  public void setValueContactDetail( ContactDetail value) {
    this.valueContactDetail = value;
  }
  public ContactDetail getValueContactDetail() {
    return this.valueContactDetail;
  }
  public void setValueContributor( Contributor value) {
    this.valueContributor = value;
  }
  public Contributor getValueContributor() {
    return this.valueContributor;
  }
  public void setValueDosage( Dosage value) {
    this.valueDosage = value;
  }
  public Dosage getValueDosage() {
    return this.valueDosage;
  }
  public void setValueRelatedArtifact( RelatedArtifact value) {
    this.valueRelatedArtifact = value;
  }
  public RelatedArtifact getValueRelatedArtifact() {
    return this.valueRelatedArtifact;
  }
  public void setValueUsageContext( UsageContext value) {
    this.valueUsageContext = value;
  }
  public UsageContext getValueUsageContext() {
    return this.valueUsageContext;
  }
  public void setValueDataRequirement( DataRequirement value) {
    this.valueDataRequirement = value;
  }
  public DataRequirement getValueDataRequirement() {
    return this.valueDataRequirement;
  }
  public void setValueParameterDefinition( ParameterDefinition value) {
    this.valueParameterDefinition = value;
  }
  public ParameterDefinition getValueParameterDefinition() {
    return this.valueParameterDefinition;
  }
  public void setValueTriggerDefinition( TriggerDefinition value) {
    this.valueTriggerDefinition = value;
  }
  public TriggerDefinition getValueTriggerDefinition() {
    return this.valueTriggerDefinition;
  }
  public void setResource( ResourceList value) {
    this.resource = value;
  }
  public ResourceList getResource() {
    return this.resource;
  }
  public void setPart( java.util.List<ParametersParameter> value) {
    this.part = value;
  }
  public java.util.List<ParametersParameter> getPart() {
    return this.part;
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
    builder.append("[ParametersParameter]:" + "\n");
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.valueBoolean != null) builder.append("valueBoolean" + "->" + this.valueBoolean.toString() + "\n"); 
     if(this._valueBoolean != null) builder.append("_valueBoolean" + "->" + this._valueBoolean.toString() + "\n"); 
     if(this.valueInteger != null) builder.append("valueInteger" + "->" + this.valueInteger.toString() + "\n"); 
     if(this._valueInteger != null) builder.append("_valueInteger" + "->" + this._valueInteger.toString() + "\n"); 
     if(this.valueDecimal != null) builder.append("valueDecimal" + "->" + this.valueDecimal.toString() + "\n"); 
     if(this._valueDecimal != null) builder.append("_valueDecimal" + "->" + this._valueDecimal.toString() + "\n"); 
     if(this.valueBase64Binary != null) builder.append("valueBase64Binary" + "->" + this.valueBase64Binary.toString() + "\n"); 
     if(this._valueBase64Binary != null) builder.append("_valueBase64Binary" + "->" + this._valueBase64Binary.toString() + "\n"); 
     if(this.valueInstant != null) builder.append("valueInstant" + "->" + this.valueInstant.toString() + "\n"); 
     if(this._valueInstant != null) builder.append("_valueInstant" + "->" + this._valueInstant.toString() + "\n"); 
     if(this.valueString != null) builder.append("valueString" + "->" + this.valueString.toString() + "\n"); 
     if(this._valueString != null) builder.append("_valueString" + "->" + this._valueString.toString() + "\n"); 
     if(this.valueUri != null) builder.append("valueUri" + "->" + this.valueUri.toString() + "\n"); 
     if(this._valueUri != null) builder.append("_valueUri" + "->" + this._valueUri.toString() + "\n"); 
     if(this.valueDate != null) builder.append("valueDate" + "->" + this.valueDate.toString() + "\n"); 
     if(this._valueDate != null) builder.append("_valueDate" + "->" + this._valueDate.toString() + "\n"); 
     if(this.valueDateTime != null) builder.append("valueDateTime" + "->" + this.valueDateTime.toString() + "\n"); 
     if(this._valueDateTime != null) builder.append("_valueDateTime" + "->" + this._valueDateTime.toString() + "\n"); 
     if(this.valueTime != null) builder.append("valueTime" + "->" + this.valueTime.toString() + "\n"); 
     if(this._valueTime != null) builder.append("_valueTime" + "->" + this._valueTime.toString() + "\n"); 
     if(this.valueCode != null) builder.append("valueCode" + "->" + this.valueCode.toString() + "\n"); 
     if(this._valueCode != null) builder.append("_valueCode" + "->" + this._valueCode.toString() + "\n"); 
     if(this.valueOid != null) builder.append("valueOid" + "->" + this.valueOid.toString() + "\n"); 
     if(this._valueOid != null) builder.append("_valueOid" + "->" + this._valueOid.toString() + "\n"); 
     if(this.valueUuid != null) builder.append("valueUuid" + "->" + this.valueUuid.toString() + "\n"); 
     if(this._valueUuid != null) builder.append("_valueUuid" + "->" + this._valueUuid.toString() + "\n"); 
     if(this.valueId != null) builder.append("valueId" + "->" + this.valueId.toString() + "\n"); 
     if(this._valueId != null) builder.append("_valueId" + "->" + this._valueId.toString() + "\n"); 
     if(this.valueUnsignedInt != null) builder.append("valueUnsignedInt" + "->" + this.valueUnsignedInt.toString() + "\n"); 
     if(this._valueUnsignedInt != null) builder.append("_valueUnsignedInt" + "->" + this._valueUnsignedInt.toString() + "\n"); 
     if(this.valuePositiveInt != null) builder.append("valuePositiveInt" + "->" + this.valuePositiveInt.toString() + "\n"); 
     if(this._valuePositiveInt != null) builder.append("_valuePositiveInt" + "->" + this._valuePositiveInt.toString() + "\n"); 
     if(this.valueMarkdown != null) builder.append("valueMarkdown" + "->" + this.valueMarkdown.toString() + "\n"); 
     if(this._valueMarkdown != null) builder.append("_valueMarkdown" + "->" + this._valueMarkdown.toString() + "\n"); 
     if(this.valueElement != null) builder.append("valueElement" + "->" + this.valueElement.toString() + "\n"); 
     if(this.valueExtension != null) builder.append("valueExtension" + "->" + this.valueExtension.toString() + "\n"); 
     if(this.valueBackboneElement != null) builder.append("valueBackboneElement" + "->" + this.valueBackboneElement.toString() + "\n"); 
     if(this.valueNarrative != null) builder.append("valueNarrative" + "->" + this.valueNarrative.toString() + "\n"); 
     if(this.valueAnnotation != null) builder.append("valueAnnotation" + "->" + this.valueAnnotation.toString() + "\n"); 
     if(this.valueAttachment != null) builder.append("valueAttachment" + "->" + this.valueAttachment.toString() + "\n"); 
     if(this.valueIdentifier != null) builder.append("valueIdentifier" + "->" + this.valueIdentifier.toString() + "\n"); 
     if(this.valueCodeableConcept != null) builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept.toString() + "\n"); 
     if(this.valueCoding != null) builder.append("valueCoding" + "->" + this.valueCoding.toString() + "\n"); 
     if(this.valueQuantity != null) builder.append("valueQuantity" + "->" + this.valueQuantity.toString() + "\n"); 
     if(this.valueDuration != null) builder.append("valueDuration" + "->" + this.valueDuration.toString() + "\n"); 
     if(this.valueSimpleQuantity != null) builder.append("valueSimpleQuantity" + "->" + this.valueSimpleQuantity.toString() + "\n"); 
     if(this.valueDistance != null) builder.append("valueDistance" + "->" + this.valueDistance.toString() + "\n"); 
     if(this.valueCount != null) builder.append("valueCount" + "->" + this.valueCount.toString() + "\n"); 
     if(this.valueMoney != null) builder.append("valueMoney" + "->" + this.valueMoney.toString() + "\n"); 
     if(this.valueAge != null) builder.append("valueAge" + "->" + this.valueAge.toString() + "\n"); 
     if(this.valueRange != null) builder.append("valueRange" + "->" + this.valueRange.toString() + "\n"); 
     if(this.valuePeriod != null) builder.append("valuePeriod" + "->" + this.valuePeriod.toString() + "\n"); 
     if(this.valueRatio != null) builder.append("valueRatio" + "->" + this.valueRatio.toString() + "\n"); 
     if(this.valueReference != null) builder.append("valueReference" + "->" + this.valueReference.toString() + "\n"); 
     if(this.valueSampledData != null) builder.append("valueSampledData" + "->" + this.valueSampledData.toString() + "\n"); 
     if(this.valueSignature != null) builder.append("valueSignature" + "->" + this.valueSignature.toString() + "\n"); 
     if(this.valueHumanName != null) builder.append("valueHumanName" + "->" + this.valueHumanName.toString() + "\n"); 
     if(this.valueAddress != null) builder.append("valueAddress" + "->" + this.valueAddress.toString() + "\n"); 
     if(this.valueContactPoint != null) builder.append("valueContactPoint" + "->" + this.valueContactPoint.toString() + "\n"); 
     if(this.valueTiming != null) builder.append("valueTiming" + "->" + this.valueTiming.toString() + "\n"); 
     if(this.valueMeta != null) builder.append("valueMeta" + "->" + this.valueMeta.toString() + "\n"); 
     if(this.valueElementDefinition != null) builder.append("valueElementDefinition" + "->" + this.valueElementDefinition.toString() + "\n"); 
     if(this.valueContactDetail != null) builder.append("valueContactDetail" + "->" + this.valueContactDetail.toString() + "\n"); 
     if(this.valueContributor != null) builder.append("valueContributor" + "->" + this.valueContributor.toString() + "\n"); 
     if(this.valueDosage != null) builder.append("valueDosage" + "->" + this.valueDosage.toString() + "\n"); 
     if(this.valueRelatedArtifact != null) builder.append("valueRelatedArtifact" + "->" + this.valueRelatedArtifact.toString() + "\n"); 
     if(this.valueUsageContext != null) builder.append("valueUsageContext" + "->" + this.valueUsageContext.toString() + "\n"); 
     if(this.valueDataRequirement != null) builder.append("valueDataRequirement" + "->" + this.valueDataRequirement.toString() + "\n"); 
     if(this.valueParameterDefinition != null) builder.append("valueParameterDefinition" + "->" + this.valueParameterDefinition.toString() + "\n"); 
     if(this.valueTriggerDefinition != null) builder.append("valueTriggerDefinition" + "->" + this.valueTriggerDefinition.toString() + "\n"); 
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); 
     if(this.part != null) builder.append("part" + "->" + this.part.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}