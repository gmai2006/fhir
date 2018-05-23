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
* "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy."
*/
@Entity
@Table(name="fhirprocedure")
public class ProcedureModel  implements Serializable {
	private static final long serialVersionUID = 151967883225397184L;
  /**
  * Description: "This is a Procedure resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"definition_id\"")
  private String definition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="definition_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition;

  /**
  * Description: "A reference to a resource that contains details of the request for this procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "A larger event of which this particular procedure is a component or step."
  */
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="partof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf;

  /**
  * Description: "A code specifying the state of the procedure. Generally this will be in-progress or completed state."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Set this to true if the record is saying that the procedure was NOT performed."
  */
  @javax.persistence.Basic
  @Column(name="\"notDone\"")
  private Boolean notDone;

  /**
  * Description: "A code indicating why the procedure was not performed."
  */
  @javax.persistence.Basic
  @Column(name="\"notdonereason_id\"")
  private String notdonereason_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="notdonereason_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> notDoneReason;

  /**
  * Description: "A code that classifies the procedure for searching, sorting and display purposes (e.g. \"Surgical Procedure\")."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. \"Laparoscopic Appendectomy\")."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The person, animal or group on which the procedure was performed."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The encounter during which the procedure was performed."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"performedDateTime\"")
  private String performedDateTime;

  /**
  * Description: "The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"performedPeriod\"", length = 16777215)
  private String performedPeriod;

  /**
  * Description: "Limited to 'real' people rather than equipment."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="performer_id", insertable=false, updatable=false)
  private java.util.List<ProcedurePerformerModel> performer;

  /**
  * Description: "The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="location_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location;

  /**
  * Description: "The coded reason why the procedure was performed. This may be coded entity of some type, or may simply be present as text."
  */
  @javax.persistence.Basic
  @Column(name="\"reasoncode_id\"")
  private String reasoncode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reasoncode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reasonCode;

  /**
  * Description: "The condition that is the reason why the procedure was performed."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reasonreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference;

  /**
  * Description: "Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion."
  */
  @javax.persistence.Basic
  @Column(name="\"bodysite_id\"")
  private String bodysite_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="bodysite_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> bodySite;

  /**
  * Description: "The outcome of the procedure - did it resolve reasons for the procedure being performed?"
  */
  @javax.persistence.Basic
  @Column(name="\"outcome_id\"")
  private String outcome_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="outcome_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> outcome;

  /**
  * Description: "This could be a histology result, pathology report, surgical report, etc.."
  */
  @javax.persistence.Basic
  @Column(name="\"report_id\"")
  private String report_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="report_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> report;

  /**
  * Description: "Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues."
  */
  @javax.persistence.Basic
  @Column(name="\"complication_id\"")
  private String complication_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="complication_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> complication;

  /**
  * Description: "Any complications that occurred during the procedure, or in the immediate post-performance period."
  */
  @javax.persistence.Basic
  @Column(name="\"complicationdetail_id\"")
  private String complicationdetail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="complicationdetail_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> complicationDetail;

  /**
  * Description: "If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used."
  */
  @javax.persistence.Basic
  @Column(name="\"followup_id\"")
  private String followup_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="followup_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> followUp;

