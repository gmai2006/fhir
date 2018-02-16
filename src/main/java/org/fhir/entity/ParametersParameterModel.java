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
* "This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it."
*/
@Entity
@Table(name="parametersparameter")
public class ParametersParameterModel  implements Serializable {
	private static final long serialVersionUID = 151873631145688162L;
  /**
  * Description: "The name of the parameter (reference to the operation definition)."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueBoolean\"")
  private Boolean valueBoolean;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"valueInteger\"")
  private Float valueInteger;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueDecimal\"")
  private Float valueDecimal;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueBase64Binary\"")
  private String valueBase64Binary;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueInstant\"")
  private String valueInstant;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueString\"")
  private String valueString;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueUri\"")
  private String valueUri;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDate\"")
  private String valueDate;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDateTime\"")
  private String valueDateTime;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueTime\"")
  private String valueTime;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"valueCode\"")
  private String valueCode;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  @javax.persistence.Basic
  @Column(name="\"valueOid\"")
  private String valueOid;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
  @javax.persistence.Basic
  @Column(name="\"valueUuid\"")
  private String valueUuid;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"valueId\"")
  private String valueId;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"valueUnsignedInt\"")
  private Float valueUnsignedInt;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"valuePositiveInt\"")
  private Float valuePositiveInt;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueMarkdown\"")
  private String valueMarkdown;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueElement\"", length = 16777215)
  private String valueElement;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueExtension\"", length = 16777215)
  private String valueExtension;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueBackboneElement\"", length = 16777215)
  private String valueBackboneElement;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuenarrative_id\"")
  private String valuenarrative_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuenarrative_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> valueNarrative;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAnnotation\"", length = 16777215)
  private String valueAnnotation;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAttachment\"", length = 16777215)
  private String valueAttachment;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueIdentifier\"", length = 16777215)
  private String valueIdentifier;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCodeableConcept\"", length = 16777215)
  private String valueCodeableConcept;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCoding\"", length = 16777215)
  private String valueCoding;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuequantity_id\"")
  private String valuequantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuequantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> valueQuantity;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueDuration\"", length = 16777215)
  private String valueDuration;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuesimplequantity_id\"")
  private String valuesimplequantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuesimplequantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> valueSimpleQuantity;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuedistance_id\"")
  private String valuedistance_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuedistance_id", insertable=false, updatable=false)
  private java.util.List<DistanceModel> valueDistance;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCount\"", length = 16777215)
  private String valueCount;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuemoney_id\"")
  private String valuemoney_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuemoney_id", insertable=false, updatable=false)
  private java.util.List<MoneyModel> valueMoney;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAge\"", length = 16777215)
  private String valueAge;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRange\"", length = 16777215)
  private String valueRange;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valuePeriod\"", length = 16777215)
  private String valuePeriod;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRatio\"", length = 16777215)
  private String valueRatio;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuereference_id\"")
  private String valuereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> valueReference;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSampledData\"", length = 16777215)
  private String valueSampledData;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSignature\"", length = 16777215)
  private String valueSignature;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueHumanName\"", length = 16777215)
  private String valueHumanName;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueaddress_id\"")
  private String valueaddress_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valueaddress_id", insertable=false, updatable=false)
  private java.util.List<AddressModel> valueAddress;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueContactPoint\"", length = 16777215)
  private String valueContactPoint;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueTiming\"", length = 16777215)
  private String valueTiming;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuemeta_id\"")
  private String valuemeta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuemeta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> valueMeta;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueElementDefinition\"", length = 16777215)
  private String valueElementDefinition;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecontactdetail_id\"")
  private String valuecontactdetail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuecontactdetail_id", insertable=false, updatable=false)
  private java.util.List<ContactDetailModel> valueContactDetail;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecontributor_id\"")
  private String valuecontributor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuecontributor_id", insertable=false, updatable=false)
  private java.util.List<ContributorModel> valueContributor;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuedosage_id\"")
  private String valuedosage_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuedosage_id", insertable=false, updatable=false)
  private java.util.List<DosageModel> valueDosage;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuerelatedartifact_id\"")
  private String valuerelatedartifact_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuerelatedartifact_id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> valueRelatedArtifact;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueusagecontext_id\"")
  private String valueusagecontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valueusagecontext_id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> valueUsageContext;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuedatarequirement_id\"")
  private String valuedatarequirement_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuedatarequirement_id", insertable=false, updatable=false)
  private java.util.List<DataRequirementModel> valueDataRequirement;

  /**
  * Description: "If the parameter is a data type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueParameterDefinition\"", length = 16777215)
  private String valueParameterDefinition;

  /**
  * Description: "If the parameter is a data type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuetriggerdefinition_id\"")
  private String valuetriggerdefinition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuetriggerdefinition_id", insertable=false, updatable=false)
  private java.util.List<TriggerDefinitionModel> valueTriggerDefinition;

  /**
  * Description: "If the parameter is a whole resource."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"resource\"", length = 16777215)
  private String resource;

  /**
  * Description: "A named part of a multi-part parameter."
  */
  @javax.persistence.Basic
  @Column(name="\"part_id\"")
  private String part_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="part_id", insertable=false, updatable=false)
  private java.util.List<ParametersParameterModel> part;

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

  public ParametersParameterModel() {
  }

  public ParametersParameterModel(ParametersParameter o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.name = o.getName();
    this.valueBoolean = o.getValueBoolean();
    this.valueInteger = o.getValueInteger();
    this.valueDecimal = o.getValueDecimal();
    this.valueBase64Binary = o.getValueBase64Binary();
    this.valueInstant = o.getValueInstant();
    this.valueString = o.getValueString();
    this.valueUri = o.getValueUri();
    this.valueDate = o.getValueDate();
    this.valueDateTime = o.getValueDateTime();
    this.valueTime = o.getValueTime();
    this.valueCode = o.getValueCode();
    this.valueOid = o.getValueOid();
    this.valueUuid = o.getValueUuid();
    this.valueId = o.getValueId();
    this.valueUnsignedInt = o.getValueUnsignedInt();
    this.valuePositiveInt = o.getValuePositiveInt();
    this.valueMarkdown = o.getValueMarkdown();
    this.valueElement = JsonUtils.toJson(o.getValueElement());
    this.valueExtension = JsonUtils.toJson(o.getValueExtension());
    this.valueBackboneElement = JsonUtils.toJson(o.getValueBackboneElement());
    if (null != o.getValueNarrative() ) {
    	this.valuenarrative_id = "valuenarrative" + this.parent_id;
    	this.valueNarrative = NarrativeHelper.toModel(o.getValueNarrative(), this.valuenarrative_id);
    }
    this.valueAnnotation = JsonUtils.toJson(o.getValueAnnotation());
    this.valueAttachment = JsonUtils.toJson(o.getValueAttachment());
    this.valueIdentifier = JsonUtils.toJson(o.getValueIdentifier());
    this.valueCodeableConcept = JsonUtils.toJson(o.getValueCodeableConcept());
    this.valueCoding = JsonUtils.toJson(o.getValueCoding());
    if (null != o.getValueQuantity() ) {
    	this.valuequantity_id = "valuequantity" + this.parent_id;
    	this.valueQuantity = QuantityHelper.toModel(o.getValueQuantity(), this.valuequantity_id);
    }
    this.valueDuration = JsonUtils.toJson(o.getValueDuration());
    if (null != o.getValueSimpleQuantity() ) {
    	this.valuesimplequantity_id = "valuesimplequantity" + this.parent_id;
    	this.valueSimpleQuantity = QuantityHelper.toModel(o.getValueSimpleQuantity(), this.valuesimplequantity_id);
    }
    if (null != o.getValueDistance() ) {
    	this.valuedistance_id = "valuedistance" + this.parent_id;
    	this.valueDistance = DistanceHelper.toModel(o.getValueDistance(), this.valuedistance_id);
    }
    this.valueCount = JsonUtils.toJson(o.getValueCount());
    if (null != o.getValueMoney() ) {
    	this.valuemoney_id = "valuemoney" + this.parent_id;
    	this.valueMoney = MoneyHelper.toModel(o.getValueMoney(), this.valuemoney_id);
    }
    this.valueAge = JsonUtils.toJson(o.getValueAge());
    this.valueRange = JsonUtils.toJson(o.getValueRange());
    this.valuePeriod = JsonUtils.toJson(o.getValuePeriod());
    this.valueRatio = JsonUtils.toJson(o.getValueRatio());
    if (null != o.getValueReference() ) {
    	this.valuereference_id = "valuereference" + this.parent_id;
    	this.valueReference = ReferenceHelper.toModel(o.getValueReference(), this.valuereference_id);
    }
    this.valueSampledData = JsonUtils.toJson(o.getValueSampledData());
    this.valueSignature = JsonUtils.toJson(o.getValueSignature());
    this.valueHumanName = JsonUtils.toJson(o.getValueHumanName());
    if (null != o.getValueAddress() ) {
    	this.valueaddress_id = "valueaddress" + this.parent_id;
    	this.valueAddress = AddressHelper.toModel(o.getValueAddress(), this.valueaddress_id);
    }
    this.valueContactPoint = JsonUtils.toJson(o.getValueContactPoint());
    this.valueTiming = JsonUtils.toJson(o.getValueTiming());
    if (null != o.getValueMeta() ) {
    	this.valuemeta_id = "valuemeta" + this.parent_id;
    	this.valueMeta = MetaHelper.toModel(o.getValueMeta(), this.valuemeta_id);
    }
    this.valueElementDefinition = JsonUtils.toJson(o.getValueElementDefinition());
    if (null != o.getValueContactDetail() ) {
    	this.valuecontactdetail_id = "valuecontactdetail" + this.parent_id;
    	this.valueContactDetail = ContactDetailHelper.toModel(o.getValueContactDetail(), this.valuecontactdetail_id);
    }
    if (null != o.getValueContributor() ) {
    	this.valuecontributor_id = "valuecontributor" + this.parent_id;
    	this.valueContributor = ContributorHelper.toModel(o.getValueContributor(), this.valuecontributor_id);
    }
    if (null != o.getValueDosage() ) {
    	this.valuedosage_id = "valuedosage" + this.parent_id;
    	this.valueDosage = DosageHelper.toModel(o.getValueDosage(), this.valuedosage_id);
    }
    if (null != o.getValueRelatedArtifact() ) {
    	this.valuerelatedartifact_id = "valuerelatedartifact" + this.parent_id;
    	this.valueRelatedArtifact = RelatedArtifactHelper.toModel(o.getValueRelatedArtifact(), this.valuerelatedartifact_id);
    }
    if (null != o.getValueUsageContext() ) {
    	this.valueusagecontext_id = "valueusagecontext" + this.parent_id;
    	this.valueUsageContext = UsageContextHelper.toModel(o.getValueUsageContext(), this.valueusagecontext_id);
    }
    if (null != o.getValueDataRequirement() ) {
    	this.valuedatarequirement_id = "valuedatarequirement" + this.parent_id;
    	this.valueDataRequirement = DataRequirementHelper.toModel(o.getValueDataRequirement(), this.valuedatarequirement_id);
    }
    this.valueParameterDefinition = JsonUtils.toJson(o.getValueParameterDefinition());
    if (null != o.getValueTriggerDefinition() ) {
    	this.valuetriggerdefinition_id = "valuetriggerdefinition" + this.parent_id;
    	this.valueTriggerDefinition = TriggerDefinitionHelper.toModel(o.getValueTriggerDefinition(), this.valuetriggerdefinition_id);
    }
    this.resource = JsonUtils.toJson(o.getResource());
    if (null != o.getPart() && !o.getPart().isEmpty()) {
    	this.part_id = "part" + this.parent_id;
    	this.part = ParametersParameterHelper.toModelFromArray(o.getPart(), this.part_id);
    }
  }

  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public Float getValueInteger() {
    return this.valueInteger;
  }
  public void setValueInteger( Float value) {
    this.valueInteger = value;
  }
  public Float getValueDecimal() {
    return this.valueDecimal;
  }
  public void setValueDecimal( Float value) {
    this.valueDecimal = value;
  }
  public String getValueBase64Binary() {
    return this.valueBase64Binary;
  }
  public void setValueBase64Binary( String value) {
    this.valueBase64Binary = value;
  }
  public String getValueInstant() {
    return this.valueInstant;
  }
  public void setValueInstant( String value) {
    this.valueInstant = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueUri() {
    return this.valueUri;
  }
  public void setValueUri( String value) {
    this.valueUri = value;
  }
  public String getValueDate() {
    return this.valueDate;
  }
  public void setValueDate( String value) {
    this.valueDate = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueCode() {
    return this.valueCode;
  }
  public void setValueCode( String value) {
    this.valueCode = value;
  }
  public String getValueOid() {
    return this.valueOid;
  }
  public void setValueOid( String value) {
    this.valueOid = value;
  }
  public String getValueUuid() {
    return this.valueUuid;
  }
  public void setValueUuid( String value) {
    this.valueUuid = value;
  }
  public String getValueId() {
    return this.valueId;
  }
  public void setValueId( String value) {
    this.valueId = value;
  }
  public Float getValueUnsignedInt() {
    return this.valueUnsignedInt;
  }
  public void setValueUnsignedInt( Float value) {
    this.valueUnsignedInt = value;
  }
  public Float getValuePositiveInt() {
    return this.valuePositiveInt;
  }
  public void setValuePositiveInt( Float value) {
    this.valuePositiveInt = value;
  }
  public String getValueMarkdown() {
    return this.valueMarkdown;
  }
  public void setValueMarkdown( String value) {
    this.valueMarkdown = value;
  }
  public String getValueElement() {
    return this.valueElement;
  }
  public void setValueElement( String value) {
    this.valueElement = value;
  }
  public String getValueExtension() {
    return this.valueExtension;
  }
  public void setValueExtension( String value) {
    this.valueExtension = value;
  }
  public String getValueBackboneElement() {
    return this.valueBackboneElement;
  }
  public void setValueBackboneElement( String value) {
    this.valueBackboneElement = value;
  }
  public java.util.List<NarrativeModel> getValueNarrative() {
    return this.valueNarrative;
  }
  public void setValueNarrative( java.util.List<NarrativeModel> value) {
    this.valueNarrative = value;
  }
  public String getValueAnnotation() {
    return this.valueAnnotation;
  }
  public void setValueAnnotation( String value) {
    this.valueAnnotation = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public String getValueIdentifier() {
    return this.valueIdentifier;
  }
  public void setValueIdentifier( String value) {
    this.valueIdentifier = value;
  }
  public String getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCodeableConcept( String value) {
    this.valueCodeableConcept = value;
  }
  public String getValueCoding() {
    return this.valueCoding;
  }
  public void setValueCoding( String value) {
    this.valueCoding = value;
  }
  public java.util.List<QuantityModel> getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueQuantity( java.util.List<QuantityModel> value) {
    this.valueQuantity = value;
  }
  public String getValueDuration() {
    return this.valueDuration;
  }
  public void setValueDuration( String value) {
    this.valueDuration = value;
  }
  public java.util.List<QuantityModel> getValueSimpleQuantity() {
    return this.valueSimpleQuantity;
  }
  public void setValueSimpleQuantity( java.util.List<QuantityModel> value) {
    this.valueSimpleQuantity = value;
  }
  public java.util.List<DistanceModel> getValueDistance() {
    return this.valueDistance;
  }
  public void setValueDistance( java.util.List<DistanceModel> value) {
    this.valueDistance = value;
  }
  public String getValueCount() {
    return this.valueCount;
  }
  public void setValueCount( String value) {
    this.valueCount = value;
  }
  public java.util.List<MoneyModel> getValueMoney() {
    return this.valueMoney;
  }
  public void setValueMoney( java.util.List<MoneyModel> value) {
    this.valueMoney = value;
  }
  public String getValueAge() {
    return this.valueAge;
  }
  public void setValueAge( String value) {
    this.valueAge = value;
  }
  public String getValueRange() {
    return this.valueRange;
  }
  public void setValueRange( String value) {
    this.valueRange = value;
  }
  public String getValuePeriod() {
    return this.valuePeriod;
  }
  public void setValuePeriod( String value) {
    this.valuePeriod = value;
  }
  public String getValueRatio() {
    return this.valueRatio;
  }
  public void setValueRatio( String value) {
    this.valueRatio = value;
  }
  public java.util.List<ReferenceModel> getValueReference() {
    return this.valueReference;
  }
  public void setValueReference( java.util.List<ReferenceModel> value) {
    this.valueReference = value;
  }
  public String getValueSampledData() {
    return this.valueSampledData;
  }
  public void setValueSampledData( String value) {
    this.valueSampledData = value;
  }
  public String getValueSignature() {
    return this.valueSignature;
  }
  public void setValueSignature( String value) {
    this.valueSignature = value;
  }
  public String getValueHumanName() {
    return this.valueHumanName;
  }
  public void setValueHumanName( String value) {
    this.valueHumanName = value;
  }
  public java.util.List<AddressModel> getValueAddress() {
    return this.valueAddress;
  }
  public void setValueAddress( java.util.List<AddressModel> value) {
    this.valueAddress = value;
  }
  public String getValueContactPoint() {
    return this.valueContactPoint;
  }
  public void setValueContactPoint( String value) {
    this.valueContactPoint = value;
  }
  public String getValueTiming() {
    return this.valueTiming;
  }
  public void setValueTiming( String value) {
    this.valueTiming = value;
  }
  public java.util.List<MetaModel> getValueMeta() {
    return this.valueMeta;
  }
  public void setValueMeta( java.util.List<MetaModel> value) {
    this.valueMeta = value;
  }
  public String getValueElementDefinition() {
    return this.valueElementDefinition;
  }
  public void setValueElementDefinition( String value) {
    this.valueElementDefinition = value;
  }
  public java.util.List<ContactDetailModel> getValueContactDetail() {
    return this.valueContactDetail;
  }
  public void setValueContactDetail( java.util.List<ContactDetailModel> value) {
    this.valueContactDetail = value;
  }
  public java.util.List<ContributorModel> getValueContributor() {
    return this.valueContributor;
  }
  public void setValueContributor( java.util.List<ContributorModel> value) {
    this.valueContributor = value;
  }
  public java.util.List<DosageModel> getValueDosage() {
    return this.valueDosage;
  }
  public void setValueDosage( java.util.List<DosageModel> value) {
    this.valueDosage = value;
  }
  public java.util.List<RelatedArtifactModel> getValueRelatedArtifact() {
    return this.valueRelatedArtifact;
  }
  public void setValueRelatedArtifact( java.util.List<RelatedArtifactModel> value) {
    this.valueRelatedArtifact = value;
  }
  public java.util.List<UsageContextModel> getValueUsageContext() {
    return this.valueUsageContext;
  }
  public void setValueUsageContext( java.util.List<UsageContextModel> value) {
    this.valueUsageContext = value;
  }
  public java.util.List<DataRequirementModel> getValueDataRequirement() {
    return this.valueDataRequirement;
  }
  public void setValueDataRequirement( java.util.List<DataRequirementModel> value) {
    this.valueDataRequirement = value;
  }
  public String getValueParameterDefinition() {
    return this.valueParameterDefinition;
  }
  public void setValueParameterDefinition( String value) {
    this.valueParameterDefinition = value;
  }
  public java.util.List<TriggerDefinitionModel> getValueTriggerDefinition() {
    return this.valueTriggerDefinition;
  }
  public void setValueTriggerDefinition( java.util.List<TriggerDefinitionModel> value) {
    this.valueTriggerDefinition = value;
  }
  public String getResource() {
    return this.resource;
  }
  public void setResource( String value) {
    this.resource = value;
  }
  public java.util.List<ParametersParameterModel> getPart() {
    return this.part;
  }
  public void setPart( java.util.List<ParametersParameterModel> value) {
    this.part = value;
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
    builder.append("[ParametersParameterModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueInteger" + "->" + this.valueInteger + "\n"); 
     builder.append("valueDecimal" + "->" + this.valueDecimal + "\n"); 
     builder.append("valueBase64Binary" + "->" + this.valueBase64Binary + "\n"); 
     builder.append("valueInstant" + "->" + this.valueInstant + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueUri" + "->" + this.valueUri + "\n"); 
     builder.append("valueDate" + "->" + this.valueDate + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueCode" + "->" + this.valueCode + "\n"); 
     builder.append("valueOid" + "->" + this.valueOid + "\n"); 
     builder.append("valueUuid" + "->" + this.valueUuid + "\n"); 
     builder.append("valueId" + "->" + this.valueId + "\n"); 
     builder.append("valueUnsignedInt" + "->" + this.valueUnsignedInt + "\n"); 
     builder.append("valuePositiveInt" + "->" + this.valuePositiveInt + "\n"); 
     builder.append("valueMarkdown" + "->" + this.valueMarkdown + "\n"); 
     builder.append("valueElement" + "->" + this.valueElement + "\n"); 
     builder.append("valueExtension" + "->" + this.valueExtension + "\n"); 
     builder.append("valueBackboneElement" + "->" + this.valueBackboneElement + "\n"); 
     builder.append("valueAnnotation" + "->" + this.valueAnnotation + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueIdentifier" + "->" + this.valueIdentifier + "\n"); 
     builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept + "\n"); 
     builder.append("valueCoding" + "->" + this.valueCoding + "\n"); 
     builder.append("valueDuration" + "->" + this.valueDuration + "\n"); 
     builder.append("valueCount" + "->" + this.valueCount + "\n"); 
     builder.append("valueAge" + "->" + this.valueAge + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("valuePeriod" + "->" + this.valuePeriod + "\n"); 
     builder.append("valueRatio" + "->" + this.valueRatio + "\n"); 
     builder.append("valueSampledData" + "->" + this.valueSampledData + "\n"); 
     builder.append("valueSignature" + "->" + this.valueSignature + "\n"); 
     builder.append("valueHumanName" + "->" + this.valueHumanName + "\n"); 
     builder.append("valueContactPoint" + "->" + this.valueContactPoint + "\n"); 
     builder.append("valueTiming" + "->" + this.valueTiming + "\n"); 
     builder.append("valueElementDefinition" + "->" + this.valueElementDefinition + "\n"); 
     builder.append("valueParameterDefinition" + "->" + this.valueParameterDefinition + "\n"); 
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ParametersParameterModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("valueBoolean" + "->" + this.valueBoolean + "\n"); 
     builder.append("valueInteger" + "->" + this.valueInteger + "\n"); 
     builder.append("valueDecimal" + "->" + this.valueDecimal + "\n"); 
     builder.append("valueBase64Binary" + "->" + this.valueBase64Binary + "\n"); 
     builder.append("valueInstant" + "->" + this.valueInstant + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueUri" + "->" + this.valueUri + "\n"); 
     builder.append("valueDate" + "->" + this.valueDate + "\n"); 
     builder.append("valueDateTime" + "->" + this.valueDateTime + "\n"); 
     builder.append("valueTime" + "->" + this.valueTime + "\n"); 
     builder.append("valueCode" + "->" + this.valueCode + "\n"); 
     builder.append("valueOid" + "->" + this.valueOid + "\n"); 
     builder.append("valueUuid" + "->" + this.valueUuid + "\n"); 
     builder.append("valueId" + "->" + this.valueId + "\n"); 
     builder.append("valueUnsignedInt" + "->" + this.valueUnsignedInt + "\n"); 
     builder.append("valuePositiveInt" + "->" + this.valuePositiveInt + "\n"); 
     builder.append("valueMarkdown" + "->" + this.valueMarkdown + "\n"); 
     builder.append("valueElement" + "->" + this.valueElement + "\n"); 
     builder.append("valueExtension" + "->" + this.valueExtension + "\n"); 
     builder.append("valueBackboneElement" + "->" + this.valueBackboneElement + "\n"); 
     builder.append("valueNarrative" + "->" + this.valueNarrative + "\n"); 
     builder.append("valueAnnotation" + "->" + this.valueAnnotation + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueIdentifier" + "->" + this.valueIdentifier + "\n"); 
     builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept + "\n"); 
     builder.append("valueCoding" + "->" + this.valueCoding + "\n"); 
     builder.append("valueQuantity" + "->" + this.valueQuantity + "\n"); 
     builder.append("valueDuration" + "->" + this.valueDuration + "\n"); 
     builder.append("valueSimpleQuantity" + "->" + this.valueSimpleQuantity + "\n"); 
     builder.append("valueDistance" + "->" + this.valueDistance + "\n"); 
     builder.append("valueCount" + "->" + this.valueCount + "\n"); 
     builder.append("valueMoney" + "->" + this.valueMoney + "\n"); 
     builder.append("valueAge" + "->" + this.valueAge + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("valuePeriod" + "->" + this.valuePeriod + "\n"); 
     builder.append("valueRatio" + "->" + this.valueRatio + "\n"); 
     builder.append("valueReference" + "->" + this.valueReference + "\n"); 
     builder.append("valueSampledData" + "->" + this.valueSampledData + "\n"); 
     builder.append("valueSignature" + "->" + this.valueSignature + "\n"); 
     builder.append("valueHumanName" + "->" + this.valueHumanName + "\n"); 
     builder.append("valueAddress" + "->" + this.valueAddress + "\n"); 
     builder.append("valueContactPoint" + "->" + this.valueContactPoint + "\n"); 
     builder.append("valueTiming" + "->" + this.valueTiming + "\n"); 
     builder.append("valueMeta" + "->" + this.valueMeta + "\n"); 
     builder.append("valueElementDefinition" + "->" + this.valueElementDefinition + "\n"); 
     builder.append("valueContactDetail" + "->" + this.valueContactDetail + "\n"); 
     builder.append("valueContributor" + "->" + this.valueContributor + "\n"); 
     builder.append("valueDosage" + "->" + this.valueDosage + "\n"); 
     builder.append("valueRelatedArtifact" + "->" + this.valueRelatedArtifact + "\n"); 
     builder.append("valueUsageContext" + "->" + this.valueUsageContext + "\n"); 
     builder.append("valueDataRequirement" + "->" + this.valueDataRequirement + "\n"); 
     builder.append("valueParameterDefinition" + "->" + this.valueParameterDefinition + "\n"); 
     builder.append("valueTriggerDefinition" + "->" + this.valueTriggerDefinition + "\n"); 
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("part" + "->" + this.part + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}