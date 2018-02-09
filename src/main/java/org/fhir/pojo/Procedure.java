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
import org.fhir.entity.ProcedureModel;
import com.google.gson.GsonBuilder;

/**
* "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy."
*/
public class Procedure  {
  /**
  * Description: "This is a Procedure resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this procedure."
  */
  private java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "A reference to a resource that contains details of the request for this procedure."
  */
  private java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "A larger event of which this particular procedure is a component or step."
  */
  private java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "A code specifying the state of the procedure. Generally this will be in-progress or completed state."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Set this to true if the record is saying that the procedure was NOT performed."
  */
  private Boolean notDone;

  /**
  * Description: "Extensions for notDone"
  */
  private transient Element _notDone;

  /**
  * Description: "A code indicating why the procedure was not performed."
  */
  private CodeableConcept notDoneReason;

  /**
  * Description: "A code that classifies the procedure for searching, sorting and display purposes (e.g. \"Surgical Procedure\")."
  */
  private CodeableConcept category;

  /**
  * Description: "The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. \"Laparoscopic Appendectomy\")."
  */
  private CodeableConcept code;

  /**
  * Description: "The person, animal or group on which the procedure was performed."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "The encounter during which the procedure was performed."
  */
  private Reference context;

  /**
  * Description: "The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String performedDateTime;

  /**
  * Description: "Extensions for performedDateTime"
  */
  private transient Element _performedDateTime;

  /**
  * Description: "The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured."
  */
  private Period performedPeriod;

  /**
  * Description: "Limited to 'real' people rather than equipment."
  */
  private java.util.List<ProcedurePerformer> performer = new java.util.ArrayList<>();

  /**
  * Description: "The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant."
  */
  private Reference location;

  /**
  * Description: "The coded reason why the procedure was performed. This may be coded entity of some type, or may simply be present as text."
  */
  private java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "The condition that is the reason why the procedure was performed."
  */
  private java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion."
  */
  private java.util.List<CodeableConcept> bodySite = new java.util.ArrayList<>();

  /**
  * Description: "The outcome of the procedure - did it resolve reasons for the procedure being performed?"
  */
  private CodeableConcept outcome;

  /**
  * Description: "This could be a histology result, pathology report, surgical report, etc.."
  */
  private java.util.List<Reference> report = new java.util.ArrayList<>();

  /**
  * Description: "Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues."
  */
  private java.util.List<CodeableConcept> complication = new java.util.ArrayList<>();

  /**
  * Description: "Any complications that occurred during the procedure, or in the immediate post-performance period."
  */
  private java.util.List<Reference> complicationDetail = new java.util.ArrayList<>();

  /**
  * Description: "If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used."
  */
  private java.util.List<CodeableConcept> followUp = new java.util.ArrayList<>();

  /**
  * Description: "Any other notes about the procedure.  E.g. the operative notes."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure."
  */
  private java.util.List<ProcedureFocalDevice> focalDevice = new java.util.ArrayList<>();

  /**
  * Description: "Identifies medications, devices and any other substance used as part of the procedure."
  */
  private java.util.List<Reference> usedReference = new java.util.ArrayList<>();

  /**
  * Description: "Identifies coded items that were used as part of the procedure."
  */
  private java.util.List<CodeableConcept> usedCode = new java.util.ArrayList<>();

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

  public Procedure() {
  }

  public Procedure(ProcedureModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.definition = Reference.fromArray(o.getDefinition());

      this.basedOn = Reference.fromArray(o.getBasedOn());

      this.partOf = Reference.fromArray(o.getPartOf());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getNotDone()) {
        this.notDone = new Boolean(o.getNotDone());
      }

      this.notDoneReason = CodeableConcept.fromJson(o.getNotDoneReason());
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

      if (null != o.getPerformedDateTime()) {
        this.performedDateTime = new String(o.getPerformedDateTime());
      }

      this.performedPeriod = Period.fromJson(o.getPerformedPeriod());
      this.performer = ProcedurePerformer.fromArray(o.getPerformer());

      if (null != o.getLocation()) {
        this.location = new Reference(o.getLocation());
        this.location.setId(this.getId());
      }

      this.reasonCode = CodeableConcept.fromArray(o.getReasonCode());
      this.reasonReference = Reference.fromArray(o.getReasonReference());

      this.bodySite = CodeableConcept.fromArray(o.getBodySite());
      this.outcome = CodeableConcept.fromJson(o.getOutcome());
      this.report = Reference.fromArray(o.getReport());

      this.complication = CodeableConcept.fromArray(o.getComplication());
      this.complicationDetail = Reference.fromArray(o.getComplicationDetail());

      this.followUp = CodeableConcept.fromArray(o.getFollowUp());
      this.note = Annotation.fromArray(o.getNote());
      this.focalDevice = ProcedureFocalDevice.fromArray(o.getFocalDevice());

      this.usedReference = Reference.fromArray(o.getUsedReference());

