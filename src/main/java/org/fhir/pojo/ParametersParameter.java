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

  public ParametersParameter() {}

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
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("valueBoolean" + "[" + String.valueOf(this.valueBoolean) + "]\n"); 
     builder.append("_valueBoolean" + "[" + String.valueOf(this._valueBoolean) + "]\n"); 
     builder.append("valueInteger" + "[" + String.valueOf(this.valueInteger) + "]\n"); 
     builder.append("_valueInteger" + "[" + String.valueOf(this._valueInteger) + "]\n"); 
     builder.append("valueDecimal" + "[" + String.valueOf(this.valueDecimal) + "]\n"); 
     builder.append("_valueDecimal" + "[" + String.valueOf(this._valueDecimal) + "]\n"); 
     builder.append("valueBase64Binary" + "[" + String.valueOf(this.valueBase64Binary) + "]\n"); 
     builder.append("_valueBase64Binary" + "[" + String.valueOf(this._valueBase64Binary) + "]\n"); 
     builder.append("valueInstant" + "[" + String.valueOf(this.valueInstant) + "]\n"); 
     builder.append("_valueInstant" + "[" + String.valueOf(this._valueInstant) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("_valueString" + "[" + String.valueOf(this._valueString) + "]\n"); 
     builder.append("valueUri" + "[" + String.valueOf(this.valueUri) + "]\n"); 
     builder.append("_valueUri" + "[" + String.valueOf(this._valueUri) + "]\n"); 
     builder.append("valueDate" + "[" + String.valueOf(this.valueDate) + "]\n"); 
     builder.append("_valueDate" + "[" + String.valueOf(this._valueDate) + "]\n"); 
     builder.append("valueDateTime" + "[" + String.valueOf(this.valueDateTime) + "]\n"); 
     builder.append("_valueDateTime" + "[" + String.valueOf(this._valueDateTime) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("_valueTime" + "[" + String.valueOf(this._valueTime) + "]\n"); 
     builder.append("valueCode" + "[" + String.valueOf(this.valueCode) + "]\n"); 
     builder.append("_valueCode" + "[" + String.valueOf(this._valueCode) + "]\n"); 
     builder.append("valueOid" + "[" + String.valueOf(this.valueOid) + "]\n"); 
     builder.append("_valueOid" + "[" + String.valueOf(this._valueOid) + "]\n"); 
     builder.append("valueUuid" + "[" + String.valueOf(this.valueUuid) + "]\n"); 
     builder.append("_valueUuid" + "[" + String.valueOf(this._valueUuid) + "]\n"); 
     builder.append("valueId" + "[" + String.valueOf(this.valueId) + "]\n"); 
     builder.append("_valueId" + "[" + String.valueOf(this._valueId) + "]\n"); 
     builder.append("valueUnsignedInt" + "[" + String.valueOf(this.valueUnsignedInt) + "]\n"); 
     builder.append("_valueUnsignedInt" + "[" + String.valueOf(this._valueUnsignedInt) + "]\n"); 
     builder.append("valuePositiveInt" + "[" + String.valueOf(this.valuePositiveInt) + "]\n"); 
     builder.append("_valuePositiveInt" + "[" + String.valueOf(this._valuePositiveInt) + "]\n"); 
     builder.append("valueMarkdown" + "[" + String.valueOf(this.valueMarkdown) + "]\n"); 
     builder.append("_valueMarkdown" + "[" + String.valueOf(this._valueMarkdown) + "]\n"); 
     builder.append("valueElement" + "[" + String.valueOf(this.valueElement) + "]\n"); 
     builder.append("valueExtension" + "[" + String.valueOf(this.valueExtension) + "]\n"); 
     builder.append("valueBackboneElement" + "[" + String.valueOf(this.valueBackboneElement) + "]\n"); 
     builder.append("valueNarrative" + "[" + String.valueOf(this.valueNarrative) + "]\n"); 
     builder.append("valueAnnotation" + "[" + String.valueOf(this.valueAnnotation) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueIdentifier" + "[" + String.valueOf(this.valueIdentifier) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("valueCoding" + "[" + String.valueOf(this.valueCoding) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueDuration" + "[" + String.valueOf(this.valueDuration) + "]\n"); 
     builder.append("valueSimpleQuantity" + "[" + String.valueOf(this.valueSimpleQuantity) + "]\n"); 
     builder.append("valueDistance" + "[" + String.valueOf(this.valueDistance) + "]\n"); 
     builder.append("valueCount" + "[" + String.valueOf(this.valueCount) + "]\n"); 
     builder.append("valueMoney" + "[" + String.valueOf(this.valueMoney) + "]\n"); 
     builder.append("valueAge" + "[" + String.valueOf(this.valueAge) + "]\n"); 
     builder.append("valueRange" + "[" + String.valueOf(this.valueRange) + "]\n"); 
     builder.append("valuePeriod" + "[" + String.valueOf(this.valuePeriod) + "]\n"); 
     builder.append("valueRatio" + "[" + String.valueOf(this.valueRatio) + "]\n"); 
     builder.append("valueReference" + "[" + String.valueOf(this.valueReference) + "]\n"); 
     builder.append("valueSampledData" + "[" + String.valueOf(this.valueSampledData) + "]\n"); 
     builder.append("valueSignature" + "[" + String.valueOf(this.valueSignature) + "]\n"); 
     builder.append("valueHumanName" + "[" + String.valueOf(this.valueHumanName) + "]\n"); 
     builder.append("valueAddress" + "[" + String.valueOf(this.valueAddress) + "]\n"); 
     builder.append("valueContactPoint" + "[" + String.valueOf(this.valueContactPoint) + "]\n"); 
     builder.append("valueTiming" + "[" + String.valueOf(this.valueTiming) + "]\n"); 
     builder.append("valueMeta" + "[" + String.valueOf(this.valueMeta) + "]\n"); 
     builder.append("valueElementDefinition" + "[" + String.valueOf(this.valueElementDefinition) + "]\n"); 
     builder.append("valueContactDetail" + "[" + String.valueOf(this.valueContactDetail) + "]\n"); 
     builder.append("valueContributor" + "[" + String.valueOf(this.valueContributor) + "]\n"); 
     builder.append("valueDosage" + "[" + String.valueOf(this.valueDosage) + "]\n"); 
     builder.append("valueRelatedArtifact" + "[" + String.valueOf(this.valueRelatedArtifact) + "]\n"); 
     builder.append("valueUsageContext" + "[" + String.valueOf(this.valueUsageContext) + "]\n"); 
     builder.append("valueDataRequirement" + "[" + String.valueOf(this.valueDataRequirement) + "]\n"); 
     builder.append("valueParameterDefinition" + "[" + String.valueOf(this.valueParameterDefinition) + "]\n"); 
     builder.append("valueTriggerDefinition" + "[" + String.valueOf(this.valueTriggerDefinition) + "]\n"); 
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("part" + "[" + String.valueOf(this.part) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static ParametersParameter fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ParametersParameter.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ParametersParameter o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ParametersParameter> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

}