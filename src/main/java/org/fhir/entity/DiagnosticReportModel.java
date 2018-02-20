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
* "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
*/
@Entity
@Table(name="diagnosticreport")
public class DiagnosticReportModel  implements Serializable {
	private static final long serialVersionUID = 151910893703764975L;
  /**
  * Description: "This is a DiagnosticReport resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this report by the performer or other systems."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Details concerning a test or procedure requested."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "The status of the diagnostic report as a whole."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "A code or name that describes this diagnostic report."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) which this DiagnosticReport per is about."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"effectiveDateTime\"")
  private String effectiveDateTime;

  /**
  * Description: "The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"effectivePeriod\"", length = 16777215)
  private String effectivePeriod;

  /**
  * Description: "The date and time that this version of the report was released from the source diagnostic service."
  */
  @javax.persistence.Basic
  @Column(name="\"issued\"")
  private String issued;

  /**
  * Description: "Indicates who or what participated in producing the report."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="performer_id", insertable=false, updatable=false)
  private java.util.List<DiagnosticReportPerformerModel> performer;

  /**
  * Description: "Details about the specimens on which this diagnostic report is based."
  */
  @javax.persistence.Basic
  @Column(name="\"specimen_id\"")
  private String specimen_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="specimen_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> specimen;

  /**
  * Description: "Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. \"atomic\" results), or they can be grouping observations that include references to other members of the group (e.g. \"panels\")."
  */
  @javax.persistence.Basic
  @Column(name="\"result_id\"")
  private String result_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="result_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> result;

  /**
  * Description: "One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images."
  */
  @javax.persistence.Basic
  @Column(name="\"imagingstudy_id\"")
  private String imagingstudy_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="imagingstudy_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> imagingStudy;

  /**
  * Description: "A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest)."
  */
  @javax.persistence.Basic
  @Column(name="\"image_id\"")
  private String image_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="image_id", insertable=false, updatable=false)
  private java.util.List<DiagnosticReportImageModel> image;

  /**
  * Description: "Concise and clinically contextualized impression / summary of the diagnostic report."
  */
  @javax.persistence.Basic
  @Column(name="\"conclusion\"")
  private String conclusion;

  /**
  * Description: "Codes for the conclusion."
  */
  @javax.persistence.Basic
  @Column(name="\"codeddiagnosis_id\"")
  private String codeddiagnosis_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="codeddiagnosis_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> codedDiagnosis;

  /**
  * Description: "Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"presentedForm\"", length = 16777215)
  private String presentedForm;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public DiagnosticReportModel() {
  }

  public DiagnosticReportModel(DiagnosticReport o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    this.status = o.getStatus();
    if (null != o.getCategory() ) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModel(o.getCategory(), this.category_id);
    }
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
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
    this.issued = o.getIssued();
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer_id = "performer" + this.id;
    	this.performer = DiagnosticReportPerformerHelper.toModelFromArray(o.getPerformer(), this.performer_id);
    }
    if (null != o.getSpecimen() && !o.getSpecimen().isEmpty()) {
    	this.specimen_id = "specimen" + this.id;
    	this.specimen = ReferenceHelper.toModelFromArray(o.getSpecimen(), this.specimen_id);
    }
    if (null != o.getResult() && !o.getResult().isEmpty()) {
    	this.result_id = "result" + this.id;
    	this.result = ReferenceHelper.toModelFromArray(o.getResult(), this.result_id);
    }
    if (null != o.getImagingStudy() && !o.getImagingStudy().isEmpty()) {
    	this.imagingstudy_id = "imagingstudy" + this.id;
    	this.imagingStudy = ReferenceHelper.toModelFromArray(o.getImagingStudy(), this.imagingstudy_id);
    }
    if (null != o.getImage() && !o.getImage().isEmpty()) {
    	this.image_id = "image" + this.id;
    	this.image = DiagnosticReportImageHelper.toModelFromArray(o.getImage(), this.image_id);
    }
    this.conclusion = o.getConclusion();
    if (null != o.getCodedDiagnosis() && !o.getCodedDiagnosis().isEmpty()) {
    	this.codeddiagnosis_id = "codeddiagnosis" + this.id;
    	this.codedDiagnosis = CodeableConceptHelper.toModelFromArray(o.getCodedDiagnosis(), this.codeddiagnosis_id);
    }
    if (null != o.getPresentedForm()) {
    	this.presentedForm = JsonUtils.toJson(o.getPresentedForm());
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
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
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
  public String getIssued() {
    return this.issued;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public java.util.List<DiagnosticReportPerformerModel> getPerformer() {
    return this.performer;
  }
  public void setPerformer( java.util.List<DiagnosticReportPerformerModel> value) {
    this.performer = value;
  }
  public java.util.List<ReferenceModel> getSpecimen() {
    return this.specimen;
  }
  public void setSpecimen( java.util.List<ReferenceModel> value) {
    this.specimen = value;
  }
  public java.util.List<ReferenceModel> getResult() {
    return this.result;
  }
  public void setResult( java.util.List<ReferenceModel> value) {
    this.result = value;
  }
  public java.util.List<ReferenceModel> getImagingStudy() {
    return this.imagingStudy;
  }
  public void setImagingStudy( java.util.List<ReferenceModel> value) {
    this.imagingStudy = value;
  }
  public java.util.List<DiagnosticReportImageModel> getImage() {
    return this.image;
  }
  public void setImage( java.util.List<DiagnosticReportImageModel> value) {
    this.image = value;
  }
  public String getConclusion() {
    return this.conclusion;
  }
  public void setConclusion( String value) {
    this.conclusion = value;
  }
  public java.util.List<CodeableConceptModel> getCodedDiagnosis() {
    return this.codedDiagnosis;
  }
  public void setCodedDiagnosis( java.util.List<CodeableConceptModel> value) {
    this.codedDiagnosis = value;
  }
  public String getPresentedForm() {
    return this.presentedForm;
  }
  public void setPresentedForm( String value) {
    this.presentedForm = value;
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
    builder.append("[DiagnosticReportModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("effectiveDateTime" + "->" + this.effectiveDateTime + "\n"); 
     builder.append("effectivePeriod" + "->" + this.effectivePeriod + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("conclusion" + "->" + this.conclusion + "\n"); 
     builder.append("presentedForm" + "->" + this.presentedForm + "\n"); 
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
    builder.append("[DiagnosticReportModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("basedOn" + "->" + this.basedOn + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("effectiveDateTime" + "->" + this.effectiveDateTime + "\n"); 
     builder.append("effectivePeriod" + "->" + this.effectivePeriod + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("performer" + "->" + this.performer + "\n"); 
     builder.append("specimen" + "->" + this.specimen + "\n"); 
     builder.append("result" + "->" + this.result + "\n"); 
     builder.append("imagingStudy" + "->" + this.imagingStudy + "\n"); 
     builder.append("image" + "->" + this.image + "\n"); 
     builder.append("conclusion" + "->" + this.conclusion + "\n"); 
     builder.append("codedDiagnosis" + "->" + this.codedDiagnosis + "\n"); 
     builder.append("presentedForm" + "->" + this.presentedForm + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}