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
* "A task to be performed."
*/
@Entity
@Table(name="taskoutput")
public class TaskOutputModel  {
  /**
  * Description: "The name of the Output parameter."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueBoolean\"")
  private Boolean valueBoolean;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"valueInteger\"")
  private Float valueInteger;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueDecimal\"")
  private Float valueDecimal;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueBase64Binary\"")
  private String valueBase64Binary;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueInstant\"")
  private String valueInstant;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueString\"")
  private String valueString;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueUri\"")
  private String valueUri;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDate\"")
  private String valueDate;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"valueDateTime\"")
  private String valueDateTime;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"valueTime\"")
  private String valueTime;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"valueCode\"")
  private String valueCode;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  @javax.persistence.Basic
  @Column(name="\"valueOid\"")
  private String valueOid;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
  @javax.persistence.Basic
  @Column(name="\"valueUuid\"")
  private String valueUuid;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"valueId\"")
  private String valueId;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"valueUnsignedInt\"")
  private Float valueUnsignedInt;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"valuePositiveInt\"")
  private Float valuePositiveInt;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueMarkdown\"")
  private String valueMarkdown;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Element
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueElement\"", length = 16777215)
  private String valueElement;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Extension
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueExtension\"", length = 16777215)
  private String valueExtension;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: BackboneElement
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueBackboneElement\"", length = 16777215)
  private String valueBackboneElement;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuenarrative_id\"")
  private String valuenarrative_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuenarrative_id`", insertable=false, updatable=false)
  private NarrativeModel valueNarrative;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Annotation
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAnnotation\"", length = 16777215)
  private String valueAnnotation;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Attachment
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAttachment\"", length = 16777215)
  private String valueAttachment;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueIdentifier\"", length = 16777215)
  private String valueIdentifier;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCodeableConcept\"", length = 16777215)
  private String valueCodeableConcept;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCoding\"", length = 16777215)
  private String valueCoding;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueQuantity\"", length = 16777215)
  private String valueQuantity;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Duration
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueDuration\"", length = 16777215)
  private String valueDuration;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSimpleQuantity\"", length = 16777215)
  private String valueSimpleQuantity;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuedistance_id\"")
  private String valuedistance_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuedistance_id`", insertable=false, updatable=false)
  private DistanceModel valueDistance;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Count
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueCount\"", length = 16777215)
  private String valueCount;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Money
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueMoney\"", length = 16777215)
  private String valueMoney;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Age
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAge\"", length = 16777215)
  private String valueAge;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Range
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRange\"", length = 16777215)
  private String valueRange;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valuePeriod\"", length = 16777215)
  private String valuePeriod;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Ratio
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRatio\"", length = 16777215)
  private String valueRatio;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuereference_id\"")
  private String valuereference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuereference_id`", insertable=false, updatable=false)
  private ReferenceModel valueReference;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: SampledData
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSampledData\"", length = 16777215)
  private String valueSampledData;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Signature
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueSignature\"", length = 16777215)
  private String valueSignature;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: HumanName
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueHumanName\"", length = 16777215)
  private String valueHumanName;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Address
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAddress\"", length = 16777215)
  private String valueAddress;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: ContactPoint
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueContactPoint\"", length = 16777215)
  private String valueContactPoint;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: Timing
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueTiming\"", length = 16777215)
  private String valueTiming;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuemeta_id\"")
  private String valuemeta_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuemeta_id`", insertable=false, updatable=false)
  private MetaModel valueMeta;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: ElementDefinition
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueElementDefinition\"", length = 16777215)
  private String valueElementDefinition;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecontactdetail_id\"")
  private String valuecontactdetail_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuecontactdetail_id`", insertable=false, updatable=false)
  private ContactDetailModel valueContactDetail;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecontributor_id\"")
  private String valuecontributor_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuecontributor_id`", insertable=false, updatable=false)
  private ContributorModel valueContributor;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuedosage_id\"")
  private String valuedosage_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuedosage_id`", insertable=false, updatable=false)
  private DosageModel valueDosage;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuerelatedartifact_id\"")
  private String valuerelatedartifact_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuerelatedartifact_id`", insertable=false, updatable=false)
  private RelatedArtifactModel valueRelatedArtifact;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valueusagecontext_id\"")
  private String valueusagecontext_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valueusagecontext_id`", insertable=false, updatable=false)
  private UsageContextModel valueUsageContext;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuedatarequirement_id\"")
  private String valuedatarequirement_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuedatarequirement_id`", insertable=false, updatable=false)
  private DataRequirementModel valueDataRequirement;

  /**
  * Description: "The value of the Output parameter as a basic type."
  * Actual type: ParameterDefinition
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueParameterDefinition\"", length = 16777215)
  private String valueParameterDefinition;

  /**
  * Description: "The value of the Output parameter as a basic type."
  */
  @javax.persistence.Basic
  @Column(name="\"valuetriggerdefinition_id\"")
  private String valuetriggerdefinition_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuetriggerdefinition_id`", insertable=false, updatable=false)
  private TriggerDefinitionModel valueTriggerDefinition;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public TaskOutputModel() {
  }

  public TaskOutputModel(TaskOutput o) {
    this.id = o.getId();
      this.type = CodeableConcept.toJson(o.getType());
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

      this.valueElement = Element.toJson(o.getValueElement());
      this.valueExtension = Extension.toJson(o.getValueExtension());
      this.valueBackboneElement = BackboneElement.toJson(o.getValueBackboneElement());
      if (null != o.getValueNarrative()) {
      	this.valuenarrative_id = "valueNarrative" + this.getId();
        this.valueNarrative = new NarrativeModel(o.getValueNarrative());
        this.valueNarrative.setId(this.valuenarrative_id);
        this.valueNarrative.parent_id = this.valueNarrative.getId();
      }

      this.valueAnnotation = Annotation.toJson(o.getValueAnnotation());
      this.valueAttachment = Attachment.toJson(o.getValueAttachment());
      this.valueIdentifier = Identifier.toJson(o.getValueIdentifier());
      this.valueCodeableConcept = CodeableConcept.toJson(o.getValueCodeableConcept());
      this.valueCoding = Coding.toJson(o.getValueCoding());
      this.valueQuantity = Quantity.toJson(o.getValueQuantity());
      this.valueDuration = Duration.toJson(o.getValueDuration());
      this.valueSimpleQuantity = Quantity.toJson(o.getValueSimpleQuantity());
      if (null != o.getValueDistance()) {
      	this.valuedistance_id = "valueDistance" + this.getId();
        this.valueDistance = new DistanceModel(o.getValueDistance());
        this.valueDistance.setId(this.valuedistance_id);
        this.valueDistance.parent_id = this.valueDistance.getId();
      }

      this.valueCount = Count.toJson(o.getValueCount());
      this.valueMoney = Money.toJson(o.getValueMoney());
      this.valueAge = Age.toJson(o.getValueAge());
      this.valueRange = Range.toJson(o.getValueRange());
      this.valuePeriod = Period.toJson(o.getValuePeriod());
      this.valueRatio = Ratio.toJson(o.getValueRatio());
      if (null != o.getValueReference()) {
      	this.valuereference_id = "valueReference" + this.getId();
        this.valueReference = new ReferenceModel(o.getValueReference());
        this.valueReference.setId(this.valuereference_id);
        this.valueReference.parent_id = this.valueReference.getId();
      }

      this.valueSampledData = SampledData.toJson(o.getValueSampledData());
      this.valueSignature = Signature.toJson(o.getValueSignature());
      this.valueHumanName = HumanName.toJson(o.getValueHumanName());
      this.valueAddress = Address.toJson(o.getValueAddress());
      this.valueContactPoint = ContactPoint.toJson(o.getValueContactPoint());
      this.valueTiming = Timing.toJson(o.getValueTiming());
      if (null != o.getValueMeta()) {
      	this.valuemeta_id = "valueMeta" + this.getId();
        this.valueMeta = new MetaModel(o.getValueMeta());
        this.valueMeta.setId(this.valuemeta_id);
        this.valueMeta.parent_id = this.valueMeta.getId();
      }

      this.valueElementDefinition = ElementDefinition.toJson(o.getValueElementDefinition());
      if (null != o.getValueContactDetail()) {
      	this.valuecontactdetail_id = "valueContactDetail" + this.getId();
        this.valueContactDetail = new ContactDetailModel(o.getValueContactDetail());
        this.valueContactDetail.setId(this.valuecontactdetail_id);
        this.valueContactDetail.parent_id = this.valueContactDetail.getId();
      }

      if (null != o.getValueContributor()) {
      	this.valuecontributor_id = "valueContributor" + this.getId();
        this.valueContributor = new ContributorModel(o.getValueContributor());
        this.valueContributor.setId(this.valuecontributor_id);
        this.valueContributor.parent_id = this.valueContributor.getId();
      }

      if (null != o.getValueDosage()) {
      	this.valuedosage_id = "valueDosage" + this.getId();
        this.valueDosage = new DosageModel(o.getValueDosage());
        this.valueDosage.setId(this.valuedosage_id);
        this.valueDosage.parent_id = this.valueDosage.getId();
      }

      if (null != o.getValueRelatedArtifact()) {
      	this.valuerelatedartifact_id = "valueRelatedArtifact" + this.getId();
        this.valueRelatedArtifact = new RelatedArtifactModel(o.getValueRelatedArtifact());
        this.valueRelatedArtifact.setId(this.valuerelatedartifact_id);
        this.valueRelatedArtifact.parent_id = this.valueRelatedArtifact.getId();
      }

      if (null != o.getValueUsageContext()) {
      	this.valueusagecontext_id = "valueUsageContext" + this.getId();
        this.valueUsageContext = new UsageContextModel(o.getValueUsageContext());
        this.valueUsageContext.setId(this.valueusagecontext_id);
        this.valueUsageContext.parent_id = this.valueUsageContext.getId();
      }

      if (null != o.getValueDataRequirement()) {
      	this.valuedatarequirement_id = "valueDataRequirement" + this.getId();
        this.valueDataRequirement = new DataRequirementModel(o.getValueDataRequirement());
        this.valueDataRequirement.setId(this.valuedatarequirement_id);
        this.valueDataRequirement.parent_id = this.valueDataRequirement.getId();
      }

      this.valueParameterDefinition = ParameterDefinition.toJson(o.getValueParameterDefinition());
      if (null != o.getValueTriggerDefinition()) {
      	this.valuetriggerdefinition_id = "valueTriggerDefinition" + this.getId();
        this.valueTriggerDefinition = new TriggerDefinitionModel(o.getValueTriggerDefinition());
        this.valueTriggerDefinition.setId(this.valuetriggerdefinition_id);
        this.valueTriggerDefinition.parent_id = this.valueTriggerDefinition.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setValueBoolean( Boolean value) {
    this.valueBoolean = value;
  }
  public Boolean getValueBoolean() {
    return this.valueBoolean;
  }
  public void setValueInteger( Float value) {
    this.valueInteger = value;
  }
  public Float getValueInteger() {
    return this.valueInteger;
  }
  public void setValueDecimal( Float value) {
    this.valueDecimal = value;
  }
  public Float getValueDecimal() {
    return this.valueDecimal;
  }
  public void setValueBase64Binary( String value) {
    this.valueBase64Binary = value;
  }
  public String getValueBase64Binary() {
    return this.valueBase64Binary;
  }
  public void setValueInstant( String value) {
    this.valueInstant = value;
  }
  public String getValueInstant() {
    return this.valueInstant;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueUri( String value) {
    this.valueUri = value;
  }
  public String getValueUri() {
    return this.valueUri;
  }
  public void setValueDate( String value) {
    this.valueDate = value;
  }
  public String getValueDate() {
    return this.valueDate;
  }
  public void setValueDateTime( String value) {
    this.valueDateTime = value;
  }
  public String getValueDateTime() {
    return this.valueDateTime;
  }
  public void setValueTime( String value) {
    this.valueTime = value;
  }
  public String getValueTime() {
    return this.valueTime;
  }
  public void setValueCode( String value) {
    this.valueCode = value;
  }
  public String getValueCode() {
    return this.valueCode;
  }
  public void setValueOid( String value) {
    this.valueOid = value;
  }
  public String getValueOid() {
    return this.valueOid;
  }
  public void setValueUuid( String value) {
    this.valueUuid = value;
  }
  public String getValueUuid() {
    return this.valueUuid;
  }
  public void setValueId( String value) {
    this.valueId = value;
  }
  public String getValueId() {
    return this.valueId;
  }
  public void setValueUnsignedInt( Float value) {
    this.valueUnsignedInt = value;
  }
  public Float getValueUnsignedInt() {
    return this.valueUnsignedInt;
  }
  public void setValuePositiveInt( Float value) {
    this.valuePositiveInt = value;
  }
  public Float getValuePositiveInt() {
    return this.valuePositiveInt;
  }
  public void setValueMarkdown( String value) {
    this.valueMarkdown = value;
  }
  public String getValueMarkdown() {
    return this.valueMarkdown;
  }
  public void setValueElement( String value) {
    this.valueElement = value;
  }
  public String getValueElement() {
    return this.valueElement;
  }
  public void setValueExtension( String value) {
    this.valueExtension = value;
  }
  public String getValueExtension() {
    return this.valueExtension;
  }
  public void setValueBackboneElement( String value) {
    this.valueBackboneElement = value;
  }
  public String getValueBackboneElement() {
    return this.valueBackboneElement;
  }
  public void setValueNarrative( NarrativeModel value) {
    this.valueNarrative = value;
  }
  public NarrativeModel getValueNarrative() {
    return this.valueNarrative;
  }
  public void setValueAnnotation( String value) {
    this.valueAnnotation = value;
  }
  public String getValueAnnotation() {
    return this.valueAnnotation;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueIdentifier( String value) {
    this.valueIdentifier = value;
  }
  public String getValueIdentifier() {
    return this.valueIdentifier;
  }
  public void setValueCodeableConcept( String value) {
    this.valueCodeableConcept = value;
  }
  public String getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCoding( String value) {
    this.valueCoding = value;
  }
  public String getValueCoding() {
    return this.valueCoding;
  }
  public void setValueQuantity( String value) {
    this.valueQuantity = value;
  }
  public String getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueDuration( String value) {
    this.valueDuration = value;
  }
  public String getValueDuration() {
    return this.valueDuration;
  }
  public void setValueSimpleQuantity( String value) {
    this.valueSimpleQuantity = value;
  }
  public String getValueSimpleQuantity() {
    return this.valueSimpleQuantity;
  }
  public void setValueDistance( DistanceModel value) {
    this.valueDistance = value;
  }
  public DistanceModel getValueDistance() {
    return this.valueDistance;
  }
  public void setValueCount( String value) {
    this.valueCount = value;
  }
  public String getValueCount() {
    return this.valueCount;
  }
  public void setValueMoney( String value) {
    this.valueMoney = value;
  }
  public String getValueMoney() {
    return this.valueMoney;
  }
  public void setValueAge( String value) {
    this.valueAge = value;
  }
  public String getValueAge() {
    return this.valueAge;
  }
  public void setValueRange( String value) {
    this.valueRange = value;
  }
  public String getValueRange() {
    return this.valueRange;
  }
  public void setValuePeriod( String value) {
    this.valuePeriod = value;
  }
  public String getValuePeriod() {
    return this.valuePeriod;
  }
  public void setValueRatio( String value) {
    this.valueRatio = value;
  }
  public String getValueRatio() {
    return this.valueRatio;
  }
  public void setValueReference( ReferenceModel value) {
    this.valueReference = value;
  }
  public ReferenceModel getValueReference() {
    return this.valueReference;
  }
  public void setValueSampledData( String value) {
    this.valueSampledData = value;
  }
  public String getValueSampledData() {
    return this.valueSampledData;
  }
  public void setValueSignature( String value) {
    this.valueSignature = value;
  }
  public String getValueSignature() {
    return this.valueSignature;
  }
  public void setValueHumanName( String value) {
    this.valueHumanName = value;
  }
  public String getValueHumanName() {
    return this.valueHumanName;
  }
  public void setValueAddress( String value) {
    this.valueAddress = value;
  }
  public String getValueAddress() {
    return this.valueAddress;
  }
  public void setValueContactPoint( String value) {
    this.valueContactPoint = value;
  }
  public String getValueContactPoint() {
    return this.valueContactPoint;
  }
  public void setValueTiming( String value) {
    this.valueTiming = value;
  }
  public String getValueTiming() {
    return this.valueTiming;
  }
  public void setValueMeta( MetaModel value) {
    this.valueMeta = value;
  }
  public MetaModel getValueMeta() {
    return this.valueMeta;
  }
  public void setValueElementDefinition( String value) {
    this.valueElementDefinition = value;
  }
  public String getValueElementDefinition() {
    return this.valueElementDefinition;
  }
  public void setValueContactDetail( ContactDetailModel value) {
    this.valueContactDetail = value;
  }
  public ContactDetailModel getValueContactDetail() {
    return this.valueContactDetail;
  }
  public void setValueContributor( ContributorModel value) {
    this.valueContributor = value;
  }
  public ContributorModel getValueContributor() {
    return this.valueContributor;
  }
  public void setValueDosage( DosageModel value) {
    this.valueDosage = value;
  }
  public DosageModel getValueDosage() {
    return this.valueDosage;
  }
  public void setValueRelatedArtifact( RelatedArtifactModel value) {
    this.valueRelatedArtifact = value;
  }
  public RelatedArtifactModel getValueRelatedArtifact() {
    return this.valueRelatedArtifact;
  }
  public void setValueUsageContext( UsageContextModel value) {
    this.valueUsageContext = value;
  }
  public UsageContextModel getValueUsageContext() {
    return this.valueUsageContext;
  }
  public void setValueDataRequirement( DataRequirementModel value) {
    this.valueDataRequirement = value;
  }
  public DataRequirementModel getValueDataRequirement() {
    return this.valueDataRequirement;
  }
  public void setValueParameterDefinition( String value) {
    this.valueParameterDefinition = value;
  }
  public String getValueParameterDefinition() {
    return this.valueParameterDefinition;
  }
  public void setValueTriggerDefinition( TriggerDefinitionModel value) {
    this.valueTriggerDefinition = value;
  }
  public TriggerDefinitionModel getValueTriggerDefinition() {
    return this.valueTriggerDefinition;
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
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("valueBoolean" + "[" + String.valueOf(this.valueBoolean) + "]\n"); 
     builder.append("valueInteger" + "[" + String.valueOf(this.valueInteger) + "]\n"); 
     builder.append("valueDecimal" + "[" + String.valueOf(this.valueDecimal) + "]\n"); 
     builder.append("valueBase64Binary" + "[" + String.valueOf(this.valueBase64Binary) + "]\n"); 
     builder.append("valueInstant" + "[" + String.valueOf(this.valueInstant) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("valueUri" + "[" + String.valueOf(this.valueUri) + "]\n"); 
     builder.append("valueDate" + "[" + String.valueOf(this.valueDate) + "]\n"); 
     builder.append("valueDateTime" + "[" + String.valueOf(this.valueDateTime) + "]\n"); 
     builder.append("valueTime" + "[" + String.valueOf(this.valueTime) + "]\n"); 
     builder.append("valueCode" + "[" + String.valueOf(this.valueCode) + "]\n"); 
     builder.append("valueOid" + "[" + String.valueOf(this.valueOid) + "]\n"); 
     builder.append("valueUuid" + "[" + String.valueOf(this.valueUuid) + "]\n"); 
     builder.append("valueId" + "[" + String.valueOf(this.valueId) + "]\n"); 
     builder.append("valueUnsignedInt" + "[" + String.valueOf(this.valueUnsignedInt) + "]\n"); 
     builder.append("valuePositiveInt" + "[" + String.valueOf(this.valuePositiveInt) + "]\n"); 
     builder.append("valueMarkdown" + "[" + String.valueOf(this.valueMarkdown) + "]\n"); 
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
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}