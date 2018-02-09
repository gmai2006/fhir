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
import com.google.gson.GsonBuilder;

/**
* "A Map of relationships between 2 structures that can be used to transform data."
*/
public class StructureMapSource  {
  /**
  * Description: "Type or variable this rule applies to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String context;

  /**
  * Description: "Extensions for context"
  */
  private transient Element _context;

  /**
  * Description: "Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float min;

  /**
  * Description: "Extensions for min"
  */
  private transient Element _min;

  /**
  * Description: "Specified maximum cardinality for the element - a number or a \"*\". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value)."
  */
  private String max;

  /**
  * Description: "Extensions for max"
  */
  private transient Element _max;

  /**
  * Description: "Specified type for the element. This works as a condition on the mapping - use for polymorphic elements."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Boolean defaultValueBoolean;

  /**
  * Description: "Extensions for defaultValueBoolean"
  */
  private transient Element _defaultValueBoolean;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float defaultValueInteger;

  /**
  * Description: "Extensions for defaultValueInteger"
  */
  private transient Element _defaultValueInteger;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float defaultValueDecimal;

  /**
  * Description: "Extensions for defaultValueDecimal"
  */
  private transient Element _defaultValueDecimal;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private String defaultValueBase64Binary;

  /**
  * Description: "Extensions for defaultValueBase64Binary"
  */
  private transient Element _defaultValueBase64Binary;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private String defaultValueInstant;

  /**
  * Description: "Extensions for defaultValueInstant"
  */
  private transient Element _defaultValueInstant;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private String defaultValueString;

  /**
  * Description: "Extensions for defaultValueString"
  */
  private transient Element _defaultValueString;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private String defaultValueUri;

  /**
  * Description: "Extensions for defaultValueUri"
  */
  private transient Element _defaultValueUri;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String defaultValueDate;

  /**
  * Description: "Extensions for defaultValueDate"
  */
  private transient Element _defaultValueDate;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String defaultValueDateTime;

  /**
  * Description: "Extensions for defaultValueDateTime"
  */
  private transient Element _defaultValueDateTime;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String defaultValueTime;

  /**
  * Description: "Extensions for defaultValueTime"
  */
  private transient Element _defaultValueTime;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String defaultValueCode;

  /**
  * Description: "Extensions for defaultValueCode"
  */
  private transient Element _defaultValueCode;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  private String defaultValueOid;

  /**
  * Description: "Extensions for defaultValueOid"
  */
  private transient Element _defaultValueOid;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
  private String defaultValueUuid;

  /**
  * Description: "Extensions for defaultValueUuid"
  */
  private transient Element _defaultValueUuid;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String defaultValueId;

  /**
  * Description: "Extensions for defaultValueId"
  */
  private transient Element _defaultValueId;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float defaultValueUnsignedInt;

  /**
  * Description: "Extensions for defaultValueUnsignedInt"
  */
  private transient Element _defaultValueUnsignedInt;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float defaultValuePositiveInt;

  /**
  * Description: "Extensions for defaultValuePositiveInt"
  */
  private transient Element _defaultValuePositiveInt;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private String defaultValueMarkdown;

  /**
  * Description: "Extensions for defaultValueMarkdown"
  */
  private transient Element _defaultValueMarkdown;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Element defaultValueElement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Extension defaultValueExtension;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private BackboneElement defaultValueBackboneElement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Narrative defaultValueNarrative;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Annotation defaultValueAnnotation;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Attachment defaultValueAttachment;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Identifier defaultValueIdentifier;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private CodeableConcept defaultValueCodeableConcept;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Coding defaultValueCoding;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Quantity defaultValueQuantity;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Duration defaultValueDuration;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Quantity defaultValueSimpleQuantity;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Distance defaultValueDistance;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Count defaultValueCount;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Money defaultValueMoney;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Age defaultValueAge;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Range defaultValueRange;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Period defaultValuePeriod;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Ratio defaultValueRatio;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Reference defaultValueReference;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private SampledData defaultValueSampledData;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Signature defaultValueSignature;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private HumanName defaultValueHumanName;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Address defaultValueAddress;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private ContactPoint defaultValueContactPoint;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Timing defaultValueTiming;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Meta defaultValueMeta;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private ElementDefinition defaultValueElementDefinition;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private ContactDetail defaultValueContactDetail;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Contributor defaultValueContributor;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private Dosage defaultValueDosage;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private RelatedArtifact defaultValueRelatedArtifact;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private UsageContext defaultValueUsageContext;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private DataRequirement defaultValueDataRequirement;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private ParameterDefinition defaultValueParameterDefinition;

