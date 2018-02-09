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
import com.google.gson.GsonBuilder;

/**
* "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
*/
public class ClinicalImpression  {
  /**
  * Description: "This is a ClinicalImpression resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "A unique identifier assigned to the clinical impression that remains consistent regardless of what server the impression is stored on."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the workflow status of the assessment."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Categorizes the type of clinical assessment performed."
  */
  private CodeableConcept code;

  /**
  * Description: "A summary of the context and/or cause of the assessment - why / where was it performed, and what patient events/status prompted it."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The patient or group of individuals assessed as part of this record."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "The encounter or episode of care this impression was created as part of."
  */
  private Reference context;

  /**
  * Description: "The point in time or period over which the subject was assessed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  private transient Element _effectiveDateTime;

  /**
  * Description: "The point in time or period over which the subject was assessed."
  */
  private Period effectivePeriod;

  /**
  * Description: "Indicates when the documentation of the assessment was complete."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "The clinician performing the assessment."
  */
  private Reference assessor;

  /**
  * Description: "A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes."
  */
  private Reference previous;

  /**
  * Description: "This a list of the relevant problems/conditions for a patient."
  */
  private java.util.List<Reference> problem = new java.util.ArrayList<>();

  /**
  * Description: "One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes."
  */
  private java.util.List<ClinicalImpressionInvestigation> investigation = new java.util.ArrayList<>();

  /**
  * Description: "Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis."
  */
  private java.util.List<String> protocol = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for protocol"
  */
  private transient java.util.List<Element> _protocol = new java.util.ArrayList<>();

  /**
  * Description: "A text summary of the investigations and the diagnosis."
  */
  private String summary;

  /**
  * Description: "Extensions for summary"
  */
  private transient Element _summary;

  /**
  * Description: "Specific findings or diagnoses that was considered likely or relevant to ongoing treatment."
  */
  private java.util.List<ClinicalImpressionFinding> finding = new java.util.ArrayList<>();

  /**
  * Description: "Estimate of likely outcome."
  */
  private java.util.List<CodeableConcept> prognosisCodeableConcept = new java.util.ArrayList<>();

  /**
  * Description: "RiskAssessment expressing likely outcome."
  */
  private java.util.List<Reference> prognosisReference = new java.util.ArrayList<>();

  /**
  * Description: "Action taken as part of assessment procedure."
  */
  private java.util.List<Reference> action = new java.util.ArrayList<>();

  /**
  * Description: "Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public ClinicalImpression() {
  }

  public ClinicalImpression(ClinicalImpressionModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.code = CodeableConcept.fromJson(o.getCode());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      if (null != o.getEffectiveDateTime()) {
        this.effectiveDateTime = new String(o.getEffectiveDateTime());
      }

      this.effectivePeriod = Period.fromJson(o.getEffectivePeriod());
      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      if (null != o.getAssessor()) {
        this.assessor = new Reference(o.getAssessor());
        this.assessor.setId(this.getId());
      }

      if (null != o.getPrevious()) {
        this.previous = new Reference(o.getPrevious());
        this.previous.setId(this.getId());
      }

      this.problem = Reference.fromArray(o.getProblem());

      this.investigation = ClinicalImpressionInvestigation.fromArray(o.getInvestigation());

      this.protocol = org.fhir.utils.JsonUtils.json2Array(o.getProtocol());

      if (null != o.getSummary()) {
        this.summary = new String(o.getSummary());
      }

      this.finding = ClinicalImpressionFinding.fromArray(o.getFinding());

      this.prognosisCodeableConcept = CodeableConcept.fromArray(o.getPrognosisCodeableConcept());
      this.prognosisReference = Reference.fromArray(o.getPrognosisReference());

      this.action = Reference.fromArray(o.getAction());

      this.note = Annotation.fromArray(o.getNote());
      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("effectiveDateTime" + "[" + String.valueOf(this.effectiveDateTime) + "]\n"); 
     builder.append("_effectiveDateTime" + "[" + String.valueOf(this._effectiveDateTime) + "]\n"); 
     builder.append("effectivePeriod" + "[" + String.valueOf(this.effectivePeriod) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("assessor" + "[" + String.valueOf(this.assessor) + "]\n"); 
     builder.append("previous" + "[" + String.valueOf(this.previous) + "]\n"); 
     builder.append("problem" + "[" + String.valueOf(this.problem) + "]\n"); 
     builder.append("investigation" + "[" + String.valueOf(this.investigation) + "]\n"); 
     builder.append("protocol" + "[" + String.valueOf(this.protocol) + "]\n"); 
     builder.append("_protocol" + "[" + String.valueOf(this._protocol) + "]\n"); 
     builder.append("summary" + "[" + String.valueOf(this.summary) + "]\n"); 
     builder.append("_summary" + "[" + String.valueOf(this._summary) + "]\n"); 
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
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

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

  public static java.util.List<ClinicalImpression> fromArray(java.util.List<ClinicalImpressionModel> list) {
    return (java.util.List<ClinicalImpression>)list.stream()
      .map(model -> new ClinicalImpression(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ClinicalImpressionModel> toModelArray(java.util.List<ClinicalImpression> list) {
    return (java.util.List<ClinicalImpressionModel>)list.stream()
      .map(model -> new ClinicalImpressionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ClinicalImpression fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ClinicalImpression.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ClinicalImpression o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ClinicalImpression> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}