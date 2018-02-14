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
* "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
*/
@Entity
@Table(name="messageheader")
public class MessageHeaderModel  implements Serializable {
	private static final long serialVersionUID = 151857669696313111L;
  /**
  * Description: "This is a MessageHeader resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value \"http://hl7.org/fhir/message-events\"."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"event\"", length = 16777215)
  private String event;

  /**
  * Description: "The destination application which the message is intended for."
  */
  @javax.persistence.Basic
  @Column(name="\"destination_id\"")
  private String destination_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="destination_id", insertable=false, updatable=false)
  private java.util.List<MessageHeaderDestinationModel> destination;

  /**
  * Description: "Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient."
  */
  @javax.persistence.Basic
  @Column(name="\"receiver_id\"")
  private String receiver_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="receiver_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> receiver;

  /**
  * Description: "Identifies the sending system to allow the use of a trust relationship."
  */
  @javax.persistence.Basic
  @Column(name="\"sender_id\"")
  private String sender_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="sender_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> sender;

  /**
  * Description: "The time that the message was sent."
  */
  @javax.persistence.Basic
  @Column(name="\"timestamp\"")
  private String timestamp;

  /**
  * Description: "The person or device that performed the data entry leading to this message. When there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions."
  */
  @javax.persistence.Basic
  @Column(name="\"enterer_id\"")
  private String enterer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="enterer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> enterer;

  /**
  * Description: "The logical author of the message - the person or device that decided the described event should happen. When there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions."
  */
  @javax.persistence.Basic
  @Column(name="\"author_id\"")
  private String author_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="author_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> author;

  /**
  * Description: "The source application from which this message originated."
  */
  @javax.persistence.Basic
  @Column(name="\"source_id\"")
  private String source_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="source_id", insertable=false, updatable=false)
  private java.util.List<MessageHeaderSourceModel> source;

  /**
  * Description: "The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party."
  */
  @javax.persistence.Basic
  @Column(name="\"responsible_id\"")
  private String responsible_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="responsible_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> responsible;

  /**
  * Description: "Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "Information about the message that this message is a response to.  Only present if this message is a response."
  */
  @javax.persistence.Basic
  @Column(name="\"response_id\"")
  private String response_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="response_id", insertable=false, updatable=false)
  private java.util.List<MessageHeaderResponseModel> response;

  /**
  * Description: "The actual data of the message - a reference to the root/focus class of the event."
  */
  @javax.persistence.Basic
  @Column(name="\"focus_id\"")
  private String focus_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="focus_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> focus;

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

  public MessageHeaderModel() {
  }

  public MessageHeaderModel(MessageHeader o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.event = CodingHelper.toJson(o.getEvent());
    if (null != o.getDestination() && !o.getDestination().isEmpty()) {
    	this.destination_id = "destination" + this.id;
    	this.destination = MessageHeaderDestinationHelper.toModelFromArray(o.getDestination(), this.destination_id);
    }
    if (null != o.getReceiver() ) {
    	this.receiver_id = "receiver" + this.id;
    	this.receiver = ReferenceHelper.toModel(o.getReceiver(), this.receiver_id);
    }
    if (null != o.getSender() ) {
    	this.sender_id = "sender" + this.id;
    	this.sender = ReferenceHelper.toModel(o.getSender(), this.sender_id);
    }
    this.timestamp = o.getTimestamp();
    if (null != o.getEnterer() ) {
    	this.enterer_id = "enterer" + this.id;
    	this.enterer = ReferenceHelper.toModel(o.getEnterer(), this.enterer_id);
    }
    if (null != o.getAuthor() ) {
    	this.author_id = "author" + this.id;
    	this.author = ReferenceHelper.toModel(o.getAuthor(), this.author_id);
    }
    if (null != o.getSource() ) {
    	this.source_id = "source" + this.id;
    	this.source = MessageHeaderSourceHelper.toModel(o.getSource(), this.source_id);
    }
    if (null != o.getResponsible() ) {
    	this.responsible_id = "responsible" + this.id;
    	this.responsible = ReferenceHelper.toModel(o.getResponsible(), this.responsible_id);
    }
    this.reason = CodeableConceptHelper.toJson(o.getReason());
    if (null != o.getResponse() ) {
    	this.response_id = "response" + this.id;
    	this.response = MessageHeaderResponseHelper.toModel(o.getResponse(), this.response_id);
    }
    if (null != o.getFocus() && !o.getFocus().isEmpty()) {
    	this.focus_id = "focus" + this.id;
    	this.focus = ReferenceHelper.toModelFromArray(o.getFocus(), this.focus_id);
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
  public String getEvent() {
    return this.event;
  }
  public void setEvent( String value) {
    this.event = value;
  }
  public java.util.List<MessageHeaderDestinationModel> getDestination() {
    return this.destination;
  }
  public void setDestination( java.util.List<MessageHeaderDestinationModel> value) {
    this.destination = value;
  }
  public java.util.List<ReferenceModel> getReceiver() {
    return this.receiver;
  }
  public void setReceiver( java.util.List<ReferenceModel> value) {
    this.receiver = value;
  }
  public java.util.List<ReferenceModel> getSender() {
    return this.sender;
  }
  public void setSender( java.util.List<ReferenceModel> value) {
    this.sender = value;
  }
  public String getTimestamp() {
    return this.timestamp;
  }
  public void setTimestamp( String value) {
    this.timestamp = value;
  }
  public java.util.List<ReferenceModel> getEnterer() {
    return this.enterer;
  }
  public void setEnterer( java.util.List<ReferenceModel> value) {
    this.enterer = value;
  }
  public java.util.List<ReferenceModel> getAuthor() {
    return this.author;
  }
  public void setAuthor( java.util.List<ReferenceModel> value) {
    this.author = value;
  }
  public java.util.List<MessageHeaderSourceModel> getSource() {
    return this.source;
  }
  public void setSource( java.util.List<MessageHeaderSourceModel> value) {
    this.source = value;
  }
  public java.util.List<ReferenceModel> getResponsible() {
    return this.responsible;
  }
  public void setResponsible( java.util.List<ReferenceModel> value) {
    this.responsible = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public java.util.List<MessageHeaderResponseModel> getResponse() {
    return this.response;
  }
  public void setResponse( java.util.List<MessageHeaderResponseModel> value) {
    this.response = value;
  }
  public java.util.List<ReferenceModel> getFocus() {
    return this.focus;
  }
  public void setFocus( java.util.List<ReferenceModel> value) {
    this.focus = value;
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
    builder.append("[MessageHeaderModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("event" + "->" + this.event + "\n"); 
     builder.append("timestamp" + "->" + this.timestamp + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
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
    builder.append("[MessageHeaderModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("event" + "->" + this.event + "\n"); 
     builder.append("destination" + "->" + this.destination + "\n"); 
     builder.append("receiver" + "->" + this.receiver + "\n"); 
     builder.append("sender" + "->" + this.sender + "\n"); 
     builder.append("timestamp" + "->" + this.timestamp + "\n"); 
     builder.append("enterer" + "->" + this.enterer + "\n"); 
     builder.append("author" + "->" + this.author + "\n"); 
     builder.append("source" + "->" + this.source + "\n"); 
     builder.append("responsible" + "->" + this.responsible + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("response" + "->" + this.response + "\n"); 
     builder.append("focus" + "->" + this.focus + "\n"); 
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