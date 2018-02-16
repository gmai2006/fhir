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
* "Optional Extension Element - found in all resources."
*/
public class Extension  extends Element  {
  /**
  * Description: "Source of the definition for the extension code - a logical name or a URL."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Boolean valueBoolean;

  /**
  * Description: "Extensions for valueBoolean"
  */
  protected transient Element _valueBoolean;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float valueInteger;

  /**
  * Description: "Extensions for valueInteger"
  */
  protected transient Element _valueInteger;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float valueDecimal;

  /**
  * Description: "Extensions for valueDecimal"
  */
  protected transient Element _valueDecimal;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected String valueBase64Binary;

  /**
  * Description: "Extensions for valueBase64Binary"
  */
  protected transient Element _valueBase64Binary;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected String valueInstant;

  /**
  * Description: "Extensions for valueInstant"
  */
  protected transient Element _valueInstant;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected String valueString;

  /**
  * Description: "Extensions for valueString"
  */
  protected transient Element _valueString;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected String valueUri;

  /**
  * Description: "Extensions for valueUri"
  */
  protected transient Element _valueUri;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String valueDate;

  /**
  * Description: "Extensions for valueDate"
  */
  protected transient Element _valueDate;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String valueDateTime;

  /**
  * Description: "Extensions for valueDateTime"
  */
  protected transient Element _valueDateTime;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  protected String valueTime;

  /**
  * Description: "Extensions for valueTime"
  */
  protected transient Element _valueTime;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String valueCode;

  /**
  * Description: "Extensions for valueCode"
  */
  protected transient Element _valueCode;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String valueOid;

  /**
  * Description: "Extensions for valueOid"
  */
  protected transient Element _valueOid;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
  protected String valueUuid;

  /**
  * Description: "Extensions for valueUuid"
  */
  protected transient Element _valueUuid;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String valueId;

  /**
  * Description: "Extensions for valueId"
  */
  protected transient Element _valueId;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float valueUnsignedInt;

  /**
  * Description: "Extensions for valueUnsignedInt"
  */
  protected transient Element _valueUnsignedInt;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float valuePositiveInt;

  /**
  * Description: "Extensions for valuePositiveInt"
  */
  protected transient Element _valuePositiveInt;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected String valueMarkdown;

  /**
  * Description: "Extensions for valueMarkdown"
  */
  protected transient Element _valueMarkdown;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Element valueElement;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Extension valueExtension;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected BackboneElement valueBackboneElement;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Narrative valueNarrative;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Annotation valueAnnotation;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Attachment valueAttachment;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Identifier valueIdentifier;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected CodeableConcept valueCodeableConcept;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Coding valueCoding;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Quantity valueQuantity;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Duration valueDuration;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Quantity valueSimpleQuantity;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Distance valueDistance;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Count valueCount;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Money valueMoney;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Age valueAge;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Range valueRange;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Period valuePeriod;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Ratio valueRatio;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Reference valueReference;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected SampledData valueSampledData;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Signature valueSignature;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected HumanName valueHumanName;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Address valueAddress;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected ContactPoint valueContactPoint;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Timing valueTiming;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Meta valueMeta;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected ElementDefinition valueElementDefinition;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected ContactDetail valueContactDetail;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Contributor valueContributor;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected Dosage valueDosage;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected RelatedArtifact valueRelatedArtifact;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected UsageContext valueUsageContext;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected DataRequirement valueDataRequirement;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected ParameterDefinition valueParameterDefinition;

  /**
  * Description: "Value of extension - may be a resource or one of a constrained set of the data types (see Extensibility in the spec for list)."
  */
  protected TriggerDefinition valueTriggerDefinition;

  public Extension() {}

  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Extension]:" + "\n");
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
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
     if(this.valueTriggerDefinition != null) builder.append("valueTriggerDefinition" + "->" + this.valueTriggerDefinition.toString() + "\n"); ;
    return builder.toString();
  }

}