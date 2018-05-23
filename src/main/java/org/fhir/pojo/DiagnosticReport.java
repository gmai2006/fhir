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
import org.fhir.entity.DiagnosticReportModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DiagnosticReport  extends DomainResource  {
  /**
  * Description: "This is a DiagnosticReport resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifiers assigned to this report by the performer or other systems."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Details concerning a test or procedure requested."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "The status of the diagnostic report as a whole."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes."
  */
  protected CodeableConcept category;

  /**
  * Description: "A code or name that describes this diagnostic report."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources."
  */
  protected Reference subject;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) which this DiagnosticReport per is about."
  */
  protected Reference context;

  /**
  * Description: "The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  protected transient Element _effectiveDateTime;

  /**
  * Description: "The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself."
  */
  protected Period effectivePeriod;

  /**
  * Description: "The date and time that this version of the report was released from the source diagnostic service."
  */
  protected String issued;

  /**
  * Description: "Extensions for issued"
  */
  protected transient Element _issued;

  /**
  * Description: "Indicates who or what participated in producing the report."
  */
  protected java.util.List<DiagnosticReportPerformer> performer;

  /**
  * Description: "Details about the specimens on which this diagnostic report is based."
  */
  protected java.util.List<Reference> specimen;

  /**
  * Description: "Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. \"atomic\" results), or they can be grouping observations that include references to other members of the group (e.g. \"panels\")."
  */
  protected java.util.List<Reference> result;

  /**
  * Description: "One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images."
  */
  protected java.util.List<Reference> imagingStudy;

  /**
  * Description: "A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest)."
  */
  protected java.util.List<DiagnosticReportImage> image;

  /**
  * Description: "Concise and clinically contextualized impression / summary of the diagnostic report."
  */
  protected String conclusion;

  /**
  * Description: "Extensions for conclusion"
  */
  protected transient Element _conclusion;

  /**
  * Description: "Codes for the conclusion."
  */
  protected java.util.List<CodeableConcept> codedDiagnosis;

  /**
  * Description: "Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent."
  */
  protected java.util.List<Attachment> presentedForm;

  public DiagnosticReport() {
  }

  public DiagnosticReport(DiagnosticReportModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
      this.category = new CodeableConcept(o.getCategory().get(0));
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getEffectiveDateTime()) {
      this.effectiveDateTime = o.getEffectiveDateTime();
    }
    this.effectivePeriod = PeriodHelper.fromJson(o.getEffectivePeriod());
    if (null != o.getIssued()) {
      this.issued = o.getIssued();
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer = DiagnosticReportPerformerHelper.fromArray2Array(o.getPerformer());
    }
    if (null != o.getSpecimen() && !o.getSpecimen().isEmpty()) {
    	this.specimen = ReferenceHelper.fromArray2Array(o.getSpecimen());
    }
    if (null != o.getResult() && !o.getResult().isEmpty()) {
    	this.result = ReferenceHelper.fromArray2Array(o.getResult());
    }
    if (null != o.getImagingStudy() && !o.getImagingStudy().isEmpty()) {
    	this.imagingStudy = ReferenceHelper.fromArray2Array(o.getImagingStudy());
    }
    if (null != o.getImage() && !o.getImage().isEmpty()) {
    	this.image = DiagnosticReportImageHelper.fromArray2Array(o.getImage());
    }
    if (null != o.getConclusion()) {
      this.conclusion = o.getConclusion();
    }
    if (null != o.getCodedDiagnosis() && !o.getCodedDiagnosis().isEmpty()) {
    	this.codedDiagnosis = CodeableConceptHelper.fromArray2Array(o.getCodedDiagnosis());
    }
    if (o.getPresentedForm() != null) {
    	this.presentedForm = org.fhir.utils.JsonUtils.json2Array(o.getPresentedForm());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setEffectiveDateTime( String value) {
    this.effectiveDateTime = value;
  }
  public String getEffectiveDateTime() {
    return this.effectiveDateTime;
  }
  public void set_effectiveDateTime( Element value) {
    this._effectiveDateTime = value;
  }
  public Element get_effectiveDateTime() {
    return this._effectiveDateTime;
  }
  public void setEffectivePeriod( Period value) {
    this.effectivePeriod = value;
  }
  public Period getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void set_issued( Element value) {
    this._issued = value;
  }
  public Element get_issued() {
    return this._issued;
  }
  public void setPerformer( java.util.List<DiagnosticReportPerformer> value) {
    this.performer = value;
  }
  public java.util.List<DiagnosticReportPerformer> getPerformer() {
    return this.performer;
  }
  public void setSpecimen( java.util.List<Reference> value) {
    this.specimen = value;
  }
  public java.util.List<Reference> getSpecimen() {
    return this.specimen;
  }
  public void setResult( java.util.List<Reference> value) {
    this.result = value;
  }
  public java.util.List<Reference> getResult() {
    return this.result;
  }
  public void setImagingStudy( java.util.List<Reference> value) {
    this.imagingStudy = value;
  }
  public java.util.List<Reference> getImagingStudy() {
    return this.imagingStudy;
  }
  public void setImage( java.util.List<DiagnosticReportImage> value) {
    this.image = value;
  }
  public java.util.List<DiagnosticReportImage> getImage() {
    return this.image;
  }
  public void setConclusion( String value) {
    this.conclusion = value;
  }
  public String getConclusion() {
    return this.conclusion;
  }
  public void set_conclusion( Element value) {
    this._conclusion = value;
  }
  public Element get_conclusion() {
    return this._conclusion;
  }
  public void setCodedDiagnosis( java.util.List<CodeableConcept> value) {
    this.codedDiagnosis = value;
  }
  public java.util.List<CodeableConcept> getCodedDiagnosis() {
    return this.codedDiagnosis;
  }
  public void setPresentedForm( java.util.List<Attachment> value) {
    this.presentedForm = value;
  }
  public java.util.List<Attachment> getPresentedForm() {
    return this.presentedForm;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DiagnosticReport]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.effectiveDateTime != null) builder.append("effectiveDateTime" + "->" + this.effectiveDateTime.toString() + "\n"); 
     if(this._effectiveDateTime != null) builder.append("_effectiveDateTime" + "->" + this._effectiveDateTime.toString() + "\n"); 
     if(this.effectivePeriod != null) builder.append("effectivePeriod" + "->" + this.effectivePeriod.toString() + "\n"); 
     if(this.issued != null) builder.append("issued" + "->" + this.issued.toString() + "\n"); 
     if(this._issued != null) builder.append("_issued" + "->" + this._issued.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.specimen != null) builder.append("specimen" + "->" + this.specimen.toString() + "\n"); 
     if(this.result != null) builder.append("result" + "->" + this.result.toString() + "\n"); 
     if(this.imagingStudy != null) builder.append("imagingStudy" + "->" + this.imagingStudy.toString() + "\n"); 
     if(this.image != null) builder.append("image" + "->" + this.image.toString() + "\n"); 
     if(this.conclusion != null) builder.append("conclusion" + "->" + this.conclusion.toString() + "\n"); 
     if(this._conclusion != null) builder.append("_conclusion" + "->" + this._conclusion.toString() + "\n"); 
     if(this.codedDiagnosis != null) builder.append("codedDiagnosis" + "->" + this.codedDiagnosis.toString() + "\n"); 
     if(this.presentedForm != null) builder.append("presentedForm" + "->" + this.presentedForm.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	DiagnosticReport,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "DiagnosticReport" : { return DiagnosticReport.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	registered,
  	partial,
  	preliminary,
  	FHIRfinal,
  	amended,
  	corrected,
  	appended,
  	cancelled,
  	enteredinerror,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "registered" : { return registered.toString(); }
  			case "partial" : { return partial.toString(); }
  			case "preliminary" : { return preliminary.toString(); }
  			case "final" : { return FHIRfinal.toString(); }
  			case "amended" : { return amended.toString(); }
  			case "corrected" : { return corrected.toString(); }
  			case "appended" : { return appended.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}