  /**
  * Description: "A value to use if there is no existing value in the source object."
  */
  private TriggerDefinition defaultValueTriggerDefinition;

  /**
  * Description: "Optional field for this source."
  */
  private String element;

  /**
  * Description: "Extensions for element"
  */
  private transient Element _element;

  /**
  * Description: "How to handle the list mode for this element."
  */
  private String listMode;

  /**
  * Description: "Extensions for listMode"
  */
  private transient Element _listMode;

  /**
  * Description: "Named context for field, if a field is specified."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String variable;

  /**
  * Description: "Extensions for variable"
  */
  private transient Element _variable;

  /**
  * Description: "FHIRPath expression  - must be true or the rule does not apply."
  */
  private String condition;

  /**
  * Description: "Extensions for condition"
  */
  private transient Element _condition;

  /**
  * Description: "FHIRPath expression  - must be true or the mapping engine throws an error instead of completing."
  */
  private String check;

  /**
  * Description: "Extensions for check"
  */
  private transient Element _check;

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

  public StructureMapSource() {}

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
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("_context" + "[" + String.valueOf(this._context) + "]\n"); 
     builder.append("min" + "[" + String.valueOf(this.min) + "]\n"); 
     builder.append("_min" + "[" + String.valueOf(this._min) + "]\n"); 
     builder.append("max" + "[" + String.valueOf(this.max) + "]\n"); 
     builder.append("_max" + "[" + String.valueOf(this._max) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("defaultValueBoolean" + "[" + String.valueOf(this.defaultValueBoolean) + "]\n"); 
     builder.append("_defaultValueBoolean" + "[" + String.valueOf(this._defaultValueBoolean) + "]\n"); 
     builder.append("defaultValueInteger" + "[" + String.valueOf(this.defaultValueInteger) + "]\n"); 
     builder.append("_defaultValueInteger" + "[" + String.valueOf(this._defaultValueInteger) + "]\n"); 
     builder.append("defaultValueDecimal" + "[" + String.valueOf(this.defaultValueDecimal) + "]\n"); 
     builder.append("_defaultValueDecimal" + "[" + String.valueOf(this._defaultValueDecimal) + "]\n"); 
     builder.append("defaultValueBase64Binary" + "[" + String.valueOf(this.defaultValueBase64Binary) + "]\n"); 
     builder.append("_defaultValueBase64Binary" + "[" + String.valueOf(this._defaultValueBase64Binary) + "]\n"); 
     builder.append("defaultValueInstant" + "[" + String.valueOf(this.defaultValueInstant) + "]\n"); 
     builder.append("_defaultValueInstant" + "[" + String.valueOf(this._defaultValueInstant) + "]\n"); 
     builder.append("defaultValueString" + "[" + String.valueOf(this.defaultValueString) + "]\n"); 
     builder.append("_defaultValueString" + "[" + String.valueOf(this._defaultValueString) + "]\n"); 
     builder.append("defaultValueUri" + "[" + String.valueOf(this.defaultValueUri) + "]\n"); 
     builder.append("_defaultValueUri" + "[" + String.valueOf(this._defaultValueUri) + "]\n"); 
     builder.append("defaultValueDate" + "[" + String.valueOf(this.defaultValueDate) + "]\n"); 
     builder.append("_defaultValueDate" + "[" + String.valueOf(this._defaultValueDate) + "]\n"); 
     builder.append("defaultValueDateTime" + "[" + String.valueOf(this.defaultValueDateTime) + "]\n"); 
     builder.append("_defaultValueDateTime" + "[" + String.valueOf(this._defaultValueDateTime) + "]\n"); 
     builder.append("defaultValueTime" + "[" + String.valueOf(this.defaultValueTime) + "]\n"); 
     builder.append("_defaultValueTime" + "[" + String.valueOf(this._defaultValueTime) + "]\n"); 
     builder.append("defaultValueCode" + "[" + String.valueOf(this.defaultValueCode) + "]\n"); 
     builder.append("_defaultValueCode" + "[" + String.valueOf(this._defaultValueCode) + "]\n"); 
     builder.append("defaultValueOid" + "[" + String.valueOf(this.defaultValueOid) + "]\n"); 
     builder.append("_defaultValueOid" + "[" + String.valueOf(this._defaultValueOid) + "]\n"); 
     builder.append("defaultValueUuid" + "[" + String.valueOf(this.defaultValueUuid) + "]\n"); 
     builder.append("_defaultValueUuid" + "[" + String.valueOf(this._defaultValueUuid) + "]\n"); 
     builder.append("defaultValueId" + "[" + String.valueOf(this.defaultValueId) + "]\n"); 
     builder.append("_defaultValueId" + "[" + String.valueOf(this._defaultValueId) + "]\n"); 
     builder.append("defaultValueUnsignedInt" + "[" + String.valueOf(this.defaultValueUnsignedInt) + "]\n"); 
     builder.append("_defaultValueUnsignedInt" + "[" + String.valueOf(this._defaultValueUnsignedInt) + "]\n"); 
     builder.append("defaultValuePositiveInt" + "[" + String.valueOf(this.defaultValuePositiveInt) + "]\n"); 
     builder.append("_defaultValuePositiveInt" + "[" + String.valueOf(this._defaultValuePositiveInt) + "]\n"); 
     builder.append("defaultValueMarkdown" + "[" + String.valueOf(this.defaultValueMarkdown) + "]\n"); 
     builder.append("_defaultValueMarkdown" + "[" + String.valueOf(this._defaultValueMarkdown) + "]\n"); 
     builder.append("defaultValueElement" + "[" + String.valueOf(this.defaultValueElement) + "]\n"); 
     builder.append("defaultValueExtension" + "[" + String.valueOf(this.defaultValueExtension) + "]\n"); 
     builder.append("defaultValueBackboneElement" + "[" + String.valueOf(this.defaultValueBackboneElement) + "]\n"); 
     builder.append("defaultValueNarrative" + "[" + String.valueOf(this.defaultValueNarrative) + "]\n"); 
     builder.append("defaultValueAnnotation" + "[" + String.valueOf(this.defaultValueAnnotation) + "]\n"); 
     builder.append("defaultValueAttachment" + "[" + String.valueOf(this.defaultValueAttachment) + "]\n"); 
     builder.append("defaultValueIdentifier" + "[" + String.valueOf(this.defaultValueIdentifier) + "]\n"); 
     builder.append("defaultValueCodeableConcept" + "[" + String.valueOf(this.defaultValueCodeableConcept) + "]\n"); 
     builder.append("defaultValueCoding" + "[" + String.valueOf(this.defaultValueCoding) + "]\n"); 
     builder.append("defaultValueQuantity" + "[" + String.valueOf(this.defaultValueQuantity) + "]\n"); 
     builder.append("defaultValueDuration" + "[" + String.valueOf(this.defaultValueDuration) + "]\n"); 
     builder.append("defaultValueSimpleQuantity" + "[" + String.valueOf(this.defaultValueSimpleQuantity) + "]\n"); 
     builder.append("defaultValueDistance" + "[" + String.valueOf(this.defaultValueDistance) + "]\n"); 
     builder.append("defaultValueCount" + "[" + String.valueOf(this.defaultValueCount) + "]\n"); 
     builder.append("defaultValueMoney" + "[" + String.valueOf(this.defaultValueMoney) + "]\n"); 
     builder.append("defaultValueAge" + "[" + String.valueOf(this.defaultValueAge) + "]\n"); 
     builder.append("defaultValueRange" + "[" + String.valueOf(this.defaultValueRange) + "]\n"); 
     builder.append("defaultValuePeriod" + "[" + String.valueOf(this.defaultValuePeriod) + "]\n"); 
     builder.append("defaultValueRatio" + "[" + String.valueOf(this.defaultValueRatio) + "]\n"); 
     builder.append("defaultValueReference" + "[" + String.valueOf(this.defaultValueReference) + "]\n"); 
     builder.append("defaultValueSampledData" + "[" + String.valueOf(this.defaultValueSampledData) + "]\n"); 
     builder.append("defaultValueSignature" + "[" + String.valueOf(this.defaultValueSignature) + "]\n"); 
     builder.append("defaultValueHumanName" + "[" + String.valueOf(this.defaultValueHumanName) + "]\n"); 
     builder.append("defaultValueAddress" + "[" + String.valueOf(this.defaultValueAddress) + "]\n"); 
     builder.append("defaultValueContactPoint" + "[" + String.valueOf(this.defaultValueContactPoint) + "]\n"); 
     builder.append("defaultValueTiming" + "[" + String.valueOf(this.defaultValueTiming) + "]\n"); 
     builder.append("defaultValueMeta" + "[" + String.valueOf(this.defaultValueMeta) + "]\n"); 
     builder.append("defaultValueElementDefinition" + "[" + String.valueOf(this.defaultValueElementDefinition) + "]\n"); 
     builder.append("defaultValueContactDetail" + "[" + String.valueOf(this.defaultValueContactDetail) + "]\n"); 
     builder.append("defaultValueContributor" + "[" + String.valueOf(this.defaultValueContributor) + "]\n"); 
     builder.append("defaultValueDosage" + "[" + String.valueOf(this.defaultValueDosage) + "]\n"); 
     builder.append("defaultValueRelatedArtifact" + "[" + String.valueOf(this.defaultValueRelatedArtifact) + "]\n"); 
     builder.append("defaultValueUsageContext" + "[" + String.valueOf(this.defaultValueUsageContext) + "]\n"); 
     builder.append("defaultValueDataRequirement" + "[" + String.valueOf(this.defaultValueDataRequirement) + "]\n"); 
     builder.append("defaultValueParameterDefinition" + "[" + String.valueOf(this.defaultValueParameterDefinition) + "]\n"); 
     builder.append("defaultValueTriggerDefinition" + "[" + String.valueOf(this.defaultValueTriggerDefinition) + "]\n"); 
     builder.append("element" + "[" + String.valueOf(this.element) + "]\n"); 
     builder.append("_element" + "[" + String.valueOf(this._element) + "]\n"); 
     builder.append("listMode" + "[" + String.valueOf(this.listMode) + "]\n"); 
     builder.append("_listMode" + "[" + String.valueOf(this._listMode) + "]\n"); 
     builder.append("variable" + "[" + String.valueOf(this.variable) + "]\n"); 
     builder.append("_variable" + "[" + String.valueOf(this._variable) + "]\n"); 
     builder.append("condition" + "[" + String.valueOf(this.condition) + "]\n"); 
     builder.append("_condition" + "[" + String.valueOf(this._condition) + "]\n"); 
     builder.append("check" + "[" + String.valueOf(this.check) + "]\n"); 
     builder.append("_check" + "[" + String.valueOf(this._check) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static StructureMapSource fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, StructureMapSource.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(StructureMapSource o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<StructureMapSource> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
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