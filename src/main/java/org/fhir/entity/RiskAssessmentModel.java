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
* "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
*/
@Entity
@Table(name="riskassessment")
public class RiskAssessmentModel  {
  /**
  * Description: "This is a RiskAssessment resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Business identifier assigned to the risk assessment."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A reference to the request that is fulfilled by this risk assessment."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`basedon_id`", insertable=false, updatable=false)
  private ReferenceModel basedOn;

  /**
  * Description: "A reference to a resource that this risk assessment is part of, such as a Procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`parent_id`", insertable=false, updatable=false)
  private ReferenceModel parent;

  /**
  * Description: "The status of the RiskAssessment, using the same statuses as an Observation."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The algorithm, process or mechanism used to evaluate the risk."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"method\"", length = 16777215)
  private String method;

  /**
  * Description: "The type of the risk assessment performed."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "The patient or group the risk assessment applies to."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "The encounter where the assessment was performed."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "The date (and possibly time) the risk assessment was performed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "The date (and possibly time) the risk assessment was performed."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "For assessments or prognosis specific to a particular condition, indicates the condition being assessed."
  */
  @javax.persistence.Basic
  @Column(name="\"condition_id\"")
  private String condition_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`condition_id`", insertable=false, updatable=false)
  private ReferenceModel condition;

  /**
  * Description: "The provider or software application that performed the assessment."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`performer_id`", insertable=false, updatable=false)
  private ReferenceModel performer;

  /**
  * Description: "The reason the risk assessment was performed."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCodeableConcept\"", length = 16777215)
  private String reasonCodeableConcept;

  /**
  * Description: "The reason the risk assessment was performed."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`reasonreference_id`", insertable=false, updatable=false)
  private ReferenceModel reasonReference;

  /**
  * Description: "Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basis = new java.util.ArrayList<>();

  /**
  * Description: "Describes the expected outcome for the subject."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<RiskAssessmentPredictionModel> prediction = new java.util.ArrayList<>();

  /**
  * Description: "A description of the steps that might be taken to reduce the identified risk(s)."
  */
  @javax.persistence.Basic
  @Column(name="\"mitigation\"")
  private String mitigation;

  /**
  * Description: "Additional comments about the risk assessment."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

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


  public RiskAssessmentModel() {
  }

  public RiskAssessmentModel(RiskAssessment o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      if (null != o.getBasedOn()) {
      	this.basedon_id = "basedOn" + this.getId();
        this.basedOn = new ReferenceModel(o.getBasedOn());
        this.basedOn.setId(this.basedon_id);
        this.basedOn.parent_id = this.basedOn.getId();
      }

      if (null != o.getParent()) {
      	this.parent_id = "parent" + this.getId();
        this.parent = new ReferenceModel(o.getParent());
        this.parent.setId(this.parent_id);
        this.parent.parent_id = this.parent.getId();
      }

      this.status = o.getStatus();

      this.method = CodeableConcept.toJson(o.getMethod());
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

      this.occurrenceDateTime = o.getOccurrenceDateTime();

      this.occurrencePeriod = Period.toJson(o.getOccurrencePeriod());
      if (null != o.getCondition()) {
      	this.condition_id = "condition" + this.getId();
        this.condition = new ReferenceModel(o.getCondition());
        this.condition.setId(this.condition_id);
        this.condition.parent_id = this.condition.getId();
      }

      if (null != o.getPerformer()) {
      	this.performer_id = "performer" + this.getId();
        this.performer = new ReferenceModel(o.getPerformer());
        this.performer.setId(this.performer_id);
        this.performer.parent_id = this.performer.getId();
      }

      this.reasonCodeableConcept = CodeableConcept.toJson(o.getReasonCodeableConcept());
      if (null != o.getReasonReference()) {
      	this.reasonreference_id = "reasonReference" + this.getId();
        this.reasonReference = new ReferenceModel(o.getReasonReference());
        this.reasonReference.setId(this.reasonreference_id);
        this.reasonReference.parent_id = this.reasonReference.getId();
      }

      this.basis = Reference.toModelArray(o.getBasis());

      this.prediction = RiskAssessmentPrediction.toModelArray(o.getPrediction());

      this.mitigation = o.getMitigation();

      this.comment = o.getComment();

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
  public void setBasedOn( ReferenceModel value) {
    this.basedOn = value;
  }
  public ReferenceModel getBasedOn() {
    return this.basedOn;
  }
  public void setParent( ReferenceModel value) {
    this.parent = value;
  }
  public ReferenceModel getParent() {
    return this.parent;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setMethod( String value) {
    this.method = value;
  }
  public String getMethod() {
    return this.method;
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
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setCondition( ReferenceModel value) {
    this.condition = value;
  }
  public ReferenceModel getCondition() {
    return this.condition;
  }
  public void setPerformer( ReferenceModel value) {
    this.performer = value;
  }
  public ReferenceModel getPerformer() {
    return this.performer;
  }
  public void setReasonCodeableConcept( String value) {
    this.reasonCodeableConcept = value;
  }
  public String getReasonCodeableConcept() {
    return this.reasonCodeableConcept;
  }
  public void setReasonReference( ReferenceModel value) {
    this.reasonReference = value;
  }
  public ReferenceModel getReasonReference() {
    return this.reasonReference;
  }
  public void setBasis( java.util.List<ReferenceModel> value) {
    this.basis = value;
  }
  public java.util.List<ReferenceModel> getBasis() {
    return this.basis;
  }
  public void setPrediction( java.util.List<RiskAssessmentPredictionModel> value) {
    this.prediction = value;
  }
  public java.util.List<RiskAssessmentPredictionModel> getPrediction() {
    return this.prediction;
  }
  public void setMitigation( String value) {
    this.mitigation = value;
  }
  public String getMitigation() {
    return this.mitigation;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
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
     builder.append("parent" + "[" + String.valueOf(this.parent) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("method" + "[" + String.valueOf(this.method) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("condition" + "[" + String.valueOf(this.condition) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("reasonCodeableConcept" + "[" + String.valueOf(this.reasonCodeableConcept) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("basis" + "[" + String.valueOf(this.basis) + "]\n"); 
     builder.append("prediction" + "[" + String.valueOf(this.prediction) + "]\n"); 
     builder.append("mitigation" + "[" + String.valueOf(this.mitigation) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
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