      this.usedCode = CodeableConcept.fromArray(o.getUsedCode());
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
  public void setDefinition( java.util.List<Reference> value) {
    this.definition = value;
  }
  public java.util.List<Reference> getDefinition() {
    return this.definition;
  }
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
  }
  public void setStatus( String value) {
    this.status = value;
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
  public void setNotDone( Boolean value) {
    this.notDone = value;
  }
  public Boolean getNotDone() {
    return this.notDone;
  }
  public void set_notDone( Element value) {
    this._notDone = value;
  }
  public Element get_notDone() {
    return this._notDone;
  }
  public void setNotDoneReason( CodeableConcept value) {
    this.notDoneReason = value;
  }
  public CodeableConcept getNotDoneReason() {
    return this.notDoneReason;
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
  public void setPerformedDateTime( String value) {
    this.performedDateTime = value;
  }
  public String getPerformedDateTime() {
    return this.performedDateTime;
  }
  public void set_performedDateTime( Element value) {
    this._performedDateTime = value;
  }
  public Element get_performedDateTime() {
    return this._performedDateTime;
  }
  public void setPerformedPeriod( Period value) {
    this.performedPeriod = value;
  }
  public Period getPerformedPeriod() {
    return this.performedPeriod;
  }
  public void setPerformer( java.util.List<ProcedurePerformer> value) {
    this.performer = value;
  }
  public java.util.List<ProcedurePerformer> getPerformer() {
    return this.performer;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setReasonCode( java.util.List<CodeableConcept> value) {
    this.reasonCode = value;
  }
  public java.util.List<CodeableConcept> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonReference( java.util.List<Reference> value) {
    this.reasonReference = value;
  }
  public java.util.List<Reference> getReasonReference() {
    return this.reasonReference;
  }
  public void setBodySite( java.util.List<CodeableConcept> value) {
    this.bodySite = value;
  }
  public java.util.List<CodeableConcept> getBodySite() {
    return this.bodySite;
  }
  public void setOutcome( CodeableConcept value) {
    this.outcome = value;
  }
  public CodeableConcept getOutcome() {
    return this.outcome;
  }
  public void setReport( java.util.List<Reference> value) {
    this.report = value;
  }
  public java.util.List<Reference> getReport() {
    return this.report;
  }
  public void setComplication( java.util.List<CodeableConcept> value) {
    this.complication = value;
  }
  public java.util.List<CodeableConcept> getComplication() {
    return this.complication;
  }
  public void setComplicationDetail( java.util.List<Reference> value) {
    this.complicationDetail = value;
  }
  public java.util.List<Reference> getComplicationDetail() {
    return this.complicationDetail;
  }
  public void setFollowUp( java.util.List<CodeableConcept> value) {
    this.followUp = value;
  }
  public java.util.List<CodeableConcept> getFollowUp() {
    return this.followUp;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setFocalDevice( java.util.List<ProcedureFocalDevice> value) {
    this.focalDevice = value;
  }
  public java.util.List<ProcedureFocalDevice> getFocalDevice() {
    return this.focalDevice;
  }
  public void setUsedReference( java.util.List<Reference> value) {
    this.usedReference = value;
  }
  public java.util.List<Reference> getUsedReference() {
    return this.usedReference;
  }
  public void setUsedCode( java.util.List<CodeableConcept> value) {
    this.usedCode = value;
  }
  public java.util.List<CodeableConcept> getUsedCode() {
    return this.usedCode;
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
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("notDone" + "[" + String.valueOf(this.notDone) + "]\n"); 
     builder.append("_notDone" + "[" + String.valueOf(this._notDone) + "]\n"); 
     builder.append("notDoneReason" + "[" + String.valueOf(this.notDoneReason) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("performedDateTime" + "[" + String.valueOf(this.performedDateTime) + "]\n"); 
     builder.append("_performedDateTime" + "[" + String.valueOf(this._performedDateTime) + "]\n"); 
     builder.append("performedPeriod" + "[" + String.valueOf(this.performedPeriod) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("report" + "[" + String.valueOf(this.report) + "]\n"); 
     builder.append("complication" + "[" + String.valueOf(this.complication) + "]\n"); 
     builder.append("complicationDetail" + "[" + String.valueOf(this.complicationDetail) + "]\n"); 
     builder.append("followUp" + "[" + String.valueOf(this.followUp) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("focalDevice" + "[" + String.valueOf(this.focalDevice) + "]\n"); 
     builder.append("usedReference" + "[" + String.valueOf(this.usedReference) + "]\n"); 
     builder.append("usedCode" + "[" + String.valueOf(this.usedCode) + "]\n"); 
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
  	Procedure,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Procedure" : { return Procedure.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Procedure> fromArray(java.util.List<ProcedureModel> list) {
    return (java.util.List<Procedure>)list.stream()
      .map(model -> new Procedure(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ProcedureModel> toModelArray(java.util.List<Procedure> list) {
    return (java.util.List<ProcedureModel>)list.stream()
      .map(model -> new ProcedureModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Procedure fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Procedure.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Procedure o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Procedure> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}