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
import com.google.gson.GsonBuilder;

/**
* "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
*/
public class DiagnosticReport  {
  /**
  * Description: "This is a DiagnosticReport resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this report by the performer or other systems."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Details concerning a test or procedure requested."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "The status of the diagnostic report as a whole."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes."
  */
  private CodeableConcept category;

  /**
  * Description: "A code or name that describes this diagnostic report."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept code;

  /**
  * Description: "The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources."
  */
  private Reference subject;

  /**
  * Description: "The healthcare event  (e.g. a patient and healthcare provider interaction) which this DiagnosticReport per is about."
  */
  private Reference context;

  /**
  * Description: "The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  private transient Element _effectiveDateTime;

  /**
  * Description: "The time or time-period the observed values are related to. When the subject of the report is a patient, this is usually either the time of the procedure or of specimen collection(s), but very often the source of the date/time is not known, only the date/time itself."
  */
  private Period effectivePeriod;

  /**
  * Description: "The date and time that this version of the report was released from the source diagnostic service."
  */
  private String issued;

  /**
  * Description: "Extensions for issued"
  */
  private transient Element _issued;

  /**
  * Description: "Indicates who or what participated in producing the report."
  */
  private java.util.List<DiagnosticReportPerformer> performer = new java.util.ArrayList<>();

  /**
  * Description: "Details about the specimens on which this diagnostic report is based."
  */
  private java.util.List<Reference> specimen = new java.util.ArrayList<>();

  /**
  * Description: "Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. \"atomic\" results), or they can be grouping observations that include references to other members of the group (e.g. \"panels\")."
  */
  private java.util.List<Reference> result = new java.util.ArrayList<>();

  /**
  * Description: "One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images."
  */
  private java.util.List<Reference> imagingStudy = new java.util.ArrayList<>();

  /**
  * Description: "A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest)."
  */
  private java.util.List<DiagnosticReportImage> image = new java.util.ArrayList<>();

  /**
  * Description: "Concise and clinically contextualized impression / summary of the diagnostic report."
  */
  private String conclusion;

  /**
  * Description: "Extensions for conclusion"
  */
  private transient Element _conclusion;

  /**
  * Description: "Codes for the conclusion."
  */
  private java.util.List<CodeableConcept> codedDiagnosis = new java.util.ArrayList<>();

  /**
  * Description: "Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent."
  */
  private java.util.List<Attachment> presentedForm = new java.util.ArrayList<>();

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

  public DiagnosticReport() {
  }

  public DiagnosticReport(DiagnosticReportModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.basedOn = Reference.fromArray(o.getBasedOn());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.category = CodeableConcept.fromJson(o.getCategory());
      this.code = CodeableConcept.fromJson(o.getCode());
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
      if (null != o.getIssued()) {
        this.issued = new String(o.getIssued());
      }

      this.performer = DiagnosticReportPerformer.fromArray(o.getPerformer());

      this.specimen = Reference.fromArray(o.getSpecimen());

      this.result = Reference.fromArray(o.getResult());

      this.imagingStudy = Reference.fromArray(o.getImagingStudy());

      this.image = DiagnosticReportImage.fromArray(o.getImage());

      if (null != o.getConclusion()) {
        this.conclusion = new String(o.getConclusion());
      }

      this.codedDiagnosis = CodeableConcept.fromArray(o.getCodedDiagnosis());
      this.presentedForm = Attachment.fromArray(o.getPresentedForm());
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
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("effectiveDateTime" + "[" + String.valueOf(this.effectiveDateTime) + "]\n"); 
     builder.append("_effectiveDateTime" + "[" + String.valueOf(this._effectiveDateTime) + "]\n"); 
     builder.append("effectivePeriod" + "[" + String.valueOf(this.effectivePeriod) + "]\n"); 
     builder.append("issued" + "[" + String.valueOf(this.issued) + "]\n"); 
     builder.append("_issued" + "[" + String.valueOf(this._issued) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("specimen" + "[" + String.valueOf(this.specimen) + "]\n"); 
     builder.append("result" + "[" + String.valueOf(this.result) + "]\n"); 
     builder.append("imagingStudy" + "[" + String.valueOf(this.imagingStudy) + "]\n"); 
     builder.append("image" + "[" + String.valueOf(this.image) + "]\n"); 
     builder.append("conclusion" + "[" + String.valueOf(this.conclusion) + "]\n"); 
     builder.append("_conclusion" + "[" + String.valueOf(this._conclusion) + "]\n"); 
     builder.append("codedDiagnosis" + "[" + String.valueOf(this.codedDiagnosis) + "]\n"); 
     builder.append("presentedForm" + "[" + String.valueOf(this.presentedForm) + "]\n"); 
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

  public static java.util.List<DiagnosticReport> fromArray(java.util.List<DiagnosticReportModel> list) {
    return (java.util.List<DiagnosticReport>)list.stream()
      .map(model -> new DiagnosticReport(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DiagnosticReportModel> toModelArray(java.util.List<DiagnosticReport> list) {
    return (java.util.List<DiagnosticReportModel>)list.stream()
      .map(model -> new DiagnosticReportModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DiagnosticReport fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DiagnosticReport.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DiagnosticReport o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DiagnosticReport> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}