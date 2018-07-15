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
import org.fhir.entity.CommunicationModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Communication  extends DomainResource  {
  /**
  * Description: "This is a Communication resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event."
  */
  protected java.util.List<Reference> definition;

  /**
  * Description: "An order, proposal or plan fulfilled in whole or in part by this Communication."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "Part of this action."
  */
  protected java.util.List<Reference> partOf;

  /**
  * Description: "The status of the transmission."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "If true, indicates that the described communication event did not actually occur."
  */
  protected Boolean notDone;

  /**
  * Description: "Extensions for notDone"
  */
  protected transient Element _notDone;

  /**
  * Description: "Describes why the communication event did not occur in coded and/or textual form."
  */
  protected CodeableConcept notDoneReason;

  /**
  * Description: "The type of message conveyed such as alert, notification, reminder, instruction, etc."
  */
  protected java.util.List<CodeableConcept> category;

  /**
  * Description: "A channel that was used for this communication (e.g. email, fax)."
  */
  protected java.util.List<CodeableConcept> medium;

  /**
  * Description: "The patient or group that was the focus of this communication."
  */
  protected Reference subject;

  /**
  * Description: "The entity (e.g. person, organization, clinical information system, or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time)."
  */
  protected java.util.List<Reference> recipient;

  /**
  * Description: "The resources which were responsible for or related to producing this communication."
  */
  protected java.util.List<Reference> topic;

  /**
  * Description: "The encounter within which the communication was sent."
  */
  protected Reference context;

  /**
  * Description: "The time when this communication was sent."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String sent;

  /**
  * Description: "Extensions for sent"
  */
  protected transient Element _sent;

  /**
  * Description: "The time when this communication arrived at the destination."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String received;

  /**
  * Description: "Extensions for received"
  */
  protected transient Element _received;

  /**
  * Description: "The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication."
  */
  protected Reference sender;

  /**
  * Description: "The reason or justification for the communication."
  */
  protected java.util.List<CodeableConcept> reasonCode;

  /**
  * Description: "Indicates another resource whose existence justifies this communication."
  */
  protected java.util.List<Reference> reasonReference;

  /**
  * Description: "Text, attachment(s), or resource(s) that was communicated to the recipient."
  */
  protected java.util.List<CommunicationPayload> payload;

  /**
  * Description: "Additional notes or commentary about the communication by the sender, receiver or other interested parties."
  */
  protected java.util.List<Annotation> note;

  public Communication() {
  }

  public Communication(CommunicationModel o) {
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
    	this.category = CodeableConceptHelper.fromArray2Array(o.getCategory());
    }
    if (null != o.getMedium() && !o.getMedium().isEmpty()) {
    	this.medium = CodeableConceptHelper.fromArray2Array(o.getMedium());
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getRecipient() && !o.getRecipient().isEmpty()) {
    	this.recipient = ReferenceHelper.fromArray2Array(o.getRecipient());
    }
    if (null != o.getTopic() && !o.getTopic().isEmpty()) {
    	this.topic = ReferenceHelper.fromArray2Array(o.getTopic());
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getSent()) {
      this.sent = o.getSent();
    }
    if (null != o.getReceived()) {
      this.received = o.getReceived();
    }
    if (null != o.getSender() && !o.getSender().isEmpty()) {
      this.sender = new Reference(o.getSender().get(0));
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasonCode = CodeableConceptHelper.fromArray2Array(o.getReasonCode());
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonReference = ReferenceHelper.fromArray2Array(o.getReasonReference());
    }
    if (null != o.getPayload() && !o.getPayload().isEmpty()) {
    	this.payload = CommunicationPayloadHelper.fromArray2Array(o.getPayload());
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
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
  }
  public void setMedium( java.util.List<CodeableConcept> value) {
    this.medium = value;
  }
  public java.util.List<CodeableConcept> getMedium() {
    return this.medium;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setRecipient( java.util.List<Reference> value) {
    this.recipient = value;
  }
  public java.util.List<Reference> getRecipient() {
    return this.recipient;
  }
  public void setTopic( java.util.List<Reference> value) {
    this.topic = value;
  }
  public java.util.List<Reference> getTopic() {
    return this.topic;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setSent( String value) {
    this.sent = value;
  }
  public String getSent() {
    return this.sent;
  }
  public void set_sent( Element value) {
    this._sent = value;
  }
  public Element get_sent() {
    return this._sent;
  }
  public void setReceived( String value) {
    this.received = value;
  }
  public String getReceived() {
    return this.received;
  }
  public void set_received( Element value) {
    this._received = value;
  }
  public Element get_received() {
    return this._received;
  }
  public void setSender( Reference value) {
    this.sender = value;
  }
  public Reference getSender() {
    return this.sender;
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
  public void setPayload( java.util.List<CommunicationPayload> value) {
    this.payload = value;
  }
  public java.util.List<CommunicationPayload> getPayload() {
    return this.payload;
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
    builder.append("[Communication]:" + "\n");
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
     if(this.medium != null) builder.append("medium" + "->" + this.medium.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.recipient != null) builder.append("recipient" + "->" + this.recipient.toString() + "\n"); 
     if(this.topic != null) builder.append("topic" + "->" + this.topic.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.sent != null) builder.append("sent" + "->" + this.sent.toString() + "\n"); 
     if(this._sent != null) builder.append("_sent" + "->" + this._sent.toString() + "\n"); 
     if(this.received != null) builder.append("received" + "->" + this.received.toString() + "\n"); 
     if(this._received != null) builder.append("_received" + "->" + this._received.toString() + "\n"); 
     if(this.sender != null) builder.append("sender" + "->" + this.sender.toString() + "\n"); 
     if(this.reasonCode != null) builder.append("reasonCode" + "->" + this.reasonCode.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.payload != null) builder.append("payload" + "->" + this.payload.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	Communication,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Communication" : { return Communication.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}