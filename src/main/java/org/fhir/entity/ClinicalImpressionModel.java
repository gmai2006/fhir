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
* "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
*/
@Entity
@Table(name="clinicalimpression")
public class ClinicalImpressionModel  {
  /**
  * Description: "This is a ClinicalImpression resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to the clinical impression that remains consistent regardless of what server the impression is stored on."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Identifies the workflow status of the assessment."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Categorizes the type of clinical assessment performed."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "A summary of the context and/or cause of the assessment - why / where was it performed, and what patient events/status prompted it."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "The patient or group of individuals assessed as part of this record."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "The encounter or episode of care this impression was created as part of."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "The point in time or period over which the subject was assessed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"effectiveDateTime\"")
  private String effectiveDateTime;

  /**
  * Description: "The point in time or period over which the subject was assessed."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"effectivePeriod\"", length = 16777215)
  private String effectivePeriod;

  /**
  * Description: "Indicates when the documentation of the assessment was complete."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The clinician performing the assessment."
  */
  @javax.persistence.Basic
  @Column(name="\"assessor_id\"")
  private String assessor_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`assessor_id`", insertable=false, updatable=false)
  private ReferenceModel assessor;

  /**
  * Description: "A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes."
  */
  @javax.persistence.Basic
  @Column(name="\"previous_id\"")
  private String previous_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`previous_id`", insertable=false, updatable=false)
  private ReferenceModel previous;

  /**
  * Description: "This a list of the relevant problems/conditions for a patient."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> problem = new java.util.ArrayList<>();

  /**
  * Description: "One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClinicalImpressionInvestigationModel> investigation = new java.util.ArrayList<>();

  /**
  * Description: "Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"protocol\"", length = 16777215)
  private String protocol;

  /**
  * Description: "A text summary of the investigations and the diagnosis."
  */
  @javax.persistence.Basic
  @Column(name="\"summary\"")
  private String summary;

  /**
  * Description: "Specific findings or diagnoses that was considered likely or relevant to ongoing treatment."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ClinicalImpressionFindingModel> finding = new java.util.ArrayList<>();

  /**
  * Description: "Estimate of likely outcome."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"prognosisCodeableConcept\"", length = 16777215)
  private String prognosisCodeableConcept;

  /**
  * Description: "RiskAssessment expressing likely outcome."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> prognosisReference = new java.util.ArrayList<>();

  /**
  * Description: "Action taken as part of assessment procedure."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> action = new java.util.ArrayList<>();

  /**
  * Description: "Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

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


  public ClinicalImpressionModel() {
  }

  public ClinicalImpressionModel(ClinicalImpression o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.code = CodeableConcept.toJson(o.getCode());
      this.description = o.getDescription();

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

      this.effectiveDateTime = o.getEffectiveDateTime();

      this.effectivePeriod = Period.toJson(o.getEffectivePeriod());
      this.date = o.getDate();

      if (null != o.getAssessor()) {
      	this.assessor_id = "assessor" + this.getId();
        this.assessor = new ReferenceModel(o.getAssessor());
        this.assessor.setId(this.assessor_id);
        this.assessor.parent_id = this.assessor.getId();
      }

      if (null != o.getPrevious()) {
      	this.previous_id = "previous" + this.getId();
        this.previous = new ReferenceModel(o.getPrevious());
        this.previous.setId(this.previous_id);
        this.previous.parent_id = this.previous.getId();
      }

      this.problem = Reference.toModelArray(o.getProblem());

      this.investigation = ClinicalImpressionInvestigation.toModelArray(o.getInvestigation());

      this.protocol = org.fhir.utils.JsonUtils.write2String(o.getProtocol());

      this.summary = o.getSummary();

      this.finding = ClinicalImpressionFinding.toModelArray(o.getFinding());

      this.prognosisCodeableConcept = CodeableConcept.toJson(o.getPrognosisCodeableConcept());
      this.prognosisReference = Reference.toModelArray(o.getPrognosisReference());

      this.action = Reference.toModelArray(o.getAction());

      this.note = Annotation.toJson(o.getNote());
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
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
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
  public void setEffectiveDateTime( String value) {
    this.effectiveDateTime = value;
  }
  public String getEffectiveDateTime() {
    return this.effectiveDateTime;
  }
  public void setEffectivePeriod( String value) {
    this.effectivePeriod = value;
  }
  public String getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setAssessor( ReferenceModel value) {
    this.assessor = value;
  }
  public ReferenceModel getAssessor() {
    return this.assessor;
  }
  public void setPrevious( ReferenceModel value) {
    this.previous = value;
  }
  public ReferenceModel getPrevious() {
    return this.previous;
  }
  public void setProblem( java.util.List<ReferenceModel> value) {
    this.problem = value;
  }
  public java.util.List<ReferenceModel> getProblem() {
    return this.problem;
  }
  public void setInvestigation( java.util.List<ClinicalImpressionInvestigationModel> value) {
    this.investigation = value;
  }
  public java.util.List<ClinicalImpressionInvestigationModel> getInvestigation() {
    return this.investigation;
  }
  public void setProtocol( String value) {
    this.protocol = value;
  }
  public String getProtocol() {
    return this.protocol;
  }
  public void setSummary( String value) {
    this.summary = value;
  }
  public String getSummary() {
    return this.summary;
  }
  public void setFinding( java.util.List<ClinicalImpressionFindingModel> value) {
    this.finding = value;
  }
  public java.util.List<ClinicalImpressionFindingModel> getFinding() {
    return this.finding;
  }
  public void setPrognosisCodeableConcept( String value) {
    this.prognosisCodeableConcept = value;
  }
  public String getPrognosisCodeableConcept() {
    return this.prognosisCodeableConcept;
  }
  public void setPrognosisReference( java.util.List<ReferenceModel> value) {
    this.prognosisReference = value;
  }
  public java.util.List<ReferenceModel> getPrognosisReference() {
    return this.prognosisReference;
  }
  public void setAction( java.util.List<ReferenceModel> value) {
    this.action = value;
  }
  public java.util.List<ReferenceModel> getAction() {
    return this.action;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("effectiveDateTime" + "[" + String.valueOf(this.effectiveDateTime) + "]\n"); 
     builder.append("effectivePeriod" + "[" + String.valueOf(this.effectivePeriod) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("assessor" + "[" + String.valueOf(this.assessor) + "]\n"); 
     builder.append("previous" + "[" + String.valueOf(this.previous) + "]\n"); 
     builder.append("problem" + "[" + String.valueOf(this.problem) + "]\n"); 
     builder.append("investigation" + "[" + String.valueOf(this.investigation) + "]\n"); 
     builder.append("protocol" + "[" + String.valueOf(this.protocol) + "]\n"); 
     builder.append("summary" + "[" + String.valueOf(this.summary) + "]\n"); 
     builder.append("finding" + "[" + String.valueOf(this.finding) + "]\n"); 
     builder.append("prognosisCodeableConcept" + "[" + String.valueOf(this.prognosisCodeableConcept) + "]\n"); 
     builder.append("prognosisReference" + "[" + String.valueOf(this.prognosisReference) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
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