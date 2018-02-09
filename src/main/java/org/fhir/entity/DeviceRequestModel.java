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

/**
* "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker."
*/
@Entity
@Table(name="devicerequest")
public class DeviceRequestModel  {
  /**
  * Description: "This is a DeviceRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifiers assigned to this order by the orderer or by the receiver."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Protocol or definition followed by this request. For example: The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition = new java.util.ArrayList<>();

  /**
  * Description: "Plan/proposal/order fulfilled by this request."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "The request takes the place of the referenced completed or terminated request(s)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> priorRequest = new java.util.ArrayList<>();

  /**
  * Description: "Composite request this is part of."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"groupIdentifier\"", length = 16777215)
  private String groupIdentifier;

  /**
  * Description: "The status of the request."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Whether the request is a proposal, plan, an original order or a reflex order."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"intent\"", length = 16777215)
  private String intent;

  /**
  * Description: "Indicates how quickly the {{title}} should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private String priority;

  /**
  * Description: "The details of the device to be used."
  */
  @javax.persistence.Basic
  @Column(name="\"codereference_id\"")
  private String codereference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`codereference_id`", insertable=false, updatable=false)
  private ReferenceModel codeReference;

  /**
  * Description: "The details of the device to be used."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"codeCodeableConcept\"", length = 16777215)
  private String codeCodeableConcept;

  /**
  * Description: "The patient who will use the device."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "An encounter that provides additional context in which this request is made."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. \"Every 8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\"; \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\"."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. \"Every 8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\"; \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\"."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "The timing schedule for the use of the device. The Schedule data type allows many different expressions, for example. \"Every 8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\"; \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\"."
  * Actual type: Timing
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrenceTiming\"", length = 16777215)
  private String occurrenceTiming;

  /**
  * Description: "When the request transitioned to being actionable."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"authoredOn\"")
  private String authoredOn;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  @javax.persistence.Basic
  @Column(name="\"requester_id\"")
  private String requester_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`requester_id`", insertable=false, updatable=false)
  private DeviceRequestRequesterModel requester;

  /**
  * Description: "Desired type of performer for doing the diagnostic testing."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"performerType\"", length = 16777215)
  private String performerType;

  /**
  * Description: "The desired perfomer for doing the diagnostic testing."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`performer_id`", insertable=false, updatable=false)
  private ReferenceModel performer;

  /**
  * Description: "Reason or justification for the use of this device."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCode\"", length = 16777215)
  private String reasonCode;

  /**
  * Description: "Reason or justification for the use of this device."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "Additional clinical information about the patient that may influence the request fulfilment.  For example, this may includes body where on the subject's the device will be used ( i.e. the target site)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInfo = new java.util.ArrayList<>();

  /**
  * Description: "Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Key events in the history of the request."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> relevantHistory = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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


  public DeviceRequestModel() {
  }

  public DeviceRequestModel(DeviceRequest o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.definition = Reference.toModelArray(o.getDefinition());

      this.basedOn = Reference.toModelArray(o.getBasedOn());

      this.priorRequest = Reference.toModelArray(o.getPriorRequest());

      this.groupIdentifier = Identifier.toJson(o.getGroupIdentifier());
      this.status = o.getStatus();

      this.intent = CodeableConcept.toJson(o.getIntent());
      this.priority = o.getPriority();

      if (null != o.getCodeReference()) {
      	this.codereference_id = "codeReference" + this.getId();
        this.codeReference = new ReferenceModel(o.getCodeReference());
        this.codeReference.setId(this.codereference_id);
        this.codeReference.parent_id = this.codeReference.getId();
      }

      this.codeCodeableConcept = CodeableConcept.toJson(o.getCodeCodeableConcept());
      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      if (null != o.getContext()) {
      	this.context_id = "context" + this.getId();
        this.context = new ReferenceModel(o.getContext());
        this.context.setId(this.context_id);
        this.context.parent_id = this.context.getId();
      }

      this.occurrenceDateTime = o.getOccurrenceDateTime();

      this.occurrencePeriod = Period.toJson(o.getOccurrencePeriod());
      this.occurrenceTiming = Timing.toJson(o.getOccurrenceTiming());
      this.authoredOn = o.getAuthoredOn();

      if (null != o.getRequester()) {
      	this.requester_id = "requester" + this.getId();
        this.requester = new DeviceRequestRequesterModel(o.getRequester());
        this.requester.setId(this.requester_id);
        this.requester.parent_id = this.requester.getId();
      }

      this.performerType = CodeableConcept.toJson(o.getPerformerType());
      if (null != o.getPerformer()) {
      	this.performer_id = "performer" + this.getId();
        this.performer = new ReferenceModel(o.getPerformer());
        this.performer.setId(this.performer_id);
        this.performer.parent_id = this.performer.getId();
      }

      this.reasonCode = CodeableConcept.toJson(o.getReasonCode());
      this.reasonReference = Reference.toModelArray(o.getReasonReference());

      this.supportingInfo = Reference.toModelArray(o.getSupportingInfo());

      this.note = Annotation.toJson(o.getNote());
      this.relevantHistory = Reference.toModelArray(o.getRelevantHistory());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setPriorRequest( java.util.List<ReferenceModel> value) {
    this.priorRequest = value;
  }
  public java.util.List<ReferenceModel> getPriorRequest() {
    return this.priorRequest;
  }
  public void setGroupIdentifier( String value) {
    this.groupIdentifier = value;
  }
  public String getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setIntent( String value) {
    this.intent = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setCodeReference( ReferenceModel value) {
    this.codeReference = value;
  }
  public ReferenceModel getCodeReference() {
    return this.codeReference;
  }
  public void setCodeCodeableConcept( String value) {
    this.codeCodeableConcept = value;
  }
  public String getCodeCodeableConcept() {
    return this.codeCodeableConcept;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setContext( ReferenceModel value) {
    this.context = value;
  }
  public ReferenceModel getContext() {
    return this.context;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrenceTiming( String value) {
    this.occurrenceTiming = value;
  }
  public String getOccurrenceTiming() {
    return this.occurrenceTiming;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setRequester( DeviceRequestRequesterModel value) {
    this.requester = value;
  }
  public DeviceRequestRequesterModel getRequester() {
    return this.requester;
  }
  public void setPerformerType( String value) {
    this.performerType = value;
  }
  public String getPerformerType() {
    return this.performerType;
  }
  public void setPerformer( ReferenceModel value) {
    this.performer = value;
  }
  public ReferenceModel getPerformer() {
    return this.performer;
  }
  public void setReasonCode( String value) {
    this.reasonCode = value;
  }
  public String getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setSupportingInfo( java.util.List<ReferenceModel> value) {
    this.supportingInfo = value;
  }
  public java.util.List<ReferenceModel> getSupportingInfo() {
    return this.supportingInfo;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setRelevantHistory( java.util.List<ReferenceModel> value) {
    this.relevantHistory = value;
  }
  public java.util.List<ReferenceModel> getRelevantHistory() {
    return this.relevantHistory;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("priorRequest" + "[" + String.valueOf(this.priorRequest) + "]\n"); 
     builder.append("groupIdentifier" + "[" + String.valueOf(this.groupIdentifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("codeReference" + "[" + String.valueOf(this.codeReference) + "]\n"); 
     builder.append("codeCodeableConcept" + "[" + String.valueOf(this.codeCodeableConcept) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("occurrenceTiming" + "[" + String.valueOf(this.occurrenceTiming) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("requester" + "[" + String.valueOf(this.requester) + "]\n"); 
     builder.append("performerType" + "[" + String.valueOf(this.performerType) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("supportingInfo" + "[" + String.valueOf(this.supportingInfo) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("relevantHistory" + "[" + String.valueOf(this.relevantHistory) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}