  /**
  * Description: "Any other notes about the procedure.  E.g. the operative notes."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"focaldevice_id\"")
  private String focaldevice_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="focaldevice_id", insertable=false, updatable=false)
  private java.util.List<ProcedureFocalDeviceModel> focalDevice;

  /**
  * Description: "Identifies medications, devices and any other substance used as part of the procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"usedreference_id\"")
  private String usedreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="usedreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> usedReference;

  /**
  * Description: "Identifies coded items that were used as part of the procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"usedcode_id\"")
  private String usedcode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="usedcode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> usedCode;

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

  public ProcedureModel() {
  }

  public ProcedureModel(Procedure o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition_id = "definition" + this.id;
    	this.definition = ReferenceHelper.toModelFromArray(o.getDefinition(), this.definition_id);
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partof_id = "partof" + this.id;
    	this.partOf = ReferenceHelper.toModelFromArray(o.getPartOf(), this.partof_id);
    }
    this.status = o.getStatus();
    this.notDone = o.getNotDone();
    if (null != o.getNotDoneReason() ) {
    	this.notdonereason_id = "notdonereason" + this.id;
    	this.notDoneReason = CodeableConceptHelper.toModel(o.getNotDoneReason(), this.notdonereason_id);
    }
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
    this.performedDateTime = o.getPerformedDateTime();
    if (null != o.getPerformedPeriod()) {
    	this.performedPeriod = JsonUtils.toJson(o.getPerformedPeriod());
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer_id = "performer" + this.id;
    	this.performer = ProcedurePerformerHelper.toModelFromArray(o.getPerformer(), this.performer_id);
    }
    if (null != o.getLocation() ) {
    	this.location_id = "location" + this.id;
    	this.location = ReferenceHelper.toModel(o.getLocation(), this.location_id);
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasoncode_id = "reasoncode" + this.id;
    	this.reasonCode = CodeableConceptHelper.toModelFromArray(o.getReasonCode(), this.reasoncode_id);
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonreference_id = "reasonreference" + this.id;
    	this.reasonReference = ReferenceHelper.toModelFromArray(o.getReasonReference(), this.reasonreference_id);
    }
    if (null != o.getBodySite() && !o.getBodySite().isEmpty()) {
    	this.bodysite_id = "bodysite" + this.id;
    	this.bodySite = CodeableConceptHelper.toModelFromArray(o.getBodySite(), this.bodysite_id);
    }
    if (null != o.getOutcome() ) {
    	this.outcome_id = "outcome" + this.id;
    	this.outcome = CodeableConceptHelper.toModel(o.getOutcome(), this.outcome_id);
    }
    if (null != o.getReport() && !o.getReport().isEmpty()) {
    	this.report_id = "report" + this.id;
    	this.report = ReferenceHelper.toModelFromArray(o.getReport(), this.report_id);
    }
    if (null != o.getComplication() && !o.getComplication().isEmpty()) {
    	this.complication_id = "complication" + this.id;
    	this.complication = CodeableConceptHelper.toModelFromArray(o.getComplication(), this.complication_id);
    }
    if (null != o.getComplicationDetail() && !o.getComplicationDetail().isEmpty()) {
    	this.complicationdetail_id = "complicationdetail" + this.id;
    	this.complicationDetail = ReferenceHelper.toModelFromArray(o.getComplicationDetail(), this.complicationdetail_id);
    }
    if (null != o.getFollowUp() && !o.getFollowUp().isEmpty()) {
    	this.followup_id = "followup" + this.id;
    	this.followUp = CodeableConceptHelper.toModelFromArray(o.getFollowUp(), this.followup_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getFocalDevice() && !o.getFocalDevice().isEmpty()) {
    	this.focaldevice_id = "focaldevice" + this.id;
    	this.focalDevice = ProcedureFocalDeviceHelper.toModelFromArray(o.getFocalDevice(), this.focaldevice_id);
    }
    if (null != o.getUsedReference() && !o.getUsedReference().isEmpty()) {
    	this.usedreference_id = "usedreference" + this.id;
    	this.usedReference = ReferenceHelper.toModelFromArray(o.getUsedReference(), this.usedreference_id);
    }
    if (null != o.getUsedCode() && !o.getUsedCode().isEmpty()) {
    	this.usedcode_id = "usedcode" + this.id;
    	this.usedCode = CodeableConceptHelper.toModelFromArray(o.getUsedCode(), this.usedcode_id);
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
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public Boolean getNotDone() {
    return this.notDone;
  }
  public void setNotDone( Boolean value) {
    this.notDone = value;
  }
  public java.util.List<CodeableConceptModel> getNotDoneReason() {
    return this.notDoneReason;
  }
  public void setNotDoneReason( java.util.List<CodeableConceptModel> value) {
    this.notDoneReason = value;
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
  public String getPerformedDateTime() {
    return this.performedDateTime;
  }
  public void setPerformedDateTime( String value) {
    this.performedDateTime = value;
  }
  public String getPerformedPeriod() {
    return this.performedPeriod;
  }
  public void setPerformedPeriod( String value) {
    this.performedPeriod = value;
  }
  public java.util.List<ProcedurePerformerModel> getPerformer() {
    return this.performer;
  }
  public void setPerformer( java.util.List<ProcedurePerformerModel> value) {
    this.performer = value;
  }
  public java.util.List<ReferenceModel> getLocation() {
    return this.location;
  }
  public void setLocation( java.util.List<ReferenceModel> value) {
    this.location = value;
  }
  public java.util.List<CodeableConceptModel> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonCode( java.util.List<CodeableConceptModel> value) {
    this.reasonCode = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public java.util.List<CodeableConceptModel> getBodySite() {
    return this.bodySite;
  }
  public void setBodySite( java.util.List<CodeableConceptModel> value) {
    this.bodySite = value;
  }
  public java.util.List<CodeableConceptModel> getOutcome() {
    return this.outcome;
  }
  public void setOutcome( java.util.List<CodeableConceptModel> value) {
    this.outcome = value;
  }
  public java.util.List<ReferenceModel> getReport() {
    return this.report;
  }
  public void setReport( java.util.List<ReferenceModel> value) {
    this.report = value;
  }
  public java.util.List<CodeableConceptModel> getComplication() {
    return this.complication;
  }
  public void setComplication( java.util.List<CodeableConceptModel> value) {
    this.complication = value;
  }
  public java.util.List<ReferenceModel> getComplicationDetail() {
    return this.complicationDetail;
  }
  public void setComplicationDetail( java.util.List<ReferenceModel> value) {
    this.complicationDetail = value;
  }
  public java.util.List<CodeableConceptModel> getFollowUp() {
    return this.followUp;
  }
  public void setFollowUp( java.util.List<CodeableConceptModel> value) {
    this.followUp = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<ProcedureFocalDeviceModel> getFocalDevice() {
    return this.focalDevice;
  }
  public void setFocalDevice( java.util.List<ProcedureFocalDeviceModel> value) {
    this.focalDevice = value;
  }
  public java.util.List<ReferenceModel> getUsedReference() {
    return this.usedReference;
  }
  public void setUsedReference( java.util.List<ReferenceModel> value) {
    this.usedReference = value;
  }
  public java.util.List<CodeableConceptModel> getUsedCode() {
    return this.usedCode;
  }
  public void setUsedCode( java.util.List<CodeableConceptModel> value) {
    this.usedCode = value;
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
    builder.append("[ProcedureModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("notDone" + "->" + this.notDone + "\n"); 
     builder.append("performedDateTime" + "->" + this.performedDateTime + "\n"); 
     builder.append("performedPeriod" + "->" + this.performedPeriod + "\n"); 
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
    builder.append("[ProcedureModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("basedOn" + "->" + this.basedOn + "\n"); 
     builder.append("partOf" + "->" + this.partOf + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("notDone" + "->" + this.notDone + "\n"); 
     builder.append("notDoneReason" + "->" + this.notDoneReason + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("performedDateTime" + "->" + this.performedDateTime + "\n"); 
     builder.append("performedPeriod" + "->" + this.performedPeriod + "\n"); 
     builder.append("performer" + "->" + this.performer + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("reasonCode" + "->" + this.reasonCode + "\n"); 
     builder.append("reasonReference" + "->" + this.reasonReference + "\n"); 
     builder.append("bodySite" + "->" + this.bodySite + "\n"); 
     builder.append("outcome" + "->" + this.outcome + "\n"); 
     builder.append("report" + "->" + this.report + "\n"); 
     builder.append("complication" + "->" + this.complication + "\n"); 
     builder.append("complicationDetail" + "->" + this.complicationDetail + "\n"); 
     builder.append("followUp" + "->" + this.followUp + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("focalDevice" + "->" + this.focalDevice + "\n"); 
     builder.append("usedReference" + "->" + this.usedReference + "\n"); 
     builder.append("usedCode" + "->" + this.usedCode + "\n"); 
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