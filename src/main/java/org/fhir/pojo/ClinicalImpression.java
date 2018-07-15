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
import org.fhir.entity.ClinicalImpressionModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClinicalImpression  extends DomainResource  {
  /**
  * Description: "This is a ClinicalImpression resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A unique identifier assigned to the clinical impression that remains consistent regardless of what server the impression is stored on."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Identifies the workflow status of the assessment."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Categorizes the type of clinical assessment performed."
  */
  protected CodeableConcept code;

  /**
  * Description: "A summary of the context and/or cause of the assessment - why / where was it performed, and what patient events/status prompted it."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The patient or group of individuals assessed as part of this record."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "The encounter or episode of care this impression was created as part of."
  */
  protected Reference context;

  /**
  * Description: "The point in time or period over which the subject was assessed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  protected transient Element _effectiveDateTime;

  /**
  * Description: "The point in time or period over which the subject was assessed."
  */
  protected Period effectivePeriod;

  /**
  * Description: "Indicates when the documentation of the assessment was complete."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The clinician performing the assessment."
  */
  protected Reference assessor;

  /**
  * Description: "A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes."
  */
  protected Reference previous;

  /**
  * Description: "This a list of the relevant problems/conditions for a patient."
  */
  protected java.util.List<Reference> problem;

  /**
  * Description: "One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes."
  */
  protected java.util.List<ClinicalImpressionInvestigation> investigation;

  /**
  * Description: "Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis."
  */
  protected java.util.List<String> protocol;

  /**
  * Description: "Extensions for protocol"
  */
  protected transient java.util.List<Element> _protocol;

  /**
  * Description: "A text summary of the investigations and the diagnosis."
  */
  protected String summary;

  /**
  * Description: "Extensions for summary"
  */
  protected transient Element _summary;

  /**
  * Description: "Specific findings or diagnoses that was considered likely or relevant to ongoing treatment."
  */
  protected java.util.List<ClinicalImpressionFinding> finding;

  /**
  * Description: "Estimate of likely outcome."
  */
  protected java.util.List<CodeableConcept> prognosisCodeableConcept;

  /**
  * Description: "RiskAssessment expressing likely outcome."
  */
  protected java.util.List<Reference> prognosisReference;

  /**
  * Description: "Action taken as part of assessment procedure."
  */
  protected java.util.List<Reference> action;

  /**
  * Description: "Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear."
  */
  protected java.util.List<Annotation> note;

  public ClinicalImpression() {
  }

  public ClinicalImpression(ClinicalImpressionModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
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
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getAssessor() && !o.getAssessor().isEmpty()) {
      this.assessor = new Reference(o.getAssessor().get(0));
    }
    if (null != o.getPrevious() && !o.getPrevious().isEmpty()) {
      this.previous = new Reference(o.getPrevious().get(0));
    }
    if (null != o.getProblem() && !o.getProblem().isEmpty()) {
    	this.problem = ReferenceHelper.fromArray2Array(o.getProblem());
    }
    if (null != o.getInvestigation() && !o.getInvestigation().isEmpty()) {
    	this.investigation = ClinicalImpressionInvestigationHelper.fromArray2Array(o.getInvestigation());
    }
    if (o.getProtocol() != null) {
    	this.protocol = org.fhir.utils.JsonUtils.json2Array(o.getProtocol());
    }
    if (null != o.getSummary()) {
      this.summary = o.getSummary();
    }
    if (null != o.getFinding() && !o.getFinding().isEmpty()) {
    	this.finding = ClinicalImpressionFindingHelper.fromArray2Array(o.getFinding());
    }
    if (null != o.getPrognosisCodeableConcept() && !o.getPrognosisCodeableConcept().isEmpty()) {
    	this.prognosisCodeableConcept = CodeableConceptHelper.fromArray2Array(o.getPrognosisCodeableConcept());
    }
    if (null != o.getPrognosisReference() && !o.getPrognosisReference().isEmpty()) {
    	this.prognosisReference = ReferenceHelper.fromArray2Array(o.getPrognosisReference());
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action = ReferenceHelper.fromArray2Array(o.getAction());
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
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
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
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
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setAssessor( Reference value) {
    this.assessor = value;
  }
  public Reference getAssessor() {
    return this.assessor;
  }
  public void setPrevious( Reference value) {
    this.previous = value;
  }
  public Reference getPrevious() {
    return this.previous;
  }
  public void setProblem( java.util.List<Reference> value) {
    this.problem = value;
  }
  public java.util.List<Reference> getProblem() {
    return this.problem;
  }
  public void setInvestigation( java.util.List<ClinicalImpressionInvestigation> value) {
    this.investigation = value;
  }
  public java.util.List<ClinicalImpressionInvestigation> getInvestigation() {
    return this.investigation;
  }
  public void setProtocol( java.util.List<String> value) {
    this.protocol = value;
  }
  public java.util.List<String> getProtocol() {
    return this.protocol;
  }
  public void set_protocol( java.util.List<Element> value) {
    this._protocol = value;
  }
  public java.util.List<Element> get_protocol() {
    return this._protocol;
  }
  public void setSummary( String value) {
    this.summary = value;
  }
  public String getSummary() {
    return this.summary;
  }
  public void set_summary( Element value) {
    this._summary = value;
  }
  public Element get_summary() {
    return this._summary;
  }
  public void setFinding( java.util.List<ClinicalImpressionFinding> value) {
    this.finding = value;
  }
  public java.util.List<ClinicalImpressionFinding> getFinding() {
    return this.finding;
  }
  public void setPrognosisCodeableConcept( java.util.List<CodeableConcept> value) {
    this.prognosisCodeableConcept = value;
  }
  public java.util.List<CodeableConcept> getPrognosisCodeableConcept() {
    return this.prognosisCodeableConcept;
  }
  public void setPrognosisReference( java.util.List<Reference> value) {
    this.prognosisReference = value;
  }
  public java.util.List<Reference> getPrognosisReference() {
    return this.prognosisReference;
  }
  public void setAction( java.util.List<Reference> value) {
    this.action = value;
  }
  public java.util.List<Reference> getAction() {
    return this.action;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClinicalImpression]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.effectiveDateTime != null) builder.append("effectiveDateTime" + "->" + this.effectiveDateTime.toString() + "\n"); 
     if(this._effectiveDateTime != null) builder.append("_effectiveDateTime" + "->" + this._effectiveDateTime.toString() + "\n"); 
     if(this.effectivePeriod != null) builder.append("effectivePeriod" + "->" + this.effectivePeriod.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.assessor != null) builder.append("assessor" + "->" + this.assessor.toString() + "\n"); 
     if(this.previous != null) builder.append("previous" + "->" + this.previous.toString() + "\n"); 
     if(this.problem != null) builder.append("problem" + "->" + this.problem.toString() + "\n"); 
     if(this.investigation != null) builder.append("investigation" + "->" + this.investigation.toString() + "\n"); 
     if(this.protocol != null) builder.append("protocol" + "->" + this.protocol.toString() + "\n"); 
     if(this._protocol != null) builder.append("_protocol" + "->" + this._protocol.toString() + "\n"); 
     if(this.summary != null) builder.append("summary" + "->" + this.summary.toString() + "\n"); 
     if(this._summary != null) builder.append("_summary" + "->" + this._summary.toString() + "\n"); 
     if(this.finding != null) builder.append("finding" + "->" + this.finding.toString() + "\n"); 
     if(this.prognosisCodeableConcept != null) builder.append("prognosisCodeableConcept" + "->" + this.prognosisCodeableConcept.toString() + "\n"); 
     if(this.prognosisReference != null) builder.append("prognosisReference" + "->" + this.prognosisReference.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	ClinicalImpression,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ClinicalImpression" : { return ClinicalImpression.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StatusEnum {
  	draft,
  	completed,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}