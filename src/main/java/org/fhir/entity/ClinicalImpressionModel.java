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
* "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
* generated on 07/14/2018
*/
@Entity
@Table(name="clinicalimpression")
public class ClinicalImpressionModel  implements Serializable {
	private static final long serialVersionUID = 153159210163935905L;
  /**
  * Description: "This is a ClinicalImpression resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to the clinical impression that remains consistent regardless of what server the impression is stored on."
  * Actual type: List<String>;
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
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The encounter or episode of care this impression was created as part of."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "The point in time or period over which the subject was assessed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"effectiveDateTime\"")
  private String effectiveDateTime;

  /**
  * Description: "The point in time or period over which the subject was assessed."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="assessor_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> assessor;

  /**
  * Description: "A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes."
  */
  @javax.persistence.Basic
  @Column(name="\"previous_id\"")
  private String previous_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="previous_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> previous;

  /**
  * Description: "This a list of the relevant problems/conditions for a patient."
  */
  @javax.persistence.Basic
  @Column(name="\"problem_id\"")
  private String problem_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="problem_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> problem;

  /**
  * Description: "One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes."
  */
  @javax.persistence.Basic
  @Column(name="\"investigation_id\"")
  private String investigation_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="investigation_id", insertable=false, updatable=false)
  private java.util.List<ClinicalImpressionInvestigationModel> investigation;

  /**
  * Description: "Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis."
  */
  @javax.persistence.Basic
  @Column(name="\"protocol\"")
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
  @javax.persistence.Basic
  @Column(name="\"finding_id\"")
  private String finding_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="finding_id", insertable=false, updatable=false)
  private java.util.List<ClinicalImpressionFindingModel> finding;

  /**
  * Description: "Estimate of likely outcome."
  */
  @javax.persistence.Basic
  @Column(name="\"prognosiscodeableconcept_id\"")
  private String prognosiscodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="prognosiscodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> prognosisCodeableConcept;

  /**
  * Description: "RiskAssessment expressing likely outcome."
  */
  @javax.persistence.Basic
  @Column(name="\"prognosisreference_id\"")
  private String prognosisreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="prognosisreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> prognosisReference;

  /**
  * Description: "Action taken as part of assessment procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"action_id\"")
  private String action_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="action_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> action;

  /**
  * Description: "Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear."
  * Actual type: List<String>;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

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
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    this.description = o.getDescription();
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    this.effectiveDateTime = o.getEffectiveDateTime();
    if (null != o.getEffectivePeriod()) {
    	this.effectivePeriod = JsonUtils.toJson(o.getEffectivePeriod());
    }
    this.date = o.getDate();
    if (null != o.getAssessor() ) {
    	this.assessor_id = "assessor" + this.id;
    	this.assessor = ReferenceHelper.toModel(o.getAssessor(), this.assessor_id);
    }
    if (null != o.getPrevious() ) {
    	this.previous_id = "previous" + this.id;
    	this.previous = ReferenceHelper.toModel(o.getPrevious(), this.previous_id);
    }
    if (null != o.getProblem() && !o.getProblem().isEmpty()) {
    	this.problem_id = "problem" + this.id;
    	this.problem = ReferenceHelper.toModelFromArray(o.getProblem(), this.problem_id);
    }
    if (null != o.getInvestigation() && !o.getInvestigation().isEmpty()) {
    	this.investigation_id = "investigation" + this.id;
    	this.investigation = ClinicalImpressionInvestigationHelper.toModelFromArray(o.getInvestigation(), this.investigation_id);
    }
    this.protocol = org.fhir.utils.JsonUtils.toJson(o.getProtocol());
    this.summary = o.getSummary();
    if (null != o.getFinding() && !o.getFinding().isEmpty()) {
    	this.finding_id = "finding" + this.id;
    	this.finding = ClinicalImpressionFindingHelper.toModelFromArray(o.getFinding(), this.finding_id);
    }
    if (null != o.getPrognosisCodeableConcept() && !o.getPrognosisCodeableConcept().isEmpty()) {
    	this.prognosiscodeableconcept_id = "prognosiscodeableconcept" + this.id;
    	this.prognosisCodeableConcept = CodeableConceptHelper.toModelFromArray(o.getPrognosisCodeableConcept(), this.prognosiscodeableconcept_id);
    }
    if (null != o.getPrognosisReference() && !o.getPrognosisReference().isEmpty()) {
    	this.prognosisreference_id = "prognosisreference" + this.id;
    	this.prognosisReference = ReferenceHelper.toModelFromArray(o.getPrognosisReference(), this.prognosisreference_id);
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action_id = "action" + this.id;
    	this.action = ReferenceHelper.toModelFromArray(o.getAction(), this.action_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public String getEffectiveDateTime() {
    return this.effectiveDateTime;
  }
  public void setEffectiveDateTime( String value) {
    this.effectiveDateTime = value;
  }
  public String getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setEffectivePeriod( String value) {
    this.effectivePeriod = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public java.util.List<ReferenceModel> getAssessor() {
    return this.assessor;
  }
  public void setAssessor( java.util.List<ReferenceModel> value) {
    this.assessor = value;
  }
  public java.util.List<ReferenceModel> getPrevious() {
    return this.previous;
  }
  public void setPrevious( java.util.List<ReferenceModel> value) {
    this.previous = value;
  }
  public java.util.List<ReferenceModel> getProblem() {
    return this.problem;
  }
  public void setProblem( java.util.List<ReferenceModel> value) {
    this.problem = value;
  }
  public java.util.List<ClinicalImpressionInvestigationModel> getInvestigation() {
    return this.investigation;
  }
  public void setInvestigation( java.util.List<ClinicalImpressionInvestigationModel> value) {
    this.investigation = value;
  }
  public String getProtocol() {
    return this.protocol;
  }
  public void setProtocol( String value) {
    this.protocol = value;
  }
  public String getSummary() {
    return this.summary;
  }
  public void setSummary( String value) {
    this.summary = value;
  }
  public java.util.List<ClinicalImpressionFindingModel> getFinding() {
    return this.finding;
  }
  public void setFinding( java.util.List<ClinicalImpressionFindingModel> value) {
    this.finding = value;
  }
  public java.util.List<CodeableConceptModel> getPrognosisCodeableConcept() {
    return this.prognosisCodeableConcept;
  }
  public void setPrognosisCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.prognosisCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getPrognosisReference() {
    return this.prognosisReference;
  }
  public void setPrognosisReference( java.util.List<ReferenceModel> value) {
    this.prognosisReference = value;
  }
  public java.util.List<ReferenceModel> getAction() {
    return this.action;
  }
  public void setAction( java.util.List<ReferenceModel> value) {
    this.action = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClinicalImpressionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("effectiveDateTime" + "->" + this.effectiveDateTime + "\n"); 
     builder.append("effectivePeriod" + "->" + this.effectivePeriod + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("protocol" + "->" + this.protocol + "\n"); 
     builder.append("summary" + "->" + this.summary + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClinicalImpressionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("effectiveDateTime" + "->" + this.effectiveDateTime + "\n"); 
     builder.append("effectivePeriod" + "->" + this.effectivePeriod + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("protocol" + "->" + this.protocol + "\n"); 
     builder.append("summary" + "->" + this.summary + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}