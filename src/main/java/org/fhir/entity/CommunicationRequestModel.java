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
/**
* "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition."
*/
@Entity
@Table(name="communicationrequest")
public class CommunicationRequestModel  implements Serializable {
	private static final long serialVersionUID = 151857669667316071L;
  /**
  * Description: "This is a CommunicationRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique ID of this request for reference purposes. It must be provided if user wants it returned as part of any output, otherwise it will be autogenerated, if needed, by CDS system. Does not need to be the actual ID of the source system."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A plan or proposal that is fulfilled in whole or in part by this request."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "Completed or terminated request(s) whose function is taken by this new request."
  */
  @javax.persistence.Basic
  @Column(name="\"replaces_id\"")
  private String replaces_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="replaces_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> replaces;

  /**
  * Description: "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition, prescription or similar form."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"groupIdentifier\"", length = 16777215)
  private String groupIdentifier;

  /**
  * Description: "The status of the proposal or order."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The type of message to be sent such as alert, notification, reminder, instruction, etc."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Characterizes how quickly the proposed act must be initiated. Includes concepts such as stat, urgent, routine."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private String priority;

  /**
  * Description: "A channel that was used for this communication (e.g. email, fax)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"medium\"", length = 16777215)
  private String medium;

  /**
  * Description: "The patient or group that is the focus of this communication request."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended target of the communication."
  */
  @javax.persistence.Basic
  @Column(name="\"recipient_id\"")
  private String recipient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="recipient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> recipient;

  /**
  * Description: "The resources which were related to producing this communication request."
  */
  @javax.persistence.Basic
  @Column(name="\"topic_id\"")
  private String topic_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="topic_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> topic;

  /**
  * Description: "The encounter or episode of care within which the communication request was created."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "Text, attachment(s), or resource(s) to be communicated to the recipient."
  */
  @javax.persistence.Basic
  @Column(name="\"payload_id\"")
  private String payload_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="payload_id", insertable=false, updatable=false)
  private java.util.List<CommunicationRequestPayloadModel> payload;

  /**
  * Description: "The time when this communication is to occur."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "The time when this communication is to occur."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "For draft requests, indicates the date of initial creation.  For requests with other statuses, indicates the date of activation."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"authoredOn\"")
  private String authoredOn;

  /**
  * Description: "The entity (e.g. person, organization, clinical information system, or device) which is to be the source of the communication."
  */
  @javax.persistence.Basic
  @Column(name="\"sender_id\"")
  private String sender_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="sender_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> sender;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  @javax.persistence.Basic
  @Column(name="\"requester_id\"")
  private String requester_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="requester_id", insertable=false, updatable=false)
  private java.util.List<CommunicationRequestRequesterModel> requester;

  /**
  * Description: "Describes why the request is being made in coded or textual form."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCode\"", length = 16777215)
  private String reasonCode;

  /**
  * Description: "Indicates another resource whose existence justifies this request."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="reasonreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference;

  /**
  * Description: "Comments made about the request by the requester, sender, recipient, subject or other participants."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

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

  public CommunicationRequestModel() {
  }

  public CommunicationRequestModel(CommunicationRequest o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    if (null != o.getReplaces() && !o.getReplaces().isEmpty()) {
    	this.replaces_id = "replaces" + this.id;
    	this.replaces = ReferenceHelper.toModelFromArray(o.getReplaces(), this.replaces_id);
    }
    this.groupIdentifier = IdentifierHelper.toJson(o.getGroupIdentifier());
    this.status = o.getStatus();
    this.priority = o.getPriority();
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getRecipient() && !o.getRecipient().isEmpty()) {
    	this.recipient_id = "recipient" + this.id;
    	this.recipient = ReferenceHelper.toModelFromArray(o.getRecipient(), this.recipient_id);
    }
    if (null != o.getTopic() && !o.getTopic().isEmpty()) {
    	this.topic_id = "topic" + this.id;
    	this.topic = ReferenceHelper.toModelFromArray(o.getTopic(), this.topic_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    if (null != o.getPayload() && !o.getPayload().isEmpty()) {
    	this.payload_id = "payload" + this.id;
    	this.payload = CommunicationRequestPayloadHelper.toModelFromArray(o.getPayload(), this.payload_id);
    }
    this.occurrenceDateTime = o.getOccurrenceDateTime();
    this.occurrencePeriod = PeriodHelper.toJson(o.getOccurrencePeriod());
    this.authoredOn = o.getAuthoredOn();
    if (null != o.getSender() ) {
    	this.sender_id = "sender" + this.id;
    	this.sender = ReferenceHelper.toModel(o.getSender(), this.sender_id);
    }
    if (null != o.getRequester() ) {
    	this.requester_id = "requester" + this.id;
    	this.requester = CommunicationRequestRequesterHelper.toModel(o.getRequester(), this.requester_id);
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonreference_id = "reasonreference" + this.id;
    	this.reasonReference = ReferenceHelper.toModelFromArray(o.getReasonReference(), this.reasonreference_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
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
  public java.util.List<ReferenceModel> getReplaces() {
    return this.replaces;
  }
  public void setReplaces( java.util.List<ReferenceModel> value) {
    this.replaces = value;
  }
  public String getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setGroupIdentifier( String value) {
    this.groupIdentifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getMedium() {
    return this.medium;
  }
  public void setMedium( String value) {
    this.medium = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getRecipient() {
    return this.recipient;
  }
  public void setRecipient( java.util.List<ReferenceModel> value) {
    this.recipient = value;
  }
  public java.util.List<ReferenceModel> getTopic() {
    return this.topic;
  }
  public void setTopic( java.util.List<ReferenceModel> value) {
    this.topic = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public java.util.List<CommunicationRequestPayloadModel> getPayload() {
    return this.payload;
  }
  public void setPayload( java.util.List<CommunicationRequestPayloadModel> value) {
    this.payload = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public java.util.List<ReferenceModel> getSender() {
    return this.sender;
  }
  public void setSender( java.util.List<ReferenceModel> value) {
    this.sender = value;
  }
  public java.util.List<CommunicationRequestRequesterModel> getRequester() {
    return this.requester;
  }
  public void setRequester( java.util.List<CommunicationRequestRequesterModel> value) {
    this.requester = value;
  }
  public String getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonCode( String value) {
    this.reasonCode = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
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
    builder.append("[CommunicationRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("groupIdentifier" + "->" + this.groupIdentifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("medium" + "->" + this.medium + "\n"); 
     builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime + "\n"); 
     builder.append("occurrencePeriod" + "->" + this.occurrencePeriod + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("reasonCode" + "->" + this.reasonCode + "\n"); 
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
    builder.append("[CommunicationRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("basedOn" + "->" + this.basedOn + "\n"); 
     builder.append("replaces" + "->" + this.replaces + "\n"); 
     builder.append("groupIdentifier" + "->" + this.groupIdentifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("medium" + "->" + this.medium + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("recipient" + "->" + this.recipient + "\n"); 
     builder.append("topic" + "->" + this.topic + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("payload" + "->" + this.payload + "\n"); 
     builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime + "\n"); 
     builder.append("occurrencePeriod" + "->" + this.occurrencePeriod + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("sender" + "->" + this.sender + "\n"); 
     builder.append("requester" + "->" + this.requester + "\n"); 
     builder.append("reasonCode" + "->" + this.reasonCode + "\n"); 
     builder.append("reasonReference" + "->" + this.reasonReference + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
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