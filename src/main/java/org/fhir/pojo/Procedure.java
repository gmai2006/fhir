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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Procedure  extends DomainResource  {
  /**
  * Description: "This is a Procedure resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this procedure."
  */
  protected java.util.List<Reference> definition;

  /**
  * Description: "A reference to a resource that contains details of the request for this procedure."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "A larger event of which this particular procedure is a component or step."
  */
  protected java.util.List<Reference> partOf;

  /**
  * Description: "A code specifying the state of the procedure. Generally this will be in-progress or completed state."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Set this to true if the record is saying that the procedure was NOT performed."
  */
  protected Boolean notDone;

  /**
  * Description: "Extensions for notDone"
  */
  protected transient Element _notDone;

  /**
  * Description: "A code indicating why the procedure was not performed."
  */
  protected CodeableConcept notDoneReason;

  /**
  * Description: "A code that classifies the procedure for searching, sorting and display purposes (e.g. \"Surgical Procedure\")."
  */
  protected CodeableConcept category;

  /**
  * Description: "The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. \"Laparoscopic Appendectomy\")."
  */
  protected CodeableConcept code;

  /**
  * Description: "The person, animal or group on which the procedure was performed."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "The encounter during which the procedure was performed."
  */
  protected Reference context;

  /**
  * Description: "The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String performedDateTime;

  /**
  * Description: "Extensions for performedDateTime"
  */
  protected transient Element _performedDateTime;

  /**
  * Description: "The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured."
  */
  protected Period performedPeriod;

  /**
  * Description: "Limited to 'real' people rather than equipment."
  */
  protected java.util.List<ProcedurePerformer> performer;

  /**
  * Description: "The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant."
  */
  protected Reference location;

  /**
  * Description: "The coded reason why the procedure was performed. This may be coded entity of some type, or may simply be present as text."
  */
  protected java.util.List<CodeableConcept> reasonCode;

  /**
  * Description: "The condition that is the reason why the procedure was performed."
  */
  protected java.util.List<Reference> reasonReference;

  /**
  * Description: "Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion."
  */
  protected java.util.List<CodeableConcept> bodySite;

  /**
  * Description: "The outcome of the procedure - did it resolve reasons for the procedure being performed?"
  */
  protected CodeableConcept outcome;

  /**
  * Description: "This could be a histology result, pathology report, surgical report, etc.."
  */
  protected java.util.List<Reference> report;

  /**
  * Description: "Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues."
  */
  protected java.util.List<CodeableConcept> complication;

  /**
  * Description: "Any complications that occurred during the procedure, or in the immediate post-performance period."
  */
  protected java.util.List<Reference> complicationDetail;

  /**
  * Description: "If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used."
  */
  protected java.util.List<CodeableConcept> followUp;

  /**
  * Description: "Any other notes about the procedure.  E.g. the operative notes."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure."
  */
  protected java.util.List<ProcedureFocalDevice> focalDevice;

  /**
  * Description: "Identifies medications, devices and any other substance used as part of the procedure."
  */
  protected java.util.List<Reference> usedReference;

  /**
  * Description: "Identifies coded items that were used as part of the procedure."
  */
  protected java.util.List<CodeableConcept> usedCode;

  public Procedure() {
  }

  public Procedure(ProcedureModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition = ReferenceHelper.fromArray2Array(o.getDefinition());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partOf = ReferenceHelper.fromArray2Array(o.getPartOf());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getNotDone()) {
      this.notDone = o.getNotDone();
    }
    if (null != o.getNotDoneReason() && !o.getNotDoneReason().isEmpty()) {
      this.notDoneReason = new CodeableConcept(o.getNotDoneReason().get(0));
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
    if (null != o.getPerformedDateTime()) {
      this.performedDateTime = o.getPerformedDateTime();
    }
    this.performedPeriod = PeriodHelper.fromJson(o.getPerformedPeriod());
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer = ProcedurePerformerHelper.fromArray2Array(o.getPerformer());
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
      this.location = new Reference(o.getLocation().get(0));
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasonCode = CodeableConceptHelper.fromArray2Array(o.getReasonCode());
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (null != o.getBodySite() && !o.getBodySite().isEmpty()) {
    	this.bodySite = CodeableConceptHelper.fromArray2Array(o.getBodySite());
    }
    if (null != o.getOutcome() && !o.getOutcome().isEmpty()) {
      this.outcome = new CodeableConcept(o.getOutcome().get(0));
    }
    if (null != o.getReport() && !o.getReport().isEmpty()) {
    	this.report = ReferenceHelper.fromArray2Array(o.getReport());
    }
    if (null != o.getComplication() && !o.getComplication().isEmpty()) {
    	this.complication = CodeableConceptHelper.fromArray2Array(o.getComplication());
    }
    if (null != o.getComplicationDetail() && !o.getComplicationDetail().isEmpty()) {
    	this.complicationDetail = ReferenceHelper.fromArray2Array(o.getComplicationDetail());
    }
    if (null != o.getFollowUp() && !o.getFollowUp().isEmpty()) {
    	this.followUp = CodeableConceptHelper.fromArray2Array(o.getFollowUp());
    }
    if (null != o.getFocalDevice() && !o.getFocalDevice().isEmpty()) {
    	this.focalDevice = ProcedureFocalDeviceHelper.fromArray2Array(o.getFocalDevice());
    }
    if (null != o.getUsedReference() && !o.getUsedReference().isEmpty()) {
    	this.usedReference = ReferenceHelper.fromArray2Array(o.getUsedReference());
    }
    if (null != o.getUsedCode() && !o.getUsedCode().isEmpty()) {
    	this.usedCode = CodeableConceptHelper.fromArray2Array(o.getUsedCode());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Procedure]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.notDone != null) builder.append("notDone" + "->" + this.notDone.toString() + "\n"); 
     if(this._notDone != null) builder.append("_notDone" + "->" + this._notDone.toString() + "\n"); 
     if(this.notDoneReason != null) builder.append("notDoneReason" + "->" + this.notDoneReason.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.performedDateTime != null) builder.append("performedDateTime" + "->" + this.performedDateTime.toString() + "\n"); 
     if(this._performedDateTime != null) builder.append("_performedDateTime" + "->" + this._performedDateTime.toString() + "\n"); 
     if(this.performedPeriod != null) builder.append("performedPeriod" + "->" + this.performedPeriod.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.reasonCode != null) builder.append("reasonCode" + "->" + this.reasonCode.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); 
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this.report != null) builder.append("report" + "->" + this.report.toString() + "\n"); 
     if(this.complication != null) builder.append("complication" + "->" + this.complication.toString() + "\n"); 
     if(this.complicationDetail != null) builder.append("complicationDetail" + "->" + this.complicationDetail.toString() + "\n"); 
     if(this.followUp != null) builder.append("followUp" + "->" + this.followUp.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.focalDevice != null) builder.append("focalDevice" + "->" + this.focalDevice.toString() + "\n"); 
     if(this.usedReference != null) builder.append("usedReference" + "->" + this.usedReference.toString() + "\n"); 
     if(this.usedCode != null) builder.append("usedCode" + "->" + this.usedCode.toString() + "\n"); ;
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

}