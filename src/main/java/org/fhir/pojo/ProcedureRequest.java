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
import org.fhir.entity.ProcedureRequestModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of a request for diagnostic investigations, treatments, or operations to be performed."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProcedureRequest  extends DomainResource  {
  /**
  * Description: "This is a ProcedureRequest resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Protocol or definition followed by this request."
  */
  protected java.util.List<Reference> definition;

  /**
  * Description: "Plan/proposal/order fulfilled by this request."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "The request takes the place of the referenced completed or terminated request(s)."
  */
  protected java.util.List<Reference> replaces;

  /**
  * Description: "A shared identifier common to all procedure or diagnostic requests that were authorized more or less simultaneously by a single author, representing the composite or group identifier."
  */
  protected Identifier requisition;

  /**
  * Description: "The status of the order."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Whether the request is a proposal, plan, an original order or a reflex order."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String intent;

  /**
  * Description: "Extensions for intent"
  */
  protected transient Element _intent;

  /**
  * Description: "Indicates how quickly the ProcedureRequest should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String priority;

  /**
  * Description: "Extensions for priority"
  */
  protected transient Element _priority;

  /**
  * Description: "Set this to true if the record is saying that the procedure should NOT be performed."
  */
  protected Boolean doNotPerform;

  /**
  * Description: "Extensions for doNotPerform"
  */
  protected transient Element _doNotPerform;

  /**
  * Description: "A code that classifies the procedure for searching, sorting and display purposes (e.g. \"Surgical Procedure\")."
  */
  protected java.util.List<CodeableConcept> category;

  /**
  * Description: "A code that identifies a particular procedure, diagnostic investigation, or panel of investigations, that have been requested."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

  /**
  * Description: "On whom or what the procedure or diagnostic is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans)."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "An encounter or episode of care that provides additional information about the healthcare context in which this request is made."
  */
  protected Reference context;

  /**
  * Description: "The date/time at which the diagnostic testing should occur."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  protected transient Element _occurrenceDateTime;

  /**
  * Description: "The date/time at which the diagnostic testing should occur."
  */
  protected Period occurrencePeriod;

  /**
  * Description: "The date/time at which the diagnostic testing should occur."
  */
  protected Timing occurrenceTiming;

  /**
  * Description: "If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example \"pain\", \"on flare-up\", etc."
  */
  protected Boolean asNeededBoolean;

  /**
  * Description: "Extensions for asNeededBoolean"
  */
  protected transient Element _asNeededBoolean;

  /**
  * Description: "If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example \"pain\", \"on flare-up\", etc."
  */
  protected CodeableConcept asNeededCodeableConcept;

  /**
  * Description: "When the request transitioned to being actionable."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  protected transient Element _authoredOn;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  protected ProcedureRequestRequester requester;

  /**
  * Description: "Desired type of performer for doing the diagnostic testing."
  */
  protected CodeableConcept performerType;

  /**
  * Description: "The desired perfomer for doing the diagnostic testing.  For example, the surgeon, dermatopathologist, endoscopist, etc."
  */
  protected Reference performer;

  /**
  * Description: "An explanation or justification for why this diagnostic investigation is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation."
  */
  protected java.util.List<CodeableConcept> reasonCode;

  /**
  * Description: "Indicates another resource that provides a justification for why this diagnostic investigation is being requested.   May relate to the resources referred to in supportingInformation."
  */
  protected java.util.List<Reference> reasonReference;

  /**
  * Description: "Additional clinical information about the patient or specimen that may influence the procedure or diagnostics or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as \"ask at order entry questions (AOEs)\".  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements."
  */
  protected java.util.List<Reference> supportingInfo;

  /**
  * Description: "One or more specimens that the laboratory procedure will use."
  */
  protected java.util.List<Reference> specimen;

  /**
  * Description: "Anatomic location where the procedure should be performed. This is the target site."
  */
  protected java.util.List<CodeableConcept> bodySite;

  /**
  * Description: "Any other notes and comments made about the service request. For example, letting provider know that \"patient hates needles\" or other provider instructions."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Key events in the history of the request."
  */
  protected java.util.List<Reference> relevantHistory;

  public ProcedureRequest() {
  }

  public ProcedureRequest(ProcedureRequestModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition = ReferenceHelper.fromArray2Array(o.getDefinition());
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getReplaces() && !o.getReplaces().isEmpty()) {
    	this.replaces = ReferenceHelper.fromArray2Array(o.getReplaces());
    }
    this.requisition = IdentifierHelper.fromJson(o.getRequisition());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getIntent()) {
      this.intent = o.getIntent();
    }
    if (null != o.getPriority()) {
      this.priority = o.getPriority();
    }
    if (null != o.getDoNotPerform()) {
      this.doNotPerform = o.getDoNotPerform();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category = CodeableConceptHelper.fromArray2Array(o.getCategory());
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
    if (null != o.getOccurrenceDateTime()) {
      this.occurrenceDateTime = o.getOccurrenceDateTime();
    }
    this.occurrencePeriod = PeriodHelper.fromJson(o.getOccurrencePeriod());
    this.occurrenceTiming = TimingHelper.fromJson(o.getOccurrenceTiming());
    if (null != o.getAsNeededBoolean()) {
      this.asNeededBoolean = o.getAsNeededBoolean();
    }
    if (null != o.getAsNeededCodeableConcept() && !o.getAsNeededCodeableConcept().isEmpty()) {
      this.asNeededCodeableConcept = new CodeableConcept(o.getAsNeededCodeableConcept().get(0));
    }
    if (null != o.getAuthoredOn()) {
      this.authoredOn = o.getAuthoredOn();
    }
    if (null != o.getRequester() && !o.getRequester().isEmpty()) {
      this.requester = new ProcedureRequestRequester(o.getRequester().get(0));
    }
    if (null != o.getPerformerType() && !o.getPerformerType().isEmpty()) {
      this.performerType = new CodeableConcept(o.getPerformerType().get(0));
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
      this.performer = new Reference(o.getPerformer().get(0));
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasonCode = CodeableConceptHelper.fromArray2Array(o.getReasonCode());
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (null != o.getSupportingInfo() && !o.getSupportingInfo().isEmpty()) {
    	this.supportingInfo = ReferenceHelper.fromArray2Array(o.getSupportingInfo());
    }
    if (null != o.getSpecimen() && !o.getSpecimen().isEmpty()) {
    	this.specimen = ReferenceHelper.fromArray2Array(o.getSpecimen());
    }
    if (null != o.getBodySite() && !o.getBodySite().isEmpty()) {
    	this.bodySite = CodeableConceptHelper.fromArray2Array(o.getBodySite());
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
    if (null != o.getRelevantHistory() && !o.getRelevantHistory().isEmpty()) {
    	this.relevantHistory = ReferenceHelper.fromArray2Array(o.getRelevantHistory());
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
  public void setReplaces( java.util.List<Reference> value) {
    this.replaces = value;
  }
  public java.util.List<Reference> getReplaces() {
    return this.replaces;
  }
  public void setRequisition( Identifier value) {
    this.requisition = value;
  }
  public Identifier getRequisition() {
    return this.requisition;
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
  public void setIntent( String value) {
    this.intent = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void set_intent( Element value) {
    this._intent = value;
  }
  public Element get_intent() {
    return this._intent;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void set_priority( Element value) {
    this._priority = value;
  }
  public Element get_priority() {
    return this._priority;
  }
  public void setDoNotPerform( Boolean value) {
    this.doNotPerform = value;
  }
  public Boolean getDoNotPerform() {
    return this.doNotPerform;
  }
  public void set_doNotPerform( Element value) {
    this._doNotPerform = value;
  }
  public Element get_doNotPerform() {
    return this._doNotPerform;
  }
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
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
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void set_occurrenceDateTime( Element value) {
    this._occurrenceDateTime = value;
  }
  public Element get_occurrenceDateTime() {
    return this._occurrenceDateTime;
  }
  public void setOccurrencePeriod( Period value) {
    this.occurrencePeriod = value;
  }
  public Period getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrenceTiming( Timing value) {
    this.occurrenceTiming = value;
  }
  public Timing getOccurrenceTiming() {
    return this.occurrenceTiming;
  }
  public void setAsNeededBoolean( Boolean value) {
    this.asNeededBoolean = value;
  }
  public Boolean getAsNeededBoolean() {
    return this.asNeededBoolean;
  }
  public void set_asNeededBoolean( Element value) {
    this._asNeededBoolean = value;
  }
  public Element get_asNeededBoolean() {
    return this._asNeededBoolean;
  }
  public void setAsNeededCodeableConcept( CodeableConcept value) {
    this.asNeededCodeableConcept = value;
  }
  public CodeableConcept getAsNeededCodeableConcept() {
    return this.asNeededCodeableConcept;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void set_authoredOn( Element value) {
    this._authoredOn = value;
  }
  public Element get_authoredOn() {
    return this._authoredOn;
  }
  public void setRequester( ProcedureRequestRequester value) {
    this.requester = value;
  }
  public ProcedureRequestRequester getRequester() {
    return this.requester;
  }
  public void setPerformerType( CodeableConcept value) {
    this.performerType = value;
  }
  public CodeableConcept getPerformerType() {
    return this.performerType;
  }
  public void setPerformer( Reference value) {
    this.performer = value;
  }
  public Reference getPerformer() {
    return this.performer;
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
  public void setSupportingInfo( java.util.List<Reference> value) {
    this.supportingInfo = value;
  }
  public java.util.List<Reference> getSupportingInfo() {
    return this.supportingInfo;
  }
  public void setSpecimen( java.util.List<Reference> value) {
    this.specimen = value;
  }
  public java.util.List<Reference> getSpecimen() {
    return this.specimen;
  }
  public void setBodySite( java.util.List<CodeableConcept> value) {
    this.bodySite = value;
  }
  public java.util.List<CodeableConcept> getBodySite() {
    return this.bodySite;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setRelevantHistory( java.util.List<Reference> value) {
    this.relevantHistory = value;
  }
  public java.util.List<Reference> getRelevantHistory() {
    return this.relevantHistory;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ProcedureRequest]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.definition != null) builder.append("definition" + "->" + this.definition.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.replaces != null) builder.append("replaces" + "->" + this.replaces.toString() + "\n"); 
     if(this.requisition != null) builder.append("requisition" + "->" + this.requisition.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.intent != null) builder.append("intent" + "->" + this.intent.toString() + "\n"); 
     if(this._intent != null) builder.append("_intent" + "->" + this._intent.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this._priority != null) builder.append("_priority" + "->" + this._priority.toString() + "\n"); 
     if(this.doNotPerform != null) builder.append("doNotPerform" + "->" + this.doNotPerform.toString() + "\n"); 
     if(this._doNotPerform != null) builder.append("_doNotPerform" + "->" + this._doNotPerform.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.occurrenceDateTime != null) builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime.toString() + "\n"); 
     if(this._occurrenceDateTime != null) builder.append("_occurrenceDateTime" + "->" + this._occurrenceDateTime.toString() + "\n"); 
     if(this.occurrencePeriod != null) builder.append("occurrencePeriod" + "->" + this.occurrencePeriod.toString() + "\n"); 
     if(this.occurrenceTiming != null) builder.append("occurrenceTiming" + "->" + this.occurrenceTiming.toString() + "\n"); 
     if(this.asNeededBoolean != null) builder.append("asNeededBoolean" + "->" + this.asNeededBoolean.toString() + "\n"); 
     if(this._asNeededBoolean != null) builder.append("_asNeededBoolean" + "->" + this._asNeededBoolean.toString() + "\n"); 
     if(this.asNeededCodeableConcept != null) builder.append("asNeededCodeableConcept" + "->" + this.asNeededCodeableConcept.toString() + "\n"); 
     if(this.authoredOn != null) builder.append("authoredOn" + "->" + this.authoredOn.toString() + "\n"); 
     if(this._authoredOn != null) builder.append("_authoredOn" + "->" + this._authoredOn.toString() + "\n"); 
     if(this.requester != null) builder.append("requester" + "->" + this.requester.toString() + "\n"); 
     if(this.performerType != null) builder.append("performerType" + "->" + this.performerType.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.reasonCode != null) builder.append("reasonCode" + "->" + this.reasonCode.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.supportingInfo != null) builder.append("supportingInfo" + "->" + this.supportingInfo.toString() + "\n"); 
     if(this.specimen != null) builder.append("specimen" + "->" + this.specimen.toString() + "\n"); 
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.relevantHistory != null) builder.append("relevantHistory" + "->" + this.relevantHistory.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	ProcedureRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ProcedureRequest" : { return ProcedureRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}